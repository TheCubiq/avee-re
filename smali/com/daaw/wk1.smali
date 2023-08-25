.class public Lcom/daaw/wk1;
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
        Lcom/daaw/wk1$a;
    }
.end annotation


# instance fields
.field public p:Lcom/daaw/os1;

.field public volatile q:Lcom/daaw/wk1$a;

.field public r:Ljava/lang/Object;

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Lcom/daaw/os1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/wk1;->r:Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/wk1;->p:Lcom/daaw/os1;

    iget-object p1, p0, Lcom/daaw/wk1;->r:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/wk1;->t:Z

    if-eqz v0, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/wk1;->t:Z

    new-instance v0, Ljava/lang/Thread;

    const-string v1, "TextureMovieEncoder"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :catch_0
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/wk1;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/daaw/wk1;->r:Ljava/lang/Object;

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

.method public static synthetic a(Lcom/daaw/wk1;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/wk1;->e()V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/wk1;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/wk1;->d()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/wk1;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/wk1;->s:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/wk1;->q:Lcom/daaw/wk1$a;

    iget-object v1, p0, Lcom/daaw/wk1;->q:Lcom/daaw/wk1$a;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/wk1;->p:Lcom/daaw/os1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/os1;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleFrameAvailable exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method public final e()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/wk1;->p:Lcom/daaw/os1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/os1;->a(Z)V

    iget-object v0, p0, Lcom/daaw/wk1;->p:Lcom/daaw/os1;

    invoke-virtual {v0}, Lcom/daaw/os1;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method public f()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/wk1;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/wk1;->t:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/wk1;->q:Lcom/daaw/wk1$a;

    iget-object v1, p0, Lcom/daaw/wk1;->q:Lcom/daaw/wk1$a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public run()V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->prepare()V

    iget-object v0, p0, Lcom/daaw/wk1;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/daaw/wk1$a;

    invoke-direct {v1, p0}, Lcom/daaw/wk1$a;-><init>(Lcom/daaw/wk1;)V

    iput-object v1, p0, Lcom/daaw/wk1;->q:Lcom/daaw/wk1$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/wk1;->s:Z

    iget-object v1, p0, Lcom/daaw/wk1;->r:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {}, Landroid/os/Looper;->loop()V

    iget-object v1, p0, Lcom/daaw/wk1;->r:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lcom/daaw/wk1;->t:Z

    iput-boolean v0, p0, Lcom/daaw/wk1;->s:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/wk1;->q:Lcom/daaw/wk1$a;

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
