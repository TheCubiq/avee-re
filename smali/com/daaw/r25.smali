.class public final Lcom/daaw/r25;
.super Lcom/daaw/rc3;
.source ""


# instance fields
.field public final p:Lcom/daaw/j35;

.field public q:Lcom/daaw/yd0;


# direct methods
.method public constructor <init>(Lcom/daaw/j35;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/rc3;-><init>()V

    iput-object p1, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    return-void
.end method

.method public static g3(Lcom/daaw/yd0;)F
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-static {p0}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/drawable/Drawable;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr v0, p0

    :cond_1
    return v0
.end method


# virtual methods
.method public final p0(Lcom/daaw/ge3;)V
    .locals 2

    sget-object v0, Lcom/daaw/g93;->I5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    instance-of v0, v0, Lcom/daaw/z74;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    check-cast v0, Lcom/daaw/z74;

    invoke-virtual {v0, p1}, Lcom/daaw/z74;->l3(Lcom/daaw/ge3;)V

    :cond_1
    return-void
.end method

.method public final zze()F
    .locals 4

    sget-object v0, Lcom/daaw/g93;->H5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->J()F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->J()F

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/zzdq;->zze()F

    move-result v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Remote exception getting video controller aspect ratio."

    invoke-static {v2, v0}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return v1

    :cond_2
    iget-object v0, p0, Lcom/daaw/r25;->q:Lcom/daaw/yd0;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/daaw/r25;->g3(Lcom/daaw/yd0;)F

    move-result v1

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->U()Lcom/daaw/vc3;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Lcom/daaw/vc3;->zzd()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    invoke-interface {v0}, Lcom/daaw/vc3;->zzc()I

    move-result v2

    if-eq v2, v3, :cond_5

    invoke-interface {v0}, Lcom/daaw/vc3;->zzd()I

    move-result v2

    int-to-float v2, v2

    invoke-interface {v0}, Lcom/daaw/vc3;->zzc()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    cmpl-float v1, v2, v1

    if-nez v1, :cond_6

    invoke-interface {v0}, Lcom/daaw/vc3;->zzf()Lcom/daaw/yd0;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/r25;->g3(Lcom/daaw/yd0;)F

    move-result v0

    return v0

    :cond_6
    move v1, v2

    :goto_2
    return v1
.end method

.method public final zzf()F
    .locals 2

    sget-object v0, Lcom/daaw/g93;->I5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/zzdq;->zzf()F

    move-result v0

    return v0

    :cond_1
    return v1
.end method

.method public final zzg()F
    .locals 2

    sget-object v0, Lcom/daaw/g93;->I5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/zzdq;->zzg()F

    move-result v0

    return v0

    :cond_1
    return v1
.end method

.method public final zzh()Lcom/google/android/gms/ads/internal/client/zzdq;
    .locals 2

    sget-object v0, Lcom/daaw/g93;->I5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Lcom/daaw/yd0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/r25;->q:Lcom/daaw/yd0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->U()Lcom/daaw/vc3;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Lcom/daaw/vc3;->zzf()Lcom/daaw/yd0;

    move-result-object v0

    return-object v0
.end method

.method public final zzj(Lcom/daaw/yd0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/r25;->q:Lcom/daaw/yd0;

    return-void
.end method

.method public final zzk()Z
    .locals 2

    sget-object v0, Lcom/daaw/g93;->I5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/r25;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method
