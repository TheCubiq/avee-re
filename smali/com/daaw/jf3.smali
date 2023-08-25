.class public final Lcom/daaw/jf3;
.super Lcom/daaw/le3;
.source ""


# instance fields
.field public final p:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/le3;-><init>()V

    iput-object p1, p0, Lcom/daaw/jf3;->p:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;

    return-void
.end method


# virtual methods
.method public final c2(Lcom/daaw/ye3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jf3;->p:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;

    new-instance v1, Lcom/daaw/ze3;

    invoke-direct {v1, p1}, Lcom/daaw/ze3;-><init>(Lcom/daaw/ye3;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/formats/UnifiedNativeAd$OnUnifiedNativeAdLoadedListener;->onUnifiedNativeAdLoaded(Lcom/google/android/gms/ads/formats/UnifiedNativeAd;)V

    return-void
.end method
