.class public Lcom/daaw/c40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w80;
.implements Lcom/daaw/m81;
.implements Lcom/daaw/nt1;


# instance fields
.field public final p:Landroidx/fragment/app/Fragment;

.field public final q:Lcom/daaw/mt1;

.field public r:Landroidx/lifecycle/e;

.field public s:Lcom/daaw/l81;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/daaw/mt1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/c40;->r:Landroidx/lifecycle/e;

    iput-object v0, p0, Lcom/daaw/c40;->s:Lcom/daaw/l81;

    iput-object p1, p0, Lcom/daaw/c40;->p:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lcom/daaw/c40;->q:Lcom/daaw/mt1;

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/c;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c40;->e()V

    iget-object v0, p0, Lcom/daaw/c40;->r:Landroidx/lifecycle/e;

    return-object v0
.end method

.method public b(Landroidx/lifecycle/c$b;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/c40;->r:Landroidx/lifecycle/e;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public synthetic d()Lcom/daaw/hn;
    .locals 1

    invoke-static {p0}, Lcom/daaw/v80;->a(Lcom/daaw/w80;)Lcom/daaw/hn;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/c40;->r:Landroidx/lifecycle/e;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/e;

    invoke-direct {v0, p0}, Landroidx/lifecycle/e;-><init>(Lcom/daaw/sj0;)V

    iput-object v0, p0, Lcom/daaw/c40;->r:Landroidx/lifecycle/e;

    invoke-static {p0}, Lcom/daaw/l81;->a(Lcom/daaw/m81;)Lcom/daaw/l81;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/c40;->s:Lcom/daaw/l81;

    :cond_0
    return-void
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/c40;->r:Landroidx/lifecycle/e;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()Lcom/daaw/mt1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c40;->e()V

    iget-object v0, p0, Lcom/daaw/c40;->q:Lcom/daaw/mt1;

    return-object v0
.end method

.method public h(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/c40;->s:Lcom/daaw/l81;

    invoke-virtual {v0, p1}, Lcom/daaw/l81;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method public i()Lcom/daaw/k81;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c40;->e()V

    iget-object v0, p0, Lcom/daaw/c40;->s:Lcom/daaw/l81;

    invoke-virtual {v0}, Lcom/daaw/l81;->b()Lcom/daaw/k81;

    move-result-object v0

    return-object v0
.end method

.method public j(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/c40;->s:Lcom/daaw/l81;

    invoke-virtual {v0, p1}, Lcom/daaw/l81;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public k(Landroidx/lifecycle/c$c;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/c40;->r:Landroidx/lifecycle/e;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/e;->o(Landroidx/lifecycle/c$c;)V

    return-void
.end method
