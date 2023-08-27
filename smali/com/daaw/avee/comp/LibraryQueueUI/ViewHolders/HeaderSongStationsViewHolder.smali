.class public Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;
.source "HeaderSongStationsViewHolder.java"


# instance fields
.field private btnColor0:I

.field private buttonIcons:[Landroid/widget/ImageView;

.field private buttonTexts:[Landroid/widget/TextView;

.field private buttons:[Landroid/view/View;

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 7

    .line 32
    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsUI;->getInflaterFromContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0c0080

    invoke-virtual {v0, v2, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    invoke-direct {p0, p2, p3, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;-><init>(Landroid/view/View;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Z)V

    const/4 p2, 0x5

    new-array p3, p2, [Landroid/widget/ImageView;

    .line 25
    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttonIcons:[Landroid/widget/ImageView;

    new-array p3, p2, [Landroid/widget/TextView;

    .line 26
    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttonTexts:[Landroid/widget/TextView;

    new-array p2, p2, [Landroid/view/View;

    .line 27
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttons:[Landroid/view/View;

    .line 29
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->listenerRefHolder:Ljava/util/List;

    .line 33
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->itemView:Landroid/view/View;

    const p3, 0x7f0400c1

    .line 35
    invoke-static {p2, p3}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result p3

    iput p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->btnColor0:I

    .line 37
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttonTexts:[Landroid/widget/TextView;

    const/4 v0, 0x0

    aput-object v0, p3, v1

    const/4 v2, 0x1

    .line 38
    aput-object v0, p3, v2

    const v3, 0x7f09022a

    .line 39
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const/4 v4, 0x2

    aput-object v3, p3, v4

    .line 40
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttonTexts:[Landroid/widget/TextView;

    const v3, 0x7f09022b

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const/4 v5, 0x3

    aput-object v3, p3, v5

    .line 41
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttonTexts:[Landroid/widget/TextView;

    const v3, 0x7f09022c

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const/4 v6, 0x4

    aput-object v3, p3, v6

    .line 43
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttonIcons:[Landroid/widget/ImageView;

    const v3, 0x7f090062

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    aput-object v3, p3, v5

    .line 45
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttonTexts:[Landroid/widget/TextView;

    invoke-static {p3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->updateShowButtonTexts([Landroid/widget/TextView;Landroid/content/Context;)V

    .line 47
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttons:[Landroid/view/View;

    aput-object v0, p1, v1

    .line 48
    aput-object v0, p1, v2

    const p3, 0x7f090106

    .line 49
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    aput-object p3, p1, v4

    .line 50
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttons:[Landroid/view/View;

    const p3, 0x7f090107

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    aput-object p3, p1, v5

    .line 51
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttons:[Landroid/view/View;

    const p3, 0x7f090108

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    aput-object p2, p1, v6

    return-void
.end method


# virtual methods
.method public onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
    .locals 2

    .line 55
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V

    .line 57
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->listenerRefHolder:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 59
    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryContainerDataListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 61
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->listenerRefHolder:Ljava/util/List;

    invoke-interface {p2, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->subscribeWeakShowAlbumArtValueChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 69
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttons:[Landroid/view/View;

    const/4 v0, 0x2

    aget-object p2, p2, v0

    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder$2;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttons:[Landroid/view/View;

    const/4 v0, 0x3

    aget-object p2, p2, v0

    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder$3;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttons:[Landroid/view/View;

    const/4 v0, 0x4

    aget-object p2, p2, v0

    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder$4;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getShowAlbumArtValue()Z

    move-result p1

    .line 92
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->onShowAlbumArtInsteadChanged(Z)V

    return-void
.end method

.method public onShowAlbumArtInsteadChanged(Z)V
    .locals 2

    const/4 v0, 0x3

    if-eqz p1, :cond_0

    .line 97
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttonIcons:[Landroid/widget/ImageView;

    aget-object v1, p1, v0

    aget-object p1, p1, v0

    const v0, 0x7f0400c3

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    .line 99
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->buttonIcons:[Landroid/widget/ImageView;

    aget-object p1, p1, v0

    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;->btnColor0:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    :goto_0
    return-void
.end method
