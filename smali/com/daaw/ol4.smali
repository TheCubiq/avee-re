.class public final Lcom/daaw/ol4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fs4;
.implements Lcom/daaw/q03;


# instance fields
.field public final p:Lcom/daaw/th6;

.field public final q:Lcom/daaw/gr4;

.field public final r:Lcom/daaw/os4;

.field public final s:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final t:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/daaw/th6;Lcom/daaw/gr4;Lcom/daaw/os4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/daaw/ol4;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/daaw/ol4;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/daaw/ol4;->p:Lcom/daaw/th6;

    iput-object p2, p0, Lcom/daaw/ol4;->q:Lcom/daaw/gr4;

    iput-object p3, p0, Lcom/daaw/ol4;->r:Lcom/daaw/os4;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ol4;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ol4;->q:Lcom/daaw/gr4;

    invoke-virtual {v0}, Lcom/daaw/gr4;->zza()V

    :cond_0
    return-void
.end method

.method public final e0(Lcom/daaw/p03;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ol4;->p:Lcom/daaw/th6;

    iget v0, v0, Lcom/daaw/th6;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p1, Lcom/daaw/p03;->j:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ol4;->b()V

    :cond_0
    iget-boolean p1, p1, Lcom/daaw/p03;->j:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ol4;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ol4;->r:Lcom/daaw/os4;

    invoke-virtual {p1}, Lcom/daaw/os4;->zza()V

    :cond_1
    return-void
.end method

.method public final declared-synchronized zzn()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ol4;->p:Lcom/daaw/th6;

    iget v0, v0, Lcom/daaw/th6;->f:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ol4;->b()V
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
