.class public final Lcom/daaw/fu;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lcom/daaw/eu;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/eu<",
            "-TT;>;I)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/eu;->d()Lcom/daaw/gl;

    move-result-object v0

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    instance-of v2, v0, Lcom/daaw/bu;

    if-eqz v2, :cond_2

    invoke-static {p1}, Lcom/daaw/fu;->b(I)Z

    move-result p1

    iget v2, p0, Lcom/daaw/eu;->r:I

    invoke-static {v2}, Lcom/daaw/fu;->b(I)Z

    move-result v2

    if-ne p1, v2, :cond_2

    move-object p1, v0

    check-cast p1, Lcom/daaw/bu;

    iget-object p1, p1, Lcom/daaw/bu;->s:Lcom/daaw/pl;

    invoke-interface {v0}, Lcom/daaw/gl;->getContext()Lcom/daaw/nl;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/pl;->U(Lcom/daaw/nl;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0, p0}, Lcom/daaw/pl;->T(Lcom/daaw/nl;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lcom/daaw/fu;->e(Lcom/daaw/eu;)V

    goto :goto_1

    :cond_2
    invoke-static {p0, v0, v1}, Lcom/daaw/fu;->d(Lcom/daaw/eu;Lcom/daaw/gl;Z)V

    :goto_1
    return-void
.end method

.method public static final b(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public static final c(I)Z
    .locals 1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(Lcom/daaw/eu;Lcom/daaw/gl;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/eu<",
            "-TT;>;",
            "Lcom/daaw/gl<",
            "-TT;>;Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/eu;->h()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/eu;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object p0, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-static {v1}, Lcom/daaw/s51;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-virtual {p0, v0}, Lcom/daaw/eu;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p2, :cond_5

    check-cast p1, Lcom/daaw/bu;

    iget-object p2, p1, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    iget-object v0, p1, Lcom/daaw/bu;->v:Ljava/lang/Object;

    invoke-interface {p2}, Lcom/daaw/gl;->getContext()Lcom/daaw/nl;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/daaw/bl1;->c(Lcom/daaw/nl;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lcom/daaw/bl1;->a:Lcom/daaw/pi1;

    if-eq v0, v2, :cond_1

    invoke-static {p2, v1, v0}, Lcom/daaw/ol;->c(Lcom/daaw/gl;Lcom/daaw/nl;Ljava/lang/Object;)Lcom/daaw/ip1;

    move-result-object p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    :try_start_0
    iget-object p1, p1, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    invoke-interface {p1, p0}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    sget-object p0, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/daaw/ip1;->l0()Z

    move-result p0

    if-eqz p0, :cond_6

    :cond_2
    invoke-static {v1, v0}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/daaw/ip1;->l0()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v1, v0}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    :cond_4
    throw p0

    :cond_5
    invoke-interface {p1, p0}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public static final e(Lcom/daaw/eu;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/eu<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/cl1;->a:Lcom/daaw/cl1;

    invoke-virtual {v0}, Lcom/daaw/cl1;->a()Lcom/daaw/dy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/dy;->c0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, Lcom/daaw/dy;->Y(Lcom/daaw/eu;)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/dy;->a0(Z)V

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/eu;->d()Lcom/daaw/gl;

    move-result-object v2

    invoke-static {p0, v2, v1}, Lcom/daaw/fu;->d(Lcom/daaw/eu;Lcom/daaw/gl;Z)V

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/dy;->e0()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v2

    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {p0, v2, v3}, Lcom/daaw/eu;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/daaw/dy;->W(Z)V

    :goto_1
    return-void

    :catchall_1
    move-exception p0

    invoke-virtual {v0, v1}, Lcom/daaw/dy;->W(Z)V

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method
