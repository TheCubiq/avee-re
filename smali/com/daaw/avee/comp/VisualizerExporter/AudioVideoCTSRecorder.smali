.class public Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;
.super Ljava/lang/Object;
.source "AudioVideoCTSRecorder.java"


# static fields
.field public static final MICROS_PER_SECOND:J = 0xf4240L


# instance fields
.field private audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

.field private audioEncoderCore:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;

.field private frameRate:I

.field private fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

.field private inputSurface:Landroid/media/cts/InputSurface;

.field private mOutputFile:Ljava/io/File;

.field private mVideoRect:Landroid/graphics/Rect;

.field private muxerCore:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

.field private outHeight:I

.field private outWidth:I

.field private shortBufferResourcePool:Lcom/daaw/avee/Common/ShortBufferResourcePool;

.field streamToFileBridge:Lcom/daaw/avee/Common/StreamToFileBridge;

.field private videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

.field private videoEncoderCore:Lcom/android/grafika/VideoEncoderCoreB;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->streamToFileBridge:Lcom/daaw/avee/Common/StreamToFileBridge;

    const/16 v0, 0x1e

    .line 46
    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->frameRate:I

    .line 48
    new-instance v0, Lcom/daaw/avee/Common/ShortBufferResourcePool;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/daaw/avee/Common/ShortBufferResourcePool;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->shortBufferResourcePool:Lcom/daaw/avee/Common/ShortBufferResourcePool;

    .line 93
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    return-void
.end method

.method public static computePresentationTime(JI)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p0, p0, v0

    int-to-long v0, p2

    .line 220
    div-long/2addr p0, v0

    return-wide p0
.end method

.method public static computePresentationTime2(JI)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p0, p0, v0

    int-to-long v0, p2

    .line 224
    div-long/2addr p0, v0

    return-wide p0
.end method

.method private static durationUsToFrames(JJ)I
    .locals 0

    mul-long p0, p0, p2

    const-wide/32 p2, 0xf4240

    .line 58
    div-long/2addr p0, p2

    long-to-int p1, p0

    return p1
.end method

