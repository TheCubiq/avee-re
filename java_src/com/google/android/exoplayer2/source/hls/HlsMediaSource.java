package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public final class HlsMediaSource extends BaseMediaSource implements HlsPlaylistTracker.PrimaryPlaylistListener {
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    private final boolean allowChunklessPreparation;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final HlsExtractorFactory extractorFactory;
    private final Uri manifestUri;
    private final int minLoadableRetryCount;
    private final HlsPlaylistTracker playlistTracker;
    private final Object tag;

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.hls");
    }

    /* loaded from: classes.dex */
    public static final class Factory implements AdsMediaSource.MediaSourceFactory {
        private boolean allowChunklessPreparation;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private HlsExtractorFactory extractorFactory;
        private final HlsDataSourceFactory hlsDataSourceFactory;
        private boolean isCreateCalled;
        private int minLoadableRetryCount;
        private ParsingLoadable.Parser<HlsPlaylist> playlistParser;
        private HlsPlaylistTracker playlistTracker;
        private Object tag;

        @Override // com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public Factory(DataSource.Factory factory) {
            this(new DefaultHlsDataSourceFactory(factory));
        }

        public Factory(HlsDataSourceFactory hlsDataSourceFactory) {
            this.hlsDataSourceFactory = (HlsDataSourceFactory) Assertions.checkNotNull(hlsDataSourceFactory);
            this.extractorFactory = HlsExtractorFactory.DEFAULT;
            this.minLoadableRetryCount = 3;
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
        }

        public Factory setTag(Object obj) {
            Assertions.checkState(!this.isCreateCalled);
            this.tag = obj;
            return this;
        }

        public Factory setExtractorFactory(HlsExtractorFactory hlsExtractorFactory) {
            Assertions.checkState(!this.isCreateCalled);
            this.extractorFactory = (HlsExtractorFactory) Assertions.checkNotNull(hlsExtractorFactory);
            return this;
        }

        public Factory setMinLoadableRetryCount(int i) {
            Assertions.checkState(!this.isCreateCalled);
            this.minLoadableRetryCount = i;
            return this;
        }

        public Factory setPlaylistParser(ParsingLoadable.Parser<HlsPlaylist> parser) {
            Assertions.checkState(!this.isCreateCalled);
            Assertions.checkState(this.playlistTracker == null, "A playlist tracker has already been set.");
            this.playlistParser = (ParsingLoadable.Parser) Assertions.checkNotNull(parser);
            return this;
        }

        public Factory setPlaylistTracker(HlsPlaylistTracker hlsPlaylistTracker) {
            Assertions.checkState(!this.isCreateCalled);
            Assertions.checkState(this.playlistParser == null, "A playlist parser has already been set.");
            this.playlistTracker = (HlsPlaylistTracker) Assertions.checkNotNull(hlsPlaylistTracker);
            return this;
        }

        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            Assertions.checkState(!this.isCreateCalled);
            this.compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory) Assertions.checkNotNull(compositeSequenceableLoaderFactory);
            return this;
        }

        public Factory setAllowChunklessPreparation(boolean z) {
            Assertions.checkState(!this.isCreateCalled);
            this.allowChunklessPreparation = z;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
        public HlsMediaSource createMediaSource(Uri uri) {
            this.isCreateCalled = true;
            if (this.playlistTracker == null) {
                HlsDataSourceFactory hlsDataSourceFactory = this.hlsDataSourceFactory;
                int i = this.minLoadableRetryCount;
                ParsingLoadable.Parser parser = this.playlistParser;
                if (parser == null) {
                    parser = new HlsPlaylistParser();
                }
                this.playlistTracker = new DefaultHlsPlaylistTracker(hlsDataSourceFactory, i, parser);
            }
            return new HlsMediaSource(uri, this.hlsDataSourceFactory, this.extractorFactory, this.compositeSequenceableLoaderFactory, this.minLoadableRetryCount, this.playlistTracker, this.allowChunklessPreparation, this.tag);
        }

        @Deprecated
        public HlsMediaSource createMediaSource(Uri uri, Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            HlsMediaSource createMediaSource = createMediaSource(uri);
            if (handler != null && mediaSourceEventListener != null) {
                createMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return createMediaSource;
        }
    }

    @Deprecated
    public HlsMediaSource(Uri uri, DataSource.Factory factory, Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        this(uri, factory, 3, handler, mediaSourceEventListener);
    }

    @Deprecated
    public HlsMediaSource(Uri uri, DataSource.Factory factory, int i, Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        this(uri, new DefaultHlsDataSourceFactory(factory), HlsExtractorFactory.DEFAULT, i, handler, mediaSourceEventListener, new HlsPlaylistParser());
    }

    @Deprecated
    public HlsMediaSource(Uri uri, HlsDataSourceFactory hlsDataSourceFactory, HlsExtractorFactory hlsExtractorFactory, int i, Handler handler, MediaSourceEventListener mediaSourceEventListener, ParsingLoadable.Parser<HlsPlaylist> parser) {
        this(uri, hlsDataSourceFactory, hlsExtractorFactory, new DefaultCompositeSequenceableLoaderFactory(), i, new DefaultHlsPlaylistTracker(hlsDataSourceFactory, i, new HlsPlaylistParser()), false, null);
        if (handler == null || mediaSourceEventListener == null) {
            return;
        }
        addEventListener(handler, mediaSourceEventListener);
    }

    private HlsMediaSource(Uri uri, HlsDataSourceFactory hlsDataSourceFactory, HlsExtractorFactory hlsExtractorFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, int i, HlsPlaylistTracker hlsPlaylistTracker, boolean z, Object obj) {
        this.manifestUri = uri;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.extractorFactory = hlsExtractorFactory;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.minLoadableRetryCount = i;
        this.playlistTracker = hlsPlaylistTracker;
        this.allowChunklessPreparation = z;
        this.tag = obj;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(ExoPlayer exoPlayer, boolean z) {
        this.playlistTracker.start(this.manifestUri, createEventDispatcher(null), this);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.playlistTracker.maybeThrowPrimaryPlaylistRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        Assertions.checkArgument(mediaPeriodId.periodIndex == 0);
        return new HlsMediaPeriod(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.minLoadableRetryCount, createEventDispatcher(mediaPeriodId), allocator, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((HlsMediaPeriod) mediaPeriod).release();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        HlsPlaylistTracker hlsPlaylistTracker = this.playlistTracker;
        if (hlsPlaylistTracker != null) {
            hlsPlaylistTracker.release();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener
    public void onPrimaryPlaylistRefreshed(HlsMediaPlaylist hlsMediaPlaylist) {
        SinglePeriodTimeline singlePeriodTimeline;
        long j;
        long usToMs = hlsMediaPlaylist.hasProgramDateTime ? C.usToMs(hlsMediaPlaylist.startTimeUs) : -9223372036854775807L;
        long j2 = (hlsMediaPlaylist.playlistType == 2 || hlsMediaPlaylist.playlistType == 1) ? usToMs : -9223372036854775807L;
        long j3 = hlsMediaPlaylist.startOffsetUs;
        if (this.playlistTracker.isLive()) {
            long initialStartTimeUs = hlsMediaPlaylist.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
            long j4 = hlsMediaPlaylist.hasEndTag ? initialStartTimeUs + hlsMediaPlaylist.durationUs : -9223372036854775807L;
            List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
            if (j3 == C.TIME_UNSET) {
                j = list.isEmpty() ? 0L : list.get(Math.max(0, list.size() - 3)).relativeStartTimeUs;
            } else {
                j = j3;
            }
            singlePeriodTimeline = new SinglePeriodTimeline(j2, usToMs, j4, hlsMediaPlaylist.durationUs, initialStartTimeUs, j, true, !hlsMediaPlaylist.hasEndTag, this.tag);
        } else {
            singlePeriodTimeline = new SinglePeriodTimeline(j2, usToMs, hlsMediaPlaylist.durationUs, hlsMediaPlaylist.durationUs, 0L, j3 == C.TIME_UNSET ? 0L : j3, true, false, this.tag);
        }
        refreshSourceInfo(singlePeriodTimeline, new HlsManifest(this.playlistTracker.getMasterPlaylist(), hlsMediaPlaylist));
    }
}
