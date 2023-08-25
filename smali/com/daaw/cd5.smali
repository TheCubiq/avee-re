.class public final Lcom/daaw/cd5;
.super Lcom/google/android/gms/ads/internal/client/zzaz;
.source ""


# instance fields
.field public final synthetic c:Lcom/google/android/gms/ads/internal/client/zzea;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzea;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cd5;->c:Lcom/google/android/gms/ads/internal/client/zzea;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzaz;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/cd5;->c:Lcom/google/android/gms/ads/internal/client/zzea;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/zzea;->c(Lcom/google/android/gms/ads/internal/client/zzea;)Lcom/google/android/gms/ads/VideoController;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzea;->zzi()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/VideoController;->zzb(Lcom/google/android/gms/ads/internal/client/zzdq;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/client/zzaz;->onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V

    return-void
.end method

.method public final onAdLoaded()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/cd5;->c:Lcom/google/android/gms/ads/internal/client/zzea;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/zzea;->c(Lcom/google/android/gms/ads/internal/client/zzea;)Lcom/google/android/gms/ads/VideoController;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzea;->zzi()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/VideoController;->zzb(Lcom/google/android/gms/ads/internal/client/zzdq;)V

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/client/zzaz;->onAdLoaded()V

    return-void
.end method
