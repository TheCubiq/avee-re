.class public final Lcom/daaw/g26;
.super Lcom/daaw/sx5;
.source ""


# instance fields
.field public e:Lcom/daaw/pa6;

.field public f:[B

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/sx5;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p0, Lcom/daaw/g26;->h:I

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v0, p0, Lcom/daaw/g26;->f:[B

    invoke-static {v0}, Lcom/daaw/it5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/daaw/g26;->g:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/daaw/g26;->g:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/daaw/g26;->g:I

    iget p1, p0, Lcom/daaw/g26;->h:I

    sub-int/2addr p1, p3

    iput p1, p0, Lcom/daaw/g26;->h:I

    invoke-virtual {p0, p3}, Lcom/daaw/sx5;->c(I)V

    return p3
.end method

.method public final g(Lcom/daaw/pa6;)J
    .locals 7

    invoke-virtual {p0, p1}, Lcom/daaw/sx5;->l(Lcom/daaw/pa6;)V

    iput-object p1, p0, Lcom/daaw/g26;->e:Lcom/daaw/pa6;

    iget-object v0, p1, Lcom/daaw/pa6;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "data"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Unsupported scheme: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/daaw/uo4;->e(ZLjava/lang/Object;)V

    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v1

    const-string v2, ","

    invoke-static {v1, v2}, Lcom/daaw/it5;->H(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-ne v2, v4, :cond_4

    const/4 v0, 0x1

    aget-object v0, v1, v0

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const-string v4, ";base64"

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/g26;->f:[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Error while parsing Base64 encoded string: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/dl3;->b(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_0
    sget-object v1, Lcom/daaw/cy6;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/it5;->B(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/g26;->f:[B

    :goto_0
    iget-wide v0, p1, Lcom/daaw/pa6;->f:J

    iget-object v2, p0, Lcom/daaw/g26;->f:[B

    array-length v2, v2

    int-to-long v4, v2

    cmp-long v6, v0, v4

    if-gtz v6, :cond_3

    long-to-int v1, v0

    iput v1, p0, Lcom/daaw/g26;->g:I

    sub-int/2addr v2, v1

    iput v2, p0, Lcom/daaw/g26;->h:I

    iget-wide v0, p1, Lcom/daaw/pa6;->g:J

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-eqz v5, :cond_1

    int-to-long v5, v2

    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    iput v1, p0, Lcom/daaw/g26;->h:I

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/sx5;->m(Lcom/daaw/pa6;)V

    iget-wide v0, p1, Lcom/daaw/pa6;->g:J

    cmp-long p1, v0, v3

    if-eqz p1, :cond_2

    return-wide v0

    :cond_2
    iget p1, p0, Lcom/daaw/g26;->h:I

    int-to-long v0, p1

    return-wide v0

    :cond_3
    iput-object v3, p0, Lcom/daaw/g26;->f:[B

    new-instance p1, Lcom/daaw/s56;

    const/16 v0, 0x7d8

    invoke-direct {p1, v0}, Lcom/daaw/s56;-><init>(I)V

    throw p1

    :cond_4
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Unexpected URI format: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lcom/daaw/dl3;->b(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g26;->e:Lcom/daaw/pa6;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/daaw/pa6;->a:Landroid/net/Uri;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzd()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/g26;->f:[B

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, Lcom/daaw/g26;->f:[B

    invoke-virtual {p0}, Lcom/daaw/sx5;->k()V

    :cond_0
    iput-object v1, p0, Lcom/daaw/g26;->e:Lcom/daaw/pa6;

    return-void
.end method
