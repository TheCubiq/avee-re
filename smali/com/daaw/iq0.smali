.class public Lcom/daaw/iq0;
.super Lcom/daaw/tv;
.source ""


# static fields
.field public static final M:[Ljava/lang/String;

.field public static final N:[Ljava/lang/String;


# instance fields
.field public G:I

.field public H:Lcom/daaw/vv;

.field public I:I

.field public J:Z

.field public final K:Lcom/daaw/pr1;

.field public L:Lcom/daaw/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "composition:0"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/iq0;->M:[Ljava/lang/String;

    const-string v0, "Horizontal"

    const-string v1, "Vertical"

    const-string v2, "HorizontalAndVertical"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/iq0;->N:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x4

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    const/4 v2, -0x1

    iput v2, p0, Lcom/daaw/iq0;->G:I

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/iq0;->I:I

    iput-boolean v2, p0, Lcom/daaw/iq0;->J:Z

    new-instance v2, Lcom/daaw/pr1;

    invoke-direct {v2}, Lcom/daaw/pr1;-><init>()V

    iput-object v2, p0, Lcom/daaw/iq0;->K:Lcom/daaw/pr1;

    new-instance v2, Lcom/daaw/iq0$b;

    invoke-direct {v2, p0}, Lcom/daaw/iq0$b;-><init>(Lcom/daaw/iq0;)V

    iput-object v2, p0, Lcom/daaw/iq0;->L:Lcom/daaw/g0;

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->J(I)V

    invoke-virtual {p0, v1, v1}, Lcom/daaw/tv;->R(FF)V

    new-instance v0, Lcom/daaw/vv;

    new-instance v1, Lcom/daaw/iq0$a;

    invoke-direct {v1, p0}, Lcom/daaw/iq0$a;-><init>(Lcom/daaw/iq0;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/daaw/vv;-><init>(Lcom/daaw/vv$b;Lcom/daaw/r40;Lcom/daaw/s40;Lcom/daaw/s40;)V

    iput-object v0, p0, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    const-string v0, "composition:1"

    invoke-virtual {p0, v0}, Lcom/daaw/iq0;->f0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic Y(Lcom/daaw/iq0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/tv;->m()V

    return-void
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 25

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    iget-object v0, v6, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    move-object/from16 v1, p2

    invoke-virtual {v0, v15, v1}, Lcom/daaw/vv;->u(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-super/range {p0 .. p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/tv;->n(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/tv;->s(Lcom/daaw/aq0;)F

    move-result v5

    iget-object v2, v6, Lcom/daaw/iq0;->K:Lcom/daaw/pr1;

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/tv;->b(Lcom/daaw/y31;Lcom/daaw/pr1;FFF)V

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v2, Lcom/daaw/bs1;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v2, v3, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iget-object v4, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v4}, Lcom/daaw/y31$c;->t()Lcom/daaw/qr1;

    move-result-object v4

    iget-object v5, v6, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    invoke-virtual {v5, v15}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v5

    new-instance v13, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v7

    iget-object v8, v6, Lcom/daaw/iq0;->L:Lcom/daaw/g0;

    invoke-direct {v13, v7, v5, v4, v8}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    iget v4, v6, Lcom/daaw/iq0;->I:I

    const/high16 v5, 0x3f000000    # 0.5f

    if-nez v4, :cond_2

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    iget-boolean v7, v6, Lcom/daaw/iq0;->J:Z

    if-eqz v7, :cond_0

    iput v1, v0, Lcom/daaw/bs1;->a:F

    goto :goto_0

    :cond_0
    iput v3, v0, Lcom/daaw/bs1;->a:F

    :goto_0
    iput v3, v0, Lcom/daaw/bs1;->b:F

    iput v5, v2, Lcom/daaw/bs1;->a:F

    iput v1, v2, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    iget v12, v14, Landroid/graphics/RectF;->left:F

    iget v11, v14, Landroid/graphics/RectF;->top:F

    iget v10, v14, Landroid/graphics/RectF;->bottom:F

    const/16 v17, 0x0

    iget v9, v6, Lcom/daaw/iq0;->G:I

    move-object/from16 v8, p1

    move/from16 v18, v9

    move v9, v12

    move/from16 v16, v10

    move v10, v11

    move/from16 v19, v11

    move v11, v4

    move/from16 v20, v12

    move/from16 v12, v19

    move-object/from16 v22, v13

    move v13, v4

    move-object/from16 v23, v14

    move/from16 v14, v16

    move/from16 v15, v20

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    invoke-virtual/range {v7 .. v21}, Lcom/daaw/tc;->l(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    iget-boolean v7, v6, Lcom/daaw/iq0;->J:Z

    iput v5, v0, Lcom/daaw/bs1;->a:F

    iput v3, v0, Lcom/daaw/bs1;->b:F

    if-eqz v7, :cond_1

    iput v1, v2, Lcom/daaw/bs1;->a:F

    goto :goto_1

    :cond_1
    iput v3, v2, Lcom/daaw/bs1;->a:F

    :goto_1
    iput v1, v2, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    move-object/from16 v15, v23

    iget v12, v15, Landroid/graphics/RectF;->top:F

    iget v13, v15, Landroid/graphics/RectF;->right:F

    iget v1, v15, Landroid/graphics/RectF;->bottom:F

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/iq0;->G:I

    move-object/from16 v8, p1

    move v9, v4

    move v10, v12

    move v11, v13

    move v14, v1

    move v15, v4

    :goto_2
    move/from16 v16, v1

    move/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    invoke-virtual/range {v7 .. v21}, Lcom/daaw/tc;->l(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    goto/16 :goto_9

    :cond_2
    move-object/from16 v22, v13

    move-object v15, v14

    const/4 v7, 0x1

    if-ne v4, v7, :cond_5

    iget-boolean v4, v6, Lcom/daaw/iq0;->J:Z

    iput v1, v0, Lcom/daaw/bs1;->a:F

    if-eqz v4, :cond_3

    iput v1, v0, Lcom/daaw/bs1;->b:F

    goto :goto_3

    :cond_3
    iput v3, v0, Lcom/daaw/bs1;->b:F

    :goto_3
    iput v3, v2, Lcom/daaw/bs1;->a:F

    iput v5, v2, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    iget v9, v15, Landroid/graphics/RectF;->left:F

    iget v12, v15, Landroid/graphics/RectF;->top:F

    iget v13, v15, Landroid/graphics/RectF;->right:F

    invoke-virtual {v15}, Landroid/graphics/RectF;->centerY()F

    move-result v14

    iget v4, v15, Landroid/graphics/RectF;->left:F

    invoke-virtual {v15}, Landroid/graphics/RectF;->centerY()F

    move-result v16

    const/16 v17, 0x0

    iget v11, v6, Lcom/daaw/iq0;->G:I

    move-object/from16 v8, p1

    move v10, v12

    move/from16 v18, v11

    move v11, v13

    move-object/from16 v24, v15

    move v15, v4

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    invoke-virtual/range {v7 .. v21}, Lcom/daaw/tc;->l(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    iget-boolean v4, v6, Lcom/daaw/iq0;->J:Z

    iput v1, v0, Lcom/daaw/bs1;->a:F

    iput v5, v0, Lcom/daaw/bs1;->b:F

    iput v3, v2, Lcom/daaw/bs1;->a:F

    if-eqz v4, :cond_4

    iput v1, v2, Lcom/daaw/bs1;->b:F

    goto :goto_4

    :cond_4
    iput v3, v2, Lcom/daaw/bs1;->b:F

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    move-object/from16 v15, v24

    iget v9, v15, Landroid/graphics/RectF;->left:F

    invoke-virtual {v15}, Landroid/graphics/RectF;->centerY()F

    move-result v10

    iget v11, v15, Landroid/graphics/RectF;->right:F

    invoke-virtual {v15}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    iget v13, v15, Landroid/graphics/RectF;->right:F

    iget v1, v15, Landroid/graphics/RectF;->bottom:F

    iget v15, v15, Landroid/graphics/RectF;->left:F

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/iq0;->G:I

    move-object/from16 v8, p1

    move v14, v1

    goto :goto_2

    :cond_5
    const/4 v7, 0x2

    if-ne v4, v7, :cond_a

    iget-boolean v4, v6, Lcom/daaw/iq0;->J:Z

    if-eqz v4, :cond_6

    iput v1, v0, Lcom/daaw/bs1;->a:F

    goto :goto_5

    :cond_6
    iput v3, v0, Lcom/daaw/bs1;->a:F

    :goto_5
    iput v3, v0, Lcom/daaw/bs1;->b:F

    iput v5, v2, Lcom/daaw/bs1;->a:F

    iput v5, v2, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    iget v9, v15, Landroid/graphics/RectF;->left:F

    iget v10, v15, Landroid/graphics/RectF;->top:F

    invoke-virtual {v15}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    iget v12, v15, Landroid/graphics/RectF;->top:F

    invoke-virtual {v15}, Landroid/graphics/RectF;->centerX()F

    move-result v13

    invoke-virtual {v15}, Landroid/graphics/RectF;->centerY()F

    move-result v14

    iget v4, v15, Landroid/graphics/RectF;->left:F

    invoke-virtual {v15}, Landroid/graphics/RectF;->centerY()F

    move-result v16

    const/16 v17, 0x0

    iget v8, v6, Lcom/daaw/iq0;->G:I

    move/from16 v18, v8

    move-object/from16 v8, p1

    move-object/from16 v23, v15

    move v15, v4

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    invoke-virtual/range {v7 .. v21}, Lcom/daaw/tc;->l(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    iget-boolean v4, v6, Lcom/daaw/iq0;->J:Z

    iput v5, v0, Lcom/daaw/bs1;->a:F

    iput v3, v0, Lcom/daaw/bs1;->b:F

    if-eqz v4, :cond_7

    iput v1, v2, Lcom/daaw/bs1;->a:F

    goto :goto_6

    :cond_7
    iput v3, v2, Lcom/daaw/bs1;->a:F

    :goto_6
    iput v5, v2, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    invoke-virtual/range {v23 .. v23}, Landroid/graphics/RectF;->centerX()F

    move-result v9

    move-object/from16 v4, v23

    iget v12, v4, Landroid/graphics/RectF;->top:F

    iget v13, v4, Landroid/graphics/RectF;->right:F

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v14

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v15

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v16

    const/16 v17, 0x0

    iget v11, v6, Lcom/daaw/iq0;->G:I

    move-object/from16 v8, p1

    move v10, v12

    move/from16 v18, v11

    move v11, v13

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    invoke-virtual/range {v7 .. v21}, Lcom/daaw/tc;->l(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    iget-boolean v7, v6, Lcom/daaw/iq0;->J:Z

    if-eqz v7, :cond_8

    iput v1, v0, Lcom/daaw/bs1;->a:F

    goto :goto_7

    :cond_8
    iput v3, v0, Lcom/daaw/bs1;->a:F

    :goto_7
    iput v5, v0, Lcom/daaw/bs1;->b:F

    iput v5, v2, Lcom/daaw/bs1;->a:F

    iput v3, v2, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    iget v9, v4, Landroid/graphics/RectF;->left:F

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v10

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v13

    iget v15, v4, Landroid/graphics/RectF;->bottom:F

    iget v14, v4, Landroid/graphics/RectF;->left:F

    const/16 v17, 0x0

    iget v8, v6, Lcom/daaw/iq0;->G:I

    move/from16 v18, v8

    move-object/from16 v8, p1

    move/from16 v16, v14

    move v14, v15

    move/from16 v19, v15

    move/from16 v15, v16

    move/from16 v16, v19

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    invoke-virtual/range {v7 .. v21}, Lcom/daaw/tc;->l(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    iget-boolean v7, v6, Lcom/daaw/iq0;->J:Z

    iput v5, v0, Lcom/daaw/bs1;->a:F

    iput v5, v0, Lcom/daaw/bs1;->b:F

    if-eqz v7, :cond_9

    iput v1, v2, Lcom/daaw/bs1;->a:F

    goto :goto_8

    :cond_9
    iput v3, v2, Lcom/daaw/bs1;->a:F

    :goto_8
    iput v3, v2, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v9

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v10

    iget v11, v4, Landroid/graphics/RectF;->right:F

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    iget v13, v4, Landroid/graphics/RectF;->right:F

    iget v14, v4, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v15

    iget v1, v4, Landroid/graphics/RectF;->bottom:F

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/iq0;->G:I

    move-object/from16 v8, p1

    goto/16 :goto_2

    :cond_a
    :goto_9
    return-void
.end method

.method public Z()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/iq0;->J:Z

    return v0
.end method

.method public a0()I
    .locals 1

    iget v0, p0, Lcom/daaw/iq0;->I:I

    return v0
.end method

.method public b0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/iq0;->G:I

    return-void
.end method

.method public d0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/iq0;->J:Z

    return-void
.end method

.method public e0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/iq0;->I:I

    return-void
.end method

.method public f0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->C(Ljava/lang/String;)V

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "MirrorEffect"

    return-object v0
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/tv;->l()V

    iget-object v0, p0, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vv;->p()V

    :cond_0
    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/daaw/tv;->t(Lcom/daaw/un;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->u(Lcom/daaw/un;)V

    const-string v0, "TargetImage"

    const-string v1, "composition:1"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/iq0;->f0(Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/iq0;->N:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const-string v3, "mirrorMode"

    invoke-virtual {p1, v3, v2}, Lcom/daaw/un;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/daaw/br1;->e([Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/iq0;->e0(I)V

    const-string v0, "flipMirror"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/iq0;->d0(Z)V

    const-string v0, "color"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/iq0;->c0(I)V

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 3

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->q(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/vv;->q(Lcom/daaw/y31;Landroid/graphics/RectF;I)Z

    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    move-result p1

    return p1
.end method

.method public w(Lcom/daaw/y31;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->r(Lcom/daaw/y31;I)Z

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->w(Lcom/daaw/y31;I)V

    return-void
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    iget-object v0, p0, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->s(Lcom/daaw/y31;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    iget-object v0, p0, Lcom/daaw/iq0;->H:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vv;->t(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 3

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->A(Lcom/daaw/un;)V

    const v0, 0x7f1002a3

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/iq0;->b0()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/od0;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/iq0;->b0()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/iq0;->M:[Ljava/lang/String;

    const-string v1, "TargetImage"

    const-string v2, "1_appearance"

    invoke-virtual {p1, v1, p2, v2, v0}, Lcom/daaw/un;->f0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    sget-object p2, Lcom/daaw/iq0;->N:[Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/iq0;->a0()I

    move-result v0

    const/4 v1, 0x0

    aget-object v1, p2, v1

    invoke-static {p2, v0, v1}, Lcom/daaw/br1;->a([Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "mirrorMode"

    invoke-virtual {p1, v1, v0, v2, p2}, Lcom/daaw/un;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/iq0;->Z()Z

    move-result p2

    const-string v0, "flipMirror"

    invoke-virtual {p1, v0, p2, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget p2, p0, Lcom/daaw/iq0;->G:I

    const-string v0, "color"

    invoke-virtual {p1, v0, p2, v2}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method
