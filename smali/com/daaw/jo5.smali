.class public final Lcom/daaw/jo5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fn6;


# instance fields
.field public final p:Ljava/util/Map;

.field public final q:Ljava/util/Map;

.field public final r:Lcom/daaw/nn6;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lcom/daaw/nn6;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/jo5;->r:Lcom/daaw/nn6;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/daaw/jo5;->p:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/daaw/jo5;->q:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/io5;

    iget-object v0, p0, Lcom/daaw/jo5;->p:Ljava/util/Map;

    invoke-static {p2}, Lcom/daaw/io5;->b(Lcom/daaw/io5;)Lcom/daaw/ym6;

    move-result-object v1

    invoke-static {p2}, Lcom/daaw/io5;->c(Lcom/daaw/io5;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/jo5;->q:Ljava/util/Map;

    invoke-static {p2}, Lcom/daaw/io5;->a(Lcom/daaw/io5;)Lcom/daaw/ym6;

    move-result-object v1

    invoke-static {p2}, Lcom/daaw/io5;->c(Lcom/daaw/io5;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jo5;->r:Lcom/daaw/nn6;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "task."

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/daaw/nn6;->d(Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object p2, p0, Lcom/daaw/jo5;->p:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/jo5;->r:Lcom/daaw/nn6;

    iget-object v0, p0, Lcom/daaw/jo5;->p:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "label."

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/nn6;->d(Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_0
    return-void
.end method

.method public final M(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jo5;->r:Lcom/daaw/nn6;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "task."

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "s."

    invoke-virtual {v0, p2, v1}, Lcom/daaw/nn6;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object p2, p0, Lcom/daaw/jo5;->q:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/jo5;->r:Lcom/daaw/nn6;

    iget-object v0, p0, Lcom/daaw/jo5;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "label."

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, v1}, Lcom/daaw/nn6;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_0
    return-void
.end method

.method public final S(Lcom/daaw/ym6;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    iget-object p3, p0, Lcom/daaw/jo5;->r:Lcom/daaw/nn6;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "task."

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "f."

    invoke-virtual {p3, p2, v0}, Lcom/daaw/nn6;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object p2, p0, Lcom/daaw/jo5;->q:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/jo5;->r:Lcom/daaw/nn6;

    iget-object p3, p0, Lcom/daaw/jo5;->q:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "label."

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Lcom/daaw/nn6;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_0
    return-void
.end method

.method public final k(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 0

    return-void
.end method
