.class public final Lcom/daaw/zj8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;
.implements Lcom/daaw/cr8;


# instance fields
.field public final a:Ljava/util/Map;

.field public b:I

.field public c:Z

.field public d:Landroid/os/IBinder;

.field public final e:Lcom/daaw/rh8;

.field public f:Landroid/content/ComponentName;

.field public final synthetic g:Lcom/daaw/vp8;


# direct methods
.method public constructor <init>(Lcom/daaw/vp8;Lcom/daaw/rh8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/zj8;->e:Lcom/daaw/rh8;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/zj8;->a:Ljava/util/Map;

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/zj8;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/zj8;->b:I

    return v0
.end method

.method public final b()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj8;->f:Landroid/content/ComponentName;

    return-object v0
.end method

.method public final c()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj8;->d:Landroid/os/IBinder;

    return-object v0
.end method

.method public final d(Landroid/content/ServiceConnection;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    .locals 0

    iget-object p3, p0, Lcom/daaw/zj8;->a:Ljava/util/Map;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/util/concurrent/Executor;)V
    .locals 9

    const/4 v0, 0x3

    iput v0, p0, Lcom/daaw/zj8;->b:I

    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    invoke-static {}, Lcom/daaw/vw0;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroid/os/StrictMode$VmPolicy$Builder;

    invoke-direct {v1, v0}, Landroid/os/StrictMode$VmPolicy$Builder;-><init>(Landroid/os/StrictMode$VmPolicy;)V

    invoke-virtual {v1}, Landroid/os/StrictMode$VmPolicy$Builder;->permitUnsafeIntentLaunch()Landroid/os/StrictMode$VmPolicy$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    move-result-object v1

    invoke-static {v1}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {v1}, Lcom/daaw/vp8;->j(Lcom/daaw/vp8;)Lcom/daaw/fj;

    move-result-object v2

    invoke-static {v1}, Lcom/daaw/vp8;->h(Lcom/daaw/vp8;)Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/zj8;->e:Lcom/daaw/rh8;

    invoke-static {v1}, Lcom/daaw/vp8;->h(Lcom/daaw/vp8;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/daaw/rh8;->c(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v5

    iget-object v1, p0, Lcom/daaw/zj8;->e:Lcom/daaw/rh8;

    invoke-virtual {v1}, Lcom/daaw/rh8;->a()I

    move-result v7

    move-object v4, p1

    move-object v6, p0

    move-object v8, p2

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/fj;->d(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;ILjava/util/concurrent/Executor;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/zj8;->c:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {p1}, Lcom/daaw/vp8;->i(Lcom/daaw/vp8;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/zj8;->e:Lcom/daaw/rh8;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {p2}, Lcom/daaw/vp8;->i(Lcom/daaw/vp8;)Landroid/os/Handler;

    move-result-object p2

    iget-object v1, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {v1}, Lcom/daaw/vp8;->g(Lcom/daaw/vp8;)J

    move-result-wide v1

    invoke-virtual {p2, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/zj8;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p1, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {p1}, Lcom/daaw/vp8;->j(Lcom/daaw/vp8;)Lcom/daaw/fj;

    move-result-object p2

    invoke-static {p1}, Lcom/daaw/vp8;->h(Lcom/daaw/vp8;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p2, p1, p0}, Lcom/daaw/fj;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :goto_0
    invoke-static {v0}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    throw p1
.end method

.method public final f(Landroid/content/ServiceConnection;Ljava/lang/String;)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/zj8;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {p1}, Lcom/daaw/vp8;->i(Lcom/daaw/vp8;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/zj8;->e:Lcom/daaw/rh8;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {p1}, Lcom/daaw/vp8;->j(Lcom/daaw/vp8;)Lcom/daaw/fj;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/vp8;->h(Lcom/daaw/vp8;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lcom/daaw/fj;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/zj8;->c:Z

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/zj8;->b:I

    return-void
.end method

.method public final h(Landroid/content/ServiceConnection;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj8;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj8;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/zj8;->c:Z

    return v0
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {v0}, Lcom/daaw/vp8;->k(Lcom/daaw/vp8;)Ljava/util/HashMap;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {v1}, Lcom/daaw/vp8;->i(Lcom/daaw/vp8;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/zj8;->e:Lcom/daaw/rh8;

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iput-object p2, p0, Lcom/daaw/zj8;->d:Landroid/os/IBinder;

    iput-object p1, p0, Lcom/daaw/zj8;->f:Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/daaw/zj8;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ServiceConnection;

    invoke-interface {v2, p1, p2}, Landroid/content/ServiceConnection;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    goto :goto_0

    :cond_0
    iput v3, p0, Lcom/daaw/zj8;->b:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {v0}, Lcom/daaw/vp8;->k(Lcom/daaw/vp8;)Ljava/util/HashMap;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/zj8;->g:Lcom/daaw/vp8;

    invoke-static {v1}, Lcom/daaw/vp8;->i(Lcom/daaw/vp8;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/daaw/zj8;->e:Lcom/daaw/rh8;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/zj8;->d:Landroid/os/IBinder;

    iput-object p1, p0, Lcom/daaw/zj8;->f:Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/daaw/zj8;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ServiceConnection;

    invoke-interface {v2, p1}, Landroid/content/ServiceConnection;->onServiceDisconnected(Landroid/content/ComponentName;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/zj8;->b:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
