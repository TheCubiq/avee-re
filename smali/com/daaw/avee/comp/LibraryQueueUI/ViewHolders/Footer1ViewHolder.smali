.class public Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;
.source "Footer1ViewHolder.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;


# instance fields
.field private itemCountVisible:I

.field private loadingActive:Z

.field private overrideInfo:Ljava/lang/String;

.field private searchingActive:Z

.field private textInfo:Landroid/widget/TextView;

.field private textInfoItems:Landroid/widget/TextView;

.field private totalTime:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;I)V
    .locals 1

    .line 34
    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsUI;->getInflaterFromContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    const p3, 0x7f0c0072

    goto :goto_0

    :cond_0
    const p3, 0x7f0c0071

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;-><init>(Landroid/view/View;IZ)V

    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->overrideInfo:Ljava/lang/String;

    .line 28
    iput v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->itemCountVisible:I

    .line 29
    iput v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->totalTime:I

    .line 30
    iput-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->searchingActive:Z

    .line 31
    iput-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->loadingActive:Z

    .line 37
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->itemView:Landroid/view/View;

    const p2, 0x7f090209

    .line 39
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfo:Landroid/widget/TextView;

    const p2, 0x7f09020a

    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfoItems:Landroid/widget/TextView;

    return-void
.end method

.method private onDataItemCountChanged()V
    .locals 0

    return-void
.end method

.method private updateTextInfo()V
    .locals 6

    .line 81
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->overrideInfo:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 82
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfo:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 87
    :cond_0
    iget-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->loadingActive:Z

    if-eqz v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfo:Landroid/widget/TextView;

    const v2, 0x7f1000ce

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 89
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 90
    :cond_1
    iget-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->searchingActive:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    const v4, 0x7f0e0007

    if-eqz v0, :cond_3

    .line 91
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfo:Landroid/widget/TextView;

    const v5, 0x7f100158

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 93
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->itemCountVisible:I

    if-ltz v0, :cond_2

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->itemCountVisible:I

    new-array v3, v3, [Ljava/lang/Object;

    .line 95
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v2

    .line 94
    invoke-virtual {v0, v4, v1, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 99
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 102
    :cond_3
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->itemCountVisible:I

    if-nez v0, :cond_4

    .line 103
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfo:Landroid/widget/TextView;

    const v2, 0x7f100102

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 104
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 106
    :cond_4
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfo:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->itemCountVisible:I

    new-array v3, v3, [Ljava/lang/Object;

    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v2

    .line 107
    invoke-virtual {v0, v4, v1, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 109
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
    .locals 1

    .line 49
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V

    .line 51
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfo:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->textInfoItems:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->setContainerStatusListener(Ljava/lang/ref/WeakReference;)V

    .line 55
    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->onDataItemCountChanged()V

    return-void
.end method

.method public onItemCountChanged(IIZZ)V
    .locals 0

    .line 65
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->itemCountVisible:I

    .line 66
    iput p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->totalTime:I

    .line 67
    iput-boolean p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->searchingActive:Z

    .line 68
    iput-boolean p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->loadingActive:Z

    .line 70
    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->updateTextInfo()V

    return-void
.end method

.method public onUpdateStatusInfo(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->overrideInfo:Ljava/lang/String;

    .line 76
    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;->updateTextInfo()V

    return-void
.end method
