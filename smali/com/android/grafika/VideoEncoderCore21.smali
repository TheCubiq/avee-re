.class public Lcom/android/grafika/VideoEncoderCore21;
.super Ljava/lang/Object;
.source "VideoEncoderCore21.java"


# static fields
.field private static final MIME_TYPE:Ljava/lang/String; = "video/avc"

.field private static final TAG:Ljava/lang/String; = "VideoEncoderCore"

.field private static final VERBOSE:Z = false


# instance fields
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

    .line 99
    invoke-direct/range {v0 .. v6}, Lcom/android/grafika/VideoEncoderCore21;-><init>(IIILjava/io/File;II)V

    return-void
.end method

.method public constructor <init>(IIILjava/io/File;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "video/avc"

    .line 108
    invoke-static {v0, p1, p2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object p1

    const-string p2, "color-format"

    const v1, 0x7f000789

    .line 117
    invoke-virtual {p1, p2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p2, "bitrate"

    .line 119
    invoke-virtual {p1, p2, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p2, "frame-rate"

    .line 120
    invoke-virtual {p1, p2, p5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p2, "i-frame-interval"

    .line 121
    invoke-virtual {p1, p2, p6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 126
    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p2

    iput-object p2, p0, Lcom/android/grafika/VideoEncoderCore21;->mEncoder:Landroid/media/MediaCodec;

    .line 128
    new-instance p3, Lcom/android/grafika/VideoEncoderCore21$1;

    invoke-direct {p3, p0}, Lcom/android/grafika/VideoEncoderCore21$1;-><init>(Lcom/android/grafika/VideoEncoderCore21;)V

    invoke-virtual {p2, p3}, Landroid/media/MediaCodec;->setCallback(Landroid/media/MediaCodec$Callback;)V

    .line 176
    iget-object p2, p0, Lcom/android/grafika/VideoEncoderCore21;->mEncoder:Landroid/media/MediaCodec;

    const/4 p3, 0x0

    const/4 p5, 0x1

    invoke-virtual {p2, p1, p3, p3, p5}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 177
    iget-object p1, p0, Lcom/android/grafika/VideoEncoderCore21;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object p1

    iput-object p1, p0, Lcom/android/grafika/VideoEncoderCore21;->mInputSurface:Landroid/view/Surface;

    .line 178
    iget-object p1, p0, Lcom/android/grafika/VideoEncoderCore21;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V

    .line 186
    new-instance p1, Landroid/media/MediaMuxer;

    invoke-virtual {p4}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lcom/android/grafika/VideoEncoderCore21;->mMuxer:Landroid/media/MediaMuxer;

    const/4 p1, -0x1

    .line 189
    iput p1, p0, Lcom/android/grafika/VideoEncoderCore21;->mTrackIndex:I

    .line 190
    iput-boolean p3, p0, Lcom/android/grafika/VideoEncoderCore21;->mMuxerStarted:Z

    return-void
.end method

.method static synthetic access$000(Lcom/android/grafika/VideoEncoderCore21;)Landroid/media/MediaCodec;
    .locals 0

    .line 43
    iget-object p0, p0, Lcom/android/grafika/VideoEncoderCore21;->mEncoder:Landroid/media/MediaCodec;

    return-object p0
.end method

.method static synthetic access$100(Lcom/android/grafika/VideoEncoderCore21;)Z
    .locals 0

    .line 43
    iget-boolean p0, p0, Lcom/android/grafika/VideoEncoderCore21;->mMuxerStarted:Z

    return p0
.end method

.method static synthetic access$102(Lcom/android/grafika/VideoEncoderCore21;Z)Z
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/android/grafika/VideoEncoderCore21;->mMuxerStarted:Z

    return p1
.end method

.method static synthetic access$200(Lcom/android/grafika/VideoEncoderCore21;)I
    .locals 0

    .line 43
    iget p0, p0, Lcom/android/grafika/VideoEncoderCore21;->mTrackIndex:I

    return p0
.end method

.method static synthetic access$202(Lcom/android/grafika/VideoEncoderCore21;I)I
    .locals 0

    .line 43
    iput p1, p0, Lcom/android/grafika/VideoEncoderCore21;->mTrackIndex:I

    return p1
.end method

.method static synthetic access$300(Lcom/android/grafika/VideoEncoderCore21;)Landroid/media/MediaMuxer;
    .locals 0

    .line 43
    iget-object p0, p0, Lcom/android/grafika/VideoEncoderCore21;->mMuxer:Landroid/media/MediaMuxer;

    return-object p0
.end method

.method private static findNonSurfaceColorFormat(Landroid/media/MediaCodecInfo;Ljava/lang/String;)I
    .locals 3

    .line 86
    invoke-virtual {p0, p1}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 87
    :goto_0
    iget-object v1, p0, Landroid/media/MediaCodecInfo$CodecCapabilities;->colorFormats:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 88
    iget-object v1, p0, Landroid/media/MediaCodecInfo$CodecCapabilities;->colorFormats:[I

    aget v1, v1, v0

    const v2, 0x7f000789

    if-eq v1, v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return p1
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
.method public getInputSurface()Landroid/view/Surface;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore21;->mInputSurface:Landroid/view/Surface;

    return-object v0
.end method

.method public release()V
    .locals 2

    .line 210
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore21;->mEncoder:Landroid/media/MediaCodec;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 211
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 212
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore21;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 213
    iput-object v1, p0, Lcom/android/grafika/VideoEncoderCore21;->mEncoder:Landroid/media/MediaCodec;

    .line 215
    :cond_0
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore21;->mMuxer:Landroid/media/MediaMuxer;

    if-eqz v0, :cond_1

    .line 218
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    .line 219
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore21;->mMuxer:Landroid/media/MediaMuxer;

    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V

    .line 220
    iput-object v1, p0, Lcom/android/grafika/VideoEncoderCore21;->mMuxer:Landroid/media/MediaMuxer;

    :cond_1
    return-void
.end method

.method public signalEndOfInputStream()V
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/android/grafika/VideoEncoderCore21;->mEncoder:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    return-void
.end method
