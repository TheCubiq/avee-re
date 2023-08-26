.class public final Lcom/google/android/gms/ads/InterstitialAd;
.super Ljava/lang/Object;


# instance fields
.field private final zzuv:Lcom/google/android/gms/internal/ads/zzma;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzma;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    const-string v0, "Context cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->getAdListener()Lcom/google/android/gms/ads/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isLoaded()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->isLoaded()Z

    move-result v0

    return v0
.end method

.method public final isLoading()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->isLoading()Z

    move-result v0

    return v0
.end method

.method public final loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->zzay()Lcom/google/android/gms/internal/ads/zzlw;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->zza(Lcom/google/android/gms/internal/ads/zzlw;)V

    return-void
.end method

.method public final setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzjd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzjd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->zza(Lcom/google/android/gms/internal/ads/zzjd;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzma;->zza(Lcom/google/android/gms/internal/ads/zzjd;)V

    :cond_1
    return-void
.end method

.method public final setAdUnitId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setImmersiveMode(Z)V

    return-void
.end method

.method public final setRewardedVideoAdListener(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setRewardedVideoAdListener(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V

    return-void
.end method

.method public final show()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->show()V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/ads/reward/zza;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->zza(Lcom/google/android/gms/ads/reward/zza;)V

    return-void
.end method

.method public final zza(Z)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzma;->zza(Z)V

    return-void
.end method

.method public final zzba()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->zzba()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
