.class public final Lcom/daaw/qh6;
.super Lcom/daaw/ev3;
.source ""


# instance fields
.field public final p:Lcom/daaw/dh6;

.field public final q:Lcom/daaw/tg6;

.field public final r:Lcom/daaw/gi6;

.field public s:Lcom/daaw/j95;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public t:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/dh6;Lcom/daaw/tg6;Lcom/daaw/gi6;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ev3;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/qh6;->t:Z

    iput-object p1, p0, Lcom/daaw/qh6;->p:Lcom/daaw/dh6;

    iput-object p2, p0, Lcom/daaw/qh6;->q:Lcom/daaw/tg6;

    iput-object p3, p0, Lcom/daaw/qh6;->r:Lcom/daaw/gi6;

    return-void
.end method

.method public static bridge synthetic g3(Lcom/daaw/qh6;)Lcom/daaw/j95;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    return-object p0
.end method

.method public static bridge synthetic h3(Lcom/daaw/qh6;)Lcom/daaw/gi6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qh6;->r:Lcom/daaw/gi6;

    return-object p0
.end method

.method public static bridge synthetic i3(Lcom/daaw/qh6;Lcom/daaw/j95;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    return-void
.end method


# virtual methods
.method public final B2(Lcom/google/android/gms/ads/internal/client/zzby;)V
    .locals 2

    const-string v0, "setAdMetadataListener can only be called from the UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qh6;->q:Lcom/daaw/tg6;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/tg6;->l(Lcom/daaw/yr6;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/qh6;->q:Lcom/daaw/tg6;

    new-instance v1, Lcom/daaw/ph6;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ph6;-><init>(Lcom/daaw/qh6;Lcom/google/android/gms/ads/internal/client/zzby;)V

    invoke-virtual {v0, v1}, Lcom/daaw/tg6;->l(Lcom/daaw/yr6;)V

    return-void
.end method

.method public final declared-synchronized C0(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "setImmersiveMode must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/daaw/qh6;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized G(Lcom/daaw/yd0;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qh6;->q:Lcom/daaw/tg6;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/tg6;->l(Lcom/daaw/yr6;)V

    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    :goto_0
    iget-object p1, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    invoke-virtual {p1}, Lcom/daaw/zl4;->d()Lcom/daaw/nr4;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/daaw/nr4;->C0(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final H1(Lcom/daaw/dv3;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread.: setRewardedAdSkuListener"

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qh6;->q:Lcom/daaw/tg6;

    invoke-virtual {v0, p1}, Lcom/daaw/tg6;->W(Lcom/daaw/dv3;)V

    return-void
.end method

.method public final declared-synchronized h1(Lcom/daaw/yd0;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    :goto_0
    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    invoke-virtual {v0}, Lcom/daaw/zl4;->d()Lcom/daaw/nr4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/nr4;->E0(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final j2(Lcom/daaw/iv3;)V
    .locals 1

    const-string v0, "setRewardedVideoAdListener can only be called from the UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qh6;->q:Lcom/daaw/tg6;

    invoke-virtual {v0, p1}, Lcom/daaw/tg6;->S(Lcom/daaw/iv3;)V

    return-void
.end method

.method public final declared-synchronized j3()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/j95;->k()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final declared-synchronized o1(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "#008 Must be called on the main UI thread.: setCustomData"

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qh6;->r:Lcom/daaw/gi6;

    iput-object p1, v0, Lcom/daaw/gi6;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized q(Lcom/daaw/yd0;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "showAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    iget-boolean v1, p0, Lcom/daaw/qh6;->t:Z

    invoke-virtual {p1, v1, v0}, Lcom/daaw/j95;->n(ZLandroid/app/Activity;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized r(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "setUserId must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qh6;->r:Lcom/daaw/gi6;

    iput-object p1, v0, Lcom/daaw/gi6;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized r0(Lcom/google/android/gms/internal/ads/zzccy;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzccy;->q:Ljava/lang/String;

    sget-object v1, Lcom/daaw/g93;->Q4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-static {v1, v0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    const-string v2, "NonagonUtil.isPatternMatched"

    invoke-virtual {v1, v0, v2}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/qh6;->j3()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/daaw/g93;->S4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_3
    new-instance v0, Lcom/daaw/vg6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/vg6;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    iget-object v1, p0, Lcom/daaw/qh6;->p:Lcom/daaw/dh6;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/daaw/dh6;->i(I)V

    iget-object v1, p0, Lcom/daaw/qh6;->p:Lcom/daaw/dh6;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzccy;->p:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzccy;->q:Ljava/lang/String;

    new-instance v3, Lcom/daaw/oh6;

    invoke-direct {v3, p0}, Lcom/daaw/oh6;-><init>(Lcom/daaw/qh6;)V

    invoke-virtual {v1, v2, p1, v0, v3}, Lcom/daaw/dh6;->a(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/oz5;Lcom/daaw/pz5;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzb()Landroid/os/Bundle;
    .locals 1

    const-string v0, "getAdMetadata can only be called from the UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/j95;->h()Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized zzc()Lcom/google/android/gms/ads/internal/client/zzdn;
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/g93;->i6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_1
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzd()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/eq4;->zzg()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zze()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/qh6;->G(Lcom/daaw/yd0;)V

    return-void
.end method

.method public final zzh()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/qh6;->zzi(Lcom/daaw/yd0;)V

    return-void
.end method

.method public final declared-synchronized zzi(Lcom/daaw/yd0;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    :goto_0
    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    invoke-virtual {v0}, Lcom/daaw/zl4;->d()Lcom/daaw/nr4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/nr4;->D0(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzj()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/qh6;->h1(Lcom/daaw/yd0;)V

    return-void
.end method

.method public final declared-synchronized zzq()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/daaw/qh6;->q(Lcom/daaw/yd0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzs()Z
    .locals 1

    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/qh6;->j3()Z

    move-result v0

    return v0
.end method

.method public final zzt()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/qh6;->s:Lcom/daaw/j95;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/j95;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
