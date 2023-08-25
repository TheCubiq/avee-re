.class public final Lcom/daaw/ye2;
.super Ljava/lang/Thread;
.source ""


# static fields
.field public static final v:Z


# instance fields
.field public final p:Ljava/util/concurrent/BlockingQueue;

.field public final q:Ljava/util/concurrent/BlockingQueue;

.field public final r:Lcom/daaw/we2;

.field public volatile s:Z

.field public final t:Lcom/daaw/dg2;

.field public final u:Lcom/daaw/df2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-boolean v0, Lcom/daaw/cg2;->a:Z

    sput-boolean v0, Lcom/daaw/ye2;->v:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/daaw/we2;Lcom/daaw/df2;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p5, 0x0

    iput-boolean p5, p0, Lcom/daaw/ye2;->s:Z

    iput-object p1, p0, Lcom/daaw/ye2;->p:Ljava/util/concurrent/BlockingQueue;

    iput-object p2, p0, Lcom/daaw/ye2;->q:Ljava/util/concurrent/BlockingQueue;

    iput-object p3, p0, Lcom/daaw/ye2;->r:Lcom/daaw/we2;

    iput-object p4, p0, Lcom/daaw/ye2;->u:Lcom/daaw/df2;

    new-instance p1, Lcom/daaw/dg2;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p2, p4, p3}, Lcom/daaw/dg2;-><init>(Lcom/daaw/ye2;Ljava/util/concurrent/BlockingQueue;Lcom/daaw/df2;[B)V

    iput-object p1, p0, Lcom/daaw/ye2;->t:Lcom/daaw/dg2;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/ye2;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ye2;->q:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ye2;->s:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public final c()V
    .locals 11

    iget-object v0, p0, Lcom/daaw/ye2;->p:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qf2;

    const-string v1, "cache-queue-take"

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->g(I)V

    const/4 v2, 0x2

    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/qf2;->zzw()Z

    iget-object v3, p0, Lcom/daaw/ye2;->r:Lcom/daaw/we2;

    invoke-virtual {v0}, Lcom/daaw/qf2;->zzj()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/daaw/we2;->zza(Ljava/lang/String;)Lcom/daaw/ve2;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v1, "cache-miss"

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/ye2;->t:Lcom/daaw/dg2;

    invoke-virtual {v1, v0}, Lcom/daaw/dg2;->b(Lcom/daaw/qf2;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/ye2;->q:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {v0, v2}, Lcom/daaw/qf2;->g(I)V

    return-void

    :cond_1
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/daaw/ve2;->a(J)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v1, "cache-hit-expired"

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/daaw/qf2;->zze(Lcom/daaw/ve2;)Lcom/daaw/qf2;

    iget-object v1, p0, Lcom/daaw/ye2;->t:Lcom/daaw/dg2;

    invoke-virtual {v1, v0}, Lcom/daaw/dg2;->b(Lcom/daaw/qf2;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/ye2;->q:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    invoke-virtual {v0, v2}, Lcom/daaw/qf2;->g(I)V

    return-void

    :cond_3
    :try_start_2
    const-string v6, "cache-hit"

    invoke-virtual {v0, v6}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    new-instance v6, Lcom/daaw/mf2;

    iget-object v7, v3, Lcom/daaw/ve2;->a:[B

    iget-object v8, v3, Lcom/daaw/ve2;->g:Ljava/util/Map;

    invoke-direct {v6, v7, v8}, Lcom/daaw/mf2;-><init>([BLjava/util/Map;)V

    invoke-virtual {v0, v6}, Lcom/daaw/qf2;->a(Lcom/daaw/mf2;)Lcom/daaw/wf2;

    move-result-object v6

    const-string v7, "cache-hit-parsed"

    invoke-virtual {v0, v7}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/daaw/wf2;->c()Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_5

    const-string v3, "cache-parsing-failed"

    invoke-virtual {v0, v3}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/daaw/ye2;->r:Lcom/daaw/we2;

    invoke-virtual {v0}, Lcom/daaw/qf2;->zzj()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Lcom/daaw/we2;->b(Ljava/lang/String;Z)V

    invoke-virtual {v0, v8}, Lcom/daaw/qf2;->zze(Lcom/daaw/ve2;)Lcom/daaw/qf2;

    iget-object v1, p0, Lcom/daaw/ye2;->t:Lcom/daaw/dg2;

    invoke-virtual {v1, v0}, Lcom/daaw/dg2;->b(Lcom/daaw/qf2;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/daaw/ye2;->q:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    invoke-virtual {v0, v2}, Lcom/daaw/qf2;->g(I)V

    return-void

    :cond_5
    :try_start_3
    iget-wide v9, v3, Lcom/daaw/ve2;->f:J

    cmp-long v7, v9, v4

    if-gez v7, :cond_7

    const-string v4, "cache-hit-refresh-needed"

    invoke-virtual {v0, v4}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/daaw/qf2;->zze(Lcom/daaw/ve2;)Lcom/daaw/qf2;

    iput-boolean v1, v6, Lcom/daaw/wf2;->d:Z

    iget-object v1, p0, Lcom/daaw/ye2;->t:Lcom/daaw/dg2;

    invoke-virtual {v1, v0}, Lcom/daaw/dg2;->b(Lcom/daaw/qf2;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/daaw/ye2;->u:Lcom/daaw/df2;

    new-instance v3, Lcom/daaw/xe2;

    invoke-direct {v3, p0, v0}, Lcom/daaw/xe2;-><init>(Lcom/daaw/ye2;Lcom/daaw/qf2;)V

    invoke-virtual {v1, v0, v6, v3}, Lcom/daaw/df2;->b(Lcom/daaw/qf2;Lcom/daaw/wf2;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_6
    iget-object v1, p0, Lcom/daaw/ye2;->u:Lcom/daaw/df2;

    :goto_0
    invoke-virtual {v1, v0, v6, v8}, Lcom/daaw/df2;->b(Lcom/daaw/qf2;Lcom/daaw/wf2;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_7
    iget-object v1, p0, Lcom/daaw/ye2;->u:Lcom/daaw/df2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v2}, Lcom/daaw/qf2;->g(I)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0, v2}, Lcom/daaw/qf2;->g(I)V

    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2
.end method

.method public final run()V
    .locals 3

    sget-boolean v0, Lcom/daaw/ye2;->v:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "start new dispatcher"

    invoke-static {v2, v0}, Lcom/daaw/cg2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v0, p0, Lcom/daaw/ye2;->r:Lcom/daaw/we2;

    invoke-interface {v0}, Lcom/daaw/we2;->zzb()V

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/ye2;->c()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-boolean v0, p0, Lcom/daaw/ye2;->s:Z

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :cond_1
    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it"

    invoke-static {v2, v0}, Lcom/daaw/cg2;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
