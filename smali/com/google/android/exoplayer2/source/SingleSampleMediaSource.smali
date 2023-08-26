.class public final Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;
.super Lcom/google/android/exoplayer2/source/BaseMediaSource;
.source "SingleSampleMediaSource.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListenerWrapper;,
        Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$Factory;,
        Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListener;
    }
.end annotation


# static fields
.field public static final DEFAULT_MIN_LOADABLE_RETRY_COUNT:I = 0x3


# instance fields
.field private final dataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field private final dataSpec:Lcom/google/android/exoplayer2/upstream/DataSpec;

.field private final durationUs:J

.field private final format:Lcom/google/android/exoplayer2/Format;

.field private final minLoadableRetryCount:I

.field private final timeline:Lcom/google/android/exoplayer2/Timeline;

.field private final treatLoadErrorsAsEndOfStream:Z


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;J)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v6, 0x3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    .line 182
    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;JI)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;JI)V
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    move v6, p6

    .line 201
    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;JIZLjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;JILandroid/os/Handler;Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListener;IZ)V
    .locals 11
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object/from16 v0, p7

    move-object/from16 v1, p8

    const/4 v10, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, p4

    move/from16 v8, p6

    move/from16 v9, p10

    .line 237
    invoke-direct/range {v2 .. v10}, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;JIZLjava/lang/Object;)V

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 246
    new-instance v2, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListenerWrapper;

    move/from16 v3, p9

    invoke-direct {v2, v1, v3}, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListenerWrapper;-><init>(Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListener;I)V

    move-object v1, p0

    invoke-virtual {p0, v0, v2}, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->addEventListener(Landroid/os/Handler;Lcom/google/android/exoplayer2/source/MediaSourceEventListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    return-void
.end method

.method private constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;JIZLjava/lang/Object;)V
    .locals 6

    .line 257
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/BaseMediaSource;-><init>()V

    .line 258
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->dataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 259
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->format:Lcom/google/android/exoplayer2/Format;

    .line 260
    iput-wide p4, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->durationUs:J

    .line 261
    iput p6, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->minLoadableRetryCount:I

    .line 262
    iput-boolean p7, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->treatLoadErrorsAsEndOfStream:Z

    .line 263
    new-instance p2, Lcom/google/android/exoplayer2/upstream/DataSpec;

    invoke-direct {p2, p1}, Lcom/google/android/exoplayer2/upstream/DataSpec;-><init>(Landroid/net/Uri;)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->dataSpec:Lcom/google/android/exoplayer2/upstream/DataSpec;

    .line 264
    new-instance p1, Lcom/google/android/exoplayer2/source/SinglePeriodTimeline;

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v0, p1

    move-wide v1, p4

    move-object v5, p8

    invoke-direct/range {v0 .. v5}, Lcom/google/android/exoplayer2/source/SinglePeriodTimeline;-><init>(JZZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->timeline:Lcom/google/android/exoplayer2/Timeline;

    return-void
.end method

.method synthetic constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;JIZLjava/lang/Object;Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$1;)V
    .locals 0

    .line 33
    invoke-direct/range {p0 .. p8}, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;JIZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public createPeriod(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/upstream/Allocator;)Lcom/google/android/exoplayer2/source/MediaPeriod;
    .locals 9

    .line 282
    iget p2, p1, Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;->periodIndex:I

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    .line 283
    new-instance p2, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->dataSpec:Lcom/google/android/exoplayer2/upstream/DataSpec;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->dataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->format:Lcom/google/android/exoplayer2/Format;

    iget-wide v4, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->durationUs:J

    iget v6, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->minLoadableRetryCount:I

    .line 289
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->createEventDispatcher(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)Lcom/google/android/exoplayer2/source/MediaSourceEventListener$EventDispatcher;

    move-result-object v7

    iget-boolean v8, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->treatLoadErrorsAsEndOfStream:Z

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod;-><init>(Lcom/google/android/exoplayer2/upstream/DataSpec;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/Format;JILcom/google/android/exoplayer2/source/MediaSourceEventListener$EventDispatcher;Z)V

    return-object p2
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

.method public prepareSourceInternal(Lcom/google/android/exoplayer2/ExoPlayer;Z)V
    .locals 0

    .line 272
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->timeline:Lcom/google/android/exoplayer2/Timeline;

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;->refreshSourceInfo(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;)V

    return-void
.end method

.method public releasePeriod(Lcom/google/android/exoplayer2/source/MediaPeriod;)V
    .locals 0

    .line 295
    check-cast p1, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod;->release()V

    return-void
.end method

.method public releaseSourceInternal()V
    .locals 0

    return-void
.end method
