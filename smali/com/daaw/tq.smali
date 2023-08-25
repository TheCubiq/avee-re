.class public final Lcom/daaw/tq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ov;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tq$b;
    }
.end annotation


# instance fields
.field public final a:[B

.field public final b:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/tq$b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/zr1;

.field public d:Lcom/daaw/pv;

.field public e:I

.field public f:I

.field public g:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/tq;->a:[B

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/daaw/tq;->b:Ljava/util/ArrayDeque;

    new-instance v0, Lcom/daaw/zr1;

    invoke-direct {v0}, Lcom/daaw/zr1;-><init>()V

    iput-object v0, p0, Lcom/daaw/tq;->c:Lcom/daaw/zr1;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/a00;)Z
    .locals 9

    iget-object v0, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    :goto_1
    iget-object v0, p0, Lcom/daaw/tq;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v3

    iget-object v0, p0, Lcom/daaw/tq;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/tq$b;

    invoke-static {v0}, Lcom/daaw/tq$b;->a(Lcom/daaw/tq$b;)J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-ltz v0, :cond_1

    iget-object p1, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    iget-object v0, p0, Lcom/daaw/tq;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/tq$b;

    invoke-static {v0}, Lcom/daaw/tq$b;->b(Lcom/daaw/tq$b;)I

    move-result v0

    invoke-interface {p1, v0}, Lcom/daaw/pv;->a(I)V

    return v2

    :cond_1
    iget v0, p0, Lcom/daaw/tq;->e:I

    const/4 v3, 0x4

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/daaw/tq;->c:Lcom/daaw/zr1;

    invoke-virtual {v0, p1, v2, v1, v3}, Lcom/daaw/zr1;->d(Lcom/daaw/a00;ZZI)J

    move-result-wide v4

    const-wide/16 v6, -0x2

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/daaw/tq;->c(Lcom/daaw/a00;)J

    move-result-wide v4

    :cond_2
    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    return v1

    :cond_3
    long-to-int v0, v4

    iput v0, p0, Lcom/daaw/tq;->f:I

    iput v2, p0, Lcom/daaw/tq;->e:I

    :cond_4
    iget v0, p0, Lcom/daaw/tq;->e:I

    const/4 v4, 0x2

    if-ne v0, v2, :cond_5

    iget-object v0, p0, Lcom/daaw/tq;->c:Lcom/daaw/zr1;

    const/16 v5, 0x8

    invoke-virtual {v0, p1, v1, v2, v5}, Lcom/daaw/zr1;->d(Lcom/daaw/a00;ZZI)J

    move-result-wide v5

    iput-wide v5, p0, Lcom/daaw/tq;->g:J

    iput v4, p0, Lcom/daaw/tq;->e:I

    :cond_5
    iget-object v0, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    iget v5, p0, Lcom/daaw/tq;->f:I

    invoke-interface {v0, v5}, Lcom/daaw/pv;->b(I)I

    move-result v0

    if-eqz v0, :cond_f

    if-eq v0, v2, :cond_e

    const-wide/16 v5, 0x8

    if-eq v0, v4, :cond_c

    const/4 v4, 0x3

    if-eq v0, v4, :cond_a

    if-eq v0, v3, :cond_9

    const/4 v3, 0x5

    if-ne v0, v3, :cond_8

    iget-wide v3, p0, Lcom/daaw/tq;->g:J

    const-wide/16 v7, 0x4

    cmp-long v0, v3, v7

    if-eqz v0, :cond_7

    cmp-long v0, v3, v5

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    new-instance p1, Lcom/daaw/tv0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid float size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/tq;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_2
    iget-object v0, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    iget v5, p0, Lcom/daaw/tq;->f:I

    long-to-int v4, v3

    invoke-virtual {p0, p1, v4}, Lcom/daaw/tq;->d(Lcom/daaw/a00;I)D

    move-result-wide v3

    invoke-interface {v0, v5, v3, v4}, Lcom/daaw/pv;->e(ID)V

    iput v1, p0, Lcom/daaw/tq;->e:I

    return v2

    :cond_8
    new-instance p1, Lcom/daaw/tv0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid element type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    iget v3, p0, Lcom/daaw/tq;->f:I

    iget-wide v4, p0, Lcom/daaw/tq;->g:J

    long-to-int v5, v4

    invoke-interface {v0, v3, v5, p1}, Lcom/daaw/pv;->g(IILcom/daaw/a00;)V

    iput v1, p0, Lcom/daaw/tq;->e:I

    return v2

    :cond_a
    iget-wide v3, p0, Lcom/daaw/tq;->g:J

    const-wide/32 v5, 0x7fffffff

    cmp-long v0, v3, v5

    if-gtz v0, :cond_b

    iget-object v0, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    iget v5, p0, Lcom/daaw/tq;->f:I

    long-to-int v4, v3

    invoke-virtual {p0, p1, v4}, Lcom/daaw/tq;->g(Lcom/daaw/a00;I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v5, p1}, Lcom/daaw/pv;->d(ILjava/lang/String;)V

    iput v1, p0, Lcom/daaw/tq;->e:I

    return v2

    :cond_b
    new-instance p1, Lcom/daaw/tv0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "String element size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/tq;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    iget-wide v3, p0, Lcom/daaw/tq;->g:J

    cmp-long v0, v3, v5

    if-gtz v0, :cond_d

    iget-object v0, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    iget v5, p0, Lcom/daaw/tq;->f:I

    long-to-int v4, v3

    invoke-virtual {p0, p1, v4}, Lcom/daaw/tq;->f(Lcom/daaw/a00;I)J

    move-result-wide v3

    invoke-interface {v0, v5, v3, v4}, Lcom/daaw/pv;->h(IJ)V

    iput v1, p0, Lcom/daaw/tq;->e:I

    return v2

    :cond_d
    new-instance p1, Lcom/daaw/tv0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid integer size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/tq;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v5

    iget-wide v3, p0, Lcom/daaw/tq;->g:J

    add-long/2addr v3, v5

    iget-object p1, p0, Lcom/daaw/tq;->b:Ljava/util/ArrayDeque;

    new-instance v0, Lcom/daaw/tq$b;

    iget v7, p0, Lcom/daaw/tq;->f:I

    const/4 v8, 0x0

    invoke-direct {v0, v7, v3, v4, v8}, Lcom/daaw/tq$b;-><init>(IJLcom/daaw/tq$a;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    iget v4, p0, Lcom/daaw/tq;->f:I

    iget-wide v7, p0, Lcom/daaw/tq;->g:J

    invoke-interface/range {v3 .. v8}, Lcom/daaw/pv;->f(IJJ)V

    iput v1, p0, Lcom/daaw/tq;->e:I

    return v2

    :cond_f
    iget-wide v3, p0, Lcom/daaw/tq;->g:J

    long-to-int v0, v3

    invoke-interface {p1, v0}, Lcom/daaw/a00;->j(I)V

    iput v1, p0, Lcom/daaw/tq;->e:I

    goto/16 :goto_1
.end method

.method public b(Lcom/daaw/pv;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    return-void
.end method

.method public final c(Lcom/daaw/a00;)J
    .locals 4

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    :goto_0
    iget-object v0, p0, Lcom/daaw/tq;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    iget-object v0, p0, Lcom/daaw/tq;->a:[B

    aget-byte v0, v0, v1

    invoke-static {v0}, Lcom/daaw/zr1;->c(I)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    if-gt v0, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/tq;->a:[B

    invoke-static {v2, v0, v1}, Lcom/daaw/zr1;->a([BIZ)J

    move-result-wide v1

    long-to-int v2, v1

    iget-object v1, p0, Lcom/daaw/tq;->d:Lcom/daaw/pv;

    invoke-interface {v1, v2}, Lcom/daaw/pv;->c(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lcom/daaw/a00;->j(I)V

    int-to-long v0, v2

    return-wide v0

    :cond_0
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/daaw/a00;->j(I)V

    goto :goto_0
.end method

.method public final d(Lcom/daaw/a00;I)D
    .locals 2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tq;->f(Lcom/daaw/a00;I)J

    move-result-wide v0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    float-to-double p1, p1

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/tq;->e:I

    iget-object v0, p0, Lcom/daaw/tq;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iget-object v0, p0, Lcom/daaw/tq;->c:Lcom/daaw/zr1;

    invoke-virtual {v0}, Lcom/daaw/zr1;->e()V

    return-void
.end method

.method public final f(Lcom/daaw/a00;I)J
    .locals 6

    iget-object v0, p0, Lcom/daaw/tq;->a:[B

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1, p2}, Lcom/daaw/a00;->f([BII)V

    const-wide/16 v2, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    const/16 p1, 0x8

    shl-long/2addr v2, p1

    iget-object p1, p0, Lcom/daaw/tq;->a:[B

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    int-to-long v4, p1

    or-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method

.method public final g(Lcom/daaw/a00;I)Ljava/lang/String;
    .locals 2

    if-nez p2, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    new-array v0, p2, [B

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1, p2}, Lcom/daaw/a00;->f([BII)V

    :goto_0
    if-lez p2, :cond_1

    add-int/lit8 p1, p2, -0x1

    aget-byte p1, v0, p1

    if-nez p1, :cond_1

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Ljava/lang/String;-><init>([BII)V

    return-object p1
.end method
