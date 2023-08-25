.class public final Lcom/daaw/dv5;
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

    iput-object p1, p0, Lcom/daaw/dv5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/dv5;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/dv5;->c:Lcom/daaw/o95;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 3

    :try_start_0
    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v0, p1, Lcom/daaw/ri6;->o:Lcom/daaw/bi6;

    iget v0, v0, Lcom/daaw/bi6;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/oj6;

    iget-object v1, p0, Lcom/daaw/dv5;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p2, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast v2, Lcom/daaw/gn3;

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/daaw/oj6;->w(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/gn3;)V

    return-void

    :cond_0
    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/oj6;

    iget-object v1, p0, Lcom/daaw/dv5;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p2, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast v2, Lcom/daaw/gn3;

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/daaw/oj6;->v(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/gn3;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Fail to load ad from adapter "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/dv5;->c:Lcom/daaw/o95;

    new-instance v1, Lcom/daaw/rm4;

    iget-object v2, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/l95;

    new-instance p2, Lcom/daaw/cv5;

    invoke-direct {p2, p3}, Lcom/daaw/cv5;-><init>(Lcom/daaw/tq5;)V

    invoke-direct {p1, p2}, Lcom/daaw/l95;-><init>(Lcom/daaw/c15;)V

    invoke-virtual {v0, v1, p1}, Lcom/daaw/o95;->b(Lcom/daaw/rm4;Lcom/daaw/l95;)Lcom/daaw/k95;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/am4;->c()Lcom/daaw/nr4;

    move-result-object p2

    new-instance v0, Lcom/daaw/eg4;

    iget-object v1, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/oj6;

    invoke-direct {v0, v1}, Lcom/daaw/eg4;-><init>(Lcom/daaw/oj6;)V

    iget-object v1, p0, Lcom/daaw/dv5;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p2, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/k95;->m()Lcom/daaw/jv5;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/ys5;->h3(Lcom/daaw/gn3;)V

    invoke-virtual {p1}, Lcom/daaw/k95;->k()Lcom/daaw/j95;

    move-result-object p1

    return-object p1
.end method
