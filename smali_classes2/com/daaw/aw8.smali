.class public final Lcom/daaw/aw8;
.super Lcom/daaw/ad2;
.source ""


# instance fields
.field public final r:Lcom/daaw/h68;

.field public final s:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/daaw/h68;)V
    .locals 1

    const-string v0, "require"

    invoke-direct {p0, v0}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/aw8;->s:Ljava/util/Map;

    iput-object p1, p0, Lcom/daaw/aw8;->r:Lcom/daaw/h68;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 2

    const-string v0, "require"

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lcom/daaw/ou7;->h(Ljava/lang/String;ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/gl2;

    invoke-virtual {p1, p2}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/gl2;->zzi()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/aw8;->s:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/aw8;->s:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/gl2;

    return-object p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/aw8;->r:Lcom/daaw/h68;

    iget-object v0, p2, Lcom/daaw/h68;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p2, Lcom/daaw/h68;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/Callable;

    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/gl2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to create API implementation: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    sget-object p2, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    :goto_0
    instance-of v0, p2, Lcom/daaw/ad2;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/aw8;->s:Ljava/util/Map;

    move-object v1, p2

    check-cast v1, Lcom/daaw/ad2;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object p2
.end method
