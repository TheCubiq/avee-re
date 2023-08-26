.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;
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

.field final synthetic val$listener:Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->val$listener:Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 313
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onItemInteracted:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v1, v1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getItemIdentifier()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 315
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onRequestIsSelectingEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 317
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->val$listener:Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->isStayPressedHint()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->access$100(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Z)V

    .line 320
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->val$listener:Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-direct {v1, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getItemIdentifier()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->execute(Lcom/daaw/avee/ContextData;Ljava/lang/Object;)V

    goto :goto_0

    .line 321
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    if-eqz p1, :cond_2

    .line 322
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onItemSelected:Lcom/daaw/avee/Common/Events/WeakEvent3;

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v2, v2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    .line 323
    invoke-virtual {v2}, Landroid/view/View;->isSelected()Z

    move-result v2

    xor-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v2, v2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    .line 322
    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method
