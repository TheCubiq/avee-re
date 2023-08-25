.class public Lcom/daaw/wc;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a([BII)Ljava/lang/String;
    .locals 1

    const-string v0, "ISO-8859-1"

    invoke-static {p0, p1, p2, v0}, Lcom/daaw/wc;->b([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b([BIILjava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ge p2, v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2, p3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    return-object v0
.end method

.method public static c([BII)Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "ISO-8859-1"

    invoke-static {p0, p1, p2, v0}, Lcom/daaw/wc;->b([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(BI)Z
    .locals 1

    const/4 v0, 0x1

    shl-int p1, v0, p1

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e([BII)[B
    .locals 2

    new-array v0, p2, [B

    if-lez p2, :cond_0

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    return-object v0
.end method

.method public static f([BII)I
    .locals 3

    move v0, p1

    :goto_0
    array-length v1, p0

    sub-int/2addr v1, p2

    if-gt v0, v1, :cond_3

    sub-int v1, v0, p1

    rem-int/2addr v1, p2

    if-nez v1, :cond_2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p2, :cond_1

    add-int v2, v0, v1

    aget-byte v2, p0, v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-ne v1, p2, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, -0x1

    :goto_3
    return v0
.end method

.method public static g([BII)I
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :cond_1
    :goto_0
    invoke-static {p0, p1, v0}, Lcom/daaw/wc;->f([BII)I

    move-result p0

    return p0
.end method

.method public static h(BI)I
    .locals 0

    and-int/lit16 p0, p0, 0xff

    if-gez p1, :cond_0

    neg-int p1, p1

    shl-int/2addr p0, p1

    return p0

    :cond_0
    if-lez p1, :cond_1

    shr-int/2addr p0, p1

    :cond_1
    return p0
.end method

.method public static i([B)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    add-int/lit8 v2, v2, -0x2

    const/4 v3, -0x1

    if-ge v0, v2, :cond_2

    aget-byte v2, p0, v0

    if-ne v2, v3, :cond_1

    add-int/lit8 v2, v0, 0x1

    aget-byte v2, p0, v2

    if-nez v2, :cond_1

    add-int/lit8 v2, v0, 0x2

    aget-byte v3, p0, v2

    const/16 v4, -0x20

    and-int/2addr v3, v4

    if-eq v3, v4, :cond_0

    aget-byte v2, p0, v2

    if-nez v2, :cond_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    array-length v0, p0

    const/4 v2, 0x1

    if-le v0, v2, :cond_3

    array-length v0, p0

    add-int/lit8 v0, v0, -0x2

    aget-byte v0, p0, v0

    if-ne v0, v3, :cond_3

    array-length v0, p0

    sub-int/2addr v0, v2

    aget-byte p0, p0, v0

    if-nez p0, :cond_3

    add-int/lit8 v1, v1, 0x1

    :cond_3
    return v1
.end method

.method public static j([B)[B
    .locals 8

    invoke-static {p0}, Lcom/daaw/wc;->i([B)I

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    array-length v1, p0

    sub-int/2addr v1, v0

    new-array v0, v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v4, v1, -0x1

    if-ge v2, v4, :cond_3

    aget-byte v4, p0, v3

    aput-byte v4, v0, v2

    aget-byte v4, p0, v3

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    add-int/lit8 v4, v3, 0x1

    aget-byte v5, p0, v4

    if-nez v5, :cond_2

    add-int/lit8 v5, v3, 0x2

    aget-byte v6, p0, v5

    const/16 v7, -0x20

    and-int/2addr v6, v7

    if-eq v6, v7, :cond_1

    aget-byte v5, p0, v5

    if-nez v5, :cond_2

    :cond_1
    move v3, v4

    :cond_2
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    aget-byte p0, p0, v3

    aput-byte p0, v0, v4

    return-object v0
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-le v1, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    return-object p0

    :cond_2
    if-gez v0, :cond_3

    const-string p0, ""

    return-object p0

    :cond_3
    const/4 v1, 0x0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static l(BBBB)I
    .locals 1

    and-int/lit16 p3, p3, 0xff

    const/4 v0, -0x8

    invoke-static {p2, v0}, Lcom/daaw/wc;->h(BI)I

    move-result p2

    add-int/2addr p3, p2

    const/16 p2, -0x10

    invoke-static {p1, p2}, Lcom/daaw/wc;->h(BI)I

    move-result p1

    add-int/2addr p3, p1

    const/16 p1, -0x18

    invoke-static {p0, p1}, Lcom/daaw/wc;->h(BI)I

    move-result p0

    add-int/2addr p3, p0

    return p3
.end method

.method public static m(BBBB)I
    .locals 1

    and-int/lit8 p3, p3, 0x7f

    int-to-byte p3, p3

    and-int/lit8 p2, p2, 0x7f

    int-to-byte p2, p2

    const/4 v0, -0x7

    invoke-static {p2, v0}, Lcom/daaw/wc;->h(BI)I

    move-result p2

    add-int/2addr p3, p2

    and-int/lit8 p1, p1, 0x7f

    int-to-byte p1, p1

    const/16 p2, -0xe

    invoke-static {p1, p2}, Lcom/daaw/wc;->h(BI)I

    move-result p1

    add-int/2addr p3, p1

    and-int/lit8 p0, p0, 0x7f

    int-to-byte p0, p0

    const/16 p1, -0x15

    invoke-static {p0, p1}, Lcom/daaw/wc;->h(BI)I

    move-result p0

    add-int/2addr p3, p0

    return p3
.end method
