.class Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;
.super Ljava/lang/Object;
.source "ContainerIcecast.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/IceCast/ContainerIcecast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ContentAccessor2"
.end annotation

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


# instance fields
.field private content:Lcom/daaw/avee/Common/MultiList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;"
        }
    .end annotation
.end field

.field taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/TaskLimiter<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 184
    iput-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->content:Lcom/daaw/avee/Common/MultiList;

    .line 191
    new-instance v0, Lcom/daaw/avee/Common/TaskLimiter;

    invoke-direct {v0}, Lcom/daaw/avee/Common/TaskLimiter;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    return-void
.end method

.method static synthetic access$002(Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;Lcom/daaw/avee/Common/MultiList;)Lcom/daaw/avee/Common/MultiList;
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->content:Lcom/daaw/avee/Common/MultiList;

    return-object p1
.end method

.method private sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Lcom/daaw/avee/Common/MultiList;)V
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

    .line 254
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

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

    .line 256
    invoke-static {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/StationSortingUtils;->getSortComparator(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/util/Comparator;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 261
    :try_start_0
    invoke-static {p2, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Comparator<Tuple2<PlaylistSong, StationEntry>> exception"

    .line 263
    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 264
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 180
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Ljava/util/List;
    .locals 4
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

    .line 197
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->content:Lcom/daaw/avee/Common/MultiList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/TaskLimiter;->isTaskRunning(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 199
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    .line 201
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/TaskLimiter;->CancelOld()V

    .line 203
    invoke-static {}, Lcom/daaw/avee/comp/IceCast/IcecastUtils;->getIcecastDirectory()Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->getStations()Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object v0

    .line 212
    iget-object v2, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    new-instance v3, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2$1;

    invoke-direct {v3, p0, p1}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2$1;-><init>(Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)V

    invoke-virtual {v2, v1, v0, v3}, Lcom/daaw/avee/Common/TaskLimiter;->RunNew(Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    return-object v1

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->content:Lcom/daaw/avee/Common/MultiList;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/4 v0, 0x0

    .line 244
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    .line 246
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->content:Lcom/daaw/avee/Common/MultiList;

    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Lcom/daaw/avee/Common/MultiList;)V

    .line 248
    iget-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ContentAccessor2;->content:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/MultiList;->unmodifiableList1()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
