.class public Lcom/daaw/b70;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field public b:Ljava/nio/ByteBuffer;

.field public c:Lcom/daaw/a70;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/b70;->a:[B

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/b70;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget v0, v0, Lcom/daaw/a70;->b:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Lcom/daaw/a70;
    .locals 2

    iget-object v0, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/b70;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/b70;->j()V

    invoke-virtual {p0}, Lcom/daaw/b70;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/b70;->h()V

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget v1, v0, Lcom/daaw/a70;->c:I

    if-gez v1, :cond_1

    const/4 v1, 0x1

    iput v1, v0, Lcom/daaw/a70;->b:I

    :cond_1
    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setData() before parseHeader()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    const/4 v1, 0x1

    iput v1, v0, Lcom/daaw/a70;->b:I

    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v0, v0, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    invoke-virtual {p0}, Lcom/daaw/b70;->m()I

    move-result v1

    iput v1, v0, Lcom/daaw/w60;->a:I

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v0, v0, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    invoke-virtual {p0}, Lcom/daaw/b70;->m()I

    move-result v1

    iput v1, v0, Lcom/daaw/w60;->b:I

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v0, v0, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    invoke-virtual {p0}, Lcom/daaw/b70;->m()I

    move-result v1

    iput v1, v0, Lcom/daaw/w60;->c:I

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v0, v0, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    invoke-virtual {p0}, Lcom/daaw/b70;->m()I

    move-result v1

    iput v1, v0, Lcom/daaw/w60;->d:I

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v0

    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    and-int/lit8 v6, v0, 0x7

    add-int/2addr v6, v3

    int-to-double v6, v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-int v4, v4

    iget-object v5, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v5, v5, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    iput-boolean v2, v5, Lcom/daaw/w60;->e:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0, v4}, Lcom/daaw/b70;->g(I)[I

    move-result-object v0

    iput-object v0, v5, Lcom/daaw/w60;->k:[I

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    iput-object v0, v5, Lcom/daaw/w60;->k:[I

    :goto_1
    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v0, v0, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    iget-object v1, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    iput v1, v0, Lcom/daaw/w60;->j:I

    invoke-virtual {p0}, Lcom/daaw/b70;->q()V

    invoke-virtual {p0}, Lcom/daaw/b70;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget v1, v0, Lcom/daaw/a70;->c:I

    add-int/2addr v1, v3

    iput v1, v0, Lcom/daaw/a70;->c:I

    iget-object v1, v0, Lcom/daaw/a70;->e:Ljava/util/List;

    iget-object v0, v0, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f()I
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v0

    iput v0, p0, Lcom/daaw/b70;->d:I

    const/4 v1, 0x0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget v0, p0, Lcom/daaw/b70;->d:I

    if-ge v1, v0, :cond_1

    sub-int/2addr v0, v1

    iget-object v2, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/daaw/b70;->a:[B

    invoke-virtual {v2, v3, v1, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v1, v0

    goto :goto_0

    :catch_0
    nop

    const/4 v2, 0x3

    const-string v3, "GifHeaderParser"

    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error Reading Block n: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " count: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " blockSize: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/daaw/b70;->d:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    const/4 v2, 0x1

    iput v2, v0, Lcom/daaw/a70;->b:I

    :cond_1
    return v1
.end method

.method public final g(I)[I
    .locals 9

    mul-int/lit8 v0, p1, 0x3

    new-array v0, v0, [B

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    const/16 v2, 0x100

    new-array v1, v2, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v5, v4, 0x1

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    add-int/lit8 v6, v5, 0x1

    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v7, v2, 0x1

    const/high16 v8, -0x1000000

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v3, v8

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v3, v4

    or-int/2addr v3, v5

    aput v3, v1, v2
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    move v3, v6

    move v2, v7

    goto :goto_0

    :catch_0
    iget-object p1, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    const/4 v0, 0x1

    iput v0, p1, Lcom/daaw/a70;->b:I

    :cond_0
    return-object v1
.end method

.method public final h()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_8

    invoke-virtual {p0}, Lcom/daaw/b70;->b()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v2

    const/16 v3, 0x21

    const/4 v4, 0x1

    if-eq v2, v3, :cond_3

    const/16 v3, 0x2c

    if-eq v2, v3, :cond_1

    const/16 v3, 0x3b

    if-eq v2, v3, :cond_0

    iget-object v2, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iput v4, v2, Lcom/daaw/a70;->b:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v3, v2, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    if-nez v3, :cond_2

    new-instance v3, Lcom/daaw/w60;

    invoke-direct {v3}, Lcom/daaw/w60;-><init>()V

    iput-object v3, v2, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/b70;->e()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v2

    if-eq v2, v4, :cond_7

    const/16 v3, 0xf9

    if-eq v2, v3, :cond_6

    const/16 v3, 0xfe

    if-eq v2, v3, :cond_7

    const/16 v3, 0xff

    if-eq v2, v3, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/daaw/b70;->f()I

    const-string v2, ""

    const/4 v3, 0x0

    :goto_1
    const/16 v4, 0xb

    if-ge v3, v4, :cond_5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/b70;->a:[B

    aget-byte v2, v2, v3

    int-to-char v2, v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    const-string v3, "NETSCAPE2.0"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0}, Lcom/daaw/b70;->l()V

    goto :goto_0

    :cond_6
    iget-object v2, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    new-instance v3, Lcom/daaw/w60;

    invoke-direct {v3}, Lcom/daaw/w60;-><init>()V

    iput-object v3, v2, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    invoke-virtual {p0}, Lcom/daaw/b70;->i()V

    goto :goto_0

    :cond_7
    :goto_2
    invoke-virtual {p0}, Lcom/daaw/b70;->p()V

    goto/16 :goto_0

    :cond_8
    return-void
.end method

.method public final i()V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v1, v1, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    and-int/lit8 v2, v0, 0x1c

    shr-int/lit8 v2, v2, 0x2

    iput v2, v1, Lcom/daaw/w60;->g:I

    const/4 v3, 0x1

    if-nez v2, :cond_0

    iput v3, v1, Lcom/daaw/w60;->g:I

    :cond_0
    and-int/2addr v0, v3

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iput-boolean v3, v1, Lcom/daaw/w60;->f:Z

    invoke-virtual {p0}, Lcom/daaw/b70;->m()I

    move-result v0

    const/4 v1, 0x3

    const/16 v2, 0xa

    if-ge v0, v1, :cond_2

    const/16 v0, 0xa

    :cond_2
    iget-object v1, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v1, v1, Lcom/daaw/a70;->d:Lcom/daaw/w60;

    mul-int/lit8 v0, v0, 0xa

    iput v0, v1, Lcom/daaw/w60;->i:I

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v0

    iput v0, v1, Lcom/daaw/w60;->h:I

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    return-void
.end method

.method public final j()V
    .locals 3

    const-string v0, ""

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x6

    if-ge v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v0

    int-to-char v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const-string v1, "GIF"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    const/4 v1, 0x1

    iput v1, v0, Lcom/daaw/a70;->b:I

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/b70;->k()V

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-boolean v0, v0, Lcom/daaw/a70;->h:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/b70;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget v1, v0, Lcom/daaw/a70;->i:I

    invoke-virtual {p0, v1}, Lcom/daaw/b70;->g(I)[I

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/a70;->a:[I

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iget-object v1, v0, Lcom/daaw/a70;->a:[I

    iget v2, v0, Lcom/daaw/a70;->j:I

    aget v1, v1, v2

    iput v1, v0, Lcom/daaw/a70;->l:I

    :cond_2
    return-void
.end method

.method public final k()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    invoke-virtual {p0}, Lcom/daaw/b70;->m()I

    move-result v1

    iput v1, v0, Lcom/daaw/a70;->f:I

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    invoke-virtual {p0}, Lcom/daaw/b70;->m()I

    move-result v1

    iput v1, v0, Lcom/daaw/a70;->g:I

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v1, Lcom/daaw/a70;->h:Z

    const/4 v2, 0x2

    and-int/lit8 v0, v0, 0x7

    shl-int v0, v2, v0

    iput v0, v1, Lcom/daaw/a70;->i:I

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v0

    iput v0, v1, Lcom/daaw/a70;->j:I

    iget-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v1

    iput v1, v0, Lcom/daaw/a70;->k:I

    return-void
.end method

.method public final l()V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/b70;->f()I

    iget-object v0, p0, Lcom/daaw/b70;->a:[B

    const/4 v1, 0x0

    aget-byte v1, v0, v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    aget-byte v1, v0, v2

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x2

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    iget-object v2, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    iput v0, v2, Lcom/daaw/a70;->m:I

    :cond_1
    iget v0, p0, Lcom/daaw/b70;->d:I

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/b70;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_2
    return-void
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    return v0
.end method

.method public final n()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/daaw/b70;->a:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    new-instance v0, Lcom/daaw/a70;

    invoke-direct {v0}, Lcom/daaw/a70;-><init>()V

    iput-object v0, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    iput v1, p0, Lcom/daaw/b70;->d:I

    return-void
.end method

.method public o([B)Lcom/daaw/b70;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/b70;->n()V

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iget-object p1, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lcom/daaw/b70;->c:Lcom/daaw/a70;

    const/4 v0, 0x2

    iput v0, p1, Lcom/daaw/a70;->b:I

    :goto_0
    return-object p0
.end method

.method public final p()V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/b70;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    if-gtz v0, :cond_0

    return-void
.end method

.method public final q()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/b70;->d()I

    invoke-virtual {p0}, Lcom/daaw/b70;->p()V

    return-void
.end method
