.class public final Lcom/daaw/b81;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sm1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/b81$a;,
        Lcom/daaw/b81$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/l2;

.field public final b:I

.field public final c:Lcom/daaw/a81;

.field public final d:Lcom/daaw/a81$a;

.field public final e:Lcom/daaw/rv0;

.field public f:Lcom/daaw/b81$a;

.field public g:Lcom/daaw/b81$a;

.field public h:Lcom/daaw/b81$a;

.field public i:Lcom/google/android/exoplayer2/Format;

.field public j:Z

.field public k:Lcom/google/android/exoplayer2/Format;

.field public l:J

.field public m:J

.field public n:Z

.field public o:Lcom/daaw/b81$b;


# direct methods
.method public constructor <init>(Lcom/daaw/l2;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b81;->a:Lcom/daaw/l2;

    invoke-interface {p1}, Lcom/daaw/l2;->e()I

    move-result p1

    iput p1, p0, Lcom/daaw/b81;->b:I

    new-instance v0, Lcom/daaw/a81;

    invoke-direct {v0}, Lcom/daaw/a81;-><init>()V

    iput-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    new-instance v0, Lcom/daaw/a81$a;

    invoke-direct {v0}, Lcom/daaw/a81$a;-><init>()V

    iput-object v0, p0, Lcom/daaw/b81;->d:Lcom/daaw/a81$a;

    new-instance v0, Lcom/daaw/rv0;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    new-instance v0, Lcom/daaw/b81$a;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/daaw/b81$a;-><init>(JI)V

    iput-object v0, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    iput-object v0, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iput-object v0, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    return-void
.end method

.method public static n(Lcom/google/android/exoplayer2/Format;J)Lcom/google/android/exoplayer2/Format;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_1

    iget-wide v0, p0, Lcom/google/android/exoplayer2/Format;->L:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    add-long/2addr v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/exoplayer2/Format;->l(J)Lcom/google/android/exoplayer2/Format;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final A(J[BI)V
    .locals 5

    invoke-virtual {p0, p1, p2}, Lcom/daaw/b81;->e(J)V

    move v0, p4

    :cond_0
    :goto_0
    if-lez v0, :cond_1

    iget-object v1, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iget-wide v1, v1, Lcom/daaw/b81$a;->b:J

    sub-long/2addr v1, p1

    long-to-int v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iget-object v3, v2, Lcom/daaw/b81$a;->d:Lcom/daaw/k2;

    iget-object v3, v3, Lcom/daaw/k2;->a:[B

    invoke-virtual {v2, p1, p2}, Lcom/daaw/b81$a;->c(J)I

    move-result v2

    sub-int v4, p4, v0

    invoke-static {v3, v2, p3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v0, v1

    int-to-long v1, v1

    add-long/2addr p1, v1

    iget-object v1, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iget-wide v2, v1, Lcom/daaw/b81$a;->b:J

    cmp-long v4, p1, v2

    if-nez v4, :cond_0

    iget-object v1, v1, Lcom/daaw/b81$a;->e:Lcom/daaw/b81$a;

    iput-object v1, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final B(Lcom/daaw/gq;Lcom/daaw/a81$a;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-wide v3, v2, Lcom/daaw/a81$a;->b:J

    iget-object v5, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lcom/daaw/rv0;->G(I)V

    iget-object v5, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    iget-object v5, v5, Lcom/daaw/rv0;->a:[B

    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/daaw/b81;->A(J[BI)V

    const-wide/16 v7, 0x1

    add-long/2addr v3, v7

    iget-object v5, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    iget-object v5, v5, Lcom/daaw/rv0;->a:[B

    const/4 v7, 0x0

    aget-byte v5, v5, v7

    and-int/lit16 v8, v5, 0x80

    if-eqz v8, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    and-int/lit8 v5, v5, 0x7f

    iget-object v9, v1, Lcom/daaw/gq;->q:Lcom/daaw/jn;

    iget-object v10, v9, Lcom/daaw/jn;->a:[B

    if-nez v10, :cond_1

    const/16 v10, 0x10

    new-array v10, v10, [B

    iput-object v10, v9, Lcom/daaw/jn;->a:[B

    :cond_1
    iget-object v9, v9, Lcom/daaw/jn;->a:[B

    invoke-virtual {v0, v3, v4, v9, v5}, Lcom/daaw/b81;->A(J[BI)V

    int-to-long v9, v5

    add-long/2addr v3, v9

    if-eqz v8, :cond_2

    iget-object v5, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Lcom/daaw/rv0;->G(I)V

    iget-object v5, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    iget-object v5, v5, Lcom/daaw/rv0;->a:[B

    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/daaw/b81;->A(J[BI)V

    const-wide/16 v5, 0x2

    add-long/2addr v3, v5

    iget-object v5, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    invoke-virtual {v5}, Lcom/daaw/rv0;->D()I

    move-result v6

    move v10, v6

    goto :goto_1

    :cond_2
    const/4 v10, 0x1

    :goto_1
    iget-object v5, v1, Lcom/daaw/gq;->q:Lcom/daaw/jn;

    iget-object v6, v5, Lcom/daaw/jn;->d:[I

    if-eqz v6, :cond_3

    array-length v9, v6

    if-ge v9, v10, :cond_4

    :cond_3
    new-array v6, v10, [I

    :cond_4
    move-object v11, v6

    iget-object v5, v5, Lcom/daaw/jn;->e:[I

    if-eqz v5, :cond_5

    array-length v6, v5

    if-ge v6, v10, :cond_6

    :cond_5
    new-array v5, v10, [I

    :cond_6
    move-object v12, v5

    if-eqz v8, :cond_7

    mul-int/lit8 v5, v10, 0x6

    iget-object v6, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    invoke-virtual {v6, v5}, Lcom/daaw/rv0;->G(I)V

    iget-object v6, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    iget-object v6, v6, Lcom/daaw/rv0;->a:[B

    invoke-virtual {v0, v3, v4, v6, v5}, Lcom/daaw/b81;->A(J[BI)V

    int-to-long v5, v5

    add-long/2addr v3, v5

    iget-object v5, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    invoke-virtual {v5, v7}, Lcom/daaw/rv0;->J(I)V

    :goto_2
    if-ge v7, v10, :cond_8

    iget-object v5, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    invoke-virtual {v5}, Lcom/daaw/rv0;->D()I

    move-result v5

    aput v5, v11, v7

    iget-object v5, v0, Lcom/daaw/b81;->e:Lcom/daaw/rv0;

    invoke-virtual {v5}, Lcom/daaw/rv0;->B()I

    move-result v5

    aput v5, v12, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    aput v7, v11, v7

    iget v5, v2, Lcom/daaw/a81$a;->a:I

    iget-wide v8, v2, Lcom/daaw/a81$a;->b:J

    sub-long v8, v3, v8

    long-to-int v6, v8

    sub-int/2addr v5, v6

    aput v5, v12, v7

    :cond_8
    iget-object v5, v2, Lcom/daaw/a81$a;->c:Lcom/daaw/sm1$a;

    iget-object v9, v1, Lcom/daaw/gq;->q:Lcom/daaw/jn;

    iget-object v13, v5, Lcom/daaw/sm1$a;->b:[B

    iget-object v14, v9, Lcom/daaw/jn;->a:[B

    iget v15, v5, Lcom/daaw/sm1$a;->a:I

    iget v1, v5, Lcom/daaw/sm1$a;->c:I

    iget v5, v5, Lcom/daaw/sm1$a;->d:I

    move/from16 v16, v1

    move/from16 v17, v5

    invoke-virtual/range {v9 .. v17}, Lcom/daaw/jn;->c(I[I[I[B[BIII)V

    iget-wide v5, v2, Lcom/daaw/a81$a;->b:J

    sub-long/2addr v3, v5

    long-to-int v1, v3

    int-to-long v3, v1

    add-long/2addr v5, v3

    iput-wide v5, v2, Lcom/daaw/a81$a;->b:J

    iget v3, v2, Lcom/daaw/a81$a;->a:I

    sub-int/2addr v3, v1

    iput v3, v2, Lcom/daaw/a81$a;->a:I

    return-void
.end method

.method public C()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/b81;->D(Z)V

    return-void
.end method

.method public D(Z)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0, p1}, Lcom/daaw/a81;->x(Z)V

    iget-object p1, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    invoke-virtual {p0, p1}, Lcom/daaw/b81;->h(Lcom/daaw/b81$a;)V

    new-instance p1, Lcom/daaw/b81$a;

    iget v0, p0, Lcom/daaw/b81;->b:I

    const-wide/16 v1, 0x0

    invoke-direct {p1, v1, v2, v0}, Lcom/daaw/b81$a;-><init>(JI)V

    iput-object p1, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    iput-object p1, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iput-object p1, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    iput-wide v1, p0, Lcom/daaw/b81;->m:J

    iget-object p1, p0, Lcom/daaw/b81;->a:Lcom/daaw/l2;

    invoke-interface {p1}, Lcom/daaw/l2;->b()V

    return-void
.end method

.method public E()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->y()V

    iget-object v0, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    iput-object v0, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    return-void
.end method

.method public F(I)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0, p1}, Lcom/daaw/a81;->z(I)Z

    move-result p1

    return p1
.end method

.method public G(J)V
    .locals 3

    iget-wide v0, p0, Lcom/daaw/b81;->l:J

    cmp-long v2, v0, p1

    if-eqz v2, :cond_0

    iput-wide p1, p0, Lcom/daaw/b81;->l:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/b81;->j:Z

    :cond_0
    return-void
.end method

.method public H(Lcom/daaw/b81$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/b81;->o:Lcom/daaw/b81$b;

    return-void
.end method

.method public I(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0, p1}, Lcom/daaw/a81;->A(I)V

    return-void
.end method

.method public J()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/b81;->n:Z

    return-void
.end method

.method public a(JIIILcom/daaw/sm1$a;)V
    .locals 12

    move-object v0, p0

    move-wide v1, p1

    iget-boolean v3, v0, Lcom/daaw/b81;->j:Z

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/daaw/b81;->k:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p0, v3}, Lcom/daaw/b81;->d(Lcom/google/android/exoplayer2/Format;)V

    :cond_0
    iget-boolean v3, v0, Lcom/daaw/b81;->n:Z

    if-eqz v3, :cond_3

    and-int/lit8 v3, p3, 0x1

    if-eqz v3, :cond_2

    iget-object v3, v0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v3, p1, p2}, Lcom/daaw/a81;->c(J)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    iput-boolean v3, v0, Lcom/daaw/b81;->n:Z

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :cond_3
    :goto_1
    iget-wide v3, v0, Lcom/daaw/b81;->l:J

    add-long v5, v1, v3

    iget-wide v1, v0, Lcom/daaw/b81;->m:J

    move/from16 v3, p4

    int-to-long v7, v3

    sub-long/2addr v1, v7

    move/from16 v4, p5

    int-to-long v7, v4

    sub-long/2addr v1, v7

    iget-object v4, v0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    move v7, p3

    move-wide v8, v1

    move/from16 v10, p4

    move-object/from16 v11, p6

    invoke-virtual/range {v4 .. v11}, Lcom/daaw/a81;->d(JIJILcom/daaw/sm1$a;)V

    return-void
.end method

.method public b(Lcom/daaw/a00;IZ)I
    .locals 4

    invoke-virtual {p0, p2}, Lcom/daaw/b81;->x(I)I

    move-result p2

    iget-object v0, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    iget-object v1, v0, Lcom/daaw/b81$a;->d:Lcom/daaw/k2;

    iget-object v1, v1, Lcom/daaw/k2;->a:[B

    iget-wide v2, p0, Lcom/daaw/b81;->m:J

    invoke-virtual {v0, v2, v3}, Lcom/daaw/b81$a;->c(J)I

    move-result v0

    invoke-interface {p1, v1, v0, p2}, Lcom/daaw/a00;->b([BII)I

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
    invoke-virtual {p0, p1}, Lcom/daaw/b81;->w(I)V

    return p1
.end method

.method public c(Lcom/daaw/rv0;I)V
    .locals 5

    :goto_0
    if-lez p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/daaw/b81;->x(I)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    iget-object v2, v1, Lcom/daaw/b81$a;->d:Lcom/daaw/k2;

    iget-object v2, v2, Lcom/daaw/k2;->a:[B

    iget-wide v3, p0, Lcom/daaw/b81;->m:J

    invoke-virtual {v1, v3, v4}, Lcom/daaw/b81$a;->c(J)I

    move-result v1

    invoke-virtual {p1, v2, v1, v0}, Lcom/daaw/rv0;->g([BII)V

    sub-int/2addr p2, v0

    invoke-virtual {p0, v0}, Lcom/daaw/b81;->w(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(Lcom/google/android/exoplayer2/Format;)V
    .locals 2

    iget-wide v0, p0, Lcom/daaw/b81;->l:J

    invoke-static {p1, v0, v1}, Lcom/daaw/b81;->n(Lcom/google/android/exoplayer2/Format;J)Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v1, v0}, Lcom/daaw/a81;->l(Lcom/google/android/exoplayer2/Format;)Z

    move-result v1

    iput-object p1, p0, Lcom/daaw/b81;->k:Lcom/google/android/exoplayer2/Format;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/b81;->j:Z

    iget-object p1, p0, Lcom/daaw/b81;->o:Lcom/daaw/b81$b;

    if-eqz p1, :cond_0

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lcom/daaw/b81$b;->j(Lcom/google/android/exoplayer2/Format;)V

    :cond_0
    return-void
.end method

.method public final e(J)V
    .locals 4

    :goto_0
    iget-object v0, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iget-wide v1, v0, Lcom/daaw/b81$a;->b:J

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    iget-object v0, v0, Lcom/daaw/b81$a;->e:Lcom/daaw/b81$a;

    iput-object v0, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f(JZZ)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/a81;->a(JZZ)I

    move-result p1

    return p1
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->b()I

    move-result v0

    return v0
.end method

.method public final h(Lcom/daaw/b81$a;)V
    .locals 6

    iget-boolean v0, p1, Lcom/daaw/b81$a;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    iget-boolean v1, v0, Lcom/daaw/b81$a;->c:Z

    iget-wide v2, v0, Lcom/daaw/b81$a;->a:J

    iget-wide v4, p1, Lcom/daaw/b81$a;->a:J

    sub-long/2addr v2, v4

    long-to-int v0, v2

    iget v2, p0, Lcom/daaw/b81;->b:I

    div-int/2addr v0, v2

    add-int/2addr v1, v0

    new-array v0, v1, [Lcom/daaw/k2;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p1, Lcom/daaw/b81$a;->d:Lcom/daaw/k2;

    aput-object v3, v0, v2

    invoke-virtual {p1}, Lcom/daaw/b81$a;->a()Lcom/daaw/b81$a;

    move-result-object p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/b81;->a:Lcom/daaw/l2;

    invoke-interface {p1, v0}, Lcom/daaw/l2;->d([Lcom/daaw/k2;)V

    return-void
.end method

.method public final i(J)V
    .locals 4

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    iget-wide v1, v0, Lcom/daaw/b81$a;->b:J

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    iget-object v1, p0, Lcom/daaw/b81;->a:Lcom/daaw/l2;

    iget-object v0, v0, Lcom/daaw/b81$a;->d:Lcom/daaw/k2;

    invoke-interface {v1, v0}, Lcom/daaw/l2;->c(Lcom/daaw/k2;)V

    iget-object v0, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    invoke-virtual {v0}, Lcom/daaw/b81$a;->a()Lcom/daaw/b81$a;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iget-wide p1, p1, Lcom/daaw/b81$a;->a:J

    iget-wide v1, v0, Lcom/daaw/b81$a;->a:J

    cmp-long v3, p1, v1

    if-gez v3, :cond_2

    iput-object v0, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    :cond_2
    return-void
.end method

.method public j(JZZ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/a81;->g(JZZ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/b81;->i(J)V

    return-void
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->h()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/b81;->i(J)V

    return-void
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->i()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/b81;->i(J)V

    return-void
.end method

.method public m(I)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0, p1}, Lcom/daaw/a81;->j(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/b81;->m:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    iget-wide v2, p1, Lcom/daaw/b81$a;->a:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    iget-wide v0, p0, Lcom/daaw/b81;->m:J

    iget-wide v2, p1, Lcom/daaw/b81$a;->b:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    iget-object p1, p1, Lcom/daaw/b81$a;->e:Lcom/daaw/b81$a;

    goto :goto_0

    :cond_1
    iget-object v0, p1, Lcom/daaw/b81$a;->e:Lcom/daaw/b81$a;

    invoke-virtual {p0, v0}, Lcom/daaw/b81;->h(Lcom/daaw/b81$a;)V

    new-instance v1, Lcom/daaw/b81$a;

    iget-wide v2, p1, Lcom/daaw/b81$a;->b:J

    iget v4, p0, Lcom/daaw/b81;->b:I

    invoke-direct {v1, v2, v3, v4}, Lcom/daaw/b81$a;-><init>(JI)V

    iput-object v1, p1, Lcom/daaw/b81$a;->e:Lcom/daaw/b81$a;

    iget-wide v2, p0, Lcom/daaw/b81;->m:J

    iget-wide v4, p1, Lcom/daaw/b81$a;->b:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    move-object p1, v1

    :cond_2
    iput-object p1, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    iget-object p1, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    if-ne p1, v0, :cond_4

    iput-object v1, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    goto :goto_2

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    invoke-virtual {p0, p1}, Lcom/daaw/b81;->h(Lcom/daaw/b81$a;)V

    new-instance p1, Lcom/daaw/b81$a;

    iget-wide v0, p0, Lcom/daaw/b81;->m:J

    iget v2, p0, Lcom/daaw/b81;->b:I

    invoke-direct {p1, v0, v1, v2}, Lcom/daaw/b81$a;-><init>(JI)V

    iput-object p1, p0, Lcom/daaw/b81;->f:Lcom/daaw/b81$a;

    iput-object p1, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iput-object p1, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    :cond_4
    :goto_2
    return-void
.end method

.method public o()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->m()I

    move-result v0

    return v0
.end method

.method public p()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public q()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->o()J

    move-result-wide v0

    return-wide v0
.end method

.method public r()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->q()I

    move-result v0

    return v0
.end method

.method public s()Lcom/google/android/exoplayer2/Format;
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->s()Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    return-object v0
.end method

.method public t()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->t()I

    move-result v0

    return v0
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->u()Z

    move-result v0

    return v0
.end method

.method public v()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    invoke-virtual {v0}, Lcom/daaw/a81;->v()I

    move-result v0

    return v0
.end method

.method public final w(I)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/b81;->m:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/b81;->m:J

    iget-object p1, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    iget-wide v2, p1, Lcom/daaw/b81$a;->b:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object p1, p1, Lcom/daaw/b81$a;->e:Lcom/daaw/b81$a;

    iput-object p1, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    :cond_0
    return-void
.end method

.method public final x(I)I
    .locals 6

    iget-object v0, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    iget-boolean v1, v0, Lcom/daaw/b81$a;->c:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/b81;->a:Lcom/daaw/l2;

    invoke-interface {v1}, Lcom/daaw/l2;->a()Lcom/daaw/k2;

    move-result-object v1

    new-instance v2, Lcom/daaw/b81$a;

    iget-object v3, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    iget-wide v3, v3, Lcom/daaw/b81$a;->b:J

    iget v5, p0, Lcom/daaw/b81;->b:I

    invoke-direct {v2, v3, v4, v5}, Lcom/daaw/b81$a;-><init>(JI)V

    invoke-virtual {v0, v1, v2}, Lcom/daaw/b81$a;->b(Lcom/daaw/k2;Lcom/daaw/b81$a;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/b81;->h:Lcom/daaw/b81$a;

    iget-wide v0, v0, Lcom/daaw/b81$a;->b:J

    iget-wide v2, p0, Lcom/daaw/b81;->m:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public y(Lcom/daaw/k30;Lcom/daaw/gq;ZZJ)I
    .locals 7

    iget-object v0, p0, Lcom/daaw/b81;->c:Lcom/daaw/a81;

    iget-object v5, p0, Lcom/daaw/b81;->i:Lcom/google/android/exoplayer2/Format;

    iget-object v6, p0, Lcom/daaw/b81;->d:Lcom/daaw/a81$a;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/a81;->w(Lcom/daaw/k30;Lcom/daaw/gq;ZZLcom/google/android/exoplayer2/Format;Lcom/daaw/a81$a;)I

    move-result p3

    const/4 p4, -0x5

    if-eq p3, p4, :cond_5

    const/4 p1, -0x4

    if-eq p3, p1, :cond_1

    const/4 p1, -0x3

    if-ne p3, p1, :cond_0

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p2}, Lcom/daaw/rc;->j()Z

    move-result p3

    if-nez p3, :cond_4

    iget-wide p3, p2, Lcom/daaw/gq;->s:J

    cmp-long v0, p3, p5

    if-gez v0, :cond_2

    const/high16 p3, -0x80000000

    invoke-virtual {p2, p3}, Lcom/daaw/rc;->e(I)V

    :cond_2
    invoke-virtual {p2}, Lcom/daaw/gq;->p()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/daaw/b81;->d:Lcom/daaw/a81$a;

    invoke-virtual {p0, p2, p3}, Lcom/daaw/b81;->B(Lcom/daaw/gq;Lcom/daaw/a81$a;)V

    :cond_3
    iget-object p3, p0, Lcom/daaw/b81;->d:Lcom/daaw/a81$a;

    iget p3, p3, Lcom/daaw/a81$a;->a:I

    invoke-virtual {p2, p3}, Lcom/daaw/gq;->n(I)V

    iget-object p3, p0, Lcom/daaw/b81;->d:Lcom/daaw/a81$a;

    iget-wide p4, p3, Lcom/daaw/a81$a;->b:J

    iget-object p2, p2, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    iget p3, p3, Lcom/daaw/a81$a;->a:I

    invoke-virtual {p0, p4, p5, p2, p3}, Lcom/daaw/b81;->z(JLjava/nio/ByteBuffer;I)V

    :cond_4
    return p1

    :cond_5
    iget-object p1, p1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    iput-object p1, p0, Lcom/daaw/b81;->i:Lcom/google/android/exoplayer2/Format;

    return p4
.end method

.method public final z(JLjava/nio/ByteBuffer;I)V
    .locals 4

    invoke-virtual {p0, p1, p2}, Lcom/daaw/b81;->e(J)V

    :cond_0
    :goto_0
    if-lez p4, :cond_1

    iget-object v0, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iget-wide v0, v0, Lcom/daaw/b81$a;->b:J

    sub-long/2addr v0, p1

    long-to-int v1, v0

    invoke-static {p4, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iget-object v2, v1, Lcom/daaw/b81$a;->d:Lcom/daaw/k2;

    iget-object v2, v2, Lcom/daaw/k2;->a:[B

    invoke-virtual {v1, p1, p2}, Lcom/daaw/b81$a;->c(J)I

    move-result v1

    invoke-virtual {p3, v2, v1, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr p4, v0

    int-to-long v0, v0

    add-long/2addr p1, v0

    iget-object v0, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    iget-wide v1, v0, Lcom/daaw/b81$a;->b:J

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    iget-object v0, v0, Lcom/daaw/b81$a;->e:Lcom/daaw/b81$a;

    iput-object v0, p0, Lcom/daaw/b81;->g:Lcom/daaw/b81$a;

    goto :goto_0

    :cond_1
    return-void
.end method
