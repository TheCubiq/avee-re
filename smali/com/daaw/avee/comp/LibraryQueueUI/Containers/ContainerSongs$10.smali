.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$10;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$PlayQueueItemAction$PlayQueueItemActionListener2;
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

    .line 164
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$10;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$PlayQueueItemAction$PlayQueueItemActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onPlay(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/avee/comp/Common/IItemIdentifier;
    .locals 0

    .line 167
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;

    .line 168
    iget-object p1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    if-nez p1, :cond_0

    const-string p1, "ThisItemIdentifier is null, in Queue"

    .line 169
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 170
    :cond_0
    iget-object p1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    return-object p1
.end method
