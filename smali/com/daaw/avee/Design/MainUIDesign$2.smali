.class Lcom/daaw/avee/Design/MainUIDesign$2;
.super Ljava/lang/Object;
.source "MainUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/MainUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/MainUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/MainUIDesign;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$2;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 73
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    .line 74
    iget-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$2;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Design/MainUIDesign;->setOverrideForceLockOrient(Z)V

    .line 75
    iget-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$2;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/MainUIDesign;->access$000(Lcom/daaw/avee/Design/MainUIDesign;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 69
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/MainUIDesign$2;->invoke(Ljava/lang/Integer;Lcom/daaw/avee/ContextData;)V

    return-void
.end method
