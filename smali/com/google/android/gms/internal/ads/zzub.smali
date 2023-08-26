.class public final Lcom/google/android/gms/internal/ads/zzub;
.super Lcom/google/android/gms/internal/ads/zzkt;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final zzbom:Lcom/google/android/gms/internal/ads/zzss;

.field private zzbor:Lcom/google/android/gms/ads/internal/zzal;

.field private final zzbpd:Lcom/google/android/gms/internal/ads/zztt;

.field private final zzye:Ljava/lang/String;

.field private zzyu:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/ads/internal/zzw;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzss;

    invoke-direct {v0, p1, p3, p4, p5}, Lcom/google/android/gms/internal/ads/zzss;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/ads/internal/zzw;)V

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzub;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzss;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzss;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzkt;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzye:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbom:Lcom/google/android/gms/internal/ads/zzss;

    new-instance p1, Lcom/google/android/gms/internal/ads/zztt;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zztt;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzex()Lcom/google/android/gms/internal/ads/zztw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zztw;->zza(Lcom/google/android/gms/internal/ads/zzss;)V

    return-void
.end method

.method private final abort()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbom:Lcom/google/android/gms/internal/ads/zzss;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzye:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzss;->zzav(Ljava/lang/String;)Lcom/google/android/gms/ads/internal/zzal;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zztt;->zzd(Lcom/google/android/gms/ads/internal/zzal;)V

    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->destroy()V

    :cond_0
    return-void
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getAdUnitId not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzd;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/zzlo;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getVideoController not implemented for interstitials"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final isLoading()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isReady()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final pause()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->pause()V

    :cond_0
    return-void
.end method

.method public final resume()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->resume()V

    :cond_0
    return-void
.end method

.method public final setImmersiveMode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzyu:Z

    return-void
.end method

.method public final setManualImpressionsEnabled(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzub;->abort()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->setManualImpressionsEnabled(Z)V

    :cond_0
    return-void
.end method

.method public final setUserId(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final showInterstitial()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzyu:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zza;->setImmersiveMode(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzd;->showInterstitial()V

    return-void

    :cond_0
    const-string v0, "Interstitial ad must be loaded before showInterstitial()."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    return-void
.end method

.method public final stopLoading()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->stopLoading()V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzaaw;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string p1, "setInAppPurchaseListener is deprecated and should not be called."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzabc;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string p1, "setPlayStorePurchaseParams is deprecated and should not be called."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzahe;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zztt;->zzboh:Lcom/google/android/gms/internal/ads/zzahe;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zztt;->zzd(Lcom/google/android/gms/ads/internal/zzal;)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzjn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/zzjn;)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzke;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zztt;->zzbog:Lcom/google/android/gms/internal/ads/zzke;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zztt;->zzd(Lcom/google/android/gms/ads/internal/zzal;)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzkh;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zztt;->zzxs:Lcom/google/android/gms/internal/ads/zzkh;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zztt;->zzd(Lcom/google/android/gms/ads/internal/zzal;)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzkx;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zztt;->zzbod:Lcom/google/android/gms/internal/ads/zzkx;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zztt;->zzd(Lcom/google/android/gms/ads/internal/zzal;)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzla;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zztt;->zzboe:Lcom/google/android/gms/internal/ads/zzla;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zztt;->zzd(Lcom/google/android/gms/ads/internal/zzal;)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzlg;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzub;->abort()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/zzlg;)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzlu;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unused method"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzmu;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "getVideoController not implemented for interstitials"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzod;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zztt;->zzbof:Lcom/google/android/gms/internal/ads/zzod;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zztt;->zzd(Lcom/google/android/gms/ads/internal/zzal;)V

    :cond_0
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zztw;->zzh(Lcom/google/android/gms/internal/ads/zzjj;)Ljava/util/Set;

    move-result-object v0

    const-string v1, "gw"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzub;->abort()V

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zztw;->zzh(Lcom/google/android/gms/internal/ads/zzjj;)Ljava/util/Set;

    move-result-object v0

    const-string v1, "_skipMediation"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzub;->abort()V

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzjj;->zzaqd:Lcom/google/android/gms/internal/ads/zzmq;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzub;->abort()V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z

    move-result p1

    return p1

    :cond_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzex()Lcom/google/android/gms/internal/ads/zztw;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zztw;->zzh(Lcom/google/android/gms/internal/ads/zzjj;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "_ad"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzye:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zztw;->zzb(Lcom/google/android/gms/internal/ads/zzjj;Ljava/lang/String;)V

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzye:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zztw;->zza(Lcom/google/android/gms/internal/ads/zzjj;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zztz;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-boolean p1, v0, Lcom/google/android/gms/internal/ads/zztz;->zzwa:Z

    if-nez p1, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zztz;->load()Z

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzua;->zzlk()Lcom/google/android/gms/internal/ads/zzua;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzua;->zzlo()V

    goto :goto_0

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzua;->zzlk()Lcom/google/android/gms/internal/ads/zzua;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzua;->zzln()V

    :goto_0
    iget-object p1, v0, Lcom/google/android/gms/internal/ads/zztz;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    iget-object p1, v0, Lcom/google/android/gms/internal/ads/zztz;->zzbot:Lcom/google/android/gms/internal/ads/zzst;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzst;->zza(Lcom/google/android/gms/internal/ads/zztt;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbpd:Lcom/google/android/gms/internal/ads/zztt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zztt;->zzd(Lcom/google/android/gms/ads/internal/zzal;)V

    iget-boolean p1, v0, Lcom/google/android/gms/internal/ads/zztz;->zzbov:Z

    return p1

    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzub;->abort()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzua;->zzlk()Lcom/google/android/gms/internal/ads/zzua;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzua;->zzlo()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z

    move-result p1

    return p1
.end method

.method public final zzba()Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->zzba()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final zzbj()Lcom/google/android/gms/dynamic/IObjectWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->zzbj()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzbk()Lcom/google/android/gms/internal/ads/zzjn;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->zzbk()Lcom/google/android/gms/internal/ads/zzjn;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzbm()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->zzbm()V

    return-void

    :cond_0
    const-string v0, "Interstitial ad must be loaded before pingManualTrackingUrl()."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    return-void
.end method

.method public final zzbw()Lcom/google/android/gms/internal/ads/zzla;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getIAppEventListener not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzbx()Lcom/google/android/gms/internal/ads/zzkh;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getIAdListener not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzck()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzub;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzd;->zzck()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
