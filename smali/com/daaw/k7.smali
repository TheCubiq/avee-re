.class public Lcom/daaw/k7;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/k7$a;
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/po0;

.field public b:Landroid/media/MediaCodec;

.field public c:Landroid/media/MediaCodec$BufferInfo;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Lcom/daaw/po0;IIII)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object v0, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    const-string v0, "audio/mp4a-latm"

    invoke-static {v0, p2, p3}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object p2

    const-string v1, "bitrate"

    invoke-virtual {p2, v1, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p4, "channel-count"

    invoke-virtual {p2, p4, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    if-lez p5, :cond_0

    mul-int p5, p5, p3

    mul-int/lit8 p5, p5, 0x2

    const-string p4, "max-input-size"

    invoke-virtual {p2, p4, p5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_0
    invoke-static {v0}, Lcom/daaw/k7;->e(Ljava/lang/String;)Landroid/media/MediaCodecInfo;

    move-result-object p4

    invoke-virtual {p4}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p4

    iput-object p4, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    const/4 p5, 0x1

    const/4 v0, 0x0

    invoke-virtual {p4, p2, v0, v0, p5}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    iget-object p2, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    invoke-virtual {p2}, Landroid/media/MediaCodec;->start()V

    iput-object p1, p0, Lcom/daaw/k7;->a:Lcom/daaw/po0;

    iput p3, p0, Lcom/daaw/k7;->e:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/k7;->d:I

    return-void
.end method

.method public static e(Ljava/lang/String;)Landroid/media/MediaCodecInfo;
    .locals 7

    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-static {v2}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    :goto_1
    array-length v6, v4

    if-ge v5, v6, :cond_2

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
.method public a(ZZ)V
    .locals 8

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object p1

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    iget-object v1, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    const-wide/32 v2, 0x8235

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    if-nez p2, :cond_1

    goto/16 :goto_2

    :cond_2
    const/4 v1, -0x3

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, -0x2

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encoder output format changed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/k7;->a:Lcom/daaw/po0;

    const-string v2, "audio"

    invoke-virtual {v1, v0, v2}, Lcom/daaw/po0;->a(Landroid/media/MediaFormat;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/daaw/k7;->d:I

    goto :goto_1

    :cond_4
    if-gez v0, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected result from encoder.dequeueOutputBuffer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lcom/daaw/k7;->a:Lcom/daaw/po0;

    invoke-virtual {v1}, Lcom/daaw/po0;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    aget-object v1, p1, v0

    if-eqz v1, :cond_a

    iget-object v3, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_6

    iput v2, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    :cond_6
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-lez v4, :cond_9

    if-ltz v4, :cond_7

    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    if-ltz v4, :cond_7

    iget-wide v3, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-gez v7, :cond_8

    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid bufferInfo, size:  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->size:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " offset: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " presentationTimeUs: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v4, v4, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    :cond_8
    iget-object v3, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    iget v3, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v3, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v3, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v4, v3

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v3, p0, Lcom/daaw/k7;->a:Lcom/daaw/po0;

    iget v4, p0, Lcom/daaw/k7;->d:I

    iget-object v5, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {v3, v4, v1, v5}, Lcom/daaw/po0;->d(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    :cond_9
    iget-object v1, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    invoke-virtual {v1, v0, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    iget-object v0, p0, Lcom/daaw/k7;->c:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    :goto_2
    return-void

    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encoderOutputBuffer "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " was null"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    iget-object v1, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    invoke-virtual {v1, v0, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    goto/16 :goto_1
.end method

.method public b(Lcom/daaw/k7$a;ZZ)Z
    .locals 10

    iget-object p3, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    invoke-virtual {p3}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object p3

    :cond_0
    iget-object v0, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    const-wide/32 v1, 0x8235

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v4

    const/4 v0, 0x0

    if-ltz v4, :cond_7

    aget-object p3, p3, v4

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget-object v1, p1, Lcom/daaw/k7$a;->a:Lcom/daaw/nc1$a;

    if-eqz v1, :cond_4

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    iget v2, p1, Lcom/daaw/k7$a;->b:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    iget v3, p1, Lcom/daaw/k7$a;->b:I

    if-ge v2, v3, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inputBuffer too small: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " encodeData.length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p1, Lcom/daaw/k7$a;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const v5, 0xff00

    if-ne v2, v3, :cond_2

    :goto_0
    if-ge v0, v1, :cond_3

    iget-object v2, p1, Lcom/daaw/k7$a;->a:Lcom/daaw/nc1$a;

    iget-object v2, v2, Lcom/daaw/nc1$a;->a:[S

    aget-short v2, v2, v0

    and-int/lit16 v3, v2, 0xff

    int-to-byte v3, v3

    invoke-virtual {p3, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    and-int/2addr v2, v5

    shr-int/lit8 v2, v2, 0x8

    int-to-byte v2, v2

    invoke-virtual {p3, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v0, v1, :cond_3

    iget-object v2, p1, Lcom/daaw/k7$a;->a:Lcom/daaw/nc1$a;

    iget-object v2, v2, Lcom/daaw/nc1$a;->a:[S

    aget-short v2, v2, v0

    and-int v3, v2, v5

    shr-int/lit8 v3, v3, 0x8

    int-to-byte v3, v3

    invoke-virtual {p3, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    invoke-virtual {p3, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p1, Lcom/daaw/k7$a;->a:Lcom/daaw/nc1$a;

    invoke-virtual {v0}, Lcom/daaw/nc1$a;->a()V

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/daaw/k7$a;->a:Lcom/daaw/nc1$a;

    :cond_4
    iget v0, p1, Lcom/daaw/k7$a;->b:I

    if-lez v0, :cond_6

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    iget-object v3, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    const/4 v5, 0x0

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->position()I

    move-result v6

    iget-wide v7, p1, Lcom/daaw/k7$a;->c:J

    const/4 v9, 0x0

    goto :goto_3

    :cond_6
    :goto_2
    iget-object v3, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-wide v7, p1, Lcom/daaw/k7$a;->c:J

    const/4 v9, 0x4

    :goto_3
    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    const/4 p1, 0x1

    return p1

    :cond_7
    const/4 v1, -0x1

    if-ne v4, v1, :cond_0

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/daaw/k7;->e:I

    return v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    iget-object v0, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/k7;->b:Landroid/media/MediaCodec;

    :cond_0
    return-void
.end method
