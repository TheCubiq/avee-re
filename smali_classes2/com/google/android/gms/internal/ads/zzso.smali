.class final Lcom/google/android/gms/internal/ads/zzso;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/BaseGmsClient$BaseConnectionCallbacks;


# instance fields
.field final synthetic zzbnn:Lcom/google/android/gms/internal/ads/zzsm;

.field private final synthetic zzbno:Lcom/google/android/gms/internal/ads/zzaoj;

.field private final synthetic zzbnp:Lcom/google/android/gms/internal/ads/zzsg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzsm;Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzsg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbnn:Lcom/google/android/gms/internal/ads/zzsm;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbno:Lcom/google/android/gms/internal/ads/zzaoj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbnp:Lcom/google/android/gms/internal/ads/zzsg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnected(Landroid/os/Bundle;)V
    .locals 4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbnn:Lcom/google/android/gms/internal/ads/zzsm;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzsm;->zzb(Lcom/google/android/gms/internal/ads/zzsm;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbnn:Lcom/google/android/gms/internal/ads/zzsm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzsm;->zzc(Lcom/google/android/gms/internal/ads/zzsm;)Z

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbnn:Lcom/google/android/gms/internal/ads/zzsm;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzsm;->zza(Lcom/google/android/gms/internal/ads/zzsm;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbnn:Lcom/google/android/gms/internal/ads/zzsm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzsm;->zzd(Lcom/google/android/gms/internal/ads/zzsm;)Lcom/google/android/gms/internal/ads/zzsf;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-exit p1

    return-void

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzsp;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbno:Lcom/google/android/gms/internal/ads/zzaoj;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbnp:Lcom/google/android/gms/internal/ads/zzsg;

    invoke-direct {v1, p0, v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzsp;-><init>(Lcom/google/android/gms/internal/ads/zzso;Lcom/google/android/gms/internal/ads/zzsf;Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzsg;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzaki;->zzb(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbno:Lcom/google/android/gms/internal/ads/zzaoj;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzsq;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzso;->zzbno:Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzsq;-><init>(Lcom/google/android/gms/internal/ads/zzaoj;Ljava/util/concurrent/Future;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvz:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzaoj;->zza(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
