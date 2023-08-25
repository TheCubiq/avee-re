.class public final Lcom/daaw/yq1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "awaitEvenIfOnMainThread task continuation executor"

    invoke-static {v0}, Lcom/daaw/cz;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/daaw/yq1;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/tj1;Lcom/daaw/rj1;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/yq1;->i(Lcom/daaw/tj1;Lcom/daaw/rj1;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/tj1;Lcom/daaw/rj1;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/yq1;->h(Lcom/daaw/tj1;Lcom/daaw/rj1;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/concurrent/CountDownLatch;Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/yq1;->g(Ljava/util/concurrent/CountDownLatch;Lcom/daaw/rj1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/rj1<",
            "TT;>;)TT;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sget-object v1, Lcom/daaw/yq1;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/daaw/xq1;

    invoke-direct {v2, v0}, Lcom/daaw/xq1;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {p0, v1, v2}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x4

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    invoke-virtual {p0}, Lcom/daaw/rj1;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/rj1;->l()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rj1;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Lcom/daaw/rj1;->j()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p0

    :cond_2
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Ljava/util/concurrent/CountDownLatch;JLjava/util/concurrent/TimeUnit;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-long/2addr v1, p1

    :goto_0
    :try_start_1
    sget-object p3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return p0

    :catch_0
    const/4 v0, 0x1

    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sub-long p1, v1, p1

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method public static f(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "Lcom/daaw/rj1<",
            "TT;>;>;)",
            "Lcom/daaw/rj1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    new-instance v1, Lcom/daaw/yq1$a;

    invoke-direct {v1, p1, v0}, Lcom/daaw/yq1$a;-><init>(Ljava/util/concurrent/Callable;Lcom/daaw/tj1;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/concurrent/CountDownLatch;Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic h(Lcom/daaw/tj1;Lcom/daaw/rj1;)Ljava/lang/Void;
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/rj1;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/rj1;->j()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {p0, p1}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic i(Lcom/daaw/tj1;Lcom/daaw/rj1;)Ljava/lang/Void;
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/rj1;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/rj1;->j()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {p0, p1}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static j(Lcom/daaw/rj1;Lcom/daaw/rj1;)Lcom/daaw/rj1;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TaskMainThread"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/rj1<",
            "TT;>;",
            "Lcom/daaw/rj1<",
            "TT;>;)",
            "Lcom/daaw/rj1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    new-instance v1, Lcom/daaw/wq1;

    invoke-direct {v1, v0}, Lcom/daaw/wq1;-><init>(Lcom/daaw/tj1;)V

    invoke-virtual {p0, v1}, Lcom/daaw/rj1;->f(Lcom/daaw/hl;)Lcom/daaw/rj1;

    invoke-virtual {p1, v1}, Lcom/daaw/rj1;->f(Lcom/daaw/hl;)Lcom/daaw/rj1;

    invoke-virtual {v0}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/util/concurrent/Executor;Lcom/daaw/rj1;Lcom/daaw/rj1;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/daaw/rj1<",
            "TT;>;",
            "Lcom/daaw/rj1<",
            "TT;>;)",
            "Lcom/daaw/rj1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    new-instance v1, Lcom/daaw/vq1;

    invoke-direct {v1, v0}, Lcom/daaw/vq1;-><init>(Lcom/daaw/tj1;)V

    invoke-virtual {p1, p0, v1}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    invoke-virtual {p2, p0, v1}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    invoke-virtual {v0}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object p0

    return-object p0
.end method
