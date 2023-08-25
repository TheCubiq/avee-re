.class public final Lcom/daaw/oz4;
.super Lcom/daaw/zl4;
.source ""


# instance fields
.field public final i:Landroid/content/Context;

.field public final j:Ljava/lang/ref/WeakReference;

.field public final k:Lcom/daaw/by4;

.field public final l:Lcom/daaw/c15;

.field public final m:Lcom/daaw/wm4;

.field public final n:Lcom/daaw/ss6;

.field public final o:Lcom/daaw/br4;

.field public p:Z


# direct methods
.method public constructor <init>(Lcom/daaw/yl4;Landroid/content/Context;Lcom/daaw/a74;Lcom/daaw/by4;Lcom/daaw/c15;Lcom/daaw/wm4;Lcom/daaw/ss6;Lcom/daaw/br4;)V
    .locals 0
    .param p3    # Lcom/daaw/a74;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lcom/daaw/zl4;-><init>(Lcom/daaw/yl4;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/oz4;->p:Z

    iput-object p2, p0, Lcom/daaw/oz4;->i:Landroid/content/Context;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/oz4;->j:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lcom/daaw/oz4;->k:Lcom/daaw/by4;

    iput-object p5, p0, Lcom/daaw/oz4;->l:Lcom/daaw/c15;

    iput-object p6, p0, Lcom/daaw/oz4;->m:Lcom/daaw/wm4;

    iput-object p7, p0, Lcom/daaw/oz4;->n:Lcom/daaw/ss6;

    iput-object p8, p0, Lcom/daaw/oz4;->o:Lcom/daaw/br4;

    return-void
.end method


# virtual methods
.method public final finalize()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/oz4;->j:Ljava/lang/ref/WeakReference;

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

    iget-boolean v1, p0, Lcom/daaw/oz4;->p:Z

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    sget-object v1, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    new-instance v2, Lcom/daaw/nz4;

    invoke-direct {v2, v0}, Lcom/daaw/nz4;-><init>(Lcom/daaw/a74;)V

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

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz4;->m:Lcom/daaw/wm4;

    invoke-virtual {v0}, Lcom/daaw/wm4;->a()Z

    move-result v0

    return v0
.end method

.method public final i(ZLandroid/app/Activity;)Z
    .locals 4
    .param p2    # Landroid/app/Activity;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/daaw/oz4;->k:Lcom/daaw/by4;

    invoke-virtual {v0}, Lcom/daaw/by4;->zzb()V

    sget-object v0, Lcom/daaw/g93;->y0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v0, p0, Lcom/daaw/oz4;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzC(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/oz4;->o:Lcom/daaw/br4;

    invoke-virtual {p1}, Lcom/daaw/br4;->zzb()V

    sget-object p1, Lcom/daaw/g93;->z0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/oz4;->n:Lcom/daaw/ss6;

    iget-object p2, p0, Lcom/daaw/zl4;->a:Lcom/daaw/fi6;

    iget-object p2, p2, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object p2, p2, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object p2, p2, Lcom/daaw/wh6;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/daaw/ss6;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/oz4;->p:Z

    if-eqz v0, :cond_1

    const-string v0, "The interstitial ad has been showed."

    invoke-static {v0}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/oz4;->o:Lcom/daaw/br4;

    const/16 v2, 0xa

    const/4 v3, 0x0

    invoke-static {v2, v3, v3}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/br4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/oz4;->p:Z

    if-nez v0, :cond_3

    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/daaw/oz4;->i:Landroid/content/Context;

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/daaw/oz4;->l:Lcom/daaw/c15;

    iget-object v2, p0, Lcom/daaw/oz4;->o:Lcom/daaw/br4;

    invoke-interface {v0, p1, p2, v2}, Lcom/daaw/c15;->a(ZLandroid/content/Context;Lcom/daaw/br4;)V

    iget-object p1, p0, Lcom/daaw/oz4;->k:Lcom/daaw/by4;

    invoke-virtual {p1}, Lcom/daaw/by4;->zza()V
    :try_end_0
    .catch Lcom/daaw/b15; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/oz4;->p:Z

    return p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/daaw/oz4;->o:Lcom/daaw/br4;

    invoke-virtual {p2, p1}, Lcom/daaw/br4;->s(Lcom/daaw/b15;)V

    :cond_3
    :goto_0
    return v1
.end method
