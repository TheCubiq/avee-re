.class public final Lcom/daaw/nw8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:[Lcom/daaw/gw8;


# direct methods
.method public constructor <init>(ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/nw8;->c:I

    const/16 p1, 0x64

    new-array p1, p1, [Lcom/daaw/gw8;

    iput-object p1, p0, Lcom/daaw/nw8;->d:[Lcom/daaw/gw8;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/nw8;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/high16 v1, 0x10000

    mul-int v0, v0, v1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()Lcom/daaw/gw8;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/nw8;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/nw8;->b:I

    iget v0, p0, Lcom/daaw/nw8;->c:I

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/daaw/nw8;->d:[Lcom/daaw/gw8;

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/nw8;->c:I

    aget-object v2, v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x0

    :try_start_1
    aput-object v3, v1, v0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/daaw/gw8;

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lcom/daaw/gw8;-><init>([BI)V

    iget v0, p0, Lcom/daaw/nw8;->b:I

    iget-object v1, p0, Lcom/daaw/nw8;->d:[Lcom/daaw/gw8;

    array-length v3, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt v0, v3, :cond_1

    :goto_0
    monitor-exit p0

    return-object v2

    :cond_1
    add-int/2addr v3, v3

    :try_start_2
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/gw8;

    iput-object v0, p0, Lcom/daaw/nw8;->d:[Lcom/daaw/gw8;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c(Lcom/daaw/gw8;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/nw8;->d:[Lcom/daaw/gw8;

    iget v1, p0, Lcom/daaw/nw8;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/nw8;->c:I

    aput-object p1, v0, v1

    iget p1, p0, Lcom/daaw/nw8;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/nw8;->b:I

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized d(Lcom/daaw/hw8;)V
    .locals 3

    monitor-enter p0

    :goto_0
    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/nw8;->d:[Lcom/daaw/gw8;

    iget v1, p0, Lcom/daaw/nw8;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/nw8;->c:I

    invoke-interface {p1}, Lcom/daaw/hw8;->zzc()Lcom/daaw/gw8;

    move-result-object v2

    aput-object v2, v0, v1

    iget v0, p0, Lcom/daaw/nw8;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/nw8;->b:I

    invoke-interface {p1}, Lcom/daaw/hw8;->zzd()Lcom/daaw/hw8;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final declared-synchronized e()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/daaw/nw8;->f(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized f(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/nw8;->a:I

    iput p1, p0, Lcom/daaw/nw8;->a:I

    if-ge p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/nw8;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized g()V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iget v1, p0, Lcom/daaw/nw8;->a:I

    const/high16 v2, 0x10000

    invoke-static {v1, v2}, Lcom/daaw/it5;->O(II)I

    move-result v1

    iget v2, p0, Lcom/daaw/nw8;->b:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, Lcom/daaw/nw8;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v0, v1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/daaw/nw8;->d:[Lcom/daaw/gw8;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iput v0, p0, Lcom/daaw/nw8;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
