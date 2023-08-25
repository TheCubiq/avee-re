.class public Lcom/daaw/dl1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/daaw/el1;",
        ":",
        "Ljava/lang/Comparable<",
        "-TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private volatile synthetic _size:I

.field public a:[Lcom/daaw/el1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dl1;->_size:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/el1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-interface {p1, p0}, Lcom/daaw/el1;->f(Lcom/daaw/dl1;)V

    invoke-virtual {p0}, Lcom/daaw/dl1;->f()[Lcom/daaw/el1;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v2}, Lcom/daaw/dl1;->j(I)V

    aput-object p1, v0, v1

    invoke-interface {p1, v1}, Lcom/daaw/el1;->e(I)V

    invoke-virtual {p0, v1}, Lcom/daaw/dl1;->l(I)V

    return-void
.end method

.method public final b()Lcom/daaw/el1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dl1;->a:[Lcom/daaw/el1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    aget-object v0, v0, v1

    :goto_0
    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/daaw/dl1;->_size:I

    return v0
.end method

.method public final d()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e()Lcom/daaw/el1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/dl1;->b()Lcom/daaw/el1;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final f()[Lcom/daaw/el1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dl1;->a:[Lcom/daaw/el1;

    if-nez v0, :cond_0

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/daaw/el1;

    iput-object v0, p0, Lcom/daaw/dl1;->a:[Lcom/daaw/el1;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v1

    array-length v2, v0

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(this, newSize)"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lcom/daaw/el1;

    iput-object v0, p0, Lcom/daaw/dl1;->a:[Lcom/daaw/el1;

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final g(Lcom/daaw/el1;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Lcom/daaw/el1;->d()Lcom/daaw/dl1;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/daaw/el1;->b()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/dl1;->h(I)Lcom/daaw/el1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    :goto_0
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final h(I)Lcom/daaw/el1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dl1;->a:[Lcom/daaw/el1;

    invoke-static {v0}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v1

    const/4 v2, -0x1

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/daaw/dl1;->j(I)V

    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v1

    if-ge p1, v1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v1

    invoke-virtual {p0, p1, v1}, Lcom/daaw/dl1;->m(II)V

    add-int/lit8 v1, p1, -0x1

    div-int/lit8 v1, v1, 0x2

    if-lez p1, :cond_0

    aget-object v3, v0, p1

    invoke-static {v3}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Comparable;

    aget-object v4, v0, v1

    invoke-static {v4}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_0

    invoke-virtual {p0, p1, v1}, Lcom/daaw/dl1;->m(II)V

    invoke-virtual {p0, v1}, Lcom/daaw/dl1;->l(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/dl1;->k(I)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result p1

    aget-object p1, v0, p1

    invoke-static {p1}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Lcom/daaw/el1;->f(Lcom/daaw/dl1;)V

    invoke-interface {p1, v2}, Lcom/daaw/el1;->e(I)V

    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v2

    aput-object v1, v0, v2

    return-object p1
.end method

.method public final i()Lcom/daaw/el1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/dl1;->h(I)Lcom/daaw/el1;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final j(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/dl1;->_size:I

    return-void
.end method

.method public final k(I)V
    .locals 5

    :goto_0
    mul-int/lit8 v0, p1, 0x2

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/dl1;->a:[Lcom/daaw/el1;

    invoke-static {v1}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p0}, Lcom/daaw/dl1;->c()I

    move-result v3

    if-ge v2, v3, :cond_1

    aget-object v3, v1, v2

    invoke-static {v3}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Comparable;

    aget-object v4, v1, v0

    invoke-static {v4}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_1

    move v0, v2

    :cond_1
    aget-object v2, v1, p1

    invoke-static {v2}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Comparable;

    aget-object v1, v1, v0

    invoke-static {v1}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    invoke-interface {v2, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v1

    if-gtz v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0, p1, v0}, Lcom/daaw/dl1;->m(II)V

    move p1, v0

    goto :goto_0
.end method

.method public final l(I)V
    .locals 3

    :goto_0
    if-gtz p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/dl1;->a:[Lcom/daaw/el1;

    invoke-static {v0}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    add-int/lit8 v1, p1, -0x1

    div-int/lit8 v1, v1, 0x2

    aget-object v2, v0, v1

    invoke-static {v2}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Comparable;

    aget-object v0, v0, p1

    invoke-static {v0}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    invoke-interface {v2, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1, v1}, Lcom/daaw/dl1;->m(II)V

    move p1, v1

    goto :goto_0
.end method

.method public final m(II)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/dl1;->a:[Lcom/daaw/el1;

    invoke-static {v0}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    aget-object v1, v0, p2

    invoke-static {v1}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    aget-object v2, v0, p1

    invoke-static {v2}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    aput-object v1, v0, p1

    aput-object v2, v0, p2

    invoke-interface {v1, p1}, Lcom/daaw/el1;->e(I)V

    invoke-interface {v2, p2}, Lcom/daaw/el1;->e(I)V

    return-void
.end method
