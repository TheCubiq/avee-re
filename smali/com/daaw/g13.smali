.class public final Lcom/daaw/g13;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final p:Landroid/app/Application;

.field public final q:Ljava/lang/ref/WeakReference;

.field public r:Z


# direct methods
.method public constructor <init>(Landroid/app/Application;Landroid/app/Application$ActivityLifecycleCallbacks;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/g13;->r:Z

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/g13;->q:Ljava/lang/ref/WeakReference;

    iput-object p1, p0, Lcom/daaw/g13;->p:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/f13;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/g13;->q:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application$ActivityLifecycleCallbacks;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lcom/daaw/f13;->a(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void

    :cond_0
    iget-boolean p1, p0, Lcom/daaw/g13;->r:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/g13;->p:Landroid/app/Application;

    invoke-virtual {p1, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/g13;->r:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "Error while dispatching lifecycle callback."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/daaw/y03;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/y03;-><init>(Lcom/daaw/g13;Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/daaw/g13;->a(Lcom/daaw/f13;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/daaw/e13;

    invoke-direct {v0, p0, p1}, Lcom/daaw/e13;-><init>(Lcom/daaw/g13;Landroid/app/Activity;)V

    invoke-virtual {p0, v0}, Lcom/daaw/g13;->a(Lcom/daaw/f13;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/daaw/b13;

    invoke-direct {v0, p0, p1}, Lcom/daaw/b13;-><init>(Lcom/daaw/g13;Landroid/app/Activity;)V

    invoke-virtual {p0, v0}, Lcom/daaw/g13;->a(Lcom/daaw/f13;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/daaw/a13;

    invoke-direct {v0, p0, p1}, Lcom/daaw/a13;-><init>(Lcom/daaw/g13;Landroid/app/Activity;)V

    invoke-virtual {p0, v0}, Lcom/daaw/g13;->a(Lcom/daaw/f13;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/daaw/d13;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/d13;-><init>(Lcom/daaw/g13;Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/daaw/g13;->a(Lcom/daaw/f13;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/daaw/z03;

    invoke-direct {v0, p0, p1}, Lcom/daaw/z03;-><init>(Lcom/daaw/g13;Landroid/app/Activity;)V

    invoke-virtual {p0, v0}, Lcom/daaw/g13;->a(Lcom/daaw/f13;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/daaw/c13;

    invoke-direct {v0, p0, p1}, Lcom/daaw/c13;-><init>(Lcom/daaw/g13;Landroid/app/Activity;)V

    invoke-virtual {p0, v0}, Lcom/daaw/g13;->a(Lcom/daaw/f13;)V

    return-void
.end method
