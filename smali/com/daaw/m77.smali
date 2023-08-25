.class public final Lcom/daaw/m77;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/util/concurrent/ExecutorService;)Lcom/daaw/g77;
    .locals 1

    instance-of v0, p0, Lcom/daaw/g77;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/g77;

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/daaw/l77;

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0}, Lcom/daaw/l77;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/i77;

    invoke-direct {v0, p0}, Lcom/daaw/i77;-><init>(Ljava/util/concurrent/ExecutorService;)V

    :goto_0
    move-object p0, v0

    :goto_1
    return-object p0
.end method

.method public static b()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lcom/daaw/g67;->p:Lcom/daaw/g67;

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lcom/daaw/c57;)Ljava/util/concurrent/Executor;
    .locals 1

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/daaw/g67;->p:Lcom/daaw/g67;

    if-ne p0, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lcom/daaw/h77;

    invoke-direct {v0, p0, p1}, Lcom/daaw/h77;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/c57;)V

    return-object v0
.end method
