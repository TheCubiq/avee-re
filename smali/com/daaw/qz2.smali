.class public final Lcom/daaw/qz2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:F


# direct methods
.method public constructor <init>(Ljava/util/List;IIIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qz2;->a:Ljava/util/List;

    iput p2, p0, Lcom/daaw/qz2;->b:I

    iput p5, p0, Lcom/daaw/qz2;->c:F

    return-void
.end method

.method public static a(Lcom/daaw/iz2;)Lcom/daaw/qz2;
    .locals 17

    const/4 v0, 0x4

    move-object/from16 v1, p0

    :try_start_0
    invoke-virtual {v1, v0}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/iz2;->g()I

    move-result v0

    const/4 v2, 0x3

    and-int/2addr v0, v2

    const/4 v3, 0x1

    add-int/lit8 v6, v0, 0x1

    if-eq v6, v2, :cond_16

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/iz2;->g()I

    move-result v0

    and-int/lit8 v0, v0, 0x1f

    const/4 v4, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v0, :cond_0

    invoke-static/range {p0 .. p0}, Lcom/daaw/qz2;->b(Lcom/daaw/iz2;)[B

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/iz2;->g()I

    move-result v7

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    invoke-static/range {p0 .. p0}, Lcom/daaw/qz2;->b(Lcom/daaw/iz2;)[B

    move-result-object v9

    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, -0x1

    const/high16 v7, 0x3f800000    # 1.0f

    if-lez v0, :cond_15

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    array-length v0, v0

    new-instance v8, Lcom/daaw/jz2;

    invoke-direct {v8, v1, v6, v0}, Lcom/daaw/jz2;-><init>([BII)V

    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Lcom/daaw/jz2;->d(I)V

    invoke-virtual {v8, v0}, Lcom/daaw/jz2;->a(I)I

    move-result v1

    const/16 v9, 0x10

    invoke-virtual {v8, v9}, Lcom/daaw/jz2;->d(I)V

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    const/16 v10, 0x64

    if-eq v1, v10, :cond_3

    const/16 v10, 0x6e

    if-eq v1, v10, :cond_3

    const/16 v10, 0x7a

    if-eq v1, v10, :cond_3

    const/16 v10, 0xf4

    if-eq v1, v10, :cond_3

    const/16 v10, 0x2c

    if-eq v1, v10, :cond_3

    const/16 v10, 0x53

    if-eq v1, v10, :cond_3

    const/16 v10, 0x56

    if-eq v1, v10, :cond_3

    const/16 v10, 0x76

    if-eq v1, v10, :cond_3

    const/16 v10, 0x80

    if-eq v1, v10, :cond_3

    const/16 v10, 0x8a

    if-ne v1, v10, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    goto :goto_8

    :cond_3
    :goto_2
    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    move-result v1

    if-ne v1, v2, :cond_4

    invoke-virtual {v8}, Lcom/daaw/jz2;->e()Z

    const/4 v10, 0x3

    goto :goto_3

    :cond_4
    move v10, v1

    :goto_3
    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    invoke-virtual {v8, v3}, Lcom/daaw/jz2;->d(I)V

    invoke-virtual {v8}, Lcom/daaw/jz2;->e()Z

    move-result v11

    if-eqz v11, :cond_a

    if-eq v10, v2, :cond_5

    const/16 v10, 0x8

    goto :goto_4

    :cond_5
    const/16 v10, 0xc

    :goto_4
    const/4 v11, 0x0

    :goto_5
    if-ge v11, v10, :cond_a

    invoke-virtual {v8}, Lcom/daaw/jz2;->e()Z

    move-result v12

    if-eqz v12, :cond_9

    const/4 v12, 0x6

    if-ge v11, v12, :cond_6

    const/16 v12, 0x10

    goto :goto_6

    :cond_6
    const/16 v12, 0x40

    :goto_6
    const/4 v13, 0x0

    const/16 v14, 0x8

    const/16 v15, 0x8

    :goto_7
    if-ge v13, v12, :cond_9

    if-eqz v14, :cond_7

    invoke-virtual {v8}, Lcom/daaw/jz2;->b()I

    move-result v14

    add-int/2addr v14, v15

    add-int/lit16 v14, v14, 0x100

    rem-int/lit16 v14, v14, 0x100

    :cond_7
    if-eqz v14, :cond_8

    move v15, v14

    :cond_8
    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    :cond_9
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_a
    :goto_8
    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    move-result v10

    if-nez v10, :cond_b

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    goto :goto_a

    :cond_b
    if-ne v10, v3, :cond_c

    invoke-virtual {v8}, Lcom/daaw/jz2;->e()Z

    invoke-virtual {v8}, Lcom/daaw/jz2;->b()I

    invoke-virtual {v8}, Lcom/daaw/jz2;->b()I

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    move-result v10

    int-to-long v10, v10

    :goto_9
    int-to-long v12, v4

    cmp-long v14, v12, v10

    if-gez v14, :cond_c

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_c
    :goto_a
    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    invoke-virtual {v8, v3}, Lcom/daaw/jz2;->d(I)V

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    move-result v10

    add-int/2addr v10, v3

    invoke-virtual {v8}, Lcom/daaw/jz2;->e()Z

    move-result v11

    rsub-int/lit8 v12, v11, 0x2

    mul-int v10, v10, v12

    if-nez v11, :cond_d

    invoke-virtual {v8, v3}, Lcom/daaw/jz2;->d(I)V

    :cond_d
    invoke-virtual {v8, v3}, Lcom/daaw/jz2;->d(I)V

    mul-int/lit8 v4, v4, 0x10

    mul-int/lit8 v10, v10, 0x10

    invoke-virtual {v8}, Lcom/daaw/jz2;->e()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    move-result v11

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    move-result v13

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    move-result v14

    invoke-virtual {v8}, Lcom/daaw/jz2;->c()I

    move-result v15

    if-nez v1, :cond_e

    goto :goto_c

    :cond_e
    const/16 v16, 0x2

    if-ne v1, v2, :cond_f

    const/4 v2, 0x1

    goto :goto_b

    :cond_f
    const/4 v2, 0x2

    :goto_b
    if-ne v1, v3, :cond_10

    const/4 v3, 0x2

    :cond_10
    mul-int v12, v12, v3

    move v3, v2

    :goto_c
    add-int/2addr v11, v13

    mul-int v11, v11, v3

    sub-int/2addr v4, v11

    add-int/2addr v14, v15

    mul-int v14, v14, v12

    sub-int/2addr v10, v14

    :cond_11
    invoke-virtual {v8}, Lcom/daaw/jz2;->e()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-virtual {v8}, Lcom/daaw/jz2;->e()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-virtual {v8, v0}, Lcom/daaw/jz2;->a(I)I

    move-result v0

    const/16 v1, 0xff

    if-ne v0, v1, :cond_12

    invoke-virtual {v8, v9}, Lcom/daaw/jz2;->a(I)I

    move-result v0

    invoke-virtual {v8, v9}, Lcom/daaw/jz2;->a(I)I

    move-result v1

    if-eqz v0, :cond_14

    if-eqz v1, :cond_14

    int-to-float v0, v0

    int-to-float v1, v1

    div-float v7, v0, v1

    goto :goto_d

    :cond_12
    const/16 v1, 0x11

    if-ge v0, v1, :cond_13

    sget-object v1, Lcom/daaw/gz2;->b:[F

    aget v7, v1, v0

    goto :goto_d

    :cond_13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected aspect_ratio_idc value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_14
    :goto_d
    move v9, v7

    move v8, v10

    move v7, v4

    goto :goto_e

    :cond_15
    const/4 v7, -0x1

    const/4 v8, -0x1

    const/high16 v9, 0x3f800000    # 1.0f

    :goto_e
    new-instance v0, Lcom/daaw/qz2;

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/daaw/qz2;-><init>(Ljava/util/List;IIIF)V

    return-object v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/daaw/eq2;

    const-string v2, "Error parsing AVC config"

    invoke-direct {v1, v2, v0}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :goto_f
    throw v1

    :goto_10
    goto :goto_f
.end method

.method public static b(Lcom/daaw/iz2;)[B
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/iz2;->j()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/iz2;->c()I

    move-result v1

    invoke-virtual {p0, v0}, Lcom/daaw/iz2;->w(I)V

    iget-object p0, p0, Lcom/daaw/iz2;->a:[B

    invoke-static {p0, v1, v0}, Lcom/daaw/bz2;->b([BII)[B

    move-result-object p0

    return-object p0
.end method
