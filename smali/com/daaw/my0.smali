.class public final Lcom/daaw/my0;
.super Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/az0;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lcom/google/android/gms/ads/interstitial/InterstitialAd;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/vw1;Lcom/daaw/az0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/daaw/az0;",
            ")V"
        }
    .end annotation

    const-string v0, "adId"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isPremium"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferences"

    invoke-static {p3, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;-><init>()V

    iput-object p1, p0, Lcom/daaw/my0;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/my0;->b:Lcom/daaw/vw1;

    iput-object p3, p0, Lcom/daaw/my0;->c:Lcom/daaw/az0;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/daaw/my0;->d:Ljava/util/List;

    sget-object p2, Lcom/daaw/qv1;->Q:Lcom/daaw/sw1;

    new-instance p3, Lcom/daaw/ly0;

    invoke-direct {p3, p0}, Lcom/daaw/ly0;-><init>(Lcom/daaw/my0;)V

    invoke-virtual {p2, p3, p1}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object p2, Lcom/daaw/qv1;->S:Lcom/daaw/qw1;

    new-instance p3, Lcom/daaw/ky0;

    invoke-direct {p3, p0}, Lcom/daaw/ky0;-><init>(Lcom/daaw/my0;)V

    invoke-virtual {p2, p3, p1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/my0;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/my0;->d(Lcom/daaw/my0;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/my0;ZLjava/lang/Long;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/my0;->c(Lcom/daaw/my0;ZLjava/lang/Long;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static final c(Lcom/daaw/my0;ZLjava/lang/Long;Ljava/lang/Boolean;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/my0;->b:Lcom/daaw/vw1;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p3}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/my0;->c:Lcom/daaw/az0;

    invoke-virtual {p2}, Lcom/daaw/az0;->d()Z

    move-result p2

    if-nez p2, :cond_2

    :cond_0
    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/my0;->c:Lcom/daaw/az0;

    invoke-virtual {p1}, Lcom/daaw/az0;->c()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const p2, 0x7f100030

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lcom/daaw/a1;->a:Lcom/daaw/a1$a;

    invoke-virtual {p3}, Lcom/daaw/a1$a;->b()Lcom/google/android/gms/ads/AdRequest;

    move-result-object p3

    invoke-static {p1, p2, p3, p0}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static final d(Lcom/daaw/my0;Ljava/lang/Boolean;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/my0;->b:Lcom/daaw/vw1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/my0;->c:Lcom/daaw/az0;

    invoke-virtual {p1}, Lcom/daaw/az0;->d()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/my0;->f()V

    :cond_1
    return-void
.end method


# virtual methods
.method public e(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V
    .locals 1

    const-string v0, "ad"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/AdLoadCallback;->onAdLoaded(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/my0;->e:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/my0;->e:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->show(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/AdLoadCallback;->onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onRewardedVideoAdFailedToLoad("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdError;->getCode()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    invoke-virtual {p0, p1}, Lcom/daaw/my0;->e(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V

    return-void
.end method
