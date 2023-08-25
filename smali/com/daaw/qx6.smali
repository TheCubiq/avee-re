.class public final Lcom/daaw/qx6;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final o:Ljava/util/Map;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/cx6;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/Set;

.field public final f:Ljava/lang/Object;

.field public g:Z

.field public final h:Landroid/content/Intent;

.field public final i:Ljava/lang/ref/WeakReference;

.field public final j:Landroid/os/IBinder$DeathRecipient;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public l:Landroid/content/ServiceConnection;

.field public m:Landroid/os/IInterface;

.field public final n:Lcom/daaw/kw6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/daaw/qx6;->o:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/cx6;Ljava/lang/String;Landroid/content/Intent;Lcom/daaw/kw6;Lcom/daaw/lx6;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/daaw/qx6;->d:Ljava/util/List;

    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    iput-object p3, p0, Lcom/daaw/qx6;->e:Ljava/util/Set;

    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/daaw/qx6;->f:Ljava/lang/Object;

    new-instance p3, Lcom/daaw/fx6;

    invoke-direct {p3, p0}, Lcom/daaw/fx6;-><init>(Lcom/daaw/qx6;)V

    iput-object p3, p0, Lcom/daaw/qx6;->j:Landroid/os/IBinder$DeathRecipient;

    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p6, 0x0

    invoke-direct {p3, p6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p3, p0, Lcom/daaw/qx6;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lcom/daaw/qx6;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    const-string p1, "OverlayDisplayService"

    iput-object p1, p0, Lcom/daaw/qx6;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/qx6;->h:Landroid/content/Intent;

    iput-object p5, p0, Lcom/daaw/qx6;->n:Lcom/daaw/kw6;

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/qx6;->i:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/qx6;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx6;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/qx6;)Landroid/content/ServiceConnection;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx6;->l:Landroid/content/ServiceConnection;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/qx6;)Landroid/os/IInterface;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx6;->m:Landroid/os/IInterface;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/qx6;)Lcom/daaw/cx6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/qx6;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx6;->d:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic h(Lcom/daaw/qx6;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "reportBinderDeath"

    invoke-virtual {v0, v3, v2}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/daaw/qx6;->i:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lx6;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "calling onBinderDied"

    invoke-virtual {v2, v3, v1}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-interface {v0}, Lcom/daaw/lx6;->zza()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/qx6;->c:Ljava/lang/String;

    aput-object v3, v2, v1

    const-string v1, "%s : Binder has died."

    invoke-virtual {v0, v1, v2}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/daaw/qx6;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/dx6;

    invoke-virtual {p0}, Lcom/daaw/qx6;->s()Landroid/os/RemoteException;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/dx6;->c(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/qx6;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :goto_1
    invoke-virtual {p0}, Lcom/daaw/qx6;->t()V

    return-void
.end method

.method public static bridge synthetic i(Lcom/daaw/qx6;Landroid/content/ServiceConnection;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/qx6;->l:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static bridge synthetic j(Lcom/daaw/qx6;Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/qx6;->g:Z

    return-void
.end method

.method public static bridge synthetic k(Lcom/daaw/qx6;Landroid/os/IInterface;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qx6;->m:Landroid/os/IInterface;

    return-void
.end method

.method public static bridge synthetic l(Lcom/daaw/qx6;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/qx6;->t()V

    return-void
.end method

.method public static bridge synthetic m(Lcom/daaw/qx6;Lcom/daaw/dx6;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/qx6;->m:Landroid/os/IInterface;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/qx6;->g:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Initiate binding to the service."

    invoke-virtual {v0, v3, v2}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/daaw/qx6;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lcom/daaw/px6;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/daaw/px6;-><init>(Lcom/daaw/qx6;Lcom/daaw/ox6;)V

    iput-object p1, p0, Lcom/daaw/qx6;->l:Landroid/content/ServiceConnection;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/qx6;->g:Z

    iget-object v2, p0, Lcom/daaw/qx6;->a:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/qx6;->h:Landroid/content/Intent;

    invoke-virtual {v2, v3, p1, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "Failed to bind to the service."

    invoke-virtual {p1, v2, v0}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iput-boolean v1, p0, Lcom/daaw/qx6;->g:Z

    iget-object p1, p0, Lcom/daaw/qx6;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/dx6;

    new-instance v1, Lcom/daaw/rx6;

    invoke-direct {v1}, Lcom/daaw/rx6;-><init>()V

    invoke-virtual {v0, v1}, Lcom/daaw/dx6;->c(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lcom/daaw/qx6;->d:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_1
    return-void

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/qx6;->g:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Waiting to bind to the service."

    invoke-virtual {v0, v2, v1}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p0, p0, Lcom/daaw/qx6;->d:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/daaw/dx6;->run()V

    return-void
.end method

.method public static bridge synthetic n(Lcom/daaw/qx6;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "linkToDeath"

    invoke-virtual {v0, v3, v2}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    :try_start_0
    iget-object v0, p0, Lcom/daaw/qx6;->m:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/qx6;->j:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, v2, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object p0, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "linkToDeath failed"

    invoke-virtual {p0, v0, v2, v1}, Lcom/daaw/cx6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public static bridge synthetic o(Lcom/daaw/qx6;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "unlinkToDeath"

    invoke-virtual {v0, v3, v2}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/daaw/qx6;->m:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object p0, p0, Lcom/daaw/qx6;->j:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    return-void
.end method


# virtual methods
.method public final c()Landroid/os/Handler;
    .locals 4

    sget-object v0, Lcom/daaw/qx6;->o:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qx6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    iget-object v2, p0, Lcom/daaw/qx6;->c:Ljava/lang/String;

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    iget-object v2, p0, Lcom/daaw/qx6;->c:Ljava/lang/String;

    new-instance v3, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lcom/daaw/qx6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()Landroid/os/IInterface;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qx6;->m:Landroid/os/IInterface;

    return-object v0
.end method

.method public final p(Lcom/daaw/dx6;Lcom/daaw/tj1;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/qx6;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qx6;->e:Ljava/util/Set;

    invoke-interface {v1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object v1

    new-instance v2, Lcom/daaw/ex6;

    invoke-direct {v2, p0, p2}, Lcom/daaw/ex6;-><init>(Lcom/daaw/qx6;Lcom/daaw/tj1;)V

    invoke-virtual {v1, v2}, Lcom/daaw/rj1;->b(Lcom/daaw/cu0;)Lcom/daaw/rj1;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object p2, p0, Lcom/daaw/qx6;->f:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    iget-object v0, p0, Lcom/daaw/qx6;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    const-string v1, "Already connected to the service."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/cx6;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    :cond_0
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    new-instance p2, Lcom/daaw/gx6;

    invoke-virtual {p1}, Lcom/daaw/dx6;->b()Lcom/daaw/tj1;

    move-result-object v0

    invoke-direct {p2, p0, v0, p1}, Lcom/daaw/gx6;-><init>(Lcom/daaw/qx6;Lcom/daaw/tj1;Lcom/daaw/dx6;)V

    invoke-virtual {p0}, Lcom/daaw/qx6;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final synthetic q(Lcom/daaw/tj1;Lcom/daaw/rj1;)V
    .locals 1

    iget-object p2, p0, Lcom/daaw/qx6;->f:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/qx6;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final r()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/qx6;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qx6;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/qx6;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/qx6;->b:Lcom/daaw/cx6;

    const-string v2, "Leaving the connection open for other ongoing calls."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    monitor-exit v0

    return-void

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lcom/daaw/hx6;

    invoke-direct {v0, p0}, Lcom/daaw/hx6;-><init>(Lcom/daaw/qx6;)V

    invoke-virtual {p0}, Lcom/daaw/qx6;->c()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final s()Landroid/os/RemoteException;
    .locals 3

    new-instance v0, Landroid/os/RemoteException;

    iget-object v1, p0, Lcom/daaw/qx6;->c:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " : Binder has died."

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final t()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/qx6;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qx6;->e:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/tj1;

    invoke-virtual {p0}, Lcom/daaw/qx6;->s()Landroid/os/RemoteException;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/qx6;->e:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method
