.class public Lcom/daaw/vd;
.super Lcom/daaw/eu;
.source ""

# interfaces
.implements Lcom/daaw/ud;
.implements Lcom/daaw/vl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/eu<",
        "TT;>;",
        "Lcom/daaw/ud<",
        "TT;>;",
        "Lcom/daaw/vl;"
    }
.end annotation


# static fields
.field public static final synthetic v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _decision:I

.field private volatile synthetic _state:Ljava/lang/Object;

.field public final s:Lcom/daaw/gl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/gl<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final t:Lcom/daaw/nl;

.field public u:Lcom/daaw/iu;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/daaw/vd;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/vd;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-class v0, Lcom/daaw/vd;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/vd;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public static synthetic t(Lcom/daaw/vd;Ljava/lang/Object;ILcom/daaw/z40;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/vd;->s(Ljava/lang/Object;ILcom/daaw/z40;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resumeImpl"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Lcom/daaw/vl;
    .locals 2

    iget-object v0, p0, Lcom/daaw/vd;->s:Lcom/daaw/gl;

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

    invoke-static {p1, p0}, Lcom/daaw/rh;->b(Ljava/lang/Object;Lcom/daaw/ud;)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/daaw/eu;->r:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/daaw/vd;->t(Lcom/daaw/vd;Ljava/lang/Object;ILcom/daaw/z40;ILjava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 10

    :cond_0
    iget-object p1, p0, Lcom/daaw/vd;->_state:Ljava/lang/Object;

    instance-of v0, p1, Lcom/daaw/bt0;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/daaw/nh;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    instance-of v0, p1, Lcom/daaw/lh;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/daaw/lh;

    invoke-virtual {v0}, Lcom/daaw/lh;->c()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v1, v0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lcom/daaw/lh;->b(Lcom/daaw/lh;Ljava/lang/Object;Lcom/daaw/pd;Lcom/daaw/z40;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lcom/daaw/lh;

    move-result-object v1

    sget-object v2, Lcom/daaw/vd;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, p1, v1}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p0, p2}, Lcom/daaw/lh;->d(Lcom/daaw/vd;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Must be called at most once"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    sget-object v8, Lcom/daaw/vd;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v9, Lcom/daaw/lh;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v0, v9

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v7}, Lcom/daaw/lh;-><init>(Ljava/lang/Object;Lcom/daaw/pd;Lcom/daaw/z40;Ljava/lang/Object;Ljava/lang/Throwable;ILcom/daaw/pq;)V

    invoke-static {v8, p0, p1, v9}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not completed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :goto_0
    throw p1

    :goto_1
    goto :goto_0
.end method

.method public final d()Lcom/daaw/gl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/gl<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vd;->s:Lcom/daaw/gl;

    return-object v0
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/eu;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/vd;->d()Lcom/daaw/gl;

    :goto_0
    return-object p1
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p1, Lcom/daaw/lh;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/lh;

    iget-object p1, p1, Lcom/daaw/lh;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public getContext()Lcom/daaw/nl;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vd;->t:Lcom/daaw/nl;

    return-object v0
.end method

.method public h()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/vd;->o()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed, but proposed with update "

    invoke-static {v1, p1}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j(Lcom/daaw/pd;Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    invoke-virtual {p1, p2}, Lcom/daaw/qd;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/daaw/vd;->getContext()Lcom/daaw/nl;

    move-result-object p2

    new-instance v0, Lcom/daaw/qh;

    const-string v1, "Exception in invokeOnCancellation handler for "

    invoke-static {v1, p0}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/daaw/qh;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lcom/daaw/sl;->a(Lcom/daaw/nl;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final k(Lcom/daaw/z40;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1, p2}, Lcom/daaw/z40;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/daaw/vd;->getContext()Lcom/daaw/nl;

    move-result-object p2

    new-instance v0, Lcom/daaw/qh;

    const-string v1, "Exception in resume onCancellation handler for "

    invoke-static {v1, p0}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/daaw/qh;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lcom/daaw/sl;->a(Lcom/daaw/nl;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final l()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vd;->u:Lcom/daaw/iu;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lcom/daaw/iu;->a()V

    sget-object v0, Lcom/daaw/zs0;->p:Lcom/daaw/zs0;

    iput-object v0, p0, Lcom/daaw/vd;->u:Lcom/daaw/iu;

    return-void
.end method

.method public final m()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/vd;->q()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/vd;->l()V

    :cond_0
    return-void
.end method

.method public final n(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/vd;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, Lcom/daaw/fu;->a(Lcom/daaw/eu;I)V

    return-void
.end method

.method public final o()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vd;->_state:Ljava/lang/Object;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/vd;->o()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/bt0;

    if-eqz v1, :cond_0

    const-string v0, "Active"

    goto :goto_0

    :cond_0
    instance-of v0, v0, Lcom/daaw/xd;

    if-eqz v0, :cond_1

    const-string v0, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v0, "Completed"

    :goto_0
    return-object v0
.end method

.method public final q()Z
    .locals 1

    iget v0, p0, Lcom/daaw/eu;->r:I

    invoke-static {v0}, Lcom/daaw/fu;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/vd;->s:Lcom/daaw/gl;

    check-cast v0, Lcom/daaw/bu;

    invoke-virtual {v0}, Lcom/daaw/bu;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    const-string v0, "CancellableContinuation"

    return-object v0
.end method

.method public final s(Ljava/lang/Object;ILcom/daaw/z40;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;)V"
        }
    .end annotation

    :goto_0
    iget-object v0, p0, Lcom/daaw/vd;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lcom/daaw/bt0;

    if-eqz v1, :cond_1

    move-object v3, v0

    check-cast v3, Lcom/daaw/bt0;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/vd;->u(Lcom/daaw/bt0;Ljava/lang/Object;ILcom/daaw/z40;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/daaw/vd;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/vd;->m()V

    invoke-virtual {p0, p2}, Lcom/daaw/vd;->n(I)V

    return-void

    :cond_1
    instance-of p2, v0, Lcom/daaw/xd;

    if-eqz p2, :cond_3

    check-cast v0, Lcom/daaw/xd;

    invoke-virtual {v0}, Lcom/daaw/xd;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, v0, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p1}, Lcom/daaw/vd;->k(Lcom/daaw/z40;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/vd;->i(Ljava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Lcom/daaw/mi0;

    invoke-direct {p1}, Lcom/daaw/mi0;-><init>()V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/vd;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/vd;->s:Lcom/daaw/gl;

    invoke-static {v1}, Lcom/daaw/aq;->c(Lcom/daaw/gl;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/vd;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/daaw/aq;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lcom/daaw/bt0;Ljava/lang/Object;ILcom/daaw/z40;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/bt0;",
            "Ljava/lang/Object;",
            "I",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/daaw/nh;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p3}, Lcom/daaw/fu;->b(I)Z

    move-result p3

    if-nez p3, :cond_1

    if-nez p5, :cond_1

    goto :goto_2

    :cond_1
    if-nez p4, :cond_3

    instance-of p3, p1, Lcom/daaw/pd;

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    if-eqz p5, :cond_5

    :cond_3
    :goto_0
    new-instance p3, Lcom/daaw/lh;

    instance-of v0, p1, Lcom/daaw/pd;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/daaw/pd;

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    move-object v2, p1

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p3

    move-object v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v7}, Lcom/daaw/lh;-><init>(Ljava/lang/Object;Lcom/daaw/pd;Lcom/daaw/z40;Ljava/lang/Object;Ljava/lang/Throwable;ILcom/daaw/pq;)V

    move-object p2, p3

    :cond_5
    :goto_2
    return-object p2
.end method

.method public final v()Z
    .locals 4

    :cond_0
    iget v0, p0, Lcom/daaw/vd;->_decision:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v0, Lcom/daaw/vd;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, 0x2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method
