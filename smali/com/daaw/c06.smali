.class public final Lcom/daaw/c06;
.super Lcom/google/android/gms/ads/internal/client/zzbm;
.source ""


# instance fields
.field public final synthetic p:Lcom/google/android/gms/ads/internal/client/zzeu;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/ads/internal/client/zzeu;Lcom/google/android/gms/ads/internal/client/zzes;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c06;->p:Lcom/google/android/gms/ads/internal/client/zzeu;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzbm;-><init>()V

    return-void
.end method


# virtual methods
.method public final zze()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzg(Lcom/google/android/gms/ads/internal/client/zzl;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/c06;->zzh(Lcom/google/android/gms/ads/internal/client/zzl;I)V

    return-void
.end method

.method public final zzh(Lcom/google/android/gms/ads/internal/client/zzl;I)V
    .locals 0

    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    sget-object p1, Lcom/daaw/d04;->b:Landroid/os/Handler;

    new-instance p2, Lcom/daaw/vx5;

    invoke-direct {p2, p0}, Lcom/daaw/vx5;-><init>(Lcom/daaw/c06;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final zzi()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
