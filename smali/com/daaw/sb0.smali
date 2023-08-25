.class public Lcom/daaw/sb0;
.super Lcom/daaw/kx1;
.source ""


# static fields
.field public static k:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, Lcom/daaw/sb0;->k:[I

    return-void
.end method

.method public constructor <init>(Lcom/daaw/qj;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/daaw/kx1;-><init>(Lcom/daaw/qj;)V

    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    sget-object v0, Lcom/daaw/ft$a;->s:Lcom/daaw/ft$a;

    iput-object v0, p1, Lcom/daaw/ft;->e:Lcom/daaw/ft$a;

    iget-object p1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    sget-object v0, Lcom/daaw/ft$a;->t:Lcom/daaw/ft$a;

    iput-object v0, p1, Lcom/daaw/ft;->e:Lcom/daaw/ft$a;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/kx1;->f:I

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/zs;)V
    .locals 16

    move-object/from16 v8, p0

    sget-object v0, Lcom/daaw/sb0$a;->a:[I

    iget-object v1, v8, Lcom/daaw/kx1;->j:Lcom/daaw/kx1$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v0, v9, :cond_2

    if-eq v0, v1, :cond_1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    iget-object v0, v0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    move-object/from16 v3, p1

    invoke-virtual {v8, v3, v1, v0, v10}, Lcom/daaw/kx1;->n(Lcom/daaw/zs;Lcom/daaw/lj;Lcom/daaw/lj;I)V

    return-void

    :cond_1
    move-object/from16 v3, p1

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/kx1;->o(Lcom/daaw/zs;)V

    goto :goto_0

    :cond_2
    move-object/from16 v3, p1

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/kx1;->p(Lcom/daaw/zs;)V

    :goto_0
    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    const/high16 v11, 0x3f000000    # 0.5f

    if-nez v0, :cond_21

    iget-object v0, v8, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v3, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v0, v3, :cond_21

    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v3, v0, Lcom/daaw/qj;->l:I

    if-eq v3, v1, :cond_20

    if-eq v3, v2, :cond_3

    goto/16 :goto_11

    :cond_3
    iget v1, v0, Lcom/daaw/qj;->m:I

    const/4 v3, -0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lcom/daaw/qj;->s()I

    move-result v0

    if-eq v0, v3, :cond_6

    if-eqz v0, :cond_5

    if-eq v0, v9, :cond_6

    const/4 v0, 0x0

    goto/16 :goto_10

    :cond_5
    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v1, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v1, v1, Lcom/daaw/ft;->g:I

    int-to-float v1, v1

    invoke-virtual {v0}, Lcom/daaw/qj;->r()F

    move-result v0

    div-float/2addr v1, v0

    goto :goto_1

    :cond_6
    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v1, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v1, v1, Lcom/daaw/ft;->g:I

    int-to-float v1, v1

    invoke-virtual {v0}, Lcom/daaw/qj;->r()F

    move-result v0

    mul-float v1, v1, v0

    :goto_1
    add-float/2addr v1, v11

    float-to-int v0, v1

    goto/16 :goto_10

    :cond_7
    :goto_2
    iget-object v1, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v12, v1, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v13, v1, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, v0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_8

    const/4 v1, 0x1

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    :goto_3
    iget-object v2, v0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    iget-object v2, v2, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v2, :cond_9

    const/4 v2, 0x1

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    :goto_4
    iget-object v4, v0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    iget-object v4, v4, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v4, :cond_a

    const/4 v4, 0x1

    goto :goto_5

    :cond_a
    const/4 v4, 0x0

    :goto_5
    iget-object v5, v0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    iget-object v5, v5, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v5, :cond_b

    const/4 v5, 0x1

    goto :goto_6

    :cond_b
    const/4 v5, 0x0

    :goto_6
    invoke-virtual {v0}, Lcom/daaw/qj;->s()I

    move-result v14

    if-eqz v1, :cond_14

    if-eqz v2, :cond_14

    if-eqz v4, :cond_14

    if-eqz v5, :cond_14

    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->r()F

    move-result v15

    iget-boolean v0, v12, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_e

    iget-boolean v0, v13, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_e

    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v1, v0, Lcom/daaw/ft;->c:Z

    if-eqz v1, :cond_d

    iget-object v1, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v1, v1, Lcom/daaw/ft;->c:Z

    if-nez v1, :cond_c

    goto :goto_7

    :cond_c
    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v1, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->f:I

    add-int v2, v0, v1

    iget-object v0, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v1, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->f:I

    sub-int v3, v0, v1

    iget v0, v12, Lcom/daaw/ft;->g:I

    iget v1, v12, Lcom/daaw/ft;->f:I

    add-int v4, v0, v1

    iget v0, v13, Lcom/daaw/ft;->g:I

    iget v1, v13, Lcom/daaw/ft;->f:I

    sub-int v5, v0, v1

    sget-object v1, Lcom/daaw/sb0;->k:[I

    move-object/from16 v0, p0

    move v6, v15

    move v7, v14

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/sb0;->q([IIIIIFI)V

    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    sget-object v1, Lcom/daaw/sb0;->k:[I

    aget v1, v1, v10

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    sget-object v1, Lcom/daaw/sb0;->k:[I

    aget v1, v1, v9

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    :cond_d
    :goto_7
    return-void

    :cond_e
    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v1, v0, Lcom/daaw/ft;->j:Z

    if-eqz v1, :cond_11

    iget-object v1, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v2, v1, Lcom/daaw/ft;->j:Z

    if-eqz v2, :cond_11

    iget-boolean v2, v12, Lcom/daaw/ft;->c:Z

    if-eqz v2, :cond_10

    iget-boolean v2, v13, Lcom/daaw/ft;->c:Z

    if-nez v2, :cond_f

    goto :goto_8

    :cond_f
    iget v2, v0, Lcom/daaw/ft;->g:I

    iget v0, v0, Lcom/daaw/ft;->f:I

    add-int/2addr v2, v0

    iget v0, v1, Lcom/daaw/ft;->g:I

    iget v1, v1, Lcom/daaw/ft;->f:I

    sub-int v3, v0, v1

    iget-object v0, v12, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget v1, v12, Lcom/daaw/ft;->f:I

    add-int v4, v0, v1

    iget-object v0, v13, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget v1, v13, Lcom/daaw/ft;->f:I

    sub-int v5, v0, v1

    sget-object v1, Lcom/daaw/sb0;->k:[I

    move-object/from16 v0, p0

    move v6, v15

    move v7, v14

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/sb0;->q([IIIIIFI)V

    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    sget-object v1, Lcom/daaw/sb0;->k:[I

    aget v1, v1, v10

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    sget-object v1, Lcom/daaw/sb0;->k:[I

    aget v1, v1, v9

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    goto :goto_9

    :cond_10
    :goto_8
    return-void

    :cond_11
    :goto_9
    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v1, v0, Lcom/daaw/ft;->c:Z

    if-eqz v1, :cond_13

    iget-object v1, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v1, v1, Lcom/daaw/ft;->c:Z

    if-eqz v1, :cond_13

    iget-boolean v1, v12, Lcom/daaw/ft;->c:Z

    if-eqz v1, :cond_13

    iget-boolean v1, v13, Lcom/daaw/ft;->c:Z

    if-nez v1, :cond_12

    goto :goto_a

    :cond_12
    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v1, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->f:I

    add-int v2, v0, v1

    iget-object v0, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v1, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->f:I

    sub-int v3, v0, v1

    iget-object v0, v12, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget v1, v12, Lcom/daaw/ft;->f:I

    add-int v4, v0, v1

    iget-object v0, v13, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget v1, v13, Lcom/daaw/ft;->f:I

    sub-int v5, v0, v1

    sget-object v1, Lcom/daaw/sb0;->k:[I

    move-object/from16 v0, p0

    move v6, v15

    move v7, v14

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/sb0;->q([IIIIIFI)V

    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    sget-object v1, Lcom/daaw/sb0;->k:[I

    aget v1, v1, v10

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    sget-object v1, Lcom/daaw/sb0;->k:[I

    aget v1, v1, v9

    goto/16 :goto_e

    :cond_13
    :goto_a
    return-void

    :cond_14
    if-eqz v1, :cond_1a

    if-eqz v4, :cond_1a

    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v0, v0, Lcom/daaw/ft;->c:Z

    if-eqz v0, :cond_19

    iget-object v0, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v0, v0, Lcom/daaw/ft;->c:Z

    if-nez v0, :cond_15

    goto :goto_c

    :cond_15
    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->r()F

    move-result v0

    iget-object v1, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, v1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->g:I

    iget-object v2, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v2, v2, Lcom/daaw/ft;->f:I

    add-int/2addr v1, v2

    iget-object v2, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, v2, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ft;

    iget v2, v2, Lcom/daaw/ft;->g:I

    iget-object v4, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v4, v4, Lcom/daaw/ft;->f:I

    sub-int/2addr v2, v4

    if-eq v14, v3, :cond_17

    if-eqz v14, :cond_17

    if-eq v14, v9, :cond_16

    goto/16 :goto_11

    :cond_16
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v10}, Lcom/daaw/kx1;->g(II)I

    move-result v1

    int-to-float v2, v1

    div-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v9}, Lcom/daaw/kx1;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_18

    int-to-float v1, v3

    mul-float v1, v1, v0

    goto :goto_b

    :cond_17
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v10}, Lcom/daaw/kx1;->g(II)I

    move-result v1

    int-to-float v2, v1

    mul-float v2, v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v9}, Lcom/daaw/kx1;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_18

    int-to-float v1, v3

    div-float/2addr v1, v0

    :goto_b
    add-float/2addr v1, v11

    float-to-int v1, v1

    :cond_18
    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0, v3}, Lcom/daaw/pt;->d(I)V

    goto/16 :goto_11

    :cond_19
    :goto_c
    return-void

    :cond_1a
    if-eqz v2, :cond_21

    if-eqz v5, :cond_21

    iget-boolean v0, v12, Lcom/daaw/ft;->c:Z

    if-eqz v0, :cond_1f

    iget-boolean v0, v13, Lcom/daaw/ft;->c:Z

    if-nez v0, :cond_1b

    goto :goto_f

    :cond_1b
    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->r()F

    move-result v0

    iget-object v1, v12, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->g:I

    iget v2, v12, Lcom/daaw/ft;->f:I

    add-int/2addr v1, v2

    iget-object v2, v13, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ft;

    iget v2, v2, Lcom/daaw/ft;->g:I

    iget v4, v13, Lcom/daaw/ft;->f:I

    sub-int/2addr v2, v4

    if-eq v14, v3, :cond_1d

    if-eqz v14, :cond_1c

    if-eq v14, v9, :cond_1d

    goto :goto_11

    :cond_1c
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v9}, Lcom/daaw/kx1;->g(II)I

    move-result v1

    int-to-float v2, v1

    mul-float v2, v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v10}, Lcom/daaw/kx1;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_1e

    int-to-float v1, v3

    div-float/2addr v1, v0

    goto :goto_d

    :cond_1d
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v9}, Lcom/daaw/kx1;->g(II)I

    move-result v1

    int-to-float v2, v1

    div-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v10}, Lcom/daaw/kx1;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_1e

    int-to-float v1, v3

    mul-float v1, v1, v0

    :goto_d
    add-float/2addr v1, v11

    float-to-int v1, v1

    :cond_1e
    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0, v3}, Lcom/daaw/pt;->d(I)V

    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    :goto_e
    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    goto :goto_11

    :cond_1f
    :goto_f
    return-void

    :cond_20
    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-eqz v0, :cond_21

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v1, v0, Lcom/daaw/ft;->j:Z

    if-eqz v1, :cond_21

    iget-object v1, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v1, v1, Lcom/daaw/qj;->q:F

    iget v0, v0, Lcom/daaw/ft;->g:I

    int-to-float v0, v0

    mul-float v0, v0, v1

    add-float/2addr v0, v11

    float-to-int v0, v0

    :goto_10
    iget-object v1, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v1, v0}, Lcom/daaw/pt;->d(I)V

    :cond_21
    :goto_11
    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v1, v0, Lcom/daaw/ft;->c:Z

    if-eqz v1, :cond_29

    iget-object v1, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v2, v1, Lcom/daaw/ft;->c:Z

    if-nez v2, :cond_22

    goto/16 :goto_12

    :cond_22
    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_23

    iget-boolean v0, v1, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_23

    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_23

    return-void

    :cond_23
    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-nez v0, :cond_24

    iget-object v0, v8, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_24

    iget-object v0, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v1, v0, Lcom/daaw/qj;->l:I

    if-nez v1, :cond_24

    invoke-virtual {v0}, Lcom/daaw/qj;->T()Z

    move-result v0

    if-nez v0, :cond_24

    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget-object v1, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, v1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v2, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v3, v2, Lcom/daaw/ft;->f:I

    add-int/2addr v0, v3

    iget v1, v1, Lcom/daaw/ft;->g:I

    iget-object v3, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v3, v3, Lcom/daaw/ft;->f:I

    add-int/2addr v1, v3

    sub-int v3, v1, v0

    invoke-virtual {v2, v0}, Lcom/daaw/ft;->d(I)V

    iget-object v0, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-virtual {v0, v1}, Lcom/daaw/ft;->d(I)V

    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0, v3}, Lcom/daaw/pt;->d(I)V

    return-void

    :cond_24
    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-nez v0, :cond_26

    iget-object v0, v8, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_26

    iget v0, v8, Lcom/daaw/kx1;->a:I

    if-ne v0, v9, :cond_26

    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_26

    iget-object v0, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_26

    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget-object v1, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, v1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v2, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v2, v2, Lcom/daaw/ft;->f:I

    add-int/2addr v0, v2

    iget v1, v1, Lcom/daaw/ft;->g:I

    iget-object v2, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v2, v2, Lcom/daaw/ft;->f:I

    add-int/2addr v1, v2

    sub-int/2addr v1, v0

    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v0, v0, Lcom/daaw/pt;->m:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v2, v1, Lcom/daaw/qj;->p:I

    iget v1, v1, Lcom/daaw/qj;->o:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lez v2, :cond_25

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_25
    iget-object v1, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v1, v0}, Lcom/daaw/pt;->d(I)V

    :cond_26
    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-nez v0, :cond_27

    return-void

    :cond_27
    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget-object v1, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, v1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ft;

    iget v2, v0, Lcom/daaw/ft;->g:I

    iget-object v3, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v3, v3, Lcom/daaw/ft;->f:I

    add-int/2addr v2, v3

    iget v3, v1, Lcom/daaw/ft;->g:I

    iget-object v4, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v4, v4, Lcom/daaw/ft;->f:I

    add-int/2addr v3, v4

    iget-object v4, v8, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v4}, Lcom/daaw/qj;->u()F

    move-result v4

    if-ne v0, v1, :cond_28

    iget v2, v0, Lcom/daaw/ft;->g:I

    iget v3, v1, Lcom/daaw/ft;->g:I

    const/high16 v4, 0x3f000000    # 0.5f

    :cond_28
    sub-int/2addr v3, v2

    iget-object v0, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v0, v0, Lcom/daaw/ft;->g:I

    sub-int/2addr v3, v0

    iget-object v0, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    int-to-float v1, v2

    add-float/2addr v1, v11

    int-to-float v2, v3

    mul-float v2, v2, v4

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/daaw/ft;->d(I)V

    iget-object v0, v8, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, v8, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->g:I

    iget-object v2, v8, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v2, v2, Lcom/daaw/ft;->g:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/daaw/ft;->d(I)V

    :cond_29
    :goto_12
    return-void
