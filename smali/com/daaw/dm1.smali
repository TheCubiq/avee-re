.class public Lcom/daaw/dm1;
.super Lcom/daaw/i0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/dm1$d;,
        Lcom/daaw/dm1$c;,
        Lcom/daaw/dm1$e;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/iq;

.field public final b:Landroid/view/Window$Callback;

.field public final c:Lcom/daaw/a4$h;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/i0$b;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/Runnable;

.field public final i:Landroidx/appcompat/widget/Toolbar$f;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/i0;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/dm1;->g:Ljava/util/ArrayList;

    new-instance v0, Lcom/daaw/dm1$a;

    invoke-direct {v0, p0}, Lcom/daaw/dm1$a;-><init>(Lcom/daaw/dm1;)V

    iput-object v0, p0, Lcom/daaw/dm1;->h:Ljava/lang/Runnable;

    new-instance v0, Lcom/daaw/dm1$b;

    invoke-direct {v0, p0}, Lcom/daaw/dm1$b;-><init>(Lcom/daaw/dm1;)V

    iput-object v0, p0, Lcom/daaw/dm1;->i:Landroidx/appcompat/widget/Toolbar$f;

    invoke-static {p1}, Lcom/daaw/ty0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Landroidx/appcompat/widget/d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Landroidx/appcompat/widget/d;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    iput-object v1, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-static {p3}, Lcom/daaw/ty0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/Window$Callback;

    iput-object v2, p0, Lcom/daaw/dm1;->b:Landroid/view/Window$Callback;

    invoke-interface {v1, p3}, Lcom/daaw/iq;->setWindowCallback(Landroid/view/Window$Callback;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$f;)V

    invoke-interface {v1, p2}, Lcom/daaw/iq;->setWindowTitle(Ljava/lang/CharSequence;)V

    new-instance p1, Lcom/daaw/dm1$e;

    invoke-direct {p1, p0}, Lcom/daaw/dm1$e;-><init>(Lcom/daaw/dm1;)V

    iput-object p1, p0, Lcom/daaw/dm1;->c:Lcom/daaw/a4$h;

    return-void
.end method


# virtual methods
.method public final A()Landroid/view/Menu;
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/dm1;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    new-instance v1, Lcom/daaw/dm1$c;

    invoke-direct {v1, p0}, Lcom/daaw/dm1$c;-><init>(Lcom/daaw/dm1;)V

    new-instance v2, Lcom/daaw/dm1$d;

    invoke-direct {v2, p0}, Lcom/daaw/dm1$d;-><init>(Lcom/daaw/dm1;)V

    invoke-interface {v0, v1, v2}, Lcom/daaw/iq;->r(Landroidx/appcompat/view/menu/i$a;Landroidx/appcompat/view/menu/e$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/dm1;->e:Z

    :cond_0
    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->n()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public B()V
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/dm1;->A()Landroid/view/Menu;

    move-result-object v0

    instance-of v1, v0, Landroidx/appcompat/view/menu/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroidx/appcompat/view/menu/e;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->h0()V

    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    iget-object v3, p0, Lcom/daaw/dm1;->b:Landroid/view/Window$Callback;

    const/4 v4, 0x0

    invoke-interface {v3, v4, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/dm1;->b:Landroid/view/Window$Callback;

    invoke-interface {v3, v4, v2, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->g0()V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->g0()V

    :cond_5
    throw v0
.end method

.method public C(II)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->v()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    and-int/2addr p1, p2

    xor-int/lit8 p2, p2, -0x1

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    invoke-interface {v1, p1}, Lcom/daaw/iq;->l(I)V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->f()Z

    move-result v0

    return v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h(Z)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/dm1;->f:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/dm1;->f:Z

    iget-object v0, p0, Lcom/daaw/dm1;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lcom/daaw/dm1;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/i0$b;

    invoke-interface {v2, p1}, Lcom/daaw/i0$b;->a(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->v()I

    move-result v0

    return v0
.end method

.method public j()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->t()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/dm1;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->t()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/dm1;->h:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lcom/daaw/xs1;->j0(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->j()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/i0;->m(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->t()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/dm1;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public o(ILandroid/view/KeyEvent;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/dm1;->A()Landroid/view/Menu;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_2
    return v1
.end method

.method public p(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/dm1;->q()Z

    :cond_0
    return v0
.end method

.method public q()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->g()Z

    move-result v0

    return v0
.end method

.method public r(Z)V
    .locals 0

    return-void
.end method

.method public s(Z)V
    .locals 1

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/dm1;->C(II)V

    return-void
.end method

.method public t(Z)V
    .locals 1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/dm1;->C(II)V

    return-void
.end method

.method public u(Z)V
    .locals 1

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/dm1;->C(II)V

    return-void
.end method

.method public v(Z)V
    .locals 0

    return-void
.end method

.method public w(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0, p1}, Lcom/daaw/iq;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public x(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0, p1}, Lcom/daaw/iq;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public y(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0, p1}, Lcom/daaw/iq;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method
