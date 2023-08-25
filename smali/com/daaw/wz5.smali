.class public final Lcom/daaw/wz5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/pz5;

.field public final synthetic b:Lcom/daaw/to6;

.field public final synthetic c:Lcom/daaw/io6;

.field public final synthetic d:Lcom/daaw/q15;

.field public final synthetic e:Lcom/daaw/xz5;


# direct methods
.method public constructor <init>(Lcom/daaw/xz5;Lcom/daaw/pz5;Lcom/daaw/to6;Lcom/daaw/io6;Lcom/daaw/q15;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wz5;->e:Lcom/daaw/xz5;

    iput-object p2, p0, Lcom/daaw/wz5;->a:Lcom/daaw/pz5;

    iput-object p3, p0, Lcom/daaw/wz5;->b:Lcom/daaw/to6;

    iput-object p4, p0, Lcom/daaw/wz5;->c:Lcom/daaw/io6;

    iput-object p5, p0, Lcom/daaw/wz5;->d:Lcom/daaw/q15;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lcom/daaw/zl4;

    iget-object v0, p0, Lcom/daaw/wz5;->e:Lcom/daaw/xz5;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/zl4;->e()Lcom/daaw/cv4;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/wz5;->e:Lcom/daaw/xz5;

    invoke-static {v2}, Lcom/daaw/xz5;->c(Lcom/daaw/xz5;)Lcom/daaw/nz5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/nz5;->d()Lcom/daaw/az5;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/cv4;->a(Lcom/daaw/az5;)Lcom/daaw/cv4;

    iget-object v1, p0, Lcom/daaw/wz5;->a:Lcom/daaw/pz5;

    invoke-interface {v1, p1}, Lcom/daaw/pz5;->a(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/daaw/wz5;->e:Lcom/daaw/xz5;

    invoke-static {v1}, Lcom/daaw/xz5;->b(Lcom/daaw/xz5;)Lcom/daaw/b94;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/b94;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/daaw/uz5;

    invoke-direct {v2, p0}, Lcom/daaw/uz5;-><init>(Lcom/daaw/wz5;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v1, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/wz5;->b:Lcom/daaw/to6;

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

    iget-object p1, p0, Lcom/daaw/wz5;->c:Lcom/daaw/io6;

    invoke-interface {p1, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v1, p1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v1}, Lcom/daaw/to6;->g()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/wz5;->e:Lcom/daaw/xz5;

    invoke-static {v1}, Lcom/daaw/xz5;->d(Lcom/daaw/xz5;)Lcom/daaw/vo6;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/wz5;->c:Lcom/daaw/io6;

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
    .locals 4

    iget-object v0, p0, Lcom/daaw/wz5;->d:Lcom/daaw/q15;

    invoke-virtual {v0}, Lcom/daaw/q15;->a()Lcom/daaw/jn4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/jn4;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/wz5;->d:Lcom/daaw/q15;

    invoke-virtual {v1}, Lcom/daaw/q15;->b()Lcom/daaw/nq4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/nq4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    iget-object v1, p0, Lcom/daaw/wz5;->e:Lcom/daaw/xz5;

    invoke-static {v1}, Lcom/daaw/xz5;->b(Lcom/daaw/xz5;)Lcom/daaw/b94;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/b94;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/daaw/vz5;

    invoke-direct {v2, p0, v0}, Lcom/daaw/vz5;-><init>(Lcom/daaw/wz5;Lcom/google/android/gms/ads/internal/client/zze;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget v1, v0, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    const-string v2, "NativeAdLoader.onFailure"

    invoke-static {v1, p1, v2}, Lcom/daaw/nj6;->b(ILjava/lang/Throwable;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/wz5;->a:Lcom/daaw/pz5;

    invoke-interface {v1}, Lcom/daaw/pz5;->zza()V

    sget-object v1, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/wz5;->b:Lcom/daaw/to6;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcom/daaw/to6;->c(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/daaw/to6;

    iget-object v0, p0, Lcom/daaw/wz5;->c:Lcom/daaw/io6;

    invoke-interface {v0, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v0, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v1, v0}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v1}, Lcom/daaw/to6;->g()V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/wz5;->e:Lcom/daaw/xz5;

    invoke-static {v1}, Lcom/daaw/xz5;->d(Lcom/daaw/xz5;)Lcom/daaw/vo6;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/wz5;->c:Lcom/daaw/io6;

    invoke-interface {v3, v0}, Lcom/daaw/io6;->b(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/daaw/io6;

    invoke-interface {v3, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v3, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v3}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    return-void
.end method
