.class public final Lcom/daaw/ys7;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field public p:Ljava/util/Iterator;

.field public q:Ljava/nio/ByteBuffer;

.field public r:I

.field public s:I

.field public t:I

.field public u:Z

.field public v:[B

.field public w:I

.field public x:J


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 2

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ys7;->p:Ljava/util/Iterator;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ys7;->r:I

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/daaw/ys7;->r:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/ys7;->r:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/ys7;->s:I

    invoke-virtual {p0}, Lcom/daaw/ys7;->n()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/daaw/vs7;->e:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    iput v0, p0, Lcom/daaw/ys7;->s:I

    iput v0, p0, Lcom/daaw/ys7;->t:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/ys7;->x:J

    :cond_1
    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/ys7;->t:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/ys7;->t:I

    iget-object p1, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ys7;->n()Z

    :cond_0
    return-void
.end method

.method public final n()Z
    .locals 4

    iget v0, p0, Lcom/daaw/ys7;->s:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/ys7;->s:I

    iget-object v0, p0, Lcom/daaw/ys7;->p:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lcom/daaw/ys7;->p:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    iput v0, p0, Lcom/daaw/ys7;->t:I

    iget-object v0, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lcom/daaw/ys7;->u:Z

    iget-object v0, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ys7;->v:[B

    iget-object v0, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    iput v0, p0, Lcom/daaw/ys7;->w:I

    goto :goto_0

    :cond_1
    iput-boolean v2, p0, Lcom/daaw/ys7;->u:Z

    iget-object v0, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/daaw/gw7;->m(Ljava/nio/ByteBuffer;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/daaw/ys7;->x:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ys7;->v:[B

    :goto_0
    return v1
.end method

.method public final read()I
    .locals 6

    iget v0, p0, Lcom/daaw/ys7;->s:I

    iget v1, p0, Lcom/daaw/ys7;->r:I

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/ys7;->u:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ys7;->v:[B

    iget v2, p0, Lcom/daaw/ys7;->t:I

    iget v3, p0, Lcom/daaw/ys7;->w:I

    add-int/2addr v2, v3

    aget-byte v0, v0, v2

    :goto_0
    invoke-virtual {p0, v1}, Lcom/daaw/ys7;->d(I)V

    and-int/lit16 v0, v0, 0xff

    return v0

    :cond_1
    iget v0, p0, Lcom/daaw/ys7;->t:I

    iget-wide v2, p0, Lcom/daaw/ys7;->x:J

    int-to-long v4, v0

    add-long/2addr v4, v2

    invoke-static {v4, v5}, Lcom/daaw/gw7;->i(J)B

    move-result v0

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 3

    iget v0, p0, Lcom/daaw/ys7;->s:I

    iget v1, p0, Lcom/daaw/ys7;->r:I

    if-ne v0, v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    iget v1, p0, Lcom/daaw/ys7;->t:I

    sub-int/2addr v0, v1

    if-le p3, v0, :cond_1

    move p3, v0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/ys7;->u:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ys7;->v:[B

    iget v2, p0, Lcom/daaw/ys7;->w:I

    add-int/2addr v1, v2

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/ys7;->t:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lcom/daaw/ys7;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    :goto_0
    invoke-virtual {p0, p3}, Lcom/daaw/ys7;->d(I)V

    return p3
.end method
