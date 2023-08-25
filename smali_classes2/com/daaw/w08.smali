.class public final Lcom/daaw/w08;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic q:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/w08;->q:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/w08;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/w08;->p:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/w08;->p:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lcom/daaw/w08;->q:Lcom/daaw/p28;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/w08;->q:Lcom/daaw/p28;

    iget-object v3, v3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/xb5;->s()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/daaw/m75;->L:Lcom/daaw/j65;

    invoke-virtual {v2, v3, v4}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/daaw/w08;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/daaw/w08;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1
.end method
