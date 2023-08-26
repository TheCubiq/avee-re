.class public Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;
.super Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;
.source "LogoMark2.java"


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

.field public static final typeName:Ljava/lang/String; = "AppLogo"


# instance fields
.field private color4f:[F

.field private currentAlbumArtPath:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

.field private elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field private final fontSize:I

.field private frameNormal:F

.field private final logoSize:F

.field private logoState:I

.field private showingTimeAcc:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR1;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 63
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;-><init>()V

    .line 51
    new-instance v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    const-string v2, ""

    const-string v3, "internalres:anim128_g_m10_15"

    invoke-direct {v0, v1, v3, v2, v2}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->currentAlbumArtPath:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    const/4 v0, 0x0

    .line 55
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->logoState:I

    const/4 v1, 0x0

    .line 56
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    const/4 v2, 0x4

    new-array v3, v2, [F

    .line 57
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->color4f:[F

    .line 58
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->showingTimeAcc:F

    const v3, 0x4019999a    # 2.4f

    .line 59
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->logoSize:F

    const/16 v3, 0x1a

    .line 60
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->fontSize:I

    .line 67
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2$1;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;)V

    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2$2;

    invoke-direct {v6, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;)V

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v5, 0x1

    .line 78
    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setColorKeyEnabled(Z)V

    const v4, -0x6f6f6f70

    .line 82
    invoke-virtual {p0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setColor(I)V

    .line 83
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setBlendMode(I)V

    .line 84
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setFontSize(I)V

    const-string v2, "internal_3"

    .line 85
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setCustomFontPath(Ljava/lang/String;)V

    const-string v2, "{MarkedArtistAndTitle}"

    .line 86
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setText(Ljava/lang/String;)V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 89
    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setPosition(FF)V

    const v2, 0x3f99999a    # 1.2f

    .line 90
    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setLocalPosition(FF)V

    .line 91
    invoke-virtual {p0, v5, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setPositionUniform(ZZ)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;)V
    .locals 0

    .line 30
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;)Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->currentAlbumArtPath:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    return-object p0
.end method


# virtual methods
.method public TriggerHide()V
    .locals 1

    .line 370
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->logoState:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    .line 371
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->logoState:I

    return-void
.end method

.method public TriggerShow()V
    .locals 2

    .line 363
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->logoState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 364
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->logoState:I

    return-void
.end method

.method public getDrawOffset(Landroid/graphics/RectF;)Lcom/daaw/avee/Common/Vec2f;
    .locals 6

    .line 329
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-static {v2, v0, v2, v1, v1}, Lcom/daaw/avee/Common/Easing;->easeInOutExpo(FFFFF)F

    move-result v0

    .line 330
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v1

    mul-float v1, v1, v2

    .line 332
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v2

    const v3, 0x3e19999a    # 0.15f

    mul-float v2, v2, v3

    const v3, 0x4019999a    # 2.4f

    mul-float v2, v2, v3

    .line 335
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v4

    const v5, 0x3f866666    # 1.05f

    mul-float v4, v4, v5

    mul-float v4, v4, v3

    add-float/2addr v4, v2

    add-float/2addr v4, v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v0, v0, v2

    add-float/2addr v0, v2

    mul-float v4, v4, v0

    .line 338
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    neg-float v1, v1

    add-float/2addr v1, v4

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    const v2, -0x41dc28f6    # -0.16f

    mul-float p1, p1, v2

    mul-float p1, p1, v3

    invoke-direct {v0, v1, p1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v0
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "AppLogo"

    return-object v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 176
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->markNeedReCreateGLResources()V

    .line 177
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 3

    .line 137
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onApplyCustomization0(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const/4 v0, 0x1

    const-string v1, "visible"

    .line 139
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setVisible(Z)V

    const-string v1, "color"

    const v2, -0x6f6f6f70

    .line 140
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setColor(I)V

    const/4 p1, 0x0

    .line 142
    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setPositionUniform(ZZ)V

    .line 145
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x3f0f5c29    # 0.56f

    .line 147
    invoke-virtual {p0, p1, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->limitColor(FF)V

    const/16 p1, 0x1a

    .line 149
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->limitFontSize(I)V

    const/high16 p1, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    .line 151
    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setPosition(FF)V

    const p1, 0x3f99999a    # 1.2f

    .line 152
    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setLocalPosition(FF)V

    :cond_0
    return-void
.end method

.method public onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 188
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    .line 189
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 190
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    return v2
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 182
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 183
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 201
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 202
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 3

    .line 159
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onReadCustomization0(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string p2, "AppLogo"

    .line 161
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 162
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->visible:Z

    const-string v1, "0_general"

    const-string v2, "visible"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    const-string v0, "pb"

    .line 163
    invoke-virtual {p1, v2, v0, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->updatePropertyBool(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->color4f:[F

    invoke-static {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColor([F)I

    move-result p2

    const-string v0, "color"

    .line 166
    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 169
    sget-object p2, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "position"

    .line 170
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->removeProperty(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 1

    .line 207
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 209
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void
.end method

.method public onRenderTextElement(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;)V
    .locals 14

    move-object v0, p0

    move-object v2, p1

    move-object/from16 v1, p2

    .line 216
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onRenderTextElement(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;)V

    .line 231
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getTriggerLogo()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-ne v3, v4, :cond_0

    .line 232
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->TriggerShow()V

    goto :goto_0

    .line 233
    :cond_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getTriggerLogo()I

    move-result v3

    if-ne v3, v5, :cond_1

    .line 234
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->TriggerHide()V

    .line 236
    :cond_1
    :goto_0
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->showingTimeAcc:F

    const/high16 v6, 0x40600000    # 3.5f

    cmpl-float v3, v3, v6

    if-lez v3, :cond_2

    .line 237
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->TriggerHide()V

    .line 240
    :cond_2
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->logoState:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-nez v3, :cond_3

    .line 241
    invoke-virtual {p0, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setColorNotUpdateOriginal(I)V

    .line 242
    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    .line 243
    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->showingTimeAcc:F

    return-void

    :cond_3
    const/high16 v8, 0x3fa00000    # 1.25f

    const/4 v9, 0x4

    const v10, 0x3f7fbe77    # 0.999f

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x3

    if-ne v3, v4, :cond_5

    .line 247
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameTimeF()F

    move-result v13

    mul-float v13, v13, v8

    add-float/2addr v3, v13

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    cmpl-float v3, v3, v10

    if-ltz v3, :cond_4

    .line 249
    iput v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    .line 250
    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->logoState:I

    .line 253
    :cond_4
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    const/high16 v8, 0x3f000000    # 0.5f

    sub-float/2addr v3, v8

    const/high16 v8, 0x40000000    # 2.0f

    mul-float v3, v3, v8

    invoke-static {v7, v3}, Ljava/lang/Math;->max(FF)F

    .line 254
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    invoke-static {v7, v3, v7, v11, v11}, Lcom/daaw/avee/Common/Easing;->easeInOutExpo(FFFFF)F

    move-result v3

    new-array v7, v9, [F

    .line 256
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->color4f:[F

    aget v9, v8, v6

    mul-float v9, v9, v3

    aput v9, v7, v6

    aget v6, v8, v4

    mul-float v6, v6, v3

    aput v6, v7, v4

    aget v4, v8, v5

    mul-float v4, v4, v3

    aput v4, v7, v5

    aget v4, v8, v12

    mul-float v4, v4, v3

    aput v4, v7, v12

    invoke-static {v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColor([F)I

    move-result v3

    .line 261
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setColorNotUpdateOriginal(I)V

    goto :goto_1

    :cond_5
    if-ne v3, v5, :cond_6

    .line 263
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->showingTimeAcc:F

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameTimeF()F

    move-result v7

    add-float/2addr v3, v7

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->showingTimeAcc:F

    new-array v3, v9, [F

    .line 265
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->color4f:[F

    aget v8, v7, v6

    aput v8, v3, v6

    aget v6, v7, v4

    aput v6, v3, v4

    aget v4, v7, v5

    aput v4, v3, v5

    aget v4, v7, v12

    aput v4, v3, v12

    invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColor([F)I

    move-result v3

    .line 266
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setColorNotUpdateOriginal(I)V

    .line 267
    iput v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    goto :goto_1

    :cond_6
    if-ne v3, v12, :cond_8

    .line 269
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameTimeF()F

    move-result v10

    mul-float v10, v10, v8

    sub-float/2addr v3, v10

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    cmpg-float v3, v3, v7

    if-gtz v3, :cond_7

    .line 271
    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    .line 272
    iput v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->logoState:I

    .line 275
    :cond_7
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    const/high16 v8, 0x3e800000    # 0.25f

    sub-float/2addr v3, v8

    const v8, 0x3faaaaab

    mul-float v3, v3, v8

    invoke-static {v7, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    .line 276
    invoke-static {v7, v3, v7, v11, v11}, Lcom/daaw/avee/Common/Easing;->easeInOutExpo(FFFFF)F

    move-result v3

    new-array v7, v9, [F

    .line 279
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->color4f:[F

    aget v9, v8, v6

    mul-float v9, v9, v3

    aput v9, v7, v6

    aget v6, v8, v4

    mul-float v6, v6, v3

    aput v6, v7, v4

    aget v4, v8, v5

    mul-float v4, v4, v3

    aput v4, v7, v5

    aget v4, v8, v12

    mul-float v4, v4, v3

    aput v4, v7, v12

    invoke-static {v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColor([F)I

    move-result v3

    .line 284
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->setColorNotUpdateOriginal(I)V

    .line 288
    :cond_8
    :goto_1
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v3, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v3

    if-nez v3, :cond_9

    return-void

    .line 292
    :cond_9
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->frameNormal:F

    invoke-interface {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getSubZ(F)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v3

    .line 300
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v4

    const v5, 0x4019999a    # 2.4f

    mul-float v7, v4, v5

    .line 302
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v4

    const v6, 0x3e19999a    # 0.15f

    mul-float v4, v4, v6

    mul-float v4, v4, v5

    .line 304
    iget v5, v1, Landroid/graphics/RectF;->left:F

    add-float/2addr v4, v5

    .line 305
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float v5, v1, v7

    const/4 v8, -0x1

    .line 314
    iget-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v1

    const/4 v6, 0x0

    .line 319
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v9

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v10

    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    .line 320
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->getBlendMode()I

    move-result v12

    const/4 v13, 0x0

    invoke-direct {v11, v12, v3, v13, v13}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    const/4 v12, 0x0

    move-object v2, p1

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    .line 314
    invoke-virtual/range {v1 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 107
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    .line 109
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->color4f:[F

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    return-void
.end method

.method public setColorNotUpdateOriginal(I)V
    .locals 0

    .line 113
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    return-void
.end method

.method public setFontSize(I)V
    .locals 0

    .line 118
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setFontSize(I)V

    return-void
.end method

.method public setLocalPosition(Lcom/daaw/avee/Common/Vec2f;)V
    .locals 0

    .line 130
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setLocalPosition(Lcom/daaw/avee/Common/Vec2f;)V

    return-void
.end method

.method public setPosition(Lcom/daaw/avee/Common/Vec2f;)V
    .locals 0

    .line 124
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setPosition(Lcom/daaw/avee/Common/Vec2f;)V

    return-void
.end method

.method protected shouldRender()Z
    .locals 1

    .line 101
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->shouldRender()Z

    move-result v0

    return v0
.end method
