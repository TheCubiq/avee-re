.class public abstract Lcom/daaw/eu;
.super Lcom/daaw/qj1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/qj1;"
    }
.end annotation


# instance fields
.field public r:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/qj1;-><init>()V

    iput p1, p0, Lcom/daaw/eu;->r:I

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public abstract d()Lcom/daaw/gl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/gl<",
            "TT;>;"
        }
    .end annotation
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Lcom/daaw/nh;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/nh;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p1, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    :goto_1
    return-object v1
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p1
.end method

.method public final g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, Lcom/daaw/xy;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    if-nez p1, :cond_2

    move-object p1, p2

    :cond_2
    new-instance p2, Lcom/daaw/wl;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fatal exception in coroutines machinery for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    invoke-direct {p2, v0, p1}, Lcom/daaw/wl;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/daaw/eu;->d()Lcom/daaw/gl;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/gl;->getContext()Lcom/daaw/nl;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/daaw/sl;->a(Lcom/daaw/nl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract h()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/daaw/qj1;->q:Lcom/daaw/uj1;

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/eu;->d()Lcom/daaw/gl;

    move-result-object v1

    check-cast v1, Lcom/daaw/bu;

    iget-object v2, v1, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    iget-object v1, v1, Lcom/daaw/bu;->v:Ljava/lang/Object;

    invoke-interface {v2}, Lcom/daaw/gl;->getContext()Lcom/daaw/nl;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/daaw/bl1;->c(Lcom/daaw/nl;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lcom/daaw/bl1;->a:Lcom/daaw/pi1;

    const/4 v5, 0x0

    if-eq v1, v4, :cond_0

    invoke-static {v2, v3, v1}, Lcom/daaw/ol;->c(Lcom/daaw/gl;Lcom/daaw/nl;Ljava/lang/Object;)Lcom/daaw/ip1;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    :try_start_1
    invoke-interface {v2}, Lcom/daaw/gl;->getContext()Lcom/daaw/nl;

    move-result-object v6

    invoke-virtual {p0}, Lcom/daaw/eu;->h()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v7}, Lcom/daaw/eu;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_1

    iget v9, p0, Lcom/daaw/eu;->r:I

    invoke-static {v9}, Lcom/daaw/fu;->b(I)Z

    move-result v9

    if-eqz v9, :cond_1

    sget-object v9, Lcom/daaw/mh0;->d:Lcom/daaw/mh0$b;

    invoke-interface {v6, v9}, Lcom/daaw/nl;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object v6

    check-cast v6, Lcom/daaw/mh0;

    goto :goto_1

    :cond_1
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_2

    invoke-interface {v6}, Lcom/daaw/mh0;->d()Z

    move-result v9

    if-nez v9, :cond_2

    invoke-interface {v6}, Lcom/daaw/mh0;->q()Ljava/util/concurrent/CancellationException;

    move-result-object v6

    invoke-virtual {p0, v7, v6}, Lcom/daaw/eu;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v7, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-static {v6}, Lcom/daaw/s51;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_2
    invoke-interface {v2, v6}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    if-eqz v8, :cond_3

    sget-object v6, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-static {v8}, Lcom/daaw/s51;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v7}, Lcom/daaw/eu;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-static {v6}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    :goto_3
    sget-object v2, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_4

    :try_start_2
    invoke-virtual {v4}, Lcom/daaw/ip1;->l0()Z

    move-result v4

    if-eqz v4, :cond_5

    :cond_4
    invoke-static {v3, v1}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_5
    :try_start_3
    sget-object v1, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-interface {v0}, Lcom/daaw/uj1;->a()V

    invoke-static {v2}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-static {v0}, Lcom/daaw/s51;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lcom/daaw/p51;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v5, v0}, Lcom/daaw/eu;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_6

    :catchall_1
    move-exception v2

    if-eqz v4, :cond_6

    :try_start_4
    invoke-virtual {v4}, Lcom/daaw/ip1;->l0()Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    invoke-static {v3, v1}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    :cond_7
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_5
    sget-object v2, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-interface {v0}, Lcom/daaw/uj1;->a()V

    sget-object v0, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;

    invoke-static {v0}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    sget-object v2, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-static {v0}, Lcom/daaw/s51;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Lcom/daaw/p51;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/daaw/eu;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_6
    return-void
.end method
