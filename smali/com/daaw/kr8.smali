.class public final Lcom/daaw/kr8;
.super Lcom/daaw/cu8;
.source ""


# instance fields
.field public final l:Z

.field public final m:Lcom/daaw/i54;

.field public final n:Lcom/daaw/d34;

.field public o:Lcom/daaw/ir8;

.field public p:Lcom/daaw/br8;

.field public q:Z

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Lcom/daaw/rr8;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/cu8;-><init>(Lcom/daaw/rr8;)V

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/daaw/rr8;->b()Z

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lcom/daaw/kr8;->l:Z

    new-instance p2, Lcom/daaw/i54;

    invoke-direct {p2}, Lcom/daaw/i54;-><init>()V

    iput-object p2, p0, Lcom/daaw/kr8;->m:Lcom/daaw/i54;

    new-instance p2, Lcom/daaw/d34;

    invoke-direct {p2}, Lcom/daaw/d34;-><init>()V

    iput-object p2, p0, Lcom/daaw/kr8;->n:Lcom/daaw/d34;

    invoke-interface {p1}, Lcom/daaw/rr8;->p()Lcom/daaw/l64;

    invoke-interface {p1}, Lcom/daaw/rr8;->h()Lcom/daaw/f53;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/ir8;->q(Lcom/daaw/f53;)Lcom/daaw/ir8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    return-void
.end method


