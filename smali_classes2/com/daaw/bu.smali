.class public final Lcom/daaw/bu;
.super Lcom/daaw/eu;
.source ""

# interfaces
.implements Lcom/daaw/vl;
.implements Lcom/daaw/gl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/eu<",
        "TT;>;",
        "Lcom/daaw/vl;",
        "Lcom/daaw/gl<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final synthetic w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _reusableCancellableContinuation:Ljava/lang/Object;

.field public final s:Lcom/daaw/pl;

.field public final t:Lcom/daaw/gl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/gl<",
            "TT;>;"
        }
    .end annotation
.end field

.field public u:Ljava/lang/Object;

.field public final v:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/daaw/bu;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_reusableCancellableContinuation"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/bu;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/pl;Lcom/daaw/gl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/pl;",
            "Lcom/daaw/gl<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lcom/daaw/eu;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/bu;->s:Lcom/daaw/pl;

    iput-object p2, p0, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    invoke-static {}, Lcom/daaw/cu;->a()Lcom/daaw/pi1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/bu;->u:Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/daaw/bu;->getContext()Lcom/daaw/nl;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/bl1;->b(Lcom/daaw/nl;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/bu;->v:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/bu;->_reusableCancellableContinuation:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/vl;
    .locals 2

    iget-object v0, p0, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    instance-of v1, v0, Lcom/daaw/vl;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/vl;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    invoke-interface {v0}, Lcom/daaw/gl;->getContext()Lcom/daaw/nl;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, v1}, Lcom/daaw/rh;->d(Ljava/lang/Object;Lcom/daaw/z40;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/bu;->s:Lcom/daaw/pl;

    invoke-virtual {v4, v0}, Lcom/daaw/pl;->U(Lcom/daaw/nl;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    iput-object v3, p0, Lcom/daaw/bu;->u:Ljava/lang/Object;

    iput v5, p0, Lcom/daaw/eu;->r:I

    iget-object p1, p0, Lcom/daaw/bu;->s:Lcom/daaw/pl;

    invoke-virtual {p1, v0, p0}, Lcom/daaw/pl;->T(Lcom/daaw/nl;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/daaw/cl1;->a:Lcom/daaw/cl1;

    invoke-virtual {v0}, Lcom/daaw/cl1;->a()Lcom/daaw/dy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/dy;->c0()Z

    move-result v4

    if-eqz v4, :cond_1

    iput-object v3, p0, Lcom/daaw/bu;->u:Ljava/lang/Object;

    iput v5, p0, Lcom/daaw/eu;->r:I

    invoke-virtual {v0, p0}, Lcom/daaw/dy;->Y(Lcom/daaw/eu;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Lcom/daaw/dy;->a0(Z)V

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/bu;->getContext()Lcom/daaw/nl;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/bu;->v:Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/daaw/bl1;->c(Lcom/daaw/nl;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v5, p0, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    invoke-interface {v5, p1}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    sget-object p1, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v3, v4}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/dy;->e0()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {v3, v4}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v1}, Lcom/daaw/eu;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_0
    invoke-virtual {v0, v2}, Lcom/daaw/dy;->W(Z)V

    :goto_1
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0, v2}, Lcom/daaw/dy;->W(Z)V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    instance-of v0, p1, Lcom/daaw/oh;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/oh;

    iget-object p1, p1, Lcom/daaw/oh;->b:Lcom/daaw/z40;

    invoke-interface {p1, p2}, Lcom/daaw/z40;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public d()Lcom/daaw/gl;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/gl<",
            "TT;>;"
        }
    .end annotation

    return-object p0
.end method

.method public getContext()Lcom/daaw/nl;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    invoke-interface {v0}, Lcom/daaw/gl;->getContext()Lcom/daaw/nl;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/bu;->u:Ljava/lang/Object;

    invoke-static {}, Lcom/daaw/cu;->a()Lcom/daaw/pi1;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/bu;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public final i()V
    .locals 2

    :cond_0
    iget-object v0, p0, Lcom/daaw/bu;->_reusableCancellableContinuation:Ljava/lang/Object;

    sget-object v1, Lcom/daaw/cu;->b:Lcom/daaw/pi1;

    if-eq v0, v1, :cond_0

    return-void
.end method

.method public final j()Lcom/daaw/vd;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/vd<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/bu;->_reusableCancellableContinuation:Ljava/lang/Object;

    instance-of v1, v0, Lcom/daaw/vd;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/vd;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/bu;->_reusableCancellableContinuation:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bu;->i()V

    invoke-virtual {p0}, Lcom/daaw/bu;->j()Lcom/daaw/vd;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/vd;->l()V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DispatchedContinuation["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/bu;->s:Lcom/daaw/pl;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/bu;->t:Lcom/daaw/gl;

    invoke-static {v1}, Lcom/daaw/aq;->c(Lcom/daaw/gl;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
