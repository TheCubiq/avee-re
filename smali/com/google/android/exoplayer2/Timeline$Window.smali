.class public final Lcom/google/android/exoplayer2/Timeline$Window;
.super Ljava/lang/Object;
.source "Timeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/Timeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Window"
.end annotation


# instance fields
.field public defaultPositionUs:J

.field public durationUs:J

.field public firstPeriodIndex:I

.field public isDynamic:Z

.field public isSeekable:Z

.field public lastPeriodIndex:I

.field public positionInFirstPeriodUs:J

.field public presentationStartTimeMs:J

.field public tag:Ljava/lang/Object;

.field public windowStartTimeMs:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDefaultPositionMs()J
    .locals 2

    .line 208
    iget-wide v0, p0, Lcom/google/android/exoplayer2/Timeline$Window;->defaultPositionUs:J

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/C;->usToMs(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getDefaultPositionUs()J
    .locals 2

    .line 218
    iget-wide v0, p0, Lcom/google/android/exoplayer2/Timeline$Window;->defaultPositionUs:J

    return-wide v0
.end method

.method public getDurationMs()J
    .locals 2

    .line 225
    iget-wide v0, p0, Lcom/google/android/exoplayer2/Timeline$Window;->durationUs:J

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/C;->usToMs(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getDurationUs()J
    .locals 2

    .line 232
    iget-wide v0, p0, Lcom/google/android/exoplayer2/Timeline$Window;->durationUs:J

    return-wide v0
.end method

.method public getPositionInFirstPeriodMs()J
    .locals 2

    .line 240
    iget-wide v0, p0, Lcom/google/android/exoplayer2/Timeline$Window;->positionInFirstPeriodUs:J

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/C;->usToMs(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getPositionInFirstPeriodUs()J
    .locals 2

    .line 248
    iget-wide v0, p0, Lcom/google/android/exoplayer2/Timeline$Window;->positionInFirstPeriodUs:J

    return-wide v0
.end method

.method public set(Ljava/lang/Object;JJZZJJIIJ)Lcom/google/android/exoplayer2/Timeline$Window;
    .locals 0

    .line 188
    iput-object p1, p0, Lcom/google/android/exoplayer2/Timeline$Window;->tag:Ljava/lang/Object;

    .line 189
    iput-wide p2, p0, Lcom/google/android/exoplayer2/Timeline$Window;->presentationStartTimeMs:J

    .line 190
    iput-wide p4, p0, Lcom/google/android/exoplayer2/Timeline$Window;->windowStartTimeMs:J

    .line 191
    iput-boolean p6, p0, Lcom/google/android/exoplayer2/Timeline$Window;->isSeekable:Z

    .line 192
    iput-boolean p7, p0, Lcom/google/android/exoplayer2/Timeline$Window;->isDynamic:Z

    .line 193
    iput-wide p8, p0, Lcom/google/android/exoplayer2/Timeline$Window;->defaultPositionUs:J

    .line 194
    iput-wide p10, p0, Lcom/google/android/exoplayer2/Timeline$Window;->durationUs:J

    .line 195
    iput p12, p0, Lcom/google/android/exoplayer2/Timeline$Window;->firstPeriodIndex:I

    .line 196
    iput p13, p0, Lcom/google/android/exoplayer2/Timeline$Window;->lastPeriodIndex:I

    .line 197
    iput-wide p14, p0, Lcom/google/android/exoplayer2/Timeline$Window;->positionInFirstPeriodUs:J

    return-object p0
.end method
