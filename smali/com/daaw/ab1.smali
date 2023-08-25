.class public Lcom/daaw/ab1;
.super Lcom/daaw/xa1;
.source ""


# static fields
.field public static m:Lcom/daaw/bs1;

.field public static n:Lcom/daaw/bs1;

.field public static o:Lcom/daaw/bs1;

.field public static p:Lcom/daaw/bs1;


# instance fields
.field public h:F

.field public i:Z

.field public j:Z

.field public k:Lcom/daaw/he0$a;

.field public l:Lcom/daaw/he0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-direct {v0, v1, v2}, Lcom/daaw/bs1;-><init>(FF)V

    sput-object v0, Lcom/daaw/ab1;->m:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v3, v2}, Lcom/daaw/bs1;-><init>(FF)V

    sput-object v0, Lcom/daaw/ab1;->n:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v2}, Lcom/daaw/bs1;-><init>(FF)V

    sput-object v0, Lcom/daaw/ab1;->o:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v3, v2}, Lcom/daaw/bs1;-><init>(FF)V

    sput-object v0, Lcom/daaw/ab1;->p:Lcom/daaw/bs1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/xa1;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/daaw/ab1;->h:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ab1;->i:Z

    iput-boolean v0, p0, Lcom/daaw/ab1;->j:Z

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

    iput v0, p0, Lcom/daaw/ab1;->h:F

    const-string v0, "barWidthAffectedByShape"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/ab1;->j:Z

    const-string v0, "mirror"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/ab1;->i:Z

    return-void
.end method

