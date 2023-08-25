.class public Lcom/daaw/ze0;
.super Lcom/daaw/xe0;
.source ""


# instance fields
.field public M:[F

.field public N:[F

.field public O:Lcom/daaw/xn0;

.field public P:Lcom/daaw/dm0;

.field public Q:Z

.field public R:I

.field public S:I

.field public T:Z

.field public U:Z

.field public V:Lcom/daaw/ge0;

.field public W:[F

.field public X:[F

.field public final Y:Lcom/daaw/pr1;

.field public Z:Lcom/daaw/vv;

.field public a0:I

.field public b0:Lcom/daaw/g0;
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

.field public c0:Lcom/daaw/g0;
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
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/daaw/xe0;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/daaw/ze0;->M:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_1

    iput-object v1, p0, Lcom/daaw/ze0;->N:[F

    invoke-static {}, Lcom/daaw/xn0;->a()Lcom/daaw/xn0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/ze0;->O:Lcom/daaw/xn0;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Lcom/daaw/dm0;->a(F)Lcom/daaw/dm0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/ze0;->P:Lcom/daaw/dm0;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/ze0;->Q:Z

    const/4 v2, 0x5

    iput v2, p0, Lcom/daaw/ze0;->R:I

    const/4 v2, 0x7

    iput v2, p0, Lcom/daaw/ze0;->S:I

    iput-boolean v1, p0, Lcom/daaw/ze0;->T:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/daaw/ze0;->U:Z

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/daaw/ze0;->V:Lcom/daaw/ge0;

    new-array v3, v0, [F

    iput-object v3, p0, Lcom/daaw/ze0;->W:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/daaw/ze0;->X:[F

    new-instance v0, Lcom/daaw/pr1;

    invoke-direct {v0}, Lcom/daaw/pr1;-><init>()V

    iput-object v0, p0, Lcom/daaw/ze0;->Y:Lcom/daaw/pr1;

    iput v1, p0, Lcom/daaw/ze0;->a0:I

    new-instance v0, Lcom/daaw/ze0$d;

    invoke-direct {v0, p0}, Lcom/daaw/ze0$d;-><init>(Lcom/daaw/ze0;)V

    iput-object v0, p0, Lcom/daaw/ze0;->b0:Lcom/daaw/g0;

    new-instance v0, Lcom/daaw/ze0$e;

    invoke-direct {v0, p0}, Lcom/daaw/ze0$e;-><init>(Lcom/daaw/ze0;)V

    iput-object v0, p0, Lcom/daaw/ze0;->c0:Lcom/daaw/g0;

    new-instance v0, Lcom/daaw/ze0$a;

    invoke-direct {v0, p0}, Lcom/daaw/ze0$a;-><init>(Lcom/daaw/ze0;)V

    new-instance v1, Lcom/daaw/ze0$b;

    invoke-direct {v1, p0}, Lcom/daaw/ze0$b;-><init>(Lcom/daaw/ze0;)V

    invoke-virtual {p0, v0, v1}, Lcom/daaw/xe0;->Z(Lcom/daaw/s40;Lcom/daaw/s40;)V

    new-instance v0, Lcom/daaw/vv;

    new-instance v1, Lcom/daaw/ze0$c;

    invoke-direct {v1, p0}, Lcom/daaw/ze0$c;-><init>(Lcom/daaw/ze0;)V

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/daaw/vv;-><init>(Lcom/daaw/vv$b;Lcom/daaw/r40;Lcom/daaw/s40;Lcom/daaw/s40;)V

    iput-object v0, p0, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static synthetic f0(Lcom/daaw/ze0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/ze0;->Q:Z

    return p0
.end method

.method public static synthetic g0(Lcom/daaw/ze0;)I
    .locals 0

    iget p0, p0, Lcom/daaw/ze0;->R:I

    return p0
.end method

.method public static synthetic h0(Lcom/daaw/ze0;)I
    .locals 0

    iget p0, p0, Lcom/daaw/ze0;->S:I

    return p0
.end method

.method public static synthetic i0(Lcom/daaw/ze0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/ze0;->T:Z

    return p0
.end method

.method public static synthetic j0(Lcom/daaw/ze0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/ze0;->U:Z

    return p0
.end method

.method public static synthetic k0(Lcom/daaw/ze0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/tv;->m()V

    return-void
.end method

.method public static synthetic l0(Lcom/daaw/ze0;)Lcom/daaw/pr1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ze0;->Y:Lcom/daaw/pr1;

    return-object p0
.end method

.method public static synthetic m0(Lcom/daaw/ze0;)Lcom/daaw/dm0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ze0;->P:Lcom/daaw/dm0;

    return-object p0
.end method

.method public static synthetic n0(Lcom/daaw/ze0;)I
    .locals 0

    iget p0, p0, Lcom/daaw/ze0;->a0:I

    return p0
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 23

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    invoke-super/range {p0 .. p2}, Lcom/daaw/xe0;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-object v0, v6, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    move-object/from16 v1, p2

    invoke-virtual {v0, v15, v1}, Lcom/daaw/vv;->u(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-object v0, v6, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0, v15}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v0

    iget-object v1, v6, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v1, v15}, Lcom/daaw/vv;->n(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v7

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, v6, Lcom/daaw/xe0;->I:Lcom/daaw/xn0;

    iget-object v2, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v2, v2, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {v1, v2}, Lcom/daaw/xn0;->i(Lcom/daaw/aq0;)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v1, v1, v2

    invoke-interface {v0, v1}, Lcom/daaw/qc0;->c(F)Lcom/daaw/qc0;

    move-result-object v8

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

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/ze0;->o0(Lcom/daaw/aq0;)I

    move-result v13

    iget-object v2, v6, Lcom/daaw/ze0;->Y:Lcom/daaw/pr1;

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/tv;->b(Lcom/daaw/y31;Lcom/daaw/pr1;FFF)V

    const/4 v0, 0x0

    iget-object v1, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v1}, Lcom/daaw/y31$c;->s()Lcom/daaw/qr1;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [Lcom/daaw/qc0;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    iget-object v5, v6, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    invoke-virtual {v5, v15}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v5

    const/4 v9, 0x1

    aput-object v5, v3, v9

    new-instance v5, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v17

    iget-object v10, v6, Lcom/daaw/ze0;->c0:Lcom/daaw/g0;

    const/16 v21, 0x1

    move-object/from16 v16, v5

    move-object/from16 v18, v3

    move-object/from16 v19, v1

    move-object/from16 v20, v10

    invoke-direct/range {v16 .. v21}, Lcom/daaw/w31;-><init>(I[Lcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;I)V

    iget-object v3, v6, Lcom/daaw/ze0;->V:Lcom/daaw/ge0;

    if-nez v3, :cond_8

    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v10

    iget-boolean v11, v6, Lcom/daaw/ze0;->U:Z

    const/high16 v12, 0x3f800000    # 1.0f

    if-nez v11, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/xe0;->Y()Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v19, v0

    :goto_0
    move v0, v10

    goto :goto_6

    :cond_2
    :goto_1
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v10

    div-float/2addr v3, v10

    if-nez v8, :cond_3

    const/high16 v10, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_3
    invoke-interface {v8}, Lcom/daaw/qc0;->getWidth()I

    move-result v10

    int-to-float v10, v10

    invoke-interface {v8}, Lcom/daaw/qc0;->getHeight()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v10, v8

    :goto_2
    cmpl-float v3, v10, v3

    if-lez v3, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/xe0;->Y()Z

    move-result v8

    if-eqz v8, :cond_5

    if-nez v3, :cond_6

    goto :goto_4

    :cond_5
    if-eqz v3, :cond_6

    :goto_4
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float v8, v3, v10

    move v10, v8

    goto :goto_5

    :cond_6
    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v3

    mul-float v10, v10, v3

    move/from16 v22, v10

    move v10, v3

    move/from16 v3, v22

    :goto_5
    if-eqz v7, :cond_1

    new-array v0, v2, [Lcom/daaw/qc0;

    aput-object v7, v0, v4

    iget-object v2, v6, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    invoke-virtual {v2, v15}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v2

    aput-object v2, v0, v9

    new-instance v2, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v4

    iget-object v7, v6, Lcom/daaw/ze0;->c0:Lcom/daaw/g0;

    invoke-direct {v2, v4, v0, v1, v7}, Lcom/daaw/w31;-><init>(I[Lcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    move-object/from16 v19, v2

    goto :goto_0

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/xe0;->Y()Z

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    if-eqz v1, :cond_7

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    mul-float v4, v3, v2

    sub-float/2addr v1, v4

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    mul-float v7, v0, v2

    sub-float/2addr v4, v7

    div-float v7, v3, v3

    sub-float/2addr v7, v12

    mul-float v7, v7, v2

    div-float v8, v0, v0

    sub-float/2addr v8, v12

    mul-float v8, v8, v2

    iget-object v2, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v2}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v2

    new-instance v10, Lcom/daaw/bs1;

    const/4 v9, 0x0

    sub-float v11, v9, v7

    sub-float/2addr v9, v8

    invoke-direct {v10, v11, v9}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v11, Lcom/daaw/bs1;

    add-float/2addr v7, v12

    add-float/2addr v8, v12

    invoke-direct {v11, v7, v8}, Lcom/daaw/bs1;-><init>(FF)V

    const/16 v18, 0x0

    move-object v7, v2

    move-object/from16 v8, p1

    move v9, v1

    move-object v2, v10

    move v10, v4

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move v12, v3

    move/from16 p2, v13

    move v13, v0

    move-object/from16 v20, v14

    move/from16 v14, p2

    move-object v15, v2

    move-object/from16 v17, v5

    invoke-virtual/range {v7 .. v18}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    move-object/from16 v2, p1

    goto :goto_7

    :cond_7
    move/from16 p2, v13

    move-object/from16 v20, v14

    invoke-virtual/range {v20 .. v20}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    mul-float v4, v3, v2

    sub-float/2addr v1, v4

    invoke-virtual/range {v20 .. v20}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    mul-float v2, v2, v0

    sub-float/2addr v4, v2

    move-object/from16 v2, p1

    iget-object v7, v2, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v7}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v7

    const/4 v11, 0x0

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v15

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v16

    const/16 v18, 0x0

    move-object/from16 v8, p1

    move v9, v1

    move v10, v4

    move v12, v3

    move v13, v0

    move/from16 v14, p2

    move-object/from16 v17, v5

    invoke-virtual/range {v7 .. v18}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    :goto_7
    if-eqz v19, :cond_9

    new-instance v5, Landroid/graphics/RectF;

    add-float/2addr v3, v1

    add-float/2addr v0, v4

    invoke-direct {v5, v1, v4, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, v20

    move-object v4, v5

    move-object/from16 v5, v19

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/ze0;->r0(Lcom/daaw/y31;ILandroid/graphics/RectF;Landroid/graphics/RectF;Lcom/daaw/w31;)V

    goto :goto_8

    :cond_8
    move v1, v13

    move-object v0, v14

    move-object v2, v15

    invoke-virtual {v6, v2, v0, v1, v5}, Lcom/daaw/ze0;->q0(Lcom/daaw/y31;Landroid/graphics/RectF;ILcom/daaw/w31;)V

    :cond_9
    :goto_8
    return-void
.end method

.method public a0(Lcom/daaw/y31;)V
    .locals 0

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "Image"

    return-object v0
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/xe0;->l()V

    iget-object v0, p0, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vv;->p()V

    :cond_0
    return-void
.end method

.method public final o0(Lcom/daaw/aq0;)I
    .locals 3

    iget-object v0, p0, Lcom/daaw/ze0;->O:Lcom/daaw/xn0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/xn0;->j(Lcom/daaw/aq0;F)F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget-object v0, p0, Lcom/daaw/ze0;->M:[F

    iget-object v1, p0, Lcom/daaw/ze0;->N:[F

    iget-object v2, p0, Lcom/daaw/ze0;->W:[F

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/br1;->r([F[F[FF)V

    iget-object p1, p0, Lcom/daaw/ze0;->W:[F

    invoke-static {p1}, Lcom/daaw/f80;->k([F)I

    move-result p1

    return p1
.end method

.method public p0()I
    .locals 1

    iget v0, p0, Lcom/daaw/ze0;->a0:I

    return v0
.end method

.method public final q0(Lcom/daaw/y31;Landroid/graphics/RectF;ILcom/daaw/w31;)V
    .locals 12

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v0, v1

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/w31;->f()Lcom/daaw/qc0;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/qc0;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/w31;->f()Lcom/daaw/qc0;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/qc0;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    cmpl-float v2, v1, v0

    if-lez v2, :cond_0

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    div-float v2, v0, v1

    goto :goto_0

    :cond_0
    cmpg-float v0, v1, v0

    if-gez v0, :cond_1

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v2

    mul-float v0, v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v2

    :goto_0
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_2

    div-float v0, v3, v1

    move v3, v0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    mul-float v1, v1, v3

    :goto_1
    const/high16 v0, 0x3f000000    # 0.5f

    mul-float v3, v3, v0

    mul-float v1, v1, v0

    move-object v2, p1

    iget-object v4, v2, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v4}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v4

    new-instance v8, Lcom/daaw/bs1;

    sub-float v5, v0, v3

    add-float v6, v1, v0

    invoke-direct {v8, v5, v6}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v9, Lcom/daaw/bs1;

    add-float/2addr v3, v0

    sub-float/2addr v0, v1

    invoke-direct {v9, v3, v0}, Lcom/daaw/bs1;-><init>(FF)V

    move-object v0, p0

    iget-object v11, v0, Lcom/daaw/ze0;->V:Lcom/daaw/ge0;

    move-object v5, p1

    move-object v6, p2

    move v7, p3

    move-object/from16 v10, p4

    invoke-virtual/range {v4 .. v11}, Lcom/daaw/tc;->u(Lcom/daaw/y31;Landroid/graphics/RectF;ILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Lcom/daaw/ge0;)V

    return-void
.end method

.method public r0(Lcom/daaw/y31;ILandroid/graphics/RectF;Landroid/graphics/RectF;Lcom/daaw/w31;)V
    .locals 19

    move-object/from16 v12, p1

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->width()F

    move-result v15

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->height()F

    move-result v16

    new-instance v11, Landroid/graphics/RectF;

    invoke-direct {v11}, Landroid/graphics/RectF;-><init>()V

    iget v0, v13, Landroid/graphics/RectF;->left:F

    iget v1, v13, Landroid/graphics/RectF;->top:F

    iget v2, v13, Landroid/graphics/RectF;->right:F

    iget v3, v14, Landroid/graphics/RectF;->top:F

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/4 v10, 0x0

    cmpl-float v0, v0, v10

    if-lez v0, :cond_0

    iget-object v0, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v0

    iget v2, v11, Landroid/graphics/RectF;->left:F

    iget v3, v11, Landroid/graphics/RectF;->top:F

    const/4 v4, 0x0

    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    move-result v5

    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    move-result v6

    new-instance v8, Lcom/daaw/bs1;

    iget v1, v14, Landroid/graphics/RectF;->bottom:F

    div-float v1, v1, v16

    invoke-direct {v8, v10, v1}, Lcom/daaw/bs1;-><init>(FF)V

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v9

    const/16 v17, 0x0

    move-object/from16 v1, p1

    move/from16 v7, p2

    move-object/from16 v10, p5

    move/from16 v18, v15

    move-object v15, v11

    move/from16 v11, v17

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    goto :goto_0

    :cond_0
    move/from16 v18, v15

    move-object v15, v11

    :goto_0
    iget v0, v13, Landroid/graphics/RectF;->left:F

    iget v1, v14, Landroid/graphics/RectF;->bottom:F

    iget v2, v13, Landroid/graphics/RectF;->right:F

    iget v3, v13, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    cmpl-float v0, v0, v10

    if-lez v0, :cond_1

    iget-object v0, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v0

    iget v2, v15, Landroid/graphics/RectF;->left:F

    iget v3, v15, Landroid/graphics/RectF;->top:F

    const/4 v4, 0x0

    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v5

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v6

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v8

    new-instance v9, Lcom/daaw/bs1;

    iget v1, v14, Landroid/graphics/RectF;->top:F

    div-float v1, v1, v16

    invoke-direct {v9, v11, v1}, Lcom/daaw/bs1;-><init>(FF)V

    const/16 v16, 0x0

    move-object/from16 v1, p1

    move/from16 v7, p2

    move-object/from16 v10, p5

    move/from16 v11, v16

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    :cond_1
    iget v0, v13, Landroid/graphics/RectF;->left:F

    iget v1, v14, Landroid/graphics/RectF;->top:F

    iget v2, v14, Landroid/graphics/RectF;->left:F

    iget v3, v14, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/4 v11, 0x0

    cmpl-float v0, v0, v11

    if-lez v0, :cond_2

    iget-object v0, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v0

    iget v2, v15, Landroid/graphics/RectF;->left:F

    iget v3, v15, Landroid/graphics/RectF;->top:F

    const/4 v4, 0x0

    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v5

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v6

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v8

    new-instance v9, Lcom/daaw/bs1;

    iget v1, v14, Landroid/graphics/RectF;->left:F

    div-float v1, v1, v18

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v9, v1, v7}, Lcom/daaw/bs1;-><init>(FF)V

    const/16 v16, 0x0

    move-object/from16 v1, p1

    move/from16 v7, p2

    move-object/from16 v10, p5

    const/4 v12, 0x0

    move/from16 v11, v16

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    :goto_1
    iget v0, v14, Landroid/graphics/RectF;->right:F

    iget v1, v14, Landroid/graphics/RectF;->top:F

    iget v2, v13, Landroid/graphics/RectF;->right:F

    iget v3, v14, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v0

    cmpl-float v0, v0, v12

    if-lez v0, :cond_3

    move-object/from16 v1, p1

    const/4 v0, 0x0

    iget-object v2, v1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v2}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v2

    iget v3, v15, Landroid/graphics/RectF;->left:F

    iget v4, v15, Landroid/graphics/RectF;->top:F

    const/4 v5, 0x0

    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v6

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v7

    new-instance v8, Lcom/daaw/bs1;

    iget v9, v14, Landroid/graphics/RectF;->right:F

    div-float v9, v9, v18

    invoke-direct {v8, v9, v0}, Lcom/daaw/bs1;-><init>(FF)V

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v9

    const/4 v11, 0x0

    move-object v0, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move/from16 v7, p2

    move-object/from16 v10, p5

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    :cond_3
    return-void
.end method

.method public s0(ZII)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ze0;->Q:Z

    if-ne v0, p1, :cond_0

    iget v0, p0, Lcom/daaw/ze0;->R:I

    if-ne v0, p2, :cond_0

    iget v0, p0, Lcom/daaw/ze0;->S:I

    if-ne v0, p3, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/ze0;->Q:Z

    iput p2, p0, Lcom/daaw/ze0;->R:I

    iput p3, p0, Lcom/daaw/ze0;->S:I

    invoke-virtual {p0}, Lcom/daaw/ze0;->l()V

    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/daaw/xe0;->t(Lcom/daaw/un;)V

    const-string v0, "keepAspectRatio"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ze0;->u0(Z)V

    const-string v0, "blurredBorder"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ze0;->t0(Z)V

    const/4 v0, 0x4

    new-array v2, v0, [F

    fill-array-data v2, :array_0

    const-string v3, "Color"

    invoke-virtual {p1, v3, v2}, Lcom/daaw/un;->m(Ljava/lang/String;[F)[F

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/ze0;->M:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    const-string v2, "ColorTo"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->m(Ljava/lang/String;[F)[F

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ze0;->N:[F

    const-string v0, "MeasureColorBlend"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/ze0;->O:Lcom/daaw/xn0;

    const-string v3, "Nothing"

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-virtual {v2, v0, v3, v4, v4}, Lcom/daaw/xn0;->n(Lcom/daaw/un;Ljava/lang/String;FF)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lcom/daaw/dm0;->a(F)Lcom/daaw/dm0;

    move-result-object v0

    const-string v2, "saturation"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ze0;->P:Lcom/daaw/dm0;

    const-string v0, "blurEnabled"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "blurDivider"

    const/4 v3, 0x5

    invoke-virtual {p1, v2, v3}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "blurRadius"

    const/4 v4, 0x7

    invoke-virtual {p1, v3, v4}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {p0, v0, v2, v3}, Lcom/daaw/ze0;->s0(ZII)V

    const-string v0, "Shape"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    const-string v2, "None"

    invoke-virtual {v0, v2}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/ze0;->V:Lcom/daaw/ge0;

    invoke-static {v2, v3}, Lcom/daaw/pa1;->a(Ljava/lang/String;Lcom/daaw/ge0;)Lcom/daaw/ge0;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/ze0;->V:Lcom/daaw/ge0;

    if-eqz v2, :cond_0

    invoke-interface {v2, v0}, Lcom/daaw/zc0;->a(Lcom/daaw/un;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    const/4 v2, 0x0

    const-string v3, "MaskImage"

    invoke-virtual {p1, v3, v2}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/vv;->C(Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/bf0;->a:[Ljava/lang/String;

    const-string v2, "maskMode"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/un;->v(Ljava/lang/String;[Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/ze0;->v0(I)V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public t0(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ze0;->T:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/ze0;->T:Z

    invoke-virtual {p0}, Lcom/daaw/ze0;->l()V

    return-void
.end method

.method public u0(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ze0;->U:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/ze0;->U:Z

    invoke-virtual {p0}, Lcom/daaw/ze0;->l()V

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/xe0;->v(Lcom/daaw/y31;)Z

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->q(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/vv;->q(Lcom/daaw/y31;Landroid/graphics/RectF;I)Z

    return v2
.end method

.method public v0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/ze0;->a0:I

    return-void
.end method

.method public w(Lcom/daaw/y31;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/xe0;->w(Lcom/daaw/y31;I)V

    iget-object v0, p0, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->r(Lcom/daaw/y31;I)Z

    return-void
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/xe0;->x(Lcom/daaw/y31;)V

    iget-object v0, p0, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->s(Lcom/daaw/y31;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/xe0;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    iget-object v0, p0, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vv;->t(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 8

    invoke-super {p0, p1, p2}, Lcom/daaw/xe0;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    iget-boolean v0, p0, Lcom/daaw/ze0;->U:Z

    const-string v1, "keepAspectRatio"

    const-string v6, "1_image"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/ze0;->T:Z

    const-string v1, "blurredBorder"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    const v0, 0x7f1002a2

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/ze0;->M:[F

    const-string v1, "Color"

    const-string v2, "2_color"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->I(Ljava/lang/String;[FLjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/ze0;->N:[F

    const-string v1, "ColorTo"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->I(Ljava/lang/String;[FLjava/lang/String;)V

    const/4 v7, 0x0

    new-array v0, v7, [Ljava/lang/String;

    const-string v1, "MeasureColorBlend"

    const-string v3, ""

    invoke-virtual {p1, v1, v3, v2, v0}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ze0;->O:Lcom/daaw/xn0;

    invoke-virtual {v1, v0}, Lcom/daaw/xn0;->o(Lcom/daaw/un;)V

    iget-object v2, p0, Lcom/daaw/ze0;->P:Lcom/daaw/dm0;

    const-string v1, "saturation"

    const-string v3, "2_color"

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->Z(Ljava/lang/String;Lcom/daaw/dm0;Ljava/lang/String;FF)V

    iget-boolean v0, p0, Lcom/daaw/ze0;->Q:Z

    const-string v1, "blurEnabled"

    const-string v2, "blur"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget v2, p0, Lcom/daaw/ze0;->R:I

    const-string v1, "blurDivider"

    const-string v3, "blur"

    const/4 v4, 0x0

    const/16 v5, 0xa

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    iget v2, p0, Lcom/daaw/ze0;->S:I

    const-string v1, "blurRadius"

    const-string v3, "blur"

    const/4 v4, 0x1

    const/16 v5, 0x19

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    iget-object v0, p0, Lcom/daaw/ze0;->V:Lcom/daaw/ge0;

    invoke-static {v0}, Lcom/daaw/pa1;->b(Lcom/daaw/ge0;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/pa1;->c:[Ljava/lang/String;

    const-string v2, "Shape"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ze0;->V:Lcom/daaw/ge0;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/daaw/zc0;->o(Lcom/daaw/un;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/od0;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/ze0;->Z:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/vv;->t:[Ljava/lang/String;

    const-string v2, "MaskImage"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/un;->f0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/bf0;->a:[Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/ze0;->p0()I

    move-result v1

    aget-object v2, v0, v7

    invoke-static {v0, v1, v2}, Lcom/daaw/br1;->a([Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "maskMode"

    invoke-virtual {p1, v2, v1, v6, v0}, Lcom/daaw/un;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
