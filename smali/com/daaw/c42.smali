.class public final Lcom/daaw/c42;
.super Ljava/lang/Object;
.source ""


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

    sput-object v0, Lcom/daaw/c42;->a:[B

    const/16 v0, 0x11

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    sput-object v0, Lcom/daaw/c42;->b:[F

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/c42;->c:Ljava/lang/Object;

    const/16 v0, 0xa

    new-array v0, v0, [I

    sput-object v0, Lcom/daaw/c42;->d:[I

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

.method public static a([BII[Z)I
    .locals 8

    sub-int v0, p2, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v3}, Lcom/daaw/uo4;->f(Z)V

    if-nez v0, :cond_1

    return p2

    :cond_1
    aget-boolean v3, p3, v1

    if-eqz v3, :cond_2

    invoke-static {p3}, Lcom/daaw/c42;->e([Z)V

    add-int/lit8 p1, p1, -0x3

    return p1

    :cond_2
    if-le v0, v2, :cond_4

    aget-boolean v3, p3, v2

    if-eqz v3, :cond_4

    aget-byte v3, p0, p1

    if-eq v3, v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lcom/daaw/c42;->e([Z)V

    add-int/lit8 p1, p1, -0x2

    return p1

    :cond_4
    :goto_1
    const/4 v3, 0x2

    if-le v0, v3, :cond_6

    aget-boolean v4, p3, v3

    if-eqz v4, :cond_6

    aget-byte v4, p0, p1

    if-nez v4, :cond_6

    add-int/lit8 v4, p1, 0x1

    aget-byte v4, p0, v4

    if-eq v4, v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {p3}, Lcom/daaw/c42;->e([Z)V

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_6
    :goto_2
    add-int/lit8 v4, p2, -0x1

    add-int/2addr p1, v3

    :goto_3
    if-ge p1, v4, :cond_a

    aget-byte v5, p0, p1

    and-int/lit16 v6, v5, 0xfe

    if-eqz v6, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v6, p1, -0x2

    aget-byte v7, p0, v6

    if-nez v7, :cond_9

    add-int/lit8 p1, p1, -0x1

    aget-byte p1, p0, p1

    if-nez p1, :cond_9

    if-eq v5, v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-static {p3}, Lcom/daaw/c42;->e([Z)V

    return v6

    :cond_9
    :goto_4
    move p1, v6

    :goto_5
    add-int/lit8 p1, p1, 0x3

    goto :goto_3

    :cond_a
    if-le v0, v3, :cond_c

    add-int/lit8 p1, p2, -0x3

    aget-byte p1, p0, p1

    if-nez p1, :cond_b

    add-int/lit8 p1, p2, -0x2

    aget-byte p1, p0, p1

    if-nez p1, :cond_b

    aget-byte p1, p0, v4

    if-ne p1, v2, :cond_b

    goto :goto_6

    :cond_b
    const/4 p1, 0x0

    goto :goto_7

    :cond_c
    if-ne v0, v3, :cond_d

    aget-boolean p1, p3, v3

    if-eqz p1, :cond_b

    add-int/lit8 p1, p2, -0x2

    aget-byte p1, p0, p1

    if-nez p1, :cond_b

    aget-byte p1, p0, v4

    if-ne p1, v2, :cond_b

    goto :goto_6

    :cond_d
    aget-boolean p1, p3, v2

    if-eqz p1, :cond_b

    aget-byte p1, p0, v4

    if-ne p1, v2, :cond_b

    :goto_6
    const/4 p1, 0x1

    :goto_7
    aput-boolean p1, p3, v1

    if-le v0, v2, :cond_e

    add-int/lit8 p1, p2, -0x2

    aget-byte p1, p0, p1

    if-nez p1, :cond_f

    aget-byte p1, p0, v4

    if-nez p1, :cond_f

    goto :goto_8

    :cond_e
    aget-boolean p1, p3, v3

    if-eqz p1, :cond_f

    aget-byte p1, p0, v4

    if-nez p1, :cond_f

    :goto_8
    const/4 p1, 0x1

    goto :goto_9

    :cond_f
    const/4 p1, 0x0

    :goto_9
    aput-boolean p1, p3, v2

    aget-byte p0, p0, v4

    if-nez p0, :cond_10

    const/4 v1, 0x1

    :cond_10
    aput-boolean v1, p3, v3

    return p2
.end method

.method public static b([BI)I
    .locals 8

    sget-object v0, Lcom/daaw/c42;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-ge v2, p1, :cond_5

    :goto_1
    add-int/lit8 v4, p1, -0x2

    if-ge v2, v4, :cond_2

    :try_start_0
    aget-byte v4, p0, v2

    if-nez v4, :cond_1

    add-int/lit8 v4, v2, 0x1

    aget-byte v4, p0, v4

    if-nez v4, :cond_1

    add-int/lit8 v4, v2, 0x2

    aget-byte v4, p0, v4

    const/4 v5, 0x3

    if-eq v4, v5, :cond_3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    move v2, p1

    :cond_3
    if-ge v2, p1, :cond_0

    sget-object v4, Lcom/daaw/c42;->d:[I

    array-length v5, v4

    if-gt v5, v3, :cond_4

    add-int/2addr v5, v5

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    sput-object v4, Lcom/daaw/c42;->d:[I

    :cond_4
    sget-object v4, Lcom/daaw/c42;->d:[I

    add-int/lit8 v5, v3, 0x1

    aput v2, v4, v3

    add-int/lit8 v2, v2, 0x3

    move v3, v5

    goto :goto_0

    :cond_5
    sub-int/2addr p1, v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_2
    if-ge v2, v3, :cond_6

    sget-object v6, Lcom/daaw/c42;->d:[I

    aget v6, v6, v2

    sub-int/2addr v6, v4

    invoke-static {p0, v4, p0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v5, v6

    add-int/lit8 v7, v5, 0x1

    aput-byte v1, p0, v5

    add-int/lit8 v5, v7, 0x1

    aput-byte v1, p0, v7

    add-int/lit8 v6, v6, 0x3

    add-int/2addr v4, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    sub-int v1, p1, v5

    invoke-static {p0, v4, p0, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    monitor-exit v0

    return p1

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :goto_4
    throw p0

    :goto_5
    goto :goto_4
.end method

.method public static c([BII)Lcom/daaw/a42;
    .locals 1

    new-instance p1, Lcom/daaw/e42;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0, p2}, Lcom/daaw/e42;-><init>([BII)V

    invoke-virtual {p1}, Lcom/daaw/e42;->c()I

    move-result p0

    invoke-virtual {p1}, Lcom/daaw/e42;->c()I

    move-result p2

    invoke-virtual {p1}, Lcom/daaw/e42;->d()V

    invoke-virtual {p1}, Lcom/daaw/e42;->f()Z

    move-result p1

    new-instance v0, Lcom/daaw/a42;

    invoke-direct {v0, p0, p2, p1}, Lcom/daaw/a42;-><init>(IIZ)V

    return-object v0
.end method

.method public static d([BII)Lcom/daaw/b42;
    .locals 23

    new-instance v0, Lcom/daaw/e42;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/e42;-><init>([BII)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/e42;->a(I)I

    move-result v2

    invoke-virtual {v0, v1}, Lcom/daaw/e42;->a(I)I

    move-result v5

    invoke-virtual {v0, v1}, Lcom/daaw/e42;->a(I)I

    move-result v6

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v7

    const/16 v3, 0x8a

    const/4 v4, 0x3

    const/16 v8, 0x10

    const/4 v10, 0x1

    const/16 v11, 0x64

    if-eq v2, v11, :cond_1

    const/16 v11, 0x6e

    if-eq v2, v11, :cond_1

    const/16 v11, 0x7a

    if-eq v2, v11, :cond_1

    const/16 v11, 0xf4

    if-eq v2, v11, :cond_1

    const/16 v11, 0x2c

    if-eq v2, v11, :cond_1

    const/16 v11, 0x53

    if-eq v2, v11, :cond_1

    const/16 v11, 0x56

    if-eq v2, v11, :cond_1

    const/16 v11, 0x76

    if-eq v2, v11, :cond_1

    const/16 v11, 0x80

    if-eq v2, v11, :cond_1

    if-ne v2, v3, :cond_0

    const/16 v2, 0x8a

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    const/4 v12, 0x0

    goto :goto_6

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v3

    if-ne v3, v4, :cond_2

    invoke-virtual {v0}, Lcom/daaw/e42;->f()Z

    move-result v11

    const/4 v12, 0x3

    goto :goto_1

    :cond_2
    move v12, v3

    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    invoke-virtual {v0}, Lcom/daaw/e42;->d()V

    invoke-virtual {v0}, Lcom/daaw/e42;->f()Z

    move-result v13

    if-eqz v13, :cond_8

    if-eq v12, v4, :cond_3

    const/16 v12, 0x8

    goto :goto_2

    :cond_3
    const/16 v12, 0xc

    :goto_2
    const/4 v13, 0x0

    :goto_3
    if-ge v13, v12, :cond_8

    invoke-virtual {v0}, Lcom/daaw/e42;->f()Z

    move-result v14

    if-eqz v14, :cond_7

    const/4 v14, 0x6

    if-ge v13, v14, :cond_4

    const/16 v14, 0x10

    goto :goto_4

    :cond_4
    const/16 v14, 0x40

    :goto_4
    const/4 v15, 0x0

    const/16 v16, 0x8

    const/16 v17, 0x8

    :goto_5
    if-ge v15, v14, :cond_7

    if-eqz v16, :cond_5

    invoke-virtual {v0}, Lcom/daaw/e42;->b()I

    move-result v16

    add-int v9, v17, v16

    add-int/lit16 v9, v9, 0x100

    rem-int/lit16 v9, v9, 0x100

    move/from16 v16, v9

    :cond_5
    if-eqz v16, :cond_6

    move/from16 v17, v16

    :cond_6
    add-int/lit8 v15, v15, 0x1

    goto :goto_5

    :cond_7
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_8
    move v12, v11

    :goto_6
    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v9

    add-int/lit8 v14, v9, 0x4

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v9

    if-nez v9, :cond_9

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v11

    add-int/lit8 v11, v11, 0x4

    move/from16 p2, v2

    move v13, v5

    move v1, v9

    move/from16 v16, v11

    :goto_7
    const/16 v17, 0x0

    goto :goto_9

    :cond_9
    if-ne v9, v10, :cond_b

    invoke-virtual {v0}, Lcom/daaw/e42;->f()Z

    move-result v9

    invoke-virtual {v0}, Lcom/daaw/e42;->b()I

    invoke-virtual {v0}, Lcom/daaw/e42;->b()I

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v11

    move/from16 p2, v2

    int-to-long v1, v11

    move v13, v5

    const/4 v11, 0x0

    :goto_8
    int-to-long v4, v11

    cmp-long v16, v4, v1

    if-gez v16, :cond_a

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_a
    move/from16 v17, v9

    const/4 v1, 0x1

    const/16 v16, 0x0

    goto :goto_9

    :cond_b
    move/from16 p2, v2

    move v13, v5

    move v1, v9

    const/16 v16, 0x0

    goto :goto_7

    :goto_9
    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v2

    invoke-virtual {v0}, Lcom/daaw/e42;->d()V

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v4

    add-int/2addr v4, v10

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v5

    invoke-virtual {v0}, Lcom/daaw/e42;->f()Z

    move-result v18

    rsub-int/lit8 v9, v18, 0x2

    add-int/2addr v5, v10

    mul-int v5, v5, v9

    if-nez v18, :cond_c

    invoke-virtual {v0}, Lcom/daaw/e42;->d()V

    :cond_c
    invoke-virtual {v0}, Lcom/daaw/e42;->d()V

    mul-int/lit8 v4, v4, 0x10

    mul-int/lit8 v5, v5, 0x10

    invoke-virtual {v0}, Lcom/daaw/e42;->f()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v11

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v19

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v20

    invoke-virtual {v0}, Lcom/daaw/e42;->c()I

    move-result v21

    if-nez v3, :cond_d

    goto :goto_b

    :cond_d
    const/16 v22, 0x2

    const/4 v15, 0x3

    if-ne v3, v15, :cond_e

    const/4 v15, 0x1

    goto :goto_a

    :cond_e
    const/4 v15, 0x2

    :goto_a
    if-ne v3, v10, :cond_f

    const/4 v10, 0x2

    :cond_f
    mul-int v9, v9, v10

    move v10, v15

    :goto_b
    add-int v11, v11, v19

    mul-int v11, v11, v10

    sub-int/2addr v4, v11

    add-int v20, v20, v21

    mul-int v20, v20, v9

    sub-int v5, v5, v20

    :cond_10
    move v9, v4

    move v10, v5

    invoke-virtual {v0}, Lcom/daaw/e42;->f()Z

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v3, :cond_13

    invoke-virtual {v0}, Lcom/daaw/e42;->f()Z

    move-result v3

    if-eqz v3, :cond_13

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/e42;->a(I)I

    move-result v3

    const/16 v5, 0xff

    if-ne v3, v5, :cond_11

    invoke-virtual {v0, v8}, Lcom/daaw/e42;->a(I)I

    move-result v3

    invoke-virtual {v0, v8}, Lcom/daaw/e42;->a(I)I

    move-result v0

    if-eqz v3, :cond_13

    if-eqz v0, :cond_13

    int-to-float v3, v3

    int-to-float v0, v0

    div-float/2addr v3, v0

    move v11, v3

    goto :goto_c

    :cond_11
    const/16 v0, 0x11

    if-ge v3, v0, :cond_12

    sget-object v0, Lcom/daaw/c42;->b:[F

    aget v0, v0, v3

    move v11, v0

    goto :goto_c

    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unexpected aspect_ratio_idc value: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "NalUnitUtil"

    invoke-static {v3, v0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_13
    const/high16 v11, 0x3f800000    # 1.0f

    :goto_c
    new-instance v0, Lcom/daaw/b42;

    move-object v3, v0

    move/from16 v4, p2

    move v5, v13

    move v8, v2

    move/from16 v13, v18

    move v15, v1

    invoke-direct/range {v3 .. v17}, Lcom/daaw/b42;-><init>(IIIIIIIFZZIIIZ)V

    return-object v0
.end method

.method public static e([Z)V
    .locals 2

    const/4 v0, 0x0

    aput-boolean v0, p0, v0

    const/4 v1, 0x1

    aput-boolean v0, p0, v1

    const/4 v1, 0x2

    aput-boolean v0, p0, v1

    return-void
.end method
