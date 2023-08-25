.class public final Lcom/daaw/ky;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d81;


# instance fields
.field public final p:Lcom/google/android/exoplayer2/Format;

.field public final q:Lcom/daaw/jy;

.field public r:[J

.field public s:Z

.field public t:Lcom/daaw/sy;

.field public u:Z

.field public v:I

.field public w:J


# direct methods
.method public constructor <init>(Lcom/daaw/sy;Lcom/google/android/exoplayer2/Format;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/ky;->p:Lcom/google/android/exoplayer2/Format;

    iput-object p1, p0, Lcom/daaw/ky;->t:Lcom/daaw/sy;

    new-instance p2, Lcom/daaw/jy;

    invoke-direct {p2}, Lcom/daaw/jy;-><init>()V

    iput-object p2, p0, Lcom/daaw/ky;->q:Lcom/daaw/jy;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/ky;->w:J

    iget-object p2, p1, Lcom/daaw/sy;->b:[J

    iput-object p2, p0, Lcom/daaw/ky;->r:[J

    invoke-virtual {p0, p1, p3}, Lcom/daaw/ky;->e(Lcom/daaw/sy;Z)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ky;->t:Lcom/daaw/sy;

    invoke-virtual {v0}, Lcom/daaw/sy;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(J)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ky;->r:[J

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, p2, v1, v2}, Lcom/daaw/sq1;->c([JJZZ)I

    move-result v0

    iput v0, p0, Lcom/daaw/ky;->v:I

    iget-boolean v3, p0, Lcom/daaw/ky;->s:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/daaw/ky;->r:[J

    array-length v3, v3

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    iput-wide p1, p0, Lcom/daaw/ky;->w:J

    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e(Lcom/daaw/sy;Z)V
    .locals 8

    iget v0, p0, Lcom/daaw/ky;->v:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-wide v4, v1

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/daaw/ky;->r:[J

    add-int/lit8 v0, v0, -0x1

    aget-wide v4, v3, v0

    :goto_0
    iput-boolean p2, p0, Lcom/daaw/ky;->s:Z

    iput-object p1, p0, Lcom/daaw/ky;->t:Lcom/daaw/sy;

    iget-object p1, p1, Lcom/daaw/sy;->b:[J

    iput-object p1, p0, Lcom/daaw/ky;->r:[J

    iget-wide v6, p0, Lcom/daaw/ky;->w:J

    cmp-long p2, v6, v1

    if-eqz p2, :cond_1

    invoke-virtual {p0, v6, v7}, Lcom/daaw/ky;->c(J)V

    goto :goto_1

    :cond_1
    cmp-long p2, v4, v1

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    invoke-static {p1, v4, v5, p2, p2}, Lcom/daaw/sq1;->c([JJZZ)I

    move-result p1

    iput p1, p0, Lcom/daaw/ky;->v:I

    :cond_2
    :goto_1
    return-void
.end method

.method public j(Lcom/daaw/k30;Lcom/daaw/gq;Z)I
    .locals 7

    const/4 v0, 0x1

    if-nez p3, :cond_4

    iget-boolean p3, p0, Lcom/daaw/ky;->u:Z

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/daaw/ky;->v:I

    iget-object p3, p0, Lcom/daaw/ky;->r:[J

    array-length p3, p3

    const/4 v1, -0x4

    const/4 v2, -0x3

    if-ne p1, p3, :cond_2

    iget-boolean p1, p0, Lcom/daaw/ky;->s:Z

    if-nez p1, :cond_1

    const/4 p1, 0x4

    invoke-virtual {p2, p1}, Lcom/daaw/rc;->l(I)V

    return v1

    :cond_1
    return v2

    :cond_2
    add-int/lit8 p3, p1, 0x1

    iput p3, p0, Lcom/daaw/ky;->v:I

    iget-object p3, p0, Lcom/daaw/ky;->q:Lcom/daaw/jy;

    iget-object v3, p0, Lcom/daaw/ky;->t:Lcom/daaw/sy;

    iget-object v4, v3, Lcom/daaw/sy;->a:[Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;

    aget-object v4, v4, p1

    iget-wide v5, v3, Lcom/daaw/sy;->e:J

    invoke-virtual {p3, v4, v5, v6}, Lcom/daaw/jy;->a(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;J)[B

    move-result-object p3

    if-eqz p3, :cond_3

    array-length v2, p3

    invoke-virtual {p2, v2}, Lcom/daaw/gq;->n(I)V

    invoke-virtual {p2, v0}, Lcom/daaw/rc;->l(I)V

    iget-object v0, p2, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object p3, p0, Lcom/daaw/ky;->r:[J

    aget-wide v2, p3, p1

    iput-wide v2, p2, Lcom/daaw/gq;->s:J

    return v1

    :cond_3
    return v2

    :cond_4
    :goto_0
    iget-object p2, p0, Lcom/daaw/ky;->p:Lcom/google/android/exoplayer2/Format;

    iput-object p2, p1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    iput-boolean v0, p0, Lcom/daaw/ky;->u:Z

    const/4 p1, -0x5

    return p1
.end method

.method public n(J)I
    .locals 4

    iget v0, p0, Lcom/daaw/ky;->v:I

    iget-object v1, p0, Lcom/daaw/ky;->r:[J

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, p1, p2, v2, v3}, Lcom/daaw/sq1;->c([JJZZ)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, Lcom/daaw/ky;->v:I

    sub-int p2, p1, p2

    iput p1, p0, Lcom/daaw/ky;->v:I

    return p2
.end method
