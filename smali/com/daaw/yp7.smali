.class public final Lcom/daaw/yp7;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a([B[B)[B
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    array-length v2, v0

    const/16 v3, 0x20

    if-ne v2, v3, :cond_c

    const/16 v2, 0xb

    new-array v4, v2, [J

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    const/4 v5, 0x0

    aget-byte v6, v0, v5

    and-int/lit16 v6, v6, 0xf8

    int-to-byte v6, v6

    aput-byte v6, v0, v5

    const/16 v6, 0x1f

    aget-byte v7, v0, v6

    and-int/lit8 v7, v7, 0x7f

    int-to-byte v8, v7

    aput-byte v8, v0, v6

    or-int/lit8 v7, v7, 0x40

    int-to-byte v7, v7

    aput-byte v7, v0, v6

    sget v7, Lcom/daaw/so7;->b:I

    array-length v7, v1

    if-ne v7, v3, :cond_b

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v7

    aget-byte v8, v7, v6

    and-int/lit8 v8, v8, 0x7f

    int-to-byte v8, v8

    aput-byte v8, v7, v6

    const/4 v6, 0x0

    :goto_0
    const/4 v8, 0x7

    if-ge v6, v8, :cond_1

    sget-object v8, Lcom/daaw/so7;->a:[[B

    aget-object v9, v8, v6

    invoke-static {v9, v7}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v9

    if-nez v9, :cond_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidKeyException;

    aget-object v1, v8, v6

    invoke-static {v1}, Lcom/daaw/op7;->a([B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Banned public key: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v7}, Lcom/daaw/np7;->k([B)[J

    move-result-object v6

    const/16 v7, 0x13

    new-array v8, v7, [J

    new-array v9, v7, [J

    const-wide/16 v10, 0x1

    aput-wide v10, v9, v5

    new-array v12, v7, [J

    aput-wide v10, v12, v5

    new-array v13, v7, [J

    new-array v14, v7, [J

    new-array v15, v7, [J

    aput-wide v10, v15, v5

    new-array v2, v7, [J

    new-array v3, v7, [J

    aput-wide v10, v3, v5

    const/16 v10, 0xa

    invoke-static {v6, v5, v8, v5, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v5, 0x20

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v5, :cond_3

    rsub-int/lit8 v16, v11, 0x20

    add-int/lit8 v16, v16, -0x1

    aget-byte v5, v0, v16

    and-int/lit16 v5, v5, 0xff

    const/4 v7, 0x0

    :goto_2
    const/16 v10, 0x8

    if-ge v7, v10, :cond_2

    rsub-int/lit8 v10, v7, 0x7

    shr-int v10, v5, v10

    and-int/lit8 v10, v10, 0x1

    invoke-static {v12, v8, v10}, Lcom/daaw/so7;->a([J[JI)V

    invoke-static {v13, v9, v10}, Lcom/daaw/so7;->a([J[JI)V

    move-object/from16 v17, v0

    const/16 v0, 0xa

    invoke-static {v12, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    move/from16 v16, v5

    const/16 v0, 0x13

    new-array v5, v0, [J

    move-object/from16 v18, v4

    new-array v4, v0, [J

    move/from16 v19, v11

    new-array v11, v0, [J

    move/from16 v20, v7

    new-array v7, v0, [J

    move/from16 v21, v10

    new-array v10, v0, [J

    move-object/from16 v22, v3

    new-array v3, v0, [J

    move-object/from16 v23, v5

    new-array v5, v0, [J

    invoke-static {v12, v12, v13}, Lcom/daaw/np7;->i([J[J[J)V

    invoke-static {v13, v1, v13}, Lcom/daaw/np7;->h([J[J[J)V

    const/16 v1, 0xa

    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    invoke-static {v8, v8, v9}, Lcom/daaw/np7;->i([J[J[J)V

    invoke-static {v9, v0, v9}, Lcom/daaw/np7;->h([J[J[J)V

    invoke-static {v7, v8, v13}, Lcom/daaw/np7;->b([J[J[J)V

    invoke-static {v10, v12, v9}, Lcom/daaw/np7;->b([J[J[J)V

    invoke-static {v7}, Lcom/daaw/np7;->e([J)V

    invoke-static {v7}, Lcom/daaw/np7;->d([J)V

    invoke-static {v10}, Lcom/daaw/np7;->e([J)V

    invoke-static {v10}, Lcom/daaw/np7;->d([J)V

    move-object/from16 v24, v8

    const/4 v8, 0x0

    invoke-static {v7, v8, v0, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v7, v7, v10}, Lcom/daaw/np7;->i([J[J[J)V

    invoke-static {v10, v0, v10}, Lcom/daaw/np7;->h([J[J[J)V

    invoke-static {v5, v7}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v3, v10}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v10, v3, v6}, Lcom/daaw/np7;->b([J[J[J)V

    invoke-static {v10}, Lcom/daaw/np7;->e([J)V

    invoke-static {v10}, Lcom/daaw/np7;->d([J)V

    invoke-static {v5, v8, v14, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10, v8, v15, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v4, v12}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v11, v13}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v2, v4, v11}, Lcom/daaw/np7;->b([J[J[J)V

    invoke-static {v2}, Lcom/daaw/np7;->e([J)V

    invoke-static {v2}, Lcom/daaw/np7;->d([J)V

    invoke-static {v11, v4, v11}, Lcom/daaw/np7;->h([J[J[J)V

    const/16 v0, 0x12

    const-wide/16 v7, 0x0

    move-object/from16 v3, v23

    invoke-static {v3, v1, v0, v7, v8}, Ljava/util/Arrays;->fill([JIIJ)V

    const-wide/32 v0, 0x1db41

    invoke-static {v3, v11, v0, v1}, Lcom/daaw/np7;->f([J[JJ)V

    invoke-static {v3}, Lcom/daaw/np7;->d([J)V

    invoke-static {v3, v3, v4}, Lcom/daaw/np7;->i([J[J[J)V

    move-object/from16 v0, v22

    invoke-static {v0, v11, v3}, Lcom/daaw/np7;->b([J[J[J)V

    invoke-static {v0}, Lcom/daaw/np7;->e([J)V

    invoke-static {v0}, Lcom/daaw/np7;->d([J)V

    move/from16 v1, v21

    invoke-static {v2, v14, v1}, Lcom/daaw/so7;->a([J[JI)V

    invoke-static {v0, v15, v1}, Lcom/daaw/so7;->a([J[JI)V

    add-int/lit8 v7, v20, 0x1

    move-object/from16 v1, p1

    move-object v3, v13

    move-object v8, v14

    move/from16 v5, v16

    move-object/from16 v4, v18

    move/from16 v11, v19

    move-object/from16 v14, v24

    move-object v13, v0

    move-object/from16 v0, v17

    move-object/from16 v25, v12

    move-object v12, v2

    move-object/from16 v2, v25

    move-object/from16 v26, v15

    move-object v15, v9

    move-object/from16 v9, v26

    goto/16 :goto_2

    :cond_2
    move-object/from16 v17, v0

    move-object v0, v3

    move-object/from16 v18, v4

    move-object/from16 v24, v8

    move/from16 v19, v11

    add-int/lit8 v11, v19, 0x1

    move-object/from16 v1, p1

    move-object/from16 v0, v17

    const/16 v5, 0x20

    const/16 v7, 0x13

    const/16 v10, 0xa

    goto/16 :goto_1

    :cond_3
    move-object/from16 v18, v4

    const/16 v0, 0xa

    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v3, v0, [J

    new-array v4, v0, [J

    new-array v5, v0, [J

    new-array v7, v0, [J

    new-array v10, v0, [J

    new-array v11, v0, [J

    new-array v14, v0, [J

    new-array v15, v0, [J

    move-object/from16 v16, v8

    new-array v8, v0, [J

    invoke-static {v2, v13}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v2}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v3, v15, v13}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v4, v3, v2}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v15, v4}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v5, v15, v3}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v15, v5}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v7, v15, v5}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v15, v7}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    const/4 v0, 0x2

    const/4 v2, 0x2

    :goto_3
    const/16 v3, 0xa

    if-ge v2, v3, :cond_4

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_3

    :cond_4
    invoke-static {v10, v8, v7}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v15, v10}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    const/4 v2, 0x2

    :goto_4
    const/16 v3, 0x14

    if-ge v2, v3, :cond_5

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_4

    :cond_5
    invoke-static {v15, v8, v10}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    const/4 v2, 0x2

    :goto_5
    const/16 v3, 0xa

    if-ge v2, v3, :cond_6

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_5

    :cond_6
    invoke-static {v11, v15, v7}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v15, v11}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    const/4 v2, 0x2

    :goto_6
    const/16 v3, 0x32

    if-ge v2, v3, :cond_7

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_6

    :cond_7
    invoke-static {v14, v8, v11}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v8, v14}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    const/4 v2, 0x2

    :goto_7
    const/16 v5, 0x64

    if-ge v2, v5, :cond_8

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_7

    :cond_8
    invoke-static {v8, v15, v14}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    :goto_8
    if-ge v0, v3, :cond_9

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_8

    :cond_9
    invoke-static {v15, v8, v11}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v15, v8}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v8, v15}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v1, v8, v4}, Lcom/daaw/np7;->a([J[J[J)V

    move-object/from16 v0, v18

    invoke-static {v0, v12, v1}, Lcom/daaw/np7;->a([J[J[J)V

    const/16 v1, 0xa

    new-array v2, v1, [J

    new-array v3, v1, [J

    const/16 v4, 0xb

    new-array v5, v4, [J

    new-array v7, v4, [J

    new-array v4, v4, [J

    invoke-static {v2, v6, v0}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v3, v6, v0}, Lcom/daaw/np7;->i([J[J[J)V

    new-array v1, v1, [J

    const-wide/32 v10, 0x76d06

    const/4 v6, 0x0

    aput-wide v10, v1, v6

    invoke-static {v7, v3, v1}, Lcom/daaw/np7;->i([J[J[J)V

    invoke-static {v7, v7, v9}, Lcom/daaw/np7;->a([J[J[J)V

    move-object/from16 v8, v16

    invoke-static {v7, v7, v8}, Lcom/daaw/np7;->i([J[J[J)V

    invoke-static {v7, v7, v2}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v7, v7, v8}, Lcom/daaw/np7;->a([J[J[J)V

    const-wide/16 v10, 0x4

    invoke-static {v5, v7, v10, v11}, Lcom/daaw/np7;->f([J[JJ)V

    invoke-static {v5}, Lcom/daaw/np7;->d([J)V

    invoke-static {v7, v2, v9}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v7, v7, v9}, Lcom/daaw/np7;->h([J[J[J)V

    invoke-static {v4, v3, v8}, Lcom/daaw/np7;->a([J[J[J)V

    invoke-static {v7, v7, v4}, Lcom/daaw/np7;->i([J[J[J)V

    invoke-static {v7, v7}, Lcom/daaw/np7;->g([J[J)V

    invoke-static {v5}, Lcom/daaw/np7;->j([J)[B

    move-result-object v1

    invoke-static {v7}, Lcom/daaw/np7;->j([J)[B

    move-result-object v2

    invoke-static {v1, v2}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {v0}, Lcom/daaw/np7;->j([J)[B

    move-result-object v0

    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static/range {p1 .. p1}, Lcom/daaw/op7;->a([B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Arithmetic error in curve multiplication with the public key: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "Public key length is not 32-byte"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "Private key must have 32 bytes."

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :goto_9
    throw v0

    :goto_a
    goto :goto_9
.end method

.method public static b()[B
    .locals 4

    const/16 v0, 0x20

    invoke-static {v0}, Lcom/daaw/vp7;->a(I)[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v2, v0, v1

    or-int/lit8 v2, v2, 0x7

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/16 v1, 0x1f

    aget-byte v2, v0, v1

    and-int/lit8 v2, v2, 0x3f

    int-to-byte v3, v2

    aput-byte v3, v0, v1

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    return-object v0
.end method

.method public static c([B)[B
    .locals 3

    array-length v0, p0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    new-array v0, v1, [B

    const/4 v1, 0x0

    const/16 v2, 0x9

    aput-byte v2, v0, v1

    invoke-static {p0, v0}, Lcom/daaw/yp7;->a([B[B)[B

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string v0, "Private key must have 32 bytes."

    invoke-direct {p0, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
