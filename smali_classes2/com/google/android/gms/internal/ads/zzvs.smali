.class public final Lcom/google/android/gms/internal/ads/zzvs;
.super Lcom/google/android/gms/internal/ads/zzaop;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzaop<",
        "Lcom/google/android/gms/internal/ads/zzwb;",
        ">;"
    }
.end annotation


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private final zzbqq:Lcom/google/android/gms/internal/ads/zzvw;

.field private zzbqr:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzvw;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaop;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvs;->mLock:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvs;->zzbqq:Lcom/google/android/gms/internal/ads/zzvw;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzvs;)Lcom/google/android/gms/internal/ads/zzvw;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzvs;->zzbqq:Lcom/google/android/gms/internal/ads/zzvw;

    return-object p0
.end method


# virtual methods
.method public final release()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvs;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzvs;->zzbqr:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzvs;->zzbqr:Z

    new-instance v1, Lcom/google/android/gms/internal/ads/zzvt;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzvt;-><init>(Lcom/google/android/gms/internal/ads/zzvs;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzaon;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzaon;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaop;->zza(Lcom/google/android/gms/internal/ads/zzaoo;Lcom/google/android/gms/internal/ads/zzaom;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzvu;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzvu;-><init>(Lcom/google/android/gms/internal/ads/zzvs;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzvv;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/zzvv;-><init>(Lcom/google/android/gms/internal/ads/zzvs;)V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaop;->zza(Lcom/google/android/gms/internal/ads/zzaoo;Lcom/google/android/gms/internal/ads/zzaom;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
