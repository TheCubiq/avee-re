.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;
.super Ljava/lang/Object;
.source "CompositeAdapterData.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;
    }
.end annotation


# instance fields
.field private adapter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

.field private adapterWrap:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

.field private containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

.field private sectionDesc:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;


# direct methods
.method public constructor <init>([Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapter:Ljava/lang/ref/WeakReference;

    .line 30
    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    .line 31
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->sectionDesc:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;

    .line 32
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    .line 34
    array-length p1, p2

    new-array p1, p1, [Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterWrap:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    const/4 p1, 0x0

    .line 36
    :goto_0
    array-length p3, p2

    if-ge p1, p3, :cond_0

    .line 37
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterWrap:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$AdapterWrap;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;I)V

    aput-object v0, p3, p1

    .line 38
    aget-object p3, p2, p1

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterWrap:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    aget-object v0, v0, p1

    invoke-interface {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onAdapterInitialized(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public dataPositionToPosition(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public dataPositionToPosition(II)I
    .locals 3

    .line 135
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    array-length v0, v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    .line 141
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    aget-object v2, v2, v0

    invoke-interface {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getSectionOpened()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 142
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    aget-object v2, v2, v0

    invoke-interface {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->getItemCount()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    add-int/2addr p1, v1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected getAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapter:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    return-object v0
.end method

.method public getItemCount()I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 71
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 73
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    aget-object v2, v2, v0

    invoke-interface {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getSectionOpened()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 74
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    aget-object v2, v2, v0

    invoke-interface {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->getItemCount()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public getItemId(I)J
    .locals 2

    .line 84
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->positionToDataPosition(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    .line 86
    iget-object v0, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->getItemId(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 60
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->positionToDataPosition(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    .line 62
    iget-object v0, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->sectionDesc:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;->getViewType()I

    move-result p1

    return p1

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public onAdapterDispose()V
    .locals 4

    .line 53
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 54
    invoke-interface {v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onAdapterDispose()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onAdapterInitialized(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;)V
    .locals 1

    .line 48
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapter:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 2

    .line 100
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->positionToDataPosition(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p2

    .line 102
    iget-object v0, p2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_0

    .line 103
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;

    .line 104
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    iget-object v1, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V

    goto :goto_0

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    iget-object v1, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 3

    .line 94
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p1, p2, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ViewHolderFactory;->newInstance(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onItemsMoved(IILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 115
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->positionToDataPosition(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    .line 116
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->positionToDataPosition(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p2

    .line 118
    iget-object v0, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Assert posFrom.obj2 != posFrom.obj1"

    .line 119
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aget-object p2, v0, p2

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, -0x1

    invoke-interface {p2, p1, v0, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onItemsMoved(IILjava/util/List;)V

    return-void

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    iget-object v1, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->onItemsMoved(IILjava/util/List;)V

    return-void
.end method

.method public positionToDataPosition(I)Lcom/daaw/avee/Common/Tuple2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 157
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    array-length v3, v3

    if-ge v0, v3, :cond_2

    .line 159
    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    aget-object v3, v3, v0

    invoke-interface {v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getSectionOpened()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 160
    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;->adapterData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    aget-object v3, v3, v0

    invoke-interface {v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;->getItemCount()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :goto_1
    if-ge p1, v1, :cond_1

    .line 165
    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    sub-int/2addr p1, v2

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    move v2, v1

    goto :goto_0

    .line 171
    :cond_2
    new-instance p1, Lcom/daaw/avee/Common/Tuple2;

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