# virtual methods
.method public final F(Lcom/daaw/pr8;)Lcom/daaw/pr8;
    .locals 2

    iget-object v0, p1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    invoke-static {v1}, Lcom/daaw/ir8;->s(Lcom/daaw/ir8;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    invoke-static {v1}, Lcom/daaw/ir8;->s(Lcom/daaw/ir8;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/daaw/ir8;->f:Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1, v0}, Lcom/daaw/pr8;->c(Ljava/lang/Object;)Lcom/daaw/pr8;

    move-result-object p1

    return-object p1
.end method

.method public final G(Lcom/daaw/l64;)V
    .locals 14

    iget-boolean v0, p0, Lcom/daaw/kr8;->r:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    invoke-virtual {v0, p1}, Lcom/daaw/ir8;->p(Lcom/daaw/l64;)Lcom/daaw/ir8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    iget-object p1, p0, Lcom/daaw/kr8;->p:Lcom/daaw/br8;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/daaw/br8;->f()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/daaw/kr8;->L(J)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/kr8;->s:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    invoke-virtual {v0, p1}, Lcom/daaw/ir8;->p(Lcom/daaw/l64;)Lcom/daaw/ir8;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/daaw/i54;->o:Ljava/lang/Object;

    sget-object v2, Lcom/daaw/ir8;->f:Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/daaw/ir8;->r(Lcom/daaw/l64;Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/ir8;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lcom/daaw/kr8;->m:Lcom/daaw/i54;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-virtual {p1, v2, v0, v3, v4}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    iget-object v0, p0, Lcom/daaw/kr8;->m:Lcom/daaw/i54;

    iget-object v0, v0, Lcom/daaw/i54;->a:Ljava/lang/Object;

    iget-object v5, p0, Lcom/daaw/kr8;->p:Lcom/daaw/br8;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/daaw/br8;->i()J

    move-result-wide v6

    iget-object v8, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    iget-object v5, v5, Lcom/daaw/br8;->p:Lcom/daaw/pr8;

    iget-object v5, v5, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v9, p0, Lcom/daaw/kr8;->n:Lcom/daaw/d34;

    invoke-virtual {v8, v5, v9}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget-object v5, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    iget-object v8, p0, Lcom/daaw/kr8;->m:Lcom/daaw/i54;

    invoke-virtual {v5, v2, v8, v3, v4}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    cmp-long v2, v6, v3

    if-eqz v2, :cond_3

    move-wide v12, v6

    goto :goto_1

    :cond_3
    move-wide v12, v3

    :goto_1
    iget-object v9, p0, Lcom/daaw/kr8;->m:Lcom/daaw/i54;

    iget-object v10, p0, Lcom/daaw/kr8;->n:Lcom/daaw/d34;

    const/4 v11, 0x0

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Lcom/daaw/l64;->l(Lcom/daaw/i54;Lcom/daaw/d34;IJ)Landroid/util/Pair;

    move-result-object v2

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-boolean v2, p0, Lcom/daaw/kr8;->s:Z

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    invoke-virtual {v0, p1}, Lcom/daaw/ir8;->p(Lcom/daaw/l64;)Lcom/daaw/ir8;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p1, v0, v3}, Lcom/daaw/ir8;->r(Lcom/daaw/l64;Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/ir8;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    iget-object p1, p0, Lcom/daaw/kr8;->p:Lcom/daaw/br8;

    if-eqz p1, :cond_5

    invoke-virtual {p0, v4, v5}, Lcom/daaw/kr8;->L(J)V

    iget-object p1, p1, Lcom/daaw/br8;->p:Lcom/daaw/pr8;

    iget-object v0, p1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/daaw/kr8;->K(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/pr8;->c(Ljava/lang/Object;)Lcom/daaw/pr8;

    move-result-object v1

    :cond_5
    :goto_3
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/kr8;->s:Z

    iput-boolean p1, p0, Lcom/daaw/kr8;->r:Z

    iget-object p1, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    invoke-virtual {p0, p1}, Lcom/daaw/lq8;->x(Lcom/daaw/l64;)V

    if-eqz v1, :cond_6

    iget-object p1, p0, Lcom/daaw/kr8;->p:Lcom/daaw/br8;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lcom/daaw/br8;->l(Lcom/daaw/pr8;)V

    :cond_6
    return-void
.end method

.method public final H()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/kr8;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/kr8;->q:Z

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/daaw/cu8;->k:Lcom/daaw/rr8;

    invoke-virtual {p0, v0, v1}, Lcom/daaw/sq8;->A(Ljava/lang/Object;Lcom/daaw/rr8;)V

    :cond_0
    return-void
.end method

.method public final I()Lcom/daaw/l64;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    return-object v0
.end method

.method public final J(Lcom/daaw/pr8;Lcom/daaw/nw8;J)Lcom/daaw/br8;
    .locals 7

    new-instance v6, Lcom/daaw/br8;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/br8;-><init>(Lcom/daaw/pr8;Lcom/daaw/nw8;J[B)V

    iget-object p2, p0, Lcom/daaw/cu8;->k:Lcom/daaw/rr8;

    invoke-virtual {v6, p2}, Lcom/daaw/br8;->o(Lcom/daaw/rr8;)V

    iget-boolean p2, p0, Lcom/daaw/kr8;->r:Z

    if-eqz p2, :cond_0

    iget-object p2, p1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lcom/daaw/kr8;->K(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/pr8;->c(Ljava/lang/Object;)Lcom/daaw/pr8;

    move-result-object p1

    invoke-virtual {v6, p1}, Lcom/daaw/br8;->l(Lcom/daaw/pr8;)V

    goto :goto_0

    :cond_0
    iput-object v6, p0, Lcom/daaw/kr8;->p:Lcom/daaw/br8;

    iget-boolean p1, p0, Lcom/daaw/kr8;->q:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/kr8;->q:Z

    const/4 p1, 0x0

    iget-object p2, p0, Lcom/daaw/cu8;->k:Lcom/daaw/rr8;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/sq8;->A(Ljava/lang/Object;Lcom/daaw/rr8;)V

    :cond_1
    :goto_0
    return-object v6
.end method

.method public final K(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    invoke-static {v0}, Lcom/daaw/ir8;->s(Lcom/daaw/ir8;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/ir8;->f:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    invoke-static {p1}, Lcom/daaw/ir8;->s(Lcom/daaw/ir8;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final L(J)V
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "unpreparedMaskingMediaPeriod"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/kr8;->p:Lcom/daaw/br8;

    iget-object v1, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    iget-object v2, v0, Lcom/daaw/br8;->p:Lcom/daaw/pr8;

    iget-object v2, v2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/daaw/xq8;->a(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lcom/daaw/kr8;->o:Lcom/daaw/ir8;

    iget-object v3, p0, Lcom/daaw/kr8;->n:Lcom/daaw/d34;

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lcom/daaw/l64;->d(ILcom/daaw/d34;Z)Lcom/daaw/d34;

    iget-wide v1, v3, Lcom/daaw/d34;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, 0x0

    const-wide/16 v3, -0x1

    add-long/2addr v1, v3

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    :cond_1
    invoke-virtual {v0, p1, p2}, Lcom/daaw/br8;->m(J)V

    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final bridge synthetic k(Lcom/daaw/pr8;Lcom/daaw/nw8;J)Lcom/daaw/nr8;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/kr8;->J(Lcom/daaw/pr8;Lcom/daaw/nw8;J)Lcom/daaw/br8;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lcom/daaw/nr8;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/daaw/br8;

    invoke-virtual {v0}, Lcom/daaw/br8;->n()V

    iget-object v0, p0, Lcom/daaw/kr8;->p:Lcom/daaw/br8;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/kr8;->p:Lcom/daaw/br8;

    :cond_0
    return-void
.end method

.method public final y()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/kr8;->r:Z

    iput-boolean v0, p0, Lcom/daaw/kr8;->q:Z

    invoke-super {p0}, Lcom/daaw/sq8;->y()V

    return-void
.end method
