.class public final Lcom/google/android/gms/ads/Correlator;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field zzuu:Lcom/google/android/gms/internal/ads/zzkc;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzkc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzkc;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/Correlator;->zzuu:Lcom/google/android/gms/internal/ads/zzkc;

    return-void
.end method


# virtual methods
.method public final reset()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/Correlator;->zzuu:Lcom/google/android/gms/internal/ads/zzkc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzkc;->zzil()V

    return-void
.end method

.method public final zzaz()Lcom/google/android/gms/internal/ads/zzkc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/Correlator;->zzuu:Lcom/google/android/gms/internal/ads/zzkc;

    return-object v0
.end method
