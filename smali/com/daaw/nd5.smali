.class public final Lcom/daaw/nd5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fn6;


# instance fields
.field public final p:Ljava/util/Map;

.field public final q:Lcom/daaw/fd5;

.field public final r:Lcom/daaw/ag;

.field public final s:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/daaw/fd5;Ljava/util/Set;Lcom/daaw/ag;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nd5;->q:Lcom/daaw/fd5;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/nd5;->p:Ljava/util/Map;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/nd5;->s:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/md5;

    iget-object v0, p0, Lcom/daaw/nd5;->s:Ljava/util/Map;

    invoke-static {p2}, Lcom/daaw/md5;->a(Lcom/daaw/md5;)Lcom/daaw/ym6;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p3, p0, Lcom/daaw/nd5;->r:Lcom/daaw/ag;

    return-void
.end method


# virtual methods
.method public final A(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 2

    iget-object p2, p0, Lcom/daaw/nd5;->p:Ljava/util/Map;

    iget-object v0, p0, Lcom/daaw/nd5;->r:Lcom/daaw/ag;

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final M(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/nd5;->p:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/nd5;->r:Lcom/daaw/ag;

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/nd5;->p:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v4, p0, Lcom/daaw/nd5;->q:Lcom/daaw/fd5;

    invoke-virtual {v4}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v5, "task."

    invoke-virtual {v5, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "s."

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p2, p0, Lcom/daaw/nd5;->s:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/nd5;->a(Lcom/daaw/ym6;Z)V

    :cond_1
    return-void
.end method

.method public final S(Lcom/daaw/ym6;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 5

    iget-object p3, p0, Lcom/daaw/nd5;->p:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/daaw/nd5;->r:Lcom/daaw/ag;

    invoke-interface {p3}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iget-object p3, p0, Lcom/daaw/nd5;->p:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object p3, p0, Lcom/daaw/nd5;->q:Lcom/daaw/fd5;

    invoke-virtual {p3}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v4, "task."

    invoke-virtual {v4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "f."

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p2, p0, Lcom/daaw/nd5;->s:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/nd5;->a(Lcom/daaw/ym6;Z)V

    :cond_1
    return-void
.end method

.method public final a(Lcom/daaw/ym6;Z)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/nd5;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/md5;

    invoke-static {v0}, Lcom/daaw/md5;->b(Lcom/daaw/md5;)Lcom/daaw/ym6;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v1, p2, :cond_0

    const-string p2, "f."

    goto :goto_0

    :cond_0
    const-string p2, "s."

    :goto_0
    iget-object v1, p0, Lcom/daaw/nd5;->p:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/nd5;->r:Lcom/daaw/ag;

    invoke-interface {v1}, Lcom/daaw/ag;->b()J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/nd5;->p:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v0, p0, Lcom/daaw/nd5;->q:Lcom/daaw/fd5;

    invoke-virtual {v0}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object v0

    iget-object v5, p0, Lcom/daaw/nd5;->s:Ljava/util/Map;

    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/md5;

    invoke-static {p1}, Lcom/daaw/md5;->c(Lcom/daaw/md5;)Ljava/lang/String;

    move-result-object p1

    const-string v5, "label."

    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final k(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 0

    return-void
.end method
