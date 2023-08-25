.class public final Lcom/daaw/ez4;
.super Lcom/daaw/kw4;
.source ""

# interfaces
.implements Lcom/daaw/oh3;


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/kw4;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final h0(Lcom/google/android/gms/internal/ads/zzcdd;)V
    .locals 1

    new-instance v0, Lcom/daaw/bz4;

    invoke-direct {v0, p1}, Lcom/daaw/bz4;-><init>(Lcom/google/android/gms/internal/ads/zzcdd;)V

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    return-void
.end method

.method public final zzb()V
    .locals 1

    sget-object v0, Lcom/daaw/dz4;->a:Lcom/daaw/dz4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    return-void
.end method

.method public final declared-synchronized zzc()V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/cz4;->a:Lcom/daaw/cz4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
