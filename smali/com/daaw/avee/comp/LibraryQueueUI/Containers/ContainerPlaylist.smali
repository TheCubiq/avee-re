.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;
.source "ContainerPlaylist.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ThisItemIdentifier;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ChildContentAccessor;
    }
.end annotation


# static fields
.field private static final defaultActionIndex:I = 0x0

.field private static final dispIconResId:I = 0x7f0800f9

.field private static final primaryActionIndex:I = -0x1


# instance fields
.field itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 8

    .line 124
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f10015a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0800f9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p2, 0x7

    new-array p2, p2, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 63
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$1;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;)V

    const/4 v0, 0x0

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;)V

    const/4 v0, 0x1

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$3;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;)V

    const/4 v0, 0x2

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$4;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;)V

    const/4 v0, 0x3

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$5;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$5;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;)V

    const/4 v0, 0x4

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$6;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$6;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;)V

    const/4 v0, 0x5

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$7;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$7;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;)V

    const/4 v0, 0x6

    aput-object p3, p2, v0

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 125
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 41
    invoke-static {p0, p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->getChildItems(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
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

    .line 164
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 p0, 0x3

    new-array v2, p0, [Ljava/lang/String;

    const-string p0, "_id"

    const/4 v1, 0x0

    aput-object p0, v2, v1

    const-string p0, "audio_id"

    const/4 v3, 0x1

    aput-object p0, v2, v3

    const/4 p0, 0x2

    const-string v4, "_data"

    aput-object v4, v2, p0

    new-array v4, v3, [Ljava/lang/String;

    aput-object p2, v4, v1

    .line 173
    sget-object p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getPageIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    const/4 v3, 0x0

    invoke-virtual {p0, v1, p1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;

    const/16 p1, 0xa

    .line 174
    invoke-static {p0, p1}, Lcom/daaw/avee/Common/MediaStoreUtils;->getOrderBy(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/lang/String;

    move-result-object v5

    .line 177
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->strToLongSafe(Ljava/lang/String;)J

    move-result-wide p0

    const-string p2, "external"

    invoke-static {p2, p0, p1}, Landroid/provider/MediaStore$Audio$Playlists$Members;->getContentUri(Ljava/lang/String;J)Landroid/net/Uri;

    move-result-object v1

    const-string v3, "playlist_id=?"

    .line 176
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 181
    invoke-static {p0, p3}, Lcom/daaw/avee/Common/UtilsMusic;->songListFromCursor(Landroid/database/Cursor;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 182
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 184
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

    .line 129
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 134
    sget-object p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v1, ""

    invoke-virtual {p0, p2, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 v2, 0x1

    if-eqz p0, :cond_0

    .line 136
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    new-array p2, v2, [Ljava/lang/String;

    .line 138
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "%"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p2, p1

    const-string v1, "name LIKE ?"

    move-object v4, p2

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p2

    move-object v4, v3

    move-object p0, v1

    .line 146
    :goto_0
    sget-object v1, Landroid/provider/MediaStore$Audio$Playlists;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 p2, 0x3

    new-array p2, p2, [Ljava/lang/String;

    const-string v5, "_id"

    aput-object v5, p2, p1

    const-string p1, "name"

    aput-object p1, p2, v2

    const/4 p1, 0x2

    const-string v5, "_data"

    aput-object v5, p2, p1

    .line 152
    aget-object v5, p2, v2

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafeEmpty(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    .line 154
    new-instance p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method


# virtual methods
.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 159
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/4 p2, 0x6

    const/4 v0, 0x1

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 160
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 199
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 205
    sget-object v3, Landroid/provider/MediaStore$Audio$Playlists;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/String;

    const-string v6, "name"

    const/4 v8, 0x0

    aput-object v6, v5, v8

    new-array v6, v4, [Ljava/lang/String;

    aput-object v1, v6, v8

    const-string v7, "_id=?"

    const/4 v9, 0x0

    move-object v4, v5

    move-object v5, v7

    move-object v7, v9

    .line 212
    invoke-static/range {v2 .. v7}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 214
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 215
    invoke-static {v2, v8}, Lcom/daaw/avee/Common/MediaStoreUtils;->CursorGetStringSafe(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v3

    .line 216
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    move-object v13, v3

    .line 220
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    new-instance v11, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ChildContentAccessor;

    invoke-direct {v11, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ChildContentAccessor;-><init>(Ljava/lang/String;)V

    .line 222
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x0

    iget v15, v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->pageIndex:I

    const/16 v16, 0x0

    move-object v9, v2

    move-object/from16 v10, p1

    invoke-direct/range {v9 .. v16}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Ljava/lang/String;IIZ)V

    .line 228
    iget-object v1, v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    move-object/from16 v1, p1

    .line 229
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

    .line 260
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->pageIndex:I

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;I)Lcom/daaw/avee/Common/Tuple2;

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

    .line 255
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->pageIndex:I

    invoke-static {p1, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 1

    .line 192
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->getItem(I)Landroid/database/Cursor;

    move-result-object p1

    const/4 v0, 0x0

    .line 193
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

    .line 249
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000b5

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 250
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method

.method public getSectionOpened()Z
    .locals 3

    .line 279
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->onRequestSectionOpenedState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const-class v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

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
    .locals 5

    .line 233
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ThisItemIdentifier;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p2, v1, v2, v4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ThisItemIdentifier;-><init>(JLjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v1

    invoke-virtual {p3, p0, p2, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 234
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 235
    iget-object v1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v1, p2}, Landroid/view/View;->setSelected(Z)V

    .line 236
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v1, -0x1

    invoke-virtual {p3, p2, v1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    .line 237
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 238
    iget p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->colorImgArt:I

    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    const p2, 0x7f0800f9

    .line 239
    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgResource(I)V

    .line 240
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 241
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 242
    iget-object p1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->color:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 243
    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    const-string p1, ""

    .line 244
    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Text(Ljava/lang/String;)V

    .line 245
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 271
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->getItem(I)Landroid/database/Cursor;

    move-result-object v0

    .line 272
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 273
    iput p2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 274
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method

.method public setSectionOpenedState(Z)V
    .locals 2

    .line 284
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->onSetSectionOpened:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-class v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
