.class public final Lcom/google/android/gms/internal/ads/zzaws$zza;
.super Lcom/google/android/gms/internal/ads/zzbbo$zza;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/zzaws;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbbo$zza<",
        "Lcom/google/android/gms/internal/ads/zzaws;",
        "Lcom/google/android/gms/internal/ads/zzaws$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaws;->zzyb()Lcom/google/android/gms/internal/ads/zzaws;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;-><init>(Lcom/google/android/gms/internal/ads/zzbbo;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzawt;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaws$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzar(I)Lcom/google/android/gms/internal/ads/zzaws$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaws$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaws;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzaws;->zza(Lcom/google/android/gms/internal/ads/zzaws;I)V

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzawu;)Lcom/google/android/gms/internal/ads/zzaws$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaws$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaws;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzaws;->zza(Lcom/google/android/gms/internal/ads/zzaws;Lcom/google/android/gms/internal/ads/zzawu;)V

    return-object p0
.end method

.method public final zzy(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzaws$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaws$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaws;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzaws;->zza(Lcom/google/android/gms/internal/ads/zzaws;Lcom/google/android/gms/internal/ads/zzbah;)V

    return-object p0
.end method
