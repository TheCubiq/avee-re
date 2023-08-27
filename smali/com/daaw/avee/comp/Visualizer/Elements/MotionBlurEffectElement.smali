.class public Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "MotionBlurEffectElement.java"


# static fields
.field public static final internalImages:[Ljava/lang/String;

.field public static final motionSources:[Ljava/lang/String;

.field public static final typeName:Ljava/lang/String; = "MotionBlurEffect"


# instance fields
.field private blendModeContent:I

.field private blurAmountMultiplier:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field private color2:I

.field private deltaDrawCenterX:F

.field private deltaDrawCenterY:F

.field private deltaDrawHeight:F

.field private deltaDrawWidth:F

.field private effectShaderOnBindAction:Lcom/daaw/avee/Common/Action3;
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

.field private lastDrawCenterX:F

.field private lastDrawCenterY:F

.field private lastDrawHeight:F

.field private lastDrawWidth:F

.field private motionSourceId:Ljava/lang/String;

.field private posBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field private relativeMotionMode:Z

.field private renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
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

.field private scaleBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field private shaderOnBindAction:Lcom/daaw/avee/Common/Action3;
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

.field targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field public final vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "composition:0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 43
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->internalImages:[Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "EffectTransform"

    aput-object v2, v1, v3

    const-string v2, "Manual"

    aput-object v2, v1, v0

    .line 47
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSources:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x4

    const/high16 v1, 0x3f800000    # 1.0f

    .line 94
    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const-string v2, ""

    .line 53
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSourceId:Ljava/lang/String;

    const/4 v2, -0x1

    .line 57
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->color2:I

    const/4 v2, 0x2

    .line 58
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->blendModeContent:I

    const/4 v2, 0x0

    .line 62
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderContent:Z

    .line 63
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderContentUnder:Z

    const/4 v2, 0x1

    .line 65
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->relativeMotionMode:Z

    .line 67
    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->blurAmountMultiplier:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const/high16 v2, 0x3f000000    # 0.5f

    .line 68
    invoke-static {v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantVec2f(FF)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->posBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const/4 v2, 0x0

    .line 69
    invoke-static {v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantVec2f(FF)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->scaleBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    .line 78
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawCenterX:F

    .line 79
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawCenterY:F

    .line 80
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawCenterX:F

    .line 81
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawCenterY:F

    .line 83
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawWidth:F

    .line 84
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawHeight:F

    .line 85
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawWidth:F

    .line 86
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawHeight:F

    .line 91
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 370
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderContentUnderShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 379
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$3;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$3;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action2;

    .line 388
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$4;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$4;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 396
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->effectShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const-string v2, "BeatCamShakeMore"

    .line 99
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->defaultMeasurePosMeasure:Ljava/lang/String;

    .line 101
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setBlendMode(I)V

    .line 102
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setScale(FF)V

    .line 104
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const-string v0, "composition:1"

    .line 111
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setTargetImage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)V
    .locals 0

    .line 39
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->blurAmountMultiplier:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)F
    .locals 0

    .line 39
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawCenterX:F

    return p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)F
    .locals 0

    .line 39
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawCenterY:F

    return p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)F
    .locals 0

    .line 39
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawWidth:F

    return p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)F
    .locals 0

    .line 39
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawHeight:F

    return p0
.end method

