.class public Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;
.super Landroid/os/AsyncTask;
.source "SearchMultiListTask.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;,
        Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        "T2:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private fileCounter:I

.field private originalList:Lcom/daaw/avee/Common/MultiList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/MultiList<",
            "TT1;TT2;>;"
        }
    .end annotation
.end field

.field private receiver:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver<",
            "TT1;TT2;>;>;"
        }
    .end annotation
.end field

.field resultReceiver0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal<",
            "TT1;TT2;>;"
        }
    .end annotation
.end field

.field private searchFilter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable<",
            "TT1;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/avee/Common/MultiList;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/Common/MultiList<",
            "TT1;TT2;>;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable<",
            "TT1;>;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver<",
            "TT1;TT2;>;>;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 p1, 0x0

    .line 22
    iput p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->fileCounter:I

    .line 24
    new-instance p1, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$1;

    invoke-direct {p1, p0}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$1;-><init>(Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->resultReceiver0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;

    .line 48
    iput-object p2, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->originalList:Lcom/daaw/avee/Common/MultiList;

    .line 49
    iput-object p3, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->searchFilter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;

    .line 50
    iput-object p4, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->receiver:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic access$008(Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;)I
    .locals 2

    .line 17
    iget v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->fileCounter:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->fileCounter:I

    return v0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;[Ljava/lang/Object;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 17
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Void;
    .locals 5

    const/4 v0, 0x0

    .line 79
    aget-object p1, p1, v0

    .line 81
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->searchFilter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p1, :cond_1

    .line 84
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 85
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->searchFilter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;->preProcessQuery(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v1

    .line 88
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->originalList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/Common/Tuple2;

    .line 89
    iget-object v3, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->resultReceiver0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;

    invoke-interface {v3}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;->isCancelled()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    .line 90
    :cond_2
    iget-object v3, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->searchFilter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;

    iget-object v2, v2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-interface {v3, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;->preProcessItem(Ljava/lang/Object;)V

    goto :goto_1

    .line 93
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->originalList:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/Common/Tuple2;

    .line 94
    iget-object v3, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->resultReceiver0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;

    invoke-interface {v3}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;->isCancelled()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    .line 95
    :cond_5
    iget-object v3, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->searchFilter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;

    iget-object v4, v2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-interface {v3, p1, v4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;->compare(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 96
    iget-object v3, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->resultReceiver0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;

    invoke-interface {v3, v2}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;->onItemFileFound(Lcom/daaw/avee/Common/Tuple2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doInBackground Exception: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_6
    :goto_4
    return-object v1
.end method

.method protected bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->onCancelled(Ljava/lang/Void;)V

    return-void
.end method

.method protected onCancelled(Ljava/lang/Void;)V
    .locals 1

    .line 73
    iget-object p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->receiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 74
    invoke-interface {p1, p0, v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;->onSearchFinished(Landroid/os/AsyncTask;Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method public onPostExecute(Ljava/lang/Void;)V
    .locals 1

    .line 61
    iget-object p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->receiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 62
    invoke-interface {p1, p0, v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;->onSearchFinished(Landroid/os/AsyncTask;Z)V

    :cond_0
    return-void
.end method

.method public onPreExecute()V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->receiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;

    if-eqz v0, :cond_0

    .line 56
    invoke-interface {v0, p0}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;->onSearchStarted(Landroid/os/AsyncTask;)V

    :cond_0
    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->receiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 68
    aget-object p1, p1, v1

    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-interface {v0, p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;->onItemFileFound(Landroid/os/AsyncTask;Lcom/daaw/avee/Common/Tuple2;)V

    :cond_0
    return-void
.end method
