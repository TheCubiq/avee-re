.class public final Lcom/daaw/s75;
.super Lcom/daaw/lj3;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Lcom/daaw/cc3;


# instance fields
.field public p:Landroid/view/View;

.field public q:Lcom/google/android/gms/ads/internal/client/zzdq;

.field public r:Lcom/daaw/e35;

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Lcom/daaw/e35;Lcom/daaw/j35;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/lj3;-><init>()V

    invoke-virtual {p2}, Lcom/daaw/j35;->N()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    invoke-virtual {p2}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/s75;->q:Lcom/google/android/gms/ads/internal/client/zzdq;

    iput-object p1, p0, Lcom/daaw/s75;->r:Lcom/daaw/e35;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/s75;->s:Z

    iput-boolean p1, p0, Lcom/daaw/s75;->t:Z

    invoke-virtual {p2}, Lcom/daaw/j35;->Z()Lcom/daaw/a74;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/daaw/j35;->Z()Lcom/daaw/a74;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/daaw/a74;->q0(Lcom/daaw/cc3;)V

    :cond_0
    return-void
.end method

.method public static final g3(Lcom/daaw/pj3;I)V
    .locals 0

    :try_start_0
    invoke-interface {p0, p1}, Lcom/daaw/pj3;->zze(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "#007 Could not call remote method."

    invoke-static {p1, p0}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final R(Lcom/daaw/yd0;Lcom/daaw/pj3;)V
    .locals 3

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/s75;->s:Z

    if-eqz v0, :cond_0

    const-string p1, "Instream ad can not be shown after destroy()."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-static {p2, p1}, Lcom/daaw/s75;->g3(Lcom/daaw/pj3;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/daaw/s75;->q:Lcom/google/android/gms/ads/internal/client/zzdq;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/s75;->t:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const-string p1, "Instream ad should not be used again."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    invoke-static {p2, v1}, Lcom/daaw/s75;->g3(Lcom/daaw/pj3;I)V

    return-void

    :cond_2
    iput-boolean v1, p0, Lcom/daaw/s75;->t:Z

    invoke-virtual {p0}, Lcom/daaw/s75;->zzh()V

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzx()Lcom/daaw/m14;

    iget-object p1, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    invoke-static {p1, p0}, Lcom/daaw/m14;->a(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzx()Lcom/daaw/m14;

    iget-object p1, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    invoke-static {p1, p0}, Lcom/daaw/m14;->b(Landroid/view/View;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Lcom/daaw/s75;->zzg()V

    :try_start_0
    invoke-interface {p2}, Lcom/daaw/pj3;->zzf()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_0
    if-nez v0, :cond_4

    const-string p1, "can not get video view."

    goto :goto_1

    :cond_4
    const-string p1, "can not get video controller."

    :goto_1
    const-string v0, "Instream internal error: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p2, p1}, Lcom/daaw/s75;->g3(Lcom/daaw/pj3;I)V

    return-void
.end method

.method public final onGlobalLayout()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/s75;->zzg()V

    return-void
.end method

.method public final onScrollChanged()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/s75;->zzg()V

    return-void
.end method

.method public final zzb()Lcom/google/android/gms/ads/internal/client/zzdq;
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/s75;->s:Z

    if-eqz v0, :cond_0

    const-string v0, "getVideoController: Instream ad should not be used after destroyed"

    invoke-static {v0}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/s75;->q:Lcom/google/android/gms/ads/internal/client/zzdq;

    return-object v0
.end method

.method public final zzc()Lcom/daaw/sc3;
    .locals 3

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/s75;->s:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "getVideoController: Instream ad should not be used after destroyed"

    invoke-static {v0}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/s75;->r:Lcom/daaw/e35;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/e35;->I()Lcom/daaw/g35;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/daaw/e35;->I()Lcom/daaw/g35;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/g35;->a()Lcom/daaw/sc3;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final zzd()V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/s75;->zzh()V

    iget-object v0, p0, Lcom/daaw/s75;->r:Lcom/daaw/e35;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/zl4;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/s75;->r:Lcom/daaw/e35;

    iput-object v0, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    iput-object v0, p0, Lcom/daaw/s75;->q:Lcom/google/android/gms/ads/internal/client/zzdq;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/s75;->s:Z

    return-void
.end method

.method public final zze(Lcom/daaw/yd0;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/r75;

    invoke-direct {v0, p0}, Lcom/daaw/r75;-><init>(Lcom/daaw/s75;)V

    invoke-virtual {p0, p1, v0}, Lcom/daaw/s75;->R(Lcom/daaw/yd0;Lcom/daaw/pj3;)V

    return-void
.end method

.method public final zzg()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/s75;->r:Lcom/daaw/e35;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v2

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    invoke-static {v4}, Lcom/daaw/e35;->A(Landroid/view/View;)Z

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/e35;->X(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V

    :cond_0
    return-void
.end method

.method public final zzh()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/daaw/s75;->p:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    return-void
.end method
