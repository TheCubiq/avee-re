.class public Lcom/daaw/avee/Design/AdsRewardedDesign;
.super Ljava/lang/Object;
.source "AdsRewardedDesign.java"

# interfaces
.implements Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;


# static fields
.field public static premiumGreen:I


# instance fields
.field adId:Ljava/lang/String;

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mRewardedVideoAd:Lcom/google/android/gms/ads/reward/RewardedVideoAd;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->listenerRefHolder:Ljava/util/List;

    const-string v0, ""

    .line 28
    iput-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->adId:Ljava/lang/String;

    .line 31
    sget-object v0, Lcom/daaw/avee/MainActivity;->onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$oaMglkpqMPv8dOyWlQclZ7ClZvY;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$oaMglkpqMPv8dOyWlQclZ7ClZvY;-><init>(Lcom/daaw/avee/Design/AdsRewardedDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 42
    sget-object v0, Lcom/daaw/avee/MainActivity;->onResume:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$Q4DnBCYC-j9XgVh6elwrZY4wqVE;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$Q4DnBCYC-j9XgVh6elwrZY4wqVE;-><init>(Lcom/daaw/avee/Design/AdsRewardedDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 44
    sget-object v0, Lcom/daaw/avee/MainActivity;->onPause:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$KhXNhHzvKFVo9dJfrQmEebvH1nw;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$KhXNhHzvKFVo9dJfrQmEebvH1nw;-><init>(Lcom/daaw/avee/Design/AdsRewardedDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 46
    sget-object v0, Lcom/daaw/avee/MainActivity;->onDestroy:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$OkPYSE7gAu5xeIIu0iQ7_lib9Gk;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$OkPYSE7gAu5xeIIu0iQ7_lib9Gk;-><init>(Lcom/daaw/avee/Design/AdsRewardedDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 52
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->onRequestGreen:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$cF7tt0VI8f5AHjaZ8qF8igNRPDs;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$cF7tt0VI8f5AHjaZ8qF8igNRPDs;

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 54
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;->onTouch:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$kfGSJ3ZDA-UJzIs8k2IsybxKTsk;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$kfGSJ3ZDA-UJzIs8k2IsybxKTsk;-><init>(Lcom/daaw/avee/Design/AdsRewardedDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 71
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$qCOrgF1RWgqOz9dOqn4hepiUuks;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$qCOrgF1RWgqOz9dOqn4hepiUuks;

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 73
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;->onChecked:Lcom/daaw/avee/Common/Events/WeakEvent1;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$RLJILFw2iImf2eeBNsxg_CTHSSk;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$RLJILFw2iImf2eeBNsxg_CTHSSk;

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic lambda$new$4()Ljava/lang/Boolean;
    .locals 1

    .line 52
    sget v0, Lcom/daaw/avee/Design/AdsRewardedDesign;->premiumGreen:I

    if-gtz v0, :cond_1

    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$new$6()Ljava/lang/Boolean;
    .locals 1

    .line 71
    sget v0, Lcom/daaw/avee/Design/AdsRewardedDesign;->premiumGreen:I

    if-gtz v0, :cond_1

    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$new$7(Ljava/lang/Boolean;)V
    .locals 1

    .line 74
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    .line 76
    sget v0, Lcom/daaw/avee/Design/AdsRewardedDesign;->premiumGreen:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    sput p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->premiumGreen:I

    :cond_0
    return-void
.end method

.method private loadRewardedVideoAd()V
    .locals 3

    .line 84
    iget-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->adId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->mRewardedVideoAd:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    iget-object v1, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->adId:Ljava/lang/String;

    new-instance v2, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v2}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 86
    invoke-virtual {v2}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v2

    .line 85
    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/ads/reward/RewardedVideoAd;->loadAd(Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;)V

    :cond_0
    return-void
.end method

.method private showAd()V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->mRewardedVideoAd:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    invoke-interface {v0}, Lcom/google/android/gms/ads/reward/RewardedVideoAd;->isLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->mRewardedVideoAd:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    invoke-interface {v0}, Lcom/google/android/gms/ads/reward/RewardedVideoAd;->show()V

    :cond_0
    return-void
.end method


# virtual methods
.method public synthetic lambda$new$0$AdsRewardedDesign(Landroid/app/Activity;)V
    .locals 1

    const v0, 0x7f10001e

    .line 32
    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->adId:Ljava/lang/String;

    .line 35
    invoke-static {p1}, Lcom/google/android/gms/ads/MobileAds;->getRewardedVideoAdInstance(Landroid/content/Context;)Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->mRewardedVideoAd:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    .line 36
    invoke-interface {p1, p0}, Lcom/google/android/gms/ads/reward/RewardedVideoAd;->setRewardedVideoAdListener(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V

    .line 38
    invoke-direct {p0}, Lcom/daaw/avee/Design/AdsRewardedDesign;->loadRewardedVideoAd()V

    return-void
.end method

.method public synthetic lambda$new$1$AdsRewardedDesign(Landroid/app/Activity;)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->mRewardedVideoAd:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/reward/RewardedVideoAd;->resume(Landroid/content/Context;)V

    return-void
.end method

.method public synthetic lambda$new$2$AdsRewardedDesign(Landroid/app/Activity;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->mRewardedVideoAd:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/reward/RewardedVideoAd;->pause(Landroid/content/Context;)V

    return-void
.end method

.method public synthetic lambda$new$3$AdsRewardedDesign(Lcom/daaw/avee/ContextData;)V
    .locals 1

    .line 47
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getActivity()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 49
    iget-object v0, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->mRewardedVideoAd:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/reward/RewardedVideoAd;->destroy(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public synthetic lambda$new$5$AdsRewardedDesign(Lcom/daaw/avee/ContextData;)Ljava/lang/Boolean;
    .locals 1

    .line 55
    sget-boolean p1, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    const/4 v0, 0x0

    .line 57
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz p1, :cond_0

    return-object v0

    .line 58
    :cond_0
    sget p1, Lcom/daaw/avee/Design/AdsRewardedDesign;->premiumGreen:I

    if-lez p1, :cond_1

    return-object v0

    .line 62
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/Design/AdsRewardedDesign;->mRewardedVideoAd:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    invoke-interface {p1}, Lcom/google/android/gms/ads/reward/RewardedVideoAd;->isLoaded()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 63
    invoke-direct {p0}, Lcom/daaw/avee/Design/AdsRewardedDesign;->showAd()V

    const/4 p1, 0x1

    .line 64
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0
.end method

.method public onRewarded(Lcom/google/android/gms/ads/reward/RewardItem;)V
    .locals 2

    .line 102
    sget v0, Lcom/daaw/avee/Design/AdsRewardedDesign;->premiumGreen:I

    invoke-interface {p1}, Lcom/google/android/gms/ads/reward/RewardItem;->getAmount()I

    move-result p1

    const/4 v1, 0x2

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/2addr v0, p1

    sput v0, Lcom/daaw/avee/Design/AdsRewardedDesign;->premiumGreen:I

    return-void
.end method

.method public onRewardedVideoAdClosed()V
    .locals 0

    .line 111
    invoke-direct {p0}, Lcom/daaw/avee/Design/AdsRewardedDesign;->loadRewardedVideoAd()V

    return-void
.end method

.method public onRewardedVideoAdFailedToLoad(I)V
    .locals 2

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onRewardedVideoAdFailedToLoad("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AdsRewardDesign"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onRewardedVideoAdLeftApplication()V
    .locals 0

    return-void
.end method

.method public onRewardedVideoAdLoaded()V
    .locals 0

    return-void
.end method

.method public onRewardedVideoAdOpened()V
    .locals 0

    return-void
.end method

.method public onRewardedVideoCompleted()V
    .locals 0

    return-void
.end method

.method public onRewardedVideoStarted()V
    .locals 0

    return-void
.end method
