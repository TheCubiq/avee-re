.class public final Lcom/daaw/nc2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ac2;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/ik5;

.field public final c:Lcom/daaw/cj5;

.field public d:Lcom/daaw/m42;

.field public e:Ljava/lang/String;

.field public f:Lcom/daaw/f92;

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

.field public u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nc2;->a:Ljava/lang/String;

    new-instance p1, Lcom/daaw/ik5;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Lcom/daaw/ik5;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/nc2;->b:Lcom/daaw/ik5;

    new-instance v0, Lcom/daaw/cj5;

    invoke-virtual {p1}, Lcom/daaw/ik5;->h()[B

    move-result-object p1

    array-length v1, p1

    invoke-direct {v0, p1, v1}, Lcom/daaw/cj5;-><init>([BI)V

    iput-object v0, p0, Lcom/daaw/nc2;->c:Lcom/daaw/cj5;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/nc2;->k:J

    return-void
.end method

.method public static e(Lcom/daaw/cj5;)J
    .locals 2

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/cj5;->c(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/cj5;->c(I)I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)V
    .locals 14

    iget-object v0, p0, Lcom/daaw/nc2;->d:Lcom/daaw/m42;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v0

    if-lez v0, :cond_1e

    iget v0, p0, Lcom/daaw/nc2;->g:I

    const/16 v1, 0x56

    const/4 v2, 0x1

    if-eqz v0, :cond_1d

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v0, v2, :cond_1a

    const/4 v1, 0x3

    const/16 v5, 0x8

    if-eq v0, v3, :cond_18

    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v0

    iget v3, p0, Lcom/daaw/nc2;->i:I

    iget v6, p0, Lcom/daaw/nc2;->h:I

    sub-int/2addr v3, v6

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v3, p0, Lcom/daaw/nc2;->c:Lcom/daaw/cj5;

    iget-object v3, v3, Lcom/daaw/cj5;->a:[B

    iget v6, p0, Lcom/daaw/nc2;->h:I

    invoke-virtual {p1, v3, v6, v0}, Lcom/daaw/ik5;->b([BII)V

    iget v3, p0, Lcom/daaw/nc2;->h:I

    add-int/2addr v3, v0

    iput v3, p0, Lcom/daaw/nc2;->h:I

    iget v0, p0, Lcom/daaw/nc2;->i:I

    if-ne v3, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/nc2;->c:Lcom/daaw/cj5;

    invoke-virtual {v0, v4}, Lcom/daaw/cj5;->h(I)V

    iget-object v0, p0, Lcom/daaw/nc2;->c:Lcom/daaw/cj5;

    invoke-virtual {v0}, Lcom/daaw/cj5;->l()Z

    move-result v3

    const/4 v6, 0x0

    if-nez v3, :cond_10

    iput-boolean v2, p0, Lcom/daaw/nc2;->l:Z

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    if-ne v3, v2, :cond_1

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    move v7, v3

    const/4 v3, 0x0

    :goto_1
    iput v3, p0, Lcom/daaw/nc2;->m:I

    if-nez v3, :cond_f

    if-ne v7, v2, :cond_2

    invoke-static {v0}, Lcom/daaw/nc2;->e(Lcom/daaw/cj5;)J

    const/4 v7, 0x1

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/cj5;->l()Z

    move-result v3

    if-eqz v3, :cond_e

    const/4 v3, 0x6

    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->c(I)I

    move-result v8

    iput v8, p0, Lcom/daaw/nc2;->n:I

    const/4 v8, 0x4

    invoke-virtual {v0, v8}, Lcom/daaw/cj5;->c(I)I

    move-result v9

    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->c(I)I

    move-result v10

    if-nez v9, :cond_d

    if-nez v10, :cond_d

    if-nez v7, :cond_3

    invoke-virtual {v0}, Lcom/daaw/cj5;->b()I

    move-result v9

    invoke-virtual {p0, v0}, Lcom/daaw/nc2;->d(Lcom/daaw/cj5;)I

    move-result v10

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->h(I)V

    add-int/lit8 v9, v10, 0x7

    div-int/2addr v9, v5

    new-array v9, v9, [B

    invoke-virtual {v0, v9, v4, v10}, Lcom/daaw/cj5;->f([BII)V

    new-instance v10, Lcom/daaw/b72;

    invoke-direct {v10}, Lcom/daaw/b72;-><init>()V

    iget-object v11, p0, Lcom/daaw/nc2;->e:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lcom/daaw/b72;->h(Ljava/lang/String;)Lcom/daaw/b72;

    const-string v11, "audio/mp4a-latm"

    invoke-virtual {v10, v11}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    iget-object v11, p0, Lcom/daaw/nc2;->u:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lcom/daaw/b72;->f0(Ljava/lang/String;)Lcom/daaw/b72;

    iget v11, p0, Lcom/daaw/nc2;->t:I

    invoke-virtual {v10, v11}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    iget v11, p0, Lcom/daaw/nc2;->r:I

    invoke-virtual {v10, v11}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-static {v9}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v10, v9}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    iget-object v9, p0, Lcom/daaw/nc2;->a:Ljava/lang/String;

    invoke-virtual {v10, v9}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v10}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v9

    iget-object v10, p0, Lcom/daaw/nc2;->f:Lcom/daaw/f92;

    invoke-virtual {v9, v10}, Lcom/daaw/f92;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    iput-object v9, p0, Lcom/daaw/nc2;->f:Lcom/daaw/f92;

    const-wide/32 v10, 0x3d090000

    iget v12, v9, Lcom/daaw/f92;->z:I

    int-to-long v12, v12

    div-long/2addr v10, v12

    iput-wide v10, p0, Lcom/daaw/nc2;->s:J

    iget-object v10, p0, Lcom/daaw/nc2;->d:Lcom/daaw/m42;

    invoke-interface {v10, v9}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lcom/daaw/nc2;->e(Lcom/daaw/cj5;)J

    move-result-wide v9

    long-to-int v10, v9

    invoke-virtual {p0, v0}, Lcom/daaw/nc2;->d(Lcom/daaw/cj5;)I

    move-result v9

    sub-int/2addr v10, v9

    invoke-virtual {v0, v10}, Lcom/daaw/cj5;->j(I)V

    :cond_4
    :goto_2
    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->c(I)I

    move-result v9

    iput v9, p0, Lcom/daaw/nc2;->o:I

    if-eqz v9, :cond_9

    if-eq v9, v2, :cond_8

    if-eq v9, v1, :cond_7

    if-eq v9, v8, :cond_7

    const/4 v1, 0x5

    if-eq v9, v1, :cond_7

    if-eq v9, v3, :cond_6

    const/4 v1, 0x7

    if-ne v9, v1, :cond_5

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_6
    :goto_3
    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    goto :goto_4

    :cond_7
    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->j(I)V

    goto :goto_4

    :cond_8
    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->j(I)V

    goto :goto_4

    :cond_9
    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :goto_4
    invoke-virtual {v0}, Lcom/daaw/cj5;->l()Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/nc2;->p:Z

    const-wide/16 v8, 0x0

    iput-wide v8, p0, Lcom/daaw/nc2;->q:J

    if-eqz v1, :cond_c

    if-eq v7, v2, :cond_b

    :cond_a
    invoke-virtual {v0}, Lcom/daaw/cj5;->l()Z

    move-result v1

    iget-wide v2, p0, Lcom/daaw/nc2;->q:J

    shl-long/2addr v2, v5

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->c(I)I

    move-result v7

    int-to-long v7, v7

    add-long/2addr v2, v7

    iput-wide v2, p0, Lcom/daaw/nc2;->q:J

    if-nez v1, :cond_a

    goto :goto_5

    :cond_b
    invoke-static {v0}, Lcom/daaw/nc2;->e(Lcom/daaw/cj5;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/nc2;->q:J

    :cond_c
    :goto_5
    invoke-virtual {v0}, Lcom/daaw/cj5;->l()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    goto :goto_6

    :cond_d
    invoke-static {v6, v6}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_e
    invoke-static {v6, v6}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_f
    invoke-static {v6, v6}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_10
    iget-boolean v1, p0, Lcom/daaw/nc2;->l:Z

    if-nez v1, :cond_11

    goto/16 :goto_9

    :cond_11
    :goto_6
    iget v1, p0, Lcom/daaw/nc2;->m:I

    if-nez v1, :cond_17

    iget v1, p0, Lcom/daaw/nc2;->n:I

    if-nez v1, :cond_16

    iget v1, p0, Lcom/daaw/nc2;->o:I

    if-nez v1, :cond_15

    const/4 v1, 0x0

    :goto_7
    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->c(I)I

    move-result v2

    add-int v10, v1, v2

    const/16 v1, 0xff

    if-eq v2, v1, :cond_14

    invoke-virtual {v0}, Lcom/daaw/cj5;->b()I

    move-result v1

    and-int/lit8 v2, v1, 0x7

    if-nez v2, :cond_12

    iget-object v2, p0, Lcom/daaw/nc2;->b:Lcom/daaw/ik5;

    shr-int/lit8 v1, v1, 0x3

    invoke-virtual {v2, v1}, Lcom/daaw/ik5;->f(I)V

    goto :goto_8

    :cond_12
    iget-object v1, p0, Lcom/daaw/nc2;->b:Lcom/daaw/ik5;

    invoke-virtual {v1}, Lcom/daaw/ik5;->h()[B

    move-result-object v1

    mul-int/lit8 v2, v10, 0x8

    invoke-virtual {v0, v1, v4, v2}, Lcom/daaw/cj5;->f([BII)V

    iget-object v1, p0, Lcom/daaw/nc2;->b:Lcom/daaw/ik5;

    invoke-virtual {v1, v4}, Lcom/daaw/ik5;->f(I)V

    :goto_8
    iget-object v1, p0, Lcom/daaw/nc2;->d:Lcom/daaw/m42;

    iget-object v2, p0, Lcom/daaw/nc2;->b:Lcom/daaw/ik5;

    invoke-interface {v1, v2, v10}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iget-wide v7, p0, Lcom/daaw/nc2;->k:J

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v7, v1

    if-eqz v3, :cond_13

    iget-object v6, p0, Lcom/daaw/nc2;->d:Lcom/daaw/m42;

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-interface/range {v6 .. v12}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    iget-wide v1, p0, Lcom/daaw/nc2;->k:J

    iget-wide v5, p0, Lcom/daaw/nc2;->s:J

    add-long/2addr v1, v5

    iput-wide v1, p0, Lcom/daaw/nc2;->k:J

    :cond_13
    iget-boolean v1, p0, Lcom/daaw/nc2;->p:Z

    if-eqz v1, :cond_1c

    iget-wide v1, p0, Lcom/daaw/nc2;->q:J

    long-to-int v2, v1

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    goto :goto_9

    :cond_14
    move v1, v10

    goto :goto_7

    :cond_15
    invoke-static {v6, v6}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_16
    invoke-static {v6, v6}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_17
    invoke-static {v6, v6}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_18
    iget v0, p0, Lcom/daaw/nc2;->j:I

    and-int/lit16 v0, v0, -0xe1

    shl-int/2addr v0, v5

    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result v2

    or-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/nc2;->i:I

    iget-object v2, p0, Lcom/daaw/nc2;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    array-length v3, v3

    if-le v0, v3, :cond_19

    invoke-virtual {v2, v0}, Lcom/daaw/ik5;->c(I)V

    iget-object v0, p0, Lcom/daaw/nc2;->c:Lcom/daaw/cj5;

    iget-object v2, p0, Lcom/daaw/nc2;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    array-length v3, v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/cj5;->g([BI)V

    :cond_19
    iput v4, p0, Lcom/daaw/nc2;->h:I

    iput v1, p0, Lcom/daaw/nc2;->g:I

    goto/16 :goto_0

    :cond_1a
    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result v0

    and-int/lit16 v2, v0, 0xe0

    const/16 v5, 0xe0

    if-ne v2, v5, :cond_1b

    iput v0, p0, Lcom/daaw/nc2;->j:I

    iput v3, p0, Lcom/daaw/nc2;->g:I

    goto/16 :goto_0

    :cond_1b
    if-eq v0, v1, :cond_0

    :cond_1c
    :goto_9
    iput v4, p0, Lcom/daaw/nc2;->g:I

    goto/16 :goto_0

    :cond_1d
    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result v0

    if-ne v0, v1, :cond_0

    iput v2, p0, Lcom/daaw/nc2;->g:I

    goto/16 :goto_0

    :cond_1e
    return-void
.end method

.method public final b(Lcom/daaw/m09;Lcom/daaw/td2;)V
    .locals 2

    invoke-virtual {p2}, Lcom/daaw/td2;->c()V

    invoke-virtual {p2}, Lcom/daaw/td2;->a()I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/nc2;->d:Lcom/daaw/m42;

    invoke-virtual {p2}, Lcom/daaw/td2;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/nc2;->e:Ljava/lang/String;

    return-void
.end method

.method public final c(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iput-wide p1, p0, Lcom/daaw/nc2;->k:J

    :cond_0
    return-void
.end method

.method public final d(Lcom/daaw/cj5;)I
    .locals 3

    invoke-virtual {p1}, Lcom/daaw/cj5;->a()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lcom/daaw/zy8;->b(Lcom/daaw/cj5;Z)Lcom/daaw/yy8;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/yy8;->c:Ljava/lang/String;

    iput-object v2, p0, Lcom/daaw/nc2;->u:Ljava/lang/String;

    iget v2, v1, Lcom/daaw/yy8;->a:I

    iput v2, p0, Lcom/daaw/nc2;->r:I

    iget v1, v1, Lcom/daaw/yy8;->b:I

    iput v1, p0, Lcom/daaw/nc2;->t:I

    invoke-virtual {p1}, Lcom/daaw/cj5;->a()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/nc2;->g:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lcom/daaw/nc2;->k:J

    iput-boolean v0, p0, Lcom/daaw/nc2;->l:Z

    return-void
.end method
