.class public Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;
.super Ljava/lang/Object;
.source "QueueCore.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/MediaPlaybackServiceDefs;
.implements Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;


# static fields
.field private static final createInstanceLock:Ljava/lang/Object;

.field private static volatile instance:Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

.field public static onQueuePosChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent5<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static onQueueStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestShouldReloadInitalSongs:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onShuffleModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private playList:Lcom/daaw/avee/Common/MultiList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field private queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

.field private shuffleMode:I

.field private songContainerIdentifier:Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onRequestShouldReloadInitalSongs:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 39
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent5;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    .line 40
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 41
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onShuffleModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 44
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createInstanceLock:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 46
    sput-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->instance:Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->songContainerIdentifier:Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    .line 48
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v0}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    .line 49
    new-instance v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;

    invoke-direct {v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    const/4 v0, -0x1

    .line 50
    iput v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->shuffleMode:I

    const/4 v0, 0x0

    .line 53
    invoke-virtual {p0, v0, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->setShuffleMode(IZ)V

    .line 54
    invoke-virtual {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->reloadQueue()V

    return-void
.end method

.method private addToPlayList(Ljava/util/Collection;IZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;IZ)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;IZ",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            "IZ)I"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 213
    iget-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList;->clear()V

    const/4 p2, 0x0

    .line 217
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v1

    if-le p2, v1, :cond_1

    .line 218
    iget-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p2

    .line 221
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 222
    :goto_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 223
    new-instance v2, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;

    invoke-direct {v2, p5}, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;-><init>(I)V

    invoke-interface {v1, v0, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 225
    :cond_2
    iget-object p5, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p5, p2, p1, v1}, Lcom/daaw/avee/Common/MultiList;->addAll(ILjava/util/Collection;Ljava/util/Collection;)Z

    if-eqz p3, :cond_3

    .line 228
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    add-int v3, p2, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    move v2, p2

    move-object v6, p4

    move v8, p6

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged2(IIIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;ZZ)V

    goto :goto_1

    .line 230
    :cond_3
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    add-int/2addr p1, p2

    add-int/lit8 v3, p1, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move v2, p2

    move v8, p6

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged2(IIIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;ZZ)V

    :goto_1
    return p2
.end method

.method public static createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;
    .locals 2

    .line 58
    sget-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->instance:Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    if-eqz v0, :cond_0

    return-object v0

    .line 61
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createInstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 62
    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->instance:Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    if-nez v1, :cond_1

    .line 64
    new-instance v1, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    invoke-direct {v1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;-><init>()V

    .line 65
    sput-object v1, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->instance:Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    .line 68
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 69
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private findPlaylistEntryByItemIdent(Lcom/daaw/avee/comp/Common/IItemIdentifier;I)I
    .locals 4

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ltz p2, :cond_1

    .line 503
    iget-object v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    .line 504
    iget-object v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v1, p2}, Lcom/daaw/avee/Common/MultiList;->get(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v1

    .line 505
    iget-object v2, v1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    if-eqz v2, :cond_1

    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return p2

    .line 510
    :cond_1
    iget-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList;->multiListIterator()Lcom/daaw/avee/Common/MultiList$ListIterator;

    move-result-object p2

    :cond_2
    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList$ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 511
    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList$ListIterator;->nextIndex()I

    move-result v1

    .line 512
    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList$ListIterator;->next()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v2

    .line 514
    iget-object v3, v2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    if-eqz v3, :cond_2

    iget-object v2, v2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return v1

    :cond_3
    return v0
.end method

.method static fixQueueIndex(ILjava/util/List;IIZ)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIZ)I"
        }
    .end annotation

    if-eqz p4, :cond_3

    .line 771
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    .line 772
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, p2

    if-ne v0, p0, :cond_1

    .line 773
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/2addr p0, p3

    return p0

    .line 775
    :cond_1
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, p3

    if-ne v0, p0, :cond_0

    .line 776
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/2addr p0, p2

    :cond_2
    return p0

    :cond_3
    if-ltz p3, :cond_7

    .line 784
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    move v0, p0

    :cond_4
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 785
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v2, p3

    if-ge v2, p0, :cond_5

    add-int/lit8 v0, v0, -0x1

    .line 788
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v2, p3

    if-ne v2, p0, :cond_4

    if-ltz p2, :cond_6

    .line 790
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/2addr p0, p2

    return p0

    :cond_6
    const/4 p0, -0x1

    return p0

    :cond_7
    move v0, p0

    :cond_8
    if-ltz p2, :cond_a

    .line 798
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    .line 799
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    add-int/2addr p3, p2

    if-gt p3, p0, :cond_9

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_a
    return v0
.end method

.method static fixQueueIndexSingle(III)I
    .locals 0

    if-ge p0, p1, :cond_0

    return p0

    :cond_0
    add-int/2addr p0, p2

    if-gt p0, p1, :cond_1

    const/4 p0, -0x1

    :cond_1
    return p0
.end method

.method static fixQueueIndex_(IIIIZ)I
    .locals 0

    if-eqz p4, :cond_2

    if-ne p0, p2, :cond_0

    return p1

    :cond_0
    if-ne p0, p1, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    if-ge p0, p1, :cond_3

    return p0

    :cond_3
    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    mul-int p3, p3, p2

    add-int/2addr p0, p3

    if-gt p0, p1, :cond_4

    const/4 p0, -0x1

    :cond_4
    return p0
.end method

.method static fixRemovedQueueIndex(ILjava/util/List;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)I"
        }
    .end annotation

    .line 755
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_1

    add-int v0, p1, p2

    if-ne v0, p0, :cond_0

    add-int/lit8 p0, p0, -0x1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    if-gez p0, :cond_2

    const/4 p0, 0x0

    :cond_2
    return p0
