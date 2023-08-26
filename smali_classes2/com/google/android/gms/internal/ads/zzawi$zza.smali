.class public final Lcom/google/android/gms/internal/ads/zzawi$zza;
.super Lcom/google/android/gms/internal/ads/zzbbo$zza;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/zzawi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbbo$zza<",
        "Lcom/google/android/gms/internal/ads/zzawi;",
        "Lcom/google/android/gms/internal/ads/zzawi$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzawi;->zzxo()Lcom/google/android/gms/internal/ads/zzawi;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;-><init>(Lcom/google/android/gms/internal/ads/zzbbo;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzawj;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzawi$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzap(I)Lcom/google/android/gms/internal/ads/zzawi$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzawi$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzawi;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzawi;->zza(Lcom/google/android/gms/internal/ads/zzawi;I)V

    return-object p0
.end method

.method public final zzv(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzawi$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzawi$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzawi;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzawi;->zza(Lcom/google/android/gms/internal/ads/zzawi;Lcom/google/android/gms/internal/ads/zzbah;)V

    return-object p0
.end method
