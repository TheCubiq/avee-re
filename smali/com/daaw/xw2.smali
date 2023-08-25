.class public final Lcom/daaw/xw2;
.super Lcom/daaw/bx2;
.source ""


# instance fields
.field public final e:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Lcom/daaw/cx2;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/bx2;-><init>()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lcom/daaw/ww2;

    invoke-direct {v0}, Lcom/daaw/ww2;-><init>()V

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/xw2;->e:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static g(IZ)Z
    .locals 3

    const/4 v0, 0x3

    and-int/2addr p0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p0, v0, :cond_1

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public static h(II)I
    .locals 1

    const/4 v0, -0x1

    if-ne p0, v0, :cond_1

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    if-ne p1, v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    sub-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final e([Lcom/daaw/hq2;[Lcom/daaw/rw2;[[[I)[Lcom/daaw/vw2;
    .locals 20

    const/4 v0, 0x2

    new-array v1, v0, [Lcom/daaw/vw2;

    move-object/from16 v2, p0

    iget-object v3, v2, Lcom/daaw/xw2;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ww2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    const/4 v8, -0x1

    const/4 v9, 0x1

    if-ge v5, v0, :cond_11

    aget-object v10, p1, v5

    invoke-interface {v10}, Lcom/daaw/hq2;->zzc()I

    move-result v10

    if-ne v10, v0, :cond_10

    if-nez v6, :cond_f

    aget-object v6, p1, v5

    aget-object v6, p2, v5

    aget-object v10, p3, v5

    iget v11, v3, Lcom/daaw/ww2;->d:I

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1
    iget v0, v6, Lcom/daaw/rw2;->a:I

    if-ge v12, v0, :cond_c

    invoke-virtual {v6, v12}, Lcom/daaw/rw2;->b(I)Lcom/daaw/mw2;

    move-result-object v0

    new-instance v7, Ljava/util/ArrayList;

    iget v4, v0, Lcom/daaw/mw2;->a:I

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_2
    if-gtz v4, :cond_0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    const/4 v9, 0x1

    goto :goto_2

    :cond_0
    aget-object v4, v10, v12

    const/4 v9, 0x0

    :goto_3
    if-gtz v9, :cond_b

    aget v2, v4, v9

    move-object/from16 v16, v6

    const/4 v6, 0x1

    invoke-static {v2, v6}, Lcom/daaw/xw2;->g(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v0, v9}, Lcom/daaw/mw2;->b(I)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzatd;->y:I

    move-object/from16 v17, v0

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_4

    :cond_1
    move-object/from16 v17, v0

    const/4 v0, 0x1

    const/4 v6, 0x0

    :goto_4
    move-object/from16 v18, v7

    if-eq v0, v6, :cond_2

    const/4 v0, 0x1

    goto :goto_5

    :cond_2
    const/4 v0, 0x2

    :goto_5
    aget v7, v4, v9

    move-object/from16 v19, v4

    const/4 v4, 0x0

    invoke-static {v7, v4}, Lcom/daaw/xw2;->g(IZ)Z

    move-result v7

    if-eqz v7, :cond_3

    add-int/lit16 v0, v0, 0x3e8

    :cond_3
    if-le v0, v15, :cond_4

    const/4 v4, 0x1

    goto :goto_6

    :cond_4
    const/4 v4, 0x0

    :goto_6
    if-ne v0, v15, :cond_8

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatd;->a()I

    move-result v4

    if-eq v4, v11, :cond_5

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatd;->a()I

    move-result v4

    invoke-static {v4, v11}, Lcom/daaw/xw2;->h(II)I

    move-result v4

    goto :goto_7

    :cond_5
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzatd;->q:I

    invoke-static {v4, v8}, Lcom/daaw/xw2;->h(II)I

    move-result v4

    :goto_7
    if-eqz v7, :cond_6

    if-eqz v6, :cond_6

    if-lez v4, :cond_7

    goto :goto_8

    :cond_6
    if-gez v4, :cond_7

    :goto_8
    const/4 v4, 0x1

    goto :goto_9

    :cond_7
    const/4 v4, 0x0

    :cond_8
    :goto_9
    if-eqz v4, :cond_a

    iget v8, v2, Lcom/google/android/gms/internal/ads/zzatd;->q:I

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatd;->a()I

    move-result v11

    move v15, v0

    move v14, v9

    move-object/from16 v13, v17

    goto :goto_a

    :cond_9
    move-object/from16 v17, v0

    move-object/from16 v19, v4

    move-object/from16 v18, v7

    :cond_a
    :goto_a
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, p0

    move-object/from16 v6, v16

    move-object/from16 v0, v17

    move-object/from16 v7, v18

    move-object/from16 v4, v19

    goto/16 :goto_3

    :cond_b
    move-object/from16 v16, v6

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, p0

    const/4 v9, 0x1

    goto/16 :goto_1

    :cond_c
    if-nez v13, :cond_d

    const/4 v7, 0x0

    goto :goto_b

    :cond_d
    new-instance v0, Lcom/daaw/yw2;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v13, v14, v4, v2}, Lcom/daaw/yw2;-><init>(Lcom/daaw/mw2;IILjava/lang/Object;)V

    move-object v7, v0

    :goto_b
    aput-object v7, v1, v5

    if-eqz v7, :cond_e

    const/4 v6, 0x1

    goto :goto_c

    :cond_e
    const/4 v6, 0x0

    :cond_f
    :goto_c
    aget-object v0, p2, v5

    iget v0, v0, Lcom/daaw/rw2;->a:I

    :cond_10
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, p0

    const/4 v0, 0x2

    goto/16 :goto_0

    :cond_11
    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_d
    if-ge v4, v0, :cond_1b

    aget-object v2, p1, v4

    invoke-interface {v2}, Lcom/daaw/hq2;->zzc()I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_13

    :cond_12
    const/4 v5, 0x0

    const/4 v7, 0x0

    goto/16 :goto_12

    :cond_13
    if-nez v6, :cond_12

    aget-object v2, p2, v4

    aget-object v5, p3, v4

    iget-object v6, v3, Lcom/daaw/ww2;->a:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, -0x1

    const/4 v10, -0x1

    :goto_e
    iget v11, v2, Lcom/daaw/rw2;->a:I

    if-ge v6, v11, :cond_18

    invoke-virtual {v2, v6}, Lcom/daaw/rw2;->b(I)Lcom/daaw/mw2;

    move-result-object v11

    aget-object v12, v5, v6

    move v13, v10

    move v10, v9

    move v9, v7

    const/4 v7, 0x0

    :goto_f
    iget v14, v11, Lcom/daaw/mw2;->a:I

    if-gtz v7, :cond_17

    aget v14, v12, v7

    const/4 v15, 0x1

    invoke-static {v14, v15}, Lcom/daaw/xw2;->g(IZ)Z

    move-result v14

    if-eqz v14, :cond_16

    invoke-virtual {v11, v7}, Lcom/daaw/mw2;->b(I)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v14

    aget v0, v12, v7

    iget v14, v14, Lcom/google/android/gms/internal/ads/zzatd;->M:I

    and-int/2addr v14, v15

    if-eq v15, v14, :cond_14

    const/4 v14, 0x1

    goto :goto_10

    :cond_14
    const/4 v14, 0x2

    :goto_10
    const/4 v15, 0x0

    invoke-static {v0, v15}, Lcom/daaw/xw2;->g(IZ)Z

    move-result v0

    if-eqz v0, :cond_15

    add-int/lit16 v14, v14, 0x3e8

    :cond_15
    if-le v14, v9, :cond_16

    move v10, v6

    move v13, v7

    move v9, v14

    :cond_16
    add-int/lit8 v7, v7, 0x1

    const/4 v0, 0x2

    goto :goto_f

    :cond_17
    add-int/lit8 v6, v6, 0x1

    move v7, v9

    move v9, v10

    move v10, v13

    const/4 v0, 0x2

    goto :goto_e

    :cond_18
    if-ne v9, v8, :cond_19

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    goto :goto_11

    :cond_19
    invoke-virtual {v2, v9}, Lcom/daaw/rw2;->b(I)Lcom/daaw/mw2;

    move-result-object v0

    new-instance v2, Lcom/daaw/yw2;

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct {v2, v0, v10, v5, v7}, Lcom/daaw/yw2;-><init>(Lcom/daaw/mw2;IILjava/lang/Object;)V

    :goto_11
    aput-object v2, v1, v4

    if-eqz v2, :cond_1a

    const/4 v6, 0x1

    goto :goto_12

    :cond_1a
    const/4 v6, 0x0

    :goto_12
    add-int/lit8 v4, v4, 0x1

    const/4 v0, 0x2

    goto :goto_d

    :cond_1b
    return-object v1
.end method
