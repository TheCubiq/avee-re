.class public final Lcom/daaw/cu;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/pi1;

.field public static final b:Lcom/daaw/pi1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/cu;->a:Lcom/daaw/pi1;

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/cu;->b:Lcom/daaw/pi1;

    return-void
.end method

.method public static final synthetic a()Lcom/daaw/pi1;
    .locals 1

    sget-object v0, Lcom/daaw/cu;->a:Lcom/daaw/pi1;

    return-object v0
.end method

.method public static final b(Lcom/daaw/gl;Ljava/lang/Object;Lcom/daaw/z40;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/gl<",
            "-TT;>;",
            "Ljava/lang/Object;",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p0, Lcom/daaw/bu;

    if-eqz v0, :cond_8

    check-cast p0, Lcom/daaw/bu;

    invoke-static {p1, p2}, Lcom/daaw/rh;->c(Ljava/lang/Object;Lcom/daaw/z40;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/bu;->s:Lcom/daaw/pl;

    invoke-virtual {p0}, Lcom/daaw/bu;->getContext()Lcom/daaw/nl;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/pl;->U(Lcom/daaw/nl;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object p2, p0, Lcom/daaw/bu;->u:Ljava/lang/Object;

    iput v1, p0, Lcom/daaw/eu;->r:I

    iget-object p1, p0, Lcom/daaw/bu;->s:Lcom/daaw/pl;

    invoke-virtual {p0}, Lcom/daaw/bu;->getContext()Lcom/daaw/nl;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lcom/daaw/pl;->T(Lcom/daaw/nl;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    sget-object v0, Lcom/daaw/cl1;->a:Lcom/daaw/cl1;

    invoke-virtual {v0}, Lcom/daaw/cl1;->a()Lcom/daaw/dy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/dy;->c0()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-object p2, p0, Lcom/daaw/bu;->u:Ljava/lang/Object;

    iput v1, p0, Lcom/daaw/eu;->r:I

    invoke-virtual {v0, p0}, Lcom/daaw/dy;->Y(Lcom/daaw/eu;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0, v1}, Lcom/daaw/dy;->a0(Z)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/bu;->getContext()Lcom/daaw/nl;

    move-result-object v3

    sget-object v4, Lcom/daaw/mh0;->d:Lcom/daaw/mh0$b;

    invoke-interface {v3, v4}, Lcom/daaw/nl;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object v3

    check-cast v3, Lcom/daaw/mh0;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lcom/daaw/mh0;->d()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Lcom/daaw/mh0;->q()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    invoke-virtual {p0, p2, v3}, Lcom/daaw/bu;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object p2, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-static {v3}, Lcom/daaw/s51;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p2}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_7

    iget-object p2, p0, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    iget-object v3, p0, Lcom/daaw/bu;->v:Ljava/lang/Object;

    invoke-interface {p2}, Lcom/daaw/gl;->getContext()Lcom/daaw/nl;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/daaw/bl1;->c(Lcom/daaw/nl;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lcom/daaw/bl1;->a:Lcom/daaw/pi1;

    if-eq v3, v5, :cond_3

    invoke-static {p2, v4, v3}, Lcom/daaw/ol;->c(Lcom/daaw/gl;Lcom/daaw/nl;Ljava/lang/Object;)Lcom/daaw/ip1;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    :try_start_1
    iget-object v5, p0, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    invoke-interface {v5, p1}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    sget-object p1, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    :try_start_2
    invoke-virtual {p2}, Lcom/daaw/ip1;->l0()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_4
    invoke-static {v4, v3}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/daaw/ip1;->l0()Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_5
    invoke-static {v4, v3}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    :cond_6
    throw p1

    :cond_7
    :goto_2
    invoke-virtual {v0}, Lcom/daaw/dy;->e0()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_7

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v2}, Lcom/daaw/eu;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    invoke-virtual {v0, v1}, Lcom/daaw/dy;->W(Z)V

    goto :goto_4

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v1}, Lcom/daaw/dy;->W(Z)V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static synthetic c(Lcom/daaw/gl;Ljava/lang/Object;Lcom/daaw/z40;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/daaw/cu;->b(Lcom/daaw/gl;Ljava/lang/Object;Lcom/daaw/z40;)V

    return-void
.end method
