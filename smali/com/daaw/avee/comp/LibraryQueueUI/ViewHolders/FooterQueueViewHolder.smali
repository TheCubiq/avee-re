.class public Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;
.source "FooterQueueViewHolder.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;


# instance fields
.field private additionalInfo:Ljava/lang/String;

.field private textInfo:Landroid/widget/TextView;

.field private textInfoItems:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 2

    .line 29
    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsUI;->getInflaterFromContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c0073

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;-><init>(Landroid/view/View;IZ)V

    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->additionalInfo:Ljava/lang/String;

    .line 31
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->itemView:Landroid/view/View;

    const p2, 0x7f090209

    .line 33
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfo:Landroid/widget/TextView;

    const p2, 0x7f09020a

    .line 34
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfoItems:Landroid/widget/TextView;

    return-void
.end method

.method private onDataItemCountChanged()V
    .locals 0

    return-void
.end method


# virtual methods
.method public onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
    .locals 1

    .line 44
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V

    .line 46
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfo:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->setContainerStatusListener(Ljava/lang/ref/WeakReference;)V

    .line 50
    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->onDataItemCountChanged()V

    return-void
.end method

.method public onItemCountChanged(IIZZ)V
    .locals 3

    const/4 p2, 0x0

    const/4 p4, 0x1

    const v0, 0x7f0e0007

    const-string v1, ""

    if-eqz p3, :cond_1

    .line 63
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfo:Landroid/widget/TextView;

    const v2, 0x7f100158

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(I)V

    if-ltz p1, :cond_0

    .line 68
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {p3}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    new-array p4, p4, [Ljava/lang/Object;

    .line 69
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p4, p2

    .line 68
    invoke-virtual {p3, v0, p1, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 73
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    .line 77
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfo:Landroid/widget/TextView;

    const p2, 0x7f100102

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 78
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 80
    :cond_2
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfo:Landroid/widget/TextView;

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    iget-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {p3}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    new-array p4, p4, [Ljava/lang/Object;

    .line 82
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p4, p2

    .line 81
    invoke-virtual {p3, v0, p1, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 83
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public onUpdateStatusInfo(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;->additionalInfo:Ljava/lang/String;

    return-void
.end method
