.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$14;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction$PlayAllContainerActionListener2;
.source "ContainerFile.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$14;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction$PlayAllContainerActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onPlayAllContainer(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;Lcom/daaw/avee/Common/MultiList;)Lcom/daaw/avee/Common/Tuple3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;)",
            "Lcom/daaw/avee/Common/Tuple3<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 231
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$14;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    .line 232
    iget-object p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$14;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-static {p4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)Ljava/util/List;

    move-result-object p4

    invoke-static {p1, p4, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSongsFromFileItems2(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 233
    new-instance p1, Lcom/daaw/avee/Common/Tuple3;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-direct {p1, p4, p2, p3}, Lcom/daaw/avee/Common/Tuple3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
