.class public final Lcom/daaw/ft8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ik5;

.field public b:Lcom/daaw/et8;

.field public c:Lcom/daaw/et8;

.field public d:Lcom/daaw/et8;

.field public e:J

.field public final f:Lcom/daaw/nw8;


# direct methods
.method public constructor <init>(Lcom/daaw/nw8;[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ft8;->f:Lcom/daaw/nw8;

    new-instance p1, Lcom/daaw/ik5;

    const/16 p2, 0x20

    invoke-direct {p1, p2}, Lcom/daaw/ik5;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/ft8;->a:Lcom/daaw/ik5;

    new-instance p1, Lcom/daaw/et8;

    const-wide/16 v0, 0x0

    const/high16 p2, 0x10000

    invoke-direct {p1, v0, v1, p2}, Lcom/daaw/et8;-><init>(JI)V

    iput-object p1, p0, Lcom/daaw/ft8;->b:Lcom/daaw/et8;

    iput-object p1, p0, Lcom/daaw/ft8;->c:Lcom/daaw/et8;

    iput-object p1, p0, Lcom/daaw/ft8;->d:Lcom/daaw/et8;

    return-void
.end method

.method public static j(Lcom/daaw/et8;J)Lcom/daaw/et8;
    .locals 3

    :goto_0
    iget-wide v0, p0, Lcom/daaw/et8;->b:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    iget-object p0, p0, Lcom/daaw/et8;->d:Lcom/daaw/et8;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static k(Lcom/daaw/et8;JLjava/nio/ByteBuffer;I)Lcom/daaw/et8;
    .locals 3

    invoke-static {p0, p1, p2}, Lcom/daaw/ft8;->j(Lcom/daaw/et8;J)Lcom/daaw/et8;

    move-result-object p0

    :cond_0
    :goto_0
    if-lez p4, :cond_1

    iget-wide v0, p0, Lcom/daaw/et8;->b:J

    sub-long/2addr v0, p1

    long-to-int v1, v0

    invoke-static {p4, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/et8;->c:Lcom/daaw/gw8;

    iget-object v1, v1, Lcom/daaw/gw8;->a:[B

    invoke-virtual {p0, p1, p2}, Lcom/daaw/et8;->a(J)I

    move-result v2

    invoke-virtual {p3, v1, v2, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr p4, v0

    int-to-long v0, v0

    add-long/2addr p1, v0

    iget-wide v0, p0, Lcom/daaw/et8;->b:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    iget-object p0, p0, Lcom/daaw/et8;->d:Lcom/daaw/et8;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public static l(Lcom/daaw/et8;J[BI)Lcom/daaw/et8;
    .locals 5

    invoke-static {p0, p1, p2}, Lcom/daaw/ft8;->j(Lcom/daaw/et8;J)Lcom/daaw/et8;

    move-result-object p0

    move v0, p4

    :cond_0
    :goto_0
    if-lez v0, :cond_1

    iget-wide v1, p0, Lcom/daaw/et8;->b:J

    sub-long/2addr v1, p1

    long-to-int v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Lcom/daaw/et8;->c:Lcom/daaw/gw8;

    iget-object v2, v2, Lcom/daaw/gw8;->a:[B

    invoke-virtual {p0, p1, p2}, Lcom/daaw/et8;->a(J)I

    move-result v3

    sub-int v4, p4, v0

    invoke-static {v2, v3, p3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v0, v1

    int-to-long v1, v1

    add-long/2addr p1, v1

    iget-wide v1, p0, Lcom/daaw/et8;->b:J

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    iget-object p0, p0, Lcom/daaw/et8;->d:Lcom/daaw/et8;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public static m(Lcom/daaw/et8;Lcom/daaw/ma7;Lcom/daaw/ht8;Lcom/daaw/ik5;)Lcom/daaw/et8;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ma7;->k()Z

    move-result v3

    if-eqz v3, :cond_9

    iget-wide v3, v1, Lcom/daaw/ht8;->b:J

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Lcom/daaw/ik5;->c(I)V

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/ik5;->h()[B

    move-result-object v6

    move-object/from16 v7, p0

    invoke-static {v7, v3, v4, v6, v5}, Lcom/daaw/ft8;->l(Lcom/daaw/et8;J[BI)Lcom/daaw/et8;

    move-result-object v6

    const-wide/16 v7, 0x1

    add-long/2addr v3, v7

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/ik5;->h()[B

    move-result-object v7

    const/4 v8, 0x0

    aget-byte v7, v7, v8

    and-int/lit16 v9, v7, 0x80

    if-eqz v9, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    and-int/lit8 v7, v7, 0x7f

    iget-object v10, v0, Lcom/daaw/ma7;->b:Lcom/daaw/d77;

    iget-object v11, v10, Lcom/daaw/d77;->a:[B

    if-nez v11, :cond_1

    const/16 v11, 0x10

    new-array v11, v11, [B

    iput-object v11, v10, Lcom/daaw/d77;->a:[B

    goto :goto_1

    :cond_1
    invoke-static {v11, v8}, Ljava/util/Arrays;->fill([BB)V

    :goto_1
    iget-object v11, v10, Lcom/daaw/d77;->a:[B

    invoke-static {v6, v3, v4, v11, v7}, Lcom/daaw/ft8;->l(Lcom/daaw/et8;J[BI)Lcom/daaw/et8;

    move-result-object v6

    int-to-long v11, v7

    add-long/2addr v3, v11

    if-eqz v9, :cond_2

    const/4 v5, 0x2

    invoke-virtual {v2, v5}, Lcom/daaw/ik5;->c(I)V

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/ik5;->h()[B

    move-result-object v7

    invoke-static {v6, v3, v4, v7, v5}, Lcom/daaw/ft8;->l(Lcom/daaw/et8;J[BI)Lcom/daaw/et8;

    move-result-object v6

    const-wide/16 v11, 0x2

    add-long/2addr v3, v11

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/ik5;->w()I

    move-result v5

    move v11, v5

    goto :goto_2

    :cond_2
    const/4 v11, 0x1

    :goto_2
    iget-object v5, v10, Lcom/daaw/d77;->d:[I

    if-eqz v5, :cond_3

    array-length v7, v5

    if-ge v7, v11, :cond_4

    :cond_3
    new-array v5, v11, [I

    :cond_4
    move-object v12, v5

    iget-object v5, v10, Lcom/daaw/d77;->e:[I

    if-eqz v5, :cond_5

    array-length v7, v5

    if-ge v7, v11, :cond_6

    :cond_5
    new-array v5, v11, [I

    :cond_6
    move-object v13, v5

    if-eqz v9, :cond_7

    mul-int/lit8 v5, v11, 0x6

    invoke-virtual {v2, v5}, Lcom/daaw/ik5;->c(I)V

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/ik5;->h()[B

    move-result-object v7

    invoke-static {v6, v3, v4, v7, v5}, Lcom/daaw/ft8;->l(Lcom/daaw/et8;J[BI)Lcom/daaw/et8;

    move-result-object v6

    int-to-long v14, v5

    add-long/2addr v3, v14

    invoke-virtual {v2, v8}, Lcom/daaw/ik5;->f(I)V

    :goto_3
    if-ge v8, v11, :cond_8

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/ik5;->w()I

    move-result v5

    aput v5, v12, v8

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/ik5;->v()I

    move-result v5

    aput v5, v13, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_7
    aput v8, v12, v8

    iget v5, v1, Lcom/daaw/ht8;->a:I

    iget-wide v14, v1, Lcom/daaw/ht8;->b:J

    sub-long v14, v3, v14

    long-to-int v7, v14

    sub-int/2addr v5, v7

    aput v5, v13, v8

    :cond_8
    iget-object v5, v1, Lcom/daaw/ht8;->c:Lcom/daaw/l42;

    sget v7, Lcom/daaw/it5;->a:I

    iget-object v14, v5, Lcom/daaw/l42;->b:[B

    iget-object v15, v10, Lcom/daaw/d77;->a:[B

    iget v7, v5, Lcom/daaw/l42;->a:I

    iget v8, v5, Lcom/daaw/l42;->c:I

    iget v5, v5, Lcom/daaw/l42;->d:I

    move/from16 v16, v7

    move/from16 v17, v8

    move/from16 v18, v5

    invoke-virtual/range {v10 .. v18}, Lcom/daaw/d77;->c(I[I[I[B[BIII)V

    iget-wide v7, v1, Lcom/daaw/ht8;->b:J

    sub-long/2addr v3, v7

    long-to-int v4, v3

    int-to-long v9, v4

    add-long/2addr v7, v9

    iput-wide v7, v1, Lcom/daaw/ht8;->b:J

    iget v3, v1, Lcom/daaw/ht8;->a:I

    sub-int/2addr v3, v4

    iput v3, v1, Lcom/daaw/ht8;->a:I

    goto :goto_4

    :cond_9
    move-object/from16 v7, p0

    move-object v6, v7

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/i37;->e()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lcom/daaw/ik5;->c(I)V

    iget-wide v4, v1, Lcom/daaw/ht8;->b:J

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/ik5;->h()[B

    move-result-object v7

    invoke-static {v6, v4, v5, v7, v3}, Lcom/daaw/ft8;->l(Lcom/daaw/et8;J[BI)Lcom/daaw/et8;

    move-result-object v3

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/ik5;->v()I

    move-result v2

    iget-wide v4, v1, Lcom/daaw/ht8;->b:J

    const-wide/16 v6, 0x4

    add-long/2addr v4, v6

    iput-wide v4, v1, Lcom/daaw/ht8;->b:J

    iget v4, v1, Lcom/daaw/ht8;->a:I

    add-int/lit8 v4, v4, -0x4

    iput v4, v1, Lcom/daaw/ht8;->a:I

    invoke-virtual {v0, v2}, Lcom/daaw/ma7;->i(I)V

    iget-wide v4, v1, Lcom/daaw/ht8;->b:J

    iget-object v6, v0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    invoke-static {v3, v4, v5, v6, v2}, Lcom/daaw/ft8;->k(Lcom/daaw/et8;JLjava/nio/ByteBuffer;I)Lcom/daaw/et8;

    move-result-object v3

    iget-wide v4, v1, Lcom/daaw/ht8;->b:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, v1, Lcom/daaw/ht8;->b:J

    iget v4, v1, Lcom/daaw/ht8;->a:I

    sub-int/2addr v4, v2

    iput v4, v1, Lcom/daaw/ht8;->a:I

    iget-object v2, v0, Lcom/daaw/ma7;->f:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v2

    if-ge v2, v4, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, v0, Lcom/daaw/ma7;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_6

    :cond_b
    :goto_5
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Lcom/daaw/ma7;->f:Ljava/nio/ByteBuffer;

    :goto_6
    iget-wide v4, v1, Lcom/daaw/ht8;->b:J

    iget-object v0, v0, Lcom/daaw/ma7;->f:Ljava/nio/ByteBuffer;

    iget v1, v1, Lcom/daaw/ht8;->a:I

    invoke-static {v3, v4, v5, v0, v1}, Lcom/daaw/ft8;->k(Lcom/daaw/et8;JLjava/nio/ByteBuffer;I)Lcom/daaw/et8;

    move-result-object v0

    goto :goto_7

    :cond_c
    iget v2, v1, Lcom/daaw/ht8;->a:I

    invoke-virtual {v0, v2}, Lcom/daaw/ma7;->i(I)V

    iget-wide v2, v1, Lcom/daaw/ht8;->b:J

    iget-object v0, v0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    iget v1, v1, Lcom/daaw/ht8;->a:I

    invoke-static {v6, v2, v3, v0, v1}, Lcom/daaw/ft8;->k(Lcom/daaw/et8;JLjava/nio/ByteBuffer;I)Lcom/daaw/et8;

    move-result-object v0

    :goto_7
    return-object v0
.end method


# virtual methods
.method public final a(Lcom/daaw/xp8;IZ)I
    .locals 4

    invoke-virtual {p0, p2}, Lcom/daaw/ft8;->i(I)I

    move-result p2

    iget-object v0, p0, Lcom/daaw/ft8;->d:Lcom/daaw/et8;

    iget-object v1, v0, Lcom/daaw/et8;->c:Lcom/daaw/gw8;

    iget-object v1, v1, Lcom/daaw/gw8;->a:[B

    iget-wide v2, p0, Lcom/daaw/ft8;->e:J

    invoke-virtual {v0, v2, v3}, Lcom/daaw/et8;->a(J)I

    move-result v0

    invoke-interface {p1, v1, v0, p2}, Lcom/daaw/xp8;->a([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/ft8;->n(I)V

    return p1
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ft8;->e:J

    return-wide v0
.end method

.method public final c(J)V
    .locals 4

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-eqz v2, :cond_1

    :goto_0
    iget-object v0, p0, Lcom/daaw/ft8;->b:Lcom/daaw/et8;

    iget-wide v1, v0, Lcom/daaw/et8;->b:J

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    iget-object v1, p0, Lcom/daaw/ft8;->f:Lcom/daaw/nw8;

    iget-object v0, v0, Lcom/daaw/et8;->c:Lcom/daaw/gw8;

    invoke-virtual {v1, v0}, Lcom/daaw/nw8;->c(Lcom/daaw/gw8;)V

    iget-object v0, p0, Lcom/daaw/ft8;->b:Lcom/daaw/et8;

    invoke-virtual {v0}, Lcom/daaw/et8;->b()Lcom/daaw/et8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ft8;->b:Lcom/daaw/et8;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/ft8;->c:Lcom/daaw/et8;

    iget-wide p1, p1, Lcom/daaw/et8;->a:J

    iget-wide v1, v0, Lcom/daaw/et8;->a:J

    cmp-long v3, p1, v1

    if-gez v3, :cond_1

    iput-object v0, p0, Lcom/daaw/ft8;->c:Lcom/daaw/et8;

    :cond_1
    return-void
.end method

.method public final d(Lcom/daaw/ma7;Lcom/daaw/ht8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ft8;->c:Lcom/daaw/et8;

    iget-object v1, p0, Lcom/daaw/ft8;->a:Lcom/daaw/ik5;

    invoke-static {v0, p1, p2, v1}, Lcom/daaw/ft8;->m(Lcom/daaw/et8;Lcom/daaw/ma7;Lcom/daaw/ht8;Lcom/daaw/ik5;)Lcom/daaw/et8;

    return-void
.end method

.method public final e(Lcom/daaw/ma7;Lcom/daaw/ht8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ft8;->c:Lcom/daaw/et8;

    iget-object v1, p0, Lcom/daaw/ft8;->a:Lcom/daaw/ik5;

    invoke-static {v0, p1, p2, v1}, Lcom/daaw/ft8;->m(Lcom/daaw/et8;Lcom/daaw/ma7;Lcom/daaw/ht8;Lcom/daaw/ik5;)Lcom/daaw/et8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ft8;->c:Lcom/daaw/et8;

    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ft8;->b:Lcom/daaw/et8;

    iget-object v1, v0, Lcom/daaw/et8;->c:Lcom/daaw/gw8;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/ft8;->f:Lcom/daaw/nw8;

    invoke-virtual {v1, v0}, Lcom/daaw/nw8;->d(Lcom/daaw/hw8;)V

    invoke-virtual {v0}, Lcom/daaw/et8;->b()Lcom/daaw/et8;

    :cond_0
    iget-object v0, p0, Lcom/daaw/ft8;->b:Lcom/daaw/et8;

    const/high16 v1, 0x10000

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lcom/daaw/et8;->c(JI)V

    iget-object v0, p0, Lcom/daaw/ft8;->b:Lcom/daaw/et8;

    iput-object v0, p0, Lcom/daaw/ft8;->c:Lcom/daaw/et8;

    iput-object v0, p0, Lcom/daaw/ft8;->d:Lcom/daaw/et8;

    iput-wide v2, p0, Lcom/daaw/ft8;->e:J

    iget-object v0, p0, Lcom/daaw/ft8;->f:Lcom/daaw/nw8;

    invoke-virtual {v0}, Lcom/daaw/nw8;->g()V

    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ft8;->b:Lcom/daaw/et8;

    iput-object v0, p0, Lcom/daaw/ft8;->c:Lcom/daaw/et8;

    return-void
.end method

.method public final h(Lcom/daaw/ik5;I)V
    .locals 5

    :goto_0
    if-lez p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/daaw/ft8;->i(I)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/ft8;->d:Lcom/daaw/et8;

    iget-object v2, v1, Lcom/daaw/et8;->c:Lcom/daaw/gw8;

    iget-object v2, v2, Lcom/daaw/gw8;->a:[B

    iget-wide v3, p0, Lcom/daaw/ft8;->e:J

    invoke-virtual {v1, v3, v4}, Lcom/daaw/et8;->a(J)I

    move-result v1

    invoke-virtual {p1, v2, v1, v0}, Lcom/daaw/ik5;->b([BII)V

    sub-int/2addr p2, v0

    invoke-virtual {p0, v0}, Lcom/daaw/ft8;->n(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final i(I)I
    .locals 6

    iget-object v0, p0, Lcom/daaw/ft8;->d:Lcom/daaw/et8;

    iget-object v1, v0, Lcom/daaw/et8;->c:Lcom/daaw/gw8;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/ft8;->f:Lcom/daaw/nw8;

    invoke-virtual {v1}, Lcom/daaw/nw8;->b()Lcom/daaw/gw8;

    move-result-object v1

    new-instance v2, Lcom/daaw/et8;

    iget-object v3, p0, Lcom/daaw/ft8;->d:Lcom/daaw/et8;

    iget-wide v3, v3, Lcom/daaw/et8;->b:J

    const/high16 v5, 0x10000

    invoke-direct {v2, v3, v4, v5}, Lcom/daaw/et8;-><init>(JI)V

    iput-object v1, v0, Lcom/daaw/et8;->c:Lcom/daaw/gw8;

    iput-object v2, v0, Lcom/daaw/et8;->d:Lcom/daaw/et8;

    :cond_0
    iget-object v0, p0, Lcom/daaw/ft8;->d:Lcom/daaw/et8;

    iget-wide v0, v0, Lcom/daaw/et8;->b:J

    iget-wide v2, p0, Lcom/daaw/ft8;->e:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public final n(I)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/ft8;->e:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/ft8;->e:J

    iget-object p1, p0, Lcom/daaw/ft8;->d:Lcom/daaw/et8;

    iget-wide v2, p1, Lcom/daaw/et8;->b:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object p1, p1, Lcom/daaw/et8;->d:Lcom/daaw/et8;

    iput-object p1, p0, Lcom/daaw/ft8;->d:Lcom/daaw/et8;

    :cond_0
    return-void
.end method
