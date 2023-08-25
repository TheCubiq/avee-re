.class public final Lcom/daaw/mu2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lcom/daaw/u83;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/mu2;->a:Ljava/util/Map;

    new-instance v0, Lcom/daaw/u83;

    invoke-direct {v0}, Lcom/daaw/u83;-><init>()V

    iput-object v0, p0, Lcom/daaw/mu2;->b:Lcom/daaw/u83;

    new-instance v0, Lcom/daaw/gs2;

    invoke-direct {v0}, Lcom/daaw/gs2;-><init>()V

    invoke-virtual {p0, v0}, Lcom/daaw/mu2;->b(Lcom/daaw/it2;)V

    new-instance v0, Lcom/daaw/kv2;

    invoke-direct {v0}, Lcom/daaw/kv2;-><init>()V

    invoke-virtual {p0, v0}, Lcom/daaw/mu2;->b(Lcom/daaw/it2;)V

    new-instance v0, Lcom/daaw/ow2;

    invoke-direct {v0}, Lcom/daaw/ow2;-><init>()V

    invoke-virtual {p0, v0}, Lcom/daaw/mu2;->b(Lcom/daaw/it2;)V

    new-instance v0, Lcom/daaw/t03;

    invoke-direct {v0}, Lcom/daaw/t03;-><init>()V

    invoke-virtual {p0, v0}, Lcom/daaw/mu2;->b(Lcom/daaw/it2;)V

    new-instance v0, Lcom/daaw/l63;

    invoke-direct {v0}, Lcom/daaw/l63;-><init>()V

    invoke-virtual {p0, v0}, Lcom/daaw/mu2;->b(Lcom/daaw/it2;)V

    new-instance v0, Lcom/daaw/q73;

    invoke-direct {v0}, Lcom/daaw/q73;-><init>()V

    invoke-virtual {p0, v0}, Lcom/daaw/mu2;->b(Lcom/daaw/it2;)V

    new-instance v0, Lcom/daaw/y93;

    invoke-direct {v0}, Lcom/daaw/y93;-><init>()V

    invoke-virtual {p0, v0}, Lcom/daaw/mu2;->b(Lcom/daaw/it2;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Lcom/daaw/gl2;)Lcom/daaw/gl2;
    .locals 2

    invoke-static {p1}, Lcom/daaw/ou7;->c(Lcom/daaw/w07;)I

    instance-of v0, p2, Lcom/daaw/km2;

    if-eqz v0, :cond_1

    check-cast p2, Lcom/daaw/km2;

    invoke-virtual {p2}, Lcom/daaw/km2;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p2}, Lcom/daaw/km2;->a()Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lcom/daaw/mu2;->a:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/mu2;->a:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/it2;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/mu2;->b:Lcom/daaw/u83;

    :goto_0
    invoke-virtual {v1, p2, p1, v0}, Lcom/daaw/it2;->a(Ljava/lang/String;Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p2
.end method

.method public final b(Lcom/daaw/it2;)V
    .locals 3

    iget-object v0, p1, Lcom/daaw/it2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/db3;

    invoke-virtual {v1}, Lcom/daaw/db3;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/mu2;->a:Ljava/util/Map;

    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
