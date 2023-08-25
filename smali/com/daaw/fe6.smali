.class public final Lcom/daaw/fe6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cf6;


# instance fields
.field public final a:Lcom/daaw/cf6;

.field public final b:Lcom/daaw/cf6;

.field public final c:Lcom/daaw/dl6;

.field public final d:Ljava/lang/String;

.field public e:Lcom/daaw/rp4;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/daaw/cf6;Lcom/daaw/cf6;Lcom/daaw/dl6;Ljava/lang/String;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fe6;->a:Lcom/daaw/cf6;

    iput-object p2, p0, Lcom/daaw/fe6;->b:Lcom/daaw/cf6;

    iput-object p3, p0, Lcom/daaw/fe6;->c:Lcom/daaw/dl6;

    iput-object p4, p0, Lcom/daaw/fe6;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/fe6;->f:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/df6;Lcom/daaw/ye6;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/fe6;->e(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized b()Lcom/daaw/rp4;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/fe6;->e:Lcom/daaw/rp4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final synthetic c(Lcom/daaw/df6;Lcom/daaw/ee6;Lcom/daaw/ye6;Lcom/daaw/rp4;Lcom/daaw/ke6;)Lcom/daaw/f77;
    .locals 9

    if-eqz p5, :cond_2

    iget-object v7, p5, Lcom/daaw/ke6;->a:Lcom/daaw/rk6;

    new-instance v8, Lcom/daaw/ee6;

    iget-object v1, p2, Lcom/daaw/ee6;->a:Lcom/daaw/ye6;

    iget-object v2, p2, Lcom/daaw/ee6;->b:Lcom/daaw/df6;

    iget-object v3, p2, Lcom/daaw/ee6;->c:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v4, p2, Lcom/daaw/ee6;->d:Ljava/lang/String;

    iget-object v5, p2, Lcom/daaw/ee6;->e:Ljava/util/concurrent/Executor;

    iget-object v6, p2, Lcom/daaw/ee6;->f:Lcom/google/android/gms/ads/internal/client/zzw;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/daaw/ee6;-><init>(Lcom/daaw/ye6;Lcom/daaw/df6;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/google/android/gms/ads/internal/client/zzw;Lcom/daaw/rk6;)V

    iget-object p2, p5, Lcom/daaw/ke6;->c:Lcom/daaw/qk6;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iput-object v0, p0, Lcom/daaw/fe6;->e:Lcom/daaw/rp4;

    iget-object p2, p0, Lcom/daaw/fe6;->c:Lcom/daaw/dl6;

    invoke-virtual {p2, v8}, Lcom/daaw/dl6;->e(Lcom/daaw/cl6;)V

    iget-object p2, p5, Lcom/daaw/ke6;->c:Lcom/daaw/qk6;

    invoke-virtual {p0, p2, p1}, Lcom/daaw/fe6;->f(Lcom/daaw/qk6;Lcom/daaw/df6;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/fe6;->c:Lcom/daaw/dl6;

    invoke-virtual {p2, v8}, Lcom/daaw/dl6;->a(Lcom/daaw/cl6;)Lcom/daaw/f77;

    move-result-object p2

    if-eqz p2, :cond_1

    iput-object v0, p0, Lcom/daaw/fe6;->e:Lcom/daaw/rp4;

    new-instance p1, Lcom/daaw/be6;

    invoke-direct {p1, p0}, Lcom/daaw/be6;-><init>(Lcom/daaw/fe6;)V

    iget-object p3, p0, Lcom/daaw/fe6;->f:Ljava/util/concurrent/Executor;

    invoke-static {p2, p1, p3}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p2, p0, Lcom/daaw/fe6;->c:Lcom/daaw/dl6;

    invoke-virtual {p2, v8}, Lcom/daaw/dl6;->e(Lcom/daaw/cl6;)V

    new-instance p2, Lcom/daaw/df6;

    iget-object p1, p1, Lcom/daaw/df6;->b:Lcom/daaw/xe6;

    iget-object p5, p5, Lcom/daaw/ke6;->b:Lcom/google/android/gms/internal/ads/zzccb;

    invoke-direct {p2, p1, p5}, Lcom/daaw/df6;-><init>(Lcom/daaw/xe6;Lcom/google/android/gms/internal/ads/zzccb;)V

    move-object p1, p2

    :cond_2
    iget-object p2, p0, Lcom/daaw/fe6;->a:Lcom/daaw/cf6;

    check-cast p2, Lcom/daaw/pe6;

    invoke-virtual {p2, p1, p3, p4}, Lcom/daaw/pe6;->c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;

    move-result-object p1

    iput-object p4, p0, Lcom/daaw/fe6;->e:Lcom/daaw/rp4;

    return-object p1
.end method

.method public final synthetic d(Lcom/daaw/al6;)Lcom/daaw/f77;
    .locals 4

    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/daaw/al6;->a:Lcom/daaw/qk6;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/daaw/al6;->b:Lcom/daaw/cl6;

    if-eqz v0, :cond_0

    check-cast v0, Lcom/daaw/ee6;

    invoke-static {}, Lcom/daaw/v43;->L()Lcom/daaw/p43;

    move-result-object v1

    invoke-static {}, Lcom/daaw/o43;->L()Lcom/daaw/n43;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/daaw/n43;->v(I)Lcom/daaw/n43;

    invoke-static {}, Lcom/daaw/s43;->N()Lcom/daaw/s43;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/n43;->t(Lcom/daaw/s43;)Lcom/daaw/n43;

    invoke-virtual {v1, v2}, Lcom/daaw/p43;->s(Lcom/daaw/n43;)Lcom/daaw/p43;

    invoke-virtual {v1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v1

    check-cast v1, Lcom/daaw/v43;

    iget-object v2, p1, Lcom/daaw/al6;->a:Lcom/daaw/qk6;

    iget-object v2, v2, Lcom/daaw/qk6;->a:Lcom/daaw/rp4;

    invoke-interface {v2}, Lcom/daaw/rp4;->zzb()Lcom/daaw/jn4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/jn4;->c()Lcom/daaw/fw4;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/fw4;->l0(Lcom/daaw/v43;)V

    iget-object p1, p1, Lcom/daaw/al6;->a:Lcom/daaw/qk6;

    iget-object v0, v0, Lcom/daaw/ee6;->b:Lcom/daaw/df6;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/fe6;->f(Lcom/daaw/qk6;Lcom/daaw/df6;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/daaw/gi5;

    const/4 v0, 0x1

    const-string v1, "Empty prefetch"

    invoke-direct {p1, v0, v1}, Lcom/daaw/gi5;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized e(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    monitor-enter p0

    :try_start_0
    iget-object v1, v0, Lcom/daaw/df6;->b:Lcom/daaw/xe6;

    invoke-interface {v5, v1}, Lcom/daaw/ye6;->a(Lcom/daaw/xe6;)Lcom/daaw/qp4;

    move-result-object v1

    new-instance v2, Lcom/daaw/ge6;

    iget-object v3, v7, Lcom/daaw/fe6;->d:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/daaw/ge6;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/daaw/qp4;->f(Lcom/daaw/ge6;)Lcom/daaw/qp4;

    invoke-interface {v1}, Lcom/daaw/qp4;->zzh()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/daaw/rp4;

    invoke-interface {v6}, Lcom/daaw/rp4;->zzg()Lcom/daaw/ri6;

    invoke-interface {v6}, Lcom/daaw/rp4;->zzg()Lcom/daaw/ri6;

    invoke-interface {v6}, Lcom/daaw/rp4;->zzg()Lcom/daaw/ri6;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/client/zzl;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    if-nez v2, :cond_1

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/zzl;->zzx:Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v6}, Lcom/daaw/rp4;->zzg()Lcom/daaw/ri6;

    move-result-object v1

    iget-object v11, v1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v12, v1, Lcom/daaw/ri6;->f:Ljava/lang/String;

    iget-object v14, v1, Lcom/daaw/ri6;->j:Lcom/google/android/gms/ads/internal/client/zzw;

    new-instance v4, Lcom/daaw/ee6;

    iget-object v13, v7, Lcom/daaw/fe6;->f:Ljava/util/concurrent/Executor;

    const/4 v15, 0x0

    move-object v8, v4

    move-object/from16 v9, p2

    move-object/from16 v10, p1

    invoke-direct/range {v8 .. v15}, Lcom/daaw/ee6;-><init>(Lcom/daaw/ye6;Lcom/daaw/df6;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/google/android/gms/ads/internal/client/zzw;Lcom/daaw/rk6;)V

    iget-object v1, v7, Lcom/daaw/fe6;->b:Lcom/daaw/cf6;

    check-cast v1, Lcom/daaw/le6;

    invoke-virtual {v1, v0, v5, v6}, Lcom/daaw/le6;->c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object v8

    new-instance v9, Lcom/daaw/ce6;

    move-object v1, v9

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/daaw/ce6;-><init>(Lcom/daaw/fe6;Lcom/daaw/df6;Lcom/daaw/ee6;Lcom/daaw/ye6;Lcom/daaw/rp4;)V

    iget-object v0, v7, Lcom/daaw/fe6;->f:Ljava/util/concurrent/Executor;

    invoke-static {v8, v9, v0}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_1
    :goto_0
    :try_start_1
    iput-object v6, v7, Lcom/daaw/fe6;->e:Lcom/daaw/rp4;

    iget-object v1, v7, Lcom/daaw/fe6;->a:Lcom/daaw/cf6;

    check-cast v1, Lcom/daaw/pe6;

    invoke-virtual {v1, v0, v5, v6}, Lcom/daaw/pe6;->c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final f(Lcom/daaw/qk6;Lcom/daaw/df6;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p1, Lcom/daaw/qk6;->a:Lcom/daaw/rp4;

    iput-object v0, p0, Lcom/daaw/fe6;->e:Lcom/daaw/rp4;

    iget-object v1, p1, Lcom/daaw/qk6;->c:Lcom/daaw/zl4;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lcom/daaw/rp4;->zzf()Lcom/daaw/we6;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p1, Lcom/daaw/qk6;->c:Lcom/daaw/zl4;

    invoke-virtual {p2}, Lcom/daaw/zl4;->f()Lcom/daaw/we6;

    move-result-object p2

    iget-object v0, p1, Lcom/daaw/qk6;->a:Lcom/daaw/rp4;

    invoke-interface {v0}, Lcom/daaw/rp4;->zzf()Lcom/daaw/we6;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/we6;->e(Lcom/daaw/we6;)V

    :cond_0
    iget-object p1, p1, Lcom/daaw/qk6;->c:Lcom/daaw/zl4;

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/daaw/rp4;->zzb()Lcom/daaw/jn4;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/qk6;->b:Lcom/daaw/fi6;

    invoke-virtual {v0, v1}, Lcom/daaw/jn4;->l(Lcom/daaw/fi6;)V

    iget-object v0, p0, Lcom/daaw/fe6;->a:Lcom/daaw/cf6;

    iget-object p1, p1, Lcom/daaw/qk6;->a:Lcom/daaw/rp4;

    check-cast v0, Lcom/daaw/pe6;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1, p1}, Lcom/daaw/pe6;->c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic zzd()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fe6;->b()Lcom/daaw/rp4;

    move-result-object v0

    return-object v0
.end method
