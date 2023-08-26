.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;
.super Ljava/lang/Object;
.source "HeaderFooterAdapterData.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public myNotifyDataSetChanged()V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 41
    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public myNotifyItemChanged(I)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 47
    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemChanged(I)V

    :cond_0
    return-void
.end method

.method public myNotifyItemInserted(I)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 59
    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemInserted(I)V

    :cond_0
    return-void
.end method

.method public myNotifyItemMoved(II)V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    .line 65
    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemMoved(II)V

    :cond_0
    return-void
.end method

.method public myNotifyItemRangeChanged(II)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 53
    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemRangeChanged(II)V

    :cond_0
    return-void
.end method

.method public myNotifyItemRangeInserted(II)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 72
    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemRangeInserted(II)V

    :cond_0
    return-void
.end method

.method public myNotifyItemRangeRemoved(II)V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 84
    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemRangeRemoved(II)V

    :cond_0
    return-void
.end method

.method public myNotifyItemRemoved(I)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 78
    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemRemoved(I)V

    :cond_0
    return-void
.end method
