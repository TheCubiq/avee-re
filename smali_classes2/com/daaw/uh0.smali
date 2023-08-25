.class public Lcom/daaw/uh0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mh0;
.implements Lcom/daaw/bf;
.implements Lcom/daaw/pv0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/uh0$b;,
        Lcom/daaw/uh0$a;
    }
.end annotation


# static fields
.field public static final synthetic p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle:Ljava/lang/Object;

.field private volatile synthetic _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/daaw/uh0;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/uh0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public static synthetic b0(Lcom/daaw/uh0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/daaw/uh0;->a0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic c(Lcom/daaw/uh0;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/uh0;->m()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/daaw/uh0;Lcom/daaw/uh0$b;Lcom/daaw/af;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/uh0;->r(Lcom/daaw/uh0$b;Lcom/daaw/af;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final B(Lcom/daaw/qf0;)Lcom/daaw/ys0;
    .locals 2

    invoke-interface {p1}, Lcom/daaw/qf0;->e()Lcom/daaw/ys0;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/daaw/kw;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/ys0;

    invoke-direct {v0}, Lcom/daaw/ys0;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/daaw/th0;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/th0;

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->W(Lcom/daaw/th0;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "State should have list: "

    invoke-static {v1, p1}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final C()Lcom/daaw/ze;
    .locals 1

    iget-object v0, p0, Lcom/daaw/uh0;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/ze;

    return-object v0
.end method

.method public final F()Ljava/lang/Object;
    .locals 2

    :goto_0
    iget-object v0, p0, Lcom/daaw/uh0;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lcom/daaw/pu0;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lcom/daaw/pu0;

    invoke-virtual {v0, p0}, Lcom/daaw/pu0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public G(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public H(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method

.method public I()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final J(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/daaw/uh0$b;

    if-eqz v3, :cond_7

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, Lcom/daaw/uh0$b;

    invoke-virtual {v3}, Lcom/daaw/uh0$b;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lcom/daaw/vh0;->e()Lcom/daaw/pi1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Lcom/daaw/uh0$b;

    invoke-virtual {v3}, Lcom/daaw/uh0$b;->g()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->s(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_3
    move-object p1, v2

    check-cast p1, Lcom/daaw/uh0$b;

    invoke-virtual {p1, v1}, Lcom/daaw/uh0$b;->a(Ljava/lang/Throwable;)V

    :cond_4
    move-object p1, v2

    check-cast p1, Lcom/daaw/uh0$b;

    invoke-virtual {p1}, Lcom/daaw/uh0$b;->f()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    check-cast v2, Lcom/daaw/uh0$b;

    invoke-virtual {v2}, Lcom/daaw/uh0$b;->e()Lcom/daaw/ys0;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/uh0;->R(Lcom/daaw/ys0;Ljava/lang/Throwable;)V

    :goto_1
    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_7
    instance-of v3, v2, Lcom/daaw/qf0;

    if-eqz v3, :cond_c

    if-nez v1, :cond_8

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->s(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object v3, v2

    check-cast v3, Lcom/daaw/qf0;

    invoke-interface {v3}, Lcom/daaw/qf0;->d()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {p0, v3, v1}, Lcom/daaw/uh0;->e0(Lcom/daaw/qf0;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v3, Lcom/daaw/nh;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, Lcom/daaw/nh;-><init>(Ljava/lang/Throwable;ZILcom/daaw/pq;)V

    invoke-virtual {p0, v2, v3}, Lcom/daaw/uh0;->f0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object v4

    if-eq v3, v4, :cond_b

    invoke-static {}, Lcom/daaw/vh0;->b()Lcom/daaw/pi1;

    move-result-object v2

    if-ne v3, v2, :cond_a

    goto/16 :goto_0

    :cond_a
    return-object v3

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot happen in "

    invoke-static {v0, v2}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {}, Lcom/daaw/vh0;->e()Lcom/daaw/pi1;

    move-result-object p1

    return-object p1
.end method

.method public K()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/uh0$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/daaw/uh0$b;

    invoke-virtual {v1}, Lcom/daaw/uh0$b;->f()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lcom/daaw/nh;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/daaw/nh;

    iget-object v1, v1, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/daaw/qf0;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lcom/daaw/nh0;

    invoke-virtual {p0, v0}, Lcom/daaw/uh0;->Z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Parent job is "

    invoke-static {v3, v0}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lcom/daaw/nh0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/daaw/mh0;)V

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot be cancelling child in this state: "

    invoke-static {v2, v0}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public L(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-instance v0, Lcom/daaw/nh0;

    invoke-static {p0}, Lcom/daaw/uh0;->c(Lcom/daaw/uh0;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lcom/daaw/nh0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/daaw/mh0;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->j(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final M(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/daaw/uh0;->f0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcom/daaw/vh0;->b()Lcom/daaw/pi1;

    move-result-object v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->x(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final N(Lcom/daaw/z40;Z)Lcom/daaw/th0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;Z)",
            "Lcom/daaw/th0;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    instance-of p2, p1, Lcom/daaw/oh0;

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/daaw/oh0;

    :cond_0
    if-nez v0, :cond_4

    new-instance v0, Lcom/daaw/ah0;

    invoke-direct {v0, p1}, Lcom/daaw/ah0;-><init>(Lcom/daaw/z40;)V

    goto :goto_2

    :cond_1
    instance-of p2, p1, Lcom/daaw/th0;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Lcom/daaw/th0;

    goto :goto_0

    :cond_2
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, p2

    :goto_1
    if-nez v0, :cond_4

    new-instance v0, Lcom/daaw/bh0;

    invoke-direct {v0, p1}, Lcom/daaw/bh0;-><init>(Lcom/daaw/z40;)V

    :cond_4
    :goto_2
    invoke-virtual {v0, p0}, Lcom/daaw/th0;->u(Lcom/daaw/uh0;)V

    return-object v0
.end method

.method public O()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/daaw/aq;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final P(Lcom/daaw/yk0;)Lcom/daaw/af;
    .locals 1

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/yk0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/yk0;->m()Lcom/daaw/yk0;

    move-result-object p1

    goto :goto_0

    :cond_0
    :goto_1
    invoke-virtual {p1}, Lcom/daaw/yk0;->l()Lcom/daaw/yk0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/yk0;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/daaw/af;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/daaw/af;

    return-object p1

    :cond_2
    instance-of v0, p1, Lcom/daaw/ys0;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final Q(Lcom/daaw/pv0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->i(Ljava/lang/Object;)Z

    return-void
.end method

.method public final R(Lcom/daaw/ys0;Ljava/lang/Throwable;)V
    .locals 7

    invoke-virtual {p0, p2}, Lcom/daaw/uh0;->T(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lcom/daaw/yk0;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/yk0;

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-static {v0, p1}, Lcom/daaw/ug0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    instance-of v3, v0, Lcom/daaw/oh0;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Lcom/daaw/th0;

    :try_start_0
    invoke-virtual {v3, p2}, Lcom/daaw/ph;->s(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v4

    if-nez v2, :cond_0

    move-object v5, v1

    goto :goto_1

    :cond_0
    invoke-static {v2, v4}, Lcom/daaw/xy;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object v5, v2

    :goto_1
    if-nez v5, :cond_1

    new-instance v2, Lcom/daaw/qh;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception in completion handler "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v4}, Lcom/daaw/qh;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    invoke-virtual {v0}, Lcom/daaw/yk0;->l()Lcom/daaw/yk0;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v2}, Lcom/daaw/uh0;->H(Ljava/lang/Throwable;)V

    :goto_3
    invoke-virtual {p0, p2}, Lcom/daaw/uh0;->l(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final S(Lcom/daaw/ys0;Ljava/lang/Throwable;)V
    .locals 7

    invoke-virtual {p1}, Lcom/daaw/yk0;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/yk0;

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-static {v0, p1}, Lcom/daaw/ug0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    instance-of v3, v0, Lcom/daaw/th0;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Lcom/daaw/th0;

    :try_start_0
    invoke-virtual {v3, p2}, Lcom/daaw/ph;->s(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v4

    if-nez v2, :cond_0

    move-object v5, v1

    goto :goto_1

    :cond_0
    invoke-static {v2, v4}, Lcom/daaw/xy;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object v5, v2

    :goto_1
    if-nez v5, :cond_1

    new-instance v2, Lcom/daaw/qh;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception in completion handler "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v4}, Lcom/daaw/qh;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    invoke-virtual {v0}, Lcom/daaw/yk0;->l()Lcom/daaw/yk0;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v2}, Lcom/daaw/uh0;->H(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method public T(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public U(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final V(Lcom/daaw/kw;)V
    .locals 2

    new-instance v0, Lcom/daaw/ys0;

    invoke-direct {v0}, Lcom/daaw/ys0;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/kw;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/pf0;

    invoke-direct {v1, v0}, Lcom/daaw/pf0;-><init>(Lcom/daaw/ys0;)V

    move-object v0, v1

    :goto_0
    sget-object v1, Lcom/daaw/uh0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final W(Lcom/daaw/th0;)V
    .locals 2

    new-instance v0, Lcom/daaw/ys0;

    invoke-direct {v0}, Lcom/daaw/ys0;-><init>()V

    invoke-virtual {p1, v0}, Lcom/daaw/yk0;->g(Lcom/daaw/yk0;)Z

    invoke-virtual {p1}, Lcom/daaw/yk0;->l()Lcom/daaw/yk0;

    move-result-object v0

    sget-object v1, Lcom/daaw/uh0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final X(Lcom/daaw/th0;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/th0;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lcom/daaw/uh0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lcom/daaw/vh0;->c()Lcom/daaw/kw;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    instance-of v1, v0, Lcom/daaw/qf0;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/daaw/qf0;

    invoke-interface {v0}, Lcom/daaw/qf0;->e()Lcom/daaw/ys0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/daaw/yk0;->o()Z

    :cond_3
    return-void
.end method

.method public final Y(Lcom/daaw/ze;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uh0;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method public final Z(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, Lcom/daaw/uh0$b;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/uh0$b;

    invoke-virtual {p1}, Lcom/daaw/uh0$b;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/uh0$b;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/daaw/qf0;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/daaw/qf0;

    invoke-interface {p1}, Lcom/daaw/qf0;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lcom/daaw/nh;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method public final a0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lcom/daaw/nh0;

    if-nez p2, :cond_1

    invoke-static {p0}, Lcom/daaw/uh0;->c(Lcom/daaw/uh0;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lcom/daaw/nh0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/daaw/mh0;)V

    :cond_2
    return-object v0
.end method

.method public final c0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/uh0;->O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/uh0;->Z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/qf0;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/qf0;

    invoke-interface {v0}, Lcom/daaw/qf0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d0(Lcom/daaw/qf0;Ljava/lang/Object;)Z
    .locals 2

    sget-object v0, Lcom/daaw/uh0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lcom/daaw/vh0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/uh0;->T(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, Lcom/daaw/uh0;->U(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/uh0;->p(Lcom/daaw/qf0;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final e0(Lcom/daaw/qf0;Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->B(Lcom/daaw/qf0;)Lcom/daaw/ys0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v2, Lcom/daaw/uh0$b;

    invoke-direct {v2, v0, v1, p2}, Lcom/daaw/uh0$b;-><init>(Lcom/daaw/ys0;ZLjava/lang/Throwable;)V

    sget-object v3, Lcom/daaw/uh0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, p1, v2}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0, v0, p2}, Lcom/daaw/uh0;->R(Lcom/daaw/ys0;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final f(Ljava/lang/Object;Lcom/daaw/ys0;Lcom/daaw/th0;)Z
    .locals 2

    new-instance v0, Lcom/daaw/uh0$c;

    invoke-direct {v0, p3, p0, p1}, Lcom/daaw/uh0$c;-><init>(Lcom/daaw/yk0;Lcom/daaw/uh0;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lcom/daaw/yk0;->m()Lcom/daaw/yk0;

    move-result-object p1

    invoke-virtual {p1, p3, p2, v0}, Lcom/daaw/yk0;->r(Lcom/daaw/yk0;Lcom/daaw/yk0;Lcom/daaw/yk0$a;)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method public final f0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lcom/daaw/qf0;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lcom/daaw/kw;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/daaw/th0;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, Lcom/daaw/af;

    if-nez v0, :cond_3

    instance-of v0, p2, Lcom/daaw/nh;

    if-nez v0, :cond_3

    check-cast p1, Lcom/daaw/qf0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/uh0;->d0(Lcom/daaw/qf0;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    :cond_2
    invoke-static {}, Lcom/daaw/vh0;->b()Lcom/daaw/pi1;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, Lcom/daaw/qf0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/uh0;->g0(Lcom/daaw/qf0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fold(Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lcom/daaw/n50<",
            "-TR;-",
            "Lcom/daaw/nl$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/daaw/mh0$a;->a(Lcom/daaw/mh0;Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eq v1, p1, :cond_1

    if-eq v1, p1, :cond_1

    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v1}, Lcom/daaw/xy;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final g0(Lcom/daaw/qf0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->B(Lcom/daaw/qf0;)Lcom/daaw/ys0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/vh0;->b()Lcom/daaw/pi1;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, p1, Lcom/daaw/uh0$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lcom/daaw/uh0$b;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_2

    new-instance v1, Lcom/daaw/uh0$b;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3, v2}, Lcom/daaw/uh0$b;-><init>(Lcom/daaw/ys0;ZLjava/lang/Throwable;)V

    :cond_2
    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Lcom/daaw/uh0$b;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_3
    const/4 v3, 0x1

    :try_start_1
    invoke-virtual {v1, v3}, Lcom/daaw/uh0$b;->k(Z)V

    if-eq v1, p1, :cond_4

    sget-object v4, Lcom/daaw/uh0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p0, p1, v1}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {}, Lcom/daaw/vh0;->b()Lcom/daaw/pi1;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_4
    :try_start_2
    invoke-virtual {v1}, Lcom/daaw/uh0$b;->g()Z

    move-result v4

    instance-of v5, p2, Lcom/daaw/nh;

    if-eqz v5, :cond_5

    move-object v5, p2

    check-cast v5, Lcom/daaw/nh;

    goto :goto_1

    :cond_5
    move-object v5, v2

    :goto_1
    if-nez v5, :cond_6

    goto :goto_2

    :cond_6
    iget-object v5, v5, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v5}, Lcom/daaw/uh0$b;->a(Ljava/lang/Throwable;)V

    :goto_2
    invoke-virtual {v1}, Lcom/daaw/uh0$b;->f()Ljava/lang/Throwable;

    move-result-object v5

    xor-int/2addr v3, v4

    if-eqz v3, :cond_7

    move-object v2, v5

    :cond_7
    sget-object v3, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {p0, v0, v2}, Lcom/daaw/uh0;->R(Lcom/daaw/ys0;Ljava/lang/Throwable;)V

    :goto_3
    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->v(Lcom/daaw/qf0;)Lcom/daaw/af;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p0, v1, p1, p2}, Lcom/daaw/uh0;->h0(Lcom/daaw/uh0$b;Lcom/daaw/af;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, Lcom/daaw/vh0;->b:Lcom/daaw/pi1;

    return-object p1

    :cond_9
    invoke-virtual {p0, v1, p2}, Lcom/daaw/uh0;->t(Lcom/daaw/uh0$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lcom/daaw/nl$b;",
            ">(",
            "Lcom/daaw/nl$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/daaw/mh0$a;->b(Lcom/daaw/mh0;Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lcom/daaw/nl$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/nl$c<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/mh0;->d:Lcom/daaw/mh0$b;

    return-object v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final h0(Lcom/daaw/uh0$b;Lcom/daaw/af;Ljava/lang/Object;)Z
    .locals 6

    :cond_0
    iget-object v0, p2, Lcom/daaw/af;->t:Lcom/daaw/bf;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/daaw/uh0$a;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/daaw/uh0$a;-><init>(Lcom/daaw/uh0;Lcom/daaw/uh0$b;Lcom/daaw/af;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/daaw/mh0$a;->c(Lcom/daaw/mh0;ZZLcom/daaw/z40;ILjava/lang/Object;)Lcom/daaw/iu;

    move-result-object v0

    sget-object v1, Lcom/daaw/zs0;->p:Lcom/daaw/zs0;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {p0, p2}, Lcom/daaw/uh0;->P(Lcom/daaw/yk0;)Lcom/daaw/af;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/uh0;->A()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/daaw/vh0;->b:Lcom/daaw/pi1;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->J(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/daaw/vh0;->b:Lcom/daaw/pi1;

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/daaw/vh0;->e()Lcom/daaw/pi1;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, Lcom/daaw/uh0;->h(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method

.method public j(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->i(Ljava/lang/Object;)Z

    return-void
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/qf0;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lcom/daaw/uh0$b;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/daaw/uh0$b;

    invoke-virtual {v1}, Lcom/daaw/uh0$b;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/daaw/nh;

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->s(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/daaw/nh;-><init>(Ljava/lang/Throwable;ZILcom/daaw/pq;)V

    invoke-virtual {p0, v0, v1}, Lcom/daaw/uh0;->f0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/daaw/vh0;->b()Lcom/daaw/pi1;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, Lcom/daaw/vh0;->a()Lcom/daaw/pi1;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/uh0;->I()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, Lcom/daaw/uh0;->C()Lcom/daaw/ze;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, Lcom/daaw/zs0;->p:Lcom/daaw/zs0;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Lcom/daaw/ze;->c(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public minusKey(Lcom/daaw/nl$c;)Lcom/daaw/nl;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl$c<",
            "*>;)",
            "Lcom/daaw/nl;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/daaw/mh0$a;->d(Lcom/daaw/mh0;Lcom/daaw/nl$c;)Lcom/daaw/nl;

    move-result-object p1

    return-object p1
.end method

.method public o(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/uh0;->z()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final p(Lcom/daaw/qf0;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/uh0;->C()Lcom/daaw/ze;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/daaw/iu;->a()V

    sget-object v0, Lcom/daaw/zs0;->p:Lcom/daaw/zs0;

    invoke-virtual {p0, v0}, Lcom/daaw/uh0;->Y(Lcom/daaw/ze;)V

    :goto_0
    instance-of v0, p2, Lcom/daaw/nh;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lcom/daaw/nh;

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p2, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    :goto_2
    instance-of p2, p1, Lcom/daaw/th0;

    if-eqz p2, :cond_3

    :try_start_0
    move-object p2, p1

    check-cast p2, Lcom/daaw/th0;

    invoke-virtual {p2, v1}, Lcom/daaw/ph;->s(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    new-instance v0, Lcom/daaw/qh;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/daaw/qh;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lcom/daaw/uh0;->H(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_3
    invoke-interface {p1}, Lcom/daaw/qf0;->e()Lcom/daaw/ys0;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0, p1, v1}, Lcom/daaw/uh0;->S(Lcom/daaw/ys0;Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method public final q()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/uh0$b;

    const-string v2, "Job is still new or active: "

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lcom/daaw/uh0$b;

    invoke-virtual {v0}, Lcom/daaw/uh0$b;->f()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/daaw/aq;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, " is cancelling"

    invoke-static {v1, v3}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/uh0;->a0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v2, p0}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    instance-of v1, v0, Lcom/daaw/qf0;

    if-nez v1, :cond_4

    instance-of v1, v0, Lcom/daaw/nh;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/daaw/nh;

    iget-object v0, v0, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v3, v1, v3}, Lcom/daaw/uh0;->b0(Lcom/daaw/uh0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v3

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/daaw/nh0;

    invoke-static {p0}, Lcom/daaw/aq;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " has completed normally"

    invoke-static {v1, v2}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3, p0}, Lcom/daaw/nh0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/daaw/mh0;)V

    move-object v3, v0

    :goto_1
    return-object v3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v2, p0}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final r(Lcom/daaw/uh0$b;Lcom/daaw/af;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p2}, Lcom/daaw/uh0;->P(Lcom/daaw/yk0;)Lcom/daaw/af;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/uh0;->h0(Lcom/daaw/uh0$b;Lcom/daaw/af;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, p3}, Lcom/daaw/uh0;->t(Lcom/daaw/uh0$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    new-instance v0, Lcom/daaw/nh0;

    invoke-static {p0}, Lcom/daaw/uh0;->c(Lcom/daaw/uh0;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lcom/daaw/nh0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/daaw/mh0;)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lcom/daaw/pv0;

    invoke-interface {p1}, Lcom/daaw/pv0;->K()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method public final t(Lcom/daaw/uh0$b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/daaw/nh;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/daaw/nh;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    :goto_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/uh0$b;->g()Z

    move-result v2

    invoke-virtual {p1, v0}, Lcom/daaw/uh0$b;->j(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, p1, v3}, Lcom/daaw/uh0;->y(Lcom/daaw/uh0$b;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {p0, v4, v3}, Lcom/daaw/uh0;->g(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p1

    const/4 v3, 0x0

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    if-ne v4, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p2, Lcom/daaw/nh;

    const/4 v0, 0x2

    invoke-direct {p2, v4, v3, v0, v1}, Lcom/daaw/nh;-><init>(Ljava/lang/Throwable;ZILcom/daaw/pq;)V

    :goto_2
    if-eqz v4, :cond_7

    invoke-virtual {p0, v4}, Lcom/daaw/uh0;->l(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, v4}, Lcom/daaw/uh0;->G(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v3, 0x1

    :cond_6
    if-eqz v3, :cond_7

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Lcom/daaw/nh;

    invoke-virtual {v0}, Lcom/daaw/nh;->b()Z

    :cond_7
    if-nez v2, :cond_8

    invoke-virtual {p0, v4}, Lcom/daaw/uh0;->T(Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {p0, p2}, Lcom/daaw/uh0;->U(Ljava/lang/Object;)V

    sget-object v0, Lcom/daaw/uh0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lcom/daaw/vh0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, p2}, Lcom/daaw/uh0;->p(Lcom/daaw/qf0;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/uh0;->c0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/daaw/aq;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Lcom/daaw/qf0;)Lcom/daaw/af;
    .locals 2

    instance-of v0, p1, Lcom/daaw/af;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/daaw/af;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    invoke-interface {p1}, Lcom/daaw/qf0;->e()Lcom/daaw/ys0;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->P(Lcom/daaw/yk0;)Lcom/daaw/af;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    return-object v1
.end method

.method public final w(ZZLcom/daaw/z40;)Lcom/daaw/iu;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;)",
            "Lcom/daaw/iu;"
        }
    .end annotation

    invoke-virtual {p0, p3, p1}, Lcom/daaw/uh0;->N(Lcom/daaw/z40;Z)Lcom/daaw/th0;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/daaw/kw;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Lcom/daaw/kw;

    invoke-virtual {v2}, Lcom/daaw/kw;->d()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, Lcom/daaw/uh0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-virtual {p0, v2}, Lcom/daaw/uh0;->V(Lcom/daaw/kw;)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, Lcom/daaw/qf0;

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    move-object v2, v1

    check-cast v2, Lcom/daaw/qf0;

    invoke-interface {v2}, Lcom/daaw/qf0;->e()Lcom/daaw/ys0;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Lcom/daaw/th0;

    invoke-virtual {p0, v1}, Lcom/daaw/uh0;->W(Lcom/daaw/th0;)V

    goto :goto_0

    :cond_3
    sget-object v4, Lcom/daaw/zs0;->p:Lcom/daaw/zs0;

    if-eqz p1, :cond_8

    instance-of v5, v1, Lcom/daaw/uh0$b;

    if-eqz v5, :cond_8

    monitor-enter v1

    :try_start_0
    move-object v3, v1

    check-cast v3, Lcom/daaw/uh0$b;

    invoke-virtual {v3}, Lcom/daaw/uh0$b;->f()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_4

    instance-of v5, p3, Lcom/daaw/af;

    if-eqz v5, :cond_7

    move-object v5, v1

    check-cast v5, Lcom/daaw/uh0$b;

    invoke-virtual {v5}, Lcom/daaw/uh0$b;->h()Z

    move-result v5

    if-nez v5, :cond_7

    :cond_4
    invoke-virtual {p0, v1, v2, v0}, Lcom/daaw/uh0;->f(Ljava/lang/Object;Lcom/daaw/ys0;Lcom/daaw/th0;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    monitor-exit v1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    monitor-exit v1

    return-object v0

    :cond_6
    move-object v4, v0

    :cond_7
    :try_start_1
    sget-object v5, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_1
    if-eqz v3, :cond_a

    if-eqz p2, :cond_9

    invoke-interface {p3, v3}, Lcom/daaw/z40;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object v4

    :cond_a
    invoke-virtual {p0, v1, v2, v0}, Lcom/daaw/uh0;->f(Ljava/lang/Object;Lcom/daaw/ys0;Lcom/daaw/th0;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_b
    if-eqz p2, :cond_e

    instance-of p1, v1, Lcom/daaw/nh;

    if-eqz p1, :cond_c

    check-cast v1, Lcom/daaw/nh;

    goto :goto_2

    :cond_c
    move-object v1, v3

    :goto_2
    if-nez v1, :cond_d

    goto :goto_3

    :cond_d
    iget-object v3, v1, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    :goto_3
    invoke-interface {p3, v3}, Lcom/daaw/z40;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    sget-object p1, Lcom/daaw/zs0;->p:Lcom/daaw/zs0;

    return-object p1
.end method

.method public final x(Ljava/lang/Object;)Ljava/lang/Throwable;
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

.method public final y(Lcom/daaw/uh0$b;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/uh0$b;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/uh0$b;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/daaw/nh0;

    invoke-static {p0}, Lcom/daaw/uh0;->c(Lcom/daaw/uh0;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lcom/daaw/nh0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/daaw/mh0;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    instance-of v2, v2, Ljava/util/concurrent/CancellationException;

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    move-object v1, v0

    :cond_3
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    return-object p1
.end method

.method public z()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
