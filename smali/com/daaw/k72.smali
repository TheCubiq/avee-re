.class public final Lcom/daaw/k72;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/i72;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/h72;->a:Lcom/daaw/h72;

    sput-object v0, Lcom/daaw/k72;->a:Lcom/daaw/i72;

    return-void
.end method

.method public static final a([BILcom/daaw/i72;Lcom/daaw/o62;)Lcom/google/android/gms/internal/ads/zzbq;
    .locals 11

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lcom/daaw/ik5;

    invoke-direct {v0, p0, p1}, Lcom/daaw/ik5;-><init>([BI)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->i()I

    move-result p0

    const/4 p1, 0x2

    const/16 v1, 0xa

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, "Id3Decoder"

    const/4 v6, 0x0

    if-ge p0, v1, :cond_0

    const-string p0, "Data too short to be an ID3 tag"

    :goto_0
    invoke-static {v5, p0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object v9, v6

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ik5;->u()I

    move-result p0

    const v7, 0x494433

    if-eq p0, v7, :cond_1

    new-array v7, v4, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v7, v3

    const-string p0, "%06X"

    invoke-static {p0, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v7, "Unexpected first three bytes of ID3 tag header: 0x"

    invoke-virtual {v7, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/ik5;->s()I

    move-result p0

    invoke-virtual {v0, v4}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->s()I

    move-result v7

    invoke-virtual {v0}, Lcom/daaw/ik5;->r()I

    move-result v8

    if-ne p0, p1, :cond_2

    and-int/lit8 v9, v7, 0x40

    if-eqz v9, :cond_5

    const-string p0, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"

    goto :goto_0

    :cond_2
    const/4 v9, 0x3

    if-ne p0, v9, :cond_3

    and-int/lit8 v9, v7, 0x40

    if-eqz v9, :cond_5

    invoke-virtual {v0}, Lcom/daaw/ik5;->m()I

    move-result v9

    invoke-virtual {v0, v9}, Lcom/daaw/ik5;->g(I)V

    add-int/2addr v9, v2

    sub-int/2addr v8, v9

    goto :goto_1

    :cond_3
    if-ne p0, v2, :cond_7

    and-int/lit8 v9, v7, 0x40

    if-eqz v9, :cond_4

    invoke-virtual {v0}, Lcom/daaw/ik5;->r()I

    move-result v9

    add-int/lit8 v10, v9, -0x4

    invoke-virtual {v0, v10}, Lcom/daaw/ik5;->g(I)V

    sub-int/2addr v8, v9

    :cond_4
    and-int/lit8 v9, v7, 0x10

    if-eqz v9, :cond_5

    add-int/lit8 v8, v8, -0xa

    :cond_5
    :goto_1
    if-ge p0, v2, :cond_6

    and-int/lit16 v7, v7, 0x80

    if-eqz v7, :cond_6

    const/4 v7, 0x1

    goto :goto_2

    :cond_6
    const/4 v7, 0x0

    :goto_2
    new-instance v9, Lcom/daaw/j72;

    invoke-direct {v9, p0, v7, v8}, Lcom/daaw/j72;-><init>(IZI)V

    goto :goto_3

    :cond_7
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Skipped ID3 tag with unsupported majorVersion="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    :goto_3
    if-nez v9, :cond_8

    return-object v6

    :cond_8
    invoke-virtual {v0}, Lcom/daaw/ik5;->k()I

    move-result p0

    invoke-static {v9}, Lcom/daaw/j72;->b(Lcom/daaw/j72;)I

    move-result v7

    if-ne v7, p1, :cond_9

    const/4 v1, 0x6

    :cond_9
    invoke-static {v9}, Lcom/daaw/j72;->a(Lcom/daaw/j72;)I

    move-result p1

    invoke-static {v9}, Lcom/daaw/j72;->c(Lcom/daaw/j72;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-static {v9}, Lcom/daaw/j72;->a(Lcom/daaw/j72;)I

    move-result p1

    invoke-static {v0, p1}, Lcom/daaw/k72;->e(Lcom/daaw/ik5;I)I

    move-result p1

    :cond_a
    add-int/2addr p0, p1

    invoke-virtual {v0, p0}, Lcom/daaw/ik5;->e(I)V

    invoke-static {v9}, Lcom/daaw/j72;->b(Lcom/daaw/j72;)I

    move-result p0

    invoke-static {v0, p0, v1, v3}, Lcom/daaw/k72;->j(Lcom/daaw/ik5;IIZ)Z

    move-result p0

    if-nez p0, :cond_c

    invoke-static {v9}, Lcom/daaw/j72;->b(Lcom/daaw/j72;)I

    move-result p0

    if-ne p0, v2, :cond_b

    invoke-static {v0, v2, v1, v4}, Lcom/daaw/k72;->j(Lcom/daaw/ik5;IIZ)Z

    move-result p0

    if-eqz p0, :cond_b

    const/4 v3, 0x1

    goto :goto_4

    :cond_b
    invoke-static {v9}, Lcom/daaw/j72;->b(Lcom/daaw/j72;)I

    move-result p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Failed to validate ID3 tag with majorVersion="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v5, p0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v6

    :cond_c
    :goto_4
    invoke-virtual {v0}, Lcom/daaw/ik5;->i()I

    move-result p0

    if-lt p0, v1, :cond_d

    invoke-static {v9}, Lcom/daaw/j72;->b(Lcom/daaw/j72;)I

    move-result p0

    invoke-static {p0, v0, v3, v1, p2}, Lcom/daaw/k72;->f(ILcom/daaw/ik5;ZILcom/daaw/i72;)Lcom/google/android/gms/internal/ads/zzade;

    move-result-object p0

    if-eqz p0, :cond_c

    invoke-interface {p3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_d
    new-instance p0, Lcom/google/android/gms/internal/ads/zzbq;

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static b(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static c([BII)I
    .locals 2

    invoke-static {p0, p1}, Lcom/daaw/k72;->d([BI)I

    move-result v0

    if-eqz p2, :cond_3

    const/4 v1, 0x3

    if-eq p2, v1, :cond_3

    :goto_0
    array-length p2, p0

    add-int/lit8 v1, p2, -0x1

    if-ge v0, v1, :cond_2

    sub-int p2, v0, p1

    rem-int/lit8 p2, p2, 0x2

    if-nez p2, :cond_1

    add-int/lit8 p2, v0, 0x1

    aget-byte p2, p0, p2

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    return v0

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lcom/daaw/k72;->d([BI)I

    move-result v0

    goto :goto_0

    :cond_2
    return p2

    :cond_3
    return v0
.end method

.method public static d([BI)I
    .locals 1

    :goto_0
    array-length v0, p0

    if-ge p1, v0, :cond_1

    aget-byte v0, p0, p1

    if-nez v0, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static e(Lcom/daaw/ik5;I)I
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result p0

    move v1, p0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    add-int v3, p0, p1

    if-ge v2, v3, :cond_1

    aget-byte v3, v0, v1

    const/16 v4, 0xff

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_0

    aget-byte v3, v0, v2

    if-nez v3, :cond_0

    add-int/lit8 v3, v1, 0x2

    sub-int/2addr v1, p0

    sub-int v1, p1, v1

    add-int/lit8 v1, v1, -0x2

    invoke-static {v0, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p1, p1, -0x1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    return p1
.end method

.method public static f(ILcom/daaw/ik5;ZILcom/daaw/i72;)Lcom/google/android/gms/internal/ads/zzade;
    .locals 34

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v6

    const/4 v7, 0x3

    if-lt v0, v7, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v9

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    const/4 v10, 0x4

    if-ne v0, v10, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->v()I

    move-result v11

    if-nez v2, :cond_3

    and-int/lit16 v12, v11, 0xff

    shr-int/lit8 v13, v11, 0x8

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x7

    or-int/2addr v12, v13

    shr-int/lit8 v13, v11, 0x10

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0xe

    or-int/2addr v12, v13

    shr-int/lit8 v11, v11, 0x18

    shl-int/lit8 v11, v11, 0x15

    or-int/2addr v11, v12

    goto :goto_1

    :cond_1
    if-ne v0, v7, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->v()I

    move-result v11

    goto :goto_1

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->u()I

    move-result v11

    :cond_3
    :goto_1
    if-lt v0, v7, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->w()I

    move-result v12

    goto :goto_2

    :cond_4
    const/4 v12, 0x0

    :goto_2
    const/4 v13, 0x0

    if-nez v4, :cond_6

    if-nez v5, :cond_6

    if-nez v6, :cond_6

    if-nez v9, :cond_6

    if-nez v11, :cond_6

    if-eqz v12, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->l()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/daaw/ik5;->f(I)V

    return-object v13

    :cond_6
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v14

    add-int/2addr v14, v11

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->l()I

    move-result v15

    const-string v8, "Id3Decoder"

    if-le v14, v15, :cond_7

    const-string v0, "Frame size exceeds remaining tag data"

    invoke-static {v8, v0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    if-nez p4, :cond_3d

    const/4 v15, 0x1

    if-ne v0, v7, :cond_b

    and-int/lit16 v7, v12, 0x80

    if-eqz v7, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v17, v12, 0x40

    if-eqz v17, :cond_9

    const/16 v17, 0x1

    goto :goto_6

    :cond_9
    const/16 v17, 0x0

    :goto_6
    and-int/lit8 v12, v12, 0x20

    if-eqz v12, :cond_a

    const/4 v12, 0x1

    goto :goto_7

    :cond_a
    const/4 v12, 0x0

    :goto_7
    move/from16 v18, v17

    const/16 v19, 0x0

    move/from16 v17, v7

    goto :goto_c

    :cond_b
    if-ne v0, v10, :cond_10

    and-int/lit8 v7, v12, 0x40

    if-eqz v7, :cond_c

    const/4 v7, 0x1

    goto :goto_8

    :cond_c
    const/4 v7, 0x0

    :goto_8
    and-int/lit8 v17, v12, 0x8

    if-eqz v17, :cond_d

    const/16 v17, 0x1

    goto :goto_9

    :cond_d
    const/16 v17, 0x0

    :goto_9
    and-int/lit8 v18, v12, 0x4

    if-eqz v18, :cond_e

    const/16 v18, 0x1

    goto :goto_a

    :cond_e
    const/16 v18, 0x0

    :goto_a
    and-int/lit8 v19, v12, 0x2

    if-eqz v19, :cond_f

    const/16 v19, 0x1

    goto :goto_b

    :cond_f
    const/16 v19, 0x0

    :goto_b
    and-int/2addr v12, v15

    move/from16 v33, v12

    move v12, v7

    move/from16 v7, v33

    goto :goto_c

    :cond_10
    const/4 v7, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_c
    if-nez v17, :cond_3c

    if-eqz v18, :cond_11

    goto/16 :goto_21

    :cond_11
    if-eqz v12, :cond_12

    add-int/lit8 v11, v11, -0x1

    invoke-virtual {v1, v15}, Lcom/daaw/ik5;->g(I)V

    :cond_12
    if-eqz v7, :cond_13

    add-int/lit8 v11, v11, -0x4

    invoke-virtual {v1, v10}, Lcom/daaw/ik5;->g(I)V

    :cond_13
    if-eqz v19, :cond_14

    invoke-static {v1, v11}, Lcom/daaw/k72;->e(Lcom/daaw/ik5;I)I

    move-result v11

    :cond_14
    const/16 v7, 0x54

    const/16 v12, 0x58

    const/4 v10, 0x2

    if-ne v4, v7, :cond_17

    if-ne v5, v12, :cond_17

    if-ne v6, v12, :cond_17

    if-eq v0, v10, :cond_15

    if-ne v9, v12, :cond_17

    :cond_15
    if-gtz v11, :cond_16

    goto :goto_d

    :cond_16
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-static {v2}, Lcom/daaw/k72;->h(I)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v7, v11, -0x1

    new-array v10, v7, [B

    const/4 v12, 0x0

    invoke-virtual {v1, v10, v12, v7}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v10, v12, v2}, Lcom/daaw/k72;->c([BII)I

    move-result v7

    new-instance v15, Ljava/lang/String;

    invoke-direct {v15, v10, v12, v7, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-static {v2}, Lcom/daaw/k72;->b(I)I

    move-result v12

    add-int/2addr v7, v12

    invoke-static {v10, v7, v2}, Lcom/daaw/k72;->c([BII)I

    move-result v2

    invoke-static {v10, v7, v2, v3}, Lcom/daaw/k72;->g([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzadm;

    const-string v7, "TXXX"

    invoke-direct {v3, v7, v15, v2}, Lcom/google/android/gms/internal/ads/zzadm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_e

    :cond_17
    if-ne v4, v7, :cond_19

    invoke-static {v0, v7, v5, v6, v9}, Lcom/daaw/k72;->i(IIIII)Ljava/lang/String;

    move-result-object v2

    if-gtz v11, :cond_18

    :goto_d
    move/from16 v23, v4

    move v3, v5

    move v4, v6

    move-object/from16 v22, v8

    move v8, v9

    move/from16 v21, v14

    goto/16 :goto_1c

    :cond_18
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/k72;->h(I)Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v10, v11, -0x1

    new-array v12, v10, [B

    const/4 v15, 0x0

    invoke-virtual {v1, v12, v15, v10}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v12, v15, v3}, Lcom/daaw/k72;->c([BII)I

    move-result v3

    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v12, v15, v3, v7}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/zzadm;

    invoke-direct {v3, v2, v13, v10}, Lcom/google/android/gms/internal/ads/zzadm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_e
    move-object v13, v3

    goto :goto_d

    :catchall_0
    move-exception v0

    goto/16 :goto_20

    :catch_0
    move-object v2, v8

    goto/16 :goto_1f

    :cond_19
    const/16 v7, 0x57

    const-string v15, "ISO-8859-1"

    if-ne v4, v7, :cond_1d

    if-ne v5, v12, :cond_1c

    if-ne v6, v12, :cond_1c

    if-eq v0, v10, :cond_1a

    if-ne v9, v12, :cond_1c

    :cond_1a
    if-gtz v11, :cond_1b

    goto :goto_d

    :cond_1b
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-static {v2}, Lcom/daaw/k72;->h(I)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v7, v11, -0x1

    new-array v10, v7, [B

    const/4 v12, 0x0

    invoke-virtual {v1, v10, v12, v7}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v10, v12, v2}, Lcom/daaw/k72;->c([BII)I

    move-result v7

    new-instance v13, Ljava/lang/String;

    invoke-direct {v13, v10, v12, v7, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-static {v2}, Lcom/daaw/k72;->b(I)I

    move-result v2

    add-int/2addr v7, v2

    invoke-static {v10, v7}, Lcom/daaw/k72;->d([BI)I

    move-result v2

    invoke-static {v10, v7, v2, v15}, Lcom/daaw/k72;->g([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzado;

    const-string v7, "WXXX"

    invoke-direct {v3, v7, v13, v2}, Lcom/google/android/gms/internal/ads/zzado;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_e

    :cond_1c
    const/16 v12, 0x57

    goto :goto_f

    :cond_1d
    move v12, v4

    :goto_f
    if-ne v12, v7, :cond_1e

    invoke-static {v0, v7, v5, v6, v9}, Lcom/daaw/k72;->i(IIIII)Ljava/lang/String;

    move-result-object v2

    new-array v3, v11, [B

    const/4 v7, 0x0

    invoke-virtual {v1, v3, v7, v11}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v3, v7}, Lcom/daaw/k72;->d([BI)I

    move-result v10

    new-instance v12, Ljava/lang/String;

    invoke-direct {v12, v3, v7, v10, v15}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/zzado;

    const/4 v7, 0x0

    invoke-direct {v3, v2, v7, v12}, Lcom/google/android/gms/internal/ads/zzado;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_e

    :cond_1e
    const/16 v7, 0x49

    const/16 v13, 0x50

    if-ne v12, v13, :cond_20

    const/16 v12, 0x52

    if-ne v5, v12, :cond_1f

    if-ne v6, v7, :cond_1f

    const/16 v12, 0x56

    if-ne v9, v12, :cond_1f

    new-array v2, v11, [B

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v11}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v2, v3}, Lcom/daaw/k72;->d([BI)I

    move-result v7

    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v2, v3, v7, v15}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    const/4 v3, 0x1

    add-int/2addr v7, v3

    invoke-static {v2, v7, v11}, Lcom/daaw/k72;->k([BII)[B

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzadk;

    invoke-direct {v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzadk;-><init>(Ljava/lang/String;[B)V

    goto/16 :goto_e

    :cond_1f
    const/16 v12, 0x50

    :cond_20
    const/16 v7, 0x4f

    const/16 v13, 0x47

    if-ne v12, v13, :cond_23

    const/16 v12, 0x45

    if-ne v5, v12, :cond_22

    if-ne v6, v7, :cond_22

    const/16 v12, 0x42

    if-eq v9, v12, :cond_21

    if-ne v0, v10, :cond_22

    :cond_21
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-static {v2}, Lcom/daaw/k72;->h(I)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v7, v11, -0x1

    new-array v10, v7, [B

    const/4 v12, 0x0

    invoke-virtual {v1, v10, v12, v7}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v10, v12}, Lcom/daaw/k72;->d([BI)I

    move-result v13

    new-instance v12, Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move/from16 v21, v14

    const/4 v14, 0x0

    :try_start_2
    invoke-direct {v12, v10, v14, v13, v15}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    const/4 v14, 0x1

    add-int/2addr v13, v14

    invoke-static {v10, v13, v2}, Lcom/daaw/k72;->c([BII)I

    move-result v14

    invoke-static {v10, v13, v14, v3}, Lcom/daaw/k72;->g([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v2}, Lcom/daaw/k72;->b(I)I

    move-result v15

    add-int/2addr v14, v15

    invoke-static {v10, v14, v2}, Lcom/daaw/k72;->c([BII)I

    move-result v15

    invoke-static {v10, v14, v15, v3}, Lcom/daaw/k72;->g([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Lcom/daaw/k72;->b(I)I

    move-result v2

    add-int/2addr v15, v2

    invoke-static {v10, v15, v7}, Lcom/daaw/k72;->k([BII)[B

    move-result-object v2

    new-instance v7, Lcom/google/android/gms/internal/ads/zzacz;

    invoke-direct {v7, v12, v13, v3, v2}, Lcom/google/android/gms/internal/ads/zzacz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    move/from16 v23, v4

    move v3, v5

    move v4, v6

    move-object v13, v7

    move-object/from16 v22, v8

    goto/16 :goto_14

    :cond_22
    move/from16 v21, v14

    const/16 v12, 0x47

    goto :goto_10

    :cond_23
    move/from16 v21, v14

    :goto_10
    const/16 v13, 0x43

    if-ne v0, v10, :cond_24

    const/16 v14, 0x50

    if-ne v12, v14, :cond_28

    const/16 v7, 0x49

    if-ne v5, v7, :cond_28

    if-ne v6, v13, :cond_28

    goto :goto_11

    :cond_24
    const/16 v7, 0x49

    const/16 v14, 0x50

    const/16 v10, 0x41

    if-ne v12, v10, :cond_28

    if-ne v5, v14, :cond_28

    if-ne v6, v7, :cond_28

    if-ne v9, v13, :cond_28

    :goto_11
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-static {v2}, Lcom/daaw/k72;->h(I)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v7, v11, -0x1

    new-array v10, v7, [B

    const/4 v12, 0x0

    invoke-virtual {v1, v10, v12, v7}, Lcom/daaw/ik5;->b([BII)V

    const/4 v13, 0x2

    if-ne v0, v13, :cond_26

    new-instance v13, Ljava/lang/String;

    const/4 v14, 0x3

    invoke-direct {v13, v10, v12, v14, v15}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    const-string v12, "image/"

    invoke-static {v13}, Lcom/daaw/wx6;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "image/jpg"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_25

    const-string v12, "image/jpeg"

    :cond_25
    const/4 v13, 0x2

    goto :goto_12

    :cond_26
    invoke-static {v10, v12}, Lcom/daaw/k72;->d([BI)I

    move-result v13

    new-instance v14, Ljava/lang/String;

    invoke-direct {v14, v10, v12, v13, v15}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-static {v14}, Lcom/daaw/wx6;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0x2f

    invoke-virtual {v12, v14}, Ljava/lang/String;->indexOf(I)I

    move-result v14

    const/4 v15, -0x1

    if-ne v14, v15, :cond_27

    const-string v14, "image/"

    invoke-virtual {v14, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    :cond_27
    :goto_12
    add-int/lit8 v14, v13, 0x1

    aget-byte v14, v10, v14

    and-int/lit16 v14, v14, 0xff

    const/4 v15, 0x2

    add-int/2addr v13, v15

    invoke-static {v10, v13, v2}, Lcom/daaw/k72;->c([BII)I

    move-result v15
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v22, v8

    :try_start_3
    new-instance v8, Ljava/lang/String;

    move/from16 v23, v4

    sub-int v4, v15, v13

    invoke-direct {v8, v10, v13, v4, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-static {v2}, Lcom/daaw/k72;->b(I)I

    move-result v2

    add-int/2addr v15, v2

    invoke-static {v10, v15, v7}, Lcom/daaw/k72;->k([BII)[B

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzacp;

    invoke-direct {v3, v12, v8, v14, v2}, Lcom/google/android/gms/internal/ads/zzacp;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    goto :goto_13

    :catch_1
    move-object v2, v8

    goto/16 :goto_1d

    :cond_28
    move/from16 v23, v4

    move-object/from16 v22, v8

    const/16 v4, 0x4d

    if-ne v12, v13, :cond_2b

    const/16 v7, 0x4f

    if-ne v5, v7, :cond_2b

    if-ne v6, v4, :cond_2b

    if-eq v9, v4, :cond_29

    const/4 v7, 0x2

    if-ne v0, v7, :cond_2b

    :cond_29
    const/4 v2, 0x4

    if-ge v11, v2, :cond_2a

    move v3, v5

    move v4, v6

    move v8, v9

    const/4 v13, 0x0

    goto/16 :goto_1c

    :cond_2a
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-static {v2}, Lcom/daaw/k72;->h(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    new-array v7, v4, [B

    const/4 v8, 0x0

    invoke-virtual {v1, v7, v8, v4}, Lcom/daaw/ik5;->b([BII)V

    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v7, v8, v4}, Ljava/lang/String;-><init>([BII)V

    add-int/lit8 v4, v11, -0x4

    new-array v7, v4, [B

    invoke-virtual {v1, v7, v8, v4}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v7, v8, v2}, Lcom/daaw/k72;->c([BII)I

    move-result v4

    new-instance v12, Ljava/lang/String;

    invoke-direct {v12, v7, v8, v4, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-static {v2}, Lcom/daaw/k72;->b(I)I

    move-result v8

    add-int/2addr v4, v8

    invoke-static {v7, v4, v2}, Lcom/daaw/k72;->c([BII)I

    move-result v2

    invoke-static {v7, v4, v2, v3}, Lcom/daaw/k72;->g([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzacx;

    invoke-direct {v3, v10, v12, v2}, Lcom/google/android/gms/internal/ads/zzacx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_13
    move-object v13, v3

    move v3, v5

    move v4, v6

    :goto_14
    move v8, v9

    goto/16 :goto_1c

    :cond_2b
    if-ne v12, v13, :cond_30

    const/16 v7, 0x48

    if-ne v5, v7, :cond_30

    const/16 v7, 0x41

    if-ne v6, v7, :cond_30

    const/16 v7, 0x50

    if-ne v9, v7, :cond_30

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v7

    invoke-static {v7, v4}, Lcom/daaw/k72;->d([BI)I

    move-result v7

    new-instance v8, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v10

    sub-int v12, v7, v4

    invoke-direct {v8, v10, v4, v12, v15}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    const/4 v10, 0x1

    add-int/2addr v7, v10

    invoke-virtual {v1, v7}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->m()I

    move-result v26

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->m()I

    move-result v27

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->A()J

    move-result-wide v12

    const-wide v14, 0xffffffffL

    cmp-long v7, v12, v14

    if-nez v7, :cond_2c

    const-wide/16 v12, -0x1

    :cond_2c
    move-wide/from16 v28, v12

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->A()J

    move-result-wide v12

    const-wide v14, 0xffffffffL

    cmp-long v7, v12, v14

    if-nez v7, :cond_2d

    const-wide/16 v12, -0x1

    :cond_2d
    move-wide/from16 v30, v12

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    add-int/2addr v4, v11

    :cond_2e
    :goto_15
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v10

    if-ge v10, v4, :cond_2f

    const/4 v10, 0x0

    invoke-static {v0, v1, v2, v3, v10}, Lcom/daaw/k72;->f(ILcom/daaw/ik5;ZILcom/daaw/i72;)Lcom/google/android/gms/internal/ads/zzade;

    move-result-object v12

    if-eqz v12, :cond_2e

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_2f
    const/4 v2, 0x0

    new-array v2, v2, [Lcom/google/android/gms/internal/ads/zzade;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v32, v2

    check-cast v32, [Lcom/google/android/gms/internal/ads/zzade;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzact;

    move-object/from16 v24, v3

    move-object/from16 v25, v8

    invoke-direct/range {v24 .. v32}, Lcom/google/android/gms/internal/ads/zzact;-><init>(Ljava/lang/String;IIJJ[Lcom/google/android/gms/internal/ads/zzade;)V

    goto/16 :goto_13

    :cond_30
    if-ne v12, v13, :cond_36

    const/16 v7, 0x54

    if-ne v5, v7, :cond_36

    const/16 v7, 0x4f

    if-ne v6, v7, :cond_36

    if-ne v9, v13, :cond_36

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v7

    invoke-static {v7, v4}, Lcom/daaw/k72;->d([BI)I

    move-result v7

    new-instance v8, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v10

    sub-int v12, v7, v4

    invoke-direct {v8, v10, v4, v12, v15}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    const/4 v10, 0x1

    add-int/2addr v7, v10

    invoke-virtual {v1, v7}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v7

    and-int/lit8 v10, v7, 0x2

    if-eqz v10, :cond_31

    const/4 v10, 0x1

    const/16 v26, 0x1

    goto :goto_16

    :cond_31
    const/4 v10, 0x1

    const/16 v26, 0x0

    :goto_16
    and-int/2addr v7, v10

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v10

    new-array v12, v10, [Ljava/lang/String;

    const/4 v13, 0x0

    :goto_17
    if-ge v13, v10, :cond_32

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v14

    move/from16 p4, v10

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v10

    invoke-static {v10, v14}, Lcom/daaw/k72;->d([BI)I

    move-result v10

    move/from16 v16, v9

    new-instance v9, Ljava/lang/String;

    move/from16 v17, v6

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v6

    move/from16 v20, v5

    sub-int v5, v10, v14

    invoke-direct {v9, v6, v14, v5, v15}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    aput-object v9, v12, v13

    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v1, v10}, Lcom/daaw/ik5;->f(I)V

    add-int/lit8 v13, v13, 0x1

    move/from16 v10, p4

    move/from16 v9, v16

    move/from16 v6, v17

    move/from16 v5, v20

    goto :goto_17

    :cond_32
    move/from16 v20, v5

    move/from16 v17, v6

    move/from16 v16, v9

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    add-int/2addr v4, v11

    :cond_33
    :goto_18
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v6

    if-ge v6, v4, :cond_34

    const/4 v6, 0x0

    invoke-static {v0, v1, v2, v3, v6}, Lcom/daaw/k72;->f(ILcom/daaw/ik5;ZILcom/daaw/i72;)Lcom/google/android/gms/internal/ads/zzade;

    move-result-object v9

    if-eqz v9, :cond_33

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_34
    const/4 v2, 0x0

    new-array v3, v2, [Lcom/google/android/gms/internal/ads/zzade;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v29, v2

    check-cast v29, [Lcom/google/android/gms/internal/ads/zzade;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzacv;

    const/4 v2, 0x1

    if-eq v2, v7, :cond_35

    const/16 v27, 0x0

    goto :goto_19

    :cond_35
    const/16 v27, 0x1

    :goto_19
    move-object/from16 v24, v3

    move-object/from16 v25, v8

    move-object/from16 v28, v12

    invoke-direct/range {v24 .. v29}, Lcom/google/android/gms/internal/ads/zzacv;-><init>(Ljava/lang/String;ZZ[Ljava/lang/String;[Lcom/google/android/gms/internal/ads/zzade;)V

    move-object v13, v3

    move/from16 v8, v16

    move/from16 v4, v17

    move/from16 v3, v20

    goto/16 :goto_1c

    :cond_36
    move/from16 v20, v5

    move/from16 v17, v6

    move/from16 v16, v9

    if-ne v12, v4, :cond_39

    const/16 v2, 0x4c

    move/from16 v3, v20

    if-ne v3, v2, :cond_38

    const/16 v2, 0x4c

    move/from16 v4, v17

    move/from16 v8, v16

    if-ne v4, v2, :cond_3a

    const/16 v2, 0x54

    if-ne v8, v2, :cond_3a

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->w()I

    move-result v25

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->u()I

    move-result v26

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->u()I

    move-result v27

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->s()I

    move-result v5

    new-instance v6, Lcom/daaw/cj5;

    invoke-direct {v6}, Lcom/daaw/cj5;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->l()I

    move-result v9

    invoke-virtual {v6, v7, v9}, Lcom/daaw/cj5;->g([BI)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v7

    mul-int/lit8 v7, v7, 0x8

    invoke-virtual {v6, v7}, Lcom/daaw/cj5;->h(I)V

    add-int/lit8 v7, v11, -0xa

    mul-int/lit8 v7, v7, 0x8

    add-int v9, v2, v5

    div-int/2addr v7, v9

    new-array v9, v7, [I

    new-array v10, v7, [I

    const/4 v12, 0x0

    :goto_1a
    if-ge v12, v7, :cond_37

    invoke-virtual {v6, v2}, Lcom/daaw/cj5;->c(I)I

    move-result v13

    invoke-virtual {v6, v5}, Lcom/daaw/cj5;->c(I)I

    move-result v14

    aput v13, v9, v12

    aput v14, v10, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_1a

    :cond_37
    new-instance v2, Lcom/google/android/gms/internal/ads/zzadi;

    move-object/from16 v24, v2

    move-object/from16 v28, v9

    move-object/from16 v29, v10

    invoke-direct/range {v24 .. v29}, Lcom/google/android/gms/internal/ads/zzadi;-><init>(III[I[I)V

    move-object v13, v2

    goto :goto_1c

    :cond_38
    move/from16 v8, v16

    move/from16 v4, v17

    goto :goto_1b

    :cond_39
    move/from16 v8, v16

    move/from16 v4, v17

    move/from16 v3, v20

    :cond_3a
    :goto_1b
    invoke-static {v0, v12, v3, v4, v8}, Lcom/daaw/k72;->i(IIIII)Ljava/lang/String;

    move-result-object v2

    new-array v5, v11, [B

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6, v11}, Lcom/daaw/ik5;->b([BII)V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzacr;

    invoke-direct {v6, v2, v5}, Lcom/google/android/gms/internal/ads/zzacr;-><init>(Ljava/lang/String;[B)V
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v13, v6

    :goto_1c
    if-nez v13, :cond_3b

    move/from16 v2, v23

    :try_start_4
    invoke-static {v0, v2, v3, v4, v8}, Lcom/daaw/k72;->i(IIIII)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to decode frame: id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", frameSize="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object/from16 v2, v22

    :try_start_5
    invoke-static {v2, v0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1e

    :catchall_1
    move-exception v0

    move/from16 v14, v21

    goto :goto_20

    :catch_2
    move-object/from16 v2, v22

    :catch_3
    :goto_1d
    move/from16 v14, v21

    goto :goto_1f

    :cond_3b
    :goto_1e
    move/from16 v14, v21

    invoke-virtual {v1, v14}, Lcom/daaw/ik5;->f(I)V

    return-object v13

    :catch_4
    move/from16 v14, v21

    move-object/from16 v2, v22

    :goto_1f
    :try_start_6
    const-string v0, "Unsupported character encoding"

    invoke-static {v2, v0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {v1, v14}, Lcom/daaw/ik5;->f(I)V

    const/4 v0, 0x0

    return-object v0

    :goto_20
    invoke-virtual {v1, v14}, Lcom/daaw/ik5;->f(I)V

    throw v0

    :cond_3c
    :goto_21
    move-object v2, v8

    move-object v0, v13

    const-string v3, "Skipping unsupported compressed or encrypted frame"

    invoke-static {v2, v3}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Lcom/daaw/ik5;->f(I)V

    return-object v0

    :cond_3d
    move-object v0, v13

    invoke-virtual {v1, v14}, Lcom/daaw/ik5;->f(I)V

    return-object v0
.end method

.method public static g([BIILjava/lang/String;)Ljava/lang/String;
    .locals 1

    if-le p2, p1, :cond_1

    array-length v0, p0

    if-le p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2, p3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static h(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string p0, "ISO-8859-1"

    return-object p0

    :cond_0
    const-string p0, "UTF-8"

    return-object p0

    :cond_1
    const-string p0, "UTF-16BE"

    return-object p0

    :cond_2
    const-string p0, "UTF-16"

    return-object p0
.end method

.method public static i(IIIII)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne p0, v3, :cond_0

    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p4, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v3

    const-string p1, "%c%c%c"

    invoke-static {p0, p1, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v0

    const-string p1, "%c%c%c%c"

    invoke-static {p0, p1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static j(Lcom/daaw/ik5;IIZ)Z
    .locals 19

    move-object/from16 v1, p0

    move/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->k()I

    move-result v2

    :goto_0
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->i()I

    move-result v3

    const/4 v4, 0x1

    move/from16 v5, p2

    if-lt v3, v5, :cond_d

    const/4 v3, 0x3

    const/4 v6, 0x0

    if-lt v0, v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->A()J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->w()I

    move-result v10

    goto :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->u()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->u()I

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v8, v8

    const/4 v10, 0x0

    :goto_1
    const-wide/16 v11, 0x0

    if-nez v7, :cond_2

    cmp-long v7, v8, v11

    if-nez v7, :cond_2

    if-eqz v10, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v1, v2}, Lcom/daaw/ik5;->f(I)V

    return v4

    :cond_2
    :goto_2
    const/4 v7, 0x4

    if-ne v0, v7, :cond_4

    if-nez p3, :cond_4

    const-wide/32 v13, 0x808080

    and-long/2addr v13, v8

    cmp-long v15, v13, v11

    if-eqz v15, :cond_3

    invoke-virtual {v1, v2}, Lcom/daaw/ik5;->f(I)V

    return v6

    :cond_3
    const-wide/16 v11, 0xff

    and-long v13, v8, v11

    const/16 v15, 0x8

    shr-long v15, v8, v15

    and-long/2addr v15, v11

    const/16 v17, 0x7

    shl-long v15, v15, v17

    or-long/2addr v13, v15

    const/16 v15, 0x10

    shr-long v15, v8, v15

    and-long/2addr v11, v15

    const/16 v15, 0xe

    shl-long/2addr v11, v15

    or-long/2addr v11, v13

    const/16 v13, 0x18

    shr-long/2addr v8, v13

    const/16 v13, 0x15

    shl-long/2addr v8, v13

    or-long/2addr v8, v11

    :cond_4
    if-ne v0, v7, :cond_6

    and-int/lit8 v3, v10, 0x40

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    :goto_3
    and-int/lit8 v3, v10, 0x1

    move/from16 v18, v4

    move v4, v3

    move/from16 v3, v18

    goto :goto_5

    :cond_6
    if-ne v0, v3, :cond_8

    and-int/lit8 v3, v10, 0x20

    if-eqz v3, :cond_7

    const/4 v3, 0x1

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    :goto_4
    and-int/lit16 v7, v10, 0x80

    if-eqz v7, :cond_9

    goto :goto_5

    :cond_8
    const/4 v3, 0x0

    :cond_9
    const/4 v4, 0x0

    :goto_5
    if-eqz v4, :cond_a

    add-int/lit8 v3, v3, 0x4

    :cond_a
    int-to-long v3, v3

    cmp-long v7, v8, v3

    if-gez v7, :cond_b

    invoke-virtual {v1, v2}, Lcom/daaw/ik5;->f(I)V

    return v6

    :cond_b
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->i()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    int-to-long v3, v3

    cmp-long v7, v3, v8

    if-gez v7, :cond_c

    invoke-virtual {v1, v2}, Lcom/daaw/ik5;->f(I)V

    return v6

    :cond_c
    long-to-int v3, v8

    :try_start_2
    invoke-virtual {v1, v3}, Lcom/daaw/ik5;->g(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :cond_d
    invoke-virtual {v1, v2}, Lcom/daaw/ik5;->f(I)V

    return v4

    :catchall_0
    move-exception v0

    invoke-virtual {v1, v2}, Lcom/daaw/ik5;->f(I)V

    goto :goto_7

    :goto_6
    throw v0

    :goto_7
    goto :goto_6
.end method

.method public static k([BII)[B
    .locals 0

    if-gt p2, p1, :cond_0

    sget-object p0, Lcom/daaw/it5;->f:[B

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    return-object p0
.end method
