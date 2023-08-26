.class public final Lcom/google/android/gms/internal/ads/zzse;
.super Lcom/google/android/gms/internal/ads/zzrp;


# instance fields
.field private final zzblk:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$UnconfirmedClickListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/UnifiedNativeAd$UnconfirmedClickListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrp;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzse;->zzblk:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$UnconfirmedClickListener;

    return-void
.end method


# virtual methods
.method public final onUnconfirmedClickCancelled()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzse;->zzblk:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$UnconfirmedClickListener;

    invoke-interface {v0}, Lcom/google/android/gms/ads/formats/UnifiedNativeAd$UnconfirmedClickListener;->onUnconfirmedClickCancelled()V

    return-void
.end method

.method public final onUnconfirmedClickReceived(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzse;->zzblk:Lcom/google/android/gms/ads/formats/UnifiedNativeAd$UnconfirmedClickListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/formats/UnifiedNativeAd$UnconfirmedClickListener;->onUnconfirmedClickReceived(Ljava/lang/String;)V

    return-void
.end method
