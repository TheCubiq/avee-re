.class public Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "BlurEffectElement.java"


# static fields
.field public static final typeName:Ljava/lang/String; = "BlurEffect"


# instance fields
.field private blendModeContent:I

.field blurContentPreRendered:Lmdesl/graphics/Texture;

.field private blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

.field private blurMultiplier:F

.field private blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

.field private blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

.field private color2:I

.field currentVerticalBlurV2ResultHeight:I

.field currentVerticalBlurV2ResultWidth:I

.field maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field offscreenContentPreRender:Z

.field private radius:F

.field private referenceComposition:I

.field private renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;"
        }
    .end annotation
.end field

.field private renderContent:Z

.field private renderContentFxaa:Z

.field private renderContentFxaaUnder:Z

.field private renderContentUnder:Z

.field private renderContentUnderShaderOnBindAction:Lcom/daaw/avee/Common/Action3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;"
        }
    .end annotation
.end field

.field private renderHorizanlBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;"
        }
    .end annotation
.end field

.field private renderVerticalBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;"
        }
    .end annotation
.end field

.field private useMipmaps:Z


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v0, 0x2

    const/high16 v1, 0x3f800000    # 1.0f

    .line 61
    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const/4 v2, 0x0

    .line 39
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->useMipmaps:Z

    .line 40
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->radius:F

    const v3, 0x40833333    # 4.1f

    .line 41
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurMultiplier:F

    const/high16 v3, -0x1000000

    .line 43
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->color2:I

    const/4 v3, 0x3

    new-array v3, v3, [Lcom/daaw/avee/Common/Vec2f;

    .line 44
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    .line 45
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentFxaa:Z

    .line 46
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContent:Z

    .line 47
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentFxaaUnder:Z

    .line 48
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentUnder:Z

    .line 49
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blendModeContent:I

    const/4 v0, 0x1

    .line 50
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->referenceComposition:I

    const/16 v3, 0x64

    .line 52
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->currentVerticalBlurV2ResultHeight:I

    .line 53
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->currentVerticalBlurV2ResultWidth:I

    .line 57
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->offscreenContentPreRender:Z

    .line 255
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$2;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentUnderShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 281
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$3;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$3;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 604
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$4;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$4;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderHorizanlBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 620
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderVerticalBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 62
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setScale(FF)V

    .line 64
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v4, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v4, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v4, v3, v2

    .line 65
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    array-length v3, v1

    if-ge v0, v3, :cond_0

    .line 66
    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 68
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)V

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 75
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setMaskCustomImage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)V
    .locals 0

    .line 35
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)F
    .locals 0

    .line 35
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->radius:F

    return p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)I
    .locals 0

    .line 35
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->color2:I

    return p0
.end method

