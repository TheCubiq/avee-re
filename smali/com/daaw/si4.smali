.class public final Lcom/daaw/si4;
.super Lcom/daaw/zl4;
.source ""


# instance fields
.field public final i:Lcom/daaw/a74;

.field public final j:I

.field public final k:Landroid/content/Context;

.field public final l:Lcom/daaw/wh4;

.field public final m:Lcom/daaw/c15;

.field public final n:Lcom/daaw/by4;

.field public final o:Lcom/daaw/br4;

.field public final p:Z

.field public q:Z


# direct methods
.method public constructor <init>(Lcom/daaw/yl4;Landroid/content/Context;Lcom/daaw/a74;ILcom/daaw/wh4;Lcom/daaw/c15;Lcom/daaw/by4;Lcom/daaw/br4;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/zl4;-><init>(Lcom/daaw/yl4;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/si4;->q:Z

    iput-object p3, p0, Lcom/daaw/si4;->i:Lcom/daaw/a74;

    iput-object p2, p0, Lcom/daaw/si4;->k:Landroid/content/Context;

    iput p4, p0, Lcom/daaw/si4;->j:I

    iput-object p5, p0, Lcom/daaw/si4;->l:Lcom/daaw/wh4;

    iput-object p6, p0, Lcom/daaw/si4;->m:Lcom/daaw/c15;

    iput-object p7, p0, Lcom/daaw/si4;->n:Lcom/daaw/by4;

    iput-object p8, p0, Lcom/daaw/si4;->o:Lcom/daaw/br4;

    sget-object p1, Lcom/daaw/g93;->L4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/si4;->p:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/zl4;->a()V

    iget-object v0, p0, Lcom/daaw/si4;->i:Lcom/daaw/a74;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/a74;->destroy()V

    :cond_0
    return-void
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lcom/daaw/si4;->j:I

    return v0
.end method

.method public final i(Lcom/daaw/j23;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/si4;->i:Lcom/daaw/a74;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/daaw/a74;->u0(Lcom/daaw/j23;)V

    :cond_0
    return-void
.end method

.method public final j(Landroid/app/Activity;Lcom/daaw/w23;Z)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/si4;->k:Landroid/content/Context;

    :cond_0
    iget-boolean p2, p0, Lcom/daaw/si4;->p:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/daaw/si4;->n:Lcom/daaw/by4;

    invoke-virtual {p2}, Lcom/daaw/by4;->zzb()V

    :cond_1
    sget-object p2, Lcom/daaw/g93;->y0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzC(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"

    invoke-static {p2}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/si4;->o:Lcom/daaw/br4;

    invoke-virtual {p2}, Lcom/daaw/br4;->zzb()V

    sget-object p2, Lcom/daaw/g93;->z0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Lcom/daaw/ss6;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzt()Lcom/google/android/gms/ads/internal/util/zzbv;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/ads/internal/util/zzbv;->zzb()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lcom/daaw/ss6;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    iget-object p1, p0, Lcom/daaw/zl4;->a:Lcom/daaw/fi6;

    iget-object p1, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object p1, p1, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object p1, p1, Lcom/daaw/wh6;->b:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/daaw/ss6;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-boolean p2, p0, Lcom/daaw/si4;->q:Z

    if-eqz p2, :cond_3

    const-string p2, "App open interstitial ad is already visible."

    invoke-static {p2}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/si4;->o:Lcom/daaw/br4;

    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/br4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    :cond_3
    iget-boolean p2, p0, Lcom/daaw/si4;->q:Z

    if-nez p2, :cond_5

    :try_start_0
    iget-object p2, p0, Lcom/daaw/si4;->m:Lcom/daaw/c15;

    iget-object v0, p0, Lcom/daaw/si4;->o:Lcom/daaw/br4;

    invoke-interface {p2, p3, p1, v0}, Lcom/daaw/c15;->a(ZLandroid/content/Context;Lcom/daaw/br4;)V

    iget-boolean p1, p0, Lcom/daaw/si4;->p:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/si4;->n:Lcom/daaw/by4;

    invoke-virtual {p1}, Lcom/daaw/by4;->zza()V
    :try_end_0
    .catch Lcom/daaw/b15; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/si4;->q:Z

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/daaw/si4;->o:Lcom/daaw/br4;

    invoke-virtual {p2, p1}, Lcom/daaw/br4;->s(Lcom/daaw/b15;)V

    :cond_5
    return-void
.end method

.method public final k(JI)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/si4;->l:Lcom/daaw/wh4;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/wh4;->a(JI)V

    return-void
.end method
