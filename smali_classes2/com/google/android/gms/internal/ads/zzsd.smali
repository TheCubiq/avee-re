.class public final Lcom/google/android/gms/internal/ads/zzsd;
.super Lcom/google/android/gms/internal/ads/zzrm;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final zzblj:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrm;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzblj:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzrr;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzblj:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzru;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzru;-><init>(Lcom/google/android/gms/internal/ads/zzrr;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;->onUnifiedNativeAdLoaded(Lcom/google/android/gms/ads/formats/UnifiedNativeAd;)V

    return-void
.end method
