.class public Lcom/daaw/wa1;
.super Lcom/daaw/xa1;
.source ""


# instance fields
.field public h:F

.field public i:Z

.field public j:Z

.field public k:Lcom/daaw/he0$a;

.field public l:Lcom/daaw/he0$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/xa1;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/daaw/wa1;->h:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/wa1;->i:Z

    iput-boolean v0, p0, Lcom/daaw/wa1;->j:Z

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

    iput v0, p0, Lcom/daaw/wa1;->h:F

    const-string v0, "barWidthAffectedByShape"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/wa1;->j:Z

    const-string v0, "mirror"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/wa1;->i:Z

    return-void
.end method

.method public m(Lcom/daaw/de0;[Lcom/daaw/he0$a;FFIF)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    array-length v2, v1

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v3, v3, p3

    add-int/lit8 v4, v2, 0x1

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v3, v3

    iget v4, v0, Lcom/daaw/wa1;->h:F

    mul-float v3, v3, v4

    new-instance v4, Lcom/daaw/bs1;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v5}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v6, Lcom/daaw/bs1;

    invoke-direct {v6, v5, v5}, Lcom/daaw/bs1;-><init>(FF)V

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->h()Z

    move-result v5

    if-nez v5, :cond_0

    new-instance v13, Lcom/daaw/w31;

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v7

    invoke-interface {v7}, Lcom/daaw/de0$a;->e()Lcom/daaw/z6;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x2

    move-object v7, v13

    move/from16 v8, p5

    invoke-direct/range {v7 .. v12}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;I)V

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    :goto_0
    const/4 v7, 0x0

    :goto_1
    array-length v8, v1

    if-ge v7, v8, :cond_7

    aget-object v8, v1, v7

    iget v9, v8, Lcom/daaw/he0$a;->a:I

    if-gez v9, :cond_1

    move-object v9, v8

    goto :goto_2

    :cond_1
    aget-object v9, v1, v9

    :goto_2
    iput-object v9, v0, Lcom/daaw/wa1;->k:Lcom/daaw/he0$a;

    iget v9, v8, Lcom/daaw/he0$a;->b:I

    if-gez v9, :cond_2

    move-object v9, v8

    goto :goto_3

    :cond_2
    aget-object v9, v1, v9

    :goto_3
    iput-object v9, v0, Lcom/daaw/wa1;->l:Lcom/daaw/he0$a;

    move/from16 v9, p6

    invoke-virtual {v0, v7, v2, v9}, Lcom/daaw/xa1;->q(IIF)I

    move-result v25

    iget v10, v8, Lcom/daaw/he0$a;->e:F

    iget v11, v8, Lcom/daaw/he0$a;->f:F

    iget v12, v8, Lcom/daaw/he0$a;->d:F

    const/high16 v14, -0x40000000    # -2.0f

    mul-float v12, v12, v14

    mul-float v12, v12, p4

    invoke-static {v12}, Lcom/daaw/br1;->d(F)F

    move-result v14

    iget v15, v0, Lcom/daaw/xa1;->f:F

    mul-float v12, v12, v15

    iget-boolean v15, v0, Lcom/daaw/wa1;->i:Z

    if-eqz v15, :cond_3

    iget v15, v8, Lcom/daaw/he0$a;->g:F

    mul-float v15, v15, v12

    sub-float/2addr v10, v15

    iget v15, v8, Lcom/daaw/he0$a;->h:F

    mul-float v15, v15, v12

    sub-float/2addr v11, v15

    move/from16 v31, v2

    float-to-double v1, v12

    const-wide/high16 v15, 0x4000000000000000L    # 2.0

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v15

    double-to-float v12, v1

    goto :goto_4

    :cond_3
    move/from16 v31, v2

    :goto_4
    iget-boolean v1, v0, Lcom/daaw/wa1;->j:Z

    if-eqz v1, :cond_4

    iget v1, v8, Lcom/daaw/he0$a;->g:F

    iget-object v2, v0, Lcom/daaw/wa1;->k:Lcom/daaw/he0$a;

    iget v15, v2, Lcom/daaw/he0$a;->g:F

    add-float/2addr v15, v1

    iput v15, v4, Lcom/daaw/bs1;->a:F

    iget v15, v8, Lcom/daaw/he0$a;->h:F

    iget v2, v2, Lcom/daaw/he0$a;->h:F

    add-float/2addr v2, v15

    iput v2, v4, Lcom/daaw/bs1;->b:F

    iget-object v2, v0, Lcom/daaw/wa1;->l:Lcom/daaw/he0$a;

    iget v9, v2, Lcom/daaw/he0$a;->g:F

    add-float/2addr v1, v9

    iput v1, v6, Lcom/daaw/bs1;->a:F

    iget v1, v2, Lcom/daaw/he0$a;->h:F

    add-float/2addr v15, v1

    iput v15, v6, Lcom/daaw/bs1;->b:F

    invoke-virtual {v6}, Lcom/daaw/bs1;->p()Lcom/daaw/bs1;

    invoke-virtual {v4}, Lcom/daaw/bs1;->p()Lcom/daaw/bs1;

    iget v1, v8, Lcom/daaw/he0$a;->g:F

    iget v2, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v1, v2}, Lcom/daaw/bs1;->b(FF)F

    move-result v1

    mul-float v1, v1, v3

    add-float/2addr v1, v10

    iget v2, v8, Lcom/daaw/he0$a;->g:F

    iget v9, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v2, v9}, Lcom/daaw/bs1;->c(FF)F

    move-result v2

    mul-float v2, v2, v3

    add-float/2addr v2, v11

    iget v9, v8, Lcom/daaw/he0$a;->g:F

    iget v15, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v9, v15}, Lcom/daaw/bs1;->d(FF)F

    move-result v9

    mul-float v9, v9, v3

    add-float/2addr v9, v10

    iget v10, v8, Lcom/daaw/he0$a;->g:F

    iget v15, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v10, v15}, Lcom/daaw/bs1;->e(FF)F

    move-result v10

    mul-float v10, v10, v3

    add-float/2addr v10, v11

    iget v11, v4, Lcom/daaw/bs1;->a:F

    mul-float v11, v11, v12

    add-float/2addr v11, v1

    iget v15, v4, Lcom/daaw/bs1;->b:F

    mul-float v15, v15, v12

    add-float/2addr v15, v2

    move/from16 p3, v1

    iget v1, v6, Lcom/daaw/bs1;->a:F

    mul-float v1, v1, v12

    add-float/2addr v1, v9

    move/from16 v16, v1

    iget v1, v6, Lcom/daaw/bs1;->b:F

    mul-float v1, v1, v12

    add-float/2addr v1, v10

    move/from16 v19, v1

    move/from16 v17, v15

    move/from16 v18, v16

    move/from16 v1, p3

    move/from16 v16, v11

    goto :goto_5

    :cond_4
    iget v1, v8, Lcom/daaw/he0$a;->g:F

    iget v2, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v1, v2}, Lcom/daaw/bs1;->b(FF)F

    move-result v1

    mul-float v1, v1, v3

    add-float/2addr v1, v10

    iget v2, v8, Lcom/daaw/he0$a;->g:F

    iget v9, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v2, v9}, Lcom/daaw/bs1;->c(FF)F

    move-result v2

    mul-float v2, v2, v3

    add-float/2addr v2, v11

    iget v9, v8, Lcom/daaw/he0$a;->g:F

    iget v15, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v9, v15}, Lcom/daaw/bs1;->d(FF)F

    move-result v9

    mul-float v9, v9, v3

    add-float/2addr v9, v10

    iget v10, v8, Lcom/daaw/he0$a;->g:F

    iget v15, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v10, v15}, Lcom/daaw/bs1;->e(FF)F

    move-result v10

    mul-float v10, v10, v3

    add-float/2addr v10, v11

    iget v11, v8, Lcom/daaw/he0$a;->g:F

    mul-float v15, v11, v12

    add-float/2addr v15, v1

    move/from16 p3, v1

    iget v1, v8, Lcom/daaw/he0$a;->h:F

    mul-float v16, v1, v12

    add-float v16, v16, v2

    mul-float v11, v11, v12

    add-float/2addr v11, v9

    mul-float v1, v1, v12

    add-float/2addr v1, v10

    move/from16 v19, v1

    move/from16 v18, v11

    move/from16 v17, v16

    move/from16 v1, p3

    move/from16 v16, v15

    :goto_5
    iget-boolean v11, v0, Lcom/daaw/xa1;->d:Z

    if-eqz v11, :cond_5

    iget v1, v8, Lcom/daaw/he0$a;->g:F

    mul-float v2, v1, v14

    iget v9, v0, Lcom/daaw/xa1;->e:F

    mul-float v2, v2, v9

    add-float v2, v16, v2

    iget v8, v8, Lcom/daaw/he0$a;->h:F

    mul-float v10, v8, v14

    mul-float v10, v10, v9

    add-float v10, v17, v10

    mul-float v1, v1, v14

    mul-float v1, v1, v9

    add-float v1, v18, v1

    mul-float v8, v8, v14

    mul-float v8, v8, v9

    add-float v8, v19, v8

    move/from16 v22, v1

    move/from16 v20, v2

    move/from16 v23, v8

    move/from16 v21, v10

    goto :goto_6

    :cond_5
    move/from16 v20, v1

    move/from16 v21, v2

    move/from16 v22, v9

    move/from16 v23, v10

    :goto_6
    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->j()Lcom/daaw/sc0;

    move-result-object v14

    const/16 v24, 0x0

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v26

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v27

    if-eqz v5, :cond_6

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/de0$a;->c()Lcom/daaw/z6;

    move-result-object v28

    const/16 v30, 0x0

    move-object/from16 v15, p1

    move/from16 v29, p5

    invoke-interface/range {v14 .. v30}, Lcom/daaw/sc0;->b(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;ILcom/daaw/qr1;)V

    goto :goto_7

    :cond_6
    move-object/from16 v15, p1

    move-object/from16 v28, v13

    invoke-interface/range {v14 .. v28}, Lcom/daaw/sc0;->d(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    :goto_7
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p2

    move/from16 v2, v31

    goto/16 :goto_1

    :cond_7
    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 6

    invoke-super {p0, p1}, Lcom/daaw/xa1;->o(Lcom/daaw/un;)V

    iget v2, p0, Lcom/daaw/wa1;->h:F

    const-string v1, "barWidth"

    const-string v3, "misc"

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget-boolean v0, p0, Lcom/daaw/wa1;->j:Z

    const-string v1, "barWidthAffectedByShape"

    const-string v2, "b"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/wa1;->i:Z

    const-string v1, "mirror"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method
