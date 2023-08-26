.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$28;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        ">;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 459
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$28;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 459
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$28;->invoke(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method

.method public invoke(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ")V"
        }
    .end annotation

    .line 462
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$28;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-static {v0, p1, p2, p3}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->access$800(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method
