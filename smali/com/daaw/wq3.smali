.class public final Lcom/daaw/wq3;
.super Lcom/daaw/le3;
.source ""


# instance fields
.field public final p:Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/le3;-><init>()V

    iput-object p1, p0, Lcom/daaw/wq3;->p:Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;

    return-void
.end method


# virtual methods
.method public final c2(Lcom/daaw/ye3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/wq3;->p:Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;

    new-instance v1, Lcom/daaw/mq3;

    invoke-direct {v1, p1}, Lcom/daaw/mq3;-><init>(Lcom/daaw/ye3;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;->onNativeAdLoaded(Lcom/google/android/gms/ads/nativead/NativeAd;)V

    return-void
.end method
