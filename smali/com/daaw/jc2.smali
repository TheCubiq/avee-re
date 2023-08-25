.class public final Lcom/daaw/jc2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ac2;


# instance fields
.field public final a:Lcom/daaw/id2;

.field public final b:Lcom/daaw/pc2;

.field public final c:Lcom/daaw/pc2;

.field public final d:Lcom/daaw/pc2;

.field public e:J

.field public final f:[Z

.field public g:Ljava/lang/String;

.field public h:Lcom/daaw/m42;

.field public i:Lcom/daaw/ic2;

.field public j:Z

.field public k:J

.field public l:Z

.field public final m:Lcom/daaw/ik5;


# direct methods
.method public constructor <init>(Lcom/daaw/id2;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jc2;->a:Lcom/daaw/id2;

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/daaw/jc2;->f:[Z

    new-instance p1, Lcom/daaw/pc2;

    const/4 p2, 0x7

    const/16 p3, 0x80

    invoke-direct {p1, p2, p3}, Lcom/daaw/pc2;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    new-instance p1, Lcom/daaw/pc2;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, Lcom/daaw/pc2;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    new-instance p1, Lcom/daaw/pc2;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, Lcom/daaw/pc2;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/jc2;->d:Lcom/daaw/pc2;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/jc2;->k:J

    new-instance p1, Lcom/daaw/ik5;

    invoke-direct {p1}, Lcom/daaw/ik5;-><init>()V

    iput-object p1, p0, Lcom/daaw/jc2;->m:Lcom/daaw/ik5;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/jc2;->h:Lcom/daaw/m42;

    invoke-static {v1}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->l()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    iget-wide v4, v0, Lcom/daaw/jc2;->e:J

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Lcom/daaw/jc2;->e:J

    iget-object v4, v0, Lcom/daaw/jc2;->h:Lcom/daaw/m42;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v5

    move-object/from16 v6, p1

    invoke-interface {v4, v6, v5}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    :goto_0
    iget-object v4, v0, Lcom/daaw/jc2;->f:[Z

    invoke-static {v3, v1, v2, v4}, Lcom/daaw/c42;->a([BII[Z)I

    move-result v4

    if-eq v4, v2, :cond_9

    add-int/lit8 v5, v4, 0x3

    aget-byte v6, v3, v5

    and-int/lit8 v10, v6, 0x1f

    sub-int v6, v4, v1

    if-lez v6, :cond_0

    invoke-virtual {v0, v3, v1, v4}, Lcom/daaw/jc2;->d([BII)V

    :cond_0
    sub-int v14, v2, v4

    iget-wide v7, v0, Lcom/daaw/jc2;->e:J

    int-to-long v11, v14

    sub-long v17, v7, v11

    if-gez v6, :cond_1

    neg-int v4, v6

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iget-wide v6, v0, Lcom/daaw/jc2;->k:J

    iget-boolean v8, v0, Lcom/daaw/jc2;->j:Z

    const/4 v9, 0x4

    if-eqz v8, :cond_2

    goto/16 :goto_4

    :cond_2
    iget-object v8, v0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    invoke-virtual {v8, v4}, Lcom/daaw/pc2;->d(I)Z

    iget-object v8, v0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    invoke-virtual {v8, v4}, Lcom/daaw/pc2;->d(I)Z

    iget-boolean v8, v0, Lcom/daaw/jc2;->j:Z

    if-nez v8, :cond_3

    iget-object v8, v0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    invoke-virtual {v8}, Lcom/daaw/pc2;->e()Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    invoke-virtual {v8}, Lcom/daaw/pc2;->e()Z

    move-result v8

    if-eqz v8, :cond_5

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget-object v11, v0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    iget-object v12, v11, Lcom/daaw/pc2;->d:[B

    iget v11, v11, Lcom/daaw/pc2;->e:I

    invoke-static {v12, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v11

    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v11, v0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    iget-object v12, v11, Lcom/daaw/pc2;->d:[B

    iget v11, v11, Lcom/daaw/pc2;->e:I

    invoke-static {v12, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v11

    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v11, v0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    iget-object v12, v11, Lcom/daaw/pc2;->d:[B

    iget v11, v11, Lcom/daaw/pc2;->e:I

    invoke-static {v12, v9, v11}, Lcom/daaw/c42;->d([BII)Lcom/daaw/b42;

    move-result-object v11

    iget-object v12, v0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    iget-object v13, v12, Lcom/daaw/pc2;->d:[B

    iget v12, v12, Lcom/daaw/pc2;->e:I

    invoke-static {v13, v9, v12}, Lcom/daaw/c42;->c([BII)Lcom/daaw/a42;

    move-result-object v12

    iget v13, v11, Lcom/daaw/b42;->a:I

    iget v15, v11, Lcom/daaw/b42;->b:I

    iget v1, v11, Lcom/daaw/b42;->c:I

    invoke-static {v13, v15, v1}, Lcom/daaw/ar4;->a(III)Ljava/lang/String;

    move-result-object v1

    iget-object v13, v0, Lcom/daaw/jc2;->h:Lcom/daaw/m42;

    new-instance v15, Lcom/daaw/b72;

    invoke-direct {v15}, Lcom/daaw/b72;-><init>()V

    iget-object v9, v0, Lcom/daaw/jc2;->g:Ljava/lang/String;

    invoke-virtual {v15, v9}, Lcom/daaw/b72;->h(Ljava/lang/String;)Lcom/daaw/b72;

    const-string v9, "video/avc"

    invoke-virtual {v15, v9}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v15, v1}, Lcom/daaw/b72;->f0(Ljava/lang/String;)Lcom/daaw/b72;

    iget v1, v11, Lcom/daaw/b42;->e:I

    invoke-virtual {v15, v1}, Lcom/daaw/b72;->x(I)Lcom/daaw/b72;

    iget v1, v11, Lcom/daaw/b42;->f:I

    invoke-virtual {v15, v1}, Lcom/daaw/b72;->f(I)Lcom/daaw/b72;

    iget v1, v11, Lcom/daaw/b42;->g:F

    invoke-virtual {v15, v1}, Lcom/daaw/b72;->p(F)Lcom/daaw/b72;

    invoke-virtual {v15, v8}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    invoke-virtual {v15}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v1

    invoke-interface {v13, v1}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/jc2;->j:Z

    iget-object v1, v0, Lcom/daaw/jc2;->i:Lcom/daaw/ic2;

    invoke-virtual {v1, v11}, Lcom/daaw/ic2;->b(Lcom/daaw/b42;)V

    iget-object v1, v0, Lcom/daaw/jc2;->i:Lcom/daaw/ic2;

    invoke-virtual {v1, v12}, Lcom/daaw/ic2;->a(Lcom/daaw/a42;)V

    iget-object v1, v0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    invoke-virtual {v1}, Lcom/daaw/pc2;->b()V

    goto :goto_3

    :cond_3
    iget-object v1, v0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    invoke-virtual {v1}, Lcom/daaw/pc2;->e()Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v8, v1, Lcom/daaw/pc2;->d:[B

    iget v1, v1, Lcom/daaw/pc2;->e:I

    const/4 v9, 0x4

    invoke-static {v8, v9, v1}, Lcom/daaw/c42;->d([BII)Lcom/daaw/b42;

    move-result-object v1

    iget-object v8, v0, Lcom/daaw/jc2;->i:Lcom/daaw/ic2;

    invoke-virtual {v8, v1}, Lcom/daaw/ic2;->b(Lcom/daaw/b42;)V

    iget-object v1, v0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    :goto_2
    invoke-virtual {v1}, Lcom/daaw/pc2;->b()V

    goto :goto_4

    :cond_4
    const/4 v9, 0x4

    iget-object v1, v0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    invoke-virtual {v1}, Lcom/daaw/pc2;->e()Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v8, v1, Lcom/daaw/pc2;->d:[B

    iget v1, v1, Lcom/daaw/pc2;->e:I

    invoke-static {v8, v9, v1}, Lcom/daaw/c42;->c([BII)Lcom/daaw/a42;

    move-result-object v1

    iget-object v8, v0, Lcom/daaw/jc2;->i:Lcom/daaw/ic2;

    invoke-virtual {v8, v1}, Lcom/daaw/ic2;->a(Lcom/daaw/a42;)V

    :goto_3
    iget-object v1, v0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    goto :goto_2

    :cond_5
    :goto_4
    iget-object v1, v0, Lcom/daaw/jc2;->d:Lcom/daaw/pc2;

    invoke-virtual {v1, v4}, Lcom/daaw/pc2;->d(I)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/daaw/jc2;->d:Lcom/daaw/pc2;

    iget-object v4, v1, Lcom/daaw/pc2;->d:[B

    iget v1, v1, Lcom/daaw/pc2;->e:I

    invoke-static {v4, v1}, Lcom/daaw/c42;->b([BI)I

    move-result v1

    iget-object v4, v0, Lcom/daaw/jc2;->m:Lcom/daaw/ik5;

    iget-object v8, v0, Lcom/daaw/jc2;->d:Lcom/daaw/pc2;

    iget-object v8, v8, Lcom/daaw/pc2;->d:[B

    invoke-virtual {v4, v8, v1}, Lcom/daaw/ik5;->d([BI)V

    iget-object v1, v0, Lcom/daaw/jc2;->m:Lcom/daaw/ik5;

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Lcom/daaw/ik5;->f(I)V

    iget-object v1, v0, Lcom/daaw/jc2;->a:Lcom/daaw/id2;

    iget-object v4, v0, Lcom/daaw/jc2;->m:Lcom/daaw/ik5;

    invoke-virtual {v1, v6, v7, v4}, Lcom/daaw/id2;->a(JLcom/daaw/ik5;)V

    :cond_6
    iget-object v11, v0, Lcom/daaw/jc2;->i:Lcom/daaw/ic2;

    iget-boolean v15, v0, Lcom/daaw/jc2;->j:Z

    iget-boolean v1, v0, Lcom/daaw/jc2;->l:Z

    move-wide/from16 v12, v17

    move/from16 v16, v1

    invoke-virtual/range {v11 .. v16}, Lcom/daaw/ic2;->e(JIZZ)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/daaw/jc2;->l:Z

    :cond_7
    iget-wide v11, v0, Lcom/daaw/jc2;->k:J

    iget-boolean v1, v0, Lcom/daaw/jc2;->j:Z

    if-nez v1, :cond_8

    iget-object v1, v0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    invoke-virtual {v1, v10}, Lcom/daaw/pc2;->c(I)V

    iget-object v1, v0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    invoke-virtual {v1, v10}, Lcom/daaw/pc2;->c(I)V

    :cond_8
    iget-object v1, v0, Lcom/daaw/jc2;->d:Lcom/daaw/pc2;

    invoke-virtual {v1, v10}, Lcom/daaw/pc2;->c(I)V

    iget-object v7, v0, Lcom/daaw/jc2;->i:Lcom/daaw/ic2;

    move-wide/from16 v8, v17

    invoke-virtual/range {v7 .. v12}, Lcom/daaw/ic2;->d(JIJ)V

    move v1, v5

    goto/16 :goto_0

    :cond_9
    invoke-virtual {v0, v3, v1, v2}, Lcom/daaw/jc2;->d([BII)V

    return-void
.end method

.method public final b(Lcom/daaw/m09;Lcom/daaw/td2;)V
    .locals 3

    invoke-virtual {p2}, Lcom/daaw/td2;->c()V

    invoke-virtual {p2}, Lcom/daaw/td2;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/jc2;->g:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/daaw/td2;->a()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/jc2;->h:Lcom/daaw/m42;

    new-instance v1, Lcom/daaw/ic2;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2, v2}, Lcom/daaw/ic2;-><init>(Lcom/daaw/m42;ZZ)V

    iput-object v1, p0, Lcom/daaw/jc2;->i:Lcom/daaw/ic2;

    iget-object v0, p0, Lcom/daaw/jc2;->a:Lcom/daaw/id2;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/id2;->b(Lcom/daaw/m09;Lcom/daaw/td2;)V

    return-void
.end method

.method public final c(JI)V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    iput-wide p1, p0, Lcom/daaw/jc2;->k:J

    :cond_0
    iget-boolean p1, p0, Lcom/daaw/jc2;->l:Z

    and-int/lit8 p2, p3, 0x2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p1, p2

    iput-boolean p1, p0, Lcom/daaw/jc2;->l:Z

    return-void
.end method

.method public final d([BII)V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sampleReader"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/jc2;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/pc2;->a([BII)V

    iget-object v0, p0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/pc2;->a([BII)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/jc2;->d:Lcom/daaw/pc2;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/pc2;->a([BII)V

    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/jc2;->e:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/jc2;->l:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/jc2;->k:J

    iget-object v0, p0, Lcom/daaw/jc2;->f:[Z

    invoke-static {v0}, Lcom/daaw/c42;->e([Z)V

    iget-object v0, p0, Lcom/daaw/jc2;->b:Lcom/daaw/pc2;

    invoke-virtual {v0}, Lcom/daaw/pc2;->b()V

    iget-object v0, p0, Lcom/daaw/jc2;->c:Lcom/daaw/pc2;

    invoke-virtual {v0}, Lcom/daaw/pc2;->b()V

    iget-object v0, p0, Lcom/daaw/jc2;->d:Lcom/daaw/pc2;

    invoke-virtual {v0}, Lcom/daaw/pc2;->b()V

    iget-object v0, p0, Lcom/daaw/jc2;->i:Lcom/daaw/ic2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/ic2;->c()V

    :cond_0
    return-void
.end method
