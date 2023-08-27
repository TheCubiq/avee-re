.class Lcom/daaw/avee/Design/ContextualActionModeDesign$3;
.super Ljava/lang/Object;
.source "ContextualActionModeDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$3;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;Ljava/lang/Boolean;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$3;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/ContextualActionModeDesign;->access$100(Lcom/daaw/avee/Design/ContextualActionModeDesign;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection;-><init>(Ljava/lang/Object;)V

    .line 60
    iget-object v1, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$3;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/ContextualActionModeDesign;->access$100(Lcom/daaw/avee/Design/ContextualActionModeDesign;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 64
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection;->addSelection(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)V

    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection;->subtractSelection(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 53
    check-cast p1, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/ContextualActionModeDesign$3;->invoke(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;Ljava/lang/Boolean;)V

    return-void
.end method
