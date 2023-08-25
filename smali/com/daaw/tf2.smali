.class public final Lcom/daaw/tf2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final b:Ljava/util/Set;

.field public final c:Ljava/util/concurrent/PriorityBlockingQueue;

.field public final d:Ljava/util/concurrent/PriorityBlockingQueue;

.field public final e:Lcom/daaw/we2;

.field public final f:Lcom/daaw/ff2;

.field public final g:[Lcom/daaw/gf2;

.field public h:Lcom/daaw/ye2;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:Lcom/daaw/df2;


# direct methods
.method public constructor <init>(Lcom/daaw/we2;Lcom/daaw/ff2;I)V
    .locals 2

    new-instance p3, Lcom/daaw/df2;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p3, v0}, Lcom/daaw/df2;-><init>(Landroid/os/Handler;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/daaw/tf2;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/tf2;->b:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/daaw/tf2;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/daaw/tf2;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/tf2;->i:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/tf2;->j:Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/tf2;->e:Lcom/daaw/we2;

    iput-object p2, p0, Lcom/daaw/tf2;->f:Lcom/daaw/ff2;

    const/4 p1, 0x4

    new-array p1, p1, [Lcom/daaw/gf2;

    iput-object p1, p0, Lcom/daaw/tf2;->g:[Lcom/daaw/gf2;

    iput-object p3, p0, Lcom/daaw/tf2;->k:Lcom/daaw/df2;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/qf2;)Lcom/daaw/qf2;
    .locals 2

    invoke-virtual {p1, p0}, Lcom/daaw/qf2;->zzf(Lcom/daaw/tf2;)Lcom/daaw/qf2;

    iget-object v0, p0, Lcom/daaw/tf2;->b:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/tf2;->b:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/tf2;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/qf2;->zzg(I)Lcom/daaw/qf2;

    const-string v0, "add-to-queue"

    invoke-virtual {p1, v0}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/tf2;->c(Lcom/daaw/qf2;I)V

    iget-object v0, p0, Lcom/daaw/tf2;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b(Lcom/daaw/qf2;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/tf2;->b:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/tf2;->b:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v1, p0, Lcom/daaw/tf2;->i:Ljava/util/List;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lcom/daaw/tf2;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/sf2;

    invoke-interface {v2}, Lcom/daaw/sf2;->zza()V

    goto :goto_0

    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/daaw/tf2;->c(Lcom/daaw/qf2;I)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final c(Lcom/daaw/qf2;I)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/tf2;->j:Ljava/util/List;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lcom/daaw/tf2;->j:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/rf2;

    invoke-interface {v0}, Lcom/daaw/rf2;->zza()V

    goto :goto_0

    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p2

    :goto_2
    goto :goto_1
.end method

.method public final d()V
    .locals 10

    iget-object v0, p0, Lcom/daaw/tf2;->h:Lcom/daaw/ye2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/ye2;->b()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/tf2;->g:[Lcom/daaw/gf2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x4

    if-ge v2, v3, :cond_2

    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/daaw/gf2;->a()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/daaw/ye2;

    iget-object v5, p0, Lcom/daaw/tf2;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v6, p0, Lcom/daaw/tf2;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v7, p0, Lcom/daaw/tf2;->e:Lcom/daaw/we2;

    iget-object v8, p0, Lcom/daaw/tf2;->k:Lcom/daaw/df2;

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/daaw/ye2;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/daaw/we2;Lcom/daaw/df2;[B)V

    iput-object v0, p0, Lcom/daaw/tf2;->h:Lcom/daaw/ye2;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :goto_1
    if-ge v1, v3, :cond_3

    new-instance v0, Lcom/daaw/gf2;

    iget-object v5, p0, Lcom/daaw/tf2;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v6, p0, Lcom/daaw/tf2;->f:Lcom/daaw/ff2;

    iget-object v7, p0, Lcom/daaw/tf2;->e:Lcom/daaw/we2;

    iget-object v8, p0, Lcom/daaw/tf2;->k:Lcom/daaw/df2;

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/daaw/gf2;-><init>(Ljava/util/concurrent/BlockingQueue;Lcom/daaw/ff2;Lcom/daaw/we2;Lcom/daaw/df2;[B)V

    iget-object v2, p0, Lcom/daaw/tf2;->g:[Lcom/daaw/gf2;

    aput-object v0, v2, v1

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method
