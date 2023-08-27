.class Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;
.super Ljava/lang/Object;
.source "ContainerShoutcastGenresSec.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ChildContentAccessorGenresSecondary"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func1<",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
        ">;>;"
    }
.end annotation


# instance fields
.field private content:Lcom/daaw/avee/Common/MultiList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;"
        }
    .end annotation
.end field

.field private genreId:Ljava/lang/String;

.field taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/TaskLimiter<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 95
    iput-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->content:Lcom/daaw/avee/Common/MultiList;

    .line 102
    new-instance v0, Lcom/daaw/avee/Common/TaskLimiter;

    invoke-direct {v0}, Lcom/daaw/avee/Common/TaskLimiter;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    .line 99
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->genreId:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$002(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;Lcom/daaw/avee/Common/MultiList;)Lcom/daaw/avee/Common/MultiList;
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->content:Lcom/daaw/avee/Common/MultiList;

    return-object p1
.end method


# virtual methods
.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 91
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Ljava/util/List;

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
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;"
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->content:Lcom/daaw/avee/Common/MultiList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/TaskLimiter;->isTaskRunning(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 110
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    .line 112
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/TaskLimiter;->CancelOld()V

    .line 114
    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getShoutcastDirectory()Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->genreId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->getStations(Ljava/lang/String;)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object v0

    .line 123
    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    new-instance v3, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary$1;

    invoke-direct {v3, p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary$1;-><init>(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)V

    invoke-virtual {v2, v1, v0, v3}, Lcom/daaw/avee/Common/TaskLimiter;->RunNew(Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    return-object v1

    .line 153
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->content:Lcom/daaw/avee/Common/MultiList;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/4 v0, 0x0

    .line 155
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    .line 157
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->content:Lcom/daaw/avee/Common/MultiList;

    invoke-static {p1, v0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Lcom/daaw/avee/Common/MultiList;)V

    .line 159
    iget-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresSec$ChildContentAccessorGenresSecondary;->content:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/MultiList;->unmodifiableList2()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
