.class public final Lcom/daaw/ki5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/g77;

.field public final c:Lcom/daaw/vj5;

.field public final d:Lcom/daaw/qz7;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/g77;Lcom/daaw/vj5;Lcom/daaw/qz7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ki5;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/ki5;->b:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/ki5;->c:Lcom/daaw/vj5;

    iput-object p4, p0, Lcom/daaw/ki5;->d:Lcom/daaw/qz7;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/zzccb;ILcom/daaw/pk5;)Lcom/daaw/f77;
    .locals 0

    iget-object p3, p0, Lcom/daaw/ki5;->d:Lcom/daaw/qz7;

    invoke-interface {p3}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/cn5;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/cn5;->h3(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzccb;->s:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzy(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/pk5;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/pk5;-><init>(I)V

    invoke-static {v0}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ki5;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/hi5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/hi5;-><init>(Lcom/daaw/ki5;Lcom/google/android/gms/internal/ads/zzccb;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    const-class v1, Ljava/util/concurrent/ExecutionException;

    sget-object v2, Lcom/daaw/ii5;->a:Lcom/daaw/ii5;

    iget-object v3, p0, Lcom/daaw/ki5;->b:Lcom/daaw/g77;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    :goto_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    new-instance v2, Lcom/daaw/ji5;

    invoke-direct {v2, p0, p1, v1}, Lcom/daaw/ji5;-><init>(Lcom/daaw/ki5;Lcom/google/android/gms/internal/ads/zzccb;I)V

    const-class p1, Lcom/daaw/pk5;

    iget-object v1, p0, Lcom/daaw/ki5;->b:Lcom/daaw/g77;

    invoke-static {v0, p1, v2, v1}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/google/android/gms/internal/ads/zzccb;)Ljava/io/InputStream;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ki5;->c:Lcom/daaw/vj5;

    iget-object v1, v0, Lcom/daaw/xj5;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v2, v0, Lcom/daaw/xj5;->c:Z

    if-eqz v2, :cond_0

    iget-object p1, v0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    :goto_0
    monitor-exit v1

    goto :goto_1

    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/daaw/xj5;->c:Z

    iput-object p1, v0, Lcom/daaw/xj5;->e:Lcom/google/android/gms/internal/ads/zzccb;

    iget-object p1, v0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    invoke-virtual {p1}, Lcom/daaw/pa;->checkAvailabilityAndConnect()V

    iget-object p1, v0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v2, Lcom/daaw/uj5;

    invoke-direct {v2, v0}, Lcom/daaw/uj5;-><init>(Lcom/daaw/vj5;)V

    sget-object v3, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-virtual {p1, v2, v3}, Lcom/daaw/e14;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p1, v0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_1
    sget-object v0, Lcom/daaw/g93;->W4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/InputStream;

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method
