package com.daaw.avee.comp.playback.ExoMediaPlayer;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.daaw.avee.Common.Events.WeakDelegate2;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.EventsGlobal.EventsGlobalApp;
import com.daaw.avee.comp.Common.ExoPcmData;
import com.daaw.avee.comp.PcmProcess.ExoVisualizerDataProvider;
import com.daaw.avee.comp.playback.AudioFrameData;
import com.daaw.avee.comp.playback.BaseEqualizerEffect;
import com.daaw.avee.comp.playback.ExoMediaPlayer.exoplayer2.MyRenderersFactory;
import com.daaw.avee.comp.playback.IMediaPlayerCore;
import com.daaw.avee.comp.playback.PlayingMediaInfo;
import com.daaw.avee.comp.playback.Song.IMediaDataSource;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.offline.FilteringManifestParser;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.smoothstreaming.DefaultSsChunkSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.EventLogger;
import com.google.android.exoplayer2.util.Util;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ExoMediaPlayerCore implements IMediaPlayerCore, BaseEqualizerEffect.IEqualizerEffectListener, SurfaceHolder.Callback {
    private static volatile WeakReference<ExoMediaPlayerCore> instanceWeak = new WeakReference<>(null);
    private AudioCapabilities audioCapabilities;
    private AudioCapabilitiesReceiver audioCapabilitiesReceiver;
    private Context context;
    private IMediaDataSource nextDataSource;
    private IMediaPlayerCore.OnNotifyListener onNotifyListener;
    private String userAgent;
    private final Object visualizerLock = new Object();
    private PlayerEntry[] players = new PlayerEntry[2];
    private int currentPlayer = 0;
    private int nextPlayer = 1;
    private float volume = 1.0f;
    private boolean muted = false;
    private WeakReference<SurfaceHolder> surfaceHolderWeak = new WeakReference<>(null);
    private long visualizerLastTimeUsed = 0;
    private volatile ExoVisualizerDataProvider visualizerData = null;
    private List<Object> listenerRefHolder = new LinkedList();
    private ExoEqualizerEffect equalizerEffect = new ExoEqualizerEffect(this);
    private Handler mainHandler = new Handler();
    private ExoPcmData pcmDataTmp = new ExoPcmData();
    private IVisualizerDataCapturer visualizerDataCapturer = new IVisualizerDataCapturer() { // from class: com.daaw.avee.comp.playback.ExoMediaPlayer.ExoMediaPlayerCore.1
        boolean enabled = false;

        @Override // com.daaw.avee.comp.playback.ExoMediaPlayer.IVisualizerDataCapturer
        public void onNewSource() {
            ExoMediaPlayerCore.this.onNotifyListener.onExoPcmDataNewSource();
            ExoVisualizerDataProvider exoVisualizerDataProvider = ExoMediaPlayerCore.this.visualizerData;
            if (exoVisualizerDataProvider != null) {
                exoVisualizerDataProvider.onNewSourceTh();
            }
        }

        @Override // com.daaw.avee.comp.playback.ExoMediaPlayer.IVisualizerDataCapturer
        public void onSetEnabled(boolean z) {
            this.enabled = z;
        }

        @Override // com.daaw.avee.comp.playback.ExoMediaPlayer.IVisualizerDataCapturer
        public void onPcmData(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4, long j2) {
            if (this.enabled) {
                ExoMediaPlayerCore.this.pcmDataTmp.enabled = this.enabled;
                ExoMediaPlayerCore.this.pcmDataTmp.buffer = byteBuffer;
                ExoMediaPlayerCore.this.pcmDataTmp.bufferPresentationTimeUs = j;
                ExoMediaPlayerCore.this.pcmDataTmp.bufferIndex = i;
                ExoMediaPlayerCore.this.pcmDataTmp.sampleRate = i2;
                ExoMediaPlayerCore.this.pcmDataTmp.channelCount = i3;
                ExoMediaPlayerCore.this.pcmDataTmp.bitDepth = i4;
                ExoMediaPlayerCore.this.pcmDataTmp.positionUs = j2;
                ExoMediaPlayerCore.this.onNotifyListener.onExoPcmData(ExoMediaPlayerCore.this.pcmDataTmp);
                ExoMediaPlayerCore.this.pcmDataTmp.buffer = null;
            }
        }

        @Override // com.daaw.avee.comp.playback.ExoMediaPlayer.IVisualizerDataCapturer
        public void onAudioSessionId(int i) {
            if (ExoMediaPlayerCore.this.equalizerEffect != null) {
                ExoMediaPlayerCore.this.equalizerEffect.onAudioSessionChanged(i);
            }
        }

        @Override // com.daaw.avee.comp.playback.ExoMediaPlayer.IVisualizerDataCapturer
        public boolean isCurrentPlayerEntry(int i) {
            PlayerEntry playerEntry = ExoMediaPlayerCore.this.getPlayerEntry();
            return playerEntry != null && playerEntry.playerEntryIndexId == i;
        }
    };
    long lastSeekTimeMs = 0;

    /* loaded from: classes.dex */
    public static class Receive {
        static List<Object> listenerRefHolder = new LinkedList();
        public static WeakDelegate2<Activity, CharSequence> showTrackSelection = new WeakDelegate2().subscribeWeak(new WeakDelegate2.Handler<Activity, CharSequence>() { // from class: com.daaw.avee.comp.playback.ExoMediaPlayer.ExoMediaPlayerCore.Receive.1
            @Override // com.daaw.avee.Common.Events.WeakDelegate2.Handler
            public void invoke(Activity activity, CharSequence charSequence) {
            }
        }, listenerRefHolder);
    }

    public static int ConvertToExoVideoScalingMode(int i) {
        return (i != 1 && i == 2) ? 2 : 1;
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void resetVisualizer() {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public ExoMediaPlayerCore(Context context, String str, IMediaPlayerCore.OnNotifyListener onNotifyListener) {
        int i = 0;
        this.context = context;
        this.onNotifyListener = onNotifyListener;
        this.userAgent = Util.getUserAgent(context, "ExoPlayerDemo");
        while (true) {
            PlayerEntry[] playerEntryArr = this.players;
            if (i < playerEntryArr.length) {
                playerEntryArr[i] = new PlayerEntry(context, i);
                i++;
            } else {
                this.audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(context, new AudioCapabilitiesReceiver.Listener() { // from class: com.daaw.avee.comp.playback.ExoMediaPlayer.ExoMediaPlayerCore.2
                    @Override // com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.Listener
                    public void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
                        if (!audioCapabilities.equals(ExoMediaPlayerCore.this.audioCapabilities)) {
                            ExoMediaPlayerCore.this.audioCapabilities = audioCapabilities;
                            ExoMediaPlayerCore.this.restartPlayers();
                        }
                    }
                });
                EventsGlobalApp.onUITick10.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.comp.playback.ExoMediaPlayer.ExoMediaPlayerCore.3
                    @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
                    public void invoke() {
                        ExoMediaPlayerCore.this.checkVisualizerLife();
                    }
                }, this.listenerRefHolder);
                instanceWeak = new WeakReference<>(this);
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
        ExoEqualizerEffect exoEqualizerEffect = this.equalizerEffect;
        if (exoEqualizerEffect != null) {
            exoEqualizerEffect.release();
            this.equalizerEffect = null;
        }
        setVideoSurfaceHolder(null);
        for (PlayerEntry playerEntry : this.players) {
            playerEntry.releasePlayer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartPlayers() {
        PlayerEntry[] playerEntryArr;
        for (PlayerEntry playerEntry : this.players) {
            long j = 0;
            if (playerEntry.player != null) {
                j = playerEntry.player.getCurrentPosition();
            }
            IMediaDataSource iMediaDataSource = playerEntry.dataSource;
            playerEntry.releasePlayer();
            playerEntry.preparePlayer(iMediaDataSource, 1.0f, j);
        }
    }

    void checkVisualizerLife() {
        synchronized (this.visualizerLock) {
            ExoVisualizerDataProvider exoVisualizerDataProvider = this.visualizerData;
            if (exoVisualizerDataProvider != null && SystemClock.elapsedRealtime() - this.visualizerLastTimeUsed > 8000) {
                exoVisualizerDataProvider.release();
                this.visualizerData = null;
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setNextDataSource(IMediaDataSource iMediaDataSource) {
        this.nextDataSource = iMediaDataSource;
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void playNext(boolean z, boolean z2, float f, long j) {
        if (!z) {
            if (isPreparingOrAbove()) {
                cycleNextPlayer();
            }
        } else if (this.currentPlayer != this.nextPlayer) {
            getNextPlayerEntry().releasePlayer();
        }
        IMediaDataSource iMediaDataSource = this.nextDataSource;
        if (iMediaDataSource == null || iMediaDataSource.getContentUri() == null || this.nextDataSource.getContentUri().equals(Uri.EMPTY)) {
            tlog.w("nextDataSource is null");
            if (z2) {
                start();
                return;
            } else {
                pause();
                return;
            }
        }
        getPlayerEntry().preparePlayer(this.nextDataSource, f, j);
        if (z2) {
            start();
        } else {
            getPlayerEntry().pause();
        }
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void start() {
        PlayerEntry playerEntry = getPlayerEntry();
        if (playerEntry.player == null) {
            return;
        }
        if (this.onNotifyListener.onRequestAudioFocus()) {
            playerEntry.rePrepareDataSourceIfNotStarted();
            surfaceCreated(this.onNotifyListener.onRequestVideoSurfaceHolder());
            getPlayerEntry().start();
        }
        this.onNotifyListener.onMpPlaystateOrMetaChanged(false, null);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void pause() {
        if (getPlayer() == null) {
            return;
        }
        getPlayerEntry().pause();
        this.onNotifyListener.onMpPlaystateOrMetaChanged(false, null);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void stop() {
        if (getPlayer() == null) {
            return;
        }
        getPlayer().setPlayWhenReady(false);
        this.onNotifyListener.onMpPlaystateOrMetaChanged(false, null);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public boolean isPreparingOrAbove() {
        return getPlayer() != null && (getPlayer().getPlaybackState() == 2 || getPlayer().getPlaybackState() == 3);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public boolean isPreparingOrStared() {
        return (getPlayer() == null || getPlayer().getPlaybackState() == 4 || !getPlayer().getPlayWhenReady()) ? false : true;
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public boolean containsVideoTrack() {
        return getPlayer() != null;
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setVideoScalingMode(int i) {
        getPlayerEntry().setVideoScalingMode(i);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.surfaceHolderWeak = new WeakReference<>(surfaceHolder);
            surfaceHolder.removeCallback(this);
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
        return getPlayerEntry().getDuration();
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public PlayingMediaInfo getPlayingMediaInfo() {
        if (getPlayer() == null) {
            return null;
        }
        return new PlayingMediaInfo(getPlayerEntry().getDuration(), getPlayer() != null);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public long position() {
        if (getPlayer() == null) {
            return 0L;
        }
        return getPlayer().getCurrentPosition();
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void seek(long j) {
        this.lastSeekTimeMs = j;
        getPlayerEntry().setFadeVolume(1.0f);
        getPlayerEntry().seekTo((int) j);
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
        setVolume(this.muted, f);
    }

    public void setVolume(boolean z, float f) {
        this.volume = f;
        this.muted = z;
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
                playerEntry2.setVolume(f);
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
        this.players[i3].releasePlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SimpleExoPlayer getPlayer() {
        return getPlayerEntry().player;
    }

    PlayerEntry getPlayerEntry() {
        return this.players[this.currentPlayer];
    }

    PlayerEntry getNextPlayerEntry() {
        return this.players[this.nextPlayer];
    }

    void cycleNextPlayer() {
        int i = this.currentPlayer;
        this.currentPlayer = this.nextPlayer;
        this.nextPlayer = i;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            getNextPlayerEntry().setVideoSurface(null);
            getPlayerEntry().setVideoSurface(surfaceHolder.getSurface());
            return;
        }
        getNextPlayerEntry().setVideoSurface(null);
        getPlayerEntry().setVideoSurface(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.currentPlayer != this.nextPlayer) {
            getNextPlayerEntry().setVideoSurface(null);
        }
        getPlayerEntry().setVideoSurface(null);
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public AudioFrameData getVisualizationData(AudioFrameData audioFrameData, AudioFrameData.Request2 request2) {
        if (audioFrameData == null) {
            return null;
        }
        if (request2.overridePositionUs < 0) {
            audioFrameData.initAsUseExoData(position() * 1000);
        } else {
            audioFrameData.initAsUseExoData(request2.overridePositionUs);
        }
        return audioFrameData;
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
        ExoEqualizerEffect exoEqualizerEffect = this.equalizerEffect;
        if (exoEqualizerEffect != null) {
            return exoEqualizerEffect.getEqualizerDesc();
        }
        return null;
    }

    @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
    public void setEqualizerSettings(BaseEqualizerEffect.EqualizerSettings equalizerSettings) {
        ExoEqualizerEffect exoEqualizerEffect = this.equalizerEffect;
        if (exoEqualizerEffect != null) {
            exoEqualizerEffect.setEqualizerSettings(equalizerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class PlayerEntry implements Player.EventListener, MetadataRenderer.Output, SimpleExoPlayer.VideoListener, TextRenderer.Output {
        private Context context;
        IMediaDataSource dataSource;
        MediaSource mediaSource;
        private SimpleExoPlayer player;
        private int playerEntryIndexId;
        private MappingTrackSelector trackSelector;
        private final DefaultBandwidthMeter BANDWIDTH_METER = new DefaultBandwidthMeter();
        private int lastPlaybackState = 0;
        private float volume = 1.0f;
        private float fadeVolume = 0.0f;
        private float volumeStereoBalance = 0.0f;
        private float startFadeVolume = 0.0f;
        private DataSource.Factory mediaDataSourceFactory = buildDataSourceFactory(true);

        int getVideoTrack() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(List<Cue> list) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataOutput
        public void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        public void setVideoScalingMode(int i) {
        }

        PlayerEntry(Context context, int i) {
            this.context = context;
            this.playerEntryIndexId = i;
        }

        public DataSource.Factory buildDataSourceFactory(TransferListener<? super DataSource> transferListener) {
            return new DefaultDataSourceFactory(this.context, transferListener, buildHttpDataSourceFactory(transferListener));
        }

        public HttpDataSource.Factory buildHttpDataSourceFactory(TransferListener<? super DataSource> transferListener) {
            return new DefaultHttpDataSourceFactory(ExoMediaPlayerCore.this.userAgent, transferListener);
        }

        private DataSource.Factory buildDataSourceFactory(boolean z) {
            return buildDataSourceFactory(z ? this.BANDWIDTH_METER : null);
        }

        public List<?> getOfflineStreamKeys(Uri uri) {
            return Collections.emptyList();
        }

        private MediaSource buildMediaSource(Uri uri, int i, String str) {
            int inferContentType = Util.inferContentType(uri, str);
            if (inferContentType != 0) {
                if (inferContentType != 1) {
                    if (inferContentType != 2) {
                        if (inferContentType == 3) {
                            return new ExtractorMediaSource.Factory(this.mediaDataSourceFactory).createMediaSource(uri);
                        }
                        throw new IllegalStateException("Unsupported type: " + inferContentType);
                    }
                    return new HlsMediaSource.Factory(this.mediaDataSourceFactory).setPlaylistParser(new FilteringManifestParser(new HlsPlaylistParser(), getOfflineStreamKeys(uri))).createMediaSource(uri);
                }
                return new SsMediaSource.Factory(new DefaultSsChunkSource.Factory(this.mediaDataSourceFactory), buildDataSourceFactory(false)).setManifestParser(new FilteringManifestParser(new SsManifestParser(), getOfflineStreamKeys(uri))).createMediaSource(uri);
            }
            return new DashMediaSource.Factory(new DefaultDashChunkSource.Factory(this.mediaDataSourceFactory), buildDataSourceFactory(false)).setManifestParser(new FilteringManifestParser(new DashManifestParser(), getOfflineStreamKeys(uri))).createMediaSource(uri);
        }

        private MediaSource getMediaSource(IMediaDataSource iMediaDataSource) {
            Uri[] uriArr = {iMediaDataSource.getContentUri()};
            String[] strArr = {""};
            int[] iArr = {iMediaDataSource.getContentType()};
            MediaSource[] mediaSourceArr = new MediaSource[1];
            for (int i = 0; i < 1; i++) {
                mediaSourceArr[i] = buildMediaSource(uriArr[i], iArr[i], strArr[i]);
            }
            return mediaSourceArr[0];
        }

        void preparePlayer(IMediaDataSource iMediaDataSource, float f, long j) {
            this.trackSelector = new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(this.BANDWIDTH_METER));
            this.dataSource = iMediaDataSource;
            this.mediaSource = getMediaSource(iMediaDataSource);
            if (this.player == null) {
                if (Build.VERSION.SDK_INT < 21) {
                    DefaultAudioSink.enablePreV21AudioSessionWorkaround = true;
                }
                SimpleExoPlayer newSimpleInstance = ExoPlayerFactory.newSimpleInstance(new MyRenderersFactory(ExoMediaPlayerCore.this.onNotifyListener, ExoMediaPlayerCore.this.visualizerDataCapturer, this.playerEntryIndexId, this.context, 0), this.trackSelector, (DrmSessionManager<FrameworkMediaCrypto>) null);
                this.player = newSimpleInstance;
                newSimpleInstance.addListener(this);
                this.player.addAnalyticsListener(new EventLogger(this.trackSelector));
                this.player.seekTo(j);
            }
            setFadeVolume(f);
            setStartFadeVolume(f);
            ExoMediaPlayerCore exoMediaPlayerCore = ExoMediaPlayerCore.this;
            exoMediaPlayerCore.setVideoSurfaceHolder(exoMediaPlayerCore.onNotifyListener.onRequestVideoSurfaceHolder());
            this.player.seekTo(j);
            if (this.dataSource != null) {
                prepare(this.mediaSource);
            }
            setFadeVolume(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void releasePlayer() {
            SimpleExoPlayer simpleExoPlayer = this.player;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.release();
                this.player = null;
            }
            this.trackSelector = null;
        }

        void rePrepareDataSourceIfNotStarted() {
            MediaSource mediaSource;
            SimpleExoPlayer simpleExoPlayer = this.player;
            if (simpleExoPlayer == null || simpleExoPlayer.getPlaybackState() != 1 || (mediaSource = this.mediaSource) == null) {
                return;
            }
            this.player.prepare(mediaSource);
        }

        void prepare(MediaSource mediaSource) {
            if (this.player == null || mediaSource == null) {
                return;
            }
            ExoMediaPlayerCore.this.visualizerDataCapturer.onNewSource();
            this.player.prepare(mediaSource);
        }

        public long getDuration() {
            SimpleExoPlayer simpleExoPlayer = this.player;
            if (simpleExoPlayer != null) {
                long duration = simpleExoPlayer.getDuration();
                if (duration >= 0 && duration != C.TIME_UNSET) {
                    return duration;
                }
                return 0L;
            }
            return 0L;
        }

        public void start() {
            SimpleExoPlayer simpleExoPlayer = this.player;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setPlayWhenReady(true);
            }
        }

        public void pause() {
            SimpleExoPlayer simpleExoPlayer = this.player;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setPlayWhenReady(false);
            }
        }

        public void seekTo(long j) {
            SimpleExoPlayer simpleExoPlayer = this.player;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z, int i) {
            int i2 = this.lastPlaybackState;
            if (i2 == i) {
                return;
            }
            this.lastPlaybackState = i;
            if (ExoMediaPlayerCore.this.equalizerEffect != null) {
                ExoMediaPlayerCore.this.equalizerEffect.onCheckEqualizerLife();
            }
            if (i2 != 3) {
                setFadeVolume(this.startFadeVolume);
                ExoMediaPlayerCore.this.onNotifyListener.onMpPlaystateOrMetaChanged(true, null);
            }
            if ((i2 == 2 || i2 == 3) && i == 4) {
                onCompletion(this.player);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            String message = exoPlaybackException.getMessage();
            if (message == null) {
                message = "";
            }
            String replace = message.replace("java.io.IOException:", "").replace("java.lang.IllegalStateException", "");
            if (replace.length() < 5) {
                replace = "Error " + replace;
            }
            ExoMediaPlayerCore.this.onNotifyListener.onMpPlaystateOrMetaChanged(false, replace);
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            tlog.w("width: " + i + " height: " + i2);
            float f2 = (float) i;
            float f3 = (float) i2;
            if (i < i2) {
                f3 = f2;
                f2 = f3;
            }
            ExoMediaPlayerCore.this.onNotifyListener.onNotifyVideoSizeChanged(i, i2, ((f3 > 0.0f) && ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) > 0)) ? (f2 * f) / f3 : 1.0f);
        }

        public void onCompletion(SimpleExoPlayer simpleExoPlayer) {
            if (simpleExoPlayer != null && ExoMediaPlayerCore.this.getPlayer() == simpleExoPlayer) {
                ExoMediaPlayerCore.this.onNotifyListener.requestNextDataNow();
            }
        }

        public boolean setVideoSurface(Surface surface) {
            if (this.player == null) {
                return false;
            }
            if (surface != null && surface.isValid()) {
                this.player.setVideoListener(this);
                this.player.setVideoSurface(surface);
                return true;
            }
            this.player.setVideoListener(null);
            this.player.setVideoSurface(null);
            return false;
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
            boolean z;
            float f2 = this.fadeVolume + f;
            this.fadeVolume = f2;
            boolean z2 = true;
            if (f2 <= 0.0f) {
                this.fadeVolume = 0.0f;
                z = true;
            } else {
                z = false;
            }
            if (this.fadeVolume >= 1.0f) {
                this.fadeVolume = 1.0f;
            } else {
                z2 = z;
            }
            updateVolume();
            return z2;
        }

        public void setStartFadeVolume(float f) {
            this.startFadeVolume = f;
        }

        public void setVolumeStereoBalance(float f) {
            this.volumeStereoBalance = f;
            updateVolume();
        }

        void updateVolume() {
            Math.min(1.0f - this.volumeStereoBalance, 1.0f);
            float min = Math.min(this.volumeStereoBalance + 1.0f, 1.0f);
            SimpleExoPlayer simpleExoPlayer = this.player;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(min * this.fadeVolume * this.volume);
            }
        }
    }
}