.end method

.method static fixRemovedQueueIndexSingle(II)I
    .locals 2

    .line 746
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 747
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 748
    invoke-static {p0, v0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->fixRemovedQueueIndex(ILjava/util/List;I)I

    move-result p0

    return p0
.end method

.method private getResources()Landroid/content/res/Resources;
    .locals 1

    .line 88
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 91
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method private notifyMessage(Ljava/lang/String;)V
    .locals 1

    .line 95
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method private notifyQueueChange()V
    .locals 3

    .line 100
    invoke-virtual {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getQueue()Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    .line 101
    sget-object v1, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    iget-object v2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->songContainerIdentifier:Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private saveQueue(Landroid/content/Context;)V
    .locals 5

    .line 527
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 528
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 531
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 532
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 534
    iget-object v2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 536
    iget-object v4, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v4, v3}, Lcom/daaw/avee/Common/MultiList;->get1(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getConstrucPath()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 538
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v4, 0x2c

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 543
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "queue"

    invoke-interface {p1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 544
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "queueSizes"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 547
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    invoke-interface {v0}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getQueueIndex()I

    move-result v0

    const-string v1, "curpos"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 548
    iget v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->shuffleMode:I

    const-string v1, "shufflemode"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 549
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public enqueue(Ljava/util/Collection;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;II)V"
        }
    .end annotation

    const/4 v2, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v6, p3

    .line 245
    invoke-virtual/range {v0 .. v7}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->open(Ljava/util/Collection;IILcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;Ljava/lang/Object;IZ)V

    return-void
.end method

.method public getCurrentQueueEntry()Lcom/daaw/avee/Common/Tuple2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;"
        }
    .end annotation

    .line 467
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result v0

    :goto_0
    if-ltz v0, :cond_1

    .line 469
    iget-object v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    .line 470
    invoke-virtual {v1, v0}, Lcom/daaw/avee/Common/MultiList;->get(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public getQueue()Lcom/daaw/avee/Common/MultiList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;"
        }
    .end annotation

    .line 412
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->unmodifiableList()Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    return-object v0
.end method

.method public getQueue1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation

    .line 408
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->unmodifiableList1()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getQueuePosition()I
    .locals 2

    .line 478
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result v0

    return v0
.end method

.method public getShuffleMode()I
    .locals 1

    .line 174
    iget v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->shuffleMode:I

    return v0
.end method

.method public getSongContainerIdentifier()Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;
    .locals 1

    .line 474
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->songContainerIdentifier:Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    return-object v0
.end method

.method public isNextPlaylistEnd()Z
    .locals 3

    .line 609
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getNextSongIndex(Z)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 612
    iget-object v2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v2

    if-lt v0, v2, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public moveQueueItems(IILjava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .line 378
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/daaw/avee/Common/Tuple2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 380
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 381
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 382
    new-instance v4, Lcom/daaw/avee/Common/Tuple2;

    iget-object v5, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    add-int/2addr v3, p1

    invoke-virtual {v5, v3}, Lcom/daaw/avee/Common/MultiList;->get1(I)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v6, v3}, Lcom/daaw/avee/Common/MultiList;->get2(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v4, v0, v2

    .line 383
    aget-object v3, v0, v2

    iget-object v3, v3, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v3, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-interface {v3, p4}, Lcom/daaw/avee/comp/Common/IItemIdentifier;->setQueueSlot(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 386
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    :goto_1
    if-ltz p4, :cond_1

    .line 387
    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 388
    iget-object v3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    add-int/2addr v2, p1

    invoke-virtual {v3, v2}, Lcom/daaw/avee/Common/MultiList;->remove(I)Lcom/daaw/avee/Common/Tuple2;

    add-int/lit8 p4, p4, -0x1

    goto :goto_1

    .line 391
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    :goto_2
    if-ltz p4, :cond_2

    .line 392
    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 393
    iget-object v3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v3}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v3

    add-int/2addr v2, p2

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 394
    iget-object v3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    aget-object v4, v0, p4

    invoke-virtual {v3, v2, v4}, Lcom/daaw/avee/Common/MultiList;->add(ILcom/daaw/avee/Common/Tuple2;)V

    add-int/lit8 p4, p4, -0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p3

    move v4, p2

    move v5, p1

    .line 397
    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged22(Ljava/util/List;IIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method

.method public next()V
    .locals 1

    const/4 v0, 0x0

    .line 676
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->next(Ljava/lang/Object;)V

    return-void
.end method

.method public next(Ljava/lang/Object;)V
    .locals 3

    .line 640
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    iget-object v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->goToNext(I)Z

    move-result v0

    .line 641
    iget-object v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result v1

    .line 643
    invoke-virtual {p0, v1, v0, v2, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged(IZZLjava/lang/Object;)V

    return-void
.end method

.method public nextOrFirst()V
    .locals 1

    const/4 v0, 0x0

    .line 680
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->nextOrFirst(Ljava/lang/Object;)V

    return-void
.end method

.method public nextOrFirst(Ljava/lang/Object;)V
    .locals 1

    .line 649
    invoke-virtual {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->isNextPlaylistEnd()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 650
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playFirst(Ljava/lang/Object;)V

    goto :goto_0

    .line 652
    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->next(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onDataSaveTime(Landroid/content/Context;)V
    .locals 0

    .line 523
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->saveQueue(Landroid/content/Context;)V

    return-void
.end method

.method onQueueChanged2(IIIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 416
    invoke-virtual/range {v0 .. v7}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged2(IIIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;ZZ)V

    return-void
.end method

.method onQueueChanged2(IIIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;ZZ)V
    .locals 7

    .line 422
    iput-object p5, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->songContainerIdentifier:Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    if-le p1, p2, :cond_0

    return-void

    :cond_0
    const/4 p5, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 426
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v0

    const/4 v6, 0x1

    if-lt p2, v0, :cond_2

    iget-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p2

    sub-int/2addr p2, v6

    :cond_2
    if-eqz p6, :cond_3

    .line 429
    invoke-virtual {p0, p5, v6}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->setShuffleMode(IZ)V

    .line 431
    :cond_3
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    iget-object v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v5

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->onQueueChanged(IIIZI)Z

    if-nez p4, :cond_6

    if-eqz p7, :cond_6

    sub-int/2addr p2, p1

    add-int/2addr p2, v6

    .line 437
    invoke-direct {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_6

    if-ne p3, v6, :cond_4

    .line 441
    invoke-direct {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0e000c

    new-array p4, v6, [Ljava/lang/Object;

    .line 442
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    aput-object p6, p4, p5

    .line 441
    invoke-virtual {p1, p3, p2, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 443
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    const/4 p1, -0x1

    if-ne p3, p1, :cond_5

    .line 445
    invoke-direct {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0e000f

    new-array p4, v6, [Ljava/lang/Object;

    .line 446
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    aput-object p6, p4, p5

    .line 445
    invoke-virtual {p1, p3, p2, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 447
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    if-nez p3, :cond_6

    if-eqz p6, :cond_6

    .line 450
    invoke-direct {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0e000e

    new-array p4, v6, [Ljava/lang/Object;

    .line 451
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    aput-object p6, p4, p5

    .line 450
    invoke-virtual {p1, p3, p2, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 452
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :cond_6
    :goto_0
    return-void
.end method

.method onQueueChanged22(Ljava/util/List;IIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIZ",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ")V"
        }
    .end annotation

    .line 461
    iput-object p5, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->songContainerIdentifier:Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    .line 462
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    iget-object p5, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p5}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v5

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->onQueueChanged(Ljava/util/List;IIZI)Z

    return-void
.end method

.method public onQueueIndexesChanged(Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;ZZ)V
    .locals 4

    .line 187
    iget-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 189
    iget-object v2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v2, v1}, Lcom/daaw/avee/Common/MultiList;->get2(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->setQueueIndex(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 192
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getQueueIndexCount(I)I

    move-result p2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p2, :cond_2

    .line 195
    iget-object v2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v2

    invoke-interface {p1, v1, v2}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getSongIndexByQueueIndex(II)I

    move-result v2

    .line 196
    iget-object v3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v3}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 197
    iget-object v3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v3, v2}, Lcom/daaw/avee/Common/MultiList;->get2(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;

    .line 199
    invoke-virtual {v2, v1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;->setQueueIndex(I)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 203
    :cond_2
    invoke-direct {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->notifyQueueChange()V

    if-eqz p3, :cond_3

    .line 205
    iget-object p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result p1

    const/4 p2, 0x0

    .line 206
    invoke-virtual {p0, p1, v0, v0, p2}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged(IZZLjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method onQueuePosChanged(IZZLjava/lang/Object;)V
    .locals 7

    if-ltz p1, :cond_0

    .line 686
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    .line 687
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    .line 688
    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/MultiList;->get(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v2, v0

    .line 691
    sget-object v1, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method onQueuePosChangedPreview(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;ZZLjava/lang/Object;)V
    .locals 6

    .line 696
    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;

    const/4 v2, -0x1

    invoke-direct {v0, v2}, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;-><init>(I)V

    invoke-direct {v1, p1, v0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 698
    sget-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public open(Ljava/util/Collection;IILcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;Ljava/lang/Object;IZ)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;II",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            "Ljava/lang/Object;",
            "IZ)V"
        }
    .end annotation

    move-object v7, p0

    move v0, p3

    const v1, 0x7fffffff

    const/4 v8, 0x0

    const/4 v2, -0x1

    const/4 v9, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_1

    :cond_0
    if-nez v0, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    if-ne v0, v9, :cond_2

    :goto_0
    const v2, 0x7fffffff

    goto :goto_1

    :cond_2
    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    .line 266
    iget-object v0, v7, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    invoke-interface {v0, v9}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result v0

    add-int/2addr v0, v9

    move v2, v0

    goto :goto_1

    :cond_3
    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    if-gez v2, :cond_5

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move/from16 v5, p6

    move/from16 v6, p7

    .line 272
    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->addToPlayList(Ljava/util/Collection;IZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;IZ)I

    move-result v0

    if-ltz p2, :cond_6

    .line 280
    iget-object v1, v7, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    add-int/2addr v0, p2

    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->goTo(I)V

    .line 282
    iget-object v0, v7, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    invoke-interface {v0, v9}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result v0

    move-object v1, p5

    .line 283
    invoke-virtual {p0, v0, v8, v9, p5}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged(IZZLjava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public open(Ljava/util/List;IILcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;II",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ")V"
        }
    .end annotation

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 656
    invoke-virtual/range {v0 .. v7}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->open(Ljava/util/Collection;IILcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;Ljava/lang/Object;IZ)V

    return-void
.end method

.method public playCurrent()V
    .locals 1

    const/4 v0, 0x0

    .line 668
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playCurrent(Ljava/lang/Object;)V

    return-void
.end method

.method public playCurrent(Ljava/lang/Object;)V
    .locals 3

    .line 626
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result v0

    const/4 v2, 0x0

    .line 627
    invoke-virtual {p0, v0, v2, v1, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged(IZZLjava/lang/Object;)V

    return-void
.end method

.method public playFirst()V
    .locals 1

    const/4 v0, 0x0

    .line 664
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playFirst(Ljava/lang/Object;)V

    return-void
.end method

.method public playFirst(Ljava/lang/Object;)V
    .locals 3

    .line 617
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    invoke-interface {v0}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->goToStart()V

    .line 619
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result v0

    const/4 v2, 0x0

    .line 620
    invoke-virtual {p0, v0, v2, v1, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged(IZZLjava/lang/Object;)V

    return-void
.end method

.method public prev()V
    .locals 1

    const/4 v0, 0x0

    .line 672
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->prev(Ljava/lang/Object;)V

    return-void
.end method

.method public prev(Ljava/lang/Object;)V
    .locals 3

    .line 631
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    invoke-interface {v0}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->goToPrev()V

    .line 633
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result v0

    const/4 v2, 0x0

    .line 634
    invoke-virtual {p0, v0, v2, v1, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged(IZZLjava/lang/Object;)V

    return-void
.end method

.method public previewOpen(Ljava/util/List;ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;I",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-ltz p2, :cond_0

    .line 179
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 180
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    const/4 p2, 0x0

    const/4 v0, 0x1

    .line 181
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChangedPreview(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;ZZLjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public reloadQueue()V
    .locals 14

    const-string v0, "reloadQueue"

    .line 554
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 555
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 558
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, ""

    const-string v3, "queue"

    .line 563
    invoke-static {v1, v3, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "queueSizes"

    .line 564
    invoke-static {v1, v4, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 567
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 568
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 570
    :goto_1
    iget-object v7, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v7}, Lcom/daaw/avee/Common/MultiList;->clear()V

    const/4 v7, 0x1

    if-le v5, v7, :cond_3

    if-lez v6, :cond_3

    const-string v5, ","

    .line 573
    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 576
    array-length v5, v2

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_2
    if-ge v6, v5, :cond_3

    aget-object v9, v2, v6

    .line 577
    invoke-static {v9}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result v9

    add-int/2addr v9, v8

    .line 578
    invoke-virtual {v3, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 579
    iget-object v10, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    new-instance v11, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {v11, v8}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(Ljava/lang/String;)V

    new-instance v8, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;

    invoke-direct {v8}, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;-><init>()V

    invoke-virtual {v10, v11, v8}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    move v8, v9

    goto :goto_2

    .line 584
    :cond_3
    iget-object v2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onRequestShouldReloadInitalSongs:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x1e

    .line 585
    invoke-static {v0, v2}, Lcom/daaw/avee/Common/UtilsMusic;->getMostRecentTrackListByCount(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v0

    .line 586
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMostRecentTrackListByCount: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 588
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 589
    iget-object v3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    new-instance v5, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;

    invoke-direct {v5}, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;-><init>()V

    invoke-virtual {v3, v2, v5}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    const-string v0, "curpos"

    .line 592
    invoke-static {v1, v0, v4}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetIntSafe(Landroid/content/SharedPreferences;Ljava/lang/String;I)I

    move-result v0

    .line 594
    iget-object v2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    invoke-interface {v2, v0}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->goTo(I)V

    const-string v0, "shufflemode"

    .line 597
    invoke-static {v1, v0, v4}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetIntSafe(Landroid/content/SharedPreferences;Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v7, :cond_5

    const/4 v0, 0x0

    .line 603
    :cond_5
    invoke-virtual {p0, v0, v4, v7}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->setShuffleMode(IZZ)V

    const/4 v9, 0x0

    .line 605
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, p0

    invoke-virtual/range {v8 .. v13}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged2(IIIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method

.method public removeQueueItems(I)V
    .locals 6

    .line 290
    new-instance v1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 295
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->multiListIterator()Lcom/daaw/avee/Common/MultiList$ListIterator;

    move-result-object v0

    .line 296
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 297
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->nextIndex()I

    move-result v2

    .line 298
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->next()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v3

    .line 299
    iget-object v3, v3, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v3, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-interface {v3}, Lcom/daaw/avee/comp/Common/IItemIdentifier;->getQueueSlot()I

    move-result v3

    if-ne p1, v3, :cond_0

    .line 300
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->remove()V

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 306
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged22(Ljava/util/List;IIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method

.method public removeQueueItems(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;)V"
        }
    .end annotation

    .line 311
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    .line 316
    iget-object v2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList;->multiListIterator()Lcom/daaw/avee/Common/MultiList$ListIterator;

    move-result-object v2

    .line 317
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList$ListIterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 318
    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList$ListIterator;->nextIndex()I

    move-result v3

    .line 319
    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList$ListIterator;->next()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v4

    .line 320
    iget-object v4, v4, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 321
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 322
    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList$ListIterator;->remove()V

    goto :goto_0

    :cond_2
    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 327
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged22(Ljava/util/List;IIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method

.method public removeTrack(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)I
    .locals 9

    .line 350
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->multiListIterator()Lcom/daaw/avee/Common/MultiList$ListIterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 351
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->nextIndex()I

    move-result v5

    .line 352
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->next1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 354
    invoke-virtual {v2, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->compare(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 355
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->remove()V

    add-int/lit8 v1, v1, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    move v4, v5

    .line 358
    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged2(IIIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    goto :goto_0

    :cond_1
    return v1
.end method

.method public removeTracks(II)I
    .locals 7

    const/4 v0, 0x0

    if-ge p2, p1, :cond_0

    return v0

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 334
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v0

    if-lt p2, v0, :cond_2

    iget-object p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    .line 338
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    add-int/lit8 v1, p2, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/MultiList;->subList(II)Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->clear()V

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move v2, p1

    move v3, p2

    .line 339
    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged2(IIIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    return p2
.end method

.method public setQueueItem(Lcom/daaw/avee/comp/Common/IItemIdentifier;)V
    .locals 1

    const/4 v0, 0x0

    .line 660
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->setQueueItem(Lcom/daaw/avee/comp/Common/IItemIdentifier;Ljava/lang/Object;)V

    return-void
.end method

.method public setQueueItem(Lcom/daaw/avee/comp/Common/IItemIdentifier;Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 495
    :cond_0
    invoke-interface {p1}, Lcom/daaw/avee/comp/Common/IItemIdentifier;->getQueueIndex()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->findPlaylistEntryByItemIdent(Lcom/daaw/avee/comp/Common/IItemIdentifier;I)I

    move-result p1

    .line 496
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->setQueuePosition(ILjava/lang/Object;)V

    return-void
.end method

.method public setQueueItemSlot(Lcom/daaw/avee/comp/Common/IItemIdentifier;I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 401
    invoke-interface {p1}, Lcom/daaw/avee/comp/Common/IItemIdentifier;->getQueueSlot()I

    move-result v0

    if-eq v0, p2, :cond_0

    .line 402
    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/Common/IItemIdentifier;->setQueueSlot(I)V

    .line 403
    invoke-direct {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->notifyQueueChange()V

    :cond_0
    return-void
.end method

.method public setQueuePosition(I)V
    .locals 1

    const/4 v0, 0x0

    .line 482
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->setQueuePosition(ILjava/lang/Object;)V

    return-void
.end method

.method public setQueuePosition(ILjava/lang/Object;)V
    .locals 2

    .line 486
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->setQueuePosBySongIndex(I)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 487
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged(IZZLjava/lang/Object;)V

    return-void
.end method

.method public setShuffleMode(IZ)V
    .locals 1

    const/4 v0, 0x0

    .line 105
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->setShuffleMode(IZZ)V

    return-void
.end method

.method public setShuffleMode(IZZ)V
    .locals 6

    if-nez p3, :cond_0

    .line 110
    iget p3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->shuffleMode:I

    if-ne p3, p1, :cond_0

    return-void

    .line 112
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->shuffleMode:I

    .line 114
    iget-object p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;->getCurrentSongIndex(Z)I

    move-result p1

    .line 116
    :goto_0
    iget v1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->shuffleMode:I

    if-nez v1, :cond_2

    .line 117
    new-instance p3, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;

    invoke-direct {p3}, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;-><init>()V

    iput-object p3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    .line 118
    check-cast p3, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;

    invoke-virtual {p3, p1, p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerNormal;->init(ILcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;)V

    if-eqz p2, :cond_8

    .line 121
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_8

    const p2, 0x7f100111

    .line 123
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->notifyMessage(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_2
    if-ne v1, v0, :cond_8

    .line 127
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v2}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-gez p1, :cond_3

    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    move v3, p1

    .line 132
    :goto_1
    iget-object v4, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v4}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v4

    if-le v3, v4, :cond_4

    iget-object v3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v3}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v3

    sub-int/2addr v3, v0

    :cond_4
    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_5

    .line 136
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 139
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v3, v0

    .line 142
    :goto_3
    iget-object v4, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v4}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v4

    if-ge v3, v4, :cond_6

    .line 143
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 145
    :cond_6
    invoke-static {v2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    const/4 v3, 0x0

    .line 147
    :goto_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_7

    .line 148
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 150
    :cond_7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_8

    .line 151
    new-instance v3, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerShuffle;

    invoke-direct {v3}, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerShuffle;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->queueIndexer:Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer;

    .line 152
    check-cast v3, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerShuffle;

    invoke-virtual {v3, p1, v1, p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueIndexerShuffle;->init(ILjava/util/List;Lcom/daaw/avee/comp/PlaybackQueue/IQueueIndexer$QueueIndexesChangedListener;)V

    if-eqz p2, :cond_8

    .line 155
    invoke-direct {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 157
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    .line 158
    invoke-direct {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v1, 0x7f0e0011

    new-array v0, v0, [Ljava/lang/Object;

    .line 159
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, p3

    .line 158
    invoke-virtual {p2, v1, p1, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 160
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->notifyMessage(Ljava/lang/String;)V

    .line 168
    :cond_8
    :goto_5
    invoke-direct {p0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->notifyQueueChange()V

    .line 170
    sget-object p1, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onShuffleModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget p2, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->shuffleMode:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public swapQueueItem(II)V
    .locals 6

    .line 366
    iget-object v0, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 367
    iget-object p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :cond_0
    move v1, p1

    .line 369
    iget-object p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p1

    if-lt p2, p1, :cond_1

    .line 370
    iget-object p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p1

    add-int/lit8 p2, p1, -0x1

    :cond_1
    move v2, p2

    .line 373
    iget-object p1, p0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/Common/MultiList;->swap(II)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    .line 374
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueChanged2(IIIZLcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method
