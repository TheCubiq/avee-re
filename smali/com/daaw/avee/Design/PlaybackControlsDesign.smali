.class public Lcom/daaw/avee/Design/PlaybackControlsDesign;
.super Ljava/lang/Object;
.source "PlaybackControlsDesign.java"


# static fields
.field public static volatile currentItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

.field public static volatile currentTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

.field public static volatile fieldQueuePosition:I

.field public static volatile fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;


# instance fields
.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->EmptySong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    sput-object v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    const/4 v0, 0x0

    .line 26
    sput-object v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    .line 27
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    sput-object v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    const/4 v0, -0x1

    .line 28
    sput v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldQueuePosition:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->listenerRefHolder:Ljava/util/List;

    .line 34
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getQueuePosition()I

    move-result v0

    sput v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldQueuePosition:I

    .line 35
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getCurrentQueueEntry()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 37
    iget-object v1, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    sput-object v1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 38
    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    sput-object v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    .line 39
    sget-object v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 42
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueuePosChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v1, Lcom/daaw/avee/Design/PlaybackControlsDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaybackControlsDesign$1;-><init>(Lcom/daaw/avee/Design/PlaybackControlsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    return-void
.end method
