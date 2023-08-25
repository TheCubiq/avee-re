.class public final Lcom/daaw/ti0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wv;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/rv0;

.field public final c:Lcom/daaw/qv0;

.field public d:Lcom/daaw/sm1;

.field public e:Lcom/google/android/exoplayer2/Format;

.field public f:Ljava/lang/String;

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:J

.field public l:Z

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:J

.field public r:I

.field public s:J

.field public t:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ti0;->a:Ljava/lang/String;

    new-instance p1, Lcom/daaw/rv0;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/ti0;->b:Lcom/daaw/rv0;

    new-instance v0, Lcom/daaw/qv0;

    iget-object p1, p1, Lcom/daaw/rv0;->a:[B

    invoke-direct {v0, p1}, Lcom/daaw/qv0;-><init>([B)V

    iput-object v0, p0, Lcom/daaw/ti0;->c:Lcom/daaw/qv0;

    return-void
.end method

.method public static f(Lcom/daaw/qv0;)J
    .locals 2

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/qv0;->h(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/qv0;->h(I)I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 6

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    if-lez v0, :cond_7

    iget v0, p0, Lcom/daaw/ti0;->g:I

    const/16 v1, 0x56

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v0, v2, :cond_4

    const/4 v1, 0x3

    if-eq v0, v3, :cond_2

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    iget v1, p0, Lcom/daaw/ti0;->i:I

    iget v2, p0, Lcom/daaw/ti0;->h:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/ti0;->c:Lcom/daaw/qv0;

    iget-object v1, v1, Lcom/daaw/qv0;->a:[B

    iget v2, p0, Lcom/daaw/ti0;->h:I

    invoke-virtual {p1, v1, v2, v0}, Lcom/daaw/rv0;->g([BII)V

    iget v1, p0, Lcom/daaw/ti0;->h:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/ti0;->h:I

    iget v0, p0, Lcom/daaw/ti0;->i:I

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ti0;->c:Lcom/daaw/qv0;

    invoke-virtual {v0, v4}, Lcom/daaw/qv0;->m(I)V

    iget-object v0, p0, Lcom/daaw/ti0;->c:Lcom/daaw/qv0;

    invoke-virtual {p0, v0}, Lcom/daaw/ti0;->g(Lcom/daaw/qv0;)V

    :goto_1
    iput v4, p0, Lcom/daaw/ti0;->g:I

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/daaw/ti0;->j:I

    and-int/lit16 v0, v0, -0xe1

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v2

    or-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/ti0;->i:I

    iget-object v2, p0, Lcom/daaw/ti0;->b:Lcom/daaw/rv0;

    iget-object v2, v2, Lcom/daaw/rv0;->a:[B

    array-length v2, v2

    if-le v0, v2, :cond_3

    invoke-virtual {p0, v0}, Lcom/daaw/ti0;->m(I)V

    :cond_3
    iput v4, p0, Lcom/daaw/ti0;->h:I

    iput v1, p0, Lcom/daaw/ti0;->g:I

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    and-int/lit16 v2, v0, 0xe0

    const/16 v5, 0xe0

    if-ne v2, v5, :cond_5

    iput v0, p0, Lcom/daaw/ti0;->j:I

    iput v3, p0, Lcom/daaw/ti0;->g:I

    goto :goto_0

    :cond_5
    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    if-ne v0, v1, :cond_0

    iput v2, p0, Lcom/daaw/ti0;->g:I

    goto :goto_0

    :cond_7
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ti0;->g:I

    iput-boolean v0, p0, Lcom/daaw/ti0;->l:Z

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 2

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->a()V

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->c()I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ti0;->d:Lcom/daaw/sm1;

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ti0;->f:Ljava/lang/String;

    return-void
.end method

.method public e(JZ)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/ti0;->k:J

    return-void
.end method

.method public final g(Lcom/daaw/qv0;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/qv0;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ti0;->l:Z

    invoke-virtual {p0, p1}, Lcom/daaw/ti0;->l(Lcom/daaw/qv0;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/ti0;->l:Z

    if-nez v0, :cond_1

    return-void

    :cond_1
    :goto_0
    iget v0, p0, Lcom/daaw/ti0;->m:I

    if-nez v0, :cond_4

    iget v0, p0, Lcom/daaw/ti0;->n:I

    if-nez v0, :cond_3

    invoke-virtual {p0, p1}, Lcom/daaw/ti0;->j(Lcom/daaw/qv0;)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ti0;->k(Lcom/daaw/qv0;I)V

    iget-boolean v0, p0, Lcom/daaw/ti0;->p:Z

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/daaw/ti0;->q:J

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Lcom/daaw/qv0;->o(I)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Lcom/daaw/tv0;

    invoke-direct {p1}, Lcom/daaw/tv0;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Lcom/daaw/tv0;

    invoke-direct {p1}, Lcom/daaw/tv0;-><init>()V

    throw p1
.end method

.method public final h(Lcom/daaw/qv0;)I
    .locals 3

    invoke-virtual {p1}, Lcom/daaw/qv0;->b()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lcom/daaw/eg;->h(Lcom/daaw/qv0;Z)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, p0, Lcom/daaw/ti0;->r:I

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/daaw/ti0;->t:I

    invoke-virtual {p1}, Lcom/daaw/qv0;->b()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final i(Lcom/daaw/qv0;)V
    .locals 4

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/daaw/qv0;->h(I)I

    move-result v1

    iput v1, p0, Lcom/daaw/ti0;->o:I

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v3, 0x6

    if-eq v1, v0, :cond_1

    const/4 v0, 0x4

    if-eq v1, v0, :cond_1

    const/4 v0, 0x5

    if-eq v1, v0, :cond_1

    if-eq v1, v3, :cond_0

    const/4 v0, 0x7

    if-eq v1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v2}, Lcom/daaw/qv0;->o(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v3}, Lcom/daaw/qv0;->o(I)V

    goto :goto_1

    :cond_2
    const/16 v0, 0x9

    goto :goto_0

    :cond_3
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Lcom/daaw/qv0;->o(I)V

    :goto_1
    return-void
.end method

.method public final j(Lcom/daaw/qv0;)I
    .locals 3

    iget v0, p0, Lcom/daaw/ti0;->o:I

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :cond_0
    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Lcom/daaw/qv0;->h(I)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v2, 0xff

    if-eq v1, v2, :cond_0

    return v0

    :cond_1
    new-instance p1, Lcom/daaw/tv0;

    invoke-direct {p1}, Lcom/daaw/tv0;-><init>()V

    goto :goto_1

    :goto_0
    throw p1

    :goto_1
    goto :goto_0
.end method

.method public final k(Lcom/daaw/qv0;I)V
    .locals 8

    invoke-virtual {p1}, Lcom/daaw/qv0;->e()I

    move-result v0

    and-int/lit8 v1, v0, 0x7

    if-nez v1, :cond_0

    iget-object p1, p0, Lcom/daaw/ti0;->b:Lcom/daaw/rv0;

    shr-int/lit8 v0, v0, 0x3

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->J(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ti0;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    mul-int/lit8 v1, p2, 0x8

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lcom/daaw/qv0;->i([BII)V

    iget-object p1, p0, Lcom/daaw/ti0;->b:Lcom/daaw/rv0;

    invoke-virtual {p1, v2}, Lcom/daaw/rv0;->J(I)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/ti0;->d:Lcom/daaw/sm1;

    iget-object v0, p0, Lcom/daaw/ti0;->b:Lcom/daaw/rv0;

    invoke-interface {p1, v0, p2}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget-object v1, p0, Lcom/daaw/ti0;->d:Lcom/daaw/sm1;

    iget-wide v2, p0, Lcom/daaw/ti0;->k:J

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p2

    invoke-interface/range {v1 .. v7}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    iget-wide p1, p0, Lcom/daaw/ti0;->k:J

    iget-wide v0, p0, Lcom/daaw/ti0;->s:J

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/daaw/ti0;->k:J

    return-void
.end method

.method public final l(Lcom/daaw/qv0;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/daaw/qv0;->h(I)I

    move-result v3

    const/4 v4, 0x0

    if-ne v3, v2, :cond_0

    invoke-virtual {v1, v2}, Lcom/daaw/qv0;->h(I)I

    move-result v5

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    iput v5, v0, Lcom/daaw/ti0;->m:I

    if-nez v5, :cond_9

    if-ne v3, v2, :cond_1

    invoke-static/range {p1 .. p1}, Lcom/daaw/ti0;->f(Lcom/daaw/qv0;)J

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/qv0;->g()Z

    move-result v5

    if-eqz v5, :cond_8

    const/4 v5, 0x6

    invoke-virtual {v1, v5}, Lcom/daaw/qv0;->h(I)I

    move-result v5

    iput v5, v0, Lcom/daaw/ti0;->n:I

    const/4 v5, 0x4

    invoke-virtual {v1, v5}, Lcom/daaw/qv0;->h(I)I

    move-result v5

    const/4 v6, 0x3

    invoke-virtual {v1, v6}, Lcom/daaw/qv0;->h(I)I

    move-result v6

    if-nez v5, :cond_7

    if-nez v6, :cond_7

    const/16 v5, 0x8

    if-nez v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/qv0;->e()I

    move-result v6

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/ti0;->h(Lcom/daaw/qv0;)I

    move-result v7

    invoke-virtual {v1, v6}, Lcom/daaw/qv0;->m(I)V

    add-int/lit8 v6, v7, 0x7

    div-int/2addr v6, v5

    new-array v6, v6, [B

    invoke-virtual {v1, v6, v4, v7}, Lcom/daaw/qv0;->i([BII)V

    iget-object v8, v0, Lcom/daaw/ti0;->f:Ljava/lang/String;

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    iget v13, v0, Lcom/daaw/ti0;->t:I

    iget v14, v0, Lcom/daaw/ti0;->r:I

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    iget-object v4, v0, Lcom/daaw/ti0;->a:Ljava/lang/String;

    const-string v9, "audio/mp4a-latm"

    move-object/from16 v18, v4

    invoke-static/range {v8 .. v18}, Lcom/google/android/exoplayer2/Format;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v4

    iget-object v6, v0, Lcom/daaw/ti0;->e:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {v4, v6}, Lcom/google/android/exoplayer2/Format;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    iput-object v4, v0, Lcom/daaw/ti0;->e:Lcom/google/android/exoplayer2/Format;

    const-wide/32 v6, 0x3d090000

    iget v8, v4, Lcom/google/android/exoplayer2/Format;->H:I

    int-to-long v8, v8

    div-long/2addr v6, v8

    iput-wide v6, v0, Lcom/daaw/ti0;->s:J

    iget-object v6, v0, Lcom/daaw/ti0;->d:Lcom/daaw/sm1;

    invoke-interface {v6, v4}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lcom/daaw/ti0;->f(Lcom/daaw/qv0;)J

    move-result-wide v6

    long-to-int v4, v6

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/ti0;->h(Lcom/daaw/qv0;)I

    move-result v6

    sub-int/2addr v4, v6

    invoke-virtual {v1, v4}, Lcom/daaw/qv0;->o(I)V

    :cond_3
    :goto_1
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/ti0;->i(Lcom/daaw/qv0;)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/qv0;->g()Z

    move-result v4

    iput-boolean v4, v0, Lcom/daaw/ti0;->p:Z

    const-wide/16 v6, 0x0

    iput-wide v6, v0, Lcom/daaw/ti0;->q:J

    if-eqz v4, :cond_5

    if-ne v3, v2, :cond_4

    invoke-static/range {p1 .. p1}, Lcom/daaw/ti0;->f(Lcom/daaw/qv0;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/daaw/ti0;->q:J

    goto :goto_2

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/qv0;->g()Z

    move-result v2

    iget-wide v3, v0, Lcom/daaw/ti0;->q:J

    shl-long/2addr v3, v5

    invoke-virtual {v1, v5}, Lcom/daaw/qv0;->h(I)I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v3, v6

    iput-wide v3, v0, Lcom/daaw/ti0;->q:J

    if-nez v2, :cond_4

    :cond_5
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/qv0;->g()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v1, v5}, Lcom/daaw/qv0;->o(I)V

    :cond_6
    return-void

    :cond_7
    new-instance v1, Lcom/daaw/tv0;

    invoke-direct {v1}, Lcom/daaw/tv0;-><init>()V

    throw v1

    :cond_8
    new-instance v1, Lcom/daaw/tv0;

    invoke-direct {v1}, Lcom/daaw/tv0;-><init>()V

    throw v1

    :cond_9
    new-instance v1, Lcom/daaw/tv0;

    invoke-direct {v1}, Lcom/daaw/tv0;-><init>()V

    goto :goto_4

    :goto_3
    throw v1

    :goto_4
    goto :goto_3
.end method

.method public final m(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ti0;->b:Lcom/daaw/rv0;

    invoke-virtual {v0, p1}, Lcom/daaw/rv0;->G(I)V

    iget-object p1, p0, Lcom/daaw/ti0;->c:Lcom/daaw/qv0;

    iget-object v0, p0, Lcom/daaw/ti0;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p1, v0}, Lcom/daaw/qv0;->k([B)V

    return-void
.end method
