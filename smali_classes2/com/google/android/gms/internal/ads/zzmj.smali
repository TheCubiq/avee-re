.class public final Lcom/google/android/gms/internal/ads/zzmj;
.super Lcom/google/android/gms/internal/ads/zzkt;


# instance fields
.field private zzxs:Lcom/google/android/gms/internal/ads/zzkh;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzkt;-><init>()V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzmj;)Lcom/google/android/gms/internal/ads/zzkh;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzmj;->zzxs:Lcom/google/android/gms/internal/ads/zzkh;

    return-object p0
.end method


# virtual methods
.method public final destroy()V
    .locals 0

    return-void
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/zzlo;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isLoading()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isReady()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final pause()V
    .locals 0

    return-void
.end method

.method public final resume()V
    .locals 0

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .locals 0

    return-void
.end method

.method public final setManualImpressionsEnabled(Z)V
    .locals 0

    return-void
.end method

.method public final setUserId(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final showInterstitial()V
    .locals 0

    return-void
.end method

.method public final stopLoading()V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzaaw;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzabc;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzahe;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzjn;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzke;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzkh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzmj;->zzxs:Lcom/google/android/gms/internal/ads/zzkh;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzkx;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzla;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzlg;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzlu;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzmu;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzod;)V
    .locals 0

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z
    .locals 1

    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzane;->e(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/zzamu;->zzsy:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzmk;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzmk;-><init>(Lcom/google/android/gms/internal/ads/zzmj;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return p1
.end method

.method public final zzba()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final zzbj()Lcom/google/android/gms/dynamic/IObjectWrapper;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzbk()Lcom/google/android/gms/internal/ads/zzjn;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzbm()V
    .locals 0

    return-void
.end method

.method public final zzbw()Lcom/google/android/gms/internal/ads/zzla;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzbx()Lcom/google/android/gms/internal/ads/zzkh;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzck()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
