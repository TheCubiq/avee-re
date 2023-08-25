.class public final Lcom/daaw/a81;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/a81$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:[I

.field public c:[J

.field public d:[I

.field public e:[I

.field public f:[J

.field public g:[Lcom/daaw/sm1$a;

.field public h:[Lcom/google/android/exoplayer2/Format;

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z

.field public q:Lcom/google/android/exoplayer2/Format;

.field public r:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/daaw/a81;->a:I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/a81;->b:[I

    new-array v1, v0, [J

    iput-object v1, p0, Lcom/daaw/a81;->c:[J

    new-array v1, v0, [J

    iput-object v1, p0, Lcom/daaw/a81;->f:[J

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/a81;->e:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/a81;->d:[I

    new-array v1, v0, [Lcom/daaw/sm1$a;

    iput-object v1, p0, Lcom/daaw/a81;->g:[Lcom/daaw/sm1$a;

    new-array v0, v0, [Lcom/google/android/exoplayer2/Format;

    iput-object v0, p0, Lcom/daaw/a81;->h:[Lcom/google/android/exoplayer2/Format;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/daaw/a81;->m:J

    iput-wide v0, p0, Lcom/daaw/a81;->n:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a81;->p:Z

    iput-boolean v0, p0, Lcom/daaw/a81;->o:Z

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/a81;->r:I

    return-void
.end method

.method public declared-synchronized a(JZZ)I
    .locals 8

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/a81;->l:I

    invoke-virtual {p0, v0}, Lcom/daaw/a81;->r(I)I

    move-result v2

    invoke-virtual {p0}, Lcom/daaw/a81;->u()Z

    move-result v0

    const/4 v7, -0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/a81;->f:[J

    aget-wide v3, v0, v2

    cmp-long v0, p1, v3

    if-ltz v0, :cond_2

    iget-wide v0, p0, Lcom/daaw/a81;->n:J

    cmp-long v3, p1, v0

    if-lez v3, :cond_0

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    iget p4, p0, Lcom/daaw/a81;->i:I

    iget v0, p0, Lcom/daaw/a81;->l:I

    sub-int v3, p4, v0

    move-object v1, p0

    move-wide v4, p1

    move v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/a81;->k(IIJZ)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v7, :cond_1

    monitor-exit p0

    return v7

    :cond_1
    :try_start_1
    iget p2, p0, Lcom/daaw/a81;->l:I

    add-int/2addr p2, p1

    iput p2, p0, Lcom/daaw/a81;->l:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :cond_2
    :goto_0
    monitor-exit p0

    return v7

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/a81;->i:I

    iget v1, p0, Lcom/daaw/a81;->l:I

    sub-int v1, v0, v1

    iput v0, p0, Lcom/daaw/a81;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c(J)Z
    .locals 7

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/a81;->i:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-wide v3, p0, Lcom/daaw/a81;->m:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, p1, v3

    if-lez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    monitor-exit p0

    return v1

    :cond_1
    :try_start_1
    iget-wide v3, p0, Lcom/daaw/a81;->m:J

    iget v0, p0, Lcom/daaw/a81;->l:I

    invoke-virtual {p0, v0}, Lcom/daaw/a81;->p(I)J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v0, v3, p1

    if-ltz v0, :cond_2

    monitor-exit p0

    return v1

    :cond_2
    :try_start_2
    iget v0, p0, Lcom/daaw/a81;->i:I

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p0, v1}, Lcom/daaw/a81;->r(I)I

    move-result v1

    :cond_3
    :goto_0
    iget v3, p0, Lcom/daaw/a81;->l:I

    if-le v0, v3, :cond_4

    iget-object v3, p0, Lcom/daaw/a81;->f:[J

    aget-wide v4, v3, v1

    cmp-long v3, v4, p1

    if-ltz v3, :cond_4

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v1, -0x1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_3

    iget v1, p0, Lcom/daaw/a81;->a:I

    sub-int/2addr v1, v2

    goto :goto_0

    :cond_4
    iget p1, p0, Lcom/daaw/a81;->j:I

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/daaw/a81;->j(I)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized d(JIJILcom/daaw/sm1$a;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/a81;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    and-int/lit8 v0, p3, 0x1

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iput-boolean v1, p0, Lcom/daaw/a81;->o:Z

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/a81;->p:Z

    const/4 v2, 0x1

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/a81;->e(J)V

    iget v0, p0, Lcom/daaw/a81;->i:I

    invoke-virtual {p0, v0}, Lcom/daaw/a81;->r(I)I

    move-result v0

    iget-object v3, p0, Lcom/daaw/a81;->f:[J

    aput-wide p1, v3, v0

    iget-object p1, p0, Lcom/daaw/a81;->c:[J

    aput-wide p4, p1, v0

    iget-object p2, p0, Lcom/daaw/a81;->d:[I

    aput p6, p2, v0

    iget-object p2, p0, Lcom/daaw/a81;->e:[I

    aput p3, p2, v0

    iget-object p2, p0, Lcom/daaw/a81;->g:[Lcom/daaw/sm1$a;

    aput-object p7, p2, v0

    iget-object p2, p0, Lcom/daaw/a81;->h:[Lcom/google/android/exoplayer2/Format;

    iget-object p3, p0, Lcom/daaw/a81;->q:Lcom/google/android/exoplayer2/Format;

    aput-object p3, p2, v0

    iget-object p2, p0, Lcom/daaw/a81;->b:[I

    iget p3, p0, Lcom/daaw/a81;->r:I

    aput p3, p2, v0

    iget p2, p0, Lcom/daaw/a81;->i:I

    add-int/2addr p2, v2

    iput p2, p0, Lcom/daaw/a81;->i:I

    iget p3, p0, Lcom/daaw/a81;->a:I

    if-ne p2, p3, :cond_3

    add-int/lit16 p2, p3, 0x3e8

    new-array p4, p2, [I

    new-array p5, p2, [J

    new-array p6, p2, [J

    new-array p7, p2, [I

    new-array v0, p2, [I

    new-array v2, p2, [Lcom/daaw/sm1$a;

    new-array v3, p2, [Lcom/google/android/exoplayer2/Format;

    iget v4, p0, Lcom/daaw/a81;->k:I

    sub-int/2addr p3, v4

    invoke-static {p1, v4, p5, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/daaw/a81;->f:[J

    iget v4, p0, Lcom/daaw/a81;->k:I

    invoke-static {p1, v4, p6, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/daaw/a81;->e:[I

    iget v4, p0, Lcom/daaw/a81;->k:I

    invoke-static {p1, v4, p7, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/daaw/a81;->d:[I

    iget v4, p0, Lcom/daaw/a81;->k:I

    invoke-static {p1, v4, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/daaw/a81;->g:[Lcom/daaw/sm1$a;

    iget v4, p0, Lcom/daaw/a81;->k:I

    invoke-static {p1, v4, v2, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/daaw/a81;->h:[Lcom/google/android/exoplayer2/Format;

    iget v4, p0, Lcom/daaw/a81;->k:I

    invoke-static {p1, v4, v3, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/daaw/a81;->b:[I

    iget v4, p0, Lcom/daaw/a81;->k:I

    invoke-static {p1, v4, p4, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/daaw/a81;->k:I

    iget-object v4, p0, Lcom/daaw/a81;->c:[J

    invoke-static {v4, v1, p5, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, p0, Lcom/daaw/a81;->f:[J

    invoke-static {v4, v1, p6, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, p0, Lcom/daaw/a81;->e:[I

    invoke-static {v4, v1, p7, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, p0, Lcom/daaw/a81;->d:[I

    invoke-static {v4, v1, v0, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, p0, Lcom/daaw/a81;->g:[Lcom/daaw/sm1$a;

    invoke-static {v4, v1, v2, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, p0, Lcom/daaw/a81;->h:[Lcom/google/android/exoplayer2/Format;

    invoke-static {v4, v1, v3, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, p0, Lcom/daaw/a81;->b:[I

    invoke-static {v4, v1, p4, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p5, p0, Lcom/daaw/a81;->c:[J

    iput-object p6, p0, Lcom/daaw/a81;->f:[J

    iput-object p7, p0, Lcom/daaw/a81;->e:[I

    iput-object v0, p0, Lcom/daaw/a81;->d:[I

    iput-object v2, p0, Lcom/daaw/a81;->g:[Lcom/daaw/sm1$a;

    iput-object v3, p0, Lcom/daaw/a81;->h:[Lcom/google/android/exoplayer2/Format;

    iput-object p4, p0, Lcom/daaw/a81;->b:[I

    iput v1, p0, Lcom/daaw/a81;->k:I

    iget p1, p0, Lcom/daaw/a81;->a:I

    iput p1, p0, Lcom/daaw/a81;->i:I

    iput p2, p0, Lcom/daaw/a81;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(J)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/daaw/a81;->n:J

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/a81;->n:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final f(I)J
    .locals 4

    iget-wide v0, p0, Lcom/daaw/a81;->m:J

    invoke-virtual {p0, p1}, Lcom/daaw/a81;->p(I)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/a81;->m:J

    iget v0, p0, Lcom/daaw/a81;->i:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/a81;->i:I

    iget v1, p0, Lcom/daaw/a81;->j:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/daaw/a81;->j:I

    iget v1, p0, Lcom/daaw/a81;->k:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/daaw/a81;->k:I

    iget v2, p0, Lcom/daaw/a81;->a:I

    if-lt v1, v2, :cond_0

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/daaw/a81;->k:I

    :cond_0
    iget v1, p0, Lcom/daaw/a81;->l:I

    sub-int/2addr v1, p1

    iput v1, p0, Lcom/daaw/a81;->l:I

    if-gez v1, :cond_1

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/a81;->l:I

    :cond_1
    if-nez v0, :cond_3

    iget p1, p0, Lcom/daaw/a81;->k:I

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v2, p1

    :goto_0
    add-int/lit8 v2, v2, -0x1

    iget-object p1, p0, Lcom/daaw/a81;->c:[J

    aget-wide v0, p1, v2

    iget-object p1, p0, Lcom/daaw/a81;->d:[I

    aget p1, p1, v2

    int-to-long v2, p1

    add-long/2addr v0, v2

    return-wide v0

    :cond_3
    iget-object p1, p0, Lcom/daaw/a81;->c:[J

    iget v0, p0, Lcom/daaw/a81;->k:I

    aget-wide v0, p1, v0

    return-wide v0
.end method

.method public declared-synchronized g(JZZ)J
    .locals 10

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/a81;->i:I

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/daaw/a81;->f:[J

    iget v5, p0, Lcom/daaw/a81;->k:I

    aget-wide v6, v3, v5

    cmp-long v3, p1, v6

    if-gez v3, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p4, :cond_1

    iget p4, p0, Lcom/daaw/a81;->l:I

    if-eq p4, v0, :cond_1

    add-int/lit8 v0, p4, 0x1

    :cond_1
    move v6, v0

    move-object v4, p0

    move-wide v7, p1

    move v9, p3

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/a81;->k(IIJZ)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    monitor-exit p0

    return-wide v1

    :cond_2
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/daaw/a81;->f(I)J

    move-result-wide p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-wide p1

    :cond_3
    :goto_0
    monitor-exit p0

    return-wide v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized h()J
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/a81;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    monitor-exit p0

    return-wide v0

    :cond_0
    :try_start_1
    invoke-virtual {p0, v0}, Lcom/daaw/a81;->f(I)J

    move-result-wide v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized i()J
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/a81;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    monitor-exit p0

    return-wide v0

    :cond_0
    :try_start_1
    invoke-virtual {p0, v0}, Lcom/daaw/a81;->f(I)J

    move-result-wide v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public j(I)J
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/a81;->t()I

    move-result v0

    sub-int/2addr v0, p1

    const/4 p1, 0x1

    if-ltz v0, :cond_0

    iget v1, p0, Lcom/daaw/a81;->i:I

    iget v2, p0, Lcom/daaw/a81;->l:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/daaw/s6;->a(Z)V

    iget v1, p0, Lcom/daaw/a81;->i:I

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/a81;->i:I

    iget-wide v2, p0, Lcom/daaw/a81;->m:J

    invoke-virtual {p0, v1}, Lcom/daaw/a81;->p(I)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/a81;->n:J

    iget v0, p0, Lcom/daaw/a81;->i:I

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_1
    sub-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/daaw/a81;->r(I)I

    move-result p1

    iget-object v0, p0, Lcom/daaw/a81;->c:[J

    aget-wide v1, v0, p1

    iget-object v0, p0, Lcom/daaw/a81;->d:[I

    aget p1, v0, p1

    int-to-long v3, p1

    add-long/2addr v1, v3

    return-wide v1
.end method

.method public final k(IIJZ)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_3

    iget-object v3, p0, Lcom/daaw/a81;->f:[J

    aget-wide v4, v3, p1

    cmp-long v3, v4, p3

    if-gtz v3, :cond_3

    if-eqz p5, :cond_0

    iget-object v3, p0, Lcom/daaw/a81;->e:[I

    aget v3, v3, p1

    and-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_1

    :cond_0
    move v1, v2

    :cond_1
    add-int/lit8 p1, p1, 0x1

    iget v3, p0, Lcom/daaw/a81;->a:I

    if-ne p1, v3, :cond_2

    const/4 p1, 0x0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public declared-synchronized l(Lcom/google/android/exoplayer2/Format;)Z
    .locals 3

    monitor-enter p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    :try_start_0
    iput-boolean v0, p0, Lcom/daaw/a81;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iput-boolean v1, p0, Lcom/daaw/a81;->p:Z

    iget-object v2, p0, Lcom/daaw/a81;->q:Lcom/google/android/exoplayer2/Format;

    invoke-static {p1, v2}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    :try_start_2
    iput-object p1, p0, Lcom/daaw/a81;->q:Lcom/google/android/exoplayer2/Format;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lcom/daaw/a81;->j:I

    return v0
.end method

.method public declared-synchronized n()J
    .locals 3

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/a81;->i:I

    if-nez v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/a81;->f:[J

    iget v1, p0, Lcom/daaw/a81;->k:I

    aget-wide v1, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-wide v0, v1

    :goto_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized o()J
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/daaw/a81;->n:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final p(I)J
    .locals 7

    const-wide/high16 v0, -0x8000000000000000L

    if-nez p1, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, p1, -0x1

    invoke-virtual {p0, v2}, Lcom/daaw/a81;->r(I)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_3

    iget-object v4, p0, Lcom/daaw/a81;->f:[J

    aget-wide v5, v4, v2

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-object v4, p0, Lcom/daaw/a81;->e:[I

    aget v4, v4, v2

    and-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, -0x1

    const/4 v4, -0x1

    if-ne v2, v4, :cond_2

    iget v2, p0, Lcom/daaw/a81;->a:I

    add-int/lit8 v2, v2, -0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-wide v0
.end method

.method public q()I
    .locals 2

    iget v0, p0, Lcom/daaw/a81;->j:I

    iget v1, p0, Lcom/daaw/a81;->l:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final r(I)I
    .locals 1

    iget v0, p0, Lcom/daaw/a81;->k:I

    add-int/2addr v0, p1

    iget p1, p0, Lcom/daaw/a81;->a:I

    if-ge v0, p1, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr v0, p1

    :goto_0
    return v0
.end method

.method public declared-synchronized s()Lcom/google/android/exoplayer2/Format;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/a81;->p:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/a81;->q:Lcom/google/android/exoplayer2/Format;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public t()I
    .locals 2

    iget v0, p0, Lcom/daaw/a81;->j:I

    iget v1, p0, Lcom/daaw/a81;->i:I

    add-int/2addr v0, v1

    return v0
.end method

.method public declared-synchronized u()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/a81;->l:I

    iget v1, p0, Lcom/daaw/a81;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public v()I
    .locals 2

    iget v0, p0, Lcom/daaw/a81;->l:I

    invoke-virtual {p0, v0}, Lcom/daaw/a81;->r(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/a81;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/a81;->b:[I

    aget v0, v1, v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/daaw/a81;->r:I

    :goto_0
    return v0
.end method

.method public declared-synchronized w(Lcom/daaw/k30;Lcom/daaw/gq;ZZLcom/google/android/exoplayer2/Format;Lcom/daaw/a81$a;)I
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/a81;->u()Z

    move-result v0

    const/4 v1, -0x5

    const/4 v2, -0x3

    const/4 v3, -0x4

    if-nez v0, :cond_3

    if-eqz p4, :cond_0

    const/4 p1, 0x4

    invoke-virtual {p2, p1}, Lcom/daaw/rc;->l(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v3

    :cond_0
    :try_start_1
    iget-object p2, p0, Lcom/daaw/a81;->q:Lcom/google/android/exoplayer2/Format;

    if-eqz p2, :cond_2

    if-nez p3, :cond_1

    if-eq p2, p5, :cond_2

    :cond_1
    iput-object p2, p1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    :cond_2
    monitor-exit p0

    return v2

    :cond_3
    :try_start_2
    iget p4, p0, Lcom/daaw/a81;->l:I

    invoke-virtual {p0, p4}, Lcom/daaw/a81;->r(I)I

    move-result p4

    if-nez p3, :cond_6

    iget-object p3, p0, Lcom/daaw/a81;->h:[Lcom/google/android/exoplayer2/Format;

    aget-object p3, p3, p4

    if-eq p3, p5, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p2}, Lcom/daaw/gq;->q()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_5

    monitor-exit p0

    return v2

    :cond_5
    :try_start_3
    iget-object p1, p0, Lcom/daaw/a81;->f:[J

    aget-wide v0, p1, p4

    iput-wide v0, p2, Lcom/daaw/gq;->s:J

    iget-object p1, p0, Lcom/daaw/a81;->e:[I

    aget p1, p1, p4

    invoke-virtual {p2, p1}, Lcom/daaw/rc;->l(I)V

    iget-object p1, p0, Lcom/daaw/a81;->d:[I

    aget p1, p1, p4

    iput p1, p6, Lcom/daaw/a81$a;->a:I

    iget-object p1, p0, Lcom/daaw/a81;->c:[J

    aget-wide p2, p1, p4

    iput-wide p2, p6, Lcom/daaw/a81$a;->b:J

    iget-object p1, p0, Lcom/daaw/a81;->g:[Lcom/daaw/sm1$a;

    aget-object p1, p1, p4

    iput-object p1, p6, Lcom/daaw/a81$a;->c:Lcom/daaw/sm1$a;

    iget p1, p0, Lcom/daaw/a81;->l:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/a81;->l:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return v3

    :cond_6
    :goto_0
    :try_start_4
    iget-object p2, p0, Lcom/daaw/a81;->h:[Lcom/google/android/exoplayer2/Format;

    aget-object p2, p2, p4

    iput-object p2, p1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public x(Z)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/a81;->i:I

    iput v0, p0, Lcom/daaw/a81;->j:I

    iput v0, p0, Lcom/daaw/a81;->k:I

    iput v0, p0, Lcom/daaw/a81;->l:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a81;->o:Z

    const-wide/high16 v1, -0x8000000000000000L

    iput-wide v1, p0, Lcom/daaw/a81;->m:J

    iput-wide v1, p0, Lcom/daaw/a81;->n:J

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/a81;->q:Lcom/google/android/exoplayer2/Format;

    iput-boolean v0, p0, Lcom/daaw/a81;->p:Z

    :cond_0
    return-void
.end method

.method public declared-synchronized y()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lcom/daaw/a81;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized z(I)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/a81;->j:I

    if-gt v0, p1, :cond_0

    iget v1, p0, Lcom/daaw/a81;->i:I

    add-int/2addr v1, v0

    if-gt p1, v1, :cond_0

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/a81;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    :goto_0
    monitor-exit p0

    return p1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
