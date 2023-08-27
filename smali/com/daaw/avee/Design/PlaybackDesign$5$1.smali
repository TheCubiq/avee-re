.class Lcom/daaw/avee/Design/PlaybackDesign$5$1;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign$5;->invoke(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/PlaybackDesign$5;

.field final synthetic val$currentTrackData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign$5;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$5$1;->this$1:Lcom/daaw/avee/Design/PlaybackDesign$5;

    iput-object p2, p0, Lcom/daaw/avee/Design/PlaybackDesign$5$1;->val$currentTrackData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 121
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 123
    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$5$1;->val$currentTrackData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/MainActivity;->updateActionBar(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V

    .line 125
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 127
    sget-object v1, Lcom/daaw/avee/Design/PlaybackDesign;->songDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    sget-object v2, Lcom/daaw/avee/Design/PlaybackDesign;->playingMediaInfo:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->updateTrackInfo(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V

    :cond_1
    return-void
.end method
