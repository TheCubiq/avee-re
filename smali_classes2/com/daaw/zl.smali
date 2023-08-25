.class public Lcom/daaw/zl;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public b:Lcom/daaw/rj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zl;->b:Lcom/daaw/rj1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/zl;->c:Ljava/lang/Object;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lcom/daaw/zl;->d:Ljava/lang/ThreadLocal;

    iput-object p1, p0, Lcom/daaw/zl;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/daaw/zl$a;

    invoke-direct {v0, p0}, Lcom/daaw/zl$a;-><init>(Lcom/daaw/zl;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/zl;)Ljava/lang/ThreadLocal;
    .locals 0

    iget-object p0, p0, Lcom/daaw/zl;->d:Ljava/lang/ThreadLocal;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/zl;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not running on background worker thread as intended."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zl;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final d(Lcom/daaw/rj1;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/rj1<",
            "TT;>;)",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/zl;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/zl$d;

    invoke-direct {v1, p0}, Lcom/daaw/zl$d;-><init>(Lcom/daaw/zl;)V

    invoke-virtual {p1, v0, v1}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/daaw/zl;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final f(Ljava/util/concurrent/Callable;)Lcom/daaw/hl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lcom/daaw/hl<",
            "Ljava/lang/Void;",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/zl$c;

    invoke-direct {v0, p0, p1}, Lcom/daaw/zl$c;-><init>(Lcom/daaw/zl;Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method public g(Ljava/lang/Runnable;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/zl$b;

    invoke-direct {v0, p0, p1}, Lcom/daaw/zl$b;-><init>(Lcom/daaw/zl;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/daaw/zl;->h(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lcom/daaw/rj1<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/zl;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/zl;->b:Lcom/daaw/rj1;

    iget-object v2, p0, Lcom/daaw/zl;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, p1}, Lcom/daaw/zl;->f(Ljava/util/concurrent/Callable;)Lcom/daaw/hl;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/zl;->d(Lcom/daaw/rj1;)Lcom/daaw/rj1;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/zl;->b:Lcom/daaw/rj1;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "Lcom/daaw/rj1<",
            "TT;>;>;)",
            "Lcom/daaw/rj1<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/zl;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/zl;->b:Lcom/daaw/rj1;

    iget-object v2, p0, Lcom/daaw/zl;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, p1}, Lcom/daaw/zl;->f(Ljava/util/concurrent/Callable;)Lcom/daaw/hl;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/daaw/rj1;->i(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/zl;->d(Lcom/daaw/rj1;)Lcom/daaw/rj1;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/zl;->b:Lcom/daaw/rj1;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
