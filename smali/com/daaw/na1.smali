.class public Lcom/daaw/na1;
.super Lcom/daaw/tv;
.source ""


# instance fields
.field public G:Lcom/daaw/he0;

.field public H:Lcom/daaw/he0;

.field public I:Lcom/daaw/ge0;

.field public J:Z

.field public K:F

.field public L:F

.field public M:F

.field public N:Landroid/graphics/PointF;

.field public O:Landroid/graphics/PointF;

.field public P:Landroid/graphics/PointF;

.field public Q:Landroid/graphics/PointF;

.field public R:Lcom/daaw/je0;

.field public S:[Lcom/daaw/he0$a;

.field public T:I

.field public U:I

.field public V:I

.field public W:I

.field public X:Lcom/daaw/dm0;


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x2

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/na1;->G:Lcom/daaw/he0;

    iput-object v1, p0, Lcom/daaw/na1;->H:Lcom/daaw/he0;

    iput-object v1, p0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/na1;->J:Z

    const/high16 v3, 0x40400000    # 3.0f

    iput v3, p0, Lcom/daaw/na1;->K:F

    const v3, 0x3c1374bc    # 0.009f

    iput v3, p0, Lcom/daaw/na1;->L:F

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, p0, Lcom/daaw/na1;->M:F

    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V

    iput-object v3, p0, Lcom/daaw/na1;->N:Landroid/graphics/PointF;

    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V

    iput-object v3, p0, Lcom/daaw/na1;->O:Landroid/graphics/PointF;

    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V

    iput-object v3, p0, Lcom/daaw/na1;->P:Landroid/graphics/PointF;

    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V

    iput-object v3, p0, Lcom/daaw/na1;->Q:Landroid/graphics/PointF;

    iput-object v1, p0, Lcom/daaw/na1;->R:Lcom/daaw/je0;

    new-array v1, v2, [Lcom/daaw/he0$a;

    iput-object v1, p0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    iput v2, p0, Lcom/daaw/na1;->T:I

    iput v2, p0, Lcom/daaw/na1;->U:I

    iput v2, p0, Lcom/daaw/na1;->V:I

    const/4 v1, 0x1

    iput v1, p0, Lcom/daaw/na1;->W:I

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/daaw/dm0;->a(F)Lcom/daaw/dm0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/na1;->X:Lcom/daaw/dm0;

    new-instance v1, Lcom/daaw/oa1;

    invoke-direct {v1}, Lcom/daaw/oa1;-><init>()V

    invoke-virtual {p0, v1}, Lcom/daaw/na1;->h0(Lcom/daaw/ge0;)V

    new-instance v1, Lcom/daaw/wa1;

    invoke-direct {v1}, Lcom/daaw/wa1;-><init>()V

    invoke-virtual {p0, v1}, Lcom/daaw/na1;->i0(Lcom/daaw/he0;)V

    invoke-virtual {p0, v0}, Lcom/daaw/na1;->j0(I)V

    return-void
.end method

.method public static Z(Lcom/daaw/de0;ILandroid/graphics/RectF;IFLcom/daaw/he0;Lcom/daaw/ge0;)V
    .locals 19

    move/from16 v8, p3

    move-object/from16 v9, p6

    const/4 v10, 0x0

    new-array v0, v10, [Lcom/daaw/he0$a;

    new-instance v11, Landroid/graphics/PointF;

    invoke-direct {v11}, Landroid/graphics/PointF;-><init>()V

    new-instance v12, Landroid/graphics/PointF;

    invoke-direct {v12}, Landroid/graphics/PointF;-><init>()V

    new-instance v13, Landroid/graphics/PointF;

    invoke-direct {v13}, Landroid/graphics/PointF;-><init>()V

    new-instance v14, Landroid/graphics/PointF;

    invoke-direct {v14}, Landroid/graphics/PointF;-><init>()V

    move-object/from16 v15, p0

    invoke-interface {v9, v15}, Lcom/daaw/ge0;->d(Lcom/daaw/de0;)V

    const/4 v7, -0x1

    if-eqz v8, :cond_0

    new-array v0, v8, [Lcom/daaw/he0$a;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v8, :cond_0

    new-instance v2, Lcom/daaw/he0$a;

    invoke-direct {v2}, Lcom/daaw/he0$a;-><init>()V

    aput-object v2, v0, v1

    aget-object v2, v0, v1

    iput v7, v2, Lcom/daaw/he0$a;->c:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move-object/from16 v16, v0

    const/4 v0, 0x1

    if-ge v8, v0, :cond_1

    return-void

    :cond_1
    move-object/from16 v6, p2

    invoke-interface {v9, v6, v8}, Lcom/daaw/ge0;->k(Landroid/graphics/RectF;I)F

    move-result v17

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v8, :cond_4

    const/16 v18, 0x0

    const/4 v1, 0x0

    move-object/from16 v0, p6

    move v2, v5

    move/from16 v3, p3

    move-object/from16 v4, p2

    move v10, v5

    move/from16 v5, v18

    move-object v6, v13

    const/4 v9, -0x1

    move-object v7, v14

    invoke-interface/range {v0 .. v7}, Lcom/daaw/ge0;->e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    move-result v0

    iget v1, v14, Landroid/graphics/PointF;->x:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v14, Landroid/graphics/PointF;->x:F

    iput v2, v14, Landroid/graphics/PointF;->y:F

    :cond_2
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    float-to-double v4, v2

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    mul-double v4, v4, v6

    double-to-float v2, v4

    invoke-static {v11, v1, v3, v13, v2}, Lcom/daaw/tv;->H(Landroid/graphics/PointF;FFLandroid/graphics/PointF;F)V

    invoke-static {v12, v14, v2}, Lcom/daaw/tv;->I(Landroid/graphics/PointF;Landroid/graphics/PointF;F)V

    if-ltz v0, :cond_3

    aget-object v1, v16, v0

    iput v10, v1, Lcom/daaw/he0$a;->c:I

    :cond_3
    aget-object v1, v16, v10

    iput v0, v1, Lcom/daaw/he0$a;->a:I

    move/from16 v0, p4

    iput v0, v1, Lcom/daaw/he0$a;->d:F

    iget v2, v11, Landroid/graphics/PointF;->x:F

    iput v2, v1, Lcom/daaw/he0$a;->e:F

    iget v2, v11, Landroid/graphics/PointF;->y:F

    iput v2, v1, Lcom/daaw/he0$a;->f:F

    iget v2, v12, Landroid/graphics/PointF;->x:F

    iput v2, v1, Lcom/daaw/he0$a;->g:F

    iget v2, v12, Landroid/graphics/PointF;->y:F

    iput v2, v1, Lcom/daaw/he0$a;->h:F

    add-int/lit8 v5, v10, 0x1

    move-object/from16 v6, p2

    move-object/from16 v9, p6

    const/4 v7, -0x1

    const/4 v10, 0x0

    goto :goto_1

    :cond_4
    const/4 v9, -0x1

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v8, :cond_5

    aget-object v0, v16, v10

    iget v1, v0, Lcom/daaw/he0$a;->c:I

    iput v1, v0, Lcom/daaw/he0$a;->b:I

    iput v9, v0, Lcom/daaw/he0$a;->c:I

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_5
    if-eqz p5, :cond_6

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v7, 0x0

    move-object/from16 v1, p5

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    move/from16 v4, v17

    move/from16 v6, p1

    invoke-interface/range {v1 .. v7}, Lcom/daaw/he0;->m(Lcom/daaw/de0;[Lcom/daaw/he0$a;FFIF)V

    :cond_6
    return-void
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-virtual {p0, p1}, Lcom/daaw/na1;->Y(Lcom/daaw/de0;)V

    return-void
.end method

.method public G(Lcom/daaw/de0;Lcom/daaw/e40;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->G(Lcom/daaw/de0;Lcom/daaw/e40;)V

    invoke-virtual {p0, p1}, Lcom/daaw/na1;->Y(Lcom/daaw/de0;)V

    return-void
.end method

.method public final Y(Lcom/daaw/de0;)V
    .locals 25

    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v1

    iget v2, v0, Lcom/daaw/na1;->W:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/daaw/aq0;->b(I)Lcom/daaw/fe0;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-object v2, v0, Lcom/daaw/na1;->G:Lcom/daaw/he0;

    if-nez v2, :cond_0

    iget-object v2, v0, Lcom/daaw/na1;->H:Lcom/daaw/he0;

    if-eqz v2, :cond_a

    :cond_0
    iget-object v2, v0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/tv;->n(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/tv;->s(Lcom/daaw/aq0;)F

    move-result v13

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/tv;->p(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v14

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v15

    iget-object v4, v0, Lcom/daaw/na1;->X:Lcom/daaw/dm0;

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v5

    invoke-interface {v5}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/daaw/dm0;->i(Lcom/daaw/aq0;)F

    move-result v4

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    const/4 v10, 0x0

    invoke-static {v10, v4}, Ljava/lang/Math;->max(FF)F

    move-result v23

    iget-object v4, v0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    move-object/from16 v9, p1

    invoke-interface {v4, v9}, Lcom/daaw/ge0;->d(Lcom/daaw/de0;)V

    iget v4, v0, Lcom/daaw/na1;->U:I

    iget v5, v0, Lcom/daaw/na1;->V:I

    iget v6, v0, Lcom/daaw/na1;->T:I

    iget-object v7, v0, Lcom/daaw/na1;->R:Lcom/daaw/je0;

    invoke-interface {v1, v4, v5, v6, v7}, Lcom/daaw/fe0;->f(IIILcom/daaw/je0;)Lcom/daaw/je0;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/na1;->R:Lcom/daaw/je0;

    invoke-interface {v1}, Lcom/daaw/je0;->size()I

    move-result v1

    iget-object v4, v0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    array-length v4, v4

    const/4 v8, -0x1

    const/16 v16, 0x0

    if-eq v1, v4, :cond_2

    new-array v4, v1, [Lcom/daaw/he0$a;

    iput-object v4, v0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    iget-object v5, v0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    new-instance v6, Lcom/daaw/he0$a;

    invoke-direct {v6}, Lcom/daaw/he0$a;-><init>()V

    aput-object v6, v5, v4

    iget-object v5, v0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    aget-object v5, v5, v4

    iput v8, v5, Lcom/daaw/he0$a;->c:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-ge v1, v3, :cond_3

    return-void

    :cond_3
    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v3

    iget v4, v0, Lcom/daaw/na1;->L:F

    invoke-virtual {v3, v4}, Lcom/daaw/aq0;->e(F)F

    move-result v3

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v4

    iget v5, v0, Lcom/daaw/na1;->M:F

    invoke-virtual {v4, v5}, Lcom/daaw/aq0;->e(F)F

    move-result v7

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v4

    iget v5, v0, Lcom/daaw/na1;->K:F

    invoke-virtual {v4, v5}, Lcom/daaw/aq0;->e(F)F

    move-result v4

    const v5, 0x3b03126f    # 0.002f

    mul-float v4, v4, v5

    iget-object v5, v0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    invoke-interface {v5, v2, v1}, Lcom/daaw/ge0;->k(Landroid/graphics/RectF;I)F

    move-result v24

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v17

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v18

    iget-object v4, v0, Lcom/daaw/na1;->G:Lcom/daaw/he0;

    if-nez v4, :cond_4

    iget-object v4, v0, Lcom/daaw/na1;->H:Lcom/daaw/he0;

    if-nez v4, :cond_4

    return-void

    :cond_4
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v1, :cond_7

    iget-object v4, v0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    iget-boolean v5, v0, Lcom/daaw/na1;->J:Z

    const/16 v19, 0x0

    iget-object v10, v0, Lcom/daaw/na1;->P:Landroid/graphics/PointF;

    iget-object v11, v0, Lcom/daaw/na1;->Q:Landroid/graphics/PointF;

    move/from16 v22, v6

    move v12, v7

    move v7, v1

    move-object v8, v2

    move/from16 v9, v19

    move-object/from16 v19, v2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface/range {v4 .. v11}, Lcom/daaw/ge0;->e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    move-result v4

    iget-object v5, v0, Lcom/daaw/na1;->Q:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->x:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v5, v0, Lcom/daaw/na1;->Q:Landroid/graphics/PointF;

    iput v2, v5, Landroid/graphics/PointF;->x:F

    const/4 v6, 0x0

    iput v6, v5, Landroid/graphics/PointF;->y:F

    goto :goto_2

    :cond_5
    const/4 v6, 0x0

    :goto_2
    iget-object v5, v0, Lcom/daaw/na1;->N:Landroid/graphics/PointF;

    iget-object v7, v0, Lcom/daaw/na1;->P:Landroid/graphics/PointF;

    float-to-double v8, v13

    const-wide v10, 0x400921fb54442d18L    # Math.PI

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v10

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    mul-double v8, v8, v10

    double-to-float v8, v8

    invoke-static {v5, v14, v15, v7, v8}, Lcom/daaw/tv;->H(Landroid/graphics/PointF;FFLandroid/graphics/PointF;F)V

    iget-object v5, v0, Lcom/daaw/na1;->O:Landroid/graphics/PointF;

    iget-object v7, v0, Lcom/daaw/na1;->Q:Landroid/graphics/PointF;

    invoke-static {v5, v7, v8}, Lcom/daaw/tv;->I(Landroid/graphics/PointF;Landroid/graphics/PointF;F)V

    if-ltz v4, :cond_6

    iget-object v5, v0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    aget-object v5, v5, v4

    move/from16 v7, v22

    iput v7, v5, Lcom/daaw/he0$a;->c:I

    goto :goto_3

    :cond_6
    move/from16 v7, v22

    :goto_3
    iget-object v5, v0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    aget-object v5, v5, v7

    iput v4, v5, Lcom/daaw/he0$a;->a:I

    iget-object v4, v0, Lcom/daaw/na1;->R:Lcom/daaw/je0;

    invoke-interface {v4, v7}, Lcom/daaw/je0;->get(I)F

    move-result v4

    mul-float v4, v4, v18

    invoke-static {v4, v12}, Ljava/lang/Math;->min(FF)F

    move-result v4

    mul-float v4, v4, v17

    add-float/2addr v4, v3

    iput v4, v5, Lcom/daaw/he0$a;->d:F

    iget-object v4, v0, Lcom/daaw/na1;->N:Landroid/graphics/PointF;

    iget v8, v4, Landroid/graphics/PointF;->x:F

    iput v8, v5, Lcom/daaw/he0$a;->e:F

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iput v4, v5, Lcom/daaw/he0$a;->f:F

    iget-object v4, v0, Lcom/daaw/na1;->O:Landroid/graphics/PointF;

    iget v8, v4, Landroid/graphics/PointF;->x:F

    iput v8, v5, Lcom/daaw/he0$a;->g:F

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iput v4, v5, Lcom/daaw/he0$a;->h:F

    add-int/lit8 v4, v7, 0x1

    move-object/from16 v9, p1

    move v6, v4

    move v7, v12

    move-object/from16 v2, v19

    const/4 v8, -0x1

    const/4 v10, 0x0

    const/high16 v11, 0x3f800000    # 1.0f

    goto/16 :goto_1

    :cond_7
    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_8

    iget-object v3, v0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    aget-object v3, v3, v2

    iget v4, v3, Lcom/daaw/he0$a;->c:I

    iput v4, v3, Lcom/daaw/he0$a;->b:I

    const/4 v4, -0x1

    iput v4, v3, Lcom/daaw/he0$a;->c:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_8
    iget-object v1, v0, Lcom/daaw/na1;->G:Lcom/daaw/he0;

    if-eqz v1, :cond_9

    iget-object v2, v0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v21

    const/high16 v20, 0x3f000000    # 0.5f

    move-object/from16 v16, v1

    move-object/from16 v17, p1

    move-object/from16 v18, v2

    move/from16 v19, v24

    move/from16 v22, v23

    invoke-interface/range {v16 .. v22}, Lcom/daaw/he0;->m(Lcom/daaw/de0;[Lcom/daaw/he0$a;FFIF)V

    :cond_9
    iget-object v4, v0, Lcom/daaw/na1;->H:Lcom/daaw/he0;

    if-eqz v4, :cond_a

    iget-object v6, v0, Lcom/daaw/na1;->S:[Lcom/daaw/he0$a;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v9

    move-object/from16 v5, p1

    move/from16 v7, v24

    const/high16 v1, 0x3f000000    # 0.5f

    move v8, v1

    move/from16 v10, v23

    invoke-interface/range {v4 .. v10}, Lcom/daaw/he0;->m(Lcom/daaw/de0;[Lcom/daaw/he0$a;FFIF)V

    :cond_a
    :goto_5
    return-void
.end method

.method public a0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/na1;->W:I

    return-void
.end method

.method public b0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/na1;->K:F

    return-void
.end method

.method public c0(Lcom/daaw/dm0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/na1;->X:Lcom/daaw/dm0;

    return-void
.end method

.method public d0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/na1;->M:F

    return-void
.end method

.method public e0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/na1;->L:F

    return-void
.end method

.method public f0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/na1;->V:I

    return-void
.end method

.method public g0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/na1;->U:I

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "Bars"

    return-object v0
.end method

.method public h0(Lcom/daaw/ge0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    return-void
.end method

.method public i0(Lcom/daaw/he0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/na1;->G:Lcom/daaw/he0;

    return-void
.end method

.method public j0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/na1;->T:I

    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/daaw/tv;->t(Lcom/daaw/un;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->u(Lcom/daaw/un;)V

    const-string v0, "flipInput"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/na1;->J:Z

    const-string v0, "heightScale"

    const/high16 v2, 0x40400000    # 3.0f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/na1;->b0(F)V

    const-string v0, "minHeightScale"

    const v2, 0x3c1374bc    # 0.009f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/na1;->e0(F)V

    const-string v0, "maxHeightScale"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/na1;->d0(F)V

    const-string v0, "ShapePath"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    const-string v2, "Circle"

    invoke-virtual {v0, v2}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    invoke-static {v2, v3}, Lcom/daaw/pa1;->a(Ljava/lang/String;Lcom/daaw/ge0;)Lcom/daaw/ge0;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    if-eqz v2, :cond_0

    invoke-interface {v2, v0}, Lcom/daaw/zc0;->a(Lcom/daaw/un;)V

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/dm0;->a(F)Lcom/daaw/dm0;

    move-result-object v0

    const-string v2, "colorBlendOffset"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/na1;->c0(Lcom/daaw/dm0;)V

    const/4 v0, 0x2

    const-string v2, "softness"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/na1;->j0(I)V

    const-string v0, "reactionDelay"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/na1;->g0(I)V

    const-string v0, "reactionAccumulatedDelay"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/na1;->f0(I)V

    const/4 v0, 0x1

    const-string v1, "audioProviderIndex"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/na1;->a0(I)V

    const-string v0, "Segment1"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    const-string v1, "Bars"

    invoke-virtual {v0, v1}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/na1;->G:Lcom/daaw/he0;

    invoke-static {v1, v2}, Lcom/daaw/ya1;->a(Ljava/lang/String;Lcom/daaw/he0;)Lcom/daaw/he0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/na1;->G:Lcom/daaw/he0;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Lcom/daaw/zc0;->a(Lcom/daaw/un;)V

    :cond_1
    const-string v0, "Segment2"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object p1

    const-string v0, "None"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/na1;->H:Lcom/daaw/he0;

    invoke-static {v0, v1}, Lcom/daaw/ya1;->a(Ljava/lang/String;Lcom/daaw/he0;)Lcom/daaw/he0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/na1;->H:Lcom/daaw/he0;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lcom/daaw/zc0;->a(Lcom/daaw/un;)V

    :cond_2
    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    move-result p1

    return p1
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 7

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->A(Lcom/daaw/un;)V

    const v0, 0x7f1002a7

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/na1;->J:Z

    const-string v1, "flipInput"

    const-string v6, "1_bars"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget v2, p0, Lcom/daaw/na1;->K:F

    const-string v1, "heightScale"

    const-string v3, "1_bars"

    const/high16 v4, -0x3ee00000    # -10.0f

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/na1;->L:F

    const-string v1, "minHeightScale"

    const-string v3, "1_bars"

    const v4, -0x430a3d71    # -0.03f

    const v5, 0x3cf5c28f    # 0.03f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/na1;->M:F

    const-string v1, "maxHeightScale"

    const-string v3, "1_bars"

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    sget-boolean v0, Lcom/daaw/c60;->m:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/pa1;->b:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/pa1;->a:[Ljava/lang/String;

    :goto_0
    iget-object v1, p0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    invoke-static {v1}, Lcom/daaw/pa1;->b(Lcom/daaw/ge0;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ShapePath"

    invoke-virtual {p1, v2, v1, v6, v0}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/na1;->I:Lcom/daaw/ge0;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Lcom/daaw/zc0;->o(Lcom/daaw/un;)V

    :cond_1
    iget-object v2, p0, Lcom/daaw/na1;->X:Lcom/daaw/dm0;

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const-string v1, "colorBlendOffset"

    const-string v3, "1_bars"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->Z(Ljava/lang/String;Lcom/daaw/dm0;Ljava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/na1;->T:I

    const/4 v4, 0x0

    const/16 v5, 0x14

    const-string v1, "softness"

    const-string v3, "2_Behavior"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    iget v2, p0, Lcom/daaw/na1;->U:I

    const/16 v5, 0x9

    const-string v1, "reactionDelay"

    const-string v3, "2_Behavior"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    iget v2, p0, Lcom/daaw/na1;->V:I

    const-string v1, "reactionAccumulatedDelay"

    const-string v3, "2_Behavior"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    iget v2, p0, Lcom/daaw/na1;->W:I

    const/4 v4, 0x1

    const/4 v5, 0x4

    const-string v1, "audioProviderIndex"

    const-string v3, "2_Behavior"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    iget-object v0, p0, Lcom/daaw/na1;->G:Lcom/daaw/he0;

    invoke-static {v0}, Lcom/daaw/ya1;->b(Lcom/daaw/he0;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/ya1;->a:[Ljava/lang/String;

    const-string v2, "Segment1"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/na1;->G:Lcom/daaw/he0;

    if-eqz v2, :cond_2

    invoke-interface {v2, v0}, Lcom/daaw/zc0;->o(Lcom/daaw/un;)V

    :cond_2
    iget-object v0, p0, Lcom/daaw/na1;->H:Lcom/daaw/he0;

    invoke-static {v0}, Lcom/daaw/ya1;->b(Lcom/daaw/he0;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Segment2"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/na1;->H:Lcom/daaw/he0;

    if-eqz v1, :cond_3

    invoke-interface {v1, v0}, Lcom/daaw/zc0;->o(Lcom/daaw/un;)V

    :cond_3
    return-void
.end method
