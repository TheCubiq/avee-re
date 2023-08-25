.class public final Lcom/daaw/al5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/dk5;

.field public final c:Lcom/daaw/qz7;

.field public final d:Lcom/daaw/vo6;

.field public final e:Landroid/content/Context;

.field public final f:Lcom/google/android/gms/internal/ads/zzchu;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/dk5;Lcom/daaw/qz7;Lcom/daaw/vo6;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/al5;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/al5;->b:Lcom/daaw/dk5;

    iput-object p3, p0, Lcom/daaw/al5;->c:Lcom/daaw/qz7;

    iput-object p4, p0, Lcom/daaw/al5;->d:Lcom/daaw/vo6;

    iput-object p5, p0, Lcom/daaw/al5;->e:Landroid/content/Context;

    iput-object p6, p0, Lcom/daaw/al5;->f:Lcom/google/android/gms/internal/ads/zzchu;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 3

    new-instance v0, Lcom/daaw/vk5;

    invoke-direct {v0, p1}, Lcom/daaw/vk5;-><init>(Lcom/google/android/gms/internal/ads/zzccb;)V

    iget-object v1, p0, Lcom/daaw/al5;->b:Lcom/daaw/dk5;

    new-instance v2, Lcom/daaw/wk5;

    invoke-direct {v2, v1}, Lcom/daaw/wk5;-><init>(Lcom/daaw/dk5;)V

    new-instance v1, Lcom/daaw/xk5;

    invoke-direct {v1, p0}, Lcom/daaw/xk5;-><init>(Lcom/daaw/al5;)V

    invoke-virtual {p0, p1, v2, v1, v0}, Lcom/daaw/al5;->h(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/zk5;Lcom/daaw/zk5;Lcom/daaw/w57;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lorg/json/JSONObject;)Lcom/daaw/f77;
    .locals 4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/daaw/ol3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/al5;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/al5;->f:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v3, p0, Lcom/daaw/al5;->d:Lcom/daaw/vo6;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/ol3;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;

    move-result-object v0

    sget-object v1, Lcom/daaw/ul3;->b:Lcom/daaw/rl3;

    sget-object v2, Lcom/daaw/uk5;->a:Lcom/daaw/uk5;

    const-string v3, "AFMA_getAdDictionary"

    invoke-virtual {v0, v3, v1, v2}, Lcom/daaw/xl3;->a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/nl3;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/al5;->a:Lcom/daaw/g77;

    invoke-static {p1, v0, v1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/zk5;Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/w57;Lcom/daaw/pk5;)Lcom/daaw/f77;
    .locals 0

    invoke-interface {p1, p2}, Lcom/daaw/zk5;->a(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/al5;->a:Lcom/daaw/g77;

    invoke-static {p1, p3, p2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic d(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/al5;->c:Lcom/daaw/qz7;

    invoke-interface {v0}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cn5;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/cn5;->g3(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic e(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/al5;->b:Lcom/daaw/dk5;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzccb;->w:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/daaw/dk5;->c(Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic f(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/al5;->c:Lcom/daaw/qz7;

    invoke-interface {v0}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cn5;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzccb;->w:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/daaw/cn5;->j3(Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 3

    sget-object v0, Lcom/daaw/rk5;->a:Lcom/daaw/rk5;

    new-instance v1, Lcom/daaw/sk5;

    invoke-direct {v1, p0}, Lcom/daaw/sk5;-><init>(Lcom/daaw/al5;)V

    new-instance v2, Lcom/daaw/tk5;

    invoke-direct {v2, p0}, Lcom/daaw/tk5;-><init>(Lcom/daaw/al5;)V

    invoke-virtual {p0, p1, v1, v2, v0}, Lcom/daaw/al5;->h(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/zk5;Lcom/daaw/zk5;Lcom/daaw/w57;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/zk5;Lcom/daaw/zk5;Lcom/daaw/w57;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzccb;->s:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzy(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p2, Lcom/daaw/pk5;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Lcom/daaw/pk5;-><init>(I)V

    invoke-static {p2}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, Lcom/daaw/zk5;->a(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;

    move-result-object p2

    const-class v0, Ljava/util/concurrent/ExecutionException;

    sget-object v1, Lcom/daaw/qk5;->a:Lcom/daaw/qk5;

    iget-object v2, p0, Lcom/daaw/al5;->a:Lcom/daaw/g77;

    invoke-static {p2, v0, v1, v2}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/al5;->a:Lcom/daaw/g77;

    invoke-static {p2, p4, v0}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p2

    new-instance v0, Lcom/daaw/yk5;

    invoke-direct {v0, p0, p3, p1, p4}, Lcom/daaw/yk5;-><init>(Lcom/daaw/al5;Lcom/daaw/zk5;Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/w57;)V

    const-class p1, Lcom/daaw/pk5;

    iget-object p3, p0, Lcom/daaw/al5;->a:Lcom/daaw/g77;

    invoke-static {p2, p1, v0, p3}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
