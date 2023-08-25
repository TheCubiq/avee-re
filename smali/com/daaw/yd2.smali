.class public final Lcom/daaw/yd2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zd2;


# static fields
.field public static final m:[I

.field public static final n:[I


# instance fields
.field public final a:Lcom/daaw/m09;

.field public final b:Lcom/daaw/m42;

.field public final c:Lcom/daaw/ce2;

.field public final d:I

.field public final e:[B

.field public final f:Lcom/daaw/ik5;

.field public final g:I

.field public final h:Lcom/daaw/f92;

.field public i:I

.field public j:J

.field public k:I

.field public l:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/yd2;->m:[I

    const/16 v0, 0x59

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/daaw/yd2;->n:[I

    return-void

    nop

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        0x2
        0x4
        0x6
        0x8
        -0x1
        -0x1
        -0x1
        -0x1
        0x2
        0x4
        0x6
        0x8
    .end array-data

    :array_1
    .array-data 4
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0x10
        0x11
        0x13
        0x15
        0x17
        0x19
        0x1c
        0x1f
        0x22
        0x25
        0x29
        0x2d
        0x32
        0x37
        0x3c
        0x42
        0x49
        0x50
        0x58
        0x61
        0x6b
        0x76
        0x82
        0x8f
        0x9d
        0xad
        0xbe
        0xd1
        0xe6
        0xfd
        0x117
        0x133
        0x151
        0x173
        0x198
        0x1c1
        0x1ee
        0x220
        0x256
        0x292
        0x2d4
        0x31c
        0x36c
        0x3c3
        0x424
        0x48e
        0x502
        0x583
        0x610
        0x6ab
        0x756
        0x812
        0x8e0
        0x9c3
        0xabd
        0xbd0
        0xcff
        0xe4c
        0xfba
        0x114c
        0x1307
        0x14ee
        0x1706
        0x1954
        0x1bdc
        0x1ea5
        0x21b6
        0x2515
        0x28ca
        0x2cdf
        0x315b
        0x364b
        0x3bb9
        0x41b2
        0x4844
        0x4f7e
        0x5771
        0x602f
        0x69ce
        0x7462
        0x7fff
    .end array-data
.end method

.method public constructor <init>(Lcom/daaw/m09;Lcom/daaw/m42;Lcom/daaw/ce2;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yd2;->a:Lcom/daaw/m09;

    iput-object p2, p0, Lcom/daaw/yd2;->b:Lcom/daaw/m42;

    iput-object p3, p0, Lcom/daaw/yd2;->c:Lcom/daaw/ce2;

    iget p1, p3, Lcom/daaw/ce2;->c:I

    div-int/lit8 p1, p1, 0xa

    const/4 p2, 0x1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/yd2;->g:I

    new-instance v0, Lcom/daaw/ik5;

    iget-object v1, p3, Lcom/daaw/ce2;->f:[B

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>([B)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->q()I

    invoke-virtual {v0}, Lcom/daaw/ik5;->q()I

    move-result v0

    iput v0, p0, Lcom/daaw/yd2;->d:I

    iget v1, p3, Lcom/daaw/ce2;->b:I

    iget v2, p3, Lcom/daaw/ce2;->d:I

    mul-int/lit8 v3, v1, 0x4

    sub-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x8

    iget v3, p3, Lcom/daaw/ce2;->e:I

    mul-int v3, v3, v1

    div-int/2addr v2, v3

    add-int/2addr v2, p2

    if-ne v0, v2, :cond_0

    invoke-static {p1, v0}, Lcom/daaw/it5;->O(II)I

    move-result p2

    iget v2, p3, Lcom/daaw/ce2;->d:I

    mul-int v2, v2, p2

    new-array v2, v2, [B

    iput-object v2, p0, Lcom/daaw/yd2;->e:[B

    new-instance v2, Lcom/daaw/ik5;

    add-int v3, v0, v0

    mul-int v3, v3, v1

    mul-int p2, p2, v3

    invoke-direct {v2, p2}, Lcom/daaw/ik5;-><init>(I)V

    iput-object v2, p0, Lcom/daaw/yd2;->f:Lcom/daaw/ik5;

    iget p2, p3, Lcom/daaw/ce2;->c:I

    iget v2, p3, Lcom/daaw/ce2;->d:I

    mul-int p2, p2, v2

    mul-int/lit8 p2, p2, 0x8

    div-int/2addr p2, v0

    new-instance v0, Lcom/daaw/b72;

    invoke-direct {v0}, Lcom/daaw/b72;-><init>()V

    const-string v2, "audio/raw"

    invoke-virtual {v0, v2}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0, p2}, Lcom/daaw/b72;->d0(I)Lcom/daaw/b72;

    invoke-virtual {v0, p2}, Lcom/daaw/b72;->o(I)Lcom/daaw/b72;

    add-int/2addr p1, p1

    mul-int p1, p1, v1

    invoke-virtual {v0, p1}, Lcom/daaw/b72;->l(I)Lcom/daaw/b72;

    iget p1, p3, Lcom/daaw/ce2;->b:I

    invoke-virtual {v0, p1}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    iget p1, p3, Lcom/daaw/ce2;->c:I

    invoke-virtual {v0, p1}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    const/4 p1, 0x2

    invoke-virtual {v0, p1}, Lcom/daaw/b72;->n(I)Lcom/daaw/b72;

    invoke-virtual {v0}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/yd2;->h:Lcom/daaw/f92;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Expected frames per block: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "; got: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/yd2;->i:I

    iput-wide p1, p0, Lcom/daaw/yd2;->j:J

    iput v0, p0, Lcom/daaw/yd2;->k:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/yd2;->l:J

    return-void
.end method

.method public final b(IJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/yd2;->a:Lcom/daaw/m09;

    new-instance v8, Lcom/daaw/je2;

    iget-object v2, p0, Lcom/daaw/yd2;->c:Lcom/daaw/ce2;

    iget v3, p0, Lcom/daaw/yd2;->d:I

    int-to-long v4, p1

    move-object v1, v8

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Lcom/daaw/je2;-><init>(Lcom/daaw/ce2;IJJ)V

    invoke-interface {v0, v8}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    iget-object p1, p0, Lcom/daaw/yd2;->b:Lcom/daaw/m42;

    iget-object p2, p0, Lcom/daaw/yd2;->h:Lcom/daaw/f92;

    invoke-interface {p1, p2}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    return-void
.end method

.method public final c(Lcom/daaw/k09;J)Z
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    iget v3, v0, Lcom/daaw/yd2;->g:I

    iget v4, v0, Lcom/daaw/yd2;->k:I

    invoke-virtual {v0, v4}, Lcom/daaw/yd2;->d(I)I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, v0, Lcom/daaw/yd2;->d:I

    invoke-static {v3, v4}, Lcom/daaw/it5;->O(II)I

    move-result v3

    iget-object v4, v0, Lcom/daaw/yd2;->c:Lcom/daaw/ce2;

    iget v4, v4, Lcom/daaw/ce2;->d:I

    mul-int v3, v3, v4

    const-wide/16 v6, 0x0

    cmp-long v8, v1, v6

    if-nez v8, :cond_0

    :goto_0
    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_2

    iget v7, v0, Lcom/daaw/yd2;->i:I

    if-ge v7, v3, :cond_2

    sub-int v7, v3, v7

    int-to-long v7, v7

    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    iget-object v9, v0, Lcom/daaw/yd2;->e:[B

    iget v10, v0, Lcom/daaw/yd2;->i:I

    long-to-int v8, v7

    move-object/from16 v7, p1

    invoke-interface {v7, v9, v10, v8}, Lcom/daaw/k09;->a([BII)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_1

    goto :goto_0

    :cond_1
    iget v9, v0, Lcom/daaw/yd2;->i:I

    add-int/2addr v9, v8

    iput v9, v0, Lcom/daaw/yd2;->i:I

    goto :goto_1

    :cond_2
    iget v1, v0, Lcom/daaw/yd2;->i:I

    iget-object v2, v0, Lcom/daaw/yd2;->c:Lcom/daaw/ce2;

    iget v2, v2, Lcom/daaw/ce2;->d:I

    div-int/2addr v1, v2

    if-lez v1, :cond_8

    iget-object v2, v0, Lcom/daaw/yd2;->e:[B

    iget-object v3, v0, Lcom/daaw/yd2;->f:Lcom/daaw/ik5;

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v1, :cond_7

    const/4 v8, 0x0

    :goto_3
    iget-object v9, v0, Lcom/daaw/yd2;->c:Lcom/daaw/ce2;

    iget v10, v9, Lcom/daaw/ce2;->b:I

    if-ge v8, v10, :cond_6

    invoke-virtual {v3}, Lcom/daaw/ik5;->h()[B

    move-result-object v11

    iget v9, v9, Lcom/daaw/ce2;->d:I

    mul-int v12, v7, v9

    mul-int/lit8 v13, v8, 0x4

    add-int/2addr v12, v13

    mul-int/lit8 v13, v10, 0x4

    add-int/2addr v13, v12

    div-int/2addr v9, v10

    add-int/lit8 v9, v9, -0x4

    add-int/lit8 v14, v12, 0x1

    aget-byte v14, v2, v14

    and-int/lit16 v14, v14, 0xff

    shl-int/lit8 v14, v14, 0x8

    aget-byte v15, v2, v12

    and-int/lit16 v15, v15, 0xff

    or-int/2addr v14, v15

    int-to-short v14, v14

    add-int/lit8 v12, v12, 0x2

    aget-byte v12, v2, v12

    and-int/lit16 v12, v12, 0xff

    const/16 v15, 0x58

    invoke-static {v12, v15}, Ljava/lang/Math;->min(II)I

    move-result v12

    sget-object v16, Lcom/daaw/yd2;->n:[I

    aget v16, v16, v12

    iget v4, v0, Lcom/daaw/yd2;->d:I

    mul-int v4, v4, v7

    mul-int v4, v4, v10

    add-int/2addr v4, v8

    add-int/2addr v4, v4

    and-int/lit16 v15, v14, 0xff

    int-to-byte v15, v15

    aput-byte v15, v11, v4

    add-int/lit8 v15, v4, 0x1

    shr-int/lit8 v5, v14, 0x8

    int-to-byte v5, v5

    aput-byte v5, v11, v15

    const/4 v5, 0x0

    :goto_4
    add-int v15, v9, v9

    if-ge v5, v15, :cond_5

    div-int/lit8 v15, v5, 0x8

    mul-int v15, v15, v10

    mul-int/lit8 v15, v15, 0x4

    add-int/2addr v15, v13

    div-int/lit8 v18, v5, 0x2

    rem-int/lit8 v18, v18, 0x4

    add-int v15, v15, v18

    aget-byte v15, v2, v15

    and-int/lit16 v15, v15, 0xff

    rem-int/lit8 v18, v5, 0x2

    if-nez v18, :cond_3

    and-int/lit8 v15, v15, 0xf

    goto :goto_5

    :cond_3
    shr-int/lit8 v15, v15, 0x4

    :goto_5
    and-int/lit8 v18, v15, 0x7

    add-int v18, v18, v18

    const/16 v17, 0x1

    add-int/lit8 v18, v18, 0x1

    mul-int v18, v18, v16

    move-object/from16 v16, v2

    shr-int/lit8 v2, v18, 0x3

    and-int/lit8 v18, v15, 0x8

    if-eqz v18, :cond_4

    neg-int v2, v2

    :cond_4
    add-int/2addr v14, v2

    const/16 v2, -0x8000

    move/from16 p2, v9

    const/16 v9, 0x7fff

    invoke-static {v14, v2, v9}, Lcom/daaw/it5;->P(III)I

    move-result v14

    add-int v2, v10, v10

    add-int/2addr v4, v2

    and-int/lit16 v2, v14, 0xff

    int-to-byte v2, v2

    aput-byte v2, v11, v4

    add-int/lit8 v2, v4, 0x1

    shr-int/lit8 v9, v14, 0x8

    int-to-byte v9, v9

    aput-byte v9, v11, v2

    sget-object v2, Lcom/daaw/yd2;->m:[I

    aget v2, v2, v15

    add-int/2addr v12, v2

    const/16 v2, 0x58

    const/4 v9, 0x0

    invoke-static {v12, v9, v2}, Lcom/daaw/it5;->P(III)I

    move-result v12

    sget-object v9, Lcom/daaw/yd2;->n:[I

    aget v9, v9, v12

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v16

    move/from16 v16, v9

    move/from16 v9, p2

    goto :goto_4

    :cond_5
    move-object/from16 v16, v2

    const/16 v17, 0x1

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_3

    :cond_6
    move-object/from16 v16, v2

    const/16 v17, 0x1

    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_2

    :cond_7
    iget v2, v0, Lcom/daaw/yd2;->d:I

    mul-int v2, v2, v1

    invoke-virtual {v0, v2}, Lcom/daaw/yd2;->e(I)I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v3, v2}, Lcom/daaw/ik5;->e(I)V

    iget v2, v0, Lcom/daaw/yd2;->i:I

    iget-object v3, v0, Lcom/daaw/yd2;->c:Lcom/daaw/ce2;

    iget v3, v3, Lcom/daaw/ce2;->d:I

    mul-int v1, v1, v3

    sub-int/2addr v2, v1

    iput v2, v0, Lcom/daaw/yd2;->i:I

    iget-object v1, v0, Lcom/daaw/yd2;->f:Lcom/daaw/ik5;

    invoke-virtual {v1}, Lcom/daaw/ik5;->l()I

    move-result v2

    iget-object v3, v0, Lcom/daaw/yd2;->b:Lcom/daaw/m42;

    invoke-static {v3, v1, v2}, Lcom/daaw/k42;->b(Lcom/daaw/m42;Lcom/daaw/ik5;I)V

    iget v1, v0, Lcom/daaw/yd2;->k:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/daaw/yd2;->k:I

    invoke-virtual {v0, v1}, Lcom/daaw/yd2;->d(I)I

    move-result v1

    iget v2, v0, Lcom/daaw/yd2;->g:I

    if-lt v1, v2, :cond_8

    invoke-virtual {v0, v2}, Lcom/daaw/yd2;->f(I)V

    :cond_8
    if-eqz v6, :cond_9

    iget v1, v0, Lcom/daaw/yd2;->k:I

    invoke-virtual {v0, v1}, Lcom/daaw/yd2;->d(I)I

    move-result v1

    if-lez v1, :cond_9

    invoke-virtual {v0, v1}, Lcom/daaw/yd2;->f(I)V

    :cond_9
    return v6
.end method

.method public final d(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/yd2;->c:Lcom/daaw/ce2;

    iget v0, v0, Lcom/daaw/ce2;->b:I

    add-int/2addr v0, v0

    div-int/2addr p1, v0

    return p1
.end method

.method public final e(I)I
    .locals 1

    add-int/2addr p1, p1

    iget-object v0, p0, Lcom/daaw/yd2;->c:Lcom/daaw/ce2;

    iget v0, v0, Lcom/daaw/ce2;->b:I

    mul-int p1, p1, v0

    return p1
.end method

.method public final f(I)V
    .locals 12

    iget-wide v0, p0, Lcom/daaw/yd2;->j:J

    iget-wide v2, p0, Lcom/daaw/yd2;->l:J

    iget-object v4, p0, Lcom/daaw/yd2;->c:Lcom/daaw/ce2;

    iget v4, v4, Lcom/daaw/ce2;->c:I

    int-to-long v6, v4

    const-wide/32 v4, 0xf4240

    invoke-static/range {v2 .. v7}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v2

    invoke-virtual {p0, p1}, Lcom/daaw/yd2;->e(I)I

    move-result v11

    iget v4, p0, Lcom/daaw/yd2;->k:I

    iget-object v5, p0, Lcom/daaw/yd2;->b:Lcom/daaw/m42;

    add-long/2addr v0, v2

    sub-int v9, v4, v11

    const/4 v7, 0x1

    const/4 v10, 0x0

    move-object v4, v5

    move-wide v5, v0

    move v8, v11

    invoke-interface/range {v4 .. v10}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    iget-wide v0, p0, Lcom/daaw/yd2;->l:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/yd2;->l:J

    iget p1, p0, Lcom/daaw/yd2;->k:I

    sub-int/2addr p1, v11

    iput p1, p0, Lcom/daaw/yd2;->k:I

    return-void
.end method
