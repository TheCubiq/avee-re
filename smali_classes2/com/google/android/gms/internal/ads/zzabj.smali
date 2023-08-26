.class final Lcom/google/android/gms/internal/ads/zzabj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaam:Lcom/google/android/gms/internal/ads/zzajh;

.field private final synthetic zzbzk:Lcom/google/android/gms/internal/ads/zzabh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzabh;Lcom/google/android/gms/internal/ads/zzajh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabj;->zzbzk:Lcom/google/android/gms/internal/ads/zzabh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabj;->zzaam:Lcom/google/android/gms/internal/ads/zzajh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabj;->zzbzk:Lcom/google/android/gms/internal/ads/zzabh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzabh;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzabj;->zzbzk:Lcom/google/android/gms/internal/ads/zzabh;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzabj;->zzaam:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzabh;->zzbzd:Lcom/google/android/gms/internal/ads/zzabm;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzabm;->zzb(Lcom/google/android/gms/internal/ads/zzajh;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
