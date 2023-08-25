.class public Lcom/daaw/de;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fe;


# instance fields
.field public final a:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/daaw/de;->a:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ee;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/i61;->f()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/ee;F)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/i61;->p(F)V

    invoke-virtual {p0, p1}, Lcom/daaw/de;->o(Lcom/daaw/ee;)V

    return-void
.end method

.method public c(Lcom/daaw/ee;)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/i61;->j()F

    move-result p1

    return p1
.end method

.method public d(Lcom/daaw/ee;F)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/i61;->q(F)V

    invoke-virtual {p0, p1}, Lcom/daaw/de;->o(Lcom/daaw/ee;)V

    return-void
.end method

.method public e(Lcom/daaw/ee;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/daaw/i61;->o(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public f(Lcom/daaw/ee;)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/i61;->g()F

    move-result p1

    return p1
.end method

.method public g(Lcom/daaw/ee;)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/i61;->k()F

    move-result p1

    return p1
.end method

.method public i(Lcom/daaw/ee;)V
    .locals 0

    return-void
.end method

.method public j(Lcom/daaw/ee;)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/i61;->l()F

    move-result p1

    return p1
.end method

.method public k(Lcom/daaw/ee;)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/i61;->i()F

    move-result p1

    return p1
.end method

.method public l(Lcom/daaw/ee;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/daaw/i61;->r(F)V

    return-void
.end method

.method public m(Lcom/daaw/ee;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object v0

    invoke-interface {p1}, Lcom/daaw/ee;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/i61;->m(Z)V

    invoke-virtual {p0, p1}, Lcom/daaw/de;->o(Lcom/daaw/ee;)V

    return-void
.end method

.method public final n(Lcom/daaw/ee;)Lcom/daaw/i61;
    .locals 0

    invoke-interface {p1}, Lcom/daaw/ee;->e()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lcom/daaw/i61;

    return-object p1
.end method

.method public o(Lcom/daaw/ee;)V
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, p1}, Lcom/daaw/de;->n(Lcom/daaw/ee;)Lcom/daaw/i61;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/i61;->h(Landroid/graphics/Rect;)V

    invoke-virtual {p0, p1}, Lcom/daaw/de;->g(Lcom/daaw/ee;)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {p0, p1}, Lcom/daaw/de;->c(Lcom/daaw/ee;)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-interface {p1, v1, v2}, Lcom/daaw/ee;->b(II)V

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-interface {p1, v1, v2, v3, v0}, Lcom/daaw/ee;->a(IIII)V

    return-void
.end method
