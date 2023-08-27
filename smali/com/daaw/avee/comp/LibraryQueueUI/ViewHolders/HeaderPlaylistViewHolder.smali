.class public Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;
.source "HeaderPlaylistViewHolder.java"


# instance fields
.field private buttonTexts:[Landroid/widget/TextView;

.field private imgBtns:[Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 4

    .line 25
    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsUI;->getInflaterFromContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0c007d

    invoke-virtual {v0, v2, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    invoke-direct {p0, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;-><init>(Landroid/view/View;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    const/4 p2, 0x3

    new-array p3, p2, [Landroid/view/View;

    .line 21
    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->imgBtns:[Landroid/view/View;

    new-array p2, p2, [Landroid/widget/TextView;

    .line 22
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->buttonTexts:[Landroid/widget/TextView;

    .line 27
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->itemView:Landroid/view/View;

    .line 29
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->imgBtns:[Landroid/view/View;

    const v0, 0x7f090102

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    aput-object v0, p3, v1

    .line 30
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->imgBtns:[Landroid/view/View;

    const v0, 0x7f090103

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, p3, v2

    .line 31
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->imgBtns:[Landroid/view/View;

    const v0, 0x7f090108

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v3, 0x2

    aput-object v0, p3, v3

    .line 32
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->buttonTexts:[Landroid/widget/TextView;

    const v0, 0x7f090225

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, p3, v1

    .line 33
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->buttonTexts:[Landroid/widget/TextView;

    const v0, 0x7f090227

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, p3, v2

    .line 34
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->buttonTexts:[Landroid/widget/TextView;

    const v0, 0x7f09022c

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    aput-object p2, p3, v3

    .line 36
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->buttonTexts:[Landroid/widget/TextView;

    invoke-static {p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->updateShowButtonTexts([Landroid/widget/TextView;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
    .locals 0

    .line 40
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V

    .line 42
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->imgBtns:[Landroid/view/View;

    const/4 p2, 0x0

    aget-object p1, p1, p2

    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->imgBtns:[Landroid/view/View;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder$2;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;->imgBtns:[Landroid/view/View;

    const/4 p2, 0x2

    aget-object p1, p1, p2

    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder$3;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
