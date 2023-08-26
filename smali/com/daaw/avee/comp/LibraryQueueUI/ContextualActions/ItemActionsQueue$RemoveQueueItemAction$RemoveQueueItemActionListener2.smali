.class public abstract Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction$RemoveQueueItemActionListener2;
.super Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;
.source "ItemActionsQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "RemoveQueueItemActionListener2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 78
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction;->itemActionBaseRemoveQueue:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;-><init>(Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;)V

    return-void
.end method


# virtual methods
.method protected abstract onRemove(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;)V"
        }
    .end annotation
.end method
