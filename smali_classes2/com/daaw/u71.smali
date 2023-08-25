.class public Lcom/daaw/u71;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Landroid/graphics/RectF;

.field public static final c:Landroid/graphics/Matrix;

.field public static final d:Landroid/graphics/Matrix;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "[\\s,]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/daaw/u71;->a:Ljava/util/regex/Pattern;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    sput-object v0, Lcom/daaw/u71;->b:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Lcom/daaw/u71;->c:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Lcom/daaw/u71;->d:Landroid/graphics/Matrix;

    return-void
.end method

.method public static a(FFFF)F
    .locals 2

    float-to-double v0, p0

    float-to-double p0, p1

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    float-to-double v0, p2

    float-to-double p2, p3

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p2

    sub-double/2addr p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p0

    double-to-float p0, p0

    const/high16 p1, 0x43b40000    # 360.0f

    rem-float/2addr p0, p1

    return p0
.end method

.method public static b(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 24

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Lcom/daaw/uv0;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/daaw/uv0;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2}, Lcom/daaw/uv0;->i()V

    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_0
    iget v7, v2, Lcom/daaw/uv0;->d:I

    if-ge v7, v1, :cond_c

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x2b

    const/16 v9, 0x6d

    if-eq v7, v8, :cond_0

    const/16 v8, 0x2d

    if-eq v7, v8, :cond_0

    packed-switch v7, :pswitch_data_0

    goto :goto_1

    :cond_0
    :pswitch_0
    if-eq v4, v9, :cond_3

    const/16 v8, 0x4d

    if-ne v4, v8, :cond_1

    goto :goto_3

    :cond_1
    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v8

    const-string v10, "lhvcsqta"

    invoke-virtual {v10, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-ltz v8, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {v2}, Lcom/daaw/uv0;->a()V

    move v4, v7

    :goto_2
    move/from16 v18, v4

    goto :goto_4

    :cond_3
    :goto_3
    add-int/lit8 v7, v4, -0x1

    int-to-char v7, v7

    move/from16 v18, v4

    move v4, v7

    :goto_4
    const/4 v11, 0x1

    sparse-switch v4, :sswitch_data_0

    move/from16 v23, v12

    move v3, v13

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Invalid path command: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/daaw/uv0;->a()V

    :goto_5
    const/4 v11, 0x0

    goto/16 :goto_7

    :sswitch_0
    invoke-virtual {v14}, Landroid/graphics/Path;->close()V

    invoke-virtual {v14, v13, v12}, Landroid/graphics/Path;->moveTo(FF)V

    move v6, v12

    move/from16 v17, v6

    move v5, v13

    move/from16 v16, v5

    goto/16 :goto_7

    :sswitch_1
    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v7

    const/16 v8, 0x76

    if-ne v4, v8, :cond_4

    invoke-virtual {v14, v15, v7}, Landroid/graphics/Path;->rLineTo(FF)V

    add-float/2addr v6, v7

    goto :goto_5

    :cond_4
    invoke-virtual {v14, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    move v6, v7

    goto :goto_5

    :sswitch_2
    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v7

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v8

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v9

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v10

    invoke-static {v4}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v4

    if-eqz v4, :cond_5

    add-float/2addr v7, v5

    add-float/2addr v9, v5

    add-float/2addr v8, v6

    add-float/2addr v10, v6

    :cond_5
    move/from16 v19, v7

    move/from16 v20, v8

    move/from16 v21, v9

    move/from16 v22, v10

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v5, v5, v4

    sub-float v5, v5, v16

    mul-float v6, v6, v4

    sub-float v6, v6, v17

    move-object v4, v14

    move/from16 v7, v19

    move/from16 v8, v20

    move/from16 v9, v21

    move/from16 v10, v22

    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move/from16 v16, v19

    move/from16 v17, v20

    move/from16 v5, v21

    move/from16 v6, v22

    goto/16 :goto_7

    :sswitch_3
    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v7

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v8

    if-ne v4, v9, :cond_6

    add-float/2addr v13, v7

    add-float/2addr v12, v8

    invoke-virtual {v14, v7, v8}, Landroid/graphics/Path;->rMoveTo(FF)V

    goto :goto_6

    :cond_6
    invoke-virtual {v14, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    move v5, v7

    move v13, v5

    move v6, v8

    move v12, v6

    goto :goto_5

    :sswitch_4
    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v7

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v8

    const/16 v9, 0x6c

    if-ne v4, v9, :cond_7

    invoke-virtual {v14, v7, v8}, Landroid/graphics/Path;->rLineTo(FF)V

    :goto_6
    add-float/2addr v5, v7

    add-float/2addr v6, v8

    goto/16 :goto_5

    :cond_7
    invoke-virtual {v14, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    move v5, v7

    move v6, v8

    goto/16 :goto_5

    :sswitch_5
    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v7

    const/16 v8, 0x68

    if-ne v4, v8, :cond_8

    invoke-virtual {v14, v7, v15}, Landroid/graphics/Path;->rLineTo(FF)V

    add-float/2addr v5, v7

    goto/16 :goto_5

    :cond_8
    invoke-virtual {v14, v7, v6}, Landroid/graphics/Path;->lineTo(FF)V

    move v5, v7

    goto/16 :goto_5

    :sswitch_6
    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v7

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v8

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v9

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v10

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v16

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v17

    const/16 v3, 0x63

    if-ne v4, v3, :cond_9

    add-float/2addr v7, v5

    add-float/2addr v9, v5

    add-float v16, v16, v5

    add-float/2addr v8, v6

    add-float/2addr v10, v6

    add-float v17, v17, v6

    :cond_9
    move v5, v7

    move v6, v8

    move v3, v9

    move/from16 v20, v10

    move-object v4, v14

    move v7, v3

    move/from16 v8, v20

    move/from16 v9, v16

    move/from16 v10, v17

    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move/from16 v5, v16

    move/from16 v6, v17

    move/from16 v17, v20

    move/from16 v16, v3

    goto :goto_7

    :sswitch_7
    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v9

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v10

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v11

    invoke-virtual {v2}, Lcom/daaw/uv0;->c()I

    move-result v3

    invoke-virtual {v2}, Lcom/daaw/uv0;->c()I

    move-result v20

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v7

    invoke-virtual {v2}, Lcom/daaw/uv0;->d()F

    move-result v8

    const/16 v15, 0x61

    if-ne v4, v15, :cond_a

    add-float/2addr v7, v5

    add-float/2addr v8, v6

    :cond_a
    move v15, v7

    move/from16 v22, v8

    move-object v4, v14

    move v7, v15

    move/from16 v8, v22

    move/from16 v23, v12

    move v12, v3

    move v3, v13

    move/from16 v13, v20

    invoke-static/range {v4 .. v13}, Lcom/daaw/u71;->c(Landroid/graphics/Path;FFFFFFFII)V

    move v13, v3

    move v5, v15

    move/from16 v6, v22

    move/from16 v12, v23

    goto/16 :goto_5

    :goto_7
    if-nez v11, :cond_b

    move/from16 v16, v5

    move/from16 v17, v6

    :cond_b
    invoke-virtual {v2}, Lcom/daaw/uv0;->i()V

    move/from16 v4, v18

    const/4 v3, 0x0

    const/4 v15, 0x0

    goto/16 :goto_0

    :cond_c
    return-object v14

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_7
        0x43 -> :sswitch_6
        0x48 -> :sswitch_5
        0x4c -> :sswitch_4
        0x4d -> :sswitch_3
        0x51 -> :sswitch_2
        0x53 -> :sswitch_2
        0x54 -> :sswitch_4
        0x56 -> :sswitch_1
        0x5a -> :sswitch_0
        0x61 -> :sswitch_7
        0x63 -> :sswitch_6
        0x68 -> :sswitch_5
        0x6c -> :sswitch_4
        0x6d -> :sswitch_3
        0x71 -> :sswitch_2
        0x73 -> :sswitch_2
        0x74 -> :sswitch_4
        0x76 -> :sswitch_1
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

.method public static c(Landroid/graphics/Path;FFFFFFFII)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move/from16 v3, p7

    move/from16 v4, p9

    const/4 v5, 0x0

    cmpl-float v6, p5, v5

    if-eqz v6, :cond_7

    cmpl-float v6, p6, v5

    if-nez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    cmpl-float v6, v1, p1

    if-nez v6, :cond_1

    cmpl-float v6, v2, p2

    if-nez v6, :cond_1

    return-void

    :cond_1
    invoke-static/range {p5 .. p5}, Ljava/lang/Math;->abs(F)F

    move-result v6

    invoke-static/range {p6 .. p6}, Ljava/lang/Math;->abs(F)F

    move-result v7

    const v8, 0x40490fdb    # (float)Math.PI

    mul-float v8, v8, v3

    const/high16 v9, 0x43340000    # 180.0f

    div-float/2addr v8, v9

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    double-to-float v10, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    double-to-float v8, v8

    sub-float v9, p1, v1

    const/high16 v11, 0x40000000    # 2.0f

    div-float/2addr v9, v11

    sub-float v12, p2, v2

    div-float/2addr v12, v11

    mul-float v13, v8, v9

    mul-float v14, v10, v12

    add-float/2addr v13, v14

    neg-float v14, v10

    mul-float v14, v14, v9

    mul-float v12, v12, v8

    add-float/2addr v14, v12

    mul-float v9, v13, v13

    mul-float v12, v14, v14

    mul-float v15, v6, v6

    mul-float v16, v7, v7

    div-float v17, v9, v15

    div-float v18, v12, v16

    add-float v17, v17, v18

    const v18, 0x3f8020c5    # 1.001f

    mul-float v5, v17, v18

    const/high16 v11, 0x3f800000    # 1.0f

    cmpl-float v17, v5, v11

    move/from16 p6, v12

    if-lez v17, :cond_2

    float-to-double v11, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v11

    double-to-float v5, v11

    mul-float v6, v6, v5

    mul-float v7, v7, v5

    mul-float v15, v6, v6

    mul-float v16, v7, v7

    :cond_2
    mul-float v5, v15, v16

    mul-float v15, v15, p6

    sub-float/2addr v5, v15

    mul-float v16, v16, v9

    sub-float v5, v5, v16

    add-float v15, v15, v16

    div-float/2addr v5, v15

    float-to-double v11, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v11

    double-to-float v5, v11

    move/from16 v9, p8

    if-ne v9, v4, :cond_3

    const/4 v9, -0x1

    goto :goto_0

    :cond_3
    const/4 v9, 0x1

    :goto_0
    int-to-float v9, v9

    mul-float v5, v5, v9

    mul-float v9, v5, v6

    mul-float v9, v9, v14

    div-float/2addr v9, v7

    neg-float v5, v5

    mul-float v5, v5, v7

    mul-float v5, v5, v13

    div-float/2addr v5, v6

    mul-float v11, v8, v9

    mul-float v12, v10, v5

    sub-float/2addr v11, v12

    add-float v1, p1, v1

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v1, v12

    add-float/2addr v11, v1

    mul-float v10, v10, v9

    mul-float v8, v8, v5

    add-float/2addr v10, v8

    add-float v1, p2, v2

    div-float/2addr v1, v12

    add-float/2addr v10, v1

    sub-float v1, v13, v9

    div-float/2addr v1, v6

    sub-float v2, v14, v5

    div-float/2addr v2, v7

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    invoke-static {v8, v12, v1, v2}, Lcom/daaw/u71;->a(FFFF)F

    move-result v8

    neg-float v13, v13

    sub-float/2addr v13, v9

    div-float/2addr v13, v6

    neg-float v9, v14

    sub-float/2addr v9, v5

    div-float/2addr v9, v7

    invoke-static {v1, v2, v13, v9}, Lcom/daaw/u71;->a(FFFF)F

    move-result v1

    const/high16 v2, 0x43b40000    # 360.0f

    if-nez v4, :cond_4

    cmpl-float v5, v1, v12

    if-lez v5, :cond_4

    sub-float/2addr v1, v2

    goto :goto_1

    :cond_4
    if-eqz v4, :cond_5

    cmpg-float v4, v1, v12

    if-gez v4, :cond_5

    add-float/2addr v1, v2

    :cond_5
    :goto_1
    rem-float v2, v3, v2

    cmpl-float v2, v2, v12

    if-nez v2, :cond_6

    sget-object v2, Lcom/daaw/u71;->b:Landroid/graphics/RectF;

    sub-float v3, v11, v6

    sub-float v4, v10, v7

    add-float/2addr v11, v6

    add-float/2addr v10, v7

    invoke-virtual {v2, v3, v4, v11, v10}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v0, v2, v8, v1}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    goto :goto_2

    :cond_6
    sget-object v2, Lcom/daaw/u71;->b:Landroid/graphics/RectF;

    neg-float v4, v6

    neg-float v5, v7

    invoke-virtual {v2, v4, v5, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    sget-object v4, Lcom/daaw/u71;->c:Landroid/graphics/Matrix;

    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    invoke-virtual {v4, v3}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {v4, v11, v10}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    sget-object v3, Lcom/daaw/u71;->d:Landroid/graphics/Matrix;

    invoke-virtual {v4, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    invoke-virtual {v0, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    invoke-virtual {v0, v2, v8, v1}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    invoke-virtual {v0, v4}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    :goto_2
    return-void

    :cond_7
    :goto_3
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method

.method public static d(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 0

    invoke-static {p0}, Lcom/daaw/u71;->b(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object p0

    return-object p0
.end method
