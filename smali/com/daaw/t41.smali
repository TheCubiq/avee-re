.class public Lcom/daaw/t41;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final t:Lcom/daaw/t41;


# instance fields
.field public volatile p:Lcom/daaw/r41;

.field public final q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/app/FragmentManager;",
            "Lcom/daaw/s41;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/fragment/app/FragmentManager;",
            "Lcom/daaw/ii1;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/t41;

    invoke-direct {v0}, Lcom/daaw/t41;-><init>()V

    sput-object v0, Lcom/daaw/t41;->t:Lcom/daaw/t41;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/t41;->q:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/t41;->r:Ljava/util/Map;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/daaw/t41;->s:Landroid/os/Handler;

    return-void
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load for a destroyed activity"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f()Lcom/daaw/t41;
    .locals 1

    sget-object v0, Lcom/daaw/t41;->t:Lcom/daaw/t41;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;Landroid/app/FragmentManager;)Lcom/daaw/r41;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    invoke-virtual {p0, p2}, Lcom/daaw/t41;->h(Landroid/app/FragmentManager;)Lcom/daaw/s41;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/s41;->c()Lcom/daaw/r41;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/r41;

    invoke-virtual {p2}, Lcom/daaw/s41;->b()Lcom/daaw/r0;

    move-result-object v1

    invoke-virtual {p2}, Lcom/daaw/s41;->d()Lcom/daaw/u41;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/daaw/r41;-><init>(Landroid/content/Context;Lcom/daaw/mj0;Lcom/daaw/u41;)V

    invoke-virtual {p2, v0}, Lcom/daaw/s41;->f(Lcom/daaw/r41;)V

    :cond_0
    return-object v0
.end method

.method public c(Landroid/app/Activity;)Lcom/daaw/r41;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    invoke-static {}, Lcom/daaw/tq1;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/daaw/t41;->a(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/t41;->b(Landroid/content/Context;Landroid/app/FragmentManager;)Lcom/daaw/r41;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/t41;->d(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/content/Context;)Lcom/daaw/r41;
    .locals 1

    if-eqz p1, :cond_3

    invoke-static {}, Lcom/daaw/tq1;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, Landroid/app/Application;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/daaw/p30;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/p30;

    invoke-virtual {p0, p1}, Lcom/daaw/t41;->e(Lcom/daaw/p30;)Lcom/daaw/r41;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/daaw/t41;->c(Landroid/app/Activity;)Lcom/daaw/r41;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/t41;->d(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/t41;->g(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a null Context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lcom/daaw/p30;)Lcom/daaw/r41;
    .locals 1

    invoke-static {}, Lcom/daaw/tq1;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/t41;->d(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/daaw/t41;->a(Landroid/app/Activity;)V

    invoke-virtual {p1}, Lcom/daaw/p30;->x()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/t41;->j(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)Lcom/daaw/r41;

    move-result-object p1

    return-object p1
.end method

.method public final g(Landroid/content/Context;)Lcom/daaw/r41;
    .locals 3

    iget-object v0, p0, Lcom/daaw/t41;->p:Lcom/daaw/r41;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/t41;->p:Lcom/daaw/r41;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/r41;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Lcom/daaw/p5;

    invoke-direct {v1}, Lcom/daaw/p5;-><init>()V

    new-instance v2, Lcom/daaw/rw;

    invoke-direct {v2}, Lcom/daaw/rw;-><init>()V

    invoke-direct {v0, p1, v1, v2}, Lcom/daaw/r41;-><init>(Landroid/content/Context;Lcom/daaw/mj0;Lcom/daaw/u41;)V

    iput-object v0, p0, Lcom/daaw/t41;->p:Lcom/daaw/r41;

    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/t41;->p:Lcom/daaw/r41;

    return-object p1
.end method

.method public h(Landroid/app/FragmentManager;)Lcom/daaw/s41;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    const-string v0, "com.bumptech.glide.manager"

    invoke-virtual {p1, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/daaw/s41;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/t41;->q:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/s41;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/s41;

    invoke-direct {v1}, Lcom/daaw/s41;-><init>()V

    iget-object v2, p0, Lcom/daaw/t41;->q:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/daaw/t41;->s:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_0
    return-object v1
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 v2, 0x0

    move-object p1, v1

    goto :goto_1

    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    iget-object p1, p0, Lcom/daaw/t41;->r:Ljava/util/Map;

    goto :goto_0

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Landroid/app/FragmentManager;

    iget-object p1, p0, Lcom/daaw/t41;->q:Ljava/util/Map;

    :goto_0
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, v1

    move-object v1, p1

    move-object p1, v4

    :goto_1
    if-eqz v2, :cond_2

    if-nez v1, :cond_2

    const/4 v0, 0x5

    const-string v1, "RMRetriever"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to remove expected request manager fragment, manager: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    return v2
.end method

.method public i(Landroidx/fragment/app/FragmentManager;)Lcom/daaw/ii1;
    .locals 3

    const-string v0, "com.bumptech.glide.manager"

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->h0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/daaw/ii1;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/t41;->r:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ii1;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/ii1;

    invoke-direct {v1}, Lcom/daaw/ii1;-><init>()V

    iget-object v2, p0, Lcom/daaw/t41;->r:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->l()Landroidx/fragment/app/j;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroidx/fragment/app/j;->d(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/j;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/j;->g()I

    iget-object v0, p0, Lcom/daaw/t41;->s:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_0
    return-object v1
.end method

.method public j(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)Lcom/daaw/r41;
    .locals 3

    invoke-virtual {p0, p2}, Lcom/daaw/t41;->i(Landroidx/fragment/app/FragmentManager;)Lcom/daaw/ii1;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/ii1;->I1()Lcom/daaw/r41;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/r41;

    invoke-virtual {p2}, Lcom/daaw/ii1;->H1()Lcom/daaw/r0;

    move-result-object v1

    invoke-virtual {p2}, Lcom/daaw/ii1;->J1()Lcom/daaw/u41;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/daaw/r41;-><init>(Landroid/content/Context;Lcom/daaw/mj0;Lcom/daaw/u41;)V

    invoke-virtual {p2, v0}, Lcom/daaw/ii1;->L1(Lcom/daaw/r41;)V

    :cond_0
    return-object v0
.end method
