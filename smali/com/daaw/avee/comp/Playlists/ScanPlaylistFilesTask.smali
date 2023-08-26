.class public Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;
.super Landroid/os/AsyncTask;
.source "ScanPlaylistFilesTask.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;,
        Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;,
        Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private resultItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private resultReceiver:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;",
            ">;"
        }
    .end annotation
.end field

.field resultReceiverInternal:Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;

.field private rootFile:Ljava/io/File;

.field private searchFilter:Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private searchQuery:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable<",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;",
            ">;)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultItems:Ljava/util/List;

    .line 25
    new-instance v0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$1;-><init>(Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultReceiverInternal:Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;

    .line 57
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->context:Landroid/content/Context;

    .line 58
    iput-object p2, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->rootFile:Ljava/io/File;

    .line 59
    iput-object p3, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->searchFilter:Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;

    .line 60
    iput-object p4, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultReceiver:Ljava/lang/ref/WeakReference;

    const-string p1, ""

    .line 61
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->searchQuery:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;)Ljava/util/List;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultItems:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;[Ljava/lang/Object;)V
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method

.method public static createScanPlaylistFilesTask(Landroid/content/Context;Ljava/io/File;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;Ljava/lang/ref/WeakReference;)Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable<",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;",
            ">;)",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;"
        }
    .end annotation

    .line 65
    new-instance v0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;-><init>(Landroid/content/Context;Ljava/io/File;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;Ljava/lang/ref/WeakReference;)V

    return-object v0
.end method

.method static getItemsRecursive(Landroid/content/Context;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;",
            "Ljava/io/File;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable<",
            "Ljava/io/File;",
            ">;)Z"
        }
    .end annotation

    .line 86
    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    const/4 v0, 0x1

    .line 89
    :try_start_0
    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    aget-object v6, p2, v3

    .line 90
    invoke-interface {p1}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_0

    return v2

    .line 92
    :cond_0
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 94
    invoke-interface {p1, v6}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;->onDir(Ljava/io/File;)V

    if-nez p3, :cond_3

    const/4 v7, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v8, p4

    move-object v9, p5

    .line 95
    invoke-static/range {v4 .. v9}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->getItemsRecursive(Landroid/content/Context;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;)Z

    move-result v4

    if-nez v4, :cond_3

    return v2

    :cond_1
    if-eqz p5, :cond_2

    .line 102
    invoke-interface {p5, p4, v6}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;->compare(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v4

    goto :goto_1

    :cond_2
    const/4 v4, 0x1

    :goto_1
    if-eqz v4, :cond_3

    .line 105
    invoke-interface {p1, v6}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;->onItemFileFound(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    :cond_4
    return v0
.end method

.method static getItemsSearch(Landroid/content/Context;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;",
            "Ljava/io/File;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable<",
            "Ljava/io/File;",
            ">;)Z"
        }
    .end annotation

    .line 75
    invoke-interface {p5, p4}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;->preProcessQuery(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p5

    .line 76
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->getItemsRecursive(Landroid/content/Context;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 16
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Void;
    .locals 7

    const/4 v0, 0x0

    .line 145
    aget-object v5, p1, v0

    .line 146
    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultReceiverInternal:Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;

    iget-object v3, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->rootFile:Ljava/io/File;

    iget-object v6, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->searchFilter:Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->getItemsSearch(Landroid/content/Context;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;)Z

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    .line 16
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->onCancelled(Ljava/lang/Void;)V

    return-void
.end method

.method protected onCancelled(Ljava/lang/Void;)V
    .locals 2

    .line 139
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultReceiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 140
    invoke-interface {p1, p0, v0, v1}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;->onFinished(Landroid/os/AsyncTask;ZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 16
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method public onPostExecute(Ljava/lang/Void;)V
    .locals 2

    .line 126
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultReceiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 127
    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultItems:Ljava/util/List;

    invoke-interface {p1, p0, v0, v1}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;->onFinished(Landroid/os/AsyncTask;ZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public onPreExecute()V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultReceiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;

    if-eqz v0, :cond_0

    .line 121
    invoke-interface {v0, p0}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;->onStarted(Landroid/os/AsyncTask;)V

    :cond_0
    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->resultReceiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 134
    aget-object p1, p1, v1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p0, p1}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;->onStatusUpdate(Landroid/os/AsyncTask;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public start()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    .line 115
    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->searchQuery:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
