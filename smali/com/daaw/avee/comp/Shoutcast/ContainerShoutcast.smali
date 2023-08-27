.class public Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;
.source "ContainerShoutcast.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$ThisItemIdentifier;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase<",
        "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
        ">;>;"
    }
.end annotation


# static fields
.field public static onStationDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate3<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final primaryActionSongIndex:I


# instance fields
.field itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field private itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->onStationDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;>;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;II)V"
        }
    .end annotation

    .line 166
    new-instance v3, Lcom/daaw/avee/Common/ArrayListFactory;

    invoke-direct {v3}, Lcom/daaw/avee/Common/ArrayListFactory;-><init>()V

    new-instance v7, Lcom/daaw/avee/comp/Shoutcast/SearchFilterStation;

    invoke-direct {v7, p1}, Lcom/daaw/avee/comp/Shoutcast/SearchFilterStation;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;I)V

    const/4 p1, 0x4

    new-array p1, p1, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 49
    new-instance p2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$1;-><init>(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;)V

    const/4 p3, 0x0

    aput-object p2, p1, p3

    new-instance p2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$2;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$2;-><init>(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;)V

    const/4 p4, 0x1

    aput-object p2, p1, p4

    new-instance p2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$3;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$3;-><init>(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;)V

    const/4 p4, 0x2

    aput-object p2, p1, p4

    new-instance p2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$4;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$4;-><init>(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;)V

    const/4 p4, 0x3

    aput-object p2, p1, p4

    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    new-array p1, p3, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 101
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    return-void
.end method

.method private getPlaylistSongFromStation(Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public static getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V
    .locals 11

    move-object v0, p2

    move-object/from16 v8, p6

    .line 383
    sget-object v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    .line 384
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v1

    move-object v4, p0

    move-object v3, p1

    invoke-virtual {v8, p0, p1, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 385
    iget-object v1, v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->url:Ljava/lang/String;

    iput-object v1, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->dataId:Ljava/lang/Object;

    .line 386
    sget-object v1, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v3, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-virtual {v1, v3, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 387
    iget-object v2, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    .line 389
    new-instance v7, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$6;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$6;-><init>()V

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    move/from16 v3, p8

    move/from16 v5, p9

    move/from16 v6, p10

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;ZZLcom/daaw/avee/Common/Action1;)V

    if-eqz p10, :cond_0

    const v1, 0x7f0800d1

    .line 419
    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setBtnItemMoreImage(I)V

    :cond_0
    if-eqz v10, :cond_1

    .line 422
    iget-object v1, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 424
    :cond_1
    iget-object v1, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 425
    iget-object v1, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v3, p4, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 428
    :goto_0
    invoke-virtual/range {p6 .. p6}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->refreshSelection()V

    .line 465
    sget-object v1, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->onStationDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v8, p2, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Lcom/daaw/avee/Common/MultiList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;)V"
        }
    .end annotation

    .line 139
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getPageIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;

    const/16 v0, 0xa

    .line 141
    invoke-static {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/StationSortingUtils;->getSortComparator(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/util/Comparator;

    move-result-object p0

    .line 142
    new-instance v0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$5;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$5;-><init>(Ljava/util/Comparator;)V

    if-eqz p0, :cond_0

    .line 152
    :try_start_0
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "Comparator<Tuple2<PlaylistSong, StationEntry>> exception"

    .line 154
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 155
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 217
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/16 p2, 0xe

    const/16 v0, 0xf

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 218
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V
    .locals 2

    .line 332
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    .line 333
    aget-object p2, v0, p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->execute(Lcom/daaw/avee/ContextData;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    .line 320
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000ba

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 322
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 12

    .line 278
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;

    .line 280
    move-object v7, p1

    check-cast v7, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 281
    iput p2, v7, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 283
    new-instance v2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$ThisItemIdentifier;

    invoke-direct {v2, v3, p2}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$ThisItemIdentifier;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;I)V

    iget-object v8, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move v5, p2

    move v6, p2

    invoke-static/range {v1 .. v11}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V

    return-void
.end method

.method public updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 327
    new-instance v0, Lcom/daaw/avee/comp/Shoutcast/SearchFilterStation;

    invoke-direct {v0, p1}, Lcom/daaw/avee/comp/Shoutcast/SearchFilterStation;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->updateSearchQuery(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)V

    return-void
.end method
