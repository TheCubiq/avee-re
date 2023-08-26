.class public abstract Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$TipReorderItemAction$TipReorderItemActionListener2;
.super Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;
.source "ItemActionsQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$TipReorderItemAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "TipReorderItemActionListener2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 104
    invoke-static {}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$TipReorderItemAction;->access$000()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;-><init>(Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;)V

    return-void
.end method
