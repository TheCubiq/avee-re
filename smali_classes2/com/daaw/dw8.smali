.class public final Lcom/daaw/dw8;
.super Lcom/daaw/rj1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/rj1<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lcom/daaw/sp8;

.field public c:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field public volatile d:Z

.field public e:Ljava/lang/Object;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field public f:Ljava/lang/Exception;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/rj1;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    new-instance v0, Lcom/daaw/sp8;

    invoke-direct {v0}, Lcom/daaw/sp8;-><init>()V

    iput-object v0, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;Lcom/daaw/zt0;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/daaw/zt0;",
            ")",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    new-instance v1, Lcom/daaw/ru7;

    invoke-direct {v1, p1, p2}, Lcom/daaw/ru7;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/zt0;)V

    invoke-virtual {v0, v1}, Lcom/daaw/sp8;->a(Lcom/daaw/qo8;)V

    invoke-virtual {p0}, Lcom/daaw/dw8;->y()V

    return-object p0
.end method

.method public final b(Lcom/daaw/cu0;)Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/cu0<",
            "TTResult;>;)",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/yj1;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    new-instance v2, Lcom/daaw/k68;

    invoke-direct {v2, v0, p1}, Lcom/daaw/k68;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/cu0;)V

    invoke-virtual {v1, v2}, Lcom/daaw/sp8;->a(Lcom/daaw/qo8;)V

    invoke-virtual {p0}, Lcom/daaw/dw8;->y()V

    return-object p0
.end method

.method public final c(Ljava/util/concurrent/Executor;Lcom/daaw/cu0;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/daaw/cu0<",
            "TTResult;>;)",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    new-instance v1, Lcom/daaw/k68;

    invoke-direct {v1, p1, p2}, Lcom/daaw/k68;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/cu0;)V

    invoke-virtual {v0, v1}, Lcom/daaw/sp8;->a(Lcom/daaw/qo8;)V

    invoke-virtual {p0}, Lcom/daaw/dw8;->y()V

    return-object p0
.end method

.method public final d(Ljava/util/concurrent/Executor;Lcom/daaw/gu0;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/daaw/gu0;",
            ")",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    new-instance v1, Lcom/daaw/xc8;

    invoke-direct {v1, p1, p2}, Lcom/daaw/xc8;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/gu0;)V

    invoke-virtual {v0, v1}, Lcom/daaw/sp8;->a(Lcom/daaw/qo8;)V

    invoke-virtual {p0}, Lcom/daaw/dw8;->y()V

    return-object p0
.end method

.method public final e(Ljava/util/concurrent/Executor;Lcom/daaw/ku0;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/daaw/ku0<",
            "-TTResult;>;)",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    new-instance v1, Lcom/daaw/nh8;

    invoke-direct {v1, p1, p2}, Lcom/daaw/nh8;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/ku0;)V

    invoke-virtual {v0, v1}, Lcom/daaw/sp8;->a(Lcom/daaw/qo8;)V

    invoke-virtual {p0}, Lcom/daaw/dw8;->y()V

    return-object p0
.end method

.method public final f(Lcom/daaw/hl;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/hl<",
            "TTResult;TTContinuationResult;>;)",
            "Lcom/daaw/rj1<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/yj1;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/daaw/hl<",
            "TTResult;TTContinuationResult;>;)",
            "Lcom/daaw/rj1<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/dw8;

    invoke-direct {v0}, Lcom/daaw/dw8;-><init>()V

    iget-object v1, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    new-instance v2, Lcom/daaw/wk4;

    invoke-direct {v2, p1, p2, v0}, Lcom/daaw/wk4;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/hl;Lcom/daaw/dw8;)V

    invoke-virtual {v1, v2}, Lcom/daaw/sp8;->a(Lcom/daaw/qo8;)V

    invoke-virtual {p0}, Lcom/daaw/dw8;->y()V

    return-object v0
.end method

