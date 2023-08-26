.class final Lcom/google/android/gms/internal/ads/zzlz;
.super Lcom/google/android/gms/internal/ads/zzkd;


# instance fields
.field private final synthetic zzatc:Lcom/google/android/gms/internal/ads/zzly;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzly;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzlz;->zzatc:Lcom/google/android/gms/internal/ads/zzly;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzkd;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlz;->zzatc:Lcom/google/android/gms/internal/ads/zzly;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzly;->zza(Lcom/google/android/gms/internal/ads/zzly;)Lcom/google/android/gms/ads/VideoController;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzlz;->zzatc:Lcom/google/android/gms/internal/ads/zzly;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzly;->zzbc()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/VideoController;->zza(Lcom/google/android/gms/internal/ads/zzlo;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzkd;->onAdFailedToLoad(I)V

    return-void
.end method

.method public final onAdLoaded()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlz;->zzatc:Lcom/google/android/gms/internal/ads/zzly;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzly;->zza(Lcom/google/android/gms/internal/ads/zzly;)Lcom/google/android/gms/ads/VideoController;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzlz;->zzatc:Lcom/google/android/gms/internal/ads/zzly;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzly;->zzbc()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/VideoController;->zza(Lcom/google/android/gms/internal/ads/zzlo;)V

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzkd;->onAdLoaded()V

    return-void
.end method
