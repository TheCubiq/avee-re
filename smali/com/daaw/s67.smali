.class public final Lcom/daaw/s67;
.super Lcom/daaw/u67;
.source ""


# direct methods
.method public static a(Ljava/lang/Iterable;)Lcom/daaw/r67;
    .locals 3

    new-instance v0, Lcom/daaw/r67;

    invoke-static {p0}, Lcom/daaw/y17;->r(Ljava/lang/Iterable;)Lcom/daaw/y17;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/daaw/r67;-><init>(ZLcom/daaw/y17;Lcom/daaw/q67;)V

    return-object v0
.end method

.method public static varargs b([Lcom/daaw/f77;)Lcom/daaw/r67;
    .locals 3
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lcom/daaw/r67;

    invoke-static {p0}, Lcom/daaw/y17;->t([Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/daaw/r67;-><init>(ZLcom/daaw/y17;Lcom/daaw/q67;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Iterable;)Lcom/daaw/r67;
    .locals 3

    new-instance v0, Lcom/daaw/r67;

    invoke-static {p0}, Lcom/daaw/y17;->r(Ljava/lang/Iterable;)Lcom/daaw/y17;

    move-result-object p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/daaw/r67;-><init>(ZLcom/daaw/y17;Lcom/daaw/q67;)V

    return-object v0
.end method

.method public static varargs d([Lcom/daaw/f77;)Lcom/daaw/r67;
    .locals 3
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lcom/daaw/r67;

    invoke-static {p0}, Lcom/daaw/y17;->t([Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/daaw/r67;-><init>(ZLcom/daaw/y17;Lcom/daaw/q67;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Iterable;)Lcom/daaw/f77;
    .locals 2

    new-instance v0, Lcom/daaw/x57;

    invoke-static {p0}, Lcom/daaw/y17;->r(Ljava/lang/Iterable;)Lcom/daaw/y17;

    move-result-object p0

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/daaw/x57;-><init>(Lcom/daaw/t17;Z)V

    return-object v0
.end method

.method public static f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;
    .locals 1

    new-instance v0, Lcom/daaw/o47;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/o47;-><init>(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;)V

    invoke-static {p3, v0}, Lcom/daaw/m77;->c(Ljava/util/concurrent/Executor;Lcom/daaw/c57;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;
    .locals 1

    new-instance v0, Lcom/daaw/n47;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/n47;-><init>(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;)V

    invoke-static {p3, v0}, Lcom/daaw/m77;->c(Ljava/util/concurrent/Executor;Lcom/daaw/c57;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static h(Ljava/lang/Throwable;)Lcom/daaw/f77;
    .locals 1

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/v67;

    invoke-direct {v0, p0}, Lcom/daaw/v67;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static i(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 1

    if-nez p0, :cond_0

    sget-object p0, Lcom/daaw/w67;->q:Lcom/daaw/f77;

    return-object p0

    :cond_0
    new-instance v0, Lcom/daaw/w67;

    invoke-direct {v0, p0}, Lcom/daaw/w67;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static j()Lcom/daaw/f77;
    .locals 1

    sget-object v0, Lcom/daaw/w67;->q:Lcom/daaw/f77;

    return-object v0
.end method

.method public static k(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;
    .locals 1

    new-instance v0, Lcom/daaw/v77;

    invoke-direct {v0, p0}, Lcom/daaw/v77;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static l(Lcom/daaw/v57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;
    .locals 1

    new-instance v0, Lcom/daaw/v77;

    invoke-direct {v0, p0}, Lcom/daaw/v77;-><init>(Lcom/daaw/v57;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;
    .locals 1

    sget v0, Lcom/daaw/l57;->y:I

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/k57;

    invoke-direct {v0, p0, p1}, Lcom/daaw/k57;-><init>(Lcom/daaw/f77;Lcom/daaw/ey6;)V

    invoke-static {p2, v0}, Lcom/daaw/m77;->c(Ljava/util/concurrent/Executor;Lcom/daaw/c57;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;
    .locals 1

    sget v0, Lcom/daaw/l57;->y:I

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/j57;

    invoke-direct {v0, p0, p1}, Lcom/daaw/j57;-><init>(Lcom/daaw/f77;Lcom/daaw/w57;)V

    invoke-static {p2, v0}, Lcom/daaw/m77;->c(Ljava/util/concurrent/Executor;Lcom/daaw/c57;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;
    .locals 1

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/daaw/s77;->F(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/daaw/x77;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Future was expected to be done: %s"

    invoke-static {p0, v1}, Lcom/daaw/hz6;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static q(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lcom/daaw/x77;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/Error;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/h67;

    check-cast p0, Ljava/lang/Error;

    invoke-direct {v0, p0}, Lcom/daaw/h67;-><init>(Ljava/lang/Error;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/daaw/w77;

    invoke-direct {v0, p0}, Lcom/daaw/w77;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/p67;

    invoke-direct {v0, p0, p1}, Lcom/daaw/p67;-><init>(Ljava/util/concurrent/Future;Lcom/daaw/o67;)V

    invoke-interface {p0, v0, p2}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
