.class public abstract Lcom/daaw/zy;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Ljava/util/concurrent/Executor;
    .locals 2

    new-instance v0, Lcom/daaw/x71;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/x71;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
