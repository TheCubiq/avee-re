.class public abstract Lcom/daaw/rg1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/rg1$c;,
        Lcom/daaw/rg1$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/st0;

.field public b:Lcom/daaw/sm1;

.field public c:Lcom/daaw/d00;

.field public d:Lcom/daaw/ut0;

.field public e:J

.field public f:J

.field public g:J

.field public h:I

.field public i:I

.field public j:Lcom/daaw/rg1$b;

.field public k:J

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/st0;

    invoke-direct {v0}, Lcom/daaw/st0;-><init>()V

    iput-object v0, p0, Lcom/daaw/rg1;->a:Lcom/daaw/st0;

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    iget v0, p0, Lcom/daaw/rg1;->i:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public b(J)J
    .locals 2

    iget v0, p0, Lcom/daaw/rg1;->i:I

    int-to-long v0, v0

    mul-long v0, v0, p1

    const-wide/32 p1, 0xf4240

    div-long/2addr v0, p1

    return-wide v0
.end method

.method public c(Lcom/daaw/d00;Lcom/daaw/sm1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rg1;->c:Lcom/daaw/d00;

    iput-object p2, p0, Lcom/daaw/rg1;->b:Lcom/daaw/sm1;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/rg1;->j(Z)V

    return-void
.end method

.method public d(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/rg1;->g:J

    return-void
.end method

.method public abstract e(Lcom/daaw/rv0;)J
.end method

.method public final f(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 3

    iget v0, p0, Lcom/daaw/rg1;->h:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_1

    if-ne v0, v2, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/rg1;->i(Lcom/daaw/a00;Lcom/daaw/iy0;)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iget-wide v0, p0, Lcom/daaw/rg1;->f:J

    long-to-int p2, v0

    invoke-interface {p1, p2}, Lcom/daaw/a00;->j(I)V

    iput v2, p0, Lcom/daaw/rg1;->h:I

    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/rg1;->g(Lcom/daaw/a00;)I

    move-result p1

    return p1
.end method

.method public final g(Lcom/daaw/a00;)I
    .locals 12

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/rg1;->a:Lcom/daaw/st0;

    invoke-virtual {v1, p1}, Lcom/daaw/st0;->d(Lcom/daaw/a00;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x3

    iput p1, p0, Lcom/daaw/rg1;->h:I

    const/4 p1, -0x1

    return p1

    :cond_1
    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/daaw/rg1;->f:J

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lcom/daaw/rg1;->k:J

    iget-object v1, p0, Lcom/daaw/rg1;->a:Lcom/daaw/st0;

    invoke-virtual {v1}, Lcom/daaw/st0;->c()Lcom/daaw/rv0;

    move-result-object v1

    iget-wide v2, p0, Lcom/daaw/rg1;->f:J

    iget-object v4, p0, Lcom/daaw/rg1;->j:Lcom/daaw/rg1$b;

    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/daaw/rg1;->h(Lcom/daaw/rv0;JLcom/daaw/rg1$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/daaw/rg1;->f:J

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/daaw/rg1;->j:Lcom/daaw/rg1$b;

    iget-object v1, v1, Lcom/daaw/rg1$b;->a:Lcom/google/android/exoplayer2/Format;

    iget v2, v1, Lcom/google/android/exoplayer2/Format;->H:I

    iput v2, p0, Lcom/daaw/rg1;->i:I

    iget-boolean v2, p0, Lcom/daaw/rg1;->m:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/daaw/rg1;->b:Lcom/daaw/sm1;

    invoke-interface {v2, v1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    iput-boolean v0, p0, Lcom/daaw/rg1;->m:Z

    :cond_3
    iget-object v0, p0, Lcom/daaw/rg1;->j:Lcom/daaw/rg1$b;

    iget-object v0, v0, Lcom/daaw/rg1$b;->b:Lcom/daaw/ut0;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iput-object v0, p0, Lcom/daaw/rg1;->d:Lcom/daaw/ut0;

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_5

    new-instance p1, Lcom/daaw/rg1$c;

    invoke-direct {p1, v1}, Lcom/daaw/rg1$c;-><init>(Lcom/daaw/rg1$a;)V

    iput-object p1, p0, Lcom/daaw/rg1;->d:Lcom/daaw/ut0;

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lcom/daaw/rg1;->a:Lcom/daaw/st0;

    invoke-virtual {v0}, Lcom/daaw/st0;->b()Lcom/daaw/tt0;

    move-result-object v0

    new-instance v11, Lcom/daaw/nr;

    iget-wide v3, p0, Lcom/daaw/rg1;->f:J

    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v5

    iget p1, v0, Lcom/daaw/tt0;->h:I

    iget v2, v0, Lcom/daaw/tt0;->i:I

    add-int v8, p1, v2

    iget-wide v9, v0, Lcom/daaw/tt0;->c:J

    move-object v2, v11

    move-object v7, p0

    invoke-direct/range {v2 .. v10}, Lcom/daaw/nr;-><init>(JJLcom/daaw/rg1;IJ)V

    iput-object v11, p0, Lcom/daaw/rg1;->d:Lcom/daaw/ut0;

    :goto_1
    iput-object v1, p0, Lcom/daaw/rg1;->j:Lcom/daaw/rg1$b;

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/rg1;->h:I

    iget-object p1, p0, Lcom/daaw/rg1;->a:Lcom/daaw/st0;

    invoke-virtual {p1}, Lcom/daaw/st0;->f()V

    const/4 p1, 0x0

    return p1
.end method

.method public abstract h(Lcom/daaw/rv0;JLcom/daaw/rg1$b;)Z
.end method

.method public final i(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/daaw/rg1;->d:Lcom/daaw/ut0;

    invoke-interface {v2, v1}, Lcom/daaw/ut0;->a(Lcom/daaw/a00;)J

    move-result-wide v2

    const/4 v4, 0x1

    const-wide/16 v5, 0x0

    cmp-long v7, v2, v5

    if-ltz v7, :cond_0

    move-object/from16 v7, p2

    iput-wide v2, v7, Lcom/daaw/iy0;->a:J

    return v4

    :cond_0
    const-wide/16 v7, -0x1

    cmp-long v9, v2, v7

    if-gez v9, :cond_1

    const-wide/16 v9, 0x2

    add-long/2addr v2, v9

    neg-long v2, v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/rg1;->d(J)V

    :cond_1
    iget-boolean v2, v0, Lcom/daaw/rg1;->l:Z

    if-nez v2, :cond_2

    iget-object v2, v0, Lcom/daaw/rg1;->d:Lcom/daaw/ut0;

    invoke-interface {v2}, Lcom/daaw/ut0;->c()Lcom/daaw/da1;

    move-result-object v2

    iget-object v3, v0, Lcom/daaw/rg1;->c:Lcom/daaw/d00;

    invoke-interface {v3, v2}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    iput-boolean v4, v0, Lcom/daaw/rg1;->l:Z

    :cond_2
    iget-wide v2, v0, Lcom/daaw/rg1;->k:J

    cmp-long v4, v2, v5

    if-gtz v4, :cond_4

    iget-object v2, v0, Lcom/daaw/rg1;->a:Lcom/daaw/st0;

    invoke-virtual {v2, v1}, Lcom/daaw/st0;->d(Lcom/daaw/a00;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x3

    iput v1, v0, Lcom/daaw/rg1;->h:I

    const/4 v1, -0x1

    return v1

    :cond_4
    :goto_0
    iput-wide v5, v0, Lcom/daaw/rg1;->k:J

    iget-object v1, v0, Lcom/daaw/rg1;->a:Lcom/daaw/st0;

    invoke-virtual {v1}, Lcom/daaw/st0;->c()Lcom/daaw/rv0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/rg1;->e(Lcom/daaw/rv0;)J

    move-result-wide v2

    cmp-long v4, v2, v5

    if-ltz v4, :cond_5

    iget-wide v4, v0, Lcom/daaw/rg1;->g:J

    add-long v9, v4, v2

    iget-wide v11, v0, Lcom/daaw/rg1;->e:J

    cmp-long v6, v9, v11

    if-ltz v6, :cond_5

    invoke-virtual {v0, v4, v5}, Lcom/daaw/rg1;->a(J)J

    move-result-wide v10

    iget-object v4, v0, Lcom/daaw/rg1;->b:Lcom/daaw/sm1;

    invoke-virtual {v1}, Lcom/daaw/rv0;->d()I

    move-result v5

    invoke-interface {v4, v1, v5}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget-object v9, v0, Lcom/daaw/rg1;->b:Lcom/daaw/sm1;

    const/4 v12, 0x1

    invoke-virtual {v1}, Lcom/daaw/rv0;->d()I

    move-result v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-interface/range {v9 .. v15}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    iput-wide v7, v0, Lcom/daaw/rg1;->e:J

    :cond_5
    iget-wide v4, v0, Lcom/daaw/rg1;->g:J

    add-long/2addr v4, v2

    iput-wide v4, v0, Lcom/daaw/rg1;->g:J

    const/4 v1, 0x0

    return v1
.end method

.method public j(Z)V
    .locals 4

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Lcom/daaw/rg1$b;

    invoke-direct {p1}, Lcom/daaw/rg1$b;-><init>()V

    iput-object p1, p0, Lcom/daaw/rg1;->j:Lcom/daaw/rg1$b;

    iput-wide v0, p0, Lcom/daaw/rg1;->f:J

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput p1, p0, Lcom/daaw/rg1;->h:I

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/daaw/rg1;->e:J

    iput-wide v0, p0, Lcom/daaw/rg1;->g:J

    return-void
.end method

.method public final k(JJ)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/rg1;->a:Lcom/daaw/st0;

    invoke-virtual {v0}, Lcom/daaw/st0;->e()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    iget-boolean p1, p0, Lcom/daaw/rg1;->l:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/rg1;->j(Z)V

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/daaw/rg1;->h:I

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/rg1;->d:Lcom/daaw/ut0;

    invoke-interface {p1, p3, p4}, Lcom/daaw/ut0;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/rg1;->e:J

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/rg1;->h:I

    :cond_1
    :goto_0
    return-void
.end method
