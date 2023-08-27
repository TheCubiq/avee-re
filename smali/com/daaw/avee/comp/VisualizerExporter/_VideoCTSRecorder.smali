.class public Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;
.super Ljava/lang/Object;
.source "_VideoCTSRecorder.java"


# instance fields
.field private encoderCore:Lcom/android/grafika/VideoEncoderCore;

.field private frameRate:I

.field private fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

.field private inputSurface:Landroid/media/cts/InputSurface;

.field private mOutputFile:Ljava/io/File;

.field private mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

.field private mVideoRect:Landroid/graphics/Rect;

.field private outHeight:I

.field private outWidth:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1e

    .line 34
    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->frameRate:I

    .line 69
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    return-void
.end method

.method private static computePresentationTime(JI)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p0, p0, v0

    int-to-long v0, p2

    .line 108
    div-long/2addr p0, v0

    return-wide p0
.end method

.method public static getCompatibleVideoHeight(I)I
    .locals 0

    .line 54
    invoke-static {p0}, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->roundUp16(I)I

    move-result p0

    return p0
.end method

.method public static getCompatibleVideoWidth(I)I
    .locals 0

    .line 49
    invoke-static {p0}, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->roundUp16(I)I

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

    .line 65
    rem-int/lit8 v0, p0, 0x10

    sub-int/2addr p0, v0

    return p0
.end method

.method private static roundUp16(I)I
    .locals 1

    .line 59
    rem-int/lit8 v0, p0, 0x10

    if-nez v0, :cond_0

    return p0

    :cond_0
    rsub-int/lit8 v0, v0, 0x10

    add-int/2addr v0, p0

    return v0
.end method

