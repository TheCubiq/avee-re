.class public final Lcom/daaw/rh;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljava/lang/Object;Lcom/daaw/gl;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/daaw/gl<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p0, Lcom/daaw/nh;

    if-eqz p1, :cond_0

    sget-object p1, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    check-cast p0, Lcom/daaw/nh;

    iget-object p0, p0, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    invoke-static {p0}, Lcom/daaw/s51;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    :goto_0
    invoke-static {p0}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Object;Lcom/daaw/ud;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/daaw/ud<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Lcom/daaw/p51;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/daaw/nh;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/daaw/nh;-><init>(Ljava/lang/Throwable;ZILcom/daaw/pq;)V

    :goto_0
    return-object p0
.end method

.method public static final c(Ljava/lang/Object;Lcom/daaw/z40;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Lcom/daaw/p51;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    new-instance v0, Lcom/daaw/oh;

    invoke-direct {v0, p0, p1}, Lcom/daaw/oh;-><init>(Ljava/lang/Object;Lcom/daaw/z40;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/daaw/nh;

    const/4 p1, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/daaw/nh;-><init>(Ljava/lang/Throwable;ZILcom/daaw/pq;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lcom/daaw/z40;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/daaw/rh;->c(Ljava/lang/Object;Lcom/daaw/z40;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
