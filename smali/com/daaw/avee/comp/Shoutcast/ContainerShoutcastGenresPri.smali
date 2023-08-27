.class public Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;
.source "ContainerShoutcastGenresPri.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ThisItemIdentifier;,
        Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;,
        Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final primaryActionIndex:I


# instance fields
.field itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field private itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;>;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;II)V"
        }
    .end annotation

    .line 356
    new-instance v3, Lcom/daaw/avee/Common/ArrayListFactory;

    invoke-direct {v3}, Lcom/daaw/avee/Common/ArrayListFactory;-><init>()V

    new-instance v7, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterGenreDesc;

    invoke-direct {v7, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterGenreDesc;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;I)V

    const/4 p1, 0x0

    new-array p2, p1, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 44
    iput-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    new-array p1, p1, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 88
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    return-void
.end method

.method public static CreatePrimaryGenres(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;II)",
            "Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;"
        }
    .end annotation

    .line 352
    new-instance v7, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;

    new-instance v2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;-><init>()V

    move-object v0, v7

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)V

    return-object v7
.end method

.method private static getChildItemsGenresPri(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Lcom/daaw/avee/Common/VAsyncTask;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;)",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;>;"
        }
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method private getGenreById(Ljava/lang/String;)Lcom/daaw/avee/comp/IceCast/GenreDesc;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 492
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->getList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 496
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->getList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    .line 497
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->getList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    iget-object v4, v4, Lcom/daaw/avee/comp/IceCast/GenreDesc;->id:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static reviewUIString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 482
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f10018d

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method


# virtual methods
.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 379
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/16 p2, 0x9

    const/16 v0, 0xf

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 380
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 9

    const-string v0, ""

    .line 397
    invoke-static {v0, p2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getGenreName2(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/Common/IVAsyncTask;

    move-result-object v6

    .line 399
    new-instance v0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec;

    new-instance v4, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;

    invoke-direct {v4, p2}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;-><init>(Ljava/lang/String;)V

    .line 401
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget v8, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->pageIndex:I

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)V

    .line 406
    iget-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    const/4 p2, 0x0

    .line 407
    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec;->createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1
.end method

.method public executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V
    .locals 2

    .line 458
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    .line 459
    aget-object p2, v0, p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->execute(Lcom/daaw/avee/ContextData;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 0

    .line 387
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    .line 388
    iget-object p1, p1, Lcom/daaw/avee/comp/IceCast/GenreDesc;->id:Ljava/lang/String;

    return-object p1
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    .line 446
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000ba

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 448
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method

.method public getView(Lcom/daaw/avee/comp/IceCast/GenreDesc;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 3

    .line 428
    new-instance p2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ThisItemIdentifier;

    invoke-direct {p2, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ThisItemIdentifier;-><init>(Lcom/daaw/avee/comp/IceCast/GenreDesc;)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v0

    invoke-virtual {p3, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 430
    sget-object p2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 431
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setSelected(Z)V

    .line 432
    iget-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    invoke-virtual {p3, p2, v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    .line 434
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p2, 0x0

    .line 435
    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 436
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 437
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget-object v1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object p1, p1, Lcom/daaw/avee/comp/IceCast/GenreDesc;->name:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->reviewUIString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 438
    iget-object p1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget p2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->color:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 439
    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 440
    iget-object p1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 420
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    .line 422
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 423
    iput p2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 424
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->getView(Lcom/daaw/avee/comp/IceCast/GenreDesc;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method

.method public updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 453
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterGenreDesc;

    invoke-direct {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterGenreDesc;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->updateSearchQuery(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)V

    return-void
.end method
