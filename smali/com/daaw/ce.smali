.class public Lcom/daaw/ce;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fe;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ee;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->n(Lcom/daaw/ee;)Lcom/daaw/h61;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/h61;->b()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/ee;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->n(Lcom/daaw/ee;)Lcom/daaw/h61;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/daaw/h61;->h(F)V

    return-void
.end method

.method public c(Lcom/daaw/ee;)F
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->f(Lcom/daaw/ee;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    return p1
.end method

.method public d(Lcom/daaw/ee;F)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->n(Lcom/daaw/ee;)Lcom/daaw/h61;

    move-result-object v0

    invoke-interface {p1}, Lcom/daaw/ee;->d()Z

    move-result v1

    invoke-interface {p1}, Lcom/daaw/ee;->c()Z

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, Lcom/daaw/h61;->g(FZZ)V

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->o(Lcom/daaw/ee;)V

    return-void
.end method

.method public e(Lcom/daaw/ee;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->n(Lcom/daaw/ee;)Lcom/daaw/h61;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/daaw/h61;->f(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public f(Lcom/daaw/ee;)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->n(Lcom/daaw/ee;)Lcom/daaw/h61;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/h61;->d()F

    move-result p1

    return p1
.end method

.method public g(Lcom/daaw/ee;)F
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->f(Lcom/daaw/ee;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    return p1
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Lcom/daaw/ee;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->k(Lcom/daaw/ee;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ce;->d(Lcom/daaw/ee;F)V

    return-void
.end method

.method public j(Lcom/daaw/ee;)F
    .locals 0

    invoke-interface {p1}, Lcom/daaw/ee;->f()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result p1

    return p1
.end method

.method public k(Lcom/daaw/ee;)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->n(Lcom/daaw/ee;)Lcom/daaw/h61;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/h61;->c()F

    move-result p1

    return p1
.end method

.method public l(Lcom/daaw/ee;F)V
    .locals 0

    invoke-interface {p1}, Lcom/daaw/ee;->f()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public m(Lcom/daaw/ee;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->k(Lcom/daaw/ee;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ce;->d(Lcom/daaw/ee;F)V

    return-void
.end method

.method public final n(Lcom/daaw/ee;)Lcom/daaw/h61;
    .locals 0

    invoke-interface {p1}, Lcom/daaw/ee;->e()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lcom/daaw/h61;

    return-object p1
.end method

.method public o(Lcom/daaw/ee;)V
    .locals 4

    invoke-interface {p1}, Lcom/daaw/ee;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0, v0, v0, v0}, Lcom/daaw/ee;->a(IIII)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/ce;->k(Lcom/daaw/ee;)F

    move-result v0

    invoke-virtual {p0, p1}, Lcom/daaw/ce;->f(Lcom/daaw/ee;)F

    move-result v1

    invoke-interface {p1}, Lcom/daaw/ee;->c()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/daaw/i61;->c(FFZ)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-interface {p1}, Lcom/daaw/ee;->c()Z

    move-result v3

    invoke-static {v0, v1, v3}, Lcom/daaw/i61;->d(FFZ)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-interface {p1, v2, v0, v2, v0}, Lcom/daaw/ee;->a(IIII)V

    return-void
.end method
