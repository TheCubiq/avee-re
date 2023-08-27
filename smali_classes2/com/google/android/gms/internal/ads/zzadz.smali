.class public abstract Lcom/google/android/gms/internal/ads/zzadz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzadx;
.implements Lcom/google/android/gms/internal/ads/zzalc;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzadx;",
        "Lcom/google/android/gms/internal/ads/zzalc<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private final zzccp:Lcom/google/android/gms/internal/ads/zzaol;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzaol<",
            "Lcom/google/android/gms/internal/ads/zzaef;",
            ">;"
        }
    .end annotation
.end field

.field private final zzccq:Lcom/google/android/gms/internal/ads/zzadx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaol;Lcom/google/android/gms/internal/ads/zzadx;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzaol<",
            "Lcom/google/android/gms/internal/ads/zzaef;",
            ">;",
            "Lcom/google/android/gms/internal/ads/zzadx;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzadz;->mLock:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzadz;->zzccp:Lcom/google/android/gms/internal/ads/zzaol;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzadz;->zzccq:Lcom/google/android/gms/internal/ads/zzadx;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzadz;->zznz()V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzaej;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadz;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzadz;->zzccq:Lcom/google/android/gms/internal/ads/zzadx;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzadx;->zza(Lcom/google/android/gms/internal/ads/zzaej;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzadz;->zznz()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method final zza(Lcom/google/android/gms/internal/ads/zzaen;Lcom/google/android/gms/internal/ads/zzaef;)Z
    .locals 1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaei;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzaei;-><init>(Lcom/google/android/gms/internal/ads/zzadx;)V

    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzaen;->zza(Lcom/google/android/gms/internal/ads/zzaef;Lcom/google/android/gms/internal/ads/zzaeq;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    const-string p2, "Could not fetch ad response from ad request service due to an Exception."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object p2

    const-string v0, "AdRequestClientTask.getAdResponseFromService"

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzajm;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzadz;->zzccq:Lcom/google/android/gms/internal/ads/zzadx;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzaej;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzaej;-><init>(I)V

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzadx;->zza(Lcom/google/android/gms/internal/ads/zzaej;)V

    return v0
.end method

.method public final synthetic zznt()Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzadz;->zzoa()Lcom/google/android/gms/internal/ads/zzaen;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadz;->zzccq:Lcom/google/android/gms/internal/ads/zzadx;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzaej;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzaej;-><init>(I)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzadx;->zza(Lcom/google/android/gms/internal/ads/zzaej;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzadz;->zznz()V

    return-object v1

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzadz;->zzccp:Lcom/google/android/gms/internal/ads/zzaol;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzaea;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/zzaea;-><init>(Lcom/google/android/gms/internal/ads/zzadz;Lcom/google/android/gms/internal/ads/zzaen;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaeb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzaeb;-><init>(Lcom/google/android/gms/internal/ads/zzadz;)V

    invoke-interface {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzaol;->zza(Lcom/google/android/gms/internal/ads/zzaoo;Lcom/google/android/gms/internal/ads/zzaom;)V

    return-object v1
.end method

.method public abstract zznz()V
.end method

.method public abstract zzoa()Lcom/google/android/gms/internal/ads/zzaen;
.end method
