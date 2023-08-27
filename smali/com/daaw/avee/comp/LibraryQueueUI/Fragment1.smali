.class public Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;
.super Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;
.source "Fragment1.java"


# instance fields
.field private dataAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

.field private lastQueuePositions:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field private recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->lastQueuePositions:Ljava/util/ArrayDeque;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method public static newInstance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;
    .locals 2

    .line 50
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;-><init>()V

    .line 51
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 52
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public getSearchEntryOptions()Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;
    .locals 2

    .line 258
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 259
    sget-object v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->refuse:Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    return-object v0

    .line 261
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v1, :cond_1

    .line 262
    sget-object v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->refuse:Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    return-object v0

    .line 264
    :cond_1
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    if-nez v1, :cond_2

    .line 266
    sget-object v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->refuse:Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    return-object v0

    .line 268
    :cond_2
    invoke-static {v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getSearchEntryOptions(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    move-result-object v0

    return-object v0
.end method

.method isViewCreated()Z
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 158
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    const p3, 0x7f0c0075

    const/4 v0, 0x0

    .line 66
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090272

    .line 67
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/UtilsUI;->setStatusBarDimensions(Landroid/view/View;)V

    .line 69
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent2;

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f09026c

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    const p2, 0x7f090190

    .line 71
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    .line 81
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 91
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 94
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    .line 95
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getActivity()Landroid/app/Activity;

    move-result-object v2

    new-instance v3, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$1;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;)V

    const-string v4, "nowplaying"

    const-string v5, "Playlist"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v1, p2

    invoke-direct/range {v1 .. v7}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Ljava/lang/String;ZI)V

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->dataAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    .line 107
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 108
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->dataAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 109
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/SpacesItemDecoration;

    const v1, 0x7f0400c0

    invoke-static {p2, v1}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v1

    invoke-direct {v0, p3, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/SpacesItemDecoration;-><init>(II)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 111
    new-instance p2, Lcom/emtronics/dragsortrecycler/DragSortRecycler;

    invoke-direct {p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;-><init>()V

    const p3, 0x7f090074

    .line 112
    invoke-virtual {p2, p3}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setViewHandleId(I)V

    const p3, 0x3ecccccd    # 0.4f

    .line 113
    invoke-virtual {p2, p3}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setFloatingAlpha(F)V

    .line 114
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f060025

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setFloatingBgColor(I)V

    const p3, 0x3e99999a    # 0.3f

    .line 116
    invoke-virtual {p2, p3}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setAutoScrollSpeed(F)V

    const p3, 0x3dcccccd    # 0.1f

    .line 117
    invoke-virtual {p2, p3}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setAutoScrollWindow(F)V

    .line 119
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;)V

    invoke-virtual {p2, p3}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setOnItemMovedListener(Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;)V

    .line 129
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 130
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->addOnItemTouchListener(Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;)V

    .line 131
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->getScrollListener()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 133
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->dataAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$3;

    invoke-direct {v0, p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;Lcom/emtronics/dragsortrecycler/DragSortRecycler;)V

    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->setOnDraggingListener(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;)V

    .line 140
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->onRequestQueueList:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance p3, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {p3}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    invoke-virtual {p2, p3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->updateTrackList(Lcom/daaw/avee/Common/MultiList;)V

    .line 141
    sget p2, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldQueuePosition:I

    sget-object p3, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    sget-object v0, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    sget-object v1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-virtual {p0, p2, p3, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->updateTrackInfo(ILcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/Common/IItemIdentifier;)V

    .line 145
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->updateSearchInfo()V

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 58
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->onServiceDisconnected(Z)V

    .line 59
    invoke-super {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onDestroy()V

    return-void
.end method

.method public onServiceDisconnected(Z)V
    .locals 0

    return-void
.end method

.method public refreshTrackList(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 2

    .line 240
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    if-eqz v0, :cond_0

    .line 241
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->containsContainerIdentifier(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 242
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public updateQueueItems()V
    .locals 1

    .line 165
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    if-eqz v0, :cond_1

    .line 168
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public updateSearchInfo()V
    .locals 5

    .line 251
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 252
    invoke-static {v0}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 253
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getSearchEntryOptions()Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    move-result-object v0

    .line 254
    sget-object v1, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->onUpdateSearchOptions:Lcom/daaw/avee/Common/Events/WeakEvent4;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-boolean v3, v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->enabled:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-object v4, v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->hint:Ljava/lang/String;

    iget-object v0, v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->dataAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public updateTrackInfo(ILcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/Common/IItemIdentifier;)V
    .locals 2

    .line 173
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getActivity()Landroid/app/Activity;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 175
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p2, :cond_1

    return-void

    .line 176
    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    if-eqz p2, :cond_9

    .line 180
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->dataAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    if-eqz p3, :cond_6

    .line 182
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->lastQueuePositions:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->size()I

    move-result p3

    const/4 v0, 0x1

    if-le p3, v0, :cond_2

    .line 183
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->lastQueuePositions:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    :cond_2
    if-eqz p4, :cond_4

    .line 185
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->lastQueuePositions:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->lastQueuePositions:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-virtual {p3, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    .line 186
    :cond_3
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->lastQueuePositions:Ljava/util/ArrayDeque;

    invoke-virtual {p3, p4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 199
    :cond_4
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->lastQueuePositions:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->dataAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-virtual {v0, p4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getPositionByIItemIdentifier(Lcom/daaw/avee/comp/Common/IItemIdentifier;)I

    move-result p4

    if-ltz p4, :cond_5

    .line 202
    invoke-virtual {p2, p4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataPositionToPosition(I)I

    move-result p4

    .line 203
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p4}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p4

    .line 204
    instance-of v0, p4, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    if-eqz v0, :cond_5

    .line 205
    check-cast p4, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-virtual {p4}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->refreshSelection()V

    goto :goto_0

    .line 211
    :cond_6
    invoke-virtual {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyDataSetChanged()V

    .line 214
    :cond_7
    sget-object p3, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->onUIRequestFollowCurrentValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 p4, 0x0

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_9

    .line 217
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p3

    check-cast p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 219
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0015

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    .line 221
    invoke-virtual {p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p3

    add-int/lit8 v1, v0, 0x1

    sub-int/2addr p3, v1

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p3

    if-lt p1, p3, :cond_8

    .line 224
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataPositionToPosition(I)I

    move-result p1

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    goto :goto_1

    .line 226
    :cond_8
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dataPositionToPosition(I)I

    move-result p1

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_9
    :goto_1
    return-void
.end method

.method public updateTrackList(Lcom/daaw/avee/Common/MultiList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;)V"
        }
    .end annotation

    .line 233
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->dataAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 234
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->RefreshContent(Z)Z

    :cond_0
    return-void
.end method
