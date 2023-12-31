.class public Lcom/daaw/avee/comp/AlbumArt/ColorKey;
.super Ljava/lang/Object;
.source "ColorKey.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static ItoX(II)I
    .locals 0

    .line 18
    rem-int/2addr p0, p1

    return p0
.end method

.method static ItoY(II)I
    .locals 0

    .line 23
    div-int/2addr p0, p1

    return p0
.end method

.method static XYtoI(III)I
    .locals 0

    mul-int p1, p1, p2

    add-int/2addr p0, p1

    return p0
.end method

.method static compareColorRGB([I[I)I
    .locals 3

    const/4 v0, 0x0

    .line 33
    aget v1, p0, v0

    aget v0, p1, v0

    sub-int/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x1

    aget v2, p0, v1

    aget v1, p1, v1

    sub-int/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x2

    .line 34
    aget p0, p0, v1

    aget p1, p1, v1

    sub-int/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method static pickBgColor([I)I
    .locals 9

    const/4 v0, 0x4

    new-array v1, v0, [I

    new-array v0, v0, [I

    .line 49
    fill-array-data v0, :array_0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 60
    :goto_0
    array-length v4, p0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-ge v3, v4, :cond_0

    .line 61
    aget v4, p0, v3

    .line 63
    invoke-static {v1, v2, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToInt4Color([III)V

    .line 65
    aget v4, v0, v2

    aget v8, v1, v2

    add-int/2addr v4, v8

    aput v4, v0, v2

    .line 66
    aget v4, v0, v7

    aget v8, v1, v7

    add-int/2addr v4, v8

    aput v4, v0, v7

    .line 67
    aget v4, v0, v6

    aget v7, v1, v6

    add-int/2addr v4, v7

    aput v4, v0, v6

    .line 68
    aget v4, v0, v5

    aget v6, v1, v5

    add-int/2addr v4, v6

    aput v4, v0, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 72
    :cond_0
    aget v3, v0, v2

    array-length v4, p0

    div-int/2addr v3, v4

    aput v3, v0, v2

    .line 73
    aget v3, v0, v7

    array-length v4, p0

    div-int/2addr v3, v4

    aput v3, v0, v7

    .line 74
    aget v3, v0, v6

    array-length v4, p0

    div-int/2addr v3, v4

    aput v3, v0, v6

    .line 75
    aget v3, v0, v5

    array-length v4, p0

    div-int/2addr v3, v4

    aput v3, v0, v5

    const v3, -0xff0100

    const v4, 0xf423f

    const/4 v5, 0x0

    .line 82
    :goto_1
    array-length v6, p0

    if-ge v5, v6, :cond_2

    .line 83
    aget v6, p0, v5

    .line 84
    invoke-static {v1, v2, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToInt4Color([III)V

    .line 85
    invoke-static {v1, v0}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->compareColorRGB([I[I)I

    move-result v7

    if-ge v7, v4, :cond_1

    move v3, v6

    move v4, v7

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    return v3

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public static processBitmapColorKey(Landroid/graphics/Bitmap;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)Landroid/graphics/Bitmap;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;",
            "Lcom/daaw/avee/Common/Ref<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/avee/Common/Ref<",
            "[I>;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    if-nez v10, :cond_0

    return-object v9

    .line 121
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int v13, v0, v1

    .line 123
    iget-object v0, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v0, [I

    array-length v0, v0

    if-ge v0, v13, :cond_2

    .line 127
    :cond_1
    :try_start_0
    new-array v0, v13, [I

    iput-object v0, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 134
    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v14, 0x1

    if-ne v0, v1, :cond_6

    .line 136
    iget-object v0, v11, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    iget-object v0, v11, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    .line 137
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-ne v0, v1, :cond_3

    iget-object v0, v11, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    .line 138
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 140
    :cond_3
    iget-object v0, v11, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_4

    iget-object v0, v11, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 143
    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v11, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    .line 145
    :cond_5
    iget-object v0, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [I

    const/4 v3, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    goto :goto_1

    .line 151
    :cond_6
    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v9, v0, v14}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v11, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 153
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 157
    :goto_0
    :try_start_2
    iget-object v0, v11, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/graphics/Bitmap;

    iget-object v0, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [I

    const/4 v3, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 159
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 164
    :goto_1
    iget v0, v10, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->colorKey:I

    const/4 v1, 0x4

    new-array v2, v1, [F

    new-array v3, v1, [F

    new-array v4, v1, [I

    new-array v5, v1, [I

    new-array v6, v1, [I

    .line 176
    iget-boolean v7, v10, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->autoDetect:Z

    const/4 v1, 0x0

    if-eqz v7, :cond_7

    .line 178
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 179
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    const/16 v8, 0x8

    new-array v8, v8, [I

    .line 183
    iget-object v15, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v15, [I

    invoke-static {v1, v1, v0}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->XYtoI(III)I

    move-result v19

    aget v15, v15, v19

    aput v15, v8, v1

    .line 184
    iget-object v15, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v15, [I

    add-int/lit8 v14, v0, -0x1

    invoke-static {v14, v1, v0}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->XYtoI(III)I

    move-result v20

    aget v15, v15, v20

    const/16 v19, 0x1

    aput v15, v8, v19

    .line 185
    iget-object v15, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v15, [I

    add-int/lit8 v1, v7, -0x1

    invoke-static {v14, v1, v0}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->XYtoI(III)I

    move-result v21

    aget v15, v15, v21

    const/16 v18, 0x2

    aput v15, v8, v18

    .line 186
    iget-object v15, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v15, [I

    const/4 v9, 0x0

    invoke-static {v9, v1, v0}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->XYtoI(III)I

    move-result v20

    aget v15, v15, v20

    const/16 v17, 0x3

    aput v15, v8, v17

    .line 188
    iget-object v15, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v15, [I

    div-int/lit8 v11, v0, 0x2

    invoke-static {v11, v9, v0}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->XYtoI(III)I

    move-result v21

    aget v9, v15, v21

    const/4 v15, 0x4

    aput v9, v8, v15

    const/4 v9, 0x5

    .line 189
    iget-object v15, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v15, [I

    const/16 v16, 0x2

    div-int/lit8 v7, v7, 0x2

    invoke-static {v14, v7, v0}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->XYtoI(III)I

    move-result v14

    aget v14, v15, v14

    aput v14, v8, v9

    const/4 v9, 0x6

    .line 190
    iget-object v14, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v14, [I

    invoke-static {v11, v1, v0}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->XYtoI(III)I

    move-result v1

    aget v1, v14, v1

    aput v1, v8, v9

    const/4 v1, 0x7

    .line 191
    iget-object v9, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v9, [I

    const/4 v11, 0x0

    invoke-static {v11, v7, v0}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->XYtoI(III)I

    move-result v0

    aget v0, v9, v0

    aput v0, v8, v1

    .line 193
    invoke-static {v8}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->pickBgColor([I)I

    move-result v0

    goto :goto_2

    :cond_7
    const/4 v11, 0x0

    .line 196
    :goto_2
    invoke-static {v2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa1([FI)V

    .line 197
    invoke-static {v4, v11, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToInt4Color([III)V

    .line 199
    aget v0, v4, v11

    rsub-int v0, v0, 0x80

    aput v0, v5, v11

    const/4 v1, 0x1

    .line 200
    aget v0, v4, v1

    rsub-int v0, v0, 0x80

    aput v0, v5, v1

    const/4 v0, 0x2

    .line 201
    aget v1, v4, v0

    rsub-int v1, v1, 0x80

    aput v1, v5, v0

    const/4 v0, 0x3

    .line 202
    aget v1, v4, v0

    const/16 v4, 0xff

    rsub-int v1, v1, 0xff

    aput v1, v5, v0

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v13, :cond_10

    .line 212
    iget-object v0, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v0, [I

    aget v0, v0, v9

    const/4 v1, 0x0

    .line 217
    invoke-static {v6, v1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToInt4Color([III)V

    .line 218
    invoke-static {v3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa1([FI)V

    .line 225
    aget v0, v3, v1

    aget v7, v2, v1

    sub-float/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40a00000    # 5.0f

    mul-float v0, v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const/4 v7, 0x1

    .line 226
    aget v8, v3, v7

    aget v11, v2, v7

    sub-float/2addr v8, v11

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v7

    mul-float v7, v7, v1

    invoke-static {v7, v1}, Ljava/lang/Math;->min(FF)F

    const/4 v7, 0x2

    .line 227
    aget v8, v3, v7

    aget v11, v2, v7

    sub-float/2addr v8, v11

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v7

    const/high16 v8, 0x40000000    # 2.0f

    mul-float v7, v7, v8

    invoke-static {v7, v1}, Ljava/lang/Math;->min(FF)F

    move-result v7

    .line 235
    invoke-static {v7, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v7, 0x437f0000    # 255.0f

    mul-float v0, v0, v7

    float-to-int v0, v0

    int-to-float v0, v0

    div-float/2addr v0, v7

    mul-float v0, v0, v1

    .line 243
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    sub-float v11, v1, v0

    float-to-double v14, v0

    .line 253
    iget v0, v10, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->transparencyStrength:F

    mul-float v0, v0, v8

    move-object/from16 v16, v5

    float-to-double v4, v0

    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v0, v4

    sub-float v0, v1, v0

    float-to-double v4, v0

    .line 262
    iget v0, v10, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->opacityStrength:F

    mul-float v0, v0, v8

    float-to-double v14, v0

    invoke-static {v4, v5, v14, v15}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v0, v4

    sub-float/2addr v1, v0

    const/4 v0, 0x0

    .line 269
    aget v4, v6, v0

    aget v5, v16, v0

    int-to-float v5, v5

    mul-float v5, v5, v11

    float-to-int v5, v5

    add-int/2addr v4, v5

    aput v4, v6, v0

    const/4 v4, 0x1

    .line 270
    aget v0, v6, v4

    aget v5, v16, v4

    int-to-float v5, v5

    mul-float v5, v5, v11

    float-to-int v5, v5

    add-int/2addr v0, v5

    aput v0, v6, v4

    const/4 v0, 0x2

    .line 271
    aget v4, v6, v0

    aget v5, v16, v0

    int-to-float v5, v5

    mul-float v5, v5, v11

    float-to-int v5, v5

    add-int/2addr v4, v5

    aput v4, v6, v0

    mul-float v7, v7, v1

    float-to-int v0, v7

    const/4 v4, 0x3

    aput v0, v6, v4

    const/4 v0, 0x0

    .line 276
    aget v4, v6, v0

    int-to-float v4, v4

    mul-float v4, v4, v1

    float-to-int v4, v4

    aput v4, v6, v0

    const/4 v4, 0x1

    .line 277
    aget v5, v6, v4

    int-to-float v5, v5

    mul-float v5, v5, v1

    float-to-int v5, v5

    aput v5, v6, v4

    const/4 v5, 0x2

    .line 278
    aget v7, v6, v5

    int-to-float v7, v7

    mul-float v7, v7, v1

    float-to-int v1, v7

    aput v1, v6, v5

    .line 289
    aget v1, v6, v0

    if-gez v1, :cond_8

    aput v0, v6, v0

    .line 290
    :cond_8
    aget v1, v6, v4

    if-gez v1, :cond_9

    aput v0, v6, v4

    .line 291
    :cond_9
    aget v1, v6, v5

    if-gez v1, :cond_a

    aput v0, v6, v5

    :cond_a
    const/4 v1, 0x3

    .line 292
    aget v4, v6, v1

    if-gez v4, :cond_b

    aput v0, v6, v1

    .line 293
    :cond_b
    aget v1, v6, v0

    const/16 v4, 0xff

    if-le v1, v4, :cond_c

    aput v4, v6, v0

    :cond_c
    const/4 v1, 0x1

    .line 294
    aget v5, v6, v1

    if-le v5, v4, :cond_d

    aput v4, v6, v1

    :cond_d
    const/4 v5, 0x2

    .line 295
    aget v7, v6, v5

    if-le v7, v4, :cond_e

    aput v4, v6, v5

    :cond_e
    const/4 v7, 0x3

    .line 296
    aget v8, v6, v7

    if-le v8, v4, :cond_f

    aput v4, v6, v7

    .line 308
    :cond_f
    invoke-static {v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->Int4ColorToIntColor([I)I

    move-result v8

    .line 311
    iget-object v11, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v11, [I

    aput v8, v11, v9

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v5, v16

    goto/16 :goto_3

    :cond_10
    move-object/from16 v8, p2

    .line 357
    iget-object v0, v8, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Landroid/graphics/Bitmap;

    iget-object v0, v12, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, [I

    const/4 v11, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v16

    invoke-virtual/range {v9 .. v16}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 359
    iget-object v0, v8, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0

    :catch_2
    return-object p0
.end method
