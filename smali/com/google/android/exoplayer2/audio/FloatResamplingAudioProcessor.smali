.class final Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;
.super Ljava/lang/Object;
.source "FloatResamplingAudioProcessor.java"

# interfaces
.implements Lcom/google/android/exoplayer2/audio/AudioProcessor;


# static fields
.field private static final FLOAT_NAN_AS_INT:I

.field private static final PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR:D = 4.656612875245797E-10


# instance fields
.field private buffer:Ljava/nio/ByteBuffer;

.field private channelCount:I

.field private inputEnded:Z

.field private outputBuffer:Ljava/nio/ByteBuffer;

.field private sampleRateHz:I

.field private sourceEncoding:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 30
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    sput v0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->FLOAT_NAN_AS_INT:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 42
    iput v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sampleRateHz:I

    .line 43
    iput v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->channelCount:I

    const/4 v0, 0x0

    .line 44
    iput v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sourceEncoding:I

    .line 45
    sget-object v0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    .line 46
    sget-object v0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private static writePcm32BitFloat(ILjava/nio/ByteBuffer;)V
    .locals 4

    int-to-double v0, p0

    const-wide v2, 0x3e00000000200000L    # 4.656612875245797E-10

    .line 163
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-float p0, v0

    .line 164
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p0

    .line 165
    sget v0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->FLOAT_NAN_AS_INT:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    .line 166
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p0

    .line 168
    :cond_0
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public configure(III)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioProcessor$UnhandledFormatException;
        }
    .end annotation

    .line 52
    invoke-static {p3}, Lcom/google/android/exoplayer2/util/Util;->isEncodingHighResolutionIntegerPcm(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 55
    iget v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sampleRateHz:I

    if-ne v0, p1, :cond_0

    iget v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->channelCount:I

    if-ne v0, p2, :cond_0

    iget v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sourceEncoding:I

    if-ne v0, p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 60
    :cond_0
    iput p1, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sampleRateHz:I

    .line 61
    iput p2, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->channelCount:I

    .line 62
    iput p3, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sourceEncoding:I

    const/4 p1, 0x1

    return p1

    .line 53
    :cond_1
    new-instance v0, Lcom/google/android/exoplayer2/audio/AudioProcessor$UnhandledFormatException;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/audio/AudioProcessor$UnhandledFormatException;-><init>(III)V

    throw v0
.end method

.method public flush()V
    .locals 1

    .line 143
    sget-object v0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    .line 144
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->inputEnded:Z

    return-void
.end method

.method public getOutput()Ljava/nio/ByteBuffer;
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 131
    sget-object v1, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getOutputChannelCount()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->channelCount:I

    return v0
.end method

.method public getOutputEncoding()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public getOutputSampleRateHz()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sampleRateHz:I

    return v0
.end method

.method public isActive()Z
    .locals 1

    .line 68
    iget v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sourceEncoding:I

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Util;->isEncodingHighResolutionIntegerPcm(I)Z

    move-result v0

    return v0
.end method

.method public isEnded()Z
    .locals 2

    .line 138
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->inputEnded:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public queueEndOfStream()V
    .locals 1

    const/4 v0, 0x1

    .line 125
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->inputEnded:Z

    return-void
.end method

.method public queueInput(Ljava/nio/ByteBuffer;)V
    .locals 5

    .line 88
    iget v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sourceEncoding:I

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 89
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    .line 90
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    sub-int v3, v2, v1

    if-eqz v0, :cond_1

    goto :goto_1

    .line 93
    :cond_1
    div-int/lit8 v3, v3, 0x3

    mul-int/lit8 v3, v3, 0x4

    .line 94
    :goto_1
    iget-object v4, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v4

    if-ge v4, v3, :cond_2

    .line 95
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    goto :goto_2

    .line 97
    :cond_2
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :goto_2
    if-eqz v0, :cond_3

    :goto_3
    if-ge v1, v2, :cond_4

    .line 102
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v3, v1, 0x1

    .line 103
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v0, v3

    add-int/lit8 v3, v1, 0x2

    .line 104
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v0, v3

    add-int/lit8 v3, v1, 0x3

    .line 105
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x18

    or-int/2addr v0, v3

    .line 106
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    invoke-static {v0, v3}, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->writePcm32BitFloat(ILjava/nio/ByteBuffer;)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_3

    :cond_3
    :goto_4
    if-ge v1, v2, :cond_4

    .line 111
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v3, v1, 0x1

    .line 112
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v0, v3

    add-int/lit8 v3, v1, 0x2

    .line 113
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x18

    or-int/2addr v0, v3

    .line 114
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    invoke-static {v0, v3}, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->writePcm32BitFloat(ILjava/nio/ByteBuffer;)V

    add-int/lit8 v1, v1, 0x3

    goto :goto_4

    .line 118
    :cond_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 119
    iget-object p1, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 120
    iget-object p1, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public reset()V
    .locals 1

    .line 149
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->flush()V

    const/4 v0, -0x1

    .line 150
    iput v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sampleRateHz:I

    .line 151
    iput v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->channelCount:I

    const/4 v0, 0x0

    .line 152
    iput v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->sourceEncoding:I

    .line 153
    sget-object v0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    return-void
.end method
