.class public Lcom/daaw/avee/comp/playback/AudioFrameData;
.super Ljava/lang/Object;
.source "AudioFrameData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/AudioFrameData$Request;,
        Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;
    }
.end annotation


# instance fields
.field public availableBuffersEndPositionUs:J

.field public availableBuffersStartPositionUs:J

.field private buffSize:I

.field private buffSizeForCapture:I

.field private buffSizeForTime:I

.field public captureSamplesCount:I

.field public capturedDataFully:Z

.field public capturedDataPositionEndUs:J

.field public capturedDataPositionUs:J

.field public doubleDataRate:Z

.field public exoDataTimePositionUs:J

.field public exoDataUse:Z

.field public maxPcmValue:S

.field public minPcmValue:S

.field public newestAvailableBufferPositionUs:J

.field public pcmBuffer:[S

.field public pcmBufferChannelCount:I

.field public rms:F

.field public sampleRate:I

.field public valid:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->valid:Z

    .line 48
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataFully:Z

    const/4 v1, 0x1

    .line 62
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->doubleDataRate:Z

    .line 65
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->valid:Z

    const/4 v2, 0x2

    new-array v3, v2, [S

    .line 66
    iput-object v3, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    const/4 v3, 0x0

    .line 67
    iput v3, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->rms:F

    const v3, 0xac44

    .line 68
    invoke-virtual {p0, v3, v1, v2, v0}, Lcom/daaw/avee/comp/playback/AudioFrameData;->init(IIII)V

    return-void
.end method

.method public static pcmAsDesiredChannelCount(III[S)Lcom/daaw/avee/Common/ISimpleListShort;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 154
    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsMono(II[S)Lcom/daaw/avee/Common/ISimpleListShort;

    move-result-object p0

    return-object p0

    .line 157
    :cond_0
    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsStereo(II[S)Lcom/daaw/avee/Common/ISimpleListShort;

    move-result-object p0

    return-object p0
.end method

.method public static pcmAsMono(II[S)Lcom/daaw/avee/Common/ISimpleListShort;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 165
    array-length p1, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    .line 167
    new-instance p1, Lcom/daaw/avee/comp/playback/AudioFrameData$1;

    invoke-direct {p1, p0, p2}, Lcom/daaw/avee/comp/playback/AudioFrameData$1;-><init>(I[S)V

    return-object p1

    .line 180
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/playback/AudioFrameData$2;

    invoke-direct {v0, p0, p2, p1}, Lcom/daaw/avee/comp/playback/AudioFrameData$2;-><init>(I[SI)V

    return-object v0
.end method

.method public static pcmAsMonoD(II[S)Lcom/daaw/avee/Common/ISimpleListShort;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 232
    array-length p1, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    .line 233
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    .line 235
    new-instance p1, Lcom/daaw/avee/comp/playback/AudioFrameData$5;

    invoke-direct {p1, p0, p2}, Lcom/daaw/avee/comp/playback/AudioFrameData$5;-><init>(I[S)V

    return-object p1

    .line 249
    :cond_0
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    .line 251
    new-instance v0, Lcom/daaw/avee/comp/playback/AudioFrameData$6;

    invoke-direct {v0, p0, p2, p1}, Lcom/daaw/avee/comp/playback/AudioFrameData$6;-><init>(I[SI)V

    return-object v0
.end method

.method public static pcmAsStereo(II[S)Lcom/daaw/avee/Common/ISimpleListShort;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 200
    new-instance p1, Lcom/daaw/avee/comp/playback/AudioFrameData$3;

    invoke-direct {p1, p0, p2}, Lcom/daaw/avee/comp/playback/AudioFrameData$3;-><init>(I[S)V

    return-object p1

    .line 213
    :cond_0
    new-instance p1, Lcom/daaw/avee/comp/playback/AudioFrameData$4;

    invoke-direct {p1, p0, p2}, Lcom/daaw/avee/comp/playback/AudioFrameData$4;-><init>(I[S)V

    return-object p1
.end method


# virtual methods
.method public IsDoubleDataRate()Z
    .locals 1

    .line 112
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->doubleDataRate:Z

    return v0
.end method

.method public getBufferSizeForCapture()I
    .locals 1

    .line 118
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->buffSizeForCapture:I

    return v0
.end method

.method public getBufferSizeForFftResult()I
    .locals 1

    .line 124
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->buffSize:I

    return v0
.end method

.method public getBufferSizeForTimedResult()I
    .locals 1

    .line 130
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->buffSizeForTime:I

    return v0
.end method

.method public getPcmFrameAsMono(I)I
    .locals 2

    .line 135
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    iget v1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    mul-int p1, p1, v1

    aget-short p1, v0, p1

    return p1
.end method

.method public init(IIII)V
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 80
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/playback/AudioFrameData;->init(IIIIZ)V

    return-void
.end method

.method public init(IIIIZ)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 85
    :goto_0
    invoke-static {v2}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 86
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 87
    iput-boolean p5, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->doubleDataRate:Z

    .line 88
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->exoDataUse:Z

    .line 89
    iput p1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->sampleRate:I

    .line 90
    iput p2, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    .line 91
    iput p3, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->buffSize:I

    .line 92
    iput p4, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->buffSizeForTime:I

    .line 93
    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->buffSizeForCapture:I

    mul-int p1, p1, p2

    .line 97
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    array-length p2, p2

    if-eq p2, p1, :cond_1

    .line 98
    new-array p1, p1, [S

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    :cond_1
    const/16 p1, 0x7fff

    .line 106
    iput-short p1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->minPcmValue:S

    .line 107
    iput-short v1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    return-void
.end method

.method public initAsUseExoData(J)V
    .locals 1

    const/4 v0, 0x1

    .line 74
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->exoDataUse:Z

    .line 75
    iput-wide p1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->exoDataTimePositionUs:J

    return-void
.end method

.method public pcmAsDesiredChannelCount(II)Lcom/daaw/avee/Common/ISimpleListShort;
    .locals 2

    .line 149
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    invoke-static {p1, p2, v0, v1}, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsDesiredChannelCount(III[S)Lcom/daaw/avee/Common/ISimpleListShort;

    move-result-object p1

    return-object p1
.end method

.method public pcmAsMonoForFft()Lcom/daaw/avee/Common/ISimpleListShort;
    .locals 3

    .line 140
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->buffSize:I

    iget v1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsMono(II[S)Lcom/daaw/avee/Common/ISimpleListShort;

    move-result-object v0

    return-object v0
.end method

.method public pcmAsMonoForFft_DoubleDataRate()Lcom/daaw/avee/Common/ISimpleListShort;
    .locals 3

    .line 145
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->buffSize:I

    iget v1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsMonoD(II[S)Lcom/daaw/avee/Common/ISimpleListShort;

    move-result-object v0

    return-object v0
.end method
