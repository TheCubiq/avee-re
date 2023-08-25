.class public final Lcom/daaw/cw5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/o95;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/o95;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cw5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/cw5;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/cw5;->c:Lcom/daaw/o95;

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/cw5;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/daaw/cw5;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/cw5;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 0

    invoke-static {p1, p2, p3}, Lcom/daaw/cw5;->e(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V

    return-void
.end method

.method public static final e(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 1

    :try_start_0
    iget-object v0, p2, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/oj6;

    iget-object p0, p0, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p0, p0, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object p0, p0, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p1, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/daaw/oj6;->p(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    iget-object p1, p2, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Fail to load ad from adapter "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 7

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/oj6;

    invoke-virtual {v0}, Lcom/daaw/oj6;->c()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/aw5;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/aw5;-><init>(Lcom/daaw/cw5;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V

    iget-object v1, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast v1, Lcom/daaw/zs5;

    invoke-virtual {v1, v0}, Lcom/daaw/zs5;->i3(Lcom/daaw/gz4;)V

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/daaw/oj6;

    iget-object v2, p0, Lcom/daaw/cw5;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v3, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    const/4 v4, 0x0

    iget-object p1, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v5, p1

    check-cast v5, Lcom/daaw/pv3;

    iget-object p1, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/oj6;->m(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/pv3;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p1, p2, p3}, Lcom/daaw/cw5;->e(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/daaw/cw5;->c:Lcom/daaw/o95;

    new-instance v1, Lcom/daaw/rm4;

    iget-object v2, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/l95;

    new-instance p2, Lcom/daaw/yv5;

    invoke-direct {p2, p3}, Lcom/daaw/yv5;-><init>(Lcom/daaw/tq5;)V

    invoke-direct {p1, p2}, Lcom/daaw/l95;-><init>(Lcom/daaw/c15;)V

    invoke-virtual {v0, v1, p1}, Lcom/daaw/o95;->b(Lcom/daaw/rm4;Lcom/daaw/l95;)Lcom/daaw/k95;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/am4;->c()Lcom/daaw/nr4;

    move-result-object p2

    new-instance v0, Lcom/daaw/eg4;

    iget-object v1, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/oj6;

    invoke-direct {v0, v1}, Lcom/daaw/eg4;-><init>(Lcom/daaw/oj6;)V

    iget-object v1, p0, Lcom/daaw/cw5;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/daaw/am4;->d()Lcom/daaw/vr4;

    move-result-object v6

    invoke-virtual {p1}, Lcom/daaw/am4;->a()Lcom/daaw/jq4;

    move-result-object v5

    invoke-virtual {p1}, Lcom/daaw/k95;->h()Lcom/daaw/xs4;

    move-result-object v4

    invoke-virtual {p1}, Lcom/daaw/k95;->i()Lcom/daaw/ez4;

    move-result-object v7

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p2, Lcom/daaw/zs5;

    new-instance p3, Lcom/daaw/bw5;

    move-object v2, p3

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/daaw/bw5;-><init>(Lcom/daaw/cw5;Lcom/daaw/xs4;Lcom/daaw/jq4;Lcom/daaw/vr4;Lcom/daaw/ez4;)V

    invoke-virtual {p2, p3}, Lcom/daaw/zs5;->h3(Lcom/daaw/pv3;)V

    invoke-virtual {p1}, Lcom/daaw/k95;->k()Lcom/daaw/j95;

    move-result-object p1

    return-object p1
.end method
