.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6$1;
.super Ljava/lang/Object;
.source "ContentItemViewHolder.java"

# interfaces
.implements Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;

.field final synthetic val$v:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;Landroid/view/View;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6$1;->this$1:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6$1;->val$v:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 278
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    .line 279
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6$1;->this$1:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;

    iget-object v0, v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    move-result-object v0

    aget-object p1, v0, p1

    new-instance v0, Lcom/daaw/avee/ContextData;

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6$1;->val$v:Landroid/view/View;

    invoke-direct {v0, v1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6$1;->this$1:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;

    iget-object v1, v1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v1, v1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getItemIdentifier()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->execute(Lcom/daaw/avee/ContextData;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
