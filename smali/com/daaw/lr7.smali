.class public abstract Lcom/daaw/lr7;
.super Lcom/daaw/qr7;
.source ""


# instance fields
.field public final d:[B

.field public final e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/qr7;-><init>(Lcom/daaw/pr7;)V

    if-ltz p1, :cond_0

    const/16 v0, 0x14

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/daaw/lr7;->d:[B

    array-length p1, p1

    iput p1, p0, Lcom/daaw/lr7;->e:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bufferSize must be >= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final I(B)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/lr7;->d:[B

    iget v1, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    aput-byte p1, v0, v1

    iget p1, p0, Lcom/daaw/lr7;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/lr7;->g:I

    return-void
.end method

.method public final J(I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/lr7;->d:[B

    iget v1, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Lcom/daaw/lr7;->f:I

    shr-int/lit8 v3, p1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    shr-int/lit8 v3, p1, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Lcom/daaw/lr7;->f:I

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    iget p1, p0, Lcom/daaw/lr7;->g:I

    add-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/daaw/lr7;->g:I

    return-void
.end method

.method public final K(J)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/lr7;->d:[B

    iget v1, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    const-wide/16 v3, 0xff

    and-long v5, p1, v3

    long-to-int v6, v5

    int-to-byte v5, v6

    aput-byte v5, v0, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Lcom/daaw/lr7;->f:I

    const/16 v5, 0x8

    shr-long v6, p1, v5

    and-long/2addr v6, v3

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v0, v2

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    const/16 v6, 0x10

    shr-long v6, p1, v6

    and-long/2addr v6, v3

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v0, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Lcom/daaw/lr7;->f:I

    const/16 v6, 0x18

    shr-long v6, p1, v6

    and-long/2addr v3, v6

    long-to-int v4, v3

    int-to-byte v3, v4

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    const/16 v3, 0x20

    shr-long v3, p1, v3

    long-to-int v4, v3

    and-int/lit16 v3, v4, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Lcom/daaw/lr7;->f:I

    const/16 v3, 0x28

    shr-long v3, p1, v3

    long-to-int v4, v3

    and-int/lit16 v3, v4, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    const/16 v3, 0x30

    shr-long v3, p1, v3

    long-to-int v4, v3

    and-int/lit16 v3, v4, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Lcom/daaw/lr7;->f:I

    const/16 v1, 0x38

    shr-long/2addr p1, v1

    long-to-int p2, p1

    and-int/lit16 p1, p2, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    iget p1, p0, Lcom/daaw/lr7;->g:I

    add-int/2addr p1, v5

    iput p1, p0, Lcom/daaw/lr7;->g:I

    return-void
.end method

.method public final L(I)V
    .locals 6

    invoke-static {}, Lcom/daaw/qr7;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/lr7;->f:I

    int-to-long v0, v0

    :goto_0
    and-int/lit8 v2, p1, -0x80

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/daaw/lr7;->d:[B

    iget v3, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/daaw/lr7;->f:I

    int-to-long v3, v3

    int-to-byte p1, p1

    invoke-static {v2, v3, v4, p1}, Lcom/daaw/gw7;->y([BJB)V

    iget p1, p0, Lcom/daaw/lr7;->f:I

    iget v2, p0, Lcom/daaw/lr7;->g:I

    int-to-long v3, p1

    sub-long/2addr v3, v0

    long-to-int p1, v3

    add-int/2addr v2, p1

    iput v2, p0, Lcom/daaw/lr7;->g:I

    return-void

    :cond_0
    iget-object v2, p0, Lcom/daaw/lr7;->d:[B

    iget v3, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/daaw/lr7;->f:I

    int-to-long v3, v3

    and-int/lit8 v5, p1, 0x7f

    or-int/lit16 v5, v5, 0x80

    int-to-byte v5, v5

    invoke-static {v2, v3, v4, v5}, Lcom/daaw/gw7;->y([BJB)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_1
    :goto_1
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/lr7;->d:[B

    iget v1, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    iget p1, p0, Lcom/daaw/lr7;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/lr7;->g:I

    return-void

    :cond_2
    iget-object v0, p0, Lcom/daaw/lr7;->d:[B

    iget v1, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    and-int/lit8 v2, p1, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget v0, p0, Lcom/daaw/lr7;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/lr7;->g:I

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_1
.end method

.method public final M(J)V
    .locals 11

    invoke-static {}, Lcom/daaw/qr7;->l()Z

    move-result v0

    const/4 v1, 0x7

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x80

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/lr7;->f:I

    int-to-long v6, v0

    :goto_0
    and-long v8, p1, v4

    cmp-long v0, v8, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/lr7;->d:[B

    iget v1, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    int-to-long v1, v1

    long-to-int p2, p1

    int-to-byte p1, p2

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/gw7;->y([BJB)V

    iget p1, p0, Lcom/daaw/lr7;->f:I

    iget p2, p0, Lcom/daaw/lr7;->g:I

    int-to-long v0, p1

    sub-long/2addr v0, v6

    long-to-int p1, v0

    add-int/2addr p2, p1

    iput p2, p0, Lcom/daaw/lr7;->g:I

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/lr7;->d:[B

    iget v8, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v9, v8, 0x1

    iput v9, p0, Lcom/daaw/lr7;->f:I

    int-to-long v8, v8

    long-to-int v10, p1

    and-int/lit8 v10, v10, 0x7f

    or-int/lit16 v10, v10, 0x80

    int-to-byte v10, v10

    invoke-static {v0, v8, v9, v10}, Lcom/daaw/gw7;->y([BJB)V

    ushr-long/2addr p1, v1

    goto :goto_0

    :cond_1
    :goto_1
    and-long v6, p1, v4

    cmp-long v0, v6, v2

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/lr7;->d:[B

    iget v1, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/lr7;->f:I

    long-to-int p2, p1

    int-to-byte p1, p2

    aput-byte p1, v0, v1

    iget p1, p0, Lcom/daaw/lr7;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/lr7;->g:I

    return-void

    :cond_2
    iget-object v0, p0, Lcom/daaw/lr7;->d:[B

    iget v6, p0, Lcom/daaw/lr7;->f:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Lcom/daaw/lr7;->f:I

    long-to-int v7, p1

    and-int/lit8 v7, v7, 0x7f

    or-int/lit16 v7, v7, 0x80

    int-to-byte v7, v7

    aput-byte v7, v0, v6

    iget v0, p0, Lcom/daaw/lr7;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/lr7;->g:I

    ushr-long/2addr p1, v1

    goto :goto_1
.end method

.method public final q()I
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
