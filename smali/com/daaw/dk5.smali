.class public final Lcom/daaw/dk5;
.super Lcom/daaw/xj5;
.source ""


# instance fields
.field public g:Ljava/lang/String;

.field public h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/xj5;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/dk5;->h:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzt()Lcom/google/android/gms/ads/internal/util/zzbv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/util/zzbv;->zzb()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/daaw/pt3;

    invoke-direct {v1, p1, v0, p0, p0}, Lcom/daaw/pt3;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/pa$a;Lcom/daaw/pa$b;)V

    iput-object v1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    return-void
.end method


# virtual methods
.method public final I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    const-string p1, "Cannot connect to remote service, fallback to local instance."

    invoke-static {p1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v0, Lcom/daaw/pk5;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/pk5;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final M(Landroid/os/Bundle;)V
    .locals 4

    iget-object p1, p0, Lcom/daaw/xj5;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/xj5;->d:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/xj5;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v1, p0, Lcom/daaw/dk5;->h:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    invoke-virtual {v1}, Lcom/daaw/pt3;->J()Lcom/daaw/xt3;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/xj5;->e:Lcom/google/android/gms/internal/ads/zzccb;

    new-instance v3, Lcom/daaw/wj5;

    invoke-direct {v3, p0}, Lcom/daaw/wj5;-><init>(Lcom/daaw/xj5;)V

    invoke-interface {v1, v2, v3}, Lcom/daaw/xt3;->b2(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/hu3;)V

    goto :goto_1

    :cond_0
    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    invoke-virtual {v1}, Lcom/daaw/pt3;->J()Lcom/daaw/xt3;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/dk5;->g:Ljava/lang/String;

    new-instance v3, Lcom/daaw/wj5;

    invoke-direct {v3, p0}, Lcom/daaw/wj5;-><init>(Lcom/daaw/xj5;)V

    invoke-interface {v1, v2, v3}, Lcom/daaw/xt3;->j1(Ljava/lang/String;Lcom/daaw/hu3;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v2, Lcom/daaw/pk5;

    invoke-direct {v2, v0}, Lcom/daaw/pk5;-><init>(I)V

    invoke-virtual {v1, v2}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v2

    const-string v3, "RemoteUrlAndCacheKeyClientTask.onConnected"

    invoke-virtual {v2, v1, v3}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v2, Lcom/daaw/pk5;

    invoke-direct {v2, v0}, Lcom/daaw/pk5;-><init>(I)V

    :goto_0
    invoke-virtual {v1, v2}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    goto :goto_1

    :catch_0
    iget-object v1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v2, Lcom/daaw/pk5;

    invoke-direct {v2, v0}, Lcom/daaw/pk5;-><init>(I)V

    goto :goto_0

    :cond_2
    :goto_1
    monitor-exit p1

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/daaw/xj5;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/daaw/dk5;->h:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v2, :cond_0

    if-eq v1, v3, :cond_0

    new-instance p1, Lcom/daaw/pk5;

    invoke-direct {p1, v3}, Lcom/daaw/pk5;-><init>(I)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/xj5;->c:Z

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    monitor-exit v0

    return-object p1

    :cond_1
    iput v3, p0, Lcom/daaw/dk5;->h:I

    iput-boolean v2, p0, Lcom/daaw/xj5;->c:Z

    iput-object p1, p0, Lcom/daaw/xj5;->e:Lcom/google/android/gms/internal/ads/zzccb;

    iget-object p1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    invoke-virtual {p1}, Lcom/daaw/pa;->checkAvailabilityAndConnect()V

    iget-object p1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/ck5;

    invoke-direct {v1, p0}, Lcom/daaw/ck5;-><init>(Lcom/daaw/dk5;)V

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-virtual {p1, v1, v2}, Lcom/daaw/e14;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final c(Ljava/lang/String;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/daaw/xj5;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/daaw/dk5;->h:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    if-eq v1, v2, :cond_0

    new-instance p1, Lcom/daaw/pk5;

    const/4 v1, 0x2

    invoke-direct {p1, v1}, Lcom/daaw/pk5;-><init>(I)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/xj5;->c:Z

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    monitor-exit v0

    return-object p1

    :cond_1
    iput v2, p0, Lcom/daaw/dk5;->h:I

    iput-boolean v3, p0, Lcom/daaw/xj5;->c:Z

    iput-object p1, p0, Lcom/daaw/dk5;->g:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    invoke-virtual {p1}, Lcom/daaw/pa;->checkAvailabilityAndConnect()V

    iget-object p1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/bk5;

    invoke-direct {v1, p0}, Lcom/daaw/bk5;-><init>(Lcom/daaw/dk5;)V

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-virtual {p1, v1, v2}, Lcom/daaw/e14;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
