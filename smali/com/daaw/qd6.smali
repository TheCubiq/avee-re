.class public final Lcom/daaw/qd6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/pz5;

.field public final synthetic b:Lcom/daaw/to6;

.field public final synthetic c:Lcom/daaw/io6;

.field public final synthetic d:Lcom/daaw/zj4;

.field public final synthetic e:Lcom/daaw/rd6;


# direct methods
.method public constructor <init>(Lcom/daaw/rd6;Lcom/daaw/pz5;Lcom/daaw/to6;Lcom/daaw/io6;Lcom/daaw/zj4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    iput-object p2, p0, Lcom/daaw/qd6;->a:Lcom/daaw/pz5;

    iput-object p3, p0, Lcom/daaw/qd6;->b:Lcom/daaw/to6;

    iput-object p4, p0, Lcom/daaw/qd6;->c:Lcom/daaw/io6;

    iput-object p5, p0, Lcom/daaw/qd6;->d:Lcom/daaw/zj4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lcom/daaw/zi4;

    iget-object v0, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/rd6;->k(Lcom/daaw/rd6;Lcom/daaw/f77;)V

    iget-object v1, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v1}, Lcom/daaw/rd6;->b(Lcom/daaw/rd6;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p1}, Lcom/daaw/zi4;->i()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/zi4;->i()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    const-string v2, ""

    invoke-virtual {p1}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/eq4;->zzg()Ljava/lang/String;

    move-result-object v2

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Banner view provided from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " already has a parent view. Removing its old parent."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Lcom/daaw/zi4;->i()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    sget-object v1, Lcom/daaw/g93;->q7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/daaw/zl4;->e()Lcom/daaw/cv4;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v3}, Lcom/daaw/rd6;->f(Lcom/daaw/rd6;)Lcom/daaw/az5;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/cv4;->a(Lcom/daaw/az5;)Lcom/daaw/cv4;

    iget-object v3, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v3}, Lcom/daaw/rd6;->g(Lcom/daaw/rd6;)Lcom/daaw/ez5;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/cv4;->c(Lcom/daaw/ez5;)Lcom/daaw/cv4;

    :cond_2
    iget-object v2, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v2}, Lcom/daaw/rd6;->b(Lcom/daaw/rd6;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {p1}, Lcom/daaw/zi4;->i()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v2, p0, Lcom/daaw/qd6;->a:Lcom/daaw/pz5;

    invoke-interface {v2, p1}, Lcom/daaw/pz5;->a(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v1}, Lcom/daaw/rd6;->j(Lcom/daaw/rd6;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {v1}, Lcom/daaw/rd6;->f(Lcom/daaw/rd6;)Lcom/daaw/az5;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lcom/daaw/od6;

    invoke-direct {v3, v1}, Lcom/daaw/od6;-><init>(Lcom/daaw/az5;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    iget-object v1, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v1}, Lcom/daaw/rd6;->d(Lcom/daaw/rd6;)Lcom/daaw/jt4;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/zi4;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/daaw/jt4;->C0(I)V

    sget-object v1, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/daaw/qd6;->b:Lcom/daaw/to6;

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lcom/daaw/zl4;->g()Lcom/daaw/fi6;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    invoke-virtual {v1, v3}, Lcom/daaw/to6;->f(Lcom/daaw/ei6;)Lcom/daaw/to6;

    invoke-virtual {p1}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/eq4;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/to6;->e(Ljava/lang/String;)Lcom/daaw/to6;

    iget-object p1, p0, Lcom/daaw/qd6;->c:Lcom/daaw/io6;

    invoke-interface {p1, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v1, p1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v1}, Lcom/daaw/to6;->g()V

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v1}, Lcom/daaw/rd6;->i(Lcom/daaw/rd6;)Lcom/daaw/vo6;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/qd6;->c:Lcom/daaw/io6;

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

    iget-object v0, p0, Lcom/daaw/qd6;->d:Lcom/daaw/zj4;

    invoke-virtual {v0}, Lcom/daaw/zj4;->d()Lcom/daaw/jn4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/jn4;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/daaw/rd6;->k(Lcom/daaw/rd6;Lcom/daaw/f77;)V

    iget-object v2, p0, Lcom/daaw/qd6;->d:Lcom/daaw/zj4;

    invoke-virtual {v2}, Lcom/daaw/zj4;->e()Lcom/daaw/nq4;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/nq4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    sget-object v2, Lcom/daaw/g93;->q7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v2}, Lcom/daaw/rd6;->j(Lcom/daaw/rd6;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/daaw/pd6;

    invoke-direct {v3, p0, v0}, Lcom/daaw/pd6;-><init>(Lcom/daaw/qd6;Lcom/google/android/gms/ads/internal/client/zze;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v2, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v2}, Lcom/daaw/rd6;->d(Lcom/daaw/rd6;)Lcom/daaw/jt4;

    move-result-object v3

    invoke-static {v2}, Lcom/daaw/rd6;->e(Lcom/daaw/rd6;)Lcom/daaw/wv4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/wv4;->a()I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/daaw/jt4;->C0(I)V

    iget v2, v0, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    const-string v3, "BannerAdLoader.onFailure"

    invoke-static {v2, p1, v3}, Lcom/daaw/nj6;->b(ILjava/lang/Throwable;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/qd6;->a:Lcom/daaw/pz5;

    invoke-interface {v2}, Lcom/daaw/pz5;->zza()V

    sget-object v2, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v2}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/qd6;->b:Lcom/daaw/to6;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Lcom/daaw/to6;->c(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/daaw/to6;

    iget-object v0, p0, Lcom/daaw/qd6;->c:Lcom/daaw/io6;

    invoke-interface {v0, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v0, v3}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v2, v0}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v2}, Lcom/daaw/to6;->g()V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v2}, Lcom/daaw/rd6;->i(Lcom/daaw/rd6;)Lcom/daaw/vo6;

    move-result-object v2

    iget-object v4, p0, Lcom/daaw/qd6;->c:Lcom/daaw/io6;

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
