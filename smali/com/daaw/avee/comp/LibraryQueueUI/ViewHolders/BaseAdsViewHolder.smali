.class public abstract Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;
.source "BaseAdsViewHolder.java"


# instance fields
.field adsCore:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;


# direct methods
.method public constructor <init>(Landroid/view/View;IZ)V
    .locals 1

    .line 19
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;-><init>(Landroid/view/View;)V

    .line 21
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;

    if-eqz p3, :cond_0

    const p3, 0x7f090047

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;->adsCore:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;

    return-void
.end method


# virtual methods
.method public onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;->adsCore:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;

    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getItemCount()I

    move-result p1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->onBind(II)V

    return-void
.end method
