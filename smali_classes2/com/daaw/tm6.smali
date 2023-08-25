.class public final Lcom/daaw/tm6;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public final p:Ljava/lang/Object;

.field public final q:Ljava/util/concurrent/BlockingQueue;

.field public r:Z

.field public final synthetic s:Lcom/daaw/vn6;


# direct methods
.method public constructor <init>(Lcom/daaw/vn6;Ljava/lang/String;Ljava/util/concurrent/BlockingQueue;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tm6;->s:Lcom/daaw/vn6;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/tm6;->r:Z

    invoke-static {p2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tm6;->p:Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/tm6;->q:Ljava/util/concurrent/BlockingQueue;

    invoke-virtual {p0, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tm6;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/tm6;->p:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/tm6;->s:Lcom/daaw/vn6;

    invoke-static {v0}, Lcom/daaw/vn6;->p(Lcom/daaw/vn6;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/tm6;->r:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/tm6;->s:Lcom/daaw/vn6;

    invoke-static {v1}, Lcom/daaw/vn6;->u(Lcom/daaw/vn6;)Ljava/util/concurrent/Semaphore;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->release()V

    iget-object v1, p0, Lcom/daaw/tm6;->s:Lcom/daaw/vn6;

    invoke-static {v1}, Lcom/daaw/vn6;->p(Lcom/daaw/vn6;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    iget-object v1, p0, Lcom/daaw/tm6;->s:Lcom/daaw/vn6;

    invoke-static {v1}, Lcom/daaw/vn6;->o(Lcom/daaw/vn6;)Lcom/daaw/tm6;

    move-result-object v2

    const/4 v3, 0x0

    if-ne p0, v2, :cond_0

    invoke-static {v1, v3}, Lcom/daaw/vn6;->x(Lcom/daaw/vn6;Lcom/daaw/tm6;)V

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/daaw/vn6;->n(Lcom/daaw/vn6;)Lcom/daaw/tm6;

    move-result-object v2

    if-ne p0, v2, :cond_1

    invoke-static {v1, v3}, Lcom/daaw/vn6;->w(Lcom/daaw/vn6;Lcom/daaw/tm6;)V

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v1

    const-string v2, "Current scheduler thread is neither worker nor network"

    invoke-virtual {v1, v2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/tm6;->r:Z

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final c(Ljava/lang/InterruptedException;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/tm6;->s:Lcom/daaw/vn6;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " was interrupted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final run()V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/tm6;->s:Lcom/daaw/vn6;

    invoke-static {v2}, Lcom/daaw/vn6;->u(Lcom/daaw/vn6;)Ljava/util/concurrent/Semaphore;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-virtual {p0, v2}, Lcom/daaw/tm6;->c(Ljava/lang/InterruptedException;)V

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v1

    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v1

    :goto_1
    iget-object v2, p0, Lcom/daaw/tm6;->q:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ql6;

    if-eqz v2, :cond_2

    iget-boolean v3, v2, Lcom/daaw/ql6;->q:Z

    if-eq v0, v3, :cond_1

    const/16 v3, 0xa

    goto :goto_2

    :cond_1
    move v3, v1

    :goto_2
    invoke-static {v3}, Landroid/os/Process;->setThreadPriority(I)V

    invoke-virtual {v2}, Ljava/util/concurrent/FutureTask;->run()V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/daaw/tm6;->p:Ljava/lang/Object;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object v3, p0, Lcom/daaw/tm6;->q:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v3}, Ljava/util/concurrent/BlockingQueue;->peek()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/daaw/tm6;->s:Lcom/daaw/vn6;

    invoke-static {v3}, Lcom/daaw/vn6;->B(Lcom/daaw/vn6;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v3, p0, Lcom/daaw/tm6;->p:Ljava/lang/Object;

    const-wide/16 v4, 0x7530

    invoke-virtual {v3, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catch_1
    move-exception v3

    :try_start_4
    invoke-virtual {p0, v3}, Lcom/daaw/tm6;->c(Ljava/lang/InterruptedException;)V

    :cond_3
    :goto_3
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-object v2, p0, Lcom/daaw/tm6;->s:Lcom/daaw/vn6;

    invoke-static {v2}, Lcom/daaw/vn6;->p(Lcom/daaw/vn6;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    iget-object v3, p0, Lcom/daaw/tm6;->q:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v3}, Ljava/util/concurrent/BlockingQueue;->peek()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-virtual {p0}, Lcom/daaw/tm6;->b()V

    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {p0}, Lcom/daaw/tm6;->b()V

    return-void

    :cond_4
    :try_start_7
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_1
    move-exception v0

    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v0

    invoke-virtual {p0}, Lcom/daaw/tm6;->b()V

    goto :goto_5

    :goto_4
    throw v0

    :goto_5
    goto :goto_4
.end method
