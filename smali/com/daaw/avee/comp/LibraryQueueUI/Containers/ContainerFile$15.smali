.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$15;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$EnqueueAllContainerItemAction$EnqueueAllContainerActionListener2;
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

    .line 237
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$15;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$EnqueueAllContainerItemAction$EnqueueAllContainerActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onEnqueue(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0
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

    .line 241
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$15;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-static {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSongsFromFileItems2(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
