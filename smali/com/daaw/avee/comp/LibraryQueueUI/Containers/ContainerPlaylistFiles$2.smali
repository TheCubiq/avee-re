.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$2;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayMultiItemAction$PlayMultiActionListener2;
.source "ContainerPlaylistFiles.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayMultiItemAction$PlayMultiActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onPlayMulti(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)V"
        }
    .end annotation

    .line 76
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ThisItemIdentifier;

    .line 77
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;

    iget-object p2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ThisItemIdentifier;->path:Ljava/lang/String;

    invoke-static {p1, v0, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->access$000(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
