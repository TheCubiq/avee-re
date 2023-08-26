.class public Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "BlurKernelEffectElement.java"


# static fields
.field public static final typeName:Ljava/lang/String; = "BlurEffect"


# instance fields
.field private blendModeContent:I

.field private blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

.field private blurMultiplier:F

.field private color2:I

.field currentVerticalBlurV2ResultHeight:I

.field maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

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

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 58
    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    .line 39
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->useMipmaps:Z

    .line 40
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->radius:F

    const v2, 0x40833333    # 4.1f

    .line 41
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurMultiplier:F

    const/high16 v2, -0x1000000

    .line 43
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->color2:I

    const/4 v2, 0x3

    new-array v2, v2, [Lcom/daaw/avee/Common/Vec2f;

    .line 44
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    .line 45
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContent:Z

    .line 46
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContentUnder:Z

    const/4 v2, 0x2

    .line 47
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blendModeContent:I

    const/4 v2, 0x1

    .line 48
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->referenceComposition:I

    const/16 v3, 0x64

    .line 50
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->currentVerticalBlurV2ResultHeight:I

    .line 252
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$2;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContentUnderShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 278
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$3;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$3;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 303
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$4;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$4;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderVerticalBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 501
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$5;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$5;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderHorizanlBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 59
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setScale(FF)V

    .line 61
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v4, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v4, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v4, v3, v0

    .line 62
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    array-length v3, v1

    if-ge v2, v3, :cond_0

    .line 63
    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 65
    :cond_0
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$1;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)V

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 72
    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    aget-object v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setMaskCustomImage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)V
    .locals 0

    .line 35
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)F
    .locals 0

    .line 35
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->radius:F

    return p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)I
    .locals 0

    .line 35
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->color2:I

    return p0
.end method

.method private setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    const/16 v0, 0x2601

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 491
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 492
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    .line 494
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    return-void
.end method

.method private setupFrameBuffer0()V
    .locals 3

    const/16 v0, 0x2703

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 483
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 484
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const v0, 0x8370

    const/16 v2, 0x2802

    .line 486
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2803

    .line 487
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    return-void
.end method


# virtual methods
.method protected getBlendModeContent()I
    .locals 1

    .line 139
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blendModeContent:I

    return v0
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "BlurEffect"

    return-object v0
.end method

.method public getRenderContent()Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContent:Z

    return v0
.end method

