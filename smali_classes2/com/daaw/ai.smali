.class public final synthetic Lcom/daaw/ai;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/bi;Lcom/daaw/i01;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lcom/daaw/bi;->g(Lcom/daaw/i01;)Lcom/daaw/b01;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lcom/daaw/b01;->get()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/daaw/bi;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/daaw/bi;->c(Lcom/daaw/i01;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lcom/daaw/bi;Ljava/lang/Class;)Lcom/daaw/es;
    .locals 0

    invoke-static {p1}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/daaw/bi;->h(Lcom/daaw/i01;)Lcom/daaw/es;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lcom/daaw/bi;Ljava/lang/Class;)Lcom/daaw/b01;
    .locals 0

    invoke-static {p1}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/daaw/bi;->g(Lcom/daaw/i01;)Lcom/daaw/b01;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lcom/daaw/bi;Lcom/daaw/i01;)Ljava/util/Set;
    .locals 0

    invoke-interface {p0, p1}, Lcom/daaw/bi;->b(Lcom/daaw/i01;)Lcom/daaw/b01;

    move-result-object p0

    invoke-interface {p0}, Lcom/daaw/b01;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method public static f(Lcom/daaw/bi;Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    invoke-static {p1}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/daaw/bi;->e(Lcom/daaw/i01;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method