.method public m(Lcom/daaw/de0;[Lcom/daaw/he0$a;FFIF)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    array-length v2, v1

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v4, p3, v3

    add-int/lit8 v5, v2, 0x1

    int-to-float v5, v5

    div-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    int-to-float v4, v4

    iget v5, v0, Lcom/daaw/ab1;->h:F

    mul-float v4, v4, v5

    new-instance v5, Lcom/daaw/bs1;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v6}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v7, Lcom/daaw/bs1;

    invoke-direct {v7, v6, v6}, Lcom/daaw/bs1;-><init>(FF)V

    const/4 v6, 0x0

    :goto_0
    array-length v8, v1

    if-ge v6, v8, :cond_6

    aget-object v8, v1, v6

    iget v9, v8, Lcom/daaw/he0$a;->a:I

    if-gez v9, :cond_0

    move-object v9, v8

    goto :goto_1

    :cond_0
    aget-object v9, v1, v9

    :goto_1
    iput-object v9, v0, Lcom/daaw/ab1;->k:Lcom/daaw/he0$a;

    iget v9, v8, Lcom/daaw/he0$a;->b:I

    if-gez v9, :cond_1

    move-object v9, v8

    goto :goto_2

    :cond_1
    aget-object v9, v1, v9

    :goto_2
    iput-object v9, v0, Lcom/daaw/ab1;->l:Lcom/daaw/he0$a;

    move/from16 v9, p6

    invoke-virtual {v0, v6, v2, v9}, Lcom/daaw/xa1;->q(IIF)I

    move-result v26

    iget v10, v8, Lcom/daaw/he0$a;->e:F

    iget v11, v8, Lcom/daaw/he0$a;->f:F

    iget v12, v8, Lcom/daaw/he0$a;->d:F

    const/high16 v13, -0x40000000    # -2.0f

    mul-float v12, v12, v13

    mul-float v12, v12, p4

    invoke-static {v12}, Ljava/lang/Math;->signum(F)F

    move-result v13

    iget v14, v0, Lcom/daaw/xa1;->f:F

    mul-float v12, v12, v14

    iget-boolean v14, v0, Lcom/daaw/ab1;->i:Z

    if-eqz v14, :cond_2

    iget v14, v8, Lcom/daaw/he0$a;->g:F

    mul-float v14, v14, v12

    sub-float/2addr v10, v14

    iget v14, v8, Lcom/daaw/he0$a;->h:F

    mul-float v14, v14, v12

    sub-float/2addr v11, v14

    float-to-double v14, v12

    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v14, v14, v16

    double-to-float v12, v14

    :cond_2
    iget-boolean v14, v0, Lcom/daaw/ab1;->j:Z

    if-eqz v14, :cond_3

    iget v14, v8, Lcom/daaw/he0$a;->g:F

    iget-object v15, v0, Lcom/daaw/ab1;->k:Lcom/daaw/he0$a;

    iget v3, v15, Lcom/daaw/he0$a;->g:F

    add-float/2addr v3, v14

    iput v3, v5, Lcom/daaw/bs1;->a:F

    iget v3, v8, Lcom/daaw/he0$a;->h:F

    iget v15, v15, Lcom/daaw/he0$a;->h:F

    add-float/2addr v15, v3

    iput v15, v5, Lcom/daaw/bs1;->b:F

    iget-object v15, v0, Lcom/daaw/ab1;->l:Lcom/daaw/he0$a;

    iget v1, v15, Lcom/daaw/he0$a;->g:F

    add-float/2addr v14, v1

    iput v14, v7, Lcom/daaw/bs1;->a:F

    iget v1, v15, Lcom/daaw/he0$a;->h:F

    add-float/2addr v3, v1

    iput v3, v7, Lcom/daaw/bs1;->b:F

    invoke-virtual {v7}, Lcom/daaw/bs1;->p()Lcom/daaw/bs1;

    invoke-virtual {v5}, Lcom/daaw/bs1;->p()Lcom/daaw/bs1;

    iget v1, v8, Lcom/daaw/he0$a;->g:F

    iget v3, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v1, v3}, Lcom/daaw/bs1;->b(FF)F

    move-result v1

    mul-float v1, v1, v4

    add-float/2addr v1, v10

    iget v3, v8, Lcom/daaw/he0$a;->g:F

    iget v14, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v3, v14}, Lcom/daaw/bs1;->c(FF)F

    move-result v3

    mul-float v3, v3, v4

    add-float/2addr v3, v11

    iget v14, v8, Lcom/daaw/he0$a;->g:F

    iget v15, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v14, v15}, Lcom/daaw/bs1;->d(FF)F

    move-result v14

    mul-float v14, v14, v4

    add-float/2addr v14, v10

    iget v10, v8, Lcom/daaw/he0$a;->g:F

    iget v15, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v10, v15}, Lcom/daaw/bs1;->e(FF)F

    move-result v10

    mul-float v10, v10, v4

    add-float/2addr v10, v11

    iget v11, v5, Lcom/daaw/bs1;->a:F

    mul-float v11, v11, v12

    add-float/2addr v11, v1

    iget v15, v5, Lcom/daaw/bs1;->b:F

    mul-float v15, v15, v12

    add-float/2addr v15, v3

    move/from16 p3, v1

    iget v1, v7, Lcom/daaw/bs1;->a:F

    mul-float v1, v1, v12

    add-float/2addr v1, v14

    move/from16 v28, v2

    iget v2, v7, Lcom/daaw/bs1;->b:F

    mul-float v2, v2, v12

    add-float/2addr v2, v10

    sub-float v12, v11, v1

    move/from16 v16, v3

    sub-float v3, v15, v2

    invoke-static {v12, v3}, Lcom/daaw/bs1;->l(FF)F

    move-result v3

    const/high16 v27, 0x3f000000    # 0.5f

    mul-float v3, v3, v27

    iget v12, v5, Lcom/daaw/bs1;->a:F

    neg-float v3, v3

    mul-float v12, v12, v3

    add-float/2addr v12, v11

    iget v9, v5, Lcom/daaw/bs1;->b:F

    mul-float v9, v9, v3

    add-float/2addr v9, v15

    move-object/from16 v29, v5

    iget v5, v7, Lcom/daaw/bs1;->a:F

    mul-float v5, v5, v3

    add-float/2addr v5, v1

    move/from16 v17, v1

    iget v1, v7, Lcom/daaw/bs1;->b:F

    mul-float v1, v1, v3

    add-float/2addr v1, v2

    move/from16 v31, v2

    move v2, v15

    move/from16 v3, v16

    move/from16 v30, v17

    move/from16 v16, v1

    move v15, v5

    move v5, v11

    move/from16 v1, p3

    goto :goto_3

    :cond_3
    move/from16 v28, v2

    move-object/from16 v29, v5

    const/high16 v27, 0x3f000000    # 0.5f

    iget v1, v8, Lcom/daaw/he0$a;->g:F

    iget v2, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v1, v2}, Lcom/daaw/bs1;->b(FF)F

    move-result v1

    mul-float v1, v1, v4

    add-float/2addr v1, v10

    iget v2, v8, Lcom/daaw/he0$a;->g:F

    iget v3, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v2, v3}, Lcom/daaw/bs1;->c(FF)F

    move-result v2

    mul-float v2, v2, v4

    add-float v3, v2, v11

    iget v2, v8, Lcom/daaw/he0$a;->g:F

    iget v5, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v2, v5}, Lcom/daaw/bs1;->d(FF)F

    move-result v2

    mul-float v2, v2, v4

    add-float v14, v2, v10

    iget v2, v8, Lcom/daaw/he0$a;->g:F

    iget v5, v8, Lcom/daaw/he0$a;->h:F

    invoke-static {v2, v5}, Lcom/daaw/bs1;->e(FF)F

    move-result v2

    mul-float v2, v2, v4

    add-float v10, v2, v11

    iget v2, v8, Lcom/daaw/he0$a;->g:F

    mul-float v5, v2, v12

    add-float/2addr v5, v1

    iget v9, v8, Lcom/daaw/he0$a;->h:F

    mul-float v11, v9, v12

    add-float/2addr v11, v3

    mul-float v15, v2, v12

    add-float/2addr v15, v14

    mul-float v12, v12, v9

    add-float/2addr v12, v10

    move/from16 p3, v1

    neg-float v1, v4

    mul-float v16, v2, v1

    add-float v16, v16, v5

    mul-float v17, v9, v1

    add-float v17, v17, v11

    mul-float v2, v2, v1

    add-float/2addr v2, v15

    mul-float v9, v9, v1

    add-float/2addr v9, v12

    move/from16 v1, p3

    move/from16 v31, v12

    move/from16 v30, v15

    move/from16 v12, v16

    move v15, v2

    move/from16 v16, v9

    move v2, v11

    move/from16 v9, v17

    :goto_3
    iget-boolean v11, v0, Lcom/daaw/xa1;->d:Z

    if-eqz v11, :cond_4

    iget v1, v8, Lcom/daaw/he0$a;->g:F

    mul-float v3, v1, v13

    iget v10, v0, Lcom/daaw/xa1;->e:F

    mul-float v3, v3, v10

    add-float/2addr v3, v5

    iget v11, v8, Lcom/daaw/he0$a;->h:F

    mul-float v14, v11, v13

    mul-float v14, v14, v10

    add-float/2addr v14, v2

    mul-float v1, v1, v13

    mul-float v1, v1, v10

    add-float v1, v30, v1

    mul-float v11, v11, v13

    mul-float v11, v11, v10

    add-float v11, v31, v11

    move/from16 v32, v1

    move v1, v3

    move/from16 v33, v11

    move v3, v14

    goto :goto_4

    :cond_4
    move/from16 v33, v10

    move/from16 v32, v14

    :goto_4
    iget v10, v8, Lcom/daaw/he0$a;->g:F

    mul-float v11, v10, v4

    add-float v34, v11, v1

    iget v8, v8, Lcom/daaw/he0$a;->h:F

    mul-float v11, v8, v4

    add-float v35, v11, v3

    mul-float v10, v10, v4

    add-float v36, v10, v32

    mul-float v8, v8, v4

    add-float v8, v8, v33

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const v11, 0x3c23d70a    # 0.01f

    cmpl-float v10, v10, v11

    if-lez v10, :cond_5

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->j()Lcom/daaw/sc0;

    move-result-object v10

    const/16 v20, 0x0

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v22

    sget-object v23, Lcom/daaw/ab1;->n:Lcom/daaw/bs1;

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v11

    invoke-interface {v11}, Lcom/daaw/de0$a;->d()Lcom/daaw/z6;

    move-result-object v24

    move-object/from16 v11, p1

    move v13, v9

    move v14, v15

    move/from16 v15, v16

    move/from16 v16, v5

    move/from16 v17, v2

    move/from16 v18, v30

    move/from16 v19, v31

    move/from16 v21, v26

    move/from16 v25, p5

    invoke-interface/range {v10 .. v25}, Lcom/daaw/sc0;->e(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;I)V

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->j()Lcom/daaw/sc0;

    move-result-object v10

    sget-object v22, Lcom/daaw/ab1;->m:Lcom/daaw/bs1;

    sget-object v23, Lcom/daaw/ab1;->p:Lcom/daaw/bs1;

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v9

    invoke-interface {v9}, Lcom/daaw/de0$a;->d()Lcom/daaw/z6;

    move-result-object v24

    move v12, v5

    move v13, v2

    move/from16 v14, v30

    move/from16 v15, v31

    move/from16 v16, v1

    move/from16 v17, v3

    move/from16 v18, v32

    move/from16 v19, v33

    invoke-interface/range {v10 .. v25}, Lcom/daaw/sc0;->e(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;I)V

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->j()Lcom/daaw/sc0;

    move-result-object v10

    sget-object v22, Lcom/daaw/ab1;->o:Lcom/daaw/bs1;

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v23

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/de0$a;->d()Lcom/daaw/z6;

    move-result-object v24

    move v12, v1

    move v13, v3

    move/from16 v14, v32

    move/from16 v15, v33

    move/from16 v16, v34

    move/from16 v17, v35

    move/from16 v18, v36

    move/from16 v19, v8

    goto :goto_5

    :cond_5
    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->j()Lcom/daaw/sc0;

    move-result-object v10

    const/16 v20, 0x0

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v22

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v23

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v8

    invoke-interface {v8}, Lcom/daaw/de0$a;->c()Lcom/daaw/z6;

    move-result-object v24

    move-object/from16 v11, p1

    move v12, v5

    move v13, v2

    move/from16 v14, v30

    move/from16 v15, v31

    move/from16 v16, v1

    move/from16 v17, v3

    move/from16 v18, v32

    move/from16 v19, v33

    move/from16 v21, v26

    move/from16 v25, p5

    :goto_5
    invoke-interface/range {v10 .. v25}, Lcom/daaw/sc0;->e(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;I)V

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p2

    move/from16 v2, v28

    move-object/from16 v5, v29

    const/high16 v3, 0x3f000000    # 0.5f

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 6

    invoke-super {p0, p1}, Lcom/daaw/xa1;->o(Lcom/daaw/un;)V

    iget v2, p0, Lcom/daaw/ab1;->h:F

    const-string v1, "barWidth"

    const-string v3, "misc"

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget-boolean v0, p0, Lcom/daaw/ab1;->j:Z

    const-string v1, "barWidthAffectedByShape"

    const-string v2, "b"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/ab1;->i:Z

    const-string v1, "mirror"

    const-string v2, "misc"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method
