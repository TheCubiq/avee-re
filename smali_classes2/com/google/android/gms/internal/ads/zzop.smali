.class final Lcom/google/android/gms/internal/ads/zzop;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbik:Lcom/google/android/gms/internal/ads/zzoo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzoo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzop;->zzbik:Lcom/google/android/gms/internal/ads/zzoo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzop;->zzbik:Lcom/google/android/gms/internal/ads/zzoo;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzb(Lcom/google/android/gms/internal/ads/zzoo;)Lcom/google/android/gms/internal/ads/zzoz;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzop;->zzbik:Lcom/google/android/gms/internal/ads/zzoo;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzb(Lcom/google/android/gms/internal/ads/zzoo;)Lcom/google/android/gms/internal/ads/zzoz;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzoz;->zzkq()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzop;->zzbik:Lcom/google/android/gms/internal/ads/zzoo;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzb(Lcom/google/android/gms/internal/ads/zzoo;)Lcom/google/android/gms/internal/ads/zzoz;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzoz;->zzkp()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzop;->zzbik:Lcom/google/android/gms/internal/ads/zzoo;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzb(Lcom/google/android/gms/internal/ads/zzoo;)Lcom/google/android/gms/internal/ads/zzoz;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzoz;->zzcs()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzop;->zzbik:Lcom/google/android/gms/internal/ads/zzoo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzoo;->zza(Lcom/google/android/gms/internal/ads/zzoo;Lcom/google/android/gms/internal/ads/zzoz;)Lcom/google/android/gms/internal/ads/zzoz;

    return-void
.end method
