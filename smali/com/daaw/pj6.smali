.class public final Lcom/daaw/pj6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/Deque;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/Callable;

.field public final c:Lcom/daaw/g77;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Callable;Lcom/daaw/g77;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object v0, p0, Lcom/daaw/pj6;->a:Ljava/util/Deque;

    iput-object p1, p0, Lcom/daaw/pj6;->b:Ljava/util/concurrent/Callable;

    iput-object p2, p0, Lcom/daaw/pj6;->c:Lcom/daaw/g77;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Lcom/daaw/f77;
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/daaw/pj6;->c(I)V

    iget-object v0, p0, Lcom/daaw/pj6;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/f77;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b(Lcom/daaw/f77;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/pj6;->a:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c(I)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/pj6;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v0

    sub-int/2addr p1, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Lcom/daaw/pj6;->a:Ljava/util/Deque;

    iget-object v2, p0, Lcom/daaw/pj6;->c:Lcom/daaw/g77;

    iget-object v3, p0, Lcom/daaw/pj6;->b:Ljava/util/concurrent/Callable;

    invoke-interface {v2, v3}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
