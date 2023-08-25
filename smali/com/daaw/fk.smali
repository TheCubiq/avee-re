.class public Lcom/daaw/fk;
.super Lcom/daaw/sa;
.source ""


# instance fields
.field public final m:I

.field public final n:J

.field public final o:Lcom/daaw/ff;

.field public volatile p:I

.field public volatile q:Z

.field public volatile r:Z


# direct methods
.method public constructor <init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJIJLcom/daaw/ff;)V
    .locals 3

    move-object v0, p0

    invoke-direct/range {p0 .. p13}, Lcom/daaw/sa;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJ)V

    move/from16 v1, p14

    iput v1, v0, Lcom/daaw/fk;->m:I

    move-wide/from16 v1, p15

    iput-wide v1, v0, Lcom/daaw/fk;->n:J

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/daaw/fk;->o:Lcom/daaw/ff;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget v1, p0, Lcom/daaw/fk;->p:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pp;->b(J)Lcom/daaw/pp;

    move-result-object v0

    :try_start_0
    new-instance v7, Lcom/daaw/wq;

    iget-object v2, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    iget-wide v3, v0, Lcom/daaw/pp;->c:J

    invoke-interface {v2, v0}, Lcom/daaw/mp;->c(Lcom/daaw/pp;)J

    move-result-wide v5

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/daaw/wq;-><init>(Lcom/daaw/mp;JJ)V

    iget v0, p0, Lcom/daaw/fk;->p:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/sa;->h()Lcom/daaw/ta;

    move-result-object v0

    iget-wide v1, p0, Lcom/daaw/fk;->n:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ta;->c(J)V

    iget-object v1, p0, Lcom/daaw/fk;->o:Lcom/daaw/ff;

    iget-wide v2, p0, Lcom/daaw/sa;->j:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_0
    iget-wide v4, p0, Lcom/daaw/fk;->n:J

    sub-long/2addr v2, v4

    :goto_0
    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/ff;->e(Lcom/daaw/ff$b;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/daaw/fk;->o:Lcom/daaw/ff;

    iget-object v0, v0, Lcom/daaw/ff;->p:Lcom/daaw/zz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_2

    iget-boolean v3, p0, Lcom/daaw/fk;->q:Z

    if-nez v3, :cond_2

    const/4 v2, 0x0

    invoke-interface {v0, v7, v2}, Lcom/daaw/zz;->d(Lcom/daaw/a00;Lcom/daaw/iy0;)I

    move-result v2

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    if-eq v2, v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    invoke-static {v1}, Lcom/daaw/s6;->f(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v7}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget-wide v3, v3, Lcom/daaw/pp;->c:J

    sub-long/2addr v1, v3

    long-to-int v2, v1

    iput v2, p0, Lcom/daaw/fk;->p:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v1, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-static {v1}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    iput-boolean v0, p0, Lcom/daaw/fk;->r:Z

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-interface {v7}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget-wide v3, v3, Lcom/daaw/pp;->c:J

    sub-long/2addr v1, v3

    long-to-int v2, v1

    iput v2, p0, Lcom/daaw/fk;->p:I

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-static {v1}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/fk;->q:Z

    return-void
.end method

.method public final c()J
    .locals 2

    iget v0, p0, Lcom/daaw/fk;->p:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public e()J
    .locals 4

    iget-wide v0, p0, Lcom/daaw/zn0;->i:J

    iget v2, p0, Lcom/daaw/fk;->m:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/fk;->r:Z

    return v0
.end method
