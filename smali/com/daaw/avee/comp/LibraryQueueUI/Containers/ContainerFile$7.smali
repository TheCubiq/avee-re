.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$7;
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

    .line 126
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction$PlayAllContainerActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onPlayAllContainer(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;Lcom/daaw/avee/Common/MultiList;)Lcom/daaw/avee/Common/Tuple3;
    .locals 5
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

    .line 129
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;

    .line 131
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    const/4 v1, 0x0

    if-eqz p4, :cond_1

    .line 133
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v2

    invoke-interface {p4, v2}, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    .line 136
    iget-object p4, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    invoke-virtual {p4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object p4

    .line 137
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-static {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2, p4, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->findSongInItemsNotCountingNulls(Ljava/util/List;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;I)I

    move-result v2

    const/4 v3, 0x0

    if-ltz v2, :cond_0

    .line 139
    invoke-virtual {p5}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v4

    if-ge v2, v4, :cond_0

    .line 140
    invoke-virtual {p5, v2}, Lcom/daaw/avee/Common/MultiList;->get1(I)Ljava/lang/Object;

    move-result-object p5

    move-object v3, p5

    check-cast v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    :cond_0
    if-eqz p4, :cond_1

    .line 142
    invoke-virtual {p4, v3}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    .line 143
    new-instance p1, Lcom/daaw/avee/Common/Tuple3;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-direct {p1, p2, v0, p3}, Lcom/daaw/avee/Common/Tuple3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 147
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    .line 148
    iget-object p5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-static {p5}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)Ljava/util/List;

    move-result-object p5

    invoke-static {p1, p5, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSongsFromFileItems2(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 152
    iget-object p1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 154
    invoke-static {p3, p1, p4}, Lcom/daaw/avee/Common/UtilsMusic;->findSongInList(Ljava/util/List;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;I)I

    move-result p1

    if-gez p1, :cond_3

    :cond_2
    const/4 p1, 0x0

    .line 158
    :cond_3
    new-instance p2, Lcom/daaw/avee/Common/Tuple3;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-direct {p2, p1, v0, p3}, Lcom/daaw/avee/Common/Tuple3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method
