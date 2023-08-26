.class final Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$EventDispatcher;
.super Ljava/lang/Object;
.source "ConcatenatingMediaSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "EventDispatcher"
.end annotation


# instance fields
.field public final eventHandler:Landroid/os/Handler;

.field public final runnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 697
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 698
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$EventDispatcher;->runnable:Ljava/lang/Runnable;

    .line 699
    new-instance p1, Landroid/os/Handler;

    .line 700
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :goto_0
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$EventDispatcher;->eventHandler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public dispatchEvent()V
    .locals 2

    .line 704
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$EventDispatcher;->eventHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$EventDispatcher;->runnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
