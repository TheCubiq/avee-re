.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$7;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$DeletePlaylistAction$DeletePlaylistActionListener;
.source "ContainerPlaylist.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$DeletePlaylistAction$DeletePlaylistActionListener;-><init>()V

    return-void
.end method


# virtual methods
.method protected onDeletePlaylist(Landroid/content/Context;Ljava/lang/Object;Lcom/daaw/avee/Common/MultiList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 117
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ThisItemIdentifier;

    .line 118
    iget-wide v0, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ThisItemIdentifier;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-object p2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ThisItemIdentifier;->name:Ljava/lang/String;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
