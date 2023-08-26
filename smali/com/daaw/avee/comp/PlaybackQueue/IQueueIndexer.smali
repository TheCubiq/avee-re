.class public interface abstract Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;
.super Ljava/lang/Object;
.source "IQueueIndexer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;
    }
.end annotation


# virtual methods
.method public abstract getCurrentSongIndex(Z)I
.end method

.method public abstract getNextSongIndex(Z)I
.end method

.method public abstract getPrevSongIndex(Z)I
.end method

.method public abstract getQueueIndex()I
.end method

.method public abstract getQueueIndexCount(I)I
.end method

.method public abstract getSongIndexByQueueIndex(II)I
.end method

.method public abstract goTo(I)V
.end method

.method public abstract goToNext(I)Z
.end method

.method public abstract goToPrev()V
.end method

.method public abstract goToStart()V
.end method

.method public abstract onQueueChanged(IIIZI)Z
.end method

.method public abstract onQueueChanged(Ljava/util/List;IIZI)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIZI)Z"
        }
    .end annotation
.end method

.method public abstract setQueuePosBySongIndex(I)V
.end method