.method public getRenderContentUnder()Z
    .locals 1

    .line 128
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContentUnder:Z

    return v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 193
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 194
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 151
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "blendModeContent"

    .line 153
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    .line 154
    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->create(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setBlendModeContent(I)V

    const-string v0, "color"

    const/high16 v2, -0x1000000

    .line 155
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setColor2(I)V

    const/4 v0, 0x1

    const-string v2, "sourceCompositionIndex"

    .line 156
    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setReferenceComposition(I)V

    .line 157
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    sget-object v3, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    const-string v5, "MaskImage"

    invoke-virtual {p1, v5, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    const/high16 v2, 0x3f800000    # 1.0f

    const-string v3, "blurRadius"

    .line 159
    invoke-virtual {p1, v3, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setBlurRadius(F)V

    const-string v3, "blurMultiplier"

    const v5, 0x40833333    # 4.1f

    .line 160
    invoke-virtual {p1, v3, v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setBlurMultiplier(F)V

    const-string v3, "showUnblurredContent"

    .line 161
    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setRenderContentOnTop(Z)V

    const-string v3, "showUnblurredContentUnder"

    .line 162
    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setRenderContentUnder(Z)V

    .line 164
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v5, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v5, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v2, "1layerScale"

    invoke-virtual {p1, v2, v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v2

    aput-object v2, v3, v4

    .line 165
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v5, "2layerScale"

    invoke-virtual {p1, v5, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v3

    aput-object v3, v2, v0

    .line 166
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v2, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v3, "3layerScale"

    invoke-virtual {p1, v3, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    aput-object p1, v0, v1

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 210
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->useMipmaps:Z

    .line 212
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 213
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    .line 236
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 241
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    .line 242
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 199
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 247
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 248
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->referenceComposition:I

    invoke-interface {p3, v0}, Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;->addDependencyCompositionIndex(I)V

    .line 249
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 7

    .line 171
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    const-string v0, "Blur Effect"

    .line 173
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 175
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blendModeContent:I

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->getTypeName(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->useableModes:[Ljava/lang/String;

    const-string v6, "1_appearance"

    const-string v2, "blendModeContent"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 176
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->color2:I

    const-string v1, "color"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 178
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->referenceComposition:I

    const-string v1, "sourceCompositionIndex"

    const-string v3, "1_appearance"

    const/4 v4, 0x1

    const/4 v5, 0x5

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 179
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    const-string v2, "MaskImage"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 182
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->radius:F

    const-string v1, "blurRadius"

    const-string v3, "2_blur"

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 183
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurMultiplier:F

    const-string v1, "blurMultiplier"

    const-string v3, "2_blur"

    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v5, 0x40c00000    # 6.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 184
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->getRenderContent()Z

    move-result v0

    const-string v1, "showUnblurredContent"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 185
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->getRenderContentUnder()Z

    move-result v0

    const-string v1, "showUnblurredContentUnder"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const-string v1, "1layerScale"

    const-string v3, "2_blur"

    const/4 v4, 0x0

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 187
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x1

    aget-object v2, v0, v1

    const-string v1, "2layerScale"

    const-string v3, "2_blur"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 188
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x2

    aget-object v2, v0, v1

    const-string v1, "3layerScale"

    const-string v3, "2_blur"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    .line 359
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v2, p2

    invoke-virtual {v1, v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 361
    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->referenceComposition:I

    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getCompositionResult(I)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v9

    .line 362
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v1, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setUseMipmaps(Z)V

    .line 363
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    if-nez v9, :cond_0

    .line 366
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void

    .line 375
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    .line 376
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    .line 385
    invoke-direct/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 401
    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v10

    .line 409
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 414
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContentUnder:Z

    const/4 v11, -0x1

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eqz v1, :cond_1

    .line 418
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferFxLight()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v1

    new-array v2, v12, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 423
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-direct {v3, v9, v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    aput-object v3, v2, v14

    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 425
    invoke-virtual {v3, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v3

    aput-object v3, v2, v13

    .line 428
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->getBlendModeContent()I

    move-result v4

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContentUnderShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v3, v4, v2, v1, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 430
    invoke-virtual {v8, v11, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 435
    :cond_1
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    array-length v1, v1

    sub-int/2addr v1, v13

    move v15, v1

    :goto_0
    if-ltz v15, :cond_4

    .line 436
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v1, v1, v15

    .line 437
    iget v2, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_3

    iget v2, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_3

    .line 438
    iget v2, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v4, 0x3f800000    # 1.0f

    div-float v2, v4, v2

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float v2, v2, v5

    .line 439
    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v4, v1

    mul-float v4, v4, v5

    .line 440
    new-instance v6, Lcom/daaw/avee/Common/Vec2f;

    sub-float v1, v5, v2

    sub-float v7, v5, v4

    invoke-direct {v6, v1, v7}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 441
    new-instance v7, Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v2, v5

    add-float/2addr v4, v5

    invoke-direct {v7, v2, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 444
    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->radius:F

    cmpl-float v1, v1, v3

    if-lez v1, :cond_2

    new-array v1, v12, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 446
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-direct {v2, v10, v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    aput-object v2, v1, v14

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 448
    invoke-virtual {v2, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v2

    aput-object v2, v1, v13

    .line 451
    iget-object v2, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_blurShaderKernel()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v19

    .line 452
    new-instance v22, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->getBlendMode()I

    move-result v17

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderVerticalBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const/16 v21, 0x2

    move-object/from16 v16, v22

    move-object/from16 v18, v1

    move-object/from16 v20, v2

    invoke-direct/range {v16 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object/from16 v1, p1

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v7, v22

    .line 453
    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    goto :goto_1

    .line 457
    :cond_2
    iget-object v1, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferFxLight()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v19

    new-array v1, v12, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 458
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-direct {v2, v10, v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    aput-object v2, v1, v14

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 460
    invoke-virtual {v2, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v2

    aput-object v2, v1, v13

    .line 462
    new-instance v22, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->getBlendMode()I

    move-result v17

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const/16 v21, 0x2

    move-object/from16 v16, v22

    move-object/from16 v18, v1

    move-object/from16 v20, v2

    invoke-direct/range {v16 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object/from16 v1, p1

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v7, v22

    .line 463
    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :cond_3
    :goto_1
    add-int/lit8 v15, v15, -0x1

    goto/16 :goto_0

    .line 473
    :cond_4
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContent:Z

    if-eqz v1, :cond_5

    .line 475
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v2

    invoke-direct {v1, v2, v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->getBlendModeContent()I

    move-result v2

    invoke-virtual {v8, v11, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    :cond_5
    return-void
.end method

.method public onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 323
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public setBlendModeContent(I)V
    .locals 0

    .line 135
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blendModeContent:I

    return-void
.end method

.method public setBlurLayerScale(IFF)V
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, p2, p3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v1, v0, p1

    return-void
.end method

.method public setBlurLayerScale(ILcom/daaw/avee/Common/Vec2f;)V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    aput-object p2, v0, p1

    return-void
.end method

.method public setBlurMultiplier(F)V
    .locals 1

    .line 95
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurMultiplier:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    .line 96
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->blurMultiplier:F

    .line 97
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setBlurRadius(F)V
    .locals 0

    .line 91
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->radius:F

    return-void
.end method

.method public setColor2(I)V
    .locals 0

    .line 101
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->color2:I

    return-void
.end method

.method public setMaskCustomImage(Ljava/lang/String;)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method

.method public setReferenceComposition(I)V
    .locals 0

    .line 77
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->referenceComposition:I

    return-void
.end method

.method public setRenderContentOnTop(Z)V
    .locals 0

    .line 113
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContent:Z

    return-void
.end method

.method public setRenderContentUnder(Z)V
    .locals 0

    .line 123
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->renderContentUnder:Z

    return-void
.end method

.method public setUseMipmaps(Z)V
    .locals 1

    .line 144
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->useMipmaps:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 145
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->useMipmaps:Z

    .line 146
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->markNeedReCreateGLResources()V

    return-void
.end method
