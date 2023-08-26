package com.google.android.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
/* loaded from: classes.dex */
public class AnalyticsCollector implements Player.EventListener, MetadataOutput, AudioRendererEventListener, VideoRendererEventListener, MediaSourceEventListener, BandwidthMeter.EventListener, DefaultDrmSessionEventListener {
    private final Clock clock;
    @MonotonicNonNull
    private Player player;
    private final CopyOnWriteArraySet<AnalyticsListener> listeners = new CopyOnWriteArraySet<>();
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker = new MediaPeriodQueueTracker();
    private final Timeline.Window window = new Timeline.Window();

    /* loaded from: classes.dex */
    public static class Factory {
        public AnalyticsCollector createAnalyticsCollector(Player player, Clock clock) {
            return new AnalyticsCollector(player, clock);
        }
    }

    protected AnalyticsCollector(Player player, Clock clock) {
        this.player = player;
        this.clock = (Clock) Assertions.checkNotNull(clock);
    }

    public void addListener(AnalyticsListener analyticsListener) {
        this.listeners.add(analyticsListener);
    }

    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public void setPlayer(Player player) {
        Assertions.checkState(this.player == null);
        this.player = (Player) Assertions.checkNotNull(player);
    }

    public final void notifySeekStarted() {
        if (this.mediaPeriodQueueTracker.isSeeking()) {
            return;
        }
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        this.mediaPeriodQueueTracker.onSeekStarted();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onSeekStarted(generatePlayingMediaPeriodEventTime);
        }
    }

    public final void notifyViewportSizeChanged(int i, int i2) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onViewportSizeChange(generatePlayingMediaPeriodEventTime, i, i2);
        }
    }

    public final void notifyNetworkTypeChanged(NetworkInfo networkInfo) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkTypeChanged(generatePlayingMediaPeriodEventTime, networkInfo);
        }
    }

    public final void resetForNewMediaSource() {
        for (WindowAndMediaPeriodId windowAndMediaPeriodId : new ArrayList(this.mediaPeriodQueueTracker.activeMediaPeriods)) {
            onMediaPeriodReleased(windowAndMediaPeriodId.windowIndex, windowAndMediaPeriodId.mediaPeriodId);
        }
    }

    @Override // com.google.android.exoplayer2.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(generatePlayingMediaPeriodEventTime, metadata);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(generatePlayingMediaPeriodEventTime, 1, decoderCounters);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSessionId(int i) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(generateReadingMediaPeriodEventTime, i);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(generateReadingMediaPeriodEventTime, 1, str, j2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioInputFormatChanged(Format format) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(generateReadingMediaPeriodEventTime, 1, format);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSinkUnderrun(int i, long j, long j2) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAudioUnderrun(generateReadingMediaPeriodEventTime, i, j, j2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(generateLastReportedPlayingMediaPeriodEventTime, 1, decoderCounters);
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(generatePlayingMediaPeriodEventTime, 2, decoderCounters);
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(generateReadingMediaPeriodEventTime, 2, str, j2);
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(Format format) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(generateReadingMediaPeriodEventTime, 2, format);
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i, long j) {
        AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(generateLastReportedPlayingMediaPeriodEventTime, i, j);
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(generateReadingMediaPeriodEventTime, i, i2, i3, f);
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderedFirstFrame(generateReadingMediaPeriodEventTime, surface);
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(generateLastReportedPlayingMediaPeriodEventTime, 2, decoderCounters);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onMediaPeriodCreated(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onMediaPeriodCreated(i, mediaPeriodId);
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(generateEventTime);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onMediaPeriodReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onMediaPeriodReleased(i, mediaPeriodId);
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodReleased(generateEventTime);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadStarted(generateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadCompleted(generateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadCanceled(generateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(generateEventTime, loadEventInfo, mediaLoadData, iOException, z);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onReadingStarted(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onReadingStarted(i, mediaPeriodId);
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(generateEventTime);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onUpstreamDiscarded(generateEventTime, mediaLoadData);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(generateEventTime, mediaLoadData);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onTimelineChanged(Timeline timeline, Object obj, int i) {
        this.mediaPeriodQueueTracker.onTimelineChanged(timeline);
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(generatePlayingMediaPeriodEventTime, i);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(generatePlayingMediaPeriodEventTime, trackGroupArray, trackSelectionArray);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onLoadingChanged(boolean z) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadingChanged(generatePlayingMediaPeriodEventTime, z);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerStateChanged(boolean z, int i) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(generatePlayingMediaPeriodEventTime, z, i);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onRepeatModeChanged(int i) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRepeatModeChanged(generatePlayingMediaPeriodEventTime, i);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onShuffleModeEnabledChanged(boolean z) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onShuffleModeChanged(generatePlayingMediaPeriodEventTime, z);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlayerError(generatePlayingMediaPeriodEventTime, exoPlaybackException);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(int i) {
        this.mediaPeriodQueueTracker.onPositionDiscontinuity(i);
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity(generatePlayingMediaPeriodEventTime, i);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlaybackParametersChanged(generatePlayingMediaPeriodEventTime, playbackParameters);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onSeekProcessed() {
        if (this.mediaPeriodQueueTracker.isSeeking()) {
            this.mediaPeriodQueueTracker.onSeekProcessed();
            AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
            Iterator<AnalyticsListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onSeekProcessed(generatePlayingMediaPeriodEventTime);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i, long j, long j2) {
        AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onBandwidthEstimate(generateLoadingMediaPeriodEventTime, i, j, j2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysLoaded() {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysLoaded(generateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmSessionManagerError(Exception exc) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(generateReadingMediaPeriodEventTime, exc);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysRestored() {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRestored(generateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysRemoved() {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRemoved(generateReadingMediaPeriodEventTime);
        }
    }

    protected Set<AnalyticsListener> getListeners() {
        return Collections.unmodifiableSet(this.listeners);
    }

    protected AnalyticsListener.EventTime generateEventTime(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        long defaultPositionMs;
        long j;
        Assertions.checkNotNull(this.player);
        long elapsedRealtime = this.clock.elapsedRealtime();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        long j2 = 0;
        if (i == this.player.getCurrentWindowIndex()) {
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                if (this.player.getCurrentAdGroupIndex() == mediaPeriodId.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId.adIndexInAdGroup) {
                    j2 = this.player.getCurrentPosition();
                }
                j = j2;
            } else {
                defaultPositionMs = this.player.getContentPosition();
                j = defaultPositionMs;
            }
        } else {
            if (i < currentTimeline.getWindowCount() && (mediaPeriodId == null || !mediaPeriodId.isAd())) {
                defaultPositionMs = currentTimeline.getWindow(i, this.window).getDefaultPositionMs();
                j = defaultPositionMs;
            }
            j = j2;
        }
        return new AnalyticsListener.EventTime(elapsedRealtime, currentTimeline, i, mediaPeriodId, j, this.player.getCurrentPosition(), this.player.getBufferedPosition() - this.player.getContentPosition());
    }

    private AnalyticsListener.EventTime generateEventTime(WindowAndMediaPeriodId windowAndMediaPeriodId) {
        if (windowAndMediaPeriodId == null) {
            int currentWindowIndex = ((Player) Assertions.checkNotNull(this.player)).getCurrentWindowIndex();
            return generateEventTime(currentWindowIndex, this.mediaPeriodQueueTracker.tryResolveWindowIndex(currentWindowIndex));
        }
        return generateEventTime(windowAndMediaPeriodId.windowIndex, windowAndMediaPeriodId.mediaPeriodId);
    }

    private AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLastReportedPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class MediaPeriodQueueTracker {
        private boolean isSeeking;
        private WindowAndMediaPeriodId lastReportedPlayingMediaPeriod;
        private WindowAndMediaPeriodId readingMediaPeriod;
        private final ArrayList<WindowAndMediaPeriodId> activeMediaPeriods = new ArrayList<>();
        private final Timeline.Period period = new Timeline.Period();
        private Timeline timeline = Timeline.EMPTY;

        public WindowAndMediaPeriodId getPlayingMediaPeriod() {
            if (this.activeMediaPeriods.isEmpty() || this.timeline.isEmpty() || this.isSeeking) {
                return null;
            }
            return this.activeMediaPeriods.get(0);
        }

        public WindowAndMediaPeriodId getLastReportedPlayingMediaPeriod() {
            return this.lastReportedPlayingMediaPeriod;
        }

        public WindowAndMediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public WindowAndMediaPeriodId getLoadingMediaPeriod() {
            if (this.activeMediaPeriods.isEmpty()) {
                return null;
            }
            ArrayList<WindowAndMediaPeriodId> arrayList = this.activeMediaPeriods;
            return arrayList.get(arrayList.size() - 1);
        }

        public boolean isSeeking() {
            return this.isSeeking;
        }

        public MediaSource.MediaPeriodId tryResolveWindowIndex(int i) {
            Timeline timeline = this.timeline;
            if (timeline != null) {
                int periodCount = timeline.getPeriodCount();
                MediaSource.MediaPeriodId mediaPeriodId = null;
                for (int i2 = 0; i2 < this.activeMediaPeriods.size(); i2++) {
                    WindowAndMediaPeriodId windowAndMediaPeriodId = this.activeMediaPeriods.get(i2);
                    int i3 = windowAndMediaPeriodId.mediaPeriodId.periodIndex;
                    if (i3 < periodCount && this.timeline.getPeriod(i3, this.period).windowIndex == i) {
                        if (mediaPeriodId != null) {
                            return null;
                        }
                        mediaPeriodId = windowAndMediaPeriodId.mediaPeriodId;
                    }
                }
                return mediaPeriodId;
            }
            return null;
        }

        public void onPositionDiscontinuity(int i) {
            updateLastReportedPlayingMediaPeriod();
        }

        public void onTimelineChanged(Timeline timeline) {
            for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                ArrayList<WindowAndMediaPeriodId> arrayList = this.activeMediaPeriods;
                arrayList.set(i, updateMediaPeriodToNewTimeline(arrayList.get(i), timeline));
            }
            WindowAndMediaPeriodId windowAndMediaPeriodId = this.readingMediaPeriod;
            if (windowAndMediaPeriodId != null) {
                this.readingMediaPeriod = updateMediaPeriodToNewTimeline(windowAndMediaPeriodId, timeline);
            }
            this.timeline = timeline;
            updateLastReportedPlayingMediaPeriod();
        }

        public void onSeekStarted() {
            this.isSeeking = true;
        }

        public void onSeekProcessed() {
            this.isSeeking = false;
            updateLastReportedPlayingMediaPeriod();
        }

        public void onMediaPeriodCreated(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.activeMediaPeriods.add(new WindowAndMediaPeriodId(i, mediaPeriodId));
            if (this.activeMediaPeriods.size() != 1 || this.timeline.isEmpty()) {
                return;
            }
            updateLastReportedPlayingMediaPeriod();
        }

        public void onMediaPeriodReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            WindowAndMediaPeriodId windowAndMediaPeriodId = new WindowAndMediaPeriodId(i, mediaPeriodId);
            this.activeMediaPeriods.remove(windowAndMediaPeriodId);
            if (windowAndMediaPeriodId.equals(this.readingMediaPeriod)) {
                this.readingMediaPeriod = this.activeMediaPeriods.isEmpty() ? null : this.activeMediaPeriods.get(0);
            }
        }

        public void onReadingStarted(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.readingMediaPeriod = new WindowAndMediaPeriodId(i, mediaPeriodId);
        }

        private void updateLastReportedPlayingMediaPeriod() {
            if (this.activeMediaPeriods.isEmpty()) {
                return;
            }
            this.lastReportedPlayingMediaPeriod = this.activeMediaPeriods.get(0);
        }

        private WindowAndMediaPeriodId updateMediaPeriodToNewTimeline(WindowAndMediaPeriodId windowAndMediaPeriodId, Timeline timeline) {
            int indexOfPeriod;
            return (timeline.isEmpty() || this.timeline.isEmpty() || (indexOfPeriod = timeline.getIndexOfPeriod(this.timeline.getPeriod(windowAndMediaPeriodId.mediaPeriodId.periodIndex, this.period, true).uid)) == -1) ? windowAndMediaPeriodId : new WindowAndMediaPeriodId(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, windowAndMediaPeriodId.mediaPeriodId.copyWithPeriodIndex(indexOfPeriod));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class WindowAndMediaPeriodId {
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public WindowAndMediaPeriodId(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WindowAndMediaPeriodId windowAndMediaPeriodId = (WindowAndMediaPeriodId) obj;
            return this.windowIndex == windowAndMediaPeriodId.windowIndex && this.mediaPeriodId.equals(windowAndMediaPeriodId.mediaPeriodId);
        }

        public int hashCode() {
            return (this.windowIndex * 31) + this.mediaPeriodId.hashCode();
        }
    }
}
