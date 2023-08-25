.class public final Lcom/daaw/ah4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q03;
.implements Lcom/daaw/jr4;
.implements Lcom/google/android/gms/ads/internal/overlay/zzo;
.implements Lcom/daaw/ir4;


# instance fields
.field public final p:Lcom/daaw/vg4;

.field public final q:Lcom/daaw/wg4;

.field public final r:Ljava/util/Set;

.field public final s:Lcom/daaw/mm3;

.field public final t:Ljava/util/concurrent/Executor;

.field public final u:Lcom/daaw/ag;

.field public final v:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final w:Lcom/daaw/zg4;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public x:Z

.field public y:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lcom/daaw/jm3;Lcom/daaw/wg4;Ljava/util/concurrent/Executor;Lcom/daaw/vg4;Lcom/daaw/ag;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/ah4;->r:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/daaw/ah4;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lcom/daaw/zg4;

    invoke-direct {v0}, Lcom/daaw/zg4;-><init>()V

    iput-object v0, p0, Lcom/daaw/ah4;->w:Lcom/daaw/zg4;

    iput-boolean v1, p0, Lcom/daaw/ah4;->x:Z

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/ah4;->y:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lcom/daaw/ah4;->p:Lcom/daaw/vg4;

    sget-object p4, Lcom/daaw/ul3;->b:Lcom/daaw/rl3;

    const-string v0, "google.afma.activeView.handleUpdate"

    invoke-virtual {p1, v0, p4, p4}, Lcom/daaw/jm3;->a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/mm3;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ah4;->s:Lcom/daaw/mm3;

    iput-object p2, p0, Lcom/daaw/ah4;->q:Lcom/daaw/wg4;

    iput-object p3, p0, Lcom/daaw/ah4;->t:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lcom/daaw/ah4;->u:Lcom/daaw/ag;

    return-void
.end method


# virtual methods
.method public final declared-synchronized b()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ah4;->y:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/ah4;->x:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ah4;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/daaw/ah4;->w:Lcom/daaw/zg4;

    iget-object v1, p0, Lcom/daaw/ah4;->u:Lcom/daaw/ag;

    invoke-interface {v1}, Lcom/daaw/ag;->b()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/daaw/zg4;->d:J

    iget-object v0, p0, Lcom/daaw/ah4;->q:Lcom/daaw/wg4;

    iget-object v1, p0, Lcom/daaw/ah4;->w:Lcom/daaw/zg4;

    invoke-virtual {v0, v1}, Lcom/daaw/wg4;->b(Lcom/daaw/zg4;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ah4;->r:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/a74;

    iget-object v3, p0, Lcom/daaw/ah4;->t:Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/daaw/yg4;

    invoke-direct {v4, v2, v0}, Lcom/daaw/yg4;-><init>(Lcom/daaw/a74;Lorg/json/JSONObject;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/ah4;->s:Lcom/daaw/mm3;

    invoke-virtual {v1, v0}, Lcom/daaw/mm3;->a(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    const-string v1, "ActiveViewListener.callActiveViewJs"

    invoke-static {v0, v1}, Lcom/daaw/c14;->b(Lcom/daaw/f77;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_2
    const-string v1, "Failed to call ActiveViewJS"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    :try_start_3
    invoke-virtual {p0}, Lcom/daaw/ah4;->k()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final declared-synchronized c(Lcom/daaw/a74;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ah4;->r:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/ah4;->p:Lcom/daaw/vg4;

    invoke-virtual {v0, p1}, Lcom/daaw/vg4;->d(Lcom/daaw/a74;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/ah4;->y:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final declared-synchronized e0(Lcom/daaw/p03;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ah4;->w:Lcom/daaw/zg4;

    iget-boolean v1, p1, Lcom/daaw/p03;->j:Z

    iput-boolean v1, v0, Lcom/daaw/zg4;->a:Z

    iput-object p1, v0, Lcom/daaw/zg4;->f:Lcom/daaw/p03;

    invoke-virtual {p0}, Lcom/daaw/ah4;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized f(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/daaw/ah4;->w:Lcom/daaw/zg4;

    const-string v0, "u"

    iput-object v0, p1, Lcom/daaw/zg4;->e:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/ah4;->b()V

    invoke-virtual {p0}, Lcom/daaw/ah4;->m()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/ah4;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized k()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/ah4;->m()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ah4;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized l(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/daaw/ah4;->w:Lcom/daaw/zg4;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/daaw/zg4;->b:Z

    invoke-virtual {p0}, Lcom/daaw/ah4;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final m()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ah4;->r:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/a74;

    iget-object v2, p0, Lcom/daaw/ah4;->p:Lcom/daaw/vg4;

    invoke-virtual {v2, v1}, Lcom/daaw/vg4;->f(Lcom/daaw/a74;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ah4;->p:Lcom/daaw/vg4;

    invoke-virtual {v0}, Lcom/daaw/vg4;->e()V

    return-void
.end method

.method public final declared-synchronized s(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/daaw/ah4;->w:Lcom/daaw/zg4;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/daaw/zg4;->b:Z

    invoke-virtual {p0}, Lcom/daaw/ah4;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzb()V
    .locals 0

    return-void
.end method

.method public final zzbE()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized zzbM()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ah4;->w:Lcom/daaw/zg4;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/daaw/zg4;->b:Z

    invoke-virtual {p0}, Lcom/daaw/ah4;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzbs()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ah4;->w:Lcom/daaw/zg4;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/zg4;->b:Z

    invoke-virtual {p0}, Lcom/daaw/ah4;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zze()V
    .locals 0

    return-void
.end method

.method public final zzf(I)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized zzl()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ah4;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ah4;->p:Lcom/daaw/vg4;

    invoke-virtual {v0, p0}, Lcom/daaw/vg4;->c(Lcom/daaw/ah4;)V

    invoke-virtual {p0}, Lcom/daaw/ah4;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
