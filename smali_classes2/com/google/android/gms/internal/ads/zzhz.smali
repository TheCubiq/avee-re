.class public final Lcom/google/android/gms/internal/ads/zzhz;
.super Ljava/lang/Object;


# instance fields
.field private final zzalp:[B

.field private zzalq:I

.field private zzalr:I

.field private final synthetic zzals:Lcom/google/android/gms/internal/ads/zzhx;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzhx;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzals:Lcom/google/android/gms/internal/ads/zzhx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzalp:[B

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzhx;[BLcom/google/android/gms/internal/ads/zzhy;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhz;-><init>(Lcom/google/android/gms/internal/ads/zzhx;[B)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized zzbd()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzals:Lcom/google/android/gms/internal/ads/zzhx;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhx;->zzalo:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzals:Lcom/google/android/gms/internal/ads/zzhx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhx;->zzaln:Lcom/google/android/gms/internal/ads/zzen;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzalp:[B

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzen;->zzc([B)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzals:Lcom/google/android/gms/internal/ads/zzhx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhx;->zzaln:Lcom/google/android/gms/internal/ads/zzen;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzalq:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzen;->zzg(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzals:Lcom/google/android/gms/internal/ads/zzhx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhx;->zzaln:Lcom/google/android/gms/internal/ads/zzen;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzalr:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzen;->zzh(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzals:Lcom/google/android/gms/internal/ads/zzhx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhx;->zzaln:Lcom/google/android/gms/internal/ads/zzen;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzen;->zza([I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzals:Lcom/google/android/gms/internal/ads/zzhx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhx;->zzaln:Lcom/google/android/gms/internal/ads/zzen;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzen;->zzbd()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Clearcut log failed"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzane;->zza(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final zzr(I)Lcom/google/android/gms/internal/ads/zzhz;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzalq:I

    return-object p0
.end method

.method public final zzs(I)Lcom/google/android/gms/internal/ads/zzhz;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhz;->zzalr:I

    return-object p0
.end method
