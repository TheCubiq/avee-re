.class final Lcom/google/android/gms/measurement/internal/zziz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@17.5.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic zzb:Lcom/google/android/gms/measurement/internal/zzn;

.field private final synthetic zzc:Z

.field private final synthetic zzd:Lcom/google/android/gms/measurement/internal/zziv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zziv;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzn;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zziz;->zzd:Lcom/google/android/gms/measurement/internal/zziv;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zziz;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zziz;->zzb:Lcom/google/android/gms/measurement/internal/zzn;

    iput-boolean p4, p0, Lcom/google/android/gms/measurement/internal/zziz;->zzc:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zziz;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zziz;->zzd:Lcom/google/android/gms/measurement/internal/zziv;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zziv;->zzd(Lcom/google/android/gms/measurement/internal/zziv;)Lcom/google/android/gms/measurement/internal/zzep;

    move-result-object v1

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zziz;->zzd:Lcom/google/android/gms/measurement/internal/zziv;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgu;->zzq()Lcom/google/android/gms/measurement/internal/zzex;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzex;->zze()Lcom/google/android/gms/measurement/internal/zzez;

    move-result-object v1

    const-string v2, "Failed to get all user properties; not connected to service"

    .line 7
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzez;->zza(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zziz;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    .line 10
    :cond_0
    :try_start_2
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zziz;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zziz;->zzb:Lcom/google/android/gms/measurement/internal/zzn;

    iget-boolean v4, p0, Lcom/google/android/gms/measurement/internal/zziz;->zzc:Z

    invoke-interface {v1, v3, v4}, Lcom/google/android/gms/measurement/internal/zzep;->zza(Lcom/google/android/gms/measurement/internal/zzn;Z)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 11
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zziz;->zzd:Lcom/google/android/gms/measurement/internal/zziv;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zziv;->zze(Lcom/google/android/gms/measurement/internal/zziv;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 12
    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zziz;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 15
    :try_start_4
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zziz;->zzd:Lcom/google/android/gms/measurement/internal/zziv;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgu;->zzq()Lcom/google/android/gms/measurement/internal/zzex;

    move-result-object v2

    .line 16
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzex;->zze()Lcom/google/android/gms/measurement/internal/zzez;

    move-result-object v2

    const-string v3, "Failed to get all user properties; remote exception"

    .line 17
    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/zzez;->zza(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 18
    :try_start_5
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zziz;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 22
    :goto_0
    monitor-exit v0

    return-void

    .line 20
    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zziz;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 21
    throw v1

    :catchall_1
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method
