.class public Lcom/daaw/sc;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:J

.field public b:I

.field public c:I

.field public d:J

.field public e:I

.field public f:[S


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [S

    iput-object v0, p0, Lcom/daaw/sc;->f:[S

    invoke-virtual {p0}, Lcom/daaw/sc;->f()V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/sc;->a(J)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 4

    iget-wide v0, p0, Lcom/daaw/sc;->a:J

    iget v2, p0, Lcom/daaw/sc;->b:I

    int-to-long v2, v2

    invoke-static {p1, p2, v2, v3}, Lcom/daaw/hr1;->e(JJ)J

    move-result-wide p1

    sub-long/2addr v0, p1

    iput-wide v0, p0, Lcom/daaw/sc;->d:J

    return-void
.end method

.method public b(Ljava/nio/ByteBuffer;JIIII[[B)V
    .locals 7

    const/4 v0, 0x0

    aget-object v1, p8, v0

    iput-wide p2, p0, Lcom/daaw/sc;->a:J

    iput p4, p0, Lcom/daaw/sc;->b:I

    iput p5, p0, Lcom/daaw/sc;->c:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p3

    int-to-long v2, p6

    invoke-static {v2, v3, p5, p7}, Lcom/daaw/hr1;->a(JII)J

    move-result-wide v2

    long-to-int p4, v2

    mul-int p4, p4, p5

    iput p4, p0, Lcom/daaw/sc;->e:I

    iget-object v4, p0, Lcom/daaw/sc;->f:[S

    array-length v5, v4

    if-lt v5, p4, :cond_0

    array-length v4, v4

    mul-int/lit8 v5, p4, 0x2

    if-le v4, v5, :cond_1

    :cond_0
    new-array p4, p4, [S

    iput-object p4, p0, Lcom/daaw/sc;->f:[S

    :cond_1
    array-length p4, v1

    if-lt p4, p6, :cond_2

    array-length p4, v1

    mul-int/lit8 v4, p6, 0x2

    if-le p4, v4, :cond_3

    :cond_2
    new-array v1, p6, [B

    :cond_3
    invoke-virtual {p1, v1, v0, p6}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    rem-int p4, p6, p5

    if-eqz p4, :cond_4

    const-string p4, "tmpBuffDataLength mismatch"

    invoke-static {p4}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_4
    div-int/lit8 p7, p7, 0x8

    const/4 p4, 0x0

    const/4 p5, 0x0

    :goto_0
    if-ge p4, p6, :cond_5

    add-int/2addr p4, p7

    add-int/lit8 v4, p4, -0x1

    add-int/lit8 v5, p4, -0x2

    :try_start_0
    iget-object v6, p0, Lcom/daaw/sc;->f:[S

    aget-byte v5, v1, v5

    and-int/lit16 v5, v5, 0xff

    aget-byte v4, v1, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v4, v5

    int-to-short v4, v4

    aput-short v4, v6, p5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :catch_0
    move-exception p4

    const/4 p5, 0x2

    new-array p5, p5, [Ljava/lang/Object;

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    aput-object p6, p5, v0

    invoke-virtual {p4}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p4

    const/4 p6, 0x1

    aput-object p4, p5, p6

    const-string p4, "Oh, well: %d, %s"

    invoke-static {p4, p5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0, v2, v3}, Lcom/daaw/sc;->a(J)V

    aput-object v1, p8, v0

    return-void
.end method

.method public c(Ljava/nio/ByteBuffer;JIII[[B)V
    .locals 11

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    sub-int v8, v0, v1

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    move/from16 v7, p5

    move/from16 v9, p6

    move-object/from16 v10, p7

    invoke-virtual/range {v2 .. v10}, Lcom/daaw/sc;->b(Ljava/nio/ByteBuffer;JIIII[[B)V

    return-void
.end method

.method public d([SIII[S[F[J)I
    .locals 8

    iget v0, p0, Lcom/daaw/sc;->c:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_9

    if-ne p2, v3, :cond_4

    move v0, p3

    :goto_0
    iget v1, p0, Lcom/daaw/sc;->c:I

    mul-int v1, v1, p4

    iget v4, p0, Lcom/daaw/sc;->e:I

    if-lt v1, v4, :cond_0

    goto/16 :goto_4

    :cond_0
    mul-int v1, v0, p2

    array-length v4, p1

    if-lt v1, v4, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object v4, p0, Lcom/daaw/sc;->f:[S

    aget-short v4, v4, p4

    aput-short v4, p1, v1

    aget-short v4, p5, v2

    aget-short v5, p1, v1

    if-le v4, v5, :cond_2

    aget-short v4, p1, v1

    aput-short v4, p5, v2

    :cond_2
    aget-short v4, p5, v3

    aget-short v5, p1, v1

    if-ge v4, v5, :cond_3

    aget-short v4, p1, v1

    aput-short v4, p5, v3

    :cond_3
    aget v4, p6, v2

    aget-short v5, p1, v1

    aget-short v1, p1, v1

    mul-int v5, v5, v1

    int-to-float v1, v5

    add-float/2addr v4, v1

    aput v4, p6, v2

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    if-ne p2, v1, :cond_13

    move v0, p3

    :goto_1
    iget v1, p0, Lcom/daaw/sc;->c:I

    mul-int v1, v1, p4

    iget v4, p0, Lcom/daaw/sc;->e:I

    if-lt v1, v4, :cond_5

    goto/16 :goto_4

    :cond_5
    mul-int v1, v0, p2

    add-int/lit8 v4, v1, 0x1

    array-length v5, p1

    if-lt v4, v5, :cond_6

    goto/16 :goto_4

    :cond_6
    iget-object v5, p0, Lcom/daaw/sc;->f:[S

    aget-short v6, v5, p4

    aput-short v6, p1, v1

    aget-short v5, v5, p4

    aput-short v5, p1, v4

    aget-short v4, p5, v2

    aget-short v5, p1, v1

    if-le v4, v5, :cond_7

    aget-short v4, p1, v1

    aput-short v4, p5, v2

    :cond_7
    aget-short v4, p5, v3

    aget-short v5, p1, v1

    if-ge v4, v5, :cond_8

    aget-short v4, p1, v1

    aput-short v4, p5, v3

    :cond_8
    aget v4, p6, v2

    aget-short v5, p1, v1

    aget-short v1, p1, v1

    mul-int v5, v5, v1

    int-to-float v1, v5

    add-float/2addr v4, v1

    aput v4, p6, v2

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_9
    if-ne p2, v3, :cond_e

    move v0, p3

    :goto_2
    iget v4, p0, Lcom/daaw/sc;->c:I

    mul-int v5, p4, v4

    add-int/2addr v5, v3

    iget v6, p0, Lcom/daaw/sc;->e:I

    if-lt v5, v6, :cond_a

    goto/16 :goto_4

    :cond_a
    mul-int v5, v0, p2

    array-length v6, p1

    if-lt v5, v6, :cond_b

    goto/16 :goto_4

    :cond_b
    iget-object v6, p0, Lcom/daaw/sc;->f:[S

    mul-int v7, p4, v4

    aget-short v7, v6, v7

    mul-int v4, v4, p4

    add-int/2addr v4, v3

    aget-short v4, v6, v4

    add-int/2addr v7, v4

    div-int/2addr v7, v1

    int-to-short v4, v7

    aput-short v4, p1, v5

    aget-short v4, p5, v2

    aget-short v6, p1, v5

    if-le v4, v6, :cond_c

    aget-short v4, p1, v5

    aput-short v4, p5, v2

    :cond_c
    aget-short v4, p5, v3

    aget-short v6, p1, v5

    if-ge v4, v6, :cond_d

    aget-short v4, p1, v5

    aput-short v4, p5, v3

    :cond_d
    aget v4, p6, v2

    aget-short v6, p1, v5

    aget-short v5, p1, v5

    mul-int v6, v6, v5

    int-to-float v5, v6

    add-float/2addr v4, v5

    aput v4, p6, v2

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_e
    if-ne p2, v1, :cond_13

    move v0, p3

    :goto_3
    iget v1, p0, Lcom/daaw/sc;->c:I

    mul-int v4, p4, v1

    add-int/2addr v4, v3

    iget v5, p0, Lcom/daaw/sc;->e:I

    if-lt v4, v5, :cond_f

    goto :goto_4

    :cond_f
    mul-int v4, v0, p2

    add-int/lit8 v5, v4, 0x1

    array-length v6, p1

    if-lt v5, v6, :cond_10

    goto :goto_4

    :cond_10
    iget-object v6, p0, Lcom/daaw/sc;->f:[S

    mul-int v7, p4, v1

    aget-short v7, v6, v7

    aput-short v7, p1, v4

    mul-int v1, v1, p4

    add-int/2addr v1, v3

    aget-short v1, v6, v1

    aput-short v1, p1, v5

    aget-short v1, p5, v2

    aget-short v5, p1, v4

    if-le v1, v5, :cond_11

    aget-short v1, p1, v4

    aput-short v1, p5, v2

    :cond_11
    aget-short v1, p5, v3

    aget-short v5, p1, v4

    if-ge v1, v5, :cond_12

    aget-short v1, p1, v4

    aput-short v1, p5, v3

    :cond_12
    aget v1, p6, v2

    aget-short v5, p1, v4

    aget-short v4, p1, v4

    mul-int v5, v5, v4

    int-to-float v4, v5

    add-float/2addr v1, v4

    aput v1, p6, v2

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_13
    move v0, p3

    :goto_4
    iget p1, p0, Lcom/daaw/sc;->c:I

    mul-int p4, p4, p1

    iget p1, p0, Lcom/daaw/sc;->e:I

    sub-int/2addr p1, v3

    if-lt p4, p1, :cond_14

    iget-wide p1, p0, Lcom/daaw/sc;->a:J

    goto :goto_5

    :cond_14
    const-wide/16 p1, -0x1

    :goto_5
    aput-wide p1, p7, v2

    sub-int/2addr v0, p3

    return v0
.end method

.method public e()Z
    .locals 2

    iget v0, p0, Lcom/daaw/sc;->e:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public f()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/sc;->b:I

    iput v0, p0, Lcom/daaw/sc;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/sc;->e:I

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/daaw/sc;->a:J

    iput-wide v0, p0, Lcom/daaw/sc;->d:J

    return-void
.end method
