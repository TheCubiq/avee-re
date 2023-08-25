.class public final Lcom/daaw/g82;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i82;


# instance fields
.field public final a:[B

.field public final b:Ljava/util/ArrayDeque;

.field public final c:Lcom/daaw/p82;

.field public d:Lcom/daaw/h82;

.field public e:I

.field public f:I

.field public g:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/g82;->a:[B

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/daaw/g82;->b:Ljava/util/ArrayDeque;

    new-instance v0, Lcom/daaw/p82;

    invoke-direct {v0}, Lcom/daaw/p82;-><init>()V

    iput-object v0, p0, Lcom/daaw/g82;->c:Lcom/daaw/p82;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 13

    iget-object v0, p0, Lcom/daaw/g82;->d:Lcom/daaw/h82;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lcom/daaw/g82;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/f82;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v2

    invoke-static {v0}, Lcom/daaw/f82;->b(Lcom/daaw/f82;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/daaw/g82;->d:Lcom/daaw/h82;

    iget-object v0, p0, Lcom/daaw/g82;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/f82;

    invoke-static {v0}, Lcom/daaw/f82;->a(Lcom/daaw/f82;)I

    move-result v0

    check-cast p1, Lcom/daaw/l82;

    iget-object p1, p1, Lcom/daaw/l82;->a:Lcom/daaw/n82;

    invoke-virtual {p1, v0}, Lcom/daaw/n82;->h(I)V

    return v1

    :cond_1
    :goto_1
    iget v0, p0, Lcom/daaw/g82;->e:I

    const/4 v2, 0x2

    const/4 v3, 0x4

    const/4 v4, 0x0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/daaw/g82;->c:Lcom/daaw/p82;

    invoke-virtual {v0, p1, v1, v4, v3}, Lcom/daaw/p82;->d(Lcom/daaw/k09;ZZI)J

    move-result-wide v5

    const-wide/16 v7, -0x2

    cmp-long v0, v5, v7

    if-nez v0, :cond_3

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    :goto_2
    iget-object v0, p0, Lcom/daaw/g82;->a:[B

    move-object v5, p1

    check-cast v5, Lcom/daaw/rz8;

    invoke-virtual {v5, v0, v4, v3, v4}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object v0, p0, Lcom/daaw/g82;->a:[B

    aget-byte v0, v0, v4

    invoke-static {v0}, Lcom/daaw/p82;->b(I)I

    move-result v0

    const/4 v6, -0x1

    if-eq v0, v6, :cond_2

    if-gt v0, v3, :cond_2

    iget-object v6, p0, Lcom/daaw/g82;->a:[B

    invoke-static {v6, v0, v4}, Lcom/daaw/p82;->c([BIZ)J

    move-result-wide v6

    long-to-int v7, v6

    iget-object v6, p0, Lcom/daaw/g82;->d:Lcom/daaw/h82;

    check-cast v6, Lcom/daaw/l82;

    iget-object v6, v6, Lcom/daaw/l82;->a:Lcom/daaw/n82;

    invoke-static {v7}, Lcom/daaw/n82;->o(I)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5, v0, v4}, Lcom/daaw/rz8;->l(IZ)Z

    int-to-long v5, v7

    goto :goto_3

    :cond_2
    invoke-virtual {v5, v1, v4}, Lcom/daaw/rz8;->l(IZ)Z

    goto :goto_2

    :cond_3
    :goto_3
    const-wide/16 v7, -0x1

    cmp-long v0, v5, v7

    if-nez v0, :cond_4

    return v4

    :cond_4
    long-to-int v0, v5

    iput v0, p0, Lcom/daaw/g82;->f:I

    iput v1, p0, Lcom/daaw/g82;->e:I

    goto :goto_4

    :cond_5
    if-ne v0, v1, :cond_6

    :goto_4
    iget-object v0, p0, Lcom/daaw/g82;->c:Lcom/daaw/p82;

    const/16 v5, 0x8

    invoke-virtual {v0, p1, v4, v1, v5}, Lcom/daaw/p82;->d(Lcom/daaw/k09;ZZI)J

    move-result-wide v5

    iput-wide v5, p0, Lcom/daaw/g82;->g:J

    iput v2, p0, Lcom/daaw/g82;->e:I

    :cond_6
    iget-object v0, p0, Lcom/daaw/g82;->d:Lcom/daaw/h82;

    iget v5, p0, Lcom/daaw/g82;->f:I

    check-cast v0, Lcom/daaw/l82;

    iget-object v6, v0, Lcom/daaw/l82;->a:Lcom/daaw/n82;

    invoke-static {v5}, Lcom/daaw/n82;->n(I)I

    move-result v7

    if-eqz v7, :cond_12

    const/4 v8, 0x0

    if-eq v7, v1, :cond_11

    const-wide/16 v9, 0x8

    if-eq v7, v2, :cond_f

    const/4 v2, 0x3

    if-eq v7, v2, :cond_b

    if-eq v7, v3, :cond_a

    iget-wide v6, p0, Lcom/daaw/g82;->g:J

    const-wide/16 v11, 0x4

    cmp-long v2, v6, v11

    if-eqz v2, :cond_8

    cmp-long v2, v6, v9

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid float size: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v8}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_8
    :goto_5
    long-to-int v2, v6

    invoke-virtual {p0, p1, v2}, Lcom/daaw/g82;->c(Lcom/daaw/k09;I)J

    move-result-wide v6

    if-ne v2, v3, :cond_9

    long-to-int p1, v6

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    float-to-double v2, p1

    goto :goto_6

    :cond_9
    invoke-static {v6, v7}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    :goto_6
    iget-object p1, v0, Lcom/daaw/l82;->a:Lcom/daaw/n82;

    invoke-virtual {p1, v5, v2, v3}, Lcom/daaw/n82;->i(ID)V

    iput v4, p0, Lcom/daaw/g82;->e:I

    return v1

    :cond_a
    iget-wide v2, p0, Lcom/daaw/g82;->g:J

    long-to-int v0, v2

    invoke-virtual {v6, v5, v0, p1}, Lcom/daaw/n82;->g(IILcom/daaw/k09;)V

    iput v4, p0, Lcom/daaw/g82;->e:I

    return v1

    :cond_b
    iget-wide v2, p0, Lcom/daaw/g82;->g:J

    const-wide/32 v6, 0x7fffffff

    cmp-long v9, v2, v6

    if-gtz v9, :cond_e

    long-to-int v3, v2

    if-nez v3, :cond_c

    const-string p1, ""

    goto :goto_8

    :cond_c
    new-array v2, v3, [B

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, v2, v4, v3, v4}, Lcom/daaw/rz8;->e([BIIZ)Z

    :goto_7
    if-lez v3, :cond_d

    add-int/lit8 p1, v3, -0x1

    aget-byte v6, v2, p1

    if-nez v6, :cond_d

    move v3, p1

    goto :goto_7

    :cond_d
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v2, v4, v3}, Ljava/lang/String;-><init>([BII)V

    :goto_8
    iget-object v0, v0, Lcom/daaw/l82;->a:Lcom/daaw/n82;

    invoke-virtual {v0, v5, p1}, Lcom/daaw/n82;->l(ILjava/lang/String;)V

    iput v4, p0, Lcom/daaw/g82;->e:I

    return v1

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "String element size: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v8}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_f
    iget-wide v2, p0, Lcom/daaw/g82;->g:J

    cmp-long v6, v2, v9

    if-gtz v6, :cond_10

    long-to-int v3, v2

    invoke-virtual {p0, p1, v3}, Lcom/daaw/g82;->c(Lcom/daaw/k09;I)J

    move-result-wide v2

    iget-object p1, v0, Lcom/daaw/l82;->a:Lcom/daaw/n82;

    invoke-virtual {p1, v5, v2, v3}, Lcom/daaw/n82;->j(IJ)V

    iput v4, p0, Lcom/daaw/g82;->e:I

    return v1

    :cond_10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid integer size: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v8}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_11
    invoke-interface {p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v2

    iget-wide v6, p0, Lcom/daaw/g82;->g:J

    iget-object p1, p0, Lcom/daaw/g82;->b:Ljava/util/ArrayDeque;

    new-instance v0, Lcom/daaw/f82;

    add-long/2addr v6, v2

    invoke-direct {v0, v5, v6, v7, v8}, Lcom/daaw/f82;-><init>(IJLcom/daaw/e82;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/g82;->d:Lcom/daaw/h82;

    iget v6, p0, Lcom/daaw/g82;->f:I

    iget-wide v9, p0, Lcom/daaw/g82;->g:J

    check-cast p1, Lcom/daaw/l82;

    iget-object v5, p1, Lcom/daaw/l82;->a:Lcom/daaw/n82;

    move-wide v7, v2

    invoke-virtual/range {v5 .. v10}, Lcom/daaw/n82;->k(IJJ)V

    iput v4, p0, Lcom/daaw/g82;->e:I

    return v1

    :cond_12
    iget-wide v0, p0, Lcom/daaw/g82;->g:J

    move-object v2, p1

    check-cast v2, Lcom/daaw/rz8;

    long-to-int v1, v0

    invoke-virtual {v2, v1, v4}, Lcom/daaw/rz8;->l(IZ)Z

    iput v4, p0, Lcom/daaw/g82;->e:I

    goto/16 :goto_0
.end method

.method public final b(Lcom/daaw/h82;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g82;->d:Lcom/daaw/h82;

    return-void
.end method

.method public final c(Lcom/daaw/k09;I)J
    .locals 6

    iget-object v0, p0, Lcom/daaw/g82;->a:[B

    check-cast p1, Lcom/daaw/rz8;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p2, v1}, Lcom/daaw/rz8;->e([BIIZ)Z

    const-wide/16 v2, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    const/16 p1, 0x8

    shl-long/2addr v2, p1

    iget-object p1, p0, Lcom/daaw/g82;->a:[B

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    int-to-long v4, p1

    or-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method

.method public final zzb()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/g82;->e:I

    iget-object v0, p0, Lcom/daaw/g82;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iget-object v0, p0, Lcom/daaw/g82;->c:Lcom/daaw/p82;

    invoke-virtual {v0}, Lcom/daaw/p82;->e()V

    return-void
.end method
