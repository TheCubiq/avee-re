.class public final Lcom/daaw/j95;
.super Lcom/daaw/zl4;
.source ""


# instance fields
.field public final i:Landroid/content/Context;

.field public final j:Ljava/lang/ref/WeakReference;

.field public final k:Lcom/daaw/c15;

.field public final l:Lcom/daaw/by4;

.field public final m:Lcom/daaw/br4;

.field public final n:Lcom/daaw/ls4;

.field public final o:Lcom/daaw/wm4;

.field public final p:Lcom/daaw/tv3;

.field public final q:Lcom/daaw/ss6;

.field public final r:Lcom/daaw/hi6;

.field public s:Z


# direct methods
.method public constructor <init>(Lcom/daaw/yl4;Landroid/content/Context;Lcom/daaw/a74;Lcom/daaw/c15;Lcom/daaw/by4;Lcom/daaw/br4;Lcom/daaw/ls4;Lcom/daaw/wm4;Lcom/daaw/th6;Lcom/daaw/ss6;Lcom/daaw/hi6;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/zl4;-><init>(Lcom/daaw/yl4;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/j95;->s:Z

    iput-object p2, p0, Lcom/daaw/j95;->i:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/j95;->k:Lcom/daaw/c15;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/j95;->j:Ljava/lang/ref/WeakReference;

    iput-object p5, p0, Lcom/daaw/j95;->l:Lcom/daaw/by4;

    iput-object p6, p0, Lcom/daaw/j95;->m:Lcom/daaw/br4;

    iput-object p7, p0, Lcom/daaw/j95;->n:Lcom/daaw/ls4;

    iput-object p8, p0, Lcom/daaw/j95;->o:Lcom/daaw/wm4;

    iput-object p10, p0, Lcom/daaw/j95;->q:Lcom/daaw/ss6;

    new-instance p1, Lcom/daaw/pw3;

    iget-object p2, p9, Lcom/daaw/th6;->m:Lcom/google/android/gms/internal/ads/zzcdd;

    if-eqz p2, :cond_0

    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzcdd;->p:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p3, ""

    :goto_0
    if-eqz p2, :cond_1

    iget p2, p2, Lcom/google/android/gms/internal/ads/zzcdd;->q:I

    goto :goto_1

    :cond_1
    const/4 p2, 0x1

    :goto_1
    invoke-direct {p1, p3, p2}, Lcom/daaw/pw3;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lcom/daaw/j95;->p:Lcom/daaw/tv3;

    iput-object p11, p0, Lcom/daaw/j95;->r:Lcom/daaw/hi6;

    return-void
.end method


# virtual methods
.method public final finalize()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/j95;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/a74;

    sget-object v1, Lcom/daaw/g93;->g6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/daaw/j95;->s:Z

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    sget-object v1, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    new-instance v2, Lcom/daaw/i95;

    invoke-direct {v2, v0}, Lcom/daaw/i95;-><init>(Lcom/daaw/a74;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/a74;->destroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public final h()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j95;->n:Lcom/daaw/ls4;

    invoke-virtual {v0}, Lcom/daaw/ls4;->C0()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final i()Lcom/daaw/tv3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j95;->p:Lcom/daaw/tv3;

    return-object v0
.end method

.method public final j()Lcom/daaw/hi6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j95;->r:Lcom/daaw/hi6;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/j95;->o:Lcom/daaw/wm4;

    invoke-virtual {v0}, Lcom/daaw/wm4;->a()Z

    move-result v0

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/j95;->s:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/j95;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/a74;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/a74;->V()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final n(ZLandroid/app/Activity;)Z
    .locals 4

    sget-object v0, Lcom/daaw/g93;->y0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v0, p0, Lcom/daaw/j95;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzC(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies"

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/j95;->m:Lcom/daaw/br4;

    invoke-virtual {p1}, Lcom/daaw/br4;->zzb()V

    sget-object p1, Lcom/daaw/g93;->z0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/j95;->q:Lcom/daaw/ss6;

    iget-object p2, p0, Lcom/daaw/zl4;->a:Lcom/daaw/fi6;

    iget-object p2, p2, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object p2, p2, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object p2, p2, Lcom/daaw/wh6;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/daaw/ss6;->a(Ljava/lang/String;)V

    :cond_0
    return v1

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/j95;->s:Z

    if-eqz v0, :cond_2

    const-string p1, "The rewarded ad have been showed."

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/j95;->m:Lcom/daaw/br4;

    const/16 p2, 0xa

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/br4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return v1

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/j95;->s:Z

    iget-object v2, p0, Lcom/daaw/j95;->l:Lcom/daaw/by4;

    invoke-virtual {v2}, Lcom/daaw/by4;->zzb()V

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/daaw/j95;->i:Landroid/content/Context;

    :cond_3
    :try_start_0
    iget-object v2, p0, Lcom/daaw/j95;->k:Lcom/daaw/c15;

    iget-object v3, p0, Lcom/daaw/j95;->m:Lcom/daaw/br4;

    invoke-interface {v2, p1, p2, v3}, Lcom/daaw/c15;->a(ZLandroid/content/Context;Lcom/daaw/br4;)V

    iget-object p1, p0, Lcom/daaw/j95;->l:Lcom/daaw/by4;

    invoke-virtual {p1}, Lcom/daaw/by4;->zza()V
    :try_end_0
    .catch Lcom/daaw/b15; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/daaw/j95;->m:Lcom/daaw/br4;

    invoke-virtual {p2, p1}, Lcom/daaw/br4;->s(Lcom/daaw/b15;)V

    return v1
.end method
