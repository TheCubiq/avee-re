.class public Lcom/daaw/l7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/l7$a;
    }
.end annotation


# instance fields
.field public p:Lcom/daaw/k7;

.field public volatile q:Lcom/daaw/l7$a;

.field public r:Ljava/lang/Object;

.field public s:Z

.field public t:Z

.field public u:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Lcom/daaw/k7;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/l7;->r:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/daaw/l7;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lcom/daaw/l7;->p:Lcom/daaw/k7;

    iget-object p1, p0, Lcom/daaw/l7;->r:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/l7;->t:Z

    if-eqz v0, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/l7;->t:Z

    new-instance v0, Ljava/lang/Thread;

    const-string v1, "AudioTextureMovieEncoder2B"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :catch_0
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/l7;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/daaw/l7;->r:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_2
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public static synthetic a(Lcom/daaw/l7;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/l7;->f()V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/l7;Lcom/daaw/k7$a;Z)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/l7;->e(Lcom/daaw/k7$a;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lcom/daaw/l7;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lcom/daaw/l7;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method


# virtual methods
.method public d(Lcom/daaw/k7$a;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/l7;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/l7;->s:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/l7;->q:Lcom/daaw/l7$a;

    iget-object v1, p0, Lcom/daaw/l7;->q:Lcom/daaw/l7$a;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final e(Lcom/daaw/k7$a;Z)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_2

    :try_start_0
    iget-object v2, p0, Lcom/daaw/l7;->p:Lcom/daaw/k7;

    const/4 v3, 0x1

    if-nez v1, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v2, p1, p2, v4}, Lcom/daaw/k7;->b(Lcom/daaw/k7$a;ZZ)Z

    move-result v2

    iget-object v4, p0, Lcom/daaw/l7;->p:Lcom/daaw/k7;

    invoke-virtual {v4, v0, v0}, Lcom/daaw/k7;->a(ZZ)V

    if-eqz v2, :cond_1

    return v3

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "############### ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] encode tried failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const-string p2, "encode failed, INFO_TRY_AGAIN_LATER?"

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encode failed, presentationTimeUs: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, Lcom/daaw/k7$a;->c:J

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " length: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/daaw/k7$a;->b:I

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string p2, ""

    invoke-static {p1, p2}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_2
    return v0
.end method

.method public final f()V
    .locals 2

    :try_start_0
    new-instance v0, Lcom/daaw/k7$a;

    invoke-direct {v0}, Lcom/daaw/k7$a;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/l7;->e(Lcom/daaw/k7$a;Z)Z

    iget-object v0, p0, Lcom/daaw/l7;->p:Lcom/daaw/k7;

    invoke-virtual {v0}, Lcom/daaw/k7;->d()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public g()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/l7;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/l7;->t:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public h(Lcom/daaw/wf1;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/l7;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "audioEncodeFrameFailed ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/wf1;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/l7;->q:Lcom/daaw/l7$a;

    iget-object v1, p0, Lcom/daaw/l7;->q:Lcom/daaw/l7$a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public run()V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->prepare()V

    iget-object v0, p0, Lcom/daaw/l7;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/daaw/l7$a;

    invoke-direct {v1, p0}, Lcom/daaw/l7$a;-><init>(Lcom/daaw/l7;)V

    iput-object v1, p0, Lcom/daaw/l7;->q:Lcom/daaw/l7$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/l7;->s:Z

    iget-object v1, p0, Lcom/daaw/l7;->r:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {}, Landroid/os/Looper;->loop()V

    iget-object v1, p0, Lcom/daaw/l7;->r:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lcom/daaw/l7;->t:Z

    iput-boolean v0, p0, Lcom/daaw/l7;->s:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/l7;->q:Lcom/daaw/l7$a;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method