.method private horizontalBlur(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V
    .locals 3

    .line 552
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindShaderForceFlush(Lmdesl/graphics/glutils/ShaderProgram;)V

    .line 557
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->radius:F

    invoke-virtual {p3}, Lmdesl/graphics/Texture;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v1, v1, v2

    const-string v2, "blurW"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 558
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v0

    invoke-virtual {p3}, Lmdesl/graphics/Texture;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const-string v2, "resolutionH"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 560
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    const/4 p2, 0x3

    .line 561
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setBlendMode(I)V

    const/4 p2, 0x0

    .line 562
    invoke-static {p2, p2, p2, p2}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 p2, 0x4000

    .line 563
    invoke-static {p2}, Landroid/opengl/GLES20;->glClear(I)V

    .line 565
    invoke-virtual {p3}, Lmdesl/graphics/Texture;->bind()V

    .line 567
    iget-boolean p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->useMipmaps:Z

    if-eqz p2, :cond_0

    .line 568
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setupFrameBuffer0()V

    const/16 p2, 0xde1

    .line 569
    invoke-static {p2}, Landroid/opengl/GLES20;->glGenerateMipmap(I)V

    goto :goto_0

    .line 571
    :cond_0
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 574
    :goto_0
    iget-object p2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFullQuad()Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    move-result-object p2

    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string p3, "Position"

    invoke-virtual {p2, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->drawShader(Lmdesl/graphics/glutils/ShaderProgram;Ljava/lang/String;)V

    return-void
.end method

.method private horizontalBlurV2(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V
    .locals 3

    .line 637
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 639
    iget-object p2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_blurShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object p2

    .line 641
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    const/4 v2, 0x0

    invoke-direct {v1, p3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderHorizanlBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 642
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object p2

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object p3

    const/4 v1, -0x1

    invoke-virtual {p1, v1, p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuadM1P1(ILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method

.method private setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    const/16 v0, 0x2601

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 544
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 545
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    .line 547
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    return-void
.end method

.method private setupFrameBuffer0()V
    .locals 3

    const/16 v0, 0x2703

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 536
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 537
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const v0, 0x8370

    const/16 v2, 0x2802

    .line 539
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2803

    .line 540
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    return-void
.end method

.method private verticalBlur2(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V
    .locals 8

    .line 581
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader2()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindShaderForceFlush(Lmdesl/graphics/glutils/ShaderProgram;)V

    .line 585
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader2()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->radius:F

    invoke-virtual {p2}, Lmdesl/graphics/glutils/FrameBuffer;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    const-string v2, "blurH"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const/4 v0, 0x4

    new-array v0, v0, [F

    .line 588
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->color2:I

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    .line 589
    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader2()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v2

    const/4 v1, 0x0

    aget v4, v0, v1

    const/4 v1, 0x1

    aget v5, v0, v1

    const/4 v1, 0x2

    aget v6, v0, v1

    const/4 v1, 0x3

    aget v7, v0, v1

    const-string v3, "Color2"

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFFF)V

    .line 591
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 592
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setBlendMode(I)V

    const/4 p2, 0x0

    .line 593
    invoke-static {p2, p2, p2, p2}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 p2, 0x4000

    .line 594
    invoke-static {p2}, Landroid/opengl/GLES20;->glClear(I)V

    .line 596
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 598
    invoke-virtual {p3}, Lmdesl/graphics/Texture;->bind()V

    .line 599
    iget-object p2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFullQuad()Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    move-result-object p2

    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader2()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p1

    const-string p3, "Position"

    invoke-virtual {p2, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->drawShader(Lmdesl/graphics/glutils/ShaderProgram;Ljava/lang/String;)V

    return-void
.end method

.method private verticalBlurV2(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V
    .locals 3

    .line 647
    invoke-virtual {p2}, Lmdesl/graphics/glutils/FrameBuffer;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->currentVerticalBlurV2ResultWidth:I

    .line 648
    invoke-virtual {p2}, Lmdesl/graphics/glutils/FrameBuffer;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->currentVerticalBlurV2ResultHeight:I

    .line 651
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 653
    iget-object p2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_blurShader2()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object p2

    .line 655
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    const/4 v2, 0x0

    invoke-direct {v1, p3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderVerticalBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 656
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object p2

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object p3

    const/4 v1, -0x1

    invoke-virtual {p1, v1, p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuadM1P1(ILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method


# virtual methods
.method protected getBlendModeContent()I
    .locals 1

    .line 142
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blendModeContent:I

    return v0
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "BlurEffect"

    return-object v0
.end method

.method public getRenderContent()Z
    .locals 1

    .line 121
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContent:Z

    return v0
.end method

.method public getRenderContentUnder()Z
    .locals 1

    .line 131
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentUnder:Z

    return v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 196
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 197
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 154
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "blendModeContent"

    .line 156
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    .line 157
    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->create(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendModeContent(I)V

    const-string v0, "color"

    const/high16 v2, -0x1000000

    .line 158
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    const/4 v0, 0x1

    const-string v2, "sourceCompositionIndex"

    .line 159
    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setReferenceComposition(I)V

    .line 160
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    sget-object v3, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    const-string v5, "MaskImage"

    invoke-virtual {p1, v5, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    const/high16 v2, 0x3f800000    # 1.0f

    const-string v3, "blurRadius"

    .line 162
    invoke-virtual {p1, v3, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurRadius(F)V

    const-string v3, "blurMultiplier"

    const v5, 0x40833333    # 4.1f

    .line 163
    invoke-virtual {p1, v3, v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurMultiplier(F)V

    const-string v3, "showUnblurredContent"

    .line 164
    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    const-string v3, "showUnblurredContentUnder"

    .line 165
    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentUnder(Z)V

    .line 167
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v5, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v5, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v2, "1layerScale"

    invoke-virtual {p1, v2, v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v2

    aput-object v2, v3, v4

    .line 168
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v5, "2layerScale"

    invoke-virtual {p1, v5, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v3

    aput-object v3, v2, v0

    .line 169
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v2, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v3, "3layerScale"

    invoke-virtual {p1, v3, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    aput-object p1, v0, v1

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 6

    .line 213
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->useMipmaps:Z

    .line 215
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 216
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    .line 219
    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getSafeRenderBufferSizeTextureDim()Lcom/daaw/avee/Common/Vec2i;

    move-result-object v0

    .line 224
    iget v1, v0, Lcom/daaw/avee/Common/Vec2i;->x:I

    int-to-float v1, v1

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurMultiplier:F

    div-float/2addr v1, v3

    .line 225
    iget v0, v0, Lcom/daaw/avee/Common/Vec2i;->y:I

    int-to-float v0, v0

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurMultiplier:F

    div-float/2addr v0, v3

    .line 227
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    :cond_0
    float-to-int v1, v1

    float-to-int v0, v0

    const/16 v3, 0x2901

    const/16 v4, 0x2601

    .line 228
    invoke-static {v1, v0, v4, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->createSafe(IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v5

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz v5, :cond_1

    .line 229
    invoke-virtual {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->checkIfValid()Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v5

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    .line 231
    :cond_1
    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz v5, :cond_2

    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    .line 232
    :cond_2
    invoke-static {v1, v0, v4, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->createSafe(IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz v0, :cond_3

    .line 233
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->checkIfValid()Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 236
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 239
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 244
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    .line 245
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 202
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 203
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 205
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    :cond_1
    const/4 p1, 0x0

    .line 206
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    .line 207
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    .line 208
    :cond_2
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 250
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 251
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->referenceComposition:I

    invoke-interface {p3, v0}, Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;->addDependencyCompositionIndex(I)V

    .line 252
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 7

    .line 174
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    const-string v0, "Blur Effect"

    .line 176
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 178
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blendModeContent:I

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->getTypeName(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->useableModes:[Ljava/lang/String;

    const-string v6, "1_appearance"

    const-string v2, "blendModeContent"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 179
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->color2:I

    const-string v1, "color"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 181
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->referenceComposition:I

    const-string v1, "sourceCompositionIndex"

    const-string v3, "1_appearance"

    const/4 v4, 0x1

    const/4 v5, 0x5

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 182
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    const-string v2, "MaskImage"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 185
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->radius:F

    const-string v1, "blurRadius"

    const-string v3, "2_blur"

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 186
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurMultiplier:F

    const-string v1, "blurMultiplier"

    const-string v3, "2_blur"

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x40c00000    # 6.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 187
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->getRenderContent()Z

    move-result v0

    const-string v1, "showUnblurredContent"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 188
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->getRenderContentUnder()Z

    move-result v0

    const-string v1, "showUnblurredContentUnder"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 189
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const-string v1, "1layerScale"

    const-string v3, "2_blur"

    const/4 v4, 0x0

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 190
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x1

    aget-object v2, v0, v1

    const-string v1, "2layerScale"

    const-string v3, "2_blur"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 191
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x2

    aget-object v2, v0, v1

    const-string v1, "3layerScale"

    const-string v3, "2_blur"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    .line 344
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v2, p2

    invoke-virtual {v1, v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 346
    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->referenceComposition:I

    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getCompositionResult(I)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v9

    .line 347
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v1, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setUseMipmaps(Z)V

    .line 348
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    if-eqz v9, :cond_9

    .line 349
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz v1, :cond_9

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 360
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    .line 361
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    .line 370
    invoke-direct/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 374
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->offscreenContentPreRender:Z

    const/4 v10, 0x0

    if-nez v1, :cond_2

    .line 377
    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->radius:F

    cmpl-float v1, v1, v10

    if-lez v1, :cond_1

    .line 380
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v3

    invoke-direct {v0, v8, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->horizontalBlurV2(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V

    .line 382
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v3

    invoke-direct {v0, v8, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->verticalBlurV2(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V

    .line 384
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v1

    goto :goto_0

    .line 386
    :cond_1
    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v1

    goto :goto_0

    .line 389
    :cond_2
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurContentPreRendered:Lmdesl/graphics/Texture;

    const/4 v3, 0x0

    .line 390
    iput-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurContentPreRendered:Lmdesl/graphics/Texture;

    :goto_0
    move-object v11, v1

    .line 394
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 399
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentFxaaUnder:Z

    const/4 v12, 0x2

    const-string v13, "Position"

    const-string v14, "resolutionH"

    const-string v15, "resolutionW"

    const/4 v7, -0x1

    const/16 v16, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    .line 401
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->getBlendModeContent()I

    move-result v1

    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setBlendMode(I)V

    .line 402
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v1

    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindShaderForceFlush(Lmdesl/graphics/glutils/ShaderProgram;)V

    .line 403
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v1

    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v2

    invoke-virtual {v2}, Lmdesl/graphics/Texture;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v15, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 404
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v1

    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v2

    invoke-virtual {v2}, Lmdesl/graphics/Texture;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v14, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 405
    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v1

    invoke-virtual {v1}, Lmdesl/graphics/Texture;->bind()V

    .line 406
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFullQuad()Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    move-result-object v1

    iget-object v2, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v2

    invoke-virtual {v1, v2, v13}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->drawShader(Lmdesl/graphics/glutils/ShaderProgram;Ljava/lang/String;)V

    goto :goto_1

    .line 407
    :cond_3
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentUnder:Z

    if-eqz v1, :cond_4

    .line 411
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferFxLight()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v1

    new-array v2, v12, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 416
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-direct {v3, v9, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    aput-object v3, v2, v6

    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 418
    invoke-virtual {v3, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v3

    aput-object v3, v2, v16

    .line 421
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->getBlendModeContent()I

    move-result v4

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentUnderShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v3, v4, v2, v1, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 423
    invoke-virtual {v8, v7, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 444
    :cond_4
    :goto_1
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    move/from16 v17, v1

    :goto_2
    if-ltz v17, :cond_6

    .line 445
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v1, v1, v17

    .line 446
    iget v2, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    cmpl-float v2, v2, v10

    if-eqz v2, :cond_5

    iget v2, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpl-float v2, v2, v10

    if-eqz v2, :cond_5

    .line 447
    iget v2, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v3, 0x3f800000    # 1.0f

    div-float v2, v3, v2

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v2, v2, v4

    .line 448
    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v3, v1

    mul-float v3, v3, v4

    .line 449
    new-instance v5, Lcom/daaw/avee/Common/Vec2f;

    sub-float v1, v4, v2

    sub-float v7, v4, v3

    invoke-direct {v5, v1, v7}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 450
    new-instance v7, Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v2, v4

    add-float/2addr v3, v4

    invoke-direct {v7, v2, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 466
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferFxLight()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v21

    new-array v1, v12, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 471
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-direct {v2, v11, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    aput-object v2, v1, v6

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 473
    invoke-virtual {v2, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v2

    aput-object v2, v1, v16

    .line 475
    new-instance v24, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->getBlendMode()I

    move-result v19

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const/16 v23, 0x2

    move-object/from16 v18, v24

    move-object/from16 v20, v1

    move-object/from16 v22, v2

    invoke-direct/range {v18 .. v23}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object/from16 v1, p1

    const/4 v10, 0x0

    move-object v6, v7

    const/4 v12, -0x1

    move-object/from16 v7, v24

    .line 476
    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    goto :goto_3

    :cond_5
    const/4 v10, 0x0

    const/4 v12, -0x1

    :goto_3
    add-int/lit8 v17, v17, -0x1

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v10, 0x0

    const/4 v12, 0x2

    goto :goto_2

    :cond_6
    const/4 v10, 0x0

    const/4 v12, -0x1

    .line 509
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentFxaa:Z

    if-eqz v1, :cond_7

    .line 511
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->getBlendModeContent()I

    move-result v1

    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setBlendMode(I)V

    .line 512
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v1

    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindShaderForceFlush(Lmdesl/graphics/glutils/ShaderProgram;)V

    .line 513
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v1

    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v2

    invoke-virtual {v2}, Lmdesl/graphics/Texture;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v15, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 514
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v1

    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v2

    invoke-virtual {v2}, Lmdesl/graphics/Texture;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v14, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 515
    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v1

    invoke-virtual {v1}, Lmdesl/graphics/Texture;->bind()V

    .line 516
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFullQuad()Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    move-result-object v1

    iget-object v2, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v2

    invoke-virtual {v1, v2, v13}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->drawShader(Lmdesl/graphics/glutils/ShaderProgram;Ljava/lang/String;)V

    goto :goto_4

    .line 526
    :cond_7
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContent:Z

    if-eqz v1, :cond_8

    .line 528
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v2

    invoke-direct {v1, v2, v10}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->getBlendModeContent()I

    move-result v2

    invoke-virtual {v8, v12, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    :cond_8
    :goto_4
    return-void

    .line 351
    :cond_9
    :goto_5
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void
.end method

.method public onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 4

    .line 308
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    const/4 v0, 0x0

    .line 310
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurContentPreRendered:Lmdesl/graphics/Texture;

    .line 312
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->offscreenContentPreRender:Z

    if-eqz v0, :cond_2

    .line 313
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->referenceComposition:I

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getCompositionResult(I)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v0

    .line 314
    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v1, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setUseMipmaps(Z)V

    .line 315
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    if-eqz v0, :cond_2

    .line 316
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-nez v2, :cond_0

    goto :goto_1

    .line 325
    :cond_0
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->radius:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_1

    .line 328
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v0

    invoke-direct {p0, p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->horizontalBlurV2(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V

    .line 330
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetA:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->verticalBlurV2(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V

    .line 332
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurTargetB:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p1

    goto :goto_0

    .line 334
    :cond_1
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p1

    .line 337
    :goto_0
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurContentPreRendered:Lmdesl/graphics/Texture;

    nop

    :cond_2
    :goto_1
    return-void
.end method

.method public setBlendModeContent(I)V
    .locals 0

    .line 138
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blendModeContent:I

    return-void
.end method

.method public setBlurLayerScale(IFF)V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, p2, p3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v1, v0, p1

    return-void
.end method

.method public setBlurLayerScale(ILcom/daaw/avee/Common/Vec2f;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    aput-object p2, v0, p1

    return-void
.end method

.method public setBlurMultiplier(F)V
    .locals 1

    .line 98
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurMultiplier:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    .line 99
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->blurMultiplier:F

    .line 100
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setBlurRadius(F)V
    .locals 0

    .line 94
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->radius:F

    return-void
.end method

.method public setColor2(I)V
    .locals 0

    .line 104
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->color2:I

    return-void
.end method

.method public setMaskCustomImage(Ljava/lang/String;)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method

.method public setReferenceComposition(I)V
    .locals 0

    .line 80
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->referenceComposition:I

    return-void
.end method

.method public setRenderContentOnTop(Z)V
    .locals 0

    .line 116
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContent:Z

    return-void
.end method

.method public setRenderContentUnder(Z)V
    .locals 0

    .line 126
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->renderContentUnder:Z

    return-void
.end method

.method public setUseMipmaps(Z)V
    .locals 1

    .line 147
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->useMipmaps:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 148
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->useMipmaps:Z

    .line 149
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->markNeedReCreateGLResources()V

    return-void
.end method
