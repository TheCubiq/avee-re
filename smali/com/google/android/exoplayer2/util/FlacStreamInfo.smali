.class public final Lcom/google/android/exoplayer2/util/FlacStreamInfo;
.super Ljava/lang/Object;
.source "FlacStreamInfo.java"


# instance fields
.field public final bitsPerSample:I

.field public final channels:I

.field public final maxBlockSize:I

.field public final maxFrameSize:I

.field public final minBlockSize:I

.field public final minFrameSize:I

.field public final sampleRate:I

.field public final totalSamples:J


# direct methods
.method public constructor <init>(IIIIIIIJ)V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput p1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->minBlockSize:I

    .line 81
    iput p2, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->maxBlockSize:I

    .line 82
    iput p3, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->minFrameSize:I

    .line 83
    iput p4, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->maxFrameSize:I

    .line 84
    iput p5, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->sampleRate:I

    .line 85
    iput p6, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->channels:I

    .line 86
    iput p7, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->bitsPerSample:I

    .line 87
    iput-wide p8, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->totalSamples:J

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 4

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Lcom/google/android/exoplayer2/util/ParsableBitArray;

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;-><init>([B)V

    mul-int/lit8 p2, p2, 0x8

    .line 44
    invoke-virtual {v0, p2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->setPosition(I)V

    const/16 p1, 0x10

    .line 45
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->minBlockSize:I

    .line 46
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->maxBlockSize:I

    const/16 p1, 0x18

    .line 47
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->minFrameSize:I

    .line 48
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->maxFrameSize:I

    const/16 p1, 0x14

    .line 49
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->sampleRate:I

    const/4 p1, 0x3

    .line 50
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->channels:I

    const/4 p1, 0x5

    .line 51
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->bitsPerSample:I

    const/4 p1, 0x4

    .line 52
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result p1

    int-to-long p1, p1

    const-wide/16 v1, 0xf

    and-long/2addr p1, v1

    const/16 v1, 0x20

    shl-long/2addr p1, v1

    .line 53
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->totalSamples:J

    return-void
.end method


# virtual methods
.method public bitRate()I
    .locals 2

    .line 97
    iget v0, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->bitsPerSample:I

    iget v1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->sampleRate:I

    mul-int v0, v0, v1

    return v0
.end method

.method public durationUs()J
    .locals 4

    .line 102
    iget-wide v0, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->totalSamples:J

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    iget v2, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->sampleRate:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public getApproxBytesPerFrame()J
    .locals 4

    .line 119
    iget v0, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->maxFrameSize:I

    if-lez v0, :cond_0

    int-to-long v0, v0

    .line 120
    iget v2, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->minFrameSize:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v0, v2

    goto :goto_2

    .line 124
    :cond_0
    iget v0, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->minBlockSize:I

    iget v1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->maxBlockSize:I

    if-ne v0, v1, :cond_1

    if-lez v0, :cond_1

    int-to-long v0, v0

    goto :goto_1

    :cond_1
    const-wide/16 v0, 0x1000

    .line 125
    :goto_1
    iget v2, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->channels:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    iget v2, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->bitsPerSample:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    const-wide/16 v2, 0x8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x40

    goto :goto_0

    :goto_2
    return-wide v0
.end method

.method public getSampleIndex(J)J
    .locals 8

    .line 112
    iget v0, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->sampleRate:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    const-wide/32 v0, 0xf4240

    div-long v2, p1, v0

    .line 113
    iget-wide p1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->totalSamples:J

    const-wide/16 v0, 0x1

    sub-long v6, p1, v0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public maxDecodedFrameSize()I
    .locals 2

    .line 92
    iget v0, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->maxBlockSize:I

    iget v1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->channels:I

    mul-int v0, v0, v1

    iget v1, p0, Lcom/google/android/exoplayer2/util/FlacStreamInfo;->bitsPerSample:I

    div-int/lit8 v1, v1, 0x8

    mul-int v0, v0, v1

    return v0
.end method
