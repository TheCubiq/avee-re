.class public Lcom/daaw/uc;
.super Lcom/daaw/tc;
.source ""


# instance fields
.field public A:F

.field public w:Lcom/daaw/tc$a;

.field public x:Lcom/daaw/bs1;

.field public y:Lcom/daaw/bs1;

.field public z:F


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/daaw/tc;-><init>(I)V

    new-instance p1, Lcom/daaw/tc$a;

    invoke-direct {p1}, Lcom/daaw/tc$a;-><init>()V

    iput-object p1, p0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    new-instance p1, Lcom/daaw/bs1;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object p1, p0, Lcom/daaw/uc;->x:Lcom/daaw/bs1;

    new-instance p1, Lcom/daaw/bs1;

    invoke-direct {p1, v0, v0}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object p1, p0, Lcom/daaw/uc;->y:Lcom/daaw/bs1;

    return-void
.end method


# virtual methods
.method public d(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    move/from16 v8, p9

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    move-object/from16 v11, p14

    move-object/from16 v12, p1

    check-cast v12, Lcom/daaw/y31;

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-virtual {v0, v12, v13, v11, v14}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    move-result v12

    if-nez v12, :cond_0

    return-void

    :cond_0
    iget v12, v9, Lcom/daaw/bs1;->a:F

    invoke-virtual {v11, v12}, Lcom/daaw/w31;->i(F)F

    move-result v12

    iput v12, v9, Lcom/daaw/bs1;->a:F

    iget v12, v9, Lcom/daaw/bs1;->b:F

    invoke-virtual {v11, v12}, Lcom/daaw/w31;->j(F)F

    move-result v12

    iput v12, v9, Lcom/daaw/bs1;->b:F

    iget v12, v10, Lcom/daaw/bs1;->a:F

    invoke-virtual {v11, v12}, Lcom/daaw/w31;->i(F)F

    move-result v12

    iput v12, v10, Lcom/daaw/bs1;->a:F

    iget v12, v10, Lcom/daaw/bs1;->b:F

    invoke-virtual {v11, v12}, Lcom/daaw/w31;->j(F)F

    const/4 v12, 0x0

    iput v12, v10, Lcom/daaw/bs1;->b:F

    iget-object v12, v0, Lcom/daaw/uc;->x:Lcom/daaw/bs1;

    add-float v14, v1, v5

    const/high16 v15, 0x3f000000    # 0.5f

    mul-float v14, v14, v15

    iput v14, v12, Lcom/daaw/bs1;->a:F

    add-float v14, v2, v6

    mul-float v14, v14, v15

    iput v14, v12, Lcom/daaw/bs1;->b:F

    iget-object v12, v0, Lcom/daaw/uc;->y:Lcom/daaw/bs1;

    add-float v14, v3, v7

    mul-float v14, v14, v15

    iput v14, v12, Lcom/daaw/bs1;->a:F

    add-float v14, v4, v8

    mul-float v14, v14, v15

    iput v14, v12, Lcom/daaw/bs1;->b:F

    sub-float v12, v1, v5

    sub-float v14, v2, v6

    invoke-static {v12, v14}, Lcom/daaw/bs1;->l(FF)F

    move-result v12

    sub-float v14, v3, v7

    sub-float v13, v4, v8

    invoke-static {v14, v13}, Lcom/daaw/bs1;->l(FF)F

    move-result v13

    mul-float v12, v12, v15

    mul-float v13, v13, v15

    const/high16 v14, 0x3cc00000    # 0.0234375f

    mul-float v12, v12, v14

    mul-float v13, v13, v14

    iget-object v14, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    const/high16 v15, 0x3f800000    # 1.0f

    iput v15, v14, Lcom/daaw/tc$a;->d:F

    invoke-virtual/range {p14 .. p14}, Lcom/daaw/w31;->k()F

    move-result v11

    iput v11, v14, Lcom/daaw/tc$a;->g:F

    iget-object v11, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    move/from16 v14, p11

    iput v14, v11, Lcom/daaw/tc$a;->h:I

    move/from16 v14, p10

    iput v14, v11, Lcom/daaw/tc$a;->c:F

    iget-object v14, v0, Lcom/daaw/uc;->x:Lcom/daaw/bs1;

    iget v15, v14, Lcom/daaw/bs1;->a:F

    iput v15, v11, Lcom/daaw/tc$a;->a:F

    iget v14, v14, Lcom/daaw/bs1;->b:F

    iput v14, v11, Lcom/daaw/tc$a;->b:F

    iget v14, v9, Lcom/daaw/bs1;->a:F

    iput v14, v11, Lcom/daaw/tc$a;->e:F

    iget v14, v10, Lcom/daaw/bs1;->b:F

    add-float/2addr v14, v12

    iput v14, v11, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v11}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v11, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iput v1, v11, Lcom/daaw/tc$a;->a:F

    iput v2, v11, Lcom/daaw/tc$a;->b:F

    iget v14, v9, Lcom/daaw/bs1;->a:F

    iput v14, v11, Lcom/daaw/tc$a;->e:F

    iget v14, v9, Lcom/daaw/bs1;->b:F

    iput v14, v11, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v11}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v11, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget-object v14, v0, Lcom/daaw/uc;->y:Lcom/daaw/bs1;

    iget v15, v14, Lcom/daaw/bs1;->a:F

    iput v15, v11, Lcom/daaw/tc$a;->a:F

    iget v14, v14, Lcom/daaw/bs1;->b:F

    iput v14, v11, Lcom/daaw/tc$a;->b:F

    iget v14, v10, Lcom/daaw/bs1;->a:F

    iput v14, v11, Lcom/daaw/tc$a;->e:F

    iget v14, v10, Lcom/daaw/bs1;->b:F

    add-float/2addr v14, v13

    iput v14, v11, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v11}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v11, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget-object v14, v0, Lcom/daaw/uc;->y:Lcom/daaw/bs1;

    iget v15, v14, Lcom/daaw/bs1;->a:F

    iput v15, v11, Lcom/daaw/tc$a;->a:F

    iget v14, v14, Lcom/daaw/bs1;->b:F

    iput v14, v11, Lcom/daaw/tc$a;->b:F

    iget v14, v10, Lcom/daaw/bs1;->a:F

    iput v14, v11, Lcom/daaw/tc$a;->e:F

    iget v14, v10, Lcom/daaw/bs1;->b:F

    add-float/2addr v14, v13

    iput v14, v11, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v11}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v11, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iput v1, v11, Lcom/daaw/tc$a;->a:F

    iput v2, v11, Lcom/daaw/tc$a;->b:F

    iget v1, v9, Lcom/daaw/bs1;->a:F

    iput v1, v11, Lcom/daaw/tc$a;->e:F

    iget v1, v9, Lcom/daaw/bs1;->b:F

    iput v1, v11, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v11}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iput v4, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v10, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v9, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iput v5, v1, Lcom/daaw/tc$a;->a:F

    iput v6, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v9, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v9, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget-object v2, v0, Lcom/daaw/uc;->x:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v9, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v10, Lcom/daaw/bs1;->b:F

    add-float/2addr v2, v12

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iput v7, v1, Lcom/daaw/tc$a;->a:F

    iput v8, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v10, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v9, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iput v7, v1, Lcom/daaw/tc$a;->a:F

    iput v8, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v10, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v9, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget-object v2, v0, Lcom/daaw/uc;->x:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v9, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v10, Lcom/daaw/bs1;->b:F

    add-float/2addr v2, v12

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v0, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget-object v2, v0, Lcom/daaw/uc;->y:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v10, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v10, Lcom/daaw/bs1;->b:F

    add-float/2addr v2, v13

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget v1, v0, Lcom/daaw/tc;->b:I

    const/4 v2, 0x4

    add-int/2addr v1, v2

    iput v1, v0, Lcom/daaw/tc;->b:I

    return-void
