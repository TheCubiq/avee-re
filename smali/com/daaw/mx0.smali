.class public Lcom/daaw/mx0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/mx0$a;
    }
.end annotation


# direct methods
.method public static a(Lcom/daaw/zl0;Lcom/daaw/mx0$a;Ljava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zl0;",
            "Lcom/daaw/mx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/daaw/zl0;->d(Z)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/tx0;

    new-instance v3, Lcom/daaw/a51;

    invoke-direct {v3}, Lcom/daaw/a51;-><init>()V

    iget-object v4, p1, Lcom/daaw/mx0$a;->a:Ljava/lang/String;

    iget-boolean v5, p1, Lcom/daaw/mx0$a;->b:Z

    invoke-static {v2, v4, v5}, Lcom/daaw/mx0;->h(Lcom/daaw/tx0;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/daaw/a51;->e(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    invoke-virtual {v2, v0}, Lcom/daaw/tx0;->j(Landroid/content/Context;)Lcom/daaw/tx0$b;

    move-result-object v2

    iget-object v4, v2, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/daaw/a51;->f(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/daaw/tx0$b;->f()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v3, v4, v5}, Lcom/daaw/a51;->d(J)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/zl0;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static b(Lcom/daaw/bm0;Lcom/daaw/mx0$a;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/bm0;",
            "Lcom/daaw/mx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tx0;

    new-instance v2, Lcom/daaw/y41;

    invoke-direct {v2}, Lcom/daaw/y41;-><init>()V

    iget-object v3, p1, Lcom/daaw/mx0$a;->a:Ljava/lang/String;

    iget-boolean v4, p1, Lcom/daaw/mx0$a;->b:Z

    invoke-static {v1, v3, v4}, Lcom/daaw/mx0;->h(Lcom/daaw/tx0;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/daaw/y41;->d(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/bm0;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static c(Lcom/daaw/bv0;Lcom/daaw/mx0$a;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/bv0;",
            "Lcom/daaw/mx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tx0;

    invoke-virtual {p0}, Lcom/daaw/bv0;->c()Ljava/util/List;

    move-result-object v2

    iget-object v3, p1, Lcom/daaw/mx0$a;->a:Ljava/lang/String;

    iget-boolean v4, p1, Lcom/daaw/mx0$a;->b:Z

    invoke-static {v1, v3, v4}, Lcom/daaw/mx0;->h(Lcom/daaw/tx0;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static d(Lcom/daaw/dv0;Lcom/daaw/mx0$a;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/dv0;",
            "Lcom/daaw/mx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tx0;

    invoke-virtual {p0}, Lcom/daaw/dv0;->c()Ljava/util/List;

    move-result-object v2

    iget-object v3, p1, Lcom/daaw/mx0$a;->a:Ljava/lang/String;

    iget-boolean v4, p1, Lcom/daaw/mx0$a;->b:Z

    invoke-static {v1, v3, v4}, Lcom/daaw/mx0;->h(Lcom/daaw/tx0;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static e(Lcom/daaw/fv0;Lcom/daaw/mx0$a;Ljava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/fv0;",
            "Lcom/daaw/mx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/tx0;

    new-instance v3, Lcom/daaw/a51;

    invoke-direct {v3}, Lcom/daaw/a51;-><init>()V

    iget-object v4, p1, Lcom/daaw/mx0$a;->a:Ljava/lang/String;

    iget-boolean v5, p1, Lcom/daaw/mx0$a;->b:Z

    invoke-static {v2, v4, v5}, Lcom/daaw/mx0;->h(Lcom/daaw/tx0;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/daaw/a51;->e(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    invoke-virtual {v2, v0}, Lcom/daaw/tx0;->j(Landroid/content/Context;)Lcom/daaw/tx0$b;

    move-result-object v2

    iget-object v4, v2, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/daaw/a51;->f(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/daaw/tx0$b;->f()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v3, v4, v5}, Lcom/daaw/a51;->d(J)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static f(Lcom/daaw/oe1;Lcom/daaw/mx0$a;Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/oe1;",
            "Lcom/daaw/mx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_1

    return v0

    :cond_1
    instance-of v1, p0, Lcom/daaw/bv0;

    if-eqz v1, :cond_2

    check-cast p0, Lcom/daaw/bv0;

    invoke-static {p0, p1, p2}, Lcom/daaw/mx0;->c(Lcom/daaw/bv0;Lcom/daaw/mx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_2
    instance-of v1, p0, Lcom/daaw/hz1;

    if-eqz v1, :cond_3

    check-cast p0, Lcom/daaw/hz1;

    invoke-static {p0, p1, p2}, Lcom/daaw/mx0;->g(Lcom/daaw/hz1;Lcom/daaw/mx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_3
    instance-of v1, p0, Lcom/daaw/fv0;

    if-eqz v1, :cond_4

    check-cast p0, Lcom/daaw/fv0;

    invoke-static {p0, p1, p2}, Lcom/daaw/mx0;->e(Lcom/daaw/fv0;Lcom/daaw/mx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_4
    instance-of v1, p0, Lcom/daaw/bm0;

    if-eqz v1, :cond_5

    check-cast p0, Lcom/daaw/bm0;

    invoke-static {p0, p1, p2}, Lcom/daaw/mx0;->b(Lcom/daaw/bm0;Lcom/daaw/mx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_5
    instance-of v1, p0, Lcom/daaw/dv0;

    if-eqz v1, :cond_6

    check-cast p0, Lcom/daaw/dv0;

    invoke-static {p0, p1, p2}, Lcom/daaw/mx0;->d(Lcom/daaw/dv0;Lcom/daaw/mx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_6
    instance-of v1, p0, Lcom/daaw/zl0;

    if-eqz v1, :cond_7

    check-cast p0, Lcom/daaw/zl0;

    invoke-static {p0, p1, p2}, Lcom/daaw/mx0;->a(Lcom/daaw/zl0;Lcom/daaw/mx0$a;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_7
    return v0
.end method

.method public static g(Lcom/daaw/hz1;Lcom/daaw/mx0$a;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hz1;",
            "Lcom/daaw/mx0$a;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tx0;

    new-instance v2, Lcom/daaw/ox;

    invoke-direct {v2}, Lcom/daaw/ox;-><init>()V

    iget-object v3, p1, Lcom/daaw/mx0$a;->a:Ljava/lang/String;

    iget-boolean v4, p1, Lcom/daaw/mx0$a;->b:Z

    invoke-static {v1, v3, v4}, Lcom/daaw/mx0;->h(Lcom/daaw/tx0;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/daaw/ox;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/hz1;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static h(Lcom/daaw/tx0;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tx0;->m()Ljava/lang/String;

    move-result-object p0

    const-string v0, "file://"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x7

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    if-eqz p2, :cond_1

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "/"

    invoke-static {p0, p1, p2}, Lcom/daaw/cr1;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method