.method public static getCompatibleVideoHeight(I)I
    .locals 0

    .line 78
    invoke-static {p0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->roundUp16(I)I

    move-result p0

    return p0
.end method

.method public static getCompatibleVideoWidth(I)I
    .locals 0

    .line 73
    invoke-static {p0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->roundUp16(I)I

    move-result p0

    return p0
.end method

.method public static getOutputFileExtensionWithDot()Ljava/lang/String;
    .locals 1

    const-string v0, ".mp4"

    return-object v0
.end method

.method public static getOutputFileMimeType()Ljava/lang/String;
    .locals 1

    const-string v0, "video/mp4"

    return-object v0
.end method

.method private static roundDown16(I)I
    .locals 1

    .line 89
    rem-int/lit8 v0, p0, 0x10

    sub-int/2addr p0, v0

    return p0
.end method

.method private static roundUp16(I)I
    .locals 1

    .line 83
    rem-int/lit8 v0, p0, 0x10

    if-nez v0, :cond_0

    return p0

    :cond_0
    rsub-int/lit8 v0, v0, 0x10

    add-int/2addr v0, p0

    return v0
.end method

.method private static secondsToUs(F)J
    .locals 2

    const v0, 0x49742400    # 1000000.0f

    mul-float p0, p0, v0

    float-to-long v0, p0

    return-wide v0
.end method

.method private startEncoder(ZIIFIIFIILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 13

    move-object v1, p0

    const/4 v0, 0x0

    cmpg-float v0, p4, v0

    if-gez v0, :cond_0

    const/high16 v0, 0x40800000    # 4.0f

    goto :goto_0

    :cond_0
    move/from16 v0, p4

    :goto_0
    if-gez p5, :cond_1

    const/16 v2, 0x1e

    const/16 v8, 0x1e

    goto :goto_1

    :cond_1
    move/from16 v8, p5

    :goto_1
    if-gez p6, :cond_2

    const/4 v2, 0x5

    const/4 v9, 0x5

    goto :goto_2

    :cond_2
    move/from16 v9, p6

    .line 142
    :goto_2
    iput v8, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->frameRate:I

    move v2, p2

    .line 143
    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->outWidth:I

    move/from16 v2, p3

    .line 144
    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->outHeight:I

    .line 146
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "starting to record "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->outWidth:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->outHeight:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    const v2, 0x49742400    # 1000000.0f

    mul-float v0, v0, v2

    float-to-int v7, v0

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float v0, v0, p7

    float-to-int v0, v0

    .line 152
    :try_start_0
    new-instance v2, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

    iget-object v3, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mOutputFile:Ljava/io/File;

    if-eqz p1, :cond_3

    const/4 v4, 0x2

    goto :goto_3

    :cond_3
    const/4 v4, 0x1

    :goto_3
    invoke-direct {v2, v3, v4}, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;-><init>(Ljava/io/File;I)V

    iput-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->muxerCore:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    const-wide v2, 0x412e848000000000L    # 1000000.0

    int-to-double v4, v8

    .line 157
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-long v2, v2

    if-eqz p1, :cond_4

    .line 162
    :try_start_1
    new-instance v4, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;

    iget-object v5, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->muxerCore:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

    move/from16 v6, p9

    int-to-long v10, v6

    invoke-static {v2, v3, v10, v11}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->durationUsToFrames(JJ)I

    move-result v2

    add-int/lit8 v2, v2, 0x8

    move-object p2, v4

    move-object/from16 p3, v5

    move/from16 p4, p9

    move/from16 p5, p8

    move/from16 p6, v0

    move/from16 p7, v2

    invoke-direct/range {p2 .. p7}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;IIII)V

    iput-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoderCore:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    .line 164
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AudioEncoder: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    :goto_4
    if-eqz p1, :cond_5

    .line 168
    :try_start_2
    new-instance v0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    iget-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoderCore:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;

    invoke-direct {v0, v2}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;)V

    iput-object v0, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_5

    :catch_1
    move-exception v0

    .line 170
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AudioEncoderManager: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 174
    :cond_5
    :goto_5
    :try_start_3
    new-instance v0, Lcom/android/grafika/VideoEncoderCoreB;

    iget-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->muxerCore:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

    iget v5, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->outWidth:I

    iget v6, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->outHeight:I

    move-object v3, v0

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v3 .. v12}, Lcom/android/grafika/VideoEncoderCoreB;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;IIIIILjava/lang/String;Ljava/lang/String;I)V

    iput-object v0, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoderCore:Lcom/android/grafika/VideoEncoderCoreB;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 180
    :try_start_4
    new-instance v2, Lcom/android/grafika/TextureMovieEncoder2B;

    invoke-direct {v2, v0}, Lcom/android/grafika/TextureMovieEncoder2B;-><init>(Lcom/android/grafika/VideoEncoderCoreB;)V

    iput-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    const/4 v0, 0x0

    return-object v0

    :catch_2
    move-exception v0

    .line 182
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TextureEncoder: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_3
    move-exception v0

    .line 176
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VideoEncoder: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_4
    move-exception v0

    .line 154
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MediaMuxer: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private stopEncoder()V
    .locals 3

    .line 329
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->muxerCore:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

    if-eqz v0, :cond_0

    .line 330
    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->release()V

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stopping recorder, audioEncoder="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->isRecording()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->stopRecording()V

    .line 338
    :cond_1
    iput-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    .line 341
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    if-eqz v0, :cond_4

    .line 342
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stopping recorder, videoEncoder="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 343
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    invoke-virtual {v0}, Lcom/android/grafika/TextureMovieEncoder2B;->isRecording()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    invoke-virtual {v0}, Lcom/android/grafika/TextureMovieEncoder2B;->stopRecording()V

    .line 346
    :cond_3
    iput-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    .line 349
    :cond_4
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    if-eqz v0, :cond_5

    .line 350
    invoke-virtual {v0}, Landroid/media/cts/InputSurface;->release()V

    .line 351
    iput-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    :cond_5
    return-void
.end method


