.class public final Lcom/google/android/gms/internal/ads/zzaxc$zza;
.super Lcom/google/android/gms/internal/ads/zzbbo$zza;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/zzaxc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbbo$zza<",
        "Lcom/google/android/gms/internal/ads/zzaxc;",
        "Lcom/google/android/gms/internal/ads/zzaxc$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaxc;->zzyp()Lcom/google/android/gms/internal/ads/zzaxc;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;-><init>(Lcom/google/android/gms/internal/ads/zzbbo;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzaxd;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaxc$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzaf(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzaxc$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxc$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaxc;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzaxc;->zza(Lcom/google/android/gms/internal/ads/zzaxc;Lcom/google/android/gms/internal/ads/zzbah;)V

    return-object p0
.end method

.method public final zzav(I)Lcom/google/android/gms/internal/ads/zzaxc$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaxc$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaxc;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzaxc;->zza(Lcom/google/android/gms/internal/ads/zzaxc;I)V

    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaxg;)Lcom/google/android/gms/internal/ads/zzaxc$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxc$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaxc;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzaxc;->zza(Lcom/google/android/gms/internal/ads/zzaxc;Lcom/google/android/gms/internal/ads/zzaxg;)V

    return-object p0
.end method
