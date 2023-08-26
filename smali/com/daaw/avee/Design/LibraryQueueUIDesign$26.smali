.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$26;
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

    .line 443
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$26;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 443
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$26;->invoke(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method

.method public invoke(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V
    .locals 2
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

    .line 446
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 448
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v1, -0x1

    invoke-virtual {v0, p1, p2, v1, p3}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->open(Ljava/util/List;IILcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    :cond_0
    return-void
.end method
