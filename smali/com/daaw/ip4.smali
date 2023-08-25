.class public final Lcom/daaw/ip4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lq4;
.implements Lcom/daaw/cy4;
.implements Lcom/daaw/sv4;
.implements Lcom/daaw/er4;
.implements Lcom/daaw/q03;


# instance fields
.field public final p:Lcom/daaw/gr4;

.field public final q:Lcom/daaw/th6;

.field public final r:Ljava/util/concurrent/ScheduledExecutorService;

.field public final s:Ljava/util/concurrent/Executor;

.field public final t:Lcom/daaw/o77;

.field public u:Ljava/util/concurrent/ScheduledFuture;

.field public final v:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/daaw/gr4;Lcom/daaw/th6;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/daaw/o77;->D()Lcom/daaw/o77;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ip4;->t:Lcom/daaw/o77;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/daaw/ip4;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/daaw/ip4;->p:Lcom/daaw/gr4;

    iput-object p2, p0, Lcom/daaw/ip4;->q:Lcom/daaw/th6;

    iput-object p3, p0, Lcom/daaw/ip4;->r:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Lcom/daaw/ip4;->s:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/ip4;)Lcom/daaw/gr4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ip4;->p:Lcom/daaw/gr4;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized A(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/daaw/ip4;->t:Lcom/daaw/o77;

    invoke-virtual {p1}, Lcom/daaw/c57;->isDone()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object p1, p0, Lcom/daaw/ip4;->u:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_1
    iget-object p1, p0, Lcom/daaw/ip4;->t:Lcom/daaw/o77;

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1, v0}, Lcom/daaw/o77;->i(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final T()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final synthetic e()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ip4;->t:Lcom/daaw/o77;

    invoke-virtual {v0}, Lcom/daaw/c57;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ip4;->t:Lcom/daaw/o77;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/o77;->h(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e0(Lcom/daaw/p03;)V
    .locals 2

    sget-object v0, Lcom/daaw/g93;->t9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ip4;->q:Lcom/daaw/th6;

    iget v0, v0, Lcom/daaw/th6;->Z:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p1, p1, Lcom/daaw/p03;->j:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ip4;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Full screen 1px impression occurred"

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/ip4;->p:Lcom/daaw/gr4;

    invoke-virtual {p1}, Lcom/daaw/gr4;->zza()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final m(Lcom/daaw/cv3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzd()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized zze()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ip4;->t:Lcom/daaw/o77;

    invoke-virtual {v0}, Lcom/daaw/c57;->isDone()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/ip4;->u:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_1
    iget-object v0, p0, Lcom/daaw/ip4;->t:Lcom/daaw/o77;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/o77;->h(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzf()V
    .locals 5

    sget-object v0, Lcom/daaw/g93;->p1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ip4;->q:Lcom/daaw/th6;

    iget v1, v0, Lcom/daaw/th6;->Z:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iget v0, v0, Lcom/daaw/th6;->r:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ip4;->p:Lcom/daaw/gr4;

    invoke-virtual {v0}, Lcom/daaw/gr4;->zza()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ip4;->t:Lcom/daaw/o77;

    new-instance v1, Lcom/daaw/hp4;

    invoke-direct {v1, p0}, Lcom/daaw/hp4;-><init>(Lcom/daaw/ip4;)V

    iget-object v2, p0, Lcom/daaw/ip4;->s:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lcom/daaw/ip4;->r:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/daaw/gp4;

    invoke-direct {v1, p0}, Lcom/daaw/gp4;-><init>(Lcom/daaw/ip4;)V

    iget-object v2, p0, Lcom/daaw/ip4;->q:Lcom/daaw/th6;

    iget v2, v2, Lcom/daaw/th6;->r:I

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ip4;->u:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    return-void
.end method

.method public final zzg()V
    .locals 0

    return-void
.end method

.method public final zzj()V
    .locals 0

    return-void
.end method

.method public final zzm()V
    .locals 0

    return-void
.end method

.method public final zzo()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ip4;->q:Lcom/daaw/th6;

    iget v0, v0, Lcom/daaw/th6;->Z:I

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    :cond_0
    sget-object v0, Lcom/daaw/g93;->t9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ip4;->p:Lcom/daaw/gr4;

    invoke-virtual {v0}, Lcom/daaw/gr4;->zza()V

    :cond_1
    return-void
.end method
