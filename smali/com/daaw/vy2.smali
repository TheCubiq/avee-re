.class public final Lcom/daaw/vy2;
.super Landroid/os/Handler;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/wy2;

.field public final q:Lcom/daaw/uy2;

.field public final r:I

.field public final s:J

.field public t:Ljava/io/IOException;

.field public u:I

.field public volatile v:Ljava/lang/Thread;

.field public volatile w:Z

.field public final synthetic x:Lcom/daaw/yy2;


# direct methods
.method public constructor <init>(Lcom/daaw/yy2;Landroid/os/Looper;Lcom/daaw/wy2;Lcom/daaw/uy2;IJ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vy2;->x:Lcom/daaw/yy2;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p3, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    iput-object p4, p0, Lcom/daaw/vy2;->q:Lcom/daaw/uy2;

    iput p5, p0, Lcom/daaw/vy2;->r:I

    iput-wide p6, p0, Lcom/daaw/vy2;->s:J

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 8

    iput-boolean p1, p0, Lcom/daaw/vy2;->w:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vy2;->t:Ljava/io/IOException;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    if-nez p1, :cond_2

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    invoke-interface {v1}, Lcom/daaw/wy2;->zzb()V

    iget-object v1, p0, Lcom/daaw/vy2;->v:Ljava/lang/Thread;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/vy2;->v:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, Lcom/daaw/vy2;->x:Lcom/daaw/yy2;

    invoke-static {p1, v0}, Lcom/daaw/yy2;->d(Lcom/daaw/yy2;Lcom/daaw/vy2;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-object v1, p0, Lcom/daaw/vy2;->q:Lcom/daaw/uy2;

    iget-object v2, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    iget-wide v5, p0, Lcom/daaw/vy2;->s:J

    sub-long v5, v3, v5

    const/4 v7, 0x1

    invoke-interface/range {v1 .. v7}, Lcom/daaw/uy2;->j(Lcom/daaw/wy2;JJZ)V

    return-void
.end method

.method public final b(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy2;->t:Ljava/io/IOException;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/daaw/vy2;->u:I

    if-gt v1, p1, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final c(J)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/vy2;->x:Lcom/daaw/yy2;

    invoke-static {v0}, Lcom/daaw/yy2;->b(Lcom/daaw/yy2;)Lcom/daaw/vy2;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/az2;->e(Z)V

    iget-object v0, p0, Lcom/daaw/vy2;->x:Lcom/daaw/yy2;

    invoke-static {v0, p0}, Lcom/daaw/yy2;->d(Lcom/daaw/yy2;Lcom/daaw/vy2;)V

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-lez v0, :cond_1

    invoke-virtual {p0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/vy2;->d()V

    return-void
.end method

.method public final d()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vy2;->t:Ljava/io/IOException;

    iget-object v0, p0, Lcom/daaw/vy2;->x:Lcom/daaw/yy2;

    invoke-static {v0}, Lcom/daaw/yy2;->c(Lcom/daaw/yy2;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/yy2;->b(Lcom/daaw/yy2;)Lcom/daaw/vy2;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    iget-boolean v0, p0, Lcom/daaw/vy2;->w:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/vy2;->d()V

    return-void

    :cond_1
    const/4 v1, 0x4

    if-eq v0, v1, :cond_9

    iget-object v0, p0, Lcom/daaw/vy2;->x:Lcom/daaw/yy2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/yy2;->d(Lcom/daaw/yy2;Lcom/daaw/vy2;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v0, p0, Lcom/daaw/vy2;->s:J

    sub-long v6, v4, v0

    iget-object v0, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    invoke-interface {v0}, Lcom/daaw/wy2;->zze()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/daaw/vy2;->q:Lcom/daaw/uy2;

    iget-object v3, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    const/4 v8, 0x0

    invoke-interface/range {v2 .. v8}, Lcom/daaw/uy2;->j(Lcom/daaw/wy2;JJZ)V

    return-void

    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/4 v9, 0x2

    if-eq v0, v9, :cond_7

    const/4 v10, 0x3

    if-eq v0, v10, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ljava/io/IOException;

    iput-object v8, p0, Lcom/daaw/vy2;->t:Ljava/io/IOException;

    iget-object v2, p0, Lcom/daaw/vy2;->q:Lcom/daaw/uy2;

    iget-object v3, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    invoke-interface/range {v2 .. v8}, Lcom/daaw/uy2;->i(Lcom/daaw/wy2;JJLjava/io/IOException;)I

    move-result p1

    if-ne p1, v10, :cond_4

    iget-object p1, p0, Lcom/daaw/vy2;->x:Lcom/daaw/yy2;

    iget-object v0, p0, Lcom/daaw/vy2;->t:Ljava/io/IOException;

    invoke-static {p1, v0}, Lcom/daaw/yy2;->e(Lcom/daaw/yy2;Ljava/io/IOException;)V

    return-void

    :cond_4
    if-eq p1, v9, :cond_6

    if-ne p1, v1, :cond_5

    goto :goto_0

    :cond_5
    iget p1, p0, Lcom/daaw/vy2;->u:I

    add-int/2addr v1, p1

    :goto_0
    iput v1, p0, Lcom/daaw/vy2;->u:I

    add-int/lit8 v1, v1, -0x1

    mul-int/lit16 v1, v1, 0x3e8

    const/16 p1, 0x1388

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/vy2;->c(J)V

    :cond_6
    :goto_1
    return-void

    :cond_7
    iget-object v2, p0, Lcom/daaw/vy2;->q:Lcom/daaw/uy2;

    iget-object v3, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    invoke-interface/range {v2 .. v7}, Lcom/daaw/uy2;->k(Lcom/daaw/wy2;JJ)V

    return-void

    :cond_8
    iget-object v2, p0, Lcom/daaw/vy2;->q:Lcom/daaw/uy2;

    iget-object v3, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    const/4 v8, 0x0

    invoke-interface/range {v2 .. v8}, Lcom/daaw/uy2;->j(Lcom/daaw/wy2;JJZ)V

    return-void

    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Error;

    throw p1
.end method

.method public final run()V
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x3

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/vy2;->v:Ljava/lang/Thread;

    iget-object v2, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    invoke-interface {v2}, Lcom/daaw/wy2;->zze()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "load:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/nz2;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    invoke-interface {v2}, Lcom/daaw/wy2;->zzc()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lcom/daaw/nz2;->b()V

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {}, Lcom/daaw/nz2;->b()V

    throw v2

    :cond_0
    :goto_0
    iget-boolean v2, p0, Lcom/daaw/vy2;->w:Z

    if-nez v2, :cond_2

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-boolean v1, p0, Lcom/daaw/vy2;->w:Z

    if-nez v1, :cond_1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    throw v0

    :catch_1
    move-exception v0

    iget-boolean v2, p0, Lcom/daaw/vy2;->w:Z

    if-nez v2, :cond_2

    new-instance v2, Lcom/daaw/xy2;

    invoke-direct {v2, v0}, Lcom/daaw/xy2;-><init>(Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {p0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    :goto_2
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void

    :catch_2
    move-exception v0

    iget-boolean v2, p0, Lcom/daaw/vy2;->w:Z

    if-nez v2, :cond_2

    new-instance v2, Lcom/daaw/xy2;

    invoke-direct {v2, v0}, Lcom/daaw/xy2;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_3
    nop

    iget-object v1, p0, Lcom/daaw/vy2;->p:Lcom/daaw/wy2;

    invoke-interface {v1}, Lcom/daaw/wy2;->zze()Z

    move-result v1

    invoke-static {v1}, Lcom/daaw/az2;->e(Z)V

    iget-boolean v1, p0, Lcom/daaw/vy2;->w:Z

    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :catch_4
    move-exception v0

    iget-boolean v2, p0, Lcom/daaw/vy2;->w:Z

    if-nez v2, :cond_2

    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    goto :goto_2

    :cond_2
    return-void
.end method
