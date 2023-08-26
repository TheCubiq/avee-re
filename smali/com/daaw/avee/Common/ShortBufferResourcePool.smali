.class public Lcom/daaw/avee/Common/ShortBufferResourcePool;
.super Ljava/lang/Object;
.source "ShortBufferResourcePool.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;
    }
.end annotation


# instance fields
.field private final pool:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(IZ)V

    iput-object v0, p0, Lcom/daaw/avee/Common/ShortBufferResourcePool;->pool:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method


# virtual methods
.method public acquire(IJ)Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;
    .locals 2

    .line 62
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/Common/ShortBufferResourcePool;->pool:Ljava/util/concurrent/BlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p2, p3, v1}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

    if-eqz p2, :cond_0

    .line 63
    iget-object p3, p2, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;->obj:[S

    array-length p3, p3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p3, p1, :cond_0

    return-object p2

    .line 68
    :catch_0
    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/avee/Common/ShortBufferResourcePool;->createObject(I)Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

    move-result-object p1

    return-object p1
.end method

.method protected createObject(I)Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;
    .locals 1

    .line 46
    new-instance v0, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

    new-array p1, p1, [S

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;-><init>(Lcom/daaw/avee/Common/ShortBufferResourcePool;[S)V

    return-object v0
.end method

.method public recycle(Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/daaw/avee/Common/ShortBufferResourcePool;->pool:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    return-void
.end method
