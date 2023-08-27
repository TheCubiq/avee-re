.class public Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;
.super Ljava/lang/Object;
.source "BaseAdsCore.java"


# static fields
.field private static mAdViewLastTimeLoadSuccess:[Z

.field public static onShowAdView:Lcom/daaw/avee/Common/Events/WeakEventR3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR3<",
            "Lcom/daaw/avee/comp/Common/AdViewHolder;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field adSlotId:I

.field private adView:Lcom/daaw/avee/comp/Common/AdViewHolder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->onShowAdView:Lcom/daaw/avee/Common/Events/WeakEventR3;

    const/4 v0, 0x3

    new-array v0, v0, [Z

    .line 24
    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->mAdViewLastTimeLoadSuccess:[Z

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(ILjava/lang/Object;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adSlotId:I

    .line 36
    instance-of p1, p2, Lcom/google/android/gms/ads/AdView;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    check-cast p2, Lcom/google/android/gms/ads/AdView;

    goto :goto_0

    :cond_0
    move-object p2, v0

    .line 37
    :goto_0
    invoke-direct {p0, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->initAdsMob(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Lcom/google/android/gms/ads/AdView;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;)Lcom/daaw/avee/comp/Common/AdViewHolder;
    .locals 0

    .line 17
    iget-object p0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adView:Lcom/daaw/avee/comp/Common/AdViewHolder;

    return-object p0
.end method

.method static synthetic access$100()[Z
    .locals 1

    .line 17
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->mAdViewLastTimeLoadSuccess:[Z

    return-object v0
.end method

.method private initAdsMob(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Lcom/google/android/gms/ads/AdView;)V
    .locals 0

    .line 50
    new-instance p1, Lcom/daaw/avee/comp/Common/AdViewHolder;

    invoke-direct {p1, p2}, Lcom/daaw/avee/comp/Common/AdViewHolder;-><init>(Lcom/google/android/gms/ads/AdView;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adView:Lcom/daaw/avee/comp/Common/AdViewHolder;

    .line 52
    iget-object p1, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    if-eqz p1, :cond_1

    .line 54
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->mAdViewLastTimeLoadSuccess:[Z

    iget p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adSlotId:I

    aget-boolean p1, p1, p2

    if-eqz p1, :cond_0

    .line 55
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adView:Lcom/daaw/avee/comp/Common/AdViewHolder;

    iget-object p1, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adView:Lcom/daaw/avee/comp/Common/AdViewHolder;

    iget-object p1, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 59
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adView:Lcom/daaw/avee/comp/Common/AdViewHolder;

    iget-object p1, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public onBind(II)V
    .locals 4

    .line 43
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adView:Lcom/daaw/avee/comp/Common/AdViewHolder;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    if-eqz p2, :cond_0

    .line 44
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->onShowAdView:Lcom/daaw/avee/Common/Events/WeakEventR3;

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adView:Lcom/daaw/avee/comp/Common/AdViewHolder;

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adSlotId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p2, v0, v1, p1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->mAdViewLastTimeLoadSuccess:[Z

    iget p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->adSlotId:I

    aput-boolean v2, p1, p2

    :cond_0
    return-void
.end method
