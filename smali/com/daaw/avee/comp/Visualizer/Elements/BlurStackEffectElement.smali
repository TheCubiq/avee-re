.class public Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "BlurStackEffectElement.java"


# static fields
.field public static final typeName:Ljava/lang/String; = "BlurEffect"


# instance fields
.field private blendModeContent:I

.field blurContentPreRendered:Lmdesl/graphics/Texture;

.field private blurLayerColors:[I

.field private blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

.field private blurMultiplier:F

.field private blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

.field private color2:I

.field currentVerticalBlurV2ResultHeight:I

.field currentVerticalBlurV2ResultWidth:I

.field maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field offscreenContentPreRender:Z

.field private radius:F

.field private referenceComposition:I

.field private renderBlurStackShaderOnBindAction:Lcom/daaw/avee/Common/Action3;
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

.field private renderBluredContentShaderOnBindAction:Lcom/daaw/avee/Common/Action3;
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

.field private renderContentOverShaderOnBindAction:Lcom/daaw/avee/Common/Action3;
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

.field private useMipmaps:Z

.field private final vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v0, 0x2

    const/high16 v1, 0x3f800000    # 1.0f

    .line 64
    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const/4 v2, 0x0

    .line 41
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->useMipmaps:Z

    .line 42
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->radius:F

    const v3, 0x40833333    # 4.1f

    .line 43
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurMultiplier:F

    new-array v3, v2, [Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    .line 44
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    const/high16 v3, -0x1000000

    .line 45
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->color2:I

    const/4 v3, 0x3

    new-array v4, v3, [Lcom/daaw/avee/Common/Vec2f;

    .line 46
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-array v3, v3, [I

    .line 47
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerColors:[I

    .line 48
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContent:Z

    .line 49
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContentUnder:Z

    .line 50
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blendModeContent:I

    const/4 v0, 0x1

    .line 51
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->referenceComposition:I

    .line 53
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    const/16 v3, 0x64

    .line 55
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->currentVerticalBlurV2ResultHeight:I

    .line 56
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->currentVerticalBlurV2ResultWidth:I

    .line 60
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->offscreenContentPreRender:Z

    .line 287
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$2;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContentUnderShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 314
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$3;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$3;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContentOverShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 343
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$4;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$4;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderBluredContentShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 591
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$5;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$5;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderBlurStackShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 65
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setScale(FF)V

    .line 67
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v4, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v4, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v4, v3, v2

    .line 68
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    array-length v3, v1

    if-ge v0, v3, :cond_0

    .line 69
    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 71
    :goto_1
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerColors:[I

    array-length v3, v1

    if-ge v0, v3, :cond_1

    const/4 v3, -0x1

    .line 72
    aput v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 74
    :cond_1
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)V

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 81
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setMaskCustomImage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)V
    .locals 0

    .line 37
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)I
    .locals 0

    .line 37
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->color2:I

    return p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)F
    .locals 0

    .line 37
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->radius:F

    return p0
.end method

.method private setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    const/16 v0, 0x2601

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 580
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 581
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    .line 583
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    return-void
.end method

.method private setupFrameBuffer0()V
    .locals 3

    const/16 v0, 0x2703

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 572
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 573
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const v0, 0x8370

    const/16 v2, 0x2802

    .line 575
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2803

    .line 576
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    return-void
.end method

.method private stackBlur(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V
    .locals 6

    .line 643
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 649
    iget-object p2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_blurStackShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v3

    .line 650
    new-instance p2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    const/4 v0, 0x0

    invoke-direct {v2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderBlurStackShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const/4 v1, 0x3

    const/4 v5, 0x2

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    .line 652
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object p3

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p1, v1, p3, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuadM1P1(ILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method


# virtual methods
.method protected getBlendModeContent()I
    .locals 1

    .line 148
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blendModeContent:I

    return v0
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "BlurEffect"

    return-object v0
.end method

.method public getRenderContent()Z
    .locals 1

    .line 127
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContent:Z

    return v0
.end method

.method public getRenderContentUnder()Z
    .locals 1

    .line 137
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContentUnder:Z

    return v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 216
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 217
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 7

    .line 160
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 161
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 163
    invoke-virtual {p0, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setScale(FF)V

    const-string v1, "blendModeContent"

    .line 165
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    .line 166
    invoke-static {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->create(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setBlendModeContent(I)V

    const-string v1, "color"

    const/high16 v3, -0x1000000

    .line 167
    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setColor2(I)V

    const/4 v1, 0x1

    const-string v3, "sourceCompositionIndex"

    .line 168
    invoke-virtual {p1, v3, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setReferenceComposition(I)V

    .line 169
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    sget-object v4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    const-string v6, "MaskImage"

    invoke-virtual {p1, v6, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    const-string v3, "blurRadius"

    const/high16 v4, 0x40000000    # 2.0f

    .line 171
    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setBlurRadius(F)V

    const-string v3, "blurMultiplier"

    const v4, 0x40833333    # 4.1f

    .line 172
    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setBlurMultiplier(F)V

    const-string v3, "showUnblurredContent"

    .line 173
    invoke-virtual {p1, v3, v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setRenderContentOnTop(Z)V

    const-string v3, "showUnblurredContentUnder"

    .line 174
    invoke-virtual {p1, v3, v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setRenderContentUnder(Z)V

    .line 176
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v4, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v4, v0, v0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v0, "1layerScale"

    invoke-virtual {p1, v0, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    aput-object v0, v3, v5

    .line 177
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v6, "2layerScale"

    invoke-virtual {p1, v6, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v3

    aput-object v3, v0, v1

    .line 178
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v3, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v4, "3layerScale"

    invoke-virtual {p1, v4, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v3

    aput-object v3, v0, v2

    .line 180
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerColors:[I

    const/4 v3, -0x1

    const-string v4, "1layerColor"

    invoke-virtual {p1, v4, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v4

    aput v4, v0, v5

    .line 181
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerColors:[I

    const-string v4, "2layerColor"

    invoke-virtual {p1, v4, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v4

    aput v4, v0, v1

    .line 182
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerColors:[I

    const-string v1, "3layerColor"

    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result p1

    aput p1, v0, v2

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 7

    .line 233
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->useMipmaps:Z

    .line 235
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 236
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    .line 238
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurMultiplier:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 241
    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getSafeRenderBufferSizeTextureDim()Lcom/daaw/avee/Common/Vec2i;

    move-result-object v1

    const/4 v3, 0x0

    .line 243
    :goto_0
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    array-length v4, v4

    if-ge v3, v4, :cond_1

    .line 244
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    aget-object v4, v4, v3

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 247
    :cond_1
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    array-length v3, v3

    if-eq v3, v0, :cond_2

    .line 248
    new-array v0, v0, [Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    .line 250
    :cond_2
    iget v0, v1, Lcom/daaw/avee/Common/Vec2i;->x:I

    .line 251
    iget v1, v1, Lcom/daaw/avee/Common/Vec2i;->y:I

    const/4 v3, 0x0

    .line 253
    :goto_1
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    array-length v4, v4

    if-ge v3, v4, :cond_4

    const/4 v4, 0x2

    .line 256
    div-int/2addr v0, v4

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 257
    div-int/2addr v1, v4

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 259
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    const/16 v5, 0x2601

    const/16 v6, 0x2901

    invoke-static {v0, v1, v5, v6, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->createSafe(IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v5

    aput-object v5, v4, v3

    .line 260
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    aget-object v4, v4, v3

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    aget-object v5, v5, v3

    invoke-virtual {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->checkIfValid()Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v5

    aput-object v5, v4, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 268
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 271
    :cond_4
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 276
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    .line 277
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 2

    .line 222
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 223
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    const/4 p1, 0x0

    .line 225
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    array-length v1, v0

    if-ge p1, v1, :cond_2

    .line 226
    aget-object v1, v0, p1

    if-eqz v1, :cond_1

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    .line 227
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 282
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 283
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->referenceComposition:I

    invoke-interface {p3, v0}, Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;->addDependencyCompositionIndex(I)V

    .line 284
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 9

    .line 187
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 188
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "Blur Effect"

    .line 190
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 192
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blendModeContent:I

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->getTypeName(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->useableModes:[Ljava/lang/String;

    const-string v6, "1_appearance"

    const-string v2, "blendModeContent"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 193
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->color2:I

    const-string v1, "color"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 195
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->referenceComposition:I

    const-string v1, "sourceCompositionIndex"

    const-string v3, "1_appearance"

    const/4 v4, 0x1

    const/4 v5, 0x5

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 196
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    const-string v2, "MaskImage"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 199
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->radius:F

    const-string v1, "blurRadius"

    const-string v3, "2_blur"

    const/4 v4, 0x0

    const/high16 v5, 0x40400000    # 3.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 200
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurMultiplier:F

    const-string v1, "blurMultiplier"

    const-string v3, "2_blur"

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x40c00000    # 6.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 201
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->getRenderContent()Z

    move-result v0

    const-string v1, "showUnblurredContent"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 202
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->getRenderContentUnder()Z

    move-result v0

    const-string v1, "showUnblurredContentUnder"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 204
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v6, 0x0

    aget-object v2, v0, v6

    const-string v1, "1layerScale"

    const-string v3, "2_blur"

    const/4 v4, 0x0

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 205
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v7, 0x1

    aget-object v2, v0, v7

    const-string v1, "2layerScale"

    const-string v3, "2_blur"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 206
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v8, 0x2

    aget-object v2, v0, v8

    const-string v1, "3layerScale"

    const-string v3, "2_blur"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 208
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerColors:[I

    aget v0, v0, v6

    const-string v1, "2_blur"

    const-string v2, "1layerColor"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 209
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerColors:[I

    aget v0, v0, v7

    const-string v2, "2layerColor"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 210
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerColors:[I

    aget v0, v0, v8

    const-string v2, "3layerColor"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v14, p1

    .line 409
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v7, p2

    invoke-virtual {v0, v14, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 411
    iget v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->referenceComposition:I

    invoke-virtual {v14, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getCompositionResult(I)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v15

    .line 412
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setUseMipmaps(Z)V

    .line 413
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    if-eqz v15, :cond_5

    .line 414
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurContentPreRendered:Lmdesl/graphics/Texture;

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 425
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v13

    .line 426
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v5

    .line 428
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V

    .line 437
    invoke-direct/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 440
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurContentPreRendered:Lmdesl/graphics/Texture;

    const/4 v1, 0x0

    .line 441
    iput-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurContentPreRendered:Lmdesl/graphics/Texture;

    .line 444
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 449
    iget-boolean v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContentUnder:Z

    const/4 v2, -0x1

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    .line 453
    iget-object v1, v14, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferFxLight()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v1

    new-array v7, v3, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 458
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-direct {v8, v15, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    aput-object v8, v7, v5

    iget-object v8, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 460
    invoke-virtual {v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v8

    aput-object v8, v7, v4

    .line 463
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->getBlendModeContent()I

    move-result v9

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContentUnderShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v8, v9, v7, v1, v10}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 465
    iget v1, v13, Landroid/graphics/RectF;->left:F

    iget v7, v13, Landroid/graphics/RectF;->top:F

    invoke-virtual {v14, v1, v7, v2, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 486
    :cond_1
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    array-length v1, v1

    sub-int/2addr v1, v4

    :goto_0
    if-ltz v1, :cond_3

    .line 487
    iget-object v7, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v7, v7, v1

    .line 488
    iget v8, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 v9, 0x0

    cmpl-float v8, v8, v9

    if-eqz v8, :cond_2

    iget v8, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpl-float v8, v8, v9

    if-eqz v8, :cond_2

    .line 489
    iget v8, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v9, 0x3f800000    # 1.0f

    div-float v8, v9, v8

    const/high16 v10, 0x3f000000    # 0.5f

    mul-float v8, v8, v10

    .line 490
    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v9, v7

    mul-float v9, v9, v10

    .line 491
    new-instance v11, Lcom/daaw/avee/Common/Vec2f;

    sub-float v7, v10, v8

    sub-float v12, v10, v9

    invoke-direct {v11, v7, v12}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 492
    new-instance v12, Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v8, v10

    add-float/2addr v9, v10

    invoke-direct {v12, v8, v9}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 508
    iget-object v7, v14, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferFxLight()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v7

    .line 513
    iget-object v8, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerColors:[I

    aget v10, v8, v1

    new-array v8, v3, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 515
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-direct {v9, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    aput-object v9, v8, v5

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 517
    invoke-virtual {v9, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v9

    aput-object v9, v8, v4

    .line 519
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->getBlendMode()I

    move-result v2

    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderBluredContentShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v9, v2, v8, v7, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 520
    iget v8, v13, Landroid/graphics/RectF;->left:F

    iget v2, v13, Landroid/graphics/RectF;->top:F

    move-object/from16 v7, p1

    move-object v4, v9

    move v9, v2

    move-object v2, v13

    move-object v13, v4

    invoke-virtual/range {v7 .. v13}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    goto :goto_1

    :cond_2
    move-object v2, v13

    :goto_1
    add-int/lit8 v1, v1, -0x1

    move-object v13, v2

    const/4 v2, -0x1

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    move-object v2, v13

    .line 553
    iget-boolean v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContent:Z

    if-eqz v0, :cond_4

    .line 555
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferFxLight()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    new-array v1, v3, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 556
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 557
    invoke-virtual {v15}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v4

    invoke-direct {v3, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    aput-object v3, v1, v5

    iget-object v3, v14, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    .line 558
    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    .line 560
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->getBlendModeContent()I

    move-result v4

    iget-object v5, v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContentOverShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v3, v4, v1, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 561
    iget v0, v2, Landroid/graphics/RectF;->left:F

    iget v1, v2, Landroid/graphics/RectF;->top:F

    const/4 v2, -0x1

    invoke-virtual {v14, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :cond_4
    return-void

    .line 416
    :cond_5
    :goto_2
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void
.end method

.method public onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 5

    .line 372
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    const/4 v0, 0x0

    .line 374
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurContentPreRendered:Lmdesl/graphics/Texture;

    .line 376
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->offscreenContentPreRender:Z

    if-eqz v0, :cond_3

    .line 377
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->referenceComposition:I

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getCompositionResult(I)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v0

    .line 378
    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v1, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->setUseMipmaps(Z)V

    .line 379
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    if-nez v0, :cond_0

    return-void

    .line 390
    :cond_0
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->radius:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    array-length v2, v1

    if-lez v2, :cond_2

    const/4 v2, 0x0

    .line 392
    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v0

    invoke-direct {p0, p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->stackBlur(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 393
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurTargets:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 394
    aget-object v3, v2, v1

    add-int/lit8 v4, v1, -0x1

    aget-object v2, v2, v4

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v2

    invoke-direct {p0, p1, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->stackBlur(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lmdesl/graphics/Texture;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 397
    :cond_1
    array-length p1, v2

    sub-int/2addr p1, v0

    aget-object p1, v2, p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p1

    goto :goto_1

    .line 399
    :cond_2
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p1

    .line 402
    :goto_1
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurContentPreRendered:Lmdesl/graphics/Texture;

    :cond_3
    return-void
.end method

.method public setBlendModeContent(I)V
    .locals 0

    .line 144
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blendModeContent:I

    return-void
.end method

.method public setBlurLayerScale(IFF)V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, p2, p3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v1, v0, p1

    return-void
.end method

.method public setBlurLayerScale(ILcom/daaw/avee/Common/Vec2f;)V
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    aput-object p2, v0, p1

    return-void
.end method

.method public setBlurMultiplier(F)V
    .locals 1

    .line 104
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurMultiplier:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    .line 105
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->blurMultiplier:F

    .line 106
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setBlurRadius(F)V
    .locals 0

    .line 100
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->radius:F

    return-void
.end method

.method public setColor2(I)V
    .locals 0

    .line 110
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->color2:I

    return-void
.end method

.method public setMaskCustomImage(Ljava/lang/String;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method

.method public setReferenceComposition(I)V
    .locals 0

    .line 86
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->referenceComposition:I

    return-void
.end method

.method public setRenderContentOnTop(Z)V
    .locals 0

    .line 122
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContent:Z

    return-void
.end method

.method public setRenderContentUnder(Z)V
    .locals 0

    .line 132
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->renderContentUnder:Z

    return-void
.end method

.method public setUseMipmaps(Z)V
    .locals 1

    .line 153
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->useMipmaps:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 154
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->useMipmaps:Z

    .line 155
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->markNeedReCreateGLResources()V

    return-void
.end method
