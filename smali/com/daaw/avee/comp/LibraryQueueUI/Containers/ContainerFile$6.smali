.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$6;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$FileAddToFoldersAction$Listener;
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

    .line 104
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$FileAddToFoldersAction$Listener;-><init>()V

    return-void
.end method


# virtual methods
.method protected onAddToFolders(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 108
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;

    .line 109
    invoke-virtual {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
