.class public Lcom/daaw/avee/Common/Events/WeakDelegate;
.super Ljava/lang/Object;
.source "WeakDelegate.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;
    }
.end annotation


# instance fields
.field listenerWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Common/Events/WeakDelegate;->listenerWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 15
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Common/Events/WeakDelegate;->listenerWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public invoke()V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/daaw/avee/Common/Events/WeakDelegate;->listenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;

    if-eqz v0, :cond_0

    .line 32
    invoke-interface {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;->invoke()V

    :cond_0
    return-void
.end method

.method public subscribeHoldWeak(Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;)Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;
    .locals 1

    .line 25
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Common/Events/WeakDelegate;->listenerWeak:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method public subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/daaw/avee/Common/Events/WeakDelegate;"
        }
    .end annotation

    .line 19
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/daaw/avee/Common/Events/WeakDelegate;->listenerWeak:Ljava/lang/ref/WeakReference;

    return-object p0
.end method
