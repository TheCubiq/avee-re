.class public final Lcom/daaw/kh6;
.super Lcom/daaw/vv3;
.source ""


# instance fields
.field public final p:Lcom/daaw/dh6;

.field public final q:Lcom/daaw/tg6;

.field public final r:Ljava/lang/String;

.field public final s:Lcom/daaw/gi6;

.field public final t:Landroid/content/Context;

.field public final u:Lcom/google/android/gms/internal/ads/zzchu;

.field public v:Lcom/daaw/j95;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public w:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/dh6;Landroid/content/Context;Lcom/daaw/tg6;Lcom/daaw/gi6;Lcom/google/android/gms/internal/ads/zzchu;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/vv3;-><init>()V

    iput-object p1, p0, Lcom/daaw/kh6;->r:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/kh6;->p:Lcom/daaw/dh6;

    iput-object p4, p0, Lcom/daaw/kh6;->q:Lcom/daaw/tg6;

    iput-object p5, p0, Lcom/daaw/kh6;->s:Lcom/daaw/gi6;

    iput-object p3, p0, Lcom/daaw/kh6;->t:Landroid/content/Context;

    iput-object p6, p0, Lcom/daaw/kh6;->u:Lcom/google/android/gms/internal/ads/zzchu;

    sget-object p1, Lcom/daaw/g93;->A0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/kh6;->w:Z

    return-void
.end method

.method public static bridge synthetic g3(Lcom/daaw/kh6;)Lcom/daaw/j95;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;

    return-object p0
.end method

.method public static bridge synthetic h3(Lcom/daaw/kh6;)Lcom/daaw/gi6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kh6;->s:Lcom/daaw/gi6;

    return-object p0
.end method

.method public static bridge synthetic i3(Lcom/daaw/kh6;Lcom/daaw/j95;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;

    return-void
.end method


# virtual methods
.method public final declared-synchronized j3(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/dw3;I)V
    .locals 4

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/ya3;->l:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/g93;->n9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    iget-object v0, p0, Lcom/daaw/kh6;->u:Lcom/google/android/gms/internal/ads/zzchu;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    sget-object v2, Lcom/daaw/g93;->o9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v0, v2, :cond_1

    if-nez v1, :cond_2

    :cond_1
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/daaw/kh6;->q:Lcom/daaw/tg6;

    invoke-virtual {v0, p2}, Lcom/daaw/tg6;->M(Lcom/daaw/dw3;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object p2, p0, Lcom/daaw/kh6;->t:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/util/zzs;->zzD(Landroid/content/Context;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    iget-object p2, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    const-string p1, "Failed to load the ad because app ID is missing."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/kh6;->q:Lcom/daaw/tg6;

    const/4 p2, 0x4

    invoke-static {p2, v0, v0}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/tg6;->b(Lcom/google/android/gms/ads/internal/client/zze;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :goto_0
    :try_start_1
    iget-object p2, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_5

    monitor-exit p0

    return-void

    :cond_5
    :try_start_2
    new-instance p2, Lcom/daaw/vg6;

    invoke-direct {p2, v0}, Lcom/daaw/vg6;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kh6;->p:Lcom/daaw/dh6;

    invoke-virtual {v0, p3}, Lcom/daaw/dh6;->i(I)V

    iget-object p3, p0, Lcom/daaw/kh6;->p:Lcom/daaw/dh6;

    iget-object v0, p0, Lcom/daaw/kh6;->r:Ljava/lang/String;

    new-instance v1, Lcom/daaw/jh6;

    invoke-direct {v1, p0}, Lcom/daaw/jh6;-><init>(Lcom/daaw/kh6;)V

    invoke-virtual {p3, p1, v0, p2, v1}, Lcom/daaw/dh6;->a(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/oz5;Lcom/daaw/pz5;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzb()Landroid/os/Bundle;
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;

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

.method public final zzc()Lcom/google/android/gms/ads/internal/client/zzdn;
    .locals 2

    sget-object v0, Lcom/daaw/g93;->i6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final zzd()Lcom/daaw/tv3;
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/j95;->i()Lcom/daaw/tv3;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized zze()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;

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

.method public final declared-synchronized zzf(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/dw3;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x2

    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/kh6;->j3(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/dw3;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzg(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/dw3;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x3

    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/kh6;->j3(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/dw3;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzh(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "setImmersiveMode must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/daaw/kh6;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzi(Lcom/google/android/gms/ads/internal/client/zzdd;)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/kh6;->q:Lcom/daaw/tg6;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/tg6;->l(Lcom/daaw/yr6;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/kh6;->q:Lcom/daaw/tg6;

    new-instance v1, Lcom/daaw/ih6;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ih6;-><init>(Lcom/daaw/kh6;Lcom/google/android/gms/ads/internal/client/zzdd;)V

    invoke-virtual {v0, v1}, Lcom/daaw/tg6;->l(Lcom/daaw/yr6;)V

    return-void
.end method

.method public final zzj(Lcom/google/android/gms/ads/internal/client/zzdg;)V
    .locals 1

    const-string v0, "setOnPaidEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kh6;->q:Lcom/daaw/tg6;

    invoke-virtual {v0, p1}, Lcom/daaw/tg6;->s(Lcom/google/android/gms/ads/internal/client/zzdg;)V

    return-void
.end method

.method public final zzk(Lcom/daaw/zv3;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kh6;->q:Lcom/daaw/tg6;

    invoke-virtual {v0, p1}, Lcom/daaw/tg6;->F(Lcom/daaw/zv3;)V

    return-void
.end method

.method public final declared-synchronized zzl(Lcom/google/android/gms/internal/ads/zzcdy;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kh6;->s:Lcom/daaw/gi6;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzcdy;->p:Ljava/lang/String;

    iput-object v1, v0, Lcom/daaw/gi6;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzcdy;->q:Ljava/lang/String;

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

.method public final declared-synchronized zzm(Lcom/daaw/yd0;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/kh6;->w:Z

    invoke-virtual {p0, p1, v0}, Lcom/daaw/kh6;->zzn(Lcom/daaw/yd0;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzn(Lcom/daaw/yd0;Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;

    if-nez v0, :cond_0

    const-string p1, "Rewarded can not be shown before loaded"

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/kh6;->q:Lcom/daaw/tg6;

    const/16 p2, 0x9

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/tg6;->A(Lcom/google/android/gms/ads/internal/client/zze;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    iget-object v0, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;

    invoke-virtual {v0, p2, p1}, Lcom/daaw/j95;->n(ZLandroid/app/Activity;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzo()Z
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kh6;->v:Lcom/daaw/j95;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/j95;->l()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzp(Lcom/daaw/ew3;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kh6;->q:Lcom/daaw/tg6;

    invoke-virtual {v0, p1}, Lcom/daaw/tg6;->d0(Lcom/daaw/ew3;)V

    return-void
.end method
