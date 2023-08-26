.class Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;
.super Ljava/lang/Object;
.source "ContainerShoutcastGenresPri.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ContentAccessorGenresPrimary"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func1<",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        ">;>;"
    }
.end annotation


# instance fields
.field container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

.field content:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;"
        }
    .end annotation
.end field

.field entriesTask:Lcom/daaw/avee/Common/VAsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;>;"
        }
    .end annotation
.end field

.field initialized:Z

.field shoutcastDirectory:Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;>;"
        }
    .end annotation
.end field

.field taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/TaskLimiter<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 199
    iput-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->content:Ljava/util/List;

    const/4 v0, 0x0

    .line 204
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->initialized:Z

    .line 206
    new-instance v0, Lcom/daaw/avee/Common/TaskLimiter;

    invoke-direct {v0}, Lcom/daaw/avee/Common/TaskLimiter;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    .line 212
    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getShoutcastDirectory()Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->shoutcastDirectory:Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    return-void
.end method


# virtual methods
.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 196
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Ljava/util/List;

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
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;"
        }
    .end annotation

    .line 218
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->content:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/TaskLimiter;->isTaskRunning(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 220
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    .line 222
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/TaskLimiter;->CancelOld()V

    .line 226
    invoke-static {v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getGenreChildren(Ljava/lang/String;)Lcom/daaw/avee/Common/IVAsyncTask;

    move-result-object v0

    .line 235
    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    new-instance v3, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;

    invoke-direct {v3, p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;-><init>(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)V

    invoke-virtual {v2, v1, v0, v3}, Lcom/daaw/avee/Common/TaskLimiter;->RunNew(Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    return-object v1

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->content:Ljava/util/List;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/4 v0, 0x0

    .line 280
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    .line 282
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->content:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/util/List;)V

    .line 284
    iget-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->content:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
