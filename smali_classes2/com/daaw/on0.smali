.class public Lcom/daaw/on0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(I)Lcom/daaw/ml;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    invoke-static {}, Lcom/daaw/on0;->b()Lcom/daaw/ml;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lcom/daaw/qo;

    invoke-direct {p0}, Lcom/daaw/qo;-><init>()V

    return-object p0

    :cond_1
    new-instance p0, Lcom/daaw/j61;

    invoke-direct {p0}, Lcom/daaw/j61;-><init>()V

    return-object p0
.end method

.method public static b()Lcom/daaw/ml;
    .locals 1

    new-instance v0, Lcom/daaw/j61;

    invoke-direct {v0}, Lcom/daaw/j61;-><init>()V

    return-object v0
.end method

.method public static c()Lcom/daaw/rv;
    .locals 1

    new-instance v0, Lcom/daaw/rv;

    invoke-direct {v0}, Lcom/daaw/rv;-><init>()V

    return-object v0
.end method

.method public static d(Landroid/view/View;F)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of v0, p0, Lcom/daaw/nn0;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/nn0;

    invoke-virtual {p0, p1}, Lcom/daaw/nn0;->V(F)V

    :cond_0
    return-void
.end method

.method public static e(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/nn0;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/nn0;

    invoke-static {p0, v0}, Lcom/daaw/on0;->f(Landroid/view/View;Lcom/daaw/nn0;)V

    :cond_0
    return-void
.end method

.method public static f(Landroid/view/View;Lcom/daaw/nn0;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/nn0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/daaw/fu1;->c(Landroid/view/View;)F

    move-result p0

    invoke-virtual {p1, p0}, Lcom/daaw/nn0;->Z(F)V

    :cond_0
    return-void
.end method
