.class Lcom/android/grafika/VideoEncoderCore21$1;
.super Landroid/media/MediaCodec$Callback;
.source "VideoEncoderCore21.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/grafika/VideoEncoderCore21;-><init>(IIILjava/io/File;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/grafika/VideoEncoderCore21;


# direct methods
.method constructor <init>(Lcom/android/grafika/VideoEncoderCore21;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    invoke-direct {p0}, Landroid/media/MediaCodec$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V
    .locals 1

    .line 159
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "encoder error: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "VideoEncoderCore"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onInputBufferAvailable(Landroid/media/MediaCodec;I)V
    .locals 0

    const-string p1, "VideoEncoderCore"

    const-string p2, "onInputBufferAvailable"

    .line 131
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onOutputBufferAvailable(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V
    .locals 2

    .line 140
    iget-object p1, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    invoke-static {p1}, Lcom/android/grafika/VideoEncoderCore21;->access$000(Lcom/android/grafika/VideoEncoderCore21;)Landroid/media/MediaCodec;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 141
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    invoke-static {v0}, Lcom/android/grafika/VideoEncoderCore21;->access$000(Lcom/android/grafika/VideoEncoderCore21;)Landroid/media/MediaCodec;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/media/MediaCodec;->getOutputFormat(I)Landroid/media/MediaFormat;

    .line 145
    iget v0, p3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    goto :goto_0

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    invoke-static {v0}, Lcom/android/grafika/VideoEncoderCore21;->access$100(Lcom/android/grafika/VideoEncoderCore21;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "VideoEncoderCore"

    const-string p3, "Muxer not started yet"

    .line 149
    invoke-static {p1, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 151
    :cond_1
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    invoke-static {v0}, Lcom/android/grafika/VideoEncoderCore21;->access$300(Lcom/android/grafika/VideoEncoderCore21;)Landroid/media/MediaMuxer;

    move-result-object v0

    iget-object v1, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    invoke-static {v1}, Lcom/android/grafika/VideoEncoderCore21;->access$200(Lcom/android/grafika/VideoEncoderCore21;)I

    move-result v1

    invoke-virtual {v0, v1, p1, p3}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 154
    :goto_0
    iget-object p1, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    invoke-static {p1}, Lcom/android/grafika/VideoEncoderCore21;->access$000(Lcom/android/grafika/VideoEncoderCore21;)Landroid/media/MediaCodec;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return-void
.end method

.method public onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 1

    .line 166
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "encoder output format changed: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "VideoEncoderCore"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    iget-object p1, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    invoke-static {p1}, Lcom/android/grafika/VideoEncoderCore21;->access$300(Lcom/android/grafika/VideoEncoderCore21;)Landroid/media/MediaMuxer;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result p2

    invoke-static {p1, p2}, Lcom/android/grafika/VideoEncoderCore21;->access$202(Lcom/android/grafika/VideoEncoderCore21;I)I

    .line 170
    iget-object p1, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    invoke-static {p1}, Lcom/android/grafika/VideoEncoderCore21;->access$300(Lcom/android/grafika/VideoEncoderCore21;)Landroid/media/MediaMuxer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/MediaMuxer;->start()V

    .line 171
    iget-object p1, p0, Lcom/android/grafika/VideoEncoderCore21$1;->this$0:Lcom/android/grafika/VideoEncoderCore21;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/android/grafika/VideoEncoderCore21;->access$102(Lcom/android/grafika/VideoEncoderCore21;Z)Z

    return-void
.end method
