.class public final Lcom/daaw/jk0$b;
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

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/jk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/daaw/jk0$c;",
        ">",
        "Landroid/os/Handler;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final p:I

.field public final q:Lcom/daaw/jk0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final r:J

.field public s:Lcom/daaw/jk0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jk0$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public t:Ljava/io/IOException;

.field public u:I

.field public volatile v:Ljava/lang/Thread;

.field public volatile w:Z

.field public volatile x:Z

.field public final synthetic y:Lcom/daaw/jk0;


# direct methods
.method public constructor <init>(Lcom/daaw/jk0;Landroid/os/Looper;Lcom/daaw/jk0$c;Lcom/daaw/jk0$a;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "TT;",
            "Lcom/daaw/jk0$a<",
            "TT;>;IJ)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/jk0$b;->y:Lcom/daaw/jk0;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p3, p0, Lcom/daaw/jk0$b;->q:Lcom/daaw/jk0$c;

    iput-object p4, p0, Lcom/daaw/jk0$b;->s:Lcom/daaw/jk0$a;

    iput p5, p0, Lcom/daaw/jk0$b;->p:I

    iput-wide p6, p0, Lcom/daaw/jk0$b;->r:J

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 9

    iput-boolean p1, p0, Lcom/daaw/jk0$b;->x:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/jk0$b;->t:Ljava/io/IOException;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    if-nez p1, :cond_1

    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_0
    iput-boolean v3, p0, Lcom/daaw/jk0$b;->w:Z

    iget-object v1, p0, Lcom/daaw/jk0$b;->q:Lcom/daaw/jk0$c;

    invoke-interface {v1}, Lcom/daaw/jk0$c;->b()V

    iget-object v1, p0, Lcom/daaw/jk0$b;->v:Ljava/lang/Thread;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/jk0$b;->v:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/jk0$b;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-object v2, p0, Lcom/daaw/jk0$b;->s:Lcom/daaw/jk0$a;

    iget-object v3, p0, Lcom/daaw/jk0$b;->q:Lcom/daaw/jk0$c;

    iget-wide v6, p0, Lcom/daaw/jk0$b;->r:J

    sub-long v6, v4, v6

    const/4 v8, 0x1

    invoke-interface/range {v2 .. v8}, Lcom/daaw/jk0$a;->k(Lcom/daaw/jk0$c;JJZ)V

    iput-object v0, p0, Lcom/daaw/jk0$b;->s:Lcom/daaw/jk0$a;

    :cond_2
    return-void
.end method

.method public final b()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/jk0$b;->t:Ljava/io/IOException;

    iget-object v0, p0, Lcom/daaw/jk0$b;->y:Lcom/daaw/jk0;

    invoke-static {v0}, Lcom/daaw/jk0;->e(Lcom/daaw/jk0;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/jk0$b;->y:Lcom/daaw/jk0;

    invoke-static {v1}, Lcom/daaw/jk0;->b(Lcom/daaw/jk0;)Lcom/daaw/jk0$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jk0$b;->y:Lcom/daaw/jk0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/jk0;->c(Lcom/daaw/jk0;Lcom/daaw/jk0$b;)Lcom/daaw/jk0$b;

    return-void
.end method

.method public final d()J
    .locals 2

    iget v0, p0, Lcom/daaw/jk0$b;->u:I

    add-int/lit8 v0, v0, -0x1

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v1, 0x1388

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public e(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jk0$b;->t:Ljava/io/IOException;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/daaw/jk0$b;->u:I

    if-gt v1, p1, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public f(J)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/jk0$b;->y:Lcom/daaw/jk0;

    invoke-static {v0}, Lcom/daaw/jk0;->b(Lcom/daaw/jk0;)Lcom/daaw/jk0$b;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/jk0$b;->y:Lcom/daaw/jk0;

    invoke-static {v0, p0}, Lcom/daaw/jk0;->c(Lcom/daaw/jk0;Lcom/daaw/jk0$b;)Lcom/daaw/jk0$b;

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-lez v0, :cond_1

    invoke-virtual {p0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/jk0$b;->b()V

    :goto_1
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    iget-boolean v0, p0, Lcom/daaw/jk0$b;->x:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/jk0$b;->b()V

    return-void

    :cond_1
    const/4 v1, 0x4

    if-eq v0, v1, :cond_9

    invoke-virtual {p0}, Lcom/daaw/jk0$b;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v0, p0, Lcom/daaw/jk0$b;->r:J

    sub-long v6, v4, v0

    iget-boolean v0, p0, Lcom/daaw/jk0$b;->w:Z

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/daaw/jk0$b;->s:Lcom/daaw/jk0$a;

    iget-object v3, p0, Lcom/daaw/jk0$b;->q:Lcom/daaw/jk0$c;

    const/4 v8, 0x0

    invoke-interface/range {v2 .. v8}, Lcom/daaw/jk0$a;->k(Lcom/daaw/jk0$c;JJZ)V

    return-void

    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 v9, 0x2

    if-eq v0, v9, :cond_6

    const/4 v10, 0x3

    if-eq v0, v10, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ljava/io/IOException;

    iput-object v8, p0, Lcom/daaw/jk0$b;->t:Ljava/io/IOException;

    iget-object v2, p0, Lcom/daaw/jk0$b;->s:Lcom/daaw/jk0$a;

    iget-object v3, p0, Lcom/daaw/jk0$b;->q:Lcom/daaw/jk0$c;

    invoke-interface/range {v2 .. v8}, Lcom/daaw/jk0$a;->r(Lcom/daaw/jk0$c;JJLjava/io/IOException;)I

    move-result p1

    if-ne p1, v10, :cond_4

    iget-object p1, p0, Lcom/daaw/jk0$b;->y:Lcom/daaw/jk0;

    iget-object v0, p0, Lcom/daaw/jk0$b;->t:Ljava/io/IOException;

    invoke-static {p1, v0}, Lcom/daaw/jk0;->d(Lcom/daaw/jk0;Ljava/io/IOException;)Ljava/io/IOException;

    goto :goto_1

    :cond_4
    if-eq p1, v9, :cond_8

    if-ne p1, v1, :cond_5

    goto :goto_0

    :cond_5
    iget p1, p0, Lcom/daaw/jk0$b;->u:I

    add-int/2addr v1, p1

    :goto_0
    iput v1, p0, Lcom/daaw/jk0$b;->u:I

    invoke-virtual {p0}, Lcom/daaw/jk0$b;->d()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/jk0$b;->f(J)V

    goto :goto_1

    :cond_6
    :try_start_0
    iget-object v2, p0, Lcom/daaw/jk0$b;->s:Lcom/daaw/jk0$a;

    iget-object v3, p0, Lcom/daaw/jk0$b;->q:Lcom/daaw/jk0$c;

    invoke-interface/range {v2 .. v7}, Lcom/daaw/jk0$a;->o(Lcom/daaw/jk0$c;JJ)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/jk0$b;->y:Lcom/daaw/jk0;

    new-instance v1, Lcom/daaw/jk0$f;

    invoke-direct {v1, p1}, Lcom/daaw/jk0$f;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0, v1}, Lcom/daaw/jk0;->d(Lcom/daaw/jk0;Ljava/io/IOException;)Ljava/io/IOException;

    goto :goto_1

    :cond_7
    iget-object v2, p0, Lcom/daaw/jk0$b;->s:Lcom/daaw/jk0$a;

    iget-object v3, p0, Lcom/daaw/jk0$b;->q:Lcom/daaw/jk0$c;

    const/4 v8, 0x0

    invoke-interface/range {v2 .. v8}, Lcom/daaw/jk0$a;->k(Lcom/daaw/jk0$c;JJZ)V

    :cond_8
    :goto_1
    return-void

    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Error;

    throw p1
.end method

.method public run()V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x3

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/jk0$b;->v:Ljava/lang/Thread;

    iget-boolean v2, p0, Lcom/daaw/jk0$b;->w:Z

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "load:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/daaw/jk0$b;->q:Lcom/daaw/jk0$c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/daaw/jk0$b;->q:Lcom/daaw/jk0$c;

    invoke-interface {v2}, Lcom/daaw/jk0$c;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lcom/daaw/mm1;->c()V

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {}, Lcom/daaw/mm1;->c()V

    throw v2

    :cond_0
    :goto_0
    iget-boolean v2, p0, Lcom/daaw/jk0$b;->x:Z

    if-nez v2, :cond_2

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    iget-boolean v1, p0, Lcom/daaw/jk0$b;->x:Z

    if-nez v1, :cond_1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    throw v0

    :catch_1
    move-exception v0

    iget-boolean v2, p0, Lcom/daaw/jk0$b;->x:Z

    if-nez v2, :cond_2

    new-instance v2, Lcom/daaw/jk0$f;

    invoke-direct {v2, v0}, Lcom/daaw/jk0$f;-><init>(Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {p0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    :goto_2
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_3

    :catch_2
    move-exception v0

    iget-boolean v2, p0, Lcom/daaw/jk0$b;->x:Z

    if-nez v2, :cond_2

    new-instance v2, Lcom/daaw/jk0$f;

    invoke-direct {v2, v0}, Lcom/daaw/jk0$f;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_3
    nop

    iget-boolean v1, p0, Lcom/daaw/jk0$b;->w:Z

    invoke-static {v1}, Lcom/daaw/s6;->f(Z)V

    iget-boolean v1, p0, Lcom/daaw/jk0$b;->x:Z

    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_3

    :catch_4
    move-exception v0

    iget-boolean v2, p0, Lcom/daaw/jk0$b;->x:Z

    if-nez v2, :cond_2

    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    goto :goto_2

    :cond_2
    :goto_3
    return-void
.end method
