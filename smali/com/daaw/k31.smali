.class public Lcom/daaw/k31;
.super Ljava/io/FilterInputStream;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/k31$a;
    }
.end annotation


# instance fields
.field public volatile p:[B

.field public q:I

.field public r:I

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;[B)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/k31;->s:I

    if-eqz p2, :cond_0

    array-length p1, p2

    if-eqz p1, :cond_0

    iput-object p2, p0, Lcom/daaw/k31;->p:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "buffer is null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static q()Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "BufferedInputStream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public declared-synchronized available()I
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v1, p0, Lcom/daaw/k31;->p:[B

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/daaw/k31;->q:I

    iget v2, p0, Lcom/daaw/k31;->t:I

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v1, v0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/daaw/k31;->q()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public close()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/k31;->p:[B

    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iput-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void
.end method

.method public final d(Ljava/io/InputStream;[B)I
    .locals 5

    iget v0, p0, Lcom/daaw/k31;->s:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_6

    iget v3, p0, Lcom/daaw/k31;->t:I

    sub-int/2addr v3, v0

    iget v4, p0, Lcom/daaw/k31;->r:I

    if-lt v3, v4, :cond_0

    goto :goto_3

    :cond_0
    if-nez v0, :cond_3

    array-length v1, p2

    if-le v4, v1, :cond_3

    iget v1, p0, Lcom/daaw/k31;->q:I

    array-length v3, p2

    if-ne v1, v3, :cond_3

    array-length v0, p2

    mul-int/lit8 v0, v0, 0x2

    if-le v0, v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v0

    :goto_0
    const/4 v0, 0x3

    const-string v1, "BufferedIs"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "allocate buffer of length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_2
    new-array v0, v4, [B

    array-length v1, p2

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/daaw/k31;->p:[B

    move-object p2, v0

    goto :goto_1

    :cond_3
    if-lez v0, :cond_4

    array-length v1, p2

    sub-int/2addr v1, v0

    invoke-static {p2, v0, p2, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    :goto_1
    iget v0, p0, Lcom/daaw/k31;->t:I

    iget v1, p0, Lcom/daaw/k31;->s:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/k31;->t:I

    iput v2, p0, Lcom/daaw/k31;->s:I

    iput v2, p0, Lcom/daaw/k31;->q:I

    array-length v1, p2

    sub-int/2addr v1, v0

    invoke-virtual {p1, p2, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    iget p2, p0, Lcom/daaw/k31;->t:I

    if-gtz p1, :cond_5

    goto :goto_2

    :cond_5
    add-int/2addr p2, p1

    :goto_2
    iput p2, p0, Lcom/daaw/k31;->q:I

    return p1

    :cond_6
    :goto_3
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result p1

    if-lez p1, :cond_7

    iput v1, p0, Lcom/daaw/k31;->s:I

    iput v2, p0, Lcom/daaw/k31;->t:I

    iput p1, p0, Lcom/daaw/k31;->q:I

    :cond_7
    return p1
.end method

.method public declared-synchronized mark(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/k31;->r:I

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/k31;->r:I

    iget p1, p0, Lcom/daaw/k31;->t:I

    iput p1, p0, Lcom/daaw/k31;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public declared-synchronized n()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/k31;->p:[B

    array-length v0, v0

    iput v0, p0, Lcom/daaw/k31;->r:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized read()I
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/k31;->p:[B

    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    iget v2, p0, Lcom/daaw/k31;->t:I

    iget v3, p0, Lcom/daaw/k31;->q:I

    const/4 v4, -0x1

    if-lt v2, v3, :cond_0

    invoke-virtual {p0, v1, v0}, Lcom/daaw/k31;->d(Ljava/io/InputStream;[B)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v4, :cond_0

    monitor-exit p0

    return v4

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/daaw/k31;->p:[B

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/daaw/k31;->p:[B

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/daaw/k31;->q()Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_2
    :goto_0
    iget v1, p0, Lcom/daaw/k31;->q:I

    iget v2, p0, Lcom/daaw/k31;->t:I

    sub-int/2addr v1, v2

    if-lez v1, :cond_3

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Lcom/daaw/k31;->t:I

    aget-byte v0, v0, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    and-int/lit16 v0, v0, 0xff

    monitor-exit p0

    return v0

    :cond_3
    monitor-exit p0

    return v4

    :cond_4
    :try_start_2
    invoke-static {}, Lcom/daaw/k31;->q()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized read([BII)I
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/k31;->p:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_10

    if-nez p3, :cond_0

    const/4 p1, 0x0

    monitor-exit p0

    return p1

    :cond_0
    :try_start_1
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v1, :cond_f

    iget v2, p0, Lcom/daaw/k31;->t:I

    iget v3, p0, Lcom/daaw/k31;->q:I

    if-ge v2, v3, :cond_4

    sub-int v4, v3, v2

    if-lt v4, p3, :cond_1

    move v3, p3

    goto :goto_0

    :cond_1
    sub-int/2addr v3, v2

    :goto_0
    invoke-static {v0, v2, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Lcom/daaw/k31;->t:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/daaw/k31;->t:I

    if-eq v3, p3, :cond_3

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr p2, v3

    sub-int v2, p3, v3

    goto :goto_2

    :cond_3
    :goto_1
    monitor-exit p0

    return v3

    :cond_4
    move v2, p3

    :goto_2
    :try_start_2
    iget v3, p0, Lcom/daaw/k31;->s:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_6

    array-length v3, v0

    if-lt v2, v3, :cond_6

    invoke-virtual {v1, p1, p2, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v3, v4, :cond_c

    if-ne v2, p3, :cond_5

    goto :goto_3

    :cond_5
    sub-int v4, p3, v2

    :goto_3
    monitor-exit p0

    return v4

    :cond_6
    :try_start_3
    invoke-virtual {p0, v1, v0}, Lcom/daaw/k31;->d(Ljava/io/InputStream;[B)I

    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v3, v4, :cond_8

    if-ne v2, p3, :cond_7

    goto :goto_4

    :cond_7
    sub-int v4, p3, v2

    :goto_4
    monitor-exit p0

    return v4

    :cond_8
    :try_start_4
    iget-object v3, p0, Lcom/daaw/k31;->p:[B

    if-eq v0, v3, :cond_a

    iget-object v0, p0, Lcom/daaw/k31;->p:[B

    if-eqz v0, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {}, Lcom/daaw/k31;->q()Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_a
    :goto_5
    iget v3, p0, Lcom/daaw/k31;->q:I

    iget v4, p0, Lcom/daaw/k31;->t:I

    sub-int v5, v3, v4

    if-lt v5, v2, :cond_b

    move v3, v2

    goto :goto_6

    :cond_b
    sub-int/2addr v3, v4

    :goto_6
    invoke-static {v0, v4, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v4, p0, Lcom/daaw/k31;->t:I

    add-int/2addr v4, v3

    iput v4, p0, Lcom/daaw/k31;->t:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_c
    sub-int/2addr v2, v3

    if-nez v2, :cond_d

    monitor-exit p0

    return p3

    :cond_d
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v4, :cond_e

    sub-int/2addr p3, v2

    monitor-exit p0

    return p3

    :cond_e
    add-int/2addr p2, v3

    goto :goto_2

    :cond_f
    :try_start_6
    invoke-static {}, Lcom/daaw/k31;->q()Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_10
    invoke-static {}, Lcom/daaw/k31;->q()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_8

    :goto_7
    throw p1

    :goto_8
    goto :goto_7
.end method

.method public declared-synchronized reset()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/k31;->p:[B

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    iget v1, p0, Lcom/daaw/k31;->s:I

    if-eq v0, v1, :cond_0

    iput v1, p0, Lcom/daaw/k31;->t:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Lcom/daaw/k31$a;

    const-string v1, "Mark has been invalidated"

    invoke-direct {v0, v1}, Lcom/daaw/k31$a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized skip(J)J
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/k31;->p:[B

    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_6

    const-wide/16 v2, 0x1

    cmp-long v4, p1, v2

    if-gez v4, :cond_0

    const-wide/16 p1, 0x0

    monitor-exit p0

    return-wide p1

    :cond_0
    if-eqz v1, :cond_5

    :try_start_1
    iget v2, p0, Lcom/daaw/k31;->q:I

    iget v3, p0, Lcom/daaw/k31;->t:I

    sub-int v4, v2, v3

    int-to-long v4, v4

    cmp-long v6, v4, p1

    if-ltz v6, :cond_1

    int-to-long v0, v3

    add-long/2addr v0, p1

    long-to-int v1, v0

    iput v1, p0, Lcom/daaw/k31;->t:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-wide p1

    :cond_1
    sub-int v3, v2, v3

    int-to-long v3, v3

    :try_start_2
    iput v2, p0, Lcom/daaw/k31;->t:I

    iget v2, p0, Lcom/daaw/k31;->s:I

    const/4 v5, -0x1

    if-eq v2, v5, :cond_4

    iget v2, p0, Lcom/daaw/k31;->r:I

    int-to-long v6, v2

    cmp-long v2, p1, v6

    if-gtz v2, :cond_4

    invoke-virtual {p0, v1, v0}, Lcom/daaw/k31;->d(Ljava/io/InputStream;[B)I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v0, v5, :cond_2

    monitor-exit p0

    return-wide v3

    :cond_2
    :try_start_3
    iget v0, p0, Lcom/daaw/k31;->q:I

    iget v1, p0, Lcom/daaw/k31;->t:I

    sub-int v2, v0, v1

    int-to-long v5, v2

    sub-long v7, p1, v3

    cmp-long v2, v5, v7

    if-ltz v2, :cond_3

    int-to-long v0, v1

    add-long/2addr v0, v7

    long-to-int v1, v0

    iput v1, p0, Lcom/daaw/k31;->t:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-wide p1

    :cond_3
    int-to-long p1, v0

    add-long/2addr v3, p1

    int-to-long p1, v1

    sub-long/2addr v3, p1

    :try_start_4
    iput v0, p0, Lcom/daaw/k31;->t:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-wide v3

    :cond_4
    sub-long/2addr p1, v3

    :try_start_5
    invoke-virtual {v1, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    add-long/2addr v3, p1

    monitor-exit p0

    return-wide v3

    :cond_5
    :try_start_6
    invoke-static {}, Lcom/daaw/k31;->q()Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_6
    invoke-static {}, Lcom/daaw/k31;->q()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
