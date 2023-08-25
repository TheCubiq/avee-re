.class public final Lcom/daaw/ny1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Lcom/daaw/qj1;",
            ">;"
        }
    .end annotation
.end field

.field private volatile synthetic blockingTasksInBuffer:I

.field private volatile synthetic consumerIndex:I

.field private volatile synthetic lastScheduledTask:Ljava/lang/Object;

.field private volatile synthetic producerIndex:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/daaw/ny1;

    const-class v1, Ljava/lang/Object;

    const-string v2, "lastScheduledTask"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    sput-object v1, Lcom/daaw/ny1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v1, "producerIndex"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    sput-object v1, Lcom/daaw/ny1;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v1, "consumerIndex"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    sput-object v1, Lcom/daaw/ny1;->d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v1, "blockingTasksInBuffer"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/ny1;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/ny1;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ny1;->lastScheduledTask:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ny1;->producerIndex:I

    iput v0, p0, Lcom/daaw/ny1;->consumerIndex:I

    iput v0, p0, Lcom/daaw/ny1;->blockingTasksInBuffer:I

    return-void
.end method

.method public static synthetic b(Lcom/daaw/ny1;Lcom/daaw/qj1;ZILjava/lang/Object;)Lcom/daaw/qj1;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/daaw/ny1;->a(Lcom/daaw/qj1;Z)Lcom/daaw/qj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/qj1;Z)Lcom/daaw/qj1;
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/ny1;->c(Lcom/daaw/qj1;)Lcom/daaw/qj1;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/daaw/ny1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p2, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/qj1;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/ny1;->c(Lcom/daaw/qj1;)Lcom/daaw/qj1;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lcom/daaw/qj1;)Lcom/daaw/qj1;
    .locals 2

    iget-object v0, p1, Lcom/daaw/qj1;->q:Lcom/daaw/uj1;

    invoke-interface {v0}, Lcom/daaw/uj1;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    sget-object v0, Lcom/daaw/ny1;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ny1;->e()I

    move-result v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_2

    return-object p1

    :cond_2
    iget v0, p0, Lcom/daaw/ny1;->producerIndex:I

    and-int/2addr v0, v1

    :goto_1
    iget-object v1, p0, Lcom/daaw/ny1;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/daaw/ny1;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    sget-object p1, Lcom/daaw/ny1;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Lcom/daaw/qj1;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object p1, p1, Lcom/daaw/qj1;->q:Lcom/daaw/uj1;

    invoke-interface {p1}, Lcom/daaw/uj1;->b()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget-object p1, Lcom/daaw/ny1;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    :cond_1
    return-void
.end method

.method public final e()I
    .locals 2

    iget v0, p0, Lcom/daaw/ny1;->producerIndex:I

    iget v1, p0, Lcom/daaw/ny1;->consumerIndex:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ny1;->lastScheduledTask:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ny1;->e()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ny1;->e()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final g(Lcom/daaw/r70;)V
    .locals 2

    sget-object v0, Lcom/daaw/ny1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qj1;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Lcom/daaw/zk0;->a(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/ny1;->j(Lcom/daaw/r70;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final h()Lcom/daaw/qj1;
    .locals 2

    sget-object v0, Lcom/daaw/ny1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qj1;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ny1;->i()Lcom/daaw/qj1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final i()Lcom/daaw/qj1;
    .locals 5

    :cond_0
    :goto_0
    iget v0, p0, Lcom/daaw/ny1;->consumerIndex:I

    iget v1, p0, Lcom/daaw/ny1;->producerIndex:I

    sub-int v1, v0, v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    and-int/lit8 v1, v0, 0x7f

    sget-object v3, Lcom/daaw/ny1;->d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    add-int/lit8 v4, v0, 0x1

    invoke-virtual {v3, p0, v0, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ny1;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qj1;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Lcom/daaw/ny1;->d(Lcom/daaw/qj1;)V

    return-object v0
.end method

.method public final j(Lcom/daaw/r70;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ny1;->i()Lcom/daaw/qj1;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1, v0}, Lcom/daaw/zk0;->a(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final k(Lcom/daaw/ny1;)J
    .locals 8

    iget v0, p1, Lcom/daaw/ny1;->consumerIndex:I

    iget v1, p1, Lcom/daaw/ny1;->producerIndex:I

    iget-object v2, p1, Lcom/daaw/ny1;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    :goto_0
    const/4 v3, 0x1

    if-eq v0, v1, :cond_3

    and-int/lit8 v4, v0, 0x7f

    iget v5, p1, Lcom/daaw/ny1;->blockingTasksInBuffer:I

    if-nez v5, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/qj1;

    if-eqz v5, :cond_2

    iget-object v6, v5, Lcom/daaw/qj1;->q:Lcom/daaw/uj1;

    invoke-interface {v6}, Lcom/daaw/uj1;->b()I

    move-result v6

    const/4 v7, 0x0

    if-ne v6, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    const/4 v3, 0x0

    invoke-virtual {v2, v4, v5, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v0, Lcom/daaw/ny1;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    const/4 p1, 0x2

    invoke-static {p0, v5, v7, p1, v3}, Lcom/daaw/ny1;->b(Lcom/daaw/ny1;Lcom/daaw/qj1;ZILjava/lang/Object;)Lcom/daaw/qj1;

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    invoke-virtual {p0, p1, v3}, Lcom/daaw/ny1;->m(Lcom/daaw/ny1;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public final l(Lcom/daaw/ny1;)J
    .locals 3

    invoke-virtual {p1}, Lcom/daaw/ny1;->i()Lcom/daaw/qj1;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 p1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, p1, v2}, Lcom/daaw/ny1;->b(Lcom/daaw/ny1;Lcom/daaw/qj1;ZILjava/lang/Object;)Lcom/daaw/qj1;

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    invoke-virtual {p0, p1, v1}, Lcom/daaw/ny1;->m(Lcom/daaw/ny1;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public final m(Lcom/daaw/ny1;Z)J
    .locals 7

    :cond_0
    iget-object v0, p1, Lcom/daaw/ny1;->lastScheduledTask:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/qj1;

    const-wide/16 v1, -0x2

    if-nez v0, :cond_1

    return-wide v1

    :cond_1
    const/4 v3, 0x0

    if-eqz p2, :cond_3

    iget-object v4, v0, Lcom/daaw/qj1;->q:Lcom/daaw/uj1;

    invoke-interface {v4}, Lcom/daaw/uj1;->b()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    if-nez v5, :cond_3

    return-wide v1

    :cond_3
    sget-object v1, Lcom/daaw/ek1;->e:Lcom/daaw/u81;

    invoke-virtual {v1}, Lcom/daaw/u81;->a()J

    move-result-wide v1

    iget-wide v4, v0, Lcom/daaw/qj1;->p:J

    sub-long/2addr v1, v4

    sget-wide v4, Lcom/daaw/ek1;->a:J

    cmp-long v6, v1, v4

    if-gez v6, :cond_4

    sub-long/2addr v4, v1

    return-wide v4

    :cond_4
    sget-object v1, Lcom/daaw/ny1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v2, 0x0

    invoke-static {v1, p1, v0, v2}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x2

    invoke-static {p0, v0, v3, p1, v2}, Lcom/daaw/ny1;->b(Lcom/daaw/ny1;Lcom/daaw/qj1;ZILjava/lang/Object;)Lcom/daaw/qj1;

    const-wide/16 p1, -0x1

    return-wide p1
.end method
