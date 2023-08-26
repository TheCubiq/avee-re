.class Lcom/daaw/avee/Design/VisualizerDesign$11;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 420
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$11;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;
    .locals 5

    .line 423
    sget-object v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 424
    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 427
    :cond_0
    new-instance v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v2, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->dataSource:Landroid/net/Uri;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath0Str()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath1Str()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtGenerateStr()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 420
    invoke-virtual {p0}, Lcom/daaw/avee/Design/VisualizerDesign$11;->invoke()Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    move-result-object v0

    return-object v0
.end method
