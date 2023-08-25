.class public final Lcom/daaw/ol;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lcom/daaw/nl;)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Lcom/daaw/vl;)Lcom/daaw/ip1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vl;",
            ")",
            "Lcom/daaw/ip1<",
            "*>;"
        }
    .end annotation

    :cond_0
    instance-of v0, p0, Lcom/daaw/du;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p0}, Lcom/daaw/vl;->a()Lcom/daaw/vl;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    instance-of v0, p0, Lcom/daaw/ip1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/ip1;

    return-object p0
.end method

.method public static final c(Lcom/daaw/gl;Lcom/daaw/nl;Ljava/lang/Object;)Lcom/daaw/ip1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/gl<",
            "*>;",
            "Lcom/daaw/nl;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/daaw/ip1<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Lcom/daaw/vl;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lcom/daaw/jp1;->p:Lcom/daaw/jp1;

    invoke-interface {p1, v0}, Lcom/daaw/nl;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    check-cast p0, Lcom/daaw/vl;

    invoke-static {p0}, Lcom/daaw/ol;->b(Lcom/daaw/vl;)Lcom/daaw/ip1;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/daaw/ip1;->m0(Lcom/daaw/nl;Ljava/lang/Object;)V

    :goto_1
    return-object p0
.end method
