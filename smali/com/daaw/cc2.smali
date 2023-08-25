.class public final Lcom/daaw/cc2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ac2;


# static fields
.field public static final q:[D


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/daaw/m42;

.field public final c:Lcom/daaw/wd2;

.field public final d:Lcom/daaw/ik5;

.field public final e:Lcom/daaw/pc2;

.field public final f:[Z

.field public final g:Lcom/daaw/bc2;

.field public h:J

.field public i:Z

.field public j:Z

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [D

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/cc2;->q:[D

    return-void

    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
.end method

.method public constructor <init>(Lcom/daaw/wd2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cc2;->c:Lcom/daaw/wd2;

    const/4 v0, 0x4

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/daaw/cc2;->f:[Z

    new-instance v0, Lcom/daaw/bc2;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lcom/daaw/bc2;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/cc2;->g:Lcom/daaw/bc2;

    if-eqz p1, :cond_0

    new-instance p1, Lcom/daaw/pc2;

    const/16 v0, 0xb2

    invoke-direct {p1, v0, v1}, Lcom/daaw/pc2;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/cc2;->e:Lcom/daaw/pc2;

    new-instance p1, Lcom/daaw/ik5;

    invoke-direct {p1}, Lcom/daaw/ik5;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/cc2;->e:Lcom/daaw/pc2;

    :goto_0
    iput-object p1, p0, Lcom/daaw/cc2;->d:Lcom/daaw/ik5;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/cc2;->l:J

    iput-wide v0, p0, Lcom/daaw/cc2;->n:J

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/cc2;->b:Lcom/daaw/m42;

    invoke-static {v1}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->l()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    iget-wide v4, v0, Lcom/daaw/cc2;->h:J

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Lcom/daaw/cc2;->h:J

    iget-object v4, v0, Lcom/daaw/cc2;->b:Lcom/daaw/m42;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v5

    move-object/from16 v6, p1

    invoke-interface {v4, v6, v5}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    :goto_0
    iget-object v4, v0, Lcom/daaw/cc2;->f:[Z

    invoke-static {v3, v1, v2, v4}, Lcom/daaw/c42;->a([BII[Z)I

    move-result v4

    if-ne v4, v2, :cond_2

    iget-boolean v4, v0, Lcom/daaw/cc2;->j:Z

    if-nez v4, :cond_0

    iget-object v4, v0, Lcom/daaw/cc2;->g:Lcom/daaw/bc2;

    invoke-virtual {v4, v3, v1, v2}, Lcom/daaw/bc2;->a([BII)V

    :cond_0
    iget-object v4, v0, Lcom/daaw/cc2;->e:Lcom/daaw/pc2;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v3, v1, v2}, Lcom/daaw/pc2;->a([BII)V

    :cond_1
    return-void

    :cond_2
    add-int/lit8 v5, v4, 0x3

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v7

    aget-byte v7, v7, v5

    and-int/lit16 v7, v7, 0xff

    sub-int v8, v4, v1

    iget-boolean v9, v0, Lcom/daaw/cc2;->j:Z

    if-nez v9, :cond_a

    if-lez v8, :cond_3

    iget-object v9, v0, Lcom/daaw/cc2;->g:Lcom/daaw/bc2;

    invoke-virtual {v9, v3, v1, v4}, Lcom/daaw/bc2;->a([BII)V

    :cond_3
    if-gez v8, :cond_4

    neg-int v9, v8

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    :goto_1
    iget-object v12, v0, Lcom/daaw/cc2;->g:Lcom/daaw/bc2;

    invoke-virtual {v12, v7, v9}, Lcom/daaw/bc2;->c(II)Z

    move-result v9

    if-eqz v9, :cond_a

    iget-object v9, v0, Lcom/daaw/cc2;->g:Lcom/daaw/bc2;

    iget-object v12, v0, Lcom/daaw/cc2;->a:Ljava/lang/String;

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v13, v9, Lcom/daaw/bc2;->d:[B

    iget v14, v9, Lcom/daaw/bc2;->b:I

    invoke-static {v13, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v13

    const/4 v14, 0x4

    aget-byte v15, v13, v14

    const/16 v16, 0x5

    aget-byte v10, v13, v16

    and-int/lit16 v10, v10, 0xff

    and-int/lit16 v15, v15, 0xff

    shl-int/2addr v15, v14

    shr-int/lit8 v17, v10, 0x4

    or-int v15, v15, v17

    and-int/lit8 v10, v10, 0xf

    const/16 v11, 0x8

    shl-int/2addr v10, v11

    const/16 v18, 0x6

    aget-byte v11, v13, v18

    and-int/lit16 v11, v11, 0xff

    or-int/2addr v10, v11

    const/4 v11, 0x7

    aget-byte v14, v13, v11

    and-int/lit16 v14, v14, 0xf0

    const/4 v11, 0x4

    shr-int/2addr v14, v11

    const/4 v11, 0x2

    if-eq v14, v11, :cond_7

    const/4 v11, 0x3

    if-eq v14, v11, :cond_6

    const/4 v11, 0x4

    if-eq v14, v11, :cond_5

    const/high16 v11, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_5
    mul-int/lit8 v11, v10, 0x79

    int-to-float v11, v11

    mul-int/lit8 v14, v15, 0x64

    goto :goto_2

    :cond_6
    mul-int/lit8 v11, v10, 0x10

    int-to-float v11, v11

    mul-int/lit8 v14, v15, 0x9

    goto :goto_2

    :cond_7
    mul-int/lit8 v11, v10, 0x4

    int-to-float v11, v11

    mul-int/lit8 v14, v15, 0x3

    :goto_2
    int-to-float v14, v14

    div-float/2addr v11, v14

    :goto_3
    new-instance v14, Lcom/daaw/b72;

    invoke-direct {v14}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v14, v12}, Lcom/daaw/b72;->h(Ljava/lang/String;)Lcom/daaw/b72;

    const-string v12, "video/mpeg2"

    invoke-virtual {v14, v12}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v14, v15}, Lcom/daaw/b72;->x(I)Lcom/daaw/b72;

    invoke-virtual {v14, v10}, Lcom/daaw/b72;->f(I)Lcom/daaw/b72;

    invoke-virtual {v14, v11}, Lcom/daaw/b72;->p(F)Lcom/daaw/b72;

    invoke-static {v13}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-virtual {v14, v10}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    invoke-virtual {v14}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v10

    const/4 v11, 0x7

    aget-byte v11, v13, v11

    and-int/lit8 v11, v11, 0xf

    add-int/lit8 v11, v11, -0x1

    const-wide/16 v14, 0x0

    if-ltz v11, :cond_9

    const/16 v12, 0x8

    if-ge v11, v12, :cond_9

    sget-object v12, Lcom/daaw/cc2;->q:[D

    aget-wide v11, v12, v11

    iget v9, v9, Lcom/daaw/bc2;->c:I

    add-int/lit8 v9, v9, 0x9

    aget-byte v9, v13, v9

    and-int/lit8 v13, v9, 0x60

    shr-int/lit8 v13, v13, 0x5

    and-int/lit8 v9, v9, 0x1f

    if-eq v13, v9, :cond_8

    int-to-double v13, v13

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v13, v15

    add-int/lit8 v9, v9, 0x1

    move/from16 v16, v5

    int-to-double v5, v9

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v13, v5

    mul-double v11, v11, v13

    goto :goto_4

    :cond_8
    move/from16 v16, v5

    :goto_4
    const-wide v5, 0x412e848000000000L    # 1000000.0

    div-double/2addr v5, v11

    double-to-long v14, v5

    goto :goto_5

    :cond_9
    move/from16 v16, v5

    :goto_5
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v10, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v5

    iget-object v6, v0, Lcom/daaw/cc2;->b:Lcom/daaw/m42;

    iget-object v9, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lcom/daaw/f92;

    invoke-interface {v6, v9}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/daaw/cc2;->k:J

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/daaw/cc2;->j:Z

    goto :goto_6

    :cond_a
    move/from16 v16, v5

    :goto_6
    iget-object v5, v0, Lcom/daaw/cc2;->e:Lcom/daaw/pc2;

    const/16 v6, 0xb2

    if-eqz v5, :cond_e

    if-lez v8, :cond_b

    invoke-virtual {v5, v3, v1, v4}, Lcom/daaw/pc2;->a([BII)V

    const/4 v1, 0x0

    goto :goto_7

    :cond_b
    neg-int v1, v8

    :goto_7
    iget-object v5, v0, Lcom/daaw/cc2;->e:Lcom/daaw/pc2;

    invoke-virtual {v5, v1}, Lcom/daaw/pc2;->d(I)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, v0, Lcom/daaw/cc2;->e:Lcom/daaw/pc2;

    iget-object v5, v1, Lcom/daaw/pc2;->d:[B

    iget v1, v1, Lcom/daaw/pc2;->e:I

    invoke-static {v5, v1}, Lcom/daaw/c42;->b([BI)I

    move-result v1

    iget-object v5, v0, Lcom/daaw/cc2;->d:Lcom/daaw/ik5;

    sget v8, Lcom/daaw/it5;->a:I

    iget-object v8, v0, Lcom/daaw/cc2;->e:Lcom/daaw/pc2;

    iget-object v8, v8, Lcom/daaw/pc2;->d:[B

    invoke-virtual {v5, v8, v1}, Lcom/daaw/ik5;->d([BI)V

    iget-object v1, v0, Lcom/daaw/cc2;->c:Lcom/daaw/wd2;

    iget-wide v8, v0, Lcom/daaw/cc2;->n:J

    iget-object v5, v0, Lcom/daaw/cc2;->d:Lcom/daaw/ik5;

    invoke-virtual {v1, v8, v9, v5}, Lcom/daaw/wd2;->a(JLcom/daaw/ik5;)V

    :cond_c
    if-ne v7, v6, :cond_e

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v1

    add-int/lit8 v5, v4, 0x2

    aget-byte v1, v1, v5

    const/4 v5, 0x1

    if-ne v1, v5, :cond_d

    iget-object v1, v0, Lcom/daaw/cc2;->e:Lcom/daaw/pc2;

    invoke-virtual {v1, v6}, Lcom/daaw/pc2;->c(I)V

    :cond_d
    const/16 v7, 0xb2

    :cond_e
    if-eqz v7, :cond_10

    const/16 v1, 0xb3

    if-ne v7, v1, :cond_f

    goto :goto_8

    :cond_f
    const/16 v1, 0xb8

    if-ne v7, v1, :cond_17

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/cc2;->o:Z

    goto :goto_d

    :cond_10
    :goto_8
    sub-int v1, v2, v4

    iget-boolean v4, v0, Lcom/daaw/cc2;->p:Z

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v4, :cond_11

    iget-boolean v4, v0, Lcom/daaw/cc2;->j:Z

    if-eqz v4, :cond_11

    iget-wide v9, v0, Lcom/daaw/cc2;->n:J

    cmp-long v4, v9, v5

    if-eqz v4, :cond_11

    iget-boolean v11, v0, Lcom/daaw/cc2;->o:Z

    iget-wide v12, v0, Lcom/daaw/cc2;->h:J

    iget-wide v14, v0, Lcom/daaw/cc2;->m:J

    iget-object v8, v0, Lcom/daaw/cc2;->b:Lcom/daaw/m42;

    sub-long/2addr v12, v14

    long-to-int v4, v12

    sub-int v12, v4, v1

    const/4 v14, 0x0

    move v13, v1

    invoke-interface/range {v8 .. v14}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    :cond_11
    iget-boolean v4, v0, Lcom/daaw/cc2;->i:Z

    if-eqz v4, :cond_13

    iget-boolean v4, v0, Lcom/daaw/cc2;->p:Z

    if-eqz v4, :cond_12

    goto :goto_9

    :cond_12
    const/4 v1, 0x0

    const/4 v4, 0x1

    goto :goto_b

    :cond_13
    :goto_9
    iget-wide v8, v0, Lcom/daaw/cc2;->h:J

    int-to-long v10, v1

    sub-long/2addr v8, v10

    iput-wide v8, v0, Lcom/daaw/cc2;->m:J

    iget-wide v8, v0, Lcom/daaw/cc2;->l:J

    cmp-long v1, v8, v5

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-wide v8, v0, Lcom/daaw/cc2;->n:J

    cmp-long v1, v8, v5

    if-eqz v1, :cond_15

    iget-wide v10, v0, Lcom/daaw/cc2;->k:J

    add-long/2addr v8, v10

    goto :goto_a

    :cond_15
    move-wide v8, v5

    :goto_a
    iput-wide v8, v0, Lcom/daaw/cc2;->n:J

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/daaw/cc2;->o:Z

    iput-wide v5, v0, Lcom/daaw/cc2;->l:J

    const/4 v4, 0x1

    iput-boolean v4, v0, Lcom/daaw/cc2;->i:Z

    :goto_b
    if-nez v7, :cond_16

    const/4 v10, 0x1

    goto :goto_c

    :cond_16
    const/4 v10, 0x0

    :goto_c
    iput-boolean v10, v0, Lcom/daaw/cc2;->p:Z

    :cond_17
    :goto_d
    move-object/from16 v6, p1

    move/from16 v1, v16

    goto/16 :goto_0
.end method

.method public final b(Lcom/daaw/m09;Lcom/daaw/td2;)V
    .locals 2

    invoke-virtual {p2}, Lcom/daaw/td2;->c()V

    invoke-virtual {p2}, Lcom/daaw/td2;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/cc2;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/daaw/td2;->a()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/cc2;->b:Lcom/daaw/m42;

    iget-object v0, p0, Lcom/daaw/cc2;->c:Lcom/daaw/wd2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/wd2;->b(Lcom/daaw/m09;Lcom/daaw/td2;)V

    :cond_0
    return-void
.end method

.method public final c(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/cc2;->l:J

    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/cc2;->f:[Z

    invoke-static {v0}, Lcom/daaw/c42;->e([Z)V

    iget-object v0, p0, Lcom/daaw/cc2;->g:Lcom/daaw/bc2;

    invoke-virtual {v0}, Lcom/daaw/bc2;->b()V

    iget-object v0, p0, Lcom/daaw/cc2;->e:Lcom/daaw/pc2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/pc2;->b()V

    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/cc2;->h:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/cc2;->i:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/cc2;->l:J

    iput-wide v0, p0, Lcom/daaw/cc2;->n:J

    return-void
.end method
