.class final Lcom/google/android/gms/internal/ads/zzafp;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzchk:Lcom/google/android/gms/internal/ads/zzaef;

.field private final synthetic zzchl:Lcom/google/android/gms/internal/ads/zzaeq;

.field private final synthetic zzchm:Lcom/google/android/gms/internal/ads/zzafn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzafn;Lcom/google/android/gms/internal/ads/zzaef;Lcom/google/android/gms/internal/ads/zzaeq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafp;->zzchm:Lcom/google/android/gms/internal/ads/zzafn;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzafp;->zzchk:Lcom/google/android/gms/internal/ads/zzaef;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzafp;->zzchl:Lcom/google/android/gms/internal/ads/zzaeq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafp;->zzchm:Lcom/google/android/gms/internal/ads/zzafn;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzafp;->zzchk:Lcom/google/android/gms/internal/ads/zzaef;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzafn;->zzb(Lcom/google/android/gms/internal/ads/zzaef;)Lcom/google/android/gms/internal/ads/zzaej;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v1

    const-string v2, "AdRequestServiceImpl.loadAdAsync"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzajm;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    const-string v1, "Could not fetch ad response due to an Exception."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaej;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzaej;-><init>(I)V

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzafp;->zzchl:Lcom/google/android/gms/internal/ads/zzaeq;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzaeq;->zza(Lcom/google/android/gms/internal/ads/zzaej;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    const-string v1, "Fail to forward ad response."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
