.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$9;
.super Ljava/lang/Object;
.source "ContentItemViewHolder.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


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


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 0

    .line 344
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$9;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 348
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onItemSelected:Lcom/daaw/avee/Common/Events/WeakEvent3;

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$9;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$9;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v1, v1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    .line 349
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$9;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v3, v3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    .line 348
    invoke-virtual {p1, v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return v2
.end method
