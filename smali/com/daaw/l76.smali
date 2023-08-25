.class public final Lcom/daaw/l76;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/Set;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Lcom/daaw/to6;

.field public final e:Lcom/daaw/kd5;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/Set;Lcom/daaw/to6;Lcom/daaw/kd5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l76;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/l76;->c:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/l76;->b:Ljava/util/Set;

    iput-object p4, p0, Lcom/daaw/l76;->d:Lcom/daaw/to6;

    iput-object p5, p0, Lcom/daaw/l76;->e:Lcom/daaw/kd5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 8

    iget-object v0, p0, Lcom/daaw/l76;->a:Landroid/content/Context;

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/io6;->zzh()Lcom/daaw/io6;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/daaw/l76;->b:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, Lcom/daaw/l76;->b:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/i76;

    invoke-interface {v3}, Lcom/daaw/i76;->zzb()Lcom/daaw/f77;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v5

    invoke-interface {v5}, Lcom/daaw/ag;->b()J

    move-result-wide v5

    new-instance v7, Lcom/daaw/j76;

    invoke-direct {v7, p0, v5, v6, v3}, Lcom/daaw/j76;-><init>(Lcom/daaw/l76;JLcom/daaw/i76;)V

    sget-object v3, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-interface {v4, v7, v3}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/daaw/s67;->c(Ljava/lang/Iterable;)Lcom/daaw/r67;

    move-result-object v2

    new-instance v3, Lcom/daaw/k76;

    invoke-direct {v3, v1, p1}, Lcom/daaw/k76;-><init>(Ljava/util/List;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/l76;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v2, v3, p1}, Lcom/daaw/r67;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    invoke-static {}, Lcom/daaw/vo6;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/l76;->d:Lcom/daaw/to6;

    invoke-static {p1, v1, v0}, Lcom/daaw/so6;->a(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V

    :cond_1
    return-object p1
.end method

.method public final b(JLcom/daaw/i76;)V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    sub-long/2addr v0, p1

    sget-object p1, Lcom/daaw/ib3;->a:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/hz6;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Signal runtime (ms) : "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " = "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    :cond_0
    sget-object p1, Lcom/daaw/g93;->Q1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/l76;->e:Lcom/daaw/kd5;

    invoke-virtual {p1}, Lcom/daaw/kd5;->a()Lcom/daaw/jd5;

    move-result-object p1

    const-string p2, "action"

    const-string v2, "lat_ms"

    invoke-virtual {p1, p2, v2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    const-string p2, "lat_grp"

    const-string v2, "sig_lat_grp"

    invoke-virtual {p1, p2, v2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-interface {p3}, Lcom/daaw/i76;->zza()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "lat_id"

    invoke-virtual {p1, p3, p2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    const-string p3, "clat_ms"

    invoke-virtual {p1, p3, p2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-virtual {p1}, Lcom/daaw/jd5;->h()V

    return-void
.end method
