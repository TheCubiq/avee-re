.class public Lcom/daaw/md0;
.super Lcom/daaw/k;
.source ""


# instance fields
.field public b:Ljava/lang/String;

.field public c:B

.field public d:Lcom/daaw/xw;

.field public e:[B


# direct methods
.method public constructor <init>(Z[B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/k;-><init>(Z)V

    invoke-virtual {p0, p2}, Lcom/daaw/k;->a([B)V

    return-void
.end method


# virtual methods
.method public b([B)V
    .locals 5

    const/4 v0, 0x1

    invoke-static {p1, v0, v0}, Lcom/daaw/wc;->f([BII)I

    move-result v1

    const-string v2, "image/unknown"

    if-ltz v1, :cond_0

    add-int/lit8 v3, v1, -0x1

    :try_start_0
    invoke-static {p1, v0, v3}, Lcom/daaw/wc;->a([BII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/md0;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    iput-object v2, p0, Lcom/daaw/md0;->b:Ljava/lang/String;

    :goto_0
    add-int/lit8 v0, v1, 0x1

    aget-byte v0, p1, v0

    iput-byte v0, p0, Lcom/daaw/md0;->c:B

    add-int/lit8 v1, v1, 0x2

    const/4 v0, 0x0

    aget-byte v2, p1, v0

    invoke-static {p1, v1, v2}, Lcom/daaw/wc;->g([BII)I

    move-result v2

    if-ltz v2, :cond_1

    new-instance v3, Lcom/daaw/xw;

    aget-byte v0, p1, v0

    sub-int v4, v2, v1

    invoke-static {p1, v1, v4}, Lcom/daaw/wc;->e([BII)[B

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lcom/daaw/xw;-><init>(B[B)V

    iput-object v3, p0, Lcom/daaw/md0;->d:Lcom/daaw/xw;

    invoke-virtual {v3}, Lcom/daaw/xw;->e()[B

    move-result-object v0

    array-length v0, v0

    add-int v1, v2, v0

    goto :goto_1

    :cond_1
    new-instance v2, Lcom/daaw/xw;

    aget-byte v0, p1, v0

    const-string v3, ""

    invoke-direct {v2, v0, v3}, Lcom/daaw/xw;-><init>(BLjava/lang/String;)V

    iput-object v2, p0, Lcom/daaw/md0;->d:Lcom/daaw/xw;

    :goto_1
    array-length v0, p1

    sub-int/2addr v0, v1

    invoke-static {p1, v1, v0}, Lcom/daaw/wc;->e([BII)[B

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/md0;->e:[B

    return-void
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/md0;->e:[B

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    check-cast p1, Lcom/daaw/md0;

    iget-object v1, p0, Lcom/daaw/md0;->d:Lcom/daaw/xw;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/daaw/md0;->d:Lcom/daaw/xw;

    if-eqz v1, :cond_4

    return v2

    :cond_3
    iget-object v3, p1, Lcom/daaw/md0;->d:Lcom/daaw/xw;

    invoke-virtual {v1, v3}, Lcom/daaw/xw;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/daaw/md0;->e:[B

    iget-object v3, p1, Lcom/daaw/md0;->e:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/daaw/md0;->b:Ljava/lang/String;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/daaw/md0;->b:Ljava/lang/String;

    if-eqz v1, :cond_7

    return v2

    :cond_6
    iget-object v3, p1, Lcom/daaw/md0;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-byte v1, p0, Lcom/daaw/md0;->c:B

    iget-byte p1, p1, Lcom/daaw/md0;->c:B

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 3

    invoke-super {p0}, Lcom/daaw/k;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/md0;->d:Lcom/daaw/xw;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/xw;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/md0;->e:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/md0;->b:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/daaw/md0;->c:B

    add-int/2addr v0, v1

    return v0
.end method
