package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.DeferredMediaPeriod;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final String TAG = "AdsMediaSource";
    private long[][] adDurationsUs;
    private MediaSource[][] adGroupMediaSources;
    private final MediaSourceFactory adMediaSourceFactory;
    private AdPlaybackState adPlaybackState;
    private final ViewGroup adUiViewGroup;
    private final AdsLoader adsLoader;
    private ComponentListener componentListener;
    private Object contentManifest;
    private final MediaSource contentMediaSource;
    private Timeline contentTimeline;
    private final Map<MediaSource, List<DeferredMediaPeriod>> deferredMediaPeriodByAdMediaSource;
    private final Handler eventHandler;
    private final EventListener eventListener;
    private final Handler mainHandler;
    private final Timeline.Period period;

    @Deprecated
    /* loaded from: classes.dex */
    public interface EventListener {
        void onAdClicked();

        void onAdLoadError(IOException iOException);

        void onAdTapped();

        void onInternalAdLoadError(RuntimeException runtimeException);
    }

    /* loaded from: classes.dex */
    public interface MediaSourceFactory {
        MediaSource createMediaSource(Uri uri);

        int[] getSupportedTypes();
    }

    /* loaded from: classes.dex */
    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Type {
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i) {
            return new AdLoadException(1, new IOException("Failed to load ad group " + i, exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        private AdLoadException(int i, Exception exc) {
            super(exc);
            this.type = i;
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            Assertions.checkState(this.type == 3);
            return (RuntimeException) getCause();
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSource.Factory factory, AdsLoader adsLoader, ViewGroup viewGroup) {
        this(mediaSource, new ExtractorMediaSource.Factory(factory), adsLoader, viewGroup, (Handler) null, (EventListener) null);
    }

    public AdsMediaSource(MediaSource mediaSource, MediaSourceFactory mediaSourceFactory, AdsLoader adsLoader, ViewGroup viewGroup) {
        this(mediaSource, mediaSourceFactory, adsLoader, viewGroup, (Handler) null, (EventListener) null);
    }

    @Deprecated
    public AdsMediaSource(MediaSource mediaSource, DataSource.Factory factory, AdsLoader adsLoader, ViewGroup viewGroup, Handler handler, EventListener eventListener) {
        this(mediaSource, new ExtractorMediaSource.Factory(factory), adsLoader, viewGroup, handler, eventListener);
    }

    @Deprecated
    public AdsMediaSource(MediaSource mediaSource, MediaSourceFactory mediaSourceFactory, AdsLoader adsLoader, ViewGroup viewGroup, Handler handler, EventListener eventListener) {
        this.contentMediaSource = mediaSource;
        this.adMediaSourceFactory = mediaSourceFactory;
        this.adsLoader = adsLoader;
        this.adUiViewGroup = viewGroup;
        this.eventHandler = handler;
        this.eventListener = eventListener;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.deferredMediaPeriodByAdMediaSource = new HashMap();
        this.period = new Timeline.Period();
        this.adGroupMediaSources = new MediaSource[0];
        this.adDurationsUs = new long[0];
        adsLoader.setSupportedContentTypes(mediaSourceFactory.getSupportedTypes());
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(final ExoPlayer exoPlayer, boolean z) {
        super.prepareSourceInternal(exoPlayer, z);
        Assertions.checkArgument(z);
        final ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        prepareChildSource(new MediaSource.MediaPeriodId(0), this.contentMediaSource);
        this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource.1
            @Override // java.lang.Runnable
            public void run() {
                AdsMediaSource.this.adsLoader.attachPlayer(exoPlayer, componentListener, AdsMediaSource.this.adUiViewGroup);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        if (this.adPlaybackState.adGroupCount > 0 && mediaPeriodId.isAd()) {
            int i = mediaPeriodId.adGroupIndex;
            int i2 = mediaPeriodId.adIndexInAdGroup;
            Uri uri = this.adPlaybackState.adGroups[i].uris[i2];
            if (this.adGroupMediaSources[i].length <= i2) {
                MediaSource createMediaSource = this.adMediaSourceFactory.createMediaSource(uri);
                MediaSource[][] mediaSourceArr = this.adGroupMediaSources;
                int length = mediaSourceArr[i].length;
                if (i2 >= length) {
                    int i3 = i2 + 1;
                    mediaSourceArr[i] = (MediaSource[]) Arrays.copyOf(mediaSourceArr[i], i3);
                    long[][] jArr = this.adDurationsUs;
                    jArr[i] = Arrays.copyOf(jArr[i], i3);
                    Arrays.fill(this.adDurationsUs[i], length, i3, (long) C.TIME_UNSET);
                }
                this.adGroupMediaSources[i][i2] = createMediaSource;
                this.deferredMediaPeriodByAdMediaSource.put(createMediaSource, new ArrayList());
                prepareChildSource(mediaPeriodId, createMediaSource);
            }
            MediaSource mediaSource = this.adGroupMediaSources[i][i2];
            DeferredMediaPeriod deferredMediaPeriod = new DeferredMediaPeriod(mediaSource, new MediaSource.MediaPeriodId(0, mediaPeriodId.windowSequenceNumber), allocator);
            deferredMediaPeriod.setPrepareErrorListener(new AdPrepareErrorListener(uri, i, i2));
            List<DeferredMediaPeriod> list = this.deferredMediaPeriodByAdMediaSource.get(mediaSource);
            if (list == null) {
                deferredMediaPeriod.createPeriod();
            } else {
                list.add(deferredMediaPeriod);
            }
            return deferredMediaPeriod;
        }
        DeferredMediaPeriod deferredMediaPeriod2 = new DeferredMediaPeriod(this.contentMediaSource, mediaPeriodId, allocator);
        deferredMediaPeriod2.createPeriod();
        return deferredMediaPeriod2;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        DeferredMediaPeriod deferredMediaPeriod = (DeferredMediaPeriod) mediaPeriod;
        List<DeferredMediaPeriod> list = this.deferredMediaPeriodByAdMediaSource.get(deferredMediaPeriod.mediaSource);
        if (list != null) {
            list.remove(deferredMediaPeriod);
        }
        deferredMediaPeriod.releasePeriod();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.componentListener.release();
        this.componentListener = null;
        this.deferredMediaPeriodByAdMediaSource.clear();
        this.contentTimeline = null;
        this.contentManifest = null;
        this.adPlaybackState = null;
        this.adGroupMediaSources = new MediaSource[0];
        this.adDurationsUs = new long[0];
        this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource.2
            @Override // java.lang.Runnable
            public void run() {
                AdsMediaSource.this.adsLoader.detachPlayer();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline, Object obj) {
        if (mediaPeriodId.isAd()) {
            onAdSourceInfoRefreshed(mediaSource, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, timeline);
        } else {
            onContentSourceInfoRefreshed(timeline, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        if (this.adPlaybackState == null) {
            MediaSource[][] mediaSourceArr = new MediaSource[adPlaybackState.adGroupCount];
            this.adGroupMediaSources = mediaSourceArr;
            Arrays.fill(mediaSourceArr, new MediaSource[0]);
            long[][] jArr = new long[adPlaybackState.adGroupCount];
            this.adDurationsUs = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateSourceInfo();
    }

    private void onContentSourceInfoRefreshed(Timeline timeline, Object obj) {
        this.contentTimeline = timeline;
        this.contentManifest = obj;
        maybeUpdateSourceInfo();
    }

    private void onAdSourceInfoRefreshed(MediaSource mediaSource, int i, int i2, Timeline timeline) {
        Assertions.checkArgument(timeline.getPeriodCount() == 1);
        this.adDurationsUs[i][i2] = timeline.getPeriod(0, this.period).getDurationUs();
        if (this.deferredMediaPeriodByAdMediaSource.containsKey(mediaSource)) {
            List<DeferredMediaPeriod> list = this.deferredMediaPeriodByAdMediaSource.get(mediaSource);
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).createPeriod();
            }
            this.deferredMediaPeriodByAdMediaSource.remove(mediaSource);
        }
        maybeUpdateSourceInfo();
    }

    private void maybeUpdateSourceInfo() {
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || this.contentTimeline == null) {
            return;
        }
        AdPlaybackState withAdDurationsUs = adPlaybackState.withAdDurationsUs(this.adDurationsUs);
        this.adPlaybackState = withAdDurationsUs;
        refreshSourceInfo(withAdDurationsUs.adGroupCount == 0 ? this.contentTimeline : new SinglePeriodAdTimeline(this.contentTimeline, this.adPlaybackState), this.contentManifest);
    }

    /* loaded from: classes.dex */
    private final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler = new Handler();
        private volatile boolean released;

        public ComponentListener() {
        }

        public void release() {
            this.released = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(final AdPlaybackState adPlaybackState) {
            if (this.released) {
                return;
            }
            this.playerHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ComponentListener.this.released) {
                        return;
                    }
                    AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdClicked() {
            if (this.released || AdsMediaSource.this.eventHandler == null || AdsMediaSource.this.eventListener == null) {
                return;
            }
            AdsMediaSource.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ComponentListener.this.released) {
                        return;
                    }
                    AdsMediaSource.this.eventListener.onAdClicked();
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdTapped() {
            if (this.released || AdsMediaSource.this.eventHandler == null || AdsMediaSource.this.eventListener == null) {
                return;
            }
            AdsMediaSource.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener.3
                @Override // java.lang.Runnable
                public void run() {
                    if (ComponentListener.this.released) {
                        return;
                    }
                    AdsMediaSource.this.eventListener.onAdTapped();
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdLoadError(final AdLoadException adLoadException, DataSpec dataSpec) {
            if (this.released) {
                return;
            }
            AdsMediaSource.this.createEventDispatcher(null).loadError(dataSpec, 6, -1L, 0L, 0L, adLoadException, true);
            if (AdsMediaSource.this.eventHandler == null || AdsMediaSource.this.eventListener == null) {
                return;
            }
            AdsMediaSource.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener.4
                @Override // java.lang.Runnable
                public void run() {
                    if (ComponentListener.this.released) {
                        return;
                    }
                    if (adLoadException.type == 3) {
                        AdsMediaSource.this.eventListener.onInternalAdLoadError(adLoadException.getRuntimeExceptionForUnexpected());
                    } else {
                        AdsMediaSource.this.eventListener.onAdLoadError(adLoadException);
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    private final class AdPrepareErrorListener implements DeferredMediaPeriod.PrepareErrorListener {
        private final int adGroupIndex;
        private final int adIndexInAdGroup;
        private final Uri adUri;

        public AdPrepareErrorListener(Uri uri, int i, int i2) {
            this.adUri = uri;
            this.adGroupIndex = i;
            this.adIndexInAdGroup = i2;
        }

        @Override // com.google.android.exoplayer2.source.DeferredMediaPeriod.PrepareErrorListener
        public void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, final IOException iOException) {
            AdsMediaSource.this.createEventDispatcher(mediaPeriodId).loadError(new DataSpec(this.adUri), 6, -1L, 0L, 0L, AdLoadException.createForAd(iOException), true);
            AdsMediaSource.this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource.AdPrepareErrorListener.1
                @Override // java.lang.Runnable
                public void run() {
                    AdsMediaSource.this.adsLoader.handlePrepareError(AdPrepareErrorListener.this.adGroupIndex, AdPrepareErrorListener.this.adIndexInAdGroup, iOException);
                }
            });
        }
    }
}
