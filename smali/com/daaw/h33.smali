.class public final Lcom/daaw/h33;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/util/concurrent/ScheduledFuture;

.field public final b:Ljava/lang/Runnable;

.field public final c:Ljava/lang/Object;

.field public d:Lcom/daaw/j33;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public e:Landroid/content/Context;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public f:Lcom/daaw/l33;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/h33;->a:Ljava/util/concurrent/ScheduledFuture;

    new-instance v0, Lcom/daaw/d33;

    invoke-direct {v0, p0}, Lcom/daaw/d33;-><init>(Lcom/daaw/h33;)V

    iput-object v0, p0, Lcom/daaw/h33;->b:Ljava/lang/Runnable;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/h33;->c:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/h33;)Lcom/daaw/j33;
    .locals 0

    iget-object p0, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/h33;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/h33;->c:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/h33;Lcom/daaw/j33;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    return-void
.end method

.method public static bridge synthetic g(Lcom/daaw/h33;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/h33;->l()V

    return-void
.end method

.method public static bridge synthetic h(Lcom/daaw/h33;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h33;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/pa;->isConnected()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    invoke-virtual {v1}, Lcom/daaw/pa;->isConnecting()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    invoke-virtual {v1}, Lcom/daaw/pa;->disconnect()V

    :cond_2
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    iput-object v1, p0, Lcom/daaw/h33;->f:Lcom/daaw/l33;

    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic k(Lcom/daaw/h33;Lcom/daaw/l33;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h33;->f:Lcom/daaw/l33;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zzbei;)J
    .locals 4

    iget-object v0, p0, Lcom/daaw/h33;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/h33;->f:Lcom/daaw/l33;

    const-wide/16 v2, -0x2

    if-nez v1, :cond_0

    monitor-exit v0

    return-wide v2

    :cond_0
    iget-object v1, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    invoke-virtual {v1}, Lcom/daaw/j33;->J()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    :try_start_1
    iget-object v1, p0, Lcom/daaw/h33;->f:Lcom/daaw/l33;

    invoke-virtual {v1, p1}, Lcom/daaw/l33;->h3(Lcom/google/android/gms/internal/ads/zzbei;)J

    move-result-wide v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-wide v1

    :catch_0
    move-exception p1

    const-string v1, "Unable to call into cache service."

    invoke-static {v1, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    monitor-exit v0

    return-wide v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zzbei;)Lcom/google/android/gms/internal/ads/zzbef;
    .locals 2

    iget-object v0, p0, Lcom/daaw/h33;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/h33;->f:Lcom/daaw/l33;

    if-nez v1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbef;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbef;-><init>()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    invoke-virtual {v1}, Lcom/daaw/j33;->J()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/h33;->f:Lcom/daaw/l33;

    invoke-virtual {v1, p1}, Lcom/daaw/l33;->j3(Lcom/google/android/gms/internal/ads/zzbei;)Lcom/google/android/gms/internal/ads/zzbef;

    move-result-object p1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p1

    :cond_1
    :try_start_3
    iget-object v1, p0, Lcom/daaw/h33;->f:Lcom/daaw/l33;

    invoke-virtual {v1, p1}, Lcom/daaw/l33;->i3(Lcom/google/android/gms/internal/ads/zzbei;)Lcom/google/android/gms/internal/ads/zzbef;

    move-result-object p1
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "Unable to call into cache service."

    invoke-static {v1, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbef;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbef;-><init>()V

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final declared-synchronized d(Lcom/daaw/pa$a;Lcom/daaw/pa$b;)Lcom/daaw/j33;
    .locals 3

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/daaw/j33;

    iget-object v1, p0, Lcom/daaw/h33;->e:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzt()Lcom/google/android/gms/ads/internal/util/zzbv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/util/zzbv;->zzb()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/daaw/j33;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/pa$a;Lcom/daaw/pa$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final i(Landroid/content/Context;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/h33;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/h33;->e:Landroid/content/Context;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/h33;->e:Landroid/content/Context;

    sget-object p1, Lcom/daaw/g93;->I3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/h33;->l()V

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/daaw/g93;->H3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/daaw/e33;

    invoke-direct {p1, p0}, Lcom/daaw/e33;-><init>(Lcom/daaw/h33;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzb()Lcom/daaw/n13;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/n13;->c(Lcom/daaw/m13;)V

    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final j()V
    .locals 6

    sget-object v0, Lcom/daaw/g93;->J3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/h33;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/h33;->l()V

    iget-object v1, p0, Lcom/daaw/h33;->a:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_0
    sget-object v1, Lcom/daaw/z04;->d:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/daaw/h33;->b:Ljava/lang/Runnable;

    sget-object v3, Lcom/daaw/g93;->K3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/h33;->a:Ljava/util/concurrent/ScheduledFuture;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-void
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h33;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/h33;->e:Landroid/content/Context;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/f33;

    invoke-direct {v1, p0}, Lcom/daaw/f33;-><init>(Lcom/daaw/h33;)V

    new-instance v2, Lcom/daaw/g33;

    invoke-direct {v2, p0}, Lcom/daaw/g33;-><init>(Lcom/daaw/h33;)V

    invoke-virtual {p0, v1, v2}, Lcom/daaw/h33;->d(Lcom/daaw/pa$a;Lcom/daaw/pa$b;)Lcom/daaw/j33;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/h33;->d:Lcom/daaw/j33;

    invoke-virtual {v1}, Lcom/daaw/pa;->checkAvailabilityAndConnect()V

    monitor-exit v0

    return-void

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
