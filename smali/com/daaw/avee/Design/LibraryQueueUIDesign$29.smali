.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$29;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/LibraryQueueUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 466
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$29;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 469
    instance-of v0, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;

    if-eqz v0, :cond_0

    .line 470
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;

    .line 472
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 474
    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->setQueueItemSlot(Lcom/daaw/avee/comp/Common/IItemIdentifier;I)V

    :cond_0
    return-void
.end method
