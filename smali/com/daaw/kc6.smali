.class public abstract Lcom/daaw/kc6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qz5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/b94;

.field public final d:Lcom/daaw/dd6;

.field public final e:Lcom/daaw/cf6;

.field public final f:Lcom/google/android/gms/internal/ads/zzchu;

.field public final g:Landroid/view/ViewGroup;

.field public final h:Lcom/daaw/vo6;

.field public final i:Lcom/daaw/pi6;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public j:Lcom/daaw/f77;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/b94;Lcom/daaw/cf6;Lcom/daaw/dd6;Lcom/daaw/pi6;Lcom/google/android/gms/internal/ads/zzchu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kc6;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/kc6;->c:Lcom/daaw/b94;

    iput-object p4, p0, Lcom/daaw/kc6;->e:Lcom/daaw/cf6;

    iput-object p5, p0, Lcom/daaw/kc6;->d:Lcom/daaw/dd6;

    iput-object p6, p0, Lcom/daaw/kc6;->i:Lcom/daaw/pi6;

    iput-object p7, p0, Lcom/daaw/kc6;->f:Lcom/google/android/gms/internal/ads/zzchu;

    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/daaw/kc6;->g:Landroid/view/ViewGroup;

    invoke-virtual {p3}, Lcom/daaw/b94;->D()Lcom/daaw/vo6;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/kc6;->h:Lcom/daaw/vo6;

    return-void
.end method

