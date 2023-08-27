.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;
.source "ContainerRootLocal.java"


# static fields
.field private static final AddressIcecast:Ljava/lang/String; = "7"

.field public static final AddressMore:Ljava/lang/String; = "6"

.field private static final AddressShoutcast:Ljava/lang/String; = "8"

.field private static final iconResId_Icecast:I = 0x7f08010c

.field private static final iconResId_Shoutcast:I = 0x7f08010c


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/ref/WeakReference;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;",
            ">;)V"
        }
    .end annotation

    const-string v2, "/"

    const-string v3, "Library"

    const v4, 0x7f0800df

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    move-object v6, p3

    .line 40
    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/ref/WeakReference;)V

    .line 41
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->init(Landroid/content/Context;)V

    return-void
.end method

.method static makeCursor(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;)Landroid/database/Cursor;
    .locals 10

    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "_id"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ""

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const/4 v6, 0x3

    aput-object v2, v1, v6

    .line 46
    new-instance v7, Landroid/database/MatrixCursor;

    invoke-direct {v7, v1}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    new-array v1, v0, [Ljava/lang/String;

    const-string v8, "-1"

    aput-object v8, v1, v3

    const-string v8, "2131755181"

    aput-object v8, v1, v4

    aput-object v2, v1, v5

    const-string v8, "2131230969"

    aput-object v8, v1, v6

    .line 47
    invoke-virtual {v7, v1}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    new-array v1, v0, [Ljava/lang/String;

    const-string v9, "0"

    aput-object v9, v1, v3

    const-string v9, "2131755191"

    aput-object v9, v1, v4

    aput-object v2, v1, v5

    const-string v9, "2131230974"

    aput-object v9, v1, v6

    .line 48
    invoke-virtual {v7, v1}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    new-array v1, v0, [Ljava/lang/String;

    const-string v9, "1"

    aput-object v9, v1, v3

    const-string v9, "2131755177"

    aput-object v9, v1, v4

    aput-object v2, v1, v5

    const-string v9, "2131230901"

    aput-object v9, v1, v6

    .line 49
    invoke-virtual {v7, v1}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    new-array v1, v0, [Ljava/lang/String;

    const-string v9, "2"

    aput-object v9, v1, v3

    const-string v9, "2131755179"

    aput-object v9, v1, v4

    aput-object v2, v1, v5

    const-string v9, "2131230902"

    aput-object v9, v1, v6

    .line 50
    invoke-virtual {v7, v1}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    new-array v1, v0, [Ljava/lang/String;

    const-string v9, "3"

    aput-object v9, v1, v3

    const-string v9, "2131755184"

    aput-object v9, v1, v4

    aput-object v2, v1, v5

    const-string v9, "2131230957"

    aput-object v9, v1, v6

    .line 51
    invoke-virtual {v7, v1}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    new-array v1, v0, [Ljava/lang/String;

    const-string v9, "4"

    aput-object v9, v1, v3

    const-string v9, "2131755188"

    aput-object v9, v1, v4

    aput-object v2, v1, v5

    aput-object v8, v1, v6

    .line 52
    invoke-virtual {v7, v1}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    new-array v1, v0, [Ljava/lang/String;

    const-string v8, "5"

    aput-object v8, v1, v3

    const-string v8, "2131755182"

    aput-object v8, v1, v4

    aput-object v2, v1, v5

    const-string v8, "2131230932"

    aput-object v8, v1, v6

    .line 53
    invoke-virtual {v7, v1}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    if-eqz p0, :cond_0

    .line 55
    invoke-interface {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->onRequestRootContainerItemsVisible()I

    move-result p0

    if-nez p0, :cond_0

    new-array p0, v0, [Ljava/lang/String;

    const-string v0, "6"

    aput-object v0, p0, v3

    const-string v0, "2131755187"

    aput-object v0, p0, v4

    aput-object v2, p0, v5

    const-string v0, "2131230926"

    aput-object v0, p0, v6

    .line 56
    invoke-virtual {v7, p0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-array p0, v0, [Ljava/lang/String;

    const-string v1, "7"

    aput-object v1, p0, v3

    const-string v1, "2131755175"

    aput-object v1, p0, v4

    const-string v1, "dir.xiph.org"

    aput-object v1, p0, v5

    const-string v1, "2131230988"

    aput-object v1, p0, v6

    .line 58
    invoke-virtual {v7, p0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    new-array p0, v0, [Ljava/lang/String;

    const-string v0, "8"

    aput-object v0, p0, v3

    const-string v0, "2131755358"

    aput-object v0, p0, v4

    const-string v0, "www.shoutcast.com"

    aput-object v0, p0, v5

    aput-object v1, p0, v6

    .line 59
    invoke-virtual {v7, p0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    :goto_0
    return-object v7
.end method


# virtual methods
.method public RefreshContent()Z
    .locals 3

    .line 231
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 233
    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->createOrGetCursor(Landroid/content/Context;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Landroid/database/Cursor;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->setDataAndNotifyDataSetChanged(Landroid/database/Cursor;Ljava/lang/String;)V

    return v1
.end method

.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 67
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/4 p2, 0x3

    const/16 v0, 0x10

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 68
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 11

    const-string v0, "_id"

    .line 82
    invoke-virtual {p0, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->findRowAndMove(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ltz v0, :cond_0

    .line 84
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->getItem(I)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 85
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->getItem(I)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move v9, v0

    move-object v8, v4

    goto :goto_0

    :cond_0
    const-string v4, ""

    move-object v8, v4

    const/4 v9, 0x0

    :goto_0
    const/4 v0, -0x1

    .line 88
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/16 v5, 0x37

    const/4 v6, 0x2

    if-eq v4, v5, :cond_3

    const/16 v5, 0x38

    if-eq v4, v5, :cond_2

    const/16 v5, 0x5a4

    if-eq v4, v5, :cond_1

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const-string v1, "5"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x6

    goto :goto_2

    :pswitch_1
    const-string v1, "4"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x5

    goto :goto_2

    :pswitch_2
    const-string v1, "3"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    goto :goto_2

    :pswitch_3
    const-string v4, "2"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :pswitch_4
    const-string v1, "1"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x2

    goto :goto_2

    :pswitch_5
    const-string v1, "0"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_1
    const-string v1, "-1"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    const-string v1, "8"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x8

    goto :goto_2

    :cond_3
    const-string v1, "7"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x7

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v1, -0x1

    :goto_2
    packed-switch v1, :pswitch_data_1

    const/4 p1, 0x0

    return-object p1

    :pswitch_6
    const v0, 0x7f10015e

    .line 163
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 165
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Lcom/daaw/avee/Common/VTaskResult;

    invoke-direct {v1, v0}, Lcom/daaw/avee/Common/VTaskResult;-><init>(Ljava/lang/Object;)V

    const v0, 0x7f08010c

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    invoke-static {p1, p2, v1, v0, v2}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;->CreatePrimaryGenres(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri;

    move-result-object p2

    .line 166
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 167
    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    :pswitch_7
    const v0, 0x7f1000a7

    .line 156
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 157
    new-instance v0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const v5, 0x7f08010c

    iget v6, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/IceCast/ContainerIcecast;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 158
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 159
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    .line 150
    :pswitch_8
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 151
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 152
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    .line 120
    :pswitch_9
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    invoke-direct {v0, p1, v1, v4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 121
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget v4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    invoke-direct {v1, p1, p2, v4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 123
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    new-array v4, v6, [Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    aput-object v0, v4, v3

    aput-object v1, v4, v2

    new-instance v2, Lcom/daaw/avee/Common/VTaskResult;

    .line 125
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f1000b4

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/Common/VTaskResult;-><init>(Ljava/lang/Object;)V

    const v3, 0x7f0800f9

    new-instance v5, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal$1;

    invoke-direct {v5, p0, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;)V

    invoke-direct {p2, v4, v2, v3, v5}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;-><init>([Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Lcom/daaw/avee/Common/IVAsyncTask;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$AdapterFactory;)V

    .line 145
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 147
    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    .line 114
    :pswitch_a
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 115
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 116
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    .line 108
    :pswitch_b
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerArtists;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerArtists;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 109
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 110
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    .line 102
    :pswitch_c
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 103
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 104
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    .line 96
    :pswitch_d
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRecently;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRecently;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 97
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 98
    invoke-virtual {v0, p1, v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    .line 90
    :pswitch_e
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAllSongs;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->pageIndex:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAllSongs;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 91
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 92
    invoke-virtual {v0, p1, v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public createOrGetCursor(Landroid/content/Context;)Lcom/daaw/avee/Common/Tuple2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 200
    new-instance p1, Lcom/daaw/avee/Common/Tuple2;

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->makeCursor(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;)Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 1

    .line 73
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->getItem(I)Landroid/database/Cursor;

    move-result-object p1

    const/4 v0, 0x0

    .line 74
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getSectionOpened()Z
    .locals 3

    .line 219
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->onRequestSectionOpenedState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const-class v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 3

    .line 175
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    invoke-virtual {p3, p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    const/4 p2, 0x3

    .line 178
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgResource(I)V

    .line 179
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->colorImgArt:I

    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    .line 180
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 181
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 182
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->color:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 183
    invoke-virtual {p3, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 184
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 186
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "6"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 187
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgResource(I)V

    .line 188
    iget p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->colorLight:I

    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    .line 189
    iget-object p1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->colorLight:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 190
    :cond_0
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "7"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "8"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 192
    :cond_1
    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    const/4 p2, 0x2

    .line 193
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Text(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 211
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->getItem(I)Landroid/database/Cursor;

    move-result-object v0

    .line 212
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 213
    iput p2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 214
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method

.method public setSectionOpenedState(Z)V
    .locals 2

    .line 224
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->onSetSectionOpened:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-class v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
