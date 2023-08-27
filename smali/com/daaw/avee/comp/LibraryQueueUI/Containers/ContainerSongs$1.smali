.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;
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

    .line 57
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction$PlayAllContainerActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onPlayAllContainer(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;Lcom/daaw/avee/Common/MultiList;)Lcom/daaw/avee/Common/Tuple3;
    .locals 3
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

    .line 60
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;

    .line 62
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    if-eqz p4, :cond_2

    .line 64
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v0

    invoke-interface {p4, v0}, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 67
    iget p4, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    const/4 v0, 0x0

    if-ltz p4, :cond_0

    iget p4, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-static {v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v1

    if-ge p4, v1, :cond_0

    iget-object p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-static {p4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;

    move-result-object p4

    check-cast p4, Lcom/daaw/avee/Common/MultiList;

    iget v1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    invoke-virtual {p4, v1}, Lcom/daaw/avee/Common/MultiList;->get1(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    goto :goto_0

    :cond_0
    move-object p4, v0

    .line 68
    :goto_0
    iget v1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    if-ltz v1, :cond_1

    iget v1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    invoke-virtual {p5}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget v0, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    invoke-virtual {p5, v0}, Lcom/daaw/avee/Common/MultiList;->get1(I)Ljava/lang/Object;

    move-result-object p5

    move-object v0, p5

    check-cast v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    :cond_1
    if-eqz p4, :cond_2

    .line 70
    invoke-virtual {p4, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 71
    new-instance p3, Lcom/daaw/avee/Common/Tuple3;

    iget p2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p4, 0x1

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-direct {p3, p2, p1, p4}, Lcom/daaw/avee/Common/Tuple3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3

    .line 75
    :cond_2
    iget-object p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-static {p4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;

    move-result-object p4

    check-cast p4, Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p4}, Lcom/daaw/avee/Common/MultiList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_3

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/daaw/avee/Common/Tuple2;

    .line 76
    iget-object p5, p5, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-interface {p3, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 79
    :cond_3
    new-instance p3, Lcom/daaw/avee/Common/Tuple3;

    iget p2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p4, 0x0

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-direct {p3, p2, p1, p4}, Lcom/daaw/avee/Common/Tuple3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method
