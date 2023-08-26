.class Lcom/daaw/avee/comp/IceCast/ContentAccessor;
.super Ljava/lang/Object;
.source "ContentAccessorOld.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func1<",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        ">;>;"
    }
.end annotation


# static fields
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


# instance fields
.field container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

.field content:Lcom/daaw/avee/Common/MultiList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;"
        }
    .end annotation
.end field

.field entriesTask:Lcom/daaw/avee/Common/VAsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field iceCastDirectory:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/IceCast/IceCastDirectory<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field initialized:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->content:Lcom/daaw/avee/Common/MultiList;

    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->initialized:Z

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/IceCast/ContentAccessor;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->refreshEntries()V

    return-void
.end method

.method private refreshEntries()V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->entriesTask:Lcom/daaw/avee/Common/VAsyncTask;

    invoke-static {v0}, Lcom/daaw/avee/Common/VAsyncTask;->CancelTaskSafe(Lcom/daaw/avee/Common/VAsyncTask;)V

    const/4 v0, 0x0

    .line 94
    iput-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->entriesTask:Lcom/daaw/avee/Common/VAsyncTask;

    .line 96
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->iceCastDirectory:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->getCachedEntries()Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->entriesTask:Lcom/daaw/avee/Common/VAsyncTask;

    .line 100
    new-instance v1, Lcom/daaw/avee/comp/IceCast/ContentAccessor$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/IceCast/ContentAccessor$3;-><init>(Lcom/daaw/avee/comp/IceCast/ContentAccessor;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/VAsyncTask;->Run(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 26
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation

    .line 47
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    .line 49
    iget-boolean v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->initialized:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    new-instance v3, Lcom/daaw/avee/comp/IceCast/ContentAccessor$1;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/IceCast/ContentAccessor$1;-><init>(Lcom/daaw/avee/comp/IceCast/ContentAccessor;)V

    new-instance v4, Lcom/daaw/avee/Common/MultiList$Factory;

    invoke-direct {v4}, Lcom/daaw/avee/Common/MultiList$Factory;-><init>()V

    const-string v5, "http://dir.xiph.org/yp.xml"

    const-string v6, "xiph_org_yp"

    invoke-direct {v0, v5, v6, v3, v4}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->iceCastDirectory:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    .line 61
    invoke-virtual {p1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->updateStatusInfo(Ljava/lang/String;)V

    .line 62
    invoke-direct {p0}, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->refreshEntries()V

    .line 64
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->iceCastDirectory:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    new-instance v3, Lcom/daaw/avee/comp/IceCast/ContentAccessor$2;

    invoke-direct {v3, p0, p1}, Lcom/daaw/avee/comp/IceCast/ContentAccessor$2;-><init>(Lcom/daaw/avee/comp/IceCast/ContentAccessor;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)V

    const-wide/32 v4, 0xea60

    invoke-virtual {v0, v3, v4, v5}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->Refresh(Lcom/daaw/avee/Common/Action1;J)V

    .line 74
    iput-boolean v1, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->initialized:Z

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->content:Lcom/daaw/avee/Common/MultiList;

    if-nez v0, :cond_1

    .line 79
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    return-object v2

    :cond_1
    const/4 v0, 0x0

    .line 83
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    .line 85
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->content:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Lcom/daaw/avee/Common/MultiList;)V

    .line 87
    iget-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->content:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/MultiList;->unmodifiableList1()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Lcom/daaw/avee/Common/MultiList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;)V"
        }
    .end annotation

    .line 117
    sget-object v0, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getPageIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Design/SortDesign$SortDesc;

    const/16 v0, 0xa

    .line 119
    invoke-static {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/StationSortingUtils;->getSortComparator(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/util/Comparator;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 124
    :try_start_0
    invoke-static {p2, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Comparator<Tuple2<PlaylistSong, StationEntry>> exception"

    .line 126
    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 127
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
