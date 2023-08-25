.class public final Lcom/daaw/tl$c;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# static fields
.field public static final synthetic w:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile indexInArray:I

.field private volatile nextParkedWorker:Ljava/lang/Object;

.field public final p:Lcom/daaw/ny1;

.field public q:Lcom/daaw/tl$d;

.field public r:J

.field public s:J

.field public t:I

.field public u:Z

.field public final synthetic v:Lcom/daaw/tl;

.field public volatile synthetic workerCtl:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/daaw/tl$c;

    const-string v1, "workerCtl"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/tl$c;->w:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/tl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    new-instance p1, Lcom/daaw/ny1;

    invoke-direct {p1}, Lcom/daaw/ny1;-><init>()V

    iput-object p1, p0, Lcom/daaw/tl$c;->p:Lcom/daaw/ny1;

    sget-object p1, Lcom/daaw/tl$d;->s:Lcom/daaw/tl$d;

    iput-object p1, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/tl$c;->workerCtl:I

    sget-object p1, Lcom/daaw/tl;->A:Lcom/daaw/pi1;

    iput-object p1, p0, Lcom/daaw/tl$c;->nextParkedWorker:Ljava/lang/Object;

    sget-object p1, Lcom/daaw/z21;->p:Lcom/daaw/z21$a;

    invoke-virtual {p1}, Lcom/daaw/z21$a;->b()I

    move-result p1

    iput p1, p0, Lcom/daaw/tl$c;->t:I

    return-void
.end method

