.class public final Lcom/daaw/co1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m7;


# instance fields
.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/nio/ByteBuffer;

.field public i:Ljava/nio/ByteBuffer;

.field public j:[B

.field public k:I

.field public l:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/co1;->h:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/co1;->i:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/co1;->e:I

    iput v0, p0, Lcom/daaw/co1;->f:I

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/co1;->j:[B

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 0

    iput p1, p0, Lcom/daaw/co1;->c:I

    iput p2, p0, Lcom/daaw/co1;->d:I

    return-void
.end method

.method public c()Z
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/co1;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/co1;->i:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/co1;->b:Z

    return v0
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/co1;->flush()V

    sget-object v0, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/co1;->h:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/co1;->e:I

    iput v0, p0, Lcom/daaw/co1;->f:I

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/co1;->j:[B

    return-void
.end method

.method public f()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lcom/daaw/co1;->i:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lcom/daaw/co1;->i:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public flush()V
    .locals 1

    sget-object v0, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/co1;->i:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/co1;->l:Z

    iput v0, p0, Lcom/daaw/co1;->g:I

    iput v0, p0, Lcom/daaw/co1;->k:I

    return-void
.end method

.method public g(Ljava/nio/ByteBuffer;)V
    .locals 7

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    sub-int v2, v1, v0

    iget v3, p0, Lcom/daaw/co1;->g:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget v4, p0, Lcom/daaw/co1;->g:I

    sub-int/2addr v4, v3

    iput v4, p0, Lcom/daaw/co1;->g:I

    add-int/2addr v0, v3

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget v0, p0, Lcom/daaw/co1;->g:I

    if-lez v0, :cond_0

    return-void

    :cond_0
    sub-int/2addr v2, v3

    iget v0, p0, Lcom/daaw/co1;->k:I

    add-int/2addr v0, v2

    iget-object v3, p0, Lcom/daaw/co1;->j:[B

    array-length v3, v3

    sub-int/2addr v0, v3

    iget-object v3, p0, Lcom/daaw/co1;->h:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    if-ge v3, v0, :cond_1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/co1;->h:Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/daaw/co1;->h:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :goto_0
    iget v3, p0, Lcom/daaw/co1;->k:I

    const/4 v4, 0x0

    invoke-static {v0, v4, v3}, Lcom/daaw/sq1;->l(III)I

    move-result v3

    iget-object v5, p0, Lcom/daaw/co1;->h:Ljava/nio/ByteBuffer;

    iget-object v6, p0, Lcom/daaw/co1;->j:[B

    invoke-virtual {v5, v6, v4, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v0, v3

    invoke-static {v0, v4, v2}, Lcom/daaw/sq1;->l(III)I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v5

    add-int/2addr v5, v0

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v5, p0, Lcom/daaw/co1;->h:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    sub-int/2addr v2, v0

    iget v0, p0, Lcom/daaw/co1;->k:I

    sub-int/2addr v0, v3

    iput v0, p0, Lcom/daaw/co1;->k:I

    iget-object v1, p0, Lcom/daaw/co1;->j:[B

    invoke-static {v1, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/daaw/co1;->j:[B

    iget v1, p0, Lcom/daaw/co1;->k:I

    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget p1, p0, Lcom/daaw/co1;->k:I

    add-int/2addr p1, v2

    iput p1, p0, Lcom/daaw/co1;->k:I

    iget-object p1, p0, Lcom/daaw/co1;->h:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    iget-object p1, p0, Lcom/daaw/co1;->h:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/daaw/co1;->i:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/daaw/co1;->e:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/daaw/co1;->f:I

    return v0
.end method

.method public j()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/co1;->l:Z

    return-void
.end method

.method public l(III)Z
    .locals 2

    const/4 v0, 0x2

    if-ne p3, v0, :cond_3

    iput p2, p0, Lcom/daaw/co1;->e:I

    iput p1, p0, Lcom/daaw/co1;->f:I

    iget p1, p0, Lcom/daaw/co1;->d:I

    mul-int p3, p1, p2

    mul-int/lit8 p3, p3, 0x2

    new-array p3, p3, [B

    iput-object p3, p0, Lcom/daaw/co1;->j:[B

    const/4 p3, 0x0

    iput p3, p0, Lcom/daaw/co1;->k:I

    iget v1, p0, Lcom/daaw/co1;->c:I

    mul-int p2, p2, v1

    mul-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcom/daaw/co1;->g:I

    iget-boolean p2, p0, Lcom/daaw/co1;->b:Z

    const/4 v0, 0x1

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lcom/daaw/co1;->b:Z

    if-eq p2, p1, :cond_2

    const/4 p3, 0x1

    :cond_2
    return p3

    :cond_3
    new-instance v0, Lcom/daaw/m7$a;

    invoke-direct {v0, p1, p2, p3}, Lcom/daaw/m7$a;-><init>(III)V

    throw v0
.end method
