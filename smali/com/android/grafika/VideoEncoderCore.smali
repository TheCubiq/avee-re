.class public Lcom/android/grafika/VideoEncoderCore;
.super Ljava/lang/Object;
.source "VideoEncoderCore.java"


# static fields
.field private static final MIME_TYPE:Ljava/lang/String; = "video/avc"

.field private static final TAG:Ljava/lang/String; = "VideoEncoderCore"

.field private static final VERBOSE:Z = false


# instance fields
.field private mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

.field private mEncoder:Landroid/media/MediaCodec;

.field private mInputSurface:Landroid/view/Surface;

.field private mMuxer:Landroid/media/MediaMuxer;

.field private mMuxerStarted:Z

.field private mTrackIndex:I


# direct methods
.method public constructor <init>(IIILjava/io/File;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v5, 0x1e

    const/4 v6, 0x5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 83
    invoke-direct/range {v0 .. v6}, Lcom/android/grafika/VideoEncoderCore;-><init>(IIILjava/io/File;II)V

    return-void
.end method

.method public constructor <init>(IIILjava/io/File;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object v0, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    const-string v0, "video/avc"

    .line 92
    invoke-static {v0, p1, p2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object p1

    const-string p2, "color-format"

    const v1, 0x7f000789

    .line 96
    invoke-virtual {p1, p2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p2, "bitrate"

    .line 98
    invoke-virtual {p1, p2, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p2, "frame-rate"

    .line 99
    invoke-virtual {p1, p2, p5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p2, "i-frame-interval"

    .line 100
    invoke-virtual {p1, p2, p6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 114
    invoke-static {v0}, Lcom/android/grafika/VideoEncoderCore;->selectCodec(Ljava/lang/String;)Landroid/media/MediaCodecInfo;

    move-result-object p2

    .line 115
    invoke-virtual {p2}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p2

    iput-object p2, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    const/4 p3, 0x0

    const/4 p5, 0x1

    .line 119
    invoke-virtual {p2, p1, p3, p3, p5}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 120
    iget-object p1, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object p1

    iput-object p1, p0, Lcom/android/grafika/VideoEncoderCore;->mInputSurface:Landroid/view/Surface;

    .line 121
    iget-object p1, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V

    .line 129
    new-instance p1, Landroid/media/MediaMuxer;

    invoke-virtual {p4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxer:Landroid/media/MediaMuxer;

    const/4 p1, -0x1

    .line 132
    iput p1, p0, Lcom/android/grafika/VideoEncoderCore;->mTrackIndex:I

    .line 133
    iput-boolean p3, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxerStarted:Z

    return-void
.end method

.method private static selectCodec(Ljava/lang/String;)Landroid/media/MediaCodecInfo;
    .locals 7

    .line 65
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 67
    invoke-static {v2}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v3

    .line 68
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    .line 71
    :cond_0
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 72
    :goto_1
    array-length v6, v4

    if-ge v5, v6, :cond_2

    .line 73
    aget-object v6, v4, v5

    invoke-virtual {v6, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public drainEncoder(Z)V
    .locals 8

    const-string v0, "VideoEncoderCore"

    if-eqz p1, :cond_0

    .line 181
    :try_start_0
    iget-object v1, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    .line 184
    :cond_0
    iget-object v1, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 186
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    iget-object v3, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    const-wide/16 v4, 0x2710

    invoke-virtual {v2, v3, v4, v5}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    if-nez p1, :cond_1

    goto/16 :goto_2

    :cond_2
    const/4 v3, -0x3

    if-ne v2, v3, :cond_3

    .line 196
    iget-object v1, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v1

    goto :goto_0

    :cond_3
    const/4 v3, -0x2

    if-ne v2, v3, :cond_5

    .line 199
    iget-boolean v2, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxerStarted:Z

    if-nez v2, :cond_4

    .line 202
    iget-object v2, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v2

    .line 203
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encoder output format changed: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    iget-object v3, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxer:Landroid/media/MediaMuxer;

    invoke-virtual {v3, v2}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v2

    iput v2, p0, Lcom/android/grafika/VideoEncoderCore;->mTrackIndex:I

    .line 207
    iget-object v2, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxer:Landroid/media/MediaMuxer;

    invoke-virtual {v2}, Landroid/media/MediaMuxer;->start()V

    const/4 v2, 0x1

    .line 208
    iput-boolean v2, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxerStarted:Z

    goto :goto_0

    .line 200
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v1, "format changed twice"

    invoke-direct {p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    if-gez v2, :cond_6

    .line 210
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unexpected result from encoder.dequeueOutputBuffer: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 214
    :cond_6
    aget-object v3, v1, v2

    if-eqz v3, :cond_a

    .line 220
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v4, v4, 0x2

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    .line 224
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iput v5, v4, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 227
    :cond_7
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-eqz v4, :cond_9

    .line 228
    iget-boolean v4, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxerStarted:Z

    if-eqz v4, :cond_8

    .line 233
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 234
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget-object v6, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v6, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v4, v6

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 236
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxer:Landroid/media/MediaMuxer;

    iget v6, p0, Lcom/android/grafika/VideoEncoderCore;->mTrackIndex:I

    iget-object v7, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {v4, v6, v3, v7}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    goto :goto_1

    .line 229
    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v1, "muxer hasn\'t started"

    invoke-direct {p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 243
    :cond_9
    :goto_1
    iget-object v3, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v3, v2, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 245
    iget-object v2, p0, Lcom/android/grafika/VideoEncoderCore;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_1

    if-nez p1, :cond_b

    const-string p1, "reached end of stream unexpectedly"

    .line 247
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 216
    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "encoderOutputBuffer "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " was null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 256
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "drainEncoder failed "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    :goto_2
    return-void
.end method

.method public getInputSurface()Landroid/view/Surface;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore;->mInputSurface:Landroid/view/Surface;

    return-object v0
.end method

.method public release()V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 149
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 150
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 151
    iput-object v1, p0, Lcom/android/grafika/VideoEncoderCore;->mEncoder:Landroid/media/MediaCodec;

    .line 153
    :cond_0
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxer:Landroid/media/MediaMuxer;

    if-eqz v0, :cond_1

    .line 156
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    .line 157
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxer:Landroid/media/MediaMuxer;

    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V

    .line 158
    iput-object v1, p0, Lcom/android/grafika/VideoEncoderCore;->mMuxer:Landroid/media/MediaMuxer;

    :cond_1
    return-void
.end method
