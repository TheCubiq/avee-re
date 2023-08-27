.class public Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;
.super Ljava/lang/Object;
.source "QueueItemIdentifier.java"

# interfaces
.implements Lcom/daaw/avee/comp/Common/IItemIdentifier;


# instance fields
.field private queueIndex:I

.field private queueSlot:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 19
    iput v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->queueIndex:I

    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->queueSlot:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 24
    iput v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->queueIndex:I

    .line 25
    iput p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->queueSlot:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 30
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getQueueIndex()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->queueIndex:I

    return v0
.end method

.method public getQueueSlot()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->queueSlot:I

    return v0
.end method

.method public setQueueIndex(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->queueIndex:I

    return-void
.end method

.method public setQueueSlot(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->queueSlot:I

    return-void
.end method
