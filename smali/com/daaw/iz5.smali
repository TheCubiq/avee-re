.class public final Lcom/daaw/iz5;
.super Lcom/google/android/gms/ads/internal/client/zzbt;
.source ""


# instance fields
.field public final p:Lcom/google/android/gms/ads/internal/client/zzq;

.field public final q:Landroid/content/Context;

.field public final r:Lcom/daaw/qf6;

.field public final s:Ljava/lang/String;

.field public final t:Lcom/google/android/gms/internal/ads/zzchu;

.field public final u:Lcom/daaw/az5;

.field public final v:Lcom/daaw/tg6;

.field public w:Lcom/daaw/oz4;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public x:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/qf6;Lcom/daaw/az5;Lcom/daaw/tg6;Lcom/google/android/gms/internal/ads/zzchu;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzbt;-><init>()V

    iput-object p2, p0, Lcom/daaw/iz5;->p:Lcom/google/android/gms/ads/internal/client/zzq;

    iput-object p3, p0, Lcom/daaw/iz5;->s:Ljava/lang/String;

    iput-object p1, p0, Lcom/daaw/iz5;->q:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/iz5;->r:Lcom/daaw/qf6;

    iput-object p5, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    iput-object p6, p0, Lcom/daaw/iz5;->v:Lcom/daaw/tg6;

    iput-object p7, p0, Lcom/daaw/iz5;->t:Lcom/google/android/gms/internal/ads/zzchu;

    sget-object p1, Lcom/daaw/g93;->A0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/iz5;->x:Z

    return-void
.end method

.method public static bridge synthetic g3(Lcom/daaw/iz5;)Lcom/daaw/oz4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    return-object p0
.end method

