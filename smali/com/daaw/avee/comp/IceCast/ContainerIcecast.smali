.class public Lcom/daaw/avee/comp/IceCast/ContainerIcecast;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;
.source "ContainerIcecast.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;,
        Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final primaryActionSongIndex:I


# instance fields
.field itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field private itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 9

    .line 272
    new-instance v2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;

    invoke-direct {v2}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;-><init>()V

    new-instance v3, Lcom/daaw/avee/Common/ArrayListFactory;

    invoke-direct {v3}, Lcom/daaw/avee/Common/ArrayListFactory;-><init>()V

    new-instance v5, Lcom/daaw/avee/Common/VTaskResult;

    invoke-direct {v5, p3}, Lcom/daaw/avee/Common/VTaskResult;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterPlaylistSong;

    invoke-direct {v7, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterPlaylistSong;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    move v6, p4

    move v8, p5

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;I)V

    const/4 p1, 0x6

    new-array p1, p1, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 46
    new-instance p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$1;-><init>(Lcom/daaw/avee/comp/IceCast/ContainerIcecast;)V

    const/4 p3, 0x0

    aput-object p2, p1, p3

    new-instance p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$2;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$2;-><init>(Lcom/daaw/avee/comp/IceCast/ContainerIcecast;)V

    const/4 p4, 0x1

    aput-object p2, p1, p4

    new-instance p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$3;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$3;-><init>(Lcom/daaw/avee/comp/IceCast/ContainerIcecast;)V

    const/4 p4, 0x2

    aput-object p2, p1, p4

    new-instance p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$4;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$4;-><init>(Lcom/daaw/avee/comp/IceCast/ContainerIcecast;)V

    const/4 p4, 0x3

    aput-object p2, p1, p4

    new-instance p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$5;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$5;-><init>(Lcom/daaw/avee/comp/IceCast/ContainerIcecast;)V

    const/4 p4, 0x4

    aput-object p2, p1, p4

    new-instance p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$6;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$6;-><init>(Lcom/daaw/avee/comp/IceCast/ContainerIcecast;)V

    const/4 p4, 0x5

    aput-object p2, p1, p4

    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    new-array p1, p3, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 149
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    return-void
.end method


# virtual methods
.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 323
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/16 p2, 0xe

    const/16 v0, 0xf

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 324
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

    .line 438
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    .line 439
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

    .line 426
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000ba

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 428
    invoke-virtual {p0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method

.method public getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 1

    .line 405
    invoke-virtual {p0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    invoke-virtual {p3, p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 410
    iget p2, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->colorImgArt:I

    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    const/4 p2, 0x3

    .line 411
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgResource(I)V

    .line 412
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 414
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->color:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p2, 0x0

    .line 416
    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    const/4 p2, 0x2

    .line 417
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Text(Ljava/lang/String;)V

    .line 418
    iget-object p1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 12

    .line 384
    invoke-virtual {p0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 386
    move-object v7, p1

    check-cast v7, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 387
    iput p2, v7, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 389
    new-instance v2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;

    invoke-direct {v2, v3, p2}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;I)V

    iget-object v8, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move v5, p2

    move v6, p2

    invoke-static/range {v1 .. v11}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V

    return-void
.end method

.method public updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 433
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterPlaylistSong;

    invoke-direct {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterPlaylistSong;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;->updateSearchQuery(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)V

    return-void
.end method
