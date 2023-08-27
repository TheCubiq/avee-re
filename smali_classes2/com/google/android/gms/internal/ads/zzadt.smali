.class final Lcom/google/android/gms/internal/ads/zzadt;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzccn:Lcom/google/android/gms/internal/ads/zzadk;

.field private final synthetic zzcco:Lcom/google/android/gms/internal/ads/zzaol;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzadk;Lcom/google/android/gms/internal/ads/zzaol;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzccn:Lcom/google/android/gms/internal/ads/zzadk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzcco:Lcom/google/android/gms/internal/ads/zzaol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzccn:Lcom/google/android/gms/internal/ads/zzadk;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzadk;->zza(Lcom/google/android/gms/internal/ads/zzadk;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzccn:Lcom/google/android/gms/internal/ads/zzadk;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzccn:Lcom/google/android/gms/internal/ads/zzadk;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzccn:Lcom/google/android/gms/internal/ads/zzadk;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzadk;->zzb(Lcom/google/android/gms/internal/ads/zzadk;)Lcom/google/android/gms/internal/ads/zzaeg;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaeg;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzcco:Lcom/google/android/gms/internal/ads/zzaol;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzadk;->zza(Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zzaol;)Lcom/google/android/gms/internal/ads/zzalc;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzadk;->zzccj:Lcom/google/android/gms/internal/ads/zzalc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzccn:Lcom/google/android/gms/internal/ads/zzadk;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzadk;->zzccj:Lcom/google/android/gms/internal/ads/zzalc;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzccn:Lcom/google/android/gms/internal/ads/zzadk;

    const/4 v2, 0x0

    const-string v3, "Could not start the ad request service."

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzadk;->zza(Lcom/google/android/gms/internal/ads/zzadk;ILjava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzadt;->zzccn:Lcom/google/android/gms/internal/ads/zzadk;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzadk;->zzc(Lcom/google/android/gms/internal/ads/zzadk;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
