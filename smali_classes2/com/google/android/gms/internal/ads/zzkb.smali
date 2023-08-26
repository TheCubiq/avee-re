.class public final Lcom/google/android/gms/internal/ads/zzkb;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# static fields
.field private static final sLock:Ljava/lang/Object;

.field private static zzarz:Lcom/google/android/gms/internal/ads/zzkb;


# instance fields
.field private final zzasa:Lcom/google/android/gms/internal/ads/zzamu;

.field private final zzasb:Lcom/google/android/gms/internal/ads/zzjr;

.field private final zzasc:Ljava/lang/String;

.field private final zzasd:Lcom/google/android/gms/internal/ads/zzng;

.field private final zzase:Lcom/google/android/gms/internal/ads/zznh;

.field private final zzasf:Lcom/google/android/gms/internal/ads/zzni;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzkb;->sLock:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzkb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzkb;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzkb;->sLock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sput-object v0, Lcom/google/android/gms/internal/ads/zzkb;->zzarz:Lcom/google/android/gms/internal/ads/zzkb;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzamu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzamu;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzkb;->zzasa:Lcom/google/android/gms/internal/ads/zzamu;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzjr;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzjh;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzjh;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/ads/zzjg;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzjg;-><init>()V

    new-instance v4, Lcom/google/android/gms/internal/ads/zzme;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzme;-><init>()V

    new-instance v5, Lcom/google/android/gms/internal/ads/zzrv;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzrv;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzahi;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzahi;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/zzaao;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzaao;-><init>()V

    new-instance v8, Lcom/google/android/gms/internal/ads/zzrw;

    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzrw;-><init>()V

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzjr;-><init>(Lcom/google/android/gms/internal/ads/zzjh;Lcom/google/android/gms/internal/ads/zzjg;Lcom/google/android/gms/internal/ads/zzme;Lcom/google/android/gms/internal/ads/zzrv;Lcom/google/android/gms/internal/ads/zzahi;Lcom/google/android/gms/internal/ads/zzaao;Lcom/google/android/gms/internal/ads/zzrw;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzkb;->zzasb:Lcom/google/android/gms/internal/ads/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzamu;->zzsi()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzkb;->zzasc:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzng;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzng;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzkb;->zzasd:Lcom/google/android/gms/internal/ads/zzng;

    new-instance v0, Lcom/google/android/gms/internal/ads/zznh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zznh;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzkb;->zzase:Lcom/google/android/gms/internal/ads/zznh;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzni;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzni;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzkb;->zzasf:Lcom/google/android/gms/internal/ads/zzni;

    return-void
.end method

.method private static zzie()Lcom/google/android/gms/internal/ads/zzkb;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzkb;->sLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzkb;->zzarz:Lcom/google/android/gms/internal/ads/zzkb;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static zzif()Lcom/google/android/gms/internal/ads/zzamu;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzie()Lcom/google/android/gms/internal/ads/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzkb;->zzasa:Lcom/google/android/gms/internal/ads/zzamu;

    return-object v0
.end method

.method public static zzig()Lcom/google/android/gms/internal/ads/zzjr;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzie()Lcom/google/android/gms/internal/ads/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzkb;->zzasb:Lcom/google/android/gms/internal/ads/zzjr;

    return-object v0
.end method

.method public static zzih()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzie()Lcom/google/android/gms/internal/ads/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzkb;->zzasc:Ljava/lang/String;

    return-object v0
.end method

.method public static zzii()Lcom/google/android/gms/internal/ads/zznh;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzie()Lcom/google/android/gms/internal/ads/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzkb;->zzase:Lcom/google/android/gms/internal/ads/zznh;

    return-object v0
.end method

.method public static zzij()Lcom/google/android/gms/internal/ads/zzng;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzie()Lcom/google/android/gms/internal/ads/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzkb;->zzasd:Lcom/google/android/gms/internal/ads/zzng;

    return-object v0
.end method

.method public static zzik()Lcom/google/android/gms/internal/ads/zzni;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzie()Lcom/google/android/gms/internal/ads/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzkb;->zzasf:Lcom/google/android/gms/internal/ads/zzni;

    return-object v0
.end method
