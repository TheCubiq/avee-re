.class public final Lcom/daaw/ub7;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a([B[B)[B
    .locals 54

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v0, v2, v2}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v3

    const/4 v5, 0x3

    const/4 v6, 0x2

    invoke-static {v0, v5, v6}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v7

    const-wide/32 v9, 0x3ffff03

    and-long/2addr v7, v9

    const/4 v9, 0x6

    const/4 v10, 0x4

    invoke-static {v0, v9, v10}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v11

    const-wide/32 v13, 0x3ffc0ff

    and-long/2addr v11, v13

    const/16 v13, 0x9

    invoke-static {v0, v13, v9}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v14

    const-wide/32 v16, 0x3f03fff

    and-long v14, v14, v16

    const/16 v13, 0xc

    const/16 v9, 0x8

    invoke-static {v0, v13, v9}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v18

    const-wide/32 v20, 0xfffff

    and-long v18, v18, v20

    const-wide/16 v20, 0x5

    mul-long v22, v7, v20

    mul-long v24, v11, v20

    mul-long v26, v14, v20

    mul-long v28, v18, v20

    const/16 v9, 0x11

    new-array v13, v9, [B

    const-wide/16 v30, 0x0

    move-wide/from16 v32, v30

    move-wide/from16 v34, v32

    move-wide/from16 v36, v34

    move-wide/from16 v38, v36

    const/4 v10, 0x0

    :goto_0
    array-length v5, v1

    const/16 v6, 0x10

    const-wide/32 v40, 0x3ffffff

    const/16 v42, 0x1a

    if-ge v10, v5, :cond_1

    sub-int/2addr v5, v10

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-static {v1, v10, v13, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v43, 0x1

    aput-byte v43, v13, v5

    if-eq v5, v6, :cond_0

    add-int/lit8 v5, v5, 0x1

    invoke-static {v13, v5, v9, v2}, Ljava/util/Arrays;->fill([BIIB)V

    :cond_0
    invoke-static {v13, v2, v2}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v43

    add-long v38, v38, v43

    const/4 v5, 0x2

    const/4 v9, 0x3

    invoke-static {v13, v9, v5}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v43

    add-long v32, v32, v43

    const/4 v5, 0x4

    const/4 v9, 0x6

    invoke-static {v13, v9, v5}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v44

    add-long v30, v30, v44

    const/16 v5, 0x9

    invoke-static {v13, v5, v9}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v44

    add-long v34, v34, v44

    const/16 v5, 0xc

    const/16 v9, 0x8

    invoke-static {v13, v5, v9}, Lcom/daaw/ub7;->b([BII)J

    move-result-wide v44

    aget-byte v5, v13, v6

    const/16 v6, 0x18

    shl-int/2addr v5, v6

    int-to-long v5, v5

    or-long v5, v44, v5

    add-long v36, v36, v5

    mul-long v5, v38, v3

    mul-long v44, v32, v28

    add-long v5, v5, v44

    mul-long v44, v30, v26

    add-long v5, v5, v44

    mul-long v44, v34, v24

    add-long v5, v5, v44

    mul-long v44, v36, v22

    add-long v5, v5, v44

    mul-long v44, v38, v7

    mul-long v46, v32, v3

    add-long v44, v44, v46

    mul-long v46, v30, v28

    add-long v44, v44, v46

    mul-long v46, v34, v26

    add-long v44, v44, v46

    mul-long v46, v36, v24

    add-long v44, v44, v46

    shr-long v46, v5, v42

    add-long v44, v44, v46

    mul-long v46, v38, v11

    mul-long v48, v32, v7

    add-long v46, v46, v48

    mul-long v48, v30, v3

    add-long v46, v46, v48

    mul-long v48, v34, v28

    add-long v46, v46, v48

    mul-long v48, v36, v26

    add-long v46, v46, v48

    shr-long v48, v44, v42

    add-long v46, v46, v48

    and-long v48, v46, v40

    mul-long v50, v38, v14

    mul-long v52, v32, v11

    add-long v50, v50, v52

    mul-long v52, v30, v7

    add-long v50, v50, v52

    mul-long v52, v34, v3

    add-long v50, v50, v52

    mul-long v52, v36, v28

    add-long v50, v50, v52

    shr-long v46, v46, v42

    add-long v50, v50, v46

    and-long v46, v50, v40

    mul-long v38, v38, v18

    mul-long v32, v32, v14

    add-long v38, v38, v32

    mul-long v30, v30, v11

    add-long v38, v38, v30

    mul-long v34, v34, v7

    add-long v38, v38, v34

    mul-long v36, v36, v3

    add-long v38, v38, v36

    shr-long v30, v50, v42

    add-long v38, v38, v30

    and-long v36, v38, v40

    and-long v5, v5, v40

    shr-long v30, v38, v42

    mul-long v30, v30, v20

    add-long v5, v5, v30

    and-long v38, v5, v40

    and-long v30, v44, v40

    shr-long v5, v5, v42

    add-long v32, v30, v5

    add-int/lit8 v10, v10, 0x10

    move-wide/from16 v34, v46

    move-wide/from16 v30, v48

    const/4 v6, 0x2

    const/16 v9, 0x11

    goto/16 :goto_0

    :cond_1
    shr-long v3, v32, v42

    add-long v30, v30, v3

    and-long v3, v30, v40

    shr-long v7, v30, v42

    add-long v34, v34, v7

    and-long v7, v34, v40

    shr-long v9, v34, v42

    add-long v36, v36, v9

    and-long v9, v36, v40

    shr-long v11, v36, v42

    mul-long v11, v11, v20

    add-long v38, v38, v11

    and-long v11, v38, v40

    and-long v13, v32, v40

    shr-long v15, v38, v42

    add-long/2addr v13, v15

    add-long v20, v11, v20

    shr-long v15, v20, v42

    add-long/2addr v15, v13

    shr-long v18, v15, v42

    add-long v18, v3, v18

    shr-long v22, v18, v42

    add-long v22, v7, v22

    shr-long v24, v22, v42

    add-long v24, v9, v24

    const-wide/32 v26, -0x4000000

    add-long v24, v24, v26

    const/16 v1, 0x3f

    shr-long v26, v24, v1

    const-wide/16 v28, -0x1

    xor-long v28, v26, v28

    and-long v13, v13, v26

    and-long v15, v15, v40

    and-long v15, v15, v28

    or-long/2addr v13, v15

    and-long v3, v3, v26

    and-long v15, v18, v40

    and-long v15, v15, v28

    or-long/2addr v3, v15

    and-long v7, v7, v26

    and-long v15, v22, v40

    and-long v15, v15, v28

    or-long/2addr v7, v15

    and-long v11, v11, v26

    and-long v15, v20, v40

    and-long v15, v15, v28

    or-long/2addr v11, v15

    shl-long v15, v13, v42

    or-long/2addr v11, v15

    const-wide v15, 0xffffffffL

    and-long/2addr v11, v15

    invoke-static {v0, v6}, Lcom/daaw/ub7;->c([BI)J

    move-result-wide v18

    add-long v11, v11, v18

    const/4 v1, 0x6

    shr-long/2addr v13, v1

    const/16 v1, 0x14

    shl-long v17, v3, v1

    or-long v13, v13, v17

    and-long/2addr v13, v15

    invoke-static {v0, v1}, Lcom/daaw/ub7;->c([BI)J

    move-result-wide v17

    add-long v13, v13, v17

    const/16 v1, 0x20

    shr-long v17, v11, v1

    add-long v13, v13, v17

    const/16 v5, 0xc

    shr-long/2addr v3, v5

    const/16 v5, 0xe

    shl-long v17, v7, v5

    or-long v3, v3, v17

    and-long/2addr v3, v15

    const/16 v5, 0x18

    invoke-static {v0, v5}, Lcom/daaw/ub7;->c([BI)J

    move-result-wide v17

    add-long v3, v3, v17

    shr-long v17, v13, v1

    add-long v3, v3, v17

    const/16 v5, 0x1c

    invoke-static {v0, v5}, Lcom/daaw/ub7;->c([BI)J

    move-result-wide v17

    new-array v0, v6, [B

    and-long v5, v11, v15

    invoke-static {v0, v5, v6, v2}, Lcom/daaw/ub7;->d([BJI)V

    and-long v5, v13, v15

    const/4 v2, 0x4

    invoke-static {v0, v5, v6, v2}, Lcom/daaw/ub7;->d([BJI)V

    and-long v5, v3, v15

    const/16 v2, 0x8

    invoke-static {v0, v5, v6, v2}, Lcom/daaw/ub7;->d([BJI)V

    const/16 v5, 0x12

    shr-long v5, v7, v5

    and-long v7, v9, v26

    and-long v9, v24, v28

    or-long/2addr v7, v9

    shl-long/2addr v7, v2

    or-long/2addr v5, v7

    and-long/2addr v5, v15

    add-long v5, v5, v17

    shr-long v1, v3, v1

    add-long/2addr v5, v1

    and-long v1, v5, v15

    const/16 v3, 0xc

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/ub7;->d([BJI)V

    return-object v0
.end method

.method public static b([BII)J
    .locals 2

    invoke-static {p0, p1}, Lcom/daaw/ub7;->c([BI)J

    move-result-wide p0

    shr-long/2addr p0, p2

    const-wide/32 v0, 0x3ffffff

    and-long/2addr p0, v0

    return-wide p0
.end method

.method public static c([BI)J
    .locals 2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    int-to-long p0, p0

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    return-wide p0
.end method

.method public static d([BJI)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    add-int v1, p3, v0

    const-wide/16 v2, 0xff

    and-long/2addr v2, p1

    long-to-int v3, v2

    int-to-byte v2, v3

    aput-byte v2, p0, v1

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x8

    shr-long/2addr p1, v1

    goto :goto_0

    :cond_0
    return-void
.end method
