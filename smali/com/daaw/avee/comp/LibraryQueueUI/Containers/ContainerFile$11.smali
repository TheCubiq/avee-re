.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$11;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$SendToItemAction$SendToActionListener;
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

    .line 192
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$11;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$SendToItemAction$SendToActionListener;-><init>()V

    return-void
.end method


# virtual methods
.method protected onSendTo(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
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

    .line 195
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;

    .line 196
    iget-object p1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 198
    :cond_0
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
