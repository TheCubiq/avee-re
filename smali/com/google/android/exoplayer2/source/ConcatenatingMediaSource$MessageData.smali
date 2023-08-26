.class final Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$MessageData;
.super Ljava/lang/Object;
.source "ConcatenatingMediaSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "MessageData"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final actionOnCompletion:Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$EventDispatcher;

.field public final customData:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final index:I


# direct methods
.method public constructor <init>(ILjava/lang/Object;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    .line 715
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 716
    iput p1, p0, Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$MessageData;->index:I

    if-eqz p3, :cond_0

    .line 717
    new-instance p1, Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$EventDispatcher;

    invoke-direct {p1, p3}, Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$EventDispatcher;-><init>(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$MessageData;->actionOnCompletion:Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$EventDispatcher;

    .line 719
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource$MessageData;->customData:Ljava/lang/Object;

    return-void
.end method
