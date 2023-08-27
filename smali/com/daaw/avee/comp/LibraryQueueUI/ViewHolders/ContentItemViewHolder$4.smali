.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$4;
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

.field final synthetic val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$4;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$4;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 236
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$4;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getOnDraggingListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 237
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$4;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getOnDraggingListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$4;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v0, v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;->onStartDragging(Landroid/view/View;)V

    const/4 p1, 0x1

    return p1
.end method
