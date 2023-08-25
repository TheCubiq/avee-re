.class public final Lcom/daaw/xj0;
.super Lcom/daaw/pl;
.source ""

# interfaces
.implements Ljava/lang/Runnable;
.implements Lcom/daaw/gs;


# instance fields
.field public final q:Lcom/daaw/pl;

.field public final r:I

.field private volatile runningWorkers:I

.field public final synthetic s:Lcom/daaw/gs;

.field public final t:Lcom/daaw/zk0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/zk0<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/pl;I)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/pl;-><init>()V

    iput-object p1, p0, Lcom/daaw/xj0;->q:Lcom/daaw/pl;

    iput p2, p0, Lcom/daaw/xj0;->r:I

    instance-of p2, p1, Lcom/daaw/gs;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/daaw/gs;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, Lcom/daaw/vq;->a()Lcom/daaw/gs;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lcom/daaw/xj0;->s:Lcom/daaw/gs;

    new-instance p1, Lcom/daaw/zk0;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/daaw/zk0;-><init>(Z)V

    iput-object p1, p0, Lcom/daaw/xj0;->t:Lcom/daaw/zk0;

    return-void
.end method


# virtual methods
.method public T(Lcom/daaw/nl;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p2}, Lcom/daaw/xj0;->W(Ljava/lang/Runnable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/xj0;->X()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/xj0;->q:Lcom/daaw/pl;

    invoke-virtual {p1, p0, p0}, Lcom/daaw/pl;->T(Lcom/daaw/nl;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final W(Ljava/lang/Runnable;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/xj0;->t:Lcom/daaw/zk0;

    invoke-virtual {v0, p1}, Lcom/daaw/zk0;->a(Ljava/lang/Object;)Z

    iget p1, p0, Lcom/daaw/xj0;->runningWorkers:I

    iget v0, p0, Lcom/daaw/xj0;->r:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final X()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/xj0;->runningWorkers:I

    iget v1, p0, Lcom/daaw/xj0;->r:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    iget v0, p0, Lcom/daaw/xj0;->runningWorkers:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/xj0;->runningWorkers:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public run()V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    :cond_0
    iget-object v2, p0, Lcom/daaw/xj0;->t:Lcom/daaw/zk0;

    invoke-virtual {v2}, Lcom/daaw/zk0;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    if-eqz v2, :cond_1

    :try_start_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    sget-object v3, Lcom/daaw/mw;->p:Lcom/daaw/mw;

    invoke-static {v3, v2}, Lcom/daaw/sl;->a(Lcom/daaw/nl;Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/xj0;->q:Lcom/daaw/pl;

    invoke-virtual {v2, p0}, Lcom/daaw/pl;->U(Lcom/daaw/nl;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/daaw/xj0;->q:Lcom/daaw/pl;

    invoke-virtual {v0, p0, p0}, Lcom/daaw/pl;->T(Lcom/daaw/nl;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    monitor-enter p0

    :try_start_1
    iget v1, p0, Lcom/daaw/xj0;->runningWorkers:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/daaw/xj0;->runningWorkers:I

    iget-object v1, p0, Lcom/daaw/xj0;->t:Lcom/daaw/zk0;

    invoke-virtual {v1}, Lcom/daaw/zk0;->c()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v1, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    iget v1, p0, Lcom/daaw/xj0;->runningWorkers:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/xj0;->runningWorkers:I

    sget-object v1, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method
