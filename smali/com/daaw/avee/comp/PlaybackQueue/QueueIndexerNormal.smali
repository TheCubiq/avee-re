.class public Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;
.super Ljava/lang/Object;
.source "QueueIndexerNormal.java"

# interfaces
.implements Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;


# instance fields
.field private currentQueueIndex:I

.field private indexesListener:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->indexesListener:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    return-void
.end method


# virtual methods
.method public getCurrentSongIndex(Z)I
    .locals 0

    .line 86
    iget p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    return p1
.end method

.method public getNextSongIndex(Z)I
    .locals 0

    .line 90
    iget p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public getPrevSongIndex(Z)I
    .locals 0

    .line 82
    iget p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public getQueueIndex()I
    .locals 1

    .line 120
    iget v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    return v0
.end method

.method public getQueueIndexCount(I)I
    .locals 0

    return p1
.end method

.method public getSongIndexByQueueIndex(II)I
    .locals 0

    return p1
.end method

.method public goTo(I)V
    .locals 0

    .line 94
    iput p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    return-void
.end method

.method public goToNext(I)Z
    .locals 2

    const/4 v0, 0x0

    .line 102
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->getNextSongIndex(Z)I

    move-result v1

    iput v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    if-lt v1, p1, :cond_0

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    .line 105
    iput p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    :cond_0
    return v0
.end method

.method public goToPrev()V
    .locals 2

    const/4 v0, 0x0

    .line 115
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->getPrevSongIndex(Z)I

    move-result v1

    iput v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    if-gez v1, :cond_0

    .line 116
    iput v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    :cond_0
    return-void
.end method

.method public goToStart()V
    .locals 1

    const/4 v0, 0x0

    .line 98
    iput v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    return-void
.end method

.method public init(ILcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;)V
    .locals 1

    .line 21
    iput-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->indexesListener:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    .line 23
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->setQueuePosBySongIndex(I)V

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    .line 26
    invoke-interface {p2, p0, v0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;->onQueueIndexesChanged(Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;ZZ)V

    :cond_0
    return-void
.end method

.method public onQueueChanged(IIIZI)Z
    .locals 1

    .line 33
    iget v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    invoke-static {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->fixQueueIndex_(IIIIZ)I

    move-result p2

    iput p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    const/4 p3, 0x0

    const/4 p4, 0x1

    if-gez p2, :cond_0

    sub-int/2addr p1, p4

    .line 37
    iput p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 40
    :goto_0
    iget p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    if-gez p2, :cond_1

    .line 42
    iput p3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    const/4 p1, 0x1

    .line 44
    :cond_1
    iget p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    if-lt p2, p5, :cond_2

    sub-int/2addr p5, p4

    .line 46
    iput p5, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    const/4 p1, 0x1

    .line 49
    :cond_2
    iget-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->indexesListener:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;

    if-eqz p2, :cond_3

    .line 50
    invoke-interface {p2, p0, p4, p1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;->onQueueIndexesChanged(Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;ZZ)V

    :cond_3
    return p1
.end method

.method public onQueueChanged(Ljava/util/List;IIZI)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIZI)Z"
        }
    .end annotation

    .line 59
    iget v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    invoke-static {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->fixQueueIndex(ILjava/util/List;IIZ)I

    move-result p2

    iput p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-gez p2, :cond_0

    .line 63
    invoke-static {p2, p1, p3}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->fixRemovedQueueIndex(ILjava/util/List;I)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 66
    :goto_0
    iget p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    if-gez p2, :cond_1

    .line 68
    iput p4, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    const/4 p1, 0x1

    .line 70
    :cond_1
    iget p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    if-lt p2, p5, :cond_2

    sub-int/2addr p5, v0

    .line 72
    iput p5, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    const/4 p1, 0x1

    .line 75
    :cond_2
    iget-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->indexesListener:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;

    if-eqz p2, :cond_3

    .line 76
    invoke-interface {p2, p0, v0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;->onQueueIndexesChanged(Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;ZZ)V

    :cond_3
    return p1
.end method

.method public setQueuePosBySongIndex(I)V
    .locals 0

    .line 124
    iput p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->currentQueueIndex:I

    return-void
.end method
