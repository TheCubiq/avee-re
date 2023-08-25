.class public final Lcom/daaw/pf6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/pz5;

.field public final synthetic b:Lcom/daaw/to6;

.field public final synthetic c:Lcom/daaw/io6;

.field public final synthetic d:Lcom/daaw/s05;

.field public final synthetic e:Lcom/daaw/qf6;


# direct methods
.method public constructor <init>(Lcom/daaw/qf6;Lcom/daaw/pz5;Lcom/daaw/to6;Lcom/daaw/io6;Lcom/daaw/s05;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    iput-object p2, p0, Lcom/daaw/pf6;->a:Lcom/daaw/pz5;

    iput-object p3, p0, Lcom/daaw/pf6;->b:Lcom/daaw/to6;

    iput-object p4, p0, Lcom/daaw/pf6;->c:Lcom/daaw/io6;

    iput-object p5, p0, Lcom/daaw/pf6;->d:Lcom/daaw/s05;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lcom/daaw/oz4;

    iget-object v0, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/qf6;->f(Lcom/daaw/qf6;Lcom/daaw/f77;)V

    sget-object v1, Lcom/daaw/g93;->s7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/zl4;->e()Lcom/daaw/cv4;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v3}, Lcom/daaw/qf6;->b(Lcom/daaw/qf6;)Lcom/daaw/az5;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/cv4;->a(Lcom/daaw/az5;)Lcom/daaw/cv4;

    iget-object v3, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v3}, Lcom/daaw/qf6;->c(Lcom/daaw/qf6;)Lcom/daaw/tg6;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/cv4;->d(Lcom/daaw/tg6;)Lcom/daaw/cv4;

    :cond_0
    iget-object v2, p0, Lcom/daaw/pf6;->a:Lcom/daaw/pz5;

    invoke-interface {v2, p1}, Lcom/daaw/pz5;->a(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v1}, Lcom/daaw/qf6;->e(Lcom/daaw/qf6;)Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/daaw/lf6;

    invoke-direct {v2, p0}, Lcom/daaw/lf6;-><init>(Lcom/daaw/pf6;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v1}, Lcom/daaw/qf6;->e(Lcom/daaw/qf6;)Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/daaw/mf6;

    invoke-direct {v2, p0}, Lcom/daaw/mf6;-><init>(Lcom/daaw/pf6;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    sget-object v1, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/pf6;->b:Lcom/daaw/to6;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/daaw/zl4;->g()Lcom/daaw/fi6;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    invoke-virtual {v1, v3}, Lcom/daaw/to6;->f(Lcom/daaw/ei6;)Lcom/daaw/to6;

    invoke-virtual {p1}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/eq4;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/to6;->e(Ljava/lang/String;)Lcom/daaw/to6;

    iget-object p1, p0, Lcom/daaw/pf6;->c:Lcom/daaw/io6;

    invoke-interface {p1, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v1, p1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v1}, Lcom/daaw/to6;->g()V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v1}, Lcom/daaw/qf6;->d(Lcom/daaw/qf6;)Lcom/daaw/vo6;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/pf6;->c:Lcom/daaw/io6;

    invoke-virtual {p1}, Lcom/daaw/zl4;->g()Lcom/daaw/fi6;

    move-result-object v4

    iget-object v4, v4, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    invoke-interface {v3, v4}, Lcom/daaw/io6;->d(Lcom/daaw/ei6;)Lcom/daaw/io6;

    invoke-virtual {p1}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/eq4;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, p1}, Lcom/daaw/io6;->l(Ljava/lang/String;)Lcom/daaw/io6;

    invoke-interface {v3, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v3}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/pf6;->d:Lcom/daaw/s05;

    invoke-virtual {v0}, Lcom/daaw/s05;->a()Lcom/daaw/jn4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/jn4;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/daaw/qf6;->f(Lcom/daaw/qf6;Lcom/daaw/f77;)V

    iget-object v2, p0, Lcom/daaw/pf6;->d:Lcom/daaw/s05;

    invoke-virtual {v2}, Lcom/daaw/s05;->b()Lcom/daaw/nq4;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/nq4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    sget-object v2, Lcom/daaw/g93;->s7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v2}, Lcom/daaw/qf6;->e(Lcom/daaw/qf6;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/daaw/nf6;

    invoke-direct {v3, p0, v0}, Lcom/daaw/nf6;-><init>(Lcom/daaw/pf6;Lcom/google/android/gms/ads/internal/client/zze;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v2, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v2}, Lcom/daaw/qf6;->e(Lcom/daaw/qf6;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/daaw/of6;

    invoke-direct {v3, p0, v0}, Lcom/daaw/of6;-><init>(Lcom/daaw/pf6;Lcom/google/android/gms/ads/internal/client/zze;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    iget v2, v0, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    const-string v3, "InterstitialAdLoader.onFailure"

    invoke-static {v2, p1, v3}, Lcom/daaw/nj6;->b(ILjava/lang/Throwable;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/pf6;->a:Lcom/daaw/pz5;

    invoke-interface {v2}, Lcom/daaw/pz5;->zza()V

    sget-object v2, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v2}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/pf6;->b:Lcom/daaw/to6;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Lcom/daaw/to6;->c(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/daaw/to6;

    iget-object v0, p0, Lcom/daaw/pf6;->c:Lcom/daaw/io6;

    invoke-interface {v0, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v0, v3}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v2, v0}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v2}, Lcom/daaw/to6;->g()V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v2}, Lcom/daaw/qf6;->d(Lcom/daaw/qf6;)Lcom/daaw/vo6;

    move-result-object v2

    iget-object v4, p0, Lcom/daaw/pf6;->c:Lcom/daaw/io6;

    invoke-interface {v4, v0}, Lcom/daaw/io6;->b(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/daaw/io6;

    invoke-interface {v4, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v4, v3}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v4}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
