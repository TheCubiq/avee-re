.class public final Lcom/daaw/ah6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/pz5;

.field public final synthetic b:Lcom/daaw/to6;

.field public final synthetic c:Lcom/daaw/io6;

.field public final synthetic d:Lcom/daaw/ch6;

.field public final synthetic e:Lcom/daaw/dh6;


# direct methods
.method public constructor <init>(Lcom/daaw/dh6;Lcom/daaw/pz5;Lcom/daaw/to6;Lcom/daaw/io6;Lcom/daaw/ch6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    iput-object p2, p0, Lcom/daaw/ah6;->a:Lcom/daaw/pz5;

    iput-object p3, p0, Lcom/daaw/ah6;->b:Lcom/daaw/to6;

    iput-object p4, p0, Lcom/daaw/ah6;->c:Lcom/daaw/io6;

    iput-object p5, p0, Lcom/daaw/ah6;->d:Lcom/daaw/ch6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lcom/daaw/j95;

    iget-object v0, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/zl4;->e()Lcom/daaw/cv4;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    invoke-static {v2}, Lcom/daaw/dh6;->e(Lcom/daaw/dh6;)Lcom/daaw/tg6;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/cv4;->d(Lcom/daaw/tg6;)Lcom/daaw/cv4;

    iget-object v1, p0, Lcom/daaw/ah6;->a:Lcom/daaw/pz5;

    invoke-interface {v1, p1}, Lcom/daaw/pz5;->a(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    invoke-static {v1}, Lcom/daaw/dh6;->g(Lcom/daaw/dh6;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {v1}, Lcom/daaw/dh6;->e(Lcom/daaw/dh6;)Lcom/daaw/tg6;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lcom/daaw/yg6;

    invoke-direct {v3, v1}, Lcom/daaw/yg6;-><init>(Lcom/daaw/tg6;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    invoke-static {v1}, Lcom/daaw/dh6;->e(Lcom/daaw/dh6;)Lcom/daaw/tg6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/yr6;->k()V

    sget-object v1, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/ah6;->b:Lcom/daaw/to6;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/zl4;->g()Lcom/daaw/fi6;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    invoke-virtual {v1, v3}, Lcom/daaw/to6;->f(Lcom/daaw/ei6;)Lcom/daaw/to6;

    invoke-virtual {p1}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/eq4;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/to6;->e(Ljava/lang/String;)Lcom/daaw/to6;

    iget-object p1, p0, Lcom/daaw/ah6;->c:Lcom/daaw/io6;

    invoke-interface {p1, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v1, p1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v1}, Lcom/daaw/to6;->g()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    invoke-static {v1}, Lcom/daaw/dh6;->f(Lcom/daaw/dh6;)Lcom/daaw/vo6;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/ah6;->c:Lcom/daaw/io6;

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

    iget-object v0, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    invoke-static {v0}, Lcom/daaw/dh6;->d(Lcom/daaw/dh6;)Lcom/daaw/cf6;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/cf6;->zzd()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/o95;

    if-nez v0, :cond_0

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/daaw/tj6;->b(Ljava/lang/Throwable;Lcom/daaw/vq5;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/o95;->zzb()Lcom/daaw/jn4;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/jn4;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    monitor-enter v2

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/o95;->a()Lcom/daaw/nq4;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/nq4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    iget-object v0, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    invoke-static {v0}, Lcom/daaw/dh6;->g(Lcom/daaw/dh6;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v3, Lcom/daaw/zg6;

    invoke-direct {v3, p0, v1}, Lcom/daaw/zg6;-><init>(Lcom/daaw/ah6;Lcom/google/android/gms/ads/internal/client/zze;)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    invoke-static {v0}, Lcom/daaw/dh6;->e(Lcom/daaw/dh6;)Lcom/daaw/tg6;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/tg6;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    iget-object v0, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    iget-object v3, p0, Lcom/daaw/ah6;->d:Lcom/daaw/ch6;

    invoke-static {v0, v3}, Lcom/daaw/dh6;->c(Lcom/daaw/dh6;Lcom/daaw/xe6;)Lcom/daaw/n95;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/n95;->zze()Lcom/daaw/o95;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/o95;->zzb()Lcom/daaw/jn4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/jn4;->c()Lcom/daaw/fw4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/fw4;->zzd()V

    :goto_1
    iget v0, v1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    const-string v3, "RewardedAdLoader.onFailure"

    invoke-static {v0, p1, v3}, Lcom/daaw/nj6;->b(ILjava/lang/Throwable;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/ah6;->a:Lcom/daaw/pz5;

    invoke-interface {v0}, Lcom/daaw/pz5;->zza()V

    sget-object v0, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ah6;->b:Lcom/daaw/to6;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lcom/daaw/to6;->c(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/daaw/to6;

    iget-object v1, p0, Lcom/daaw/ah6;->c:Lcom/daaw/io6;

    invoke-interface {v1, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v1, v3}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v0, v1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v0}, Lcom/daaw/to6;->g()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    invoke-static {v0}, Lcom/daaw/dh6;->f(Lcom/daaw/dh6;)Lcom/daaw/vo6;

    move-result-object v0

    iget-object v4, p0, Lcom/daaw/ah6;->c:Lcom/daaw/io6;

    invoke-interface {v4, v1}, Lcom/daaw/io6;->b(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/daaw/io6;

    invoke-interface {v4, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v4, v3}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v4}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    :goto_2
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
