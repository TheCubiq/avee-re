.class public final Lcom/daaw/avee/PostExportAdManager;
.super Lcom/google/android/gms/ads/AdListener;
.source "PostExportAdManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0008\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0008\u0010\u0013\u001a\u00020\u000eH\u0016J\u0008\u0010\u0014\u001a\u00020\u000eH\u0016J\u0008\u0010\u0015\u001a\u00020\u000eH\u0016J\u0008\u0010\u0016\u001a\u00020\u000eH\u0016J\u0008\u0010\u0017\u001a\u00020\u000eH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/daaw/avee/PostExportAdManager;",
        "Lcom/google/android/gms/ads/AdListener;",
        "isPremium",
        "Lcom/daaw/avee/Common/Events/WeakEventR;",
        "",
        "(Lcom/daaw/avee/Common/Events/WeakEventR;)V",
        "ad",
        "Lcom/google/android/gms/ads/InterstitialAd;",
        "adId",
        "",
        "listenerRefHolder",
        "",
        "",
        "onAdClicked",
        "",
        "onAdClosed",
        "onAdFailedToLoad",
        "errorCode",
        "",
        "onAdImpression",
        "onAdLeftApplication",
        "onAdLoaded",
        "onAdOpened",
        "showAd",
        "app_standardRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0x10
    }
.end annotation


# instance fields
.field private ad:Lcom/google/android/gms/ads/InterstitialAd;

.field private final adId:Ljava/lang/String;

.field private final isPremium:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/avee/Common/Events/WeakEventR;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "isPremium"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/PostExportAdManager;->isPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 12
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/avee/PostExportAdManager;->listenerRefHolder:Ljava/util/List;

    const-string p1, "ca-app-pub-3759586557634138/3471601953"

    .line 15
    iput-object p1, p0, Lcom/daaw/avee/PostExportAdManager;->adId:Ljava/lang/String;

    .line 25
    sget-object p1, Lcom/daaw/avee/MainActivity;->onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/PostExportAdManager$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/PostExportAdManager$1;-><init>(Lcom/daaw/avee/PostExportAdManager;)V

    check-cast v0, Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;

    .line 30
    iget-object v1, p0, Lcom/daaw/avee/PostExportAdManager;->listenerRefHolder:Ljava/util/List;

    .line 25
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 32
    sget-object p1, Lcom/daaw/avee/Design/VisualizerExporterDesign;->onExportSuccess:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v0, Lcom/daaw/avee/PostExportAdManager$2;

    invoke-direct {v0, p0}, Lcom/daaw/avee/PostExportAdManager$2;-><init>(Lcom/daaw/avee/PostExportAdManager;)V

    check-cast v0, Lcom/daaw/avee/Common/Events/WeakEvent$Handler;

    .line 36
    iget-object v1, p0, Lcom/daaw/avee/PostExportAdManager;->listenerRefHolder:Ljava/util/List;

    .line 32
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getAd$p(Lcom/daaw/avee/PostExportAdManager;)Lcom/google/android/gms/ads/InterstitialAd;
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/daaw/avee/PostExportAdManager;->ad:Lcom/google/android/gms/ads/InterstitialAd;

    return-object p0
.end method

.method public static final synthetic access$getAdId$p(Lcom/daaw/avee/PostExportAdManager;)Ljava/lang/String;
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/daaw/avee/PostExportAdManager;->adId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$isPremium$p(Lcom/daaw/avee/PostExportAdManager;)Lcom/daaw/avee/Common/Events/WeakEventR;
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/daaw/avee/PostExportAdManager;->isPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    return-object p0
.end method

.method public static final synthetic access$setAd$p(Lcom/daaw/avee/PostExportAdManager;Lcom/google/android/gms/ads/InterstitialAd;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/daaw/avee/PostExportAdManager;->ad:Lcom/google/android/gms/ads/InterstitialAd;

    return-void
.end method

.method public static final synthetic access$showAd(Lcom/daaw/avee/PostExportAdManager;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/daaw/avee/PostExportAdManager;->showAd()V

    return-void
.end method

.method private final showAd()V
    .locals 2

    .line 19
    iget-object v0, p0, Lcom/daaw/avee/PostExportAdManager;->ad:Lcom/google/android/gms/ads/InterstitialAd;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/InterstitialAd;->isLoaded()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 20
    iget-object v0, p0, Lcom/daaw/avee/PostExportAdManager;->ad:Lcom/google/android/gms/ads/InterstitialAd;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/InterstitialAd;->show()V

    :cond_0
    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 0

    return-void
.end method

.method public onAdClosed()V
    .locals 0

    return-void
.end method

.method public onAdFailedToLoad(I)V
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onRewardedVideoAdFailedToLoad("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PostExportAdManager"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onAdImpression()V
    .locals 0

    return-void
.end method

.method public onAdLeftApplication()V
    .locals 0

    return-void
.end method

.method public onAdLoaded()V
    .locals 2

    const-string v0, "PostExportAdManager"

    const-string v1, "onRewardedVideoAdLoaded"

    .line 50
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onAdOpened()V
    .locals 0

    return-void
.end method
