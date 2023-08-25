.class public final Lcom/daaw/fk8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/rj1;

.field public final synthetic q:Lcom/daaw/im8;


# direct methods
.method public constructor <init>(Lcom/daaw/im8;Lcom/daaw/rj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    iput-object p2, p0, Lcom/daaw/fk8;->p:Lcom/daaw/rj1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    invoke-static {v0}, Lcom/daaw/im8;->d(Lcom/daaw/im8;)Lcom/daaw/ai1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/fk8;->p:Lcom/daaw/rj1;

    invoke-virtual {v1}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/ai1;->a(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object v0
    :try_end_0
    .catch Lcom/daaw/n61; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/im8;->c(Ljava/lang/Exception;)V

    return-void

    :cond_0
    sget-object v1, Lcom/daaw/yj1;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rj1;->e(Ljava/util/concurrent/Executor;Lcom/daaw/ku0;)Lcom/daaw/rj1;

    iget-object v2, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rj1;->d(Ljava/util/concurrent/Executor;Lcom/daaw/gu0;)Lcom/daaw/rj1;

    iget-object v2, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rj1;->a(Ljava/util/concurrent/Executor;Lcom/daaw/zt0;)Lcom/daaw/rj1;

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    invoke-virtual {v1, v0}, Lcom/daaw/im8;->c(Ljava/lang/Exception;)V

    return-void

    :catch_1
    iget-object v0, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    invoke-virtual {v0}, Lcom/daaw/im8;->b()V

    return-void

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lcom/daaw/im8;->c(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/daaw/fk8;->q:Lcom/daaw/im8;

    invoke-virtual {v1, v0}, Lcom/daaw/im8;->c(Ljava/lang/Exception;)V

    return-void
.end method
