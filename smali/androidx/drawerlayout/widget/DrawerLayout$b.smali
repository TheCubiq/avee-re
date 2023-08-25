.class public Landroidx/drawerlayout/widget/DrawerLayout$b;
.super Lcom/daaw/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final d:Landroid/graphics/Rect;

.field public final synthetic e:Landroidx/drawerlayout/widget/DrawerLayout;


# direct methods
.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;)V
    .locals 0

    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$b;->e:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-direct {p0}, Lcom/daaw/w;-><init>()V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$b;->d:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$b;->e:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p2}, Landroidx/drawerlayout/widget/DrawerLayout;->n()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$b;->e:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->r(Landroid/view/View;)I

    move-result p2

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$b;->e:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->q(I)Ljava/lang/CharSequence;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-super {p0, p1, p2}, Lcom/daaw/w;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/w;->f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    const-class p1, Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public g(Landroid/view/View;Lcom/daaw/y;)V
    .locals 3

    sget-boolean v0, Landroidx/drawerlayout/widget/DrawerLayout;->f0:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Lcom/daaw/w;->g(Landroid/view/View;Lcom/daaw/y;)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lcom/daaw/y;->Q(Lcom/daaw/y;)Lcom/daaw/y;

    move-result-object v0

    invoke-super {p0, p1, v0}, Lcom/daaw/w;->g(Landroid/view/View;Lcom/daaw/y;)V

    invoke-virtual {p2, p1}, Lcom/daaw/y;->w0(Landroid/view/View;)V

    invoke-static {p1}, Lcom/daaw/xs1;->K(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p2, v1}, Lcom/daaw/y;->q0(Landroid/view/View;)V

    :cond_1
    invoke-virtual {p0, p2, v0}, Landroidx/drawerlayout/widget/DrawerLayout$b;->o(Lcom/daaw/y;Lcom/daaw/y;)V

    invoke-virtual {v0}, Lcom/daaw/y;->S()V

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p0, p2, p1}, Landroidx/drawerlayout/widget/DrawerLayout$b;->n(Lcom/daaw/y;Landroid/view/ViewGroup;)V

    :goto_0
    const-class p1, Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/y;->b0(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/daaw/y;->i0(Z)V

    invoke-virtual {p2, p1}, Lcom/daaw/y;->j0(Z)V

    sget-object p1, Lcom/daaw/y$a;->e:Lcom/daaw/y$a;

    invoke-virtual {p2, p1}, Lcom/daaw/y;->T(Lcom/daaw/y$a;)Z

    sget-object p1, Lcom/daaw/y$a;->f:Lcom/daaw/y$a;

    invoke-virtual {p2, p1}, Lcom/daaw/y;->T(Lcom/daaw/y$a;)Z

    return-void
.end method

.method public i(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    sget-boolean v0, Landroidx/drawerlayout/widget/DrawerLayout;->f0:Z

    if-nez v0, :cond_1

    invoke-static {p2}, Landroidx/drawerlayout/widget/DrawerLayout;->y(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/w;->i(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final n(Lcom/daaw/y;Landroid/view/ViewGroup;)V
    .locals 4

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/drawerlayout/widget/DrawerLayout;->y(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1, v2}, Lcom/daaw/y;->c(Landroid/view/View;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final o(Lcom/daaw/y;Lcom/daaw/y;)V
    .locals 1

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$b;->d:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, Lcom/daaw/y;->m(Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Lcom/daaw/y;->X(Landroid/graphics/Rect;)V

    invoke-virtual {p2, v0}, Lcom/daaw/y;->n(Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Lcom/daaw/y;->Y(Landroid/graphics/Rect;)V

    invoke-virtual {p2}, Lcom/daaw/y;->N()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->B0(Z)V

    invoke-virtual {p2}, Lcom/daaw/y;->u()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->o0(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lcom/daaw/y;->p()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->b0(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lcom/daaw/y;->r()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->f0(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lcom/daaw/y;->F()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->g0(Z)V

    invoke-virtual {p2}, Lcom/daaw/y;->E()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->c0(Z)V

    invoke-virtual {p2}, Lcom/daaw/y;->G()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->i0(Z)V

    invoke-virtual {p2}, Lcom/daaw/y;->H()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->j0(Z)V

    invoke-virtual {p2}, Lcom/daaw/y;->B()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->V(Z)V

    invoke-virtual {p2}, Lcom/daaw/y;->L()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->u0(Z)V

    invoke-virtual {p2}, Lcom/daaw/y;->I()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/y;->m0(Z)V

    invoke-virtual {p2}, Lcom/daaw/y;->k()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/y;->a(I)V

    return-void
.end method
