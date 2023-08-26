.class public Lcom/daaw/avee/comp/Visualizer/Elements/Composition;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;
.source "Composition.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup<",
        "Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;",
        "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
        "Lcom/daaw/avee/comp/Visualizer/CustomComposition;",
        ">;",
        "Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;"
    }
.end annotation


# static fields
.field public static onRequest:Lcom/daaw/avee/Common/Events/WeakEventR1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final typeName:Ljava/lang/String; = "Composition"


# instance fields
.field private blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

.field private dependsOnCompositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private fadeAlpha:F

.field private fadeAlphaSmooth:F

.field private final finalComposition:Z

.field fps:Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;

.field private introBlendMode:I

.field private introFadeColor:I

.field private introFadeDurationSec:F

.field private outroFadeDurationSec:F

.field private thisFrameRendered:Z

.field private useMipmaps:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 99
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->useMipmaps:Z

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->dependsOnCompositions:Ljava/util/List;

    const/4 v1, 0x0

    .line 46
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlphaSmooth:F

    .line 47
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlpha:F

    .line 51
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeDurationSec:F

    .line 52
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->outroFadeDurationSec:F

    const/high16 v1, -0x21000000

    .line 53
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeColor:I

    .line 55
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introBlendMode:I

    .line 100
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->finalComposition:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 3

    .line 80
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->useMipmaps:Z

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->dependsOnCompositions:Ljava/util/List;

    const/4 v1, 0x0

    .line 46
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlphaSmooth:F

    .line 47
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlpha:F

    .line 51
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeDurationSec:F

    .line 52
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->outroFadeDurationSec:F

    const/high16 v2, -0x21000000

    .line 53
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeColor:I

    .line 55
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introBlendMode:I

    .line 81
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->finalComposition:Z

    if-eqz p1, :cond_0

    .line 84
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeDurationSec:F

    .line 85
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->outroFadeDurationSec:F

    :cond_0
    return-void
.end method

