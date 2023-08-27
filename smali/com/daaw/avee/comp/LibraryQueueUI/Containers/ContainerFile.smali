.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;
.source "ContainerFile.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;
    }
.end annotation


# static fields
.field private static final defaultActionDirectoryIndex:I = 0x0

.field private static final defaultActionSongIndex:I = 0x1

.field private static final primaryActionDirectoryIndex:I = -0x1

.field private static final primaryActionSongIndex:I


# instance fields
.field private associatedAdapter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private currentAbsolutePath:Ljava/lang/String;

.field private currentIsDirectory:Z

.field private currentName:Ljava/lang/String;

.field private currentRelativePath:Ljava/lang/String;

.field directoryItemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field itemListenerActionsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;"
        }
    .end annotation
.end field

.field private pageIndex:I

.field resultReceiver:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;

.field private rootFile:Ljava/io/File;

.field visibleListQuery:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;I)V
    .locals 9

    .line 295
    new-instance v3, Lcom/daaw/avee/Common/VTaskResult;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/daaw/avee/Common/VTaskResult;-><init>(Ljava/lang/Object;)V

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;II)V

    const/4 p3, 0x6

    new-array v0, p3, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 61
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    const/4 v3, 0x1

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    const/4 v4, 0x2

    aput-object v1, v0, v4

    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    const/4 v5, 0x3

    aput-object v1, v0, v5

    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$5;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    const/4 v6, 0x4

    aput-object v1, v0, v6

    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$6;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    const/4 v7, 0x5

    aput-object v1, v0, v7

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->directoryItemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v0, 0x0

    .line 114
    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->visibleListQuery:Ljava/lang/String;

    const/4 v1, 0x7

    new-array v1, v1, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 123
    new-instance v8, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$7;

    invoke-direct {v8, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$7;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    aput-object v8, v1, v2

    new-instance v8, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$8;

    invoke-direct {v8, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$8;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    aput-object v8, v1, v3

    new-instance v8, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$9;

    invoke-direct {v8, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$9;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    aput-object v8, v1, v4

    new-instance v8, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$10;

    invoke-direct {v8, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$10;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    aput-object v8, v1, v5

    new-instance v5, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$11;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$11;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    aput-object v5, v1, v6

    new-instance v5, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$12;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$12;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    aput-object v5, v1, v7

    new-instance v5, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$13;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$13;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    aput-object v5, v1, p3

    iput-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    new-array p3, v4, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 225
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$14;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$14;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    aput-object v1, p3, v2

    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$15;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$15;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    aput-object v1, p3, v3

    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->itemListenerActionsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 247
    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->associatedAdapter:Ljava/lang/ref/WeakReference;

    .line 248
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V

    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->resultReceiver:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;

    .line 297
    iput p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->pageIndex:I

    .line 298
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->rootFile:Ljava/io/File;

    .line 299
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->items:Ljava/util/List;

    .line 301
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->rootFile:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->currentName:Ljava/lang/String;

    .line 302
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->rootFile:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->currentAbsolutePath:Ljava/lang/String;

    .line 303
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->rootFile:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->currentRelativePath:Ljava/lang/String;

    .line 304
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->rootFile:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result p2

    iput-boolean p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->currentIsDirectory:Z

    .line 305
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->rootFile:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 306
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->currentAbsolutePath:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->currentAbsolutePath:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    sub-int/2addr p3, v3

    invoke-virtual {p2, p3}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 p3, 0x2f

    if-eq p2, p3, :cond_0

    .line 307
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->currentAbsolutePath:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "/"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->currentAbsolutePath:Ljava/lang/String;

    .line 310
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    .line 311
    sget-object p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    const-string v0, ""

    invoke-virtual {p3, p4, p2, v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 312
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)I
    .locals 0

    .line 54
    iget p0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->pageIndex:I

    return p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)Ljava/util/List;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->items:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;Ljava/lang/String;)Z
    .locals 0

    .line 54
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->checkItemIdentEquals(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;ZZ)V
    .locals 0

    .line 54
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->setSearchActive(ZZ)V

    return-void
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;Ljava/lang/String;)Z
    .locals 0

    .line 54
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->checkItemIdentEquals(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;ZZ)V
    .locals 0

    .line 54
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->setSearchActive(ZZ)V

    return-void
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;Ljava/lang/String;)Z
    .locals 0

    .line 54
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->checkItemIdentEquals(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$700(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;Ljava/lang/String;)Z
    .locals 0

    .line 54
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->checkItemIdentEquals(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static findSongInItemsNotCountingNulls(Ljava/util/List;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "I)I"
        }
    .end annotation

    const/4 v0, 0x0

    .line 317
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_2

    .line 318
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 320
    invoke-virtual {v1, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->compare(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method private static getMediaInPath(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p2

    .line 364
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/PlayerCore;->getActivityContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    sget-object v3, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/String;

    const-string v5, "_id"

    const/4 v8, 0x0

    aput-object v5, v4, v8

    const-string v5, "_display_name"

    const/4 v9, 0x1

    aput-object v5, v4, v9

    new-array v6, v1, [Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "%"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/*[/]*"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v9

    const-string v5, "_data LIKE ? AND NOT _data GLOB ?"

    const/4 v7, 0x0

    .line 364
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 377
    :cond_0
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 378
    invoke-interface {v1, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    if-eqz v0, :cond_2

    .line 379
    invoke-virtual {v12, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v2, p1

    goto :goto_0

    .line 380
    :cond_2
    :goto_1
    sget-object v2, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v2

    .line 381
    new-instance v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {v3, v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(Landroid/net/Uri;)V

    .line 382
    new-instance v4, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    .line 385
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v15

    const-wide/16 v16, 0x0

    move-object v10, v4

    move-object/from16 v18, v3

    invoke-direct/range {v10 .. v18}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;-><init>(ZLjava/lang/String;JLjava/lang/String;JLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    move-object/from16 v2, p1

    .line 382
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void
.end method

.method static getSongsFromFileItems2(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 473
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    invoke-direct {p2, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 475
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    .line 476
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 477
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p2
.end method

.method public static getTrackList(Landroid/content/Context;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 462
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getTrackList(Landroid/content/Context;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/String;ZLjava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static getTrackList(Landroid/content/Context;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/String;ZLjava/util/List;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation

    .line 467
    new-instance p4, Ljava/io/File;

    invoke-direct {p4, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p3, 0x1

    invoke-static {p0, p1, p2, p4, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->makeItems(Landroid/content/Context;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/io/File;Z)Ljava/util/List;

    move-result-object p1

    .line 468
    invoke-static {p0, p1, p5}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSongsFromFileItems2(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static makeItems(Landroid/content/Context;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/io/File;Z)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Ljava/io/File;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;"
        }
    .end annotation

    .line 328
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 329
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 331
    new-instance v6, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$17;

    invoke-direct {v6, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$17;-><init>(ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v7

    move-object v2, p3

    move v3, p4

    .line 338
    invoke-static/range {v0 .. v6}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->makeItemsRecursive(Ljava/util/List;Ljava/util/List;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;)V

    .line 340
    sget-object p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p4, 0x0

    invoke-virtual {p3, p1, p2, p4}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Design/SortDesign$SortDesc;

    .line 341
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 p2, 0x0

    .line 343
    invoke-static {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->getSortComparator(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/util/Comparator;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 345
    invoke-static {v7, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 350
    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result p1

    if-ge p2, p1, :cond_1

    .line 351
    invoke-interface {v7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->access$802(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;I)I

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 354
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_2

    .line 355
    invoke-interface {p0, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0

    :cond_2
    return-object v7
.end method

.method static makeItemsRecursive(Ljava/util/List;Ljava/util/List;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;",
            "Ljava/io/File;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;",
            ")V"
        }
    .end annotation

    move-object/from16 v7, p1

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    .line 396
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v11

    .line 398
    sget-boolean v0, Lcom/daaw/avee/Common/Utils;->PRE_Q:Z

    if-nez v0, :cond_0

    .line 399
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7, v8, v9, v10}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getMediaInPath(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;)V

    .line 403
    :cond_0
    :try_start_0
    array-length v12, v11

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v12, :cond_9

    aget-object v2, v11, v14

    .line 405
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    if-nez p3, :cond_4

    if-eqz v10, :cond_1

    .line 412
    invoke-interface {v10, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;->shouldInclude(Ljava/io/File;)Z

    move-result v1

    :cond_1
    if-eqz v1, :cond_4

    if-nez v9, :cond_3

    .line 416
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 419
    array-length v0, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 422
    :goto_1
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    const/16 v16, 0x1

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v17

    int-to-long v3, v0

    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v21

    move-object v15, v1

    move-wide/from16 v18, v3

    invoke-direct/range {v15 .. v22}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;-><init>(ZLjava/lang/String;JLjava/lang/String;J)V

    move-object/from16 v15, p0

    invoke-interface {v15, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    move-object/from16 v15, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    .line 425
    invoke-static/range {v0 .. v6}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->makeItemsRecursive(Ljava/util/List;Ljava/util/List;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;)V

    goto :goto_2

    :cond_4
    move-object/from16 v15, p0

    goto :goto_2

    :cond_5
    move-object/from16 v15, p0

    .line 429
    sget-boolean v0, Lcom/daaw/avee/Common/Utils;->PRE_Q:Z

    if-eqz v0, :cond_8

    if-eqz v10, :cond_6

    .line 438
    invoke-interface {v10, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;->shouldInclude(Ljava/io/File;)Z

    move-result v1

    :cond_6
    if-eqz v1, :cond_7

    if-eqz v9, :cond_7

    .line 442
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    :cond_7
    if-eqz v1, :cond_8

    .line 446
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {v0, v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(Ljava/io/File;)V

    .line 447
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    const/16 v17, 0x0

    .line 448
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v18

    .line 449
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v19

    .line 450
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v21

    .line 451
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v22

    move-object/from16 v16, v1

    move-object/from16 v24, v0

    invoke-direct/range {v16 .. v24}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;-><init>(ZLjava/lang/String;JLjava/lang/String;JLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    .line 447
    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    :goto_2
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    :catch_0
    :cond_9
    return-void
.end method


# virtual methods
.method public RefreshContent()Z
    .locals 3

    const/4 v0, 0x1

    .line 673
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getContent(Z)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v1

    .line 674
    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->checkItemIdent(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    .line 676
    :cond_0
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getContent(Z)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v1

    .line 678
    iget-object v2, v1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    .line 680
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->setDataAndNotifyDataSetChanged(Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0

    .line 682
    :cond_1
    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->setDataAndNotifyDataSetChanged(Ljava/util/List;Ljava/lang/String;)V

    :goto_0
    return v0
.end method

.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 498
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/16 p2, 0xb

    const/4 v0, 0x1

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 499
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 4

    .line 532
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 533
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->currentAbsolutePath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 535
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->pageIndex:I

    invoke-direct {v0, p1, v1, p2, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;I)V

    .line 538
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 539
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public dataPositionToPosition(I)I
    .locals 0

    return p1
.end method

.method public executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V
    .locals 2

    .line 630
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->itemListenerActionsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    .line 631
    aget-object p2, v0, p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->execute(Lcom/daaw/avee/ContextData;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method protected getAssociatedAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;
    .locals 1

    .line 484
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->associatedAdapter:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    return-object v0
.end method

.method protected getContent(Z)Lcom/daaw/avee/Common/Tuple2;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 689
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->visibleListQuery:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 691
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    if-nez p1, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->items:Ljava/util/List;

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->visibleListQuery:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->items:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    const-string v0, ""

    if-eqz p1, :cond_2

    .line 695
    new-instance p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {p1, v1, v0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 697
    :cond_2
    iget p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->pageIndex:I

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->rootFile:Ljava/io/File;

    const/4 v4, 0x0

    invoke-static {v1, p1, v2, v3, v4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->makeItems(Landroid/content/Context;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/io/File;Z)Ljava/util/List;

    move-result-object p1

    .line 699
    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {v1, p1, v0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public getItem(I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;
    .locals 1

    .line 508
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->items:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 504
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 1

    .line 523
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getItem(I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    move-result-object p1

    .line 524
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 525
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    .line 608
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000af

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 609
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method

.method public getView(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 9

    .line 555
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 557
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;

    invoke-direct {v1, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;I)V

    const/4 v3, 0x0

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->access$800(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)I

    move-result v4

    iget-object v7, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v8, 0x0

    move-object v0, p0

    move v5, p2

    move-object v6, p3

    invoke-static/range {v0 .. v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;I)V

    return-void

    .line 561
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;

    invoke-direct {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;I)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    invoke-virtual {p3, p0, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 562
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 563
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setSelected(Z)V

    .line 564
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->directoryItemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v0, -0x1

    invoke-virtual {p3, p2, v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    .line 565
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 566
    iget p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->colorImgArt:I

    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    const p2, 0x7f0800d4

    .line 567
    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgResource(I)V

    .line 568
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 569
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 570
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->color:I

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 571
    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 572
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getCountOrSize()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected justAddData(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
    .locals 1

    .line 597
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->items:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAdapterDispose()V
    .locals 0

    return-void
.end method

.method public onAdapterInitialized(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;)V
    .locals 1

    .line 489
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->associatedAdapter:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 547
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getItem(I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    move-result-object v0

    .line 548
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 549
    iput p2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 551
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getView(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 518
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ViewHolderFactory;->newInstance(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onItemsMoved(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method protected setDataAndNotifyDataSetChanged(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 661
    invoke-virtual {p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->checkItemIdent(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 663
    :cond_0
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->items:Ljava/util/List;

    .line 665
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getAssociatedAdapter()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 667
    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/IAdapter;->myNotifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method startSearch(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 635
    new-instance v0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->rootFile:Ljava/io/File;

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterPlaylistSong;

    invoke-direct {v2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterPlaylistSong;-><init>(Landroid/content/Context;)V

    new-instance v3, Ljava/lang/ref/WeakReference;

    iget-object v4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->resultReceiver:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;

    invoke-direct {v3, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;-><init>(Landroid/content/Context;Ljava/io/File;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;Ljava/lang/ref/WeakReference;)V

    .line 640
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->onStartSearchTask:Lcom/daaw/avee/Common/Events/WeakEvent3;

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->pageIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, p1, v1

    .line 641
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    .line 614
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 620
    :cond_0
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->visibleListQuery:Ljava/lang/String;

    .line 621
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->setSearchActive(ZZ)V

    .line 623
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->RefreshContent()Z

    .line 624
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->startSearch(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 615
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->visibleListQuery:Ljava/lang/String;

    .line 616
    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->setSearchActive(ZZ)V

    .line 618
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->RefreshContent()Z

    :goto_1
    return-void
.end method
