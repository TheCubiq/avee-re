.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$33;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/LibraryQueueUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/Common/MultiList<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        ">;",
        "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 506
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$33;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/Common/MultiList;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ")V"
        }
    .end annotation

    .line 509
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment1Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 511
    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->updateTrackList(Lcom/daaw/avee/Common/MultiList;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 506
    check-cast p1, Lcom/daaw/avee/Common/MultiList;

    check-cast p2, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$33;->invoke(Lcom/daaw/avee/Common/MultiList;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method
