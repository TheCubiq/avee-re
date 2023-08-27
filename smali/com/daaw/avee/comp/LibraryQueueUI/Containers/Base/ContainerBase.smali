.class public abstract Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;
.super Ljava/lang/Object;
.source "ContainerBase.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase$SelectionContainerAddressIdentifier;
    }
.end annotation


# static fields
.field public static onCompareSearchTask:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Landroid/os/AsyncTask;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onContainerDataSetChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onMoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
            "Landroid/widget/ImageView;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestContainerItemHeight:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Lcom/daaw/avee/Design/SortDesign$SortDesc;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestFilterFileResult:Lcom/daaw/avee/Common/Events/WeakEventR3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR3<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Ljava/io/File;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestSectionOpenedState:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetSectionOpened:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static onStartSearchTask:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Landroid/os/AsyncTask;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected color:I

.field protected colorContainerDark:I

.field protected colorImgArt:I

.field protected colorLight:I

.field protected containerStatusListener:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;",
            ">;"
        }
    .end annotation
.end field

.field protected displayIconResId:I

.field protected displayName:Lcom/daaw/avee/Common/IVAsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isLoadingActive:Z

.field private isSearchActive:Z

.field private itemsIdent:Ljava/lang/String;

.field protected libraryAddress:Ljava/lang/String;

.field protected libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;",
            ">;"
        }
    .end annotation
.end field

.field protected onDraggingListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;

.field protected pageIndex:I

