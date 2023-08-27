.class public abstract Lcom/daaw/avee/Common/ResourcePool;
.super Ljava/lang/Object;
.source "ResourcePool.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private createdObjects:I

.field private final lock:Ljava/util/concurrent/locks/ReentrantLock;

.field private final pool:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "TT;>;"
        }
    .end annotation
.end field

.field private size:I


# direct methods
.method protected constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/Common/ResourcePool;-><init>(ILjava/lang/Boolean;)V

    return-void
.end method

.method protected constructor <init>(ILjava/lang/Boolean;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Common/ResourcePool;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/daaw/avee/Common/ResourcePool;->createdObjects:I

    .line 24
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(IZ)V

    iput-object v0, p0, Lcom/daaw/avee/Common/ResourcePool;->pool:Ljava/util/concurrent/BlockingQueue;

    .line 25
    iput p1, p0, Lcom/daaw/avee/Common/ResourcePool;->size:I

    .line 26
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    .line 27
    iget-object p1, p0, Lcom/daaw/avee/Common/ResourcePool;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :cond_0
    return-void
.end method


# virtual methods
.method public acquire()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/daaw/avee/Common/ResourcePool;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isLocked()Z

    move-result v0

    if-nez v0, :cond_2

    .line 33
    iget-object v0, p0, Lcom/daaw/avee/Common/ResourcePool;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 35
    :try_start_0
    iget v0, p0, Lcom/daaw/avee/Common/ResourcePool;->createdObjects:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/avee/Common/ResourcePool;->createdObjects:I

    .line 36
    invoke-virtual {p0}, Lcom/daaw/avee/Common/ResourcePool;->createObject()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    iget v1, p0, Lcom/daaw/avee/Common/ResourcePool;->createdObjects:I

    iget v2, p0, Lcom/daaw/avee/Common/ResourcePool;->size:I

    if-ge v1, v2, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/Common/ResourcePool;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    :cond_0
    return-object v0

    :catchall_0
    move-exception v0

    iget v1, p0, Lcom/daaw/avee/Common/ResourcePool;->createdObjects:I

    iget v2, p0, Lcom/daaw/avee/Common/ResourcePool;->size:I

    if-ge v1, v2, :cond_1

    iget-object v1, p0, Lcom/daaw/avee/Common/ResourcePool;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    :cond_1
    throw v0

    .line 42
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/Common/ResourcePool;->pool:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected abstract createObject()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public createPool()V
    .locals 3

    .line 52
    iget-object v0, p0, Lcom/daaw/avee/Common/ResourcePool;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isLocked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 53
    :goto_0
    iget v1, p0, Lcom/daaw/avee/Common/ResourcePool;->size:I

    if-ge v0, v1, :cond_0

    .line 54
    iget-object v1, p0, Lcom/daaw/avee/Common/ResourcePool;->pool:Ljava/util/concurrent/BlockingQueue;

    invoke-virtual {p0}, Lcom/daaw/avee/Common/ResourcePool;->createObject()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 55
    iget v1, p0, Lcom/daaw/avee/Common/ResourcePool;->createdObjects:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/avee/Common/ResourcePool;->createdObjects:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public recycle(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/daaw/avee/Common/ResourcePool;->pool:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method
