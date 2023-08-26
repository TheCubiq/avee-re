.class public Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;
.super Ljava/lang/Object;
.source "RendererCore.java"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# instance fields
.field private context:Landroid/content/Context;

.field private final renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

.field private rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

.field startTime:J

.field private surfaceCreated:Z

.field visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/Resources;Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V
    .locals 2

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    .line 33
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->context:Landroid/content/Context;

    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->surfaceCreated:Z

    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->startTime:J

    .line 38
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->context:Landroid/content/Context;

    .line 39
    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    .line 40
    new-instance p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-direct {p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;-><init>(Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    .line 41
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->onResources(Landroid/content/res/Resources;)V

    .line 44
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->requestRefreshThemeElements()V

    return-void
.end method


# virtual methods
.method public getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;

    move-result-object v0

    return-object v0
.end method

.method public getFrameTimeMs()I
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameTime()I

    move-result v0

    return v0
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 7

    .line 75
    iget-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->surfaceCreated:Z

    if-nez p1, :cond_0

    return-void

    .line 76
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->isValid()Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 78
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    .line 81
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestFrameCaptureMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3dcccccd    # 0.1f

    .line 100
    invoke-static {v3, v3, v3, v2}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v2, 0x4100

    .line 101
    invoke-static {v2}, Landroid/opengl/GLES20;->glClear(I)V

    const/16 v2, 0x2801

    const/16 v3, 0x2601

    const/16 v4, 0xde1

    .line 103
    invoke-static {v4, v2, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 104
    invoke-static {v4, v2, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 109
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    if-eqz v0, :cond_2

    .line 112
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->overrideFrameTimeMs:I

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->overrideScreenWidth:I

    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->overrideScreenHeight:I

    invoke-virtual {v2, v4, v5, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->onFrameStart(III)V

    goto :goto_0

    .line 117
    :cond_2
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    const/4 v4, -0x1

    invoke-virtual {v2, v4, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->onFrameStart(III)V

    .line 119
    :goto_0
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onFrameStart:Lcom/daaw/avee/Common/Events/WeakEvent2;

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameTimeF()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getTotalFrameTimeF()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    .line 126
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {p1, v2, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    :cond_3
    if-eqz p1, :cond_7

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    if-eqz v0, :cond_5

    .line 139
    iget-boolean v5, v0, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->captureToImageBuffer:Z

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    if-eqz v0, :cond_6

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->reuseBuffer0:[I

    goto :goto_3

    :cond_6
    move-object v2, v1

    :goto_3
    invoke-virtual {p1, v4, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setOffscreenRenderingEnabled(ZZ[I)V

    :cond_7
    if-eqz p1, :cond_8

    .line 145
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 147
    :cond_8
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->onFrameEnd()V

    .line 148
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {v2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    if-eqz p1, :cond_9

    if-eqz v0, :cond_9

    .line 150
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getOffscreenImageBuffer()[I

    move-result-object v0

    if-eqz v0, :cond_9

    .line 151
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getOffscreenImageBuffer()[I

    move-result-object v0

    .line 152
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getOffscreenImageWidth()I

    move-result v1

    .line 153
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getOffscreenImageHeight()I

    move-result p1

    .line 154
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onFrameCaptured:Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, v0, v1, p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 1

    .line 58
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onSurfaceChanged: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " ; "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 60
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->onSurfaceChanged(Landroid/content/Context;II)Z

    .line 66
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    if-eqz p1, :cond_0

    .line 67
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->surfaceCreated:Z

    .line 50
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->onSurfaceCreated()V

    .line 51
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    if-eqz p1, :cond_0

    .line 52
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method public readThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    if-eqz v0, :cond_0

    .line 210
    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->readThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    :cond_0
    return-void
.end method

.method public requestRefreshThemeElements()V
    .locals 2

    .line 168
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestSelectedSkinThemePreset:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/CustomScene;

    if-eqz v0, :cond_0

    .line 170
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->setThemeElements(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    :cond_0
    return-void
.end method

.method public resetVisualizer()V
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method public setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    if-eqz v0, :cond_0

    .line 205
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    :cond_0
    return-void
.end method

.method public setThemeElements(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 3

    .line 189
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    if-nez v0, :cond_0

    .line 190
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerThemes;->s()Lcom/daaw/avee/Design/VisualizerThemes;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, ""

    invoke-virtual {v0, v1, v1, v2}, Lcom/daaw/avee/Design/VisualizerThemes;->getThemeObjectForLoading2(IZLjava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    .line 192
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    .line 195
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    if-eqz p1, :cond_1

    .line 196
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->markNeedReCreateGLResources()V

    .line 199
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onThemeChanged()V

    return-void
.end method

.method public setThemeElements(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    if-eqz p1, :cond_0

    .line 177
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->markNeedReCreateGLResources()V

    .line 180
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onThemeChanged()V

    return-void
.end method

.method public setTriggerLogo(II)V
    .locals 1

    if-lez p2, :cond_0

    .line 220
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->rootElement:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->findElementById(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 221
    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->setTrigger(I)V

    goto :goto_0

    .line 223
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTriggerLogo(I)V

    :cond_1
    :goto_0
    return-void
.end method
