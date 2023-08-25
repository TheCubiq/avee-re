.class public final Lcom/daaw/x23;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/google/android/gms/ads/internal/client/zzbu;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/google/android/gms/ads/internal/client/zzdx;

.field public final e:I
    .annotation build Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdOrientation;
    .end annotation
.end field

.field public final f:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

.field public final g:Lcom/daaw/xm3;

.field public final h:Lcom/google/android/gms/ads/internal/client/zzp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzdx;ILcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;)V
    .locals 1
    .param p4    # I
        .annotation build Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdOrientation;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/xm3;

    invoke-direct {v0}, Lcom/daaw/xm3;-><init>()V

    iput-object v0, p0, Lcom/daaw/x23;->g:Lcom/daaw/xm3;

    iput-object p1, p0, Lcom/daaw/x23;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/x23;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/x23;->d:Lcom/google/android/gms/ads/internal/client/zzdx;

    iput p4, p0, Lcom/daaw/x23;->e:I

    iput-object p5, p0, Lcom/daaw/x23;->f:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    sget-object p1, Lcom/google/android/gms/ads/internal/client/zzp;->zza:Lcom/google/android/gms/ads/internal/client/zzp;

    iput-object p1, p0, Lcom/daaw/x23;->h:Lcom/google/android/gms/ads/internal/client/zzp;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzq;->zzb()Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zza()Lcom/google/android/gms/ads/internal/client/zzaw;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/x23;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/x23;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/x23;->g:Lcom/daaw/xm3;

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/google/android/gms/ads/internal/client/zzaw;->zzd(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/an3;)Lcom/google/android/gms/ads/internal/client/zzbu;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/x23;->a:Lcom/google/android/gms/ads/internal/client/zzbu;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/x23;->e:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzw;

    iget v1, p0, Lcom/daaw/x23;->e:I

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzw;-><init>(I)V

    iget-object v1, p0, Lcom/daaw/x23;->a:Lcom/google/android/gms/ads/internal/client/zzbu;

    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/zzbu;->zzI(Lcom/google/android/gms/ads/internal/client/zzw;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/x23;->a:Lcom/google/android/gms/ads/internal/client/zzbu;

    new-instance v1, Lcom/daaw/k23;

    iget-object v2, p0, Lcom/daaw/x23;->f:Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;

    iget-object v3, p0, Lcom/daaw/x23;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/daaw/k23;-><init>(Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzbu;->zzH(Lcom/daaw/s23;)V

    iget-object v0, p0, Lcom/daaw/x23;->a:Lcom/google/android/gms/ads/internal/client/zzbu;

    iget-object v1, p0, Lcom/daaw/x23;->h:Lcom/google/android/gms/ads/internal/client/zzp;

    iget-object v2, p0, Lcom/daaw/x23;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/x23;->d:Lcom/google/android/gms/ads/internal/client/zzdx;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/ads/internal/client/zzp;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzdx;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzbu;->zzaa(Lcom/google/android/gms/ads/internal/client/zzl;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
