.class public final Lcom/google/android/gms/ads/internal/client/zzfc;
.super Lcom/daaw/vv3;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/vv3;-><init>()V

    return-void
.end method

.method public static g3(Lcom/daaw/dw3;)V
    .locals 2

    const-string v0, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {v0}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/d04;->b:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/zzfb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/client/zzfb;-><init>(Lcom/daaw/dw3;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final zzb()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/ads/internal/client/zzdn;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzd()Lcom/daaw/tv3;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/dw3;)V
    .locals 0

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/client/zzfc;->g3(Lcom/daaw/dw3;)V

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/dw3;)V
    .locals 0

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/client/zzfc;->g3(Lcom/daaw/dw3;)V

    return-void
.end method

.method public final zzh(Z)V
    .locals 0

    return-void
.end method

.method public final zzi(Lcom/google/android/gms/ads/internal/client/zzdd;)V
    .locals 0

    return-void
.end method

.method public final zzj(Lcom/google/android/gms/ads/internal/client/zzdg;)V
    .locals 0

    return-void
.end method

.method public final zzk(Lcom/daaw/zv3;)V
    .locals 0

    return-void
.end method

.method public final zzl(Lcom/google/android/gms/internal/ads/zzcdy;)V
    .locals 0

    return-void
.end method

.method public final zzm(Lcom/daaw/yd0;)V
    .locals 0

    return-void
.end method

.method public final zzn(Lcom/daaw/yd0;Z)V
    .locals 0

    return-void
.end method

.method public final zzo()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zzp(Lcom/daaw/ew3;)V
    .locals 0

    return-void
.end method
