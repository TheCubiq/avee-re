.class public Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;
.super Ljava/lang/Object;
.source "RenderState.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;
    }
.end annotation


# instance fields
.field private audioProcessMultiThread:Z

.field boundFb:Lmdesl/graphics/glutils/FrameBuffer;

.field private currentBlendMode:I

.field private currentGradualLoadingIndex:I

.field public final defaultZOffset:F

.field private fpsTimeAcc:J

.field private frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

.field private frameTime:I

.field private frameTimeF:F

.field private frameTimeSmooth:F

.field private fullscreenHeight:I

.field private fullscreenWidth:I

.field private lastTimeMs:J

.field private logoTrigger:I

.field private final matTmp2:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

.field public overrideScreenHeight:I

.field public overrideScreenWidth:I

.field private final projectionMatrix:[F

.field private renderEdges:Z

.field renderedCompositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public final res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

.field private screenHeight:I

.field private screenWidth:I

.field private totalFrameTime:J

.field private totalFrameTimeF:F

.field private final vPMatrix:[F

.field public final viewMat2Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

.field public final viewMat3Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

.field public final viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

.field private final viewMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

.field private final viewMatrix:[F


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V
    .locals 5

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x3ee00000    # -10.0f

    .line 44
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->defaultZOffset:F

    const/16 v1, 0x10

    new-array v2, v1, [F

    .line 46
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->vPMatrix:[F

    new-array v2, v1, [F

    .line 47
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->projectionMatrix:[F

    new-array v1, v1, [F

    .line 48
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMatrix:[F

    const/4 v1, 0x0

    .line 50
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeF:F

    .line 51
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeSmooth:F

    const/4 v2, 0x0

    .line 52
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    const-wide/16 v3, 0x0

    .line 53
    iput-wide v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fpsTimeAcc:J

    .line 55
    iput-wide v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->lastTimeMs:J

    .line 56
    iput-wide v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->totalFrameTime:J

    .line 57
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->totalFrameTimeF:F

    const/4 v3, 0x2

    .line 59
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fullscreenWidth:I

    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fullscreenHeight:I

    .line 60
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->screenWidth:I

    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->screenHeight:I

    .line 61
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->overrideScreenWidth:I

    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->overrideScreenHeight:I

    const/4 v3, -0x1

    .line 62
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->currentBlendMode:I

    .line 64
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/FrameStats;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/FrameStats;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    const/4 v3, 0x0

    .line 68
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->boundFb:Lmdesl/graphics/glutils/FrameBuffer;

    .line 70
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderedCompositions:Ljava/util/List;

    .line 72
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderEdges:Z

    const/4 v3, 0x1

    .line 73
    iput-boolean v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->audioProcessMultiThread:Z

    .line 75
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->currentGradualLoadingIndex:I

    .line 76
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->logoTrigger:I

    .line 79
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat2Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 80
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat3Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 81
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 82
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 83
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->matTmp2:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 86
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-direct {v3, p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    .line 87
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMatrix:[F

    invoke-static {p1, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 88
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMatrix:[F

    invoke-static {p1, v2, v1, v1, v0}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    return-void
.end method

.method public static checkOGLError(Ljava/lang/String;)Z
    .locals 3

    .line 169
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OGL Error ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ") : "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public addStatFlush()V
    .locals 2

    .line 349
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statFlushCounter:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statFlushCounter:I

    return-void
.end method

.method public addStatGradualResourceLoad()V
    .locals 2

    .line 357
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statGradualResourceLoadCounter:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statGradualResourceLoadCounter:I

    return-void
.end method

.method public addStatRTSwitch()V
    .locals 2

    .line 361
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statRTSwitchCounter:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statRTSwitchCounter:I

    return-void
.end method

.method public addStatResourceLoad()V
    .locals 2

    .line 353
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statResourceLoadCounter:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statResourceLoadCounter:I

    return-void
.end method

.method public bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 1

    const/4 v0, 0x0

    .line 432
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;Z)V

    return-void
.end method

.method public bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;Z)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez p2, :cond_0

    .line 436
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->boundFb:Lmdesl/graphics/glutils/FrameBuffer;

    if-ne v2, v1, :cond_0

    return-void

    .line 437
    :cond_0
    iput-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->boundFb:Lmdesl/graphics/glutils/FrameBuffer;

    .line 439
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->addStatRTSwitch()V

    .line 441
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->onFrameEnd(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    if-nez v1, :cond_1

    .line 444
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v3, v1, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const v1, 0x8d40

    .line 445
    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 447
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->projectionMatrix:[F

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenWidth()I

    move-result v1

    int-to-float v7, v1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenHeight()I

    move-result v1

    int-to-float v8, v1

    const/4 v9, 0x0

    const v10, 0x3c23d70a    # 0.01f

    const/high16 v11, 0x42c80000    # 100.0f

    invoke-static/range {v4 .. v11}, Landroid/opengl/Matrix;->orthoM([FIFFFFFF)V

    .line 448
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->vPMatrix:[F

    const/4 v13, 0x0

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->projectionMatrix:[F

    const/4 v15, 0x0

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMatrix:[F

    const/16 v17, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v12 .. v17}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    goto :goto_0

    .line 450
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lmdesl/graphics/glutils/FrameBuffer;->begin()V

    .line 452
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->projectionMatrix:[F

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {p1 .. p1}, Lmdesl/graphics/glutils/FrameBuffer;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual/range {p1 .. p1}, Lmdesl/graphics/glutils/FrameBuffer;->getHeight()I

    move-result v1

    int-to-float v6, v1

    const/4 v7, 0x0

    const v8, 0x3c23d70a    # 0.01f

    const/high16 v9, 0x42c80000    # 100.0f

    invoke-static/range {v2 .. v9}, Landroid/opengl/Matrix;->orthoM([FIFFFFFF)V

    .line 453
    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->vPMatrix:[F

    const/4 v11, 0x0

    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->projectionMatrix:[F

    const/4 v13, 0x0

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMatrix:[F

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    :goto_0
    return-void
.end method

.method public bindShaderForceFlush(Lmdesl/graphics/glutils/ShaderProgram;)V
    .locals 1

    .line 513
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->onFrameEnd(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    if-eqz p1, :cond_0

    .line 515
    invoke-virtual {p1}, Lmdesl/graphics/glutils/ShaderProgram;->use()V

    :cond_0
    return-void
.end method

.method public bindShaderNoFlush(Lmdesl/graphics/glutils/ShaderProgram;)V
    .locals 0

    .line 524
    invoke-virtual {p1}, Lmdesl/graphics/glutils/ShaderProgram;->use()V

    return-void
.end method

.method public bindTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;I)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 686
    check-cast p1, Lmdesl/graphics/ITexture;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindTexture(Lmdesl/graphics/ITexture;I)V

    return-void

    .line 690
    :cond_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getTexture2D()Lmdesl/graphics/ITexture;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindTexture(Lmdesl/graphics/ITexture;I)V

    return-void
.end method

.method public bindTexture(Lmdesl/graphics/ITexture;I)V
    .locals 1

    const v0, 0x84c0

    add-int/2addr p2, v0

    .line 694
    invoke-static {p2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    if-eqz p1, :cond_0

    .line 702
    invoke-interface {p1}, Lmdesl/graphics/ITexture;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p1

    invoke-virtual {p1}, Lmdesl/graphics/Texture;->bind()V

    goto :goto_0

    .line 704
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getTexture2D()Lmdesl/graphics/ITexture;

    move-result-object p1

    invoke-interface {p1}, Lmdesl/graphics/ITexture;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p1

    invoke-virtual {p1}, Lmdesl/graphics/Texture;->bind()V

    :goto_0
    return-void
.end method

.method public clearCompositionResults()V
    .locals 3

    const/4 v0, 0x0

    .line 664
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderedCompositions:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 666
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderedCompositions:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public createViewProjMatrix(Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;)V
    .locals 6

    .line 459
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->projectionMatrix:[F

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v4

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public createViewProjMatrixPerspective(Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;Lcom/daaw/avee/Common/Vec2f;Lmdesl/graphics/glutils/FrameBuffer;FFFFFF)V
    .locals 12

    move-object v0, p0

    move-object v1, p2

    if-nez p3, :cond_0

    .line 484
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenWidth()I

    move-result v2

    int-to-float v2, v2

    .line 485
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenHeight()I

    move-result v3

    goto :goto_0

    .line 487
    :cond_0
    invoke-virtual {p3}, Lmdesl/graphics/glutils/FrameBuffer;->getWidth()I

    move-result v2

    int-to-float v2, v2

    .line 488
    invoke-virtual {p3}, Lmdesl/graphics/glutils/FrameBuffer;->getHeight()I

    move-result v3

    :goto_0
    int-to-float v3, v3

    .line 491
    iput v2, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 492
    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 494
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->setIdentity()V

    .line 495
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    mul-float v4, v2, p7

    mul-float v5, v3, p8

    move/from16 v6, p9

    invoke-virtual {v1, v4, v5, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->translate(FFF)V

    div-float v9, v2, v3

    .line 498
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->matTmp2:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v6

    const/4 v7, 0x0

    move/from16 v8, p4

    move/from16 v10, p5

    move/from16 v11, p6

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->perspectiveM([FIFFFF)V

    .line 500
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->matTmp2:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v3

    const/4 v4, 0x0

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v5

    const/4 v6, 0x0

    move-object p1, v1

    move p2, v2

    move-object p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    invoke-static/range {p1 .. p6}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public createViewProjMatrixPerspectiveBoundsAtZ(Lcom/daaw/avee/Common/Vec2f;FLmdesl/graphics/glutils/FrameBuffer;FF)V
    .locals 2

    float-to-double p2, p2

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float p5, p5, v0

    float-to-double v0, p5

    .line 473
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p2, p2, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->abs(D)D

    move-result-wide p2

    double-to-float p2, p2

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 474
    iget p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float p2, p2, p4

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    return-void
.end method

.method public drawFullscreenQuad(FFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 13

    move-object v12, p0

    .line 590
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    .line 593
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenWidth()I

    move-result v1

    int-to-float v5, v1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenHeight()I

    move-result v1

    int-to-float v6, v1

    const/4 v4, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move v2, p1

    move v3, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    .line 590
    invoke-virtual/range {v0 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawFullscreenQuad(FFILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 13

    move-object v12, p0

    .line 578
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    .line 581
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenWidth()I

    move-result v1

    int-to-float v5, v1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenHeight()I

    move-result v1

    int-to-float v6, v1

    .line 583
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v8

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v9

    const/4 v4, 0x0

    const/4 v11, 0x1

    move-object v1, p0

    move v2, p1

    move v3, p2

    move/from16 v7, p3

    move-object/from16 v10, p4

    .line 578
    invoke-virtual/range {v0 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V
    .locals 13

    move-object v12, p0

    .line 615
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    .line 618
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenWidth()I

    move-result v1

    int-to-float v5, v1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenHeight()I

    move-result v1

    int-to-float v6, v1

    .line 620
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v8

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v9

    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    const/4 v1, 0x0

    move-object v2, p2

    move/from16 v3, p3

    invoke-direct {v10, v3, p2, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move v7, p1

    .line 615
    invoke-virtual/range {v0 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 1

    const/4 v0, 0x0

    .line 573
    invoke-virtual {p0, v0, v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method

.method public drawFullscreenQuadM1P1(ILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 13

    move-object v12, p0

    .line 603
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, -0x40800000    # -1.0f

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v11, 0x0

    move-object v1, p0

    move v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawFullscreenQuadNonAtlasBuffer()V
    .locals 1

    .line 651
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$200(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->draw()V

    return-void
.end method

.method public frameResourcesLoadingAdd()V
    .locals 2

    .line 345
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->frameResourcesLoadingCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->frameResourcesLoadingCount:I

    return-void
.end method

.method public getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;
    .locals 1

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    return-object v0
.end method

.method public getCompositionResult(I)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;
    .locals 1

    .line 680
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderedCompositions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderedCompositions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    return-object v0
.end method

.method public getFrameTime()I
    .locals 1

    .line 123
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    return v0
.end method

.method public getFrameTimeF()F
    .locals 1

    .line 114
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeF:F

    return v0
.end method

.method public getFrameTimeSmooth()F
    .locals 1

    .line 118
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeSmooth:F

    return v0
.end method

.method public getFullscreenHeight()I
    .locals 2

    .line 157
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->overrideScreenHeight:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fullscreenHeight:I

    :cond_0
    return v0
.end method

.method public getFullscreenWidth()I
    .locals 2

    .line 153
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->overrideScreenWidth:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fullscreenWidth:I

    :cond_0
    return v0
.end method

.method public getMultiThread()Z
    .locals 1

    .line 195
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->audioProcessMultiThread:Z

    return v0
.end method

.method public getRenderEdges()Z
    .locals 1

    .line 185
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderEdges:Z

    return v0
.end method

.method public getRenderEdgesPaths()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    return-object v0
.end method

.method public getSafeFullScreenSizeTextureDim()Lcom/daaw/avee/Common/Vec2i;
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/16 v2, 0xd33

    .line 544
    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glGetIntegerv(I[II)V

    .line 546
    aget v0, v0, v1

    .line 548
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OGL Max texture size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 549
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fullscreen size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFullscreenWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFullscreenHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 551
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFullscreenWidth()I

    move-result v1

    .line 552
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFullscreenHeight()I

    move-result v2

    .line 554
    new-instance v3, Lcom/daaw/avee/Common/Vec2i;

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v3, v1, v0}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    return-object v3
.end method

.method public getSafeRenderBufferSizeTextureDim()Lcom/daaw/avee/Common/Vec2i;
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x84e8

    .line 529
    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glGetIntegerv(I[II)V

    .line 531
    aget v0, v0, v1

    .line 533
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OGL Max render buffer size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 534
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fullscreen size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFullscreenWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFullscreenHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 536
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFullscreenWidth()I

    move-result v1

    .line 537
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFullscreenHeight()I

    move-result v2

    .line 539
    new-instance v3, Lcom/daaw/avee/Common/Vec2i;

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v3, v1, v0}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    return-object v3
.end method

.method public getSafeScreenSizeTextureDim()Lcom/daaw/avee/Common/Vec2i;
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/16 v2, 0xd33

    .line 560
    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glGetIntegerv(I[II)V

    .line 562
    aget v0, v0, v1

    .line 564
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OGL Max texture size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 566
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenWidth()I

    move-result v1

    .line 567
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getScreenHeight()I

    move-result v2

    .line 569
    new-instance v3, Lcom/daaw/avee/Common/Vec2i;

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v3, v1, v0}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    return-object v3
.end method

.method public getScreenHeight()I
    .locals 2

    .line 165
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->overrideScreenHeight:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fullscreenHeight:I

    :cond_0
    return v0
.end method

.method public getScreenWidth()I
    .locals 2

    .line 161
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->overrideScreenWidth:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fullscreenWidth:I

    :cond_0
    return v0
.end method

.method public getTotalFrameTimeF()F
    .locals 1

    .line 127
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->totalFrameTimeF:F

    return v0
.end method

.method public getTriggerLogo()I
    .locals 1

    .line 96
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->logoTrigger:I

    return v0
.end method

.method public getVPMatrix()[F
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->vPMatrix:[F

    return-object v0
.end method

.method public isVisibleOnScreen(Lcom/daaw/avee/Common/Vec2f;F)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onFrameEnd()V
    .locals 1

    .line 365
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->onFrameEnd(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    const/4 v0, 0x0

    .line 367
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->logoTrigger:I

    return-void
.end method

.method public onFrameStart(III)V
    .locals 8

    .line 240
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statFlushCounter:I

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statFlushCount:I

    .line 241
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statFlushCounter:I

    .line 242
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v2, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statResourceLoadCounter:I

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statResourceLoadCount:I

    .line 243
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statResourceLoadCounter:I

    .line 244
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v2, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statGradualResourceLoadCounter:I

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statGradualResourceLoadCount:I

    .line 245
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statGradualResourceLoadCounter:I

    .line 246
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v2, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statRTSwitchCounter:I

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statRTSwitchCount:I

    .line 247
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statRTSwitchCounter:I

    .line 251
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->overrideScreenWidth:I

    .line 252
    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->overrideScreenHeight:I

    const p2, 0x3a83126f    # 0.001f

    const/high16 p3, 0x3f800000    # 1.0f

    const/4 v0, 0x1

    if-lez p1, :cond_0

    .line 255
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    const-wide/16 v2, 0x0

    .line 256
    iput-wide v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->lastTimeMs:J

    int-to-float p1, p1

    mul-float p1, p1, p2

    .line 258
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeF:F

    .line 259
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeSmooth:F

    .line 261
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    div-float p1, p3, p1

    float-to-int p1, p1

    iput p1, v2, Lcom/daaw/avee/comp/Visualizer/FrameStats;->fps:I

    goto :goto_0

    .line 264
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 266
    iget-wide v4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->lastTimeMs:J

    sub-long v4, v2, v4

    long-to-int p1, v4

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    .line 267
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v4, p1, Lcom/daaw/avee/comp/Visualizer/FrameStats;->fpsAcc:I

    add-int/2addr v4, v0

    iput v4, p1, Lcom/daaw/avee/comp/Visualizer/FrameStats;->fpsAcc:I

    .line 269
    iget-wide v4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fpsTimeAcc:J

    sub-long v4, v2, v4

    const-wide/16 v6, 0x3e8

    cmp-long p1, v4, v6

    if-ltz p1, :cond_1

    .line 270
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v4, p1, Lcom/daaw/avee/comp/Visualizer/FrameStats;->fpsAcc:I

    iput v4, p1, Lcom/daaw/avee/comp/Visualizer/FrameStats;->fps:I

    .line 271
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iput v1, p1, Lcom/daaw/avee/comp/Visualizer/FrameStats;->fpsAcc:I

    .line 272
    iput-wide v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fpsTimeAcc:J

    .line 276
    :cond_1
    iput-wide v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->lastTimeMs:J

    .line 279
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    if-gez p1, :cond_2

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    .line 280
    :cond_2
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    const/16 v2, 0xc8

    if-le p1, v2, :cond_3

    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    .line 281
    :cond_3
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    int-to-float p1, p1

    mul-float p1, p1, p2

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeF:F

    .line 282
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeSmooth:F

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v2, v2, v3

    mul-float p1, p1, v3

    add-float/2addr v2, p1

    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeSmooth:F

    .line 285
    :goto_0
    iget-wide v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->totalFrameTime:J

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTime:I

    int-to-long v4, p1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->totalFrameTime:J

    long-to-float p1, v2

    mul-float p1, p1, p2

    .line 286
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->totalFrameTimeF:F

    .line 288
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iput v1, p1, Lcom/daaw/avee/comp/Visualizer/FrameStats;->frameResourcesLoadingCount:I

    .line 291
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestAntiAliasingValue()I

    move-result p1

    if-lez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderEdges:Z

    .line 292
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestAudioProcessMultiThreadValue()I

    move-result p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    goto :goto_2

    :cond_5
    const/4 p1, 0x0

    :goto_2
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->audioProcessMultiThread:Z

    .line 295
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->clearCompositionResults()V

    const/4 p1, 0x0

    .line 297
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;Z)V

    .line 303
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBuffer()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object p1

    new-instance p2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    invoke-virtual {p1, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->setOnBindAction1(ZLcom/daaw/avee/Common/Action2;)V

    .line 311
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferVPMat()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object p1

    new-instance p2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$2;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    invoke-virtual {p1, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->setOnBindAction1(ZLcom/daaw/avee/Common/Action2;)V

    .line 323
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindShaderForceFlush(Lmdesl/graphics/glutils/ShaderProgram;)V

    .line 324
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getVPMatrix()[F

    move-result-object p2

    const-string v2, "u_projView"

    invoke-virtual {p1, v2, v1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix(Ljava/lang/String;Z[F)V

    .line 325
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string p2, "u_texture"

    invoke-virtual {p1, p2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformi(Ljava/lang/String;I)V

    .line 326
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string p2, "u_texture2"

    invoke-virtual {p1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformi(Ljava/lang/String;I)V

    .line 327
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const/4 p2, 0x0

    const-string v0, "maskadd"

    invoke-virtual {p1, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 328
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string v0, "maskmul"

    invoke-virtual {p1, v0, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 329
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string v0, "mask_l_add"

    invoke-virtual {p1, v0, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 330
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string v0, "mask_l_mul"

    invoke-virtual {p1, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 331
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string v0, "tex2_y_add"

    invoke-virtual {p1, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 332
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string p2, "tex2_y_mul"

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 333
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const-string v1, "Color2"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFFF)V

    .line 334
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string p2, "saturation"

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 336
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$000(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 337
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$000(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;

    move-result-object p1

    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameTimeF:F

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;->onFrameStart(F)V

    .line 339
    :cond_6
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->onFrameStart(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 341
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Meter;->onFrameStart()V

    return-void
.end method

.method public onOffScreenContentRendered(Lmdesl/graphics/Texture;)V
    .locals 3

    .line 657
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/FrameStats;->frameResourcesLoadingCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " / "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statResourceLoadCount:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statGradualResourceLoadCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 659
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v1, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameStats:Lcom/daaw/avee/comp/Visualizer/FrameStats;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/FrameStats;->getFrameResourcesLoadingCount()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1, p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onOffScreenContentRendered(Lmdesl/graphics/Texture;ZLjava/lang/String;)V

    return-void
.end method

.method public onResources(Landroid/content/res/Resources;)V
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->onResources(Landroid/content/res/Resources;)V

    return-void
.end method

.method public onSurfaceChanged(Landroid/content/Context;II)Z
    .locals 0

    .line 210
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->screenWidth:I

    if-ne p1, p2, :cond_0

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->screenHeight:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 215
    :cond_0
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->screenWidth:I

    .line 216
    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->screenHeight:I

    .line 218
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fullscreenWidth:I

    .line 219
    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->fullscreenHeight:I

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceCreated()V
    .locals 1

    .line 203
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->unsetBlendMode()V

    const/16 v0, 0xbe2

    .line 204
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 205
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->onSurfaceCreated()V

    return-void
.end method

.method public resetBindTexture()V
    .locals 1

    const v0, 0x84c0

    .line 709
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    return-void
.end method

.method public setBlendMode(I)V
    .locals 4

    .line 380
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->currentBlendMode:I

    if-ne v0, p1, :cond_0

    return-void

    .line 382
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->onFrameEnd(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    const/16 v0, 0x303

    const/16 v1, 0x302

    if-eqz p1, :cond_6

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v3, 0x2

    if-eq p1, v3, :cond_4

    const/4 v3, 0x3

    if-eq p1, v3, :cond_3

    const/4 v3, 0x4

    if-eq p1, v3, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    goto :goto_0

    .line 410
    :cond_1
    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    goto :goto_0

    .line 403
    :cond_2
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    .line 399
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    goto :goto_0

    .line 395
    :cond_4
    invoke-static {v2, v2}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    goto :goto_0

    :cond_5
    const/16 v0, 0x301

    .line 391
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    goto :goto_0

    .line 387
    :cond_6
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    .line 414
    :goto_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->currentBlendMode:I

    return-void
.end method

.method public setBlendModeForce(I)V
    .locals 1

    const/4 v0, -0x1

    .line 375
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->currentBlendMode:I

    .line 376
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setBlendMode(I)V

    return-void
.end method

.method public setCompositionResult(ILcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)V
    .locals 2

    .line 672
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderedCompositions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 673
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderedCompositions:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 675
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->renderedCompositions:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setTextureWrapping(I)V
    .locals 4

    const/16 v0, 0x2803

    const/16 v1, 0x2802

    const/16 v2, 0xde1

    const/4 v3, 0x2

    if-ne p1, v3, :cond_0

    const p1, 0x812f

    .line 421
    invoke-static {v2, v1, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 422
    invoke-static {v2, v0, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    const p1, 0x8370

    .line 424
    invoke-static {v2, v1, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 425
    invoke-static {v2, v0, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setTriggerLogo(I)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->logoTrigger:I

    return-void
.end method

.method public unbindShader()V
    .locals 0

    return-void
.end method

.method public unsetBlendMode()V
    .locals 1

    const/4 v0, -0x1

    .line 371
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->currentBlendMode:I

    return-void
.end method
