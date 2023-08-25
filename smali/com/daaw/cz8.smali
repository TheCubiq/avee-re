.class public final Lcom/daaw/cz8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[I

.field public static final b:[I

.field public static final c:[I

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I

.field public static final synthetic g:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/cz8;->a:[I

    const/4 v0, 0x3

    new-array v1, v0, [I

    fill-array-data v1, :array_1

    sput-object v1, Lcom/daaw/cz8;->b:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lcom/daaw/cz8;->c:[I

    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lcom/daaw/cz8;->d:[I

    const/16 v0, 0x13

    new-array v1, v0, [I

    fill-array-data v1, :array_4

    sput-object v1, Lcom/daaw/cz8;->e:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_5

    sput-object v0, Lcom/daaw/cz8;->f:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x6
    .end array-data

    :array_1
    .array-data 4
        0xbb80
        0xac44
        0x7d00
    .end array-data

    :array_2
    .array-data 4
        0x5dc0
        0x5622
        0x3e80
    .end array-data

    :array_3
    .array-data 4
        0x2
        0x1
        0x2
        0x3
        0x3
        0x4
        0x4
        0x5
    .end array-data

    :array_4
    .array-data 4
        0x20
        0x28
        0x30
        0x38
        0x40
        0x50
        0x60
        0x70
        0x80
        0xa0
        0xc0
        0xe0
        0x100
        0x140
        0x180
        0x1c0
        0x200
        0x240
        0x280
    .end array-data

    :array_5
    .array-data 4
        0x45
        0x57
        0x68
        0x79
        0x8b
        0xae
        0xd0
        0xf3
        0x116
        0x15c
        0x1a1
        0x1e7
        0x22d
        0x2b8
        0x343
        0x3cf
        0x45a
        0x4e5
        0x571
    .end array-data
.end method

.method public static a(Ljava/nio/ByteBuffer;)I
    .locals 3

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xf8

    const/4 v1, 0x3

    shr-int/2addr v0, v1

    const/16 v2, 0xa

    if-le v0, v2, :cond_1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xc0

    shr-int/lit8 v0, v0, 0x6

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p0

    and-int/lit8 p0, p0, 0x30

    shr-int/lit8 v1, p0, 0x4

    :goto_0
    sget-object p0, Lcom/daaw/cz8;->a:[I

    aget p0, p0, v1

    mul-int/lit16 p0, p0, 0x100

    return p0

    :cond_1
    const/16 p0, 0x600

    return p0
.end method

.method public static b([B)I
    .locals 4

    array-length v0, p0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xf8

    const/4 v2, 0x3

    shr-int/2addr v0, v2

    const/16 v3, 0xa

    if-le v0, v3, :cond_1

    const/4 v0, 0x2

    aget-byte v0, p0, v0

    and-int/lit8 v0, v0, 0x7

    shl-int/lit8 v0, v0, 0x8

    aget-byte p0, p0, v2

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    add-int/lit8 p0, p0, 0x1

    add-int/2addr p0, p0

    return p0

    :cond_1
    const/4 v0, 0x4

    aget-byte p0, p0, v0

    and-int/lit16 v0, p0, 0xc0

    shr-int/2addr v0, v1

    and-int/lit8 p0, p0, 0x3f

    invoke-static {v0, p0}, Lcom/daaw/cz8;->f(II)I

    move-result p0

    return p0
.end method

.method public static c(Lcom/daaw/ik5;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/f92;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v0

    sget-object v1, Lcom/daaw/cz8;->b:[I

    and-int/lit16 v0, v0, 0xc0

    shr-int/lit8 v0, v0, 0x6

    aget v0, v1, v0

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result p0

    sget-object v1, Lcom/daaw/cz8;->d:[I

    and-int/lit8 v2, p0, 0x38

    shr-int/lit8 v2, v2, 0x3

    aget v1, v1, v2

    and-int/lit8 p0, p0, 0x4

    if-eqz p0, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    new-instance p0, Lcom/daaw/b72;

    invoke-direct {p0}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {p0, p1}, Lcom/daaw/b72;->h(Ljava/lang/String;)Lcom/daaw/b72;

    const-string p1, "audio/ac3"

    invoke-virtual {p0, p1}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {p0, v1}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    invoke-virtual {p0, v0}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-virtual {p0, p3}, Lcom/daaw/b72;->b(Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/b72;

    invoke-virtual {p0, p2}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {p0}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lcom/daaw/ik5;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/f92;
    .locals 5

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v1

    sget-object v2, Lcom/daaw/cz8;->b:[I

    and-int/lit16 v1, v1, 0xc0

    shr-int/lit8 v1, v1, 0x6

    aget v1, v2, v1

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v2

    sget-object v3, Lcom/daaw/cz8;->d:[I

    and-int/lit8 v4, v2, 0xe

    shr-int/lit8 v4, v4, 0x1

    aget v3, v3, v4

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v2

    and-int/lit8 v2, v2, 0x1e

    shr-int/lit8 v2, v2, 0x1

    if-lez v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v2

    and-int/2addr v0, v2

    if-eqz v0, :cond_1

    add-int/lit8 v3, v3, 0x2

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ik5;->i()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result p0

    and-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_2

    const-string p0, "audio/eac3-joc"

    goto :goto_0

    :cond_2
    const-string p0, "audio/eac3"

    :goto_0
    new-instance v0, Lcom/daaw/b72;

    invoke-direct {v0}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v0, p1}, Lcom/daaw/b72;->h(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0, p0}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0, v3}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-virtual {v0, p3}, Lcom/daaw/b72;->b(Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/b72;

    invoke-virtual {v0, p2}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lcom/daaw/cj5;)Lcom/daaw/bz8;
    .locals 27

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->b()I

    move-result v1

    const/16 v2, 0x28

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->h(I)V

    const/16 v1, 0xa

    const/4 v4, -0x1

    const/16 v5, 0x8

    const/4 v6, 0x6

    const/4 v7, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x2

    if-le v3, v1, :cond_2c

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->c(I)I

    move-result v10

    if-eqz v10, :cond_2

    if-eq v10, v8, :cond_1

    if-eq v10, v9, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v0, v7}, Lcom/daaw/cj5;->j(I)V

    const/16 v10, 0xb

    invoke-virtual {v0, v10}, Lcom/daaw/cj5;->c(I)I

    move-result v10

    add-int/2addr v10, v8

    add-int/2addr v10, v10

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->c(I)I

    move-result v12

    if-ne v12, v7, :cond_3

    sget-object v13, Lcom/daaw/cz8;->c:[I

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->c(I)I

    move-result v14

    aget v13, v13, v14

    move v15, v13

    const/4 v13, 0x3

    const/4 v14, 0x6

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->c(I)I

    move-result v13

    sget-object v14, Lcom/daaw/cz8;->a:[I

    aget v14, v14, v13

    sget-object v15, Lcom/daaw/cz8;->b:[I

    aget v15, v15, v12

    :goto_1
    mul-int/lit16 v11, v14, 0x100

    invoke-virtual {v0, v7}, Lcom/daaw/cj5;->c(I)I

    move-result v16

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    sget-object v18, Lcom/daaw/cz8;->d:[I

    aget v18, v18, v16

    add-int v18, v18, v17

    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_4
    if-nez v16, :cond_6

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_5
    const/4 v1, 0x0

    const/16 v16, 0x0

    goto :goto_2

    :cond_6
    move/from16 v1, v16

    :goto_2
    if-ne v4, v8, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v19

    if-eqz v19, :cond_7

    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->j(I)V

    :cond_7
    const/4 v3, 0x1

    goto :goto_3

    :cond_8
    move v3, v4

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v19

    const/4 v5, 0x4

    if-eqz v19, :cond_22

    if-le v1, v9, :cond_9

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->j(I)V

    :cond_9
    and-int/lit8 v19, v1, 0x1

    if-eqz v19, :cond_a

    if-le v1, v9, :cond_a

    invoke-virtual {v0, v6}, Lcom/daaw/cj5;->j(I)V

    :cond_a
    and-int/lit8 v19, v1, 0x4

    if-eqz v19, :cond_b

    invoke-virtual {v0, v6}, Lcom/daaw/cj5;->j(I)V

    :cond_b
    if-eqz v17, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_c

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    :cond_c
    if-nez v3, :cond_22

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v0, v6}, Lcom/daaw/cj5;->j(I)V

    :cond_d
    if-nez v1, :cond_e

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v0, v6}, Lcom/daaw/cj5;->j(I)V

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual {v0, v6}, Lcom/daaw/cj5;->j(I)V

    :cond_f
    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    if-ne v3, v8, :cond_10

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    goto/16 :goto_5

    :cond_10
    if-ne v3, v9, :cond_11

    const/16 v3, 0xc

    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->j(I)V

    goto/16 :goto_5

    :cond_11
    if-ne v3, v7, :cond_1c

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_1a

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_12

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_13

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_13
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_14

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_15

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_16

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_16
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_17

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_17
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_18

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_19

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_19
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_1a

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_1b

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v17

    if-eqz v17, :cond_1b

    const/4 v8, 0x7

    invoke-virtual {v0, v8}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v8

    if-eqz v8, :cond_1b

    const/16 v8, 0x8

    invoke-virtual {v0, v8}, Lcom/daaw/cj5;->j(I)V

    goto :goto_4

    :cond_1b
    const/16 v8, 0x8

    :goto_4
    add-int/2addr v3, v9

    mul-int/lit8 v3, v3, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->d()V

    :cond_1c
    :goto_5
    if-ge v1, v9, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v3

    const/16 v8, 0xe

    if-eqz v3, :cond_1d

    invoke-virtual {v0, v8}, Lcom/daaw/cj5;->j(I)V

    :cond_1d
    if-nez v16, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-virtual {v0, v8}, Lcom/daaw/cj5;->j(I)V

    :cond_1e
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v3

    if-eqz v3, :cond_21

    if-nez v13, :cond_1f

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    const/4 v3, 0x0

    const/4 v13, 0x0

    goto :goto_7

    :cond_1f
    const/4 v3, 0x0

    :goto_6
    if-ge v3, v14, :cond_21

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v8

    if-eqz v8, :cond_20

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    :cond_20
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_21
    const/4 v3, 0x0

    :cond_22
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v8

    if-eqz v8, :cond_27

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    if-ne v1, v9, :cond_23

    invoke-virtual {v0, v5}, Lcom/daaw/cj5;->j(I)V

    const/4 v1, 0x2

    :cond_23
    if-lt v1, v6, :cond_24

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->j(I)V

    :cond_24
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v2

    if-eqz v2, :cond_25

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    goto :goto_8

    :cond_25
    const/16 v2, 0x8

    :goto_8
    if-nez v1, :cond_26

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->j(I)V

    :cond_26
    if-ge v12, v7, :cond_27

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->i()V

    :cond_27
    if-nez v3, :cond_28

    if-eq v13, v7, :cond_28

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->i()V

    :cond_28
    if-ne v3, v9, :cond_2a

    if-eq v13, v7, :cond_29

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v1

    if-eqz v1, :cond_2a

    :cond_29
    invoke-virtual {v0, v6}, Lcom/daaw/cj5;->j(I)V

    :cond_2a
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-virtual {v0, v6}, Lcom/daaw/cj5;->c(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2b

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->c(I)I

    move-result v0

    if-ne v0, v2, :cond_2b

    const-string v0, "audio/eac3-joc"

    goto :goto_9

    :cond_2b
    const-string v0, "audio/eac3"

    :goto_9
    move-object/from16 v20, v0

    move/from16 v21, v4

    move/from16 v24, v10

    move/from16 v25, v11

    move/from16 v23, v15

    move/from16 v22, v18

    goto :goto_c

    :cond_2c
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->c(I)I

    move-result v1

    if-ne v1, v7, :cond_2d

    const/4 v2, 0x0

    goto :goto_a

    :cond_2d
    const-string v2, "audio/ac3"

    :goto_a
    invoke-virtual {v0, v6}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    invoke-static {v1, v3}, Lcom/daaw/cz8;->f(II)I

    move-result v10

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v0, v7}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    and-int/lit8 v5, v3, 0x1

    if-eqz v5, :cond_2e

    const/4 v5, 0x1

    if-eq v3, v5, :cond_2e

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->j(I)V

    :cond_2e
    and-int/lit8 v5, v3, 0x4

    if-eqz v5, :cond_2f

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->j(I)V

    :cond_2f
    if-ne v3, v9, :cond_30

    invoke-virtual {v0, v9}, Lcom/daaw/cj5;->j(I)V

    :cond_30
    if-ge v1, v7, :cond_31

    sget-object v5, Lcom/daaw/cz8;->b:[I

    aget v1, v5, v1

    move v15, v1

    goto :goto_b

    :cond_31
    const/4 v15, -0x1

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/cj5;->l()Z

    move-result v0

    sget-object v1, Lcom/daaw/cz8;->d:[I

    aget v1, v1, v3

    add-int v18, v1, v0

    const/16 v11, 0x600

    move-object/from16 v20, v2

    move/from16 v24, v10

    move/from16 v23, v15

    move/from16 v22, v18

    const/16 v21, -0x1

    const/16 v25, 0x600

    :goto_c
    new-instance v0, Lcom/daaw/bz8;

    const/16 v26, 0x0

    move-object/from16 v19, v0

    invoke-direct/range {v19 .. v26}, Lcom/daaw/bz8;-><init>(Ljava/lang/String;IIIIILcom/daaw/az8;)V

    return-object v0
.end method

.method public static f(II)I
    .locals 2

    div-int/lit8 v0, p1, 0x2

    if-ltz p0, :cond_3

    const/4 v1, 0x3

    if-ge p0, v1, :cond_3

    if-ltz p1, :cond_3

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/daaw/cz8;->b:[I

    aget p0, v1, p0

    const v1, 0xac44

    if-ne p0, v1, :cond_1

    sget-object p0, Lcom/daaw/cz8;->f:[I

    aget p0, p0, v0

    and-int/lit8 p1, p1, 0x1

    add-int/2addr p0, p1

    add-int/2addr p0, p0

    return p0

    :cond_1
    sget-object p1, Lcom/daaw/cz8;->e:[I

    aget p1, p1, v0

    const/16 v0, 0x7d00

    if-ne p0, v0, :cond_2

    mul-int/lit8 p1, p1, 0x6

    return p1

    :cond_2
    mul-int/lit8 p1, p1, 0x4

    return p1

    :cond_3
    :goto_0
    const/4 p0, -0x1

    return p0
.end method
