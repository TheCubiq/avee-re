.class public final Lcom/daaw/sr0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/sr0$a;,
        Lcom/daaw/sr0$b;
    }
.end annotation


# static fields
.field public static final a:[B

.field public static final b:[F

.field public static final c:Ljava/lang/Object;

.field public static d:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/sr0;->a:[B

    const/16 v0, 0x11

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    sput-object v0, Lcom/daaw/sr0;->b:[F

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/sr0;->c:Ljava/lang/Object;

    const/16 v0, 0xa

    new-array v0, v0, [I

    sput-object v0, Lcom/daaw/sr0;->d:[I

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public static a([Z)V
    .locals 2

    const/4 v0, 0x0

    aput-boolean v0, p0, v0

    const/4 v1, 0x1

    aput-boolean v0, p0, v1

    const/4 v1, 0x2

    aput-boolean v0, p0, v1

    return-void
.end method

.method public static b(Ljava/nio/ByteBuffer;)V
    .locals 9

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v4, v2, 0x1

    if-ge v4, v0, :cond_3

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    const/4 v6, 0x3

    if-ne v3, v6, :cond_0

    const/4 v7, 0x1

    if-ne v5, v7, :cond_1

    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/lit8 v7, v7, 0x1f

    const/4 v8, 0x7

    if-ne v7, v8, :cond_1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v3

    sub-int/2addr v2, v6

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return-void

    :cond_0
    if-nez v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    :cond_1
    if-eqz v5, :cond_2

    const/4 v3, 0x0

    :cond_2
    move v2, v4

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    return-void
.end method

.method public static c([BII[Z)I
    .locals 7

    sub-int v0, p2, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v3}, Lcom/daaw/s6;->f(Z)V

    if-nez v0, :cond_1

    return p2

    :cond_1
    const/4 v3, 0x2

    if-eqz p3, :cond_4

    aget-boolean v4, p3, v1

    if-eqz v4, :cond_2

    invoke-static {p3}, Lcom/daaw/sr0;->a([Z)V

    add-int/lit8 p1, p1, -0x3

    return p1

    :cond_2
    if-le v0, v2, :cond_3

    aget-boolean v4, p3, v2

    if-eqz v4, :cond_3

    aget-byte v4, p0, p1

    if-ne v4, v2, :cond_3

    invoke-static {p3}, Lcom/daaw/sr0;->a([Z)V

    sub-int/2addr p1, v3

    return p1

    :cond_3
    if-le v0, v3, :cond_4

    aget-boolean v4, p3, v3

    if-eqz v4, :cond_4

    aget-byte v4, p0, p1

    if-nez v4, :cond_4

    add-int/lit8 v4, p1, 0x1

    aget-byte v4, p0, v4

    if-ne v4, v2, :cond_4

    invoke-static {p3}, Lcom/daaw/sr0;->a([Z)V

    sub-int/2addr p1, v2

    return p1

    :cond_4
    add-int/lit8 v4, p2, -0x1

    add-int/2addr p1, v3

    :goto_1
    if-ge p1, v4, :cond_8

    aget-byte v5, p0, p1

    and-int/lit16 v5, v5, 0xfe

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v5, p1, -0x2

    aget-byte v6, p0, v5

    if-nez v6, :cond_7

    add-int/lit8 v6, p1, -0x1

    aget-byte v6, p0, v6

    if-nez v6, :cond_7

    aget-byte v6, p0, p1

    if-ne v6, v2, :cond_7

    if-eqz p3, :cond_6

    invoke-static {p3}, Lcom/daaw/sr0;->a([Z)V

    :cond_6
    return v5

    :cond_7
    add-int/lit8 p1, p1, -0x2

    :goto_2
    add-int/lit8 p1, p1, 0x3

    goto :goto_1

    :cond_8
    if-eqz p3, :cond_f

    if-le v0, v3, :cond_a

    add-int/lit8 p1, p2, -0x3

    aget-byte p1, p0, p1

    if-nez p1, :cond_9

    add-int/lit8 p1, p2, -0x2

    aget-byte p1, p0, p1

    if-nez p1, :cond_9

    aget-byte p1, p0, v4

    if-ne p1, v2, :cond_9

    goto :goto_3

    :cond_9
    const/4 p1, 0x0

    goto :goto_4

    :cond_a
    if-ne v0, v3, :cond_b

    aget-boolean p1, p3, v3

    if-eqz p1, :cond_9

    add-int/lit8 p1, p2, -0x2

    aget-byte p1, p0, p1

    if-nez p1, :cond_9

    aget-byte p1, p0, v4

    if-ne p1, v2, :cond_9

    goto :goto_3

    :cond_b
    aget-boolean p1, p3, v2

    if-eqz p1, :cond_9

    aget-byte p1, p0, v4

    if-ne p1, v2, :cond_9

    :goto_3
    const/4 p1, 0x1

    :goto_4
    aput-boolean p1, p3, v1

    if-le v0, v2, :cond_c

    add-int/lit8 p1, p2, -0x2

    aget-byte p1, p0, p1

    if-nez p1, :cond_d

    aget-byte p1, p0, v4

    if-nez p1, :cond_d

    goto :goto_5

    :cond_c
    aget-boolean p1, p3, v3

    if-eqz p1, :cond_d

    aget-byte p1, p0, v4

    if-nez p1, :cond_d

    :goto_5
    const/4 p1, 0x1

    goto :goto_6

    :cond_d
    const/4 p1, 0x0

    :goto_6
    aput-boolean p1, p3, v2

    aget-byte p0, p0, v4

    if-nez p0, :cond_e

    const/4 v1, 0x1

    :cond_e
    aput-boolean v1, p3, v3

    :cond_f
    return p2
.end method

.method public static d([BII)I
    .locals 2

    :goto_0
    add-int/lit8 v0, p2, -0x2

    if-ge p1, v0, :cond_1

    aget-byte v0, p0, p1

    if-nez v0, :cond_0

    add-int/lit8 v0, p1, 0x1

    aget-byte v0, p0, v0

    if-nez v0, :cond_0

    add-int/lit8 v0, p1, 0x2

    aget-byte v0, p0, v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method public static e([BI)I
    .locals 0

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit8 p0, p0, 0x7e

    shr-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static f([BI)I
    .locals 0

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static g(Ljava/lang/String;B)Z
    .locals 3

    const-string v0, "video/avc"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    and-int/lit8 v0, p1, 0x1f

    const/4 v2, 0x6

    if-eq v0, v2, :cond_2

    :cond_0
    const-string v0, "video/hevc"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    and-int/lit8 p0, p1, 0x7e

    shr-int/2addr p0, v1

    const/16 p1, 0x27

    if-ne p0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public static h([BII)Lcom/daaw/sr0$a;
    .locals 1

    new-instance v0, Lcom/daaw/sv0;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/sv0;-><init>([BII)V

    const/16 p0, 0x8

    invoke-virtual {v0, p0}, Lcom/daaw/sv0;->l(I)V

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result p0

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result p1

    invoke-virtual {v0}, Lcom/daaw/sv0;->k()V

    invoke-virtual {v0}, Lcom/daaw/sv0;->d()Z

    move-result p2

    new-instance v0, Lcom/daaw/sr0$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/sr0$a;-><init>(IIZ)V

    return-object v0
.end method

.method public static i([BII)Lcom/daaw/sr0$b;
    .locals 18

    new-instance v0, Lcom/daaw/sv0;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/sv0;-><init>([BII)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/sv0;->l(I)V

    invoke-virtual {v0, v1}, Lcom/daaw/sv0;->e(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Lcom/daaw/sv0;->l(I)V

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v5

    const/4 v4, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/16 v8, 0x64

    if-eq v2, v8, :cond_1

    const/16 v8, 0x6e

    if-eq v2, v8, :cond_1

    const/16 v8, 0x7a

    if-eq v2, v8, :cond_1

    const/16 v8, 0xf4

    if-eq v2, v8, :cond_1

    const/16 v8, 0x2c

    if-eq v2, v8, :cond_1

    const/16 v8, 0x53

    if-eq v2, v8, :cond_1

    const/16 v8, 0x56

    if-eq v2, v8, :cond_1

    const/16 v8, 0x76

    if-eq v2, v8, :cond_1

    const/16 v8, 0x80

    if-eq v2, v8, :cond_1

    const/16 v8, 0x8a

    if-ne v2, v8, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    const/4 v9, 0x0

    goto :goto_5

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v2

    if-ne v2, v4, :cond_2

    invoke-virtual {v0}, Lcom/daaw/sv0;->d()Z

    move-result v8

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    invoke-virtual {v0}, Lcom/daaw/sv0;->k()V

    invoke-virtual {v0}, Lcom/daaw/sv0;->d()Z

    move-result v9

    if-eqz v9, :cond_6

    if-eq v2, v4, :cond_3

    const/16 v9, 0x8

    goto :goto_2

    :cond_3
    const/16 v9, 0xc

    :goto_2
    const/4 v10, 0x0

    :goto_3
    if-ge v10, v9, :cond_6

    invoke-virtual {v0}, Lcom/daaw/sv0;->d()Z

    move-result v11

    if-eqz v11, :cond_5

    const/4 v11, 0x6

    if-ge v10, v11, :cond_4

    const/16 v11, 0x10

    goto :goto_4

    :cond_4
    const/16 v11, 0x40

    :goto_4
    invoke-static {v0, v11}, Lcom/daaw/sr0;->j(Lcom/daaw/sv0;I)V

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    move v9, v8

    :goto_5
    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v8

    add-int/lit8 v11, v8, 0x4

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v12

    if-nez v12, :cond_7

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v8

    add-int/lit8 v8, v8, 0x4

    move/from16 p0, v5

    move v13, v8

    goto :goto_7

    :cond_7
    if-ne v12, v7, :cond_9

    invoke-virtual {v0}, Lcom/daaw/sv0;->d()Z

    move-result v8

    invoke-virtual {v0}, Lcom/daaw/sv0;->g()I

    invoke-virtual {v0}, Lcom/daaw/sv0;->g()I

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v10

    int-to-long v13, v10

    move/from16 p0, v5

    const/4 v10, 0x0

    :goto_6
    int-to-long v4, v10

    cmp-long v15, v4, v13

    if-gez v15, :cond_8

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_8
    move v14, v8

    const/4 v13, 0x0

    goto :goto_8

    :cond_9
    move/from16 p0, v5

    const/4 v13, 0x0

    :goto_7
    const/4 v14, 0x0

    :goto_8
    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    invoke-virtual {v0}, Lcom/daaw/sv0;->k()V

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v4

    add-int/2addr v4, v7

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v5

    add-int/2addr v5, v7

    invoke-virtual {v0}, Lcom/daaw/sv0;->d()Z

    move-result v10

    rsub-int/lit8 v6, v10, 0x2

    mul-int v6, v6, v5

    if-nez v10, :cond_a

    invoke-virtual {v0}, Lcom/daaw/sv0;->k()V

    :cond_a
    invoke-virtual {v0}, Lcom/daaw/sv0;->k()V

    mul-int/lit8 v4, v4, 0x10

    mul-int/lit8 v6, v6, 0x10

    invoke-virtual {v0}, Lcom/daaw/sv0;->d()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v5

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v8

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v15

    invoke-virtual {v0}, Lcom/daaw/sv0;->h()I

    move-result v16

    if-nez v2, :cond_b

    rsub-int/lit8 v2, v10, 0x2

    goto :goto_a

    :cond_b
    const/16 v17, 0x2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_c

    const/4 v3, 0x1

    goto :goto_9

    :cond_c
    const/4 v3, 0x2

    :goto_9
    if-ne v2, v7, :cond_d

    const/4 v7, 0x2

    :cond_d
    rsub-int/lit8 v2, v10, 0x2

    mul-int v2, v2, v7

    move v7, v3

    :goto_a
    add-int/2addr v5, v8

    mul-int v5, v5, v7

    sub-int/2addr v4, v5

    add-int v15, v15, v16

    mul-int v15, v15, v2

    sub-int/2addr v6, v15

    :cond_e
    move v7, v6

    move v6, v4

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0}, Lcom/daaw/sv0;->d()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v0}, Lcom/daaw/sv0;->d()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v0, v1}, Lcom/daaw/sv0;->e(I)I

    move-result v1

    const/16 v3, 0xff

    if-ne v1, v3, :cond_10

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Lcom/daaw/sv0;->e(I)I

    move-result v1

    invoke-virtual {v0, v3}, Lcom/daaw/sv0;->e(I)I

    move-result v0

    if-eqz v1, :cond_f

    if-eqz v0, :cond_f

    int-to-float v1, v1

    int-to-float v0, v0

    div-float v2, v1, v0

    :cond_f
    move v8, v2

    goto :goto_b

    :cond_10
    sget-object v0, Lcom/daaw/sr0;->b:[F

    array-length v3, v0

    if-ge v1, v3, :cond_11

    aget v0, v0, v1

    move v8, v0

    goto :goto_b

    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected aspect_ratio_idc value: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_12
    const/high16 v8, 0x3f800000    # 1.0f

    :goto_b
    new-instance v0, Lcom/daaw/sr0$b;

    move-object v4, v0

    move/from16 v5, p0

    invoke-direct/range {v4 .. v14}, Lcom/daaw/sr0$b;-><init>(IIIFZZIIIZ)V

    return-object v0
.end method

.method public static j(Lcom/daaw/sv0;I)V
    .locals 3

    const/16 v0, 0x8

    const/4 v1, 0x0

    const/16 v1, 0x8

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_2

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/sv0;->g()I

    move-result v0

    add-int/2addr v0, v1

    add-int/lit16 v0, v0, 0x100

    rem-int/lit16 v0, v0, 0x100

    :cond_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static k([BI)I
    .locals 8

    sget-object v0, Lcom/daaw/sr0;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-ge v2, p1, :cond_2

    :try_start_0
    invoke-static {p0, v2, p1}, Lcom/daaw/sr0;->d([BII)I

    move-result v2

    if-ge v2, p1, :cond_0

    sget-object v4, Lcom/daaw/sr0;->d:[I

    array-length v5, v4

    if-gt v5, v3, :cond_1

    array-length v5, v4

    mul-int/lit8 v5, v5, 0x2

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    sput-object v4, Lcom/daaw/sr0;->d:[I

    :cond_1
    sget-object v4, Lcom/daaw/sr0;->d:[I

    add-int/lit8 v5, v3, 0x1

    aput v2, v4, v3

    add-int/lit8 v2, v2, 0x3

    move v3, v5

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_2
    sub-int/2addr p1, v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v2, v3, :cond_3

    sget-object v6, Lcom/daaw/sr0;->d:[I

    aget v6, v6, v2

    sub-int/2addr v6, v5

    invoke-static {p0, v5, p0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v4, v6

    add-int/lit8 v7, v4, 0x1

    aput-byte v1, p0, v4

    add-int/lit8 v4, v7, 0x1

    aput-byte v1, p0, v7

    add-int/lit8 v6, v6, 0x3

    add-int/2addr v5, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    sub-int v1, p1, v4

    invoke-static {p0, v5, p0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    monitor-exit v0

    return p1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    throw p0

    :goto_4
    goto :goto_3
.end method
