.class public Lcom/daaw/pq0;
.super Lcom/daaw/tv;
.source ""


# static fields
.field public static final d0:[Ljava/lang/String;

.field public static final e0:[Ljava/lang/String;


# instance fields
.field public G:Ljava/lang/String;

.field public H:I

.field public I:I

.field public J:Lcom/daaw/vv;

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Lcom/daaw/dm0;

.field public O:Lcom/daaw/dm0;

.field public P:Lcom/daaw/dm0;

.field public Q:F

.field public R:F

.field public S:F

.field public T:F

.field public U:F

.field public V:F

.field public W:F

.field public X:F

.field public final Y:Lcom/daaw/pr1;

.field public Z:Lcom/daaw/g0;
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

.field public a0:Lcom/daaw/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/f0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            ">;"
        }
    .end annotation
.end field

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
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "composition:0"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/pq0;->d0:[Ljava/lang/String;

    const-string v0, "EffectTransform"

    const-string v1, "Manual"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/pq0;->e0:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x4

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    const-string v2, ""

    iput-object v2, p0, Lcom/daaw/pq0;->G:Ljava/lang/String;

    const/4 v2, -0x1

    iput v2, p0, Lcom/daaw/pq0;->H:I

    const/4 v2, 0x2

    iput v2, p0, Lcom/daaw/pq0;->I:I

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/pq0;->K:Z

    iput-boolean v2, p0, Lcom/daaw/pq0;->L:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/daaw/pq0;->M:Z

    invoke-static {v1}, Lcom/daaw/dm0;->a(F)Lcom/daaw/dm0;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/pq0;->N:Lcom/daaw/dm0;

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2, v2}, Lcom/daaw/dm0;->b(FF)Lcom/daaw/dm0;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/pq0;->O:Lcom/daaw/dm0;

    const/4 v2, 0x0

    invoke-static {v2, v2}, Lcom/daaw/dm0;->b(FF)Lcom/daaw/dm0;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/pq0;->P:Lcom/daaw/dm0;

    iput v2, p0, Lcom/daaw/pq0;->Q:F

    iput v2, p0, Lcom/daaw/pq0;->R:F

    iput v2, p0, Lcom/daaw/pq0;->S:F

    iput v2, p0, Lcom/daaw/pq0;->T:F

    iput v2, p0, Lcom/daaw/pq0;->U:F

    iput v2, p0, Lcom/daaw/pq0;->V:F

    iput v2, p0, Lcom/daaw/pq0;->W:F

    iput v2, p0, Lcom/daaw/pq0;->X:F

    new-instance v2, Lcom/daaw/pr1;

    invoke-direct {v2}, Lcom/daaw/pr1;-><init>()V

    iput-object v2, p0, Lcom/daaw/pq0;->Y:Lcom/daaw/pr1;

    new-instance v2, Lcom/daaw/pq0$b;

    invoke-direct {v2, p0}, Lcom/daaw/pq0$b;-><init>(Lcom/daaw/pq0;)V

    iput-object v2, p0, Lcom/daaw/pq0;->Z:Lcom/daaw/g0;

    new-instance v2, Lcom/daaw/pq0$c;

    invoke-direct {v2, p0}, Lcom/daaw/pq0$c;-><init>(Lcom/daaw/pq0;)V

    iput-object v2, p0, Lcom/daaw/pq0;->a0:Lcom/daaw/f0;

    new-instance v2, Lcom/daaw/pq0$d;

    invoke-direct {v2, p0}, Lcom/daaw/pq0$d;-><init>(Lcom/daaw/pq0;)V

    iput-object v2, p0, Lcom/daaw/pq0;->b0:Lcom/daaw/g0;

    new-instance v2, Lcom/daaw/pq0$e;

    invoke-direct {v2, p0}, Lcom/daaw/pq0$e;-><init>(Lcom/daaw/pq0;)V

    iput-object v2, p0, Lcom/daaw/pq0;->c0:Lcom/daaw/g0;

    const-string v2, "BeatCamShakeMore"

    iput-object v2, p0, Lcom/daaw/tv;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->J(I)V

    invoke-virtual {p0, v1, v1}, Lcom/daaw/tv;->R(FF)V

    new-instance v0, Lcom/daaw/vv;

    new-instance v1, Lcom/daaw/pq0$a;

    invoke-direct {v1, p0}, Lcom/daaw/pq0$a;-><init>(Lcom/daaw/pq0;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/daaw/vv;-><init>(Lcom/daaw/vv$b;Lcom/daaw/r40;Lcom/daaw/s40;Lcom/daaw/s40;)V

    iput-object v0, p0, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    const-string v0, "composition:1"

    invoke-virtual {p0, v0}, Lcom/daaw/pq0;->r0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic Y(Lcom/daaw/pq0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/tv;->m()V

    return-void
.end method

.method public static synthetic Z(Lcom/daaw/pq0;)Lcom/daaw/dm0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pq0;->N:Lcom/daaw/dm0;

    return-object p0
.end method

.method public static synthetic a0(Lcom/daaw/pq0;)F
    .locals 0

    iget p0, p0, Lcom/daaw/pq0;->S:F

    return p0
.end method

.method public static synthetic b0(Lcom/daaw/pq0;)F
    .locals 0

    iget p0, p0, Lcom/daaw/pq0;->T:F

    return p0
.end method

.method public static synthetic c0(Lcom/daaw/pq0;)F
    .locals 0

    iget p0, p0, Lcom/daaw/pq0;->W:F

    return p0
.end method

.method public static synthetic d0(Lcom/daaw/pq0;)F
    .locals 0

    iget p0, p0, Lcom/daaw/pq0;->X:F

    return p0
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 19

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    iget-object v0, v6, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    move-object/from16 v7, p2

    invoke-virtual {v0, v15, v7}, Lcom/daaw/vv;->u(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-object v0, v6, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    invoke-virtual {v0, v15}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v14

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/tv;->C(Lcom/daaw/y31;)V

    if-nez v14, :cond_0

    invoke-super/range {p0 .. p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    return-void

    :cond_0
    iget-boolean v8, v6, Lcom/daaw/pq0;->M:Z

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/tv;->n(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/tv;->s(Lcom/daaw/aq0;)F

    move-result v5

    iget-object v2, v6, Lcom/daaw/pq0;->Y:Lcom/daaw/pr1;

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/tv;->b(Lcom/daaw/y31;Lcom/daaw/pr1;FFF)V

    sget-object v0, Lcom/daaw/pq0;->e0:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v2, v6, Lcom/daaw/pq0;->G:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    iget-object v1, v6, Lcom/daaw/pq0;->O:Lcom/daaw/dm0;

    iget-object v2, v6, Lcom/daaw/pq0;->P:Lcom/daaw/dm0;

    invoke-static {v0, v1, v2}, Lcom/daaw/tv;->r(Lcom/daaw/aq0;Lcom/daaw/dm0;Lcom/daaw/dm0;)Landroid/graphics/RectF;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v13

    const/4 v8, 0x1

    :goto_0
    if-eqz v8, :cond_2

    iget v1, v6, Lcom/daaw/pq0;->Q:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v6, Lcom/daaw/pq0;->S:F

    iget v1, v6, Lcom/daaw/pq0;->R:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v6, Lcom/daaw/pq0;->T:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iput v1, v6, Lcom/daaw/pq0;->Q:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iput v1, v6, Lcom/daaw/pq0;->R:F

    iget v1, v6, Lcom/daaw/pq0;->U:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v6, Lcom/daaw/pq0;->W:F

    iget v1, v6, Lcom/daaw/pq0;->V:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v2

    sub-float/2addr v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iput v1, v6, Lcom/daaw/pq0;->S:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iput v1, v6, Lcom/daaw/pq0;->T:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iput v1, v6, Lcom/daaw/pq0;->Q:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iput v1, v6, Lcom/daaw/pq0;->R:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    iput v1, v6, Lcom/daaw/pq0;->W:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v1

    :goto_1
    iput v1, v6, Lcom/daaw/pq0;->X:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    iput v1, v6, Lcom/daaw/pq0;->U:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iput v0, v6, Lcom/daaw/pq0;->V:F

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/pq0;->s0(Lcom/daaw/y31;)V

    invoke-super/range {p0 .. p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-boolean v0, v6, Lcom/daaw/pq0;->L:Z

    if-eqz v0, :cond_3

    iget-object v0, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->t()Lcom/daaw/qr1;

    move-result-object v0

    iget-object v1, v6, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    invoke-virtual {v1, v15}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v1

    new-instance v2, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/pq0;->e0()I

    move-result v3

    iget-object v4, v6, Lcom/daaw/pq0;->b0:Lcom/daaw/g0;

    invoke-direct {v2, v3, v1, v0, v4}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    iget v9, v13, Landroid/graphics/RectF;->left:F

    iget v10, v13, Landroid/graphics/RectF;->top:F

    const/4 v11, 0x0

    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    move-result v12

    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/4 v1, -0x1

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v3

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v16

    const/16 v18, 0x1

    move-object/from16 v8, p1

    move-object v4, v13

    move v13, v0

    move-object v0, v14

    move v14, v1

    move-object v1, v15

    move-object v15, v3

    move-object/from16 v17, v2

    invoke-virtual/range {v7 .. v18}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    goto :goto_2

    :cond_3
    move-object v4, v13

    move-object v0, v14

    move-object v1, v15

    :goto_2
    const/4 v2, 0x4

    new-array v2, v2, [F

    iget v3, v6, Lcom/daaw/pq0;->H:I

    invoke-static {v2, v3}, Lcom/daaw/f80;->n([FI)V

    iget-object v2, v1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v2}, Lcom/daaw/y31$c;->p()Lcom/daaw/qr1;

    move-result-object v2

    new-instance v3, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v5

    iget-object v7, v6, Lcom/daaw/pq0;->c0:Lcom/daaw/g0;

    invoke-direct {v3, v5, v0, v2, v7}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    iget v9, v4, Landroid/graphics/RectF;->left:F

    iget v10, v4, Landroid/graphics/RectF;->top:F

    const/4 v11, 0x0

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v12

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v13

    const/4 v14, -0x1

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v15

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v16

    const/16 v18, 0x1

    move-object/from16 v8, p1

    move-object/from16 v17, v3

    invoke-virtual/range {v7 .. v18}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    iget-boolean v2, v6, Lcom/daaw/pq0;->K:Z

    if-eqz v2, :cond_4

    new-instance v2, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/pq0;->e0()I

    move-result v3

    const/4 v5, 0x0

    invoke-direct {v2, v3, v0, v5, v5}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v7

    iget v9, v4, Landroid/graphics/RectF;->left:F

    iget v10, v4, Landroid/graphics/RectF;->top:F

    const/4 v11, 0x0

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v12

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v13

    const/4 v14, -0x1

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v15

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v16

    const/16 v18, 0x1

    move-object/from16 v8, p1

    move-object/from16 v17, v2

    invoke-virtual/range {v7 .. v18}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    :cond_4
    return-void
.end method

.method public F(Lcom/daaw/y31;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->F(Lcom/daaw/y31;)V

    return-void
.end method

.method public e0()I
    .locals 1

    iget v0, p0, Lcom/daaw/pq0;->I:I

    return v0
.end method

.method public f0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/pq0;->M:Z

    return v0
.end method

.method public g0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/pq0;->K:Z

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "MotionBlurEffect"

    return-object v0
.end method

.method public h0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/pq0;->L:Z

    return v0
.end method

.method public i0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/pq0;->I:I

    return-void
.end method

.method public k0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/pq0;->H:I

    return-void
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/tv;->l()V

    iget-object v0, p0, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vv;->p()V

    :cond_0
    return-void
.end method

.method public l0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/pq0;->M:Z

    return-void
.end method

.method public m0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/pq0;->K:Z

    return-void
.end method

.method public n0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/pq0;->L:Z

    return-void
.end method

.method public o0(Lcom/daaw/dm0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pq0;->P:Lcom/daaw/dm0;

    return-void
.end method

.method public p0(Lcom/daaw/dm0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pq0;->O:Lcom/daaw/dm0;

    return-void
.end method

.method public q0(Lcom/daaw/dm0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pq0;->N:Lcom/daaw/dm0;

    return-void
.end method

.method public r0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->C(Ljava/lang/String;)V

    return-void
.end method

.method public final s0(Lcom/daaw/y31;)V
    .locals 3

    const/16 v0, 0xde1

    const/16 v1, 0x2801

    const/16 v2, 0x2601

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v1, 0x2800

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/y31;->T(I)V

    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/tv;->t(Lcom/daaw/un;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->u(Lcom/daaw/un;)V

    const-string v0, "blendModeContent"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/un;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/daaw/fc;->a(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/pq0;->j0(I)V

    const-string v0, "color"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/pq0;->k0(I)V

    const-string v0, "TargetImage"

    const-string v1, "composition:1"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/pq0;->r0(Ljava/lang/String;)V

    const-string v0, "showUnblurredContent"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/pq0;->m0(Z)V

    const-string v0, "showUnblurredContentUnder"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/pq0;->n0(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lcom/daaw/dm0;->a(F)Lcom/daaw/dm0;

    move-result-object v0

    const-string v2, "blurAmountMultiplier"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/pq0;->q0(Lcom/daaw/dm0;)V

    const-string v0, "motionSource"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    sget-object v2, Lcom/daaw/pq0;->e0:[Ljava/lang/String;

    aget-object v1, v2, v1

    invoke-virtual {v0, v1}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/pq0;->G:Ljava/lang/String;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1, v1}, Lcom/daaw/dm0;->b(FF)Lcom/daaw/dm0;

    move-result-object v1

    const-string v2, "posBlurAmount"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/pq0;->p0(Lcom/daaw/dm0;)V

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lcom/daaw/dm0;->b(FF)Lcom/daaw/dm0;

    move-result-object v1

    const-string v2, "scaleBlurAmount"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/pq0;->o0(Lcom/daaw/dm0;)V

    const-string v0, "relativeMotionMode"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/pq0;->l0(Z)V

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 3

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->q(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/vv;->q(Lcom/daaw/y31;Landroid/graphics/RectF;I)Z

    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    move-result p1

    return p1
.end method

.method public w(Lcom/daaw/y31;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->r(Lcom/daaw/y31;I)Z

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->w(Lcom/daaw/y31;I)V

    return-void
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    iget-object v0, p0, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->s(Lcom/daaw/y31;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    iget-object v0, p0, Lcom/daaw/pq0;->J:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vv;->t(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 10

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->A(Lcom/daaw/un;)V

    const v0, 0x7f1002a4

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget v0, p0, Lcom/daaw/pq0;->I:I

    invoke-static {v0}, Lcom/daaw/fc;->b(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/fc;->a:[Ljava/lang/String;

    const-string v2, "blendModeContent"

    const-string v3, "1_appearance"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    iget v0, p0, Lcom/daaw/pq0;->H:I

    const-string v1, "color"

    invoke-virtual {p1, v1, v0, v3}, Lcom/daaw/un;->S(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/pq0;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/od0;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/pq0;->i0()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/pq0;->d0:[Ljava/lang/String;

    const-string v1, "TargetImage"

    invoke-virtual {p1, v1, p2, v3, v0}, Lcom/daaw/un;->f0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/pq0;->g0()Z

    move-result p2

    const-string v0, "showUnblurredContent"

    invoke-virtual {p1, v0, p2, v3}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/pq0;->h0()Z

    move-result p2

    const-string v0, "showUnblurredContentUnder"

    invoke-virtual {p1, v0, p2, v3}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-object v6, p0, Lcom/daaw/pq0;->N:Lcom/daaw/dm0;

    const-string v5, "blurAmountMultiplier"

    const-string v7, "2_motionBlur"

    const/4 v8, 0x0

    const/high16 v9, 0x40000000    # 2.0f

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/un;->Z(Ljava/lang/String;Lcom/daaw/dm0;Ljava/lang/String;FF)V

    iget-object p2, p0, Lcom/daaw/pq0;->G:Ljava/lang/String;

    sget-object v0, Lcom/daaw/pq0;->e0:[Ljava/lang/String;

    const-string v1, "motionSource"

    const-string v2, "2_motionBlur"

    invoke-virtual {p1, v1, p2, v2, v0}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object p2

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/daaw/pq0;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v5, p0, Lcom/daaw/pq0;->O:Lcom/daaw/dm0;

    const/4 v7, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    const-string v4, "posBlurAmount"

    const-string v6, "2_motionBlur"

    move-object v3, p2

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->b0(Ljava/lang/String;Lcom/daaw/dm0;Ljava/lang/String;FF)V

    iget-object v5, p0, Lcom/daaw/pq0;->P:Lcom/daaw/dm0;

    const/high16 v7, -0x40800000    # -1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const-string v4, "scaleBlurAmount"

    const-string v6, "2_motionBlur"

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->b0(Ljava/lang/String;Lcom/daaw/dm0;Ljava/lang/String;FF)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/pq0;->f0()Z

    move-result p2

    const-string v0, "relativeMotionMode"

    invoke-virtual {p1, v0, p2, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method
