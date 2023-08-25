.class public final Lcom/daaw/zp5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:[J

.field public b:[Ljava/lang/Object;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0xa

    new-array v0, p1, [J

    iput-object v0, p0, Lcom/daaw/zp5;->a:[J

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/zp5;->b:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/zp5;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()Ljava/lang/Object;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/zp5;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/daaw/zp5;->f()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c(J)Ljava/lang/Object;
    .locals 6

    monitor-enter p0

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget v1, p0, Lcom/daaw/zp5;->d:I

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/zp5;->a:[J

    iget v2, p0, Lcom/daaw/zp5;->c:I

    aget-wide v2, v1, v2

    sub-long v2, p1, v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/zp5;->f()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    :goto_1
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public final declared-synchronized d(JLjava/lang/Object;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/zp5;->d:I

    if-lez v0, :cond_0

    iget v1, p0, Lcom/daaw/zp5;->c:I

    iget-object v2, p0, Lcom/daaw/zp5;->b:[Ljava/lang/Object;

    array-length v2, v2

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, -0x1

    rem-int/2addr v1, v2

    iget-object v0, p0, Lcom/daaw/zp5;->a:[J

    aget-wide v1, v0, v1

    cmp-long v0, p1, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/zp5;->e()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/zp5;->b:[Ljava/lang/Object;

    array-length v0, v0

    iget v1, p0, Lcom/daaw/zp5;->d:I

    if-ge v1, v0, :cond_1

    goto :goto_0

    :cond_1
    add-int v1, v0, v0

    new-array v2, v1, [J

    new-array v1, v1, [Ljava/lang/Object;

    iget v3, p0, Lcom/daaw/zp5;->c:I

    sub-int/2addr v0, v3

    iget-object v4, p0, Lcom/daaw/zp5;->a:[J

    const/4 v5, 0x0

    invoke-static {v4, v3, v2, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, p0, Lcom/daaw/zp5;->b:[Ljava/lang/Object;

    iget v4, p0, Lcom/daaw/zp5;->c:I

    invoke-static {v3, v4, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v3, p0, Lcom/daaw/zp5;->c:I

    if-lez v3, :cond_2

    iget-object v4, p0, Lcom/daaw/zp5;->a:[J

    invoke-static {v4, v5, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, p0, Lcom/daaw/zp5;->b:[Ljava/lang/Object;

    iget v4, p0, Lcom/daaw/zp5;->c:I

    invoke-static {v3, v5, v1, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    iput-object v2, p0, Lcom/daaw/zp5;->a:[J

    iput-object v1, p0, Lcom/daaw/zp5;->b:[Ljava/lang/Object;

    iput v5, p0, Lcom/daaw/zp5;->c:I

    :goto_0
    iget v0, p0, Lcom/daaw/zp5;->c:I

    iget v1, p0, Lcom/daaw/zp5;->d:I

    iget-object v2, p0, Lcom/daaw/zp5;->b:[Ljava/lang/Object;

    add-int/2addr v0, v1

    array-length v3, v2

    rem-int/2addr v0, v3

    iget-object v3, p0, Lcom/daaw/zp5;->a:[J

    aput-wide p1, v3, v0

    aput-object p3, v2, v0

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/zp5;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized e()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lcom/daaw/zp5;->c:I

    iput v0, p0, Lcom/daaw/zp5;->d:I

    iget-object v0, p0, Lcom/daaw/zp5;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lcom/daaw/zp5;->d:I

    const/4 v1, 0x1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iget-object v0, p0, Lcom/daaw/zp5;->b:[Ljava/lang/Object;

    iget v2, p0, Lcom/daaw/zp5;->c:I

    aget-object v3, v0, v2

    const/4 v4, 0x0

    aput-object v4, v0, v2

    add-int/2addr v2, v1

    array-length v0, v0

    rem-int/2addr v2, v0

    iput v2, p0, Lcom/daaw/zp5;->c:I

    iget v0, p0, Lcom/daaw/zp5;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/zp5;->d:I

    return-object v3
.end method
