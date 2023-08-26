package com.daaw.avee.comp.playback.NativeMediaPlayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.EventsGlobal.EventsGlobalApp;
import com.daaw.avee.comp.playback.AudioFrameData;
import com.daaw.avee.comp.playback.BaseEqualizerEffect;
import com.daaw.avee.comp.playback.IMediaPlayerCore;
import com.daaw.avee.comp.playback.PlayingMediaInfo;
import com.daaw.avee.comp.playback.Song.IMediaDataSource;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class NativeMediaPlayerCore implements IMediaPlayerCore, BaseEqualizerEffect.IEqualizerEffectListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback {
    Context context;
    IMediaPlayerCore.OnNotifyListener onNotifyListener;
    final Object visualizerLock = new Object();
    int currentPlayer = 0;
    int nextPlayer = 1;
    Uri nextDataSource = null;
    float volume = 1.0f;
    boolean muted = false;
    long visualizerLastTimeUsed = 0;
    NativeVisualizerDataProvider visualizerData = null;
    NativeEqualizerEffect equalizerEffect = new NativeEqualizerEffect(this);
    WeakReference<SurfaceHolder> surfaceHolderWeak = new WeakReference<>(null);
    List<Object> listenerRefHolder = new LinkedList();
    private PlayerEntry[] players = new PlayerEntry[2];

    public static int ConvertToNativeVideoScalingMode(int i) {
        return (i != 1 && i == 2) ? 2 : 1;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public NativeMediaPlayerCore(Context context, String str, IMediaPlayerCore.OnNotifyListener onNotifyListener) {
        int i = 0;
        this.context = context;
        this.onNotifyListener = onNotifyListener;
        while (true) {
            PlayerEntry[] playerEntryArr = this.players;
            if (i < playerEntryArr.length) {
                playerEntryArr[i] = new PlayerEntry();
                i++;
            } else {
                EventsGlobalApp.onUITick10.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.comp.playback.NativeMediaPlayer.NativeMediaPlayerCore.1
                    @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
                    public void invoke() {
                        NativeMediaPlayerCore.this.checkVisualizerLife();
                    }
                }, this.listenerRefHolder);
                return;
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setNotifyListener(IMediaPlayerCore.OnNotifyListener onNotifyListener) {
        this.onNotifyListener = onNotifyListener;
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void release() {
        NativeEqualizerEffect nativeEqualizerEffect = this.equalizerEffect;
        if (nativeEqualizerEffect != null) {
            nativeEqualizerEffect.release();
            this.equalizerEffect = null;
        }
        SurfaceHolder surfaceHolder = this.surfaceHolderWeak.get();
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            this.surfaceHolderWeak = new WeakReference<>(null);
        }
        releaseMediaPlayer(this.currentPlayer);
        releaseMediaPlayer(this.nextPlayer);
    }

    void checkVisualizerLife() {
        synchronized (this.visualizerLock) {
            NativeVisualizerDataProvider nativeVisualizerDataProvider = this.visualizerData;
            if (nativeVisualizerDataProvider != null && SystemClock.elapsedRealtime() - this.visualizerLastTimeUsed > 8000) {
                nativeVisualizerDataProvider.release();
                this.visualizerData = null;
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.players[this.currentPlayer].player == mediaPlayer) {
            if (this.players[this.currentPlayer].getStateLevels() < 0) {
                this.onNotifyListener.requestNextDataDelay(true);
            } else {
                this.onNotifyListener.requestNextDataNow();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (this.players[this.currentPlayer].player == mediaPlayer) {
            this.onNotifyListener.onBufferingUpdate(true, i);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.players[this.currentPlayer].player == mediaPlayer) {
            setStateLevel(this.currentPlayer, -1);
        } else if (this.players[this.nextPlayer].player == mediaPlayer) {
            setStateLevel(this.nextPlayer, -1);
        } else {
            Assert.fail();
        }
        this.onNotifyListener.onMpPlaystateOrMetaChanged(false, "Error: " + i + "," + i2);
        return false;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.onNotifyListener.onNotifyVideoSizeChanged(i, i2, (i * 1.0f) / i2);
    }

    void setStateLevel(int i, int i2) {
        this.players[i].setStateLevels(i2);
        NativeEqualizerEffect nativeEqualizerEffect = this.equalizerEffect;
        if (nativeEqualizerEffect == null || i != this.currentPlayer) {
            return;
        }
        nativeEqualizerEffect.onAudioSessionChanged(this.players[i].stateTh.audioSessionId);
        this.equalizerEffect.onCheckEqualizerLife();
    }

    void resetMediaPlayer(int i) {
        PlayerEntry[] playerEntryArr = this.players;
        if (playerEntryArr[i] != null) {
            playerEntryArr[i].reset();
        }
    }

    void createMediaPlayer(int i) {
        PlayerEntry[] playerEntryArr = this.players;
        if (playerEntryArr[i] == null) {
            playerEntryArr[i] = new PlayerEntry();
        }
        if (this.players[i].player == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnPreparedListener(this.players[i]);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setWakeMode(this.context, 1);
            this.players[i].player = mediaPlayer;
        }
        this.players[i].player.reset();
        setStateLevel(i, 0);
        this.players[i].playerShouldStarts = false;
    }

    void releaseMediaPlayer(int i) {
        releaseMediaPlayer(i, false);
    }

    void releaseMediaPlayer(int i, boolean z) {
        PlayerEntry[] playerEntryArr = this.players;
        if (i >= playerEntryArr.length) {
            return;
        }
        playerEntryArr[i].release();
        setStateLevel(i, -2);
        this.players[i].playerShouldStarts = false;
    }

    void cycleNextPlayer() {
        int i = this.currentPlayer;
        this.currentPlayer = this.nextPlayer;
        this.nextPlayer = i;
    }

    void preparePlayer(int i, Uri uri, float f, long j) {
        createMediaPlayer(i);
        try {
            this.players[i].player.setDataSource(this.context, uri);
            setStateLevel(i, 1);
            this.players[i].player.setAudioStreamType(3);
            this.players[i].setVideoScalingMode(this.onNotifyListener.getVideoScalingMode());
            setVideoSurfaceHolder(this.onNotifyListener.onRequestVideoSurfaceHolder());
            this.players[this.currentPlayer].setFadeVolume(f);
            this.players[this.currentPlayer].setStartFadeVolume(f);
            this.players[i].prepareAsync(j);
        } catch (IOException e) {
            this.onNotifyListener.onMpPlaystateOrMetaChanged(true, "Failed open media source");
            tlog.w(e.getMessage());
            setStateLevel(i, -1);
            onCompletion(this.players[i].player);
        } catch (IllegalArgumentException e2) {
            this.onNotifyListener.onMpPlaystateOrMetaChanged(true, "Invalid media source");
            tlog.w(e2.getMessage());
            setStateLevel(i, -1);
            onCompletion(this.players[i].player);
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setNextDataSource(IMediaDataSource iMediaDataSource) {
        this.nextDataSource = iMediaDataSource.getContentUri();
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void playNext(boolean z, boolean z2, float f, long j) {
        if (!z) {
            if (this.players[this.currentPlayer].isPreparingOrAbove()) {
                cycleNextPlayer();
            }
        } else {
            int i = this.currentPlayer;
            int i2 = this.nextPlayer;
            if (i != i2) {
                releaseMediaPlayer(i2);
            }
        }
        Uri uri = this.nextDataSource;
        if (uri == null || uri.equals(Uri.EMPTY)) {
            tlog.w("nextDataSource is null");
            if (z2) {
                start(true);
                return;
            } else {
                pause();
                return;
            }
        }
        preparePlayer(this.currentPlayer, this.nextDataSource, f, j);
        if (z2) {
            start(true);
        } else {
            pause();
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void start() {
        start(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start(boolean z) {
        if (this.players[this.currentPlayer].getStateLevels() < 2) {
            this.players[this.currentPlayer].playerShouldStarts = true;
        } else if (this.players[this.currentPlayer].getStateLevels() < 3) {
            this.players[this.currentPlayer].playerShouldStarts = true;
            try {
                this.players[this.currentPlayer].player.prepareAsync();
            } catch (IllegalStateException unused) {
                setStateLevel(this.currentPlayer, -1);
            } catch (Exception unused2) {
                setStateLevel(this.currentPlayer, -1);
            }
        } else {
            if (this.onNotifyListener.onRequestAudioFocus()) {
                this.players[this.currentPlayer].player.start();
                setStateLevel(this.currentPlayer, 5);
            }
            if (z) {
                this.onNotifyListener.onMpPlaystateOrMetaChanged(false, null);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void pause() {
        if (this.players[this.currentPlayer].getStateLevels() < 4) {
            return;
        }
        this.players[this.currentPlayer].player.pause();
        setStateLevel(this.currentPlayer, 4);
        this.onNotifyListener.onMpPlaystateOrMetaChanged(false, null);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void stop() {
        if (this.players[this.currentPlayer].getStateLevels() < 2) {
            return;
        }
        this.players[this.currentPlayer].player.stop();
        setStateLevel(this.currentPlayer, 2);
        this.onNotifyListener.onMpPlaystateOrMetaChanged(false, null);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public boolean isPreparingOrAbove() {
        return this.players[this.currentPlayer].isPreparingOrAbove();
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public boolean isPreparingOrStared() {
        return this.players[this.currentPlayer].isPreparingOrStared();
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public boolean containsVideoTrack() {
        return this.players[this.currentPlayer].containsVideoTrack();
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setVideoScalingMode(int i) {
        this.players[this.currentPlayer].setVideoScalingMode(i);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.surfaceHolderWeak = new WeakReference<>(surfaceHolder);
            surfaceHolder.addCallback(this);
            surfaceCreated(surfaceHolder);
            return;
        }
        SurfaceHolder surfaceHolder2 = this.surfaceHolderWeak.get();
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this);
            this.surfaceHolderWeak = new WeakReference<>(null);
        }
        surfaceDestroyed(null);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public long duration() {
        if (this.players[this.currentPlayer].getStateLevels() < 2) {
            return 0L;
        }
        return this.players[this.currentPlayer].player.getDuration();
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public PlayingMediaInfo getPlayingMediaInfo() {
        if (this.players[this.currentPlayer].getStateLevels() < 2) {
            return null;
        }
        return new PlayingMediaInfo(this.players[this.currentPlayer].player.getDuration(), this.players[this.currentPlayer].containsVideoTrack());
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public long position() {
        if (this.players[this.currentPlayer].getStateLevels() < 2) {
            return 0L;
        }
        return this.players[this.currentPlayer].player.getCurrentPosition();
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void seek(long j) {
        if (this.players[this.currentPlayer].getStateLevels() < 3) {
            return;
        }
        this.players[this.currentPlayer].setFadeVolume(1.0f);
        this.players[this.currentPlayer].player.seekTo((int) j);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setMute(boolean z) {
        setVolume(z, this.volume);
        this.onNotifyListener.onVolumeMuteStateChanged(z);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public boolean isMuted() {
        return this.muted;
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setVolume(float f) {
        this.volume = f;
        setVolume(this.muted, f);
    }

    public void setVolume(boolean z, float f) {
        this.muted = z;
        this.volume = f;
        int i = 0;
        if (z) {
            PlayerEntry[] playerEntryArr = this.players;
            int length = playerEntryArr.length;
            while (i < length) {
                PlayerEntry playerEntry = playerEntryArr[i];
                if (playerEntry != null) {
                    playerEntry.setVolume(0.0f);
                }
                i++;
            }
            return;
        }
        PlayerEntry[] playerEntryArr2 = this.players;
        int length2 = playerEntryArr2.length;
        while (i < length2) {
            PlayerEntry playerEntry2 = playerEntryArr2[i];
            if (playerEntry2 != null) {
                playerEntry2.setVolume(this.volume);
            }
            i++;
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setFadeVolume(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.currentPlayer;
        } else {
            i2 = this.nextPlayer;
            if (this.currentPlayer == i2) {
                return;
            }
        }
        PlayerEntry[] playerEntryArr = this.players;
        if (playerEntryArr[i2] != null) {
            playerEntryArr[i2].setFadeVolume(f);
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public boolean setFadeVolumeRelative(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.currentPlayer;
        } else {
            i2 = this.nextPlayer;
            if (this.currentPlayer == i2) {
                return true;
            }
        }
        PlayerEntry[] playerEntryArr = this.players;
        return playerEntryArr[i2] == null || playerEntryArr[i2].setFadeVolumeRelative(f);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setVolumeStereoBalance(float f) {
        PlayerEntry[] playerEntryArr;
        for (PlayerEntry playerEntry : this.players) {
            if (playerEntry != null) {
                playerEntry.setVolumeStereoBalance(f);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void destroyOld() {
        if (this.currentPlayer == this.nextPlayer) {
            return;
        }
        destroy(1);
    }

    public void destroy(int i) {
        if (i == 0) {
            tlog.w("trying to destroy currentPlayer");
            return;
        }
        int i2 = this.currentPlayer;
        int i3 = this.nextPlayer;
        if (i2 == i3) {
            return;
        }
        releaseMediaPlayer(i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.players[this.nextPlayer].setVideoSurface(null);
            this.players[this.currentPlayer].setVideoSurface(surfaceHolder.getSurface());
            return;
        }
        this.players[this.nextPlayer].setVideoSurface(null);
        this.players[this.currentPlayer].setVideoSurface(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i = this.currentPlayer;
        int i2 = this.nextPlayer;
        if (i != i2) {
            this.players[i2].setVideoSurface(null);
        }
        this.players[this.currentPlayer].setVideoSurface(null);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void resetVisualizer() {
        synchronized (this.visualizerLock) {
            NativeVisualizerDataProvider nativeVisualizerDataProvider = this.visualizerData;
            if (nativeVisualizerDataProvider == null) {
                return;
            }
            nativeVisualizerDataProvider.reset();
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public AudioFrameData getVisualizationData(AudioFrameData audioFrameData, AudioFrameData.Request2 request2) {
        AudioFrameData visData;
        if (audioFrameData == null) {
            return null;
        }
        PlayerEntry.StateTh stateTh = this.players[this.currentPlayer].stateTh;
        if (!request2.snoopMode) {
            if (stateTh.stateLevels < 3) {
                return null;
            }
            if (!stateTh.isPreparingOrStared) {
                return audioFrameData;
            }
        }
        int i = stateTh.audioSessionId;
        synchronized (this.visualizerLock) {
            NativeVisualizerDataProvider nativeVisualizerDataProvider = this.visualizerData;
            if (nativeVisualizerDataProvider == null) {
                nativeVisualizerDataProvider = new NativeVisualizerDataProvider();
            }
            this.visualizerLastTimeUsed = SystemClock.elapsedRealtime();
            boolean z = true;
            if (request2.overridePositionUs < 0) {
                if (!request2.useGlobalSession && !request2.snoopMode) {
                    z = false;
                }
                visData = nativeVisualizerDataProvider.getVisData(0L, request2, audioFrameData, i, z);
            } else {
                tlog.w("overridePositionUs not supported on Native");
                if (!request2.useGlobalSession && !request2.snoopMode) {
                    z = false;
                }
                visData = nativeVisualizerDataProvider.getVisData(0L, request2, audioFrameData, i, z);
            }
            this.visualizerData = nativeVisualizerDataProvider;
        }
        return visData;
    }

    @Override // com.daaw.avee.comp.playback.BaseEqualizerEffect.IEqualizerEffectListener
    public BaseEqualizerEffect.EqualizerSettings getEqualizerSettings(String str) {
        return this.onNotifyListener.getEqualizerSettings(str);
    }

    @Override // com.daaw.avee.comp.playback.BaseEqualizerEffect.IEqualizerEffectListener
    public boolean isEqualizerEnabled(String str) {
        return this.onNotifyListener.getEqualizerEnabled(str);
    }

    @Override // com.daaw.avee.comp.playback.BaseEqualizerEffect.IEqualizerEffectListener
    public void onEqualizerDescChanged(BaseEqualizerEffect.EqualizerDesc equalizerDesc) {
        this.onNotifyListener.onEqualizerDescChanged(equalizerDesc);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public BaseEqualizerEffect.EqualizerDesc getEqualizerDesc() {
        NativeEqualizerEffect nativeEqualizerEffect = this.equalizerEffect;
        if (nativeEqualizerEffect != null) {
            return nativeEqualizerEffect.getEqualizerDesc();
        }
        return null;
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setEqualizerSettings(BaseEqualizerEffect.EqualizerSettings equalizerSettings) {
        NativeEqualizerEffect nativeEqualizerEffect = this.equalizerEffect;
        if (nativeEqualizerEffect != null) {
            nativeEqualizerEffect.setEqualizerSettings(equalizerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class PlayerEntry implements MediaPlayer.OnPreparedListener {
        public static final int state_error = -1;
        public static final int state_idle = 0;
        public static final int state_initialized_preparing = 1;
        public static final int state_null = -2;
        public static final int state_paused = 4;
        public static final int state_prepared = 3;
        public static final int state_started = 5;
        public static final int state_stopped = 2;
        public MediaPlayer player = null;
        public boolean playerShouldStarts = false;
        public float startFadeVolume = 1.0f;
        long prepareSeekPos = 0;
        float volume = 1.0f;
        float fadeVolume = 1.0f;
        float volumeStereoBalance = 0.0f;
        volatile StateTh stateTh = new StateTh();
        private int stateLevels = -1;
        public int sampleRate = -1;
        public int channelCount = -1;
        public int bitRate = -1;

        PlayerEntry() {
        }

        public void release() {
            NativeMediaPlayerCore.this.setVideoSurfaceHolder(null);
            if (this.player != null) {
                if (getStateLevels() > 2) {
                    this.player.stop();
                }
                this.player.release();
            }
            this.player = null;
        }

        public void reset() {
            MediaPlayer mediaPlayer = this.player;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
        }

        public int getStateLevels() {
            return this.stateLevels;
        }

        public void setStateLevels(int i) {
            this.stateLevels = i;
            StateTh stateTh = new StateTh();
            stateTh.stateLevels = i;
            stateTh.isPreparingOrStared = isPreparingOrStared();
            MediaPlayer mediaPlayer = this.player;
            stateTh.audioSessionId = mediaPlayer != null ? mediaPlayer.getAudioSessionId() : 0;
            this.stateTh = stateTh;
        }

        public void prepareAsync(long j) {
            this.prepareSeekPos = j;
            this.player.prepareAsync();
        }

        public boolean isPreparingOrAbove() {
            return this.stateLevels > 0;
        }

        public boolean isPreparingOrStared() {
            int i = this.stateLevels;
            return ((i == 1 || i == 3) && this.playerShouldStarts) || this.stateLevels == 5;
        }

        public boolean containsVideoTrack() {
            if (this.player != null && getStateLevels() >= 2) {
                try {
                    for (MediaPlayer.TrackInfo trackInfo : this.player.getTrackInfo()) {
                        if (trackInfo.getTrackType() == 1) {
                            return true;
                        }
                    }
                } catch (Exception e) {
                    tlog.w(e.getMessage());
                }
                return false;
            }
            return false;
        }

        public void setVideoScalingMode(int i) {
            if (this.player != null && getStateLevels() >= 2) {
                try {
                    this.player.setVideoScalingMode(NativeMediaPlayerCore.ConvertToNativeVideoScalingMode(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void setVideoSurface(Surface surface) {
            if (this.player == null) {
                return;
            }
            if (surface != null && surface.isValid()) {
                this.player.setSurface(surface);
            } else {
                this.player.setSurface(null);
            }
        }

        public void setVolume(float f) {
            this.volume = f;
            updateVolume();
        }

        public void setFadeVolume(float f) {
            this.fadeVolume = f;
            updateVolume();
        }

        public boolean setFadeVolumeRelative(float f) {
            boolean z = true;
            if (this.stateLevels < 0) {
                return true;
            }
            boolean z2 = false;
            float f2 = this.fadeVolume + f;
            this.fadeVolume = f2;
            if (f2 <= 0.0f) {
                this.fadeVolume = 0.0f;
                z2 = true;
            }
            if (this.fadeVolume >= 1.0f) {
                this.fadeVolume = 1.0f;
            } else {
                z = z2;
            }
            updateVolume();
            return z;
        }

        public void setStartFadeVolume(float f) {
            this.startFadeVolume = f;
        }

        public void setVolumeStereoBalance(float f) {
            this.volumeStereoBalance = f;
            updateVolume();
        }

        public void updateVolume() {
            if (this.stateLevels < 0) {
                return;
            }
            float min = Math.min(1.0f - this.volumeStereoBalance, 1.0f);
            float min2 = Math.min(this.volumeStereoBalance + 1.0f, 1.0f);
            MediaPlayer mediaPlayer = this.player;
            float f = this.fadeVolume;
            float f2 = this.volume;
            mediaPlayer.setVolume(min * f * f2, min2 * f * f2);
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            setStateLevels(3);
            mediaPlayer.seekTo((int) this.prepareSeekPos);
            setFadeVolume(this.startFadeVolume);
            if (this.playerShouldStarts) {
                NativeMediaPlayerCore.this.start(false);
            }
            NativeMediaPlayerCore.this.onNotifyListener.onMpPlaystateOrMetaChanged(true, null);
        }

        /* loaded from: classes.dex */
        public class StateTh {
            public int stateLevels = -1;
            public boolean isPreparingOrStared = false;
            public int audioSessionId = 0;

            public StateTh() {
            }
        }
    }
}
