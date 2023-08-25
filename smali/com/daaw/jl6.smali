.class public final Lcom/daaw/jl6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/cl6;

.field public final b:Lcom/daaw/f77;

.field public c:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public d:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/fk6;Lcom/daaw/bl6;Lcom/daaw/cl6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/jl6;->c:Z

    iput-boolean v0, p0, Lcom/daaw/jl6;->d:Z

    iput-object p3, p0, Lcom/daaw/jl6;->a:Lcom/daaw/cl6;

    invoke-interface {p2, p3}, Lcom/daaw/bl6;->a(Lcom/daaw/cl6;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/hl6;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/daaw/hl6;-><init>(Lcom/daaw/jl6;Lcom/daaw/bl6;Lcom/daaw/fk6;Lcom/daaw/cl6;)V

    invoke-interface {p3}, Lcom/daaw/cl6;->zzb()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    new-instance v0, Lcom/daaw/il6;

    invoke-direct {v0, p0, p2}, Lcom/daaw/il6;-><init>(Lcom/daaw/jl6;Lcom/daaw/bl6;)V

    const-class p2, Ljava/lang/Exception;

    invoke-interface {p3}, Lcom/daaw/cl6;->zzb()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-static {p1, p2, v0, p3}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/jl6;->b:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/daaw/cl6;)Lcom/daaw/f77;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/jl6;->d:Z

    const/4 v1, 0x0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/daaw/jl6;->c:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/jl6;->a:Lcom/daaw/cl6;

    invoke-interface {v0}, Lcom/daaw/cl6;->zza()Lcom/daaw/rk6;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/daaw/cl6;->zza()Lcom/daaw/rk6;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/jl6;->a:Lcom/daaw/cl6;

    invoke-interface {v0}, Lcom/daaw/cl6;->zza()Lcom/daaw/rk6;

    move-result-object v0

    invoke-interface {p1}, Lcom/daaw/cl6;->zza()Lcom/daaw/rk6;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/jl6;->c:Z

    iget-object p1, p0, Lcom/daaw/jl6;->b:Lcom/daaw/f77;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_2
    :goto_0
    monitor-exit p0

    return-object v1

    :cond_3
    :goto_1
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final synthetic b(Lcom/daaw/bl6;Lcom/daaw/fk6;Lcom/daaw/cl6;Lcom/daaw/qk6;)Lcom/daaw/f77;
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/daaw/jl6;->d:Z

    invoke-interface {p1, p4}, Lcom/daaw/bl6;->b(Lcom/daaw/qk6;)V

    iget-boolean p1, p0, Lcom/daaw/jl6;->c:Z

    if-nez p1, :cond_0

    invoke-interface {p3}, Lcom/daaw/cl6;->zza()Lcom/daaw/rk6;

    move-result-object p1

    invoke-interface {p2, p1, p4}, Lcom/daaw/fk6;->d(Lcom/daaw/rk6;Lcom/daaw/qk6;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :cond_0
    new-instance p1, Lcom/daaw/al6;

    invoke-direct {p1, p4, p3}, Lcom/daaw/al6;-><init>(Lcom/daaw/qk6;Lcom/daaw/cl6;)V

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic c(Lcom/daaw/bl6;Ljava/lang/Exception;)Lcom/daaw/f77;
    .locals 0

    monitor-enter p0

    const/4 p1, 0x1

    :try_start_0
    iput-boolean p1, p0, Lcom/daaw/jl6;->d:Z

    throw p2

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized d(Lcom/daaw/o67;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/jl6;->b:Lcom/daaw/f77;

    sget-object v1, Lcom/daaw/gl6;->a:Lcom/daaw/gl6;

    iget-object v2, p0, Lcom/daaw/jl6;->a:Lcom/daaw/cl6;

    invoke-interface {v2}, Lcom/daaw/cl6;->zzb()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/jl6;->a:Lcom/daaw/cl6;

    invoke-interface {v1}, Lcom/daaw/cl6;->zzb()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
