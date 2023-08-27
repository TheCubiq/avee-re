.class public abstract Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;
.source "ListContainerBase.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V::",
        "Ljava/util/List<",
        "TT;>;>",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;"
    }
.end annotation


# instance fields
.field private associatedAdapter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private getContent:Lcom/daaw/avee/Common/Func/Func1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "TV;>;"
        }
    .end annotation
.end field

.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field protected listFactory:Lcom/daaw/avee/Common/Func/Func;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "TV;>;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "TV;>;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;II)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    move-object v3, p5

    move v4, p6

    move v5, p7

    .line 39
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)V

    .line 26
    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p4, 0x0

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->associatedAdapter:Ljava/lang/ref/WeakReference;

    .line 45
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->getContent:Lcom/daaw/avee/Common/Func/Func1;

    .line 46
    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    .line 47
    invoke-interface {p2, p0}, Lcom/daaw/avee/Common/Func/Func1;->onInvoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->list:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public RefreshContent()Z
    .locals 3

    const/4 v0, 0x1

    .line 115
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->getContent(Z)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v1

    .line 116
    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->checkItemIdent(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    .line 118
    :cond_0
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->getContent(Z)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v1

    .line 120
    iget-object v2, v1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    .line 122
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {v1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->setDataAndNotifyDataSetChanged(Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0

    .line 124
    :cond_1
    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->setDataAndNotifyDataSetChanged(Ljava/util/List;Ljava/lang/String;)V

    :goto_0
    return v0
.end method

.method public dataPositionToPosition(I)I
    .locals 0

    return p1
.end method

.method protected getAssociatedAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->associatedAdapter:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    return-object v0
.end method

.method protected getContent(Z)Lcom/daaw/avee/Common/Tuple2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TV;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 135
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->getContent:Lcom/daaw/avee/Common/Func/Func1;

    invoke-interface {p1, p0}, Lcom/daaw/avee/Common/Func/Func1;->onInvoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 137
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {v0}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 138
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 142
    :goto_0
    new-instance p1, Lcom/daaw/avee/Common/Tuple2;

    const-string v1, ""

    invoke-direct {p1, v0, v1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public abstract getItemViewType(I)I
.end method

.method protected getList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->list:Ljava/util/List;

    return-object v0
.end method

.method public onAdapterDispose()V
    .locals 0

    return-void
.end method

.method public onAdapterInitialized(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;)V
    .locals 1

    .line 56
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->associatedAdapter:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 82
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ViewHolderFactory;->newInstance(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onItemsMoved(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method protected setDataAndNotifyDataSetChanged(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 102
    invoke-virtual {p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->checkItemIdent(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 104
    :cond_0
    invoke-static {p1}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 105
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->list:Ljava/util/List;

    .line 107
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->getAssociatedAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 109
    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyDataSetChanged()V

    :cond_1
    return-void
.end method
