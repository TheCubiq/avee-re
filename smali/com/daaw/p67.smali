.class public final Lcom/daaw/p67;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Ljava/util/concurrent/Future;

.field public final q:Lcom/daaw/o67;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Future;Lcom/daaw/o67;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p67;->p:Ljava/util/concurrent/Future;

    iput-object p2, p0, Lcom/daaw/p67;->q:Lcom/daaw/o67;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/p67;->p:Ljava/util/concurrent/Future;

    instance-of v1, v0, Lcom/daaw/y77;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/y77;

    invoke-static {v0}, Lcom/daaw/z77;->a(Lcom/daaw/y77;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/p67;->q:Lcom/daaw/o67;

    invoke-interface {v1, v0}, Lcom/daaw/o67;->b(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/daaw/p67;->p:Ljava/util/concurrent/Future;

    invoke-static {v0}, Lcom/daaw/s67;->p(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lcom/daaw/p67;->q:Lcom/daaw/o67;

    invoke-interface {v1, v0}, Lcom/daaw/o67;->a(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    iget-object v1, p0, Lcom/daaw/p67;->q:Lcom/daaw/o67;

    invoke-interface {v1, v0}, Lcom/daaw/o67;->b(Ljava/lang/Throwable;)V

    return-void

    :catch_2
    move-exception v0

    iget-object v1, p0, Lcom/daaw/p67;->q:Lcom/daaw/o67;

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/daaw/o67;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lcom/daaw/jy6;->a(Ljava/lang/Object;)Lcom/daaw/iy6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/p67;->q:Lcom/daaw/o67;

    invoke-virtual {v0, v1}, Lcom/daaw/iy6;->a(Ljava/lang/Object;)Lcom/daaw/iy6;

    invoke-virtual {v0}, Lcom/daaw/iy6;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
