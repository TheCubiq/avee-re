.class public final Lcom/daaw/cj4;
.super Lcom/daaw/zi4;
.source ""


# instance fields
.field public final i:Landroid/content/Context;

.field public final j:Landroid/view/View;

.field public final k:Lcom/daaw/a74;

.field public final l:Lcom/daaw/uh6;

.field public final m:Lcom/daaw/xl4;

.field public final n:Lcom/daaw/u35;

.field public final o:Lcom/daaw/xy4;

.field public final p:Lcom/daaw/qz7;

.field public final q:Ljava/util/concurrent/Executor;

.field public r:Lcom/google/android/gms/ads/internal/client/zzq;


# direct methods
.method public constructor <init>(Lcom/daaw/yl4;Landroid/content/Context;Lcom/daaw/uh6;Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/u35;Lcom/daaw/xy4;Lcom/daaw/qz7;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/zi4;-><init>(Lcom/daaw/yl4;)V

    iput-object p2, p0, Lcom/daaw/cj4;->i:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/cj4;->j:Landroid/view/View;

    iput-object p5, p0, Lcom/daaw/cj4;->k:Lcom/daaw/a74;

    iput-object p3, p0, Lcom/daaw/cj4;->l:Lcom/daaw/uh6;

    iput-object p6, p0, Lcom/daaw/cj4;->m:Lcom/daaw/xl4;

    iput-object p7, p0, Lcom/daaw/cj4;->n:Lcom/daaw/u35;

    iput-object p8, p0, Lcom/daaw/cj4;->o:Lcom/daaw/xy4;

    iput-object p9, p0, Lcom/daaw/cj4;->p:Lcom/daaw/qz7;

    iput-object p10, p0, Lcom/daaw/cj4;->q:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic o(Lcom/daaw/cj4;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/cj4;->n:Lcom/daaw/u35;

    invoke-virtual {v0}, Lcom/daaw/u35;->e()Lcom/daaw/je3;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/u35;->e()Lcom/daaw/je3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/cj4;->p:Lcom/daaw/qz7;

    invoke-interface {v1}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/ads/internal/client/zzbu;

    iget-object p0, p0, Lcom/daaw/cj4;->i:Landroid/content/Context;

    invoke-static {p0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Lcom/daaw/je3;->U0(Lcom/google/android/gms/ads/internal/client/zzbu;Lcom/daaw/yd0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string v0, "RemoteException when notifyAdLoad is called"

    invoke-static {v0, p0}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/cj4;->q:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/bj4;

    invoke-direct {v1, p0}, Lcom/daaw/bj4;-><init>(Lcom/daaw/cj4;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-super {p0}, Lcom/daaw/zl4;->b()V

    return-void
.end method

.method public final h()I
    .locals 2

    sget-object v0, Lcom/daaw/g93;->Z6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/zl4;->b:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->i0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/g93;->a7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/zl4;->a:Lcom/daaw/fi6;

    iget-object v0, v0, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget v0, v0, Lcom/daaw/wh6;->c:I

    return v0
.end method

.method public final i()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cj4;->j:Landroid/view/View;

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/ads/internal/client/zzdq;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/cj4;->m:Lcom/daaw/xl4;

    invoke-interface {v0}, Lcom/daaw/xl4;->zza()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0
    :try_end_0
    .catch Lcom/daaw/wi6; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()Lcom/daaw/uh6;
    .locals 4

    iget-object v0, p0, Lcom/daaw/cj4;->r:Lcom/google/android/gms/ads/internal/client/zzq;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/daaw/vi6;->c(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/uh6;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/zl4;->b:Lcom/daaw/th6;

    iget-boolean v1, v0, Lcom/daaw/th6;->d0:Z

    if-eqz v1, :cond_3

    iget-object v0, v0, Lcom/daaw/th6;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "FirstParty"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/daaw/uh6;

    iget-object v1, p0, Lcom/daaw/cj4;->j:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/cj4;->j:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/uh6;-><init>(IIZ)V

    return-object v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/daaw/zl4;->b:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->s:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/cj4;->l:Lcom/daaw/uh6;

    invoke-static {v0, v1}, Lcom/daaw/vi6;->b(Ljava/util/List;Lcom/daaw/uh6;)Lcom/daaw/uh6;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lcom/daaw/uh6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cj4;->l:Lcom/daaw/uh6;

    return-object v0
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/cj4;->o:Lcom/daaw/xy4;

    invoke-virtual {v0}, Lcom/daaw/xy4;->zza()V

    return-void
.end method

.method public final n(Landroid/view/ViewGroup;Lcom/google/android/gms/ads/internal/client/zzq;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/cj4;->k:Lcom/daaw/a74;

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/daaw/v84;->c(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/v84;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/a74;->Q(Lcom/daaw/v84;)V

    iget v0, p2, Lcom/google/android/gms/ads/internal/client/zzq;->zzc:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setMinimumHeight(I)V

    iget v0, p2, Lcom/google/android/gms/ads/internal/client/zzq;->zzf:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setMinimumWidth(I)V

    iput-object p2, p0, Lcom/daaw/cj4;->r:Lcom/google/android/gms/ads/internal/client/zzq;

    :cond_0
    return-void
.end method
