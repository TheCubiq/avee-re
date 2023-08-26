.class public final Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;
.super Ljava/lang/Object;
.source "DeferredMediaPeriod.java"

# interfaces
.implements Lcom/google/android/exoplayer2/source/MediaPeriod;
.implements Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/DeferredMediaPeriod$PrepareErrorListener;
    }
.end annotation


# instance fields
.field private final allocator:Lcom/google/android/exoplayer2/upstream/Allocator;

.field private callback:Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;

.field public final id:Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;

.field private listener:Lcom/google/android/exoplayer2/source/DeferredMediaPeriod$PrepareErrorListener;

.field private mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

.field public final mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

.field private notifiedPrepareError:Z

.field private preparePositionOverrideUs:J

.field private preparePositionUs:J


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/MediaSource;Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/upstream/Allocator;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->id:Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;

    .line 64
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->allocator:Lcom/google/android/exoplayer2/upstream/Allocator;

    .line 65
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 66
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->preparePositionOverrideUs:J

    return-void
.end method


# virtual methods
.method public continueLoading(J)Z
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/google/android/exoplayer2/source/MediaPeriod;->continueLoading(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public createPeriod()V
    .locals 3

    .line 105
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->id:Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->allocator:Lcom/google/android/exoplayer2/upstream/Allocator;

    invoke-interface {v0, v1, v2}, Lcom/google/android/exoplayer2/source/MediaSource;->createPeriod(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/upstream/Allocator;)Lcom/google/android/exoplayer2/source/MediaPeriod;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    .line 106
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->callback:Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;

    if-eqz v1, :cond_0

    .line 107
    iget-wide v1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->preparePositionUs:J

    invoke-interface {v0, p0, v1, v2}, Lcom/google/android/exoplayer2/source/MediaPeriod;->prepare(Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;J)V

    :cond_0
    return-void
.end method

.method public discardBuffer(JZ)V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/MediaPeriod;->discardBuffer(JZ)V

    return-void
.end method

.method public getAdjustedSeekPositionUs(JLcom/google/android/exoplayer2/SeekParameters;)J
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/MediaPeriod;->getAdjustedSeekPositionUs(JLcom/google/android/exoplayer2/SeekParameters;)J

    move-result-wide p1

    return-wide p1
.end method

.method public getBufferedPositionUs()J
    .locals 2

    .line 176
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/MediaPeriod;->getBufferedPositionUs()J

    move-result-wide v0

    return-wide v0
.end method

.method public getNextLoadPositionUs()J
    .locals 2

    .line 191
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/MediaPeriod;->getNextLoadPositionUs()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTrackGroups()Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/MediaPeriod;->getTrackGroups()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-result-object v0

    return-object v0
.end method

.method public maybeThrowPrepareError()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 132
    :try_start_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/MediaPeriod;->maybeThrowPrepareError()V

    goto :goto_0

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/MediaSource;->maybeThrowSourceInfoRefreshError()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 138
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->listener:Lcom/google/android/exoplayer2/source/DeferredMediaPeriod$PrepareErrorListener;

    if-eqz v1, :cond_2

    .line 141
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->notifiedPrepareError:Z

    if-nez v2, :cond_1

    const/4 v2, 0x1

    .line 142
    iput-boolean v2, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->notifiedPrepareError:Z

    .line 143
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->id:Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;

    invoke-interface {v1, v2, v0}, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod$PrepareErrorListener;->onPrepareError(Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Ljava/io/IOException;)V

    :cond_1
    :goto_0
    return-void

    .line 139
    :cond_2
    throw v0
.end method

.method public onContinueLoadingRequested(Lcom/google/android/exoplayer2/source/MediaPeriod;)V
    .locals 0

    .line 206
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->callback:Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;->onContinueLoadingRequested(Lcom/google/android/exoplayer2/source/SequenceableLoader;)V

    return-void
.end method

.method public bridge synthetic onContinueLoadingRequested(Lcom/google/android/exoplayer2/source/SequenceableLoader;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->onContinueLoadingRequested(Lcom/google/android/exoplayer2/source/MediaPeriod;)V

    return-void
.end method

.method public onPrepared(Lcom/google/android/exoplayer2/source/MediaPeriod;)V
    .locals 0

    .line 213
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->callback:Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;->onPrepared(Lcom/google/android/exoplayer2/source/MediaPeriod;)V

    return-void
.end method

.method public prepare(Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;J)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->callback:Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;

    .line 123
    iput-wide p2, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->preparePositionUs:J

    .line 124
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    if-eqz p1, :cond_0

    .line 125
    invoke-interface {p1, p0, p2, p3}, Lcom/google/android/exoplayer2/source/MediaPeriod;->prepare(Lcom/google/android/exoplayer2/source/MediaPeriod$Callback;J)V

    :cond_0
    return-void
.end method

.method public readDiscontinuity()J
    .locals 2

    .line 171
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/MediaPeriod;->readDiscontinuity()J

    move-result-wide v0

    return-wide v0
.end method

.method public reevaluateBuffer(J)V
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-interface {v0, p1, p2}, Lcom/google/android/exoplayer2/source/MediaPeriod;->reevaluateBuffer(J)V

    return-void
.end method

.method public releasePeriod()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    if-eqz v0, :cond_0

    .line 116
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    invoke-interface {v1, v0}, Lcom/google/android/exoplayer2/source/MediaSource;->releasePeriod(Lcom/google/android/exoplayer2/source/MediaPeriod;)V

    :cond_0
    return-void
.end method

.method public seekToUs(J)J
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    invoke-interface {v0, p1, p2}, Lcom/google/android/exoplayer2/source/MediaPeriod;->seekToUs(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public selectTracks([Lcom/google/android/exoplayer2/trackselection/TrackSelection;[Z[Lcom/google/android/exoplayer2/source/SampleStream;[ZJ)J
    .locals 15

    move-object v0, p0

    .line 156
    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->preparePositionOverrideUs:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const-wide/16 v5, 0x0

    cmp-long v7, p5, v5

    if-nez v7, :cond_0

    .line 158
    iput-wide v3, v0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->preparePositionOverrideUs:J

    move-wide v13, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v13, p5

    .line 160
    :goto_0
    iget-object v8, v0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->mediaPeriod:Lcom/google/android/exoplayer2/source/MediaPeriod;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    invoke-interface/range {v8 .. v14}, Lcom/google/android/exoplayer2/source/MediaPeriod;->selectTracks([Lcom/google/android/exoplayer2/trackselection/TrackSelection;[Z[Lcom/google/android/exoplayer2/source/SampleStream;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public setDefaultPreparePositionUs(J)V
    .locals 5

    .line 93
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->preparePositionUs:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    cmp-long v0, p1, v2

    if-eqz v0, :cond_0

    .line 94
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->preparePositionOverrideUs:J

    .line 95
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->preparePositionUs:J

    :cond_0
    return-void
.end method

.method public setPrepareErrorListener(Lcom/google/android/exoplayer2/source/DeferredMediaPeriod$PrepareErrorListener;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/DeferredMediaPeriod;->listener:Lcom/google/android/exoplayer2/source/DeferredMediaPeriod$PrepareErrorListener;

    return-void
.end method
