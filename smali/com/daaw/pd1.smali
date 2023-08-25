.class public final Lcom/daaw/pd1;
.super Lcom/daaw/sa;
.source ""


# instance fields
.field public final m:I

.field public final n:Lcom/google/android/exoplayer2/Format;

.field public volatile o:I

.field public volatile p:Z


# direct methods
.method public constructor <init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJILcom/google/android/exoplayer2/Format;)V
    .locals 15

    move-object v14, p0

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v12, p10

    invoke-direct/range {v0 .. v13}, Lcom/daaw/sa;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJ)V

    move/from16 v0, p12

    iput v0, v14, Lcom/daaw/pd1;->m:I

    move-object/from16 v0, p13

    iput-object v0, v14, Lcom/daaw/pd1;->n:Lcom/google/android/exoplayer2/Format;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 11

    iget-object v0, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget v1, p0, Lcom/daaw/pd1;->o:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pp;->b(J)Lcom/daaw/pp;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-interface {v1, v0}, Lcom/daaw/mp;->c(Lcom/daaw/pp;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget v2, p0, Lcom/daaw/pd1;->o:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    :cond_0
    move-wide v5, v0

    new-instance v0, Lcom/daaw/wq;

    iget-object v2, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    iget v1, p0, Lcom/daaw/pd1;->o:I

    int-to-long v3, v1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/wq;-><init>(Lcom/daaw/mp;JJ)V

    invoke-virtual {p0}, Lcom/daaw/sa;->h()Lcom/daaw/ta;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ta;->c(J)V

    iget v2, p0, Lcom/daaw/pd1;->m:I

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lcom/daaw/ta;->a(II)Lcom/daaw/sm1;

    move-result-object v4

    iget-object v1, p0, Lcom/daaw/pd1;->n:Lcom/google/android/exoplayer2/Format;

    invoke-interface {v4, v1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    :goto_0
    const/4 v1, -0x1

    const/4 v2, 0x1

    if-eq v3, v1, :cond_1

    iget v1, p0, Lcom/daaw/pd1;->o:I

    add-int/2addr v1, v3

    iput v1, p0, Lcom/daaw/pd1;->o:I

    const v1, 0x7fffffff

    invoke-interface {v4, v0, v1, v2}, Lcom/daaw/sm1;->b(Lcom/daaw/a00;IZ)I

    move-result v3

    goto :goto_0

    :cond_1
    iget v8, p0, Lcom/daaw/pd1;->o:I

    iget-wide v5, p0, Lcom/daaw/ef;->f:J

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-static {v0}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    iput-boolean v2, p0, Lcom/daaw/pd1;->p:Z

    return-void

    :catchall_0
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
    .locals 0

    return-void
.end method

.method public c()J
    .locals 2

    iget v0, p0, Lcom/daaw/pd1;->o:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/pd1;->p:Z

    return v0
.end method
