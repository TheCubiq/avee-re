.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;
.super Ljava/lang/Object;
.source "ContentItemViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;ZZLcom/daaw/avee/Common/Action1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

.field final synthetic val$reOrderable:Z


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Z)V
    .locals 0

    .line 264
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iput-boolean p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->val$reOrderable:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 268
    iget-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->val$reOrderable:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 269
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onRequestIsSelectingEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 271
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onItemInteracted:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v2, v2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getItemIdentifier()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 273
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 274
    new-instance v2, Landroidx/appcompat/widget/PopupMenu;

    invoke-direct {v2, v0, p1}, Landroidx/appcompat/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 275
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6$1;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;Landroid/view/View;)V

    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/PopupMenu;->setOnMenuItemClickListener(Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;)V

    const/4 p1, 0x0

    .line 284
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    move-result-object v0

    array-length v0, v0

    if-ge p1, v0, :cond_2

    .line 286
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    move-result-object v0

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->getShouldShow()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    move-result-object v0

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->isAllowSingle()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 289
    invoke-virtual {v2}, Landroidx/appcompat/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object v0

    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 291
    invoke-static {v3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    move-result-object v3

    aget-object v3, v3, p1

    invoke-virtual {v3}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->getActionId()I

    move-result v3

    iget-object v4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 292
    invoke-static {v4}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    move-result-object v4

    aget-object v4, v4, p1

    invoke-virtual {v4}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->getNameStrResId()I

    move-result v4

    .line 289
    invoke-interface {v0, v1, p1, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 297
    :cond_2
    invoke-virtual {v2}, Landroidx/appcompat/widget/PopupMenu;->show()V

    return-void
.end method
