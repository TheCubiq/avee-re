.class public Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlainViewHolder;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;
.source "HeaderPlainViewHolder.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 2

    .line 18
    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsUI;->getInflaterFromContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7f0c007c

    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1, v0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;-><init>(Landroid/view/View;IZ)V

    return-void
.end method


# virtual methods
.method public onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
    .locals 0

    .line 23
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V

    return-void
.end method
