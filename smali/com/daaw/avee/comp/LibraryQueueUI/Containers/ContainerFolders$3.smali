.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$3;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemActionEnqueue$EnqueueActionListener2;
.source "ContainerFolders.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$3;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemActionEnqueue$EnqueueActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onEnqueue(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
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

    .line 60
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;

    .line 61
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$3;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;

    iget-object p2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;->path:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getChildItems(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
