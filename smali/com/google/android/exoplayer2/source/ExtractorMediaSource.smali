.class public final Lcom/google/android/exoplayer2/source/ExtractorMediaSource;
.super Lcom/google/android/exoplayer2/source/BaseMediaSource;
.source "ExtractorMediaSource.java"

# interfaces
.implements Lcom/google/android/exoplayer2/source/ExtractorMediaPeriod$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListenerWrapper;,
        Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;,
        Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListener;
    }
.end annotation


# static fields
.field public static final DEFAULT_LOADING_CHECK_INTERVAL_BYTES:I = 0x100000

.field public static final DEFAULT_MIN_LOADABLE_RETRY_COUNT_LIVE:I = 0x6

.field public static final DEFAULT_MIN_LOADABLE_RETRY_COUNT_ON_DEMAND:I = 0x3

.field public static final MIN_RETRY_COUNT_DEFAULT_FOR_MEDIA:I = -0x1


# instance fields
.field private final continueLoadingCheckIntervalBytes:I

.field private final customCacheKey:Ljava/lang/String;

.field private final dataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field private final extractorsFactory:Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;

.field private final minLoadableRetryCount:I

.field private final tag:Ljava/lang/Object;

.field private timelineDurationUs:J

.field private timelineIsSeekable:Z

.field private final uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;ILandroid/os/Handler;Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListener;Ljava/lang/String;I)V
    .locals 10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object v0, p5

    move-object/from16 v1, p6

    const/4 v9, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move-object/from16 v7, p7

    move/from16 v8, p8

    .line 315
    invoke-direct/range {v2 .. v9}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;ILjava/lang/String;ILjava/lang/Object;)V

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 324
    new-instance v2, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListenerWrapper;

    invoke-direct {v2, v1}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListenerWrapper;-><init>(Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListener;)V

    move-object v1, p0

    invoke-virtual {p0, p5, v2}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->addEventListener(Landroid/os/Handler;Lcom/google/android/exoplayer2/source/MediaSourceEventListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    return-void
.end method

.method private constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;ILjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 335
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/BaseMediaSource;-><init>()V

    .line 336
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->uri:Landroid/net/Uri;

    .line 337
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->dataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 338
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->extractorsFactory:Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;

    .line 339
    iput p4, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->minLoadableRetryCount:I

    .line 340
    iput-object p5, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->customCacheKey:Ljava/lang/String;

    .line 341
    iput p6, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->continueLoadingCheckIntervalBytes:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 342
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->timelineDurationUs:J

    .line 343
    iput-object p7, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->tag:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;ILjava/lang/String;ILjava/lang/Object;Lcom/google/android/exoplayer2/source/ExtractorMediaSource$1;)V
    .locals 0

    .line 44
    invoke-direct/range {p0 .. p7}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;ILjava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;Landroid/os/Handler;Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListener;)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 263
    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;Landroid/os/Handler;Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListener;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;Landroid/os/Handler;Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListener;Ljava/lang/String;)V
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v4, -0x1

    const/high16 v8, 0x100000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 286
    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;ILandroid/os/Handler;Lcom/google/android/exoplayer2/source/ExtractorMediaSource$EventListener;Ljava/lang/String;I)V

    return-void
.end method

.method private notifySourceInfoRefreshed(JZ)V
    .locals 6

    .line 397
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->timelineDurationUs:J

    .line 398
    iput-boolean p3, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->timelineIsSeekable:Z

    .line 400
    new-instance p1, Lcom/google/android/exoplayer2/source/SinglePeriodTimeline;

    iget-wide v1, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->timelineDurationUs:J

    iget-boolean v3, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->timelineIsSeekable:Z

    iget-object v5, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->tag:Ljava/lang/Object;

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/exoplayer2/source/SinglePeriodTimeline;-><init>(JZZLjava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->refreshSourceInfo(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public createPeriod(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/upstream/Allocator;)Lcom/google/android/exoplayer2/source/MediaPeriod;
    .locals 11

    .line 358
    iget v0, p1, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->periodIndex:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    .line 359
    new-instance v0, Lcom/google/android/exoplayer2/source/ExtractorMediaPeriod;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->uri:Landroid/net/Uri;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->dataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 361
    invoke-interface {v1}, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;->createDataSource()Lcom/google/android/exoplayer2/upstream/DataSource;

    move-result-object v3

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->extractorsFactory:Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;

    .line 362
    invoke-interface {v1}, Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;->createExtractors()[Lcom/google/android/exoplayer2/extractor/Extractor;

    move-result-object v4

    iget v5, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->minLoadableRetryCount:I

    .line 364
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->createEventDispatcher(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)Lcom/google/android/exoplayer2/source/MediaSourceEventListener$EventDispatcher;

    move-result-object v6

    iget-object v9, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->customCacheKey:Ljava/lang/String;

    iget v10, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->continueLoadingCheckIntervalBytes:I

    move-object v1, v0

    move-object v7, p0

    move-object v8, p2

    invoke-direct/range {v1 .. v10}, Lcom/google/android/exoplayer2/source/ExtractorMediaPeriod;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource;[Lcom/google/android/exoplayer2/extractor/Extractor;ILcom/google/android/exoplayer2/source/MediaSourceEventListener$EventDispatcher;Lcom/google/android/exoplayer2/source/ExtractorMediaPeriod$Listener;Lcom/google/android/exoplayer2/upstream/Allocator;Ljava/lang/String;I)V

    return-object v0
.end method

.method public maybeThrowSourceInfoRefreshError()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public onSourceInfoRefreshed(JZ)V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 386
    iget-wide p1, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->timelineDurationUs:J

    .line 387
    :cond_0
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->timelineDurationUs:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->timelineIsSeekable:Z

    if-ne v0, p3, :cond_1

    return-void

    .line 391
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->notifySourceInfoRefreshed(JZ)V

    return-void
.end method

.method public prepareSourceInternal(Lcom/google/android/exoplayer2/ExoPlayer;Z)V
    .locals 1

    .line 348
    iget-wide p1, p0, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->timelineDurationUs:J

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource;->notifySourceInfoRefreshed(JZ)V

    return-void
.end method

.method public releasePeriod(Lcom/google/android/exoplayer2/source/MediaPeriod;)V
    .locals 0

    .line 373
    check-cast p1, Lcom/google/android/exoplayer2/source/ExtractorMediaPeriod;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/ExtractorMediaPeriod;->release()V

    return-void
.end method

.method public releaseSourceInternal()V
    .locals 0

    return-void
.end method