# virtual methods
.method public addFrameImageOGL(Lmdesl/graphics/Texture;JI)Z
    .locals 6

    .line 246
    iget-object p4, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoderCore:Lcom/android/grafika/VideoEncoderCoreB;

    const/4 v0, 0x0

    if-eqz p4, :cond_6

    iget-object p4, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    if-nez p4, :cond_0

    goto/16 :goto_1

    .line 249
    :cond_0
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentDisplay()Landroid/opengl/EGLDisplay;

    move-result-object p4

    const/16 v1, 0x305a

    .line 250
    invoke-static {v1}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    move-result-object v1

    const/16 v2, 0x3059

    .line 251
    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    move-result-object v2

    .line 252
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentContext()Landroid/opengl/EGLContext;

    move-result-object v3

    if-nez v3, :cond_1

    const-string p1, "oldEGLContext is null"

    .line 254
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return v0

    .line 263
    :cond_1
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    if-nez v4, :cond_2

    .line 265
    :try_start_0
    new-instance v4, Landroid/media/cts/InputSurface;

    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoderCore:Lcom/android/grafika/VideoEncoderCoreB;

    invoke-virtual {v5}, Lcom/android/grafika/VideoEncoderCoreB;->getInputSurface()Landroid/view/Surface;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Landroid/media/cts/InputSurface;-><init>(Landroid/view/Surface;Landroid/opengl/EGLContext;)V

    iput-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return v0

    .line 273
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lmdesl/graphics/Texture;->valid()Z

    move-result v4

    if-nez v4, :cond_3

    return v0

    .line 278
    :cond_3
    :try_start_1
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    invoke-virtual {v4}, Landroid/media/cts/InputSurface;->makeCurrent()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-wide/16 v4, 0x3e8

    mul-long p2, p2, v4

    .line 285
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    invoke-virtual {v4, p2, p3}, Landroid/media/cts/InputSurface;->setPresentationTime(J)V

    .line 287
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    if-nez p2, :cond_4

    .line 288
    new-instance p2, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    invoke-direct {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;-><init>()V

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    :cond_4
    const/4 p2, 0x0

    const/high16 p3, 0x3f800000    # 1.0f

    .line 290
    invoke-static {p3, p3, p2, p3}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 p2, 0x4100

    .line 291
    invoke-static {p2}, Landroid/opengl/GLES20;->glClear(I)V

    .line 300
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Lmdesl/graphics/Texture;->getWidth()I

    move-result p3

    invoke-virtual {p1}, Lmdesl/graphics/Texture;->getHeight()I

    move-result v4

    invoke-virtual {p2, v0, v0, p3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 303
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->left:I

    iget-object p3, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    iget p3, p3, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    .line 304
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    .line 303
    invoke-static {p2, p3, v4, v5}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 306
    invoke-virtual {p1}, Lmdesl/graphics/Texture;->bind()V

    .line 307
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->draw()V

    .line 311
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    invoke-virtual {p1}, Landroid/media/cts/InputSurface;->swapBuffers()Z

    .line 313
    invoke-static {p4, v2, v1, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "EGL14.eglMakeCurrent failed"

    .line 314
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return v0

    :cond_5
    const/4 p1, 0x1

    return p1

    :catch_1
    :cond_6
    :goto_1
    return v0
.end method

.method public audioFrameAvailableSoon(Lcom/daaw/avee/Common/ISimpleListShort;J)V
    .locals 5

    .line 442
    invoke-interface {p1}, Lcom/daaw/avee/Common/ISimpleListShort;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoderCore:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;

    if-nez v0, :cond_0

    goto :goto_1

    .line 446
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;

    invoke-direct {v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;-><init>()V

    .line 452
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->shortBufferResourcePool:Lcom/daaw/avee/Common/ShortBufferResourcePool;

    invoke-interface {p1}, Lcom/daaw/avee/Common/ISimpleListShort;->size()I

    move-result v2

    const-wide/16 v3, 0xa

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/avee/Common/ShortBufferResourcePool;->acquire(IJ)Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->buffer:Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

    const/4 v1, 0x0

    .line 454
    :goto_0
    iget-object v2, v0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->buffer:Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

    iget-object v2, v2, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;->obj:[S

    array-length v2, v2

    if-ge v1, v2, :cond_1

    .line 455
    iget-object v2, v0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->buffer:Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

    iget-object v2, v2, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;->obj:[S

    invoke-interface {p1, v1}, Lcom/daaw/avee/Common/ISimpleListShort;->get(I)S

    move-result v3

    aput-short v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 458
    :cond_1
    iget-object p1, v0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->buffer:Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

    iget-object p1, p1, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;->obj:[S

    array-length p1, p1

    iput p1, v0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->length:I

    .line 465
    iput-wide p2, v0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->presentationTimeUs:J

    .line 485
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->frameAvailableSoon(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public finish(Lcom/daaw/avee/Common/StatusMsg;)Z
    .locals 2

    const-string v0, "### finish"

    .line 396
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 403
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    .line 404
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    if-eqz v1, :cond_0

    .line 405
    invoke-virtual {v1}, Landroid/media/cts/InputSurface;->release()V

    .line 406
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    .line 409
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->streamToFileBridge:Lcom/daaw/avee/Common/StreamToFileBridge;

    if-eqz v1, :cond_1

    .line 410
    invoke-virtual {v1, p1}, Lcom/daaw/avee/Common/StreamToFileBridge;->finish(Lcom/daaw/avee/Common/StatusMsg;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 412
    :goto_0
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->streamToFileBridge:Lcom/daaw/avee/Common/StreamToFileBridge;

    return p1
.end method

.method public frameAvailableSoon()V
    .locals 1

    .line 419
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    if-eqz v0, :cond_0

    .line 420
    invoke-virtual {v0}, Lcom/android/grafika/TextureMovieEncoder2B;->frameAvailableSoon()V

    :cond_0
    return-void
.end method

.method public getAudioInputFormatChannelCount()I
    .locals 1

    .line 425
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoderCore:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;->getInputFormatChannelCount()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getScreenHeight()I
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0
.end method

.method public getScreenWidth()I
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0
.end method

.method public initialize(Ljava/io/File;Ljava/io/OutputStream;IIIFZFIILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 14

    move-object v13, p0

    move-object v0, p1

    move-object/from16 v1, p2

    if-eqz v1, :cond_0

    .line 111
    new-instance v2, Lcom/daaw/avee/Common/StreamToFileBridge;

    invoke-direct {v2, p1, v1}, Lcom/daaw/avee/Common/StreamToFileBridge;-><init>(Ljava/io/File;Ljava/io/OutputStream;)V

    iput-object v2, v13, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->streamToFileBridge:Lcom/daaw/avee/Common/StreamToFileBridge;

    .line 113
    :cond_0
    iput-object v0, v13, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->mOutputFile:Ljava/io/File;

    const/high16 v0, 0x42b40000    # 90.0f

    const v1, 0x3dcccccd    # 0.1f

    move/from16 v2, p6

    .line 115
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v4

    const/4 v6, 0x5

    move-object v0, p0

    move/from16 v1, p7

    move/from16 v2, p4

    move/from16 v3, p5

    move/from16 v5, p3

    move/from16 v7, p8

    move/from16 v8, p9

    move/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move/from16 v12, p13

    .line 117
    invoke-direct/range {v0 .. v12}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->startEncoder(ZIIFIIFIILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public release()V
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->dispose()V

    :cond_0
    const/4 v0, 0x0

    .line 192
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    return-void
.end method

.method public stop(Lcom/daaw/avee/Common/StatusMsg;)Z
    .locals 4

    .line 359
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    if-eqz v0, :cond_0

    .line 360
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stopping video recorder, videoEncoder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 361
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    invoke-virtual {v0}, Lcom/android/grafika/TextureMovieEncoder2B;->isRecording()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    invoke-virtual {v0}, Lcom/android/grafika/TextureMovieEncoder2B;->stopRecording()V

    .line 363
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    if-eqz v0, :cond_1

    .line 364
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stopping audio recorder, videoEncoder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->isRecording()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->stopRecording()V

    :cond_1
    const/4 v0, 0x0

    .line 369
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->isRecording()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->videoEncoder:Lcom/android/grafika/TextureMovieEncoder2B;

    if-eqz v1, :cond_5

    .line 370
    invoke-virtual {v1}, Lcom/android/grafika/TextureMovieEncoder2B;->isRecording()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_3
    add-int/2addr v0, v2

    .line 373
    rem-int/lit16 v1, v0, 0x3e8

    if-nez v1, :cond_4

    .line 374
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Waiting on .isRecording for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    div-int/lit8 v3, v0, 0x64

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " seconds already"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v1, v2}, Lcom/daaw/avee/Common/tlog;->e(Ljava/lang/Exception;Ljava/lang/String;)V

    :cond_4
    const-wide/16 v1, 0xa

    .line 377
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const/4 v2, 0x0

    .line 379
    invoke-static {v1, v2}, Lcom/daaw/avee/Common/tlog;->e(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    .line 383
    :cond_5
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->muxerCore:Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;

    if-eqz v0, :cond_6

    .line 384
    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->release()V

    .line 388
    :cond_6
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->reportMessages(Lcom/daaw/avee/Common/StatusMsg;)V

    :cond_7
    return v2
.end method
