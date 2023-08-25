.class public Lcom/daaw/ld0;
.super Lcom/daaw/md0;
.source ""


# direct methods
.method public constructor <init>(Z[B)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/md0;-><init>(Z[B)V

    return-void
.end method


# virtual methods
.method public b([B)V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x1

    :try_start_0
    invoke-static {p1, v1, v0}, Lcom/daaw/wc;->a([BII)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "unknown"

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "image/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/md0;->b:Ljava/lang/String;

    const/4 v0, 0x4

    aget-byte v0, p1, v0

    iput-byte v0, p0, Lcom/daaw/md0;->c:B

    const/4 v0, 0x0

    aget-byte v2, p1, v0

    const/4 v3, 0x5

    invoke-static {p1, v3, v2}, Lcom/daaw/wc;->g([BII)I

    move-result v2

    if-ltz v2, :cond_0

    new-instance v1, Lcom/daaw/xw;

    aget-byte v0, p1, v0

    add-int/lit8 v4, v2, -0x5

    invoke-static {p1, v3, v4}, Lcom/daaw/wc;->e([BII)[B

    move-result-object v3

    invoke-direct {v1, v0, v3}, Lcom/daaw/xw;-><init>(B[B)V

    iput-object v1, p0, Lcom/daaw/md0;->d:Lcom/daaw/xw;

    invoke-virtual {v1}, Lcom/daaw/xw;->e()[B

    move-result-object v0

    array-length v0, v0

    add-int v1, v2, v0

    goto :goto_1

    :cond_0
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
