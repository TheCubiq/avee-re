.class public final Lcom/daaw/ms2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final g:[B


# instance fields
.field public final a:Lcom/daaw/kx2;

.field public final b:J

.field public c:J

.field public d:[B

.field public e:I

.field public f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1000

    new-array v0, v0, [B

    sput-object v0, Lcom/daaw/ms2;->g:[B

    return-void
.end method

.method public constructor <init>(Lcom/daaw/kx2;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ms2;->a:Lcom/daaw/kx2;

    iput-wide p2, p0, Lcom/daaw/ms2;->c:J

    iput-wide p4, p0, Lcom/daaw/ms2;->b:J

    const/high16 p1, 0x10000

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/daaw/ms2;->d:[B

    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 7

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ms2;->k([BII)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/ms2;->j([BIIIZ)I

    move-result v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/ms2;->m(I)V

    return v0
.end method

.method public final b(I)I
    .locals 7

    invoke-virtual {p0, p1}, Lcom/daaw/ms2;->l(I)I

    move-result v0

    if-nez v0, :cond_0

    sget-object v2, Lcom/daaw/ms2;->g:[B

    const/4 v3, 0x0

    const/16 v0, 0x1000

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/ms2;->j([BIIIZ)I

    move-result v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/ms2;->m(I)V

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ms2;->b:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ms2;->c:J

    return-wide v0
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ms2;->e:I

    return-void
.end method

.method public final f(IZ)Z
    .locals 6

    iget p2, p0, Lcom/daaw/ms2;->e:I

    add-int/2addr p2, p1

    iget-object v0, p0, Lcom/daaw/ms2;->d:[B

    array-length v0, v0

    if-le p2, v0, :cond_0

    add-int/2addr v0, v0

    const/high16 v1, 0x10000

    add-int/2addr v1, p2

    const/high16 v2, 0x80000

    add-int/2addr p2, v2

    invoke-static {v0, v1, p2}, Lcom/daaw/pz2;->e(III)I

    move-result p2

    iget-object v0, p0, Lcom/daaw/ms2;->d:[B

    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/ms2;->d:[B

    :cond_0
    iget p2, p0, Lcom/daaw/ms2;->f:I

    iget v0, p0, Lcom/daaw/ms2;->e:I

    sub-int/2addr p2, v0

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    move v4, p2

    :cond_1
    if-ge v4, p1, :cond_2

    iget-object v1, p0, Lcom/daaw/ms2;->d:[B

    iget v2, p0, Lcom/daaw/ms2;->e:I

    const/4 v5, 0x0

    move-object v0, p0

    move v3, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/ms2;->j([BIIIZ)I

    move-result v4

    const/4 p2, -0x1

    if-ne v4, p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_2
    iget p2, p0, Lcom/daaw/ms2;->e:I

    add-int/2addr p2, p1

    iput p2, p0, Lcom/daaw/ms2;->e:I

    iget p1, p0, Lcom/daaw/ms2;->f:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/ms2;->f:I

    const/4 p1, 0x1

    return p1
.end method

.method public final g([BIIZ)Z
    .locals 1

    const/4 p4, 0x0

    invoke-virtual {p0, p3, p4}, Lcom/daaw/ms2;->f(IZ)Z

    move-result v0

    if-nez v0, :cond_0

    return p4

    :cond_0
    iget-object p4, p0, Lcom/daaw/ms2;->d:[B

    iget v0, p0, Lcom/daaw/ms2;->e:I

    sub-int/2addr v0, p3

    invoke-static {p4, v0, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p1, 0x1

    return p1
.end method

.method public final h([BIIZ)Z
    .locals 7

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ms2;->k([BII)I

    move-result v0

    move v5, v0

    :goto_0
    const/4 v0, -0x1

    if-ge v5, p3, :cond_0

    if-eq v5, v0, :cond_0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v6, p4

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/ms2;->j([BIIIZ)I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v5}, Lcom/daaw/ms2;->m(I)V

    if-eq v5, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final i(IZ)Z
    .locals 6

    invoke-virtual {p0, p1}, Lcom/daaw/ms2;->l(I)I

    move-result p2

    move v4, p2

    :goto_0
    const/4 p2, -0x1

    if-ge v4, p1, :cond_0

    if-eq v4, p2, :cond_0

    sget-object v1, Lcom/daaw/ms2;->g:[B

    neg-int v2, v4

    add-int/lit16 p2, v4, 0x1000

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/ms2;->j([BIIIZ)I

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v4}, Lcom/daaw/ms2;->m(I)V

    if-eq v4, p2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final j([BIIIZ)I
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ms2;->a:Lcom/daaw/kx2;

    add-int/2addr p2, p4

    sub-int/2addr p3, p4

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/kx2;->a([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-nez p4, :cond_0

    if-eqz p5, :cond_0

    return p2

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    add-int/2addr p4, p1

    return p4

    :cond_2
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1
.end method

.method public final k([BII)I
    .locals 2

    iget v0, p0, Lcom/daaw/ms2;->f:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v0, p0, Lcom/daaw/ms2;->d:[B

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0, p3}, Lcom/daaw/ms2;->n(I)V

    return p3
.end method

.method public final l(I)I
    .locals 1

    iget v0, p0, Lcom/daaw/ms2;->f:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/ms2;->n(I)V

    return p1
.end method

.method public final m(I)V
    .locals 4

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/ms2;->c:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/ms2;->c:J

    :cond_0
    return-void
.end method

.method public final n(I)V
    .locals 5

    iget v0, p0, Lcom/daaw/ms2;->f:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/ms2;->f:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/ms2;->e:I

    iget-object v2, p0, Lcom/daaw/ms2;->d:[B

    array-length v3, v2

    const/high16 v4, -0x80000

    add-int/2addr v3, v4

    if-ge v0, v3, :cond_0

    const/high16 v3, 0x10000

    add-int/2addr v3, v0

    new-array v3, v3, [B

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-static {v2, p1, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v3, p0, Lcom/daaw/ms2;->d:[B

    return-void
.end method
