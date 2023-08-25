.class public final Lcom/daaw/uf0;
.super Lcom/daaw/ef;
.source ""


# instance fields
.field public final i:Lcom/daaw/ff;

.field public volatile j:I

.field public volatile k:Z


# direct methods
.method public constructor <init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;Lcom/daaw/ff;)V
    .locals 11

    const/4 v3, 0x2

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v10}, Lcom/daaw/ef;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V

    move-object/from16 v1, p6

    iput-object v1, v0, Lcom/daaw/uf0;->i:Lcom/daaw/ff;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget v1, p0, Lcom/daaw/uf0;->j:I

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

    iget v0, p0, Lcom/daaw/uf0;->j:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/uf0;->i:Lcom/daaw/ff;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/ff;->e(Lcom/daaw/ff$b;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/uf0;->i:Lcom/daaw/ff;

    iget-object v0, v0, Lcom/daaw/ff;->p:Lcom/daaw/zz;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_1

    iget-boolean v4, p0, Lcom/daaw/uf0;->k:Z

    if-nez v4, :cond_1

    invoke-interface {v0, v7, v1}, Lcom/daaw/zz;->d(Lcom/daaw/a00;Lcom/daaw/iy0;)I

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    if-eq v3, v0, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-static {v2}, Lcom/daaw/s6;->f(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v7}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget-wide v2, v2, Lcom/daaw/pp;->c:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    iput v1, p0, Lcom/daaw/uf0;->j:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-static {v0}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

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

    iput v2, p0, Lcom/daaw/uf0;->j:I

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-static {v1}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/uf0;->k:Z

    return-void
.end method

.method public c()J
    .locals 2

    iget v0, p0, Lcom/daaw/uf0;->j:I

    int-to-long v0, v0

    return-wide v0
.end method
