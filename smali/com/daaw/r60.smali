.class public Lcom/daaw/r60;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/r60$a;
    }
.end annotation


# static fields
.field public static final q:Ljava/lang/String; = "r60"

.field public static final r:Landroid/graphics/Bitmap$Config;


# instance fields
.field public a:[I

.field public final b:[I

.field public c:Ljava/nio/ByteBuffer;

.field public final d:[B

.field public e:[S

.field public f:[B

.field public g:[B

.field public h:[B

.field public i:[I

.field public j:I

.field public k:[B

.field public l:Lcom/daaw/a70;

.field public m:Lcom/daaw/r60$a;

.field public n:Landroid/graphics/Bitmap;

.field public o:Z

.field public p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sput-object v0, Lcom/daaw/r60;->r:Landroid/graphics/Bitmap$Config;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/r60$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/r60;->b:[I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/r60;->d:[B

    iput-object p1, p0, Lcom/daaw/r60;->m:Lcom/daaw/r60$a;

    new-instance p1, Lcom/daaw/a70;

    invoke-direct {p1}, Lcom/daaw/a70;-><init>()V

    iput-object p1, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    return-void
.end method

.method public static n(Landroid/graphics/Bitmap;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xc
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget v0, p0, Lcom/daaw/r60;->j:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v1, v1, Lcom/daaw/a70;->c:I

    rem-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/r60;->j:I

    return-void
.end method

.method public b()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iput-object v0, p0, Lcom/daaw/r60;->k:[B

    iput-object v0, p0, Lcom/daaw/r60;->h:[B

    iput-object v0, p0, Lcom/daaw/r60;->i:[I

    iget-object v1, p0, Lcom/daaw/r60;->n:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/daaw/r60;->m:Lcom/daaw/r60$a;

    invoke-interface {v2, v1}, Lcom/daaw/r60$a;->b(Landroid/graphics/Bitmap;)V

    :cond_0
    iput-object v0, p0, Lcom/daaw/r60;->n:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/daaw/r60;->c:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final c(Lcom/daaw/w60;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v1, :cond_0

    iget-object v2, v0, Lcom/daaw/r60;->c:Ljava/nio/ByteBuffer;

    iget v3, v1, Lcom/daaw/w60;->j:I

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    :cond_0
    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v2, v1, Lcom/daaw/a70;->f:I

    iget v1, v1, Lcom/daaw/a70;->g:I

    goto :goto_0

    :cond_1
    iget v2, v1, Lcom/daaw/w60;->c:I

    iget v1, v1, Lcom/daaw/w60;->d:I

    :goto_0
    mul-int v2, v2, v1

    iget-object v1, v0, Lcom/daaw/r60;->h:[B

    if-eqz v1, :cond_2

    array-length v1, v1

    if-ge v1, v2, :cond_3

    :cond_2
    new-array v1, v2, [B

    iput-object v1, v0, Lcom/daaw/r60;->h:[B

    :cond_3
    iget-object v1, v0, Lcom/daaw/r60;->e:[S

    const/16 v3, 0x1000

    if-nez v1, :cond_4

    new-array v1, v3, [S

    iput-object v1, v0, Lcom/daaw/r60;->e:[S

    :cond_4
    iget-object v1, v0, Lcom/daaw/r60;->f:[B

    if-nez v1, :cond_5

    new-array v1, v3, [B

    iput-object v1, v0, Lcom/daaw/r60;->f:[B

    :cond_5
    iget-object v1, v0, Lcom/daaw/r60;->g:[B

    if-nez v1, :cond_6

    const/16 v1, 0x1001

    new-array v1, v1, [B

    iput-object v1, v0, Lcom/daaw/r60;->g:[B

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/r60;->k()I

    move-result v1

    const/4 v4, 0x1

    shl-int v5, v4, v1

    add-int/lit8 v6, v5, 0x1

    add-int/lit8 v7, v5, 0x2

    add-int/2addr v1, v4

    shl-int v8, v4, v1

    sub-int/2addr v8, v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v5, :cond_7

    iget-object v11, v0, Lcom/daaw/r60;->e:[S

    aput-short v9, v11, v10

    iget-object v11, v0, Lcom/daaw/r60;->f:[B

    int-to-byte v12, v10

    aput-byte v12, v11, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_7
    const/4 v10, -0x1

    move/from16 v19, v1

    move/from16 v17, v7

    move/from16 v18, v8

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v20, -0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_2
    if-ge v11, v2, :cond_14

    const/4 v9, 0x3

    if-nez v12, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/r60;->l()I

    move-result v12

    if-gtz v12, :cond_8

    iput v9, v0, Lcom/daaw/r60;->p:I

    goto/16 :goto_8

    :cond_8
    const/4 v13, 0x0

    :cond_9
    iget-object v3, v0, Lcom/daaw/r60;->d:[B

    aget-byte v3, v3, v13

    and-int/lit16 v3, v3, 0xff

    shl-int/2addr v3, v14

    add-int/2addr v15, v3

    add-int/lit8 v14, v14, 0x8

    add-int/2addr v13, v4

    add-int/2addr v12, v10

    move/from16 v3, v17

    move/from16 v4, v19

    move/from16 v23, v20

    move/from16 v24, v21

    :goto_3
    if-lt v14, v4, :cond_13

    and-int v10, v15, v18

    shr-int/2addr v15, v4

    sub-int/2addr v14, v4

    if-ne v10, v5, :cond_a

    move v4, v1

    move v3, v7

    move/from16 v18, v8

    const/4 v10, -0x1

    const/16 v23, -0x1

    goto :goto_3

    :cond_a
    if-le v10, v3, :cond_b

    iput v9, v0, Lcom/daaw/r60;->p:I

    goto :goto_4

    :cond_b
    if-ne v10, v6, :cond_c

    :goto_4
    move/from16 v17, v3

    move/from16 v19, v4

    move/from16 v20, v23

    move/from16 v21, v24

    const/16 v3, 0x1000

    const/4 v4, 0x1

    const/4 v9, 0x0

    const/4 v10, -0x1

    goto :goto_2

    :cond_c
    move/from16 v19, v1

    move/from16 v9, v23

    const/4 v1, -0x1

    if-ne v9, v1, :cond_d

    iget-object v9, v0, Lcom/daaw/r60;->g:[B

    add-int/lit8 v21, v22, 0x1

    iget-object v1, v0, Lcom/daaw/r60;->f:[B

    aget-byte v1, v1, v10

    aput-byte v1, v9, v22

    move/from16 v23, v10

    move/from16 v24, v23

    move/from16 v1, v19

    move/from16 v22, v21

    const/4 v9, 0x3

    const/4 v10, -0x1

    goto :goto_3

    :cond_d
    if-lt v10, v3, :cond_e

    iget-object v1, v0, Lcom/daaw/r60;->g:[B

    add-int/lit8 v21, v22, 0x1

    move/from16 v25, v6

    move/from16 v6, v24

    int-to-byte v6, v6

    aput-byte v6, v1, v22

    move v1, v9

    move/from16 v22, v21

    goto :goto_5

    :cond_e
    move/from16 v25, v6

    move v1, v10

    :goto_5
    if-lt v1, v5, :cond_f

    iget-object v6, v0, Lcom/daaw/r60;->g:[B

    add-int/lit8 v21, v22, 0x1

    move/from16 v24, v5

    iget-object v5, v0, Lcom/daaw/r60;->f:[B

    aget-byte v5, v5, v1

    aput-byte v5, v6, v22

    iget-object v5, v0, Lcom/daaw/r60;->e:[S

    aget-short v1, v5, v1

    move/from16 v22, v21

    move/from16 v5, v24

    goto :goto_5

    :cond_f
    move/from16 v24, v5

    iget-object v5, v0, Lcom/daaw/r60;->f:[B

    aget-byte v1, v5, v1

    and-int/lit16 v1, v1, 0xff

    iget-object v6, v0, Lcom/daaw/r60;->g:[B

    add-int/lit8 v21, v22, 0x1

    move/from16 v26, v7

    int-to-byte v7, v1

    aput-byte v7, v6, v22

    const/16 v6, 0x1000

    if-ge v3, v6, :cond_10

    iget-object v6, v0, Lcom/daaw/r60;->e:[S

    int-to-short v9, v9

    aput-short v9, v6, v3

    aput-byte v7, v5, v3

    add-int/lit8 v3, v3, 0x1

    and-int v5, v3, v18

    if-nez v5, :cond_10

    const/16 v5, 0x1000

    if-ge v3, v5, :cond_11

    add-int/lit8 v4, v4, 0x1

    add-int v18, v18, v3

    goto :goto_6

    :cond_10
    const/16 v5, 0x1000

    :cond_11
    :goto_6
    move/from16 v22, v21

    :goto_7
    if-lez v22, :cond_12

    add-int/lit8 v22, v22, -0x1

    iget-object v6, v0, Lcom/daaw/r60;->h:[B

    add-int/lit8 v7, v16, 0x1

    iget-object v9, v0, Lcom/daaw/r60;->g:[B

    aget-byte v9, v9, v22

    aput-byte v9, v6, v16

    add-int/lit8 v11, v11, 0x1

    move/from16 v16, v7

    goto :goto_7

    :cond_12
    move/from16 v23, v10

    move/from16 v5, v24

    move/from16 v6, v25

    move/from16 v7, v26

    const/4 v9, 0x3

    const/4 v10, -0x1

    move/from16 v24, v1

    move/from16 v1, v19

    goto/16 :goto_3

    :cond_13
    move/from16 v25, v6

    move/from16 v9, v23

    move/from16 v6, v24

    move/from16 v17, v3

    move/from16 v19, v4

    move/from16 v21, v6

    move/from16 v20, v9

    move/from16 v6, v25

    const/16 v3, 0x1000

    const/4 v4, 0x1

    const/4 v9, 0x0

    goto/16 :goto_2

    :cond_14
    :goto_8
    move/from16 v1, v16

    :goto_9
    if-ge v1, v2, :cond_15

    iget-object v3, v0, Lcom/daaw/r60;->h:[B

    const/4 v4, 0x0

    aput-byte v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_15
    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/daaw/r60;->j:I

    return v0
.end method

.method public e(I)I
    .locals 2

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v1, v0, Lcom/daaw/a70;->c:I

    if-ge p1, v1, :cond_0

    iget-object v0, v0, Lcom/daaw/a70;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/w60;

    iget p1, p1, Lcom/daaw/w60;->i:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v0, v0, Lcom/daaw/a70;->c:I

    return v0
.end method

.method public final g()Landroid/graphics/Bitmap;
    .locals 4

    iget-object v0, p0, Lcom/daaw/r60;->m:Lcom/daaw/r60$a;

    iget-object v1, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v2, v1, Lcom/daaw/a70;->f:I

    iget v1, v1, Lcom/daaw/a70;->g:I

    sget-object v3, Lcom/daaw/r60;->r:Landroid/graphics/Bitmap$Config;

    invoke-interface {v0, v2, v1, v3}, Lcom/daaw/r60$a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v1, v0, Lcom/daaw/a70;->f:I

    iget v0, v0, Lcom/daaw/a70;->g:I

    invoke-static {v1, v0, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lcom/daaw/r60;->n(Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v0, v0, Lcom/daaw/a70;->c:I

    if-lez v0, :cond_1

    iget v0, p0, Lcom/daaw/r60;->j:I

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/r60;->e(I)I

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, -0x1

    return v0
.end method

.method public declared-synchronized i()Landroid/graphics/Bitmap;
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v0, v0, Lcom/daaw/a70;->c:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-lez v0, :cond_0

    iget v0, p0, Lcom/daaw/r60;->j:I

    if-gez v0, :cond_2

    :cond_0
    sget-object v0, Lcom/daaw/r60;->q:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unable to decode frame, frameCount="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v3, v3, Lcom/daaw/a70;->c:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " framePointer="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/daaw/r60;->j:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_1
    iput v2, p0, Lcom/daaw/r60;->p:I

    :cond_2
    iget v0, p0, Lcom/daaw/r60;->p:I

    const/4 v3, 0x0

    if-eq v0, v2, :cond_8

    const/4 v4, 0x2

    if-ne v0, v4, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/r60;->p:I

    iget-object v4, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget-object v4, v4, Lcom/daaw/a70;->e:Ljava/util/List;

    iget v5, p0, Lcom/daaw/r60;->j:I

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/w60;

    iget v5, p0, Lcom/daaw/r60;->j:I

    sub-int/2addr v5, v2

    if-ltz v5, :cond_4

    iget-object v6, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget-object v6, v6, Lcom/daaw/a70;->e:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/w60;

    goto :goto_0

    :cond_4
    move-object v5, v3

    :goto_0
    iget-object v6, v4, Lcom/daaw/w60;->k:[I

    if-eqz v6, :cond_5

    goto :goto_1

    :cond_5
    iget-object v6, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget-object v6, v6, Lcom/daaw/a70;->a:[I

    :goto_1
    iput-object v6, p0, Lcom/daaw/r60;->a:[I

    if-nez v6, :cond_6

    sget-object v0, Lcom/daaw/r60;->q:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iput v2, p0, Lcom/daaw/r60;->p:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v3

    :cond_6
    :try_start_1
    iget-boolean v1, v4, Lcom/daaw/w60;->f:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/daaw/r60;->b:[I

    array-length v2, v6

    invoke-static {v6, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lcom/daaw/r60;->b:[I

    iput-object v1, p0, Lcom/daaw/r60;->a:[I

    iget v2, v4, Lcom/daaw/w60;->h:I

    aput v0, v1, v2

    :cond_7
    invoke-virtual {p0, v4, v5}, Lcom/daaw/r60;->p(Lcom/daaw/w60;Lcom/daaw/w60;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_8
    :goto_2
    :try_start_2
    sget-object v0, Lcom/daaw/r60;->q:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to decode frame, status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/r60;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_9
    monitor-exit p0

    return-object v3

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public j()I
    .locals 3

    iget-object v0, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v0, v0, Lcom/daaw/a70;->m:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final k()I
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/r60;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/r60;->p:I

    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()I
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/r60;->k()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    :goto_0
    if-ge v1, v0, :cond_0

    sub-int v2, v0, v1

    :try_start_0
    iget-object v3, p0, Lcom/daaw/r60;->c:Ljava/nio/ByteBuffer;

    iget-object v4, p0, Lcom/daaw/r60;->d:[B

    invoke-virtual {v3, v4, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v1, v2

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/r60;->p:I

    :cond_0
    return v1
.end method

.method public m()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/r60;->j:I

    return-void
.end method

.method public o(Lcom/daaw/a70;[B)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iput-object p2, p0, Lcom/daaw/r60;->k:[B

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/r60;->p:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/r60;->j:I

    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/r60;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iget-object p2, p0, Lcom/daaw/r60;->c:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iput-boolean v0, p0, Lcom/daaw/r60;->o:Z

    iget-object p2, p1, Lcom/daaw/a70;->e:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/w60;

    iget v0, v0, Lcom/daaw/w60;->g:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/daaw/r60;->o:Z

    :cond_1
    iget p2, p1, Lcom/daaw/a70;->f:I

    iget p1, p1, Lcom/daaw/a70;->g:I

    mul-int v0, p2, p1

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/r60;->h:[B

    mul-int p2, p2, p1

    new-array p1, p2, [I

    iput-object p1, p0, Lcom/daaw/r60;->i:[I

    return-void
.end method

.method public final p(Lcom/daaw/w60;Lcom/daaw/w60;)Landroid/graphics/Bitmap;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v12, v3, Lcom/daaw/a70;->f:I

    iget v3, v3, Lcom/daaw/a70;->g:I

    iget-object v13, v0, Lcom/daaw/r60;->i:[I

    const/4 v14, 0x0

    if-nez v2, :cond_0

    invoke-static {v13, v14}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    const/4 v15, 0x3

    const/4 v11, 0x2

    if-eqz v2, :cond_5

    iget v4, v2, Lcom/daaw/w60;->g:I

    if-lez v4, :cond_5

    if-ne v4, v11, :cond_4

    iget-boolean v4, v1, Lcom/daaw/w60;->f:Z

    if-nez v4, :cond_1

    iget-object v4, v0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v5, v4, Lcom/daaw/a70;->l:I

    iget-object v6, v1, Lcom/daaw/w60;->k:[I

    if-eqz v6, :cond_2

    iget v4, v4, Lcom/daaw/a70;->j:I

    iget v6, v1, Lcom/daaw/w60;->h:I

    if-ne v4, v6, :cond_2

    :cond_1
    const/4 v5, 0x0

    :cond_2
    iget v4, v2, Lcom/daaw/w60;->b:I

    mul-int v4, v4, v12

    iget v6, v2, Lcom/daaw/w60;->a:I

    add-int/2addr v4, v6

    iget v6, v2, Lcom/daaw/w60;->d:I

    mul-int v6, v6, v12

    add-int/2addr v6, v4

    :goto_0
    if-ge v4, v6, :cond_5

    iget v7, v2, Lcom/daaw/w60;->c:I

    add-int/2addr v7, v4

    move v8, v4

    :goto_1
    if-ge v8, v7, :cond_3

    aput v5, v13, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    add-int/2addr v4, v12

    goto :goto_0

    :cond_4
    if-ne v4, v15, :cond_5

    iget-object v4, v0, Lcom/daaw/r60;->n:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_5

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v13

    move v7, v12

    move v10, v12

    const/4 v2, 0x2

    move v11, v3

    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    goto :goto_2

    :cond_5
    const/4 v2, 0x2

    :goto_2
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/r60;->c(Lcom/daaw/w60;)V

    const/16 v4, 0x8

    const/4 v11, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    :goto_3
    iget v7, v1, Lcom/daaw/w60;->d:I

    if-ge v14, v7, :cond_e

    iget-boolean v8, v1, Lcom/daaw/w60;->e:Z

    if-eqz v8, :cond_a

    const/4 v8, 0x4

    if-lt v5, v7, :cond_9

    add-int/lit8 v6, v6, 0x1

    if-eq v6, v2, :cond_8

    if-eq v6, v15, :cond_7

    if-eq v6, v8, :cond_6

    goto :goto_4

    :cond_6
    const/4 v4, 0x2

    const/4 v5, 0x1

    goto :goto_4

    :cond_7
    const/4 v4, 0x4

    const/4 v5, 0x2

    goto :goto_4

    :cond_8
    const/4 v5, 0x4

    :cond_9
    :goto_4
    add-int v7, v5, v4

    goto :goto_5

    :cond_a
    move v7, v5

    move v5, v14

    :goto_5
    iget v8, v1, Lcom/daaw/w60;->b:I

    add-int/2addr v5, v8

    iget-object v8, v0, Lcom/daaw/r60;->l:Lcom/daaw/a70;

    iget v9, v8, Lcom/daaw/a70;->g:I

    if-ge v5, v9, :cond_d

    iget v8, v8, Lcom/daaw/a70;->f:I

    mul-int v5, v5, v8

    iget v9, v1, Lcom/daaw/w60;->a:I

    add-int/2addr v9, v5

    iget v10, v1, Lcom/daaw/w60;->c:I

    add-int v2, v9, v10

    add-int v15, v5, v8

    if-ge v15, v2, :cond_b

    add-int v2, v5, v8

    :cond_b
    mul-int v10, v10, v14

    :goto_6
    if-ge v9, v2, :cond_d

    iget-object v5, v0, Lcom/daaw/r60;->h:[B

    add-int/lit8 v8, v10, 0x1

    aget-byte v5, v5, v10

    and-int/lit16 v5, v5, 0xff

    iget-object v10, v0, Lcom/daaw/r60;->a:[I

    aget v5, v10, v5

    if-eqz v5, :cond_c

    aput v5, v13, v9

    :cond_c
    add-int/lit8 v9, v9, 0x1

    move v10, v8

    goto :goto_6

    :cond_d
    add-int/lit8 v14, v14, 0x1

    move v5, v7

    const/4 v2, 0x2

    const/4 v15, 0x3

    goto :goto_3

    :cond_e
    iget-boolean v2, v0, Lcom/daaw/r60;->o:Z

    if-eqz v2, :cond_11

    iget v1, v1, Lcom/daaw/w60;->g:I

    if-eqz v1, :cond_f

    if-ne v1, v11, :cond_11

    :cond_f
    iget-object v1, v0, Lcom/daaw/r60;->n:Landroid/graphics/Bitmap;

    if-nez v1, :cond_10

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/r60;->g()Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/r60;->n:Landroid/graphics/Bitmap;

    :cond_10
    iget-object v4, v0, Lcom/daaw/r60;->n:Landroid/graphics/Bitmap;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v13

    move v7, v12

    move v10, v12

    move v11, v3

    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/r60;->g()Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v1

    move-object v5, v13

    move v7, v12

    move v10, v12

    move v11, v3

    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v1
.end method
