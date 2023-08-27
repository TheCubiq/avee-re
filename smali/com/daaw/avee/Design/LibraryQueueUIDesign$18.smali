.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$18;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$18;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Integer;
    .locals 1

    .line 369
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$18;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->access$000(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 366
    invoke-virtual {p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$18;->invoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
