package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.DefaultMediaClock;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSource.SourceInfoRefreshListener, DefaultMediaClock.PlaybackParameterListener, PlayerMessage.Sender {
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final int MSG_DO_SOME_WORK = 2;
    public static final int MSG_ERROR = 2;
    private static final int MSG_PERIOD_PREPARED = 9;
    public static final int MSG_PLAYBACK_INFO_CHANGED = 0;
    public static final int MSG_PLAYBACK_PARAMETERS_CHANGED = 1;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_REFRESH_SOURCE_INFO = 8;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 12;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 13;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 10;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 11;
    private static final int PREPARING_SOURCE_INTERVAL_MS = 10;
    private static final int RENDERING_INTERVAL_MS = 10;
    private static final String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final Clock clock;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private Renderer[] enabledRenderers;
    private final Handler eventHandler;
    private final HandlerWrapper handler;
    private final HandlerThread internalPlaybackThread;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private MediaSource mediaSource;
    private int nextPendingMessageIndex;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private int pendingPrepareCount;
    private final Timeline.Period period;
    private boolean playWhenReady;
    private PlaybackInfo playbackInfo;
    private final ExoPlayer player;
    private boolean rebuffering;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final Renderer[] renderers;
    private int repeatMode;
    private final boolean retainBackBufferFromKeyframe;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;
    private final MediaPeriodQueue queue = new MediaPeriodQueue();
    private SeekParameters seekParameters = SeekParameters.DEFAULT;
    private final PlaybackInfoUpdate playbackInfoUpdate = new PlaybackInfoUpdate();

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, boolean z, int i, boolean z2, Handler handler, ExoPlayer exoPlayer, Clock clock) {
        this.renderers = rendererArr;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.playWhenReady = z;
        this.repeatMode = i;
        this.shuffleModeEnabled = z2;
        this.eventHandler = handler;
        this.player = exoPlayer;
        this.clock = clock;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs();
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe();
        this.playbackInfo = new PlaybackInfo(Timeline.EMPTY, C.TIME_UNSET, TrackGroupArray.EMPTY, trackSelectorResult);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].setIndex(i2);
            this.rendererCapabilities[i2] = rendererArr[i2].getCapabilities();
        }
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.enabledRenderers = new Renderer[0];
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.internalPlaybackThread = handlerThread;
        handlerThread.start();
        this.handler = clock.createHandler(this.internalPlaybackThread.getLooper(), this);
    }

    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        this.handler.obtainMessage(0, z ? 1 : 0, z2 ? 1 : 0, mediaSource).sendToTarget();
    }

    public void setPlayWhenReady(boolean z) {
        this.handler.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public void setRepeatMode(int i) {
        this.handler.obtainMessage(12, i, 0).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z) {
        this.handler.obtainMessage(13, z ? 1 : 0, 0).sendToTarget();
    }

    public void seekTo(Timeline timeline, int i, long j) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i, j)).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void stop(boolean z) {
        this.handler.obtainMessage(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (this.released) {
            Log.w(TAG, "Ignoring messages sent after release.");
            playerMessage.markAsProcessed(false);
            return;
        }
        this.handler.obtainMessage(14, playerMessage).sendToTarget();
    }

    public synchronized void release() {
        if (this.released) {
            return;
        }
        this.handler.sendEmptyMessage(7);
        boolean z = false;
        while (!this.released) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public Looper getPlaybackLooper() {
        return this.internalPlaybackThread.getLooper();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.SourceInfoRefreshListener
    public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline, Object obj) {
        this.handler.obtainMessage(8, new MediaSourceRefreshInfo(mediaSource, timeline, obj)).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(10, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(11);
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParameterListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.eventHandler.obtainMessage(1, playbackParameters).sendToTarget();
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    prepareInternal((MediaSource) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    setPlayWhenReadyInternal(message.arg1 != 0);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(message.arg1 != 0, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handleSourceInfoRefreshed((MediaSourceRefreshInfo) message.obj);
                    break;
                case 9:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 10:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 11:
                    reselectTracksInternal();
                    break;
                case 12:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 13:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                default:
                    return false;
            }
            maybeNotifyPlaybackInfoChanged();
        } catch (ExoPlaybackException e) {
            Log.e(TAG, "Playback error.", e);
            stopInternal(false, false);
            this.eventHandler.obtainMessage(2, e).sendToTarget();
            maybeNotifyPlaybackInfoChanged();
        } catch (IOException e2) {
            Log.e(TAG, "Source error.", e2);
            stopInternal(false, false);
            this.eventHandler.obtainMessage(2, ExoPlaybackException.createForSource(e2)).sendToTarget();
            maybeNotifyPlaybackInfoChanged();
        } catch (RuntimeException e3) {
            Log.e(TAG, "Internal runtime error.", e3);
            stopInternal(false, false);
            this.eventHandler.obtainMessage(2, ExoPlaybackException.createForUnexpected(e3)).sendToTarget();
            maybeNotifyPlaybackInfoChanged();
        }
        return true;
    }

    private void setState(int i) {
        if (this.playbackInfo.playbackState != i) {
            this.playbackInfo = this.playbackInfo.copyWithPlaybackState(i);
        }
    }

    private void setIsLoading(boolean z) {
        if (this.playbackInfo.isLoading != z) {
            this.playbackInfo = this.playbackInfo.copyWithIsLoading(z);
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        if (this.playbackInfoUpdate.hasPendingUpdate(this.playbackInfo)) {
            this.eventHandler.obtainMessage(0, this.playbackInfoUpdate.operationAcks, this.playbackInfoUpdate.positionDiscontinuity ? this.playbackInfoUpdate.discontinuityReason : -1, this.playbackInfo).sendToTarget();
            this.playbackInfoUpdate.reset(this.playbackInfo);
        }
    }

    private void prepareInternal(MediaSource mediaSource, boolean z, boolean z2) {
        this.pendingPrepareCount++;
        resetInternal(true, z, z2);
        this.loadControl.onPrepared();
        this.mediaSource = mediaSource;
        setState(2);
        mediaSource.prepareSource(this.player, true, this);
        this.handler.sendEmptyMessage(2);
    }

    private void setPlayWhenReadyInternal(boolean z) throws ExoPlaybackException {
        this.rebuffering = false;
        this.playWhenReady = z;
        if (!z) {
            stopRenderers();
            updatePlaybackPositions();
        } else if (this.playbackInfo.playbackState == 3) {
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (this.playbackInfo.playbackState == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setRepeatModeInternal(int i) throws ExoPlaybackException {
        this.repeatMode = i;
        if (this.queue.updateRepeatMode(i)) {
            return;
        }
        seekToCurrentPosition(true);
    }

    private void setShuffleModeEnabledInternal(boolean z) throws ExoPlaybackException {
        this.shuffleModeEnabled = z;
        if (this.queue.updateShuffleModeEnabled(z)) {
            return;
        }
        seekToCurrentPosition(true);
    }

    private void seekToCurrentPosition(boolean z) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = playbackInfo.fromNewPosition(mediaPeriodId, seekToPeriodPosition, playbackInfo.contentPositionUs);
            if (z) {
                this.playbackInfoUpdate.setPositionDiscontinuity(4);
            }
        }
    }

    private void startRenderers() throws ExoPlaybackException {
        this.rebuffering = false;
        this.mediaClock.start();
        for (Renderer renderer : this.enabledRenderers) {
            renderer.start();
        }
    }

    private void stopRenderers() throws ExoPlaybackException {
        this.mediaClock.stop();
        for (Renderer renderer : this.enabledRenderers) {
            ensureStopped(renderer);
        }
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
        if (this.queue.hasPlayingPeriod()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            long readDiscontinuity = playingPeriod.mediaPeriod.readDiscontinuity();
            if (readDiscontinuity != C.TIME_UNSET) {
                resetRendererPosition(readDiscontinuity);
                if (readDiscontinuity != this.playbackInfo.positionUs) {
                    PlaybackInfo playbackInfo = this.playbackInfo;
                    this.playbackInfo = playbackInfo.fromNewPosition(playbackInfo.periodId, readDiscontinuity, this.playbackInfo.contentPositionUs);
                    this.playbackInfoUpdate.setPositionDiscontinuity(4);
                }
            } else {
                long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs();
                this.rendererPositionUs = syncAndGetPositionUs;
                long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
                maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
                this.playbackInfo.positionUs = periodTime;
            }
            this.playbackInfo.bufferedPositionUs = this.enabledRenderers.length == 0 ? playingPeriod.info.durationUs : playingPeriod.getBufferedPositionUs(true);
        }
    }

    private void doSomeWork() throws ExoPlaybackException, IOException {
        Renderer[] rendererArr;
        long uptimeMillis = this.clock.uptimeMillis();
        updatePeriods();
        if (!this.queue.hasPlayingPeriod()) {
            maybeThrowPeriodPrepareError();
            scheduleNextWork(uptimeMillis, 10L);
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
        boolean z = true;
        boolean z2 = true;
        for (Renderer renderer : this.enabledRenderers) {
            renderer.render(this.rendererPositionUs, elapsedRealtime);
            z2 = z2 && renderer.isEnded();
            boolean z3 = renderer.isReady() || renderer.isEnded() || rendererWaitingForNextStream(renderer);
            if (!z3) {
                renderer.maybeThrowStreamError();
            }
            z = z && z3;
        }
        if (!z) {
            maybeThrowPeriodPrepareError();
        }
        long j = playingPeriod.info.durationUs;
        if (z2 && ((j == C.TIME_UNSET || j <= this.playbackInfo.positionUs) && playingPeriod.info.isFinal)) {
            setState(4);
            stopRenderers();
        } else if (this.playbackInfo.playbackState == 2 && shouldTransitionToReadyState(z)) {
            setState(3);
            if (this.playWhenReady) {
                startRenderers();
            }
        } else if (this.playbackInfo.playbackState == 3 && (this.enabledRenderers.length != 0 ? !z : !isTimelineReady())) {
            this.rebuffering = this.playWhenReady;
            setState(2);
            stopRenderers();
        }
        if (this.playbackInfo.playbackState == 2) {
            for (Renderer renderer2 : this.enabledRenderers) {
                renderer2.maybeThrowStreamError();
            }
        }
        if ((this.playWhenReady && this.playbackInfo.playbackState == 3) || this.playbackInfo.playbackState == 2) {
            scheduleNextWork(uptimeMillis, 10L);
        } else if (this.enabledRenderers.length != 0 && this.playbackInfo.playbackState != 4) {
            scheduleNextWork(uptimeMillis, 1000L);
        } else {
            this.handler.removeMessages(2);
        }
        TraceUtil.endSection();
    }

    private void scheduleNextWork(long j, long j2) {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessageAtTime(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:15:0x005d, B:17:0x0061, B:22:0x006a, B:23:0x0072, B:25:0x007c, B:29:0x0088, B:31:0x0092, B:33:0x00a2, B:39:0x00b9, B:43:0x00c3, B:44:0x00c7), top: B:57:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:15:0x005d, B:17:0x0061, B:22:0x006a, B:23:0x0072, B:25:0x007c, B:29:0x0088, B:31:0x0092, B:33:0x00a2, B:39:0x00b9, B:43:0x00c3, B:44:0x00c7), top: B:57:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void seekToInternal(SeekPosition seekPosition) throws ExoPlaybackException {
        long longValue;
        boolean z;
        MediaSource.MediaPeriodId mediaPeriodId;
        long j;
        long j2;
        long j3;
        boolean z2 = true;
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        Pair<Integer, Long> resolveSeekPosition = resolveSeekPosition(seekPosition, true);
        try {
            if (resolveSeekPosition == null) {
                mediaPeriodId = new MediaSource.MediaPeriodId(getFirstPeriodIndex());
                longValue = -9223372036854775807L;
                j = -9223372036854775807L;
            } else {
                int intValue = ((Integer) resolveSeekPosition.first).intValue();
                long longValue2 = ((Long) resolveSeekPosition.second).longValue();
                MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = this.queue.resolveMediaPeriodIdForAds(intValue, longValue2);
                if (resolveMediaPeriodIdForAds.isAd()) {
                    longValue = 0;
                    mediaPeriodId = resolveMediaPeriodIdForAds;
                    j = longValue2;
                } else {
                    longValue = ((Long) resolveSeekPosition.second).longValue();
                    z = seekPosition.windowPositionUs == C.TIME_UNSET;
                    mediaPeriodId = resolveMediaPeriodIdForAds;
                    j = longValue2;
                    if (this.mediaSource != null && this.pendingPrepareCount <= 0) {
                        if (longValue != C.TIME_UNSET) {
                            setState(4);
                            resetInternal(false, true, false);
                            j2 = longValue;
                            this.playbackInfo = this.playbackInfo.fromNewPosition(mediaPeriodId, j2, j);
                            if (z) {
                                return;
                            }
                            this.playbackInfoUpdate.setPositionDiscontinuity(2);
                            return;
                        }
                        if (mediaPeriodId.equals(this.playbackInfo.periodId)) {
                            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                            j3 = (playingPeriod == null || longValue == 0) ? longValue : playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(longValue, this.seekParameters);
                            if (C.usToMs(j3) == C.usToMs(this.playbackInfo.positionUs)) {
                                this.playbackInfo = this.playbackInfo.fromNewPosition(mediaPeriodId, this.playbackInfo.positionUs, j);
                                if (z) {
                                    this.playbackInfoUpdate.setPositionDiscontinuity(2);
                                    return;
                                }
                                return;
                            }
                        } else {
                            j3 = longValue;
                        }
                        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, j3);
                        if (longValue == seekToPeriodPosition) {
                            z2 = false;
                        }
                        z |= z2;
                        j2 = seekToPeriodPosition;
                        this.playbackInfo = this.playbackInfo.fromNewPosition(mediaPeriodId, j2, j);
                        if (z) {
                        }
                    }
                    this.pendingInitialSeekPosition = seekPosition;
                    j2 = longValue;
                    this.playbackInfo = this.playbackInfo.fromNewPosition(mediaPeriodId, j2, j);
                    if (z) {
                    }
                }
            }
            if (this.mediaSource != null) {
                if (longValue != C.TIME_UNSET) {
                }
            }
            this.pendingInitialSeekPosition = seekPosition;
            j2 = longValue;
            this.playbackInfo = this.playbackInfo.fromNewPosition(mediaPeriodId, j2, j);
            if (z) {
            }
        } catch (Throwable th) {
            this.playbackInfo = this.playbackInfo.fromNewPosition(mediaPeriodId, longValue, j);
            if (z) {
                this.playbackInfoUpdate.setPositionDiscontinuity(2);
            }
            throw th;
        }
        z = true;
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j) throws ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod());
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) throws ExoPlaybackException {
        stopRenderers();
        this.rebuffering = false;
        setState(2);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (true) {
            if (mediaPeriodHolder == null) {
                break;
            } else if (shouldKeepPeriodHolder(mediaPeriodId, j, mediaPeriodHolder)) {
                this.queue.removeAfter(mediaPeriodHolder);
                break;
            } else {
                mediaPeriodHolder = this.queue.advancePlayingPeriod();
            }
        }
        if (playingPeriod != mediaPeriodHolder || z) {
            for (Renderer renderer : this.enabledRenderers) {
                disableRenderer(renderer);
            }
            this.enabledRenderers = new Renderer[0];
            playingPeriod = null;
        }
        if (mediaPeriodHolder != null) {
            updatePlayingPeriodRenderers(playingPeriod);
            if (mediaPeriodHolder.hasEnabledTracks) {
                long seekToUs = mediaPeriodHolder.mediaPeriod.seekToUs(j);
                mediaPeriodHolder.mediaPeriod.discardBuffer(seekToUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
                j = seekToUs;
            }
            resetRendererPosition(j);
            maybeContinueLoading();
        } else {
            this.queue.clear(true);
            resetRendererPosition(j);
        }
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private boolean shouldKeepPeriodHolder(MediaSource.MediaPeriodId mediaPeriodId, long j, MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodId.equals(mediaPeriodHolder.info.id) && mediaPeriodHolder.prepared) {
            this.playbackInfo.timeline.getPeriod(mediaPeriodHolder.info.id.periodIndex, this.period);
            int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j);
            return adGroupIndexAfterPositionUs == -1 || this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs) == mediaPeriodHolder.info.endPositionUs;
        }
        return false;
    }

    private void resetRendererPosition(long j) throws ExoPlaybackException {
        if (this.queue.hasPlayingPeriod()) {
            j = this.queue.getPlayingPeriod().toRendererTime(j);
        }
        this.rendererPositionUs = j;
        this.mediaClock.resetPosition(j);
        for (Renderer renderer : this.enabledRenderers) {
            renderer.resetPosition(this.rendererPositionUs);
        }
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) {
        this.mediaClock.setPlaybackParameters(playbackParameters);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void stopInternal(boolean z, boolean z2) {
        resetInternal(true, z, z);
        this.playbackInfoUpdate.incrementPendingOperationAcks(this.pendingPrepareCount + (z2 ? 1 : 0));
        this.pendingPrepareCount = 0;
        this.loadControl.onStopped();
        setState(1);
    }

    private void releaseInternal() {
        resetInternal(true, true, true);
        this.loadControl.onReleased();
        setState(1);
        this.internalPlaybackThread.quit();
        synchronized (this) {
            this.released = true;
            notifyAll();
        }
    }

    private int getFirstPeriodIndex() {
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty()) {
            return 0;
        }
        return timeline.getWindow(timeline.getFirstWindowIndex(this.shuffleModeEnabled), this.window).firstPeriodIndex;
    }

    private void resetInternal(boolean z, boolean z2, boolean z3) {
        MediaSource mediaSource;
        this.handler.removeMessages(2);
        this.rebuffering = false;
        this.mediaClock.stop();
        this.rendererPositionUs = 0L;
        for (Renderer renderer : this.enabledRenderers) {
            try {
                disableRenderer(renderer);
            } catch (ExoPlaybackException | RuntimeException e) {
                Log.e(TAG, "Stop failed.", e);
            }
        }
        this.enabledRenderers = new Renderer[0];
        this.queue.clear(!z2);
        setIsLoading(false);
        if (z2) {
            this.pendingInitialSeekPosition = null;
        }
        if (z3) {
            this.queue.setTimeline(Timeline.EMPTY);
            Iterator<PendingMessageInfo> it = this.pendingMessages.iterator();
            while (it.hasNext()) {
                it.next().message.markAsProcessed(false);
            }
            this.pendingMessages.clear();
            this.nextPendingMessageIndex = 0;
        }
        Timeline timeline = z3 ? Timeline.EMPTY : this.playbackInfo.timeline;
        Object obj = z3 ? null : this.playbackInfo.manifest;
        MediaSource.MediaPeriodId mediaPeriodId = z2 ? new MediaSource.MediaPeriodId(getFirstPeriodIndex()) : this.playbackInfo.periodId;
        long j = C.TIME_UNSET;
        long j2 = z2 ? -9223372036854775807L : this.playbackInfo.positionUs;
        if (!z2) {
            j = this.playbackInfo.contentPositionUs;
        }
        this.playbackInfo = new PlaybackInfo(timeline, obj, mediaPeriodId, j2, j, this.playbackInfo.playbackState, false, z3 ? TrackGroupArray.EMPTY : this.playbackInfo.trackGroups, z3 ? this.emptyTrackSelectorResult : this.playbackInfo.trackSelectorResult);
        if (!z || (mediaSource = this.mediaSource) == null) {
            return;
        }
        mediaSource.releaseSource(this);
        this.mediaSource = null;
    }

    private void sendMessageInternal(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getPositionMs() == C.TIME_UNSET) {
            sendMessageToTarget(playerMessage);
        } else if (this.mediaSource == null || this.pendingPrepareCount > 0) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
        } else {
            PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
            if (resolvePendingMessagePosition(pendingMessageInfo)) {
                this.pendingMessages.add(pendingMessageInfo);
                Collections.sort(this.pendingMessages);
                return;
            }
            playerMessage.markAsProcessed(false);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getHandler().getLooper() == this.handler.getLooper()) {
            deliverMessage(playerMessage);
            if (this.playbackInfo.playbackState == 3 || this.playbackInfo.playbackState == 2) {
                this.handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.handler.obtainMessage(15, playerMessage).sendToTarget();
    }

    private void sendMessageToTargetThread(final PlayerMessage playerMessage) {
        playerMessage.getHandler().post(new Runnable() { // from class: com.google.android.exoplayer2.ExoPlayerImplInternal.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ExoPlayerImplInternal.this.deliverMessage(playerMessage);
                } catch (ExoPlaybackException e) {
                    Log.e(ExoPlayerImplInternal.TAG, "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverMessage(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void resolvePendingMessagePositions() {
        for (int size = this.pendingMessages.size() - 1; size >= 0; size--) {
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size))) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
        }
        Collections.sort(this.pendingMessages);
    }

    private boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo) {
        if (pendingMessageInfo.resolvedPeriodUid == null) {
            Pair<Integer, Long> resolveSeekPosition = resolveSeekPosition(new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getWindowIndex(), C.msToUs(pendingMessageInfo.message.getPositionMs())), false);
            if (resolveSeekPosition == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(((Integer) resolveSeekPosition.first).intValue(), ((Long) resolveSeekPosition.second).longValue(), this.playbackInfo.timeline.getPeriod(((Integer) resolveSeekPosition.first).intValue(), this.period, true).uid);
        } else {
            int indexOfPeriod = this.playbackInfo.timeline.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid);
            if (indexOfPeriod == -1) {
                return false;
            }
            pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[LOOP:0: B:14:0x0036->B:23:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[LOOP:1: B:28:0x006f->B:39:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0035 -> B:14:0x0036). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006e -> B:28:0x006f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeTriggerPendingMessages(long j, long j2) throws ExoPlaybackException {
        PendingMessageInfo pendingMessageInfo;
        PendingMessageInfo pendingMessageInfo2;
        int i;
        int i2;
        if (this.pendingMessages.isEmpty() || this.playbackInfo.periodId.isAd()) {
            return;
        }
        if (this.playbackInfo.startPositionUs == j) {
            j--;
        }
        int i3 = this.playbackInfo.periodId.periodIndex;
        int i4 = this.nextPendingMessageIndex;
        if (i4 > 0) {
            pendingMessageInfo = this.pendingMessages.get(i4 - 1);
            while (pendingMessageInfo != null && (pendingMessageInfo.resolvedPeriodIndex > i3 || (pendingMessageInfo.resolvedPeriodIndex == i3 && pendingMessageInfo.resolvedPeriodTimeUs > j))) {
                i2 = this.nextPendingMessageIndex - 1;
                this.nextPendingMessageIndex = i2;
                if (i2 <= 0) {
                    pendingMessageInfo = this.pendingMessages.get(i2 - 1);
                }
            }
            if (this.nextPendingMessageIndex < this.pendingMessages.size()) {
                pendingMessageInfo2 = this.pendingMessages.get(this.nextPendingMessageIndex);
                while (pendingMessageInfo2 != null && pendingMessageInfo2.resolvedPeriodUid != null && (pendingMessageInfo2.resolvedPeriodIndex < i3 || (pendingMessageInfo2.resolvedPeriodIndex == i3 && pendingMessageInfo2.resolvedPeriodTimeUs <= j))) {
                    i = this.nextPendingMessageIndex + 1;
                    this.nextPendingMessageIndex = i;
                    if (i >= this.pendingMessages.size()) {
                        pendingMessageInfo2 = this.pendingMessages.get(this.nextPendingMessageIndex);
                    }
                }
                while (pendingMessageInfo2 != null && pendingMessageInfo2.resolvedPeriodUid != null && pendingMessageInfo2.resolvedPeriodIndex == i3 && pendingMessageInfo2.resolvedPeriodTimeUs > j && pendingMessageInfo2.resolvedPeriodTimeUs <= j2) {
                    sendMessageToTarget(pendingMessageInfo2.message);
                    if (!pendingMessageInfo2.message.getDeleteAfterDelivery() || pendingMessageInfo2.message.isCanceled()) {
                        this.pendingMessages.remove(this.nextPendingMessageIndex);
                    } else {
                        this.nextPendingMessageIndex++;
                    }
                    pendingMessageInfo2 = this.nextPendingMessageIndex >= this.pendingMessages.size() ? this.pendingMessages.get(this.nextPendingMessageIndex) : null;
                }
                return;
            }
            pendingMessageInfo2 = null;
            while (pendingMessageInfo2 != null) {
                i = this.nextPendingMessageIndex + 1;
                this.nextPendingMessageIndex = i;
                if (i >= this.pendingMessages.size()) {
                }
            }
            while (pendingMessageInfo2 != null) {
                sendMessageToTarget(pendingMessageInfo2.message);
                if (!pendingMessageInfo2.message.getDeleteAfterDelivery()) {
                }
                this.pendingMessages.remove(this.nextPendingMessageIndex);
                if (this.nextPendingMessageIndex >= this.pendingMessages.size()) {
                }
            }
        }
        pendingMessageInfo = null;
        while (pendingMessageInfo != null) {
            i2 = this.nextPendingMessageIndex - 1;
            this.nextPendingMessageIndex = i2;
            if (i2 <= 0) {
            }
        }
        if (this.nextPendingMessageIndex < this.pendingMessages.size()) {
        }
        pendingMessageInfo2 = null;
        while (pendingMessageInfo2 != null) {
        }
        while (pendingMessageInfo2 != null) {
        }
    }

    private void ensureStopped(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private void disableRenderer(Renderer renderer) throws ExoPlaybackException {
        this.mediaClock.onRendererDisabled(renderer);
        ensureStopped(renderer);
        renderer.disable();
    }

    private void reselectTracksInternal() throws ExoPlaybackException {
        if (this.queue.hasPlayingPeriod()) {
            float f = this.mediaClock.getPlaybackParameters().speed;
            MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
            boolean z = true;
            for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.next) {
                if (!playingPeriod.selectTracks(f)) {
                    if (playingPeriod == readingPeriod) {
                        z = false;
                    }
                } else {
                    if (z) {
                        MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                        boolean removeAfter = this.queue.removeAfter(playingPeriod2);
                        boolean[] zArr = new boolean[this.renderers.length];
                        long applyTrackSelection = playingPeriod2.applyTrackSelection(this.playbackInfo.positionUs, removeAfter, zArr);
                        updateLoadControlTrackSelection(playingPeriod2.trackGroups, playingPeriod2.trackSelectorResult);
                        if (this.playbackInfo.playbackState != 4 && applyTrackSelection != this.playbackInfo.positionUs) {
                            PlaybackInfo playbackInfo = this.playbackInfo;
                            this.playbackInfo = playbackInfo.fromNewPosition(playbackInfo.periodId, applyTrackSelection, this.playbackInfo.contentPositionUs);
                            this.playbackInfoUpdate.setPositionDiscontinuity(4);
                            resetRendererPosition(applyTrackSelection);
                        }
                        boolean[] zArr2 = new boolean[this.renderers.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            Renderer[] rendererArr = this.renderers;
                            if (i >= rendererArr.length) {
                                break;
                            }
                            Renderer renderer = rendererArr[i];
                            zArr2[i] = renderer.getState() != 0;
                            SampleStream sampleStream = playingPeriod2.sampleStreams[i];
                            if (sampleStream != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (sampleStream != renderer.getStream()) {
                                    disableRenderer(renderer);
                                } else if (zArr[i]) {
                                    renderer.resetPosition(this.rendererPositionUs);
                                }
                            }
                            i++;
                        }
                        this.playbackInfo = this.playbackInfo.copyWithTrackInfo(playingPeriod2.trackGroups, playingPeriod2.trackSelectorResult);
                        enableRenderers(zArr2, i2);
                    } else {
                        this.queue.removeAfter(playingPeriod);
                        if (playingPeriod.prepared) {
                            playingPeriod.applyTrackSelection(Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                            updateLoadControlTrackSelection(playingPeriod.trackGroups, playingPeriod.trackSelectorResult);
                        }
                    }
                    if (this.playbackInfo.playbackState != 4) {
                        maybeContinueLoading();
                        updatePlaybackPositions();
                        this.handler.sendEmptyMessage(2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private void updateLoadControlTrackSelection(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.loadControl.onTracksSelected(this.renderers, trackGroupArray, trackSelectorResult.selections);
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
        TrackSelection[] all;
        for (MediaPeriodHolder frontPeriod = this.queue.getFrontPeriod(); frontPeriod != null; frontPeriod = frontPeriod.next) {
            if (frontPeriod.trackSelectorResult != null) {
                for (TrackSelection trackSelection : frontPeriod.trackSelectorResult.selections.getAll()) {
                    if (trackSelection != null) {
                        trackSelection.onPlaybackSpeed(f);
                    }
                }
            }
        }
    }

    private boolean shouldTransitionToReadyState(boolean z) {
        if (this.enabledRenderers.length == 0) {
            return isTimelineReady();
        }
        if (z) {
            if (this.playbackInfo.isLoading) {
                MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
                long bufferedPositionUs = loadingPeriod.getBufferedPositionUs(!loadingPeriod.info.isFinal);
                return bufferedPositionUs == Long.MIN_VALUE || this.loadControl.shouldStartPlayback(bufferedPositionUs - loadingPeriod.toPeriodTime(this.rendererPositionUs), this.mediaClock.getPlaybackParameters().speed, this.rebuffering);
            }
            return true;
        }
        return false;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.info.durationUs;
        return j == C.TIME_UNSET || this.playbackInfo.positionUs < j || (playingPeriod.next != null && (playingPeriod.next.prepared || playingPeriod.next.info.id.isAd()));
    }

    private void maybeThrowPeriodPrepareError() throws IOException {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (loadingPeriod == null || loadingPeriod.prepared) {
            return;
        }
        if (readingPeriod == null || readingPeriod.next == loadingPeriod) {
            for (Renderer renderer : this.enabledRenderers) {
                if (!renderer.hasReadStreamToEnd()) {
                    return;
                }
            }
            loadingPeriod.mediaPeriod.maybeThrowPrepareError();
        }
    }

    private void handleSourceInfoRefreshed(MediaSourceRefreshInfo mediaSourceRefreshInfo) throws ExoPlaybackException {
        if (mediaSourceRefreshInfo.source != this.mediaSource) {
            return;
        }
        Timeline timeline = this.playbackInfo.timeline;
        Timeline timeline2 = mediaSourceRefreshInfo.timeline;
        Object obj = mediaSourceRefreshInfo.manifest;
        this.queue.setTimeline(timeline2);
        this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline2, obj);
        resolvePendingMessagePositions();
        int i = this.pendingPrepareCount;
        if (i > 0) {
            this.playbackInfoUpdate.incrementPendingOperationAcks(i);
            this.pendingPrepareCount = 0;
            SeekPosition seekPosition = this.pendingInitialSeekPosition;
            if (seekPosition != null) {
                Pair<Integer, Long> resolveSeekPosition = resolveSeekPosition(seekPosition, true);
                this.pendingInitialSeekPosition = null;
                if (resolveSeekPosition == null) {
                    handleSourceInfoRefreshEndedPlayback();
                    return;
                }
                int intValue = ((Integer) resolveSeekPosition.first).intValue();
                long longValue = ((Long) resolveSeekPosition.second).longValue();
                MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = this.queue.resolveMediaPeriodIdForAds(intValue, longValue);
                this.playbackInfo = this.playbackInfo.fromNewPosition(resolveMediaPeriodIdForAds, resolveMediaPeriodIdForAds.isAd() ? 0L : longValue, longValue);
                return;
            } else if (this.playbackInfo.startPositionUs == C.TIME_UNSET) {
                if (timeline2.isEmpty()) {
                    handleSourceInfoRefreshEndedPlayback();
                    return;
                }
                Pair<Integer, Long> periodPosition = getPeriodPosition(timeline2, timeline2.getFirstWindowIndex(this.shuffleModeEnabled), C.TIME_UNSET);
                int intValue2 = ((Integer) periodPosition.first).intValue();
                long longValue2 = ((Long) periodPosition.second).longValue();
                MediaSource.MediaPeriodId resolveMediaPeriodIdForAds2 = this.queue.resolveMediaPeriodIdForAds(intValue2, longValue2);
                this.playbackInfo = this.playbackInfo.fromNewPosition(resolveMediaPeriodIdForAds2, resolveMediaPeriodIdForAds2.isAd() ? 0L : longValue2, longValue2);
                return;
            } else {
                return;
            }
        }
        int i2 = this.playbackInfo.periodId.periodIndex;
        long j = this.playbackInfo.contentPositionUs;
        if (timeline.isEmpty()) {
            if (timeline2.isEmpty()) {
                return;
            }
            MediaSource.MediaPeriodId resolveMediaPeriodIdForAds3 = this.queue.resolveMediaPeriodIdForAds(i2, j);
            this.playbackInfo = this.playbackInfo.fromNewPosition(resolveMediaPeriodIdForAds3, resolveMediaPeriodIdForAds3.isAd() ? 0L : j, j);
            return;
        }
        MediaPeriodHolder frontPeriod = this.queue.getFrontPeriod();
        int indexOfPeriod = timeline2.getIndexOfPeriod(frontPeriod == null ? timeline.getPeriod(i2, this.period, true).uid : frontPeriod.uid);
        if (indexOfPeriod == -1) {
            int resolveSubsequentPeriod = resolveSubsequentPeriod(i2, timeline, timeline2);
            if (resolveSubsequentPeriod == -1) {
                handleSourceInfoRefreshEndedPlayback();
                return;
            }
            Pair<Integer, Long> periodPosition2 = getPeriodPosition(timeline2, timeline2.getPeriod(resolveSubsequentPeriod, this.period).windowIndex, C.TIME_UNSET);
            int intValue3 = ((Integer) periodPosition2.first).intValue();
            long longValue3 = ((Long) periodPosition2.second).longValue();
            MediaSource.MediaPeriodId resolveMediaPeriodIdForAds4 = this.queue.resolveMediaPeriodIdForAds(intValue3, longValue3);
            timeline2.getPeriod(intValue3, this.period, true);
            if (frontPeriod != null) {
                Object obj2 = this.period.uid;
                frontPeriod.info = frontPeriod.info.copyWithPeriodIndex(-1);
                while (frontPeriod.next != null) {
                    frontPeriod = frontPeriod.next;
                    if (frontPeriod.uid.equals(obj2)) {
                        frontPeriod.info = this.queue.getUpdatedMediaPeriodInfo(frontPeriod.info, intValue3);
                    } else {
                        frontPeriod.info = frontPeriod.info.copyWithPeriodIndex(-1);
                    }
                }
            }
            this.playbackInfo = this.playbackInfo.fromNewPosition(resolveMediaPeriodIdForAds4, seekToPeriodPosition(resolveMediaPeriodIdForAds4, resolveMediaPeriodIdForAds4.isAd() ? 0L : longValue3), longValue3);
            return;
        }
        if (indexOfPeriod != i2) {
            this.playbackInfo = this.playbackInfo.copyWithPeriodIndex(indexOfPeriod);
        }
        MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        if (mediaPeriodId.isAd()) {
            MediaSource.MediaPeriodId resolveMediaPeriodIdForAds5 = this.queue.resolveMediaPeriodIdForAds(indexOfPeriod, j);
            if (!resolveMediaPeriodIdForAds5.equals(mediaPeriodId)) {
                this.playbackInfo = this.playbackInfo.fromNewPosition(resolveMediaPeriodIdForAds5, seekToPeriodPosition(resolveMediaPeriodIdForAds5, resolveMediaPeriodIdForAds5.isAd() ? 0L : j), j);
                return;
            }
        }
        if (this.queue.updateQueuedPeriods(mediaPeriodId, this.rendererPositionUs)) {
            return;
        }
        seekToCurrentPosition(false);
    }

    private void handleSourceInfoRefreshEndedPlayback() {
        setState(4);
        resetInternal(false, true, false);
    }

    private int resolveSubsequentPeriod(int i, Timeline timeline, Timeline timeline2) {
        int periodCount = timeline.getPeriodCount();
        int i2 = i;
        int i3 = -1;
        for (int i4 = 0; i4 < periodCount && i3 == -1; i4++) {
            i2 = timeline.getNextPeriodIndex(i2, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            if (i2 == -1) {
                break;
            }
            i3 = timeline2.getIndexOfPeriod(timeline.getPeriod(i2, this.period, true).uid);
        }
        return i3;
    }

    private Pair<Integer, Long> resolveSeekPosition(SeekPosition seekPosition, boolean z) {
        int resolveSubsequentPeriod;
        Timeline timeline = this.playbackInfo.timeline;
        Timeline timeline2 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        if (timeline2.isEmpty()) {
            timeline2 = timeline;
        }
        try {
            Pair<Integer, Long> periodPosition = timeline2.getPeriodPosition(this.window, this.period, seekPosition.windowIndex, seekPosition.windowPositionUs);
            if (timeline == timeline2) {
                return periodPosition;
            }
            int indexOfPeriod = timeline.getIndexOfPeriod(timeline2.getPeriod(((Integer) periodPosition.first).intValue(), this.period, true).uid);
            if (indexOfPeriod != -1) {
                return Pair.create(Integer.valueOf(indexOfPeriod), periodPosition.second);
            }
            if (!z || (resolveSubsequentPeriod = resolveSubsequentPeriod(((Integer) periodPosition.first).intValue(), timeline2, timeline)) == -1) {
                return null;
            }
            return getPeriodPosition(timeline, timeline.getPeriod(resolveSubsequentPeriod, this.period).windowIndex, C.TIME_UNSET);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalSeekPositionException(timeline, seekPosition.windowIndex, seekPosition.windowPositionUs);
        }
    }

    private Pair<Integer, Long> getPeriodPosition(Timeline timeline, int i, long j) {
        return timeline.getPeriodPosition(this.window, this.period, i, j);
    }

    private void updatePeriods() throws ExoPlaybackException, IOException {
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource == null) {
            return;
        }
        if (this.pendingPrepareCount > 0) {
            mediaSource.maybeThrowSourceInfoRefreshError();
            return;
        }
        maybeUpdateLoadingPeriod();
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        int i = 0;
        if (loadingPeriod == null || loadingPeriod.isFullyBuffered()) {
            setIsLoading(false);
        } else if (!this.playbackInfo.isLoading) {
            maybeContinueLoading();
        }
        if (!this.queue.hasPlayingPeriod()) {
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z = false;
        while (this.playWhenReady && playingPeriod != readingPeriod && this.rendererPositionUs >= playingPeriod.next.rendererPositionOffsetUs) {
            if (z) {
                maybeNotifyPlaybackInfoChanged();
            }
            int i2 = playingPeriod.info.isLastInTimelinePeriod ? 0 : 3;
            MediaPeriodHolder advancePlayingPeriod = this.queue.advancePlayingPeriod();
            updatePlayingPeriodRenderers(playingPeriod);
            this.playbackInfo = this.playbackInfo.fromNewPosition(advancePlayingPeriod.info.id, advancePlayingPeriod.info.startPositionUs, advancePlayingPeriod.info.contentPositionUs);
            this.playbackInfoUpdate.setPositionDiscontinuity(i2);
            updatePlaybackPositions();
            playingPeriod = advancePlayingPeriod;
            z = true;
        }
        if (readingPeriod.info.isFinal) {
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i >= rendererArr.length) {
                    return;
                }
                Renderer renderer = rendererArr[i];
                SampleStream sampleStream = readingPeriod.sampleStreams[i];
                if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                    renderer.setCurrentStreamFinal();
                }
                i++;
            }
        } else if (readingPeriod.next == null || !readingPeriod.next.prepared) {
        } else {
            int i3 = 0;
            while (true) {
                Renderer[] rendererArr2 = this.renderers;
                if (i3 < rendererArr2.length) {
                    Renderer renderer2 = rendererArr2[i3];
                    SampleStream sampleStream2 = readingPeriod.sampleStreams[i3];
                    if (renderer2.getStream() != sampleStream2) {
                        return;
                    }
                    if (sampleStream2 != null && !renderer2.hasReadStreamToEnd()) {
                        return;
                    }
                    i3++;
                } else {
                    TrackSelectorResult trackSelectorResult = readingPeriod.trackSelectorResult;
                    MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                    TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.trackSelectorResult;
                    boolean z2 = advanceReadingPeriod.mediaPeriod.readDiscontinuity() != C.TIME_UNSET;
                    int i4 = 0;
                    while (true) {
                        Renderer[] rendererArr3 = this.renderers;
                        if (i4 >= rendererArr3.length) {
                            return;
                        }
                        Renderer renderer3 = rendererArr3[i4];
                        if (trackSelectorResult.isRendererEnabled(i4)) {
                            if (z2) {
                                renderer3.setCurrentStreamFinal();
                            } else if (!renderer3.isCurrentStreamFinal()) {
                                TrackSelection trackSelection = trackSelectorResult2.selections.get(i4);
                                boolean isRendererEnabled = trackSelectorResult2.isRendererEnabled(i4);
                                boolean z3 = this.rendererCapabilities[i4].getTrackType() == 5;
                                RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i4];
                                RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i4];
                                if (isRendererEnabled && rendererConfiguration2.equals(rendererConfiguration) && !z3) {
                                    renderer3.replaceStream(getFormats(trackSelection), advanceReadingPeriod.sampleStreams[i4], advanceReadingPeriod.getRendererOffset());
                                } else {
                                    renderer3.setCurrentStreamFinal();
                                }
                            }
                        }
                        i4++;
                    }
                }
            }
        }
    }

    private void maybeUpdateLoadingPeriod() throws IOException {
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        if (this.queue.shouldLoadNextMediaPeriod()) {
            MediaPeriodInfo nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo);
            if (nextMediaPeriodInfo == null) {
                this.mediaSource.maybeThrowSourceInfoRefreshError();
                return;
            }
            this.queue.enqueueNextMediaPeriod(this.rendererCapabilities, this.trackSelector, this.loadControl.getAllocator(), this.mediaSource, this.playbackInfo.timeline.getPeriod(nextMediaPeriodInfo.id.periodIndex, this.period, true).uid, nextMediaPeriodInfo).prepare(this, nextMediaPeriodInfo.startPositionUs);
            setIsLoading(true);
        }
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.queue.isLoading(mediaPeriod)) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.mediaClock.getPlaybackParameters().speed);
            updateLoadControlTrackSelection(loadingPeriod.trackGroups, loadingPeriod.trackSelectorResult);
            if (!this.queue.hasPlayingPeriod()) {
                resetRendererPosition(this.queue.advancePlayingPeriod().info.startPositionUs);
                updatePlayingPeriodRenderers(null);
            }
            maybeContinueLoading();
        }
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        }
    }

    private void maybeContinueLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long nextLoadPositionUs = loadingPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            setIsLoading(false);
            return;
        }
        boolean shouldContinueLoading = this.loadControl.shouldContinueLoading(nextLoadPositionUs - loadingPeriod.toPeriodTime(this.rendererPositionUs), this.mediaClock.getPlaybackParameters().speed);
        setIsLoading(shouldContinueLoading);
        if (shouldContinueLoading) {
            loadingPeriod.continueLoading(this.rendererPositionUs);
        }
    }

    private void updatePlayingPeriodRenderers(MediaPeriodHolder mediaPeriodHolder) throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null || mediaPeriodHolder == playingPeriod) {
            return;
        }
        boolean[] zArr = new boolean[this.renderers.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i < rendererArr.length) {
                Renderer renderer = rendererArr[i];
                zArr[i] = renderer.getState() != 0;
                if (playingPeriod.trackSelectorResult.isRendererEnabled(i)) {
                    i2++;
                }
                if (zArr[i] && (!playingPeriod.trackSelectorResult.isRendererEnabled(i) || (renderer.isCurrentStreamFinal() && renderer.getStream() == mediaPeriodHolder.sampleStreams[i]))) {
                    disableRenderer(renderer);
                }
                i++;
            } else {
                this.playbackInfo = this.playbackInfo.copyWithTrackInfo(playingPeriod.trackGroups, playingPeriod.trackSelectorResult);
                enableRenderers(zArr, i2);
                return;
            }
        }
    }

    private void enableRenderers(boolean[] zArr, int i) throws ExoPlaybackException {
        this.enabledRenderers = new Renderer[i];
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        int i2 = 0;
        for (int i3 = 0; i3 < this.renderers.length; i3++) {
            if (playingPeriod.trackSelectorResult.isRendererEnabled(i3)) {
                enableRenderer(i3, zArr[i3], i2);
                i2++;
            }
        }
    }

    private void enableRenderer(int i, boolean z, int i2) throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        Renderer renderer = this.renderers[i];
        this.enabledRenderers[i2] = renderer;
        if (renderer.getState() == 0) {
            RendererConfiguration rendererConfiguration = playingPeriod.trackSelectorResult.rendererConfigurations[i];
            Format[] formats = getFormats(playingPeriod.trackSelectorResult.selections.get(i));
            boolean z2 = this.playWhenReady && this.playbackInfo.playbackState == 3;
            renderer.enable(rendererConfiguration, formats, playingPeriod.sampleStreams[i], this.rendererPositionUs, !z && z2, playingPeriod.getRendererOffset());
            this.mediaClock.onRendererEnabled(renderer);
            if (z2) {
                renderer.start();
            }
        }
    }

    private boolean rendererWaitingForNextStream(Renderer renderer) {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        return readingPeriod.next != null && readingPeriod.next.prepared && renderer.hasReadStreamToEnd();
    }

    private static Format[] getFormats(TrackSelection trackSelection) {
        int length = trackSelection != null ? trackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = trackSelection.getFormat(i);
        }
        return formatArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i, long j) {
            this.timeline = timeline;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public void setResolvedPosition(int i, long j, Object obj) {
            this.resolvedPeriodIndex = i;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            if ((this.resolvedPeriodUid == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return this.resolvedPeriodUid != null ? -1 : 1;
            } else if (this.resolvedPeriodUid == null) {
                return 0;
            } else {
                int i = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
                return i != 0 ? i : Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class MediaSourceRefreshInfo {
        public final Object manifest;
        public final MediaSource source;
        public final Timeline timeline;

        public MediaSourceRefreshInfo(MediaSource mediaSource, Timeline timeline, Object obj) {
            this.source = mediaSource;
            this.timeline = timeline;
            this.manifest = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class PlaybackInfoUpdate {
        private int discontinuityReason;
        private PlaybackInfo lastPlaybackInfo;
        private int operationAcks;
        private boolean positionDiscontinuity;

        private PlaybackInfoUpdate() {
        }

        public boolean hasPendingUpdate(PlaybackInfo playbackInfo) {
            return playbackInfo != this.lastPlaybackInfo || this.operationAcks > 0 || this.positionDiscontinuity;
        }

        public void reset(PlaybackInfo playbackInfo) {
            this.lastPlaybackInfo = playbackInfo;
            this.operationAcks = 0;
            this.positionDiscontinuity = false;
        }

        public void incrementPendingOperationAcks(int i) {
            this.operationAcks += i;
        }

        public void setPositionDiscontinuity(int i) {
            if (this.positionDiscontinuity && this.discontinuityReason != 4) {
                Assertions.checkArgument(i == 4);
                return;
            }
            this.positionDiscontinuity = true;
            this.discontinuityReason = i;
        }
    }
}
