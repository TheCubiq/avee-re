.class public final Lcom/daaw/xz5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qz5;


# instance fields
.field public final a:Lcom/daaw/pi6;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public final b:Lcom/daaw/b94;

.field public final c:Landroid/content/Context;

.field public final d:Lcom/daaw/nz5;

.field public final e:Lcom/daaw/vo6;

.field public f:Lcom/daaw/qm4;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/b94;Landroid/content/Context;Lcom/daaw/nz5;Lcom/daaw/pi6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xz5;->b:Lcom/daaw/b94;

    iput-object p2, p0, Lcom/daaw/xz5;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/xz5;->d:Lcom/daaw/nz5;

    iput-object p4, p0, Lcom/daaw/xz5;->a:Lcom/daaw/pi6;

    invoke-virtual {p1}, Lcom/daaw/b94;->D()Lcom/daaw/vo6;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xz5;->e:Lcom/daaw/vo6;

    invoke-virtual {p3}, Lcom/daaw/nz5;->d()Lcom/daaw/az5;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/daaw/pi6;->L(Lcom/daaw/az5;)Lcom/daaw/pi6;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/xz5;)Lcom/daaw/b94;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xz5;->b:Lcom/daaw/b94;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/xz5;)Lcom/daaw/nz5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xz5;->d:Lcom/daaw/nz5;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/xz5;)Lcom/daaw/vo6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xz5;->e:Lcom/daaw/vo6;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/oz5;Lcom/daaw/pz5;)Z
    .locals 9

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v0, p0, Lcom/daaw/xz5;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzD(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "Failed to load the ad because app ID is missing."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/xz5;->b:Lcom/daaw/b94;

    invoke-virtual {p1}, Lcom/daaw/b94;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/daaw/sz5;

    invoke-direct {p2, p0}, Lcom/daaw/sz5;-><init>(Lcom/daaw/xz5;)V

    :goto_0
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v1

    :cond_1
    :goto_1
    if-nez p2, :cond_2

    const-string p1, "Ad unit ID should not be null for NativeAdLoader."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/xz5;->b:Lcom/daaw/b94;

    invoke-virtual {p1}, Lcom/daaw/b94;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/daaw/tz5;

    invoke-direct {p2, p0}, Lcom/daaw/tz5;-><init>(Lcom/daaw/xz5;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lcom/daaw/xz5;->c:Landroid/content/Context;

    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    invoke-static {p2, v0}, Lcom/daaw/nj6;->a(Landroid/content/Context;Z)V

    sget-object p2, Lcom/daaw/g93;->X7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    iget-boolean p2, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/daaw/xz5;->b:Lcom/daaw/b94;

    invoke-virtual {p2}, Lcom/daaw/b94;->p()Lcom/daaw/dh5;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/daaw/dh5;->m(Z)V

    :cond_3
    check-cast p3, Lcom/daaw/rz5;

    iget p2, p3, Lcom/daaw/rz5;->a:I

    iget-object p3, p0, Lcom/daaw/xz5;->a:Lcom/daaw/pi6;

    invoke-virtual {p3, p1}, Lcom/daaw/pi6;->e(Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/pi6;

    invoke-virtual {p3, p2}, Lcom/daaw/pi6;->Q(I)Lcom/daaw/pi6;

    invoke-virtual {p3}, Lcom/daaw/pi6;->g()Lcom/daaw/ri6;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/xz5;->c:Landroid/content/Context;

    invoke-static {p2}, Lcom/daaw/so6;->f(Lcom/daaw/ri6;)I

    move-result v1

    const/16 v2, 0x8

    invoke-static {p3, v1, v2, p1}, Lcom/daaw/ho6;->b(Landroid/content/Context;IILcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/io6;

    move-result-object v7

    iget-object p3, p2, Lcom/daaw/ri6;->n:Lcom/google/android/gms/ads/internal/client/zzcb;

    if-eqz p3, :cond_4

    iget-object v1, p0, Lcom/daaw/xz5;->d:Lcom/daaw/nz5;

    invoke-virtual {v1}, Lcom/daaw/nz5;->d()Lcom/daaw/az5;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/daaw/az5;->W(Lcom/google/android/gms/ads/internal/client/zzcb;)V

    :cond_4
    iget-object p3, p0, Lcom/daaw/xz5;->b:Lcom/daaw/b94;

    invoke-virtual {p3}, Lcom/daaw/b94;->m()Lcom/daaw/p15;

    move-result-object p3

    new-instance v1, Lcom/daaw/sp4;

    invoke-direct {v1}, Lcom/daaw/sp4;-><init>()V

    iget-object v3, p0, Lcom/daaw/xz5;->c:Landroid/content/Context;

    invoke-virtual {v1, v3}, Lcom/daaw/sp4;->c(Landroid/content/Context;)Lcom/daaw/sp4;

    invoke-virtual {v1, p2}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    invoke-virtual {v1}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/daaw/p15;->e(Lcom/daaw/up4;)Lcom/daaw/p15;

    new-instance p2, Lcom/daaw/lw4;

    invoke-direct {p2}, Lcom/daaw/lw4;-><init>()V

    iget-object v1, p0, Lcom/daaw/xz5;->d:Lcom/daaw/nz5;

    invoke-virtual {v1}, Lcom/daaw/nz5;->d()Lcom/daaw/az5;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/xz5;->b:Lcom/daaw/b94;

    invoke-virtual {v3}, Lcom/daaw/b94;->c()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {p2, v1, v3}, Lcom/daaw/lw4;->n(Lcom/daaw/hp2;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    invoke-virtual {p2}, Lcom/daaw/lw4;->q()Lcom/daaw/pw4;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/daaw/p15;->l(Lcom/daaw/pw4;)Lcom/daaw/p15;

    iget-object p2, p0, Lcom/daaw/xz5;->d:Lcom/daaw/nz5;

    invoke-virtual {p2}, Lcom/daaw/nz5;->c()Lcom/daaw/l15;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/daaw/p15;->d(Lcom/daaw/l15;)Lcom/daaw/p15;

    new-instance p2, Lcom/daaw/wi4;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Lcom/daaw/wi4;-><init>(Landroid/view/ViewGroup;)V

    invoke-interface {p3, p2}, Lcom/daaw/p15;->c(Lcom/daaw/wi4;)Lcom/daaw/p15;

    invoke-interface {p3}, Lcom/daaw/p15;->zzg()Lcom/daaw/q15;

    move-result-object v8

    sget-object p2, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {p2}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {v8}, Lcom/daaw/q15;->e()Lcom/daaw/to6;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/daaw/to6;->h(I)Lcom/daaw/to6;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/daaw/to6;->b(Ljava/lang/String;)Lcom/daaw/to6;

    move-object v6, p2

    goto :goto_2

    :cond_5
    move-object v6, v1

    :goto_2
    iget-object p1, p0, Lcom/daaw/xz5;->b:Lcom/daaw/b94;

    invoke-virtual {p1}, Lcom/daaw/b94;->B()Lcom/daaw/pj6;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/pj6;->c(I)V

    new-instance p1, Lcom/daaw/qm4;

    sget-object p2, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {p2}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lcom/daaw/xz5;->b:Lcom/daaw/b94;

    invoke-virtual {p3}, Lcom/daaw/b94;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p3

    invoke-virtual {v8}, Lcom/daaw/q15;->a()Lcom/daaw/jn4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/jn4;->j()Lcom/daaw/f77;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/jn4;->i(Lcom/daaw/f77;)Lcom/daaw/f77;

    move-result-object v1

    invoke-direct {p1, p2, p3, v1}, Lcom/daaw/qm4;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/f77;)V

    iput-object p1, p0, Lcom/daaw/xz5;->f:Lcom/daaw/qm4;

    new-instance p2, Lcom/daaw/wz5;

    move-object v3, p2

    move-object v4, p0

    move-object v5, p4

    invoke-direct/range {v3 .. v8}, Lcom/daaw/wz5;-><init>(Lcom/daaw/xz5;Lcom/daaw/pz5;Lcom/daaw/to6;Lcom/daaw/io6;Lcom/daaw/q15;)V

    invoke-virtual {p1, p2}, Lcom/daaw/qm4;->e(Lcom/daaw/o67;)V

    return v0
.end method

.method public final synthetic e()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/xz5;->d:Lcom/daaw/nz5;

    invoke-virtual {v0}, Lcom/daaw/nz5;->a()Lcom/daaw/oq4;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/oq4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final synthetic f()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/xz5;->d:Lcom/daaw/nz5;

    invoke-virtual {v0}, Lcom/daaw/nz5;->a()Lcom/daaw/oq4;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/oq4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final zza()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/xz5;->f:Lcom/daaw/qm4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/qm4;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
