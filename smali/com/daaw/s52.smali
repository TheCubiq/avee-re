.class public final Lcom/daaw/s52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j09;


# static fields
.field public static final n:Lcom/daaw/q09;


# instance fields
.field public final a:[B

.field public final b:Lcom/daaw/ik5;

.field public final c:Lcom/daaw/r09;

.field public d:Lcom/daaw/m09;

.field public e:Lcom/daaw/m42;

.field public f:I

.field public g:Lcom/google/android/gms/internal/ads/zzbq;

.field public h:Lcom/daaw/w09;

.field public i:I

.field public j:I

.field public k:Lcom/daaw/q52;

.field public l:I

.field public m:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/r52;->b:Lcom/daaw/r52;

    sput-object v0, Lcom/daaw/s52;->n:Lcom/daaw/q09;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x2a

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/daaw/s52;->a:[B

    new-instance p1, Lcom/daaw/ik5;

    const v0, 0x8000

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/ik5;-><init>([BI)V

    iput-object p1, p0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    new-instance p1, Lcom/daaw/r09;

    invoke-direct {p1}, Lcom/daaw/r09;-><init>()V

    iput-object p1, p0, Lcom/daaw/s52;->c:Lcom/daaw/r09;

    iput v1, p0, Lcom/daaw/s52;->f:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 5

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/t09;->a(Lcom/daaw/k09;Z)Lcom/google/android/gms/internal/ads/zzbq;

    new-instance v1, Lcom/daaw/ik5;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/daaw/ik5;-><init>(I)V

    invoke-virtual {v1}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, v3, v0, v2, v0}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-virtual {v1}, Lcom/daaw/ik5;->A()J

    move-result-wide v1

    const-wide/32 v3, 0x664c6143

    cmp-long p1, v1, v3

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final b(Lcom/daaw/ik5;Z)J
    .locals 4

    iget-object v0, p0, Lcom/daaw/s52;->h:Lcom/daaw/w09;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/daaw/ik5;->k()I

    move-result v0

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/ik5;->l()I

    move-result v1

    add-int/lit8 v1, v1, -0x10

    if-gt v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lcom/daaw/ik5;->f(I)V

    iget-object v1, p0, Lcom/daaw/s52;->h:Lcom/daaw/w09;

    iget v2, p0, Lcom/daaw/s52;->j:I

    iget-object v3, p0, Lcom/daaw/s52;->c:Lcom/daaw/r09;

    invoke-static {p1, v1, v2, v3}, Lcom/daaw/s09;->c(Lcom/daaw/ik5;Lcom/daaw/w09;ILcom/daaw/r09;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-virtual {p1, v0}, Lcom/daaw/ik5;->f(I)V

    iget-object p1, p0, Lcom/daaw/s52;->c:Lcom/daaw/r09;

    iget-wide p1, p1, Lcom/daaw/r09;->a:J

    return-wide p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_5

    :goto_2
    invoke-virtual {p1}, Lcom/daaw/ik5;->l()I

    move-result p2

    iget v1, p0, Lcom/daaw/s52;->i:I

    sub-int/2addr p2, v1

    if-gt v0, p2, :cond_4

    invoke-virtual {p1, v0}, Lcom/daaw/ik5;->f(I)V

    :try_start_0
    iget-object p2, p0, Lcom/daaw/s52;->h:Lcom/daaw/w09;

    iget v1, p0, Lcom/daaw/s52;->j:I

    iget-object v2, p0, Lcom/daaw/s52;->c:Lcom/daaw/r09;

    invoke-static {p1, p2, v1, v2}, Lcom/daaw/s09;->c(Lcom/daaw/ik5;Lcom/daaw/w09;ILcom/daaw/r09;)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    const/4 p2, 0x0

    :goto_3
    invoke-virtual {p1}, Lcom/daaw/ik5;->k()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/ik5;->l()I

    move-result v2

    if-le v1, v2, :cond_2

    goto :goto_4

    :cond_2
    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lcom/daaw/ik5;->l()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/ik5;->f(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Lcom/daaw/ik5;->f(I)V

    :goto_5
    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method public final c(Lcom/daaw/m09;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/s52;->d:Lcom/daaw/m09;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/s52;->e:Lcom/daaw/m42;

    invoke-interface {p1}, Lcom/daaw/m09;->zzC()V

    return-void
.end method

.method public final d(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lcom/daaw/s52;->f:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_17

    const/4 v5, 0x2

    if-eq v2, v3, :cond_16

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x4

    if-eq v2, v5, :cond_14

    if-eq v2, v7, :cond_d

    const-wide/16 v9, -0x1

    if-eq v2, v8, :cond_9

    iget-object v2, v0, Lcom/daaw/s52;->e:Lcom/daaw/m42;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/daaw/s52;->h:Lcom/daaw/w09;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v0, Lcom/daaw/s52;->k:Lcom/daaw/q52;

    const/4 v6, -0x1

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/daaw/nz8;->e()Z

    move-result v7

    if-eqz v7, :cond_0

    move-object/from16 v7, p2

    invoke-virtual {v5, v1, v7}, Lcom/daaw/nz8;->a(Lcom/daaw/k09;Lcom/daaw/f42;)I

    move-result v4

    goto/16 :goto_2

    :cond_0
    iget-wide v7, v0, Lcom/daaw/s52;->m:J

    cmp-long v5, v7, v9

    if-nez v5, :cond_1

    invoke-static {v1, v2}, Lcom/daaw/s09;->b(Lcom/daaw/k09;Lcom/daaw/w09;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/daaw/s52;->m:J

    goto/16 :goto_2

    :cond_1
    iget-object v2, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->l()I

    move-result v5

    const v7, 0x8000

    if-ge v5, v7, :cond_4

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    sub-int/2addr v7, v5

    invoke-interface {v1, v2, v5, v7}, Lcom/daaw/k09;->a([BII)I

    move-result v1

    if-ne v1, v6, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_3

    iget-object v2, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    add-int/2addr v5, v1

    invoke-virtual {v2, v5}, Lcom/daaw/ik5;->e(I)V

    goto :goto_1

    :cond_3
    iget-object v1, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-virtual {v1}, Lcom/daaw/ik5;->i()I

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/s52;->e()V

    const/4 v4, -0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :cond_5
    :goto_1
    iget-object v1, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-virtual {v1}, Lcom/daaw/ik5;->k()I

    move-result v2

    iget v5, v0, Lcom/daaw/s52;->l:I

    iget v6, v0, Lcom/daaw/s52;->i:I

    if-ge v5, v6, :cond_6

    sub-int/2addr v6, v5

    invoke-virtual {v1}, Lcom/daaw/ik5;->i()I

    move-result v5

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/daaw/ik5;->g(I)V

    :cond_6
    iget-object v1, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/s52;->b(Lcom/daaw/ik5;Z)J

    move-result-wide v5

    iget-object v1, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-virtual {v1}, Lcom/daaw/ik5;->k()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {v1, v2}, Lcom/daaw/ik5;->f(I)V

    iget-object v1, v0, Lcom/daaw/s52;->e:Lcom/daaw/m42;

    iget-object v2, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-static {v1, v2, v3}, Lcom/daaw/k42;->b(Lcom/daaw/m42;Lcom/daaw/ik5;I)V

    iget v1, v0, Lcom/daaw/s52;->l:I

    add-int/2addr v1, v3

    iput v1, v0, Lcom/daaw/s52;->l:I

    cmp-long v1, v5, v9

    if-eqz v1, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/s52;->e()V

    iput v4, v0, Lcom/daaw/s52;->l:I

    iput-wide v5, v0, Lcom/daaw/s52;->m:J

    :cond_7
    iget-object v1, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-virtual {v1}, Lcom/daaw/ik5;->i()I

    move-result v2

    const/16 v3, 0x10

    if-lt v2, v3, :cond_8

    :goto_2
    return v4

    :cond_8
    invoke-virtual {v1}, Lcom/daaw/ik5;->i()I

    move-result v2

    invoke-virtual {v1}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    invoke-virtual {v1}, Lcom/daaw/ik5;->k()I

    move-result v5

    invoke-virtual {v1}, Lcom/daaw/ik5;->h()[B

    move-result-object v1

    invoke-static {v3, v5, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-virtual {v1, v4}, Lcom/daaw/ik5;->f(I)V

    iget-object v1, v0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-virtual {v1, v2}, Lcom/daaw/ik5;->e(I)V

    return v4

    :cond_9
    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzj()V

    new-instance v2, Lcom/daaw/ik5;

    invoke-direct {v2, v5}, Lcom/daaw/ik5;-><init>(I)V

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    move-object v7, v1

    check-cast v7, Lcom/daaw/rz8;

    invoke-virtual {v7, v3, v4, v5, v4}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-virtual {v2}, Lcom/daaw/ik5;->w()I

    move-result v2

    shr-int/lit8 v3, v2, 0x2

    const/16 v5, 0x3ffe

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzj()V

    if-ne v3, v5, :cond_c

    iput v2, v0, Lcom/daaw/s52;->j:I

    iget-object v2, v0, Lcom/daaw/s52;->d:Lcom/daaw/m09;

    sget v3, Lcom/daaw/it5;->a:I

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v14

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzd()J

    move-result-wide v16

    iget-object v12, v0, Lcom/daaw/s52;->h:Lcom/daaw/w09;

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v12, Lcom/daaw/w09;->k:Lcom/daaw/v09;

    if-eqz v1, :cond_a

    new-instance v1, Lcom/daaw/u09;

    invoke-direct {v1, v12, v14, v15}, Lcom/daaw/u09;-><init>(Lcom/daaw/w09;J)V

    goto :goto_3

    :cond_a
    const-wide/16 v5, 0x0

    cmp-long v1, v16, v9

    if-eqz v1, :cond_b

    iget-wide v7, v12, Lcom/daaw/w09;->j:J

    cmp-long v1, v7, v5

    if-lez v1, :cond_b

    new-instance v1, Lcom/daaw/q52;

    iget v13, v0, Lcom/daaw/s52;->j:I

    move-object v11, v1

    invoke-direct/range {v11 .. v17}, Lcom/daaw/q52;-><init>(Lcom/daaw/w09;IJJ)V

    iput-object v1, v0, Lcom/daaw/s52;->k:Lcom/daaw/q52;

    invoke-virtual {v1}, Lcom/daaw/nz8;->b()Lcom/daaw/i42;

    move-result-object v1

    goto :goto_3

    :cond_b
    new-instance v1, Lcom/daaw/h42;

    invoke-virtual {v12}, Lcom/daaw/w09;->a()J

    move-result-wide v7

    invoke-direct {v1, v7, v8, v5, v6}, Lcom/daaw/h42;-><init>(JJ)V

    :goto_3
    invoke-interface {v2, v1}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    const/4 v1, 0x5

    iput v1, v0, Lcom/daaw/s52;->f:I

    return v4

    :cond_c
    const-string v1, "First frame does not start with sync code."

    invoke-static {v1, v6}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object v1

    throw v1

    :cond_d
    iget-object v2, v0, Lcom/daaw/s52;->h:Lcom/daaw/w09;

    :cond_e
    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzj()V

    new-instance v3, Lcom/daaw/cj5;

    new-array v5, v8, [B

    invoke-direct {v3, v5, v8}, Lcom/daaw/cj5;-><init>([BI)V

    iget-object v5, v3, Lcom/daaw/cj5;->a:[B

    move-object v6, v1

    check-cast v6, Lcom/daaw/rz8;

    invoke-virtual {v6, v5, v4, v8, v4}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-virtual {v3}, Lcom/daaw/cj5;->l()Z

    move-result v5

    const/4 v9, 0x7

    invoke-virtual {v3, v9}, Lcom/daaw/cj5;->c(I)I

    move-result v9

    const/16 v10, 0x18

    invoke-virtual {v3, v10}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    add-int/2addr v3, v8

    const/4 v10, 0x6

    if-nez v9, :cond_f

    const/16 v2, 0x26

    new-array v3, v2, [B

    invoke-virtual {v6, v3, v4, v2, v4}, Lcom/daaw/rz8;->e([BIIZ)Z

    new-instance v2, Lcom/daaw/w09;

    invoke-direct {v2, v3, v8}, Lcom/daaw/w09;-><init>([BI)V

    goto :goto_4

    :cond_f
    if-eqz v2, :cond_13

    if-ne v9, v7, :cond_10

    new-instance v9, Lcom/daaw/ik5;

    invoke-direct {v9, v3}, Lcom/daaw/ik5;-><init>(I)V

    invoke-virtual {v9}, Lcom/daaw/ik5;->h()[B

    move-result-object v11

    invoke-virtual {v6, v11, v4, v3, v4}, Lcom/daaw/rz8;->e([BIIZ)Z

    invoke-static {v9}, Lcom/daaw/t09;->b(Lcom/daaw/ik5;)Lcom/daaw/v09;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/w09;->f(Lcom/daaw/v09;)Lcom/daaw/w09;

    move-result-object v2

    goto :goto_4

    :cond_10
    if-ne v9, v8, :cond_11

    new-instance v9, Lcom/daaw/ik5;

    invoke-direct {v9, v3}, Lcom/daaw/ik5;-><init>(I)V

    invoke-virtual {v9}, Lcom/daaw/ik5;->h()[B

    move-result-object v11

    invoke-virtual {v6, v11, v4, v3, v4}, Lcom/daaw/rz8;->e([BIIZ)Z

    invoke-virtual {v9, v8}, Lcom/daaw/ik5;->g(I)V

    invoke-static {v9, v4, v4}, Lcom/daaw/s42;->c(Lcom/daaw/ik5;ZZ)Lcom/daaw/p42;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/p42;->b:[Ljava/lang/String;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/w09;->g(Ljava/util/List;)Lcom/daaw/w09;

    move-result-object v2

    goto :goto_4

    :cond_11
    if-ne v9, v10, :cond_12

    new-instance v9, Lcom/daaw/ik5;

    invoke-direct {v9, v3}, Lcom/daaw/ik5;-><init>(I)V

    invoke-virtual {v9}, Lcom/daaw/ik5;->h()[B

    move-result-object v11

    invoke-virtual {v6, v11, v4, v3, v4}, Lcom/daaw/rz8;->e([BIIZ)Z

    invoke-virtual {v9, v8}, Lcom/daaw/ik5;->g(I)V

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzacj;->a(Lcom/daaw/ik5;)Lcom/google/android/gms/internal/ads/zzacj;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/w09;->e(Ljava/util/List;)Lcom/daaw/w09;

    move-result-object v2

    goto :goto_4

    :cond_12
    invoke-virtual {v6, v3, v4}, Lcom/daaw/rz8;->l(IZ)Z

    :goto_4
    sget v3, Lcom/daaw/it5;->a:I

    iput-object v2, v0, Lcom/daaw/s52;->h:Lcom/daaw/w09;

    if-eqz v5, :cond_e

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, v2, Lcom/daaw/w09;->c:I

    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/s52;->i:I

    iget-object v1, v0, Lcom/daaw/s52;->e:Lcom/daaw/m42;

    iget-object v2, v0, Lcom/daaw/s52;->h:Lcom/daaw/w09;

    iget-object v3, v0, Lcom/daaw/s52;->a:[B

    iget-object v5, v0, Lcom/daaw/s52;->g:Lcom/google/android/gms/internal/ads/zzbq;

    invoke-virtual {v2, v3, v5}, Lcom/daaw/w09;->c([BLcom/google/android/gms/internal/ads/zzbq;)Lcom/daaw/f92;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    iput v8, v0, Lcom/daaw/s52;->f:I

    return v4

    :cond_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    :cond_14
    new-instance v2, Lcom/daaw/ik5;

    invoke-direct {v2, v8}, Lcom/daaw/ik5;-><init>(I)V

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    check-cast v1, Lcom/daaw/rz8;

    invoke-virtual {v1, v3, v4, v8, v4}, Lcom/daaw/rz8;->e([BIIZ)Z

    invoke-virtual {v2}, Lcom/daaw/ik5;->A()J

    move-result-wide v1

    const-wide/32 v8, 0x664c6143

    cmp-long v3, v1, v8

    if-nez v3, :cond_15

    iput v7, v0, Lcom/daaw/s52;->f:I

    return v4

    :cond_15
    const-string v1, "Failed to read FLAC stream marker."

    invoke-static {v1, v6}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object v1

    throw v1

    :cond_16
    iget-object v2, v0, Lcom/daaw/s52;->a:[B

    move-object v3, v1

    check-cast v3, Lcom/daaw/rz8;

    const/16 v6, 0x2a

    invoke-virtual {v3, v2, v4, v6, v4}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzj()V

    iput v5, v0, Lcom/daaw/s52;->f:I

    return v4

    :cond_17
    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzj()V

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zze()J

    move-result-wide v5

    invoke-static {v1, v3}, Lcom/daaw/t09;->a(Lcom/daaw/k09;Z)Lcom/google/android/gms/internal/ads/zzbq;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zze()J

    move-result-wide v7

    check-cast v1, Lcom/daaw/rz8;

    sub-long/2addr v7, v5

    long-to-int v5, v7

    invoke-virtual {v1, v5, v4}, Lcom/daaw/rz8;->l(IZ)Z

    iput-object v2, v0, Lcom/daaw/s52;->g:Lcom/google/android/gms/internal/ads/zzbq;

    iput v3, v0, Lcom/daaw/s52;->f:I

    return v4
.end method

.method public final e()V
    .locals 11

    iget-wide v0, p0, Lcom/daaw/s52;->m:J

    iget-object v2, p0, Lcom/daaw/s52;->h:Lcom/daaw/w09;

    sget v3, Lcom/daaw/it5;->a:I

    iget v2, v2, Lcom/daaw/w09;->e:I

    const-wide/32 v3, 0xf4240

    mul-long v0, v0, v3

    int-to-long v2, v2

    div-long v5, v0, v2

    iget-object v4, p0, Lcom/daaw/s52;->e:Lcom/daaw/m42;

    iget v8, p0, Lcom/daaw/s52;->l:I

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    return-void
.end method

.method public final f(JJ)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    iput v0, p0, Lcom/daaw/s52;->f:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/s52;->k:Lcom/daaw/q52;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p3, p4}, Lcom/daaw/nz8;->d(J)V

    :cond_1
    :goto_0
    cmp-long p1, p3, v1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v1, -0x1

    :goto_1
    iput-wide v1, p0, Lcom/daaw/s52;->m:J

    iput v0, p0, Lcom/daaw/s52;->l:I

    iget-object p1, p0, Lcom/daaw/s52;->b:Lcom/daaw/ik5;

    invoke-virtual {p1, v0}, Lcom/daaw/ik5;->c(I)V

    return-void
.end method