.field protected selectionContainerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 40
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 41
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 42
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 43
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestFilterFileResult:Lcom/daaw/avee/Common/Events/WeakEventR3;

    .line 44
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestSectionOpenedState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 45
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onSetSectionOpened:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 46
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onMoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 48
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onCompareSearchTask:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 49
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onStartSearchTask:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 50
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onContainerDataSetChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 51
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestContainerItemHeight:Lcom/daaw/avee/Common/Events/WeakEventR1;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;II)V"
        }
    .end annotation

    .line 75
    new-instance v6, Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;IILjava/lang/ref/WeakReference;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;IILjava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;II",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;",
            ">;)V"
        }
    .end annotation

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->containerStatusListener:Ljava/lang/ref/WeakReference;

    const/4 v0, -0x1

    .line 65
    iput v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->pageIndex:I

    .line 66
    iput-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->itemsIdent:Ljava/lang/String;

    const/4 v0, 0x0

    .line 67
    iput-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->isSearchActive:Z

    .line 68
    iput-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->isLoadingActive:Z

    .line 92
    iput p5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->pageIndex:I

    .line 94
    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->displayName:Lcom/daaw/avee/Common/IVAsyncTask;

    .line 95
    iput p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->displayIconResId:I

    .line 96
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->libraryAddress:Ljava/lang/String;

    .line 98
    invoke-virtual {p0, p6}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    const p4, 0x7f0400c1

    invoke-static {p3, p4}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/content/res/Resources$Theme;I)I

    move-result p3

    iput p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->color:I

    .line 106
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    const p5, 0x7f0400c2

    invoke-static {p3, p5}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/content/res/Resources$Theme;I)I

    move-result p3

    iput p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->colorLight:I

    .line 107
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    invoke-static {p3, p4}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/content/res/Resources$Theme;I)I

    move-result p3

    iput p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->colorImgArt:I

    .line 108
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const p3, 0x7f0400c0

    invoke-static {p1, p3}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/content/res/Resources$Theme;I)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->colorContainerDark:I

    .line 111
    invoke-static {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->makeContainerIdentifier(Ljava/lang/String;)Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->selectionContainerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    return-void
.end method

.method protected static makeContainerIdentifier(Ljava/lang/String;)Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;
    .locals 1

    .line 121
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase$SelectionContainerAddressIdentifier;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase$SelectionContainerAddressIdentifier;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract RefreshContent()Z
.end method

.method public RefreshContent(Z)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 295
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->clearItemIdent()V

    .line 296
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->RefreshContent()Z

    move-result p1

    return p1
.end method

.method protected checkItemIdent(Ljava/lang/String;Z)Z
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->itemsIdent:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->checkItemIdentEquals(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p2, :cond_1

    .line 140
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->itemsIdent:Ljava/lang/String;

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method protected checkItemIdentEquals(Ljava/lang/String;)Z
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->itemsIdent:Ljava/lang/String;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 148
    invoke-static {v0, p1}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected clearItemIdent()V
    .locals 1

    const/4 v0, 0x0

    .line 154
    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->itemsIdent:Ljava/lang/String;

    return-void
.end method

.method public containsContainerIdentifier(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Z
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->selectionContainerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected abstract createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
.end method

.method public abstract createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
.end method

.method public createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    const/4 v0, -0x1

    .line 125
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1
.end method

.method public createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 0

    .line 129
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1
.end method

.method public executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V
    .locals 0

    return-void
.end method

.method public getContainerItemHeight()Lcom/daaw/avee/Common/Tuple2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 283
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestContainerItemHeight:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    const/16 v2, 0x38

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/Common/Tuple2;

    return-object v0
.end method

.method public getDisplayIconResId()I
    .locals 1

    .line 162
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->displayIconResId:I

    return v0
.end method

.method public getDisplayName()Lcom/daaw/avee/Common/IVAsyncTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->displayName:Lcom/daaw/avee/Common/IVAsyncTask;

    return-object v0
.end method

.method protected getIsSearchActive()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract getItemCount()I
.end method

.method protected abstract getItemPositionToItemAddress(I)Ljava/lang/String;
.end method

.method public getLibraryAddress()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->libraryAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getLibraryContainerDataListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    return-object v0
.end method

.method public getOnDraggingListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onDraggingListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;

    return-object v0
.end method

.method public getPageIndex()I
    .locals 1

    .line 116
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->pageIndex:I

    return v0
.end method

.method public getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 202
    aput-object p1, p2, v0

    .line 203
    aput-object p1, p3, v0

    return-void
.end method

.method public getSectionOpened()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->selectionContainerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    return-object v0
.end method

.method public getShowAlbumArtValue()Z
    .locals 2

    .line 277
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public makeChildAddress(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    if-eqz v0, :cond_0

    .line 173
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getLibraryAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->makeChildAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 175
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getLibraryAddress()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public onListViewClick(ILandroid/content/Context;)Z
    .locals 1

    .line 184
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    if-eqz p2, :cond_0

    .line 187
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getLibraryAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getItemPositionToItemAddress(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->onNavigateForward(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setContainerStatusListener(Ljava/lang/ref/WeakReference;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;",
            ">;)V"
        }
    .end annotation

    .line 217
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->containerStatusListener:Ljava/lang/ref/WeakReference;

    .line 218
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    if-eqz p1, :cond_0

    .line 220
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getItemCount()I

    move-result v0

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->isSearchActive:Z

    iget-boolean v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->isLoadingActive:Z

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;->onItemCountChanged(IIZZ)V

    :cond_0
    return-void
.end method

.method public setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;",
            ">;)V"
        }
    .end annotation

    .line 225
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public setLoadingActive(Z)V
    .locals 4

    .line 252
    iput-boolean p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->isLoadingActive:Z

    .line 254
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->containerStatusListener:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    if-eqz v0, :cond_0

    .line 256
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getItemCount()I

    move-result v1

    const/4 v2, 0x0

    iget-boolean v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->isSearchActive:Z

    invoke-interface {v0, v1, v2, v3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;->onItemCountChanged(IIZZ)V

    :cond_0
    return-void
.end method

.method public setOnDraggingListener(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onDraggingListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;

    return-void
.end method

.method protected setSearchActive(ZZ)V
    .locals 3

    .line 244
    iput-boolean p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->isSearchActive:Z

    .line 246
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->containerStatusListener:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 248
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getItemCount()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, -0x1

    :goto_0
    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->isSearchActive:Z

    iget-boolean v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->isLoadingActive:Z

    invoke-interface {p1, p2, v0, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;->onItemCountChanged(IIZZ)V

    :cond_1
    return-void
.end method

.method public setSectionOpenedState(Z)V
    .locals 0

    return-void
.end method

.method public abstract updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
.end method

.method public updateStatusInfo(Ljava/lang/String;)V
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->containerStatusListener:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    if-eqz v0, :cond_0

    .line 262
    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;->onUpdateStatusInfo(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
