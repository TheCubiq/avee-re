.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$6;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction$RemoveStandalonePlaylistActionListener;
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

    .line 105
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction$RemoveStandalonePlaylistActionListener;-><init>()V

    return-void
.end method


# virtual methods
.method protected onRemoveStandalonePlaylist(Landroid/content/Context;Ljava/lang/Object;Lcom/daaw/avee/Common/MultiList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 108
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ThisItemIdentifier;

    .line 110
    iget-object p1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ThisItemIdentifier;->id:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ThisItemIdentifier;->path:Ljava/lang/String;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
