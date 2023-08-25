.class public final Lcom/daaw/am3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mh3;


# instance fields
.field public final a:Lcom/daaw/al3;

.field public final b:Lcom/daaw/e14;

.field public final synthetic c:Lcom/daaw/bm3;


# direct methods
.method public constructor <init>(Lcom/daaw/bm3;Lcom/daaw/al3;Lcom/daaw/e14;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/am3;->c:Lcom/daaw/bm3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/am3;->a:Lcom/daaw/al3;

    iput-object p3, p0, Lcom/daaw/am3;->b:Lcom/daaw/e14;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/am3;->b:Lcom/daaw/e14;

    iget-object v1, p0, Lcom/daaw/am3;->c:Lcom/daaw/bm3;

    invoke-static {v1}, Lcom/daaw/bm3;->b(Lcom/daaw/bm3;)Lcom/daaw/pl3;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/daaw/pl3;->b(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :goto_0
    iget-object p1, p0, Lcom/daaw/am3;->a:Lcom/daaw/al3;

    invoke-virtual {p1}, Lcom/daaw/al3;->g()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :try_start_1
    iget-object v0, p0, Lcom/daaw/am3;->b:Lcom/daaw/e14;

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/daaw/am3;->a:Lcom/daaw/al3;

    invoke-virtual {v0}, Lcom/daaw/al3;->g()V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/daaw/am3;->b:Lcom/daaw/e14;

    new-instance v0, Lcom/daaw/ml3;

    invoke-direct {v0}, Lcom/daaw/ml3;-><init>()V

    invoke-virtual {p1, v0}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/am3;->b:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/ml3;

    invoke-direct {v1, p1}, Lcom/daaw/ml3;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :goto_0
    iget-object p1, p0, Lcom/daaw/am3;->a:Lcom/daaw/al3;

    invoke-virtual {p1}, Lcom/daaw/al3;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/am3;->a:Lcom/daaw/al3;

    invoke-virtual {v0}, Lcom/daaw/al3;->g()V

    throw p1
.end method
