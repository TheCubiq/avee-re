.class public Lcom/android/grafika/VideoEncoderCoreB;
.super Ljava/lang/Object;
.source "VideoEncoderCoreB.java"


# static fields
.field private static final MIME_TYPE0:Ljava/lang/String; = "video/avc"

.field private static final TAG:Ljava/lang/String; = "VideoEncoderCoreB"

.field private static final VERBOSE:Z = false


# instance fields
.field private mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

.field private mEncoder:Landroid/media/MediaCodec;

.field private mInputSurface:Landroid/view/Surface;

.field private mMuxer:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

.field private mTrackIndex:I


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;IIIIILjava/lang/String;Ljava/lang/String;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p7

    move/from16 v2, p9

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 169
    new-instance v3, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object v3, v0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    const-string v3, "video/avc"

    if-nez p8, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object/from16 v4, p8

    :goto_0
    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_2

    const-string v7, "default"

    .line 173
    invoke-virtual {v1, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v7, 0x1

    .line 179
    :goto_2
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x15

    const/4 v10, 0x0

    if-le v8, v9, :cond_3

    if-eqz v7, :cond_3

    move v11, p2

    move/from16 v12, p3

    move-object v8, v10

    goto :goto_5

    :cond_3
    if-nez v1, :cond_4

    const-string v1, ""

    :cond_4
    if-eqz v7, :cond_5

    move-object v8, v10

    goto :goto_3

    .line 191
    :cond_5
    invoke-static {v1}, Lcom/android/grafika/VideoEncoderCoreB;->selectCodecByName(Ljava/lang/String;)Landroid/media/MediaCodecInfo;

    move-result-object v8

    :goto_3
    if-nez v8, :cond_6

    .line 194
    invoke-static {v4}, Lcom/android/grafika/VideoEncoderCoreB;->selectCodec(Ljava/lang/String;)Landroid/media/MediaCodecInfo;

    move-result-object v8

    if-nez v8, :cond_6

    .line 196
    invoke-static {v3}, Lcom/android/grafika/VideoEncoderCoreB;->selectCodec(Ljava/lang/String;)Landroid/media/MediaCodecInfo;

    move-result-object v8

    :cond_6
    if-eqz v8, :cond_7

    .line 201
    invoke-virtual {v8}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    :cond_7
    move-object v8, v10

    :goto_4
    move v11, p2

    move/from16 v12, p3

    .line 206
    :goto_5
    invoke-static {v4, p2, v12}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v4

    const v11, 0x7f000789

    const-string v12, "color-format"

    .line 210
    invoke-virtual {v4, v12, v11}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v11, "bitrate"

    move/from16 v12, p4

    .line 214
    invoke-virtual {v4, v11, v12}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v11, "i-frame-interval"

    move/from16 v12, p6

    .line 216
    invoke-virtual {v4, v11, v12}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v11, "frame-rate"

    .line 218
    invoke-virtual {v4, v11, v10}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    if-le v12, v9, :cond_8

    if-eqz v7, :cond_8

    .line 224
    new-instance v7, Landroid/media/MediaCodecList;

    invoke-direct {v7, v5}, Landroid/media/MediaCodecList;-><init>(I)V

    .line 225
    invoke-virtual {v7, v4}, Landroid/media/MediaCodecList;->findEncoderForFormat(Landroid/media/MediaFormat;)Ljava/lang/String;

    move-result-object v8

    :cond_8
    if-nez v2, :cond_9

    goto :goto_6

    :cond_9
    if-ne v2, v6, :cond_a

    .line 233
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-le v2, v9, :cond_a

    const/4 v2, 0x2

    const-string v5, "profile"

    .line 235
    invoke-virtual {v4, v5, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 236
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-le v2, v5, :cond_a

    const/16 v2, 0x200

    const-string v5, "level"

    .line 238
    invoke-virtual {v4, v5, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_a
    :goto_6
    move/from16 v2, p5

    .line 250
    invoke-virtual {v4, v11, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 260
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "format: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "VideoEncoderCoreB"

    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v8, :cond_d

    .line 268
    invoke-static {v3}, Lcom/android/grafika/VideoEncoderCoreB;->selectCodec(Ljava/lang/String;)Landroid/media/MediaCodecInfo;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 269
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v2

    move-object v8, v2

    goto :goto_7

    :cond_b
    move-object v8, v10

    :goto_7
    if-eqz v8, :cond_c

    goto :goto_8

    .line 273
    :cond_c
    new-instance v2, Ljava/lang/Exception;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MediaCodec not available for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v2

    .line 276
    :cond_d
    :goto_8
    invoke-static {v8}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v1

    iput-object v1, v0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    .line 280
    invoke-virtual {v1, v4, v10, v10, v6}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 281
    iget-object v1, v0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v1

    iput-object v1, v0, Lcom/android/grafika/VideoEncoderCoreB;->mInputSurface:Landroid/view/Surface;

    .line 282
    iget-object v1, v0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    move-object v1, p1

    .line 284
    iput-object v1, v0, Lcom/android/grafika/VideoEncoderCoreB;->mMuxer:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

    const/4 v1, -0x1

    .line 286
    iput v1, v0, Lcom/android/grafika/VideoEncoderCoreB;->mTrackIndex:I

    return-void
.end method

.method private static printAvailableCodecs()V
    .locals 8

    .line 117
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 120
    invoke-static {v2}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v3

    .line 121
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    .line 124
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Codec available: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "VideoEncoderCoreB"

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 126
    :goto_1
    array-length v6, v3

    if-ge v4, v6, :cond_1

    .line 127
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "    supported type: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v7, v3, v4

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static selectCodec(Ljava/lang/String;)Landroid/media/MediaCodecInfo;
    .locals 7

    .line 76
    invoke-static {}, Lcom/android/grafika/VideoEncoderCoreB;->printAvailableCodecs()V

    .line 78
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 99
    invoke-static {v2}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v3

    .line 100
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    .line 104
    :cond_0
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 105
    :goto_1
    array-length v6, v4

    if-ge v5, v6, :cond_2

    .line 106
    aget-object v6, v4, v5

    invoke-virtual {v6, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 107
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Codec selected: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "VideoEncoderCoreB"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

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

.method private static selectCodecByName(Ljava/lang/String;)Landroid/media/MediaCodecInfo;
    .locals 4

    .line 134
    invoke-static {}, Lcom/android/grafika/VideoEncoderCoreB;->printAvailableCodecs()V

    .line 136
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 139
    invoke-static {v1}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v2

    .line 140
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 144
    :cond_0
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 145
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Codec selected: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "VideoEncoderCoreB"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public drainEncoder(Z)V
    .locals 10

    if-eqz p1, :cond_0

    .line 326
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 331
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    iget-object v2, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    const-wide/16 v3, 0x2710

    invoke-virtual {v1, v2, v3, v4}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    if-nez p1, :cond_1

    goto/16 :goto_1

    :cond_2
    const/4 v2, -0x3

    if-ne v1, v2, :cond_3

    .line 342
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v2, -0x2

    const-string v3, "VideoEncoderCoreB"

    if-ne v1, v2, :cond_4

    .line 346
    iget-object v1, p0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v1

    .line 347
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encoder output format changed: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 350
    iget-object v2, p0, Lcom/android/grafika/VideoEncoderCoreB;->mMuxer:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

    const-string v3, "video"

    invoke-virtual {v2, v1, v3}, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->addTrack(Landroid/media/MediaFormat;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/android/grafika/VideoEncoderCoreB;->mTrackIndex:I

    goto :goto_0

    :cond_4
    if-gez v1, :cond_5

    .line 353
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unexpected result from encoder.dequeueOutputBuffer: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 357
    :cond_5
    aget-object v2, v0, v1

    if-eqz v2, :cond_b

    .line 363
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v4, v4, 0x2

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    .line 367
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iput v5, v4, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 370
    :cond_6
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-lez v4, :cond_9

    .line 372
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-ltz v4, :cond_7

    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->offset:I

    if-ltz v4, :cond_7

    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v6, v4, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v8, 0x0

    cmp-long v4, v6, v8

    if-gez v4, :cond_8

    .line 373
    :cond_7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Invalid bufferInfo, size:  "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v6, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " offset: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v6, v6, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " presentationTimeUs: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v6, v6, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    :cond_8
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 378
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget-object v6, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v6, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v4, v6

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 380
    iget-object v4, p0, Lcom/android/grafika/VideoEncoderCoreB;->mMuxer:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

    iget v6, p0, Lcom/android/grafika/VideoEncoderCoreB;->mTrackIndex:I

    iget-object v7, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {v4, v6, v2, v7}, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 387
    :cond_9
    iget-object v2, p0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v2, v1, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 389
    iget-object v1, p0, Lcom/android/grafika/VideoEncoderCoreB;->mBufferInfo:Landroid/media/MediaCodec$BufferInfo;

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_1

    if-nez p1, :cond_a

    const-string p1, "reached end of stream unexpectedly"

    .line 391
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    :goto_1
    return-void

    .line 359
    :cond_b
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encoderOutputBuffer "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " was null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public getInputSurface()Landroid/view/Surface;
    .locals 1

    .line 294
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCoreB;->mInputSurface:Landroid/view/Surface;

    return-object v0
.end method

.method public release()V
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    if-eqz v0, :cond_0

    .line 303
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 304
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    const/4 v0, 0x0

    .line 305
    iput-object v0, p0, Lcom/android/grafika/VideoEncoderCoreB;->mEncoder:Landroid/media/MediaCodec;

    :cond_0
    return-void
.end method
