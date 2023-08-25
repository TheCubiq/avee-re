.class public final Lcom/daaw/zs2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field public final b:Ljava/util/Stack;

.field public final c:Lcom/daaw/kt2;

.field public d:I

.field public e:I

.field public f:J

.field public g:Lcom/daaw/ct2;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/zs2;->a:[B

    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/daaw/zs2;->b:Ljava/util/Stack;

    new-instance v0, Lcom/daaw/kt2;

    invoke-direct {v0}, Lcom/daaw/kt2;-><init>()V

    iput-object v0, p0, Lcom/daaw/zs2;->c:Lcom/daaw/kt2;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/zs2;->d:I

    iget-object v0, p0, Lcom/daaw/zs2;->b:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->clear()V

    iget-object v0, p0, Lcom/daaw/zs2;->c:Lcom/daaw/kt2;

    invoke-virtual {v0}, Lcom/daaw/kt2;->d()V

    return-void
.end method

.method public final b(Lcom/daaw/ct2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zs2;->g:Lcom/daaw/ct2;

    return-void
.end method

.method public final c(Lcom/daaw/ms2;)Z
    .locals 12

    iget-object v0, p0, Lcom/daaw/zs2;->g:Lcom/daaw/ct2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/az2;->e(Z)V

    :goto_1
    iget-object v0, p0, Lcom/daaw/zs2;->b:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/daaw/ms2;->d()J

    move-result-wide v3

    iget-object v0, p0, Lcom/daaw/zs2;->b:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ys2;

    invoke-static {v0}, Lcom/daaw/ys2;->b(Lcom/daaw/ys2;)J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-gez v0, :cond_1

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lcom/daaw/zs2;->g:Lcom/daaw/ct2;

    iget-object v0, p0, Lcom/daaw/zs2;->b:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ys2;

    invoke-static {v0}, Lcom/daaw/ys2;->a(Lcom/daaw/ys2;)I

    move-result v0

    iget-object p1, p1, Lcom/daaw/ct2;->a:Lcom/daaw/ft2;

    invoke-virtual {p1, v0}, Lcom/daaw/ft2;->f(I)V

    return v1

    :cond_2
    :goto_2
    iget v0, p0, Lcom/daaw/zs2;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/daaw/zs2;->c:Lcom/daaw/kt2;

    invoke-virtual {v0, p1, v1, v2, v4}, Lcom/daaw/kt2;->e(Lcom/daaw/ms2;ZZI)J

    move-result-wide v5

    const-wide/16 v7, -0x2

    cmp-long v0, v5, v7

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/daaw/ms2;->e()V

    :goto_3
    iget-object v0, p0, Lcom/daaw/zs2;->a:[B

    invoke-virtual {p1, v0, v2, v4, v2}, Lcom/daaw/ms2;->g([BIIZ)Z

    iget-object v0, p0, Lcom/daaw/zs2;->a:[B

    aget-byte v0, v0, v2

    invoke-static {v0}, Lcom/daaw/kt2;->b(I)I

    move-result v0

    const/4 v5, -0x1

    if-eq v0, v5, :cond_3

    if-gt v0, v4, :cond_3

    iget-object v5, p0, Lcom/daaw/zs2;->a:[B

    invoke-static {v5, v0, v2}, Lcom/daaw/kt2;->c([BIZ)J

    move-result-wide v5

    long-to-int v6, v5

    iget-object v5, p0, Lcom/daaw/zs2;->g:Lcom/daaw/ct2;

    iget-object v5, v5, Lcom/daaw/ct2;->a:Lcom/daaw/ft2;

    invoke-static {v6}, Lcom/daaw/ft2;->m(I)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1, v0, v2}, Lcom/daaw/ms2;->i(IZ)Z

    int-to-long v5, v6

    goto :goto_4

    :cond_3
    invoke-virtual {p1, v1, v2}, Lcom/daaw/ms2;->i(IZ)Z

    goto :goto_3

    :cond_4
    :goto_4
    const-wide/16 v7, -0x1

    cmp-long v0, v5, v7

    if-nez v0, :cond_5

    return v2

    :cond_5
    long-to-int v0, v5

    iput v0, p0, Lcom/daaw/zs2;->e:I

    iput v1, p0, Lcom/daaw/zs2;->d:I

    goto :goto_5

    :cond_6
    if-ne v0, v1, :cond_7

    :goto_5
    iget-object v0, p0, Lcom/daaw/zs2;->c:Lcom/daaw/kt2;

    const/16 v5, 0x8

    invoke-virtual {v0, p1, v2, v1, v5}, Lcom/daaw/kt2;->e(Lcom/daaw/ms2;ZZI)J

    move-result-wide v5

    iput-wide v5, p0, Lcom/daaw/zs2;->f:J

    iput v3, p0, Lcom/daaw/zs2;->d:I

    :cond_7
    iget-object v0, p0, Lcom/daaw/zs2;->g:Lcom/daaw/ct2;

    iget v5, p0, Lcom/daaw/zs2;->e:I

    iget-object v6, v0, Lcom/daaw/ct2;->a:Lcom/daaw/ft2;

    invoke-static {v5}, Lcom/daaw/ft2;->l(I)I

    move-result v7

    if-eqz v7, :cond_12

    if-eq v7, v1, :cond_11

    const-wide/16 v8, 0x8

    if-eq v7, v3, :cond_f

    const/4 v3, 0x3

    if-eq v7, v3, :cond_c

    if-eq v7, v4, :cond_b

    iget-wide v6, p0, Lcom/daaw/zs2;->f:J

    const-wide/16 v10, 0x4

    cmp-long v3, v6, v10

    if-eqz v3, :cond_9

    cmp-long v3, v6, v8

    if-nez v3, :cond_8

    goto :goto_6

    :cond_8
    new-instance p1, Lcom/daaw/eq2;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid float size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_6
    long-to-int v3, v6

    invoke-virtual {p0, p1, v3}, Lcom/daaw/zs2;->d(Lcom/daaw/ms2;I)J

    move-result-wide v6

    if-ne v3, v4, :cond_a

    long-to-int p1, v6

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    float-to-double v3, p1

    goto :goto_7

    :cond_a
    invoke-static {v6, v7}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    :goto_7
    iget-object p1, v0, Lcom/daaw/ct2;->a:Lcom/daaw/ft2;

    invoke-virtual {p1, v5, v3, v4}, Lcom/daaw/ft2;->g(ID)V

    iput v2, p0, Lcom/daaw/zs2;->d:I

    return v1

    :cond_b
    iget-wide v3, p0, Lcom/daaw/zs2;->f:J

    long-to-int v0, v3

    invoke-virtual {v6, v5, v0, p1}, Lcom/daaw/ft2;->k(IILcom/daaw/ms2;)V

    iput v2, p0, Lcom/daaw/zs2;->d:I

    return v1

    :cond_c
    iget-wide v3, p0, Lcom/daaw/zs2;->f:J

    const-wide/32 v6, 0x7fffffff

    cmp-long v8, v3, v6

    if-gtz v8, :cond_e

    long-to-int v4, v3

    if-nez v4, :cond_d

    const-string p1, ""

    goto :goto_8

    :cond_d
    new-array v3, v4, [B

    invoke-virtual {p1, v3, v2, v4, v2}, Lcom/daaw/ms2;->h([BIIZ)Z

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v3}, Ljava/lang/String;-><init>([B)V

    :goto_8
    iget-object v0, v0, Lcom/daaw/ct2;->a:Lcom/daaw/ft2;

    invoke-virtual {v0, v5, p1}, Lcom/daaw/ft2;->j(ILjava/lang/String;)V

    iput v2, p0, Lcom/daaw/zs2;->d:I

    return v1

    :cond_e
    new-instance p1, Lcom/daaw/eq2;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "String element size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    iget-wide v3, p0, Lcom/daaw/zs2;->f:J

    cmp-long v6, v3, v8

    if-gtz v6, :cond_10

    long-to-int v4, v3

    invoke-virtual {p0, p1, v4}, Lcom/daaw/zs2;->d(Lcom/daaw/ms2;I)J

    move-result-wide v3

    iget-object p1, v0, Lcom/daaw/ct2;->a:Lcom/daaw/ft2;

    invoke-virtual {p1, v5, v3, v4}, Lcom/daaw/ft2;->h(IJ)V

    iput v2, p0, Lcom/daaw/zs2;->d:I

    return v1

    :cond_10
    new-instance p1, Lcom/daaw/eq2;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid integer size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    invoke-virtual {p1}, Lcom/daaw/ms2;->d()J

    move-result-wide v6

    iget-wide v3, p0, Lcom/daaw/zs2;->f:J

    iget-object p1, p0, Lcom/daaw/zs2;->b:Ljava/util/Stack;

    new-instance v0, Lcom/daaw/ys2;

    add-long/2addr v3, v6

    const/4 v8, 0x0

    invoke-direct {v0, v5, v3, v4, v8}, Lcom/daaw/ys2;-><init>(IJLcom/daaw/xs2;)V

    invoke-virtual {p1, v0}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/zs2;->g:Lcom/daaw/ct2;

    iget v4, p0, Lcom/daaw/zs2;->e:I

    iget-wide v8, p0, Lcom/daaw/zs2;->f:J

    iget-object v3, p1, Lcom/daaw/ct2;->a:Lcom/daaw/ft2;

    move-wide v5, v6

    move-wide v7, v8

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/ft2;->i(IJJ)V

    iput v2, p0, Lcom/daaw/zs2;->d:I

    return v1

    :cond_12
    iget-wide v3, p0, Lcom/daaw/zs2;->f:J

    long-to-int v0, v3

    invoke-virtual {p1, v0, v2}, Lcom/daaw/ms2;->i(IZ)Z

    iput v2, p0, Lcom/daaw/zs2;->d:I

    goto/16 :goto_1
.end method

.method public final d(Lcom/daaw/ms2;I)J
    .locals 6

    iget-object v0, p0, Lcom/daaw/zs2;->a:[B

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p2, v1}, Lcom/daaw/ms2;->h([BIIZ)Z

    const-wide/16 v2, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    const/16 p1, 0x8

    shl-long/2addr v2, p1

    iget-object p1, p0, Lcom/daaw/zs2;->a:[B

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    int-to-long v4, p1

    or-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method
