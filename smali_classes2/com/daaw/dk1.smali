.class public final Lcom/daaw/dk1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/rj1<",
            "TTResult;>;)TTResult;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/ry0;->h()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/daaw/rj1;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/daaw/dk1;->h(Lcom/daaw/rj1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/daaw/f72;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/f72;-><init>(Lcom/daaw/i62;)V

    invoke-static {p0, v0}, Lcom/daaw/dk1;->i(Lcom/daaw/rj1;Lcom/daaw/c82;)V

    invoke-virtual {v0}, Lcom/daaw/f72;->a()V

    invoke-static {p0}, Lcom/daaw/dk1;->h(Lcom/daaw/rj1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/daaw/rj1;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/rj1<",
            "TTResult;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TTResult;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/ry0;->h()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TimeUnit must not be null"

    invoke-static {p3, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/daaw/rj1;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/daaw/dk1;->h(Lcom/daaw/rj1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/daaw/f72;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/f72;-><init>(Lcom/daaw/i62;)V

    invoke-static {p0, v0}, Lcom/daaw/dk1;->i(Lcom/daaw/rj1;Lcom/daaw/c82;)V

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/f72;->d(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lcom/daaw/dk1;->h(Lcom/daaw/rj1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    const-string p1, "Timed out waiting for Task"

    invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;)",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "Executor must not be null"

    invoke-static {p0, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Callback must not be null"

    invoke-static {p1, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/dw8;

    invoke-direct {v0}, Lcom/daaw/dw8;-><init>()V

    new-instance v1, Lcom/daaw/yz8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/yz8;-><init>(Lcom/daaw/dw8;Ljava/util/concurrent/Callable;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static d(Ljava/lang/Exception;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/dw8;

    invoke-direct {v0}, Lcom/daaw/dw8;-><init>()V

    invoke-virtual {v0, p0}, Lcom/daaw/dw8;->q(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Object;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(TTResult;)",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/dw8;

    invoke-direct {v0}, Lcom/daaw/dw8;-><init>()V

    invoke-virtual {v0, p0}, Lcom/daaw/dw8;->r(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static f(Ljava/util/Collection;)Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/daaw/rj1<",
            "*>;>;)",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rj1;

    const-string v2, "null tasks are not accepted"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/dw8;

    invoke-direct {v0}, Lcom/daaw/dw8;-><init>()V

    new-instance v1, Lcom/daaw/j92;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2, v0}, Lcom/daaw/j92;-><init>(ILcom/daaw/dw8;)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/rj1;

    invoke-static {v2, v1}, Lcom/daaw/dk1;->i(Lcom/daaw/rj1;Lcom/daaw/c82;)V

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    const/4 p0, 0x0

    invoke-static {p0}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p0

    return-object p0
.end method

.method public static varargs g([Lcom/daaw/rj1;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/rj1<",
            "*>;)",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/dk1;->f(Ljava/util/Collection;)Lcom/daaw/rj1;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    invoke-static {p0}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rj1;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/rj1;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Lcom/daaw/rj1;->j()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static i(Lcom/daaw/rj1;Lcom/daaw/c82;)V
    .locals 1

    sget-object v0, Lcom/daaw/yj1;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/rj1;->e(Ljava/util/concurrent/Executor;Lcom/daaw/ku0;)Lcom/daaw/rj1;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/rj1;->d(Ljava/util/concurrent/Executor;Lcom/daaw/gu0;)Lcom/daaw/rj1;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/rj1;->a(Ljava/util/concurrent/Executor;Lcom/daaw/zt0;)Lcom/daaw/rj1;

    return-void
.end method
