.class public final Lcom/daaw/rp3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;


# instance fields
.field public final synthetic a:Lcom/daaw/ap3;

.field public final synthetic b:Lcom/daaw/gn3;

.field public final synthetic c:Lcom/daaw/sp3;


# direct methods
.method public constructor <init>(Lcom/daaw/sp3;Lcom/daaw/ap3;Lcom/daaw/gn3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rp3;->c:Lcom/daaw/sp3;

    iput-object p2, p0, Lcom/daaw/rp3;->a:Lcom/daaw/ap3;

    iput-object p3, p0, Lcom/daaw/rp3;->b:Lcom/daaw/gn3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Lcom/google/android/gms/ads/AdError;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/rp3;->a:Lcom/daaw/ap3;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdError;->zza()Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/ap3;->zzf(Lcom/google/android/gms/ads/internal/client/zze;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onFailure(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/ads/AdError;

    const/4 v1, 0x0

    const-string v2, "undefined"

    invoke-direct {v0, v1, p1, v2}, Lcom/google/android/gms/ads/AdError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/rp3;->onFailure(Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method public final bridge synthetic onSuccess(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lcom/google/android/gms/ads/mediation/MediationRewardedAd;

    const/4 v0, 0x0

    const-string v1, ""

    if-nez p1, :cond_0

    const-string p1, "Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad."

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    :try_start_0
    iget-object p1, p0, Lcom/daaw/rp3;->a:Lcom/daaw/ap3;

    const-string v2, "Adapter returned null."

    invoke-interface {p1, v2}, Lcom/daaw/ap3;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {v1, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/rp3;->c:Lcom/daaw/sp3;

    invoke-static {v0, p1}, Lcom/daaw/sp3;->j3(Lcom/daaw/sp3;Lcom/google/android/gms/ads/mediation/MediationRewardedAd;)V

    iget-object p1, p0, Lcom/daaw/rp3;->a:Lcom/daaw/ap3;

    invoke-interface {p1}, Lcom/daaw/ap3;->zzg()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-static {v1, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance v0, Lcom/daaw/tp3;

    iget-object p1, p0, Lcom/daaw/rp3;->b:Lcom/daaw/gn3;

    invoke-direct {v0, p1}, Lcom/daaw/tp3;-><init>(Lcom/daaw/gn3;)V

    :goto_1
    return-object v0
.end method
