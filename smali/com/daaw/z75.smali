.class public final Lcom/daaw/z75;
.super Lcom/daaw/rd3;
.source ""


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/j35;

.field public r:Lcom/daaw/l45;

.field public s:Lcom/daaw/e35;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/j35;Lcom/daaw/l45;Lcom/daaw/e35;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/rd3;-><init>()V

    iput-object p1, p0, Lcom/daaw/z75;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    iput-object p3, p0, Lcom/daaw/z75;->r:Lcom/daaw/l45;

    iput-object p4, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    return-void
.end method

.method public static bridge synthetic h3(Lcom/daaw/z75;)Lcom/daaw/e35;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    return-object p0
.end method


# virtual methods
.method public final F2(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->Q()Lcom/daaw/cd1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final f0(Lcom/daaw/yd0;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->c0()Lcom/daaw/yd0;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/View;

    invoke-virtual {v0, p1}, Lcom/daaw/e35;->m(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final q(Lcom/daaw/yd0;)Z
    .locals 2

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/z75;->r:Lcom/daaw/l45;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Lcom/daaw/l45;->f(Landroid/view/ViewGroup;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {p1}, Lcom/daaw/j35;->Z()Lcom/daaw/a74;

    move-result-object p1

    new-instance v0, Lcom/daaw/y75;

    invoke-direct {v0, p0}, Lcom/daaw/y75;-><init>(Lcom/daaw/z75;)V

    invoke-interface {p1, v0}, Lcom/daaw/a74;->I(Lcom/daaw/ec3;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final s(Ljava/lang/String;)Lcom/daaw/vc3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->P()Lcom/daaw/cd1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/vc3;

    return-object p1
.end method

.method public final zze()Lcom/google/android/gms/ads/internal/client/zzdq;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->R()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Lcom/daaw/sc3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    invoke-virtual {v0}, Lcom/daaw/e35;->I()Lcom/daaw/g35;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/g35;->a()Lcom/daaw/sc3;

    move-result-object v0

    return-object v0
.end method

.method public final zzh()Lcom/daaw/yd0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z75;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->g0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzk()Ljava/util/List;
    .locals 7

    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->P()Lcom/daaw/cd1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v1}, Lcom/daaw/j35;->Q()Lcom/daaw/cd1;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/cd1;->size()I

    move-result v2

    invoke-virtual {v1}, Lcom/daaw/cd1;->size()I

    move-result v3

    add-int/2addr v2, v3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/cd1;->size()I

    move-result v6

    if-ge v4, v6, :cond_0

    invoke-virtual {v0, v4}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    aput-object v6, v2, v5

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    invoke-virtual {v1}, Lcom/daaw/cd1;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    invoke-virtual {v1, v3}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v2, v5

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzl()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/zl4;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    iput-object v0, p0, Lcom/daaw/z75;->r:Lcom/daaw/l45;

    return-void
.end method

.method public final zzm()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Google"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "Illegal argument specified for omid partner name."

    invoke-static {v0}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "Not starting OMID session. OM partner name has not been configured."

    invoke-static {v0}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/daaw/e35;->R(Ljava/lang/String;Z)V

    :cond_2
    return-void
.end method

.method public final zzn(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/e35;->i(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final zzo()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/e35;->l()V

    :cond_0
    return-void
.end method

.method public final zzq()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/z75;->s:Lcom/daaw/e35;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/e35;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->Y()Lcom/daaw/a74;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->Z()Lcom/daaw/a74;

    move-result-object v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public final zzs()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->c0()Lcom/daaw/yd0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/daaw/nq5;->zzd(Lcom/daaw/yd0;)V

    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->Y()Lcom/daaw/a74;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/z75;->q:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->Y()Lcom/daaw/a74;

    move-result-object v0

    new-instance v1, Lcom/daaw/g6;

    invoke-direct {v1}, Lcom/daaw/g6;-><init>()V

    const-string v2, "onSdkLoaded"

    invoke-interface {v0, v2, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const-string v0, "Trying to start OMID session before creation."

    invoke-static {v0}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method
