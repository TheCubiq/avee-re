.class public Lcom/daaw/yv0;
.super Lcom/daaw/tv;
.source ""


# static fields
.field public static final r0:[Ljava/lang/String;

.field public static final s0:[Ljava/lang/String;


# instance fields
.field public G:I

.field public H:[Lcom/daaw/zd0;

.field public I:F

.field public J:Lcom/daaw/pc0;

.field public K:F

.field public L:Lcom/daaw/ae0;

.field public M:I

.field public N:F

.field public O:F

.field public P:Lcom/daaw/xn0;

.field public Q:Lcom/daaw/xn0;

.field public R:Z

.field public S:Z

.field public T:Lcom/daaw/qd0;

.field public U:F

.field public V:F

.field public W:Lcom/daaw/z6;

.field public X:Lcom/daaw/ds1;

.field public Y:Lcom/daaw/ds1;

.field public Z:Lcom/daaw/bs1;

.field public a0:Lcom/daaw/bs1;

.field public b0:Lcom/daaw/bs1;

.field public c0:Lcom/daaw/bs1;

.field public d0:Lcom/daaw/bs1;

.field public e0:[F

.field public final f0:[F

.field public g0:F

.field public h0:F

.field public final i0:F

.field public j0:Lcom/daaw/vv;

.field public final k0:Lcom/daaw/pr1;

.field public l0:F

.field public m0:Lcom/daaw/g0;
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

.field public n0:Lcom/daaw/t40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[F",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public o0:Lcom/daaw/t40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public p0:Lcom/daaw/t40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public q0:Lcom/daaw/t40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const-string v0, "internalres:particle_blur01"

    const-string v1, "internalres:particle_circle_blur4"

    const-string v2, "internalres:particle_circle_w_a_64"

    const-string v3, "internalres:particle_sharp"

    const-string v4, "composition:0"

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/yv0;->r0:[Ljava/lang/String;

    const-string v1, "internalres:particle_blur01"

    const-string v2, "internalres:particle_circle_blur4"

    const-string v3, "internalres:particle_circle_w_a_64"

    const-string v4, "internalres:particle_sharp"

    const-string v5, "internalres:snowflake"

    const-string v6, "internalres:year2018"

    const-string v7, "composition:0"

    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/yv0;->s0:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/4 v0, 0x2

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/yv0;->G:I

    new-array v3, v2, [Lcom/daaw/zd0;

    iput-object v3, p0, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    const/4 v3, 0x0

    iput v3, p0, Lcom/daaw/yv0;->I:F

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/daaw/yv0;->J:Lcom/daaw/pc0;

    const v5, 0x3cf5c28f    # 0.03f

    iput v5, p0, Lcom/daaw/yv0;->K:F

    iput-object v4, p0, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    const/4 v5, -0x1

    iput v5, p0, Lcom/daaw/yv0;->M:I

    const/high16 v6, 0x3f800000    # 1.0f

    iput v6, p0, Lcom/daaw/yv0;->N:F

    iput v6, p0, Lcom/daaw/yv0;->O:F

    invoke-static {}, Lcom/daaw/xn0;->a()Lcom/daaw/xn0;

    move-result-object v7

    iput-object v7, p0, Lcom/daaw/yv0;->P:Lcom/daaw/xn0;

    invoke-static {}, Lcom/daaw/xn0;->a()Lcom/daaw/xn0;

    move-result-object v7

    iput-object v7, p0, Lcom/daaw/yv0;->Q:Lcom/daaw/xn0;

    iput-boolean v2, p0, Lcom/daaw/yv0;->R:Z

    iput-boolean v2, p0, Lcom/daaw/yv0;->S:Z

    iput-object v4, p0, Lcom/daaw/yv0;->T:Lcom/daaw/qd0;

    iput v3, p0, Lcom/daaw/yv0;->U:F

    const/high16 v7, 0x42b40000    # 90.0f

    iput v7, p0, Lcom/daaw/yv0;->V:F

    iput-object v4, p0, Lcom/daaw/yv0;->W:Lcom/daaw/z6;

    new-instance v7, Lcom/daaw/ds1;

    invoke-direct {v7, v3, v3, v3}, Lcom/daaw/ds1;-><init>(FFF)V

    iput-object v7, p0, Lcom/daaw/yv0;->X:Lcom/daaw/ds1;

    new-instance v7, Lcom/daaw/ds1;

    invoke-direct {v7, v3, v3, v3}, Lcom/daaw/ds1;-><init>(FFF)V

    iput-object v7, p0, Lcom/daaw/yv0;->Y:Lcom/daaw/ds1;

    new-instance v7, Lcom/daaw/bs1;

    invoke-direct {v7, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/yv0;->Z:Lcom/daaw/bs1;

    new-instance v7, Lcom/daaw/bs1;

    invoke-direct {v7, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/yv0;->a0:Lcom/daaw/bs1;

    new-instance v7, Lcom/daaw/bs1;

    invoke-direct {v7, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/yv0;->b0:Lcom/daaw/bs1;

    new-instance v7, Lcom/daaw/bs1;

    invoke-direct {v7, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/yv0;->c0:Lcom/daaw/bs1;

    new-instance v7, Lcom/daaw/bs1;

    invoke-direct {v7, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/yv0;->d0:Lcom/daaw/bs1;

    const/4 v7, 0x4

    new-array v8, v7, [F

    iput-object v8, p0, Lcom/daaw/yv0;->e0:[F

    new-array v7, v7, [F

    iput-object v7, p0, Lcom/daaw/yv0;->f0:[F

    const v7, 0x40c90fdb

    iput v7, p0, Lcom/daaw/yv0;->i0:F

    new-instance v7, Lcom/daaw/pr1;

    invoke-direct {v7}, Lcom/daaw/pr1;-><init>()V

    iput-object v7, p0, Lcom/daaw/yv0;->k0:Lcom/daaw/pr1;

    const/high16 v7, 0x42200000    # 40.0f

    iput v7, p0, Lcom/daaw/yv0;->l0:F

    new-instance v7, Lcom/daaw/yv0$b;

    invoke-direct {v7, p0}, Lcom/daaw/yv0$b;-><init>(Lcom/daaw/yv0;)V

    iput-object v7, p0, Lcom/daaw/yv0;->m0:Lcom/daaw/g0;

    new-instance v7, Lcom/daaw/yv0$d;

    invoke-direct {v7, p0}, Lcom/daaw/yv0$d;-><init>(Lcom/daaw/yv0;)V

    iput-object v7, p0, Lcom/daaw/yv0;->n0:Lcom/daaw/t40;

    new-instance v7, Lcom/daaw/yv0$e;

    invoke-direct {v7, p0}, Lcom/daaw/yv0$e;-><init>(Lcom/daaw/yv0;)V

    iput-object v7, p0, Lcom/daaw/yv0;->o0:Lcom/daaw/t40;

    new-instance v7, Lcom/daaw/yv0$f;

    invoke-direct {v7, p0}, Lcom/daaw/yv0$f;-><init>(Lcom/daaw/yv0;)V

    iput-object v7, p0, Lcom/daaw/yv0;->p0:Lcom/daaw/t40;

    new-instance v7, Lcom/daaw/yv0$g;

    invoke-direct {v7, p0}, Lcom/daaw/yv0$g;-><init>(Lcom/daaw/yv0;)V

    iput-object v7, p0, Lcom/daaw/yv0;->q0:Lcom/daaw/t40;

    new-instance v7, Lcom/daaw/vv;

    new-instance v8, Lcom/daaw/yv0$a;

    invoke-direct {v8, p0}, Lcom/daaw/yv0$a;-><init>(Lcom/daaw/yv0;)V

    invoke-direct {v7, v8, v4, v4, v4}, Lcom/daaw/vv;-><init>(Lcom/daaw/vv$b;Lcom/daaw/r40;Lcom/daaw/s40;Lcom/daaw/s40;)V

    iput-object v7, p0, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    sget-object v4, Lcom/daaw/yv0;->r0:[Ljava/lang/String;

    aget-object v2, v4, v2

    invoke-virtual {p0, v2}, Lcom/daaw/yv0;->m0(Ljava/lang/String;)V

    new-instance v2, Lcom/daaw/hb;

    invoke-direct {v2}, Lcom/daaw/hb;-><init>()V

    invoke-virtual {p0, v2}, Lcom/daaw/yv0;->Y(Lcom/daaw/ae0;)V

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->J(I)V

    invoke-virtual {p0, v1, v1}, Lcom/daaw/tv;->R(FF)V

    const/16 v2, 0x5dc

    invoke-virtual {p0, v2}, Lcom/daaw/yv0;->r0(I)V

    const v2, 0x3ca3d70a    # 0.02f

    invoke-virtual {p0, v2}, Lcom/daaw/yv0;->t0(F)V

    new-instance v2, Lcom/daaw/w5;

    invoke-direct {v2}, Lcom/daaw/w5;-><init>()V

    invoke-virtual {v2, v6}, Lcom/daaw/w5;->r(F)Lcom/daaw/w5;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/daaw/yv0;->l0(Lcom/daaw/pc0;)V

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->J(I)V

    new-instance v0, Lcom/daaw/xn0;

    const-string v2, "Beat"

    const/high16 v6, 0x3fc00000    # 1.5f

    invoke-direct {v0, v2, v6}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;F)V

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->n0(Lcom/daaw/xn0;)V

    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->s0(F)V

    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->m0(Ljava/lang/String;)V

    const/high16 v0, 0x44610000    # 900.0f

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->u0(F)V

    const/high16 v0, 0x43160000    # 150.0f

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->v0(F)V

    invoke-virtual {p0}, Lcom/daaw/yv0;->j0()Lcom/daaw/hb;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/hb;->y(F)V

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-virtual {v0, v1}, Lcom/daaw/hb;->z(F)V

    invoke-virtual {v0, v5}, Lcom/daaw/hb;->r(I)V

    const v1, -0x7f7f7f80

    invoke-virtual {v0, v1}, Lcom/daaw/hb;->s(I)V

    const/high16 v1, 0x41000000    # 8.0f

    invoke-virtual {v0, v1}, Lcom/daaw/hb;->x(F)V

    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v1}, Lcom/daaw/hb;->v(F)V

    invoke-virtual {v0, v3}, Lcom/daaw/hb;->A(F)V

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Lcom/daaw/hb;->w(F)V

    invoke-virtual {v0, v1}, Lcom/daaw/hb;->t(F)V

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/daaw/hb;->u(F)V

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-virtual {v0, v1}, Lcom/daaw/a;->c(F)V

    const/high16 v1, 0x42700000    # 60.0f

    invoke-virtual {v0, v1}, Lcom/daaw/a;->j(F)V

    invoke-virtual {v0, v3}, Lcom/daaw/a;->q(F)V

    return-void
.end method

.method public static synthetic Z(Lcom/daaw/yv0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/tv;->m()V

    return-void
.end method

.method public static synthetic a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    return-object p0
.end method

.method public static synthetic b0(Lcom/daaw/yv0;)Lcom/daaw/qd0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yv0;->T:Lcom/daaw/qd0;

    return-object p0
.end method

.method public static synthetic c0(Lcom/daaw/yv0;)Lcom/daaw/bs1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yv0;->b0:Lcom/daaw/bs1;

    return-object p0
.end method

.method public static synthetic d0(Lcom/daaw/yv0;)Lcom/daaw/bs1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yv0;->Z:Lcom/daaw/bs1;

    return-object p0
.end method

.method public static synthetic e0(Lcom/daaw/yv0;)Lcom/daaw/bs1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yv0;->a0:Lcom/daaw/bs1;

    return-object p0
.end method

.method public static synthetic f0(Lcom/daaw/yv0;)[F
    .locals 0

    iget-object p0, p0, Lcom/daaw/yv0;->e0:[F

    return-object p0
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 21

    move-object/from16 v7, p0

    move-object/from16 v6, p1

    invoke-super/range {p0 .. p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-object v0, v7, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    move-object/from16 v5, p2

    invoke-virtual {v0, v6, v5}, Lcom/daaw/vv;->u(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-object v0, v7, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    array-length v0, v0

    iget v1, v7, Lcom/daaw/yv0;->G:I

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, v6, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {v7, v0}, Lcom/daaw/tv;->n(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v4

    const/4 v0, 0x0

    new-instance v3, Lcom/daaw/bs1;

    const/4 v2, 0x0

    invoke-direct {v3, v2, v2}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v1, Lcom/daaw/bs1;

    invoke-direct {v1, v2, v2}, Lcom/daaw/bs1;-><init>(FF)V

    iget v15, v7, Lcom/daaw/yv0;->U:F

    const/high16 v18, 0x3f800000    # 1.0f

    cmpl-float v8, v15, v18

    if-lez v8, :cond_1

    iget-object v0, v7, Lcom/daaw/yv0;->m0:Lcom/daaw/g0;

    iget-object v9, v7, Lcom/daaw/yv0;->k0:Lcom/daaw/pr1;

    iget v12, v7, Lcom/daaw/yv0;->V:F

    const/high16 v8, -0x3e600000    # -20.0f

    sub-float v14, v15, v8

    const/high16 v16, -0x41000000    # -0.5f

    const/high16 v17, -0x41000000    # -0.5f

    const/high16 v19, -0x3ee00000    # -10.0f

    const v13, 0x3c23d70a    # 0.01f

    move-object/from16 v8, p1

    move-object v10, v3

    move-object/from16 v11, p2

    move v2, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v19

    invoke-virtual/range {v8 .. v17}, Lcom/daaw/y31;->s(Lcom/daaw/pr1;Lcom/daaw/bs1;Lcom/daaw/e40;FFFFFF)V

    neg-float v2, v2

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v8

    iget v9, v3, Lcom/daaw/bs1;->a:F

    div-float/2addr v8, v9

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v9

    iget v10, v3, Lcom/daaw/bs1;->b:F

    div-float/2addr v9, v10

    move v10, v8

    move v11, v9

    move-object v8, v0

    move v9, v2

    goto :goto_0

    :cond_1
    move-object v8, v0

    const/4 v9, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    const/high16 v11, 0x3f800000    # 1.0f

    :goto_0
    iget v0, v7, Lcom/daaw/yv0;->I:F

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->E()F

    move-result v2

    add-float/2addr v0, v2

    iput v0, v7, Lcom/daaw/yv0;->I:F

    iget-object v0, v7, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    if-eqz v0, :cond_8

    iget-object v0, v7, Lcom/daaw/yv0;->J:Lcom/daaw/pc0;

    if-eqz v0, :cond_8

    const v0, 0x3c23d70a    # 0.01f

    iget v2, v7, Lcom/daaw/yv0;->K:F

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v7, Lcom/daaw/yv0;->K:F

    iget v2, v7, Lcom/daaw/yv0;->I:F

    mul-float v0, v0, v2

    const/high16 v12, 0x42c80000    # 100.0f

    mul-float v0, v0, v12

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, v7, Lcom/daaw/yv0;->I:F

    :goto_1
    iget v0, v7, Lcom/daaw/yv0;->I:F

    iget v2, v7, Lcom/daaw/yv0;->K:F

    cmpl-float v12, v0, v2

    if-lez v12, :cond_5

    sub-float/2addr v0, v2

    iput v0, v7, Lcom/daaw/yv0;->I:F

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/yv0;->g0()I

    move-result v12

    if-ltz v12, :cond_4

    iget-object v0, v7, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    array-length v0, v0

    if-ge v12, v0, :cond_4

    iget-object v0, v7, Lcom/daaw/yv0;->J:Lcom/daaw/pc0;

    iget-object v2, v7, Lcom/daaw/yv0;->X:Lcom/daaw/ds1;

    iget-object v13, v7, Lcom/daaw/yv0;->Y:Lcom/daaw/ds1;

    iget v14, v7, Lcom/daaw/yv0;->U:F

    cmpl-float v14, v14, v18

    if-lez v14, :cond_2

    const/4 v14, 0x1

    goto :goto_2

    :cond_2
    const/4 v14, 0x0

    :goto_2
    invoke-interface {v0, v4, v2, v13, v14}, Lcom/daaw/pc0;->l(Landroid/graphics/RectF;Lcom/daaw/ds1;Lcom/daaw/ds1;Z)V

    iget v0, v7, Lcom/daaw/yv0;->U:F

    cmpl-float v0, v0, v18

    if-lez v0, :cond_3

    iget v0, v3, Lcom/daaw/bs1;->a:F

    iget v2, v3, Lcom/daaw/bs1;->b:F

    div-float v13, v0, v2

    iget v14, v7, Lcom/daaw/yv0;->V:F

    move-object/from16 v0, p1

    move-object v15, v1

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move v2, v9

    move-object/from16 v20, v3

    move-object/from16 v3, p2

    move-object/from16 v17, v4

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/y31;->t(Lcom/daaw/bs1;FLcom/daaw/e40;FF)V

    iget v0, v15, Lcom/daaw/bs1;->a:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v0, v0, v1

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float/2addr v0, v2

    iget v2, v15, Lcom/daaw/bs1;->b:F

    mul-float v2, v2, v1

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v2, v1

    iget-object v1, v7, Lcom/daaw/yv0;->X:Lcom/daaw/ds1;

    iget v3, v1, Lcom/daaw/ds1;->a:F

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    sub-float/2addr v3, v4

    mul-float v3, v3, v0

    mul-float v3, v3, v10

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    add-float/2addr v3, v0

    iput v3, v1, Lcom/daaw/ds1;->a:F

    iget-object v0, v7, Lcom/daaw/yv0;->X:Lcom/daaw/ds1;

    iget v1, v0, Lcom/daaw/ds1;->b:F

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    sub-float/2addr v1, v3

    mul-float v1, v1, v2

    mul-float v1, v1, v11

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/ds1;->b:F

    goto :goto_3

    :cond_3
    move-object v15, v1

    move-object/from16 v20, v3

    move-object/from16 v17, v4

    move-object/from16 v16, v8

    const/4 v8, 0x0

    iget-object v0, v7, Lcom/daaw/yv0;->Y:Lcom/daaw/ds1;

    iput v8, v0, Lcom/daaw/ds1;->c:F

    :goto_3
    iget-object v0, v7, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    iget-object v1, v7, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    aget-object v1, v1, v12

    new-instance v2, Lcom/daaw/ds1;

    iget-object v3, v7, Lcom/daaw/yv0;->X:Lcom/daaw/ds1;

    iget v4, v3, Lcom/daaw/ds1;->a:F

    iget v3, v3, Lcom/daaw/ds1;->b:F

    invoke-direct {v2, v4, v3, v9}, Lcom/daaw/ds1;-><init>(FFF)V

    iget-object v3, v7, Lcom/daaw/yv0;->Y:Lcom/daaw/ds1;

    invoke-interface {v0, v6, v1, v2, v3}, Lcom/daaw/ae0;->g(Lcom/daaw/y31;Lcom/daaw/zd0;Lcom/daaw/ds1;Lcom/daaw/ds1;)Z

    goto :goto_4

    :cond_4
    move-object v15, v1

    move-object/from16 v20, v3

    move-object/from16 v17, v4

    move-object/from16 v16, v8

    const/4 v8, 0x0

    :goto_4
    move-object/from16 v5, p2

    move-object v1, v15

    move-object/from16 v8, v16

    move-object/from16 v4, v17

    move-object/from16 v3, v20

    goto/16 :goto_1

    :cond_5
    move-object/from16 v20, v3

    move-object/from16 v17, v4

    move-object/from16 v16, v8

    iget-object v0, v7, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    invoke-virtual {v0, v6}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v0

    if-nez v0, :cond_6

    iget-object v0, v6, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->c()Lcom/daaw/z6;

    move-result-object v0

    :cond_6
    iget-object v1, v6, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v1}, Lcom/daaw/y31$c;->t()Lcom/daaw/qr1;

    move-result-object v1

    new-instance v5, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v2

    move-object/from16 v3, v16

    invoke-direct {v5, v2, v0, v1, v3}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    iget v0, v7, Lcom/daaw/yv0;->U:F

    cmpl-float v0, v0, v18

    if-lez v0, :cond_7

    iget-object v0, v7, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    invoke-interface {v0}, Lcom/daaw/ae0;->b()F

    move-result v4

    new-instance v8, Lcom/daaw/bs1;

    move-object/from16 v0, v20

    iget v1, v0, Lcom/daaw/bs1;->a:F

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v1, v1, v2

    iget v0, v0, Lcom/daaw/bs1;->b:F

    mul-float v0, v0, v2

    invoke-direct {v8, v1, v0}, Lcom/daaw/bs1;-><init>(FF)V

    goto :goto_5

    :cond_7
    iget-object v0, v7, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    invoke-interface {v0}, Lcom/daaw/ae0;->b()F

    move-result v4

    const/4 v8, 0x0

    :goto_5
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, v17

    move-object v6, v8

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/yv0;->w0(Lcom/daaw/y31;Lcom/daaw/e40;Landroid/graphics/RectF;FLcom/daaw/w31;Lcom/daaw/bs1;)V

    :cond_8
    return-void
.end method

.method public Y(Lcom/daaw/ae0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    invoke-virtual {p0}, Lcom/daaw/yv0;->l()V

    return-void
.end method

.method public g0()I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-interface {v1}, Lcom/daaw/zd0;->e()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    return v0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "Particles"

    return-object v0
.end method

.method public h0()F
    .locals 1

    iget v0, p0, Lcom/daaw/yv0;->l0:F

    return v0
.end method

.method public i0()I
    .locals 1

    iget v0, p0, Lcom/daaw/yv0;->G:I

    return v0
.end method

.method public j0()Lcom/daaw/hb;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    check-cast v0, Lcom/daaw/hb;

    return-object v0
.end method

.method public k0(Lcom/daaw/zd0;FFFF[F)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/yv0;->c0:Lcom/daaw/bs1;

    invoke-interface {p1}, Lcom/daaw/zd0;->b()F

    move-result v1

    neg-float v1, v1

    iput v1, v0, Lcom/daaw/bs1;->a:F

    iget-object v0, p0, Lcom/daaw/yv0;->c0:Lcom/daaw/bs1;

    invoke-interface {p1}, Lcom/daaw/zd0;->c()F

    move-result v1

    neg-float v1, v1

    iput v1, v0, Lcom/daaw/bs1;->b:F

    iget-object v0, p0, Lcom/daaw/yv0;->c0:Lcom/daaw/bs1;

    invoke-virtual {v0, p5}, Lcom/daaw/bs1;->r(F)V

    iget-object v0, p0, Lcom/daaw/yv0;->d0:Lcom/daaw/bs1;

    invoke-interface {p1}, Lcom/daaw/zd0;->b()F

    move-result v1

    iput v1, v0, Lcom/daaw/bs1;->a:F

    iget-object v0, p0, Lcom/daaw/yv0;->d0:Lcom/daaw/bs1;

    invoke-interface {p1}, Lcom/daaw/zd0;->c()F

    move-result p1

    neg-float p1, p1

    iput p1, v0, Lcom/daaw/bs1;->b:F

    iget-object p1, p0, Lcom/daaw/yv0;->d0:Lcom/daaw/bs1;

    invoke-virtual {p1, p5}, Lcom/daaw/bs1;->r(F)V

    iget-object p1, p0, Lcom/daaw/yv0;->c0:Lcom/daaw/bs1;

    iget p5, p1, Lcom/daaw/bs1;->a:F

    add-float v0, p2, p5

    const/4 v1, 0x0

    aput v0, p6, v1

    iget p1, p1, Lcom/daaw/bs1;->b:F

    add-float v0, p3, p1

    const/4 v1, 0x1

    aput v0, p6, v1

    iget-object v0, p0, Lcom/daaw/yv0;->d0:Lcom/daaw/bs1;

    iget v1, v0, Lcom/daaw/bs1;->a:F

    add-float v2, p2, v1

    const/4 v3, 0x2

    aput v2, p6, v3

    iget v0, v0, Lcom/daaw/bs1;->b:F

    add-float v2, p3, v0

    const/4 v3, 0x3

    aput v2, p6, v3

    sub-float v1, p2, v1

    const/4 v2, 0x4

    aput v1, p6, v2

    sub-float v0, p3, v0

    const/4 v1, 0x5

    aput v0, p6, v1

    sub-float/2addr p2, p5

    const/4 p5, 0x6

    aput p2, p6, p5

    sub-float/2addr p3, p1

    const/4 p1, 0x7

    aput p3, p6, p1

    const/16 p1, 0x8

    aput p4, p6, p1

    return-void
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/tv;->l()V

    iget-object v0, p0, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vv;->p()V

    :cond_0
    return-void
.end method

.method public l0(Lcom/daaw/pc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yv0;->J:Lcom/daaw/pc0;

    return-void
.end method

.method public m0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->C(Ljava/lang/String;)V

    return-void
.end method

.method public n0(Lcom/daaw/xn0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yv0;->Q:Lcom/daaw/xn0;

    return-void
.end method

.method public o0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/yv0;->S:Z

    return-void
.end method

.method public p0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/yv0;->R:Z

    return-void
.end method

.method public q0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/yv0;->l0:F

    return-void
.end method

.method public r0(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/yv0;->G:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/yv0;->G:I

    invoke-virtual {p0}, Lcom/daaw/yv0;->l()V

    return-void
.end method

.method public s0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/yv0;->N:F

    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/daaw/tv;->t(Lcom/daaw/un;)V

    sget-object v0, Lcom/daaw/yv0;->r0:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v2, "customImage"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->m0(Ljava/lang/String;)V

    const-string v0, "color"

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/yv0;->M:I

    const-string v0, "CountLimit"

    const/16 v2, 0x5dc

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->r0(I)V

    const-string v0, "particleScale"

    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/yv0;->N:F

    const-string v0, "spawnTime"

    const v2, 0x3ca3d70a    # 0.02f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/yv0;->K:F

    const-string v0, "mirrorX"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->o0(Z)V

    const-string v0, "mirrorY"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->p0(Z)V

    const-string v0, "perspectiveDepth"

    const/high16 v1, 0x44610000    # 900.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->u0(F)V

    const-string v0, "perspectiveFov"

    const/high16 v1, 0x43160000    # 150.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/yv0;->v0(F)V

    const-string v0, "SpawnArea"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    const-string v1, "Rectangle"

    invoke-virtual {v0, v1}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/yv0;->J:Lcom/daaw/pc0;

    invoke-static {v1, v2}, Lcom/daaw/s5;->a(Ljava/lang/String;Lcom/daaw/pc0;)Lcom/daaw/pc0;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/yv0;->l0(Lcom/daaw/pc0;)V

    iget-object v1, p0, Lcom/daaw/yv0;->J:Lcom/daaw/pc0;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/daaw/zc0;->a(Lcom/daaw/un;)V

    :cond_0
    const-string v0, "MeasureOverallSpeed"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/yv0;->Q:Lcom/daaw/xn0;

    const/high16 v2, 0x3fc00000    # 1.5f

    const-string v3, "Beat"

    invoke-virtual {v1, v0, v3, v2}, Lcom/daaw/xn0;->m(Lcom/daaw/un;Ljava/lang/String;F)V

    iget-object v0, p0, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/daaw/zc0;->a(Lcom/daaw/un;)V

    :cond_1
    const-string v0, "ForceField"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    const-string v1, "None"

    invoke-virtual {v0, v1}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/yv0;->T:Lcom/daaw/qd0;

    invoke-static {v1, v2}, Lcom/daaw/e30;->a(Ljava/lang/String;Lcom/daaw/qd0;)Lcom/daaw/qd0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/yv0;->T:Lcom/daaw/qd0;

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Lcom/daaw/zc0;->a(Lcom/daaw/un;)V

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/yv0;->h0()F

    move-result v0

    const-string v1, "nearCameraFadeOutDistance"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/yv0;->q0(F)V

    return-void
.end method

.method public t0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/yv0;->K:F

    return-void
.end method

.method public u0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/yv0;->U:F

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 5

    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    iget-object v0, p0, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    array-length v0, v0

    iget v1, p0, Lcom/daaw/yv0;->G:I

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    if-eqz v0, :cond_0

    new-array v0, v1, [Lcom/daaw/zd0;

    iput-object v0, p0, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    array-length v3, v1

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    invoke-interface {v3}, Lcom/daaw/ae0;->h()Lcom/daaw/zd0;

    move-result-object v3

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-array v0, v2, [Lcom/daaw/zd0;

    iput-object v0, p0, Lcom/daaw/yv0;->H:[Lcom/daaw/zd0;

    :cond_1
    iget-object v0, p0, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    new-instance v1, Landroid/graphics/RectF;

    const/4 v3, 0x0

    const/high16 v4, 0x43800000    # 256.0f

    invoke-direct {v1, v3, v3, v4, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/vv;->q(Lcom/daaw/y31;Landroid/graphics/RectF;I)Z

    const/4 p1, 0x1

    return p1
.end method

.method public v0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/yv0;->V:F

    return-void
.end method

.method public w(Lcom/daaw/y31;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->w(Lcom/daaw/y31;I)V

    iget-object v0, p0, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->r(Lcom/daaw/y31;I)Z

    return-void
.end method

.method public final w0(Lcom/daaw/y31;Lcom/daaw/e40;Landroid/graphics/RectF;FLcom/daaw/w31;Lcom/daaw/bs1;)V
    .locals 22

    move-object/from16 v10, p0

    move-object/from16 v12, p1

    iget v0, v10, Lcom/daaw/yv0;->N:F

    iget-object v1, v10, Lcom/daaw/yv0;->P:Lcom/daaw/xn0;

    iget-object v2, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v2, v2, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {v1, v2}, Lcom/daaw/xn0;->i(Lcom/daaw/aq0;)F

    move-result v1

    add-float/2addr v0, v1

    iget v1, v10, Lcom/daaw/yv0;->O:F

    iget-object v2, v10, Lcom/daaw/yv0;->Q:Lcom/daaw/xn0;

    iget-object v3, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v3, v3, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {v2, v3}, Lcom/daaw/xn0;->i(Lcom/daaw/aq0;)F

    move-result v2

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float v2, v2, v3

    add-float v6, v1, v2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/aq0;->e(F)F

    move-result v0

    const v1, 0x3a83126f    # 0.001f

    mul-float v5, v0, v1

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Lcom/daaw/aq0;->e(F)F

    move-result v0

    const v1, 0x3ab60b61

    mul-float v7, v0, v1

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/aq0;->e(F)F

    move-result v4

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iput v0, v10, Lcom/daaw/yv0;->g0:F

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    iput v0, v10, Lcom/daaw/yv0;->h0:F

    iget-object v0, v10, Lcom/daaw/yv0;->f0:[F

    iget v1, v10, Lcom/daaw/yv0;->M:I

    invoke-static {v0, v1}, Lcom/daaw/f80;->n([FI)V

    iget v0, v10, Lcom/daaw/yv0;->l0:F

    const v1, 0x358637bd    # 1.0E-6f

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v9

    iget-object v0, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v11

    new-instance v13, Lcom/daaw/yv0$c;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p1

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v9}, Lcom/daaw/yv0$c;-><init>(Lcom/daaw/yv0;Landroid/graphics/RectF;Lcom/daaw/y31;FFFFLcom/daaw/bs1;F)V

    iget-boolean v0, v10, Lcom/daaw/yv0;->S:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, v10, Lcom/daaw/yv0;->o0:Lcom/daaw/t40;

    move-object v14, v2

    goto :goto_0

    :cond_0
    move-object v14, v1

    :goto_0
    iget-boolean v2, v10, Lcom/daaw/yv0;->R:Z

    if-eqz v2, :cond_1

    iget-object v3, v10, Lcom/daaw/yv0;->p0:Lcom/daaw/t40;

    move-object v15, v3

    goto :goto_1

    :cond_1
    move-object v15, v1

    :goto_1
    if-eqz v0, :cond_2

    if-eqz v2, :cond_2

    iget-object v0, v10, Lcom/daaw/yv0;->q0:Lcom/daaw/t40;

    move-object/from16 v16, v0

    goto :goto_2

    :cond_2
    move-object/from16 v16, v1

    :goto_2
    iget v0, v10, Lcom/daaw/yv0;->G:I

    const/16 v18, 0x0

    new-instance v1, Lcom/daaw/bs1;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v4, Lcom/daaw/bs1;

    invoke-direct {v4, v3, v2}, Lcom/daaw/bs1;-><init>(FF)V

    move-object/from16 v12, p1

    move/from16 v17, v0

    move-object/from16 v19, v1

    move-object/from16 v20, v4

    move-object/from16 v21, p5

    invoke-virtual/range {v11 .. v21}, Lcom/daaw/tc;->j(Lcom/daaw/y31;Lcom/daaw/t40;Lcom/daaw/t40;Lcom/daaw/t40;Lcom/daaw/t40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    return-void
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    iget-object v0, p0, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->s(Lcom/daaw/y31;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    iget-object v0, p0, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vv;->t(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 7

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    const v0, 0x7f1002a5

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/od0;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/yv0;->j0:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    sget-boolean v1, Lcom/daaw/c60;->m:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/daaw/yv0;->s0:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/daaw/yv0;->r0:[Ljava/lang/String;

    :goto_0
    const-string v2, "customImage"

    const-string v3, "appearance"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/un;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    iget v0, p0, Lcom/daaw/yv0;->M:I

    const-string v1, "color"

    const-string v6, "1_overall"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/yv0;->i0()I

    move-result v2

    const/4 v4, 0x1

    const/16 v5, 0x1388

    const-string v1, "CountLimit"

    const-string v3, "1_overall"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    iget v2, p0, Lcom/daaw/yv0;->N:F

    const/high16 v4, 0x3e800000    # 0.25f

    const/high16 v5, 0x41000000    # 8.0f

    const-string v1, "particleScale"

    const-string v3, "appearance"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/yv0;->K:F

    const v4, 0x3ba3d70a    # 0.005f

    const v5, 0x3d4ccccd    # 0.05f

    const-string v1, "spawnTime"

    const-string v3, "behaviour"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget-boolean v0, p0, Lcom/daaw/yv0;->S:Z

    const-string v1, "mirrorX"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/yv0;->R:Z

    const-string v1, "mirrorY"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget v2, p0, Lcom/daaw/yv0;->U:F

    const/4 v4, 0x0

    const/high16 v5, 0x447a0000    # 1000.0f

    const-string v1, "perspectiveDepth"

    const-string v3, "1_overall"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/yv0;->V:F

    const/high16 v4, 0x41f00000    # 30.0f

    const/high16 v5, 0x43340000    # 180.0f

    const-string v1, "perspectiveFov"

    const-string v3, "1_overall"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget-object v0, p0, Lcom/daaw/yv0;->J:Lcom/daaw/pc0;

    invoke-static {v0}, Lcom/daaw/s5;->b(Lcom/daaw/pc0;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/s5;->a:[Ljava/lang/String;

    const-string v2, "SpawnArea"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/yv0;->J:Lcom/daaw/pc0;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Lcom/daaw/zc0;->o(Lcom/daaw/un;)V

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "MeasureOverallSpeed"

    const-string v2, ""

    const-string v3, "behaviour"

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/yv0;->Q:Lcom/daaw/xn0;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lcom/daaw/xn0;->r(Lcom/daaw/un;)V

    :cond_2
    iget-object v0, p0, Lcom/daaw/yv0;->L:Lcom/daaw/ae0;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lcom/daaw/zc0;->o(Lcom/daaw/un;)V

    :cond_3
    iget-object v0, p0, Lcom/daaw/yv0;->T:Lcom/daaw/qd0;

    invoke-static {v0}, Lcom/daaw/e30;->b(Lcom/daaw/qd0;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/e30;->a:[Ljava/lang/String;

    const-string v2, "ForceField"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/yv0;->T:Lcom/daaw/qd0;

    if-eqz v1, :cond_4

    invoke-interface {v1, v0}, Lcom/daaw/zc0;->o(Lcom/daaw/un;)V

    :cond_4
    invoke-virtual {p0}, Lcom/daaw/yv0;->h0()F

    move-result v2

    const/4 v4, 0x0

    const/high16 v5, 0x43fa0000    # 500.0f

    const-string v1, "nearCameraFadeOutDistance"

    const-string v3, "appearance"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method
