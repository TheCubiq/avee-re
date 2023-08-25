.class public final Lcom/daaw/r92;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "OpusHead"

    invoke-static {v0}, Lcom/daaw/it5;->B(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/daaw/r92;->a:[B

    return-void
.end method

.method public static a(Lcom/daaw/b92;)Landroid/util/Pair;
    .locals 11

    iget-object p0, p0, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->f(I)V

    const/4 v1, 0x0

    move-object v2, v1

    move-object v3, v2

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/ik5;->i()I

    move-result v4

    if-lt v4, v0, :cond_c

    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v4

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v5

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v6

    const v7, 0x6d657461

    if-ne v6, v7, :cond_5

    invoke-virtual {p0, v4}, Lcom/daaw/ik5;->f(I)V

    add-int v2, v4, v5

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    invoke-static {p0}, Lcom/daaw/r92;->d(Lcom/daaw/ik5;)V

    :goto_1
    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v6

    if-ge v6, v2, :cond_4

    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v6

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v7

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v8

    const v9, 0x696c7374

    if-ne v8, v9, :cond_3

    invoke-virtual {p0, v6}, Lcom/daaw/ik5;->f(I)V

    add-int/2addr v6, v7

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_2
    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v7

    if-ge v7, v6, :cond_1

    invoke-static {p0}, Lcom/daaw/y92;->a(Lcom/daaw/ik5;)Lcom/google/android/gms/internal/ads/zzbp;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    new-instance v6, Lcom/google/android/gms/internal/ads/zzbq;

    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(Ljava/util/List;)V

    move-object v2, v6

    goto/16 :goto_6

    :cond_3
    add-int/2addr v6, v7

    invoke-virtual {p0, v6}, Lcom/daaw/ik5;->f(I)V

    goto :goto_1

    :cond_4
    :goto_3
    move-object v2, v1

    goto :goto_6

    :cond_5
    const v7, 0x736d7461

    if-ne v6, v7, :cond_b

    invoke-virtual {p0, v4}, Lcom/daaw/ik5;->f(I)V

    add-int v3, v4, v5

    const/16 v6, 0xc

    invoke-virtual {p0, v6}, Lcom/daaw/ik5;->g(I)V

    :goto_4
    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v7

    if-ge v7, v3, :cond_a

    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v7

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v8

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v9

    const v10, 0x73617574

    if-ne v9, v10, :cond_9

    const/16 v3, 0xe

    if-ge v8, v3, :cond_6

    goto :goto_5

    :cond_6
    const/4 v3, 0x5

    invoke-virtual {p0, v3}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v3

    const/high16 v7, 0x42f00000    # 120.0f

    if-eq v3, v6, :cond_7

    const/16 v6, 0xd

    if-eq v3, v6, :cond_8

    goto :goto_5

    :cond_7
    if-ne v3, v6, :cond_8

    const/high16 v7, 0x43700000    # 240.0f

    :cond_8
    const/4 v3, 0x1

    invoke-virtual {p0, v3}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v6

    new-instance v8, Lcom/google/android/gms/internal/ads/zzbq;

    new-array v3, v3, [Lcom/google/android/gms/internal/ads/zzbp;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzadx;

    invoke-direct {v9, v7, v6}, Lcom/google/android/gms/internal/ads/zzadx;-><init>(FI)V

    const/4 v6, 0x0

    aput-object v9, v3, v6

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v8, v6, v7, v3}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(J[Lcom/google/android/gms/internal/ads/zzbp;)V

    move-object v3, v8

    goto :goto_6

    :cond_9
    add-int/2addr v7, v8

    invoke-virtual {p0, v7}, Lcom/daaw/ik5;->f(I)V

    goto :goto_4

    :cond_a
    :goto_5
    move-object v3, v1

    :cond_b
    :goto_6
    add-int/2addr v4, v5

    invoke-virtual {p0, v4}, Lcom/daaw/ik5;->f(I)V

    goto/16 :goto_0

    :cond_c
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/daaw/a92;)Lcom/google/android/gms/internal/ads/zzbq;
    .locals 14

    const v0, 0x68646c72    # 4.3148E24f

    invoke-virtual {p0, v0}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v0

    const v1, 0x6b657973

    invoke-virtual {p0, v1}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v1

    const v2, 0x696c7374

    invoke-virtual {p0, v2}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object p0

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    if-eqz p0, :cond_8

    iget-object v0, v0, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    invoke-static {v0}, Lcom/daaw/r92;->g(Lcom/daaw/ik5;)I

    move-result v0

    const v3, 0x6d647461

    if-eq v0, v3, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, v1, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->m()I

    move-result v1

    new-array v3, v1, [Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_1

    invoke-virtual {v0}, Lcom/daaw/ik5;->m()I

    move-result v6

    const/4 v7, 0x4

    invoke-virtual {v0, v7}, Lcom/daaw/ik5;->g(I)V

    add-int/lit8 v6, v6, -0x8

    sget-object v7, Lcom/daaw/cy6;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v6, v7}, Lcom/daaw/ik5;->F(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    iget-object p0, p0, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->f(I)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-virtual {p0}, Lcom/daaw/ik5;->i()I

    move-result v6

    if-le v6, v0, :cond_6

    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v6

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v7

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-ltz v8, :cond_4

    if-ge v8, v1, :cond_4

    aget-object v8, v3, v8

    add-int v9, v6, v7

    sget v10, Lcom/daaw/y92;->b:I

    :goto_2
    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v10

    if-ge v10, v9, :cond_3

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v11

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v12

    const v13, 0x64617461

    if-ne v12, v13, :cond_2

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v9

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v10

    add-int/lit8 v11, v11, -0x10

    new-array v12, v11, [B

    invoke-virtual {p0, v12, v4, v11}, Lcom/daaw/ik5;->b([BII)V

    new-instance v11, Lcom/google/android/gms/internal/ads/zzadr;

    invoke-direct {v11, v8, v12, v10, v9}, Lcom/google/android/gms/internal/ads/zzadr;-><init>(Ljava/lang/String;[BII)V

    goto :goto_3

    :cond_2
    add-int/2addr v10, v11

    invoke-virtual {p0, v10}, Lcom/daaw/ik5;->f(I)V

    goto :goto_2

    :cond_3
    move-object v11, v2

    :goto_3
    if-eqz v11, :cond_5

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Skipped metadata with unknown key index: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "AtomParsers"

    invoke-static {v9, v8}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_4
    add-int/2addr v6, v7

    invoke-virtual {p0, v6}, Lcom/daaw/ik5;->f(I)V

    goto :goto_1

    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_7

    return-object v2

    :cond_7
    new-instance p0, Lcom/google/android/gms/internal/ads/zzbq;

    invoke-direct {p0, v5}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_8
    :goto_5
    return-object v2
.end method

.method public static c(Lcom/daaw/a92;Lcom/daaw/y09;JLcom/google/android/gms/internal/ads/zzx;ZZLcom/daaw/ey6;)Ljava/util/List;
    .locals 58

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v12, p4

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    const/4 v15, 0x0

    :goto_0
    iget-object v2, v0, Lcom/daaw/a92;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v15, v2, :cond_94

    iget-object v2, v0, Lcom/daaw/a92;->d:Ljava/util/List;

    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/daaw/a92;

    iget v2, v11, Lcom/daaw/c92;->a:I

    const v3, 0x7472616b

    if-eq v2, v3, :cond_0

    move-object v0, v13

    move/from16 v31, v15

    goto/16 :goto_67

    :cond_0
    const v2, 0x6d766864

    invoke-virtual {v0, v2}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const v10, 0x6d646961

    invoke-virtual {v11, v10}, Lcom/daaw/a92;->c(I)Lcom/daaw/a92;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x68646c72    # 4.3148E24f

    invoke-virtual {v3, v4}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v4, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    invoke-static {v4}, Lcom/daaw/r92;->g(Lcom/daaw/ik5;)I

    move-result v4

    invoke-static {v4}, Lcom/daaw/r92;->e(I)I

    move-result v9

    const-string v6, "AtomParsers"

    move/from16 v31, v15

    const/4 v5, -0x1

    if-ne v9, v5, :cond_1

    move-object/from16 v0, p7

    move-object v14, v6

    move-object v2, v11

    move-object/from16 v32, v13

    const/4 v3, 0x2

    :goto_1
    const/4 v8, 0x0

    goto/16 :goto_3b

    :cond_1
    const v4, 0x746b6864

    invoke-virtual {v11, v4}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v4, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    const/16 v8, 0x8

    invoke-virtual {v4, v8}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v4}, Lcom/daaw/ik5;->m()I

    move-result v21

    invoke-static/range {v21 .. v21}, Lcom/daaw/c92;->a(I)I

    move-result v21

    if-nez v21, :cond_2

    const/16 v10, 0x8

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    invoke-virtual {v4, v10}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v4}, Lcom/daaw/ik5;->m()I

    move-result v10

    const/4 v8, 0x4

    invoke-virtual {v4, v8}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v4}, Lcom/daaw/ik5;->k()I

    move-result v25

    if-nez v21, :cond_3

    goto :goto_3

    :cond_3
    const/16 v8, 0x8

    :goto_3
    const/4 v7, 0x0

    :goto_4
    const-wide v28, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v7, v8, :cond_6

    invoke-virtual {v4}, Lcom/daaw/ik5;->h()[B

    move-result-object v30

    add-int v32, v25, v7

    aget-byte v14, v30, v32

    if-eq v14, v5, :cond_5

    if-nez v21, :cond_4

    invoke-virtual {v4}, Lcom/daaw/ik5;->A()J

    move-result-wide v7

    goto :goto_5

    :cond_4
    invoke-virtual {v4}, Lcom/daaw/ik5;->B()J

    move-result-wide v7

    :goto_5
    const-wide/16 v14, 0x0

    cmp-long v21, v7, v14

    if-nez v21, :cond_7

    goto :goto_6

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    invoke-virtual {v4, v8}, Lcom/daaw/ik5;->g(I)V

    :goto_6
    move-wide/from16 v7, v28

    :cond_7
    const/16 v14, 0x10

    invoke-virtual {v4, v14}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v4}, Lcom/daaw/ik5;->m()I

    move-result v15

    invoke-virtual {v4}, Lcom/daaw/ik5;->m()I

    move-result v5

    const/4 v14, 0x4

    invoke-virtual {v4, v14}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v4}, Lcom/daaw/ik5;->m()I

    move-result v14

    invoke-virtual {v4}, Lcom/daaw/ik5;->m()I

    move-result v4

    const/high16 v0, 0x10000

    move-object/from16 v25, v6

    const/high16 v6, -0x10000

    if-nez v15, :cond_b

    if-ne v5, v0, :cond_a

    if-ne v14, v6, :cond_9

    if-nez v4, :cond_8

    const/16 v0, 0x5a

    goto :goto_a

    :cond_8
    const/high16 v5, 0x10000

    const/high16 v14, -0x10000

    goto :goto_7

    :cond_9
    const/high16 v5, 0x10000

    :cond_a
    :goto_7
    const/4 v15, 0x0

    :cond_b
    if-nez v15, :cond_f

    if-ne v5, v6, :cond_e

    if-ne v14, v0, :cond_c

    if-nez v4, :cond_d

    const/16 v0, 0x10e

    goto :goto_a

    :cond_c
    move v0, v14

    :cond_d
    const/high16 v5, -0x10000

    goto :goto_8

    :cond_e
    move v0, v14

    :goto_8
    const/4 v15, 0x0

    goto :goto_9

    :cond_f
    move v0, v14

    :goto_9
    if-ne v15, v6, :cond_10

    if-nez v5, :cond_10

    if-nez v0, :cond_10

    if-ne v4, v6, :cond_10

    const/16 v0, 0xb4

    goto :goto_a

    :cond_10
    const/4 v0, 0x0

    :goto_a
    new-instance v14, Lcom/daaw/q92;

    invoke-direct {v14, v10, v7, v8, v0}, Lcom/daaw/q92;-><init>(IJI)V

    cmp-long v0, p2, v28

    if-nez v0, :cond_11

    invoke-static {v14}, Lcom/daaw/q92;->c(Lcom/daaw/q92;)J

    move-result-wide v4

    move-wide/from16 v35, v4

    goto :goto_b

    :cond_11
    move-wide/from16 v35, p2

    :goto_b
    iget-object v0, v2, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->m()I

    move-result v4

    invoke-static {v4}, Lcom/daaw/c92;->a(I)I

    move-result v4

    if-nez v4, :cond_12

    const/16 v8, 0x8

    goto :goto_c

    :cond_12
    const/16 v8, 0x10

    :goto_c
    invoke-virtual {v0, v8}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->A()J

    move-result-wide v41

    cmp-long v0, v35, v28

    if-nez v0, :cond_13

    goto :goto_d

    :cond_13
    const-wide/32 v37, 0xf4240

    move-wide/from16 v39, v41

    invoke-static/range {v35 .. v40}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v4

    move-wide/from16 v28, v4

    :goto_d
    const v0, 0x6d696e66

    invoke-virtual {v3, v0}, Lcom/daaw/a92;->c(I)Lcom/daaw/a92;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const v8, 0x7374626c

    invoke-virtual {v2, v8}, Lcom/daaw/a92;->c(I)Lcom/daaw/a92;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x6d646864

    invoke-virtual {v3, v4}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v3, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    invoke-static {v3}, Lcom/daaw/r92;->i(Lcom/daaw/ik5;)Landroid/util/Pair;

    move-result-object v15

    const v3, 0x73747364

    invoke-virtual {v2, v3}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v10, v2, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    invoke-static {v14}, Lcom/daaw/q92;->a(Lcom/daaw/q92;)I

    move-result v7

    invoke-static {v14}, Lcom/daaw/q92;->b(Lcom/daaw/q92;)I

    move-result v6

    iget-object v2, v15, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    const/16 v4, 0xc

    invoke-virtual {v10, v4}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v10}, Lcom/daaw/ik5;->m()I

    move-result v3

    new-instance v2, Lcom/daaw/n92;

    invoke-direct {v2, v3}, Lcom/daaw/n92;-><init>(I)V

    const/4 v0, 0x0

    :goto_e
    if-ge v0, v3, :cond_56

    move-object/from16 v32, v13

    invoke-virtual {v10}, Lcom/daaw/ik5;->k()I

    move-result v13

    invoke-virtual {v10}, Lcom/daaw/ik5;->m()I

    move-result v1

    if-lez v1, :cond_14

    const/4 v4, 0x1

    goto :goto_f

    :cond_14
    const/4 v4, 0x0

    :goto_f
    const-string v8, "childAtomSize must be positive"

    invoke-static {v4, v8}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    invoke-virtual {v10}, Lcom/daaw/ik5;->m()I

    move-result v4

    const v8, 0x61766331

    move/from16 v24, v3

    const v3, 0x656e6376

    if-eq v4, v8, :cond_20

    const v8, 0x61766333

    if-eq v4, v8, :cond_20

    if-eq v4, v3, :cond_20

    const v8, 0x6d317620

    if-eq v4, v8, :cond_20

    const v8, 0x6d703476

    if-eq v4, v8, :cond_20

    const v8, 0x68766331

    if-eq v4, v8, :cond_20

    const v8, 0x68657631

    if-eq v4, v8, :cond_20

    const v8, 0x73323633

    if-eq v4, v8, :cond_20

    const v8, 0x48323633

    if-eq v4, v8, :cond_20

    const v8, 0x76703038

    if-eq v4, v8, :cond_20

    const v8, 0x76703039

    if-eq v4, v8, :cond_20

    const v8, 0x61763031

    if-eq v4, v8, :cond_20

    const v8, 0x64766176

    if-eq v4, v8, :cond_20

    const v8, 0x64766131

    if-eq v4, v8, :cond_20

    const v8, 0x64766865

    if-eq v4, v8, :cond_20

    const v8, 0x64766831

    if-ne v4, v8, :cond_15

    goto/16 :goto_16

    :cond_15
    const v3, 0x6d703461

    if-eq v4, v3, :cond_1f

    const v3, 0x656e6361

    if-eq v4, v3, :cond_1f

    const v3, 0x61632d33

    if-eq v4, v3, :cond_1f

    const v3, 0x65632d33

    if-eq v4, v3, :cond_1f

    const v3, 0x61632d34

    if-eq v4, v3, :cond_1f

    const v3, 0x6d6c7061

    if-eq v4, v3, :cond_1f

    const v3, 0x64747363

    if-eq v4, v3, :cond_1f

    const v3, 0x64747365

    if-eq v4, v3, :cond_1f

    const v3, 0x64747368

    if-eq v4, v3, :cond_1f

    const v3, 0x6474736c

    if-eq v4, v3, :cond_1f

    const v3, 0x64747378

    if-eq v4, v3, :cond_1f

    const v3, 0x73616d72

    if-eq v4, v3, :cond_1f

    const v3, 0x73617762

    if-eq v4, v3, :cond_1f

    const v3, 0x6c70636d

    if-eq v4, v3, :cond_1f

    const v3, 0x736f7774

    if-eq v4, v3, :cond_1f

    const v3, 0x74776f73

    if-eq v4, v3, :cond_1f

    const v3, 0x2e6d7032

    if-eq v4, v3, :cond_1f

    const v3, 0x2e6d7033

    if-eq v4, v3, :cond_1f

    const v3, 0x6d686131

    if-eq v4, v3, :cond_1f

    const v3, 0x6d686d31

    if-eq v4, v3, :cond_1f

    const v3, 0x616c6163

    if-eq v4, v3, :cond_1f

    const v3, 0x616c6177

    if-eq v4, v3, :cond_1f

    const v3, 0x756c6177

    if-eq v4, v3, :cond_1f

    const v3, 0x4f707573

    if-eq v4, v3, :cond_1f

    const v3, 0x664c6143

    if-ne v4, v3, :cond_16

    goto/16 :goto_15

    :cond_16
    const v3, 0x54544d4c

    if-eq v4, v3, :cond_1a

    const v3, 0x74783367

    if-eq v4, v3, :cond_1a

    const v3, 0x77767474

    if-eq v4, v3, :cond_1a

    const v3, 0x73747070

    if-eq v4, v3, :cond_1a

    const v3, 0x63363038

    if-ne v4, v3, :cond_17

    goto :goto_11

    :cond_17
    const v3, 0x6d657474

    if-ne v4, v3, :cond_18

    const v3, 0x6d657474

    invoke-static {v10, v3, v13, v7, v2}, Lcom/daaw/r92;->n(Lcom/daaw/ik5;IIILcom/daaw/n92;)V

    goto :goto_10

    :cond_18
    const v3, 0x63616d6d

    if-ne v4, v3, :cond_19

    new-instance v3, Lcom/daaw/b72;

    invoke-direct {v3}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v3, v7}, Lcom/daaw/b72;->g(I)Lcom/daaw/b72;

    const-string v4, "application/x-camera-motion"

    invoke-virtual {v3, v4}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v3}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v3

    iput-object v3, v2, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    :cond_19
    :goto_10
    move/from16 v17, v0

    move/from16 v38, v1

    move-object v4, v2

    move-object/from16 v16, v5

    move v2, v6

    move v1, v7

    move/from16 v18, v9

    move-object/from16 v44, v11

    move/from16 v40, v13

    move-object/from16 v21, v14

    move-object/from16 v19, v15

    move-object/from16 v14, v25

    goto/16 :goto_14

    :cond_1a
    :goto_11
    add-int/lit8 v3, v13, 0x10

    invoke-virtual {v10, v3}, Lcom/daaw/ik5;->f(I)V

    const v3, 0x54544d4c

    const-wide v35, 0x7fffffffffffffffL

    if-ne v4, v3, :cond_1b

    const-string v3, "application/ttml+xml"

    :goto_12
    move/from16 v30, v6

    move/from16 v22, v9

    move-wide/from16 v8, v35

    const/4 v4, 0x0

    goto :goto_13

    :cond_1b
    const v3, 0x74783367

    if-ne v4, v3, :cond_1c

    add-int/lit8 v3, v1, -0x10

    new-array v4, v3, [B

    const/4 v8, 0x0

    invoke-virtual {v10, v4, v8, v3}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v4}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v3

    const-string v4, "application/x-quicktime-tx3g"

    move/from16 v30, v6

    move/from16 v22, v9

    move-wide/from16 v8, v35

    move-object/from16 v56, v4

    move-object v4, v3

    move-object/from16 v3, v56

    goto :goto_13

    :cond_1c
    const v3, 0x77767474

    if-ne v4, v3, :cond_1d

    const-string v3, "application/x-mp4-vtt"

    goto :goto_12

    :cond_1d
    const v3, 0x73747070

    if-ne v4, v3, :cond_1e

    const-string v3, "application/ttml+xml"

    move/from16 v30, v6

    move/from16 v22, v9

    const/4 v4, 0x0

    const-wide/16 v8, 0x0

    goto :goto_13

    :cond_1e
    const/4 v8, 0x1

    iput v8, v2, Lcom/daaw/n92;->d:I

    const-string v3, "application/x-mp4-cea-608"

    goto :goto_12

    :goto_13
    new-instance v6, Lcom/daaw/b72;

    invoke-direct {v6}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v6, v7}, Lcom/daaw/b72;->g(I)Lcom/daaw/b72;

    invoke-virtual {v6, v3}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v6, v5}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v6, v8, v9}, Lcom/daaw/b72;->w(J)Lcom/daaw/b72;

    invoke-virtual {v6, v4}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    invoke-virtual {v6}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v3

    iput-object v3, v2, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    move/from16 v17, v0

    move/from16 v38, v1

    move-object v4, v2

    move-object/from16 v16, v5

    move v1, v7

    move-object/from16 v44, v11

    move/from16 v40, v13

    move-object/from16 v21, v14

    move-object/from16 v19, v15

    move/from16 v18, v22

    move-object/from16 v14, v25

    move/from16 v2, v30

    :goto_14
    const/4 v3, 0x2

    const/4 v5, -0x1

    move-object v15, v10

    goto/16 :goto_39

    :cond_1f
    :goto_15
    move/from16 v30, v6

    move/from16 v22, v9

    move-object v9, v2

    move-object v2, v10

    move v3, v4

    const/16 v6, 0xc

    const/4 v8, 0x2

    move v4, v13

    move-object/from16 v16, v5

    const/4 v6, -0x1

    move v5, v1

    move-object/from16 v21, v14

    move-object/from16 v19, v15

    move-object/from16 v14, v25

    move/from16 v15, v30

    move v6, v7

    move/from16 v43, v7

    const/16 v15, 0x10

    move-object/from16 v7, v16

    move/from16 v8, p6

    move-object/from16 v17, v9

    move/from16 v18, v22

    move-object/from16 v9, p4

    move-object v15, v10

    move-object/from16 v10, v17

    move-object/from16 v44, v11

    move v11, v0

    invoke-static/range {v2 .. v11}, Lcom/daaw/r92;->m(Lcom/daaw/ik5;IIIILjava/lang/String;ZLcom/google/android/gms/internal/ads/zzx;Lcom/daaw/n92;I)V

    move/from16 v38, v1

    move/from16 v40, v13

    move-object/from16 v4, v17

    move/from16 v2, v30

    move/from16 v1, v43

    const/4 v3, 0x2

    const/4 v5, -0x1

    move/from16 v17, v0

    goto/16 :goto_39

    :cond_20
    :goto_16
    move-object/from16 v17, v2

    move-object/from16 v16, v5

    move/from16 v30, v6

    move/from16 v43, v7

    move/from16 v18, v9

    move-object/from16 v44, v11

    move-object/from16 v21, v14

    move-object/from16 v19, v15

    move-object/from16 v14, v25

    move-object v15, v10

    add-int/lit8 v2, v13, 0x10

    invoke-virtual {v15, v2}, Lcom/daaw/ik5;->f(I)V

    const/16 v2, 0x10

    invoke-virtual {v15, v2}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v15}, Lcom/daaw/ik5;->w()I

    move-result v5

    invoke-virtual {v15}, Lcom/daaw/ik5;->w()I

    move-result v6

    const/16 v7, 0x32

    invoke-virtual {v15, v7}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v15}, Lcom/daaw/ik5;->k()I

    move-result v7

    if-ne v4, v3, :cond_23

    invoke-static {v15, v13, v1}, Lcom/daaw/r92;->j(Lcom/daaw/ik5;II)Landroid/util/Pair;

    move-result-object v4

    if-eqz v4, :cond_22

    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v12, :cond_21

    move-object/from16 v9, v17

    const/4 v8, 0x0

    goto :goto_17

    :cond_21
    iget-object v8, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Lcom/daaw/ia2;

    iget-object v8, v8, Lcom/daaw/ia2;->b:Ljava/lang/String;

    invoke-virtual {v12, v8}, Lcom/google/android/gms/internal/ads/zzx;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzx;

    move-result-object v8

    move-object/from16 v9, v17

    :goto_17
    iget-object v10, v9, Lcom/daaw/n92;->a:[Lcom/daaw/ia2;

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Lcom/daaw/ia2;

    aput-object v4, v10, v0

    move v4, v3

    goto :goto_18

    :cond_22
    move-object/from16 v9, v17

    move-object v8, v12

    const v4, 0x656e6376

    :goto_18
    invoke-virtual {v15, v7}, Lcom/daaw/ik5;->f(I)V

    goto :goto_19

    :cond_23
    move-object/from16 v9, v17

    move-object v8, v12

    :goto_19
    const v3, 0x6d317620

    if-ne v4, v3, :cond_24

    const-string v3, "video/mpeg"

    move/from16 v56, v4

    move-object v4, v3

    move/from16 v3, v56

    goto :goto_1a

    :cond_24
    const v3, 0x48323633

    if-ne v4, v3, :cond_25

    const-string v4, "video/3gpp"

    goto :goto_1a

    :cond_25
    move v3, v4

    const/4 v4, 0x0

    :goto_1a
    const/high16 v10, 0x3f800000    # 1.0f

    move/from16 v17, v0

    move v0, v7

    move-object/from16 v36, v8

    const/4 v2, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/16 v20, -0x1

    const/16 v22, -0x1

    const/16 v23, -0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v37, 0x0

    move-object v7, v4

    const/4 v4, 0x0

    :goto_1b
    sub-int v12, v0, v13

    if-ge v12, v1, :cond_4f

    invoke-virtual {v15, v0}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v15}, Lcom/daaw/ik5;->k()I

    move-result v12

    invoke-virtual {v15}, Lcom/daaw/ik5;->m()I

    move-result v38

    if-nez v38, :cond_27

    invoke-virtual {v15}, Lcom/daaw/ik5;->k()I

    move-result v38

    move/from16 v39, v10

    sub-int v10, v38, v13

    if-ne v10, v1, :cond_26

    move/from16 v38, v1

    move/from16 v55, v5

    move/from16 v50, v6

    move/from16 v49, v8

    move-object/from16 v47, v9

    goto/16 :goto_36

    :cond_26
    const/4 v10, 0x0

    goto :goto_1c

    :cond_27
    move/from16 v39, v10

    move/from16 v10, v38

    :goto_1c
    move/from16 v38, v1

    move/from16 v40, v13

    if-lez v10, :cond_28

    const/4 v1, 0x1

    goto :goto_1d

    :cond_28
    const/4 v1, 0x0

    :goto_1d
    const-string v13, "childAtomSize must be positive"

    invoke-static {v1, v13}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    invoke-virtual {v15}, Lcom/daaw/ik5;->m()I

    move-result v1

    const v13, 0x61766343

    if-ne v1, v13, :cond_2b

    if-nez v7, :cond_29

    const/4 v1, 0x1

    goto :goto_1e

    :cond_29
    const/4 v1, 0x0

    :goto_1e
    const/4 v13, 0x0

    invoke-static {v1, v13}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    add-int/lit8 v12, v12, 0x8

    invoke-virtual {v15, v12}, Lcom/daaw/ik5;->f(I)V

    invoke-static {v15}, Lcom/daaw/gz8;->a(Lcom/daaw/ik5;)Lcom/daaw/gz8;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/gz8;->a:Ljava/util/List;

    iget v7, v1, Lcom/daaw/gz8;->b:I

    iput v7, v9, Lcom/daaw/n92;->c:I

    if-nez v4, :cond_2a

    iget v8, v1, Lcom/daaw/gz8;->e:F

    :cond_2a
    iget-object v1, v1, Lcom/daaw/gz8;->f:Ljava/lang/String;

    const-string v7, "video/avc"

    :goto_1f
    move-object/from16 v37, v2

    move/from16 v45, v3

    move/from16 v55, v5

    move/from16 v50, v6

    move-object/from16 v47, v9

    const/4 v3, 0x2

    move-object v2, v1

    goto/16 :goto_35

    :cond_2b
    const v13, 0x68766343

    if-ne v1, v13, :cond_2e

    if-nez v7, :cond_2c

    const/4 v1, 0x1

    goto :goto_20

    :cond_2c
    const/4 v1, 0x0

    :goto_20
    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    add-int/lit8 v12, v12, 0x8

    invoke-virtual {v15, v12}, Lcom/daaw/ik5;->f(I)V

    invoke-static {v15}, Lcom/daaw/z09;->a(Lcom/daaw/ik5;)Lcom/daaw/z09;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/z09;->a:Ljava/util/List;

    iget v7, v1, Lcom/daaw/z09;->b:I

    iput v7, v9, Lcom/daaw/n92;->c:I

    if-nez v4, :cond_2d

    iget v8, v1, Lcom/daaw/z09;->c:F

    :cond_2d
    iget-object v1, v1, Lcom/daaw/z09;->d:Ljava/lang/String;

    const-string v7, "video/hevc"

    goto :goto_1f

    :cond_2e
    const v13, 0x64766343

    if-eq v1, v13, :cond_4d

    const v13, 0x64767643

    if-ne v1, v13, :cond_2f

    goto/16 :goto_33

    :cond_2f
    const v13, 0x76706343

    if-ne v1, v13, :cond_32

    if-nez v7, :cond_30

    const/4 v1, 0x1

    goto :goto_21

    :cond_30
    const/4 v1, 0x0

    :goto_21
    const/4 v7, 0x0

    invoke-static {v1, v7}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    const v1, 0x76703038

    if-ne v3, v1, :cond_31

    const-string v1, "video/x-vnd.on2.vp8"

    goto :goto_23

    :cond_31
    const-string v1, "video/x-vnd.on2.vp9"

    goto :goto_23

    :cond_32
    const v13, 0x61763143

    if-ne v1, v13, :cond_34

    if-nez v7, :cond_33

    const/4 v1, 0x1

    goto :goto_22

    :cond_33
    const/4 v1, 0x0

    :goto_22
    const/4 v7, 0x0

    invoke-static {v1, v7}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    const-string v1, "video/av01"

    :goto_23
    move-object v7, v1

    :goto_24
    move/from16 v45, v3

    move/from16 v55, v5

    move/from16 v50, v6

    move-object/from16 v47, v9

    :goto_25
    const/4 v3, 0x2

    goto/16 :goto_35

    :cond_34
    const v13, 0x636c6c69

    if-ne v1, v13, :cond_36

    if-nez v25, :cond_35

    invoke-static {}, Lcom/daaw/r92;->l()Ljava/nio/ByteBuffer;

    move-result-object v25

    :cond_35
    move-object/from16 v1, v25

    const/16 v12, 0x15

    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v12

    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v12

    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v25, v1

    goto :goto_24

    :cond_36
    const v13, 0x6d646376

    if-ne v1, v13, :cond_38

    if-nez v25, :cond_37

    invoke-static {}, Lcom/daaw/r92;->l()Ljava/nio/ByteBuffer;

    move-result-object v25

    :cond_37
    move-object/from16 v1, v25

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v12

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v13

    move/from16 v45, v3

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v3

    move/from16 v46, v4

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v4

    move-object/from16 v47, v9

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v9

    move-object/from16 v48, v11

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v11

    move/from16 v49, v8

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v8

    move/from16 v50, v6

    invoke-virtual {v15}, Lcom/daaw/ik5;->G()S

    move-result v6

    invoke-virtual {v15}, Lcom/daaw/ik5;->A()J

    move-result-wide v51

    invoke-virtual {v15}, Lcom/daaw/ik5;->A()J

    move-result-wide v53

    move/from16 v55, v5

    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v3, 0x2710

    div-long v3, v51, v3

    long-to-int v4, v3

    int-to-short v3, v4

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v3, 0x2710

    div-long v3, v53, v3

    long-to-int v4, v3

    int-to-short v3, v4

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v25, v1

    :goto_26
    move/from16 v4, v46

    move-object/from16 v11, v48

    :goto_27
    move/from16 v8, v49

    goto/16 :goto_25

    :cond_38
    move/from16 v45, v3

    move/from16 v46, v4

    move/from16 v55, v5

    move/from16 v50, v6

    move/from16 v49, v8

    move-object/from16 v47, v9

    move-object/from16 v48, v11

    const v3, 0x64323633

    if-ne v1, v3, :cond_3a

    if-nez v7, :cond_39

    const/4 v1, 0x1

    goto :goto_28

    :cond_39
    const/4 v1, 0x0

    :goto_28
    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    const-string v1, "video/3gpp"

    move-object v7, v1

    goto :goto_26

    :cond_3a
    const/4 v3, 0x0

    const v4, 0x65736473

    if-ne v1, v4, :cond_3d

    if-nez v7, :cond_3b

    const/4 v1, 0x1

    goto :goto_29

    :cond_3b
    const/4 v1, 0x0

    :goto_29
    invoke-static {v1, v3}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    invoke-static {v15, v12}, Lcom/daaw/r92;->k(Lcom/daaw/ik5;I)Lcom/daaw/l92;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/l92;->c(Lcom/daaw/l92;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Lcom/daaw/l92;->d(Lcom/daaw/l92;)[B

    move-result-object v4

    if-eqz v4, :cond_3c

    invoke-static {v4}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v12

    goto :goto_2a

    :cond_3c
    move-object/from16 v12, v37

    :goto_2a
    move-object/from16 v26, v1

    move-object v7, v3

    move-object/from16 v37, v12

    goto :goto_26

    :cond_3d
    const v3, 0x70617370

    if-ne v1, v3, :cond_3e

    add-int/lit8 v12, v12, 0x8

    invoke-virtual {v15, v12}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v15}, Lcom/daaw/ik5;->v()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v15}, Lcom/daaw/ik5;->v()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v1, v3

    move v8, v1

    move-object/from16 v11, v48

    const/4 v3, 0x2

    const/4 v4, 0x1

    goto/16 :goto_35

    :cond_3e
    const v3, 0x73763364

    if-ne v1, v3, :cond_41

    add-int/lit8 v1, v12, 0x8

    :goto_2b
    sub-int v3, v1, v12

    if-ge v3, v10, :cond_40

    invoke-virtual {v15, v1}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v15}, Lcom/daaw/ik5;->m()I

    move-result v3

    invoke-virtual {v15}, Lcom/daaw/ik5;->m()I

    move-result v4

    const v5, 0x70726f6a

    if-ne v4, v5, :cond_3f

    invoke-virtual {v15}, Lcom/daaw/ik5;->h()[B

    move-result-object v4

    add-int/2addr v3, v1

    invoke-static {v4, v1, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v8

    goto :goto_2c

    :cond_3f
    add-int/2addr v1, v3

    goto :goto_2b

    :cond_40
    const/4 v8, 0x0

    :goto_2c
    move-object v11, v8

    move/from16 v4, v46

    goto/16 :goto_27

    :cond_41
    const v3, 0x73743364

    if-ne v1, v3, :cond_47

    invoke-virtual {v15}, Lcom/daaw/ik5;->s()I

    move-result v1

    const/4 v4, 0x3

    invoke-virtual {v15, v4}, Lcom/daaw/ik5;->g(I)V

    if-nez v1, :cond_45

    invoke-virtual {v15}, Lcom/daaw/ik5;->s()I

    move-result v1

    if-eqz v1, :cond_44

    const/4 v3, 0x1

    if-eq v1, v3, :cond_43

    const/4 v3, 0x2

    if-eq v1, v3, :cond_42

    if-eq v1, v4, :cond_46

    goto :goto_2d

    :cond_42
    const/4 v4, 0x2

    goto :goto_2e

    :cond_43
    const/4 v3, 0x2

    const/4 v4, 0x1

    goto :goto_2e

    :cond_44
    const/4 v3, 0x2

    const/4 v4, 0x0

    goto :goto_2e

    :cond_45
    const/4 v3, 0x2

    :goto_2d
    move/from16 v4, v39

    :cond_46
    :goto_2e
    move/from16 v39, v4

    goto/16 :goto_34

    :cond_47
    const/4 v3, 0x2

    const v4, 0x636f6c72

    if-ne v1, v4, :cond_4e

    invoke-virtual {v15}, Lcom/daaw/ik5;->m()I

    move-result v1

    const v4, 0x6e636c78

    if-eq v1, v4, :cond_49

    const v4, 0x6e636c63

    if-ne v1, v4, :cond_48

    goto :goto_2f

    :cond_48
    invoke-static {v1}, Lcom/daaw/c92;->b(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "Unsupported color type: "

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_34

    :cond_49
    :goto_2f
    invoke-virtual {v15}, Lcom/daaw/ik5;->w()I

    move-result v1

    invoke-virtual {v15}, Lcom/daaw/ik5;->w()I

    move-result v4

    invoke-virtual {v15, v3}, Lcom/daaw/ik5;->g(I)V

    const/16 v5, 0x13

    if-ne v10, v5, :cond_4b

    invoke-virtual {v15}, Lcom/daaw/ik5;->s()I

    move-result v6

    and-int/lit16 v6, v6, 0x80

    if-eqz v6, :cond_4a

    const/4 v5, 0x1

    goto :goto_30

    :cond_4a
    const/4 v5, 0x0

    :goto_30
    const/16 v10, 0x13

    goto :goto_31

    :cond_4b
    const/4 v5, 0x0

    :goto_31
    invoke-static {v1}, Lcom/daaw/mo8;->a(I)I

    move-result v1

    const/4 v6, 0x1

    if-eq v6, v5, :cond_4c

    const/4 v5, 0x2

    goto :goto_32

    :cond_4c
    const/4 v5, 0x1

    :goto_32
    invoke-static {v4}, Lcom/daaw/mo8;->b(I)I

    move-result v4

    move/from16 v23, v1

    move/from16 v20, v4

    move/from16 v22, v5

    goto :goto_34

    :cond_4d
    :goto_33
    move/from16 v45, v3

    move/from16 v46, v4

    move/from16 v55, v5

    move/from16 v50, v6

    move/from16 v49, v8

    move-object/from16 v47, v9

    move-object/from16 v48, v11

    const/4 v3, 0x2

    invoke-static {v15}, Lcom/daaw/f09;->a(Lcom/daaw/ik5;)Lcom/daaw/f09;

    move-result-object v1

    if-eqz v1, :cond_4e

    iget-object v2, v1, Lcom/daaw/f09;->a:Ljava/lang/String;

    const-string v7, "video/dolby-vision"

    :cond_4e
    :goto_34
    move/from16 v4, v46

    move-object/from16 v11, v48

    move/from16 v8, v49

    :goto_35
    add-int/2addr v0, v10

    move/from16 v1, v38

    move/from16 v10, v39

    move/from16 v13, v40

    move/from16 v3, v45

    move-object/from16 v9, v47

    move/from16 v6, v50

    move/from16 v5, v55

    goto/16 :goto_1b

    :cond_4f
    move/from16 v38, v1

    move/from16 v55, v5

    move/from16 v50, v6

    move/from16 v49, v8

    move-object/from16 v47, v9

    move/from16 v39, v10

    :goto_36
    move-object/from16 v48, v11

    move/from16 v40, v13

    const/4 v3, 0x2

    if-nez v7, :cond_50

    move/from16 v2, v30

    move/from16 v1, v43

    move-object/from16 v4, v47

    const/4 v5, -0x1

    goto/16 :goto_39

    :cond_50
    new-instance v0, Lcom/daaw/b72;

    invoke-direct {v0}, Lcom/daaw/b72;-><init>()V

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->g(I)Lcom/daaw/b72;

    invoke-virtual {v0, v7}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0, v2}, Lcom/daaw/b72;->f0(Ljava/lang/String;)Lcom/daaw/b72;

    move/from16 v2, v55

    invoke-virtual {v0, v2}, Lcom/daaw/b72;->x(I)Lcom/daaw/b72;

    move/from16 v2, v50

    invoke-virtual {v0, v2}, Lcom/daaw/b72;->f(I)Lcom/daaw/b72;

    move/from16 v8, v49

    invoke-virtual {v0, v8}, Lcom/daaw/b72;->p(F)Lcom/daaw/b72;

    move/from16 v2, v30

    invoke-virtual {v0, v2}, Lcom/daaw/b72;->r(I)Lcom/daaw/b72;

    move-object/from16 v11, v48

    invoke-virtual {v0, v11}, Lcom/daaw/b72;->q([B)Lcom/daaw/b72;

    move/from16 v4, v39

    invoke-virtual {v0, v4}, Lcom/daaw/b72;->v(I)Lcom/daaw/b72;

    move-object/from16 v4, v37

    invoke-virtual {v0, v4}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    move-object/from16 v8, v36

    invoke-virtual {v0, v8}, Lcom/daaw/b72;->b(Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/b72;

    move/from16 v4, v23

    const/4 v5, -0x1

    if-ne v4, v5, :cond_51

    move/from16 v6, v22

    move/from16 v7, v20

    if-ne v6, v5, :cond_52

    if-ne v7, v5, :cond_52

    if-eqz v25, :cond_54

    goto :goto_37

    :cond_51
    move/from16 v7, v20

    move/from16 v6, v22

    :cond_52
    :goto_37
    new-instance v8, Lcom/daaw/mo8;

    if-eqz v25, :cond_53

    invoke-virtual/range {v25 .. v25}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    goto :goto_38

    :cond_53
    const/4 v9, 0x0

    :goto_38
    invoke-direct {v8, v4, v6, v7, v9}, Lcom/daaw/mo8;-><init>(III[B)V

    invoke-virtual {v0, v8}, Lcom/daaw/b72;->g0(Lcom/daaw/mo8;)Lcom/daaw/b72;

    :cond_54
    if-eqz v26, :cond_55

    invoke-static/range {v26 .. v26}, Lcom/daaw/l92;->a(Lcom/daaw/l92;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/daaw/i47;->c(J)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/daaw/b72;->d0(I)Lcom/daaw/b72;

    invoke-static/range {v26 .. v26}, Lcom/daaw/l92;->b(Lcom/daaw/l92;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/daaw/i47;->c(J)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/daaw/b72;->o(I)Lcom/daaw/b72;

    :cond_55
    invoke-virtual {v0}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v0

    move-object/from16 v4, v47

    iput-object v0, v4, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    :goto_39
    add-int v13, v40, v38

    invoke-virtual {v15, v13}, Lcom/daaw/ik5;->f(I)V

    add-int/lit8 v0, v17, 0x1

    move-object/from16 v12, p4

    move v7, v1

    move v6, v2

    move-object v2, v4

    move-object/from16 v25, v14

    move-object v10, v15

    move-object/from16 v5, v16

    move/from16 v9, v18

    move-object/from16 v15, v19

    move-object/from16 v14, v21

    move/from16 v3, v24

    move-object/from16 v13, v32

    move-object/from16 v11, v44

    const/16 v4, 0xc

    const v8, 0x7374626c

    move-object/from16 v1, p1

    goto/16 :goto_e

    :cond_56
    move-object v4, v2

    move/from16 v18, v9

    move-object/from16 v44, v11

    move-object/from16 v32, v13

    move-object/from16 v21, v14

    move-object/from16 v19, v15

    move-object/from16 v14, v25

    const/4 v3, 0x2

    const/4 v5, -0x1

    const v0, 0x65647473

    move-object/from16 v2, v44

    invoke-virtual {v2, v0}, Lcom/daaw/a92;->c(I)Lcom/daaw/a92;

    move-result-object v0

    if-eqz v0, :cond_57

    invoke-static {v0}, Lcom/daaw/r92;->h(Lcom/daaw/a92;)Landroid/util/Pair;

    move-result-object v0

    if-eqz v0, :cond_57

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, [J

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, [J

    move-object/from16 v30, v0

    goto :goto_3a

    :cond_57
    const/4 v1, 0x0

    const/16 v30, 0x0

    :goto_3a
    iget-object v0, v4, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    if-nez v0, :cond_58

    move-object/from16 v0, p7

    goto/16 :goto_1

    :cond_58
    new-instance v8, Lcom/daaw/ha2;

    invoke-static/range {v21 .. v21}, Lcom/daaw/q92;->a(Lcom/daaw/q92;)I

    move-result v17

    move-object/from16 v0, v19

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v19

    iget-object v0, v4, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    iget v6, v4, Lcom/daaw/n92;->d:I

    iget-object v7, v4, Lcom/daaw/n92;->a:[Lcom/daaw/ia2;

    iget v4, v4, Lcom/daaw/n92;->c:I

    move-object/from16 v16, v8

    move-wide/from16 v21, v41

    move-wide/from16 v23, v28

    move-object/from16 v25, v0

    move/from16 v26, v6

    move-object/from16 v27, v7

    move/from16 v28, v4

    move-object/from16 v29, v1

    invoke-direct/range {v16 .. v30}, Lcom/daaw/ha2;-><init>(IIJJJLcom/daaw/f92;I[Lcom/daaw/ia2;I[J[J)V

    move-object/from16 v0, p7

    :goto_3b
    invoke-interface {v0, v8}, Lcom/daaw/ey6;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ha2;

    if-eqz v1, :cond_93

    const v4, 0x6d646961

    invoke-virtual {v2, v4}, Lcom/daaw/a92;->c(I)Lcom/daaw/a92;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x6d696e66

    invoke-virtual {v2, v4}, Lcom/daaw/a92;->c(I)Lcom/daaw/a92;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7374626c

    invoke-virtual {v2, v4}, Lcom/daaw/a92;->c(I)Lcom/daaw/a92;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7374737a

    invoke-virtual {v2, v4}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v4

    if-eqz v4, :cond_59

    new-instance v6, Lcom/daaw/o92;

    iget-object v7, v1, Lcom/daaw/ha2;->f:Lcom/daaw/f92;

    invoke-direct {v6, v4, v7}, Lcom/daaw/o92;-><init>(Lcom/daaw/b92;Lcom/daaw/f92;)V

    goto :goto_3c

    :cond_59
    const v4, 0x73747a32

    invoke-virtual {v2, v4}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v4

    if-eqz v4, :cond_92

    new-instance v6, Lcom/daaw/p92;

    invoke-direct {v6, v4}, Lcom/daaw/p92;-><init>(Lcom/daaw/b92;)V

    :goto_3c
    invoke-interface {v6}, Lcom/daaw/m92;->zzb()I

    move-result v4

    if-nez v4, :cond_5a

    new-instance v2, Lcom/daaw/ka2;

    const/4 v3, 0x0

    new-array v4, v3, [J

    new-array v5, v3, [I

    const/16 v19, 0x0

    new-array v6, v3, [J

    new-array v7, v3, [I

    const-wide/16 v22, 0x0

    move-object v15, v2

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    invoke-direct/range {v15 .. v23}, Lcom/daaw/ka2;-><init>(Lcom/daaw/ha2;[J[II[J[IJ)V

    :goto_3d
    move-object/from16 v0, v32

    goto/16 :goto_66

    :cond_5a
    const v7, 0x7374636f

    invoke-virtual {v2, v7}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v7

    if-nez v7, :cond_5b

    const v7, 0x636f3634

    invoke-virtual {v2, v7}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v8, v7

    const/4 v7, 0x1

    goto :goto_3e

    :cond_5b
    move-object v8, v7

    const/4 v7, 0x0

    :goto_3e
    iget-object v8, v8, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    const v9, 0x73747363

    invoke-virtual {v2, v9}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v9

    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v9, v9, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    const v10, 0x73747473

    invoke-virtual {v2, v10}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v10, v10, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    const v11, 0x73747373

    invoke-virtual {v2, v11}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v11

    if-eqz v11, :cond_5c

    iget-object v11, v11, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    goto :goto_3f

    :cond_5c
    const/4 v11, 0x0

    :goto_3f
    const v12, 0x63747473

    invoke-virtual {v2, v12}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v2

    if-eqz v2, :cond_5d

    iget-object v2, v2, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    goto :goto_40

    :cond_5d
    const/4 v2, 0x0

    :goto_40
    new-instance v12, Lcom/daaw/d92;

    invoke-direct {v12, v9, v8, v7}, Lcom/daaw/d92;-><init>(Lcom/daaw/ik5;Lcom/daaw/ik5;Z)V

    const/16 v7, 0xc

    invoke-virtual {v10, v7}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v10}, Lcom/daaw/ik5;->v()I

    move-result v8

    add-int/2addr v8, v5

    invoke-virtual {v10}, Lcom/daaw/ik5;->v()I

    move-result v9

    invoke-virtual {v10}, Lcom/daaw/ik5;->v()I

    move-result v13

    if-eqz v2, :cond_5e

    invoke-virtual {v2, v7}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v2}, Lcom/daaw/ik5;->v()I

    move-result v15

    goto :goto_41

    :cond_5e
    const/4 v15, 0x0

    :goto_41
    if-eqz v11, :cond_60

    invoke-virtual {v11, v7}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v11}, Lcom/daaw/ik5;->v()I

    move-result v7

    if-lez v7, :cond_5f

    invoke-virtual {v11}, Lcom/daaw/ik5;->v()I

    move-result v16

    add-int/lit8 v16, v16, -0x1

    goto :goto_43

    :cond_5f
    const/4 v11, 0x0

    goto :goto_42

    :cond_60
    const/4 v7, 0x0

    :goto_42
    const/16 v16, -0x1

    :goto_43
    invoke-interface {v6}, Lcom/daaw/m92;->zza()I

    move-result v3

    iget-object v0, v1, Lcom/daaw/ha2;->f:Lcom/daaw/f92;

    iget-object v0, v0, Lcom/daaw/f92;->l:Ljava/lang/String;

    if-eq v3, v5, :cond_67

    const-string v5, "audio/raw"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_61

    const-string v5, "audio/g711-mlaw"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_61

    const-string v5, "audio/g711-alaw"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_67

    :cond_61
    if-nez v8, :cond_67

    if-nez v15, :cond_66

    if-nez v7, :cond_66

    iget v0, v12, Lcom/daaw/d92;->a:I

    new-array v2, v0, [J

    new-array v5, v0, [I

    :goto_44
    invoke-virtual {v12}, Lcom/daaw/d92;->a()Z

    move-result v6

    if-eqz v6, :cond_62

    iget v6, v12, Lcom/daaw/d92;->b:I

    iget-wide v7, v12, Lcom/daaw/d92;->d:J

    aput-wide v7, v2, v6

    iget v7, v12, Lcom/daaw/d92;->c:I

    aput v7, v5, v6

    goto :goto_44

    :cond_62
    int-to-long v6, v13

    const/16 v8, 0x2000

    div-int/2addr v8, v3

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_45
    if-ge v9, v0, :cond_63

    aget v11, v5, v9

    invoke-static {v11, v8}, Lcom/daaw/it5;->O(II)I

    move-result v11

    add-int/2addr v10, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_45

    :cond_63
    new-array v9, v10, [J

    new-array v11, v10, [I

    new-array v12, v10, [J

    new-array v10, v10, [I

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_46
    if-ge v13, v0, :cond_65

    aget v17, v5, v13

    aget-wide v20, v2, v13

    move/from16 v56, v17

    move/from16 v17, v0

    move/from16 v0, v56

    :goto_47
    if-lez v0, :cond_64

    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v18

    aput-wide v20, v9, v16

    move-object/from16 v22, v2

    mul-int v2, v3, v18

    aput v2, v11, v16

    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v15

    move/from16 v23, v3

    int-to-long v2, v14

    mul-long v2, v2, v6

    aput-wide v2, v12, v16

    const/4 v2, 0x1

    aput v2, v10, v16

    aget v2, v11, v16

    int-to-long v2, v2

    add-long v20, v20, v2

    add-int v14, v14, v18

    sub-int v0, v0, v18

    add-int/lit8 v16, v16, 0x1

    move-object/from16 v2, v22

    move/from16 v3, v23

    goto :goto_47

    :cond_64
    move-object/from16 v22, v2

    move/from16 v23, v3

    add-int/lit8 v13, v13, 0x1

    move/from16 v0, v17

    goto :goto_46

    :cond_65
    int-to-long v2, v14

    mul-long v6, v6, v2

    move-object v2, v9

    move-object v14, v10

    move-object v3, v11

    move-object v13, v12

    move v12, v15

    move-object v15, v1

    move-wide v0, v6

    goto/16 :goto_56

    :cond_66
    const/4 v8, 0x0

    :cond_67
    new-array v0, v4, [J

    new-array v3, v4, [I

    new-array v5, v4, [J

    move/from16 v17, v7

    new-array v7, v4, [I

    move-object/from16 v22, v1

    move/from16 v18, v9

    move v1, v13

    move/from16 v23, v15

    move/from16 v15, v16

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    move/from16 v16, v8

    const/4 v8, 0x0

    :goto_48
    if-ge v8, v4, :cond_73

    move-wide/from16 v29, v25

    const/16 v25, 0x1

    :goto_49
    if-nez v20, :cond_69

    invoke-virtual {v12}, Lcom/daaw/d92;->a()Z

    move-result v25

    if-eqz v25, :cond_68

    move-object/from16 v26, v10

    move-object/from16 v36, v11

    iget-wide v10, v12, Lcom/daaw/d92;->d:J

    move/from16 v37, v4

    iget v4, v12, Lcom/daaw/d92;->c:I

    move/from16 v20, v4

    move-wide/from16 v29, v10

    move-object/from16 v10, v26

    move-object/from16 v11, v36

    move/from16 v4, v37

    goto :goto_49

    :cond_68
    move/from16 v37, v4

    move-object/from16 v26, v10

    move-object/from16 v36, v11

    const/4 v4, 0x0

    goto :goto_4a

    :cond_69
    move/from16 v37, v4

    move-object/from16 v26, v10

    move-object/from16 v36, v11

    move/from16 v4, v20

    :goto_4a
    if-nez v25, :cond_6a

    const-string v1, "Unexpected end of chunk data"

    invoke-static {v14, v1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    invoke-static {v5, v8}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v5

    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v7

    move v4, v8

    goto/16 :goto_4f

    :cond_6a
    if-eqz v2, :cond_6d

    :goto_4b
    if-nez v24, :cond_6c

    if-lez v23, :cond_6b

    invoke-virtual {v2}, Lcom/daaw/ik5;->v()I

    move-result v24

    invoke-virtual {v2}, Lcom/daaw/ik5;->m()I

    move-result v13

    add-int/lit8 v23, v23, -0x1

    goto :goto_4b

    :cond_6b
    const/4 v10, -0x1

    const/16 v24, 0x0

    goto :goto_4c

    :cond_6c
    const/4 v10, -0x1

    :goto_4c
    add-int/lit8 v24, v24, -0x1

    :cond_6d
    aput-wide v29, v0, v8

    invoke-interface {v6}, Lcom/daaw/m92;->zzc()I

    move-result v10

    aput v10, v3, v8

    if-le v10, v9, :cond_6e

    move v9, v10

    :cond_6e
    int-to-long v10, v13

    add-long v10, v27, v10

    aput-wide v10, v5, v8

    if-nez v36, :cond_6f

    const/4 v10, 0x1

    goto :goto_4d

    :cond_6f
    const/4 v10, 0x0

    :goto_4d
    aput v10, v7, v8

    if-ne v8, v15, :cond_70

    const/4 v10, 0x1

    aput v10, v7, v8

    add-int/lit8 v17, v17, -0x1

    if-lez v17, :cond_70

    invoke-static/range {v36 .. v36}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {v36 .. v36}, Lcom/daaw/ik5;->v()I

    move-result v10

    const/4 v11, -0x1

    add-int/2addr v10, v11

    move v15, v10

    :cond_70
    int-to-long v10, v1

    add-long v27, v27, v10

    add-int/lit8 v10, v18, -0x1

    if-nez v10, :cond_72

    if-lez v16, :cond_71

    invoke-virtual/range {v26 .. v26}, Lcom/daaw/ik5;->v()I

    move-result v1

    invoke-virtual/range {v26 .. v26}, Lcom/daaw/ik5;->m()I

    move-result v10

    add-int/lit8 v16, v16, -0x1

    move/from16 v18, v1

    move v1, v10

    goto :goto_4e

    :cond_71
    const/16 v18, 0x0

    goto :goto_4e

    :cond_72
    move/from16 v18, v10

    :goto_4e
    aget v10, v3, v8

    int-to-long v10, v10

    add-long v10, v29, v10

    const/16 v21, -0x1

    add-int/lit8 v20, v4, -0x1

    add-int/lit8 v8, v8, 0x1

    move/from16 v4, v37

    move-wide/from16 v56, v10

    move-object/from16 v10, v26

    move-wide/from16 v25, v56

    move-object/from16 v11, v36

    goto/16 :goto_48

    :cond_73
    move/from16 v37, v4

    :goto_4f
    int-to-long v10, v13

    add-long v10, v27, v10

    if-eqz v2, :cond_75

    :goto_50
    if-lez v23, :cond_75

    invoke-virtual {v2}, Lcom/daaw/ik5;->v()I

    move-result v1

    if-eqz v1, :cond_74

    const/4 v1, 0x0

    goto :goto_51

    :cond_74
    invoke-virtual {v2}, Lcom/daaw/ik5;->m()I

    add-int/lit8 v23, v23, -0x1

    goto :goto_50

    :cond_75
    const/4 v1, 0x1

    :goto_51
    if-nez v17, :cond_7b

    if-nez v18, :cond_7a

    if-nez v20, :cond_79

    if-nez v16, :cond_78

    move-object/from16 v16, v0

    if-nez v24, :cond_77

    if-nez v1, :cond_76

    move-object/from16 v15, v22

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_53

    :cond_76
    move-object/from16 v17, v3

    move/from16 v18, v4

    move-object/from16 v15, v22

    goto/16 :goto_55

    :cond_77
    move-object/from16 v15, v22

    move/from16 v13, v24

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    goto :goto_53

    :cond_78
    move/from16 v12, v16

    move-object/from16 v15, v22

    move/from16 v13, v24

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    goto :goto_52

    :cond_79
    move/from16 v12, v16

    move/from16 v8, v20

    move-object/from16 v15, v22

    move/from16 v13, v24

    const/4 v2, 0x0

    const/4 v6, 0x0

    goto :goto_52

    :cond_7a
    move/from16 v12, v16

    move/from16 v6, v18

    move/from16 v8, v20

    move-object/from16 v15, v22

    move/from16 v13, v24

    const/4 v2, 0x0

    goto :goto_52

    :cond_7b
    move/from16 v12, v16

    move/from16 v2, v17

    move/from16 v6, v18

    move/from16 v8, v20

    move-object/from16 v15, v22

    move/from16 v13, v24

    :goto_52
    move-object/from16 v16, v0

    :goto_53
    iget v0, v15, Lcom/daaw/ha2;->a:I

    move-object/from16 v17, v3

    const/4 v3, 0x1

    if-eq v3, v1, :cond_7c

    const-string v1, ", ctts invalid"

    goto :goto_54

    :cond_7c
    const-string v1, ""

    :goto_54
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v18, v4

    const-string v4, "Inconsistent stbl box for track "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ": remainingSynchronizationSamples "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingSamplesAtTimestampDelta "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingSamplesInChunk "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingTimestampDeltaChanges "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingSamplesAtTimestampOffset "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_55
    move-object v13, v5

    move-object v14, v7

    move v12, v9

    move-wide v0, v10

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    move/from16 v4, v18

    :goto_56
    const-wide/32 v7, 0xf4240

    iget-wide v9, v15, Lcom/daaw/ha2;->c:J

    move-wide v5, v0

    invoke-static/range {v5 .. v10}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v22

    iget-object v5, v15, Lcom/daaw/ha2;->h:[J

    if-nez v5, :cond_7d

    const-wide/32 v0, 0xf4240

    iget-wide v4, v15, Lcom/daaw/ha2;->c:J

    invoke-static {v13, v0, v1, v4, v5}, Lcom/daaw/it5;->r([JJJ)V

    new-instance v0, Lcom/daaw/ka2;

    move-object v10, v15

    move-object v15, v0

    move-object/from16 v16, v10

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move/from16 v19, v12

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    invoke-direct/range {v15 .. v23}, Lcom/daaw/ka2;-><init>(Lcom/daaw/ha2;[J[II[J[IJ)V

    :goto_57
    move-object v2, v0

    goto/16 :goto_3d

    :cond_7d
    move-object v10, v15

    array-length v6, v5

    const/4 v7, 0x1

    if-ne v6, v7, :cond_80

    iget v6, v10, Lcom/daaw/ha2;->b:I

    if-ne v6, v7, :cond_80

    array-length v6, v13

    const/4 v7, 0x2

    if-lt v6, v7, :cond_80

    iget-object v6, v10, Lcom/daaw/ha2;->i:[J

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v7, 0x0

    aget-wide v15, v6, v7

    aget-wide v17, v5, v7

    iget-wide v5, v10, Lcom/daaw/ha2;->c:J

    iget-wide v7, v10, Lcom/daaw/ha2;->d:J

    move-wide/from16 v19, v5

    move-wide/from16 v21, v7

    invoke-static/range {v17 .. v22}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v5

    add-long v17, v15, v5

    move-object v5, v13

    move-wide v6, v0

    move-wide v8, v15

    move/from16 v19, v4

    move-object v4, v10

    move-wide/from16 v10, v17

    invoke-static/range {v5 .. v11}, Lcom/daaw/r92;->o([JJJJ)Z

    move-result v5

    if-eqz v5, :cond_7f

    const/4 v5, 0x0

    aget-wide v6, v13, v5

    sub-long v20, v15, v6

    iget-object v5, v4, Lcom/daaw/ha2;->f:Lcom/daaw/f92;

    iget v5, v5, Lcom/daaw/f92;->z:I

    int-to-long v5, v5

    iget-wide v7, v4, Lcom/daaw/ha2;->c:J

    move-wide/from16 v22, v5

    move-wide/from16 v24, v7

    invoke-static/range {v20 .. v25}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v5

    sub-long v20, v0, v17

    iget-object v7, v4, Lcom/daaw/ha2;->f:Lcom/daaw/f92;

    iget v7, v7, Lcom/daaw/f92;->z:I

    int-to-long v7, v7

    iget-wide v9, v4, Lcom/daaw/ha2;->c:J

    move-wide/from16 v22, v7

    move-wide/from16 v24, v9

    invoke-static/range {v20 .. v25}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v11, v5, v9

    if-nez v11, :cond_7e

    cmp-long v5, v7, v9

    if-eqz v5, :cond_7f

    const-wide/16 v5, 0x0

    :cond_7e
    const-wide/32 v9, 0x7fffffff

    cmp-long v11, v5, v9

    if-gtz v11, :cond_7f

    const-wide/32 v9, 0x7fffffff

    cmp-long v11, v7, v9

    if-gtz v11, :cond_7f

    long-to-int v0, v5

    move-object/from16 v5, p1

    iput v0, v5, Lcom/daaw/y09;->a:I

    long-to-int v0, v7

    iput v0, v5, Lcom/daaw/y09;->b:I

    const-wide/32 v0, 0xf4240

    iget-wide v6, v4, Lcom/daaw/ha2;->c:J

    invoke-static {v13, v0, v1, v6, v7}, Lcom/daaw/it5;->r([JJJ)V

    iget-object v0, v4, Lcom/daaw/ha2;->h:[J

    const/4 v1, 0x0

    aget-wide v6, v0, v1

    iget-wide v10, v4, Lcom/daaw/ha2;->d:J

    const-wide/32 v8, 0xf4240

    invoke-static/range {v6 .. v11}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v22

    new-instance v0, Lcom/daaw/ka2;

    move-object v15, v0

    move-object/from16 v16, v4

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move/from16 v19, v12

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    invoke-direct/range {v15 .. v23}, Lcom/daaw/ka2;-><init>(Lcom/daaw/ha2;[J[II[J[IJ)V

    goto/16 :goto_57

    :cond_7f
    move-object/from16 v5, p1

    goto :goto_58

    :cond_80
    move-object/from16 v5, p1

    move/from16 v19, v4

    move-object v4, v10

    :goto_58
    iget-object v6, v4, Lcom/daaw/ha2;->h:[J

    array-length v7, v6

    const/4 v8, 0x1

    if-ne v7, v8, :cond_83

    const/4 v8, 0x0

    aget-wide v9, v6, v8

    const-wide/16 v6, 0x0

    cmp-long v11, v9, v6

    if-nez v11, :cond_82

    iget-object v6, v4, Lcom/daaw/ha2;->i:[J

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    aget-wide v9, v6, v8

    const/4 v8, 0x0

    :goto_59
    array-length v6, v13

    if-ge v8, v6, :cond_81

    aget-wide v6, v13, v8

    sub-long v15, v6, v9

    const-wide/32 v17, 0xf4240

    iget-wide v6, v4, Lcom/daaw/ha2;->c:J

    move-wide/from16 v19, v6

    invoke-static/range {v15 .. v20}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v6

    aput-wide v6, v13, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_59

    :cond_81
    iget-wide v6, v4, Lcom/daaw/ha2;->c:J

    sub-long v15, v0, v9

    const-wide/32 v17, 0xf4240

    move-wide/from16 v19, v6

    invoke-static/range {v15 .. v20}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v22

    new-instance v0, Lcom/daaw/ka2;

    move-object v15, v0

    move-object/from16 v16, v4

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move/from16 v19, v12

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    invoke-direct/range {v15 .. v23}, Lcom/daaw/ka2;-><init>(Lcom/daaw/ha2;[J[II[J[IJ)V

    goto/16 :goto_57

    :cond_82
    const/4 v7, 0x1

    :cond_83
    iget v0, v4, Lcom/daaw/ha2;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_84

    const/4 v0, 0x1

    goto :goto_5a

    :cond_84
    const/4 v0, 0x0

    :goto_5a
    new-array v1, v7, [I

    new-array v6, v7, [I

    iget-object v7, v4, Lcom/daaw/ha2;->i:[J

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_5b
    iget-object v15, v4, Lcom/daaw/ha2;->h:[J

    array-length v5, v15

    if-ge v8, v5, :cond_88

    move-object v5, v2

    move-object/from16 v16, v3

    aget-wide v2, v7, v8

    const-wide/16 v17, -0x1

    cmp-long v20, v2, v17

    if-eqz v20, :cond_87

    aget-wide v21, v15, v8

    move/from16 v17, v11

    move v15, v12

    iget-wide v11, v4, Lcom/daaw/ha2;->c:J

    move/from16 v18, v9

    move/from16 v20, v10

    iget-wide v9, v4, Lcom/daaw/ha2;->d:J

    move-wide/from16 v23, v11

    move-wide/from16 v25, v9

    invoke-static/range {v21 .. v26}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v9

    const/4 v11, 0x1

    invoke-static {v13, v2, v3, v11, v11}, Lcom/daaw/it5;->N([JJZZ)I

    move-result v12

    aput v12, v1, v8

    add-long/2addr v2, v9

    const/4 v9, 0x0

    invoke-static {v13, v2, v3, v0, v9}, Lcom/daaw/it5;->L([JJZZ)I

    move-result v2

    aput v2, v6, v8

    :goto_5c
    aget v2, v1, v8

    aget v3, v6, v8

    if-ge v2, v3, :cond_85

    aget v10, v14, v2

    and-int/2addr v10, v11

    if-nez v10, :cond_85

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v8

    const/4 v11, 0x1

    goto :goto_5c

    :cond_85
    sub-int v10, v3, v2

    add-int v10, v18, v10

    move/from16 v11, v20

    if-eq v11, v2, :cond_86

    const/4 v2, 0x1

    goto :goto_5d

    :cond_86
    const/4 v2, 0x0

    :goto_5d
    or-int v2, v17, v2

    move/from16 v17, v2

    move v11, v3

    goto :goto_5e

    :cond_87
    move/from16 v18, v9

    move/from16 v17, v11

    move v15, v12

    const/4 v9, 0x0

    move v11, v10

    move/from16 v10, v18

    :goto_5e
    add-int/lit8 v8, v8, 0x1

    move-object v2, v5

    move v9, v10

    move v10, v11

    move v12, v15

    move-object/from16 v3, v16

    move/from16 v11, v17

    move-object/from16 v5, p1

    goto :goto_5b

    :cond_88
    move-object v5, v2

    move-object/from16 v16, v3

    move v10, v9

    move/from16 v17, v11

    move v15, v12

    move/from16 v2, v19

    const/4 v9, 0x0

    if-eq v10, v2, :cond_89

    const/4 v7, 0x1

    goto :goto_5f

    :cond_89
    const/4 v7, 0x0

    :goto_5f
    or-int v0, v17, v7

    if-eqz v0, :cond_8a

    new-array v2, v10, [J

    goto :goto_60

    :cond_8a
    move-object v2, v5

    :goto_60
    if-eqz v0, :cond_8b

    new-array v3, v10, [I

    goto :goto_61

    :cond_8b
    move-object/from16 v3, v16

    :goto_61
    const/4 v7, 0x1

    if-ne v7, v0, :cond_8c

    const/4 v8, 0x0

    goto :goto_62

    :cond_8c
    move v8, v15

    :goto_62
    if-eqz v0, :cond_8d

    new-array v7, v10, [I

    goto :goto_63

    :cond_8d
    move-object v7, v14

    :goto_63
    new-array v10, v10, [J

    move v12, v8

    const/4 v8, 0x0

    const/4 v11, 0x0

    const-wide/16 v23, 0x0

    :goto_64
    iget-object v15, v4, Lcom/daaw/ha2;->h:[J

    array-length v15, v15

    if-ge v8, v15, :cond_91

    iget-object v15, v4, Lcom/daaw/ha2;->i:[J

    aget-wide v25, v15, v8

    aget v15, v1, v8

    aget v9, v6, v8

    move-object/from16 v27, v1

    if-eqz v0, :cond_8e

    sub-int v1, v9, v15

    invoke-static {v5, v15, v2, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v28, v5

    move-object/from16 v5, v16

    invoke-static {v5, v15, v3, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v14, v15, v7, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_65

    :cond_8e
    move-object/from16 v28, v5

    move-object/from16 v5, v16

    :goto_65
    if-ge v15, v9, :cond_90

    const-wide/32 v19, 0xf4240

    move-object v1, v6

    move-object/from16 v29, v7

    iget-wide v6, v4, Lcom/daaw/ha2;->d:J

    move-wide/from16 v17, v23

    move-wide/from16 v21, v6

    invoke-static/range {v17 .. v22}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v6

    aget-wide v16, v13, v15

    move-object/from16 v18, v13

    move-object/from16 v19, v14

    sub-long v13, v16, v25

    move-object/from16 v16, v1

    move-object/from16 v30, v2

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v33

    const-wide/32 v35, 0xf4240

    iget-wide v13, v4, Lcom/daaw/ha2;->c:J

    move-wide/from16 v37, v13

    invoke-static/range {v33 .. v38}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v13

    add-long/2addr v6, v13

    aput-wide v6, v10, v11

    if-eqz v0, :cond_8f

    aget v6, v3, v11

    if-le v6, v12, :cond_8f

    aget v6, v5, v15

    move v12, v6

    :cond_8f
    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v6, v16

    move-object/from16 v13, v18

    move-object/from16 v14, v19

    move-object/from16 v7, v29

    move-object/from16 v2, v30

    goto :goto_65

    :cond_90
    move-object/from16 v30, v2

    move-object/from16 v16, v6

    move-object/from16 v29, v7

    move-object/from16 v18, v13

    move-object/from16 v19, v14

    const-wide/16 v1, 0x0

    iget-object v6, v4, Lcom/daaw/ha2;->h:[J

    aget-wide v13, v6, v8

    add-long v23, v23, v13

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v6, v16

    move-object/from16 v13, v18

    move-object/from16 v14, v19

    move-object/from16 v1, v27

    move-object/from16 v2, v30

    const/4 v9, 0x0

    move-object/from16 v16, v5

    move-object/from16 v5, v28

    goto/16 :goto_64

    :cond_91
    move-object/from16 v30, v2

    move-object/from16 v29, v7

    iget-wide v0, v4, Lcom/daaw/ha2;->d:J

    const-wide/32 v19, 0xf4240

    move-wide/from16 v17, v23

    move-wide/from16 v21, v0

    invoke-static/range {v17 .. v22}, Lcom/daaw/it5;->g0(JJJ)J

    move-result-wide v22

    new-instance v2, Lcom/daaw/ka2;

    move-object v15, v2

    move-object/from16 v16, v4

    move-object/from16 v17, v30

    move-object/from16 v18, v3

    move/from16 v19, v12

    move-object/from16 v20, v10

    move-object/from16 v21, v29

    invoke-direct/range {v15 .. v23}, Lcom/daaw/ka2;-><init>(Lcom/daaw/ha2;[J[II[J[IJ)V

    goto/16 :goto_3d

    :goto_66
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_67

    :cond_92
    const-string v0, "Track has no sample table size information"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object v0

    throw v0

    :cond_93
    move-object/from16 v0, v32

    :goto_67
    add-int/lit8 v15, v31, 0x1

    move-object/from16 v1, p1

    move-object/from16 v12, p4

    move-object v13, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_94
    move-object v0, v13

    return-object v0
.end method

.method public static d(Lcom/daaw/ik5;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v1

    const v2, 0x68646c72    # 4.3148E24f

    if-eq v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x4

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->f(I)V

    return-void
.end method

.method public static e(I)I
    .locals 1

    const v0, 0x736f756e

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const v0, 0x76696465

    if-ne p0, v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const v0, 0x74657874

    if-eq p0, v0, :cond_4

    const v0, 0x7362746c

    if-eq p0, v0, :cond_4

    const v0, 0x73756274

    if-eq p0, v0, :cond_4

    const v0, 0x636c6370

    if-ne p0, v0, :cond_2

    goto :goto_0

    :cond_2
    const v0, 0x6d657461

    if-ne p0, v0, :cond_3

    const/4 p0, 0x5

    return p0

    :cond_3
    const/4 p0, -0x1

    return p0

    :cond_4
    :goto_0
    const/4 p0, 0x3

    return p0
.end method

.method public static f(Lcom/daaw/ik5;)I
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v0

    and-int/lit8 v1, v0, 0x7f

    :goto_0
    const/16 v2, 0x80

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v0

    shl-int/lit8 v1, v1, 0x7

    and-int/lit8 v2, v0, 0x7f

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static g(Lcom/daaw/ik5;)I
    .locals 1

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result p0

    return p0
.end method

.method public static h(Lcom/daaw/a92;)Landroid/util/Pair;
    .locals 8

    const v0, 0x656c7374

    invoke-virtual {p0, v0}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    iget-object p0, p0, Lcom/daaw/b92;->b:Lcom/daaw/ik5;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/c92;->a(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/ik5;->v()I

    move-result v1

    new-array v2, v1, [J

    new-array v3, v1, [J

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_4

    const/4 v5, 0x1

    if-ne v0, v5, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ik5;->B()J

    move-result-wide v6

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ik5;->A()J

    move-result-wide v6

    :goto_1
    aput-wide v6, v2, v4

    if-ne v0, v5, :cond_2

    invoke-virtual {p0}, Lcom/daaw/ik5;->z()J

    move-result-wide v6

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v6

    int-to-long v6, v6

    :goto_2
    aput-wide v6, v3, v4

    invoke-virtual {p0}, Lcom/daaw/ik5;->G()S

    move-result v6

    if-ne v6, v5, :cond_3

    const/4 v5, 0x2

    invoke-virtual {p0, v5}, Lcom/daaw/ik5;->g(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported media rate."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lcom/daaw/ik5;)Landroid/util/Pair;
    .locals 4

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->m()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/c92;->a(I)I

    move-result v1

    if-nez v1, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    invoke-virtual {p0, v2}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->A()J

    move-result-wide v2

    if-nez v1, :cond_1

    const/4 v0, 0x4

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->w()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, p0, 0xa

    and-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x60

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v1, p0, 0x5

    and-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x60

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 p0, p0, 0x1f

    add-int/lit8 p0, p0, 0x60

    int-to-char p0, p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lcom/daaw/ik5;II)Landroid/util/Pair;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->k()I

    move-result v1

    :goto_0
    sub-int v2, v1, p1

    move/from16 v4, p2

    if-ge v2, v4, :cond_11

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v2, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    :goto_1
    const-string v8, "childAtomSize must be positive"

    invoke-static {v7, v8}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v7

    const v8, 0x73696e66

    if-ne v7, v8, :cond_10

    add-int/lit8 v7, v1, 0x8

    const/4 v8, -0x1

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    :goto_2
    sub-int v12, v7, v1

    const/4 v13, 0x4

    if-ge v12, v2, :cond_4

    invoke-virtual {v0, v7}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v14

    const v3, 0x66726d61

    if-ne v14, v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    goto :goto_3

    :cond_1
    const v3, 0x7363686d

    if-ne v14, v3, :cond_2

    invoke-virtual {v0, v13}, Lcom/daaw/ik5;->g(I)V

    sget-object v3, Lcom/daaw/cy6;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v13, v3}, Lcom/daaw/ik5;->F(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v11

    goto :goto_3

    :cond_2
    const v3, 0x73636869

    if-ne v14, v3, :cond_3

    move v9, v7

    move v10, v12

    :cond_3
    :goto_3
    add-int/2addr v7, v12

    goto :goto_2

    :cond_4
    const-string v3, "cenc"

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "cbc1"

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "cens"

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "cbcs"

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    goto/16 :goto_d

    :cond_6
    :goto_4
    if-eqz v15, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    :goto_5
    const-string v7, "frma atom is mandatory"

    invoke-static {v3, v7}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    if-eq v9, v8, :cond_8

    const/4 v3, 0x1

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    :goto_6
    const-string v7, "schi atom is mandatory"

    invoke-static {v3, v7}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    add-int/lit8 v3, v9, 0x8

    :goto_7
    sub-int v7, v3, v9

    if-ge v7, v10, :cond_d

    invoke-virtual {v0, v3}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v8

    const v12, 0x74656e63

    if-ne v8, v12, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v3

    invoke-virtual {v0, v5}, Lcom/daaw/ik5;->g(I)V

    invoke-static {v3}, Lcom/daaw/c92;->a(I)I

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {v0, v5}, Lcom/daaw/ik5;->g(I)V

    const/4 v3, 0x0

    const/4 v14, 0x0

    goto :goto_8

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->s()I

    move-result v3

    and-int/lit16 v7, v3, 0xf0

    shr-int/2addr v7, v13

    and-int/lit8 v3, v3, 0xf

    move v14, v7

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->s()I

    move-result v7

    if-ne v7, v5, :cond_a

    const/4 v10, 0x1

    goto :goto_9

    :cond_a
    const/4 v10, 0x0

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->s()I

    move-result v12

    const/16 v7, 0x10

    new-array v13, v7, [B

    invoke-virtual {v0, v13, v6, v7}, Lcom/daaw/ik5;->b([BII)V

    if-eqz v10, :cond_b

    if-nez v12, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->s()I

    move-result v7

    new-array v8, v7, [B

    invoke-virtual {v0, v8, v6, v7}, Lcom/daaw/ik5;->b([BII)V

    move-object/from16 v16, v8

    goto :goto_a

    :cond_b
    const/16 v16, 0x0

    :goto_a
    new-instance v7, Lcom/daaw/ia2;

    move-object v9, v7

    move-object v8, v15

    move v15, v3

    invoke-direct/range {v9 .. v16}, Lcom/daaw/ia2;-><init>(ZLjava/lang/String;I[BII[B)V

    move-object v3, v7

    goto :goto_b

    :cond_c
    move-object v8, v15

    add-int/2addr v3, v7

    goto :goto_7

    :cond_d
    move-object v8, v15

    const/4 v3, 0x0

    :goto_b
    if-eqz v3, :cond_e

    goto :goto_c

    :cond_e
    const/4 v5, 0x0

    :goto_c
    const-string v6, "tenc atom is mandatory"

    invoke-static {v5, v6}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    sget v5, Lcom/daaw/it5;->a:I

    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v3

    :goto_d
    if-nez v3, :cond_f

    goto :goto_e

    :cond_f
    return-object v3

    :cond_10
    :goto_e
    add-int/2addr v1, v2

    goto/16 :goto_0

    :cond_11
    const/4 v1, 0x0

    return-object v1
.end method

.method public static k(Lcom/daaw/ik5;I)Lcom/daaw/l92;
    .locals 10

    add-int/lit8 p1, p1, 0xc

    invoke-virtual {p0, p1}, Lcom/daaw/ik5;->f(I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/ik5;->g(I)V

    invoke-static {p0}, Lcom/daaw/r92;->f(Lcom/daaw/ik5;)I

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v1

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    :cond_0
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/daaw/ik5;->g(I)V

    :cond_1
    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/ik5;->g(I)V

    invoke-static {p0}, Lcom/daaw/r92;->f(Lcom/daaw/ik5;)I

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/ak3;->d(I)Ljava/lang/String;

    move-result-object v2

    const-string v0, "audio/mpeg"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "audio/vnd.dts"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "audio/vnd.dts.hd"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->A()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/daaw/ik5;->A()J

    move-result-wide v3

    invoke-virtual {p0, p1}, Lcom/daaw/ik5;->g(I)V

    invoke-static {p0}, Lcom/daaw/r92;->f(Lcom/daaw/ik5;)I

    move-result p1

    new-array v5, p1, [B

    const/4 v6, 0x0

    invoke-virtual {p0, v5, v6, p1}, Lcom/daaw/ik5;->b([BII)V

    const-wide/16 p0, -0x1

    const-wide/16 v6, 0x0

    cmp-long v8, v3, v6

    if-gtz v8, :cond_4

    move-wide v8, p0

    goto :goto_0

    :cond_4
    move-wide v8, v3

    :goto_0
    cmp-long v3, v0, v6

    if-lez v3, :cond_5

    move-wide v6, v0

    goto :goto_1

    :cond_5
    move-wide v6, p0

    :goto_1
    new-instance p0, Lcom/daaw/l92;

    move-object v1, p0

    move-object v3, v5

    move-wide v4, v8

    invoke-direct/range {v1 .. v7}, Lcom/daaw/l92;-><init>(Ljava/lang/String;[BJJ)V

    return-object p0

    :cond_6
    :goto_2
    new-instance p0, Lcom/daaw/l92;

    const/4 v3, 0x0

    const-wide/16 v4, -0x1

    const-wide/16 v6, -0x1

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/l92;-><init>(Ljava/lang/String;[BJJ)V

    return-object p0
.end method

.method public static l()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x19

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public static m(Lcom/daaw/ik5;IIIILjava/lang/String;ZLcom/google/android/gms/internal/ads/zzx;Lcom/daaw/n92;I)V
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    add-int/lit8 v7, v1, 0x10

    invoke-virtual {v0, v7}, Lcom/daaw/ik5;->f(I)V

    const/4 v7, 0x6

    if-eqz p6, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->w()I

    move-result v9

    invoke-virtual {v0, v7}, Lcom/daaw/ik5;->g(I)V

    goto :goto_0

    :cond_0
    const/16 v9, 0x8

    invoke-virtual {v0, v9}, Lcom/daaw/ik5;->g(I)V

    const/4 v9, 0x0

    :goto_0
    const/16 v10, 0x14

    const/16 v11, 0x10

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-eqz v9, :cond_3

    if-ne v9, v13, :cond_1

    goto :goto_1

    :cond_1
    if-ne v9, v12, :cond_2

    invoke-virtual {v0, v11}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->z()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    long-to-int v7, v14

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->v()I

    move-result v9

    invoke-virtual {v0, v10}, Lcom/daaw/ik5;->g(I)V

    const/4 v15, 0x0

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->w()I

    move-result v14

    invoke-virtual {v0, v7}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->t()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->k()I

    move-result v15

    add-int/lit8 v15, v15, -0x4

    invoke-virtual {v0, v15}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v15

    if-ne v9, v13, :cond_4

    invoke-virtual {v0, v11}, Lcom/daaw/ik5;->g(I)V

    :cond_4
    move v9, v14

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->k()I

    move-result v11

    const v14, 0x656e6361

    move/from16 v12, p1

    if-ne v12, v14, :cond_7

    invoke-static {v0, v1, v2}, Lcom/daaw/r92;->j(Lcom/daaw/ik5;II)Landroid/util/Pair;

    move-result-object v12

    if-eqz v12, :cond_6

    iget-object v14, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-nez v5, :cond_5

    const/4 v5, 0x0

    goto :goto_3

    :cond_5
    iget-object v13, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v13, Lcom/daaw/ia2;

    iget-object v13, v13, Lcom/daaw/ia2;->b:Ljava/lang/String;

    invoke-virtual {v5, v13}, Lcom/google/android/gms/internal/ads/zzx;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzx;

    move-result-object v5

    :goto_3
    iget-object v13, v6, Lcom/daaw/n92;->a:[Lcom/daaw/ia2;

    iget-object v12, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v12, Lcom/daaw/ia2;

    aput-object v12, v13, p9

    :cond_6
    invoke-virtual {v0, v11}, Lcom/daaw/ik5;->f(I)V

    move v12, v14

    :cond_7
    const v13, 0x61632d33

    const v14, 0x616c6163

    const-string v19, "audio/raw"

    const-string v10, "audio/ac4"

    if-ne v12, v13, :cond_8

    const-string v19, "audio/ac3"

    :goto_4
    const/4 v12, -0x1

    goto/16 :goto_8

    :cond_8
    const v13, 0x65632d33

    if-ne v12, v13, :cond_9

    const-string v19, "audio/eac3"

    goto :goto_4

    :cond_9
    const v13, 0x61632d34

    if-ne v12, v13, :cond_a

    move-object/from16 v19, v10

    goto :goto_4

    :cond_a
    const v13, 0x64747363

    if-ne v12, v13, :cond_b

    const-string v19, "audio/vnd.dts"

    goto :goto_4

    :cond_b
    const v13, 0x64747368

    if-eq v12, v13, :cond_1e

    const v13, 0x6474736c

    if-ne v12, v13, :cond_c

    goto/16 :goto_7

    :cond_c
    const v13, 0x64747365

    if-ne v12, v13, :cond_d

    const-string v19, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_4

    :cond_d
    const v13, 0x64747378

    if-ne v12, v13, :cond_e

    const-string v19, "audio/vnd.dts.uhd;profile=p2"

    goto :goto_4

    :cond_e
    const v13, 0x73616d72

    if-ne v12, v13, :cond_f

    const-string v19, "audio/3gpp"

    goto :goto_4

    :cond_f
    const v13, 0x73617762

    if-ne v12, v13, :cond_10

    const-string v19, "audio/amr-wb"

    goto :goto_4

    :cond_10
    const v13, 0x6c70636d

    if-eq v12, v13, :cond_1d

    const v13, 0x736f7774

    if-ne v12, v13, :cond_11

    goto :goto_6

    :cond_11
    const v13, 0x74776f73

    if-ne v12, v13, :cond_12

    const/high16 v12, 0x10000000

    goto :goto_8

    :cond_12
    const v13, 0x2e6d7032

    if-eq v12, v13, :cond_1c

    const v13, 0x2e6d7033

    if-ne v12, v13, :cond_13

    goto :goto_5

    :cond_13
    const v13, 0x6d686131

    if-ne v12, v13, :cond_14

    const-string v19, "audio/mha1"

    goto :goto_4

    :cond_14
    const v13, 0x6d686d31

    if-ne v12, v13, :cond_15

    const-string v19, "audio/mhm1"

    goto :goto_4

    :cond_15
    if-ne v12, v14, :cond_16

    const-string v19, "audio/alac"

    goto :goto_4

    :cond_16
    const v13, 0x616c6177

    if-ne v12, v13, :cond_17

    const-string v19, "audio/g711-alaw"

    goto/16 :goto_4

    :cond_17
    const v13, 0x756c6177

    if-ne v12, v13, :cond_18

    const-string v19, "audio/g711-mlaw"

    goto/16 :goto_4

    :cond_18
    const v13, 0x4f707573

    if-ne v12, v13, :cond_19

    const-string v19, "audio/opus"

    goto/16 :goto_4

    :cond_19
    const v13, 0x664c6143

    if-ne v12, v13, :cond_1a

    const-string v19, "audio/flac"

    goto/16 :goto_4

    :cond_1a
    const v13, 0x6d6c7061

    if-ne v12, v13, :cond_1b

    const-string v19, "audio/true-hd"

    goto/16 :goto_4

    :cond_1b
    const/4 v12, -0x1

    const/16 v19, 0x0

    goto :goto_8

    :cond_1c
    :goto_5
    const-string v19, "audio/mpeg"

    goto/16 :goto_4

    :cond_1d
    :goto_6
    const/4 v12, 0x2

    goto :goto_8

    :cond_1e
    :goto_7
    const-string v19, "audio/vnd.dts.hd"

    goto/16 :goto_4

    :goto_8
    move-object/from16 v13, v19

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_9
    sub-int v8, v11, v1

    if-ge v8, v2, :cond_34

    invoke-virtual {v0, v11}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v8

    if-lez v8, :cond_1f

    const/4 v14, 0x1

    goto :goto_a

    :cond_1f
    const/4 v14, 0x0

    :goto_a
    const-string v1, "childAtomSize must be positive"

    invoke-static {v14, v1}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v14

    const v2, 0x6d686143

    if-ne v14, v2, :cond_20

    add-int/lit8 v1, v8, -0xd

    new-array v2, v1, [B

    add-int/lit8 v14, v11, 0xd

    invoke-virtual {v0, v14}, Lcom/daaw/ik5;->f(I)V

    const/4 v14, 0x0

    invoke-virtual {v0, v2, v14, v1}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v2}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v21

    move/from16 v22, v12

    :goto_b
    const/4 v12, 0x0

    const/16 v14, 0x14

    const/16 v17, 0x2

    const/16 v18, 0x1

    goto/16 :goto_14

    :cond_20
    const v2, 0x65736473

    if-eq v14, v2, :cond_30

    if-eqz p6, :cond_25

    const v2, 0x77617665

    if-ne v14, v2, :cond_25

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->k()I

    move-result v2

    move/from16 v22, v2

    if-lt v2, v11, :cond_21

    const/4 v2, 0x0

    const/4 v14, 0x1

    goto :goto_c

    :cond_21
    const/4 v2, 0x0

    const/4 v14, 0x0

    :goto_c
    invoke-static {v14, v2}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    move/from16 v2, v22

    :goto_d
    sub-int v14, v2, v11

    if-ge v14, v8, :cond_24

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v14

    move/from16 v22, v12

    if-lez v14, :cond_22

    const/4 v12, 0x1

    goto :goto_e

    :cond_22
    const/4 v12, 0x0

    :goto_e
    invoke-static {v12, v1}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->m()I

    move-result v12

    move-object/from16 v23, v1

    const v1, 0x65736473

    if-eq v12, v1, :cond_23

    add-int/2addr v2, v14

    move/from16 v12, v22

    move-object/from16 v1, v23

    goto :goto_d

    :cond_23
    const/4 v1, -0x1

    goto :goto_f

    :cond_24
    move/from16 v22, v12

    const/4 v1, -0x1

    const/4 v2, -0x1

    :goto_f
    const/4 v12, 0x0

    const/16 v14, 0x14

    const/16 v17, 0x2

    const/16 v18, 0x1

    goto/16 :goto_13

    :cond_25
    move/from16 v22, v12

    const v1, 0x64616333

    if-ne v14, v1, :cond_26

    add-int/lit8 v1, v11, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->f(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4, v5}, Lcom/daaw/cz8;->c(Lcom/daaw/ik5;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/f92;

    move-result-object v1

    :goto_10
    iput-object v1, v6, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    :goto_11
    const v1, 0x616c6163

    goto :goto_b

    :cond_26
    const v1, 0x64656333

    if-ne v14, v1, :cond_27

    add-int/lit8 v1, v11, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->f(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4, v5}, Lcom/daaw/cz8;->d(Lcom/daaw/ik5;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/f92;

    move-result-object v1

    goto :goto_10

    :cond_27
    const v1, 0x64616334

    if-ne v14, v1, :cond_29

    add-int/lit8 v1, v11, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->f(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/daaw/fz8;->b:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->s()I

    move-result v12

    and-int/lit8 v12, v12, 0x20

    shr-int/lit8 v12, v12, 0x5

    if-eq v2, v12, :cond_28

    const v2, 0xac44

    goto :goto_12

    :cond_28
    const v2, 0xbb80

    :goto_12
    new-instance v12, Lcom/daaw/b72;

    invoke-direct {v12}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v12, v1}, Lcom/daaw/b72;->h(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v12, v10}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    const/4 v1, 0x2

    invoke-virtual {v12, v1}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    invoke-virtual {v12, v2}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-virtual {v12, v5}, Lcom/daaw/b72;->b(Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/b72;

    invoke-virtual {v12, v4}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v12}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v1

    goto :goto_10

    :cond_29
    const v1, 0x646d6c70

    if-ne v14, v1, :cond_2b

    if-lez v15, :cond_2a

    move v7, v15

    const/4 v9, 0x2

    goto/16 :goto_b

    :cond_2a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object v0

    throw v0

    :cond_2b
    const/4 v1, 0x0

    const v2, 0x64647473

    if-ne v14, v2, :cond_2c

    new-instance v2, Lcom/daaw/b72;

    invoke-direct {v2}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v2, v3}, Lcom/daaw/b72;->g(I)Lcom/daaw/b72;

    invoke-virtual {v2, v13}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v2, v9}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    invoke-virtual {v2, v7}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-virtual {v2, v5}, Lcom/daaw/b72;->b(Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/b72;

    invoke-virtual {v2, v4}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v2}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v2

    iput-object v2, v6, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    goto/16 :goto_11

    :cond_2c
    const v2, 0x644f7073

    if-ne v14, v2, :cond_2d

    add-int/lit8 v2, v8, -0x8

    sget-object v12, Lcom/daaw/r92;->a:[B

    array-length v14, v12

    add-int/2addr v14, v2

    invoke-static {v12, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v14

    add-int/lit8 v1, v11, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->f(I)V

    array-length v1, v12

    invoke-virtual {v0, v14, v1, v2}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v14}, Lcom/daaw/d42;->a([B)Ljava/util/List;

    move-result-object v21

    goto/16 :goto_b

    :cond_2d
    const v1, 0x64664c61

    if-ne v14, v1, :cond_2f

    add-int/lit8 v1, v8, -0xc

    add-int/lit8 v2, v1, 0x4

    new-array v2, v2, [B

    const/16 v12, 0x66

    const/4 v14, 0x0

    aput-byte v12, v2, v14

    const/16 v12, 0x4c

    const/16 v18, 0x1

    aput-byte v12, v2, v18

    const/16 v12, 0x61

    const/16 v17, 0x2

    aput-byte v12, v2, v17

    const/4 v12, 0x3

    const/16 v14, 0x43

    aput-byte v14, v2, v12

    add-int/lit8 v12, v11, 0xc

    invoke-virtual {v0, v12}, Lcom/daaw/ik5;->f(I)V

    const/4 v12, 0x4

    invoke-virtual {v0, v2, v12, v1}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v2}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v21

    :cond_2e
    const/4 v12, 0x0

    const/16 v14, 0x14

    goto/16 :goto_14

    :cond_2f
    const v1, 0x616c6163

    const/16 v17, 0x2

    const/16 v18, 0x1

    if-ne v14, v1, :cond_2e

    add-int/lit8 v2, v8, -0xc

    new-array v7, v2, [B

    add-int/lit8 v9, v11, 0xc

    invoke-virtual {v0, v9}, Lcom/daaw/ik5;->f(I)V

    const/4 v12, 0x0

    invoke-virtual {v0, v7, v12, v2}, Lcom/daaw/ik5;->b([BII)V

    new-instance v2, Lcom/daaw/ik5;

    invoke-direct {v2, v7}, Lcom/daaw/ik5;-><init>([B)V

    const/16 v9, 0x9

    invoke-virtual {v2, v9}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v2}, Lcom/daaw/ik5;->s()I

    move-result v9

    const/16 v14, 0x14

    invoke-virtual {v2, v14}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v2}, Lcom/daaw/ik5;->v()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v2, v9}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v7}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v21

    move v7, v9

    move v9, v2

    goto :goto_14

    :cond_30
    move/from16 v22, v12

    const/4 v12, 0x0

    const/16 v14, 0x14

    const/16 v17, 0x2

    const/16 v18, 0x1

    move v2, v11

    const/4 v1, -0x1

    :goto_13
    if-eq v2, v1, :cond_33

    invoke-static {v0, v2}, Lcom/daaw/r92;->k(Lcom/daaw/ik5;I)Lcom/daaw/l92;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/l92;->c(Lcom/daaw/l92;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v2}, Lcom/daaw/l92;->d(Lcom/daaw/l92;)[B

    move-result-object v16

    if-eqz v16, :cond_32

    const-string v1, "audio/mp4a-latm"

    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    invoke-static/range {v16 .. v16}, Lcom/daaw/zy8;->a([B)Lcom/daaw/yy8;

    move-result-object v1

    iget v7, v1, Lcom/daaw/yy8;->a:I

    iget v9, v1, Lcom/daaw/yy8;->b:I

    iget-object v1, v1, Lcom/daaw/yy8;->c:Ljava/lang/String;

    move-object/from16 v20, v1

    :cond_31
    invoke-static/range {v16 .. v16}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v1

    move-object/from16 v21, v1

    :cond_32
    move-object/from16 v19, v2

    :cond_33
    :goto_14
    add-int/2addr v11, v8

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v12, v22

    const v14, 0x616c6163

    goto/16 :goto_9

    :cond_34
    move/from16 v22, v12

    iget-object v0, v6, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    if-nez v0, :cond_36

    if-eqz v13, :cond_36

    new-instance v0, Lcom/daaw/b72;

    invoke-direct {v0}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v0, v3}, Lcom/daaw/b72;->g(I)Lcom/daaw/b72;

    invoke-virtual {v0, v13}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->f0(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0, v9}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    invoke-virtual {v0, v7}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    move/from16 v8, v22

    invoke-virtual {v0, v8}, Lcom/daaw/b72;->n(I)Lcom/daaw/b72;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    invoke-virtual {v0, v5}, Lcom/daaw/b72;->b(Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/b72;

    invoke-virtual {v0, v4}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    if-eqz v19, :cond_35

    invoke-static/range {v19 .. v19}, Lcom/daaw/l92;->a(Lcom/daaw/l92;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/daaw/i47;->c(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->d0(I)Lcom/daaw/b72;

    invoke-static/range {v19 .. v19}, Lcom/daaw/l92;->b(Lcom/daaw/l92;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/daaw/i47;->c(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->o(I)Lcom/daaw/b72;

    :cond_35
    invoke-virtual {v0}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v0

    iput-object v0, v6, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    :cond_36
    return-void
.end method

.method public static n(Lcom/daaw/ik5;IIILcom/daaw/n92;)V
    .locals 0

    add-int/lit8 p2, p2, 0x10

    invoke-virtual {p0, p2}, Lcom/daaw/ik5;->f(I)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/ik5;->D(C)Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/ik5;->D(C)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Lcom/daaw/b72;

    invoke-direct {p1}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {p1, p3}, Lcom/daaw/b72;->g(I)Lcom/daaw/b72;

    invoke-virtual {p1, p0}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {p1}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p0

    iput-object p0, p4, Lcom/daaw/n92;->b:Lcom/daaw/f92;

    :cond_0
    return-void
.end method

.method public static o([JJJJ)Z
    .locals 6

    array-length v0, p0

    add-int/lit8 v1, v0, -0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v2, v3, v1}, Lcom/daaw/it5;->P(III)I

    move-result v2

    add-int/lit8 v0, v0, -0x4

    invoke-static {v0, v3, v1}, Lcom/daaw/it5;->P(III)I

    move-result v0

    aget-wide v4, p0, v3

    cmp-long v1, v4, p3

    if-gtz v1, :cond_0

    aget-wide v1, p0, v2

    cmp-long v4, p3, v1

    if-gez v4, :cond_0

    aget-wide p3, p0, v0

    cmp-long p0, p3, p5

    if-gez p0, :cond_0

    cmp-long p0, p5, p1

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v3
.end method