.method public constructor <init>(Lcom/daaw/tl;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    invoke-direct {p0, p1}, Lcom/daaw/tl$c;-><init>(Lcom/daaw/tl;)V

    invoke-virtual {p0, p2}, Lcom/daaw/tl$c;->o(I)V

    return-void
.end method

.method public static final synthetic a(Lcom/daaw/tl$c;)Lcom/daaw/tl;
    .locals 0

    iget-object p0, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    return-object p0
.end method


# virtual methods
.method public final b(I)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    sget-object v0, Lcom/daaw/tl;->y:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v1, -0x200000

    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    iget-object p1, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    sget-object v0, Lcom/daaw/tl$d;->t:Lcom/daaw/tl$d;

    if-eq p1, v0, :cond_1

    sget-object p1, Lcom/daaw/tl$d;->s:Lcom/daaw/tl$d;

    iput-object p1, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    :cond_1
    return-void
.end method

.method public final c(I)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object p1, Lcom/daaw/tl$d;->q:Lcom/daaw/tl$d;

    invoke-virtual {p0, p1}, Lcom/daaw/tl$c;->s(Lcom/daaw/tl$d;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    invoke-virtual {p1}, Lcom/daaw/tl;->W()V

    :cond_1
    return-void
.end method

.method public final d(Lcom/daaw/qj1;)V
    .locals 2

    iget-object v0, p1, Lcom/daaw/qj1;->q:Lcom/daaw/uj1;

    invoke-interface {v0}, Lcom/daaw/uj1;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/tl$c;->i(I)V

    invoke-virtual {p0, v0}, Lcom/daaw/tl$c;->c(I)V

    iget-object v1, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    invoke-virtual {v1, p1}, Lcom/daaw/tl;->T(Lcom/daaw/qj1;)V

    invoke-virtual {p0, v0}, Lcom/daaw/tl$c;->b(I)V

    return-void
.end method

.method public final e(Z)Lcom/daaw/qj1;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget p1, p1, Lcom/daaw/tl;->p:I

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/daaw/tl$c;->k(I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/tl$c;->m()Lcom/daaw/qj1;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/daaw/tl$c;->p:Lcom/daaw/ny1;

    invoke-virtual {v1}, Lcom/daaw/ny1;->h()Lcom/daaw/qj1;

    move-result-object v1

    if-nez v1, :cond_4

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lcom/daaw/tl$c;->m()Lcom/daaw/qj1;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    return-object p1

    :cond_4
    return-object v1

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/tl$c;->m()Lcom/daaw/qj1;

    move-result-object p1

    if-nez p1, :cond_7

    :cond_6
    :goto_2
    invoke-virtual {p0, v0}, Lcom/daaw/tl$c;->t(Z)Lcom/daaw/qj1;

    move-result-object p1

    :cond_7
    return-object p1
.end method

.method public final f(Z)Lcom/daaw/qj1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/tl$c;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/tl$c;->e(Z)Lcom/daaw/qj1;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/tl$c;->p:Lcom/daaw/ny1;

    invoke-virtual {p1}, Lcom/daaw/ny1;->h()Lcom/daaw/qj1;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-object p1, p1, Lcom/daaw/tl;->u:Lcom/daaw/r70;

    invoke-virtual {p1}, Lcom/daaw/zk0;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/qj1;

    :cond_2
    if-nez p1, :cond_3

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/tl$c;->t(Z)Lcom/daaw/qj1;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/daaw/tl$c;->indexInArray:I

    return v0
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tl$c;->nextParkedWorker:Ljava/lang/Object;

    return-object v0
.end method

.method public final i(I)V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/tl$c;->r:J

    iget-object p1, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    sget-object v0, Lcom/daaw/tl$d;->r:Lcom/daaw/tl$d;

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/daaw/tl$d;->q:Lcom/daaw/tl$d;

    iput-object p1, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    :cond_0
    return-void
.end method

.method public final j()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/tl$c;->nextParkedWorker:Ljava/lang/Object;

    sget-object v1, Lcom/daaw/tl;->A:Lcom/daaw/pi1;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k(I)I
    .locals 3

    iget v0, p0, Lcom/daaw/tl$c;->t:I

    shl-int/lit8 v1, v0, 0xd

    xor-int/2addr v0, v1

    shr-int/lit8 v1, v0, 0x11

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    xor-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/tl$c;->t:I

    add-int/lit8 v1, p1, -0x1

    and-int v2, v1, p1

    if-nez v2, :cond_0

    and-int p1, v0, v1

    return p1

    :cond_0
    const v1, 0x7fffffff

    and-int/2addr v0, v1

    rem-int/2addr v0, p1

    return v0
.end method

.method public final l()V
    .locals 6

    iget-wide v0, p0, Lcom/daaw/tl$c;->r:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v4, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-wide v4, v4, Lcom/daaw/tl;->r:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/daaw/tl$c;->r:J

    :cond_0
    iget-object v0, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-wide v0, v0, Lcom/daaw/tl;->r:J

    invoke-static {v0, v1}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/daaw/tl$c;->r:J

    sub-long/2addr v0, v4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    iput-wide v2, p0, Lcom/daaw/tl$c;->r:J

    invoke-virtual {p0}, Lcom/daaw/tl$c;->u()V

    :cond_1
    return-void
.end method

.method public final m()Lcom/daaw/qj1;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/tl$c;->k(I)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-object v0, v0, Lcom/daaw/tl;->t:Lcom/daaw/r70;

    invoke-virtual {v0}, Lcom/daaw/zk0;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qj1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-object v0, v0, Lcom/daaw/tl;->u:Lcom/daaw/r70;

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/zk0;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qj1;

    :cond_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-object v0, v0, Lcom/daaw/tl;->u:Lcom/daaw/r70;

    invoke-virtual {v0}, Lcom/daaw/zk0;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qj1;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-object v0, v0, Lcom/daaw/tl;->t:Lcom/daaw/r70;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final n()V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    :goto_1
    iget-object v2, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    invoke-virtual {v2}, Lcom/daaw/tl;->isTerminated()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    sget-object v3, Lcom/daaw/tl$d;->t:Lcom/daaw/tl$d;

    if-eq v2, v3, :cond_3

    iget-boolean v2, p0, Lcom/daaw/tl$c;->u:Z

    invoke-virtual {p0, v2}, Lcom/daaw/tl$c;->f(Z)Lcom/daaw/qj1;

    move-result-object v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_0

    iput-wide v3, p0, Lcom/daaw/tl$c;->s:J

    invoke-virtual {p0, v2}, Lcom/daaw/tl$c;->d(Lcom/daaw/qj1;)V

    goto :goto_0

    :cond_0
    iput-boolean v0, p0, Lcom/daaw/tl$c;->u:Z

    iget-wide v5, p0, Lcom/daaw/tl$c;->s:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_2

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/daaw/tl$d;->r:Lcom/daaw/tl$d;

    invoke-virtual {p0, v1}, Lcom/daaw/tl$c;->s(Lcom/daaw/tl$d;)Z

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    iget-wide v1, p0, Lcom/daaw/tl$c;->s:J

    invoke-static {v1, v2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    iput-wide v3, p0, Lcom/daaw/tl$c;->s:J

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/tl$c;->r()V

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/daaw/tl$d;->t:Lcom/daaw/tl$d;

    invoke-virtual {p0, v0}, Lcom/daaw/tl$c;->s(Lcom/daaw/tl$d;)Z

    return-void
.end method

.method public final o(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-object v1, v1, Lcom/daaw/tl;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-worker-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "TERMINATED"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iput p1, p0, Lcom/daaw/tl$c;->indexInArray:I

    return-void
.end method

.method public final p(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tl$c;->nextParkedWorker:Ljava/lang/Object;

    return-void
.end method

.method public final q()Z
    .locals 10

    iget-object v0, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    sget-object v1, Lcom/daaw/tl$d;->p:Lcom/daaw/tl$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    :goto_0
    const/4 v2, 0x1

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    :cond_1
    iget-wide v6, v0, Lcom/daaw/tl;->controlState:J

    const-wide v4, 0x7ffffc0000000000L

    and-long/2addr v4, v6

    const/16 v1, 0x2a

    shr-long/2addr v4, v1

    long-to-int v1, v4

    if-nez v1, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const-wide v4, 0x40000000000L

    sub-long v8, v6, v4

    sget-object v4, Lcom/daaw/tl;->y:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v5, v0

    invoke-virtual/range {v4 .. v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    sget-object v0, Lcom/daaw/tl$d;->p:Lcom/daaw/tl$d;

    iput-object v0, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    goto :goto_0

    :cond_3
    :goto_2
    return v2
.end method

.method public final r()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/tl$c;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    invoke-virtual {v0, p0}, Lcom/daaw/tl;->L(Lcom/daaw/tl$c;)Z

    return-void

    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/tl$c;->workerCtl:I

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/tl$c;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/daaw/tl$c;->workerCtl:I

    if-ne v1, v0, :cond_2

    iget-object v1, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    invoke-virtual {v1}, Lcom/daaw/tl;->isTerminated()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    sget-object v2, Lcom/daaw/tl$d;->t:Lcom/daaw/tl$d;

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/daaw/tl$d;->r:Lcom/daaw/tl$d;

    invoke-virtual {p0, v1}, Lcom/daaw/tl$c;->s(Lcom/daaw/tl$d;)Z

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    invoke-virtual {p0}, Lcom/daaw/tl$c;->l()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public run()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/tl$c;->n()V

    return-void
.end method

.method public final s(Lcom/daaw/tl$d;)Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    sget-object v1, Lcom/daaw/tl$d;->p:Lcom/daaw/tl$d;

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    sget-object v3, Lcom/daaw/tl;->y:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide v4, 0x40000000000L

    invoke-virtual {v3, v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    :cond_1
    if-eq v0, p1, :cond_2

    iput-object p1, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    :cond_2
    return v1
.end method

.method public final t(Z)Lcom/daaw/qj1;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-wide v1, v1, Lcom/daaw/tl;->controlState:J

    const-wide/32 v3, 0x1fffff

    and-long/2addr v1, v3

    long-to-int v2, v1

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-ge v2, v1, :cond_0

    return-object v3

    :cond_0
    invoke-virtual {v0, v2}, Lcom/daaw/tl$c;->k(I)I

    move-result v1

    iget-object v4, v0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    const/4 v5, 0x0

    const-wide v6, 0x7fffffffffffffffL

    move-wide v8, v6

    :cond_1
    :goto_0
    const-wide/16 v10, 0x0

    if-ge v5, v2, :cond_5

    add-int/lit8 v5, v5, 0x1

    const/4 v12, 0x1

    add-int/2addr v1, v12

    if-le v1, v2, :cond_2

    const/4 v1, 0x1

    :cond_2
    iget-object v12, v4, Lcom/daaw/tl;->v:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v12, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/daaw/tl$c;

    if-eqz v12, :cond_1

    if-eq v12, v0, :cond_1

    iget-object v13, v0, Lcom/daaw/tl$c;->p:Lcom/daaw/ny1;

    iget-object v12, v12, Lcom/daaw/tl$c;->p:Lcom/daaw/ny1;

    if-eqz p1, :cond_3

    invoke-virtual {v13, v12}, Lcom/daaw/ny1;->k(Lcom/daaw/ny1;)J

    move-result-wide v12

    goto :goto_1

    :cond_3
    invoke-virtual {v13, v12}, Lcom/daaw/ny1;->l(Lcom/daaw/ny1;)J

    move-result-wide v12

    :goto_1
    const-wide/16 v14, -0x1

    cmp-long v16, v12, v14

    if-nez v16, :cond_4

    iget-object v1, v0, Lcom/daaw/tl$c;->p:Lcom/daaw/ny1;

    invoke-virtual {v1}, Lcom/daaw/ny1;->h()Lcom/daaw/qj1;

    move-result-object v1

    return-object v1

    :cond_4
    cmp-long v14, v12, v10

    if-lez v14, :cond_1

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    goto :goto_0

    :cond_5
    cmp-long v1, v8, v6

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    move-wide v8, v10

    :goto_2
    iput-wide v8, v0, Lcom/daaw/tl$c;->s:J

    return-object v3
.end method

.method public final u()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/tl$c;->v:Lcom/daaw/tl;

    iget-object v1, v0, Lcom/daaw/tl;->v:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/tl;->isTerminated()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    :try_start_1
    iget-wide v2, v0, Lcom/daaw/tl;->controlState:J

    const-wide/32 v4, 0x1fffff

    and-long/2addr v2, v4

    long-to-int v3, v2

    iget v2, v0, Lcom/daaw/tl;->p:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt v3, v2, :cond_1

    monitor-exit v1

    return-void

    :cond_1
    :try_start_2
    sget-object v2, Lcom/daaw/tl$c;->w:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, -0x1

    const/4 v6, 0x1

    invoke-virtual {v2, p0, v3, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v2, :cond_2

    monitor-exit v1

    return-void

    :cond_2
    :try_start_3
    invoke-virtual {p0}, Lcom/daaw/tl$c;->g()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Lcom/daaw/tl$c;->o(I)V

    invoke-virtual {v0, p0, v2, v3}, Lcom/daaw/tl;->Q(Lcom/daaw/tl$c;II)V

    sget-object v3, Lcom/daaw/tl;->y:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v6

    and-long/2addr v4, v6

    long-to-int v3, v4

    if-eq v3, v2, :cond_3

    iget-object v4, v0, Lcom/daaw/tl;->v:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    check-cast v4, Lcom/daaw/tl$c;

    iget-object v5, v0, Lcom/daaw/tl;->v:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v5, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    invoke-virtual {v4, v2}, Lcom/daaw/tl$c;->o(I)V

    invoke-virtual {v0, v4, v3, v2}, Lcom/daaw/tl;->Q(Lcom/daaw/tl$c;II)V

    :cond_3
    iget-object v0, v0, Lcom/daaw/tl;->v:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    sget-object v0, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v1

    sget-object v0, Lcom/daaw/tl$d;->t:Lcom/daaw/tl$d;

    iput-object v0, p0, Lcom/daaw/tl$c;->q:Lcom/daaw/tl$d;

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
