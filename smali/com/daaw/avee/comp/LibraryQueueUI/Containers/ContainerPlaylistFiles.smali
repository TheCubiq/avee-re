.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;
.source "ContainerPlaylistFiles.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ThisItemIdentifier;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ChildContentAccessor;
    }
.end annotation


# static fields
.field private static final dispIconResId:I = 0x7f0800f9

.field private static final primaryActionIndex:I = -0x1


# instance fields
.field itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 8

    .line 117
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100159

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0800f9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p2, 0x6

    new-array p2, p2, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 62
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$1;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;)V

    const/4 v0, 0x0

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;)V

    const/4 v0, 0x1

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$3;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;)V

    const/4 v0, 0x2

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$4;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;)V

    const/4 v0, 0x3

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$5;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$5;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;)V

    const/4 v0, 0x4

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$6;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$6;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;)V

    const/4 v0, 0x5

    aput-object p3, p2, v0

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 118
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 40
    invoke-static {p0, p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getChildItems(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static getChildItems(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0
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

    if-nez p3, :cond_0

    .line 141
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 143
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->s()Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->getSongsFromPlaylistFile(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 147
    invoke-static {p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/util/List;)V

    .line 148
    invoke-interface {p3, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-object p3
.end method

.method public static getPlaylistNameDesign(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 135
    invoke-static {p0}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilenameWithoutExt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Lcom/daaw/avee/Common/Tuple2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            ")",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 122
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefGetStandalonePlaylists(Landroid/content/Context;)Lcom/daaw/avee/Common/MultiList;

    move-result-object p0

    const/4 p1, 0x2

    new-array v0, p1, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ""

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 125
    new-instance v4, Landroid/database/MatrixCursor;

    invoke-direct {v4, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    .line 127
    invoke-virtual {p0}, Lcom/daaw/avee/Common/MultiList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/Common/Tuple2;

    new-array v5, p1, [Ljava/lang/String;

    .line 128
    iget-object v6, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    aput-object v6, v5, v2

    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    aput-object v0, v5, v3

    invoke-virtual {v4, v5}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    goto :goto_0

    .line 131
    :cond_0
    new-instance p0, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {p0, v4, v1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private static sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)V"
        }
    .end annotation

    .line 157
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getPageIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;

    .line 165
    iget-boolean p0, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortDescending:Z

    if-eqz p0, :cond_0

    .line 166
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 184
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/4 p2, 0x6

    const/4 v0, 0x1

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 185
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 10

    const-string v0, "_id"

    .line 197
    invoke-virtual {p0, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->findRowAndMove(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 199
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getItem(I)Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 202
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 203
    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getPlaylistNameDesign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 205
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    new-instance v4, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ChildContentAccessor;

    invoke-direct {v4, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ChildContentAccessor;-><init>(Ljava/lang/String;)V

    .line 207
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    iget v8, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->pageIndex:I

    const/4 v9, 0x0

    move-object v2, v1

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Ljava/lang/String;IIZ)V

    .line 213
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    const/4 p2, 0x0

    .line 214
    invoke-virtual {v1, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public createOrGetCursor(Landroid/content/Context;)Lcom/daaw/avee/Common/Tuple2;
    .locals 1
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

    .line 259
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method public createOrGetCursor(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/Common/Tuple2;
    .locals 0
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

    .line 254
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 1

    .line 190
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getItem(I)Landroid/database/Cursor;

    move-result-object p1

    const/4 v0, 0x0

    .line 191
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

    .line 264
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->onRequestSectionOpenedState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const-class v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;

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
    .locals 4

    .line 235
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ThisItemIdentifier;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getItem(I)Landroid/database/Cursor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getItem(I)Landroid/database/Cursor;

    move-result-object p2

    const/4 v3, 0x1

    invoke-interface {p2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles$ThisItemIdentifier;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    invoke-virtual {p3, p0, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 237
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 238
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setSelected(Z)V

    .line 239
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v0, -0x1

    invoke-virtual {p3, p2, v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    .line 240
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 241
    iget p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->colorImgArt:I

    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    const p2, 0x7f0800fb

    .line 242
    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgResource(I)V

    .line 243
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 244
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 245
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getPlaylistNameDesign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->color:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 247
    invoke-virtual {p3, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 248
    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Text(Ljava/lang/String;)V

    .line 249
    iget-object p1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 228
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getItem(I)Landroid/database/Cursor;

    move-result-object v0

    .line 229
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 230
    iput p2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 231
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method

.method public setSectionOpenedState(Z)V
    .locals 2

    .line 269
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->onSetSectionOpened:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-class v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