.end method

.method public d()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-boolean v1, v0, Lcom/daaw/qj;->a:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0}, Lcom/daaw/qj;->N()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/daaw/pt;->d(I)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->w()Lcom/daaw/qj$b;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-eq v0, v1, :cond_7

    sget-object v1, Lcom/daaw/qj$b;->s:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/qj;->w()Lcom/daaw/qj$b;

    move-result-object v2

    sget-object v3, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    if-eq v2, v3, :cond_2

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/qj;->w()Lcom/daaw/qj$b;

    move-result-object v2

    if-ne v2, v1, :cond_3

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/qj;->N()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v3, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v3, v3, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v4, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v4, v4, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {v4}, Lcom/daaw/lj;->b()I

    move-result v4

    invoke-virtual {p0, v2, v3, v4}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v2, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v3, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v3, v3, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v3}, Lcom/daaw/lj;->b()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {p0, v2, v0, v3}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v1}, Lcom/daaw/qj;->N()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->s:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/daaw/qj;->w()Lcom/daaw/qj$b;

    move-result-object v2

    sget-object v3, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    if-eq v2, v3, :cond_6

    :cond_5
    invoke-virtual {v0}, Lcom/daaw/qj;->w()Lcom/daaw/qj$b;

    move-result-object v2

    if-ne v2, v1, :cond_7

    :cond_6
    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v2, v2, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v3, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v3, v3, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {v3}, Lcom/daaw/lj;->b()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    return-void

    :cond_7
    :goto_0
    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v1, v0, Lcom/daaw/ft;->j:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_e

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-boolean v4, v1, Lcom/daaw/qj;->a:Z

    if-eqz v4, :cond_e

    iget-object v0, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v4, v0, v2

    iget-object v4, v4, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v4, :cond_b

    aget-object v4, v0, v3

    iget-object v4, v4, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v4, :cond_b

    invoke-virtual {v1}, Lcom/daaw/qj;->T()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lcom/daaw/lj;->b()I

    move-result v1

    iput v1, v0, Lcom/daaw/ft;->f:I

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v3

    goto/16 :goto_7

    :cond_8
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v4, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v4, v4, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v4, v2

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    :cond_9
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    :cond_a
    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iput-boolean v3, v0, Lcom/daaw/ft;->b:Z

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iput-boolean v3, v0, Lcom/daaw/ft;->b:Z

    goto/16 :goto_9

    :cond_b
    aget-object v4, v0, v2

    iget-object v4, v4, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v4, :cond_c

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v3, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v3, v3, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v3, v2

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    goto :goto_1

    :cond_c
    aget-object v2, v0, v3

    iget-object v2, v2, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v2, :cond_d

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v2, v2, Lcom/daaw/ft;->g:I

    neg-int v2, v2

    goto :goto_2

    :cond_d
    instance-of v0, v1, Lcom/daaw/za0;

    if-nez v0, :cond_1a

    invoke-virtual {v1}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    sget-object v1, Lcom/daaw/lj$b;->v:Lcom/daaw/lj$b;

    invoke-virtual {v0, v1}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-nez v0, :cond_1a

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v2}, Lcom/daaw/qj;->O()I

    move-result v2

    :goto_1
    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v2, v2, Lcom/daaw/ft;->g:I

    :goto_2
    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    goto/16 :goto_9

    :cond_e
    iget-object v1, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v4, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v1, v4, :cond_15

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v4, v1, Lcom/daaw/qj;->l:I

    const/4 v5, 0x2

    if-eq v4, v5, :cond_13

    const/4 v5, 0x3

    if-eq v4, v5, :cond_f

    goto/16 :goto_6

    :cond_f
    iget v4, v1, Lcom/daaw/qj;->m:I

    if-ne v4, v5, :cond_12

    iget-object v4, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iput-object p0, v4, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    iget-object v4, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iput-object p0, v4, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    iget-object v4, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v5, v4, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iput-object p0, v5, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    iget-object v4, v4, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iput-object p0, v4, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    iput-object p0, v0, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    invoke-virtual {v1}, Lcom/daaw/qj;->V()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v1, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iput-object p0, v1, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v1, v1, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v1, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    goto :goto_4

    :cond_10
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->T()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v1, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    goto/16 :goto_5

    :cond_11
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    goto :goto_3

    :cond_12
    iget-object v1, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v1, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iput-boolean v3, v0, Lcom/daaw/ft;->b:Z

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    :goto_3
    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    :goto_4
    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    goto :goto_5

    :cond_13
    invoke-virtual {v1}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_6

    :cond_14
    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v1, v1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iput-boolean v3, v0, Lcom/daaw/ft;->b:Z

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    :goto_5
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    :goto_6
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v4, v1, v2

    iget-object v4, v4, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v4, :cond_17

    aget-object v4, v1, v3

    iget-object v4, v4, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v4, :cond_17

    invoke-virtual {v0}, Lcom/daaw/qj;->T()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lcom/daaw/lj;->b()I

    move-result v1

    iput v1, v0, Lcom/daaw/ft;->f:I

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v3

    :goto_7
    invoke-virtual {v1}, Lcom/daaw/lj;->b()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Lcom/daaw/ft;->f:I

    goto/16 :goto_9

    :cond_16
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v3

    invoke-virtual {p0, v1}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v1

    invoke-virtual {v0, p0}, Lcom/daaw/ft;->b(Lcom/daaw/zs;)V

    invoke-virtual {v1, p0}, Lcom/daaw/ft;->b(Lcom/daaw/zs;)V

    sget-object v0, Lcom/daaw/kx1$b;->s:Lcom/daaw/kx1$b;

    iput-object v0, p0, Lcom/daaw/kx1;->j:Lcom/daaw/kx1$b;

    goto :goto_9

    :cond_17
    aget-object v4, v1, v2

    iget-object v4, v4, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v4, :cond_18

    aget-object v0, v1, v2

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v4, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v4, v4, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v4, v2

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    goto :goto_8

    :cond_18
    aget-object v2, v1, v3

    iget-object v2, v2, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v2, :cond_19

    aget-object v0, v1, v3

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    const/4 v2, -0x1

    iget-object v3, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/kx1;->c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V

    goto :goto_9

    :cond_19
    instance-of v1, v0, Lcom/daaw/za0;

    if-nez v1, :cond_1a

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v2}, Lcom/daaw/qj;->O()I

    move-result v2

    :goto_8
    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {p0, v0, v1, v3, v2}, Lcom/daaw/kx1;->c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V

    :cond_1a
    :goto_9
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v1, v0, Lcom/daaw/ft;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v0, v0, Lcom/daaw/ft;->g:I

    invoke-virtual {v1, v0}, Lcom/daaw/qj;->C0(I)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/kx1;->c:Lcom/daaw/l61;

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-virtual {v0}, Lcom/daaw/ft;->c()V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-virtual {v0}, Lcom/daaw/ft;->c()V

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0}, Lcom/daaw/ft;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/kx1;->g:Z

    return-void
