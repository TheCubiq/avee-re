.class public Lcom/daaw/di;
.super Landroid/app/Dialog;
.source ""

# interfaces
.implements Lcom/daaw/sj0;
.implements Lcom/daaw/yt0;


# instance fields
.field public p:Landroidx/lifecycle/e;

.field public final q:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance p1, Landroidx/activity/OnBackPressedDispatcher;

    new-instance p2, Lcom/daaw/ci;

    invoke-direct {p2, p0}, Lcom/daaw/ci;-><init>(Lcom/daaw/di;)V

    invoke-direct {p1, p2}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lcom/daaw/di;->q:Landroidx/activity/OnBackPressedDispatcher;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/di;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/di;->e(Lcom/daaw/di;)V

    return-void
.end method

.method public static final e(Lcom/daaw/di;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/c;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/di;->d()Landroidx/lifecycle/e;

    move-result-object v0

    return-object v0
.end method

.method public final c()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    iget-object v0, p0, Lcom/daaw/di;->q:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public final d()Landroidx/lifecycle/e;
    .locals 1

    iget-object v0, p0, Lcom/daaw/di;->p:Landroidx/lifecycle/e;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/e;

    invoke-direct {v0, p0}, Landroidx/lifecycle/e;-><init>(Lcom/daaw/sj0;)V

    iput-object v0, p0, Lcom/daaw/di;->p:Landroidx/lifecycle/e;

    :cond_0
    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/di;->q:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->f()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/daaw/di;->d()Landroidx/lifecycle/e;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/c$b;->ON_CREATE:Landroidx/lifecycle/c$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    invoke-virtual {p0}, Lcom/daaw/di;->d()Landroidx/lifecycle/e;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/c$b;->ON_RESUME:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/di;->d()Landroidx/lifecycle/e;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/c$b;->ON_DESTROY:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/di;->p:Landroidx/lifecycle/e;

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    return-void
.end method
