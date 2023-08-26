.class public interface abstract Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;
.super Ljava/lang/Object;
.source "ViewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IAdapterDataProvider"
.end annotation


# virtual methods
.method public abstract dataPositionToPosition(I)I
.end method

.method public abstract getItemCount()I
.end method

.method public abstract getItemId(I)J
.end method

.method public abstract getItemViewType(I)I
.end method

.method public abstract onAdapterDispose()V
.end method

.method public abstract onAdapterInitialized(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;)V
.end method

.method public abstract onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end method

.method public abstract onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.end method

.method public abstract onItemsMoved(IILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method
