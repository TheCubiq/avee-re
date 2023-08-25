.class public final Lcom/daaw/dh6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qz5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/b94;

.field public final d:Lcom/daaw/tg6;

.field public final e:Lcom/daaw/cf6;

.field public final f:Lcom/daaw/gi6;

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
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/b94;Lcom/daaw/cf6;Lcom/daaw/tg6;Lcom/daaw/pi6;Lcom/daaw/gi6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dh6;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/dh6;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/dh6;->c:Lcom/daaw/b94;

    iput-object p4, p0, Lcom/daaw/dh6;->e:Lcom/daaw/cf6;

    iput-object p5, p0, Lcom/daaw/dh6;->d:Lcom/daaw/tg6;

    iput-object p6, p0, Lcom/daaw/dh6;->h:Lcom/daaw/pi6;

    iput-object p7, p0, Lcom/daaw/dh6;->f:Lcom/daaw/gi6;

    invoke-virtual {p3}, Lcom/daaw/b94;->D()Lcom/daaw/vo6;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dh6;->g:Lcom/daaw/vo6;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/dh6;Lcom/daaw/xe6;)Lcom/daaw/n95;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dh6;->j(Lcom/daaw/xe6;)Lcom/daaw/n95;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/dh6;Lcom/daaw/xe6;)Lcom/daaw/n95;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dh6;->j(Lcom/daaw/xe6;)Lcom/daaw/n95;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/dh6;)Lcom/daaw/cf6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dh6;->e:Lcom/daaw/cf6;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/dh6;)Lcom/daaw/tg6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dh6;->d:Lcom/daaw/tg6;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/dh6;)Lcom/daaw/vo6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dh6;->g:Lcom/daaw/vo6;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/dh6;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dh6;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/oz5;Lcom/daaw/pz5;)Z
    .locals 9

    new-instance p3, Lcom/google/android/gms/internal/ads/zzccy;

    invoke-direct {p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzccy;-><init>(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzccy;->q:Ljava/lang/String;

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "Ad unit ID should not be null for rewarded video ad."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/dh6;->b:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/daaw/wg6;

    invoke-direct {p2, p0}, Lcom/daaw/wg6;-><init>(Lcom/daaw/dh6;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    const/4 p2, 0x0

    goto/16 :goto_2

    :cond_0
    iget-object p1, p0, Lcom/daaw/dh6;->i:Lcom/daaw/f77;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x5

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/dh6;->e:Lcom/daaw/cf6;

    invoke-interface {p1}, Lcom/daaw/cf6;->zzd()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/daaw/cf6;->zzd()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/o95;

    invoke-interface {p1}, Lcom/daaw/rp4;->zzh()Lcom/daaw/to6;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/to6;->h(I)Lcom/daaw/to6;

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/zzccy;->p:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/daaw/to6;->b(Ljava/lang/String;)Lcom/daaw/to6;

    move-object v6, p1

    goto :goto_1

    :cond_2
    move-object v6, v1

    :goto_1
    iget-object p1, p0, Lcom/daaw/dh6;->a:Landroid/content/Context;

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/zzccy;->p:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-boolean v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    invoke-static {p1, v2}, Lcom/daaw/nj6;->a(Landroid/content/Context;Z)V

    sget-object p1, Lcom/daaw/g93;->X7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzccy;->p:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-boolean p1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/dh6;->c:Lcom/daaw/b94;

    invoke-virtual {p1}, Lcom/daaw/b94;->p()Lcom/daaw/dh5;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/daaw/dh5;->m(Z)V

    :cond_3
    iget-object p1, p0, Lcom/daaw/dh6;->h:Lcom/daaw/pi6;

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/zzccy;->q:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/daaw/pi6;->J(Ljava/lang/String;)Lcom/daaw/pi6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzq;->zzd()Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/daaw/pi6;->I(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/pi6;

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/zzccy;->p:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-virtual {p1, v2}, Lcom/daaw/pi6;->e(Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/pi6;

    invoke-virtual {p1}, Lcom/daaw/pi6;->g()Lcom/daaw/ri6;

    move-result-object p1

    iget-object v2, p0, Lcom/daaw/dh6;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/so6;->f(Lcom/daaw/ri6;)I

    move-result v3

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zzccy;->p:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-static {v2, v3, v0, p3}, Lcom/daaw/ho6;->b(Landroid/content/Context;IILcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/io6;

    move-result-object v7

    new-instance v8, Lcom/daaw/ch6;

    invoke-direct {v8, v1}, Lcom/daaw/ch6;-><init>(Lcom/daaw/bh6;)V

    iput-object p1, v8, Lcom/daaw/ch6;->a:Lcom/daaw/ri6;

    iput-object v1, v8, Lcom/daaw/ch6;->b:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/dh6;->e:Lcom/daaw/cf6;

    new-instance p3, Lcom/daaw/df6;

    invoke-direct {p3, v8, v1}, Lcom/daaw/df6;-><init>(Lcom/daaw/xe6;Lcom/google/android/gms/internal/ads/zzccb;)V

    new-instance v0, Lcom/daaw/xg6;

    invoke-direct {v0, p0}, Lcom/daaw/xg6;-><init>(Lcom/daaw/dh6;)V

    invoke-interface {p1, p3, v0, v1}, Lcom/daaw/cf6;->a(Lcom/daaw/df6;Lcom/daaw/ye6;Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dh6;->i:Lcom/daaw/f77;

    new-instance p3, Lcom/daaw/ah6;

    move-object v3, p3

    move-object v4, p0

    move-object v5, p4

    invoke-direct/range {v3 .. v8}, Lcom/daaw/ah6;-><init>(Lcom/daaw/dh6;Lcom/daaw/pz5;Lcom/daaw/to6;Lcom/daaw/io6;Lcom/daaw/ch6;)V

    iget-object p4, p0, Lcom/daaw/dh6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p3, p4}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    :goto_2
    return p2
.end method

.method public final synthetic h()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/dh6;->d:Lcom/daaw/tg6;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/tg6;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final i(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dh6;->h:Lcom/daaw/pi6;

    invoke-virtual {v0}, Lcom/daaw/pi6;->F()Lcom/daaw/zh6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/zh6;->a(I)Lcom/daaw/zh6;

    return-void
.end method

.method public final j(Lcom/daaw/xe6;)Lcom/daaw/n95;
    .locals 3

    check-cast p1, Lcom/daaw/ch6;

    iget-object v0, p0, Lcom/daaw/dh6;->c:Lcom/daaw/b94;

    invoke-virtual {v0}, Lcom/daaw/b94;->n()Lcom/daaw/n95;

    move-result-object v0

    new-instance v1, Lcom/daaw/sp4;

    invoke-direct {v1}, Lcom/daaw/sp4;-><init>()V

    iget-object v2, p0, Lcom/daaw/dh6;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/daaw/sp4;->c(Landroid/content/Context;)Lcom/daaw/sp4;

    iget-object p1, p1, Lcom/daaw/ch6;->a:Lcom/daaw/ri6;

    invoke-virtual {v1, p1}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    iget-object p1, p0, Lcom/daaw/dh6;->f:Lcom/daaw/gi6;

    invoke-virtual {v1, p1}, Lcom/daaw/sp4;->e(Lcom/daaw/gi6;)Lcom/daaw/sp4;

    invoke-virtual {v1}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/n95;->a(Lcom/daaw/up4;)Lcom/daaw/n95;

    new-instance p1, Lcom/daaw/lw4;

    invoke-direct {p1}, Lcom/daaw/lw4;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/lw4;->q()Lcom/daaw/pw4;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/n95;->b(Lcom/daaw/pw4;)Lcom/daaw/n95;

    return-object v0
.end method

.method public final zza()Z
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
