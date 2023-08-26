.class public final Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;
.super Ljava/lang/Object;


# instance fields
.field private final zzuv:Lcom/google/android/gms/internal/ads/zzma;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzma;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/internal/ads/zzma;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    const-string v0, "Context cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->getAdListener()Lcom/google/android/gms/ads/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getAppEventListener()Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->getAppEventListener()Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    move-result-object v0

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getOnCustomRenderedAdLoadedListener()Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->getOnCustomRenderedAdLoadedListener()Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    move-result-object v0

    return-object v0
.end method

.method public final isLoaded()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->isLoaded()Z

    move-result v0

    return v0
.end method

.method public final isLoading()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->isLoading()Z

    move-result v0

    return v0
.end method

.method public final loadAd(Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->zzay()Lcom/google/android/gms/internal/ads/zzlw;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->zza(Lcom/google/android/gms/internal/ads/zzlw;)V

    return-void
.end method

.method public final setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    return-void
.end method

.method public final setAdUnitId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public final setAppEventListener(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setAppEventListener(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    return-void
.end method

.method public final setCorrelator(Lcom/google/android/gms/ads/Correlator;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setCorrelator(Lcom/google/android/gms/ads/Correlator;)V

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setImmersiveMode(Z)V

    return-void
.end method

.method public final setOnCustomRenderedAdLoadedListener(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzma;->setOnCustomRenderedAdLoadedListener(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V

    return-void
.end method

.method public final show()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;->zzuv:Lcom/google/android/gms/internal/ads/zzma;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzma;->show()V

    return-void
.end method
