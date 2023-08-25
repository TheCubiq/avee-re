.class public final Lcom/daaw/he1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m7;


# instance fields
.field public b:I

.field public c:I

.field public d:F

.field public e:F

.field public f:I

.field public g:I

.field public h:Lcom/daaw/ge1;

.field public i:Ljava/nio/ByteBuffer;

.field public j:Ljava/nio/ShortBuffer;

.field public k:Ljava/nio/ByteBuffer;

.field public l:J

.field public m:J

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/he1;->d:F

    iput v0, p0, Lcom/daaw/he1;->e:F

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/he1;->b:I

    iput v0, p0, Lcom/daaw/he1;->c:I

    iput v0, p0, Lcom/daaw/he1;->f:I

    sget-object v1, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lcom/daaw/he1;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/he1;->j:Ljava/nio/ShortBuffer;

    iput-object v1, p0, Lcom/daaw/he1;->k:Ljava/nio/ByteBuffer;

    iput v0, p0, Lcom/daaw/he1;->g:I

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 15

    move-object v0, p0

    iget-wide v5, v0, Lcom/daaw/he1;->m:J

    const-wide/16 v1, 0x400

    cmp-long v3, v5, v1

    if-ltz v3, :cond_1

    iget v1, v0, Lcom/daaw/he1;->f:I

    iget v2, v0, Lcom/daaw/he1;->c:I

    iget-wide v3, v0, Lcom/daaw/he1;->l:J

    if-ne v1, v2, :cond_0

    move-wide/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    int-to-long v7, v1

    mul-long v11, v3, v7

    int-to-long v1, v2

    mul-long v13, v5, v1

    move-wide/from16 v9, p1

    invoke-static/range {v9 .. v14}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v1

    :goto_0
    return-wide v1

    :cond_1
    iget v1, v0, Lcom/daaw/he1;->d:F

    float-to-double v1, v1

    move-wide/from16 v3, p1

    long-to-double v3, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v3

    double-to-long v1, v1

    return-wide v1
.end method

.method public b(F)F
    .locals 2

    const v0, 0x3dcccccd    # 0.1f

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {p1, v0, v1}, Lcom/daaw/sq1;->k(FFF)F

    move-result p1

    iget v0, p0, Lcom/daaw/he1;->e:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/daaw/he1;->e:F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/he1;->flush()V

    return p1
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/he1;->n:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/ge1;->j()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 3

    iget v0, p0, Lcom/daaw/he1;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/daaw/he1;->d:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v2, 0x3c23d70a    # 0.01f

    cmpl-float v0, v0, v2

    if-gez v0, :cond_0

    iget v0, p0, Lcom/daaw/he1;->e:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v2

    if-gez v0, :cond_0

    iget v0, p0, Lcom/daaw/he1;->f:I

    iget v1, p0, Lcom/daaw/he1;->c:I

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/he1;->d:F

    iput v0, p0, Lcom/daaw/he1;->e:F

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/he1;->b:I

    iput v0, p0, Lcom/daaw/he1;->c:I

    iput v0, p0, Lcom/daaw/he1;->f:I

    sget-object v1, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lcom/daaw/he1;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/he1;->j:Ljava/nio/ShortBuffer;

    iput-object v1, p0, Lcom/daaw/he1;->k:Ljava/nio/ByteBuffer;

    iput v0, p0, Lcom/daaw/he1;->g:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/he1;->l:J

    iput-wide v0, p0, Lcom/daaw/he1;->m:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/he1;->n:Z

    return-void
.end method

.method public f()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lcom/daaw/he1;->k:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lcom/daaw/he1;->k:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public flush()V
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/he1;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/ge1;

    iget v2, p0, Lcom/daaw/he1;->c:I

    iget v3, p0, Lcom/daaw/he1;->b:I

    iget v4, p0, Lcom/daaw/he1;->d:F

    iget v5, p0, Lcom/daaw/he1;->e:F

    iget v6, p0, Lcom/daaw/he1;->f:I

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/ge1;-><init>(IIFFI)V

    iput-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ge1;->i()V

    :cond_1
    :goto_0
    sget-object v0, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/he1;->k:Ljava/nio/ByteBuffer;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/he1;->l:J

    iput-wide v0, p0, Lcom/daaw/he1;->m:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/he1;->n:Z

    return-void
.end method

.method public g(Ljava/nio/ByteBuffer;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    iget-wide v2, p0, Lcom/daaw/he1;->l:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/he1;->l:J

    iget-object v2, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    invoke-virtual {v2, v0}, Lcom/daaw/ge1;->s(Ljava/nio/ShortBuffer;)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    :cond_1
    iget-object p1, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    invoke-virtual {p1}, Lcom/daaw/ge1;->j()I

    move-result p1

    iget v0, p0, Lcom/daaw/he1;->b:I

    mul-int p1, p1, v0

    mul-int/lit8 p1, p1, 0x2

    if-lez p1, :cond_3

    iget-object v0, p0, Lcom/daaw/he1;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    if-ge v0, p1, :cond_2

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/he1;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/he1;->j:Ljava/nio/ShortBuffer;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/he1;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget-object v0, p0, Lcom/daaw/he1;->j:Ljava/nio/ShortBuffer;

    invoke-virtual {v0}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    :goto_1
    iget-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    iget-object v1, p0, Lcom/daaw/he1;->j:Ljava/nio/ShortBuffer;

    invoke-virtual {v0, v1}, Lcom/daaw/ge1;->k(Ljava/nio/ShortBuffer;)V

    iget-wide v0, p0, Lcom/daaw/he1;->m:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/he1;->m:J

    iget-object v0, p0, Lcom/daaw/he1;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object p1, p0, Lcom/daaw/he1;->i:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/daaw/he1;->k:Ljava/nio/ByteBuffer;

    :cond_3
    return-void
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/daaw/he1;->b:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/daaw/he1;->f:I

    return v0
.end method

.method public j()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    invoke-virtual {v0}, Lcom/daaw/ge1;->r()V

    iput-boolean v1, p0, Lcom/daaw/he1;->n:Z

    return-void
.end method

.method public l(III)Z
    .locals 1

    const/4 v0, 0x2

    if-ne p3, v0, :cond_2

    iget p3, p0, Lcom/daaw/he1;->g:I

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    move p3, p1

    :cond_0
    iget v0, p0, Lcom/daaw/he1;->c:I

    if-ne v0, p1, :cond_1

    iget v0, p0, Lcom/daaw/he1;->b:I

    if-ne v0, p2, :cond_1

    iget v0, p0, Lcom/daaw/he1;->f:I

    if-ne v0, p3, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iput p1, p0, Lcom/daaw/he1;->c:I

    iput p2, p0, Lcom/daaw/he1;->b:I

    iput p3, p0, Lcom/daaw/he1;->f:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    const/4 p1, 0x1

    return p1

    :cond_2
    new-instance v0, Lcom/daaw/m7$a;

    invoke-direct {v0, p1, p2, p3}, Lcom/daaw/m7$a;-><init>(III)V

    throw v0
.end method

.method public m(F)F
    .locals 2

    const v0, 0x3dcccccd    # 0.1f

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {p1, v0, v1}, Lcom/daaw/sq1;->k(FFF)F

    move-result p1

    iget v0, p0, Lcom/daaw/he1;->d:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/daaw/he1;->d:F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/he1;->h:Lcom/daaw/ge1;

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/he1;->flush()V

    return p1
.end method
