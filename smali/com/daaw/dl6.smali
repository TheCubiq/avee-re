.class public final Lcom/daaw/dl6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/fk6;

.field public final b:Lcom/daaw/bl6;

.field public final c:Lcom/daaw/bk6;

.field public final d:Ljava/util/ArrayDeque;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public e:Lcom/daaw/jl6;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public f:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/fk6;Lcom/daaw/bk6;Lcom/daaw/bl6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/dl6;->f:I

    iput-object p1, p0, Lcom/daaw/dl6;->a:Lcom/daaw/fk6;

    iput-object p2, p0, Lcom/daaw/dl6;->c:Lcom/daaw/bk6;

    iput-object p3, p0, Lcom/daaw/dl6;->b:Lcom/daaw/bl6;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/daaw/dl6;->d:Ljava/util/ArrayDeque;

    new-instance p1, Lcom/daaw/yk6;

    invoke-direct {p1, p0}, Lcom/daaw/yk6;-><init>(Lcom/daaw/dl6;)V

    invoke-virtual {p2, p1}, Lcom/daaw/bk6;->b(Lcom/daaw/yk6;)V

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/dl6;)Ljava/util/ArrayDeque;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dl6;->d:Ljava/util/ArrayDeque;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/dl6;Lcom/daaw/jl6;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/dl6;->e:Lcom/daaw/jl6;

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/dl6;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/dl6;->h()V

    return-void
.end method

.method public static bridge synthetic g(Lcom/daaw/dl6;)I
    .locals 0

    iget p0, p0, Lcom/daaw/dl6;->f:I

    return p0
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/daaw/cl6;)Lcom/daaw/f77;
    .locals 1

    monitor-enter p0

    const/4 v0, 0x2

    :try_start_0
    iput v0, p0, Lcom/daaw/dl6;->f:I

    invoke-virtual {p0}, Lcom/daaw/dl6;->i()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/dl6;->e:Lcom/daaw/jl6;

    invoke-virtual {v0, p1}, Lcom/daaw/jl6;->a(Lcom/daaw/cl6;)Lcom/daaw/f77;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized e(Lcom/daaw/cl6;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/dl6;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final synthetic f()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput v0, p0, Lcom/daaw/dl6;->f:I

    invoke-virtual {p0}, Lcom/daaw/dl6;->h()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final declared-synchronized h()V
    .locals 4

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/g93;->K5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/util/zzg;->zzh()Lcom/daaw/kz3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/kz3;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/dl6;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lcom/daaw/dl6;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_2
    iget-object v0, p0, Lcom/daaw/dl6;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/daaw/dl6;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cl6;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/daaw/cl6;->zza()Lcom/daaw/rk6;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/dl6;->a:Lcom/daaw/fk6;

    invoke-interface {v0}, Lcom/daaw/cl6;->zza()Lcom/daaw/rk6;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/daaw/fk6;->a(Lcom/daaw/rk6;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_3
    new-instance v1, Lcom/daaw/jl6;

    iget-object v2, p0, Lcom/daaw/dl6;->a:Lcom/daaw/fk6;

    iget-object v3, p0, Lcom/daaw/dl6;->b:Lcom/daaw/bl6;

    invoke-direct {v1, v2, v3, v0}, Lcom/daaw/jl6;-><init>(Lcom/daaw/fk6;Lcom/daaw/bl6;Lcom/daaw/cl6;)V

    iput-object v1, p0, Lcom/daaw/dl6;->e:Lcom/daaw/jl6;

    new-instance v2, Lcom/daaw/zk6;

    invoke-direct {v2, p0, v0}, Lcom/daaw/zk6;-><init>(Lcom/daaw/dl6;Lcom/daaw/cl6;)V

    invoke-virtual {v1, v2}, Lcom/daaw/jl6;->d(Lcom/daaw/o67;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    monitor-exit p0

    return-void

    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final declared-synchronized i()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/dl6;->e:Lcom/daaw/jl6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method
