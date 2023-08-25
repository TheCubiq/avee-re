.class public Lcom/daaw/p3;
.super Lcom/daaw/p30;
.source ""

# interfaces
.implements Lcom/daaw/t3;
.implements Lcom/daaw/bk1$a;


# instance fields
.field public K:Lcom/daaw/z3;

.field public L:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/p30;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/p3;->H()V

    return-void
.end method

.method private r()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/daaw/bu1;->a(Landroid/view/View;Lcom/daaw/sj0;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/daaw/eu1;->a(Landroid/view/View;Lcom/daaw/nt1;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/daaw/du1;->a(Landroid/view/View;Lcom/daaw/m81;)V

    return-void
.end method


# virtual methods
.method public E()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->y()V

    return-void
.end method

.method public F()Lcom/daaw/z3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p3;->K:Lcom/daaw/z3;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Lcom/daaw/z3;->l(Landroid/app/Activity;Lcom/daaw/t3;)Lcom/daaw/z3;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/p3;->K:Lcom/daaw/z3;

    :cond_0
    iget-object v0, p0, Lcom/daaw/p3;->K:Lcom/daaw/z3;

    return-object v0
.end method

.method public G()Lcom/daaw/i0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->w()Lcom/daaw/i0;

    move-result-object v0

    return-object v0
.end method

.method public final H()V
    .locals 3

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->i()Lcom/daaw/k81;

    move-result-object v0

    new-instance v1, Lcom/daaw/p3$a;

    invoke-direct {v1, p0}, Lcom/daaw/p3$a;-><init>(Lcom/daaw/p3;)V

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/k81;->h(Ljava/lang/String;Lcom/daaw/k81$c;)V

    new-instance v0, Lcom/daaw/p3$b;

    invoke-direct {v0, p0}, Lcom/daaw/p3$b;-><init>(Lcom/daaw/p3;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->p(Lcom/daaw/eu0;)V

    return-void
.end method

.method public I(Lcom/daaw/bk1;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/daaw/bk1;->e(Landroid/app/Activity;)Lcom/daaw/bk1;

    return-void
.end method

.method public J(Lcom/daaw/rk0;)V
    .locals 0

    return-void
.end method

.method public K(I)V
    .locals 0

    return-void
.end method

.method public L(Lcom/daaw/bk1;)V
    .locals 0

    return-void
.end method

.method public M()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public N()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/p3;->f()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/p3;->S(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lcom/daaw/bk1;->h(Landroid/content/Context;)Lcom/daaw/bk1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/p3;->I(Lcom/daaw/bk1;)V

    invoke-virtual {p0, v0}, Lcom/daaw/p3;->L(Lcom/daaw/bk1;)V

    invoke-virtual {v0}, Lcom/daaw/bk1;->j()V

    :try_start_0
    invoke-static {p0}, Lcom/daaw/q0;->l(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/p3;->R(Landroid/content/Intent;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final O(Landroid/view/KeyEvent;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public P(Landroidx/appcompat/widget/Toolbar;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->S(Landroidx/appcompat/widget/Toolbar;)V

    return-void
.end method

.method public Q(Lcom/daaw/n0$a;)Lcom/daaw/n0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->V(Lcom/daaw/n0$a;)Lcom/daaw/n0;

    move-result-object p1

    return-object p1
.end method

.method public R(Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/as0;->f(Landroid/app/Activity;Landroid/content/Intent;)V

    return-void
.end method

.method public S(Landroid/content/Intent;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/as0;->g(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/p3;->r()V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/z3;->f(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->k(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public closeOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/p3;->G()Lcom/daaw/i0;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/i0;->f()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_1
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/p3;->G()Lcom/daaw/i0;

    move-result-object v1

    const/16 v2, 0x52

    if-ne v0, v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/daaw/i0;->p(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/zh;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public f()Landroid/content/Intent;
    .locals 1

    invoke-static {p0}, Lcom/daaw/as0;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

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

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->n(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->t()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    iget-object v0, p0, Lcom/daaw/p3;->L:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/hs1;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/hs1;

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/daaw/hs1;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V

    iput-object v0, p0, Lcom/daaw/p3;->L:Landroid/content/res/Resources;

    :cond_0
    iget-object v0, p0, Lcom/daaw/p3;->L:Landroid/content/res/Resources;

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public h(Lcom/daaw/n0;)V
    .locals 0

    return-void
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->y()V

    return-void
.end method

.method public j(Lcom/daaw/n0;)V
    .locals 0

    return-void
.end method

.method public l(Lcom/daaw/n0$a;)Lcom/daaw/n0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/p30;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lcom/daaw/p3;->L:Landroid/content/res/Resources;

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/p3;->L:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->C(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onContentChanged()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/p3;->M()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/p30;->onDestroy()V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->E()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0, p2}, Lcom/daaw/p3;->O(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/p30;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/p3;->G()Lcom/daaw/i0;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x102002c

    if-ne p2, v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/i0;->i()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/p3;->N()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/p30;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->F(Landroid/os/Bundle;)V

    return-void
.end method

.method public onPostResume()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/p30;->onPostResume()V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->G()V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/p30;->onStart()V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->I()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/p30;->onStop()V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->J()V

    return-void
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/z3;->U(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public openOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/p3;->G()Lcom/daaw/i0;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/i0;->q()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_1
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/p3;->r()V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->P(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/p3;->r()V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->Q(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/p3;->r()V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/z3;->R(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTheme(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    invoke-virtual {p0}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->T(I)V

    return-void
.end method
