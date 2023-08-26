.class public Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;
.source "ImageElement.java"


# static fields
.field public static final typeName:Ljava/lang/String; = "Image"


# instance fields
.field private blurDivider:I

.field private blurEnabled:Z

.field private blurredBorder:Z

.field colorF4Tmp:[F

.field colorHslaTmp:[F

.field private hslaColorFrom:[F

.field private hslaColorTo:[F

.field private keepAspectRatio:Z

.field private maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field private maskMode:I

.field private measureColor:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

.field private pixelRadius:I

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

.field private saturationVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field private segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

.field shaderOnBindAction:Lcom/daaw/avee/Common/Action3;
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

.field private final vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 75
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [F

    .line 50
    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorFrom:[F

    new-array v1, v0, [F

    .line 51
    fill-array-data v1, :array_1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorTo:[F

    .line 53
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->AsNothing()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureColor:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 54
    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->saturationVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const/4 v1, 0x0

    .line 56
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurEnabled:Z

    const/4 v2, 0x5

    .line 58
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurDivider:I

    const/4 v2, 0x7

    .line 59
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->pixelRadius:I

    .line 60
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurredBorder:Z

    const/4 v2, 0x1

    .line 62
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->keepAspectRatio:Z

    const/4 v2, 0x0

    .line 63
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    new-array v3, v0, [F

    .line 66
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->colorHslaTmp:[F

    new-array v0, v0, [F

    .line 67
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->colorF4Tmp:[F

    .line 69
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 73
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskMode:I

    .line 456
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$4;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$4;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 463
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 76
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->initialize(Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    .line 152
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$3;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)Z
    .locals 0

    .line 46
    iget-boolean p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurEnabled:Z

    return p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)I
    .locals 0

    .line 46
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurDivider:I

    return p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)I
    .locals 0

    .line 46
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->pixelRadius:I

    return p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)Z
    .locals 0

    .line 46
    iget-boolean p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurredBorder:Z

    return p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)Z
    .locals 0

    .line 46
    iget-boolean p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->keepAspectRatio:Z

    return p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V
    .locals 0

    .line 46
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    return-object p0
.end method

.method static synthetic access$700(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->saturationVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-object p0
.end method

.method static synthetic access$800(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)I
    .locals 0

    .line 46
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskMode:I

    return p0
.end method

.method private getCurrentColor(Lcom/daaw/avee/comp/Visualizer/Meter;)[F
    .locals 3

    .line 435
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureColor:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure(Lcom/daaw/avee/comp/Visualizer/Meter;F)F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 436
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 439
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorFrom:[F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorTo:[F

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->colorHslaTmp:[F

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/avee/Common/Utils;->lerpHsla([F[F[FF)V

    .line 440
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->colorHslaTmp:[F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->colorF4Tmp:[F

    invoke-static {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa1ColorToF4Color([F[F)V

    .line 441
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->colorF4Tmp:[F

    return-object p1
.end method

.method private getCurrentColorInt(Lcom/daaw/avee/comp/Visualizer/Meter;)I
    .locals 3

    .line 446
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureColor:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure(Lcom/daaw/avee/comp/Visualizer/Meter;F)F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 447
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 450
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorFrom:[F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorTo:[F

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->colorHslaTmp:[F

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/avee/Common/Utils;->lerpHsla([F[F[FF)V

    .line 452
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->colorHslaTmp:[F

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa1ColorToInt([F)I

    move-result p1

    return p1
.end method

.method private renderCircle(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 13

    .line 798
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v0, v1

    .line 800
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTexturePrimary()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 801
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTexturePrimary()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    cmpl-float v2, v1, v0

    if-lez v2, :cond_0

    .line 807
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    div-float v2, v0, v1

    goto :goto_0

    :cond_0
    cmpg-float v0, v1, v0

    if-gez v0, :cond_1

    .line 810
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v2

    mul-float v0, v1, v2

    goto :goto_0

    .line 813
    :cond_1
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    .line 814
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v2

    :goto_0
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v4, v0, v2

    if-lez v4, :cond_2

    div-float v1, v3, v1

    move v3, v1

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    mul-float v1, v1, v3

    :goto_1
    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v3, v3, v4

    mul-float v1, v1, v4

    cmpg-float v0, v0, v2

    move-object v0, p1

    .line 852
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v5

    new-instance v9, Lcom/daaw/avee/Common/Vec2f;

    sub-float v2, v4, v3

    add-float v6, v1, v4

    invoke-direct {v9, v2, v6}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    new-instance v10, Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v3, v4

    sub-float/2addr v4, v1

    invoke-direct {v10, v3, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    move-object v1, p0

    iget-object v12, v1, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    move-object v6, p1

    move-object v7, p2

    move/from16 v8, p3

    move-object/from16 v11, p4

    invoke-virtual/range {v5 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->renderPath(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;ILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "Image"

    return-object v0
.end method

.method public getMaskMode()I
    .locals 1

    .line 235
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskMode:I

    return v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 414
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->markNeedReCreateGLResources()V

    .line 415
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onAlbumArtCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/AlbumArt/ImageResult;Lcom/daaw/avee/Common/Ref;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/AlbumArt/ImageResult;",
            "Lcom/daaw/avee/Common/Ref<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "[",
            "Lmdesl/graphics/ITexture;",
            "Ljava/lang/Object;",
            ">;>;I)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method protected onAlbumArtRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 5

    .line 242
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "keepAspectRatio"

    const/4 v1, 0x1

    .line 243
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setKeepAspectRatio(Z)V

    const/4 v0, 0x0

    const-string v1, "blurredBorder"

    .line 244
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    const/4 v1, 0x4

    new-array v2, v1, [F

    .line 247
    fill-array-data v2, :array_0

    const-string v3, "Color"

    invoke-virtual {p1, v3, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyArray4f(Ljava/lang/String;[F)[F

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorFrom:[F

    new-array v1, v1, [F

    .line 248
    fill-array-data v1, :array_1

    const-string v2, "ColorTo"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyArray4f(Ljava/lang/String;[F)[F

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorTo:[F

    const-string v1, "MeasureColorBlend"

    .line 253
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v1

    .line 254
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureColor:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v3, 0x3f000000    # 0.5f

    const-string v4, "Nothing"

    invoke-virtual {v2, v1, v4, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FF)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 257
    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    const-string v2, "saturation"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->saturationVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const-string v1, "blurEnabled"

    .line 260
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    const-string v2, "blurDivider"

    const/4 v3, 0x5

    .line 268
    invoke-virtual {p1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "blurRadius"

    const/4 v4, 0x7

    .line 269
    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v3

    .line 266
    invoke-virtual {p0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(ZII)V

    const-string v1, "Shape"

    .line 272
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v1

    const-string v2, "None"

    .line 273
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    invoke-static {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    if-eqz v2, :cond_0

    .line 275
    invoke-interface {v2, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 278
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    const-string v3, "MaskImage"

    invoke-virtual {p1, v3, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    .line 279
    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageMask;->maskModes:[Ljava/lang/String;

    const-string v2, "maskMode"

    invoke-virtual {p1, v2, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertySelectStringIndex(Ljava/lang/String;[Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMaskMode(I)V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 420
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    .line 421
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 422
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    return v2
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 428
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    .line 429
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 408
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 409
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 536
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 537
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 8

    .line 286
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 287
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->keepAspectRatio:Z

    const-string v6, "1_image"

    const-string v1, "keepAspectRatio"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 288
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurredBorder:Z

    const-string v1, "blurredBorder"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    const-string v0, "Image"

    .line 290
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 293
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorFrom:[F

    const-string v1, "2_color"

    const-string v2, "Color"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fAsCHSLA(Ljava/lang/String;[FLjava/lang/String;)V

    .line 294
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorTo:[F

    const-string v2, "ColorTo"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fAsCHSLA(Ljava/lang/String;[FLjava/lang/String;)V

    const/4 v7, 0x0

    new-array v0, v7, [Ljava/lang/String;

    const-string v2, "MeasureColorBlend"

    const-string v3, ""

    .line 300
    invoke-virtual {p1, v2, v3, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 301
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureColor:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onReadCustomization1D(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 304
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->saturationVar:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const-string v1, "saturation"

    const-string v3, "2_color"

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    .line 306
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurEnabled:Z

    const-string v1, "blurEnabled"

    const-string v2, "blur"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 307
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurDivider:I

    const-string v1, "blurDivider"

    const-string v3, "blur"

    const/4 v4, 0x0

    const/16 v5, 0xa

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 308
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->pixelRadius:I

    const-string v1, "blurRadius"

    const-string v3, "blur"

    const/4 v4, 0x1

    const/16 v5, 0x19

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 311
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->typeNamesClosedAndNone:[Ljava/lang/String;

    const-string v2, "Shape"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 312
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 315
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 316
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    const-string v2, "MaskImage"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 318
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageMask;->maskModes:[Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->getMaskMode()I

    move-result v1

    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageMask;->maskModes:[Ljava/lang/String;

    aget-object v2, v2, v7

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/Common/Utils;->IndexToString([Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 319
    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageMask;->maskModes:[Ljava/lang/String;

    const-string v2, "maskMode"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putSelectString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 23

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    .line 542
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 544
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v1, p2

    invoke-virtual {v0, v15, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 546
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v0

    .line 547
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v1, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTextureSecondary(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v7

    if-nez v0, :cond_0

    return-void

    .line 554
    :cond_0
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureAnimationSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    iget-object v2, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v2, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v1, v1, v2

    .line 555
    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getSubZ(F)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v8

    .line 558
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v14

    .line 559
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v5

    .line 561
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->getCurrentColorInt(Lcom/daaw/avee/comp/Visualizer/Meter;)I

    move-result v13

    .line 564
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V

    const/4 v0, 0x0

    .line 573
    iget-object v1, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferFxLight()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    .line 574
    iget-object v5, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 576
    invoke-virtual {v5, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v5

    const/4 v9, 0x1

    aput-object v5, v3, v9

    .line 578
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->getBlendMode()I

    move-result v17

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    const/16 v21, 0x1

    move-object/from16 v16, v5

    move-object/from16 v18, v3

    move-object/from16 v19, v1

    move-object/from16 v20, v10

    invoke-direct/range {v16 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    .line 580
    iget-object v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    if-nez v3, :cond_9

    .line 583
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    move-result v3

    .line 584
    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v10

    .line 589
    iget-boolean v11, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->keepAspectRatio:Z

    const/high16 v12, 0x3f800000    # 1.0f

    if-nez v11, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->getKeepAspectRatioAndCropToFit()Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v19, v0

    :goto_0
    move v0, v10

    goto :goto_7

    .line 592
    :cond_2
    :goto_1
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v10

    div-float/2addr v3, v10

    if-nez v8, :cond_3

    const/high16 v10, 0x3f800000    # 1.0f

    goto :goto_2

    .line 593
    :cond_3
    invoke-interface {v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getWidth()I

    move-result v10

    int-to-float v10, v10

    invoke-interface {v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getHeight()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v10, v8

    :goto_2
    cmpl-float v3, v10, v3

    if-lez v3, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    .line 599
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->getKeepAspectRatioAndCropToFit()Z

    move-result v8

    if-eqz v8, :cond_6

    if-nez v3, :cond_5

    .line 603
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    move-result v3

    goto :goto_4

    .line 609
    :cond_5
    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v3

    goto :goto_5

    :cond_6
    if-eqz v3, :cond_7

    .line 617
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    move-result v3

    :goto_4
    div-float v8, v3, v10

    move v10, v8

    goto :goto_6

    .line 620
    :cond_7
    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v3

    :goto_5
    mul-float v10, v10, v3

    move/from16 v22, v10

    move v10, v3

    move/from16 v3, v22

    :goto_6
    if-eqz v7, :cond_1

    new-array v0, v2, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    aput-object v7, v0, v4

    .line 633
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 635
    invoke-virtual {v2, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v2

    aput-object v2, v0, v9

    .line 637
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->getBlendMode()I

    move-result v4

    iget-object v7, v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->renderBlurShaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v2, v4, v0, v1, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    move-object/from16 v19, v2

    goto :goto_0

    .line 674
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->getKeepAspectRatioAndCropToFit()Z

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    if-eqz v1, :cond_8

    .line 680
    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    mul-float v4, v3, v2

    sub-float/2addr v1, v4

    .line 681
    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    mul-float v7, v0, v2

    sub-float/2addr v4, v7

    div-float v7, v3, v3

    sub-float/2addr v7, v12

    mul-float v7, v7, v2

    div-float v8, v0, v0

    sub-float/2addr v8, v12

    mul-float v8, v8, v2

    .line 688
    iget-object v2, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v2

    new-instance v10, Lcom/daaw/avee/Common/Vec2f;

    const/4 v9, 0x0

    sub-float v11, v9, v7

    sub-float/2addr v9, v8

    invoke-direct {v10, v11, v9}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    new-instance v11, Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v7, v12

    add-float/2addr v8, v12

    invoke-direct {v11, v7, v8}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const/16 v18, 0x0

    move-object v7, v2

    move-object/from16 v8, p1

    move v9, v1

    move-object v2, v10

    move v10, v4

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move v12, v3

    move/from16 p2, v13

    move v13, v0

    move-object/from16 v20, v14

    move/from16 v14, p2

    move-object v15, v2

    move-object/from16 v17, v5

    invoke-virtual/range {v7 .. v18}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    move-object/from16 v2, p1

    goto :goto_8

    :cond_8
    move/from16 p2, v13

    move-object/from16 v20, v14

    .line 701
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    mul-float v4, v3, v2

    sub-float/2addr v1, v4

    .line 702
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    mul-float v2, v2, v0

    sub-float/2addr v4, v2

    move-object/from16 v2, p1

    .line 706
    iget-object v7, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    const/4 v11, 0x0

    .line 711
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v15

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v16

    const/16 v18, 0x0

    move-object/from16 v8, p1

    move v9, v1

    move v10, v4

    move v12, v3

    move v13, v0

    move/from16 v14, p2

    move-object/from16 v17, v5

    .line 706
    invoke-virtual/range {v7 .. v18}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    :goto_8
    if-eqz v19, :cond_a

    .line 719
    new-instance v5, Landroid/graphics/RectF;

    add-float/2addr v3, v1

    add-float/2addr v0, v4

    invoke-direct {v5, v1, v4, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, v20

    move-object v4, v5

    move-object/from16 v5, v19

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->renderRectangleBooleanOp(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILandroid/graphics/RectF;Landroid/graphics/RectF;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    goto :goto_9

    :cond_9
    move v1, v13

    move-object v0, v14

    move-object v2, v15

    .line 723
    invoke-direct {v6, v2, v0, v1, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->renderCircle(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :cond_a
    :goto_9
    return-void
.end method

.method renderRectangleBooleanOp(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILandroid/graphics/RectF;Landroid/graphics/RectF;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 19

    move-object/from16 v12, p1

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    .line 738
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->width()F

    move-result v15

    .line 739
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->height()F

    move-result v16

    .line 741
    new-instance v11, Landroid/graphics/RectF;

    invoke-direct {v11}, Landroid/graphics/RectF;-><init>()V

    .line 745
    iget v0, v13, Landroid/graphics/RectF;->left:F

    iget v1, v13, Landroid/graphics/RectF;->top:F

    iget v2, v13, Landroid/graphics/RectF;->right:F

    iget v3, v14, Landroid/graphics/RectF;->top:F

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 746
    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/4 v10, 0x0

    cmpl-float v0, v0, v10

    if-lez v0, :cond_0

    .line 747
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    iget v2, v11, Landroid/graphics/RectF;->left:F

    iget v3, v11, Landroid/graphics/RectF;->top:F

    const/4 v4, 0x0

    .line 750
    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    move-result v5

    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    move-result v6

    new-instance v8, Lcom/daaw/avee/Common/Vec2f;

    iget v1, v14, Landroid/graphics/RectF;->bottom:F

    div-float v1, v1, v16

    invoke-direct {v8, v10, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 752
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v9

    const/16 v17, 0x0

    move-object/from16 v1, p1

    move/from16 v7, p2

    move-object/from16 v10, p5

    move/from16 v18, v15

    move-object v15, v11

    move/from16 v11, v17

    .line 747
    invoke-virtual/range {v0 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    goto :goto_0

    :cond_0
    move/from16 v18, v15

    move-object v15, v11

    .line 758
    :goto_0
    iget v0, v13, Landroid/graphics/RectF;->left:F

    iget v1, v14, Landroid/graphics/RectF;->bottom:F

    iget v2, v13, Landroid/graphics/RectF;->right:F

    iget v3, v13, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 759
    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    cmpl-float v0, v0, v10

    if-lez v0, :cond_1

    .line 760
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    iget v2, v15, Landroid/graphics/RectF;->left:F

    iget v3, v15, Landroid/graphics/RectF;->top:F

    const/4 v4, 0x0

    .line 763
    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v5

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v6

    .line 766
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v8

    new-instance v9, Lcom/daaw/avee/Common/Vec2f;

    iget v1, v14, Landroid/graphics/RectF;->top:F

    div-float v1, v1, v16

    invoke-direct {v9, v11, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const/16 v16, 0x0

    move-object/from16 v1, p1

    move/from16 v7, p2

    move-object/from16 v10, p5

    move/from16 v11, v16

    .line 760
    invoke-virtual/range {v0 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    .line 772
    :cond_1
    iget v0, v13, Landroid/graphics/RectF;->left:F

    iget v1, v14, Landroid/graphics/RectF;->top:F

    iget v2, v14, Landroid/graphics/RectF;->left:F

    iget v3, v14, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 773
    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/4 v11, 0x0

    cmpl-float v0, v0, v11

    if-lez v0, :cond_2

    .line 774
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v0

    iget v2, v15, Landroid/graphics/RectF;->left:F

    iget v3, v15, Landroid/graphics/RectF;->top:F

    const/4 v4, 0x0

    .line 777
    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v5

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v6

    .line 779
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v8

    new-instance v9, Lcom/daaw/avee/Common/Vec2f;

    iget v1, v14, Landroid/graphics/RectF;->left:F

    div-float v1, v1, v18

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v9, v1, v7}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const/16 v16, 0x0

    move-object/from16 v1, p1

    move/from16 v7, p2

    move-object/from16 v10, p5

    const/4 v12, 0x0

    move/from16 v11, v16

    .line 774
    invoke-virtual/range {v0 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    .line 784
    :goto_1
    iget v0, v14, Landroid/graphics/RectF;->right:F

    iget v1, v14, Landroid/graphics/RectF;->top:F

    iget v2, v13, Landroid/graphics/RectF;->right:F

    iget v3, v14, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 785
    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v0

    cmpl-float v0, v0, v12

    if-lez v0, :cond_3

    move-object/from16 v1, p1

    const/4 v0, 0x0

    .line 786
    iget-object v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v2

    iget v3, v15, Landroid/graphics/RectF;->left:F

    iget v4, v15, Landroid/graphics/RectF;->top:F

    const/4 v5, 0x0

    .line 789
    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v6

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v7

    new-instance v8, Lcom/daaw/avee/Common/Vec2f;

    iget v9, v14, Landroid/graphics/RectF;->right:F

    div-float v9, v9, v18

    invoke-direct {v8, v9, v0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 791
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v9

    const/4 v11, 0x0

    move-object v0, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move/from16 v7, p2

    move-object/from16 v10, p5

    .line 786
    invoke-virtual/range {v0 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    :cond_3
    return-void
.end method

.method public setBlurAmount(Z)V
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x7

    .line 189
    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(ZII)V

    return-void
.end method

.method public setBlurAmount(ZII)V
    .locals 1

    .line 193
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurEnabled:Z

    if-ne v0, p1, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurDivider:I

    if-ne v0, p2, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->pixelRadius:I

    if-ne v0, p3, :cond_0

    return-void

    .line 194
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurEnabled:Z

    .line 195
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurDivider:I

    .line 196
    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->pixelRadius:I

    .line 197
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setBlurredBorder(Z)V
    .locals 1

    .line 219
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurredBorder:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 220
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->blurredBorder:Z

    .line 222
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setCircleShape(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 202
    new-instance p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 204
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    :goto_0
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorFrom:[F

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa1([FI)V

    return-void
.end method

.method public setColorTo(I)V
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->hslaColorTo:[F

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa1([FI)V

    return-void
.end method

.method public setKeepAspectRatio(Z)V
    .locals 1

    .line 212
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->keepAspectRatio:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 213
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->keepAspectRatio:Z

    .line 215
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setMaskCustomImage(Ljava/lang/String;)V
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method

.method public setMaskMode(I)V
    .locals 0

    .line 231
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->maskMode:I

    return-void
.end method

.method public setMeasureColor(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->measureColor:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    return-void
.end method

.method public setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    return-void
.end method
