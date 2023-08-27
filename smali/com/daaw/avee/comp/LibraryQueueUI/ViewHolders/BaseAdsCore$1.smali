.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore$1;
.super Lcom/google/android/gms/ads/AdListener;
.source "BaseAdsCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->initAdsMob(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Lcom/google/android/gms/ads/AdView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClosed()V
    .locals 0

    return-void
.end method

.method public onAdFailedToLoad(I)V
    .locals 2

    .line 72
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;)Lcom/daaw/avee/comp/Common/AdViewHolder;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 73
    invoke-static {}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->access$100()[Z

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;

    iget v0, v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adSlotId:I

    const/4 v1, 0x0

    aput-boolean v1, p1, v0

    return-void
.end method

.method public onAdLeftApplication()V
    .locals 0

    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 65
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;)Lcom/daaw/avee/comp/Common/AdViewHolder;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 66
    invoke-static {}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->access$100()[Z

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;

    iget v1, v1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adSlotId:I

    const/4 v2, 0x1

    aput-boolean v2, v0, v1

    return-void
.end method

.method public onAdOpened()V
    .locals 0

    return-void
.end method
