.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$30;
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
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 480
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$30;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 480
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$30;->invoke(Ljava/util/List;)V

    return-void
.end method

.method public invoke(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;)V"
        }
    .end annotation

    .line 483
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 485
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->removeQueueItems(Ljava/util/List;)V

    :cond_0
    return-void
.end method
