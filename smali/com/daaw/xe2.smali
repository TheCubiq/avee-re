.class public final Lcom/daaw/xe2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/qf2;

.field public final synthetic q:Lcom/daaw/ye2;


# direct methods
.method public constructor <init>(Lcom/daaw/ye2;Lcom/daaw/qf2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xe2;->q:Lcom/daaw/ye2;

    iput-object p2, p0, Lcom/daaw/xe2;->p:Lcom/daaw/qf2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/xe2;->q:Lcom/daaw/ye2;

    invoke-static {v0}, Lcom/daaw/ye2;->a(Lcom/daaw/ye2;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xe2;->p:Lcom/daaw/qf2;

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
