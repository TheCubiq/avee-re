.class Lcom/daaw/avee/Design/PlaybackDesign$5;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
        "Lcom/daaw/avee/comp/playback/PlayingMediaInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$5;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V
    .locals 0

    .line 113
    sput-object p1, Lcom/daaw/avee/Design/PlaybackDesign;->currentDisplayTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 114
    sput-object p4, Lcom/daaw/avee/Design/PlaybackDesign;->playingMediaInfo:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    .line 115
    sput-object p3, Lcom/daaw/avee/Design/PlaybackDesign;->songDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 117
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$5;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaybackDesign;->access$100(Lcom/daaw/avee/Design/PlaybackDesign;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/daaw/avee/Design/PlaybackDesign$5$1;

    invoke-direct {p2, p0, p3}, Lcom/daaw/avee/Design/PlaybackDesign$5$1;-><init>(Lcom/daaw/avee/Design/PlaybackDesign$5;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 108
    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    check-cast p2, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    check-cast p3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    check-cast p4, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/PlaybackDesign$5;->invoke(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V

    return-void
.end method
