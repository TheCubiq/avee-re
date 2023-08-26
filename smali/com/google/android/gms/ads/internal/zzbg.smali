.class final Lcom/google/android/gms/ads/internal/zzbg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

.field private final synthetic zzwv:Lcom/google/android/gms/internal/ads/zzoo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/zzoo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbg;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzbg;->zzwv:Lcom/google/android/gms/internal/ads/zzoo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbg;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzade:Lcom/google/android/gms/internal/ads/zzqw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbg;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzade:Lcom/google/android/gms/internal/ads/zzqw;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbg;->zzwv:Lcom/google/android/gms/internal/ads/zzoo;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzqw;->zza(Lcom/google/android/gms/internal/ads/zzqk;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbg;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbg;->zzwv:Lcom/google/android/gms/internal/ads/zzoo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzoo;->zzka()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzbc;->zzb(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
