.class public final Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;
.super Lcom/google/android/exoplayer2/source/CompositeMediaSource;
.source "AdsMediaSource.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$AdPrepareErrorListener;,
        Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$ComponentListener;,
        Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;,
        Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$AdLoadException;,
        Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/exoplayer2/source/CompositeMediaSource<",
        "Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;",
        ">;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AdsMediaSource"


# instance fields
.field private adDurationsUs:[[J

.field private adGroupMediaSources:[[Lcom/google/android/exoplayer2/source/MediaSource;

.field private final adMediaSourceFactory:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;

.field private adPlaybackState:Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

.field private final adUiViewGroup:Landroid/view/ViewGroup;

.field private final adsLoader:Lcom/google/android/exoplayer2/source/ads/AdsLoader;

.field private componentListener:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$ComponentListener;

.field private contentManifest:Ljava/lang/Object;

.field private final contentMediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

.field private contentTimeline:Lcom/google/android/exoplayer2/Timeline;

.field private final deferredMediaPeriodByAdMediaSource:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/android/exoplayer2/source/MediaSource;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;",
            ">;>;"
        }
    .end annotation
.end field

.field private final eventHandler:Landroid/os/Handler;

.field private final eventListener:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;

.field private final mainHandler:Landroid/os/Handler;

.field private final period:Lcom/google/android/exoplayer2/Timeline$Period;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;Lcom/google/android/exoplayer2/source/ads/AdsLoader;Landroid/view/ViewGroup;)V
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 229
    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;-><init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;Lcom/google/android/exoplayer2/source/ads/AdsLoader;Landroid/view/ViewGroup;Landroid/os/Handler;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;Lcom/google/android/exoplayer2/source/ads/AdsLoader;Landroid/view/ViewGroup;Landroid/os/Handler;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 294
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/CompositeMediaSource;-><init>()V

    .line 295
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentMediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    .line 296
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adMediaSourceFactory:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;

    .line 297
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adsLoader:Lcom/google/android/exoplayer2/source/ads/AdsLoader;

    .line 298
    iput-object p4, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adUiViewGroup:Landroid/view/ViewGroup;

    .line 299
    iput-object p5, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->eventHandler:Landroid/os/Handler;

    .line 300
    iput-object p6, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->eventListener:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;

    .line 301
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-direct {p1, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->mainHandler:Landroid/os/Handler;

    .line 302
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->deferredMediaPeriodByAdMediaSource:Ljava/util/Map;

    .line 303
    new-instance p1, Lcom/google/android/exoplayer2/Timeline$Period;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/Timeline$Period;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->period:Lcom/google/android/exoplayer2/Timeline$Period;

    const/4 p1, 0x0

    new-array p4, p1, [[Lcom/google/android/exoplayer2/source/MediaSource;

    .line 304
    iput-object p4, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adGroupMediaSources:[[Lcom/google/android/exoplayer2/source/MediaSource;

    new-array p1, p1, [[J

    .line 305
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adDurationsUs:[[J

    .line 306
    invoke-interface {p2}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;->getSupportedTypes()[I

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/google/android/exoplayer2/source/ads/AdsLoader;->setSupportedContentTypes([I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/source/ads/AdsLoader;Landroid/view/ViewGroup;)V
    .locals 7

    .line 206
    new-instance v2, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;

    invoke-direct {v2, p2}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;-><init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;Lcom/google/android/exoplayer2/source/ads/AdsLoader;Landroid/view/ViewGroup;Landroid/os/Handler;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/source/ads/AdsLoader;Landroid/view/ViewGroup;Landroid/os/Handler;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 262
    new-instance v2, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;

    invoke-direct {v2, p2}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;-><init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;Lcom/google/android/exoplayer2/source/ads/AdsLoader;Landroid/view/ViewGroup;Landroid/os/Handler;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;)Landroid/view/ViewGroup;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adUiViewGroup:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic access$100(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;)Lcom/google/android/exoplayer2/source/ads/AdsLoader;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adsLoader:Lcom/google/android/exoplayer2/source/ads/AdsLoader;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;)Landroid/os/Handler;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->mainHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$300(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->onAdPlaybackState(Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;)V

    return-void
.end method

.method static synthetic access$400(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;)Landroid/os/Handler;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->eventHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$500(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;)Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->eventListener:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$EventListener;

    return-object p0
.end method

.method static synthetic access$600(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)Lcom/google/android/exoplayer2/source/MediaSourceEventListener$EventDispatcher;
    .locals 0

    .line 50
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->createEventDispatcher(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)Lcom/google/android/exoplayer2/source/MediaSourceEventListener$EventDispatcher;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$700(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)Lcom/google/android/exoplayer2/source/MediaSourceEventListener$EventDispatcher;
    .locals 0

    .line 50
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->createEventDispatcher(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)Lcom/google/android/exoplayer2/source/MediaSourceEventListener$EventDispatcher;

    move-result-object p0

    return-object p0
.end method

.method private maybeUpdateSourceInfo()V
    .locals 3

    .line 455
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adPlaybackState:Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentTimeline:Lcom/google/android/exoplayer2/Timeline;

    if-eqz v1, :cond_1

    .line 456
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adDurationsUs:[[J

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;->withAdDurationsUs([[J)Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adPlaybackState:Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

    .line 457
    iget v0, v0, Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;->adGroupCount:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentTimeline:Lcom/google/android/exoplayer2/Timeline;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/exoplayer2/source/ads/SinglePeriodAdTimeline;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentTimeline:Lcom/google/android/exoplayer2/Timeline;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adPlaybackState:Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

    invoke-direct {v0, v1, v2}, Lcom/google/android/exoplayer2/source/ads/SinglePeriodAdTimeline;-><init>(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;)V

    .line 461
    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentManifest:Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->refreshSourceInfo(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private onAdPlaybackState(Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;)V
    .locals 3

    .line 424
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adPlaybackState:Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

    if-nez v0, :cond_0

    .line 425
    iget v0, p1, Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;->adGroupCount:I

    new-array v0, v0, [[Lcom/google/android/exoplayer2/source/MediaSource;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adGroupMediaSources:[[Lcom/google/android/exoplayer2/source/MediaSource;

    const/4 v1, 0x0

    new-array v2, v1, [Lcom/google/android/exoplayer2/source/MediaSource;

    .line 426
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 427
    iget v0, p1, Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;->adGroupCount:I

    new-array v0, v0, [[J

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adDurationsUs:[[J

    new-array v1, v1, [J

    .line 428
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 430
    :cond_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adPlaybackState:Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

    .line 431
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->maybeUpdateSourceInfo()V

    return-void
.end method

.method private onAdSourceInfoRefreshed(Lcom/google/android/exoplayer2/source/MediaSource;IILcom/google/android/exoplayer2/Timeline;)V
    .locals 4

    .line 442
    invoke-virtual {p4}, Lcom/google/android/exoplayer2/Timeline;->getPeriodCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    .line 443
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adDurationsUs:[[J

    aget-object p2, v0, p2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->period:Lcom/google/android/exoplayer2/Timeline$Period;

    invoke-virtual {p4, v1, v0}, Lcom/google/android/exoplayer2/Timeline;->getPeriod(ILcom/google/android/exoplayer2/Timeline$Period;)Lcom/google/android/exoplayer2/Timeline$Period;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/exoplayer2/Timeline$Period;->getDurationUs()J

    move-result-wide v2

    aput-wide v2, p2, p3

    .line 444
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->deferredMediaPeriodByAdMediaSource:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 445
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->deferredMediaPeriodByAdMediaSource:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 446
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v1, p3, :cond_1

    .line 447
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;

    invoke-virtual {p3}, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->createPeriod()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 449
    :cond_1
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->deferredMediaPeriodByAdMediaSource:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    :cond_2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->maybeUpdateSourceInfo()V

    return-void
.end method

.method private onContentSourceInfoRefreshed(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;)V
    .locals 0

    .line 435
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentTimeline:Lcom/google/android/exoplayer2/Timeline;

    .line 436
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentManifest:Ljava/lang/Object;

    .line 437
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->maybeUpdateSourceInfo()V

    return-void
.end method


# virtual methods
.method public createPeriod(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/upstream/Allocator;)Lcom/google/android/exoplayer2/source/MediaPeriod;
    .locals 9

    .line 326
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adPlaybackState:Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

    iget v0, v0, Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;->adGroupCount:I

    if-lez v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->isAd()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 327
    iget v0, p1, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 328
    iget v1, p1, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 329
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adPlaybackState:Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

    iget-object v2, v2, Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;->adGroups:[Lcom/google/android/exoplayer2/source/ads/AdPlaybackState$AdGroup;

    aget-object v2, v2, v0

    iget-object v2, v2, Lcom/google/android/exoplayer2/source/ads/AdPlaybackState$AdGroup;->uris:[Landroid/net/Uri;

    aget-object v2, v2, v1

    .line 330
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adGroupMediaSources:[[Lcom/google/android/exoplayer2/source/MediaSource;

    aget-object v3, v3, v0

    array-length v3, v3

    if-gt v3, v1, :cond_1

    .line 331
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adMediaSourceFactory:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;

    invoke-interface {v3, v2}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$MediaSourceFactory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/MediaSource;

    move-result-object v3

    .line 332
    iget-object v4, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adGroupMediaSources:[[Lcom/google/android/exoplayer2/source/MediaSource;

    aget-object v5, v4, v0

    array-length v5, v5

    if-lt v1, v5, :cond_0

    add-int/lit8 v6, v1, 0x1

    .line 335
    aget-object v7, v4, v0

    .line 336
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Lcom/google/android/exoplayer2/source/MediaSource;

    aput-object v7, v4, v0

    .line 337
    iget-object v4, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adDurationsUs:[[J

    aget-object v7, v4, v0

    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v7

    aput-object v7, v4, v0

    .line 338
    iget-object v4, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adDurationsUs:[[J

    aget-object v4, v4, v0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v4, v5, v6, v7, v8}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 340
    :cond_0
    iget-object v4, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adGroupMediaSources:[[Lcom/google/android/exoplayer2/source/MediaSource;

    aget-object v4, v4, v0

    aput-object v3, v4, v1

    .line 341
    iget-object v4, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->deferredMediaPeriodByAdMediaSource:Ljava/util/Map;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    invoke-virtual {p0, p1, v3}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->prepareChildSource(Ljava/lang/Object;Lcom/google/android/exoplayer2/source/MediaSource;)V

    .line 344
    :cond_1
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adGroupMediaSources:[[Lcom/google/android/exoplayer2/source/MediaSource;

    aget-object v3, v3, v0

    aget-object v3, v3, v1

    .line 345
    new-instance v4, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;

    new-instance v5, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;

    const/4 v6, 0x0

    iget-wide v7, p1, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    invoke-direct {v5, v6, v7, v8}, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;-><init>(IJ)V

    invoke-direct {v4, v3, v5, p2}, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;-><init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/upstream/Allocator;)V

    .line 350
    new-instance p1, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$AdPrepareErrorListener;

    invoke-direct {p1, p0, v2, v0, v1}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$AdPrepareErrorListener;-><init>(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;Landroid/net/Uri;II)V

    invoke-virtual {v4, p1}, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->setPrepareErrorListener(Lcom/google/android/exoplayer2/source/DeferredMediaPeriod$PrepareErrorListener;)V

    .line 352
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->deferredMediaPeriodByAdMediaSource:Ljava/util/Map;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_2

    .line 354
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->createPeriod()V

    goto :goto_0

    .line 358
    :cond_2
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    return-object v4

    .line 362
    :cond_3
    new-instance v0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentMediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    invoke-direct {v0, v1, p1, p2}, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;-><init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/upstream/Allocator;)V

    .line 363
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->createPeriod()V

    return-object v0
.end method

.method protected getMediaPeriodIdForChildMediaPeriodId(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;
    .locals 1

    .line 418
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->isAd()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method protected bridge synthetic getMediaPeriodIdForChildMediaPeriodId(Ljava/lang/Object;Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;
    .locals 0

    .line 50
    check-cast p1, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->getMediaPeriodIdForChildMediaPeriodId(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;

    move-result-object p1

    return-object p1
.end method

.method protected onChildSourceInfoRefreshed(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;)V
    .locals 1

    .line 404
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->isAd()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 405
    iget p4, p1, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 406
    iget p1, p1, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 407
    invoke-direct {p0, p2, p4, p1, p3}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->onAdSourceInfoRefreshed(Lcom/google/android/exoplayer2/source/MediaSource;IILcom/google/android/exoplayer2/Timeline;)V

    goto :goto_0

    .line 409
    :cond_0
    invoke-direct {p0, p3, p4}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->onContentSourceInfoRefreshed(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic onChildSourceInfoRefreshed(Ljava/lang/Object;Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;)V
    .locals 0

    .line 50
    check-cast p1, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->onChildSourceInfoRefreshed(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;)V

    return-void
.end method

.method public prepareSourceInternal(Lcom/google/android/exoplayer2/ExoPlayer;Z)V
    .locals 2

    .line 311
    invoke-super {p0, p1, p2}, Lcom/google/android/exoplayer2/source/CompositeMediaSource;->prepareSourceInternal(Lcom/google/android/exoplayer2/ExoPlayer;Z)V

    .line 312
    invoke-static {p2}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    .line 313
    new-instance p2, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$ComponentListener;

    invoke-direct {p2, p0}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$ComponentListener;-><init>(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;)V

    .line 314
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->componentListener:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$ComponentListener;

    .line 315
    new-instance v0, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentMediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->prepareChildSource(Ljava/lang/Object;Lcom/google/android/exoplayer2/source/MediaSource;)V

    .line 316
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$1;-><init>(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;Lcom/google/android/exoplayer2/ExoPlayer;Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$ComponentListener;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public releasePeriod(Lcom/google/android/exoplayer2/source/MediaPeriod;)V
    .locals 2

    .line 370
    check-cast p1, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;

    .line 371
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->deferredMediaPeriodByAdMediaSource:Ljava/util/Map;

    iget-object v1, p1, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    .line 372
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 374
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 376
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->releasePeriod()V

    return-void
.end method

.method public releaseSourceInternal()V
    .locals 2

    .line 381
    invoke-super {p0}, Lcom/google/android/exoplayer2/source/CompositeMediaSource;->releaseSourceInternal()V

    .line 382
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->componentListener:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$ComponentListener;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$ComponentListener;->release()V

    const/4 v0, 0x0

    .line 383
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->componentListener:Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$ComponentListener;

    .line 384
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->deferredMediaPeriodByAdMediaSource:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 385
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentTimeline:Lcom/google/android/exoplayer2/Timeline;

    .line 386
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->contentManifest:Ljava/lang/Object;

    .line 387
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adPlaybackState:Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;

    const/4 v0, 0x0

    new-array v1, v0, [[Lcom/google/android/exoplayer2/source/MediaSource;

    .line 388
    iput-object v1, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adGroupMediaSources:[[Lcom/google/android/exoplayer2/source/MediaSource;

    new-array v0, v0, [[J

    .line 389
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->adDurationsUs:[[J

    .line 390
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$2;

    invoke-direct {v1, p0}, Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$2;-><init>(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
