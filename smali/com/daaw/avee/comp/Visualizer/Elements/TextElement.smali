.class public Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "TextElement.java"


# static fields
.field public static final fontTypefaces:[Ljava/lang/String;

.field public static final typeName:Ljava/lang/String; = "Text"


# instance fields
.field protected color1:I

.field private customFontPath:Ljava/lang/String;

.field protected font1:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

.field private fontSize:I

.field protected maxfontSizePixelsLimit:I

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

.field private text:Ljava/lang/String;

.field public final vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "internal_0:2131230895"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "internal_1:2131230896"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "internal_2:2131230897"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "internal_3:2131230898"

    aput-object v2, v0, v1

    .line 40
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontTypefaces:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    .line 59
    invoke-direct {p0, v1, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const-string v0, "{ArtistOrTitle}"

    .line 48
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->text:Ljava/lang/String;

    const/16 v0, 0x1e

    .line 49
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontSize:I

    const/4 v0, -0x1

    .line 50
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->color1:I

    const-string v0, ""

    .line 52
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    const/16 v0, 0x1f4

    .line 54
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->maxfontSizePixelsLimit:I

    .line 56
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 197
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    return-void
.end method


# virtual methods
.method public getCustomFontPath()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    return-object v0
.end method

.method public getDrawOffset(Landroid/graphics/RectF;)Lcom/daaw/avee/Common/Vec2f;
    .locals 1

    .line 287
    new-instance p1, Lcom/daaw/avee/Common/Vec2f;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object p1
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "Text"

    return-object v0
.end method

.method public limitColor(FF)V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [F

    .line 106
    fill-array-data v0, :array_0

    .line 107
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->color1:I

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa360([FI)V

    const/4 v1, 0x2

    .line 108
    aget v2, v0, v1

    invoke-static {p2, v2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    aput p2, v0, v1

    const/4 p2, 0x3

    .line 109
    aget v1, v0, p2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    aput p1, v0, p2

    .line 110
    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa360ColorToInt([F)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public limitFontSize(I)V
    .locals 1

    .line 114
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontSize:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontSize:I

    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 119
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 120
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "text"

    const-string v1, "{ArtistOrTitle}"

    .line 121
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setText(Ljava/lang/String;)V

    const-string v0, "color"

    const/4 v1, -0x1

    .line 122
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    const-string v0, "fontSize"

    const/16 v1, 0x1e

    .line 123
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setFontSize(I)V

    const-string v0, "typeFace"

    const-string v1, ""

    .line 124
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setCustomFontPath(Ljava/lang/String;)V

    return-void
.end method

.method protected onApplyCustomization0(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 129
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->getCustomFontPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "typeFace"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setCustomFontPath(Ljava/lang/String;)V

    return-void
.end method

.method public onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 5

    .line 161
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontSize:I

    int-to-float v1, v1

    const v2, 0x3e0f5c29    # 0.14f

    mul-float v1, v1, v2

    const v2, 0x3c23d70a    # 0.01f

    mul-float v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpace(F)F

    move-result v0

    float-to-int v0, v0

    .line 162
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->maxfontSizePixelsLimit:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 165
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 166
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    goto/16 :goto_0

    .line 167
    :cond_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    const-string v3, "default_bold"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    goto :goto_0

    .line 170
    :cond_1
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_5

    :try_start_0
    const-string v3, "internal_0"

    .line 174
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 175
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/greatvibes-regular.otf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v3, "internal_1"

    .line 176
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 177
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/notomono-regular.ttf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    goto :goto_0

    :cond_3
    const-string v3, "internal_2"

    .line 178
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 179
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/orbitron-medium.otf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    goto :goto_0

    :cond_4
    const-string v3, "internal_3"

    .line 180
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 181
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/orkney-light.otf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 185
    :catch_0
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 191
    :cond_5
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->font1:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->dispose()V

    .line 192
    :cond_6
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->createAscii32to126()Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    move-result-object v3

    invoke-direct {v2, v1, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;-><init>(Landroid/graphics/Typeface;ILcom/daaw/avee/comp/Visualizer/Graphic/CharSet;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->font1:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

    .line 193
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 150
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 152
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->font1:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->dispose()V

    :cond_0
    const/4 p1, 0x0

    .line 153
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->font1:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 8

    .line 134
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 135
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string p2, "Text"

    .line 136
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 137
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->text:Ljava/lang/String;

    const-string v0, "appearance"

    const-string v1, "text"

    invoke-virtual {p1, v1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsTxtPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->color1:I

    const-string v1, "color"

    invoke-virtual {p1, v1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 139
    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontSize:I

    const-string v3, "fontSize"

    const-string v5, "appearance"

    const/16 v6, 0x8

    const/16 v7, 0x64

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 140
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->getCustomFontPath()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontTypefaces:[Ljava/lang/String;

    const-string v2, "typeFace"

    invoke-virtual {p1, v2, p2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsAssetPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method protected onReadCustomization0(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 4

    .line 145
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->getCustomFontPath()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontTypefaces:[Ljava/lang/String;

    const-string v2, "typeFace"

    const-string v3, "appearance"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsAssetPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 20

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    .line 206
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 208
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->font1:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 210
    :cond_0
    iget-object v0, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 212
    new-instance v0, Lcom/daaw/avee/Common/Vec2i;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    .line 214
    iget-object v0, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFontRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;

    move-result-object v0

    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->font1:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

    invoke-virtual {v0, v1, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;->measureText(Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;Ljava/lang/String;)Lcom/daaw/avee/Common/Vec2i;

    move-result-object v0

    .line 222
    iget-object v1, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v1, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {v6, v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;Lcom/daaw/avee/Common/Vec2i;)Landroid/graphics/RectF;

    move-result-object v14

    .line 223
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v1

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v5

    .line 224
    iget v1, v14, Landroid/graphics/RectF;->left:F

    iget v2, v0, Lcom/daaw/avee/Common/Vec2i;->x:I

    int-to-float v2, v2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v2, v2, v3

    add-float v4, v1, v2

    .line 225
    iget v1, v14, Landroid/graphics/RectF;->top:F

    iget v0, v0, Lcom/daaw/avee/Common/Vec2i;->y:I

    int-to-float v0, v0

    mul-float v0, v0, v3

    sub-float v7, v1, v0

    .line 227
    invoke-virtual {v6, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->getDrawOffset(Landroid/graphics/RectF;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v8

    .line 249
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v3, v4

    move v4, v7

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V

    .line 251
    iget-object v0, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferVPMat()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    .line 252
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->getBlendMode()I

    move-result v2

    iget-object v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->font1:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->getEntryTexture()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v3

    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 255
    iget-object v0, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFontRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;

    move-result-object v7

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->font1:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;

    new-instance v10, Lcom/daaw/avee/Common/Vec3f;

    iget v0, v14, Landroid/graphics/RectF;->left:F

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v0, v2

    iget v2, v14, Landroid/graphics/RectF;->top:F

    iget v3, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v10, v0, v2, v3}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    iget v12, v6, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->color1:I

    const/4 v13, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v8, p1

    move-object v3, v14

    move v14, v0

    move-object v0, v15

    move v15, v2

    move-object/from16 v19, v1

    invoke-virtual/range {v7 .. v19}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;->drawText(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;Lcom/daaw/avee/Common/Vec3f;Ljava/lang/String;IIZIIIILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 282
    invoke-virtual {v6, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onRenderTextElement(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onRenderTextElement(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;)V
    .locals 0

    return-void
.end method

.method public setColor(I)V
    .locals 0

    .line 85
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->color1:I

    return-void
.end method

.method public setColorAlpha(I)V
    .locals 1

    .line 89
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->color1:I

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->setIntColorAlpha(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->color1:I

    return-void
.end method

.method public setCustomFontPath(Ljava/lang/String;)V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 100
    :cond_0
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->customFontPath:Ljava/lang/String;

    .line 101
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setFontSize(I)V
    .locals 1

    .line 72
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontSize:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x1f4

    .line 73
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->fontSize:I

    .line 74
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->text:Ljava/lang/String;

    return-void
.end method
