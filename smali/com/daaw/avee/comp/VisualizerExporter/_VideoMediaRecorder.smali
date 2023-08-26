.class public Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;
.super Ljava/lang/Object;
.source "_VideoMediaRecorder.java"


# instance fields
.field private fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

.field private mEglCore:Lcom/android/grafika/gles/EglCore;

.field private mInputWindowSurface:Lcom/android/grafika/gles/WindowSurface;

.field private mVideoRect:Landroid/graphics/Rect;

.field private outHeight:I

.field private outWidth:I

.field recorder:Landroid/media/MediaRecorder;

.field surfaceTexture:Landroid/graphics/SurfaceTexture;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->mVideoRect:Landroid/graphics/Rect;

    .line 50
    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/16 v1, 0x156

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 53
    new-instance v0, Landroid/media/MediaRecorder;

    invoke-direct {v0}, Landroid/media/MediaRecorder;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    const/4 v1, 0x2

    .line 54
    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setVideoSource(I)V

    .line 55
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    return-void
.end method


# virtual methods
.method public addFrameImageOGL(Landroid/graphics/Bitmap;I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public addFrameImageOGL(Lmdesl/graphics/Texture;J)Z
    .locals 8

    .line 161
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 163
    :cond_0
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentDisplay()Landroid/opengl/EGLDisplay;

    move-result-object p1

    const/16 v1, 0x305a

    .line 164
    invoke-static {v1}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    move-result-object v1

    const/16 v2, 0x3059

    .line 165
    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    move-result-object v2

    .line 166
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentContext()Landroid/opengl/EGLContext;

    move-result-object v3

    if-nez v3, :cond_1

    const-string p1, "oldEGLContext is null"

    .line 168
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return v0

    .line 172
    :cond_1
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->mEglCore:Lcom/android/grafika/gles/EglCore;

    const/4 v5, 0x1

    if-nez v4, :cond_2

    .line 173
    new-instance v4, Lcom/android/grafika/gles/EglCore;

    const/4 v6, 0x3

    invoke-direct {v4, v3, v6}, Lcom/android/grafika/gles/EglCore;-><init>(Landroid/opengl/EGLContext;I)V

    iput-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->mEglCore:Lcom/android/grafika/gles/EglCore;

    .line 174
    new-instance v6, Lcom/android/grafika/gles/WindowSurface;

    iget-object v7, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {v7}, Landroid/media/MediaRecorder;->getSurface()Landroid/view/Surface;

    move-result-object v7

    invoke-direct {v6, v4, v7, v5}, Lcom/android/grafika/gles/WindowSurface;-><init>(Lcom/android/grafika/gles/EglCore;Landroid/view/Surface;Z)V

    iput-object v6, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->mInputWindowSurface:Lcom/android/grafika/gles/WindowSurface;

    :cond_2
    const-wide/16 v6, 0x3e8

    mul-long p2, p2, v6

    .line 181
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->mInputWindowSurface:Lcom/android/grafika/gles/WindowSurface;

    invoke-virtual {v4}, Lcom/android/grafika/gles/WindowSurface;->makeCurrent()V

    .line 183
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    if-nez v4, :cond_3

    .line 184
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;-><init>()V

    iput-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    :cond_3
    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 186
    invoke-static {v6, v6, v6, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v4, 0x4000

    .line 187
    invoke-static {v4}, Landroid/opengl/GLES20;->glClear(I)V

    .line 205
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->mInputWindowSurface:Lcom/android/grafika/gles/WindowSurface;

    invoke-virtual {v4, p2, p3}, Lcom/android/grafika/gles/WindowSurface;->setPresentationTime(J)V

    .line 206
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->mInputWindowSurface:Lcom/android/grafika/gles/WindowSurface;

    invoke-virtual {p2}, Lcom/android/grafika/gles/WindowSurface;->swapBuffers()Z

    .line 208
    invoke-static {p1, v2, v1, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "EGL14.eglMakeCurrent failed"

    .line 209
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return v0

    :cond_4
    return v5
.end method

.method public finish()V
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->reset()V

    .line 228
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    return-void
.end method

.method public frameAvailableSoon()V
    .locals 0

    return-void
.end method

.method public initialize(Ljava/io/File;IIIF)Ljava/lang/String;
    .locals 2

    .line 84
    iget-object p5, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    const/4 v0, 0x2

    invoke-virtual {p5, v0}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    .line 86
    iget-object p5, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {p5, p3, p4}, Landroid/media/MediaRecorder;->setVideoSize(II)V

    .line 87
    iget-object p5, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {p5, p2}, Landroid/media/MediaRecorder;->setVideoFrameRate(I)V

    .line 88
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    const/4 p5, 0x0

    invoke-virtual {p2, p5}, Landroid/media/MediaRecorder;->setVideoEncoder(I)V

    .line 91
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    const v1, 0x7d000

    invoke-virtual {p2, v1}, Landroid/media/MediaRecorder;->setVideoEncodingBitRate(I)V

    .line 98
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {p2, v0}, Landroid/media/MediaRecorder;->setAudioChannels(I)V

    .line 99
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    const/16 v0, 0x55f0

    invoke-virtual {p2, v0}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    .line 100
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {p2, p5}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    .line 101
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    const/16 p5, 0x1f40

    invoke-virtual {p2, p5}, Landroid/media/MediaRecorder;->setAudioEncodingBitRate(I)V

    .line 105
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    .line 109
    :try_start_0
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {p1}, Landroid/media/MediaRecorder;->prepare()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {p1}, Landroid/media/MediaRecorder;->start()V

    .line 120
    iput p3, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->outWidth:I

    .line 121
    iput p4, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->outHeight:I

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    .line 112
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public release()V
    .locals 2

    const/4 v0, 0x0

    .line 128
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    .line 130
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->mEglCore:Lcom/android/grafika/gles/EglCore;

    if-eqz v1, :cond_0

    .line 131
    invoke-virtual {v1}, Lcom/android/grafika/gles/EglCore;->release()V

    .line 133
    :cond_0
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->mEglCore:Lcom/android/grafika/gles/EglCore;

    return-void
.end method

.method public stop()V
    .locals 3

    .line 219
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/_VideoMediaRecorder;->recorder:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 222
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "recorder.stop failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
