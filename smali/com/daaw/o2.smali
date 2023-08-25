.class public Lcom/daaw/o2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bx0$a;
.implements Lcom/daaw/xp0;
.implements Lcom/daaw/n7;
.implements Lcom/daaw/rs1;
.implements Lcom/daaw/cp0;
.implements Lcom/daaw/ia$a;
.implements Lcom/google/android/exoplayer2/drm/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/o2$c;,
        Lcom/daaw/o2$b;,
        Lcom/daaw/o2$a;
    }
.end annotation


# instance fields
.field public final p:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/daaw/x2;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/zf;

.field public final r:Lcom/daaw/nl1$c;

.field public final s:Lcom/daaw/o2$b;

.field public t:Lcom/daaw/bx0;
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/MonotonicNonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/bx0;Lcom/daaw/zf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-static {p2}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/zf;

    iput-object p1, p0, Lcom/daaw/o2;->q:Lcom/daaw/zf;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance p1, Lcom/daaw/o2$b;

    invoke-direct {p1}, Lcom/daaw/o2$b;-><init>()V

    iput-object p1, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    new-instance p1, Lcom/daaw/nl1$c;

    invoke-direct {p1}, Lcom/daaw/nl1$c;-><init>()V

    iput-object p1, p0, Lcom/daaw/o2;->r:Lcom/daaw/nl1$c;

    return-void
.end method