.method public static getIndexFromStringPath(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/16 v1, 0x3a

    .line 63
    invoke-static {p0, v1, v0}, Lcom/daaw/avee/Common/Utils;->stringSplitInTwo(Ljava/lang/String;I[Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 65
    aget-object p0, v0, p0

    const-string v1, "composition"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v1, -0x1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    .line 67
    aget-object p0, v0, p0

    invoke-static {p0, v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result p0

    return p0

    :cond_0
    return v1
.end method

.method private getIntroFadeColor()I
    .locals 1

    .line 113
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeColor:I

    return v0
.end method

.method private getIntroFadeDurationSec()F
    .locals 1

    .line 105
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeDurationSec:F

    return v0
.end method

.method private getOutroFadeDurationSec()F
    .locals 1

    .line 109
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->outroFadeDurationSec:F

    return v0
.end method

.method public static makeIndexStringPath(I)Ljava/lang/String;
    .locals 2

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "composition:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private renderCompositionEffect(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Common/TrackDurationInfo;)V
    .locals 7

    if-nez p2, :cond_0

    return-void

    .line 319
    :cond_0
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeColor:I

    .line 322
    iget v1, p2, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->durationMs:F

    const v2, 0x465ac000    # 14000.0f

    const v3, 0x3c23d70a    # 0.01f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_5

    .line 328
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeDurationSec:F

    const/high16 v2, 0x447a0000    # 1000.0f

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v3

    if-lez v1, :cond_1

    .line 329
    iget v1, p2, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->trackPositionMs:F

    div-float/2addr v1, v2

    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeDurationSec:F

    div-float/2addr v1, v5

    invoke-static {v4, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    goto :goto_0

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    .line 331
    :goto_0
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->outroFadeDurationSec:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v3

    if-lez v5, :cond_2

    .line 332
    iget v5, p2, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->durationMs:F

    iget p2, p2, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->trackPositionMs:F

    sub-float/2addr v5, p2

    div-float/2addr v5, v2

    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->outroFadeDurationSec:F

    div-float/2addr v5, p2

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result p2

    invoke-static {v6, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    goto :goto_1

    :cond_2
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_1
    cmpg-float v2, v1, v4

    if-gez v2, :cond_3

    .line 337
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeColor:I

    sub-float/2addr v4, v1

    .line 338
    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlpha:F

    goto :goto_2

    :cond_3
    cmpg-float v1, p2, v4

    if-gez v1, :cond_4

    .line 340
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeColor:I

    sub-float/2addr v4, p2

    .line 341
    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlpha:F

    goto :goto_2

    .line 344
    :cond_4
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlpha:F

    :cond_5
    :goto_2
    const p2, 0x3f666666    # 0.9f

    .line 354
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlphaSmooth:F

    mul-float v1, v1, p2

    const p2, 0x3dccccd0    # 0.100000024f

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlpha:F

    mul-float v2, v2, p2

    add-float/2addr v1, v2

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlphaSmooth:F

    cmpl-float p2, v1, v3

    if-lez p2, :cond_6

    .line 361
    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->getAlphaFloatFromIntColor(I)F

    move-result p2

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fadeAlphaSmooth:F

    mul-float p2, p2, v1

    float-to-int p2, p2

    invoke-static {v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->setIntColorAlpha(II)I

    move-result p2

    .line 363
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introBlendMode:I

    iget-object v2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 364
    invoke-virtual {p1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :cond_6
    return-void
.end method

.method private setIntroFadeColor(I)V
    .locals 0

    .line 130
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeColor:I

    return-void
.end method

.method private setIntroFadeDurationSec(F)V
    .locals 0

    .line 122
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introFadeDurationSec:F

    return-void
.end method

.method private setOutroFadeDurationSec(F)V
    .locals 0

    .line 126
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->outroFadeDurationSec:F

    return-void
.end method

.method private setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    const/16 v0, 0x2601

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 375
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 376
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    .line 378
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    return-void
.end method


# virtual methods
.method public CreateFactoryElement(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
    .locals 0

    const/4 p1, 0x0

    .line 166
    invoke-static {p2, p3, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->create(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    move-result-object p1

    return-object p1
.end method

.method public addDependencyCompositionIndex(I)V
    .locals 1

    .line 388
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->dependsOnCompositions:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getCompositionDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 383
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->dependsOnCompositions:Ljava/util/List;

    return-object v0
.end method

.method public getCompositionFrameBuffer()Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    return-object v0
.end method

.method public getCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ILcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)Z
    .locals 0

    .line 172
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->getCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ILcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)Z

    .line 174
    instance-of p2, p1, Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    if-eqz p2, :cond_0

    .line 175
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    invoke-virtual {p0, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->getCustomization(Lcom/daaw/avee/comp/Visualizer/ICustomization;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "Composition"

    return-object v0
.end method

.method isFinalComposition()Z
    .locals 1

    .line 139
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->finalComposition:Z

    return v0
.end method

.method public markRenderedForThisFrame()V
    .locals 1

    const/4 v0, 0x1

    .line 144
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->thisFrameRendered:Z

    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 3

    .line 393
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const/4 v0, 0x0

    .line 396
    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->getTypeName(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "introBlendMode"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 397
    invoke-static {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->create(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introBlendMode:I

    const/4 v0, 0x0

    const-string v1, "introFadeDuration"

    .line 399
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->setIntroFadeDurationSec(F)V

    const-string v1, "outroFadeDuration"

    .line 401
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->setOutroFadeDurationSec(F)V

    const-string v0, "introFadeColor"

    const/high16 v1, -0x21000000

    .line 403
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->setIntroFadeColor(I)V

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 5

    .line 232
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->finalComposition:Z

    if-nez v0, :cond_1

    .line 233
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->useMipmaps:Z

    .line 236
    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getSafeRenderBufferSizeTextureDim()Lcom/daaw/avee/Common/Vec2i;

    move-result-object v0

    .line 238
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    .line 239
    :cond_0
    iget v1, v0, Lcom/daaw/avee/Common/Vec2i;->x:I

    iget v0, v0, Lcom/daaw/avee/Common/Vec2i;->y:I

    const/16 v2, 0x2601

    const/16 v3, 0x2901

    iget-boolean v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->useMipmaps:Z

    invoke-static {v1, v0, v2, v3, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->createSafe(IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz v0, :cond_1

    .line 240
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->checkIfValid()Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 243
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 247
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 223
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 225
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    :cond_0
    const/4 p1, 0x0

    .line 226
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 0

    .line 252
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->dependsOnCompositions:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->clear()V

    .line 253
    invoke-super {p0, p1, p2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    const/4 p1, 0x0

    .line 254
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->thisFrameRendered:Z

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 7

    .line 410
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    const-string v0, "Composition"

    .line 413
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 415
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->introBlendMode:I

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->getTypeName(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "Alpha"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "AddAlpha"

    aput-object v3, v1, v2

    const-string v6, "2_introOutro"

    const-string v2, "introBlendMode"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putSelectString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 418
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->getIntroFadeDurationSec()F

    move-result v2

    const-string v1, "introFadeDuration"

    const-string v3, "2_introOutro"

    const/4 v4, 0x0

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 420
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->getOutroFadeDurationSec()F

    move-result v2

    const-string v1, "outroFadeDuration"

    const-string v3, "2_introOutro"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 423
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->getIntroFadeColor()I

    move-result v0

    const-string v1, "introFadeColor"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 2

    .line 272
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestUseHighQualityBlur()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->setUseMipmaps(Z)V

    .line 273
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    const/4 v0, 0x1

    .line 274
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->thisFrameRendered:Z

    .line 276
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getVisualizationData()Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestTrackDurationInfo()Lcom/daaw/avee/comp/Common/TrackDurationInfo;

    move-result-object v0

    .line 279
    iget-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->finalComposition:Z

    if-eqz v1, :cond_1

    .line 282
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 283
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->renderChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    if-nez p2, :cond_0

    .line 287
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->fps:Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;

    if-eqz v1, :cond_0

    .line 288
    invoke-virtual {v1, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 291
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->renderCompositionEffect(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Common/TrackDurationInfo;)V

    return-void

    .line 295
    :cond_1
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    if-nez p2, :cond_2

    return-void

    .line 297
    :cond_2
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    const/4 p2, 0x0

    .line 298
    invoke-static {p2, p2, p2, p2}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 p2, 0x4000

    .line 299
    invoke-static {p2}, Landroid/opengl/GLES20;->glClear(I)V

    .line 301
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 303
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->blurTargetContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->renderChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 304
    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->renderCompositionEffect(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Common/TrackDurationInfo;)V

    return-void
.end method

.method public onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 260
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->finalComposition:Z

    if-eqz v0, :cond_0

    .line 261
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 262
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->renderOffscreenContentChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void

    .line 266
    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 267
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->renderOffscreenContentChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public setCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;I)Z
    .locals 4

    .line 182
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->setCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;I)Z

    .line 184
    instance-of p2, p1, Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    if-eqz p2, :cond_0

    .line 185
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->setCustomization(Lcom/daaw/avee/comp/Visualizer/ICustomization;)Z

    .line 187
    :cond_0
    iget-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->finalComposition:Z

    const/4 p2, 0x1

    if-eqz p1, :cond_5

    .line 190
    sget-object p1, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, p0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 194
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->childList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 197
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->childList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .line 198
    instance-of v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;

    if-eqz v3, :cond_2

    .line 199
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->childList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, p2

    if-eq v1, p1, :cond_1

    .line 200
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->removeChildAt(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    move-object p1, v2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    if-nez v0, :cond_5

    if-nez p1, :cond_4

    .line 212
    new-instance p1, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;

    invoke-direct {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;-><init>()V

    .line 213
    :cond_4
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    :cond_5
    return p2
.end method

.method public setUseMipmaps(Z)V
    .locals 1

    .line 369
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->useMipmaps:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 370
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->useMipmaps:Z

    .line 371
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->markNeedReCreateGLResources()V

    return-void
.end method

.method protected shouldRender()Z
    .locals 1

    .line 154
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->shouldRender()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 156
    :cond_0
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->thisFrameRendered:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