.method public static bridge synthetic h3(Lcom/daaw/iz5;Lcom/daaw/oz4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    return-void
.end method


# virtual methods
.method public final declared-synchronized i3()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/oz4;->h()Z

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

.method public final zzA()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized zzB()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/zl4;->d()Lcom/daaw/nr4;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/nr4;->E0(Landroid/content/Context;)V
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

.method public final zzC(Lcom/google/android/gms/ads/internal/client/zzbe;)V
    .locals 0

    return-void
.end method

.method public final zzD(Lcom/google/android/gms/ads/internal/client/zzbh;)V
    .locals 1

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    invoke-virtual {v0, p1}, Lcom/daaw/az5;->s(Lcom/google/android/gms/ads/internal/client/zzbh;)V

    return-void
.end method

.method public final zzE(Lcom/google/android/gms/ads/internal/client/zzby;)V
    .locals 0

    const-string p1, "setAdMetadataListener must be called on the main UI thread."

    invoke-static {p1}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    return-void
.end method

.method public final zzF(Lcom/google/android/gms/ads/internal/client/zzq;)V
    .locals 0

    return-void
.end method

.method public final zzG(Lcom/google/android/gms/ads/internal/client/zzcb;)V
    .locals 1

    const-string v0, "setAppEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    invoke-virtual {v0, p1}, Lcom/daaw/az5;->W(Lcom/google/android/gms/ads/internal/client/zzcb;)V

    return-void
.end method

.method public final zzH(Lcom/daaw/s23;)V
    .locals 0

    return-void
.end method

.method public final zzI(Lcom/google/android/gms/ads/internal/client/zzw;)V
    .locals 0

    return-void
.end method

.method public final zzJ(Lcom/google/android/gms/ads/internal/client/zzci;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    invoke-virtual {v0, p1}, Lcom/daaw/az5;->d0(Lcom/google/android/gms/ads/internal/client/zzci;)V

    return-void
.end method

.method public final zzK(Lcom/google/android/gms/ads/internal/client/zzdu;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized zzL(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "setImmersiveMode must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/daaw/iz5;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzM(Lcom/daaw/qr3;)V
    .locals 0

    return-void
.end method

.method public final zzN(Z)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized zzO(Lcom/daaw/fa3;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "setOnCustomRenderedAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/iz5;->r:Lcom/daaw/qf6;

    invoke-virtual {v0, p1}, Lcom/daaw/qf6;->h(Lcom/daaw/fa3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzP(Lcom/google/android/gms/ads/internal/client/zzdg;)V
    .locals 1

    const-string v0, "setPaidEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    invoke-virtual {v0, p1}, Lcom/daaw/az5;->S(Lcom/google/android/gms/ads/internal/client/zzdg;)V

    return-void
.end method

.method public final zzQ(Lcom/daaw/os3;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzR(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzS(Lcom/daaw/iv3;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/iz5;->v:Lcom/daaw/tg6;

    invoke-virtual {v0, p1}, Lcom/daaw/tg6;->S(Lcom/daaw/iv3;)V

    return-void
.end method

.method public final zzT(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzU(Lcom/google/android/gms/ads/internal/client/zzfl;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized zzW(Lcom/daaw/yd0;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    if-nez v0, :cond_0

    const-string p1, "Interstitial can not be shown before loaded."

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    const/16 v0, 0x9

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/az5;->A(Lcom/google/android/gms/ads/internal/client/zze;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    iget-boolean v1, p0, Lcom/daaw/iz5;->x:Z

    invoke-virtual {v0, v1, p1}, Lcom/daaw/oz4;->i(ZLandroid/app/Activity;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzX()V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "showInterstitial must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Interstitial can not be shown before loaded."

    invoke-static {v0}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    const/16 v2, 0x9

    invoke-static {v2, v1, v1}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/az5;->A(Lcom/google/android/gms/ads/internal/client/zze;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-boolean v2, p0, Lcom/daaw/iz5;->x:Z

    invoke-virtual {v0, v2, v1}, Lcom/daaw/oz4;->i(ZLandroid/app/Activity;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzY()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/iz5;->r:Lcom/daaw/qf6;

    invoke-virtual {v0}, Lcom/daaw/qf6;->zza()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzZ()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/iz5;->i3()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzaa(Lcom/google/android/gms/ads/internal/client/zzl;)Z
    .locals 5

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/ya3;->i:Lcom/daaw/ma3;

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

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/iz5;->t:Lcom/google/android/gms/internal/ads/zzchu;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    sget-object v3, Lcom/daaw/g93;->o9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lt v2, v3, :cond_1

    if-nez v0, :cond_2

    :cond_1
    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v0, p0, Lcom/daaw/iz5;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzD(Landroid/content/Context;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    if-nez v0, :cond_4

    const-string p1, "Failed to load the ad because app ID is missing."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    if-eqz p1, :cond_3

    const/4 v0, 0x4

    invoke-static {v0, v2, v2}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/az5;->b(Lcom/google/android/gms/ads/internal/client/zze;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return v1

    :cond_4
    :try_start_1
    invoke-virtual {p0}, Lcom/daaw/iz5;->i3()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_5

    monitor-exit p0

    return v1

    :cond_5
    :try_start_2
    iget-object v0, p0, Lcom/daaw/iz5;->q:Landroid/content/Context;

    iget-boolean v1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    invoke-static {v0, v1}, Lcom/daaw/nj6;->a(Landroid/content/Context;Z)V

    iput-object v2, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    iget-object v0, p0, Lcom/daaw/iz5;->r:Lcom/daaw/qf6;

    iget-object v1, p0, Lcom/daaw/iz5;->s:Ljava/lang/String;

    new-instance v2, Lcom/daaw/jf6;

    iget-object v3, p0, Lcom/daaw/iz5;->p:Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-direct {v2, v3}, Lcom/daaw/jf6;-><init>(Lcom/google/android/gms/ads/internal/client/zzq;)V

    new-instance v3, Lcom/daaw/hz5;

    invoke-direct {v3, p0}, Lcom/daaw/hz5;-><init>(Lcom/daaw/iz5;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/daaw/qf6;->a(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/oz5;Lcom/daaw/pz5;)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzab(Lcom/google/android/gms/ads/internal/client/zzcf;)V
    .locals 0

    return-void
.end method

.method public final zzd()Landroid/os/Bundle;
    .locals 1

    const-string v0, "getAdMetadata must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final zzg()Lcom/google/android/gms/ads/internal/client/zzq;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/ads/internal/client/zzbh;
    .locals 1

    iget-object v0, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    invoke-virtual {v0}, Lcom/daaw/az5;->k()Lcom/google/android/gms/ads/internal/client/zzbh;

    move-result-object v0

    return-object v0
.end method

.method public final zzj()Lcom/google/android/gms/ads/internal/client/zzcb;
    .locals 1

    iget-object v0, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    invoke-virtual {v0}, Lcom/daaw/az5;->l()Lcom/google/android/gms/ads/internal/client/zzcb;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized zzk()Lcom/google/android/gms/ads/internal/client/zzdn;
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
    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-object v1

    :cond_1
    :try_start_2
    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzl()Lcom/google/android/gms/ads/internal/client/zzdq;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzn()Lcom/daaw/yd0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized zzr()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/iz5;->s:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzs()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

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

.method public final declared-synchronized zzt()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

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

.method public final declared-synchronized zzx()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/zl4;->d()Lcom/daaw/nr4;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/nr4;->C0(Landroid/content/Context;)V
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

.method public final zzy(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/google/android/gms/ads/internal/client/zzbk;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/iz5;->u:Lcom/daaw/az5;

    invoke-virtual {v0, p2}, Lcom/daaw/az5;->M(Lcom/google/android/gms/ads/internal/client/zzbk;)V

    invoke-virtual {p0, p1}, Lcom/daaw/iz5;->zzaa(Lcom/google/android/gms/ads/internal/client/zzl;)Z

    return-void
.end method

.method public final declared-synchronized zzz()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/iz5;->w:Lcom/daaw/oz4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/zl4;->d()Lcom/daaw/nr4;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/nr4;->D0(Landroid/content/Context;)V
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
