.class public abstract Lcom/daaw/tv;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tv$a;
    }
.end annotation


# static fields
.field public static C:Ljava/lang/String; = "10"

.field public static final D:[Ljava/lang/String;

.field public static E:Lcom/daaw/ge0;

.field public static F:Lcom/daaw/za1;


# instance fields
.field public A:Z

.field public B:F

.field public a:I

.field public b:F

.field public c:F

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Lcom/daaw/uv;

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:Lcom/daaw/xn0;

.field public m:F

.field public n:Lcom/daaw/xn0;

.field public o:I

.field public p:I

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:F

.field public y:F

.field public z:Lcom/daaw/xn0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "Na"

    const-string v1, "Start"

    const-string v2, "Center"

    const-string v3, "End"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/tv;->D:[Ljava/lang/String;

    new-instance v0, Lcom/daaw/qa1;

    invoke-direct {v0}, Lcom/daaw/qa1;-><init>()V

    sput-object v0, Lcom/daaw/tv;->E:Lcom/daaw/ge0;

    new-instance v0, Lcom/daaw/za1;

    invoke-direct {v0}, Lcom/daaw/za1;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v1, v1}, Lcom/daaw/xa1;->s(III)Lcom/daaw/xa1;

    move-result-object v0

    check-cast v0, Lcom/daaw/za1;

    sput-object v0, Lcom/daaw/tv;->F:Lcom/daaw/za1;

    return-void
.end method

.method public constructor <init>(IFF)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Nothing"

    iput-object v0, p0, Lcom/daaw/tv;->d:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/tv;->e:I

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/tv;->f:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/tv;->h:Z

    iput v0, p0, Lcom/daaw/tv;->i:I

    iput v0, p0, Lcom/daaw/tv;->j:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/tv;->k:Z

    invoke-static {}, Lcom/daaw/xn0;->a()Lcom/daaw/xn0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/tv;->l:Lcom/daaw/xn0;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/tv;->m:F

    invoke-static {}, Lcom/daaw/xn0;->a()Lcom/daaw/xn0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/tv;->n:Lcom/daaw/xn0;

    iput v0, p0, Lcom/daaw/tv;->o:I

    iput v0, p0, Lcom/daaw/tv;->p:I

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, p0, Lcom/daaw/tv;->q:F

    iput v1, p0, Lcom/daaw/tv;->r:F

    iput v1, p0, Lcom/daaw/tv;->s:F

    iput v1, p0, Lcom/daaw/tv;->t:F

    iput-boolean v0, p0, Lcom/daaw/tv;->v:Z

    iput-boolean v0, p0, Lcom/daaw/tv;->w:Z

    iput v1, p0, Lcom/daaw/tv;->x:F

    iput v1, p0, Lcom/daaw/tv;->y:F

    invoke-static {}, Lcom/daaw/xn0;->a()Lcom/daaw/xn0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/tv;->z:Lcom/daaw/xn0;

    iput-boolean v0, p0, Lcom/daaw/tv;->A:Z

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lcom/daaw/tv;->B:F

    invoke-static {}, Lcom/daaw/tv$a;->a()I

    move-result v0

    iput v0, p0, Lcom/daaw/tv;->e:I

    iput p1, p0, Lcom/daaw/tv;->a:I

    iput p2, p0, Lcom/daaw/tv;->b:F

    iput p3, p0, Lcom/daaw/tv;->c:F

    return-void
.end method

.method public static H(Landroid/graphics/PointF;FFLandroid/graphics/PointF;F)V
    .locals 8

    float-to-double v0, p1

    iget v2, p3, Landroid/graphics/PointF;->x:F

    sub-float/2addr v2, p1

    float-to-double v2, v2

    float-to-double v4, p4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v6

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v0, v2

    iget p4, p3, Landroid/graphics/PointF;->y:F

    sub-float/2addr p4, p2

    float-to-double v2, p4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v6

    sub-double/2addr v0, v2

    double-to-float p4, v0

    iput p4, p0, Landroid/graphics/PointF;->x:F

    float-to-double v0, p2

    iget p4, p3, Landroid/graphics/PointF;->x:F

    sub-float/2addr p4, p1

    float-to-double v2, p4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v6

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v0, v2

    iget p1, p3, Landroid/graphics/PointF;->y:F

    sub-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide p3

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, p3

    add-double/2addr v0, p1

    double-to-float p1, v0

    iput p1, p0, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method public static I(Landroid/graphics/PointF;Landroid/graphics/PointF;F)V
    .locals 8

    iget v0, p1, Landroid/graphics/PointF;->x:F

    float-to-double v0, v0

    float-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v4

    iget p2, p1, Landroid/graphics/PointF;->y:F

    float-to-double v4, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v6

    sub-double/2addr v0, v4

    double-to-float p2, v0

    iput p2, p0, Landroid/graphics/PointF;->x:F

    iget p2, p1, Landroid/graphics/PointF;->x:F

    float-to-double v0, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v4

    iget p1, p1, Landroid/graphics/PointF;->y:F

    float-to-double p1, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, v2

    add-double/2addr v0, p1

    double-to-float p1, v0

    iput p1, p0, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method public static r(Lcom/daaw/aq0;Lcom/daaw/dm0;Lcom/daaw/dm0;)Landroid/graphics/RectF;
    .locals 5

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    invoke-virtual {p1, p0, v0}, Lcom/daaw/dm0;->j(Lcom/daaw/aq0;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    const/high16 p1, 0x3f000000    # 0.5f

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1}, Lcom/daaw/aq0;->k(FZ)F

    move-result v2

    iget v3, v0, Lcom/daaw/bs1;->a:F

    invoke-virtual {p0, v3, v1}, Lcom/daaw/aq0;->k(FZ)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p0, p1, v1}, Lcom/daaw/aq0;->l(FZ)F

    move-result v3

    iget v4, v0, Lcom/daaw/bs1;->b:F

    invoke-virtual {p0, v4, v1}, Lcom/daaw/aq0;->l(FZ)F

    move-result v1

    sub-float/2addr v3, v1

    invoke-virtual {p2, p0, v0}, Lcom/daaw/dm0;->j(Lcom/daaw/aq0;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    iget p2, v0, Lcom/daaw/bs1;->a:F

    const/4 v1, 0x0

    invoke-virtual {p0, p2, v1}, Lcom/daaw/aq0;->f(FZ)F

    move-result p2

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-virtual {p0, v0, v1}, Lcom/daaw/aq0;->g(FZ)F

    move-result v0

    invoke-virtual {p0, p1, v1, p2, v0}, Lcom/daaw/aq0;->c(FZFF)F

    move-result v4

    sub-float/2addr v2, v4

    invoke-virtual {p0, p1, v1, p2, v0}, Lcom/daaw/aq0;->d(FZFF)F

    move-result p0

    sub-float/2addr v3, p0

    new-instance p0, Landroid/graphics/RectF;

    add-float/2addr p2, v2

    add-float/2addr v0, v3

    invoke-direct {p0, v2, v3, p2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p0
.end method


# virtual methods
.method public A(Lcom/daaw/un;)V
    .locals 8

    iget v0, p0, Lcom/daaw/tv;->m:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v4, v0, v1

    const-string v3, "rotation"

    const-string v5, "0_general"

    const/4 v6, 0x0

    const/high16 v7, 0x43960000    # 300.0f

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "measureRot"

    const-string v2, ""

    const-string v3, "0_general"

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/tv;->l:Lcom/daaw/xn0;

    invoke-virtual {v0, p1}, Lcom/daaw/xn0;->o(Lcom/daaw/un;)V

    return-void
.end method

.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/tv;->C(Lcom/daaw/y31;)V

    invoke-virtual {p1, p2}, Lcom/daaw/y31;->i(Lcom/daaw/e40;)V

    iget p2, p0, Lcom/daaw/tv;->i:I

    invoke-virtual {p1, p2}, Lcom/daaw/y31;->e(I)V

    return-void
.end method

.method public C(Lcom/daaw/y31;)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/tv;->h:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    invoke-virtual {p1}, Lcom/daaw/y31;->n()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/tv;->h:Z

    iget v1, p0, Lcom/daaw/tv;->j:I

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/y31;->l()V

    :cond_1
    iget v1, p0, Lcom/daaw/tv;->j:I

    invoke-virtual {p0, p1, v1}, Lcom/daaw/tv;->w(Lcom/daaw/y31;I)V

    iget p1, p0, Lcom/daaw/tv;->j:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/tv;->j:I

    return-void
.end method

.method public D(Lcom/daaw/y31;)V
    .locals 10

    iget v0, p0, Lcom/daaw/tv;->B:F

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v0, v1

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v2, v2, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {p0, v2}, Lcom/daaw/tv;->n(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v5

    iget v2, p0, Lcom/daaw/tv;->B:F

    invoke-virtual {p1}, Lcom/daaw/y31;->d()F

    move-result v3

    add-float/2addr v2, v3

    iput v2, p0, Lcom/daaw/tv;->B:F

    sub-float/2addr v1, v0

    sget-object v0, Lcom/daaw/tv;->F:Lcom/daaw/za1;

    invoke-static {v1, v1, v1, v1}, Lcom/daaw/f80;->e(FFFF)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/xa1;->r(I)Lcom/daaw/xa1;

    const/4 v4, 0x0

    const/16 v6, 0x8

    const/high16 v7, 0x40200000    # 2.5f

    sget-object v8, Lcom/daaw/tv;->F:Lcom/daaw/za1;

    sget-object v9, Lcom/daaw/tv;->E:Lcom/daaw/ge0;

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Lcom/daaw/na1;->Z(Lcom/daaw/de0;ILandroid/graphics/RectF;IFLcom/daaw/he0;Lcom/daaw/ge0;)V

    return-void
.end method

.method public E(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/tv;->C(Lcom/daaw/y31;)V

    return-void
.end method

.method public F(Lcom/daaw/y31;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/tv;->C(Lcom/daaw/y31;)V

    return-void
.end method

.method public G(Lcom/daaw/de0;Lcom/daaw/e40;)V
    .locals 0

    invoke-interface {p1, p2}, Lcom/daaw/de0;->i(Lcom/daaw/e40;)V

    iget p2, p0, Lcom/daaw/tv;->i:I

    invoke-interface {p1, p2}, Lcom/daaw/de0;->e(I)V

    return-void
.end method

.method public J(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/tv;->i:I

    return-void
.end method

.method public K(Lcom/daaw/un;I)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/tv;->t(Lcom/daaw/un;)V

    const/4 p1, 0x1

    return p1
.end method

.method public L(FF)V
    .locals 0

    iput p1, p0, Lcom/daaw/tv;->s:F

    iput p2, p0, Lcom/daaw/tv;->t:F

    return-void
.end method

.method public M(Lcom/daaw/bs1;)V
    .locals 1

    iget v0, p1, Lcom/daaw/bs1;->a:F

    iput v0, p0, Lcom/daaw/tv;->s:F

    iget p1, p1, Lcom/daaw/bs1;->b:F

    iput p1, p0, Lcom/daaw/tv;->t:F

    return-void
.end method

.method public N(FF)V
    .locals 0

    iput p1, p0, Lcom/daaw/tv;->q:F

    iput p2, p0, Lcom/daaw/tv;->r:F

    return-void
.end method

.method public O(Lcom/daaw/bs1;)V
    .locals 1

    iget v0, p1, Lcom/daaw/bs1;->a:F

    iput v0, p0, Lcom/daaw/tv;->q:F

    iget p1, p1, Lcom/daaw/bs1;->b:F

    iput p1, p0, Lcom/daaw/tv;->r:F

    return-void
.end method

.method public P(ZZ)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/tv;->u:Z

    iput-boolean p2, p0, Lcom/daaw/tv;->v:Z

    return-void
.end method

.method public Q(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/tv;->m:F

    return-void
.end method

.method public R(FF)V
    .locals 0

    iput p1, p0, Lcom/daaw/tv;->x:F

    iput p2, p0, Lcom/daaw/tv;->y:F

    return-void
.end method

.method public S(Lcom/daaw/bs1;)V
    .locals 1

    iget v0, p1, Lcom/daaw/bs1;->a:F

    iput v0, p0, Lcom/daaw/tv;->x:F

    iget p1, p1, Lcom/daaw/bs1;->b:F

    iput p1, p0, Lcom/daaw/tv;->y:F

    return-void
.end method

.method public T(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/tv;->A:Z

    return-void
.end method

.method public U(I)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/tv;->X()V

    return-void
.end method

.method public V(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/tv;->k:Z

    return-void
.end method

.method public W()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/tv;->k:Z

    return v0
.end method

.method public X()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/tv;->B:F

    return-void
.end method

.method public b(Lcom/daaw/y31;Lcom/daaw/pr1;FFF)V
    .locals 7

    const/high16 v6, -0x3ee00000    # -10.0f

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tv;->c(Lcom/daaw/y31;Lcom/daaw/pr1;FFFF)V

    return-void
.end method

.method public c(Lcom/daaw/y31;Lcom/daaw/pr1;FFFF)V
    .locals 3

    iget-object v0, p1, Lcom/daaw/y31;->A:Lcom/daaw/pr1;

    invoke-virtual {v0}, Lcom/daaw/pr1;->d()V

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float p5, p5, v1

    invoke-virtual {v0, p5}, Lcom/daaw/pr1;->c(F)V

    iget-object p5, p1, Lcom/daaw/y31;->C:Lcom/daaw/pr1;

    invoke-virtual {p5}, Lcom/daaw/pr1;->d()V

    iget-object p5, p1, Lcom/daaw/y31;->C:Lcom/daaw/pr1;

    neg-float v1, p3

    neg-float v2, p4

    invoke-virtual {p5, v1, v2, p6}, Lcom/daaw/pr1;->e(FFF)V

    iget-object p5, p1, Lcom/daaw/y31;->B:Lcom/daaw/pr1;

    iget-object p6, p1, Lcom/daaw/y31;->C:Lcom/daaw/pr1;

    invoke-virtual {p5, v0, p6}, Lcom/daaw/pr1;->b(Lcom/daaw/pr1;Lcom/daaw/pr1;)V

    invoke-virtual {v0}, Lcom/daaw/pr1;->d()V

    const/4 p5, 0x0

    invoke-virtual {v0, p3, p4, p5}, Lcom/daaw/pr1;->e(FFF)V

    iget-object p3, p1, Lcom/daaw/y31;->C:Lcom/daaw/pr1;

    iget-object p4, p1, Lcom/daaw/y31;->B:Lcom/daaw/pr1;

    invoke-virtual {p3, v0, p4}, Lcom/daaw/pr1;->b(Lcom/daaw/pr1;Lcom/daaw/pr1;)V

    iget-object p3, p1, Lcom/daaw/y31;->C:Lcom/daaw/pr1;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/y31;->r(Lcom/daaw/pr1;Lcom/daaw/pr1;)V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->k(Lcom/daaw/y31;)V

    return-void
.end method

.method public e(I)Lcom/daaw/tv;
    .locals 1

    iget v0, p0, Lcom/daaw/tv;->e:I

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/daaw/tv;->i:I

    return v0
.end method

.method public g(Lcom/daaw/un;ILcom/daaw/od0;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/tv;->h()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/un;->E(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/tv;->i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/un;->r0(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lcom/daaw/tv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    const/4 p1, 0x1

    return p1
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public i()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/daaw/tv;->C:Ljava/lang/String;

    return-object v0
.end method

.method public j(I)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/daaw/dx0;->c()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public k(Lcom/daaw/y31;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    invoke-virtual {p0}, Lcom/daaw/tv;->m()V

    return-void
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/tv;->h:Z

    iput v0, p0, Lcom/daaw/tv;->j:I

    return-void
.end method

.method public m()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/tv;->h:Z

    iput v0, p0, Lcom/daaw/tv;->j:I

    return-void
.end method

.method public n(Lcom/daaw/aq0;)Landroid/graphics/RectF;
    .locals 7

    iget-object v0, p0, Lcom/daaw/tv;->n:Lcom/daaw/xn0;

    invoke-virtual {v0, p1}, Lcom/daaw/xn0;->l(Lcom/daaw/aq0;)Lcom/daaw/bs1;

    move-result-object v0

    iget v1, p0, Lcom/daaw/tv;->o:I

    invoke-virtual {p1, v1}, Lcom/daaw/aq0;->i(I)F

    move-result v1

    iget v2, p0, Lcom/daaw/tv;->q:F

    iget v3, p0, Lcom/daaw/tv;->o:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    iget-boolean v3, p0, Lcom/daaw/tv;->u:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-virtual {p1, v2, v3}, Lcom/daaw/aq0;->k(FZ)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, v0, Lcom/daaw/bs1;->a:F

    invoke-virtual {p1, v2, v5}, Lcom/daaw/aq0;->k(FZ)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, p0, Lcom/daaw/tv;->p:I

    invoke-virtual {p1, v2}, Lcom/daaw/aq0;->j(I)F

    move-result v2

    iget v3, p0, Lcom/daaw/tv;->r:F

    iget v6, p0, Lcom/daaw/tv;->p:I

    if-nez v6, :cond_3

    iget-boolean v6, p0, Lcom/daaw/tv;->v:Z

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v6, 0x1

    :goto_3
    invoke-virtual {p1, v3, v6}, Lcom/daaw/aq0;->l(FZ)F

    move-result v3

    add-float/2addr v2, v3

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-virtual {p1, v0, v5}, Lcom/daaw/aq0;->l(FZ)F

    move-result v0

    add-float/2addr v2, v0

    iget-object v0, p0, Lcom/daaw/tv;->z:Lcom/daaw/xn0;

    invoke-virtual {v0, p1}, Lcom/daaw/xn0;->l(Lcom/daaw/aq0;)Lcom/daaw/bs1;

    move-result-object v0

    iget v3, p0, Lcom/daaw/tv;->x:F

    iget v5, v0, Lcom/daaw/bs1;->a:F

    add-float/2addr v3, v5

    iget-boolean v5, p0, Lcom/daaw/tv;->A:Z

    invoke-virtual {p1, v3, v5}, Lcom/daaw/aq0;->f(FZ)F

    move-result v3

    iget v5, p0, Lcom/daaw/tv;->y:F

    iget v0, v0, Lcom/daaw/bs1;->b:F

    add-float/2addr v5, v0

    iget-boolean v0, p0, Lcom/daaw/tv;->A:Z

    invoke-virtual {p1, v5, v0}, Lcom/daaw/aq0;->g(FZ)F

    move-result v0

    iget v5, p0, Lcom/daaw/tv;->s:F

    invoke-virtual {p1, v5, v4, v3, v0}, Lcom/daaw/aq0;->c(FZFF)F

    move-result v5

    sub-float/2addr v1, v5

    iget v5, p0, Lcom/daaw/tv;->t:F

    invoke-virtual {p1, v5, v4, v3, v0}, Lcom/daaw/aq0;->d(FZFF)F

    move-result p1

    sub-float/2addr v2, p1

    new-instance p1, Landroid/graphics/RectF;

    add-float/2addr v3, v1

    add-float/2addr v0, v2

    invoke-direct {p1, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1
.end method

.method public o(Lcom/daaw/aq0;Lcom/daaw/cs1;)Landroid/graphics/RectF;
    .locals 7

    iget-object v0, p0, Lcom/daaw/tv;->n:Lcom/daaw/xn0;

    invoke-virtual {v0, p1}, Lcom/daaw/xn0;->l(Lcom/daaw/aq0;)Lcom/daaw/bs1;

    move-result-object v0

    iget v1, p0, Lcom/daaw/tv;->o:I

    invoke-virtual {p1, v1}, Lcom/daaw/aq0;->i(I)F

    move-result v1

    iget v2, p0, Lcom/daaw/tv;->q:F

    iget v3, p0, Lcom/daaw/tv;->o:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    iget-boolean v3, p0, Lcom/daaw/tv;->u:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-virtual {p1, v2, v3}, Lcom/daaw/aq0;->k(FZ)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, v0, Lcom/daaw/bs1;->a:F

    invoke-virtual {p1, v2, v5}, Lcom/daaw/aq0;->k(FZ)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, p0, Lcom/daaw/tv;->p:I

    invoke-virtual {p1, v2}, Lcom/daaw/aq0;->j(I)F

    move-result v2

    iget v3, p0, Lcom/daaw/tv;->r:F

    iget v6, p0, Lcom/daaw/tv;->p:I

    if-nez v6, :cond_2

    iget-boolean v6, p0, Lcom/daaw/tv;->v:Z

    if-eqz v6, :cond_3

    :cond_2
    const/4 v4, 0x1

    :cond_3
    invoke-virtual {p1, v3, v4}, Lcom/daaw/aq0;->l(FZ)F

    move-result v3

    add-float/2addr v2, v3

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-virtual {p1, v0, v5}, Lcom/daaw/aq0;->l(FZ)F

    move-result v0

    add-float/2addr v2, v0

    iget-object v0, p0, Lcom/daaw/tv;->z:Lcom/daaw/xn0;

    invoke-virtual {v0, p1}, Lcom/daaw/xn0;->l(Lcom/daaw/aq0;)Lcom/daaw/bs1;

    iget v0, p2, Lcom/daaw/cs1;->a:I

    int-to-float v0, v0

    iget p2, p2, Lcom/daaw/cs1;->b:I

    int-to-float p2, p2

    iget v3, p0, Lcom/daaw/tv;->s:F

    iget-boolean v4, p0, Lcom/daaw/tv;->w:Z

    invoke-virtual {p1, v3, v4, v0, p2}, Lcom/daaw/aq0;->c(FZFF)F

    move-result v3

    sub-float/2addr v1, v3

    iget v3, p0, Lcom/daaw/tv;->t:F

    iget-boolean v4, p0, Lcom/daaw/tv;->w:Z

    invoke-virtual {p1, v3, v4, v0, p2}, Lcom/daaw/aq0;->d(FZFF)F

    move-result p1

    sub-float/2addr v2, p1

    new-instance p1, Landroid/graphics/RectF;

    add-float/2addr v0, v1

    add-float/2addr p2, v2

    invoke-direct {p1, v1, v2, v0, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1
.end method

.method public p(Lcom/daaw/aq0;)Landroid/graphics/RectF;
    .locals 7

    iget-object v0, p0, Lcom/daaw/tv;->n:Lcom/daaw/xn0;

    invoke-virtual {v0, p1}, Lcom/daaw/xn0;->l(Lcom/daaw/aq0;)Lcom/daaw/bs1;

    move-result-object v0

    iget v1, p0, Lcom/daaw/tv;->o:I

    invoke-virtual {p1, v1}, Lcom/daaw/aq0;->i(I)F

    move-result v1

    iget v2, p0, Lcom/daaw/tv;->q:F

    iget v3, p0, Lcom/daaw/tv;->o:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    iget-boolean v3, p0, Lcom/daaw/tv;->u:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-virtual {p1, v2, v3}, Lcom/daaw/aq0;->k(FZ)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, v0, Lcom/daaw/bs1;->a:F

    invoke-virtual {p1, v2, v5}, Lcom/daaw/aq0;->k(FZ)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, p0, Lcom/daaw/tv;->p:I

    invoke-virtual {p1, v2}, Lcom/daaw/aq0;->j(I)F

    move-result v2

    iget v3, p0, Lcom/daaw/tv;->r:F

    iget v6, p0, Lcom/daaw/tv;->p:I

    if-nez v6, :cond_3

    iget-boolean v6, p0, Lcom/daaw/tv;->v:Z

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v6, 0x1

    :goto_3
    invoke-virtual {p1, v3, v6}, Lcom/daaw/aq0;->l(FZ)F

    move-result v3

    add-float/2addr v2, v3

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-virtual {p1, v0, v5}, Lcom/daaw/aq0;->l(FZ)F

    move-result v0

    add-float/2addr v2, v0

    iget-object v0, p0, Lcom/daaw/tv;->z:Lcom/daaw/xn0;

    invoke-virtual {v0, p1}, Lcom/daaw/xn0;->l(Lcom/daaw/aq0;)Lcom/daaw/bs1;

    move-result-object v0

    iget v3, p0, Lcom/daaw/tv;->x:F

    iget v5, v0, Lcom/daaw/bs1;->a:F

    add-float/2addr v3, v5

    iget-boolean v5, p0, Lcom/daaw/tv;->A:Z

    invoke-virtual {p1, v3, v5}, Lcom/daaw/aq0;->f(FZ)F

    move-result v3

    iget v5, p0, Lcom/daaw/tv;->y:F

    iget v0, v0, Lcom/daaw/bs1;->b:F

    add-float/2addr v5, v0

    iget-boolean v0, p0, Lcom/daaw/tv;->A:Z

    invoke-virtual {p1, v5, v0}, Lcom/daaw/aq0;->g(FZ)F

    move-result v0

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual {p1, v5, v4, v3, v0}, Lcom/daaw/aq0;->c(FZFF)F

    move-result v6

    sub-float/2addr v1, v6

    invoke-virtual {p1, v5, v4, v3, v0}, Lcom/daaw/aq0;->d(FZFF)F

    move-result p1

    sub-float/2addr v2, p1

    new-instance p1, Landroid/graphics/RectF;

    add-float/2addr v3, v1

    add-float/2addr v0, v2

    invoke-direct {p1, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1
.end method

.method public q(Lcom/daaw/aq0;)Landroid/graphics/RectF;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/tv;->n(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object p1

    return-object p1
.end method

.method public s(Lcom/daaw/aq0;)F
    .locals 1

    iget-object v0, p0, Lcom/daaw/tv;->l:Lcom/daaw/xn0;

    invoke-virtual {v0, p1}, Lcom/daaw/xn0;->i(Lcom/daaw/aq0;)F

    move-result p1

    iget v0, p0, Lcom/daaw/tv;->m:F

    add-float/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    rem-float/2addr v0, p1

    return v0
.end method

.method public t(Lcom/daaw/un;)V
    .locals 5

    invoke-virtual {p1}, Lcom/daaw/un;->A()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/tv;->f:Ljava/lang/String;

    const-string v0, "visible"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->V(Z)V

    const-string v0, "blendMode"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget v1, p0, Lcom/daaw/tv;->a:I

    invoke-static {v1}, Lcom/daaw/fc;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/daaw/tv;->a:I

    invoke-static {v0, v1}, Lcom/daaw/fc;->a(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->J(I)V

    new-instance v0, Lcom/daaw/bs1;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v2, "position"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->z(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->O(Lcom/daaw/bs1;)V

    sget-object v0, Lcom/daaw/y2;->a:[Ljava/lang/String;

    const-string v2, "anchorX"

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v0, v3}, Lcom/daaw/un;->v(Ljava/lang/String;[Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/daaw/tv;->o:I

    const-string v2, "anchorY"

    invoke-virtual {p1, v2, v0, v3}, Lcom/daaw/un;->v(Ljava/lang/String;[Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/tv;->p:I

    const-string v0, "MeasurePos"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/tv;->n:Lcom/daaw/xn0;

    iget-object v4, p0, Lcom/daaw/tv;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v4, v1, v1}, Lcom/daaw/xn0;->n(Lcom/daaw/un;Ljava/lang/String;FF)V

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v2, "alignmentPosition"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->z(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->M(Lcom/daaw/bs1;)V

    const-string v0, "scaleIsUniform"

    invoke-virtual {p1, v0, v3}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->T(Z)V

    new-instance v0, Lcom/daaw/bs1;

    iget v2, p0, Lcom/daaw/tv;->b:F

    iget v3, p0, Lcom/daaw/tv;->c:F

    invoke-direct {v0, v2, v3}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v2, "scale"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->z(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->S(Lcom/daaw/bs1;)V

    const-string v0, "measureScale"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/tv;->z:Lcom/daaw/xn0;

    const-string v2, "Nothing"

    invoke-virtual {v0, p1, v2, v1, v1}, Lcom/daaw/xn0;->n(Lcom/daaw/un;Ljava/lang/String;FF)V

    return-void
.end method

.method public u(Lcom/daaw/un;)V
    .locals 3

    const-string v0, "rotation"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    const/high16 v1, 0x43b40000    # 360.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->Q(F)V

    const-string v0, "measureRot"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/tv;->l:Lcom/daaw/xn0;

    const-string v1, "Nothing"

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v0, p1, v1, v2, v2}, Lcom/daaw/xn0;->n(Lcom/daaw/un;Ljava/lang/String;FF)V

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public w(Lcom/daaw/y31;I)V
    .locals 0

    return-void
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 0

    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 0

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 10

    iget p2, p0, Lcom/daaw/tv;->e:I

    const-string v0, "_id"

    const-string v1, ""

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/un;->V(Ljava/lang/String;ILjava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/tv;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/daaw/un;->q0(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/daaw/tv;->k:Z

    const-string v0, "visible"

    const-string v2, "0_general"

    invoke-virtual {p1, v0, p2, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget p2, p0, Lcom/daaw/tv;->i:I

    invoke-static {p2}, Lcom/daaw/fc;->b(I)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/fc;->a:[Ljava/lang/String;

    const-string v3, "blendMode"

    invoke-virtual {p1, v3, p2, v2, v0}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    new-instance v6, Lcom/daaw/bs1;

    iget p2, p0, Lcom/daaw/tv;->q:F

    iget v0, p0, Lcom/daaw/tv;->r:F

    invoke-direct {v6, p2, v0}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v5, "position"

    const-string v7, "0_general"

    const/high16 v8, -0x40800000    # -1.0f

    const/high16 v9, 0x3f800000    # 1.0f

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/un;->k0(Ljava/lang/String;Lcom/daaw/bs1;Ljava/lang/String;FF)V

    iget p2, p0, Lcom/daaw/tv;->o:I

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/daaw/y2;->a(II)Ljava/lang/String;

    move-result-object p2

    sget-object v3, Lcom/daaw/y2;->a:[Ljava/lang/String;

    const-string v4, "anchorX"

    invoke-virtual {p1, v4, p2, v2, v3}, Lcom/daaw/un;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    iget p2, p0, Lcom/daaw/tv;->p:I

    invoke-static {p2, v0}, Lcom/daaw/y2;->a(II)Ljava/lang/String;

    move-result-object p2

    const-string v4, "anchorY"

    invoke-virtual {p1, v4, p2, v2, v3}, Lcom/daaw/un;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    new-array p2, v0, [Ljava/lang/String;

    const-string v3, "MeasurePos"

    invoke-virtual {p1, v3, v1, v2, p2}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object p2

    iget-object v3, p0, Lcom/daaw/tv;->n:Lcom/daaw/xn0;

    invoke-virtual {v3, p2}, Lcom/daaw/xn0;->p(Lcom/daaw/un;)V

    new-instance v6, Lcom/daaw/bs1;

    iget p2, p0, Lcom/daaw/tv;->s:F

    iget v3, p0, Lcom/daaw/tv;->t:F

    invoke-direct {v6, p2, v3}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v5, "alignmentPosition"

    const-string v7, "0_general"

    const/4 v8, 0x0

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/un;->k0(Ljava/lang/String;Lcom/daaw/bs1;Ljava/lang/String;FF)V

    iget-boolean p2, p0, Lcom/daaw/tv;->A:Z

    const-string v3, "scaleIsUniform"

    invoke-virtual {p1, v3, p2, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    new-instance v6, Lcom/daaw/bs1;

    iget p2, p0, Lcom/daaw/tv;->x:F

    iget v3, p0, Lcom/daaw/tv;->y:F

    invoke-direct {v6, p2, v3}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v5, "scale"

    const-string v7, "0_general"

    const/high16 v9, 0x40000000    # 2.0f

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/un;->k0(Ljava/lang/String;Lcom/daaw/bs1;Ljava/lang/String;FF)V

    new-array p2, v0, [Ljava/lang/String;

    const-string v0, "measureScale"

    invoke-virtual {p1, v0, v1, v2, p2}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/tv;->z:Lcom/daaw/xn0;

    invoke-virtual {p2, p1}, Lcom/daaw/xn0;->q(Lcom/daaw/un;)V

    return-void
.end method
