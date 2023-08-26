.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "ViewAdapter.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;
    }
.end annotation


# instance fields
.field private data:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

.field private dataProvider:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 21
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->data:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    const/4 p2, 0x0

    .line 24
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->setHasStableIds(Z)V

    .line 25
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataProvider:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    .line 26
    invoke-interface {p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onAdapterInitialized(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;)V

    return-void
.end method


# virtual methods
.method public dataPositionToPosition(I)I
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataProvider:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->dataPositionToPosition(I)I

    move-result p1

    return p1
.end method

.method public dispose()V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataProvider:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onAdapterDispose()V

    return-void
.end method

.method public getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->data:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataProvider:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->getItemCount()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataProvider:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public myNotifyDataSetChanged()V
    .locals 0

    .line 66
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public myNotifyItemChanged(I)V
    .locals 0

    .line 70
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyItemChanged(I)V

    return-void
.end method

.method public myNotifyItemInserted(I)V
    .locals 0

    .line 78
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyItemInserted(I)V

    return-void
.end method

.method public myNotifyItemMoved(II)V
    .locals 0

    .line 83
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyItemMoved(II)V

    return-void
.end method

.method public myNotifyItemRangeChanged(II)V
    .locals 0

    .line 74
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyItemRangeChanged(II)V

    return-void
.end method

.method public myNotifyItemRangeInserted(II)V
    .locals 0

    .line 87
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyItemRangeInserted(II)V

    return-void
.end method

.method public myNotifyItemRangeRemoved(II)V
    .locals 0

    .line 95
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyItemRangeRemoved(II)V

    return-void
.end method

.method public myNotifyItemRemoved(I)V
    .locals 0

    .line 91
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyItemRemoved(I)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataProvider:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataProvider:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onItemsMoved(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataProvider:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onItemsMoved(IILjava/util/List;)V

    return-void
.end method
