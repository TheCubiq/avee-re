.class public final Lcom/daaw/qf6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qz5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/b94;

.field public final d:Lcom/daaw/az5;

.field public final e:Lcom/daaw/tg6;

.field public f:Lcom/daaw/fa3;

.field public final g:Lcom/daaw/vo6;

.field public final h:Lcom/daaw/pi6;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public i:Lcom/daaw/f77;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/b94;Lcom/daaw/az5;Lcom/daaw/tg6;Lcom/daaw/pi6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qf6;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/qf6;->c:Lcom/daaw/b94;

    iput-object p4, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iput-object p6, p0, Lcom/daaw/qf6;->h:Lcom/daaw/pi6;

    iput-object p5, p0, Lcom/daaw/qf6;->e:Lcom/daaw/tg6;

    invoke-virtual {p3}, Lcom/daaw/b94;->D()Lcom/daaw/vo6;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qf6;->g:Lcom/daaw/vo6;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/qf6;)Lcom/daaw/az5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/qf6;)Lcom/daaw/tg6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qf6;->e:Lcom/daaw/tg6;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/qf6;)Lcom/daaw/vo6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qf6;->g:Lcom/daaw/vo6;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/qf6;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/qf6;Lcom/daaw/f77;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/qf6;->i:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/oz5;Lcom/daaw/pz5;)Z
    .locals 9

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const-string p1, "Ad unit ID should not be null for interstitial ad."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/daaw/kf6;

    invoke-direct {p2, p0}, Lcom/daaw/kf6;-><init>(Lcom/daaw/qf6;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/qf6;->zza()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    sget-object v0, Lcom/daaw/g93;->X7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/qf6;->c:Lcom/daaw/b94;

    invoke-virtual {v0}, Lcom/daaw/b94;->p()Lcom/daaw/dh5;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/dh5;->m(Z)V

    :cond_2
    check-cast p3, Lcom/daaw/jf6;

    iget-object p3, p3, Lcom/daaw/jf6;->a:Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v0, p0, Lcom/daaw/qf6;->h:Lcom/daaw/pi6;

    invoke-virtual {v0, p2}, Lcom/daaw/pi6;->J(Ljava/lang/String;)Lcom/daaw/pi6;

    invoke-virtual {v0, p3}, Lcom/daaw/pi6;->I(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/pi6;

    invoke-virtual {v0, p1}, Lcom/daaw/pi6;->e(Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/pi6;

    invoke-virtual {v0}, Lcom/daaw/pi6;->g()Lcom/daaw/ri6;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/qf6;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/daaw/so6;->f(Lcom/daaw/ri6;)I

    move-result v0

    const/4 v2, 0x4

    invoke-static {p3, v0, v2, p1}, Lcom/daaw/ho6;->b(Landroid/content/Context;IILcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/io6;

    move-result-object v7

    sget-object p3, Lcom/daaw/g93;->s7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/daaw/qf6;->c:Lcom/daaw/b94;

    invoke-virtual {p3}, Lcom/daaw/b94;->l()Lcom/daaw/r05;

    move-result-object p3

    new-instance v0, Lcom/daaw/sp4;

    invoke-direct {v0}, Lcom/daaw/sp4;-><init>()V

    iget-object v3, p0, Lcom/daaw/qf6;->a:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/daaw/sp4;->c(Landroid/content/Context;)Lcom/daaw/sp4;

    invoke-virtual {v0, p2}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    invoke-virtual {v0}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/daaw/r05;->g(Lcom/daaw/up4;)Lcom/daaw/r05;

    new-instance p2, Lcom/daaw/lw4;

    invoke-direct {p2}, Lcom/daaw/lw4;-><init>()V

    iget-object v0, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v3}, Lcom/daaw/lw4;->m(Lcom/daaw/pt4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object v0, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v3}, Lcom/daaw/lw4;->n(Lcom/daaw/hp2;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    invoke-virtual {p2}, Lcom/daaw/lw4;->q()Lcom/daaw/pw4;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/daaw/r05;->m(Lcom/daaw/pw4;)Lcom/daaw/r05;

    new-instance p2, Lcom/daaw/cx5;

    iget-object v0, p0, Lcom/daaw/qf6;->f:Lcom/daaw/fa3;

    invoke-direct {p2, v0}, Lcom/daaw/cx5;-><init>(Lcom/daaw/fa3;)V

    invoke-interface {p3, p2}, Lcom/daaw/r05;->h(Lcom/daaw/cx5;)Lcom/daaw/r05;

    invoke-interface {p3}, Lcom/daaw/r05;->zzf()Lcom/daaw/s05;

    move-result-object p2

    :goto_0
    move-object v8, p2

    goto/16 :goto_1

    :cond_3
    new-instance p3, Lcom/daaw/lw4;

    invoke-direct {p3}, Lcom/daaw/lw4;-><init>()V

    iget-object v0, p0, Lcom/daaw/qf6;->e:Lcom/daaw/tg6;

    if-eqz v0, :cond_4

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, v0, v3}, Lcom/daaw/lw4;->h(Lcom/daaw/lq4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object v0, p0, Lcom/daaw/qf6;->e:Lcom/daaw/tg6;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, v0, v3}, Lcom/daaw/lw4;->i(Lcom/daaw/fs4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object v0, p0, Lcom/daaw/qf6;->e:Lcom/daaw/tg6;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, v0, v3}, Lcom/daaw/lw4;->e(Lcom/daaw/oq4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    :cond_4
    iget-object v0, p0, Lcom/daaw/qf6;->c:Lcom/daaw/b94;

    invoke-virtual {v0}, Lcom/daaw/b94;->l()Lcom/daaw/r05;

    move-result-object v0

    new-instance v3, Lcom/daaw/sp4;

    invoke-direct {v3}, Lcom/daaw/sp4;-><init>()V

    iget-object v4, p0, Lcom/daaw/qf6;->a:Landroid/content/Context;

    invoke-virtual {v3, v4}, Lcom/daaw/sp4;->c(Landroid/content/Context;)Lcom/daaw/sp4;

    invoke-virtual {v3, p2}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    invoke-virtual {v3}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object p2

    invoke-interface {v0, p2}, Lcom/daaw/r05;->g(Lcom/daaw/up4;)Lcom/daaw/r05;

    iget-object p2, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, p2, v3}, Lcom/daaw/lw4;->m(Lcom/daaw/pt4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object p2, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, p2, v3}, Lcom/daaw/lw4;->h(Lcom/daaw/lq4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object p2, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, p2, v3}, Lcom/daaw/lw4;->i(Lcom/daaw/fs4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object p2, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, p2, v3}, Lcom/daaw/lw4;->e(Lcom/daaw/oq4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object p2, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, p2, v3}, Lcom/daaw/lw4;->d(Lcom/google/android/gms/ads/internal/client/zza;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object p2, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, p2, v3}, Lcom/daaw/lw4;->o(Lcom/daaw/vy4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object p2, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, p2, v3}, Lcom/daaw/lw4;->n(Lcom/daaw/hp2;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object p2, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, p2, v3}, Lcom/daaw/lw4;->l(Lcom/daaw/ct4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    iget-object p2, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    iget-object v3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p3, p2, v3}, Lcom/daaw/lw4;->f(Lcom/daaw/er4;Ljava/util/concurrent/Executor;)Lcom/daaw/lw4;

    invoke-virtual {p3}, Lcom/daaw/lw4;->q()Lcom/daaw/pw4;

    move-result-object p2

    invoke-interface {v0, p2}, Lcom/daaw/r05;->m(Lcom/daaw/pw4;)Lcom/daaw/r05;

    new-instance p2, Lcom/daaw/cx5;

    iget-object p3, p0, Lcom/daaw/qf6;->f:Lcom/daaw/fa3;

    invoke-direct {p2, p3}, Lcom/daaw/cx5;-><init>(Lcom/daaw/fa3;)V

    invoke-interface {v0, p2}, Lcom/daaw/r05;->h(Lcom/daaw/cx5;)Lcom/daaw/r05;

    invoke-interface {v0}, Lcom/daaw/r05;->zzf()Lcom/daaw/s05;

    move-result-object p2

    goto/16 :goto_0

    :goto_1
    sget-object p2, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {p2}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {v8}, Lcom/daaw/s05;->d()Lcom/daaw/to6;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/daaw/to6;->h(I)Lcom/daaw/to6;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/daaw/to6;->b(Ljava/lang/String;)Lcom/daaw/to6;

    move-object v6, p2

    goto :goto_2

    :cond_5
    const/4 p1, 0x0

    move-object v6, p1

    :goto_2
    invoke-virtual {v8}, Lcom/daaw/s05;->a()Lcom/daaw/jn4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/jn4;->j()Lcom/daaw/f77;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/jn4;->i(Lcom/daaw/f77;)Lcom/daaw/f77;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qf6;->i:Lcom/daaw/f77;

    new-instance p2, Lcom/daaw/pf6;

    move-object v3, p2

    move-object v4, p0

    move-object v5, p4

    invoke-direct/range {v3 .. v8}, Lcom/daaw/pf6;-><init>(Lcom/daaw/qf6;Lcom/daaw/pz5;Lcom/daaw/to6;Lcom/daaw/io6;Lcom/daaw/s05;)V

    iget-object p3, p0, Lcom/daaw/qf6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return v1
.end method

.method public final synthetic g()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/qf6;->d:Lcom/daaw/az5;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/az5;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final h(Lcom/daaw/fa3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qf6;->f:Lcom/daaw/fa3;

    return-void
.end method

.method public final zza()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/qf6;->i:Lcom/daaw/f77;

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
