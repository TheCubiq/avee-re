.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;
.source "SectionViewHolder.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;


# instance fields
.field private btnCollapse:Landroid/widget/ImageButton;

.field private textTitle:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 2

    .line 28
    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsUI;->getInflaterFromContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c00c0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;-><init>(Landroid/view/View;)V

    .line 30
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->itemView:Landroid/view/View;

    const p2, 0x7f090068

    .line 31
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageButton;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->btnCollapse:Landroid/widget/ImageButton;

    const p2, 0x7f090258

    .line 32
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->textTitle:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->textTitle:Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
    .locals 1

    .line 36
    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getDisplayName()Lcom/daaw/avee/Common/IVAsyncTask;

    move-result-object p2

    .line 37
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;)V

    invoke-interface {p2, v0}, Lcom/daaw/avee/Common/IVAsyncTask;->Run(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    .line 46
    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getSectionOpened()Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->updateButtonState(Z)V

    .line 48
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->btnCollapse:Landroid/widget/ImageButton;

    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$2;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onItemCountChanged(IIZZ)V
    .locals 0

    return-void
.end method

.method public onUpdateStatusInfo(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method updateButtonState(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 69
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->btnCollapse:Landroid/widget/ImageButton;

    const v0, 0x7f0800e8

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    .line 71
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->btnCollapse:Landroid/widget/ImageButton;

    const v0, 0x7f0800ce

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    :goto_0
    return-void
.end method
