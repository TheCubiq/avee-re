.class public Lcom/daaw/tc1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/String;Ljava/util/List;)Lcom/daaw/h60;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;)",
            "Lcom/daaw/h60;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/h60;

    iget-object v3, v3, Lcom/daaw/h60;->b:Ljava/lang/String;

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/h60;

    return-object p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/h60;

    invoke-virtual {v2}, Lcom/daaw/h60;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/daaw/tc1;->a(Ljava/lang/String;Ljava/util/List;)Lcom/daaw/h60;

    move-result-object v2

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/h60;

    iget-object v1, v1, Lcom/daaw/h60;->b:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/h60;

    invoke-virtual {p0}, Lcom/daaw/h60;->a()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object p1
.end method

.method public static c(Ljava/lang/String;)Lcom/daaw/me0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/me0<",
            "Lcom/daaw/lo1<",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;",
            "Lcom/daaw/wf1;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/tc1;->e()Lcom/daaw/rc1;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lcom/daaw/rc1;->e(Ljava/lang/String;)Lcom/daaw/ir1;

    move-result-object v0

    new-instance v1, Lcom/daaw/kr1;

    new-instance v2, Lcom/daaw/tc1$g;

    invoke-direct {v2, p0}, Lcom/daaw/tc1$g;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0, v2}, Lcom/daaw/kr1;-><init>(Lcom/daaw/ir1;Lcom/daaw/r40;)V

    return-object v1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/me0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/tc1;->e()Lcom/daaw/rc1;

    move-result-object p0

    const-string v0, "0"

    invoke-virtual {p0, v0}, Lcom/daaw/rc1;->e(Ljava/lang/String;)Lcom/daaw/ir1;

    move-result-object p0

    new-instance v0, Lcom/daaw/kr1;

    new-instance v1, Lcom/daaw/tc1$f;

    invoke-direct {v1, p1}, Lcom/daaw/tc1$f;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Lcom/daaw/kr1;-><init>(Lcom/daaw/ir1;Lcom/daaw/r40;)V

    return-object v0
.end method

.method public static e()Lcom/daaw/rc1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rc1<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/sc1;",
            ">;",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/sc1;",
            ">;",
            "Lcom/daaw/h60;",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/tc1$c;

    invoke-direct {v0}, Lcom/daaw/tc1$c;-><init>()V

    new-instance v1, Lcom/daaw/tc1$d;

    invoke-direct {v1}, Lcom/daaw/tc1$d;-><init>()V

    new-instance v2, Lcom/daaw/tc1$e;

    invoke-direct {v2}, Lcom/daaw/tc1$e;-><init>()V

    new-instance v3, Lcom/daaw/er0$a;

    invoke-direct {v3}, Lcom/daaw/er0$a;-><init>()V

    const-string v4, "shoutcast_com_yp"

    invoke-static {v4, v0, v1, v2, v3}, Lcom/daaw/rc1;->d(Ljava/lang/String;Lcom/daaw/uc1$c;Lcom/daaw/r40;Lcom/daaw/uc1$d;Lcom/daaw/w40;)Lcom/daaw/rc1;

    move-result-object v0

    return-object v0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    const-string v0, "zC0wX0Pwb5nJy7o2"

    invoke-static {v0}, Lcom/daaw/bn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/s40;I)Lcom/daaw/ir1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<J:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/s40<",
            "Ljava/io/File;",
            "[",
            "Ljava/lang/Boolean;",
            "TJ;>;I)",
            "Lcom/daaw/ir1<",
            "TJ;>;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance p0, Lcom/daaw/ir1;

    new-instance p1, Lcom/daaw/tc1$a;

    invoke-direct {p1}, Lcom/daaw/tc1$a;-><init>()V

    invoke-direct {p0, p1}, Lcom/daaw/ir1;-><init>(Lcom/daaw/ir1$c;)V

    return-object p0

    :cond_0
    int-to-long v2, p3

    const-wide/16 v4, 0x3c

    mul-long v2, v2, v4

    const-wide/16 v4, 0x3e8

    mul-long v3, v2, v4

    new-instance p3, Lcom/daaw/ir1;

    new-instance v7, Lcom/daaw/tc1$b;

    move-object v0, v7

    move-object v2, p1

    move-object v5, p2

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lcom/daaw/tc1$b;-><init>(Landroid/content/Context;Ljava/lang/String;JLcom/daaw/s40;Ljava/lang/String;)V

    invoke-direct {p3, v7}, Lcom/daaw/ir1;-><init>(Lcom/daaw/ir1$c;)V

    return-object p3
.end method
