.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;
.super Ljava/lang/Object;
.source "CompositeAdapterData.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AdapterWrap"
.end annotation


# instance fields
.field sectionIndex:I

.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;I)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    iput p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->sectionIndex:I

    return-void
.end method


# virtual methods
.method public myNotifyDataSetChanged()V
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 199
    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public myNotifyItemChanged(I)V
    .locals 3

    .line 204
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 206
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->sectionIndex:I

    invoke-virtual {v1, p1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->dataPositionToPosition(II)I

    move-result p1

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemChanged(I)V

    :cond_0
    return-void
.end method

.method public myNotifyItemInserted(I)V
    .locals 3

    .line 218
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 220
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->sectionIndex:I

    invoke-virtual {v1, p1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->dataPositionToPosition(II)I

    move-result p1

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemInserted(I)V

    :cond_0
    return-void
.end method

.method public myNotifyItemMoved(II)V
    .locals 3

    .line 225
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 227
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->sectionIndex:I

    invoke-virtual {v1, p1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->dataPositionToPosition(II)I

    move-result p1

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->sectionIndex:I

    invoke-virtual {v1, p2, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->dataPositionToPosition(II)I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemMoved(II)V

    :cond_0
    return-void
.end method

.method public myNotifyItemRangeChanged(II)V
    .locals 3

    .line 211
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 213
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->sectionIndex:I

    invoke-virtual {v1, p1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->dataPositionToPosition(II)I

    move-result p1

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemRangeChanged(II)V

    :cond_0
    return-void
.end method

.method public myNotifyItemRangeInserted(II)V
    .locals 3

    .line 232
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 234
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->sectionIndex:I

    invoke-virtual {v1, p1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->dataPositionToPosition(II)I

    move-result p1

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemRangeInserted(II)V

    :cond_0
    return-void
.end method

.method public myNotifyItemRangeRemoved(II)V
    .locals 3

    .line 246
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 248
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->sectionIndex:I

    invoke-virtual {v1, p1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->dataPositionToPosition(II)I

    move-result p1

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemRangeRemoved(II)V

    :cond_0
    return-void
.end method

.method public myNotifyItemRemoved(I)V
    .locals 3

    .line 239
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 241
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;->sectionIndex:I

    invoke-virtual {v1, p1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->dataPositionToPosition(II)I

    move-result p1

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyItemRemoved(I)V

    :cond_0
    return-void
.end method
