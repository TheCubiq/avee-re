.class public final Lcom/daaw/yz8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/dw8;

.field public final synthetic q:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>(Lcom/daaw/dw8;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yz8;->p:Lcom/daaw/dw8;

    iput-object p2, p0, Lcom/daaw/yz8;->q:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/yz8;->p:Lcom/daaw/dw8;

    iget-object v1, p0, Lcom/daaw/yz8;->q:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/dw8;->r(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/yz8;->p:Lcom/daaw/dw8;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/daaw/dw8;->q(Ljava/lang/Exception;)V

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/yz8;->p:Lcom/daaw/dw8;

    invoke-virtual {v1, v0}, Lcom/daaw/dw8;->q(Ljava/lang/Exception;)V

    return-void
.end method