.method public final h(Lcom/daaw/hl;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/hl<",
            "TTResult;",
            "Lcom/daaw/rj1<",
            "TTContinuationResult;>;>;)",
            "Lcom/daaw/rj1<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/yj1;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/rj1;->i(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/daaw/hl<",
            "TTResult;",
            "Lcom/daaw/rj1<",
            "TTContinuationResult;>;>;)",
            "Lcom/daaw/rj1<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/dw8;

    invoke-direct {v0}, Lcom/daaw/dw8;-><init>()V

    iget-object v1, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    new-instance v2, Lcom/daaw/d86;

    invoke-direct {v2, p1, p2, v0}, Lcom/daaw/d86;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/hl;Lcom/daaw/dw8;)V

    invoke-virtual {v1, v2}, Lcom/daaw/sp8;->a(Lcom/daaw/qo8;)V

    invoke-virtual {p0}, Lcom/daaw/dw8;->y()V

    return-object v0
.end method

.method public final j()Ljava/lang/Exception;
    .locals 2

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/dw8;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final k()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/dw8;->v()V

    invoke-virtual {p0}, Lcom/daaw/dw8;->w()V

    iget-object v1, p0, Lcom/daaw/dw8;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/dw8;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v2, Lcom/daaw/n61;

    invoke-direct {v2, v1}, Lcom/daaw/n61;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/dw8;->d:Z

    return v0
.end method

.method public final m()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final n()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/daaw/dw8;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/dw8;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final o(Lcom/daaw/ai1;)Lcom/daaw/rj1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/ai1<",
            "TTResult;TTContinuationResult;>;)",
            "Lcom/daaw/rj1<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/yj1;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/dw8;

    invoke-direct {v1}, Lcom/daaw/dw8;-><init>()V

    iget-object v2, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    new-instance v3, Lcom/daaw/im8;

    invoke-direct {v3, v0, p1, v1}, Lcom/daaw/im8;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/ai1;Lcom/daaw/dw8;)V

    invoke-virtual {v2, v3}, Lcom/daaw/sp8;->a(Lcom/daaw/qo8;)V

    invoke-virtual {p0}, Lcom/daaw/dw8;->y()V

    return-object v1
.end method

.method public final p(Ljava/util/concurrent/Executor;Lcom/daaw/ai1;)Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/daaw/ai1<",
            "TTResult;TTContinuationResult;>;)",
            "Lcom/daaw/rj1<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/dw8;

    invoke-direct {v0}, Lcom/daaw/dw8;-><init>()V

    iget-object v1, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    new-instance v2, Lcom/daaw/im8;

    invoke-direct {v2, p1, p2, v0}, Lcom/daaw/im8;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/ai1;Lcom/daaw/dw8;)V

    invoke-virtual {v1, v2}, Lcom/daaw/sp8;->a(Lcom/daaw/qo8;)V

    invoke-virtual {p0}, Lcom/daaw/dw8;->y()V

    return-object v0
.end method

.method public final q(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/dw8;->x()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    iput-object p1, p0, Lcom/daaw/dw8;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    invoke-virtual {p1, p0}, Lcom/daaw/sp8;->b(Lcom/daaw/rj1;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/dw8;->x()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    iput-object p1, p0, Lcom/daaw/dw8;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    invoke-virtual {p1, p0}, Lcom/daaw/sp8;->b(Lcom/daaw/rj1;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final s()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    iput-boolean v1, p0, Lcom/daaw/dw8;->d:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    invoke-virtual {v0, p0}, Lcom/daaw/sp8;->b(Lcom/daaw/rj1;)V

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final t(Ljava/lang/Exception;)Z
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    iput-object p1, p0, Lcom/daaw/dw8;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    invoke-virtual {p1, p0}, Lcom/daaw/sp8;->b(Lcom/daaw/rj1;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final u(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    iput-object p1, p0, Lcom/daaw/dw8;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    invoke-virtual {p1, p0}, Lcom/daaw/sp8;->b(Lcom/daaw/rj1;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final v()V
    .locals 2
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/dw8;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Lcom/daaw/ry0;->n(ZLjava/lang/Object;)V

    return-void
.end method

.method public final w()V
    .locals 2
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/dw8;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task is already canceled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final x()V
    .locals 1
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/dw8;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/daaw/fv;->a(Lcom/daaw/rj1;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public final y()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dw8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/dw8;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/dw8;->b:Lcom/daaw/sp8;

    invoke-virtual {v0, p0}, Lcom/daaw/sp8;->b(Lcom/daaw/rj1;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
