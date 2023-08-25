.class public final Lcom/daaw/gf2;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public final p:Ljava/util/concurrent/BlockingQueue;

.field public final q:Lcom/daaw/ff2;

.field public final r:Lcom/daaw/we2;

.field public volatile s:Z

.field public final t:Lcom/daaw/df2;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Lcom/daaw/ff2;Lcom/daaw/we2;Lcom/daaw/df2;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p5, 0x0

    iput-boolean p5, p0, Lcom/daaw/gf2;->s:Z

    iput-object p1, p0, Lcom/daaw/gf2;->p:Ljava/util/concurrent/BlockingQueue;

    iput-object p2, p0, Lcom/daaw/gf2;->q:Lcom/daaw/ff2;

    iput-object p3, p0, Lcom/daaw/gf2;->r:Lcom/daaw/we2;

    iput-object p4, p0, Lcom/daaw/gf2;->t:Lcom/daaw/df2;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/gf2;->s:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/gf2;->p:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qf2;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->g(I)V

    const/4 v1, 0x4

    :try_start_0
    const-string v2, "network-queue-take"

    invoke-virtual {v0, v2}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/daaw/qf2;->zzw()Z

    invoke-virtual {v0}, Lcom/daaw/qf2;->zzc()I

    move-result v2

    invoke-static {v2}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    iget-object v2, p0, Lcom/daaw/gf2;->q:Lcom/daaw/ff2;

    invoke-interface {v2, v0}, Lcom/daaw/ff2;->zza(Lcom/daaw/qf2;)Lcom/daaw/mf2;

    move-result-object v2

    const-string v3, "network-http-complete"

    invoke-virtual {v0, v3}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    iget-boolean v3, v2, Lcom/daaw/mf2;->e:Z

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/daaw/qf2;->zzv()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v2, "not-modified"

    invoke-virtual {v0, v2}, Lcom/daaw/qf2;->d(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/daaw/qf2;->e()V
    :try_end_0
    .catch Lcom/daaw/zf2; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->g(I)V

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v0, v2}, Lcom/daaw/qf2;->a(Lcom/daaw/mf2;)Lcom/daaw/wf2;

    move-result-object v2

    const-string v3, "network-parse-complete"

    invoke-virtual {v0, v3}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    iget-object v3, v2, Lcom/daaw/wf2;->b:Lcom/daaw/ve2;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/daaw/gf2;->r:Lcom/daaw/we2;

    invoke-virtual {v0}, Lcom/daaw/qf2;->zzj()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lcom/daaw/wf2;->b:Lcom/daaw/ve2;

    invoke-interface {v3, v4, v5}, Lcom/daaw/we2;->a(Ljava/lang/String;Lcom/daaw/ve2;)V

    const-string v3, "network-cache-written"

    invoke-virtual {v0, v3}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/qf2;->zzq()V

    iget-object v3, p0, Lcom/daaw/gf2;->t:Lcom/daaw/df2;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v2, v4}, Lcom/daaw/df2;->b(Lcom/daaw/qf2;Lcom/daaw/wf2;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v2}, Lcom/daaw/qf2;->f(Lcom/daaw/wf2;)V
    :try_end_1
    .catch Lcom/daaw/zf2; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->g(I)V

    return-void

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v2

    const/4 v3, 0x1

    :try_start_2
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const-string v4, "Unhandled exception %s"

    invoke-static {v2, v4, v3}, Lcom/daaw/cg2;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v3, Lcom/daaw/zf2;

    invoke-direct {v3, v2}, Lcom/daaw/zf2;-><init>(Ljava/lang/Throwable;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    iget-object v2, p0, Lcom/daaw/gf2;->t:Lcom/daaw/df2;

    invoke-virtual {v2, v0, v3}, Lcom/daaw/df2;->a(Lcom/daaw/qf2;Lcom/daaw/zf2;)V

    invoke-virtual {v0}, Lcom/daaw/qf2;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->g(I)V

    return-void

    :catch_1
    move-exception v2

    :try_start_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    iget-object v3, p0, Lcom/daaw/gf2;->t:Lcom/daaw/df2;

    invoke-virtual {v3, v0, v2}, Lcom/daaw/df2;->a(Lcom/daaw/qf2;Lcom/daaw/zf2;)V

    invoke-virtual {v0}, Lcom/daaw/qf2;->e()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->g(I)V

    return-void

    :goto_0
    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->g(I)V

    throw v2
.end method

.method public final run()V
    .locals 2

    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/gf2;->b()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-boolean v0, p0, Lcom/daaw/gf2;->s:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it"

    invoke-static {v1, v0}, Lcom/daaw/cg2;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