.method private horizontalBlur(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;)V
    .locals 3

    .line 637
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    const/4 p2, 0x0

    .line 638
    invoke-static {p2, p2, p2, p2}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 p2, 0x4000

    .line 639
    invoke-static {p2}, Landroid/opengl/GLES20;->glClear(I)V

    .line 641
    iget-object p2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_MotionBlurEffect()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object p2

    .line 645
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->effectShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const/4 v2, 0x4

    invoke-direct {v0, v2, p3, p2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    const/4 p2, -0x1

    .line 647
    invoke-virtual {p1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method

.method private setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    const/16 v0, 0x2601

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 630
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 631
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    .line 633
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    return-void
.end method


# virtual methods
.method protected getBlendModeContent()I
    .locals 1

    .line 234
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->blendModeContent:I

    return v0
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "MotionBlurEffect"

    return-object v0
.end method

.method public getRelativeMotionMode()Z
    .locals 1

    .line 146
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->relativeMotionMode:Z

    return v0
.end method

.method public getRenderContent()Z
    .locals 1

    .line 217
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderContent:Z

    return v0
.end method

.method public getRenderContentUnder()Z
    .locals 1

    .line 225
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderContentUnder:Z

    return v0
.end method

.method public getTargetImage()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 318
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 319
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    .line 320
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 3

    .line 240
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 241
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "blendModeContent"

    .line 243
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    .line 244
    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->create(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setBlendModeContent(I)V

    const-string v0, "color"

    const/4 v1, -0x1

    .line 245
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setColor2(I)V

    const-string v0, "TargetImage"

    const-string v1, "composition:1"

    .line 247
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setTargetImage(Ljava/lang/String;)V

    const/4 v0, 0x0

    const-string v1, "showUnblurredContent"

    .line 249
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setRenderContentOnTop(Z)V

    const-string v1, "showUnblurredContentUnder"

    .line 250
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setRenderContentUnder(Z)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 252
    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    const-string v2, "blurAmountMultiplier"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setSplitMultiplier(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    const-string v1, "motionSource"

    .line 257
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v1

    .line 258
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSources:[Ljava/lang/String;

    aget-object v0, v2, v0

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSourceId:Ljava/lang/String;

    const/high16 v0, 0x3f000000    # 0.5f

    .line 262
    invoke-static {v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantVec2f(FF)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0

    const-string v2, "posBlurAmount"

    invoke-virtual {v1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setSplitAmount(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    const/4 v0, 0x0

    .line 263
    invoke-static {v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantVec2f(FF)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0

    const-string v2, "scaleBlurAmount"

    invoke-virtual {v1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setScaleAmount(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    const-string v0, "relativeMotionMode"

    const/4 v1, 0x1

    .line 269
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setRelativeMotionMode(Z)V

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 337
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 338
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    .line 354
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    .line 360
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 326
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 328
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 365
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 367
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 9

    .line 275
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 276
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "Motion Blur Effect"

    .line 278
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 280
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->blendModeContent:I

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->getTypeName(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->useableModes:[Ljava/lang/String;

    const-string v2, "1_appearance"

    const-string v3, "blendModeContent"

    invoke-virtual {p1, v3, v0, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 281
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->color2:I

    const-string v1, "color"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGB(Ljava/lang/String;ILjava/lang/String;)V

    .line 284
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->getTargetImage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 285
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->getTargetImage()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->internalImages:[Ljava/lang/String;

    const-string v1, "TargetImage"

    invoke-virtual {p1, v1, p2, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 287
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->getRenderContent()Z

    move-result p2

    const-string v0, "showUnblurredContent"

    invoke-virtual {p1, v0, p2, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 288
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->getRenderContentUnder()Z

    move-result p2

    const-string v0, "showUnblurredContentUnder"

    invoke-virtual {p1, v0, p2, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 291
    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->blurAmountMultiplier:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const-string v4, "blurAmountMultiplier"

    const-string v6, "2_motionBlur"

    const/4 v7, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    .line 293
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSourceId:Ljava/lang/String;

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSources:[Ljava/lang/String;

    const-string v1, "2_motionBlur"

    const-string v2, "motionSource"

    invoke-virtual {p1, v2, p2, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p2

    .line 295
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSources:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSourceId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->posBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const/4 v7, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    const-string v4, "posBlurAmount"

    const-string v6, "2_motionBlur"

    move-object v3, p2

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableVec2f(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    .line 298
    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->scaleBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const/high16 v7, -0x40800000    # -1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const-string v4, "scaleBlurAmount"

    const-string v6, "2_motionBlur"

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableVec2f(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    .line 301
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->getRelativeMotionMode()Z

    move-result p2

    const-string v0, "relativeMotionMode"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 19

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    .line 481
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v7, p2

    invoke-virtual {v0, v15, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 483
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v14

    .line 485
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    if-nez v14, :cond_0

    .line 489
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void

    .line 493
    :cond_0
    iget-boolean v8, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->relativeMotionMode:Z

    .line 495
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v13

    .line 496
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v5

    .line 497
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V

    .line 501
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSources:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->motionSourceId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 502
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->posBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->scaleBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->measureDrawRectVar(Lcom/daaw/avee/comp/Visualizer/Meter;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Landroid/graphics/RectF;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v13

    const/4 v8, 0x1

    :goto_0
    if-eqz v8, :cond_2

    .line 509
    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawCenterX:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawCenterX:F

    .line 510
    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawCenterY:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawCenterY:F

    .line 511
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawCenterX:F

    .line 512
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawCenterY:F

    .line 514
    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawWidth:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawWidth:F

    .line 515
    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawHeight:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawHeight:F

    .line 516
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawWidth:F

    .line 517
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iput v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawHeight:F

    goto :goto_1

    .line 519
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawCenterX:F

    .line 520
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawCenterY:F

    .line 521
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawCenterX:F

    .line 522
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawCenterY:F

    .line 524
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawWidth:F

    .line 525
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->deltaDrawHeight:F

    .line 526
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    iput v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawWidth:F

    .line 527
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iput v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->lastDrawHeight:F

    .line 533
    :goto_1
    invoke-direct/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 548
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 552
    iget-boolean v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderContentUnder:Z

    if-eqz v0, :cond_3

    .line 554
    iget-object v0, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferVPMat()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    .line 557
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v1, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v1

    .line 559
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->getBlendModeContent()I

    move-result v3

    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v2, v3, v1, v0, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 563
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    iget v9, v13, Landroid/graphics/RectF;->left:F

    iget v10, v13, Landroid/graphics/RectF;->top:F

    const/4 v11, 0x0

    .line 566
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    move-result v12

    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/4 v1, -0x1

    .line 568
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v3

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v16

    const/16 v18, 0x1

    move-object/from16 v8, p1

    move-object v4, v13

    move v13, v0

    move-object v0, v14

    move v14, v1

    move-object v1, v15

    move-object v15, v3

    move-object/from16 v17, v2

    .line 563
    invoke-virtual/range {v7 .. v18}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    goto :goto_2

    :cond_3
    move-object v4, v13

    move-object v0, v14

    move-object v1, v15

    :goto_2
    const/4 v2, 0x4

    new-array v2, v2, [F

    .line 576
    iget v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->color2:I

    invoke-static {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    .line 596
    iget-object v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_MotionBlurEffect()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v2

    .line 597
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->getBlendMode()I

    move-result v5

    iget-object v7, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->effectShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v3, v5, v0, v2, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 600
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    iget v9, v4, Landroid/graphics/RectF;->left:F

    iget v10, v4, Landroid/graphics/RectF;->top:F

    const/4 v11, 0x0

    .line 603
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v12

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v13

    const/4 v14, -0x1

    .line 605
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v15

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v16

    const/16 v18, 0x1

    move-object/from16 v8, p1

    move-object/from16 v17, v3

    .line 600
    invoke-virtual/range {v7 .. v18}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    .line 613
    iget-boolean v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderContent:Z

    if-eqz v2, :cond_4

    .line 617
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->getBlendModeContent()I

    move-result v3

    const/4 v5, 0x0

    invoke-direct {v2, v3, v0, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 618
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    iget v9, v4, Landroid/graphics/RectF;->left:F

    iget v10, v4, Landroid/graphics/RectF;->top:F

    const/4 v11, 0x0

    .line 621
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v12

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v13

    const/4 v14, -0x1

    .line 623
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v15

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v16

    const/16 v18, 0x1

    move-object/from16 v8, p1

    move-object/from16 v17, v2

    .line 618
    invoke-virtual/range {v7 .. v18}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    :cond_4
    return-void
.end method

.method public onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 453
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public setBlendModeContent(I)V
    .locals 0

    .line 230
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->blendModeContent:I

    return-void
.end method

.method public setColor2(I)V
    .locals 0

    .line 134
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->color2:I

    return-void
.end method

.method public setRelativeMotionMode(Z)V
    .locals 0

    .line 142
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->relativeMotionMode:Z

    return-void
.end method

.method public setRenderContentOnTop(Z)V
    .locals 0

    .line 213
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderContent:Z

    return-void
.end method

.method public setRenderContentUnder(Z)V
    .locals 0

    .line 221
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->renderContentUnder:Z

    return-void
.end method

.method public setScaleAmount(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->scaleBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-void
.end method

.method public setSplitAmount(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->posBlurAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-void
.end method

.method public setSplitMultiplier(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->blurAmountMultiplier:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-void
.end method

.method public setTargetImage(Ljava/lang/String;)V
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method
