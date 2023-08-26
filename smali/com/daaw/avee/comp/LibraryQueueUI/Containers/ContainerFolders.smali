.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;
.source "ContainerFolders.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;
    }
.end annotation


# static fields
.field private static final defaultActionIndex:I = 0x0

.field private static final primaryActionIndex:I = -0x1


# instance fields
.field itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 94
    invoke-direct/range {p0 .. p5}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CursorContainerBase;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p2, 0x6

    new-array p2, p2, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 38
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$1;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;)V

    const/4 p4, 0x0

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;)V

    const/4 p4, 0x1

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$3;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;)V

    const/4 p4, 0x2

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$4;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;)V

    const/4 p4, 0x3

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$5;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$5;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;)V

    const/4 p4, 0x4

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$6;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$6;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;)V

    const/4 p4, 0x5

    aput-object p3, p2, p4

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 95
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->init(Landroid/content/Context;)V

    return-void
.end method

.method static makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Lcom/daaw/avee/Common/Tuple2;
    .locals 8
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

    .line 99
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefGetLibraryFolders(Landroid/content/Context;)Lcom/daaw/avee/Common/MultiList;

    move-result-object p0

    const/4 p1, 0x3

    new-array v0, p1, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-string v3, ""

    aput-object v3, v0, v1

    const/4 v4, 0x2

    aput-object v3, v0, v4

    .line 102
    new-instance v5, Landroid/database/MatrixCursor;

    invoke-direct {v5, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    .line 104
    invoke-virtual {p0}, Lcom/daaw/avee/Common/MultiList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/Common/Tuple2;

    new-array v6, p1, [Ljava/lang/String;

    .line 105
    iget-object v7, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    aput-object v7, v6, v2

    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    aput-object v0, v6, v1

    const-string v0, "2131230932"

    aput-object v0, v6, v4

    invoke-virtual {v5, v6}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    goto :goto_0

    .line 108
    :cond_0
    new-instance p0, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {p0, v5, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 113
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/4 p2, 0x5

    const/4 v0, 0x1

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 114
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 3

    const-string v0, "_id"

    .line 130
    invoke-virtual {p0, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->findRowAndMove(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 132
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getItem(I)Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 135
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 136
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 138
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->pageIndex:I

    invoke-direct {v1, p1, v2, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;I)V

    .line 140
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->libraryContainerDataListenerWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    .line 141
    invoke-virtual {v1, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

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

    .line 188
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Lcom/daaw/avee/Common/Tuple2;

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

    .line 183
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->makeCursor(Landroid/content/Context;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method getChildItems(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation

    .line 118
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->pageIndex:I

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v1

    invoke-static {p1, v0, v1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->getTrackList(Landroid/content/Context;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 1

    .line 123
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getItem(I)Landroid/database/Cursor;

    move-result-object p1

    const/4 v0, 0x0

    .line 124
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 4

    .line 162
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getItem(I)Landroid/database/Cursor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getItem(I)Landroid/database/Cursor;

    move-result-object p2

    const/4 v3, 0x1

    invoke-interface {p2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p2

    invoke-virtual {p3, p0, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 164
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 165
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setSelected(Z)V

    .line 166
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v0, -0x1

    invoke-virtual {p3, p2, v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    .line 167
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 168
    iget p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->colorImgArt:I

    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    const/4 p2, 0x2

    .line 169
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    invoke-virtual {p3, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgResource(I)V

    .line 170
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 171
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 172
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/AOSPutils/Context_storage;->getPathFolderName(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    .line 174
    iget-object v0, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    iget-object p2, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->color:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 176
    invoke-virtual {p3, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 177
    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Text(Ljava/lang/String;)V

    .line 178
    iget-object p1, p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 155
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getItem(I)Landroid/database/Cursor;

    move-result-object v0

    .line 156
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 157
    iput p2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 158
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;->getView(Landroid/database/Cursor;ILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method
