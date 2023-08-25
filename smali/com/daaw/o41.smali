.class public Lcom/daaw/o41;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/x50;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/o41$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/x50<",
        "TR;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field public static final A:Lcom/daaw/o41$a;


# instance fields
.field public final p:Landroid/os/Handler;

.field public final q:I

.field public final r:I

.field public final s:Z

.field public final t:Lcom/daaw/o41$a;

.field public u:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field public v:Lcom/daaw/l41;

.field public w:Z

.field public x:Ljava/lang/Exception;

.field public y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/o41$a;

    invoke-direct {v0}, Lcom/daaw/o41$a;-><init>()V

    sput-object v0, Lcom/daaw/o41;->A:Lcom/daaw/o41$a;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;II)V
    .locals 6

    sget-object v5, Lcom/daaw/o41;->A:Lcom/daaw/o41$a;

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/o41;-><init>(Landroid/os/Handler;IIZLcom/daaw/o41$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;IIZLcom/daaw/o41$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o41;->p:Landroid/os/Handler;

    iput p2, p0, Lcom/daaw/o41;->q:I

    iput p3, p0, Lcom/daaw/o41;->r:I

    iput-boolean p4, p0, Lcom/daaw/o41;->s:Z

    iput-object p5, p0, Lcom/daaw/o41;->t:Lcom/daaw/o41$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lcom/daaw/l41;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o41;->v:Lcom/daaw/l41;

    return-void
.end method

.method public declared-synchronized c(Ljava/lang/Object;Lcom/daaw/f70;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "Lcom/daaw/f70<",
            "-TR;>;)V"
        }
    .end annotation

    monitor-enter p0

    const/4 p2, 0x1

    :try_start_0
    iput-boolean p2, p0, Lcom/daaw/o41;->y:Z

    iput-object p1, p0, Lcom/daaw/o41;->u:Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/o41;->t:Lcom/daaw/o41$a;

    invoke-virtual {p1, p0}, Lcom/daaw/o41$a;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized cancel(Z)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/o41;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/daaw/o41;->isDone()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Lcom/daaw/o41;->w:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/o41;->l()V

    :cond_1
    iget-object p1, p0, Lcom/daaw/o41;->t:Lcom/daaw/o41$a;

    invoke-virtual {p1, p0}, Lcom/daaw/o41$a;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e(Lcom/daaw/sd1;)V
    .locals 2

    iget v0, p0, Lcom/daaw/o41;->q:I

    iget v1, p0, Lcom/daaw/o41;->r:I

    invoke-interface {p1, v0, v1}, Lcom/daaw/sd1;->f(II)V

    return-void
.end method

.method public declared-synchronized g(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    monitor-enter p0

    const/4 p2, 0x1

    :try_start_0
    iput-boolean p2, p0, Lcom/daaw/o41;->z:Z

    iput-object p1, p0, Lcom/daaw/o41;->x:Ljava/lang/Exception;

    iget-object p1, p0, Lcom/daaw/o41;->t:Lcom/daaw/o41$a;

    invoke-virtual {p1, p0}, Lcom/daaw/o41$a;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/daaw/o41;->m(Ljava/lang/Long;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TR;"
        }
    .end annotation

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/o41;->m(Ljava/lang/Long;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public declared-synchronized isCancelled()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/o41;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized isDone()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/o41;->w:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/o41;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public j()Lcom/daaw/l41;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o41;->v:Lcom/daaw/l41;

    return-object v0
.end method

.method public k(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/o41;->p:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final declared-synchronized m(Ljava/lang/Long;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")TR;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/o41;->s:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/tq1;->a()V

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/o41;->w:Z

    if-nez v0, :cond_9

    iget-boolean v0, p0, Lcom/daaw/o41;->z:Z

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lcom/daaw/o41;->y:Z

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/daaw/o41;->u:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_1
    const-wide/16 v0, 0x0

    if-nez p1, :cond_2

    :try_start_1
    iget-object p1, p0, Lcom/daaw/o41;->t:Lcom/daaw/o41$a;

    invoke-virtual {p1, p0, v0, v1}, Lcom/daaw/o41$a;->b(Ljava/lang/Object;J)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-lez v4, :cond_3

    iget-object v0, p0, Lcom/daaw/o41;->t:Lcom/daaw/o41$a;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Lcom/daaw/o41$a;->b(Ljava/lang/Object;J)V

    :cond_3
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result p1

    if-nez p1, :cond_7

    iget-boolean p1, p0, Lcom/daaw/o41;->z:Z

    if-nez p1, :cond_6

    iget-boolean p1, p0, Lcom/daaw/o41;->w:Z

    if-nez p1, :cond_5

    iget-boolean p1, p0, Lcom/daaw/o41;->y:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/o41;->u:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_4
    :try_start_2
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljava/util/concurrent/CancellationException;

    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Ljava/util/concurrent/ExecutionException;

    iget-object v0, p0, Lcom/daaw/o41;->x:Ljava/lang/Exception;

    invoke-direct {p1, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1

    :cond_8
    new-instance p1, Ljava/util/concurrent/ExecutionException;

    iget-object v0, p0, Lcom/daaw/o41;->x:Ljava/lang/Exception;

    invoke-direct {p1, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/util/concurrent/CancellationException;

    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/o41;->v:Lcom/daaw/l41;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/l41;->clear()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/o41;->cancel(Z)Z

    :cond_0
    return-void
.end method
