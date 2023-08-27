.class Lcom/daaw/avee/Design/ContextualActionModeDesign$5;
.super Ljava/lang/Object;
.source "ContextualActionModeDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/ContextualActionModeDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$5;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 3

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$5;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/ContextualActionModeDesign;->access$100(Lcom/daaw/avee/Design/ContextualActionModeDesign;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 82
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    .line 83
    sget-object v2, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onContainerItemsDeselected:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v2, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$5;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/ContextualActionModeDesign;->access$100(Lcom/daaw/avee/Design/ContextualActionModeDesign;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method
