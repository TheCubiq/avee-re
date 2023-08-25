.class public final Lcom/daaw/yx5;
.super Lcom/google/android/gms/ads/internal/client/zzbt;
.source ""


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/google/android/gms/ads/internal/client/zzbh;

.field public final r:Lcom/daaw/ri6;

.field public final s:Lcom/daaw/zi4;

.field public final t:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzbh;Lcom/daaw/ri6;Lcom/daaw/zi4;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzbt;-><init>()V

    iput-object p1, p0, Lcom/daaw/yx5;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/yx5;->q:Lcom/google/android/gms/ads/internal/client/zzbh;

    iput-object p3, p0, Lcom/daaw/yx5;->r:Lcom/daaw/ri6;

    iput-object p4, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p4}, Lcom/daaw/zi4;->i()Landroid/view/View;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zzs;->zzn()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Lcom/daaw/yx5;->zzg()Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object p1

    iget p1, p1, Lcom/google/android/gms/ads/internal/client/zzq;->zzc:I

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->setMinimumHeight(I)V

    invoke-virtual {p0}, Lcom/daaw/yx5;->zzg()Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object p1

    iget p1, p1, Lcom/google/android/gms/ads/internal/client/zzq;->zzf:I

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->setMinimumWidth(I)V

    iput-object p2, p0, Lcom/daaw/yx5;->t:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final zzA()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zi4;->m()V

    return-void
.end method

.method public final zzB()V
    .locals 2

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zl4;->d()Lcom/daaw/nr4;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/nr4;->E0(Landroid/content/Context;)V

    return-void
.end method

.method public final zzC(Lcom/google/android/gms/ads/internal/client/zzbe;)V
    .locals 0

    const-string p1, "setAdClickListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    return-void
.end method

.method public final zzD(Lcom/google/android/gms/ads/internal/client/zzbh;)V
    .locals 0

    const-string p1, "setAdListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    return-void
.end method

.method public final zzE(Lcom/google/android/gms/ads/internal/client/zzby;)V
    .locals 0

    const-string p1, "setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    return-void
.end method

.method public final zzF(Lcom/google/android/gms/ads/internal/client/zzq;)V
    .locals 2

    const-string v0, "setAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/yx5;->t:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/zi4;->n(Landroid/view/ViewGroup;Lcom/google/android/gms/ads/internal/client/zzq;)V

    :cond_0
    return-void
.end method

.method public final zzG(Lcom/google/android/gms/ads/internal/client/zzcb;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->r:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->c:Lcom/daaw/az5;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/az5;->W(Lcom/google/android/gms/ads/internal/client/zzcb;)V

    :cond_0
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
    .locals 0

    return-void
.end method

.method public final zzK(Lcom/google/android/gms/ads/internal/client/zzdu;)V
    .locals 0

    return-void
.end method

.method public final zzL(Z)V
    .locals 0

    return-void
.end method

.method public final zzM(Lcom/daaw/qr3;)V
    .locals 0

    return-void
.end method

.method public final zzN(Z)V
    .locals 0

    const-string p1, "setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    return-void
.end method

.method public final zzO(Lcom/daaw/fa3;)V
    .locals 0

    const-string p1, "setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    return-void
.end method

.method public final zzP(Lcom/google/android/gms/ads/internal/client/zzdg;)V
    .locals 2

    sget-object v0, Lcom/daaw/g93;->A9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/yx5;->r:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->c:Lcom/daaw/az5;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/az5;->S(Lcom/google/android/gms/ads/internal/client/zzdg;)V

    :cond_0
    return-void

    :cond_1
    const-string p1, "setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

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
    .locals 0

    return-void
.end method

.method public final zzT(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzU(Lcom/google/android/gms/ads/internal/client/zzfl;)V
    .locals 0

    const-string p1, "setVideoOptions is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    return-void
.end method

.method public final zzW(Lcom/daaw/yd0;)V
    .locals 0

    return-void
.end method

.method public final zzX()V
    .locals 0

    return-void
.end method

.method public final zzY()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zzZ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zzaa(Lcom/google/android/gms/ads/internal/client/zzl;)Z
    .locals 0

    const-string p1, "loadAd is not supported for an Ad Manager AdView returned from AdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final zzab(Lcom/google/android/gms/ads/internal/client/zzcf;)V
    .locals 0

    const-string p1, "setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    return-void
.end method

.method public final zzd()Landroid/os/Bundle;
    .locals 1

    const-string v0, "getAdMetadata is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {v0}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final zzg()Lcom/google/android/gms/ads/internal/client/zzq;
    .locals 2

    const-string v0, "getAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/yx5;->p:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v1}, Lcom/daaw/zi4;->k()Lcom/daaw/uh6;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/vi6;->a(Landroid/content/Context;Ljava/util/List;)Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/ads/internal/client/zzbh;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->q:Lcom/google/android/gms/ads/internal/client/zzbh;

    return-object v0
.end method

.method public final zzj()Lcom/google/android/gms/ads/internal/client/zzcb;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->r:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->n:Lcom/google/android/gms/ads/internal/client/zzcb;

    return-object v0
.end method

.method public final zzk()Lcom/google/android/gms/ads/internal/client/zzdn;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0

    return-object v0
.end method

.method public final zzl()Lcom/google/android/gms/ads/internal/client/zzdq;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zi4;->j()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    return-object v0
.end method

.method public final zzn()Lcom/daaw/yd0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->t:Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    return-object v0
.end method

.method public final zzr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->r:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final zzs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/eq4;->zzg()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/eq4;->zzg()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzx()V
    .locals 1

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zl4;->a()V

    return-void
.end method

.method public final zzy(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/google/android/gms/ads/internal/client/zzbk;)V
    .locals 0

    return-void
.end method

.method public final zzz()V
    .locals 2

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/yx5;->s:Lcom/daaw/zi4;

    invoke-virtual {v0}, Lcom/daaw/zl4;->d()Lcom/daaw/nr4;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/nr4;->D0(Landroid/content/Context;)V

    return-void
.end method
