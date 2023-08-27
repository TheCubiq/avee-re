.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$8;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$8;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 195
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$8;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public invoke(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "/"

    .line 198
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "6"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 199
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$8;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->access$002(Lcom/daaw/avee/Design/LibraryQueueUIDesign;I)I

    .line 200
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$8;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateLibraryItems()V

    return-void

    .line 204
    :cond_0
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 205
    invoke-virtual {p1, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateForwardLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
