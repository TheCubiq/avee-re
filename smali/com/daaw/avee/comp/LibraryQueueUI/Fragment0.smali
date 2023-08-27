.class public Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;
.super Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;
.source "Fragment0.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$ContainerScrollData;
    }
.end annotation


# instance fields
.field private backSwipeProgress:Landroid/view/View;

.field private currentAbsoluteLibraryAddress:Ljava/lang/String;

.field private libraryRootAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

.field private pathContainerData:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$ContainerScrollData;",
            ">;"
        }
    .end annotation
.end field

.field private pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

.field private recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;-><init>()V

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathContainerData:Ljava/util/HashMap;

    const-string v0, ""

    .line 36
    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    return-void
.end method

.method private getSearchEntryOptions(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;
    .locals 1

    .line 374
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 375
    sget-object p1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->refuse:Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    return-object p1

    .line 376
    :cond_0
    invoke-static {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getSearchEntryOptions(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    move-result-object p1

    return-object p1
.end method

.method public static newInstance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;
    .locals 2

    .line 46
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;-><init>()V

    .line 47
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 48
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private updateSearchInfo(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)V
    .locals 4

    .line 367
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 368
    invoke-static {v0}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 369
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getSearchEntryOptions(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    move-result-object p1

    .line 370
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->onUpdateSearchOptions:Lcom/daaw/avee/Common/Events/WeakEvent4;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-boolean v2, p1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->enabled:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v3, p1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->hint:Ljava/lang/String;

    iget-object p1, p1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method getScrollPosition()I
    .locals 2

    .line 391
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 392
    instance-of v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v1, :cond_0

    .line 393
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getSearchEntryOptions()Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 381
    :goto_0
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getSearchEntryOptions(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    move-result-object v0

    return-object v0
.end method

.method isViewCreated()Z
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public navigateForBackwardLibraryAddress()V
    .locals 3

    .line 225
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    .line 228
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2f

    if-ne v1, v2, :cond_0

    .line 229
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v1

    goto :goto_0

    .line 231
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    :goto_0
    if-gtz v1, :cond_1

    const-string v0, "/"

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 237
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const/4 v1, 0x0

    .line 240
    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)V

    return-void
.end method

.method public navigateForBackwardProgress(F)V
    .locals 2

    .line 219
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->backSwipeProgress:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    .line 220
    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    .line 221
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->backSwipeProgress:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method

.method public navigateForwardLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    .line 284
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 287
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateLibraryAddressRecursive(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    .line 288
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    .line 289
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentAbsoluteLibraryAddress:I

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;)V

    .line 290
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->setLibraryAdapter(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)V

    return-void
.end method

.method public navigateLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 244
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;Z)V

    return-void
.end method

.method public navigateLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;Z)V
    .locals 3

    .line 248
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x2f

    const/4 v2, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v1, :cond_1

    :cond_0
    const-string p2, "/"

    :cond_1
    if-nez p1, :cond_2

    .line 252
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->libraryRootAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    :cond_2
    if-nez p3, :cond_3

    if-eqz p1, :cond_3

    .line 255
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p3, :cond_3

    .line 256
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p3

    check-cast p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    if-eqz p3, :cond_3

    .line 258
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object p3

    invoke-interface {p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    return-void

    .line 264
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_5

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result p3

    if-ne p3, v1, :cond_5

    if-nez p1, :cond_4

    .line 267
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->libraryRootAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    .line 269
    :cond_4
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3}, Lcom/astuetz/PagerSlidingTabStrip;->myClearTabs()V

    .line 270
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getDisplayName()Lcom/daaw/avee/Common/IVAsyncTask;

    move-result-object v0

    .line 271
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getDisplayIconResId()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object v2

    .line 270
    invoke-virtual {p3, v0, v1, v2}, Lcom/astuetz/PagerSlidingTabStrip;->myAddTab(Lcom/daaw/avee/Common/IVAsyncTask;ILjava/lang/Object;)V

    const/4 p3, 0x1

    .line 273
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2, p3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 276
    :cond_5
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateLibraryAddressRecursive(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    .line 277
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    .line 278
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget p3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentAbsoluteLibraryAddress:I

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    invoke-virtual {p2, p3, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;)V

    .line 279
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->setLibraryAdapter(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)V

    return-void
.end method

.method navigateLibraryAddressRecursive(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 4

    if-eqz p2, :cond_2

    .line 294
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x2f

    .line 295
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_1

    const-string v0, ""

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 303
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    .line 304
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object p2, v1

    .line 307
    :goto_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-interface {v1, v2, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 310
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getDisplayName()Lcom/daaw/avee/Common/IVAsyncTask;

    move-result-object v1

    invoke-virtual {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getDisplayIconResId()I

    move-result v2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, Lcom/astuetz/PagerSlidingTabStrip;->myAddTab(Lcom/daaw/avee/Common/IVAsyncTask;ILjava/lang/Object;)V

    .line 311
    invoke-virtual {p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateLibraryAddressRecursive(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    .line 54
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActivityCreated(Landroid/os/Bundle;)V

    .line 57
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentAbsoluteLibraryAddress:I

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, ""

    .line 58
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    :cond_0
    const/4 p1, 0x0

    .line 60
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 72
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p3

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentAbsoluteLibraryAddress:I

    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getString(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    if-nez p3, :cond_0

    const-string p3, ""

    .line 73
    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    :cond_0
    const p3, 0x7f0c0074

    const/4 v0, 0x0

    .line 75
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090272

    .line 77
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/UtilsUI;->setStatusBarDimensions(Landroid/view/View;)V

    .line 79
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const v1, 0x7f09026c

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p2, p3, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    const p2, 0x7f090052

    .line 81
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->backSwipeProgress:Landroid/view/View;

    const/4 p2, 0x0

    .line 82
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateForBackwardProgress(F)V

    const p2, 0x7f0901f4

    .line 84
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/astuetz/PagerSlidingTabStrip;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    .line 86
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f06001a

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    .line 87
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setTextColor(I)V

    .line 88
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setTextColorSelected(I)V

    .line 89
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setDividerColor(I)V

    .line 90
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setUnderlineColor(I)V

    .line 91
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setIndicatorColor(I)V

    .line 93
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathTabStrip:Lcom/astuetz/PagerSlidingTabStrip;

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$1;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;)V

    invoke-virtual {p2, p3}, Lcom/astuetz/PagerSlidingTabStrip;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090190

    .line 102
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    .line 112
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 122
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 124
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/SpacesItemDecoration;

    const/4 v1, 0x1

    const v2, 0x7f0400c0

    invoke-static {p2, v2}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v2

    invoke-direct {p3, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/SpacesItemDecoration;-><init>(II)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    const p2, 0x7f0901f5

    .line 126
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 127
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/daaw/avee/Common/UtilsUI;->disallowInterceptTouchEventRecursive(Landroid/view/View;Landroid/view/ViewParent;)V

    .line 129
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getActivity()Landroid/app/Activity;

    move-result-object p3

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, p3, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;-><init>(Landroid/content/Context;ILjava/lang/ref/WeakReference;)V

    .line 130
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->libraryRootAdapter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    const/4 p2, 0x0

    .line 132
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    invoke-virtual {p0, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)V

    .line 133
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->updateTrackInfo()V

    .line 134
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->updateSearchInfo()V

    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    .line 65
    invoke-super {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onDestroy()V

    return-void
.end method

.method public refreshAdapter(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 2

    .line 212
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    return-void

    .line 213
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    if-eqz v0, :cond_1

    .line 214
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->containsContainerIdentifier(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 215
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method setLibraryAdapter(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)V
    .locals 7

    .line 318
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 324
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object v2

    .line 325
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object v3

    .line 327
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x1

    if-ge v4, v5, :cond_0

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 329
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v6, 0x0

    :goto_1
    if-eqz v1, :cond_2

    .line 334
    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathContainerData:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 336
    :cond_2
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$ContainerScrollData;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$ContainerScrollData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;)V

    .line 337
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getScrollPosition()I

    move-result v3

    iput v3, v2, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$ContainerScrollData;->scrollPosition:I

    .line 338
    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathContainerData:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    if-eq v0, p1, :cond_6

    if-eqz v0, :cond_4

    .line 344
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->dispose()V

    .line 346
    :cond_4
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->updateSearchInfo(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)V

    .line 348
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    if-nez v1, :cond_5

    if-eqz v6, :cond_6

    .line 351
    :cond_5
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->pathContainerData:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$ContainerScrollData;

    if-eqz p1, :cond_6

    .line 353
    iget p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$ContainerScrollData;->scrollPosition:I

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->setScrollPosition(I)V

    :cond_6
    return-void
.end method

.method setScrollPosition(I)V
    .locals 2

    .line 400
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    .line 403
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->scrollToPosition(I)V

    :cond_0
    return-void
.end method

.method public updateLibraryItems()V
    .locals 3

    .line 186
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 189
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 192
    invoke-virtual {v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 194
    invoke-interface {v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->RefreshContent(Z)Z

    move-result v0

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 207
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->currentAbsoluteLibraryAddress:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;Z)V

    :cond_2
    return-void
.end method

.method public updateSearchInfo()V
    .locals 1

    .line 385
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 386
    :goto_0
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->updateSearchInfo(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)V

    return-void
.end method

.method public updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 360
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    return-void

    .line 361
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    if-eqz v0, :cond_1

    .line 363
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public updateTrackInfo()V
    .locals 4

    .line 145
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    return-void

    .line 147
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 174
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 177
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v2

    .line 178
    instance-of v3, v2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    if-eqz v3, :cond_1

    .line 179
    check-cast v2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->refreshSelection()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