.end method

.method public m()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v0, v0, Lcom/daaw/qj;->l:I

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method public final q([IIIIIFI)V
    .locals 2

    sub-int/2addr p3, p2

    sub-int/2addr p5, p4

    const/4 p2, -0x1

    const/4 p4, 0x0

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x1

    if-eq p7, p2, :cond_2

    if-eqz p7, :cond_1

    if-eq p7, v1, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p2, p3

    mul-float p2, p2, p6

    add-float/2addr p2, v0

    float-to-int p2, p2

    aput p3, p1, p4

    aput p2, p1, v1

    goto :goto_0

    :cond_1
    int-to-float p2, p5

    mul-float p2, p2, p6

    add-float/2addr p2, v0

    float-to-int p2, p2

    aput p2, p1, p4

    aput p5, p1, v1

    goto :goto_0

    :cond_2
    int-to-float p2, p5

    mul-float p2, p2, p6

    add-float/2addr p2, v0

    float-to-int p2, p2

    int-to-float p7, p3

    div-float/2addr p7, p6

    add-float/2addr p7, v0

    float-to-int p6, p7

    if-gt p2, p3, :cond_3

    aput p2, p1, p4

    aput p5, p1, v1

    goto :goto_0

    :cond_3
    if-gt p6, p5, :cond_4

    aput p3, p1, p4

    aput p6, p1, v1

    :cond_4
    :goto_0
    return-void
.end method

.method public r()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/kx1;->g:Z

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-virtual {v1}, Lcom/daaw/ft;->c()V

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iput-boolean v0, v1, Lcom/daaw/ft;->j:Z

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-virtual {v1}, Lcom/daaw/ft;->c()V

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iput-boolean v0, v1, Lcom/daaw/ft;->j:Z

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iput-boolean v0, v1, Lcom/daaw/ft;->j:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HorizontalRun "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v1}, Lcom/daaw/qj;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
