.class public Lcom/daaw/bb1;
.super Lcom/daaw/xa1;
.source ""


# instance fields
.field public h:F

.field public i:Z

.field public j:Landroid/graphics/PointF;

.field public k:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/xa1;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/daaw/bb1;->h:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/bb1;->i:Z

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/bb1;->j:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/xa1;->a(Lcom/daaw/un;)V

    const-string v0, "barWidth"

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/bb1;->h:F

    const-string v0, "mirror"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/bb1;->i:Z

    return-void
.end method

.method public m(Lcom/daaw/de0;[Lcom/daaw/he0$a;FFIF)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    array-length v2, v1

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float v3, v3, p3

    add-int/lit8 v4, v2, 0x1

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v3, v3

    iget v4, v0, Lcom/daaw/bb1;->h:F

    mul-float v3, v3, v4

    const/4 v4, 0x0

    :goto_0
    array-length v5, v1

    if-ge v4, v5, :cond_6

    aget-object v5, v1, v4

    iget v6, v5, Lcom/daaw/he0$a;->a:I

    if-gez v6, :cond_0

    move/from16 v7, p6

    goto/16 :goto_4

    :cond_0
    aget-object v6, v1, v6

    move/from16 v7, p6

    invoke-virtual {v0, v4, v2, v7}, Lcom/daaw/xa1;->q(IIF)I

    move-result v19

    iget-object v8, v0, Lcom/daaw/bb1;->j:Landroid/graphics/PointF;

    iget v9, v6, Lcom/daaw/he0$a;->e:F

    iput v9, v8, Landroid/graphics/PointF;->x:F

    iget v9, v6, Lcom/daaw/he0$a;->f:F

    iput v9, v8, Landroid/graphics/PointF;->y:F

    iget-object v9, v0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    iget v10, v5, Lcom/daaw/he0$a;->e:F

    iput v10, v9, Landroid/graphics/PointF;->x:F

    iget v10, v5, Lcom/daaw/he0$a;->f:F

    iput v10, v9, Landroid/graphics/PointF;->y:F

    iget v10, v6, Lcom/daaw/he0$a;->d:F

    const/high16 v11, -0x40000000    # -2.0f

    mul-float v10, v10, v11

    mul-float v10, v10, p4

    iget v12, v0, Lcom/daaw/xa1;->f:F

    mul-float v10, v10, v12

    iget v13, v5, Lcom/daaw/he0$a;->d:F

    mul-float v13, v13, v11

    mul-float v13, v13, p4

    mul-float v13, v13, v12

    iget-boolean v11, v0, Lcom/daaw/bb1;->i:Z

    if-eqz v11, :cond_1

    iget v11, v8, Landroid/graphics/PointF;->x:F

    iget v12, v6, Lcom/daaw/he0$a;->g:F

    mul-float v12, v12, v10

    sub-float/2addr v11, v12

    iput v11, v8, Landroid/graphics/PointF;->x:F

    iget v11, v8, Landroid/graphics/PointF;->y:F

    iget v6, v6, Lcom/daaw/he0$a;->h:F

    mul-float v6, v6, v10

    sub-float/2addr v11, v6

    iput v11, v8, Landroid/graphics/PointF;->y:F

    float-to-double v10, v10

    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v14

    double-to-float v10, v10

    iget v6, v9, Landroid/graphics/PointF;->x:F

    iget v8, v5, Lcom/daaw/he0$a;->g:F

    mul-float v8, v8, v13

    sub-float/2addr v6, v8

    iput v6, v9, Landroid/graphics/PointF;->x:F

    iget v6, v9, Landroid/graphics/PointF;->y:F

    iget v8, v5, Lcom/daaw/he0$a;->h:F

    mul-float v8, v8, v13

    sub-float/2addr v6, v8

    iput v6, v9, Landroid/graphics/PointF;->y:F

    float-to-double v8, v13

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v14

    double-to-float v13, v8

    :cond_1
    const/4 v6, 0x0

    cmpg-float v8, v10, v6

    if-gez v8, :cond_2

    iget v8, v5, Lcom/daaw/he0$a;->g:F

    iget v9, v5, Lcom/daaw/he0$a;->h:F

    invoke-static {v8, v9}, Lcom/daaw/bs1;->b(FF)F

    move-result v8

    mul-float v8, v8, v3

    iget-object v9, v0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    iget v9, v9, Landroid/graphics/PointF;->x:F

    add-float/2addr v8, v9

    iget v9, v5, Lcom/daaw/he0$a;->g:F

    iget v11, v5, Lcom/daaw/he0$a;->h:F

    invoke-static {v9, v11}, Lcom/daaw/bs1;->c(FF)F

    move-result v9

    mul-float v9, v9, v3

    iget-object v11, v0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    iget v11, v11, Landroid/graphics/PointF;->y:F

    add-float/2addr v9, v11

    iget v11, v5, Lcom/daaw/he0$a;->g:F

    mul-float v11, v11, v10

    add-float/2addr v11, v8

    iget v12, v5, Lcom/daaw/he0$a;->h:F

    mul-float v12, v12, v10

    add-float/2addr v12, v9

    move v10, v11

    move v11, v12

    goto :goto_1

    :cond_2
    iget v8, v5, Lcom/daaw/he0$a;->g:F

    iget v9, v5, Lcom/daaw/he0$a;->h:F

    invoke-static {v8, v9}, Lcom/daaw/bs1;->b(FF)F

    move-result v8

    mul-float v8, v8, v3

    iget-object v9, v0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    iget v9, v9, Landroid/graphics/PointF;->x:F

    add-float/2addr v8, v9

    iget v9, v5, Lcom/daaw/he0$a;->g:F

    iget v11, v5, Lcom/daaw/he0$a;->h:F

    invoke-static {v9, v11}, Lcom/daaw/bs1;->c(FF)F

    move-result v9

    mul-float v9, v9, v3

    iget-object v11, v0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    iget v11, v11, Landroid/graphics/PointF;->y:F

    add-float/2addr v9, v11

    iget v11, v5, Lcom/daaw/he0$a;->g:F

    mul-float v11, v11, v10

    add-float/2addr v11, v8

    iget v12, v5, Lcom/daaw/he0$a;->h:F

    mul-float v12, v12, v10

    add-float v10, v12, v9

    move/from16 v31, v10

    move v10, v8

    move v8, v11

    move v11, v9

    move/from16 v9, v31

    :goto_1
    cmpg-float v6, v13, v6

    if-gez v6, :cond_3

    iget v6, v5, Lcom/daaw/he0$a;->g:F

    iget v12, v5, Lcom/daaw/he0$a;->h:F

    invoke-static {v6, v12}, Lcom/daaw/bs1;->d(FF)F

    move-result v6

    mul-float v6, v6, v3

    iget-object v12, v0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    iget v12, v12, Landroid/graphics/PointF;->x:F

    add-float/2addr v6, v12

    iget v12, v5, Lcom/daaw/he0$a;->g:F

    iget v14, v5, Lcom/daaw/he0$a;->h:F

    invoke-static {v12, v14}, Lcom/daaw/bs1;->e(FF)F

    move-result v12

    mul-float v12, v12, v3

    iget-object v14, v0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    iget v14, v14, Landroid/graphics/PointF;->y:F

    add-float/2addr v12, v14

    iget v14, v5, Lcom/daaw/he0$a;->g:F

    mul-float v14, v14, v13

    add-float/2addr v14, v6

    iget v15, v5, Lcom/daaw/he0$a;->h:F

    mul-float v15, v15, v13

    add-float/2addr v15, v12

    move/from16 v31, v15

    move v15, v12

    move v12, v14

    goto :goto_2

    :cond_3
    iget v6, v5, Lcom/daaw/he0$a;->g:F

    iget v12, v5, Lcom/daaw/he0$a;->h:F

    invoke-static {v6, v12}, Lcom/daaw/bs1;->d(FF)F

    move-result v6

    mul-float v6, v6, v3

    iget-object v12, v0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    iget v12, v12, Landroid/graphics/PointF;->x:F

    add-float/2addr v6, v12

    iget v12, v5, Lcom/daaw/he0$a;->g:F

    iget v14, v5, Lcom/daaw/he0$a;->h:F

    invoke-static {v12, v14}, Lcom/daaw/bs1;->e(FF)F

    move-result v12

    mul-float v12, v12, v3

    iget-object v14, v0, Lcom/daaw/bb1;->k:Landroid/graphics/PointF;

    iget v14, v14, Landroid/graphics/PointF;->y:F

    add-float/2addr v12, v14

    iget v14, v5, Lcom/daaw/he0$a;->g:F

    mul-float v14, v14, v13

    add-float/2addr v14, v6

    iget v15, v5, Lcom/daaw/he0$a;->h:F

    mul-float v15, v15, v13

    add-float/2addr v15, v12

    move/from16 v31, v12

    move v12, v6

    move v6, v14

    :goto_2
    move/from16 v14, v31

    iget-boolean v1, v0, Lcom/daaw/xa1;->d:Z

    if-eqz v1, :cond_4

    invoke-static {v13}, Ljava/lang/Math;->signum(F)F

    move-result v1

    iget v6, v5, Lcom/daaw/he0$a;->g:F

    mul-float v8, v6, v1

    iget v9, v0, Lcom/daaw/xa1;->e:F

    mul-float v8, v8, v9

    add-float/2addr v8, v10

    iget v5, v5, Lcom/daaw/he0$a;->h:F

    mul-float v13, v5, v1

    mul-float v13, v13, v9

    add-float/2addr v13, v11

    mul-float v6, v6, v1

    mul-float v6, v6, v9

    add-float/2addr v6, v12

    mul-float v5, v5, v1

    mul-float v5, v5, v9

    add-float/2addr v5, v14

    move/from16 v17, v5

    move/from16 v16, v6

    move v1, v8

    move v15, v13

    goto :goto_3

    :cond_4
    move/from16 v16, v6

    move v1, v8

    move/from16 v17, v15

    move v15, v9

    :goto_3
    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->h()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->j()Lcom/daaw/sc0;

    move-result-object v8

    const/16 v18, 0x0

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v20

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v21

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v5

    invoke-interface {v5}, Lcom/daaw/de0$a;->c()Lcom/daaw/z6;

    move-result-object v22

    const/16 v24, 0x0

    move-object/from16 v9, p1

    move v13, v14

    move v14, v1

    move/from16 v23, p5

    invoke-interface/range {v8 .. v24}, Lcom/daaw/sc0;->b(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;ILcom/daaw/qr1;)V

    goto :goto_4

    :cond_5
    new-instance v22, Lcom/daaw/w31;

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v5

    invoke-interface {v5}, Lcom/daaw/de0$a;->e()Lcom/daaw/z6;

    move-result-object v27

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x2

    move-object/from16 v25, v22

    move/from16 v26, p5

    invoke-direct/range {v25 .. v30}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;I)V

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->j()Lcom/daaw/sc0;

    move-result-object v8

    const/16 v18, 0x0

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v20

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v21

    move-object/from16 v9, p1

    move v13, v14

    move v14, v1

    invoke-interface/range {v8 .. v22}, Lcom/daaw/sc0;->d(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    :goto_4
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, p2

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 6

    invoke-super {p0, p1}, Lcom/daaw/xa1;->o(Lcom/daaw/un;)V

    iget v2, p0, Lcom/daaw/bb1;->h:F

    const-string v1, "barWidth"

    const-string v3, "misc"

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget-boolean v0, p0, Lcom/daaw/bb1;->i:Z

    const-string v1, "mirror"

    const-string v2, "misc"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method
