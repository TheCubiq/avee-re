.class public final Lcom/daaw/yb2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ac2;


# instance fields
.field public final a:Lcom/daaw/ik5;

.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lcom/daaw/m42;

.field public e:I

.field public f:I

.field public g:I

.field public h:J

.field public i:Lcom/daaw/f92;

.field public j:I

.field public k:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/ik5;

    const/16 v1, 0x12

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>([B)V

    iput-object v0, p0, Lcom/daaw/yb2;->a:Lcom/daaw/ik5;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/yb2;->e:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/yb2;->k:J

    iput-object p1, p0, Lcom/daaw/yb2;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/daaw/yb2;->d:Lcom/daaw/m42;

    invoke-static {v2}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v2

    if-lez v2, :cond_d

    iget v2, v0, Lcom/daaw/yb2;->e:I

    const/16 v3, 0x8

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x4

    if-eqz v2, :cond_b

    if-eq v2, v7, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v2

    iget v3, v0, Lcom/daaw/yb2;->j:I

    iget v4, v0, Lcom/daaw/yb2;->f:I

    sub-int/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, v0, Lcom/daaw/yb2;->d:Lcom/daaw/m42;

    invoke-interface {v3, v1, v2}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iget v3, v0, Lcom/daaw/yb2;->f:I

    add-int/2addr v3, v2

    iput v3, v0, Lcom/daaw/yb2;->f:I

    iget v11, v0, Lcom/daaw/yb2;->j:I

    if-ne v3, v11, :cond_0

    iget-wide v8, v0, Lcom/daaw/yb2;->k:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v8, v2

    if-eqz v4, :cond_1

    iget-object v7, v0, Lcom/daaw/yb2;->d:Lcom/daaw/m42;

    const/4 v10, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-interface/range {v7 .. v13}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    iget-wide v2, v0, Lcom/daaw/yb2;->k:J

    iget-wide v4, v0, Lcom/daaw/yb2;->h:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Lcom/daaw/yb2;->k:J

    :cond_1
    iput v6, v0, Lcom/daaw/yb2;->e:I

    goto :goto_0

    :cond_2
    iget-object v2, v0, Lcom/daaw/yb2;->a:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v9

    iget v10, v0, Lcom/daaw/yb2;->f:I

    const/16 v11, 0x12

    rsub-int/lit8 v10, v10, 0x12

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    iget v10, v0, Lcom/daaw/yb2;->f:I

    invoke-virtual {v1, v2, v10, v9}, Lcom/daaw/ik5;->b([BII)V

    iget v2, v0, Lcom/daaw/yb2;->f:I

    add-int/2addr v2, v9

    iput v2, v0, Lcom/daaw/yb2;->f:I

    if-ne v2, v11, :cond_0

    iget-object v2, v0, Lcom/daaw/yb2;->a:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    iget-object v9, v0, Lcom/daaw/yb2;->i:Lcom/daaw/f92;

    if-nez v9, :cond_3

    iget-object v9, v0, Lcom/daaw/yb2;->c:Ljava/lang/String;

    iget-object v10, v0, Lcom/daaw/yb2;->b:Ljava/lang/String;

    const/4 v12, 0x0

    invoke-static {v2, v9, v10, v12}, Lcom/daaw/g09;->a([BLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/f92;

    move-result-object v9

    iput-object v9, v0, Lcom/daaw/yb2;->i:Lcom/daaw/f92;

    iget-object v10, v0, Lcom/daaw/yb2;->d:Lcom/daaw/m42;

    invoke-interface {v10, v9}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    :cond_3
    sget v9, Lcom/daaw/g09;->d:I

    aget-byte v9, v2, v6

    const/16 v10, 0x1f

    const/4 v12, -0x1

    const/4 v13, -0x2

    const/4 v14, 0x5

    const/4 v15, 0x6

    const/16 v16, 0x7

    if-eq v9, v13, :cond_6

    if-eq v9, v12, :cond_5

    if-eq v9, v10, :cond_4

    aget-byte v3, v2, v14

    and-int/2addr v3, v4

    shl-int/lit8 v3, v3, 0xc

    aget-byte v4, v2, v15

    and-int/lit16 v4, v4, 0xff

    shl-int/2addr v4, v8

    or-int/2addr v3, v4

    aget-byte v4, v2, v16

    goto :goto_2

    :cond_4
    aget-byte v9, v2, v15

    and-int/2addr v4, v9

    shl-int/lit8 v4, v4, 0xc

    aget-byte v9, v2, v16

    and-int/lit16 v9, v9, 0xff

    shl-int/2addr v9, v8

    or-int/2addr v4, v9

    aget-byte v3, v2, v3

    and-int/lit8 v3, v3, 0x3c

    shr-int/2addr v3, v5

    or-int/2addr v3, v4

    goto :goto_1

    :cond_5
    aget-byte v3, v2, v16

    and-int/2addr v3, v4

    shl-int/lit8 v3, v3, 0xc

    aget-byte v4, v2, v15

    and-int/lit16 v4, v4, 0xff

    shl-int/2addr v4, v8

    or-int/2addr v3, v4

    const/16 v4, 0x9

    aget-byte v4, v2, v4

    and-int/lit8 v4, v4, 0x3c

    shr-int/2addr v4, v5

    or-int/2addr v3, v4

    :goto_1
    add-int/2addr v3, v7

    const/4 v4, 0x1

    goto :goto_3

    :cond_6
    aget-byte v3, v2, v8

    and-int/2addr v3, v4

    shl-int/lit8 v3, v3, 0xc

    aget-byte v4, v2, v16

    and-int/lit16 v4, v4, 0xff

    shl-int/2addr v4, v8

    or-int/2addr v3, v4

    aget-byte v4, v2, v15

    :goto_2
    and-int/lit16 v4, v4, 0xf0

    shr-int/2addr v4, v8

    or-int/2addr v3, v4

    add-int/2addr v3, v7

    const/4 v4, 0x0

    :goto_3
    if-eqz v4, :cond_7

    mul-int/lit8 v3, v3, 0x10

    div-int/lit8 v3, v3, 0xe

    :cond_7
    iput v3, v0, Lcom/daaw/yb2;->j:I

    aget-byte v3, v2, v6

    if-eq v3, v13, :cond_a

    if-eq v3, v12, :cond_9

    if-eq v3, v10, :cond_8

    aget-byte v3, v2, v8

    and-int/2addr v3, v7

    shl-int/2addr v3, v15

    aget-byte v2, v2, v14

    goto :goto_5

    :cond_8
    aget-byte v3, v2, v14

    and-int/lit8 v3, v3, 0x7

    shl-int/2addr v3, v8

    aget-byte v2, v2, v15

    goto :goto_4

    :cond_9
    aget-byte v3, v2, v8

    and-int/lit8 v3, v3, 0x7

    shl-int/2addr v3, v8

    aget-byte v2, v2, v16

    :goto_4
    and-int/lit8 v2, v2, 0x3c

    goto :goto_6

    :cond_a
    aget-byte v3, v2, v14

    and-int/2addr v3, v7

    shl-int/2addr v3, v15

    aget-byte v2, v2, v8

    :goto_5
    and-int/lit16 v2, v2, 0xfc

    :goto_6
    shr-int/2addr v2, v5

    or-int/2addr v2, v3

    add-int/2addr v2, v7

    mul-int/lit8 v2, v2, 0x20

    int-to-long v2, v2

    const-wide/32 v7, 0xf4240

    mul-long v2, v2, v7

    iget-object v4, v0, Lcom/daaw/yb2;->i:Lcom/daaw/f92;

    iget v4, v4, Lcom/daaw/f92;->z:I

    int-to-long v7, v4

    div-long/2addr v2, v7

    long-to-int v3, v2

    int-to-long v2, v3

    iput-wide v2, v0, Lcom/daaw/yb2;->h:J

    iget-object v2, v0, Lcom/daaw/yb2;->a:Lcom/daaw/ik5;

    invoke-virtual {v2, v6}, Lcom/daaw/ik5;->f(I)V

    iget-object v2, v0, Lcom/daaw/yb2;->d:Lcom/daaw/m42;

    iget-object v3, v0, Lcom/daaw/yb2;->a:Lcom/daaw/ik5;

    invoke-interface {v2, v3, v11}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iput v5, v0, Lcom/daaw/yb2;->e:I

    goto/16 :goto_0

    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v2

    if-lez v2, :cond_0

    iget v2, v0, Lcom/daaw/yb2;->g:I

    shl-int/2addr v2, v3

    iput v2, v0, Lcom/daaw/yb2;->g:I

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v9

    or-int/2addr v2, v9

    iput v2, v0, Lcom/daaw/yb2;->g:I

    sget v9, Lcom/daaw/g09;->d:I

    const v9, 0x7ffe8001

    if-eq v2, v9, :cond_c

    const v9, -0x180fe80

    if-eq v2, v9, :cond_c

    const v9, 0x1fffe800

    if-eq v2, v9, :cond_c

    const v9, -0xe0ff18

    if-ne v2, v9, :cond_b

    :cond_c
    iget-object v2, v0, Lcom/daaw/yb2;->a:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    iget v3, v0, Lcom/daaw/yb2;->g:I

    shr-int/lit8 v9, v3, 0x18

    and-int/lit16 v9, v9, 0xff

    int-to-byte v9, v9

    aput-byte v9, v2, v6

    shr-int/lit8 v9, v3, 0x10

    and-int/lit16 v9, v9, 0xff

    int-to-byte v9, v9

    aput-byte v9, v2, v7

    shr-int/lit8 v9, v3, 0x8

    and-int/lit16 v9, v9, 0xff

    int-to-byte v9, v9

    aput-byte v9, v2, v5

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v2, v4

    iput v8, v0, Lcom/daaw/yb2;->f:I

    iput v6, v0, Lcom/daaw/yb2;->g:I

    iput v7, v0, Lcom/daaw/yb2;->e:I

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method public final b(Lcom/daaw/m09;Lcom/daaw/td2;)V
    .locals 1

    invoke-virtual {p2}, Lcom/daaw/td2;->c()V

    invoke-virtual {p2}, Lcom/daaw/td2;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/yb2;->c:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/daaw/td2;->a()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/yb2;->d:Lcom/daaw/m42;

    return-void
.end method

.method public final c(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iput-wide p1, p0, Lcom/daaw/yb2;->k:J

    :cond_0
    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/yb2;->e:I

    iput v0, p0, Lcom/daaw/yb2;->f:I

    iput v0, p0, Lcom/daaw/yb2;->g:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/yb2;->k:J

    return-void
.end method