.end method

.method public f(Lcom/daaw/de0;Lcom/daaw/t40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/de0;",
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/w31;",
            ")V"
        }
    .end annotation

    move-object/from16 v7, p0

    move/from16 v8, p3

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v12, p1

    check-cast v12, Lcom/daaw/y31;

    const/16 v0, 0x8

    new-array v13, v0, [F

    const/4 v14, 0x4

    new-array v15, v14, [I

    iget v0, v9, Lcom/daaw/bs1;->a:F

    invoke-virtual {v11, v0}, Lcom/daaw/w31;->i(F)F

    move-result v0

    iput v0, v9, Lcom/daaw/bs1;->a:F

    iget v0, v9, Lcom/daaw/bs1;->b:F

    invoke-virtual {v11, v0}, Lcom/daaw/w31;->j(F)F

    move-result v0

    iput v0, v9, Lcom/daaw/bs1;->b:F

    iget v0, v10, Lcom/daaw/bs1;->a:F

    invoke-virtual {v11, v0}, Lcom/daaw/w31;->i(F)F

    move-result v0

    iput v0, v10, Lcom/daaw/bs1;->a:F

    iget v0, v10, Lcom/daaw/bs1;->b:F

    invoke-virtual {v11, v0}, Lcom/daaw/w31;->j(F)F

    const/4 v0, 0x0

    iput v0, v10, Lcom/daaw/bs1;->b:F

    iget-object v0, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/daaw/tc$a;->d:F

    invoke-virtual/range {p7 .. p7}, Lcom/daaw/w31;->k()F

    move-result v1

    iput v1, v0, Lcom/daaw/tc$a;->g:F

    iget-object v0, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    move/from16 v1, p4

    iput v1, v0, Lcom/daaw/tc$a;->c:F

    iget v0, v7, Lcom/daaw/tc;->n:I

    rem-int/lit8 v1, v0, 0x4

    sub-int v6, v0, v1

    const/4 v5, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v8, :cond_2

    mul-int/lit8 v0, v4, 0x4

    rem-int/2addr v0, v6

    if-nez v0, :cond_0

    sub-int v0, v8, v4

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v7, v12, v0, v11, v5}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v3, p2

    invoke-interface {v3, v0, v13, v15}, Lcom/daaw/t40;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    move/from16 v16, v4

    move/from16 v18, v6

    const/4 v1, 0x4

    const/4 v14, 0x0

    goto/16 :goto_1

    :cond_1
    iget-object v0, v7, Lcom/daaw/uc;->x:Lcom/daaw/bs1;

    aget v1, v13, v5

    aget v2, v13, v14

    add-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v1, v1, v2

    iput v1, v0, Lcom/daaw/bs1;->a:F

    const/4 v1, 0x1

    aget v16, v13, v1

    const/16 v17, 0x5

    aget v18, v13, v17

    add-float v16, v16, v18

    mul-float v1, v16, v2

    iput v1, v0, Lcom/daaw/bs1;->b:F

    iget-object v0, v7, Lcom/daaw/uc;->y:Lcom/daaw/bs1;

    const/4 v1, 0x2

    aget v16, v13, v1

    const/16 v18, 0x6

    aget v19, v13, v18

    add-float v16, v16, v19

    mul-float v1, v16, v2

    iput v1, v0, Lcom/daaw/bs1;->a:F

    const/4 v1, 0x3

    aget v16, v13, v1

    const/16 v19, 0x7

    aget v20, v13, v19

    add-float v16, v16, v20

    mul-float v1, v16, v2

    iput v1, v0, Lcom/daaw/bs1;->b:F

    aget v0, v13, v5

    aget v1, v13, v14

    sub-float/2addr v0, v1

    const/4 v1, 0x1

    aget v16, v13, v1

    aget v17, v13, v17

    sub-float v1, v16, v17

    invoke-static {v0, v1}, Lcom/daaw/bs1;->l(FF)F

    move-result v0

    const/4 v1, 0x2

    aget v16, v13, v1

    aget v17, v13, v18

    sub-float v1, v16, v17

    const/16 v16, 0x3

    aget v17, v13, v16

    aget v18, v13, v19

    sub-float v5, v17, v18

    invoke-static {v1, v5}, Lcom/daaw/bs1;->l(FF)F

    move-result v1

    mul-float v0, v0, v2

    mul-float v1, v1, v2

    const/high16 v2, 0x3cc00000    # 0.0234375f

    mul-float v0, v0, v2

    iput v0, v7, Lcom/daaw/uc;->z:F

    mul-float v1, v1, v2

    iput v1, v7, Lcom/daaw/uc;->A:F

    iget-object v1, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v2, v9, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v10, Lcom/daaw/bs1;->b:F

    add-float/2addr v2, v0

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    iget-object v0, v7, Lcom/daaw/uc;->x:Lcom/daaw/bs1;

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iget v5, v0, Lcom/daaw/bs1;->b:F

    iget v0, v1, Lcom/daaw/tc$a;->c:F

    const/16 v17, 0x2

    move/from16 v18, v0

    move-object/from16 v0, p0

    const/4 v14, 0x1

    move v3, v5

    move/from16 v16, v4

    move/from16 v4, v18

    const/4 v14, 0x0

    move-object v5, v15

    move/from16 v18, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->y(Lcom/daaw/tc$a;FFF[II)V

    iget-object v0, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v1, v9, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v9, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v7, v0, v13, v15, v14}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v1, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v0, v10, Lcom/daaw/bs1;->a:F

    iput v0, v1, Lcom/daaw/tc$a;->e:F

    iget v0, v10, Lcom/daaw/bs1;->b:F

    iget v2, v7, Lcom/daaw/uc;->A:F

    add-float/2addr v0, v2

    iput v0, v1, Lcom/daaw/tc$a;->f:F

    iget-object v0, v7, Lcom/daaw/uc;->y:Lcom/daaw/bs1;

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iget v4, v1, Lcom/daaw/tc$a;->c:F

    const/4 v6, 0x3

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->y(Lcom/daaw/tc$a;FFF[II)V

    iget-object v1, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v0, v10, Lcom/daaw/bs1;->a:F

    iput v0, v1, Lcom/daaw/tc$a;->e:F

    iget v0, v10, Lcom/daaw/bs1;->b:F

    iget v2, v7, Lcom/daaw/uc;->A:F

    add-float/2addr v0, v2

    iput v0, v1, Lcom/daaw/tc$a;->f:F

    iget-object v0, v7, Lcom/daaw/uc;->y:Lcom/daaw/bs1;

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iget v4, v1, Lcom/daaw/tc$a;->c:F

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->y(Lcom/daaw/tc$a;FFF[II)V

    iget-object v0, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v1, v9, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v9, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v7, v0, v13, v15, v14}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v0, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v1, v10, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v9, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v13, v15, v1}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v0, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v1, v9, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v9, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    const/4 v1, 0x2

    invoke-virtual {v7, v0, v13, v15, v1}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v1, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v0, v9, Lcom/daaw/bs1;->a:F

    iput v0, v1, Lcom/daaw/tc$a;->e:F

    iget v0, v10, Lcom/daaw/bs1;->b:F

    iget v2, v7, Lcom/daaw/uc;->z:F

    add-float/2addr v0, v2

    iput v0, v1, Lcom/daaw/tc$a;->f:F

    iget-object v0, v7, Lcom/daaw/uc;->x:Lcom/daaw/bs1;

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iget v4, v1, Lcom/daaw/tc$a;->c:F

    const/4 v6, 0x0

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->y(Lcom/daaw/tc$a;FFF[II)V

    iget-object v0, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v1, v10, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v9, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    const/4 v1, 0x3

    invoke-virtual {v7, v0, v13, v15, v1}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v0, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v2, v10, Lcom/daaw/bs1;->a:F

    iput v2, v0, Lcom/daaw/tc$a;->e:F

    iget v2, v9, Lcom/daaw/bs1;->b:F

    iput v2, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v7, v0, v13, v15, v1}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v1, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v0, v9, Lcom/daaw/bs1;->a:F

    iput v0, v1, Lcom/daaw/tc$a;->e:F

    iget v0, v10, Lcom/daaw/bs1;->b:F

    iget v2, v7, Lcom/daaw/uc;->z:F

    add-float/2addr v0, v2

    iput v0, v1, Lcom/daaw/tc$a;->f:F

    iget-object v0, v7, Lcom/daaw/uc;->x:Lcom/daaw/bs1;

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iget v4, v1, Lcom/daaw/tc$a;->c:F

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->y(Lcom/daaw/tc$a;FFF[II)V

    iget-object v1, v7, Lcom/daaw/uc;->w:Lcom/daaw/tc$a;

    iget v0, v10, Lcom/daaw/bs1;->a:F

    iput v0, v1, Lcom/daaw/tc$a;->e:F

    iget v0, v10, Lcom/daaw/bs1;->b:F

    iget v2, v7, Lcom/daaw/uc;->A:F

    add-float/2addr v0, v2

    iput v0, v1, Lcom/daaw/tc$a;->f:F

    iget-object v0, v7, Lcom/daaw/uc;->y:Lcom/daaw/bs1;

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iget v4, v1, Lcom/daaw/tc$a;->c:F

    const/4 v6, 0x1

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->y(Lcom/daaw/tc$a;FFF[II)V

    iget v0, v7, Lcom/daaw/tc;->b:I

    const/4 v1, 0x4

    add-int/2addr v0, v1

    iput v0, v7, Lcom/daaw/tc;->b:I

    :goto_1
    add-int/lit8 v4, v16, 0x1

    move/from16 v6, v18

    const/4 v5, 0x0

    const/4 v14, 0x4

    goto/16 :goto_0

    :cond_2
    return-void
.end method
