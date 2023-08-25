.class public abstract Lcom/daaw/dp;
.super Lcom/daaw/ef;
.source ""


# instance fields
.field public i:[B

.field public j:I

.field public volatile k:Z


# direct methods
.method public constructor <init>(Lcom/daaw/mp;Lcom/daaw/pp;ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;[B)V
    .locals 11

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v0 .. v10}, Lcom/daaw/ef;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V

    move-object/from16 v1, p7

    iput-object v1, v0, Lcom/daaw/dp;->i:[B

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    iget-object v1, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    invoke-interface {v0, v1}, Lcom/daaw/mp;->c(Lcom/daaw/pp;)J

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dp;->j:I

    :cond_0
    :goto_0
    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/daaw/dp;->k:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/dp;->g()V

    iget-object v0, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    iget-object v2, p0, Lcom/daaw/dp;->i:[B

    iget v3, p0, Lcom/daaw/dp;->j:I

    const/16 v4, 0x4000

    invoke-interface {v0, v2, v3, v4}, Lcom/daaw/mp;->b([BII)I

    move-result v0

    if-eq v0, v1, :cond_0

    iget v1, p0, Lcom/daaw/dp;->j:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/dp;->j:I

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/dp;->k:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/dp;->i:[B

    iget v1, p0, Lcom/daaw/dp;->j:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/dp;->e([BI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-static {v0}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

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

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/dp;->k:Z

    return-void
.end method

.method public c()J
    .locals 2

    iget v0, p0, Lcom/daaw/dp;->j:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public abstract e([BI)V
.end method

.method public f()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/dp;->i:[B

    return-object v0
.end method

.method public final g()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/dp;->i:[B

    const/16 v1, 0x4000

    if-nez v0, :cond_0

    new-array v0, v1, [B

    iput-object v0, p0, Lcom/daaw/dp;->i:[B

    goto :goto_0

    :cond_0
    array-length v2, v0

    iget v3, p0, Lcom/daaw/dp;->j:I

    add-int/2addr v3, v1

    if-ge v2, v3, :cond_1

    array-length v2, v0

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dp;->i:[B

    :cond_1
    :goto_0
    return-void
.end method
