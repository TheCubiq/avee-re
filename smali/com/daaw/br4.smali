.class public final Lcom/daaw/br4;
.super Lcom/daaw/kw4;
.source ""

# interfaces
.implements Lcom/daaw/pq4;


# instance fields
.field public final q:Ljava/util/concurrent/ScheduledExecutorService;

.field public r:Ljava/util/concurrent/ScheduledFuture;

.field public s:Z


# direct methods
.method public constructor <init>(Lcom/daaw/xq4;Ljava/util/Set;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/daaw/kw4;-><init>(Ljava/util/Set;)V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/daaw/br4;->s:Z

    iput-object p4, p0, Lcom/daaw/br4;->q:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p0, p1, p3}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 1

    new-instance v0, Lcom/daaw/rq4;

    invoke-direct {v0, p1}, Lcom/daaw/rq4;-><init>(Lcom/google/android/gms/ads/internal/client/zze;)V

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    return-void
.end method

.method public final s(Lcom/daaw/b15;)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/br4;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/br4;->r:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_1
    new-instance v0, Lcom/daaw/qq4;

    invoke-direct {v0, p1}, Lcom/daaw/qq4;-><init>(Lcom/daaw/b15;)V

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    return-void
.end method

.method public final zzb()V
    .locals 1

    sget-object v0, Lcom/daaw/tq4;->a:Lcom/daaw/tq4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    return-void
.end method

.method public final synthetic zzd()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "Timeout waiting for show call succeed to be called."

    invoke-static {v0}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/b15;

    const-string v1, "Timeout for show call succeed."

    invoke-direct {v0, v1}, Lcom/daaw/b15;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/br4;->s(Lcom/daaw/b15;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/br4;->s:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final declared-synchronized zze()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/br4;->r:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzf()V
    .locals 5

    sget-object v0, Lcom/daaw/g93;->T8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/br4;->q:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/daaw/sq4;

    invoke-direct {v2, p0}, Lcom/daaw/sq4;-><init>(Lcom/daaw/br4;)V

    int-to-long v3, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/br4;->r:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method
