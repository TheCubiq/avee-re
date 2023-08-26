.class Lcom/daaw/avee/Design/VisualizerExporterDesign$15;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V
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
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 615
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V
    .locals 0

    .line 623
    sput-object p1, Lcom/daaw/avee/Design/PlaybackDesign;->currentDisplayTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 624
    sput-object p3, Lcom/daaw/avee/Design/PlaybackDesign;->songDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 625
    sput-object p4, Lcom/daaw/avee/Design/PlaybackDesign;->playingMediaInfo:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    .line 627
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1100()Z

    move-result p1

    if-nez p1, :cond_0

    .line 628
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    sget-object p2, Lcom/daaw/avee/Design/PlaybackDesign;->songDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1002(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 629
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    sget-object p2, Lcom/daaw/avee/Design/PlaybackDesign;->currentDisplayTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2402(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 630
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    sget-object p2, Lcom/daaw/avee/Design/PlaybackDesign;->playingMediaInfo:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    iget-wide p2, p2, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;->duration:J

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$202(Lcom/daaw/avee/Design/VisualizerExporterDesign;J)J

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 615
    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    check-cast p2, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    check-cast p3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    check-cast p4, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/VisualizerExporterDesign$15;->invoke(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V

    return-void
.end method
