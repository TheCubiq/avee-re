.class public final Lcom/daaw/sw3;
.super Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/wv3;

.field public final c:Landroid/content/Context;

.field public final d:Lcom/daaw/qw3;

.field public e:Lcom/google/android/gms/ads/FullScreenContentCallback;

.field public f:Lcom/google/android/gms/ads/rewarded/OnAdMetadataChangedListener;

.field public g:Lcom/google/android/gms/ads/OnPaidEventListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;-><init>()V

    iput-object p2, p0, Lcom/daaw/sw3;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/sw3;->c:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zza()Lcom/google/android/gms/ads/internal/client/zzaw;

    move-result-object v0

    new-instance v1, Lcom/daaw/xm3;

    invoke-direct {v1}, Lcom/daaw/xm3;-><init>()V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/ads/internal/client/zzaw;->zzq(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/an3;)Lcom/daaw/wv3;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    new-instance p1, Lcom/daaw/qw3;

    invoke-direct {p1}, Lcom/daaw/qw3;-><init>()V

    iput-object p1, p0, Lcom/daaw/sw3;->d:Lcom/daaw/qw3;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/internal/client/zzdx;Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/ads/internal/client/zzp;->zza:Lcom/google/android/gms/ads/internal/client/zzp;

    iget-object v2, p0, Lcom/daaw/sw3;->c:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/ads/internal/client/zzp;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzdx;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object p1

    new-instance v1, Lcom/daaw/rw3;

    invoke-direct {v1, p2, p0}, Lcom/daaw/rw3;-><init>(Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;Lcom/daaw/sw3;)V

    invoke-interface {v0, p1, v1}, Lcom/daaw/wv3;->zzg(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/dw3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final getAdMetadata()Landroid/os/Bundle;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/wv3;->zzb()Landroid/os/Bundle;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sw3;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final getFullScreenContentCallback()Lcom/google/android/gms/ads/FullScreenContentCallback;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sw3;->e:Lcom/google/android/gms/ads/FullScreenContentCallback;

    return-object v0
.end method

.method public final getOnAdMetadataChangedListener()Lcom/google/android/gms/ads/rewarded/OnAdMetadataChangedListener;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sw3;->f:Lcom/google/android/gms/ads/rewarded/OnAdMetadataChangedListener;

    return-object v0
.end method

.method public final getOnPaidEventListener()Lcom/google/android/gms/ads/OnPaidEventListener;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sw3;->g:Lcom/google/android/gms/ads/OnPaidEventListener;

    return-object v0
.end method

.method public final getResponseInfo()Lcom/google/android/gms/ads/ResponseInfo;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/daaw/wv3;->zzc()Lcom/google/android/gms/ads/internal/client/zzdn;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/ads/ResponseInfo;->zzb(Lcom/google/android/gms/ads/internal/client/zzdn;)Lcom/google/android/gms/ads/ResponseInfo;

    move-result-object v0

    return-object v0
.end method

.method public final getRewardItem()Lcom/google/android/gms/ads/rewarded/RewardItem;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/wv3;->zzd()Lcom/daaw/tv3;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lcom/daaw/gw3;

    invoke-direct {v1, v0}, Lcom/daaw/gw3;-><init>(Lcom/daaw/tv3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    sget-object v0, Lcom/google/android/gms/ads/rewarded/RewardItem;->DEFAULT_REWARD:Lcom/google/android/gms/ads/rewarded/RewardItem;

    return-object v0
.end method

.method public final setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/sw3;->e:Lcom/google/android/gms/ads/FullScreenContentCallback;

    iget-object v0, p0, Lcom/daaw/sw3;->d:Lcom/daaw/qw3;

    invoke-virtual {v0, p1}, Lcom/daaw/qw3;->g3(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/daaw/wv3;->zzh(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setOnAdMetadataChangedListener(Lcom/google/android/gms/ads/rewarded/OnAdMetadataChangedListener;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/sw3;->f:Lcom/google/android/gms/ads/rewarded/OnAdMetadataChangedListener;

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/zzfd;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/zzfd;-><init>(Lcom/google/android/gms/ads/rewarded/OnAdMetadataChangedListener;)V

    invoke-interface {v0, v1}, Lcom/daaw/wv3;->zzi(Lcom/google/android/gms/ads/internal/client/zzdd;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setOnPaidEventListener(Lcom/google/android/gms/ads/OnPaidEventListener;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/sw3;->g:Lcom/google/android/gms/ads/OnPaidEventListener;

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/zzfe;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/zzfe;-><init>(Lcom/google/android/gms/ads/OnPaidEventListener;)V

    invoke-interface {v0, v1}, Lcom/daaw/wv3;->zzj(Lcom/google/android/gms/ads/internal/client/zzdg;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setServerSideVerificationOptions(Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcdy;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzcdy;-><init>(Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions;)V

    invoke-interface {v0, v1}, Lcom/daaw/wv3;->zzl(Lcom/google/android/gms/internal/ads/zzcdy;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final show(Landroid/app/Activity;Lcom/google/android/gms/ads/OnUserEarnedRewardListener;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/sw3;->d:Lcom/daaw/qw3;

    invoke-virtual {v0, p2}, Lcom/daaw/qw3;->h3(Lcom/google/android/gms/ads/OnUserEarnedRewardListener;)V

    :try_start_0
    iget-object p2, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/daaw/sw3;->d:Lcom/daaw/qw3;

    invoke-interface {p2, v0}, Lcom/daaw/wv3;->zzk(Lcom/daaw/zv3;)V

    iget-object p2, p0, Lcom/daaw/sw3;->b:Lcom/daaw/wv3;

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/daaw/wv3;->zzm(Lcom/daaw/yd0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
