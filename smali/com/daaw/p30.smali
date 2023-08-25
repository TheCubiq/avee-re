.class public Lcom/daaw/p30;
.super Landroidx/activity/ComponentActivity;
.source ""

# interfaces
.implements Lcom/daaw/q0$d;
.implements Lcom/daaw/q0$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/p30$c;
    }
.end annotation


# instance fields
.field public final F:Lcom/daaw/t30;

.field public final G:Landroidx/lifecycle/e;

.field public H:Z

.field public I:Z

.field public J:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    new-instance v0, Lcom/daaw/p30$c;

    invoke-direct {v0, p0}, Lcom/daaw/p30$c;-><init>(Lcom/daaw/p30;)V

    invoke-static {v0}, Lcom/daaw/t30;->b(Landroidx/fragment/app/e;)Lcom/daaw/t30;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    new-instance v0, Landroidx/lifecycle/e;

    invoke-direct {v0, p0}, Landroidx/lifecycle/e;-><init>(Lcom/daaw/sj0;)V

    iput-object v0, p0, Lcom/daaw/p30;->G:Landroidx/lifecycle/e;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/p30;->J:Z

    invoke-virtual {p0}, Lcom/daaw/p30;->y()V

    return-void
.end method

.method public static A(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/c$c;)Z
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->r0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->t()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/daaw/p30;->A(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/c$c;)Z

    move-result v2

    or-int/2addr v0, v2

    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->i0:Lcom/daaw/c40;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/daaw/c40;->a()Landroidx/lifecycle/c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/c;->b()Landroidx/lifecycle/c$c;

    move-result-object v2

    sget-object v4, Landroidx/lifecycle/c$c;->s:Landroidx/lifecycle/c$c;

    invoke-virtual {v2, v4}, Landroidx/lifecycle/c$c;->a(Landroidx/lifecycle/c$c;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, v1, Landroidx/fragment/app/Fragment;->i0:Lcom/daaw/c40;

    invoke-virtual {v0, p1}, Lcom/daaw/c40;->k(Landroidx/lifecycle/c$c;)V

    const/4 v0, 0x1

    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->h0:Landroidx/lifecycle/e;

    invoke-virtual {v2}, Landroidx/lifecycle/e;->b()Landroidx/lifecycle/c$c;

    move-result-object v2

    sget-object v4, Landroidx/lifecycle/c$c;->s:Landroidx/lifecycle/c$c;

    invoke-virtual {v2, v4}, Landroidx/lifecycle/c$c;->a(Landroidx/lifecycle/c$c;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v1, Landroidx/fragment/app/Fragment;->h0:Landroidx/lifecycle/e;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/e;->o(Landroidx/lifecycle/c$c;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method


# virtual methods
.method public B(Landroidx/fragment/app/Fragment;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public C(Landroid/view/View;Landroid/view/Menu;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    invoke-super {p0, v0, p1, p2}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public D()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/p30;->G:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_RESUME:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->p()V

    return-void
.end method

.method public E()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public final b(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/daaw/p30;->H:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/daaw/p30;->I:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/daaw/p30;->J:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lcom/daaw/mk0;->b(Lcom/daaw/sj0;)Lcom/daaw/mk0;

    move-result-object v1

    invoke-virtual {v1, v0, p2, p3, p4}, Lcom/daaw/mk0;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->t()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/FragmentManager;->W(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->u()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->u()V

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0, p1}, Lcom/daaw/t30;->d(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/daaw/p30;->G:Landroidx/lifecycle/e;

    sget-object v0, Landroidx/lifecycle/c$b;->ON_CREATE:Landroidx/lifecycle/c$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    iget-object p1, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {p1}, Lcom/daaw/t30;->f()V

    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 2

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lcom/daaw/t30;->g(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/p30;->w(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/daaw/p30;->w(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->h()V

    iget-object v0, p0, Lcom/daaw/p30;->G:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_DESTROY:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->i()V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object p1, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {p1, p2}, Lcom/daaw/t30;->e(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {p1, p2}, Lcom/daaw/t30;->k(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0, p1}, Lcom/daaw/t30;->j(Z)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->u()V

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0, p2}, Lcom/daaw/t30;->l(Landroid/view/Menu;)V

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/p30;->I:Z

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->m()V

    iget-object v0, p0, Lcom/daaw/p30;->G:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_PAUSE:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0, p1}, Lcom/daaw/t30;->n(Z)V

    return-void
.end method

.method public onPostResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    invoke-virtual {p0}, Lcom/daaw/p30;->D()V

    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0, p2, p3}, Lcom/daaw/p30;->C(Landroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    iget-object p2, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {p2, p3}, Lcom/daaw/t30;->o(Landroid/view/Menu;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->u()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->u()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/p30;->I:Z

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->s()Z

    return-void
.end method

.method public onStart()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->u()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/p30;->J:Z

    iget-boolean v0, p0, Lcom/daaw/p30;->H:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/p30;->H:Z

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->c()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->s()Z

    iget-object v0, p0, Lcom/daaw/p30;->G:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_START:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->q()V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->u()V

    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/p30;->J:Z

    invoke-virtual {p0}, Lcom/daaw/p30;->z()V

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->r()V

    iget-object v0, p0, Lcom/daaw/p30;->G:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_STOP:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public final w(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/t30;->v(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public x()Landroidx/fragment/app/FragmentManager;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0}, Lcom/daaw/t30;->t()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    return-object v0
.end method

.method public final y()V
    .locals 3

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->i()Lcom/daaw/k81;

    move-result-object v0

    new-instance v1, Lcom/daaw/p30$a;

    invoke-direct {v1, p0}, Lcom/daaw/p30$a;-><init>(Lcom/daaw/p30;)V

    const-string v2, "android:support:fragments"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/k81;->h(Ljava/lang/String;Lcom/daaw/k81$c;)V

    new-instance v0, Lcom/daaw/p30$b;

    invoke-direct {v0, p0}, Lcom/daaw/p30$b;-><init>(Lcom/daaw/p30;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->p(Lcom/daaw/eu0;)V

    return-void
.end method

.method public z()V
    .locals 2

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/p30;->x()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/c$c;->r:Landroidx/lifecycle/c$c;

    invoke-static {v0, v1}, Lcom/daaw/p30;->A(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/c$c;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method
