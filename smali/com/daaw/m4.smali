.class public abstract Lcom/daaw/m4;
.super Landroid/preference/PreferenceActivity;
.source ""


# instance fields
.field public p:Lcom/daaw/z3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/z3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m4;->p:Lcom/daaw/z3;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/daaw/z3;->l(Landroid/app/Activity;Lcom/daaw/t3;)Lcom/daaw/z3;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/m4;->p:Lcom/daaw/z3;

    :cond_0
    iget-object v0, p0, Lcom/daaw/m4;->p:Lcom/daaw/z3;

    return-object v0
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/z3;->f(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b()Lcom/daaw/i0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->w()Lcom/daaw/i0;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroidx/appcompat/widget/Toolbar;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->S(Landroidx/appcompat/widget/Toolbar;)V

    return-void
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->t()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->y()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->C(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->x()V

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->D(Landroid/os/Bundle;)V

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->E()V

    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->F(Landroid/os/Bundle;)V

    return-void
.end method

.method public onPostResume()V
    .locals 1

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onPostResume()V

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->G()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onStop()V

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z3;->J()V

    return-void
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/preference/PreferenceActivity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/z3;->U(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->P(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/z3;->Q(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m4;->a()Lcom/daaw/z3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/z3;->R(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
