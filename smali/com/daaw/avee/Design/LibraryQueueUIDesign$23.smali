.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$23;
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
        "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 420
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$23;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    .line 423
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$23;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-static {v0, p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->access$700(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 420
    check-cast p1, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$23;->invoke(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method
