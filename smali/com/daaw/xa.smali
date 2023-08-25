.class public abstract Lcom/daaw/xa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/a41;
.implements Lcom/daaw/b41;


# instance fields
.field public final p:I

.field public q:Lcom/daaw/c41;

.field public r:I

.field public s:I

.field public t:Lcom/daaw/d81;

.field public u:[Lcom/google/android/exoplayer2/Format;

.field public v:J

.field public w:Z

.field public x:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/xa;->p:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/xa;->w:Z

    return-void
.end method

.method public static I(Lcom/daaw/yu;Lcom/google/android/exoplayer2/drm/DrmInitData;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yu<",
            "*>;",
            "Lcom/google/android/exoplayer2/drm/DrmInitData;",
            ")Z"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-interface {p0, p1}, Lcom/daaw/yu;->d(Lcom/google/android/exoplayer2/drm/DrmInitData;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract A()V
.end method

.method public B(Z)V
    .locals 0

    return-void
.end method

.method public abstract C(JZ)V
.end method

.method public D()V
    .locals 0

    return-void
.end method

.method public E()V
    .locals 0

    return-void
.end method

.method public F([Lcom/google/android/exoplayer2/Format;J)V
    .locals 0

    return-void
.end method

.method public final G(Lcom/daaw/k30;Lcom/daaw/gq;Z)I
    .locals 5

    iget-object v0, p0, Lcom/daaw/xa;->t:Lcom/daaw/d81;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/d81;->j(Lcom/daaw/k30;Lcom/daaw/gq;Z)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    invoke-virtual {p2}, Lcom/daaw/rc;->j()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/xa;->w:Z

    iget-boolean p1, p0, Lcom/daaw/xa;->x:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x3

    :goto_0
    return v0

    :cond_1
    iget-wide v0, p2, Lcom/daaw/gq;->s:J

    iget-wide v2, p0, Lcom/daaw/xa;->v:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lcom/daaw/gq;->s:J

    goto :goto_1

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    iget-object p2, p1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    iget-wide v0, p2, Lcom/google/android/exoplayer2/Format;->L:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    iget-wide v2, p0, Lcom/daaw/xa;->v:J

    add-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Lcom/google/android/exoplayer2/Format;->l(J)Lcom/google/android/exoplayer2/Format;

    move-result-object p2

    iput-object p2, p1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    :cond_3
    :goto_1
    return p3
.end method

.method public H(J)I
    .locals 3

    iget-object v0, p0, Lcom/daaw/xa;->t:Lcom/daaw/d81;

    iget-wide v1, p0, Lcom/daaw/xa;->v:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/d81;->n(J)I

    move-result p1

    return p1
.end method

.method public final b()Lcom/daaw/d81;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xa;->t:Lcom/daaw/d81;

    return-object v0
.end method

.method public final e(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/xa;->r:I

    return-void
.end method

.method public final g()V
    .locals 3

    iget v0, p0, Lcom/daaw/xa;->s:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/daaw/s6;->f(Z)V

    iput v2, p0, Lcom/daaw/xa;->s:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/xa;->t:Lcom/daaw/d81;

    iput-object v0, p0, Lcom/daaw/xa;->u:[Lcom/google/android/exoplayer2/Format;

    iput-boolean v2, p0, Lcom/daaw/xa;->x:Z

    invoke-virtual {p0}, Lcom/daaw/xa;->A()V

    return-void
.end method

.method public final getState()I
    .locals 1

    iget v0, p0, Lcom/daaw/xa;->s:I

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lcom/daaw/xa;->p:I

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xa;->w:Z

    return v0
.end method

.method public final k(Lcom/daaw/c41;[Lcom/google/android/exoplayer2/Format;Lcom/daaw/d81;JZJ)V
    .locals 2

    iget v0, p0, Lcom/daaw/xa;->s:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput-object p1, p0, Lcom/daaw/xa;->q:Lcom/daaw/c41;

    iput v1, p0, Lcom/daaw/xa;->s:I

    invoke-virtual {p0, p6}, Lcom/daaw/xa;->B(Z)V

    invoke-virtual {p0, p2, p3, p7, p8}, Lcom/daaw/xa;->m([Lcom/google/android/exoplayer2/Format;Lcom/daaw/d81;J)V

    invoke-virtual {p0, p4, p5, p6}, Lcom/daaw/xa;->C(JZ)V

    return-void
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/xa;->x:Z

    return-void
.end method

.method public final m([Lcom/google/android/exoplayer2/Format;Lcom/daaw/d81;J)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xa;->x:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput-object p2, p0, Lcom/daaw/xa;->t:Lcom/daaw/d81;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/daaw/xa;->w:Z

    iput-object p1, p0, Lcom/daaw/xa;->u:[Lcom/google/android/exoplayer2/Format;

    iput-wide p3, p0, Lcom/daaw/xa;->v:J

    invoke-virtual {p0, p1, p3, p4}, Lcom/daaw/xa;->F([Lcom/google/android/exoplayer2/Format;J)V

    return-void
.end method

.method public final n()Lcom/daaw/b41;
    .locals 0

    return-object p0
.end method

.method public p()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public r(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xa;->t:Lcom/daaw/d81;

    invoke-interface {v0}, Lcom/daaw/d81;->a()V

    return-void
.end method

.method public final start()V
    .locals 2

    iget v0, p0, Lcom/daaw/xa;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/daaw/s6;->f(Z)V

    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/xa;->s:I

    invoke-virtual {p0}, Lcom/daaw/xa;->D()V

    return-void
.end method

.method public final stop()V
    .locals 3

    iget v0, p0, Lcom/daaw/xa;->s:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput v1, p0, Lcom/daaw/xa;->s:I

    invoke-virtual {p0}, Lcom/daaw/xa;->E()V

    return-void
.end method

.method public final t(J)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/xa;->x:Z

    iput-boolean v0, p0, Lcom/daaw/xa;->w:Z

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/xa;->C(JZ)V

    return-void
.end method

.method public final u()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xa;->x:Z

    return v0
.end method

.method public v()Lcom/daaw/ao0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final w()Lcom/daaw/c41;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xa;->q:Lcom/daaw/c41;

    return-object v0
.end method

.method public final x()I
    .locals 1

    iget v0, p0, Lcom/daaw/xa;->r:I

    return v0
.end method

.method public final y()[Lcom/google/android/exoplayer2/Format;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xa;->u:[Lcom/google/android/exoplayer2/Format;

    return-object v0
.end method

.method public final z()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xa;->w:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/xa;->x:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/xa;->t:Lcom/daaw/d81;

    invoke-interface {v0}, Lcom/daaw/d81;->d()Z

    move-result v0

    :goto_0
    return v0
.end method