# virtual methods
.method public final A(Lcom/daaw/qz;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1}, Lcom/daaw/x2;->y(Lcom/daaw/x2$a;Lcom/daaw/qz;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final B(IJJ)V
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/o2;->M()Lcom/daaw/x2$a;

    move-result-object v7

    iget-object v0, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v0 .. v6}, Lcom/daaw/x2;->r(Lcom/daaw/x2$a;IJJ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final C(ILcom/daaw/bp0$a;Lcom/daaw/cp0$c;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    invoke-interface {v0, p1, p3}, Lcom/daaw/x2;->b(Lcom/daaw/x2$a;Lcom/daaw/cp0$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final D(Lcom/daaw/fq;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    const/4 v3, 0x1

    invoke-interface {v2, v0, v3, p1}, Lcom/daaw/x2;->s(Lcom/daaw/x2$a;ILcom/daaw/fq;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final E(ILcom/daaw/bp0$a;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    invoke-interface {v0, p1, p3, p4}, Lcom/daaw/x2;->A(Lcom/daaw/x2$a;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final F(ILcom/daaw/bp0$a;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;Ljava/io/IOException;Z)V
    .locals 6

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move v5, p6

    invoke-interface/range {v0 .. v5}, Lcom/daaw/x2;->q(Lcom/daaw/x2$a;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;Ljava/io/IOException;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public G(Lcom/daaw/x2;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;
    .locals 13

    iget-object v0, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-static {v0}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/o2;->q:Lcom/daaw/zf;

    invoke-interface {v0}, Lcom/daaw/zf;->b()J

    move-result-wide v2

    iget-object v0, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-interface {v0}, Lcom/daaw/bx0;->n()Lcom/daaw/nl1;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-interface {v0}, Lcom/daaw/bx0;->g()I

    move-result v0

    const-wide/16 v5, 0x0

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/daaw/bp0$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-interface {v0}, Lcom/daaw/bx0;->m()I

    move-result v0

    iget v1, p2, Lcom/daaw/bp0$a;->b:I

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-interface {v0}, Lcom/daaw/bx0;->e()I

    move-result v0

    iget v1, p2, Lcom/daaw/bp0$a;->c:I

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-interface {v0}, Lcom/daaw/bx0;->o()J

    move-result-wide v5

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-interface {v0}, Lcom/daaw/bx0;->i()J

    move-result-wide v0

    :goto_0
    move-wide v7, v0

    goto :goto_2

    :cond_1
    invoke-virtual {v4}, Lcom/daaw/nl1;->n()I

    move-result v0

    if-ge p1, v0, :cond_3

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/daaw/bp0$a;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/o2;->r:Lcom/daaw/nl1$c;

    invoke-virtual {v4, p1, v0}, Lcom/daaw/nl1;->k(ILcom/daaw/nl1$c;)Lcom/daaw/nl1$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/nl1$c;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_3
    :goto_1
    move-wide v7, v5

    :goto_2
    iget-object v0, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-interface {v0}, Lcom/daaw/bx0;->j()J

    move-result-wide v0

    iget-object v5, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-interface {v5}, Lcom/daaw/bx0;->i()J

    move-result-wide v5

    sub-long v11, v0, v5

    new-instance v0, Lcom/daaw/x2$a;

    iget-object v1, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-interface {v1}, Lcom/daaw/bx0;->o()J

    move-result-wide v9

    move-object v1, v0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v12}, Lcom/daaw/x2$a;-><init>(JLcom/daaw/nl1;ILcom/daaw/bp0$a;JJJ)V

    return-object v0
.end method

.method public final I(Lcom/daaw/o2$c;)Lcom/daaw/x2$a;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/o2;->t:Lcom/daaw/bx0;

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/bx0;

    invoke-interface {p1}, Lcom/daaw/bx0;->g()I

    move-result p1

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0, p1}, Lcom/daaw/o2$b;->n(I)Lcom/daaw/bp0$a;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p1, Lcom/daaw/o2$c;->a:I

    iget-object p1, p1, Lcom/daaw/o2$c;->b:Lcom/daaw/bp0$a;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    return-object p1
.end method

.method public final J()Lcom/daaw/x2$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0}, Lcom/daaw/o2$b;->b()Lcom/daaw/o2$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/o2;->I(Lcom/daaw/o2$c;)Lcom/daaw/x2$a;

    move-result-object v0

    return-object v0
.end method

.method public final K()Lcom/daaw/x2$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0}, Lcom/daaw/o2$b;->c()Lcom/daaw/o2$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/o2;->I(Lcom/daaw/o2$c;)Lcom/daaw/x2$a;

    move-result-object v0

    return-object v0
.end method

.method public final L()Lcom/daaw/x2$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0}, Lcom/daaw/o2$b;->d()Lcom/daaw/o2$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/o2;->I(Lcom/daaw/o2$c;)Lcom/daaw/x2$a;

    move-result-object v0

    return-object v0
.end method

.method public final M()Lcom/daaw/x2$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0}, Lcom/daaw/o2$b;->e()Lcom/daaw/o2$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/o2;->I(Lcom/daaw/o2$c;)Lcom/daaw/x2$a;

    move-result-object v0

    return-object v0
.end method

.method public final N()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0}, Lcom/daaw/o2$b;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v1}, Lcom/daaw/o2$b;->l()V

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0}, Lcom/daaw/x2;->f(Lcom/daaw/x2$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final O()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-static {v1}, Lcom/daaw/o2$b;->a(Lcom/daaw/o2$b;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/o2$c;

    iget v2, v1, Lcom/daaw/o2$c;->a:I

    iget-object v1, v1, Lcom/daaw/o2$c;->b:Lcom/daaw/bp0$a;

    invoke-virtual {p0, v2, v1}, Lcom/daaw/o2;->h(ILcom/daaw/bp0$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/o2;->M()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1}, Lcom/daaw/x2;->e(Lcom/daaw/x2$a;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(IIIF)V
    .locals 8

    invoke-virtual {p0}, Lcom/daaw/o2;->M()Lcom/daaw/x2$a;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    move-object v1, v6

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/x2;->x(Lcom/daaw/x2$a;IIIF)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(Lcom/daaw/zw0;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1}, Lcom/daaw/x2;->t(Lcom/daaw/x2$a;Lcom/daaw/zw0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1}, Lcom/daaw/x2;->j(Lcom/daaw/x2$a;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e(I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0, p1}, Lcom/daaw/o2$b;->i(I)V

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1}, Lcom/daaw/x2;->h(Lcom/daaw/x2$a;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/String;JJ)V
    .locals 6

    invoke-virtual {p0}, Lcom/daaw/o2;->M()Lcom/daaw/x2$a;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p3}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    const/4 v2, 0x2

    move-object v1, p2

    move-object v3, p1

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/x2;->v(Lcom/daaw/x2$a;ILjava/lang/String;J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0}, Lcom/daaw/o2$b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0}, Lcom/daaw/o2$b;->k()V

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0}, Lcom/daaw/x2;->z(Lcom/daaw/x2$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final h(ILcom/daaw/bp0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/o2$b;->h(ILcom/daaw/bp0$a;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    invoke-interface {v0, p1}, Lcom/daaw/x2;->B(Lcom/daaw/x2$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final i(Landroid/view/Surface;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/o2;->M()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1}, Lcom/daaw/x2;->m(Lcom/daaw/x2$a;Landroid/view/Surface;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(Lcom/daaw/fq;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/o2;->J()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    const/4 v3, 0x1

    invoke-interface {v2, v0, v3, p1}, Lcom/daaw/x2;->i(Lcom/daaw/x2$a;ILcom/daaw/fq;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final k(IJJ)V
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/o2;->K()Lcom/daaw/x2$a;

    move-result-object v7

    iget-object v0, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v0 .. v6}, Lcom/daaw/x2;->w(Lcom/daaw/x2$a;IJJ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l(ILcom/daaw/bp0$a;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    invoke-interface {v0, p1, p3, p4}, Lcom/daaw/x2;->d(Lcom/daaw/x2$a;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final m(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/um1;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1, p2}, Lcom/daaw/x2;->n(Lcom/daaw/x2$a;Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/um1;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final n(Ljava/lang/String;JJ)V
    .locals 6

    invoke-virtual {p0}, Lcom/daaw/o2;->M()Lcom/daaw/x2$a;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p3}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    const/4 v2, 0x1

    move-object v1, p2

    move-object v3, p1

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/x2;->v(Lcom/daaw/x2$a;ILjava/lang/String;J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final o(ILcom/daaw/bp0$a;Lcom/daaw/cp0$c;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    invoke-interface {v0, p1, p3}, Lcom/daaw/x2;->a(Lcom/daaw/x2$a;Lcom/daaw/cp0$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final p(Lcom/google/android/exoplayer2/metadata/Metadata;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1}, Lcom/daaw/x2;->l(Lcom/daaw/x2$a;Lcom/google/android/exoplayer2/metadata/Metadata;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final q(IJ)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/o2;->J()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1, p2, p3}, Lcom/daaw/x2;->c(Lcom/daaw/x2$a;IJ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final r(ILcom/daaw/bp0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/o2$b;->g(ILcom/daaw/bp0$a;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    invoke-interface {v0, p1}, Lcom/daaw/x2;->p(Lcom/daaw/x2$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final s(ZI)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    invoke-interface {v2, v0, p1, p2}, Lcom/daaw/x2;->g(Lcom/daaw/x2$a;ZI)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final t(ILcom/daaw/bp0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/o2$b;->j(ILcom/daaw/bp0$a;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    invoke-interface {v0, p1}, Lcom/daaw/x2;->u(Lcom/daaw/x2$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final u(Lcom/daaw/fq;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/o2;->J()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    const/4 v3, 0x2

    invoke-interface {v2, v0, v3, p1}, Lcom/daaw/x2;->i(Lcom/daaw/x2$a;ILcom/daaw/fq;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final v(Lcom/daaw/nl1;Ljava/lang/Object;I)V
    .locals 1

    iget-object p2, p0, Lcom/daaw/o2;->s:Lcom/daaw/o2$b;

    invoke-virtual {p2, p1}, Lcom/daaw/o2$b;->m(Lcom/daaw/nl1;)V

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    invoke-interface {v0, p1, p3}, Lcom/daaw/x2;->C(Lcom/daaw/x2$a;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final w(ILcom/daaw/bp0$a;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o2;->H(ILcom/daaw/bp0$a;)Lcom/daaw/x2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x2;

    invoke-interface {v0, p1, p3, p4}, Lcom/daaw/x2;->o(Lcom/daaw/x2$a;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final x(Lcom/google/android/exoplayer2/Format;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/o2;->M()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    const/4 v3, 0x2

    invoke-interface {v2, v0, v3, p1}, Lcom/daaw/x2;->k(Lcom/daaw/x2$a;ILcom/google/android/exoplayer2/Format;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final y(Lcom/daaw/fq;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/o2;->L()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    const/4 v3, 0x2

    invoke-interface {v2, v0, v3, p1}, Lcom/daaw/x2;->s(Lcom/daaw/x2$a;ILcom/daaw/fq;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final z(Lcom/google/android/exoplayer2/Format;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/o2;->M()Lcom/daaw/x2$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/o2;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/x2;

    const/4 v3, 0x1

    invoke-interface {v2, v0, v3, p1}, Lcom/daaw/x2;->k(Lcom/daaw/x2$a;ILcom/google/android/exoplayer2/Format;)V

    goto :goto_0

    :cond_0
    return-void
.end method
