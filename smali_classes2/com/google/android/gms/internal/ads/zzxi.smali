.class final Lcom/google/android/gms/internal/ads/zzxi;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/internal/ads/zzxe;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzbuj:Lcom/google/android/gms/internal/ads/zzxb;

.field private final synthetic zzbuk:Lcom/google/android/gms/internal/ads/zzxh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzxh;Lcom/google/android/gms/internal/ads/zzxb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxi;->zzbuk:Lcom/google/android/gms/internal/ads/zzxh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzxi;->zzbuj:Lcom/google/android/gms/internal/ads/zzxb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final zzmn()Lcom/google/android/gms/internal/ads/zzxe;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxi;->zzbuk:Lcom/google/android/gms/internal/ads/zzxh;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzxh;->zza(Lcom/google/android/gms/internal/ads/zzxh;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzxi;->zzbuk:Lcom/google/android/gms/internal/ads/zzxh;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzxh;->zzb(Lcom/google/android/gms/internal/ads/zzxh;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    monitor-exit v0

    return-object v1

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxi;->zzbuj:Lcom/google/android/gms/internal/ads/zzxb;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzxi;->zzbuk:Lcom/google/android/gms/internal/ads/zzxh;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzxh;->zzc(Lcom/google/android/gms/internal/ads/zzxh;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzxi;->zzbuk:Lcom/google/android/gms/internal/ads/zzxh;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzxh;->zzd(Lcom/google/android/gms/internal/ads/zzxh;)J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzxb;->zza(JJ)Lcom/google/android/gms/internal/ads/zzxe;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzxi;->zzmn()Lcom/google/android/gms/internal/ads/zzxe;

    move-result-object v0

    return-object v0
.end method
