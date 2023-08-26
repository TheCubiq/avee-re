.class Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;
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
    name = "ChildContentAccessorGenresPrimary"
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
.field private content:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;"
        }
    .end annotation
.end field

.field private genreId:Ljava/lang/String;

.field private taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;
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
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 98
    iput-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->content:Ljava/util/List;

    .line 99
    new-instance v0, Lcom/daaw/avee/Common/TaskLimiter;

    invoke-direct {v0}, Lcom/daaw/avee/Common/TaskLimiter;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    .line 104
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->genreId:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$002(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->content:Ljava/util/List;

    return-object p1
.end method

.method private sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/util/List;)V
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


# virtual methods
.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 94
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Ljava/util/List;

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

    .line 110
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->content:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/TaskLimiter;->isTaskRunning(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 112
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    .line 114
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/TaskLimiter;->CancelOld()V

    .line 118
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->genreId:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getGenreChildren(Ljava/lang/String;)Lcom/daaw/avee/Common/IVAsyncTask;

    move-result-object v0

    .line 127
    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->taskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    new-instance v3, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary$1;

    invoke-direct {v3, p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary$1;-><init>(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)V

    invoke-virtual {v2, v1, v0, v3}, Lcom/daaw/avee/Common/TaskLimiter;->RunNew(Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    return-object v1

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->content:Ljava/util/List;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/4 v0, 0x0

    .line 159
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLoadingActive(Z)V

    .line 161
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->content:Ljava/util/List;

    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/util/List;)V

    .line 163
    iget-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ChildContentAccessorGenresPrimary;->content:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
