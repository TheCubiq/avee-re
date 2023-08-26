.class public Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;
.super Landroid/os/AsyncTask;
.source "SearchFilesTask.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;,
        Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;
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

.field private fileCounter:I

.field private receiver:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;",
            ">;"
        }
    .end annotation
.end field

.field resultReceiver0:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;

.field private rootFile:Ljava/io/File;

.field private searchFilter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;",
            ">;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->fileCounter:I

    .line 25
    new-instance v0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$1;-><init>(Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->resultReceiver0:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;

    .line 49
    iput-object p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->context:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->rootFile:Ljava/io/File;

    .line 51
    iput-object p3, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->searchFilter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;

    .line 52
    iput-object p4, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->receiver:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;)I
    .locals 0

    .line 17
    iget p0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->fileCounter:I

    return p0
.end method

.method static synthetic access$008(Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;)I
    .locals 2

    .line 17
    iget v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->fileCounter:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->fileCounter:I

    return v0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;[Ljava/lang/Object;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method

.method static getItemsRecursive(Landroid/content/Context;Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)Z
    .locals 21

    move-object/from16 v6, p1

    .line 77
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    const/4 v8, 0x1

    .line 80
    :try_start_0
    array-length v9, v7

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v9, :cond_7

    aget-object v2, v7, v11

    .line 81
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return v10

    .line 83
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p3, :cond_3

    if-nez p5, :cond_2

    .line 88
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 91
    array-length v0, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 94
    :goto_1
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    const/4 v13, 0x1

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    int-to-long v3, v0

    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v18

    move-object v12, v1

    move-wide v15, v3

    invoke-direct/range {v12 .. v19}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;-><init>(ZLjava/lang/String;JLjava/lang/String;J)V

    invoke-interface {v6, v1}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;->onItemDirFound(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    .line 97
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->getItemsRecursive(Landroid/content/Context;Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)Z

    move-result v0

    if-nez v0, :cond_3

    return v10

    :cond_3
    :goto_2
    move-object/from16 v1, p4

    goto :goto_4

    :cond_4
    if-eqz p5, :cond_5

    .line 108
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    goto :goto_3

    :cond_5
    move-object/from16 v1, p4

    const/4 v0, 0x1

    :goto_3
    if-eqz v0, :cond_6

    .line 112
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {v0, v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(Ljava/io/File;)V

    .line 113
    new-instance v3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    const/4 v13, 0x0

    .line 114
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    .line 115
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v15

    .line 116
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v17

    .line 117
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v18

    move-object v12, v3

    move-object/from16 v20, v0

    invoke-direct/range {v12 .. v20}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;-><init>(ZLjava/lang/String;JLjava/lang/String;JLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    .line 113
    invoke-interface {v6, v3}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;->onItemFileFound(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    :goto_4
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    :catch_0
    :cond_7
    return v8
.end method

.method static getItemsSearch(Landroid/content/Context;Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    .line 60
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    if-nez p5, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    invoke-interface {p5, p4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;->preProcessQuery(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v6, p5

    move-object v5, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v5, v0

    move-object v6, v5

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    .line 67
    invoke-static/range {v1 .. v6}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->getItemsRecursive(Landroid/content/Context;Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 17
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Void;
    .locals 7

    const/4 v0, 0x0

    .line 157
    aget-object v5, p1, v0

    .line 158
    iget-object v1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->resultReceiver0:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;

    iget-object v3, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->rootFile:Ljava/io/File;

    iget-object v6, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->searchFilter:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->getItemsSearch(Landroid/content/Context;Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)Z

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->onCancelled(Ljava/lang/Void;)V

    return-void
.end method

.method protected onCancelled(Ljava/lang/Void;)V
    .locals 1

    .line 151
    iget-object p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->receiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 152
    invoke-interface {p1, p0, v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;->onSearchFinished(Landroid/os/AsyncTask;Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method public onPostExecute(Ljava/lang/Void;)V
    .locals 1

    .line 138
    iget-object p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->receiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 139
    invoke-interface {p1, p0, v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;->onSearchFinished(Landroid/os/AsyncTask;Z)V

    :cond_0
    return-void
.end method

.method public onPreExecute()V
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->receiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;

    if-eqz v0, :cond_0

    .line 132
    invoke-interface {v0, p0}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;->onSearchStarted(Landroid/os/AsyncTask;)V

    :cond_0
    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 2

    .line 144
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->receiver:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 146
    aget-object p1, p1, v1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    invoke-interface {v0, p0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;->onItemFileFound(Landroid/os/AsyncTask;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V

    :cond_0
    return-void
.end method
