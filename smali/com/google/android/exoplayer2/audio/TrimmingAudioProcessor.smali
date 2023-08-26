.class final Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;
.super Ljava/lang/Object;
.source "TrimmingAudioProcessor.java"

# interfaces
.implements Lcom/google/android/exoplayer2/audio/AudioProcessor;


# instance fields
.field private buffer:Ljava/nio/ByteBuffer;

.field private channelCount:I

.field private endBuffer:[B

.field private endBufferSize:I

.field private inputEnded:Z

.field private isActive:Z

.field private outputBuffer:Ljava/nio/ByteBuffer;

.field private pendingTrimStartBytes:I

.field private sampleRateHz:I

.field private trimEndFrames:I

.field private trimStartFrames:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    sget-object v0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    .line 44
    sget-object v0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    .line 45
    iput v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->channelCount:I

    .line 46
    iput v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->sampleRateHz:I

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 47
    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBuffer:[B

    return-void
.end method


# virtual methods
.method public configure(III)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioProcessor$UnhandledFormatException;
        }
    .end annotation

    const/4 v0, 0x2

    if-ne p3, v0, :cond_3

    .line 70
    iput p2, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->channelCount:I

    .line 71
    iput p1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->sampleRateHz:I

    .line 72
    iget p1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->trimEndFrames:I

    mul-int p3, p1, p2

    mul-int/lit8 p3, p3, 0x2

    new-array p3, p3, [B

    iput-object p3, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBuffer:[B

    const/4 p3, 0x0

    .line 73
    iput p3, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBufferSize:I

    .line 74
    iget v1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->trimStartFrames:I

    mul-int p2, p2, v1

    mul-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->pendingTrimStartBytes:I

    .line 75
    iget-boolean p2, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->isActive:Z

    const/4 v0, 0x1

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 76
    :goto_1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->isActive:Z

    if-eq p2, p1, :cond_2

    const/4 p3, 0x1

    :cond_2
    return p3

    .line 68
    :cond_3
    new-instance v0, Lcom/google/android/exoplayer2/audio/AudioProcessor$UnhandledFormatException;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/audio/AudioProcessor$UnhandledFormatException;-><init>(III)V

    throw v0
.end method

.method public flush()V
    .locals 1

    .line 169
    sget-object v0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    .line 170
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->inputEnded:Z

    .line 173
    iput v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->pendingTrimStartBytes:I

    .line 174
    iput v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBufferSize:I

    return-void
.end method

.method public getOutput()Ljava/nio/ByteBuffer;
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 157
    sget-object v1, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getOutputChannelCount()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->channelCount:I

    return v0
.end method

.method public getOutputEncoding()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public getOutputSampleRateHz()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->sampleRateHz:I

    return v0
.end method

.method public isActive()Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->isActive:Z

    return v0
.end method

.method public isEnded()Z
    .locals 2

    .line 164
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->inputEnded:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

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

    .line 151
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->inputEnded:Z

    return-void
.end method

.method public queueInput(Ljava/nio/ByteBuffer;)V
    .locals 7

    .line 102
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    .line 103
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    sub-int v2, v1, v0

    .line 107
    iget v3, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->pendingTrimStartBytes:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 108
    iget v4, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->pendingTrimStartBytes:I

    sub-int/2addr v4, v3

    iput v4, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->pendingTrimStartBytes:I

    add-int/2addr v0, v3

    .line 109
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 110
    iget v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->pendingTrimStartBytes:I

    if-lez v0, :cond_0

    return-void

    :cond_0
    sub-int/2addr v2, v3

    .line 120
    iget v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBufferSize:I

    add-int/2addr v0, v2

    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBuffer:[B

    array-length v3, v3

    sub-int/2addr v0, v3

    .line 121
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    if-ge v3, v0, :cond_1

    .line 122
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 124
    :cond_1
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 128
    :goto_0
    iget v3, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBufferSize:I

    const/4 v4, 0x0

    invoke-static {v0, v4, v3}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v3

    .line 129
    iget-object v5, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    iget-object v6, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBuffer:[B

    invoke-virtual {v5, v6, v4, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v0, v3

    .line 133
    invoke-static {v0, v4, v2}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v0

    .line 134
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v5

    add-int/2addr v5, v0

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 135
    iget-object v5, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 136
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    sub-int/2addr v2, v0

    .line 140
    iget v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBufferSize:I

    sub-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBufferSize:I

    .line 141
    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBuffer:[B

    invoke-static {v1, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBuffer:[B

    iget v1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBufferSize:I

    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 143
    iget p1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBufferSize:I

    add-int/2addr p1, v2

    iput p1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBufferSize:I

    .line 145
    iget-object p1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 146
    iget-object p1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->outputBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public reset()V
    .locals 1

    .line 179
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->flush()V

    .line 180
    sget-object v0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->buffer:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    .line 181
    iput v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->channelCount:I

    .line 182
    iput v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->sampleRateHz:I

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 183
    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->endBuffer:[B

    return-void
.end method

.method public setTrimFrameCount(II)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->trimStartFrames:I

    .line 61
    iput p2, p0, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->trimEndFrames:I

    return-void
.end method
