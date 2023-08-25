.class public Lcom/daaw/jx0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jx0$a;
    }
.end annotation


# direct methods
.method public static a(JLjava/lang/String;Lcom/daaw/jx0$a;)Lcom/daaw/tx0;
    .locals 1

    new-instance v0, Lcom/daaw/tx0;

    iget-object p3, p3, Lcom/daaw/jx0$a;->a:Ljava/lang/String;

    invoke-static {p2, p3}, Lcom/daaw/jx0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/tx0;-><init>(JLjava/lang/String;)V

    return-object v0
.end method

.method public static b(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/jx0$a;)Lcom/daaw/tx0;
    .locals 7

    new-instance v6, Lcom/daaw/tx0;

    iget-object p5, p5, Lcom/daaw/jx0$a;->a:Ljava/lang/String;

    invoke-static {p2, p5}, Lcom/daaw/jx0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v0, v6

    move-wide v1, p0

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/tx0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lcom/daaw/jx0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "\\"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Lcom/daaw/jx0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v0, ".."

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p0, p1}, Lcom/daaw/jx0;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {p0, p1}, Lcom/daaw/jx0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0

    :cond_3
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p0, p1}, Lcom/daaw/jx0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p0, p1}, Lcom/daaw/jx0;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {p0, p1}, Lcom/daaw/jx0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p1

    :cond_0
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static f(Lcom/daaw/zl0;Lcom/daaw/jx0$a;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zl0;",
            "Lcom/daaw/jx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/zl0;->d(Z)V

    invoke-virtual {p0}, Lcom/daaw/zl0;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/a51;

    const-wide/16 v2, -0x1

    invoke-virtual {v1}, Lcom/daaw/a51;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/daaw/a51;->c()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lcom/daaw/jx0;->b(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/jx0$a;)Lcom/daaw/tx0;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static g(Lcom/daaw/bm0;Lcom/daaw/jx0$a;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/bm0;",
            "Lcom/daaw/jx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/bm0;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/y41;

    const-wide/16 v2, -0x1

    invoke-virtual {v1}, Lcom/daaw/y41;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v1}, Lcom/daaw/y41;->b()Ljava/lang/String;

    move-result-object v6

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lcom/daaw/jx0;->b(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/jx0$a;)Lcom/daaw/tx0;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static h(Lcom/daaw/bv0;Lcom/daaw/jx0$a;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/bv0;",
            "Lcom/daaw/jx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/bv0;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/daaw/br1;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, -0x1

    invoke-static {v2, v3, v1, p1}, Lcom/daaw/jx0;->a(JLjava/lang/String;Lcom/daaw/jx0$a;)Lcom/daaw/tx0;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static i(Lcom/daaw/dv0;Lcom/daaw/jx0$a;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/dv0;",
            "Lcom/daaw/jx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/dv0;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-wide/16 v2, -0x1

    invoke-static {v2, v3, v1, p1}, Lcom/daaw/jx0;->a(JLjava/lang/String;Lcom/daaw/jx0$a;)Lcom/daaw/tx0;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static j(Lcom/daaw/fv0;Lcom/daaw/jx0$a;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/fv0;",
            "Lcom/daaw/jx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/a51;

    const-wide/16 v2, -0x1

    invoke-virtual {v1}, Lcom/daaw/a51;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/daaw/a51;->c()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lcom/daaw/jx0;->b(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/jx0$a;)Lcom/daaw/tx0;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static k(Lcom/daaw/oe1;Lcom/daaw/jx0$a;Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/oe1;",
            "Lcom/daaw/jx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p0, Lcom/daaw/bv0;

    if-eqz v1, :cond_1

    check-cast p0, Lcom/daaw/bv0;

    invoke-static {p0, p1, p2}, Lcom/daaw/jx0;->h(Lcom/daaw/bv0;Lcom/daaw/jx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_1
    instance-of v1, p0, Lcom/daaw/hz1;

    if-eqz v1, :cond_2

    check-cast p0, Lcom/daaw/hz1;

    invoke-static {p0, p1, p2}, Lcom/daaw/jx0;->l(Lcom/daaw/hz1;Lcom/daaw/jx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_2
    instance-of v1, p0, Lcom/daaw/fv0;

    if-eqz v1, :cond_3

    check-cast p0, Lcom/daaw/fv0;

    invoke-static {p0, p1, p2}, Lcom/daaw/jx0;->j(Lcom/daaw/fv0;Lcom/daaw/jx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_3
    instance-of v1, p0, Lcom/daaw/bm0;

    if-eqz v1, :cond_4

    check-cast p0, Lcom/daaw/bm0;

    invoke-static {p0, p1, p2}, Lcom/daaw/jx0;->g(Lcom/daaw/bm0;Lcom/daaw/jx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_4
    instance-of v1, p0, Lcom/daaw/dv0;

    if-eqz v1, :cond_5

    check-cast p0, Lcom/daaw/dv0;

    invoke-static {p0, p1, p2}, Lcom/daaw/jx0;->i(Lcom/daaw/dv0;Lcom/daaw/jx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_5
    instance-of v1, p0, Lcom/daaw/zl0;

    if-eqz v1, :cond_6

    check-cast p0, Lcom/daaw/zl0;

    invoke-static {p0, p1, p2}, Lcom/daaw/jx0;->f(Lcom/daaw/zl0;Lcom/daaw/jx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_6
    return v0
.end method

.method public static l(Lcom/daaw/hz1;Lcom/daaw/jx0$a;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hz1;",
            "Lcom/daaw/jx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/hz1;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ox;

    const-wide/16 v2, -0x1

    invoke-virtual {v1}, Lcom/daaw/ox;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v1, p1}, Lcom/daaw/jx0;->a(JLjava/lang/String;Lcom/daaw/jx0$a;)Lcom/daaw/tx0;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method
