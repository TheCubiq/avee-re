.class public final Lcom/daaw/z88;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/w88;

.field public final b:Lcom/daaw/t88;

.field public final c:Lcom/daaw/xp4;

.field public final d:Lcom/daaw/l64;

.field public e:I

.field public f:Ljava/lang/Object;

.field public final g:Landroid/os/Looper;

.field public final h:I

.field public i:Z

.field public j:Z

.field public k:Z


# direct methods
.method public constructor <init>(Lcom/daaw/t88;Lcom/daaw/w88;Lcom/daaw/l64;ILcom/daaw/xp4;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z88;->b:Lcom/daaw/t88;

    iput-object p2, p0, Lcom/daaw/z88;->a:Lcom/daaw/w88;

    iput-object p3, p0, Lcom/daaw/z88;->d:Lcom/daaw/l64;

    iput-object p6, p0, Lcom/daaw/z88;->g:Landroid/os/Looper;

    iput-object p5, p0, Lcom/daaw/z88;->c:Lcom/daaw/xp4;

    iput p4, p0, Lcom/daaw/z88;->h:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/z88;->e:I

    return v0
.end method

.method public final b()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z88;->g:Landroid/os/Looper;

    return-object v0
.end method

.method public final c()Lcom/daaw/w88;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z88;->a:Lcom/daaw/w88;

    return-object v0
.end method

.method public final d()Lcom/daaw/z88;
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/z88;->i:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iput-boolean v1, p0, Lcom/daaw/z88;->i:Z

    iget-object v0, p0, Lcom/daaw/z88;->b:Lcom/daaw/t88;

    invoke-interface {v0, p0}, Lcom/daaw/t88;->c(Lcom/daaw/z88;)V

    return-object p0
.end method

.method public final e(Ljava/lang/Object;)Lcom/daaw/z88;
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/z88;->i:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iput-object p1, p0, Lcom/daaw/z88;->f:Ljava/lang/Object;

    return-object p0
.end method

.method public final f(I)Lcom/daaw/z88;
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/z88;->i:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iput p1, p0, Lcom/daaw/z88;->e:I

    return-object p0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z88;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public final declared-synchronized h(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/z88;->j:Z

    or-int/2addr p1, v0

    iput-boolean p1, p0, Lcom/daaw/z88;->j:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/z88;->k:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized i(J)Z
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/z88;->i:Z

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iget-object v0, p0, Lcom/daaw/z88;->g:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p1

    :goto_1
    iget-boolean v2, p0, Lcom/daaw/z88;->k:Z

    if-nez v2, :cond_2

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-lez v4, :cond_1

    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    sub-long p1, v0, p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    const-string p2, "Message delivery timed out."

    invoke-direct {p1, p2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, p0, Lcom/daaw/z88;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public final declared-synchronized j()Z
    .locals 1

    monitor-enter p0

    monitor-exit p0

    const/4 v0, 0x0

    return v0
.end method
