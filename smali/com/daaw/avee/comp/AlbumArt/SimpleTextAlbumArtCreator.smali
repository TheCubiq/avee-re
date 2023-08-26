.class Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;
.super Ljava/lang/Object;
.source "SimpleTextAlbumArtCreator.java"


# static fields
.field static bitmapSmallBgReuse:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 72
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;->bitmapSmallBgReuse:Ljava/lang/ThreadLocal;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static CreateGradient(IIIILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 17

    .line 234
    invoke-static/range {p0 .. p0}, Lcom/daaw/avee/Common/Utils;->IsOdd(I)Z

    move-result v0

    if-nez v0, :cond_0

    add-int/lit8 v0, p0, 0x1

    goto :goto_0

    :cond_0
    move/from16 v0, p0

    .line 235
    :goto_0
    invoke-static/range {p1 .. p1}, Lcom/daaw/avee/Common/Utils;->IsOdd(I)Z

    move-result v1

    if-nez v1, :cond_1

    add-int/lit8 v1, p1, 0x1

    goto :goto_1

    :cond_1
    move/from16 v1, p1

    :goto_1
    if-eqz p4, :cond_2

    .line 239
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-ne v2, v0, :cond_2

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-ne v2, v1, :cond_2

    move-object/from16 v2, p4

    goto :goto_2

    :cond_2
    if-eqz p4, :cond_3

    .line 243
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Bitmap;->recycle()V

    .line 244
    :cond_3
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    :goto_2
    mul-int v3, v0, v1

    const/4 v4, 0x4

    mul-int/lit8 v3, v3, 0x4

    .line 251
    new-array v3, v3, [B

    .line 255
    div-int/lit8 v3, v0, 0x2

    .line 256
    div-int/lit8 v5, v1, 0x2

    int-to-float v6, v3

    int-to-float v7, v5

    .line 258
    invoke-static {v6, v7}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v6

    new-array v7, v4, [F

    new-array v8, v4, [F

    move/from16 v9, p2

    .line 263
    invoke-static {v7, v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa360([FI)V

    move/from16 v9, p3

    .line 264
    invoke-static {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa360([FI)V

    new-array v4, v4, [F

    const/4 v9, 0x0

    const/4 v10, 0x0

    aput v9, v4, v10

    const/4 v9, 0x1

    .line 271
    aget v11, v7, v9

    aput v11, v4, v9

    const/4 v9, 0x2

    aget v11, v7, v9

    aput v11, v4, v9

    const/4 v9, 0x3

    aget v11, v7, v9

    aput v11, v4, v9

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v1, :cond_7

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v0, :cond_6

    sub-int v12, v3, v11

    sub-int v13, v5, v9

    int-to-float v12, v12

    int-to-float v13, v13

    .line 279
    invoke-static {v12, v13}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v12

    div-float/2addr v12, v6

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v12}, Ljava/lang/Math;->min(FF)F

    move-result v12

    mul-float v12, v12, v12

    sub-float/2addr v13, v12

    .line 283
    aget v14, v7, v10

    aget v15, v8, v10

    sub-float/2addr v14, v15

    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v14

    const/high16 v15, 0x43340000    # 180.0f

    cmpl-float v14, v14, v15

    if-lez v14, :cond_5

    .line 285
    aget v14, v7, v10

    const/high16 v16, 0x43b40000    # 360.0f

    cmpg-float v14, v14, v15

    if-gez v14, :cond_4

    aget v14, v7, v10

    add-float v14, v14, v16

    aput v14, v7, v10

    .line 286
    :cond_4
    aget v14, v8, v10

    add-float v14, v14, v16

    aput v14, v8, v10

    .line 289
    :cond_5
    aget v14, v7, v10

    mul-float v14, v14, v13

    aget v13, v8, v10

    mul-float v13, v13, v12

    add-float/2addr v14, v13

    aput v14, v4, v10

    .line 292
    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa360ColorToInt([F)I

    move-result v12

    .line 298
    invoke-virtual {v2, v11, v9, v12}, Landroid/graphics/Bitmap;->setPixel(III)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_7
    return-object v2
.end method

.method private static setTextSizeForWidth(Landroid/graphics/Paint;FFLjava/lang/String;I)V
    .locals 4

    const/high16 v0, 0x42400000    # 48.0f

    .line 44
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 45
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 46
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p0, p3, v3, v2, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    mul-float p1, p1, v0

    .line 49
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p1, p3

    mul-float p2, p2, v0

    .line 50
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result p3

    mul-int p3, p3, p4

    int-to-float p3, p3

    div-float/2addr p2, p3

    .line 53
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public static textAsBitmap(IILjava/lang/String;IIILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 10

    .line 67
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move v2, p0

    move v3, p1

    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v8, 0x0

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move-object/from16 v9, p6

    invoke-static/range {v1 .. v9}, Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;->textAsBitmap(Landroid/graphics/Bitmap;IILjava/lang/String;IIILandroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static textAsBitmap(IILjava/lang/String;IIILandroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 10

    .line 60
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move v2, p0

    move v3, p1

    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v9, 0x0

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move-object/from16 v8, p6

    invoke-static/range {v1 .. v9}, Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;->textAsBitmap(Landroid/graphics/Bitmap;IILjava/lang/String;IIILandroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static textAsBitmap(Landroid/graphics/Bitmap;IILjava/lang/String;IIILandroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 77
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "\\s+"

    move-object/from16 v5, p3

    .line 85
    invoke-virtual {v5, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 87
    :cond_0
    :goto_0
    array-length v8, v4

    const/4 v9, 0x1

    if-ge v6, v8, :cond_2

    .line 88
    aget-object v8, v4, v6

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    .line 89
    aget-object v10, v4, v6

    add-int/lit8 v6, v6, 0x1

    .line 91
    array-length v10, v4

    if-ge v6, v10, :cond_1

    .line 92
    aget-object v10, v4, v6

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    if-ne v10, v9, :cond_1

    add-int/lit8 v8, v8, 0x2

    .line 95
    aget-object v9, v4, v6

    :cond_1
    if-le v8, v7, :cond_0

    move v7, v8

    goto :goto_0

    :cond_2
    const-string v6, ""

    .line 106
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    array-length v8, v4

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v10, v8, :cond_6

    aget-object v12, v4, v10

    .line 108
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    if-gtz v13, :cond_3

    goto :goto_2

    :cond_3
    add-int v14, v11, v13

    if-gt v14, v7, :cond_5

    if-lez v11, :cond_4

    .line 114
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v14

    sub-int/2addr v14, v9

    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 115
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v15

    sub-int/2addr v15, v9

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, " "

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v15, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v13, v9

    add-int/2addr v11, v13

    goto :goto_2

    .line 118
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v9

    invoke-interface {v3, v5, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move v11, v14

    goto :goto_2

    .line 123
    :cond_5
    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v11, v13

    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 130
    :cond_6
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 131
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-le v8, v5, :cond_7

    move-object v6, v7

    move v5, v8

    goto :goto_3

    .line 140
    :cond_8
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    move/from16 v5, p4

    .line 141
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 142
    sget-object v5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 143
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 144
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 146
    div-int/lit8 v7, v5, 0xb

    sub-int/2addr v5, v7

    int-to-float v5, v5

    .line 149
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v9

    int-to-float v7, v7

    const v8, 0x3d23d70a    # 0.04f

    mul-float v7, v7, v8

    const v8, 0x3ecccccd    # 0.4f

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    const/high16 v10, 0x3f800000    # 1.0f

    sub-float v7, v10, v7

    mul-float v7, v7, v5

    const v11, 0x3f666666    # 0.9f

    mul-float v5, v5, v11

    .line 150
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v11

    invoke-static {v4, v7, v5, v6, v11}, Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;->setTextSizeForWidth(Landroid/graphics/Paint;FFLjava/lang/String;I)V

    .line 152
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 153
    sget-object v6, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v7, 0x0

    invoke-virtual {v5, v7, v6}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 171
    div-int/lit8 v6, v1, 0x8

    div-int/lit8 v7, v2, 0x8

    sget-object v11, Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;->bitmapSmallBgReuse:Ljava/lang/ThreadLocal;

    invoke-virtual {v11}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/graphics/Bitmap;

    move/from16 v12, p5

    move/from16 v13, p6

    invoke-static {v6, v7, v12, v13, v11}, Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;->CreateGradient(IIIILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    if-eqz v6, :cond_9

    .line 174
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 175
    invoke-static/range {p5 .. p5}, Landroid/graphics/Color;->alpha(I)I

    move-result v11

    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 176
    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 177
    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    const/4 v9, 0x0

    .line 179
    new-instance v11, Landroid/graphics/RectF;

    int-to-float v12, v1

    int-to-float v13, v2

    invoke-direct {v11, v8, v8, v12, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v5, v6, v9, v11, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 181
    :cond_9
    sget-object v7, Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;->bitmapSmallBgReuse:Ljava/lang/ThreadLocal;

    invoke-virtual {v7, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 183
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v6

    iget v6, v6, Landroid/graphics/Paint$FontMetrics;->leading:F

    .line 185
    invoke-virtual {v4}, Landroid/graphics/Paint;->descent()F

    move-result v7

    invoke-virtual {v4}, Landroid/graphics/Paint;->ascent()F

    move-result v8

    add-float/2addr v7, v8

    neg-float v7, v7

    .line 187
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    int-to-float v8, v8

    mul-float v8, v8, v7

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    int-to-float v9, v9

    mul-float v11, v6, v10

    sub-float/2addr v9, v11

    add-float/2addr v8, v9

    int-to-float v1, v1

    const/high16 v9, 0x3f000000    # 0.5f

    mul-float v1, v1, v9

    int-to-float v2, v2

    mul-float v2, v2, v9

    neg-float v8, v8

    mul-float v8, v8, v9

    add-float/2addr v2, v8

    mul-float v10, v10, v7

    add-float/2addr v2, v10

    .line 191
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 193
    invoke-virtual {v5, v8, v1, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-float v8, v7, v6

    add-float/2addr v2, v8

    goto :goto_4

    :cond_a
    return-object v0
.end method

.method static textAsBitmap(Ljava/lang/String;FII)Landroid/graphics/Bitmap;
    .locals 3

    .line 201
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 202
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 203
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 204
    sget-object p1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 205
    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    move-result p1

    neg-float p1, p1

    .line 206
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr p2, v1

    float-to-int p2, p2

    .line 207
    invoke-virtual {v0}, Landroid/graphics/Paint;->descent()F

    move-result v2

    add-float/2addr v2, p1

    add-float/2addr v2, v1

    float-to-int v1, v2

    .line 208
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 209
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 210
    invoke-virtual {v1, p3}, Landroid/graphics/Canvas;->drawColor(I)V

    const/4 p3, 0x0

    .line 211
    invoke-virtual {v1, p0, p3, p1, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-object p2
.end method

.method static valueInAlphabet(C)F
    .locals 4

    .line 217
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x5a

    if-gt p0, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x41

    if-lt p0, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    and-int/2addr v0, v2

    if-eqz v0, :cond_2

    const/high16 v0, 0x41d00000    # 26.0f

    sub-int/2addr p0, v3

    int-to-float p0, p0

    div-float/2addr p0, v0

    return p0

    :cond_2
    const/high16 p0, 0x3f000000    # 0.5f

    return p0
.end method
