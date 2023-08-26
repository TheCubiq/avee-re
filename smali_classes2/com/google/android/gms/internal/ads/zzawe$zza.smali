.class public final Lcom/google/android/gms/internal/ads/zzawe$zza;
.super Lcom/google/android/gms/internal/ads/zzbbo$zza;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/zzawe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbbo$zza<",
        "Lcom/google/android/gms/internal/ads/zzawe;",
        "Lcom/google/android/gms/internal/ads/zzawe$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzawe;->zzxl()Lcom/google/android/gms/internal/ads/zzawe;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;-><init>(Lcom/google/android/gms/internal/ads/zzbbo;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzawf;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzawe$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzao(I)Lcom/google/android/gms/internal/ads/zzawe$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzawe$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzawe;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzawe;->zza(Lcom/google/android/gms/internal/ads/zzawe;I)V

    return-object p0
.end method

.method public final zzs(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzawe$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadh()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzawe$zza;->zzdtx:Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzawe;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzawe;->zza(Lcom/google/android/gms/internal/ads/zzawe;Lcom/google/android/gms/internal/ads/zzbah;)V

    return-object p0
.end method
