.class public final Lcom/daaw/i41;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/i41$b;
    }
.end annotation


# instance fields
.field public final a:D

.field public final b:D

.field public final c:J

.field public final d:I

.field public final e:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final g:Lcom/daaw/qn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qn1<",
            "Lcom/daaw/lm;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lcom/daaw/fu0;

.field public i:I

.field public j:J


# direct methods
.method public constructor <init>(DDJLcom/daaw/qn1;Lcom/daaw/fu0;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDJ",
            "Lcom/daaw/qn1<",
            "Lcom/daaw/lm;",
            ">;",
            "Lcom/daaw/fu0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/i41;->a:D

    iput-wide p3, p0, Lcom/daaw/i41;->b:D

    iput-wide p5, p0, Lcom/daaw/i41;->c:J

    iput-object p7, p0, Lcom/daaw/i41;->g:Lcom/daaw/qn1;

    iput-object p8, p0, Lcom/daaw/i41;->h:Lcom/daaw/fu0;

    double-to-int p1, p1

    iput p1, p0, Lcom/daaw/i41;->d:I

    new-instance p8, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-direct {p8, p1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object p8, p0, Lcom/daaw/i41;->e:Ljava/util/concurrent/BlockingQueue;

    new-instance p1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object p7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 p3, 0x1

    const/4 p4, 0x1

    const-wide/16 p5, 0x0

    move-object p2, p1

    invoke-direct/range {p2 .. p8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object p1, p0, Lcom/daaw/i41;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/i41;->i:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/i41;->j:J

    return-void
.end method

.method public constructor <init>(Lcom/daaw/qn1;Lcom/daaw/tb1;Lcom/daaw/fu0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/qn1<",
            "Lcom/daaw/lm;",
            ">;",
            "Lcom/daaw/tb1;",
            "Lcom/daaw/fu0;",
            ")V"
        }
    .end annotation

    iget-wide v1, p2, Lcom/daaw/tb1;->f:D

    iget-wide v3, p2, Lcom/daaw/tb1;->g:D

    iget p2, p2, Lcom/daaw/tb1;->h:I

    int-to-long v5, p2

    const-wide/16 v7, 0x3e8

    mul-long v5, v5, v7

    move-object v0, p0

    move-object v7, p1

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/daaw/i41;-><init>(DDJLcom/daaw/qn1;Lcom/daaw/fu0;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/i41;Lcom/daaw/tj1;Lcom/daaw/zm;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/i41;->n(Lcom/daaw/tj1;Lcom/daaw/zm;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/i41;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/i41;->m(Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/i41;Lcom/daaw/zm;Lcom/daaw/tj1;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/i41;->p(Lcom/daaw/zm;Lcom/daaw/tj1;)V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/i41;)Lcom/daaw/fu0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/i41;->h:Lcom/daaw/fu0;

    return-object p0
.end method

.method public static synthetic e(Lcom/daaw/i41;)D
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/i41;->g()D

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic f(D)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/i41;->q(D)V

    return-void
.end method

.method private synthetic m(Ljava/util/concurrent/CountDownLatch;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/i41;->g:Lcom/daaw/qn1;

    sget-object v1, Lcom/daaw/cz0;->r:Lcom/daaw/cz0;

    invoke-static {v0, v1}, Lcom/daaw/f30;->b(Lcom/daaw/qn1;Lcom/daaw/cz0;)V

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method private synthetic n(Lcom/daaw/tj1;Lcom/daaw/zm;Ljava/lang/Exception;)V
    .locals 0

    if-eqz p3, :cond_0

    invoke-virtual {p1, p3}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/i41;->j()V

    invoke-virtual {p1, p2}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    return-void
.end method

.method public static q(D)V
    .locals 0

    double-to-long p0, p0

    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final g()D
    .locals 6

    iget-wide v0, p0, Lcom/daaw/i41;->a:D

    const-wide v2, 0x40ed4c0000000000L    # 60000.0

    div-double/2addr v2, v0

    iget-wide v0, p0, Lcom/daaw/i41;->b:D

    invoke-virtual {p0}, Lcom/daaw/i41;->h()I

    move-result v4

    int-to-double v4, v4

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    mul-double v2, v2, v0

    const-wide v0, 0x414b774000000000L    # 3600000.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public final h()I
    .locals 5

    iget-wide v0, p0, Lcom/daaw/i41;->j:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p0}, Lcom/daaw/i41;->o()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/i41;->j:J

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/i41;->o()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/i41;->j:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/daaw/i41;->c:J

    div-long/2addr v0, v2

    long-to-int v1, v0

    invoke-virtual {p0}, Lcom/daaw/i41;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x64

    iget v2, p0, Lcom/daaw/i41;->i:I

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iget v2, p0, Lcom/daaw/i41;->i:I

    sub-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_0
    iget v1, p0, Lcom/daaw/i41;->i:I

    if-eq v1, v0, :cond_2

    iput v0, p0, Lcom/daaw/i41;->i:I

    invoke-virtual {p0}, Lcom/daaw/i41;->o()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/i41;->j:J

    :cond_2
    return v0
.end method

.method public i(Lcom/daaw/zm;Z)Lcom/daaw/tj1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zm;",
            "Z)",
            "Lcom/daaw/tj1<",
            "Lcom/daaw/zm;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/i41;->e:Ljava/util/concurrent/BlockingQueue;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/daaw/tj1;

    invoke-direct {v1}, Lcom/daaw/tj1;-><init>()V

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/daaw/i41;->h:Lcom/daaw/fu0;

    invoke-virtual {p2}, Lcom/daaw/fu0;->b()V

    invoke-virtual {p0}, Lcom/daaw/i41;->k()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enqueueing report: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/zm;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Queue size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/daaw/i41;->e:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v3}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/i41;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Lcom/daaw/i41$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v1, v3}, Lcom/daaw/i41$b;-><init>(Lcom/daaw/i41;Lcom/daaw/zm;Lcom/daaw/tj1;Lcom/daaw/i41$a;)V

    invoke-virtual {p2, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Closing task for report: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/zm;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/i41;->h()I

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Dropping report due to queue being full: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/zm;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/i41;->h:Lcom/daaw/fu0;

    invoke-virtual {p2}, Lcom/daaw/fu0;->a()V

    invoke-virtual {v1, p1}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object v1

    :cond_1
    invoke-virtual {p0, p1, v1}, Lcom/daaw/i41;->p(Lcom/daaw/zm;Lcom/daaw/tj1;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedApi",
            "ThreadPoolCreation"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/daaw/h41;

    invoke-direct {v2, p0, v0}, Lcom/daaw/h41;-><init>(Lcom/daaw/i41;Ljava/util/concurrent/CountDownLatch;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-static {v0, v2, v3, v1}, Lcom/daaw/yq1;->e(Ljava/util/concurrent/CountDownLatch;JLjava/util/concurrent/TimeUnit;)Z

    return-void
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/i41;->e:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    iget v1, p0, Lcom/daaw/i41;->d:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/i41;->e:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    iget v1, p0, Lcom/daaw/i41;->d:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final p(Lcom/daaw/zm;Lcom/daaw/tj1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zm;",
            "Lcom/daaw/tj1<",
            "Lcom/daaw/zm;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending report through Google DataTransport: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/zm;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/i41;->g:Lcom/daaw/qn1;

    invoke-virtual {p1}, Lcom/daaw/zm;->b()Lcom/daaw/lm;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/xx;->d(Ljava/lang/Object;)Lcom/daaw/xx;

    move-result-object v1

    new-instance v2, Lcom/daaw/g41;

    invoke-direct {v2, p0, p2, p1}, Lcom/daaw/g41;-><init>(Lcom/daaw/i41;Lcom/daaw/tj1;Lcom/daaw/zm;)V

    invoke-interface {v0, v1, v2}, Lcom/daaw/qn1;->a(Lcom/daaw/xx;Lcom/daaw/ao1;)V

    return-void
.end method
