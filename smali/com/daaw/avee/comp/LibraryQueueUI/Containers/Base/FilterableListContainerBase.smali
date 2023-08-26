.class public abstract Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;
.source "FilterableListContainerBase.java"

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
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase<",
        "TT;TV;>;",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;"
    }
.end annotation


# instance fields
.field protected originalContent:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field resultReceiver:Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$IResultReceiver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$IResultReceiver<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected visibleList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field visibleListQuery:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;I)V
    .locals 9
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
            ">;I",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable<",
            "TT;>;I)V"
        }
    .end annotation

    move-object v8, p0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move/from16 v7, p8

    .line 83
    invoke-direct/range {v0 .. v7}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)V

    const/4 v0, 0x0

    .line 27
    iput-object v0, v8, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleListQuery:Ljava/lang/String;

    .line 33
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;)V

    iput-object v0, v8, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->resultReceiver:Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$IResultReceiver;

    .line 88
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v0

    .line 89
    sget-object v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v1, v2, v0, v3}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v1, p1

    move-object/from16 v2, p7

    .line 90
    invoke-virtual {p0, p1, v0, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->updateSearchQuery(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)V

    return-void
.end method

.method private startSearch(Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable<",
            "TT;>;TV;)V"
        }
    .end annotation

    .line 186
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 189
    :cond_0
    new-instance v1, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;

    new-instance v2, Ljava/lang/ref/WeakReference;

    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->resultReceiver:Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$IResultReceiver;

    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, v0, p3, p2, v2}, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Ljava/lang/ref/WeakReference;)V

    .line 194
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->onStartSearchTask:Lcom/daaw/avee/Common/Events/WeakEvent3;

    iget p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->pageIndex:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v1, p3, p1}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/String;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    .line 195
    invoke-virtual {v1, p2}, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method


# virtual methods
.method protected addDataAndNotify(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 207
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->clearItemIdent()V

    .line 208
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->getAssociatedAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 213
    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method protected clearDataAndNotify()V
    .locals 1

    .line 199
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->clearItemIdent()V

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 201
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->getAssociatedAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 203
    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method protected dataChangedNotify()V
    .locals 1

    .line 222
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->getAssociatedAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 224
    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method protected getContent(Z)Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TV;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 157
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->getContent(Z)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1

    .line 159
    :cond_0
    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleListQuery:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method protected justAddData(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 218
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public updateSearchQuery(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable<",
            "TT;>;)V"
        }
    .end annotation

    const/4 p1, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    .line 164
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    .line 172
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {v1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iput-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleList:Ljava/util/List;

    .line 173
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleListQuery:Ljava/lang/String;

    .line 174
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->setSearchActive(ZZ)V

    .line 176
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->originalContent:Ljava/util/List;

    if-nez p1, :cond_1

    .line 177
    invoke-super {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ListContainerBase;->getList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->originalContent:Ljava/util/List;

    .line 179
    :cond_1
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->RefreshContent()Z

    .line 180
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->originalContent:Ljava/util/List;

    invoke-direct {p0, p2, p3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->startSearch(Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Ljava/util/List;)V

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x0

    .line 165
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleList:Ljava/util/List;

    .line 166
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->visibleListQuery:Ljava/lang/String;

    .line 167
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->originalContent:Ljava/util/List;

    .line 168
    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->setSearchActive(ZZ)V

    .line 170
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;->RefreshContent()Z

    :goto_1
    return-void
.end method
