.class public final Lcom/daaw/dm5;
.super Lcom/daaw/jm5;
.source ""


# instance fields
.field public h:Lcom/google/android/gms/internal/ads/zzcbj;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/jm5;-><init>()V

    iput-object p1, p0, Lcom/daaw/jm5;->e:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzt()Lcom/google/android/gms/ads/internal/util/zzbv;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/util/zzbv;->zzb()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/jm5;->f:Landroid/os/Looper;

    iput-object p2, p0, Lcom/daaw/jm5;->g:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public final declared-synchronized M(Landroid/os/Bundle;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean p1, p0, Lcom/daaw/jm5;->c:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/jm5;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lcom/daaw/jm5;->d:Lcom/daaw/rt3;

    invoke-virtual {v0}, Lcom/daaw/rt3;->J()Lcom/daaw/bu3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/dm5;->h:Lcom/google/android/gms/internal/ads/zzcbj;

    new-instance v2, Lcom/daaw/im5;

    invoke-direct {v2, p0}, Lcom/daaw/im5;-><init>(Lcom/daaw/jm5;)V

    invoke-interface {v0, v1, v2}, Lcom/daaw/bu3;->U1(Lcom/google/android/gms/internal/ads/zzcbj;Lcom/daaw/eu3;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    const-string v1, "RemoteAdsServiceProxyClientTask.onConnected"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/jm5;->a:Lcom/daaw/e14;

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catch_0
    :try_start_3
    iget-object v0, p0, Lcom/daaw/jm5;->a:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/pk5;

    invoke-direct {v1, p1}, Lcom/daaw/pk5;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c(Lcom/google/android/gms/internal/ads/zzcbj;J)Lcom/daaw/f77;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/jm5;->b:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/daaw/jm5;->a:Lcom/daaw/e14;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lcom/daaw/jm5;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p1, p2, p3, v0, v1}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/daaw/jm5;->b:Z

    iput-object p1, p0, Lcom/daaw/dm5;->h:Lcom/google/android/gms/internal/ads/zzcbj;

    invoke-virtual {p0}, Lcom/daaw/jm5;->a()V

    iget-object p1, p0, Lcom/daaw/jm5;->a:Lcom/daaw/e14;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lcom/daaw/jm5;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p1, p2, p3, v0, v1}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object p1

    new-instance p2, Lcom/daaw/cm5;

    invoke-direct {p2, p0}, Lcom/daaw/cm5;-><init>(Lcom/daaw/dm5;)V

    sget-object p3, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-interface {p1, p2, p3}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
