.class public Lcom/daaw/v51;
.super Lcom/daaw/tv;
.source ""


# static fields
.field public static final Y:[Ljava/lang/String;


# instance fields
.field public G:I

.field public H:I

.field public I:Lcom/daaw/vv;

.field public J:Z

.field public K:Z

.field public L:Lcom/daaw/dm0;

.field public M:Lcom/daaw/dm0;

.field public N:[F

.field public O:[F

.field public P:[F

.field public Q:[Lcom/daaw/bs1;

.field public R:Lcom/daaw/i2;

.field public S:Z

.field public final T:Lcom/daaw/pr1;

.field public U:Lcom/daaw/g0;
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

.field public V:Lcom/daaw/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/f0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            ">;"
        }
    .end annotation
.end field

.field public W:Lcom/daaw/g0;
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

.field public X:Lcom/daaw/g0;
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
    .locals 1

    const-string v0, "composition:0"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/v51;->Y:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x4

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    const/4 v2, -0x1

    iput v2, p0, Lcom/daaw/v51;->G:I

    const/4 v2, 0x2

    iput v2, p0, Lcom/daaw/v51;->H:I

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/v51;->J:Z

    iput-boolean v2, p0, Lcom/daaw/v51;->K:Z

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-static {v3}, Lcom/daaw/dm0;->a(F)Lcom/daaw/dm0;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/v51;->L:Lcom/daaw/dm0;

    new-instance v3, Lcom/daaw/dm0;

    new-instance v4, Lcom/daaw/xn0;

    const-string v5, "BeatRandomShake"

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-direct {v4, v5, v6, v6}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    invoke-direct {v3, v4}, Lcom/daaw/dm0;-><init>(Lcom/daaw/xn0;)V

    iput-object v3, p0, Lcom/daaw/v51;->M:Lcom/daaw/dm0;

    new-array v3, v0, [F

    fill-array-data v3, :array_0

    iput-object v3, p0, Lcom/daaw/v51;->N:[F

    new-array v3, v0, [F

    fill-array-data v3, :array_1

    iput-object v3, p0, Lcom/daaw/v51;->O:[F

    new-array v3, v0, [F

    fill-array-data v3, :array_2

    iput-object v3, p0, Lcom/daaw/v51;->P:[F

    const/4 v3, 0x3

    new-array v3, v3, [Lcom/daaw/bs1;

    iput-object v3, p0, Lcom/daaw/v51;->Q:[Lcom/daaw/bs1;

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/daaw/v51;->R:Lcom/daaw/i2;

    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/daaw/v51;->S:Z

    new-instance v5, Lcom/daaw/pr1;

    invoke-direct {v5}, Lcom/daaw/pr1;-><init>()V

    iput-object v5, p0, Lcom/daaw/v51;->T:Lcom/daaw/pr1;

    new-instance v5, Lcom/daaw/v51$c;

    invoke-direct {v5, p0}, Lcom/daaw/v51$c;-><init>(Lcom/daaw/v51;)V

    iput-object v5, p0, Lcom/daaw/v51;->U:Lcom/daaw/g0;

    new-instance v5, Lcom/daaw/v51$d;

    invoke-direct {v5, p0}, Lcom/daaw/v51$d;-><init>(Lcom/daaw/v51;)V

    iput-object v5, p0, Lcom/daaw/v51;->V:Lcom/daaw/f0;

    new-instance v5, Lcom/daaw/v51$e;

    invoke-direct {v5, p0}, Lcom/daaw/v51$e;-><init>(Lcom/daaw/v51;)V

    iput-object v5, p0, Lcom/daaw/v51;->W:Lcom/daaw/g0;

    new-instance v5, Lcom/daaw/v51$f;

    invoke-direct {v5, p0}, Lcom/daaw/v51$f;-><init>(Lcom/daaw/v51;)V

    iput-object v5, p0, Lcom/daaw/v51;->X:Lcom/daaw/g0;

    invoke-virtual {p0, v1, v1}, Lcom/daaw/tv;->R(FF)V

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->J(I)V

    iget-object v0, p0, Lcom/daaw/v51;->Q:[Lcom/daaw/bs1;

    new-instance v5, Lcom/daaw/bs1;

    invoke-direct {v5, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    aput-object v5, v0, v2

    :goto_0
    iget-object v0, p0, Lcom/daaw/v51;->Q:[Lcom/daaw/bs1;

    array-length v1, v0

    if-ge v4, v1, :cond_0

    new-instance v1, Lcom/daaw/bs1;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Lcom/daaw/bs1;-><init>(FF)V

    aput-object v1, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/vv;

    new-instance v1, Lcom/daaw/v51$a;

    invoke-direct {v1, p0}, Lcom/daaw/v51$a;-><init>(Lcom/daaw/v51;)V

    new-instance v2, Lcom/daaw/v51$b;

    invoke-direct {v2, p0}, Lcom/daaw/v51$b;-><init>(Lcom/daaw/v51;)V

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/daaw/vv;-><init>(Lcom/daaw/vv$b;Lcom/daaw/r40;Lcom/daaw/s40;Lcom/daaw/s40;)V

    iput-object v0, p0, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    const-string v0, "composition:1"

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->u0(Ljava/lang/String;)V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static synthetic Y(Lcom/daaw/v51;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/tv;->m()V

    return-void
.end method

.method public static synthetic Z(Lcom/daaw/v51;)Lcom/daaw/dm0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/v51;->L:Lcom/daaw/dm0;

    return-object p0
.end method

.method public static synthetic a0(Lcom/daaw/v51;)Lcom/daaw/dm0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/v51;->M:Lcom/daaw/dm0;

    return-object p0
.end method

.method public static synthetic b0(Lcom/daaw/v51;)[F
    .locals 0

    iget-object p0, p0, Lcom/daaw/v51;->N:[F

    return-object p0
.end method

.method public static synthetic c0(Lcom/daaw/v51;)[F
    .locals 0

    iget-object p0, p0, Lcom/daaw/v51;->O:[F

    return-object p0
.end method

.method public static synthetic d0(Lcom/daaw/v51;)[F
    .locals 0

    iget-object p0, p0, Lcom/daaw/v51;->P:[F

    return-object p0
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v14, p1

    iget-object v0, v6, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    move-object/from16 v7, p2

    invoke-virtual {v0, v14, v7}, Lcom/daaw/vv;->u(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-object v0, v6, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    invoke-virtual {v0, v14}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v15

    if-nez v15, :cond_0

    invoke-super/range {p0 .. p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/tv;->C(Lcom/daaw/y31;)V

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

    iget-object v2, v6, Lcom/daaw/v51;->T:Lcom/daaw/pr1;

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/tv;->b(Lcom/daaw/y31;Lcom/daaw/pr1;FFF)V

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/v51;->v0(Lcom/daaw/y31;)V

    invoke-super/range {p0 .. p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-boolean v0, v6, Lcom/daaw/v51;->K:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    iget-object v0, v14, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->t()Lcom/daaw/qr1;

    move-result-object v0

    new-instance v2, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/v51;->e0()I

    move-result v3

    iget-object v4, v6, Lcom/daaw/v51;->W:Lcom/daaw/g0;

    invoke-direct {v2, v3, v15, v0, v4}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    iget v0, v13, Landroid/graphics/RectF;->left:F

    iget v3, v13, Landroid/graphics/RectF;->top:F

    invoke-virtual {v14, v0, v3, v1, v2}, Lcom/daaw/y31;->u(FFILcom/daaw/w31;)V

    :cond_1
    iget-object v0, v6, Lcom/daaw/v51;->Q:[Lcom/daaw/bs1;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v2, v6, Lcom/daaw/v51;->Q:[Lcom/daaw/bs1;

    aget-object v2, v2, v0

    iget v3, v2, Lcom/daaw/bs1;->a:F

    const/4 v4, 0x0

    cmpl-float v5, v3, v4

    if-eqz v5, :cond_2

    iget v2, v2, Lcom/daaw/bs1;->b:F

    cmpl-float v4, v2, v4

    if-eqz v4, :cond_2

    const/high16 v4, 0x3f800000    # 1.0f

    div-float v3, v4, v3

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float v3, v3, v5

    div-float/2addr v4, v2

    mul-float v4, v4, v5

    new-instance v11, Lcom/daaw/bs1;

    sub-float v2, v5, v3

    sub-float v7, v5, v4

    invoke-direct {v11, v2, v7}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v12, Lcom/daaw/bs1;

    add-float/2addr v3, v5

    add-float/2addr v4, v5

    invoke-direct {v12, v3, v4}, Lcom/daaw/bs1;-><init>(FF)V

    iget-object v2, v14, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v2}, Lcom/daaw/y31$c;->q()Lcom/daaw/qr1;

    move-result-object v2

    new-instance v3, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v4

    iget-object v5, v6, Lcom/daaw/v51;->X:Lcom/daaw/g0;

    invoke-direct {v3, v4, v15, v2, v5}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    iget v8, v13, Landroid/graphics/RectF;->left:F

    iget v9, v13, Landroid/graphics/RectF;->top:F

    iget v10, v6, Lcom/daaw/v51;->G:I

    move-object/from16 v7, p1

    move-object v2, v13

    move-object v13, v3

    invoke-virtual/range {v7 .. v13}, Lcom/daaw/y31;->v(FFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    goto :goto_1

    :cond_2
    move-object v2, v13

    :goto_1
    add-int/lit8 v0, v0, -0x1

    move-object v13, v2

    goto :goto_0

    :cond_3
    move-object v2, v13

    iget-boolean v0, v6, Lcom/daaw/v51;->J:Z

    if-eqz v0, :cond_4

    new-instance v0, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/v51;->e0()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v0, v3, v15, v4, v4}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    iget v3, v2, Landroid/graphics/RectF;->left:F

    iget v2, v2, Landroid/graphics/RectF;->top:F

    invoke-virtual {v14, v3, v2, v1, v0}, Lcom/daaw/y31;->u(FFILcom/daaw/w31;)V

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

    iget v0, p0, Lcom/daaw/v51;->H:I

    return v0
.end method

.method public f0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/v51;->J:Z

    return v0
.end method

.method public g0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/v51;->K:Z

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "RgbSplitEffect"

    return-object v0
.end method

.method public h0()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/v51;->N:[F

    invoke-static {v0}, Lcom/daaw/f80;->f([F)I

    move-result v0

    return v0
.end method

.method public i0()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/v51;->O:[F

    invoke-static {v0}, Lcom/daaw/f80;->f([F)I

    move-result v0

    return v0
.end method

.method public j0()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/v51;->P:[F

    invoke-static {v0}, Lcom/daaw/f80;->f([F)I

    move-result v0

    return v0
.end method

.method public k0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/tv;->l()V

    iget-object v0, p0, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vv;->p()V

    :cond_0
    return-void
.end method

.method public l0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/v51;->H:I

    return-void
.end method

.method public m0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/v51;->G:I

    return-void
.end method

.method public n0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/v51;->J:Z

    return-void
.end method

.method public o0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/v51;->K:Z

    return-void
.end method

.method public p0(Lcom/daaw/dm0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v51;->M:Lcom/daaw/dm0;

    return-void
.end method

.method public q0(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/v51;->N:[F

    invoke-static {v0, p1}, Lcom/daaw/f80;->n([FI)V

    return-void
.end method

.method public r0(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/v51;->O:[F

    invoke-static {v0, p1}, Lcom/daaw/f80;->n([FI)V

    return-void
.end method

.method public s0(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/v51;->P:[F

    invoke-static {v0, p1}, Lcom/daaw/f80;->n([FI)V

    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/daaw/tv;->t(Lcom/daaw/un;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->u(Lcom/daaw/un;)V

    const-string v0, "blendModeContent"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    const-string v1, "Add"

    invoke-virtual {v0, v1}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/daaw/v51;->H:I

    invoke-static {v0, v1}, Lcom/daaw/fc;->a(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->l0(I)V

    const-string v0, "color"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->m0(I)V

    const-string v0, "targetImage"

    const-string v1, "composition:1"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->u0(Ljava/lang/String;)V

    const-string v0, "showUnblurredContent"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->n0(Z)V

    const-string v0, "showUnblurredContentUnder"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->o0(Z)V

    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Lcom/daaw/dm0;->a(F)Lcom/daaw/dm0;

    move-result-object v0

    const-string v2, "splitMultiplier"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->t0(Lcom/daaw/dm0;)V

    new-instance v0, Lcom/daaw/dm0;

    new-instance v2, Lcom/daaw/xn0;

    const-string v3, "BeatRandomShake"

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-direct {v2, v3, v4, v4}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    invoke-direct {v0, v2}, Lcom/daaw/dm0;-><init>(Lcom/daaw/xn0;)V

    const-string v2, "splitAmount"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->p0(Lcom/daaw/dm0;)V

    const-string v0, "splitColor0"

    const/high16 v2, -0x10000

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->q0(I)V

    const-string v0, "splitColor1"

    const v2, -0xff0100

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/v51;->r0(I)V

    const-string v0, "splitColor2"

    const v2, -0xffff01

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/v51;->s0(I)V

    iget-object p1, p0, Lcom/daaw/v51;->Q:[Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v2}, Lcom/daaw/bs1;-><init>(FF)V

    aput-object v0, p1, v1

    return-void
.end method

.method public t0(Lcom/daaw/dm0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v51;->L:Lcom/daaw/dm0;

    return-void
.end method

.method public u0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->C(Ljava/lang/String;)V

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 3

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->q(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/vv;->q(Lcom/daaw/y31;Landroid/graphics/RectF;I)Z

    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    move-result p1

    return p1
.end method

.method public final v0(Lcom/daaw/y31;)V
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

.method public w(Lcom/daaw/y31;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->r(Lcom/daaw/y31;I)Z

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->w(Lcom/daaw/y31;I)V

    return-void
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    iget-object v0, p0, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->s(Lcom/daaw/y31;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    iget-object v0, p0, Lcom/daaw/v51;->I:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vv;->t(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 6

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->A(Lcom/daaw/un;)V

    const v0, 0x7f1002a6

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget v0, p0, Lcom/daaw/v51;->H:I

    invoke-static {v0}, Lcom/daaw/fc;->b(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/fc;->a:[Ljava/lang/String;

    const-string v2, "blendModeContent"

    const-string v3, "1_appearance"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    iget v0, p0, Lcom/daaw/v51;->G:I

    const-string v1, "color"

    invoke-virtual {p1, v1, v0, v3}, Lcom/daaw/un;->S(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/v51;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/od0;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/v51;->k0()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/v51;->Y:[Ljava/lang/String;

    const-string v2, "targetImage"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/un;->f0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/v51;->f0()Z

    move-result v0

    const-string v1, "showUnblurredContent"

    invoke-virtual {p1, v1, v0, v3}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/v51;->g0()Z

    move-result v0

    const-string v1, "showUnblurredContentUnder"

    invoke-virtual {p1, v1, v0, v3}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/v51;->L:Lcom/daaw/dm0;

    const-string v1, "splitMultiplier"

    const-string v3, "2_splitEffect"

    const/4 v4, 0x0

    const/high16 v5, 0x40c00000    # 6.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->Z(Ljava/lang/String;Lcom/daaw/dm0;Ljava/lang/String;FF)V

    iget-object v2, p0, Lcom/daaw/v51;->M:Lcom/daaw/dm0;

    const-string v1, "splitAmount"

    const-string v3, "2_splitEffect"

    const/high16 v4, -0x41000000    # -0.5f

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->b0(Ljava/lang/String;Lcom/daaw/dm0;Ljava/lang/String;FF)V

    invoke-virtual {p0}, Lcom/daaw/v51;->h0()I

    move-result v0

    const-string v1, "splitColor0"

    const-string v2, "2_splitEffect"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->S(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/v51;->i0()I

    move-result v0

    const-string v1, "splitColor1"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->S(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/v51;->j0()I

    move-result v0

    const-string v1, "splitColor2"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->S(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method
