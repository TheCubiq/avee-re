.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$4;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemActionEnqueueNext$EnqueueNextActionListener2;
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

    .line 88
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$4;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemActionEnqueueNext$EnqueueNextActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onEnqueue(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 4
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

    .line 91
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;

    .line 92
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$4;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$4;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getTrackList(Landroid/content/Context;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
