.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$20;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 390
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$20;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0

    .line 393
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget p3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_containerItemViewMode:I

    if-ne p1, p3, :cond_1

    .line 394
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$20;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->access$400(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Ljava/lang/Integer;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 396
    iget-object p2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$20;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-static {p2, p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->access$502(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Lcom/daaw/avee/Common/Tuple2;)Lcom/daaw/avee/Common/Tuple2;

    .line 398
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$20;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateLibraryItems()V

    .line 399
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$20;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateQueueItems()V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 390
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$20;->invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method
