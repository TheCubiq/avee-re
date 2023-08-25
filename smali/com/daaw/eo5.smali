.class public final Lcom/daaw/eo5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yx4;


# instance fields
.field public p:Z

.field public q:Z

.field public final r:Ljava/lang/String;

.field public final s:Lcom/daaw/on6;

.field public final t:Lcom/google/android/gms/ads/internal/util/zzg;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/on6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/eo5;->p:Z

    iput-boolean v0, p0, Lcom/daaw/eo5;->q:Z

    iput-object p1, p0, Lcom/daaw/eo5;->r:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/eo5;->s:Lcom/daaw/on6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/eo5;->t:Lcom/google/android/gms/ads/internal/util/zzg;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/daaw/nn6;
    .locals 4

    iget-object v0, p0, Lcom/daaw/eo5;->t:Lcom/google/android/gms/ads/internal/util/zzg;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/eo5;->r:Ljava/lang/String;

    :goto_0
    invoke-static {p1}, Lcom/daaw/nn6;->b(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->b()J

    move-result-wide v1

    const/16 v3, 0xa

    invoke-static {v1, v2, v3}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v1

    const-string v2, "tms"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    const-string v1, "tid"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/eo5;->s:Lcom/daaw/on6;

    const-string v1, "adapter_init_finished"

    invoke-virtual {p0, v1}, Lcom/daaw/eo5;->a(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v1

    const-string v2, "ancn"

    invoke-virtual {v1, v2, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    const-string p1, "rqe"

    invoke-virtual {v1, p1, p2}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-interface {v0, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/eo5;->s:Lcom/daaw/on6;

    const-string v1, "adapter_init_finished"

    invoke-virtual {p0, v1}, Lcom/daaw/eo5;->a(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v1

    const-string v2, "ancn"

    invoke-virtual {v1, v2, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-interface {v0, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/eo5;->s:Lcom/daaw/on6;

    const-string v1, "adapter_init_started"

    invoke-virtual {p0, v1}, Lcom/daaw/eo5;->a(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v1

    const-string v2, "ancn"

    invoke-virtual {v1, v2, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-interface {v0, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/eo5;->s:Lcom/daaw/on6;

    const-string v0, "aaia"

    invoke-virtual {p0, v0}, Lcom/daaw/eo5;->a(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v0

    const-string v1, "aair"

    const-string v2, "MalformedJson"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-interface {p1, v0}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final declared-synchronized zze()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/eo5;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/eo5;->s:Lcom/daaw/on6;

    const-string v1, "init_finished"

    invoke-virtual {p0, v1}, Lcom/daaw/eo5;->a(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/eo5;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzf()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/eo5;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/eo5;->s:Lcom/daaw/on6;

    const-string v1, "init_started"

    invoke-virtual {p0, v1}, Lcom/daaw/eo5;->a(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/eo5;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
