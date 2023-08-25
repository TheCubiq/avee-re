.class public final Lcom/daaw/o42;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field public final b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o42;->a:[B

    array-length p1, p1

    iput p1, p0, Lcom/daaw/o42;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Lcom/daaw/o42;->c:I

    mul-int/lit8 v0, v0, 0x8

    iget v1, p0, Lcom/daaw/o42;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final b(I)I
    .locals 6

    iget v0, p0, Lcom/daaw/o42;->c:I

    iget v1, p0, Lcom/daaw/o42;->d:I

    rsub-int/lit8 v1, v1, 0x8

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v2, v0, 0x1

    iget-object v3, p0, Lcom/daaw/o42;->a:[B

    aget-byte v0, v3, v0

    const/16 v3, 0xff

    and-int/2addr v0, v3

    iget v4, p0, Lcom/daaw/o42;->d:I

    shr-int/2addr v0, v4

    rsub-int/lit8 v4, v1, 0x8

    shr-int v4, v3, v4

    and-int/2addr v0, v4

    :goto_0
    if-ge v1, p1, :cond_0

    add-int/lit8 v4, v2, 0x1

    iget-object v5, p0, Lcom/daaw/o42;->a:[B

    aget-byte v2, v5, v2

    and-int/2addr v2, v3

    shl-int/2addr v2, v1

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x8

    move v2, v4

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/o42;->c(I)V

    const/4 v1, -0x1

    rsub-int/lit8 p1, p1, 0x20

    ushr-int p1, v1, p1

    and-int/2addr p1, v0

    return p1
.end method

.method public final c(I)V
    .locals 4

    div-int/lit8 v0, p1, 0x8

    iget v1, p0, Lcom/daaw/o42;->c:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/o42;->c:I

    iget v2, p0, Lcom/daaw/o42;->d:I

    mul-int/lit8 v0, v0, 0x8

    sub-int/2addr p1, v0

    add-int/2addr v2, p1

    iput v2, p0, Lcom/daaw/o42;->d:I

    const/4 p1, 0x7

    if-le v2, p1, :cond_0

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/o42;->c:I

    add-int/lit8 v2, v2, -0x8

    iput v2, p0, Lcom/daaw/o42;->d:I

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x1

    if-ltz v1, :cond_2

    iget v3, p0, Lcom/daaw/o42;->b:I

    if-lt v1, v3, :cond_1

    if-ne v1, v3, :cond_2

    if-nez v2, :cond_2

    :cond_1
    const/4 p1, 0x1

    :cond_2
    invoke-static {p1}, Lcom/daaw/uo4;->f(Z)V

    return-void
.end method

.method public final d()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/o42;->a:[B

    iget v1, p0, Lcom/daaw/o42;->c:I

    aget-byte v0, v0, v1

    iget v1, p0, Lcom/daaw/o42;->d:I

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lcom/daaw/o42;->c(I)V

    and-int/lit16 v0, v0, 0xff

    shr-int/2addr v0, v1

    and-int/2addr v0, v2

    if-eq v2, v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v2
.end method
