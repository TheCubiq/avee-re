.class Lcom/daaw/avee/Design/PlaybackControlsDesign$1;
.super Ljava/lang/Object;
.source "PlaybackControlsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackControlsDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent5$Handler<",
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


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackControlsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackControlsDesign;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackControlsDesign$1;->this$0:Lcom/daaw/avee/Design/PlaybackControlsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/Common/Tuple2;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 48
    iget-object v0, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 49
    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v0, :cond_1

    .line 51
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->EmptySong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 53
    :cond_1
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v2

    .line 55
    sput-object v1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    .line 56
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sput p2, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldQueuePosition:I

    .line 57
    sput-object v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 58
    sput-object v2, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 60
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 61
    invoke-virtual {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->updateTrackInfo()V

    .line 63
    :cond_2
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment1Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 64
    sget v1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldQueuePosition:I

    sget-object v3, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-virtual {p2, v1, v0, v2, v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->updateTrackInfo(ILcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/Common/IItemIdentifier;)V

    .line 67
    :cond_3
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 68
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_5

    if-eqz p1, :cond_4

    .line 71
    iget-object p2, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    if-eqz p2, :cond_4

    .line 72
    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getConstrucPath()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    const-string p1, ""

    .line 74
    :goto_1
    sget-object p2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onPlayDataSource:Lcom/daaw/avee/Common/Events/WeakDelegate4;

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    check-cast p5, Ljava/lang/Long;

    invoke-virtual {p2, p1, p3, p4, p5}, Lcom/daaw/avee/Common/Events/WeakDelegate4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 76
    :cond_5
    sget-object p1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onAction:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    const/4 p2, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 42
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/Design/PlaybackControlsDesign$1;->invoke(Lcom/daaw/avee/Common/Tuple2;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;)V

    return-void
.end method
