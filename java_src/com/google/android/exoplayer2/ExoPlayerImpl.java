package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
final class ExoPlayerImpl implements ExoPlayer {
    private static final String TAG = "ExoPlayerImpl";
    private final TrackSelectorResult emptyTrackSelectorResult;
    private final Handler eventHandler;
    private boolean hasPendingPrepare;
    private boolean hasPendingSeek;
    private final ExoPlayerImplInternal internalPlayer;
    private final Handler internalPlayerHandler;
    private final CopyOnWriteArraySet<Player.EventListener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private int pendingOperationAcks;
    private final ArrayDeque<PlaybackInfoUpdate> pendingPlaybackInfoUpdates;
    private final Timeline.Period period;
    private boolean playWhenReady;
    private ExoPlaybackException playbackError;
    private PlaybackInfo playbackInfo;
    private PlaybackParameters playbackParameters;
    private final Renderer[] renderers;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;

    @Override // com.google.android.exoplayer2.Player
    public Player.TextComponent getTextComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Player
    public Player.VideoComponent getVideoComponent() {
        return null;
    }

    public ExoPlayerImpl(Renderer[] rendererArr, TrackSelector trackSelector, LoadControl loadControl, Clock clock) {
        Log.i(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + ExoPlayerLibraryInfo.VERSION_SLASHY + "] [" + Util.DEVICE_DEBUG_INFO + "]");
        Assertions.checkState(rendererArr.length > 0);
        this.renderers = (Renderer[]) Assertions.checkNotNull(rendererArr);
        this.trackSelector = (TrackSelector) Assertions.checkNotNull(trackSelector);
        this.playWhenReady = false;
        this.repeatMode = 0;
        this.shuffleModeEnabled = false;
        this.listeners = new CopyOnWriteArraySet<>();
        this.emptyTrackSelectorResult = new TrackSelectorResult(new RendererConfiguration[rendererArr.length], new TrackSelection[rendererArr.length], null);
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.playbackParameters = PlaybackParameters.DEFAULT;
        this.eventHandler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) { // from class: com.google.android.exoplayer2.ExoPlayerImpl.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ExoPlayerImpl.this.handleEvent(message);
            }
        };
        this.playbackInfo = new PlaybackInfo(Timeline.EMPTY, 0L, TrackGroupArray.EMPTY, this.emptyTrackSelectorResult);
        this.pendingPlaybackInfoUpdates = new ArrayDeque<>();
        this.internalPlayer = new ExoPlayerImplInternal(rendererArr, trackSelector, this.emptyTrackSelectorResult, loadControl, this.playWhenReady, this.repeatMode, this.shuffleModeEnabled, this.eventHandler, this, clock);
        this.internalPlayerHandler = new Handler(this.internalPlayer.getPlaybackLooper());
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.EventListener eventListener) {
        this.listeners.add(eventListener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.EventListener eventListener) {
        this.listeners.remove(eventListener);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        return this.playbackInfo.playbackState;
    }

    @Override // com.google.android.exoplayer2.Player
    public ExoPlaybackException getPlaybackError() {
        return this.playbackError;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void prepare(MediaSource mediaSource) {
        prepare(mediaSource, true, true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        this.playbackError = null;
        PlaybackInfo resetPlaybackInfo = getResetPlaybackInfo(z, z2, 2);
        this.hasPendingPrepare = true;
        this.pendingOperationAcks++;
        this.internalPlayer.prepare(mediaSource, z, z2);
        updatePlaybackInfo(resetPlaybackInfo, false, 4, 1, false, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z) {
        if (this.playWhenReady != z) {
            this.playWhenReady = z;
            this.internalPlayer.setPlayWhenReady(z);
            updatePlaybackInfo(this.playbackInfo, false, 4, 1, false, true);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(int i) {
        if (this.repeatMode != i) {
            this.repeatMode = i;
            this.internalPlayer.setRepeatMode(i);
            Iterator<Player.EventListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onRepeatModeChanged(i);
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
        return this.repeatMode;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(boolean z) {
        if (this.shuffleModeEnabled != z) {
            this.shuffleModeEnabled = z;
            this.internalPlayer.setShuffleModeEnabled(z);
            Iterator<Player.EventListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onShuffleModeEnabledChanged(z);
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
        return this.shuffleModeEnabled;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
        return this.playbackInfo.isLoading;
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToDefaultPosition() {
        seekToDefaultPosition(getCurrentWindowIndex());
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToDefaultPosition(int i) {
        seekTo(i, C.TIME_UNSET);
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(long j) {
        seekTo(getCurrentWindowIndex(), j);
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int i, long j) {
        Timeline timeline = this.playbackInfo.timeline;
        if (i < 0 || (!timeline.isEmpty() && i >= timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(timeline, i, j);
        }
        this.hasPendingSeek = true;
        this.pendingOperationAcks++;
        if (isPlayingAd()) {
            Log.w(TAG, "seekTo ignored because an ad is playing");
            this.eventHandler.obtainMessage(0, 1, -1, this.playbackInfo).sendToTarget();
            return;
        }
        this.maskingWindowIndex = i;
        if (timeline.isEmpty()) {
            this.maskingWindowPositionMs = j == C.TIME_UNSET ? 0L : j;
            this.maskingPeriodIndex = 0;
        } else {
            long defaultPositionUs = j == C.TIME_UNSET ? timeline.getWindow(i, this.window).getDefaultPositionUs() : C.msToUs(j);
            Pair<Integer, Long> periodPosition = timeline.getPeriodPosition(this.window, this.period, i, defaultPositionUs);
            this.maskingWindowPositionMs = C.usToMs(defaultPositionUs);
            this.maskingPeriodIndex = ((Integer) periodPosition.first).intValue();
        }
        this.internalPlayer.seekTo(timeline, i, C.msToUs(j));
        Iterator<Player.EventListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity(1);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        this.internalPlayer.setPlaybackParameters(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(SeekParameters seekParameters) {
        if (seekParameters == null) {
            seekParameters = SeekParameters.DEFAULT;
        }
        this.internalPlayer.setSeekParameters(seekParameters);
    }

    @Override // com.google.android.exoplayer2.Player
    public Object getCurrentTag() {
        int currentWindowIndex = getCurrentWindowIndex();
        if (currentWindowIndex > this.playbackInfo.timeline.getWindowCount()) {
            return null;
        }
        return this.playbackInfo.timeline.getWindow(currentWindowIndex, this.window, true).tag;
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
        stop(false);
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop(boolean z) {
        if (z) {
            this.playbackError = null;
        }
        PlaybackInfo resetPlaybackInfo = getResetPlaybackInfo(z, z, 1);
        this.pendingOperationAcks++;
        this.internalPlayer.stop(z);
        updatePlaybackInfo(resetPlaybackInfo, false, 4, 1, false, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        Log.i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + ExoPlayerLibraryInfo.VERSION_SLASHY + "] [" + Util.DEVICE_DEBUG_INFO + "] [" + ExoPlayerLibraryInfo.registeredModules() + "]");
        this.internalPlayer.release();
        this.eventHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void sendMessages(ExoPlayer.ExoPlayerMessage... exoPlayerMessageArr) {
        for (ExoPlayer.ExoPlayerMessage exoPlayerMessage : exoPlayerMessageArr) {
            createMessage(exoPlayerMessage.target).setType(exoPlayerMessage.messageType).setPayload(exoPlayerMessage.message).send();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        return new PlayerMessage(this.internalPlayer, target, this.playbackInfo.timeline, getCurrentWindowIndex(), this.internalPlayerHandler);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void blockingSendMessages(ExoPlayer.ExoPlayerMessage... exoPlayerMessageArr) {
        ArrayList<PlayerMessage> arrayList = new ArrayList();
        for (ExoPlayer.ExoPlayerMessage exoPlayerMessage : exoPlayerMessageArr) {
            arrayList.add(createMessage(exoPlayerMessage.target).setType(exoPlayerMessage.messageType).setPayload(exoPlayerMessage.message).send());
        }
        boolean z = false;
        for (PlayerMessage playerMessage : arrayList) {
            boolean z2 = true;
            while (z2) {
                try {
                    playerMessage.blockUntilDelivered();
                    z2 = false;
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        if (shouldMaskPosition()) {
            return this.maskingPeriodIndex;
        }
        return this.playbackInfo.periodId.periodIndex;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentWindowIndex() {
        if (shouldMaskPosition()) {
            return this.maskingWindowIndex;
        }
        return this.playbackInfo.timeline.getPeriod(this.playbackInfo.periodId.periodIndex, this.period).windowIndex;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getNextWindowIndex() {
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty()) {
            return -1;
        }
        return timeline.getNextWindowIndex(getCurrentWindowIndex(), this.repeatMode, this.shuffleModeEnabled);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPreviousWindowIndex() {
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty()) {
            return -1;
        }
        return timeline.getPreviousWindowIndex(getCurrentWindowIndex(), this.repeatMode, this.shuffleModeEnabled);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (isPlayingAd()) {
            MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
            timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
            return C.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
        }
        return timeline.getWindow(getCurrentWindowIndex(), this.window).getDurationMs();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        if (shouldMaskPosition()) {
            return this.maskingWindowPositionMs;
        }
        return playbackInfoPositionUsToWindowPositionMs(this.playbackInfo.positionUs);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
        if (shouldMaskPosition()) {
            return this.maskingWindowPositionMs;
        }
        return playbackInfoPositionUsToWindowPositionMs(this.playbackInfo.bufferedPositionUs);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == C.TIME_UNSET || duration == C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return Util.constrainValue((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentWindowDynamic() {
        Timeline timeline = this.playbackInfo.timeline;
        return !timeline.isEmpty() && timeline.getWindow(getCurrentWindowIndex(), this.window).isDynamic;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentWindowSeekable() {
        Timeline timeline = this.playbackInfo.timeline;
        return !timeline.isEmpty() && timeline.getWindow(getCurrentWindowIndex(), this.window).isSeekable;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        return !shouldMaskPosition() && this.playbackInfo.periodId.isAd();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        if (isPlayingAd()) {
            this.playbackInfo.timeline.getPeriod(this.playbackInfo.periodId.periodIndex, this.period);
            return this.period.getPositionInWindowMs() + C.usToMs(this.playbackInfo.contentPositionUs);
        }
        return getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRendererCount() {
        return this.renderers.length;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRendererType(int i) {
        return this.renderers[i].getTrackType();
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackGroupArray getCurrentTrackGroups() {
        return this.playbackInfo.trackGroups;
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackSelectionArray getCurrentTrackSelections() {
        return this.playbackInfo.trackSelectorResult.selections;
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        return this.playbackInfo.timeline;
    }

    @Override // com.google.android.exoplayer2.Player
    public Object getCurrentManifest() {
        return this.playbackInfo.manifest;
    }

    void handleEvent(Message message) {
        int i = message.what;
        if (i == 0) {
            handlePlaybackInfo((PlaybackInfo) message.obj, message.arg1, message.arg2 != -1, message.arg2);
        } else if (i != 1) {
            if (i == 2) {
                ExoPlaybackException exoPlaybackException = (ExoPlaybackException) message.obj;
                this.playbackError = exoPlaybackException;
                Iterator<Player.EventListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onPlayerError(exoPlaybackException);
                }
                return;
            }
            throw new IllegalStateException();
        } else {
            PlaybackParameters playbackParameters = (PlaybackParameters) message.obj;
            if (this.playbackParameters.equals(playbackParameters)) {
                return;
            }
            this.playbackParameters = playbackParameters;
            Iterator<Player.EventListener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onPlaybackParametersChanged(playbackParameters);
            }
        }
    }

    private void handlePlaybackInfo(PlaybackInfo playbackInfo, int i, boolean z, int i2) {
        int i3 = this.pendingOperationAcks - i;
        this.pendingOperationAcks = i3;
        if (i3 == 0) {
            if (playbackInfo.startPositionUs == C.TIME_UNSET) {
                playbackInfo = playbackInfo.fromNewPosition(playbackInfo.periodId, 0L, playbackInfo.contentPositionUs);
            }
            PlaybackInfo playbackInfo2 = playbackInfo;
            if ((!this.playbackInfo.timeline.isEmpty() || this.hasPendingPrepare) && playbackInfo2.timeline.isEmpty()) {
                this.maskingPeriodIndex = 0;
                this.maskingWindowIndex = 0;
                this.maskingWindowPositionMs = 0L;
            }
            int i4 = this.hasPendingPrepare ? 0 : 2;
            boolean z2 = this.hasPendingSeek;
            this.hasPendingPrepare = false;
            this.hasPendingSeek = false;
            updatePlaybackInfo(playbackInfo2, z, i2, i4, z2, false);
        }
    }

    private PlaybackInfo getResetPlaybackInfo(boolean z, boolean z2, int i) {
        if (z) {
            this.maskingWindowIndex = 0;
            this.maskingPeriodIndex = 0;
            this.maskingWindowPositionMs = 0L;
        } else {
            this.maskingWindowIndex = getCurrentWindowIndex();
            this.maskingPeriodIndex = getCurrentPeriodIndex();
            this.maskingWindowPositionMs = getCurrentPosition();
        }
        return new PlaybackInfo(z2 ? Timeline.EMPTY : this.playbackInfo.timeline, z2 ? null : this.playbackInfo.manifest, this.playbackInfo.periodId, this.playbackInfo.startPositionUs, this.playbackInfo.contentPositionUs, i, false, z2 ? TrackGroupArray.EMPTY : this.playbackInfo.trackGroups, z2 ? this.emptyTrackSelectorResult : this.playbackInfo.trackSelectorResult);
    }

    private void updatePlaybackInfo(PlaybackInfo playbackInfo, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean z4 = !this.pendingPlaybackInfoUpdates.isEmpty();
        this.pendingPlaybackInfoUpdates.addLast(new PlaybackInfoUpdate(playbackInfo, this.playbackInfo, this.listeners, this.trackSelector, z, i, i2, z2, this.playWhenReady, z3));
        this.playbackInfo = playbackInfo;
        if (z4) {
            return;
        }
        while (!this.pendingPlaybackInfoUpdates.isEmpty()) {
            this.pendingPlaybackInfoUpdates.peekFirst().notifyListeners();
            this.pendingPlaybackInfoUpdates.removeFirst();
        }
    }

    private long playbackInfoPositionUsToWindowPositionMs(long j) {
        long usToMs = C.usToMs(j);
        if (this.playbackInfo.periodId.isAd()) {
            return usToMs;
        }
        this.playbackInfo.timeline.getPeriod(this.playbackInfo.periodId.periodIndex, this.period);
        return usToMs + this.period.getPositionInWindowMs();
    }

    private boolean shouldMaskPosition() {
        return this.playbackInfo.timeline.isEmpty() || this.pendingOperationAcks > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class PlaybackInfoUpdate {
        private final boolean isLoadingChanged;
        private final Set<Player.EventListener> listeners;
        private final boolean playWhenReady;
        private final PlaybackInfo playbackInfo;
        private final boolean playbackStateOrPlayWhenReadyChanged;
        private final boolean positionDiscontinuity;
        private final int positionDiscontinuityReason;
        private final boolean seekProcessed;
        private final int timelineChangeReason;
        private final boolean timelineOrManifestChanged;
        private final TrackSelector trackSelector;
        private final boolean trackSelectorResultChanged;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo, PlaybackInfo playbackInfo2, Set<Player.EventListener> set, TrackSelector trackSelector, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.playbackInfo = playbackInfo;
            this.listeners = set;
            this.trackSelector = trackSelector;
            this.positionDiscontinuity = z;
            this.positionDiscontinuityReason = i;
            this.timelineChangeReason = i2;
            this.seekProcessed = z2;
            this.playWhenReady = z3;
            this.playbackStateOrPlayWhenReadyChanged = z4 || playbackInfo2.playbackState != playbackInfo.playbackState;
            this.timelineOrManifestChanged = (playbackInfo2.timeline == playbackInfo.timeline && playbackInfo2.manifest == playbackInfo.manifest) ? false : true;
            this.isLoadingChanged = playbackInfo2.isLoading != playbackInfo.isLoading;
            this.trackSelectorResultChanged = playbackInfo2.trackSelectorResult != playbackInfo.trackSelectorResult;
        }

        public void notifyListeners() {
            if (this.timelineOrManifestChanged || this.timelineChangeReason == 0) {
                for (Player.EventListener eventListener : this.listeners) {
                    eventListener.onTimelineChanged(this.playbackInfo.timeline, this.playbackInfo.manifest, this.timelineChangeReason);
                }
            }
            if (this.positionDiscontinuity) {
                for (Player.EventListener eventListener2 : this.listeners) {
                    eventListener2.onPositionDiscontinuity(this.positionDiscontinuityReason);
                }
            }
            if (this.trackSelectorResultChanged) {
                this.trackSelector.onSelectionActivated(this.playbackInfo.trackSelectorResult.info);
                for (Player.EventListener eventListener3 : this.listeners) {
                    eventListener3.onTracksChanged(this.playbackInfo.trackGroups, this.playbackInfo.trackSelectorResult.selections);
                }
            }
            if (this.isLoadingChanged) {
                for (Player.EventListener eventListener4 : this.listeners) {
                    eventListener4.onLoadingChanged(this.playbackInfo.isLoading);
                }
            }
            if (this.playbackStateOrPlayWhenReadyChanged) {
                for (Player.EventListener eventListener5 : this.listeners) {
                    eventListener5.onPlayerStateChanged(this.playWhenReady, this.playbackInfo.playbackState);
                }
            }
            if (this.seekProcessed) {
                for (Player.EventListener eventListener6 : this.listeners) {
                    eventListener6.onSeekProcessed();
                }
            }
        }
    }
}
