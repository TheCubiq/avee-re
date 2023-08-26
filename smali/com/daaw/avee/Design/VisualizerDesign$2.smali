.class Lcom/daaw/avee/Design/VisualizerDesign$2;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
        "Lcom/daaw/avee/comp/playback/PlayingMediaInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$2;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 143
    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    check-cast p2, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    check-cast p3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    check-cast p4, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/VisualizerDesign$2;->invoke(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V

    return-void
.end method
