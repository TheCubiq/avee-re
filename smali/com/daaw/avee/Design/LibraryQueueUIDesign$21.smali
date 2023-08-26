.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$21;
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
        "Lcom/daaw/avee/ContextData;",
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

    .line 404
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$21;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "libraryAddFolder"

    .line 407
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 408
    iget-object p3, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$21;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {p3, p1, v0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->access$600(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Landroid/content/Context;[Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 404
    check-cast p1, Lcom/daaw/avee/ContextData;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$21;->invoke(Lcom/daaw/avee/ContextData;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
