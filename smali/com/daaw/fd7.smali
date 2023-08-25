.class public final Lcom/daaw/fd7;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/cm7;)Lcom/daaw/yc7;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/cm7;->O()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance p0, Lcom/daaw/vc7;

    const/16 v0, 0x10

    invoke-direct {p0, v0}, Lcom/daaw/vc7;-><init>(I)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/cm7;->O()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    new-instance p0, Lcom/daaw/vc7;

    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/daaw/vc7;-><init>(I)V

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/cm7;->O()I

    move-result p0

    const/4 v0, 0x5

    if-ne p0, v0, :cond_2

    new-instance p0, Lcom/daaw/wc7;

    invoke-direct {p0}, Lcom/daaw/wc7;-><init>()V

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unrecognized HPKE AEAD identifier"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lcom/daaw/cm7;)Lcom/daaw/cd7;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/cm7;->Q()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance p0, Lcom/daaw/od7;

    new-instance v0, Lcom/daaw/xc7;

    const-string v1, "HmacSha256"

    invoke-direct {v0, v1}, Lcom/daaw/xc7;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/daaw/od7;-><init>(Lcom/daaw/xc7;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/cm7;->Q()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_1

    const/4 p0, 0x1

    invoke-static {p0}, Lcom/daaw/md7;->b(I)Lcom/daaw/md7;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/cm7;->Q()I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_2

    const/4 p0, 0x2

    invoke-static {p0}, Lcom/daaw/md7;->b(I)Lcom/daaw/md7;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/cm7;->Q()I

    move-result p0

    const/4 v0, 0x6

    if-ne p0, v0, :cond_3

    invoke-static {v1}, Lcom/daaw/md7;->b(I)Lcom/daaw/md7;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unrecognized HPKE KEM identifier"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Lcom/daaw/cm7;)Lcom/daaw/xc7;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/cm7;->P()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance p0, Lcom/daaw/xc7;

    const-string v0, "HmacSha256"

    invoke-direct {p0, v0}, Lcom/daaw/xc7;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/cm7;->P()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    new-instance p0, Lcom/daaw/xc7;

    const-string v0, "HmacSha384"

    invoke-direct {p0, v0}, Lcom/daaw/xc7;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/cm7;->P()I

    move-result p0

    const/4 v0, 0x5

    if-ne p0, v0, :cond_2

    new-instance p0, Lcom/daaw/xc7;

    const-string v0, "HmacSha512"

    invoke-direct {p0, v0}, Lcom/daaw/xc7;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unrecognized HPKE KDF identifier"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
