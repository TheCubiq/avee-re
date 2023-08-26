.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$6;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$RemoveFolderAction$RemoveFolderActionListener;
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

    .line 82
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$RemoveFolderAction$RemoveFolderActionListener;-><init>()V

    return-void
.end method


# virtual methods
.method protected onRemoveFolder(Landroid/content/Context;Ljava/lang/Object;Lcom/daaw/avee/Common/MultiList;)V
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

    .line 85
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;

    .line 87
    iget-object p1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;->id:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;->path:Ljava/lang/String;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
