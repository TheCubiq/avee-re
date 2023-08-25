.class public final Lcom/daaw/ae2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zd2;


# instance fields
.field public final a:Lcom/daaw/m09;

.field public final b:Lcom/daaw/m42;

.field public final c:Lcom/daaw/ce2;

.field public final d:Lcom/daaw/f92;

.field public final e:I

.field public f:J

.field public g:I

.field public h:J


# direct methods
.method public constructor <init>(Lcom/daaw/m09;Lcom/daaw/m42;Lcom/daaw/ce2;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ae2;->a:Lcom/daaw/m09;

    iput-object p2, p0, Lcom/daaw/ae2;->b:Lcom/daaw/m42;

    iput-object p3, p0, Lcom/daaw/ae2;->c:Lcom/daaw/ce2;

    iget p1, p3, Lcom/daaw/ce2;->b:I

    iget p2, p3, Lcom/daaw/ce2;->e:I

    mul-int p1, p1, p2

    div-int/lit8 p1, p1, 0x8

    iget p2, p3, Lcom/daaw/ce2;->d:I

    if-ne p2, p1, :cond_0

    iget p2, p3, Lcom/daaw/ce2;->c:I

    mul-int p2, p2, p1

    mul-int/lit8 v0, p2, 0x8

    div-int/lit8 p2, p2, 0xa

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/ae2;->e:I

    new-instance p2, Lcom/daaw/b72;

    invoke-direct {p2}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {p2, p4}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {p2, v0}, Lcom/daaw/b72;->d0(I)Lcom/daaw/b72;

    invoke-virtual {p2, v0}, Lcom/daaw/b72;->o(I)Lcom/daaw/b72;

    invoke-virtual {p2, p1}, Lcom/daaw/b72;->l(I)Lcom/daaw/b72;

    iget p1, p3, Lcom/daaw/ce2;->b:I

    invoke-virtual {p2, p1}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    iget p1, p3, Lcom/daaw/ce2;->c:I

    invoke-virtual {p2, p1}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-virtual {p2, p5}, Lcom/daaw/b72;->n(I)Lcom/daaw/b72;

    invoke-virtual {p2}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ae2;->d:Lcom/daaw/f92;

    return-void

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Expected block size: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; got: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/ae2;->f:J

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/ae2;->g:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/ae2;->h:J

    return-void
.end method

.method public final b(IJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/ae2;->a:Lcom/daaw/m09;

    new-instance v8, Lcom/daaw/je2;

    iget-object v2, p0, Lcom/daaw/ae2;->c:Lcom/daaw/ce2;

    int-to-long v4, p1

    const/4 v3, 0x1

    move-object v1, v8

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Lcom/daaw/je2;-><init>(Lcom/daaw/ce2;IJJ)V

    invoke-interface {v0, v8}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    iget-object p1, p0, Lcom/daaw/ae2;->b:Lcom/daaw/m42;

    iget-object p2, p0, Lcom/daaw/ae2;->d:Lcom/daaw/f92;

    invoke-interface {p1, p2}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    return-void
.end method

.method public final c(Lcom/daaw/k09;J)Z
    .locals 24

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    :goto_0
    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-lez v6, :cond_1

    iget v6, v0, Lcom/daaw/ae2;->g:I

    iget v7, v0, Lcom/daaw/ae2;->e:I

    if-ge v6, v7, :cond_1

    sub-int/2addr v7, v6

    int-to-long v6, v7

    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    iget-object v8, v0, Lcom/daaw/ae2;->b:Lcom/daaw/m42;

    long-to-int v7, v6

    move-object/from16 v6, p1

    invoke-static {v8, v6, v7, v3}, Lcom/daaw/k42;->a(Lcom/daaw/m42;Lcom/daaw/xp8;IZ)I

    move-result v3

    const/4 v7, -0x1

    if-ne v3, v7, :cond_0

    move-wide v1, v4

    goto :goto_0

    :cond_0
    iget v4, v0, Lcom/daaw/ae2;->g:I

    add-int/2addr v4, v3

    iput v4, v0, Lcom/daaw/ae2;->g:I

    int-to-long v3, v3

    sub-long/2addr v1, v3

    goto :goto_0

    :cond_1
    iget-object v6, v0, Lcom/daaw/ae2;->c:Lcom/daaw/ce2;

    iget v7, v6, Lcom/daaw/ce2;->d:I

    iget v8, v0, Lcom/daaw/ae2;->g:I

    div-int/2addr v8, v7

    if-lez v8, :cond_2

    iget-wide v9, v0, Lcom/daaw/ae2;->f:J

    iget-wide v11, v0, Lcom/daaw/ae2;->h:J

    iget v6, v6, Lcom/daaw/ce2;->c:I

    const-wide/32 v13, 0xf4240

    int-to-long v3, v6

    move-wide v15, v3

    invoke-static/range {v11 .. v16}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v3

    mul-int v21, v8, v7

    iget v5, v0, Lcom/daaw/ae2;->g:I

    sub-int v5, v5, v21

    iget-object v6, v0, Lcom/daaw/ae2;->b:Lcom/daaw/m42;

    add-long v18, v9, v3

    const/16 v20, 0x1

    const/16 v23, 0x0

    move-object/from16 v17, v6

    move/from16 v22, v5

    invoke-interface/range {v17 .. v23}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    iget-wide v3, v0, Lcom/daaw/ae2;->h:J

    int-to-long v6, v8

    add-long/2addr v3, v6

    iput-wide v3, v0, Lcom/daaw/ae2;->h:J

    iput v5, v0, Lcom/daaw/ae2;->g:I

    const-wide/16 v3, 0x0

    goto :goto_1

    :cond_2
    move-wide v3, v4

    :goto_1
    cmp-long v5, v1, v3

    if-gtz v5, :cond_3

    const/4 v1, 0x1

    return v1

    :cond_3
    const/4 v1, 0x0

    return v1
.end method
