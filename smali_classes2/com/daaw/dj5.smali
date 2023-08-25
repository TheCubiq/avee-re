.class public final Lcom/daaw/dj5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic p:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    new-instance v1, Lcom/daaw/ta5;

    invoke-direct {v1, p0, p2, p1}, Lcom/daaw/ta5;-><init>(Lcom/daaw/dj5;Landroid/os/Bundle;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/daaw/gk5;->F(Lcom/daaw/gk5;Lcom/daaw/l75;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    new-instance v1, Lcom/daaw/zh5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/zh5;-><init>(Lcom/daaw/dj5;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/daaw/gk5;->F(Lcom/daaw/gk5;Lcom/daaw/l75;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    new-instance v1, Lcom/daaw/qe5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/qe5;-><init>(Lcom/daaw/dj5;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/daaw/gk5;->F(Lcom/daaw/gk5;Lcom/daaw/l75;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    new-instance v1, Lcom/daaw/ad5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ad5;-><init>(Lcom/daaw/dj5;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/daaw/gk5;->F(Lcom/daaw/gk5;Lcom/daaw/l75;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    new-instance v0, Lcom/daaw/oq3;

    invoke-direct {v0}, Lcom/daaw/oq3;-><init>()V

    iget-object v1, p0, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    new-instance v2, Lcom/daaw/wg5;

    invoke-direct {v2, p0, p1, v0}, Lcom/daaw/wg5;-><init>(Lcom/daaw/dj5;Landroid/app/Activity;Lcom/daaw/oq3;)V

    invoke-static {v1, v2}, Lcom/daaw/gk5;->F(Lcom/daaw/gk5;Lcom/daaw/l75;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Lcom/daaw/oq3;->I(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    new-instance v1, Lcom/daaw/wb5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/wb5;-><init>(Lcom/daaw/dj5;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/daaw/gk5;->F(Lcom/daaw/gk5;Lcom/daaw/l75;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    new-instance v1, Lcom/daaw/tf5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/tf5;-><init>(Lcom/daaw/dj5;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/daaw/gk5;->F(Lcom/daaw/gk5;Lcom/daaw/l75;)V

    return-void
.end method
