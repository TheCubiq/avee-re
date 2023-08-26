.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;
.source "ContainerGenres.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$ThisItemIdentifier;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$ChildContentAccessor;
    }
.end annotation


# static fields
.field private static final defaultActionIndex:I = 0x0

.field private static final primaryActionIndex:I = -0x1


# instance fields
.field itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 107
    invoke-direct/range {p0 .. p5}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p2, 0x5

    new-array p2, p2, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 62
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$1;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;)V

    const/4 p4, 0x0

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;)V

    const/4 p4, 0x1

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$3;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;)V

    const/4 p4, 0x2

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$4;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;)V

    const/4 p4, 0x3

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$5;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$5;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;)V

    const/4 p4, 0x4

    aput-object p3, p2, p4

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 108
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 40
    invoke-static {p0, p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->getChildItems(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

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

    .line 146
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

    .line 155
    sget-object p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getPageIndex()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    const/4 v5, 0x0

    invoke-virtual {p0, v3, p1, v5}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;

    .line 156
    invoke-static {p0, v1}, Lcom/daaw/avee/Common/MediaStoreUtils;->getOrderBy(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/lang/String;

    move-result-object v5

    .line 159
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->strToLongSafe(Ljava/lang/String;)J

    move-result-wide p0

    const-string p2, "external"

    invoke-static {p2, p0, p1}, Landroid/provider/MediaStore$Audio$Genres$Members;->getContentUri(Ljava/lang/String;J)Landroid/net/Uri;

    move-result-object v1

    const-string v3, "genre_id=?"

    .line 158
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 163
    invoke-static {p0, p3}, Lcom/daaw/avee/Common/UtilsMusic;->songListFromCursor(Landroid/database/Cursor;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 164
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 166
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

    .line 112
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 117
    sget-object p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;

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

    .line 118
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    new-array v1, p1, [Ljava/lang/String;

    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, p2

    const-string v2, "name LIKE ?"

    move-object v4, v1

    move-object v3, v2

    goto :goto_0

    :cond_0
    move-object p0, v1

    move-object v3, v2

    move-object v4, v3

    .line 128
    :goto_0
    sget-object v1, Landroid/provider/MediaStore$Audio$Genres;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v5, "_id"

    aput-object v5, v2, p2

    const-string p2, "name"

    aput-object p2, v2, p1

    const/4 v5, 0x0

    .line 134
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafeEmpty(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    .line 136
    new-instance p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public static reviewUIString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_1

    .line 280
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const p1, 0x7f10018d

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 141
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/16 p2, 0x9

    const/4 v0, 0x1

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 142
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 183
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 189
    sget-object v3, Landroid/provider/MediaStore$Audio$Genres;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const-string v5, "_id"

    const/4 v8, 0x0

    aput-object v5, v4, v8

    const-string v5, "name"

    const/4 v9, 0x1

    aput-object v5, v4, v9

    new-array v6, v9, [Ljava/lang/String;

    aput-object v1, v6, v8

    const-string v5, "_id=?"

    const/4 v7, 0x0

    .line 197
    invoke-static/range {v2 .. v7}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 199
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 200
    invoke-static {v2, v9}, Lcom/daaw/avee/Common/MediaStoreUtils;->CursorGetStringSafe(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v3

    .line 201
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    move-object v13, v3

    .line 205
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    new-instance v11, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$ChildContentAccessor;

    invoke-direct {v11, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$ChildContentAccessor;-><init>(Ljava/lang/String;)V

    .line 207
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x0

    iget v15, v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->pageIndex:I

    const/16 v16, 0x0

    move-object v9, v2

    move-object/from16 v10, p1

    invoke-direct/range {v9 .. v16}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Ljava/lang/String;IIZ)V

    .line 213
    iget-object v1, v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    move-object/from16 v1, p1

    .line 214
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

    .line 258
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->pageIndex:I

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;I)Lcom/daaw/avee/Common/Tuple2;

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

    .line 253
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->pageIndex:I

    invoke-static {p1, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 1

    .line 175
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->getItem(I)Landroid/database/Cursor;

    move-result-object p1

    const/4 v0, 0x0

    .line 176
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

    .line 247
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000b1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 248
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method

.method public getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 3

    .line 232
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$ThisItemIdentifier;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-direct {p2, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$ThisItemIdentifier;-><init>(J)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v1

    invoke-virtual {p3, p0, p2, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 233
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v1, v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 234
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setSelected(Z)V

    .line 235
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v0, -0x1

    invoke-virtual {p3, p2, v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    .line 236
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p2, 0x0

    .line 237
    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 238
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 239
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget-object v1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->reviewUIString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    iget-object p1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->color:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 241
    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 242
    iget-object p1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 225
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->getItem(I)Landroid/database/Cursor;

    move-result-object v0

    .line 226
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 227
    iput p2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 228
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method