.method private startEncoder(IIFII)Ljava/lang/String;
    .locals 8

    const-string v0, ""

    const/4 v1, 0x0

    cmpg-float v1, p3, v1

    if-gez v1, :cond_0

    const/high16 p3, 0x40800000    # 4.0f

    :cond_0
    if-gez p4, :cond_1

    const/16 p4, 0x1e

    const/16 v6, 0x1e

    goto :goto_0

    :cond_1
    move v6, p4

    :goto_0
    if-gez p5, :cond_2

    const/4 p5, 0x5

    const/4 v7, 0x5

    goto :goto_1

    :cond_2
    move v7, p5

    .line 211
    :goto_1
    iput v6, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->frameRate:I

    .line 212
    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->getCompatibleVideoWidth(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->outWidth:I

    .line 213
    invoke-static {p2}, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->getCompatibleVideoHeight(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->outHeight:I

    .line 218
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "starting to record "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->outWidth:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->outHeight:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    const p1, 0x49742400    # 1000000.0f

    mul-float p3, p3, p1

    float-to-int v4, p3

    .line 250
    :try_start_0
    new-instance p1, Lcom/android/grafika/VideoEncoderCore;

    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->outWidth:I

    iget v3, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->outHeight:I

    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mOutputFile:Ljava/io/File;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/android/grafika/VideoEncoderCore;-><init>(IIILjava/io/File;II)V

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->encoderCore:Lcom/android/grafika/VideoEncoderCore;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 256
    :try_start_1
    new-instance p2, Lcom/android/grafika/TextureMovieEncoder2;

    invoke-direct {p2, p1}, Lcom/android/grafika/TextureMovieEncoder2;-><init>(Lcom/android/grafika/VideoEncoderCore;)V

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    .line 258
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    .line 252
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private stopEncoder()V
    .locals 3

    .line 270
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 271
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stopping recorder, mVideoEncoder="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 272
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    invoke-virtual {v0}, Lcom/android/grafika/TextureMovieEncoder2;->stopRecording()V

    .line 275
    iput-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    .line 277
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    if-eqz v0, :cond_1

    .line 278
    invoke-virtual {v0}, Landroid/media/cts/InputSurface;->release()V

    .line 279
    iput-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    :cond_1
    return-void
.end method


# virtual methods
.method public addFrameImageOGL(Lmdesl/graphics/Texture;JI)Z
    .locals 7

    .line 128
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->encoderCore:Lcom/android/grafika/VideoEncoderCore;

    const/4 p3, 0x0

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    if-nez p2, :cond_0

    goto/16 :goto_1

    .line 131
    :cond_0
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentDisplay()Landroid/opengl/EGLDisplay;

    move-result-object p2

    const/16 v0, 0x305a

    .line 132
    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    move-result-object v0

    const/16 v1, 0x3059

    .line 133
    invoke-static {v1}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    move-result-object v1

    .line 134
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentContext()Landroid/opengl/EGLContext;

    move-result-object v2

    if-nez v2, :cond_1

    const-string p1, "oldEGLContext is null"

    .line 136
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return p3

    .line 145
    :cond_1
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    if-nez v3, :cond_2

    .line 147
    :try_start_0
    new-instance v3, Landroid/media/cts/InputSurface;

    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->encoderCore:Lcom/android/grafika/VideoEncoderCore;

    invoke-virtual {v4}, Lcom/android/grafika/VideoEncoderCore;->getInputSurface()Landroid/view/Surface;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Landroid/media/cts/InputSurface;-><init>(Landroid/view/Surface;Landroid/opengl/EGLContext;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return p3

    .line 157
    :cond_2
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    invoke-virtual {v3}, Landroid/media/cts/InputSurface;->makeCurrent()V

    .line 159
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    if-nez v3, :cond_3

    .line 160
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    :cond_3
    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    .line 162
    invoke-static {v4, v4, v3, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v3, 0x4100

    .line 163
    invoke-static {v3}, Landroid/opengl/GLES20;->glClear(I)V

    .line 172
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Lmdesl/graphics/Texture;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Lmdesl/graphics/Texture;->getHeight()I

    move-result v5

    invoke-virtual {v3, p3, p3, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 175
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    .line 176
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    iget-object v6, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v6

    .line 175
    invoke-static {v3, v4, v5, v6}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 178
    invoke-virtual {p1}, Lmdesl/graphics/Texture;->bind()V

    .line 179
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->draw()V

    int-to-long v3, p4

    .line 181
    iget p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->frameRate:I

    invoke-static {v3, v4, p1}, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->computePresentationTime(JI)J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long v3, v3, v5

    .line 183
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    invoke-virtual {p1, v3, v4}, Landroid/media/cts/InputSurface;->setPresentationTime(J)V

    .line 185
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    invoke-virtual {p1}, Landroid/media/cts/InputSurface;->swapBuffers()Z

    .line 187
    invoke-static {p2, v1, v0, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "EGL14.eglMakeCurrent failed"

    .line 188
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return p3

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_1
    return p3
.end method

.method public finish()Z
    .locals 2

    const/4 v0, 0x0

    .line 304
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    .line 305
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    if-eqz v1, :cond_0

    .line 306
    invoke-virtual {v1}, Landroid/media/cts/InputSurface;->release()V

    .line 307
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->inputSurface:Landroid/media/cts/InputSurface;

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public frameAvailableSoon()V
    .locals 1

    .line 315
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    if-eqz v0, :cond_0

    .line 316
    invoke-virtual {v0}, Lcom/android/grafika/TextureMovieEncoder2;->frameAvailableSoon()V

    :cond_0
    return-void
.end method

.method public getScreenHeight()I
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0
.end method

.method public getScreenWidth()I
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0
.end method

.method public initialize(Ljava/io/File;IIIF)Ljava/lang/String;
    .locals 6

    .line 73
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mOutputFile:Ljava/io/File;

    const/4 v5, 0x5

    move-object v0, p0

    move v1, p3

    move v2, p4

    move v3, p5

    move v4, p2

    .line 75
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->startEncoder(IIFII)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public release()V
    .locals 1

    const/4 v0, 0x0

    .line 80
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    return-void
.end method

.method public stop()Z
    .locals 2

    .line 285
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    if-eqz v0, :cond_0

    .line 286
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stopping recorder, mVideoEncoder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 287
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoCTSRecorder;->mVideoEncoder:Lcom/android/grafika/TextureMovieEncoder2;

    invoke-virtual {v0}, Lcom/android/grafika/TextureMovieEncoder2;->stopRecording()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
