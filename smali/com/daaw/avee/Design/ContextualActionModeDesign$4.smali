.class Lcom/daaw/avee/Design/ContextualActionModeDesign$4;
.super Ljava/lang/Object;
.source "ContextualActionModeDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/ContextualActionModeDesign;-><init>()V
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
.field final synthetic this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$4;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$4;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/ContextualActionModeDesign;->access$100(Lcom/daaw/avee/Design/ContextualActionModeDesign;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 70
    check-cast p1, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/ContextualActionModeDesign$4;->invoke(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method
