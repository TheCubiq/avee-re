.class Lcom/daaw/avee/Design/SortDesign$2;
.super Ljava/lang/Object;
.source "SortDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/SortDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/ContextData;",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SortDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SortDesign;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/daaw/avee/Design/SortDesign$2;->this$0:Lcom/daaw/avee/Design/SortDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;Landroid/view/View;)V
    .locals 1

    const-string v0, "files"

    .line 85
    invoke-static {p1, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;->createAndShowDialog(Lcom/daaw/avee/ContextData;Landroid/view/View;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 82
    check-cast p1, Lcom/daaw/avee/ContextData;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/SortDesign$2;->invoke(Lcom/daaw/avee/ContextData;Landroid/view/View;)V

    return-void
.end method
