.class public Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "RgbSplitEffectElement.java"


# static fields
.field public static final internalImages:[Ljava/lang/String;

.field public static final typeName:Ljava/lang/String; = "RgbSplitEffect"


# instance fields
.field private blendModeContent:I

.field private blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

.field private color2:I

.field currentAlbumArtPath:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

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

.field offscreenContentPreRender:Z

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

.field private splitColor0:[F

.field private splitColor1:[F

.field private splitColor2:[F

.field private splitDirAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field private splitMultiplierVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field public final vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "composition:0"

    aput-object v2, v0, v1

    .line 53
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->internalImages:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x4

    const/high16 v1, 0x3f800000    # 1.0f

    .line 84
    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const/4 v2, -0x1

    .line 60
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->color2:I

    const/4 v2, 0x2

    .line 61
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blendModeContent:I

    const/4 v2, 0x0

    .line 64
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderContent:Z

    .line 65
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderContentUnder:Z

    const/high16 v3, 0x40c00000    # 6.0f

    .line 68
    invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitMultiplierVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    .line 69
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v5, 0x3f000000    # 0.5f

    const-string v6, "BeatRandomShake"

    invoke-direct {v4, v6, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-direct {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitDirAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    new-array v3, v0, [F

    .line 71
    fill-array-data v3, :array_0

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor0:[F

    new-array v3, v0, [F

    .line 72
    fill-array-data v3, :array_1

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor1:[F

    new-array v3, v0, [F

    .line 73
    fill-array-data v3, :array_2

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor2:[F

    const/4 v3, 0x3

    new-array v3, v3, [Lcom/daaw/avee/Common/Vec2f;

    .line 74
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    const/4 v3, 0x0

    .line 76
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->currentAlbumArtPath:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    const/4 v4, 0x1

    .line 78
    iput-boolean v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->offscreenContentPreRender:Z

    .line 81
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 344
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$3;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$3;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderContentUnderShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 353
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$4;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$4;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action2;

    .line 362
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$5;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$5;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 371
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->effectShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 85
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setScale(FF)V

    .line 86
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setBlendMode(I)V

    .line 88
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v5, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v5, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v5, v0, v2

    .line 89
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    array-length v1, v0

    if-ge v4, v1, :cond_0

    .line 90
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v1, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 92
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const-string v0, "composition:1"

    .line 108
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setTargetImage(Ljava/lang/String;)V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V
    .locals 0

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitMultiplierVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitDirAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor0:[F

    return-object p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor1:[F

    return-object p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor2:[F

    return-object p0
.end method

.method private horizontalBlur(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;FF)V
    .locals 3

    .line 509
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    const/4 p2, 0x0

    .line 510
    invoke-static {p2, p2, p2, p2}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 p2, 0x4000

    .line 511
    invoke-static {p2}, Landroid/opengl/GLES20;->glClear(I)V

    .line 513
    iget-object p2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_RgbSplitEffect()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object p2

    .line 517
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->effectShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const/4 v2, 0x4

    invoke-direct {v0, v2, p3, p2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    const/4 p2, -0x1

    .line 519
    invoke-virtual {p1, p4, p5, p2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method

.method private setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    const/16 v0, 0x2601

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 501
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 502
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    .line 504
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    return-void
.end method


# virtual methods
.method protected getBlendModeContent()I
    .locals 1

    .line 225
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blendModeContent:I

    return v0
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "RgbSplitEffect"

    return-object v0
.end method

.method public getRenderContent()Z
    .locals 1

    .line 204
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderContent:Z

    return v0
.end method

.method public getRenderContentUnder()Z
    .locals 1

    .line 214
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderContentUnder:Z

    return v0
.end method

.method public getSplitColor0()I
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor0:[F

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColor([F)I

    move-result v0

    return v0
.end method

.method public getSplitColor1()I
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor1:[F

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColor([F)I

    move-result v0

    return v0
.end method

.method public getSplitColor2()I
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor2:[F

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColor([F)I

    move-result v0

    return v0
.end method

.method public getTargetImage()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 293
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 294
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 5

    .line 231
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 232
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "blendModeContent"

    .line 234
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    const-string v1, "Add"

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 235
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blendModeContent:I

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->create(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setBlendModeContent(I)V

    const-string v0, "color"

    const/4 v1, -0x1

    .line 236
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setColor2(I)V

    const-string v0, "targetImage"

    const-string v1, "composition:1"

    .line 238
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setTargetImage(Ljava/lang/String;)V

    const/4 v0, 0x0

    const-string v1, "showUnblurredContent"

    .line 240
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setRenderContentOnTop(Z)V

    const-string v1, "showUnblurredContentUnder"

    .line 241
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setRenderContentUnder(Z)V

    const/high16 v1, 0x40c00000    # 6.0f

    .line 243
    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    const-string v2, "splitMultiplier"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setSplitMultiplier(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    .line 245
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v3, 0x3f000000    # 0.5f

    const-string v4, "BeatRandomShake"

    invoke-direct {v2, v4, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-direct {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const-string v2, "splitAmount"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setSplitAmount(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    const-string v1, "splitColor0"

    const/high16 v2, -0x10000

    .line 247
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setSplitColor0(I)V

    const-string v1, "splitColor1"

    const v2, -0xff0100

    .line 248
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setSplitColor1(I)V

    const-string v1, "splitColor2"

    const v2, -0xffff01

    .line 249
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setSplitColor2(I)V

    .line 251
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v1, p1, v0

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 310
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 311
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    .line 327
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    .line 333
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 299
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 301
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 339
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 341
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 6

    .line 259
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 260
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "Rgb Split"

    .line 262
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 264
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blendModeContent:I

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->getTypeName(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->useableModes:[Ljava/lang/String;

    const-string v2, "1_appearance"

    const-string v3, "blendModeContent"

    invoke-virtual {p1, v3, v0, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 265
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->color2:I

    const-string v1, "color"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGB(Ljava/lang/String;ILjava/lang/String;)V

    .line 268
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getTargetImage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 269
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getTargetImage()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->internalImages:[Ljava/lang/String;

    const-string v3, "targetImage"

    invoke-virtual {p1, v3, v0, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 272
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getRenderContent()Z

    move-result v0

    const-string v1, "showUnblurredContent"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 273
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getRenderContentUnder()Z

    move-result v0

    const-string v1, "showUnblurredContentUnder"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 275
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitMultiplierVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const-string v1, "splitMultiplier"

    const-string v3, "2_splitEffect"

    const/4 v4, 0x0

    const/high16 v5, 0x40c00000    # 6.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    .line 276
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitDirAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const-string v1, "splitAmount"

    const-string v3, "2_splitEffect"

    const/high16 v4, -0x41000000    # -0.5f

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableVec2f(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    .line 282
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getSplitColor0()I

    move-result v0

    const-string v1, "2_splitEffect"

    const-string v2, "splitColor0"

    # invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGB(Ljava/lang/String;ILjava/lang/String;)V

    const-string v3, ""
    invoke-virtual {p1, v2, v0, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 283
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getSplitColor1()I

    move-result v0

    const-string v2, "splitColor1"

    # invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGB(Ljava/lang/String;ILjava/lang/String;)V
    invoke-virtual {p1, v2, v0, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V


    .line 284
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getSplitColor2()I

    move-result v0

    const-string v2, "splitColor2"

    # invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGB(Ljava/lang/String;ILjava/lang/String;)V
    invoke-virtual {p1, v2, v0, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V


    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v14, p1

    .line 422
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v7, p2

    invoke-virtual {v0, v14, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 424
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v15

    if-nez v15, :cond_0

    .line 428
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void

    .line 433
    :cond_0
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 435
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v13

    .line 436
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v5

    .line 437
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V

    .line 441
    invoke-direct/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 455
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 458
    iget-boolean v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderContentUnder:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    .line 460
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferVPMat()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    .line 464
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getBlendModeContent()I

    move-result v3

    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v2, v3, v15, v0, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 466
    iget v0, v13, Landroid/graphics/RectF;->left:F

    iget v3, v13, Landroid/graphics/RectF;->top:F

    invoke-virtual {v14, v0, v3, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 471
    :cond_1
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    .line 472
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v2, v2, v0

    .line 473
    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_2

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_2

    .line 474
    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v4, 0x3f800000    # 1.0f

    div-float v3, v4, v3

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float v3, v3, v5

    .line 475
    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v4, v2

    mul-float v4, v4, v5

    .line 476
    new-instance v11, Lcom/daaw/avee/Common/Vec2f;

    sub-float v2, v5, v3

    sub-float v7, v5, v4

    invoke-direct {v11, v2, v7}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 477
    new-instance v12, Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v3, v5

    add-float/2addr v4, v5

    invoke-direct {v12, v3, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 485
    iget-object v2, v14, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_RgbSplitEffect()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v2

    .line 486
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getBlendMode()I

    move-result v4

    iget-object v5, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->effectShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v3, v4, v15, v2, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 487
    iget v8, v13, Landroid/graphics/RectF;->left:F

    iget v9, v13, Landroid/graphics/RectF;->top:F

    iget v10, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->color2:I

    move-object/from16 v7, p1

    move-object v2, v13

    move-object v13, v3

    invoke-virtual/range {v7 .. v13}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    goto :goto_1

    :cond_2
    move-object v2, v13

    :goto_1
    add-int/lit8 v0, v0, -0x1

    move-object v13, v2

    goto :goto_0

    :cond_3
    move-object v2, v13

    .line 493
    iget-boolean v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderContent:Z

    if-eqz v0, :cond_4

    .line 495
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->getBlendModeContent()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v0, v3, v15, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 496
    iget v3, v2, Landroid/graphics/RectF;->left:F

    iget v2, v2, Landroid/graphics/RectF;->top:F

    invoke-virtual {v14, v3, v2, v1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :cond_4
    return-void
.end method

.method public onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 396
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public setBlendModeContent(I)V
    .locals 0

    .line 221
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blendModeContent:I

    return-void
.end method

.method public setBlurLayerScale(IFF)V
    .locals 2

    .line 191
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, p2, p3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v1, v0, p1

    return-void
.end method

.method public setBlurLayerScale(ILcom/daaw/avee/Common/Vec2f;)V
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->blurLayerScales:[Lcom/daaw/avee/Common/Vec2f;

    aput-object p2, v0, p1

    return-void
.end method

.method public setColor2(I)V
    .locals 0

    .line 133
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->color2:I

    return-void
.end method

.method public setRenderContentOnTop(Z)V
    .locals 0

    .line 199
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderContent:Z

    return-void
.end method

.method public setRenderContentUnder(Z)V
    .locals 0

    .line 209
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->renderContentUnder:Z

    return-void
.end method

.method public setSplitAmount(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitDirAmount:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-void
.end method

.method public setSplitColor0(I)V
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor0:[F

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    return-void
.end method

.method public setSplitColor0([F)V
    .locals 3

    .line 170
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor0:[F

    const/4 v1, 0x0

    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x1

    .line 171
    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x2

    .line 172
    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x3

    .line 173
    aget p1, p1, v1

    aput p1, v0, v1

    return-void
.end method

.method public setSplitColor1(I)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor1:[F

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    return-void
.end method

.method public setSplitColor1([F)V
    .locals 3

    .line 177
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor1:[F

    const/4 v1, 0x0

    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x1

    .line 178
    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x2

    .line 179
    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x3

    .line 180
    aget p1, p1, v1

    aput p1, v0, v1

    return-void
.end method

.method public setSplitColor2(I)V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor2:[F

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    return-void
.end method

.method public setSplitColor2([F)V
    .locals 3

    .line 184
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitColor2:[F

    const/4 v1, 0x0

    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x1

    .line 185
    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x2

    .line 186
    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x3

    .line 187
    aget p1, p1, v1

    aput p1, v0, v1

    return-void
.end method

.method public setSplitMultiplier(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->splitMultiplierVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-void
.end method

.method public setTargetImage(Ljava/lang/String;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method
