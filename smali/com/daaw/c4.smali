.class public Lcom/daaw/c4;
.super Lcom/daaw/di;
.source ""

# interfaces
.implements Lcom/daaw/t3;


# instance fields
.field public r:Lcom/daaw/z3;

.field public final s:Lcom/daaw/ii0$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-static {p1, p2}, Lcom/daaw/c4;->g(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/daaw/di;-><init>(Landroid/content/Context;I)V

    new-instance v0, Lcom/daaw/b4;

    invoke-direct {v0, p0}, Lcom/daaw/b4;-><init>(Lcom/daaw/c4;)V

    iput-object v0, p0, Lcom/daaw/c4;->s:Lcom/daaw/ii0$a;

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/daaw/c4;->g(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->T(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->D(Landroid/os/Bundle;)V

    return-void
.end method

.method public static g(Landroid/content/Context;I)I
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    sget v0, Lcom/daaw/x01;->A:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    :cond_0
    return p1
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/z3;->f(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->E()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/c4;->s:Lcom/daaw/ii0$a;

    invoke-static {v1, v0, p0, p1}, Lcom/daaw/ii0;->e(Lcom/daaw/ii0$a;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public f()Lcom/daaw/z3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/c4;->r:Lcom/daaw/z3;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Lcom/daaw/z3;->m(Landroid/app/Dialog;Lcom/daaw/t3;)Lcom/daaw/z3;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/c4;->r:Lcom/daaw/z3;

    :cond_0
    iget-object v0, p0, Lcom/daaw/c4;->r:Lcom/daaw/z3;

    return-object v0
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->n(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public h(Lcom/daaw/n0;)V
    .locals 0

    return-void
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->y()V

    return-void
.end method

.method public j(Lcom/daaw/n0;)V
    .locals 0

    return-void
.end method

.method public k(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public l(Lcom/daaw/n0$a;)Lcom/daaw/n0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public m(I)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->M(I)Z

    move-result p1

    return p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->x()V

    invoke-super {p0, p1}, Lcom/daaw/di;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->D(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/di;->onStop()V

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->J()V

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->P(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->Q(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/z3;->R(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->U(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/daaw/c4;->f()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->U(Ljava/lang/CharSequence;)V

    return-void
.end method