.method public static synthetic c(Lcom/daaw/kc6;Lcom/daaw/xe6;)Lcom/daaw/qp4;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/kc6;->l(Lcom/daaw/xe6;)Lcom/daaw/qp4;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/kc6;Lcom/daaw/xe6;)Lcom/daaw/qp4;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/kc6;->l(Lcom/daaw/xe6;)Lcom/daaw/qp4;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/kc6;)Lcom/daaw/dd6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kc6;->d:Lcom/daaw/dd6;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/kc6;)Lcom/daaw/cf6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kc6;->e:Lcom/daaw/cf6;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/kc6;)Lcom/daaw/vo6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kc6;->h:Lcom/daaw/vo6;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/daaw/kc6;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/daaw/kc6;Lcom/daaw/f77;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/kc6;->j:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/oz5;Lcom/daaw/pz5;)Z
    .locals 7

    monitor-enter p0

    :try_start_0
    sget-object p3, Lcom/daaw/ya3;->d:Lcom/daaw/ma3;

    invoke-virtual {p3}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    sget-object p3, Lcom/daaw/g93;->n9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/kc6;->f:Lcom/google/android/gms/internal/ads/zzchu;

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

    if-nez p3, :cond_2

    :cond_1
    const-string p3, "loadAd must be called on the main UI thread."

    invoke-static {p3}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    :cond_2
    if-nez p2, :cond_3

    const-string p1, "Ad unit ID should not be null for app open ad."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/daaw/ec6;

    invoke-direct {p2, p0}, Lcom/daaw/ec6;-><init>(Lcom/daaw/kc6;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :cond_3
    :try_start_1
    iget-object p3, p0, Lcom/daaw/kc6;->j:Lcom/daaw/f77;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p3, :cond_4

    monitor-exit p0

    return v1

    :cond_4
    :try_start_2
    sget-object p3, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {p3}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    const/4 v1, 0x7

    const/4 v2, 0x0

    if-eqz p3, :cond_5

    iget-object p3, p0, Lcom/daaw/kc6;->e:Lcom/daaw/cf6;

    invoke-interface {p3}, Lcom/daaw/cf6;->zzd()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-interface {p3}, Lcom/daaw/cf6;->zzd()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/di4;

    invoke-interface {p3}, Lcom/daaw/rp4;->zzh()Lcom/daaw/to6;

    move-result-object p3

    invoke-virtual {p3, v1}, Lcom/daaw/to6;->h(I)Lcom/daaw/to6;

    iget-object v3, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    invoke-virtual {p3, v3}, Lcom/daaw/to6;->b(Ljava/lang/String;)Lcom/daaw/to6;

    move-object v4, p3

    goto :goto_1

    :cond_5
    move-object v4, v2

    :goto_1
    iget-object p3, p0, Lcom/daaw/kc6;->a:Landroid/content/Context;

    iget-boolean v3, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    invoke-static {p3, v3}, Lcom/daaw/nj6;->a(Landroid/content/Context;Z)V

    sget-object p3, Lcom/daaw/g93;->X7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_6

    iget-boolean p3, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    if-eqz p3, :cond_6

    iget-object p3, p0, Lcom/daaw/kc6;->c:Lcom/daaw/b94;

    invoke-virtual {p3}, Lcom/daaw/b94;->p()Lcom/daaw/dh5;

    move-result-object p3

    invoke-virtual {p3, v0}, Lcom/daaw/dh5;->m(Z)V

    :cond_6
    iget-object p3, p0, Lcom/daaw/kc6;->i:Lcom/daaw/pi6;

    invoke-virtual {p3, p2}, Lcom/daaw/pi6;->J(Ljava/lang/String;)Lcom/daaw/pi6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzq;->zzb()Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/daaw/pi6;->I(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/pi6;

    invoke-virtual {p3, p1}, Lcom/daaw/pi6;->e(Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/pi6;

    invoke-virtual {p3}, Lcom/daaw/pi6;->g()Lcom/daaw/ri6;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/kc6;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/daaw/so6;->f(Lcom/daaw/ri6;)I

    move-result v3

    invoke-static {p3, v3, v1, p1}, Lcom/daaw/ho6;->b(Landroid/content/Context;IILcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/io6;

    move-result-object v5

    new-instance v6, Lcom/daaw/jc6;

    invoke-direct {v6, v2}, Lcom/daaw/jc6;-><init>(Lcom/daaw/ic6;)V

    iput-object p2, v6, Lcom/daaw/jc6;->a:Lcom/daaw/ri6;

    iget-object p1, p0, Lcom/daaw/kc6;->e:Lcom/daaw/cf6;

    new-instance p2, Lcom/daaw/df6;

    invoke-direct {p2, v6, v2}, Lcom/daaw/df6;-><init>(Lcom/daaw/xe6;Lcom/google/android/gms/internal/ads/zzccb;)V

    new-instance p3, Lcom/daaw/fc6;

    invoke-direct {p3, p0}, Lcom/daaw/fc6;-><init>(Lcom/daaw/kc6;)V

    invoke-interface {p1, p2, p3, v2}, Lcom/daaw/cf6;->a(Lcom/daaw/df6;Lcom/daaw/ye6;Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/kc6;->j:Lcom/daaw/f77;

    new-instance p2, Lcom/daaw/hc6;

    move-object v1, p2

    move-object v2, p0

    move-object v3, p4

    invoke-direct/range {v1 .. v6}, Lcom/daaw/hc6;-><init>(Lcom/daaw/kc6;Lcom/daaw/pz5;Lcom/daaw/to6;Lcom/daaw/io6;Lcom/daaw/jc6;)V

    iget-object p3, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public abstract b(Lcom/daaw/wi4;Lcom/daaw/up4;Lcom/daaw/pw4;)Lcom/daaw/qp4;
.end method

.method public final synthetic j()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/kc6;->d:Lcom/daaw/dd6;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/dd6;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final k(Lcom/google/android/gms/ads/internal/client/zzw;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kc6;->i:Lcom/daaw/pi6;

    invoke-virtual {v0, p1}, Lcom/daaw/pi6;->K(Lcom/google/android/gms/ads/internal/client/zzw;)Lcom/daaw/pi6;

    return-void
.end method

.method public final declared-synchronized l(Lcom/daaw/xe6;)Lcom/daaw/qp4;
    .locals 4

    monitor-enter p0

    :try_start_0
    check-cast p1, Lcom/daaw/jc6;

    sget-object v0, Lcom/daaw/g93;->r7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/wi4;

    iget-object v1, p0, Lcom/daaw/kc6;->g:Landroid/view/ViewGroup;

    invoke-direct {v0, v1}, Lcom/daaw/wi4;-><init>(Landroid/view/ViewGroup;)V

    new-instance v1, Lcom/daaw/sp4;

    invoke-direct {v1}, Lcom/daaw/sp4;-><init>()V

    iget-object v2, p0, Lcom/daaw/kc6;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/daaw/sp4;->c(Landroid/content/Context;)Lcom/daaw/sp4;

    iget-object p1, p1, Lcom/daaw/jc6;->a:Lcom/daaw/ri6;

    invoke-virtual {v1, p1}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    invoke-virtual {v1}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object p1

    new-instance v1, Lcom/daaw/lw4;

    invoke-direct {v1}, Lcom/daaw/lw4;-><init>()V

    iget-object v2, p0, Lcom/daaw/kc6;->d:Lcom/daaw/dd6;

    iget-object v3, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/lw4;->f(Lcom/daaw/er4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object v2, p0, Lcom/daaw/kc6;->d:Lcom/daaw/dd6;

    iget-object v3, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/lw4;->o(Lcom/daaw/vy4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    invoke-virtual {v1}, Lcom/daaw/lw4;->q()Lcom/daaw/pw4;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/kc6;->b(Lcom/daaw/wi4;Lcom/daaw/up4;Lcom/daaw/pw4;)Lcom/daaw/qp4;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/kc6;->d:Lcom/daaw/dd6;

    invoke-static {v0}, Lcom/daaw/dd6;->c(Lcom/daaw/dd6;)Lcom/daaw/dd6;

    move-result-object v0

    new-instance v1, Lcom/daaw/lw4;

    invoke-direct {v1}, Lcom/daaw/lw4;-><init>()V

    iget-object v2, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/lw4;->e(Lcom/daaw/oq4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object v2, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/lw4;->j(Lcom/daaw/qs4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object v2, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/lw4;->k(Lcom/google/android/gms/ads/internal/overlay/zzo;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object v2, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/lw4;->l(Lcom/daaw/ct4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object v2, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/lw4;->f(Lcom/daaw/er4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object v2, p0, Lcom/daaw/kc6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/lw4;->o(Lcom/daaw/vy4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    invoke-virtual {v1, v0}, Lcom/daaw/lw4;->p(Lcom/daaw/we6;)Lcom/daaw/lw4;

    new-instance v0, Lcom/daaw/wi4;

    iget-object v2, p0, Lcom/daaw/kc6;->g:Landroid/view/ViewGroup;

    invoke-direct {v0, v2}, Lcom/daaw/wi4;-><init>(Landroid/view/ViewGroup;)V

    new-instance v2, Lcom/daaw/sp4;

    invoke-direct {v2}, Lcom/daaw/sp4;-><init>()V

    iget-object v3, p0, Lcom/daaw/kc6;->a:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/daaw/sp4;->c(Landroid/content/Context;)Lcom/daaw/sp4;

    iget-object p1, p1, Lcom/daaw/jc6;->a:Lcom/daaw/ri6;

    invoke-virtual {v2, p1}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    invoke-virtual {v2}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object p1

    invoke-virtual {v1}, Lcom/daaw/lw4;->q()Lcom/daaw/pw4;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/kc6;->b(Lcom/daaw/wi4;Lcom/daaw/up4;Lcom/daaw/pw4;)Lcom/daaw/qp4;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zza()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/kc6;->j:Lcom/daaw/f77;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
