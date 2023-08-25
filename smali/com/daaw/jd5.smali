.class public final Lcom/daaw/jd5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/Map;

.field public final synthetic b:Lcom/daaw/kd5;


# direct methods
.method public constructor <init>(Lcom/daaw/kd5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jd5;->b:Lcom/daaw/kd5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/jd5;->a:Ljava/util/Map;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/jd5;)Lcom/daaw/jd5;
    .locals 2

    iget-object v0, p0, Lcom/daaw/jd5;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/daaw/jd5;->b:Lcom/daaw/kd5;

    invoke-static {v1}, Lcom/daaw/kd5;->c(Lcom/daaw/kd5;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jd5;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;
    .locals 1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/jd5;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final d(Lcom/daaw/th6;)Lcom/daaw/jd5;
    .locals 3

    iget-object v0, p0, Lcom/daaw/jd5;->a:Ljava/util/Map;

    iget-object v1, p1, Lcom/daaw/th6;->x:Ljava/lang/String;

    const-string v2, "aai"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/daaw/g93;->v6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/daaw/th6;->p0:Ljava/lang/String;

    const-string v0, "rid"

    invoke-virtual {p0, v0, p1}, Lcom/daaw/jd5;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_0
    return-object p0
.end method

.method public final e(Lcom/daaw/wh6;)Lcom/daaw/jd5;
    .locals 2

    iget-object v0, p0, Lcom/daaw/jd5;->a:Ljava/util/Map;

    iget-object p1, p1, Lcom/daaw/wh6;->b:Ljava/lang/String;

    const-string v1, "gqi"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/jd5;->b:Lcom/daaw/kd5;

    invoke-static {v0}, Lcom/daaw/kd5;->b(Lcom/daaw/kd5;)Lcom/daaw/pd5;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/jd5;->a:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/daaw/rd5;->b(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jd5;->b:Lcom/daaw/kd5;

    invoke-static {v0}, Lcom/daaw/kd5;->d(Lcom/daaw/kd5;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/daaw/id5;

    invoke-direct {v1, p0}, Lcom/daaw/id5;-><init>(Lcom/daaw/jd5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jd5;->b:Lcom/daaw/kd5;

    invoke-static {v0}, Lcom/daaw/kd5;->d(Lcom/daaw/kd5;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/daaw/hd5;

    invoke-direct {v1, p0}, Lcom/daaw/hd5;-><init>(Lcom/daaw/jd5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic i()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jd5;->b:Lcom/daaw/kd5;

    invoke-static {v0}, Lcom/daaw/kd5;->b(Lcom/daaw/kd5;)Lcom/daaw/pd5;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/jd5;->a:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/daaw/rd5;->e(Ljava/util/Map;)V

    return-void
.end method

.method public final synthetic j()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jd5;->b:Lcom/daaw/kd5;

    invoke-static {v0}, Lcom/daaw/kd5;->b(Lcom/daaw/kd5;)Lcom/daaw/pd5;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/jd5;->a:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/daaw/rd5;->d(Ljava/util/Map;)V

    return-void
.end method
