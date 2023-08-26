.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;
.source "ContainerAlbums.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ThisItemIdentifier;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ChildContentAccessor;
    }
.end annotation


# static fields
.field static final defaultActionIndex:I = 0x0

.field static final primaryActionIndex:I = -0x1


# instance fields
.field itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 111
    invoke-direct/range {p0 .. p5}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p2, 0x5

    new-array p2, p2, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 66
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$1;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;)V

    const/4 p4, 0x0

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;)V

    const/4 p4, 0x1

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$3;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;)V

    const/4 p4, 0x2

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$4;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;)V

    const/4 p4, 0x3

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$5;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$5;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;)V

    const/4 p4, 0x4

    aput-object p3, p2, p4

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 112
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 44
    invoke-static {p0, p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->getChildItems(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private albumArtContent(JLandroid/content/Context;)Landroid/net/Uri;
    .locals 7

    .line 272
    sget-boolean v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->THUMB_FROM_RESOLVER:Z

    if-nez v0, :cond_0

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    return-object p1

    .line 277
    :cond_0
    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 p3, 0x1

    new-array v2, p3, [Ljava/lang/String;

    const-string v3, "_id"

    const/4 v6, 0x0

    aput-object v3, v2, v6

    new-array v4, p3, [Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v6

    const/4 v5, 0x0

    const-string v3, "album_id=?"

    .line 276
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 284
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 285
    sget-object p2, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-interface {p1, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {p2, v0, v1}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object p1

    return-object p1

    .line 287
    :cond_1
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    return-object p1
.end method

.method private static getChildItems(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation

    .line 153
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 p0, 0x2

    new-array v2, p0, [Ljava/lang/String;

    const-string p0, "_id"

    const/4 v1, 0x0

    aput-object p0, v2, v1

    const-string p0, "_data"

    const/4 v3, 0x1

    aput-object p0, v2, v3

    new-array v4, v3, [Ljava/lang/String;

    aput-object p2, v4, v1

    .line 161
    sget-object p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getPageIndex()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    const/4 v3, 0x0

    invoke-virtual {p0, p2, p1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;

    .line 162
    invoke-static {p0, v1}, Lcom/daaw/avee/Common/MediaStoreUtils;->getOrderBy(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/lang/String;

    move-result-object v5

    .line 164
    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v3, "album_id=?"

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 169
    invoke-static {p0, p3}, Lcom/daaw/avee/Common/UtilsMusic;->songListFromCursor(Landroid/database/Cursor;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 170
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 172
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    return-object p1
.end method

.method static makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;I)Lcom/daaw/avee/Common/Tuple2;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "I)",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 116
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 120
    sget-object p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v1, ""

    invoke-virtual {p0, p2, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    .line 122
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    new-array v1, p1, [Ljava/lang/String;

    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, p2

    const-string v2, "album LIKE ?"

    move-object v4, v1

    move-object v3, v2

    goto :goto_0

    :cond_0
    move-object p0, v1

    move-object v3, v2

    move-object v4, v3

    .line 132
    :goto_0
    sget-object v1, Landroid/provider/MediaStore$Audio$Albums;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/String;

    const-string v5, "_id"

    aput-object v5, v2, p2

    const-string p2, "album"

    aput-object p2, v2, p1

    const/4 p1, 0x2

    const-string p2, "numsongs"

    aput-object p2, v2, p1

    const/4 p1, 0x3

    const-string p2, "album_art"

    aput-object p2, v2, p1

    const/4 p1, 0x4

    const-string p2, "artist"

    aput-object p2, v2, p1

    const/4 v5, 0x0

    .line 141
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafeEmpty(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    .line 143
    new-instance p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method


# virtual methods
.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 148
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/4 p2, 0x7

    const/4 v0, 0x1

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 149
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 188
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 194
    sget-object v3, Landroid/provider/MediaStore$Audio$Albums;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const-string v5, "_id"

    const/4 v8, 0x0

    aput-object v5, v4, v8

    const-string v5, "album"

    const/4 v9, 0x1

    aput-object v5, v4, v9

    new-array v6, v9, [Ljava/lang/String;

    aput-object v1, v6, v8

    const-string v5, "_id=?"

    const/4 v7, 0x0

    .line 203
    invoke-static/range {v2 .. v7}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 206
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 207
    invoke-static {v2, v9}, Lcom/daaw/avee/Common/MediaStoreUtils;->CursorGetStringSafe(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v3

    .line 208
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    move-object v13, v3

    .line 213
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    new-instance v11, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ChildContentAccessor;

    invoke-direct {v11, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ChildContentAccessor;-><init>(Ljava/lang/String;)V

    .line 215
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x0

    iget v15, v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->pageIndex:I

    const/16 v16, 0x0

    move-object v9, v2

    move-object/from16 v10, p1

    invoke-direct/range {v9 .. v16}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Ljava/lang/String;IIZ)V

    .line 221
    iget-object v1, v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    move-object/from16 v1, p1

    .line 222
    invoke-virtual {v2, v1, v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object v1

    return-object v1
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

    .line 303
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->pageIndex:I

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method public createOrGetCursor(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/Common/Tuple2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 298
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->pageIndex:I

    invoke-static {p1, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 1

    .line 181
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->getItem(I)Landroid/database/Cursor;

    move-result-object p1

    const/4 v0, 0x0

    .line 182
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    .line 292
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000aa

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 293
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method

.method getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 8

    const/4 p2, 0x0

    .line 245
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 243
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    .line 244
    new-instance v3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ThisItemIdentifier;

    invoke-direct {v3, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ThisItemIdentifier;-><init>(J)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v4

    invoke-virtual {p3, p0, v3, v4}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 245
    sget-object v3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v4, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-virtual {v3, v4, v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 246
    iget-object v4, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v4, v3}, Landroid/view/View;->setSelected(Z)V

    .line 247
    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v4, -0x1

    invoke-virtual {p3, v3, v4, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    .line 248
    iget-object v3, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 249
    invoke-virtual {p3, v4}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    .line 250
    iget-object v3, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p0, v1, v2, v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->albumArtContent(JLandroid/content/Context;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x3

    .line 251
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 253
    sget-boolean v4, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->THUMB_FROM_RESOLVER:Z

    const/4 v5, 0x1

    if-nez v4, :cond_1

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f080148

    .line 260
    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgResource(I)V

    goto :goto_1

    .line 254
    :cond_1
    :goto_0
    sget-object v4, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v6, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    const/4 v7, 0x0

    invoke-direct {v6, v1, v3, v7, v7}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    .line 257
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 254
    invoke-virtual {v4, v6, v1, v3, v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    :goto_1
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 264
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->color:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 266
    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 267
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Text(Ljava/lang/String;)V

    .line 268
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const/4 p3, 0x2

    invoke-interface {p1, p3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 235
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->getItem(I)Landroid/database/Cursor;

    move-result-object v0

    .line 236
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 237
    iput p2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 239
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method
