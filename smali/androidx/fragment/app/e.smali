.class public abstract Landroidx/fragment/app/e;
.super Lcom/daaw/r30;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/r30;"
    }
.end annotation


# instance fields
.field public final p:Landroid/app/Activity;

.field public final q:Landroid/content/Context;

.field public final r:Landroid/os/Handler;

.field public final s:I

.field public final t:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/r30;-><init>()V

    new-instance v0, Lcom/daaw/u30;

    invoke-direct {v0}, Lcom/daaw/u30;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/e;->t:Landroidx/fragment/app/FragmentManager;

    iput-object p1, p0, Landroidx/fragment/app/e;->p:Landroid/app/Activity;

    const-string p1, "context == null"

    invoke-static {p2, p1}, Lcom/daaw/ty0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Landroidx/fragment/app/e;->q:Landroid/content/Context;

    const-string p1, "handler == null"

    invoke-static {p3, p1}, Lcom/daaw/ty0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    iput-object p1, p0, Landroidx/fragment/app/e;->r:Landroid/os/Handler;

    iput p4, p0, Landroidx/fragment/app/e;->s:I

    return-void
.end method

.method public constructor <init>(Lcom/daaw/p30;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, p1, p1, v0, v1}, Landroidx/fragment/app/e;-><init>(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V

    return-void
.end method


# virtual methods
.method public f(I)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method j()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/e;->p:Landroid/app/Activity;

    return-object v0
.end method

.method k()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/e;->q:Landroid/content/Context;

    return-object v0
.end method

.method l()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/e;->r:Landroid/os/Handler;

    return-object v0
.end method

.method public abstract m()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation
.end method

.method public n()Landroid/view/LayoutInflater;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/e;->q:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public o(Landroidx/fragment/app/Fragment;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public p(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 0
    .param p2    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    const/4 p1, -0x1

    if-ne p3, p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/e;->q:Landroid/content/Context;

    invoke-static {p1, p2, p4}, Lcom/daaw/zk;->i(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Starting activity with a requestCode requires a FragmentActivity host"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public q()V
    .locals 0

    return-void
.end method
