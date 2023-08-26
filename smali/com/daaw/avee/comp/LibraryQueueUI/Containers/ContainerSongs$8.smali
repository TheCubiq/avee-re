.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$8;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction$PlayAllContainerActionListener2;
.source "ContainerSongs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$8;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

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

    .line 140
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$8;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    .line 142
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$8;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-static {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->access$300(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/daaw/avee/Common/Tuple2;

    .line 143
    iget-object p4, p4, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 146
    :cond_0
    new-instance p2, Lcom/daaw/avee/Common/Tuple3;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-direct {p2, p4, p1, p3}, Lcom/daaw/avee/Common/Tuple3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method
