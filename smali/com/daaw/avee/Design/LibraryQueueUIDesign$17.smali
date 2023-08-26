.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$17;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEventR1$Handler<",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 357
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$17;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)Lcom/daaw/avee/Common/Tuple2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;",
            ")",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 360
    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 361
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$17;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->getContainerItemViewHeightDefaultPixels()Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1

    .line 362
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$17;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->getContainerItemViewHeightPixels()Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 357
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$17;->invoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method
