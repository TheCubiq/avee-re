.class public abstract Lcom/daaw/e67;
.super Lcom/daaw/e77;
.source ""


# instance fields
.field public final r:Ljava/util/concurrent/Executor;

.field public final synthetic s:Lcom/daaw/f67;


# direct methods
.method public constructor <init>(Lcom/daaw/f67;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/e67;->s:Lcom/daaw/f67;

    invoke-direct {p0}, Lcom/daaw/e77;-><init>()V

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/e67;->r:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/e67;->s:Lcom/daaw/f67;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/f67;->W(Lcom/daaw/f67;Lcom/daaw/e67;)V

    instance-of v0, p1, Ljava/util/concurrent/ExecutionException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/e67;->s:Lcom/daaw/f67;

    check-cast p1, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/c57;->i(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/daaw/e67;->s:Lcom/daaw/f67;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/c57;->cancel(Z)Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/e67;->s:Lcom/daaw/f67;

    invoke-virtual {v0, p1}, Lcom/daaw/c57;->i(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/e67;->s:Lcom/daaw/f67;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/f67;->W(Lcom/daaw/f67;Lcom/daaw/e67;)V

    invoke-virtual {p0, p1}, Lcom/daaw/e67;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/e67;->s:Lcom/daaw/f67;

    invoke-virtual {v0}, Lcom/daaw/c57;->isDone()Z

    move-result v0

    return v0
.end method

.method public abstract h(Ljava/lang/Object;)V
.end method

.method public final i()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/e67;->r:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/e67;->s:Lcom/daaw/f67;

    invoke-virtual {v1, v0}, Lcom/daaw/c57;->i(Ljava/lang/Throwable;)Z

    return-void
.end method
