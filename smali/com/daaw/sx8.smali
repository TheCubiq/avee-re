.class public final Lcom/daaw/sx8;
.super Lcom/daaw/hp8;
.source ""


# static fields
.field public static final v1:[I

.field public static w1:Z

.field public static x1:Z


# instance fields
.field public final Q0:Landroid/content/Context;

.field public final R0:Lcom/daaw/cy8;

.field public final S0:Lcom/daaw/vy8;

.field public final T0:Z

.field public U0:Lcom/daaw/rx8;

.field public V0:Z

.field public W0:Z

.field public X0:Landroid/view/Surface;

.field public Y0:Lcom/google/android/gms/internal/ads/zzxk;

.field public Z0:Z

.field public a1:I

.field public b1:Z

.field public c1:Z

.field public d1:Z

.field public e1:J

.field public f1:J

.field public g1:J

.field public h1:I

.field public i1:I

.field public j1:I

.field public k1:J

.field public l1:J

.field public m1:J

.field public n1:I

.field public o1:I

.field public p1:I

.field public q1:I

.field public r1:F

.field public s1:Lcom/daaw/ll4;

.field public t1:I

.field public u1:Lcom/daaw/vx8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/sx8;->v1:[I

    return-void

    :array_0
    .array-data 4
        0x780
        0x640
        0x5a0
        0x500
        0x3c0
        0x356
        0x280
        0x21c
        0x1e0
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ap8;Lcom/daaw/jp8;JZLandroid/os/Handler;Lcom/daaw/wy8;IF)V
    .locals 7

    move-object v6, p0

    const/4 v1, 0x2

    const/4 v4, 0x0

    const/high16 v5, 0x41f00000    # 30.0f

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/hp8;-><init>(ILcom/daaw/ap8;Lcom/daaw/jp8;ZF)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, v6, Lcom/daaw/sx8;->Q0:Landroid/content/Context;

    new-instance v1, Lcom/daaw/cy8;

    invoke-direct {v1, v0}, Lcom/daaw/cy8;-><init>(Landroid/content/Context;)V

    iput-object v1, v6, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    new-instance v0, Lcom/daaw/vy8;

    move-object v1, p7

    move-object v2, p8

    invoke-direct {v0, p7, p8}, Lcom/daaw/vy8;-><init>(Landroid/os/Handler;Lcom/daaw/wy8;)V

    iput-object v0, v6, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    sget-object v0, Lcom/daaw/it5;->c:Ljava/lang/String;

    const-string v1, "NVIDIA"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, v6, Lcom/daaw/sx8;->T0:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, v6, Lcom/daaw/sx8;->f1:J

    const/4 v0, -0x1

    iput v0, v6, Lcom/daaw/sx8;->o1:I

    iput v0, v6, Lcom/daaw/sx8;->p1:I

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, v6, Lcom/daaw/sx8;->r1:F

    const/4 v0, 0x1

    iput v0, v6, Lcom/daaw/sx8;->a1:I

    const/4 v0, 0x0

    iput v0, v6, Lcom/daaw/sx8;->t1:I

    const/4 v0, 0x0

    iput-object v0, v6, Lcom/daaw/sx8;->s1:Lcom/daaw/ll4;

    return-void
.end method

.method public static A0(Landroid/content/Context;Lcom/daaw/jp8;Lcom/daaw/f92;ZZ)Ljava/util/List;
    .locals 1

    iget-object p1, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    if-nez p1, :cond_0

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1, p3, p4}, Lcom/daaw/hq8;->f(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {p2}, Lcom/daaw/hq8;->e(Lcom/daaw/f92;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lcom/daaw/y17;->s(Ljava/util/Collection;)Lcom/daaw/y17;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {v0, p3, p4}, Lcom/daaw/hq8;->f(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p3

    sget p4, Lcom/daaw/it5;->a:I

    const/16 v0, 0x1a

    if-lt p4, v0, :cond_2

    iget-object p2, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string p4, "video/dolby-vision"

    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p0}, Lcom/daaw/qx8;->a(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-static {p3}, Lcom/daaw/y17;->s(Ljava/util/Collection;)Lcom/daaw/y17;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {}, Lcom/daaw/y17;->o()Lcom/daaw/v17;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/daaw/v17;->g(Ljava/lang/Iterable;)Lcom/daaw/v17;

    invoke-virtual {p0, p3}, Lcom/daaw/v17;->g(Ljava/lang/Iterable;)Lcom/daaw/v17;

    invoke-virtual {p0}, Lcom/daaw/v17;->h()Lcom/daaw/y17;

    move-result-object p0

    return-object p0
.end method

.method public static E0(J)Z
    .locals 3

    const-wide/16 v0, -0x7530

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static w0(Lcom/daaw/ep8;Lcom/daaw/f92;)I
    .locals 10

    iget v0, p1, Lcom/daaw/f92;->q:I

    iget v1, p1, Lcom/daaw/f92;->r:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_7

    if-ne v1, v2, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v3, p1, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v4, "video/dolby-vision"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x1

    const-string v7, "video/avc"

    const-string v8, "video/hevc"

    if-eqz v4, :cond_3

    invoke-static {p1}, Lcom/daaw/hq8;->b(Lcom/daaw/f92;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v3, 0x200

    if-eq p1, v3, :cond_1

    if-eq p1, v6, :cond_1

    if-ne p1, v5, :cond_2

    :cond_1
    move-object v3, v7

    goto :goto_0

    :cond_2
    move-object v3, v8

    :cond_3
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result p1

    const/4 v4, 0x3

    const/4 v9, 0x4

    sparse-switch p1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string p1, "video/x-vnd.on2.vp9"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v5, 0x6

    goto :goto_2

    :sswitch_1
    const-string p1, "video/x-vnd.on2.vp8"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v5, 0x3

    goto :goto_2

    :sswitch_2
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v5, 0x5

    goto :goto_2

    :sswitch_3
    const-string p1, "video/mp4v-es"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :sswitch_4
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v5, 0x4

    goto :goto_2

    :sswitch_5
    const-string p1, "video/av01"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :sswitch_6
    const-string p1, "video/3gpp"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v5, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v5, -0x1

    :goto_2
    packed-switch v5, :pswitch_data_0

    return v2

    :pswitch_0
    mul-int v0, v0, v1

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x8

    return v0

    :pswitch_1
    sget-object p1, Lcom/daaw/it5;->d:Ljava/lang/String;

    const-string v3, "BRAVIA 4K 2015"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    sget-object v3, Lcom/daaw/it5;->c:Ljava/lang/String;

    const-string v4, "Amazon"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "KFSOWI"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "AFTS"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-boolean p0, p0, Lcom/daaw/ep8;->f:Z

    if-eqz p0, :cond_5

    goto :goto_3

    :cond_5
    const/16 p0, 0x10

    invoke-static {v0, p0}, Lcom/daaw/it5;->O(II)I

    move-result p1

    invoke-static {v1, p0}, Lcom/daaw/it5;->O(II)I

    move-result p0

    mul-int p1, p1, p0

    mul-int/lit16 p1, p1, 0x300

    div-int/2addr p1, v9

    return p1

    :cond_6
    :goto_3
    return v2

    :pswitch_2
    const/high16 p0, 0x200000

    mul-int v0, v0, v1

    mul-int/lit8 v0, v0, 0x3

    div-int/2addr v0, v9

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    :pswitch_3
    mul-int v0, v0, v1

    mul-int/lit8 v0, v0, 0x3

    div-int/2addr v0, v9

    return v0

    :cond_7
    :goto_4
    return v2

    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_6
        -0x631b55f6 -> :sswitch_5
        -0x63185e82 -> :sswitch_4
        0x46cdc642 -> :sswitch_3
        0x4f62373a -> :sswitch_2
        0x5f50bed8 -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static x0(Lcom/daaw/ep8;Lcom/daaw/f92;)I
    .locals 3

    iget v0, p1, Lcom/daaw/f92;->m:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object p0, p1, Lcom/daaw/f92;->n:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p0, :cond_0

    iget-object v2, p1, Lcom/daaw/f92;->n:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    array-length v2, v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget p0, p1, Lcom/daaw/f92;->m:I

    add-int/2addr p0, v1

    return p0

    :cond_1
    invoke-static {p0, p1}, Lcom/daaw/sx8;->w0(Lcom/daaw/ep8;Lcom/daaw/f92;)I

    move-result p0

    return p0
.end method

.method public static final z0(Ljava/lang/String;)Z
    .locals 17

    const-string v0, "OMX.google"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-class v2, Lcom/daaw/sx8;

    monitor-enter v2

    :try_start_0
    sget-boolean v0, Lcom/daaw/sx8;->w1:Z

    if-nez v0, :cond_a

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v3, 0x1c

    const/4 v4, 0x5

    const/4 v5, 0x6

    const/4 v6, 0x4

    const/4 v7, 0x7

    const/4 v8, 0x2

    const/4 v9, 0x3

    const/4 v10, -0x1

    const/4 v11, 0x1

    if-gt v0, v3, :cond_3

    sget-object v12, Lcom/daaw/it5;->b:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sparse-switch v13, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v13, "machuca"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x5

    goto :goto_1

    :sswitch_1
    const-string v13, "once"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x6

    goto :goto_1

    :sswitch_2
    const-string v13, "magnolia"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x4

    goto :goto_1

    :sswitch_3
    const-string v13, "aquaman"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x0

    goto :goto_1

    :sswitch_4
    const-string v13, "oneday"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x7

    goto :goto_1

    :sswitch_5
    const-string v13, "dangalUHD"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x2

    goto :goto_1

    :sswitch_6
    const-string v13, "dangalFHD"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x3

    goto :goto_1

    :sswitch_7
    const-string v13, "dangal"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v12, -0x1

    :goto_1
    packed-switch v12, :pswitch_data_0

    goto :goto_3

    :cond_2
    :goto_2
    :pswitch_0
    const/4 v1, 0x1

    goto/16 :goto_9

    :cond_3
    :goto_3
    const/16 v12, 0x1b

    if-gt v0, v12, :cond_4

    :try_start_1
    const-string v13, "HWEML"

    sget-object v14, Lcom/daaw/it5;->b:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    sget-object v13, Lcom/daaw/it5;->d:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v15, 0x8

    sparse-switch v14, :sswitch_data_1

    goto :goto_4

    :sswitch_8
    const-string v14, "AFTEUFF014"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/4 v14, 0x5

    goto :goto_5

    :sswitch_9
    const-string v14, "AFTSO001"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/16 v14, 0x8

    goto :goto_5

    :sswitch_a
    const-string v14, "AFTEU014"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/4 v14, 0x4

    goto :goto_5

    :sswitch_b
    const-string v14, "AFTEU011"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/4 v14, 0x3

    goto :goto_5

    :sswitch_c
    const-string v14, "AFTR"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/4 v14, 0x2

    goto :goto_5

    :sswitch_d
    const-string v14, "AFTN"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/4 v14, 0x1

    goto :goto_5

    :sswitch_e
    const-string v14, "AFTA"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/4 v14, 0x0

    goto :goto_5

    :sswitch_f
    const-string v14, "AFTKMST12"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/4 v14, 0x7

    goto :goto_5

    :sswitch_10
    const-string v14, "AFTJMST12"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/4 v14, 0x6

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v14, -0x1

    :goto_5
    packed-switch v14, :pswitch_data_1

    const/16 v14, 0x1a

    if-gt v0, v14, :cond_9

    :try_start_2
    sget-object v0, Lcom/daaw/it5;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sparse-switch v16, :sswitch_data_2

    goto/16 :goto_6

    :sswitch_11
    const-string v3, "HWWAS-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x42

    goto/16 :goto_7

    :sswitch_12
    const-string v3, "HWVNS-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x41

    goto/16 :goto_7

    :sswitch_13
    const-string v3, "ELUGA_Prim"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x21

    goto/16 :goto_7

    :sswitch_14
    const-string v3, "ELUGA_Note"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x20

    goto/16 :goto_7

    :sswitch_15
    const-string v3, "ASUS_X00AD_2"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0xe

    goto/16 :goto_7

    :sswitch_16
    const-string v3, "HWCAM-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x40

    goto/16 :goto_7

    :sswitch_17
    const-string v3, "HWBLN-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x3f

    goto/16 :goto_7

    :sswitch_18
    const-string v3, "DM-01K"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x1d

    goto/16 :goto_7

    :sswitch_19
    const-string v3, "BRAVIA_ATV3_4K"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x13

    goto/16 :goto_7

    :sswitch_1a
    const-string v3, "Infinix-X572"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x45

    goto/16 :goto_7

    :sswitch_1b
    const-string v3, "PB2-670M"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x64

    goto/16 :goto_7

    :sswitch_1c
    const-string v3, "santoni"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x75

    goto/16 :goto_7

    :sswitch_1d
    const-string v3, "iball8735_9806"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x44

    goto/16 :goto_7

    :sswitch_1e
    const-string v3, "CPH1715"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x18

    goto/16 :goto_7

    :sswitch_1f
    const-string v3, "CPH1609"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x17

    goto/16 :goto_7

    :sswitch_20
    const-string v3, "woods_f"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x85

    goto/16 :goto_7

    :sswitch_21
    const-string v3, "htc_e56ml_dtul"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x3d

    goto/16 :goto_7

    :sswitch_22
    const-string v3, "EverStar_S"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x23

    goto/16 :goto_7

    :sswitch_23
    const-string v3, "hwALE-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x3e

    goto/16 :goto_7

    :sswitch_24
    const-string v3, "itel_S41"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x47

    goto/16 :goto_7

    :sswitch_25
    const-string v3, "LS-5017"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x4e

    goto/16 :goto_7

    :sswitch_26
    const-string v3, "panell_d"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x60

    goto/16 :goto_7

    :sswitch_27
    const-string v3, "j2xlteins"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x48

    goto/16 :goto_7

    :sswitch_28
    const-string v3, "A7000plus"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0xa

    goto/16 :goto_7

    :sswitch_29
    const-string v3, "manning"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x51

    goto/16 :goto_7

    :sswitch_2a
    const-string v3, "GIONEE_WBL7519"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x3b

    goto/16 :goto_7

    :sswitch_2b
    const-string v3, "GIONEE_WBL7365"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x3a

    goto/16 :goto_7

    :sswitch_2c
    const-string v3, "GIONEE_WBL5708"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x39

    goto/16 :goto_7

    :sswitch_2d
    const-string v3, "QM16XE_U"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x72

    goto/16 :goto_7

    :sswitch_2e
    const-string v3, "Pixi5-10_4G"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x6a

    goto/16 :goto_7

    :sswitch_2f
    const-string v3, "TB3-850M"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x7d

    goto/16 :goto_7

    :sswitch_30
    const-string v3, "TB3-850F"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x7c

    goto/16 :goto_7

    :sswitch_31
    const-string v3, "TB3-730X"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x7b

    goto/16 :goto_7

    :sswitch_32
    const-string v3, "TB3-730F"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x7a

    goto/16 :goto_7

    :sswitch_33
    const-string v3, "A7020a48"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0xc

    goto/16 :goto_7

    :sswitch_34
    const-string v3, "A7010a48"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0xb

    goto/16 :goto_7

    :sswitch_35
    const-string v3, "griffin"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x3c

    goto/16 :goto_7

    :sswitch_36
    const-string v3, "marino_f"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x52

    goto/16 :goto_7

    :sswitch_37
    const-string v3, "CPY83_I00"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x19

    goto/16 :goto_7

    :sswitch_38
    const-string v3, "A2016a40"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x8

    goto/16 :goto_7

    :sswitch_39
    const-string v3, "le_x6"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x4d

    goto/16 :goto_7

    :sswitch_3a
    const-string v3, "l5460"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x4c

    goto/16 :goto_7

    :sswitch_3b
    const-string v3, "i9031"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x43

    goto/16 :goto_7

    :sswitch_3c
    const-string v3, "X3_HK"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x87

    goto/16 :goto_7

    :sswitch_3d
    const-string v3, "V23GB"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x80

    goto/16 :goto_7

    :sswitch_3e
    const-string v3, "Q4310"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x70

    goto/16 :goto_7

    :sswitch_3f
    const-string v3, "Q4260"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x6e

    goto/16 :goto_7

    :sswitch_40
    const-string v3, "PRO7S"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x6c

    goto/16 :goto_7

    :sswitch_41
    const-string v3, "F3311"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x30

    goto/16 :goto_7

    :sswitch_42
    const-string v3, "F3215"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x2f

    goto/16 :goto_7

    :sswitch_43
    const-string v3, "F3213"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x2e

    goto/16 :goto_7

    :sswitch_44
    const-string v3, "F3211"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x2d

    goto/16 :goto_7

    :sswitch_45
    const-string v3, "F3116"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x2c

    goto/16 :goto_7

    :sswitch_46
    const-string v3, "F3113"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x2b

    goto/16 :goto_7

    :sswitch_47
    const-string v3, "F3111"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x2a

    goto/16 :goto_7

    :sswitch_48
    const-string v3, "E5643"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x1e

    goto/16 :goto_7

    :sswitch_49
    const-string v3, "A1601"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x7

    goto/16 :goto_7

    :sswitch_4a
    const-string v3, "Aura_Note_2"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0xf

    goto/16 :goto_7

    :sswitch_4b
    const-string v3, "602LV"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x4

    goto/16 :goto_7

    :sswitch_4c
    const-string v3, "601LV"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x3

    goto/16 :goto_7

    :sswitch_4d
    const-string v3, "MEIZU_M5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x53

    goto/16 :goto_7

    :sswitch_4e
    const-string v3, "p212"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x5c

    goto/16 :goto_7

    :sswitch_4f
    const-string v3, "mido"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x55

    goto/16 :goto_7

    :sswitch_50
    const-string v3, "kate"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x4b

    goto/16 :goto_7

    :sswitch_51
    const-string v3, "fugu"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x32

    goto/16 :goto_7

    :sswitch_52
    const-string v3, "XE2X"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x88

    goto/16 :goto_7

    :sswitch_53
    const-string v3, "Q427"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x6f

    goto/16 :goto_7

    :sswitch_54
    const-string v3, "Q350"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x6d

    goto/16 :goto_7

    :sswitch_55
    const-string v3, "P681"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x5d

    goto/16 :goto_7

    :sswitch_56
    const-string v3, "F04J"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x29

    goto/16 :goto_7

    :sswitch_57
    const-string v3, "F04H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x28

    goto/16 :goto_7

    :sswitch_58
    const-string v3, "F03H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x27

    goto/16 :goto_7

    :sswitch_59
    const-string v3, "F02H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x26

    goto/16 :goto_7

    :sswitch_5a
    const-string v3, "F01J"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x25

    goto/16 :goto_7

    :sswitch_5b
    const-string v3, "F01H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x24

    goto/16 :goto_7

    :sswitch_5c
    const-string v3, "1714"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x2

    goto/16 :goto_7

    :sswitch_5d
    const-string v3, "1713"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x1

    goto/16 :goto_7

    :sswitch_5e
    const-string v3, "1601"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x0

    goto/16 :goto_7

    :sswitch_5f
    const-string v3, "flo"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x31

    goto/16 :goto_7

    :sswitch_60
    const-string v4, "deb"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_7

    :sswitch_61
    const-string v3, "cv3"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x1b

    goto/16 :goto_7

    :sswitch_62
    const-string v3, "cv1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x1a

    goto/16 :goto_7

    :sswitch_63
    const-string v3, "Z80"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x8b

    goto/16 :goto_7

    :sswitch_64
    const-string v3, "QX1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x73

    goto/16 :goto_7

    :sswitch_65
    const-string v3, "PLE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x6b

    goto/16 :goto_7

    :sswitch_66
    const-string v3, "P85"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x5e

    goto/16 :goto_7

    :sswitch_67
    const-string v3, "MX6"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x56

    goto/16 :goto_7

    :sswitch_68
    const-string v3, "M5c"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x50

    goto/16 :goto_7

    :sswitch_69
    const-string v3, "M04"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x4f

    goto/16 :goto_7

    :sswitch_6a
    const-string v3, "JGZ"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x49

    goto/16 :goto_7

    :sswitch_6b
    const-string v3, "mh"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x54

    goto/16 :goto_7

    :sswitch_6c
    const-string v3, "b5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x10

    goto/16 :goto_7

    :sswitch_6d
    const-string v3, "V5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x81

    goto/16 :goto_7

    :sswitch_6e
    const-string v3, "V1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x7f

    goto/16 :goto_7

    :sswitch_6f
    const-string v3, "Q5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x71

    goto/16 :goto_7

    :sswitch_70
    const-string v3, "C1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x14

    goto/16 :goto_7

    :sswitch_71
    const-string v3, "woods_fn"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x86

    goto/16 :goto_7

    :sswitch_72
    const-string v3, "ELUGA_A3_Pro"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x1f

    goto/16 :goto_7

    :sswitch_73
    const-string v3, "Z12_PRO"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x8a

    goto/16 :goto_7

    :sswitch_74
    const-string v3, "BLACK-1X"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x11

    goto/16 :goto_7

    :sswitch_75
    const-string v3, "taido_row"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x79

    goto/16 :goto_7

    :sswitch_76
    const-string v3, "Pixi4-7_3G"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x69

    goto/16 :goto_7

    :sswitch_77
    const-string v3, "GIONEE_GBL7360"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x35

    goto/16 :goto_7

    :sswitch_78
    const-string v3, "GiONEE_CBL7513"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x33

    goto/16 :goto_7

    :sswitch_79
    const-string v3, "OnePlus5T"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x5b

    goto/16 :goto_7

    :sswitch_7a
    const-string v3, "whyred"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x84

    goto/16 :goto_7

    :sswitch_7b
    const-string v3, "watson"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x83

    goto/16 :goto_7

    :sswitch_7c
    const-string v3, "SVP-DTV15"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x77

    goto/16 :goto_7

    :sswitch_7d
    const-string v3, "A7000-a"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x9

    goto/16 :goto_7

    :sswitch_7e
    const-string v3, "nicklaus_f"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x58

    goto/16 :goto_7

    :sswitch_7f
    const-string v3, "tcl_eu"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x7e

    goto/16 :goto_7

    :sswitch_80
    const-string v3, "ELUGA_Ray_X"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x22

    goto/16 :goto_7

    :sswitch_81
    const-string v3, "s905x018"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x78

    goto/16 :goto_7

    :sswitch_82
    const-string v3, "A10-70L"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x6

    goto/16 :goto_7

    :sswitch_83
    const-string v3, "A10-70F"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x5

    goto/16 :goto_7

    :sswitch_84
    const-string v3, "namath"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x57

    goto/16 :goto_7

    :sswitch_85
    const-string v3, "Slate_Pro"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x76

    goto/16 :goto_7

    :sswitch_86
    const-string v3, "iris60"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x46

    goto/16 :goto_7

    :sswitch_87
    const-string v3, "BRAVIA_ATV2"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x12

    goto/16 :goto_7

    :sswitch_88
    const-string v3, "GiONEE_GBL7319"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x34

    goto/16 :goto_7

    :sswitch_89
    const-string v3, "panell_dt"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x63

    goto/16 :goto_7

    :sswitch_8a
    const-string v3, "panell_ds"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x62

    goto/16 :goto_7

    :sswitch_8b
    const-string v3, "panell_dl"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x61

    goto/16 :goto_7

    :sswitch_8c
    const-string v3, "vernee_M5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x82

    goto/16 :goto_7

    :sswitch_8d
    const-string v3, "pacificrim"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x5f

    goto/16 :goto_7

    :sswitch_8e
    const-string v3, "Phantom6"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x68

    goto/16 :goto_7

    :sswitch_8f
    const-string v3, "ComioS1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x15

    goto/16 :goto_7

    :sswitch_90
    const-string v3, "XT1663"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x89

    goto/16 :goto_7

    :sswitch_91
    const-string v3, "RAIJIN"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x74

    goto/16 :goto_7

    :sswitch_92
    const-string v3, "AquaPowerM"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0xd

    goto/16 :goto_7

    :sswitch_93
    const-string v3, "PGN611"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x67

    goto/16 :goto_7

    :sswitch_94
    const-string v3, "PGN610"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x66

    goto :goto_7

    :sswitch_95
    const-string v3, "PGN528"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x65

    goto :goto_7

    :sswitch_96
    const-string v3, "NX573J"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x5a

    goto :goto_7

    :sswitch_97
    const-string v3, "NX541J"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x59

    goto :goto_7

    :sswitch_98
    const-string v3, "CP8676_I02"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x16

    goto :goto_7

    :sswitch_99
    const-string v3, "K50a40"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x4a

    goto :goto_7

    :sswitch_9a
    const-string v3, "GIONEE_SWW1631"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x38

    goto :goto_7

    :sswitch_9b
    const-string v3, "GIONEE_SWW1627"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x37

    goto :goto_7

    :sswitch_9c
    const-string v3, "GIONEE_SWW1609"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v3, 0x36

    goto :goto_7

    :cond_6
    :goto_6
    const/4 v3, -0x1

    :goto_7
    packed-switch v3, :pswitch_data_2

    :try_start_3
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const v3, -0x236fe21d

    if-eq v0, v3, :cond_7

    goto :goto_8

    :cond_7
    const-string v0, "JSN-L21"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v10, 0x0

    :cond_8
    :goto_8
    if-eqz v10, :cond_2

    :cond_9
    :goto_9
    :try_start_4
    sput-boolean v1, Lcom/daaw/sx8;->x1:Z

    sput-boolean v11, Lcom/daaw/sx8;->w1:Z

    :cond_a
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget-boolean v0, Lcom/daaw/sx8;->x1:Z

    return v0

    :catchall_0
    move-exception v0

    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_b

    :goto_a
    throw v0

    :goto_b
    goto :goto_a

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4fd0ea5f -> :sswitch_7
        -0x48b8f57f -> :sswitch_6
        -0x48b8bd30 -> :sswitch_5
        -0x3c588c8a -> :sswitch_4
        -0x2d5172e2 -> :sswitch_3
        -0x3de1850 -> :sswitch_2
        0x341e81 -> :sswitch_1
        0x31316ffa -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x14d76e6c -> :sswitch_10
        -0x132295cd -> :sswitch_f
        0x1e9d52 -> :sswitch_e
        0x1e9d5f -> :sswitch_d
        0x1e9d63 -> :sswitch_c
        0x6a6b6031 -> :sswitch_b
        0x6a6b6034 -> :sswitch_a
        0x6b2deee6 -> :sswitch_9
        0x7e53ab34 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x7fd6c3bd -> :sswitch_9c
        -0x7fd6c381 -> :sswitch_9b
        -0x7fd6c368 -> :sswitch_9a
        -0x7d026749 -> :sswitch_99
        -0x78929d6a -> :sswitch_98
        -0x75f50a1e -> :sswitch_97
        -0x75f4fe9d -> :sswitch_96
        -0x736f875c -> :sswitch_95
        -0x736f83c2 -> :sswitch_94
        -0x736f83c1 -> :sswitch_93
        -0x7327ce1c -> :sswitch_92
        -0x705c574b -> :sswitch_91
        -0x651ebb62 -> :sswitch_90
        -0x6423293b -> :sswitch_8f
        -0x604f5117 -> :sswitch_8e
        -0x5f691e13 -> :sswitch_8d
        -0x5ca40cc4 -> :sswitch_8c
        -0x58520ec1 -> :sswitch_8b
        -0x58520eba -> :sswitch_8a
        -0x58520eb9 -> :sswitch_89
        -0x4eaed329 -> :sswitch_88
        -0x4892fb4f -> :sswitch_87
        -0x465b3df3 -> :sswitch_86
        -0x43e6c939 -> :sswitch_85
        -0x3ec0fcc5 -> :sswitch_84
        -0x3b33cca0 -> :sswitch_83
        -0x3b33cc9a -> :sswitch_82
        -0x398ae3f6 -> :sswitch_81
        -0x391f0fb4 -> :sswitch_80
        -0x346837ae -> :sswitch_7f
        -0x323788e3 -> :sswitch_7e
        -0x30f57652 -> :sswitch_7d
        -0x2f88a116 -> :sswitch_7c
        -0x2f61ed98 -> :sswitch_7b
        -0x2efd0837 -> :sswitch_7a
        -0x2e9e9441 -> :sswitch_79
        -0x2247b8b1 -> :sswitch_78
        -0x1f0fa2b7 -> :sswitch_77
        -0x19af3b41 -> :sswitch_76
        -0x114fad3e -> :sswitch_75
        -0x10dae90b -> :sswitch_74
        -0x1084b7b7 -> :sswitch_73
        -0xa5988e9 -> :sswitch_72
        -0x35f9fbf -> :sswitch_71
        0x84e -> :sswitch_70
        0xa04 -> :sswitch_6f
        0xa9b -> :sswitch_6e
        0xa9f -> :sswitch_6d
        0xc13 -> :sswitch_6c
        0xd9b -> :sswitch_6b
        0x11ebd -> :sswitch_6a
        0x12711 -> :sswitch_69
        0x127db -> :sswitch_68
        0x12beb -> :sswitch_67
        0x1334d -> :sswitch_66
        0x135c9 -> :sswitch_65
        0x13aea -> :sswitch_64
        0x158d2 -> :sswitch_63
        0x1821e -> :sswitch_62
        0x18220 -> :sswitch_61
        0x18401 -> :sswitch_60
        0x18c69 -> :sswitch_5f
        0x1716e6 -> :sswitch_5e
        0x171ac8 -> :sswitch_5d
        0x171ac9 -> :sswitch_5c
        0x208c61 -> :sswitch_5b
        0x208c63 -> :sswitch_5a
        0x208c80 -> :sswitch_59
        0x208c9f -> :sswitch_58
        0x208cbe -> :sswitch_57
        0x208cc0 -> :sswitch_56
        0x252f5f -> :sswitch_55
        0x25981d -> :sswitch_54
        0x259b88 -> :sswitch_53
        0x290a13 -> :sswitch_52
        0x3021fd -> :sswitch_51
        0x321e47 -> :sswitch_50
        0x332327 -> :sswitch_4f
        0x33ab63 -> :sswitch_4e
        0x27691fb -> :sswitch_4d
        0x30f8881 -> :sswitch_4c
        0x30f8c42 -> :sswitch_4b
        0x349f581 -> :sswitch_4a
        0x3ab0ea7 -> :sswitch_49
        0x3e53ea5 -> :sswitch_48
        0x3f25a44 -> :sswitch_47
        0x3f25a46 -> :sswitch_46
        0x3f25a49 -> :sswitch_45
        0x3f25e05 -> :sswitch_44
        0x3f25e07 -> :sswitch_43
        0x3f25e09 -> :sswitch_42
        0x3f261c6 -> :sswitch_41
        0x48dce49 -> :sswitch_40
        0x48dd589 -> :sswitch_3f
        0x48dd8af -> :sswitch_3e
        0x4d36832 -> :sswitch_3d
        0x4f0b0e7 -> :sswitch_3c
        0x5e2479e -> :sswitch_3b
        0x60acc05 -> :sswitch_3a
        0x6214744 -> :sswitch_39
        0x9d91379 -> :sswitch_38
        0xadc0551 -> :sswitch_37
        0xea056b3 -> :sswitch_36
        0x1121dbc3 -> :sswitch_35
        0x1255818c -> :sswitch_34
        0x1263990d -> :sswitch_33
        0x12d90f3a -> :sswitch_32
        0x12d90f4c -> :sswitch_31
        0x12d98b1b -> :sswitch_30
        0x12d98b22 -> :sswitch_2f
        0x1844c711 -> :sswitch_2e
        0x1e3e8044 -> :sswitch_2d
        0x2f5336ed -> :sswitch_2c
        0x2f54115e -> :sswitch_2b
        0x2f541849 -> :sswitch_2a
        0x31cf010e -> :sswitch_29
        0x36ad82f4 -> :sswitch_28
        0x391a0b61 -> :sswitch_27
        0x3f3728cd -> :sswitch_26
        0x448ec687 -> :sswitch_25
        0x46260f63 -> :sswitch_24
        0x4c505106 -> :sswitch_23
        0x4de67084 -> :sswitch_22
        0x506ac5a9 -> :sswitch_21
        0x5abad9cd -> :sswitch_20
        0x64d2e6e9 -> :sswitch_1f
        0x64d2eac5 -> :sswitch_1e
        0x65e4085b -> :sswitch_1d
        0x6f373556 -> :sswitch_1c
        0x719f1dcb -> :sswitch_1b
        0x75d9a0f0 -> :sswitch_1a
        0x7796d144 -> :sswitch_19
        0x785bcb26 -> :sswitch_18
        0x78fc0e50 -> :sswitch_17
        0x790521fb -> :sswitch_16
        0x7933207f -> :sswitch_15
        0x7a05a409 -> :sswitch_14
        0x7a0696bd -> :sswitch_13
        0x7a16dfe7 -> :sswitch_12
        0x7a1f0e95 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final A()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    :try_start_0
    invoke-super {p0}, Lcom/daaw/hp8;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/sx8;->D0()V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/sx8;->D0()V

    :goto_0
    throw v0
.end method

.method public final B()V
    .locals 5

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/sx8;->h1:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/sx8;->g1:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    iput-wide v1, p0, Lcom/daaw/sx8;->l1:J

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/daaw/sx8;->m1:J

    iput v0, p0, Lcom/daaw/sx8;->n1:I

    iget-object v0, p0, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    invoke-virtual {v0}, Lcom/daaw/cy8;->g()V

    return-void
.end method

.method public final B0()V
    .locals 5

    iget v0, p0, Lcom/daaw/sx8;->o1:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/sx8;->p1:I

    if-eq v0, v1, :cond_1

    const/4 v0, -0x1

    :cond_0
    iget-object v1, p0, Lcom/daaw/sx8;->s1:Lcom/daaw/ll4;

    if-eqz v1, :cond_2

    iget v2, v1, Lcom/daaw/ll4;->a:I

    if-ne v2, v0, :cond_2

    iget v2, v1, Lcom/daaw/ll4;->b:I

    iget v3, p0, Lcom/daaw/sx8;->p1:I

    if-ne v2, v3, :cond_2

    iget v2, v1, Lcom/daaw/ll4;->c:I

    iget v3, p0, Lcom/daaw/sx8;->q1:I

    if-ne v2, v3, :cond_2

    iget v1, v1, Lcom/daaw/ll4;->d:F

    iget v2, p0, Lcom/daaw/sx8;->r1:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    new-instance v1, Lcom/daaw/ll4;

    iget v2, p0, Lcom/daaw/sx8;->p1:I

    iget v3, p0, Lcom/daaw/sx8;->q1:I

    iget v4, p0, Lcom/daaw/sx8;->r1:F

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/daaw/ll4;-><init>(IIIF)V

    iput-object v1, p0, Lcom/daaw/sx8;->s1:Lcom/daaw/ll4;

    iget-object v0, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    invoke-virtual {v0, v1}, Lcom/daaw/vy8;->t(Lcom/daaw/ll4;)V

    return-void
.end method

.method public final C()V
    .locals 7

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/sx8;->f1:J

    iget v0, p0, Lcom/daaw/sx8;->h1:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/daaw/sx8;->g1:J

    iget-object v0, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    iget v6, p0, Lcom/daaw/sx8;->h1:I

    sub-long v4, v2, v4

    invoke-virtual {v0, v6, v4, v5}, Lcom/daaw/vy8;->d(IJ)V

    iput v1, p0, Lcom/daaw/sx8;->h1:I

    iput-wide v2, p0, Lcom/daaw/sx8;->g1:J

    :cond_0
    iget v0, p0, Lcom/daaw/sx8;->n1:I

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    iget-wide v3, p0, Lcom/daaw/sx8;->m1:J

    invoke-virtual {v2, v3, v4, v0}, Lcom/daaw/vy8;->r(JI)V

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/sx8;->m1:J

    iput v1, p0, Lcom/daaw/sx8;->n1:I

    :cond_1
    iget-object v0, p0, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    invoke-virtual {v0}, Lcom/daaw/cy8;->h()V

    return-void
.end method

.method public final C0()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/sx8;->s1:Lcom/daaw/ll4;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    invoke-virtual {v1, v0}, Lcom/daaw/vy8;->t(Lcom/daaw/ll4;)V

    :cond_0
    return-void
.end method

.method public final D0()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    iget-object v1, p0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iput-object v2, p0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzxk;->release()V

    iput-object v2, p0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    return-void
.end method

.method public final E(FLcom/daaw/f92;[Lcom/daaw/f92;)F
    .locals 5

    array-length p2, p3

    const/high16 v0, -0x40800000    # -1.0f

    const/4 v1, 0x0

    const/high16 v2, -0x40800000    # -1.0f

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v3, p3, v1

    iget v3, v3, Lcom/daaw/f92;->s:F

    cmpl-float v4, v3, v0

    if-eqz v4, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    cmpl-float p2, v2, v0

    if-nez p2, :cond_2

    return v0

    :cond_2
    mul-float v2, v2, p1

    return v2
.end method

.method public final F(Lcom/daaw/jp8;Lcom/daaw/f92;)I
    .locals 10

    iget-object v0, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/ak3;->h(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x80

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p2, Lcom/daaw/f92;->o:Lcom/google/android/gms/internal/ads/zzx;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v4, p0, Lcom/daaw/sx8;->Q0:Landroid/content/Context;

    invoke-static {v4, p1, p2, v0, v3}, Lcom/daaw/sx8;->A0(Landroid/content/Context;Lcom/daaw/jp8;Lcom/daaw/f92;ZZ)Ljava/util/List;

    move-result-object v4

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v4, p0, Lcom/daaw/sx8;->Q0:Landroid/content/Context;

    invoke-static {v4, p1, p2, v3, v3}, Lcom/daaw/sx8;->A0(Landroid/content/Context;Lcom/daaw/jp8;Lcom/daaw/f92;ZZ)Ljava/util/List;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 p1, 0x81

    return p1

    :cond_3
    invoke-static {p2}, Lcom/daaw/hp8;->r0(Lcom/daaw/f92;)Z

    move-result v5

    if-nez v5, :cond_4

    const/16 p1, 0x82

    return p1

    :cond_4
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/ep8;

    invoke-virtual {v5, p2}, Lcom/daaw/ep8;->d(Lcom/daaw/f92;)Z

    move-result v6

    if-nez v6, :cond_6

    const/4 v7, 0x1

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_6

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/daaw/ep8;

    invoke-virtual {v8, p2}, Lcom/daaw/ep8;->d(Lcom/daaw/f92;)Z

    move-result v9

    if-eqz v9, :cond_5

    move-object v5, v8

    const/4 v4, 0x0

    const/4 v6, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_6
    const/4 v4, 0x1

    :goto_2
    if-eq v2, v6, :cond_7

    const/4 v7, 0x3

    goto :goto_3

    :cond_7
    const/4 v7, 0x4

    :goto_3
    invoke-virtual {v5, p2}, Lcom/daaw/ep8;->e(Lcom/daaw/f92;)Z

    move-result v8

    if-eq v2, v8, :cond_8

    const/16 v8, 0x8

    goto :goto_4

    :cond_8
    const/16 v8, 0x10

    :goto_4
    iget-boolean v5, v5, Lcom/daaw/ep8;->g:Z

    if-eq v2, v5, :cond_9

    const/4 v5, 0x0

    goto :goto_5

    :cond_9
    const/16 v5, 0x40

    :goto_5
    if-eq v2, v4, :cond_a

    const/4 v1, 0x0

    :cond_a
    sget v4, Lcom/daaw/it5;->a:I

    const/16 v9, 0x1a

    if-lt v4, v9, :cond_b

    iget-object v4, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v9, "video/dolby-vision"

    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v4, p0, Lcom/daaw/sx8;->Q0:Landroid/content/Context;

    invoke-static {v4}, Lcom/daaw/qx8;->a(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_b

    const/16 v1, 0x100

    :cond_b
    if-eqz v6, :cond_c

    iget-object v4, p0, Lcom/daaw/sx8;->Q0:Landroid/content/Context;

    invoke-static {v4, p1, p2, v0, v2}, Lcom/daaw/sx8;->A0(Landroid/content/Context;Lcom/daaw/jp8;Lcom/daaw/f92;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-static {p1, p2}, Lcom/daaw/hq8;->g(Ljava/util/List;Lcom/daaw/f92;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ep8;

    invoke-virtual {p1, p2}, Lcom/daaw/ep8;->d(Lcom/daaw/f92;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1, p2}, Lcom/daaw/ep8;->e(Lcom/daaw/f92;)Z

    move-result p1

    if-eqz p1, :cond_c

    const/16 v3, 0x20

    :cond_c
    or-int p1, v7, v8

    or-int/2addr p1, v3

    or-int/2addr p1, v5

    or-int/2addr p1, v1

    return p1
.end method

.method public final F0(Lcom/daaw/ep8;)Z
    .locals 4

    sget v0, Lcom/daaw/it5;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x17

    if-lt v0, v3, :cond_1

    iget-object v0, p1, Lcom/daaw/ep8;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/sx8;->z0(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean p1, p1, Lcom/daaw/ep8;->f:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/sx8;->Q0:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzxk;->b(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

.method public final G(Lcom/daaw/ep8;Lcom/daaw/f92;Lcom/daaw/f92;)Lcom/daaw/tm7;
    .locals 9

    invoke-virtual {p1, p2, p3}, Lcom/daaw/ep8;->b(Lcom/daaw/f92;Lcom/daaw/f92;)Lcom/daaw/tm7;

    move-result-object v0

    iget v1, v0, Lcom/daaw/tm7;->e:I

    iget v2, p3, Lcom/daaw/f92;->q:I

    iget-object v3, p0, Lcom/daaw/sx8;->U0:Lcom/daaw/rx8;

    iget v4, v3, Lcom/daaw/rx8;->a:I

    if-gt v2, v4, :cond_0

    iget v2, p3, Lcom/daaw/f92;->r:I

    iget v3, v3, Lcom/daaw/rx8;->b:I

    if-le v2, v3, :cond_1

    :cond_0
    or-int/lit16 v1, v1, 0x100

    :cond_1
    invoke-static {p1, p3}, Lcom/daaw/sx8;->x0(Lcom/daaw/ep8;Lcom/daaw/f92;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/sx8;->U0:Lcom/daaw/rx8;

    iget v3, v3, Lcom/daaw/rx8;->c:I

    if-le v2, v3, :cond_2

    or-int/lit8 v1, v1, 0x40

    :cond_2
    new-instance v8, Lcom/daaw/tm7;

    iget-object v3, p1, Lcom/daaw/ep8;->a:Ljava/lang/String;

    const/4 p1, 0x0

    if-eqz v1, :cond_3

    move v7, v1

    const/4 v6, 0x0

    goto :goto_0

    :cond_3
    iget v0, v0, Lcom/daaw/tm7;->d:I

    move v6, v0

    const/4 v7, 0x0

    :goto_0
    move-object v2, v8

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lcom/daaw/tm7;-><init>(Ljava/lang/String;Lcom/daaw/f92;Lcom/daaw/f92;II)V

    return-object v8
.end method

.method public final G0(Lcom/daaw/bp8;IJ)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/sx8;->B0()V

    sget p3, Lcom/daaw/it5;->a:I

    const-string p3, "releaseOutputBuffer"

    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 p3, 0x1

    invoke-interface {p1, p2, p3}, Lcom/daaw/bp8;->g(IZ)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    mul-long p1, p1, v0

    iput-wide p1, p0, Lcom/daaw/sx8;->l1:J

    iget-object p1, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget p2, p1, Lcom/daaw/ql7;->e:I

    add-int/2addr p2, p3

    iput p2, p1, Lcom/daaw/ql7;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/sx8;->i1:I

    invoke-virtual {p0}, Lcom/daaw/sx8;->X()V

    return-void
.end method

.method public final H(Lcom/daaw/a78;)Lcom/daaw/tm7;
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/hp8;->H(Lcom/daaw/a78;)Lcom/daaw/tm7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    iget-object p1, p1, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/vy8;->f(Lcom/daaw/f92;Lcom/daaw/tm7;)V

    return-object v0
.end method

.method public final H0(Lcom/daaw/bp8;IJJ)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/sx8;->B0()V

    sget p3, Lcom/daaw/it5;->a:I

    const-string p3, "releaseOutputBuffer"

    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-interface {p1, p2, p5, p6}, Lcom/daaw/bp8;->a(IJ)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 p3, 0x3e8

    mul-long p1, p1, p3

    iput-wide p1, p0, Lcom/daaw/sx8;->l1:J

    iget-object p1, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget p2, p1, Lcom/daaw/ql7;->e:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/daaw/ql7;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/sx8;->i1:I

    invoke-virtual {p0}, Lcom/daaw/sx8;->X()V

    return-void
.end method

.method public final I0(Lcom/daaw/bp8;IJ)V
    .locals 0

    sget p3, Lcom/daaw/it5;->a:I

    const-string p3, "skipVideoBuffer"

    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-interface {p1, p2, p3}, Lcom/daaw/bp8;->g(IZ)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object p1, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget p2, p1, Lcom/daaw/ql7;->f:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/daaw/ql7;->f:I

    return-void
.end method

.method public final J0(II)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget v1, v0, Lcom/daaw/ql7;->h:I

    add-int/2addr v1, p1

    iput v1, v0, Lcom/daaw/ql7;->h:I

    add-int/2addr p1, p2

    iget p2, v0, Lcom/daaw/ql7;->g:I

    add-int/2addr p2, p1

    iput p2, v0, Lcom/daaw/ql7;->g:I

    iget p2, p0, Lcom/daaw/sx8;->h1:I

    add-int/2addr p2, p1

    iput p2, p0, Lcom/daaw/sx8;->h1:I

    iget p2, p0, Lcom/daaw/sx8;->i1:I

    add-int/2addr p2, p1

    iput p2, p0, Lcom/daaw/sx8;->i1:I

    iget p1, v0, Lcom/daaw/ql7;->i:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v0, Lcom/daaw/ql7;->i:I

    return-void
.end method

.method public final K(Lcom/daaw/ep8;Lcom/daaw/f92;Landroid/media/MediaCrypto;F)Lcom/daaw/zo8;
    .locals 20
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    iget-object v4, v0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    if-eqz v4, :cond_0

    iget-boolean v4, v4, Lcom/google/android/gms/internal/ads/zzxk;->p:Z

    iget-boolean v5, v1, Lcom/daaw/ep8;->f:Z

    if-eq v4, v5, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sx8;->D0()V

    :cond_0
    iget-object v4, v1, Lcom/daaw/ep8;->c:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/nk7;->p()[Lcom/daaw/f92;

    move-result-object v5

    iget v6, v2, Lcom/daaw/f92;->q:I

    iget v7, v2, Lcom/daaw/f92;->r:I

    invoke-static/range {p1 .. p2}, Lcom/daaw/sx8;->x0(Lcom/daaw/ep8;Lcom/daaw/f92;)I

    move-result v8

    array-length v9, v5

    const/4 v10, -0x1

    const/4 v13, 0x1

    if-ne v9, v13, :cond_2

    if-eq v8, v10, :cond_1

    invoke-static/range {p1 .. p2}, Lcom/daaw/sx8;->w0(Lcom/daaw/ep8;Lcom/daaw/f92;)I

    move-result v5

    if-eq v5, v10, :cond_1

    int-to-float v8, v8

    const/high16 v9, 0x3fc00000    # 1.5f

    mul-float v8, v8, v9

    float-to-int v8, v8

    invoke-static {v8, v5}, Ljava/lang/Math;->min(II)I

    move-result v8

    :cond_1
    new-instance v5, Lcom/daaw/rx8;

    invoke-direct {v5, v6, v7, v8}, Lcom/daaw/rx8;-><init>(III)V

    goto/16 :goto_a

    :cond_2
    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_0
    if-ge v14, v9, :cond_7

    aget-object v11, v5, v14

    iget-object v12, v2, Lcom/daaw/f92;->x:Lcom/daaw/mo8;

    if-eqz v12, :cond_3

    iget-object v12, v11, Lcom/daaw/f92;->x:Lcom/daaw/mo8;

    if-nez v12, :cond_3

    invoke-virtual {v11}, Lcom/daaw/f92;->b()Lcom/daaw/b72;

    move-result-object v11

    iget-object v12, v2, Lcom/daaw/f92;->x:Lcom/daaw/mo8;

    invoke-virtual {v11, v12}, Lcom/daaw/b72;->g0(Lcom/daaw/mo8;)Lcom/daaw/b72;

    invoke-virtual {v11}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v11

    :cond_3
    invoke-virtual {v1, v2, v11}, Lcom/daaw/ep8;->b(Lcom/daaw/f92;Lcom/daaw/f92;)Lcom/daaw/tm7;

    move-result-object v12

    iget v12, v12, Lcom/daaw/tm7;->d:I

    if-eqz v12, :cond_6

    iget v12, v11, Lcom/daaw/f92;->q:I

    if-eq v12, v10, :cond_5

    iget v13, v11, Lcom/daaw/f92;->r:I

    if-ne v13, v10, :cond_4

    goto :goto_1

    :cond_4
    const/4 v13, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v13, 0x1

    :goto_2
    or-int/2addr v15, v13

    invoke-static {v6, v12}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget v12, v11, Lcom/daaw/f92;->r:I

    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v1, v11}, Lcom/daaw/sx8;->x0(Lcom/daaw/ep8;Lcom/daaw/f92;)I

    move-result v11

    invoke-static {v8, v11}, Ljava/lang/Math;->max(II)I

    move-result v8

    :cond_6
    add-int/lit8 v14, v14, 0x1

    const/4 v13, 0x1

    goto :goto_0

    :cond_7
    if-eqz v15, :cond_13

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Resolutions unknown. Codec max resolution: "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "x"

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v10, "MediaCodecVideoRenderer"

    invoke-static {v10, v5}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget v5, v2, Lcom/daaw/f92;->r:I

    iget v11, v2, Lcom/daaw/f92;->q:I

    if-le v5, v11, :cond_8

    const/4 v12, 0x1

    goto :goto_3

    :cond_8
    const/4 v12, 0x0

    :goto_3
    if-eqz v12, :cond_9

    move v13, v5

    goto :goto_4

    :cond_9
    move v13, v11

    :goto_4
    const/4 v14, 0x1

    if-ne v14, v12, :cond_a

    move v5, v11

    :cond_a
    int-to-float v11, v5

    int-to-float v14, v13

    div-float/2addr v11, v14

    sget-object v14, Lcom/daaw/sx8;->v1:[I

    const/4 v15, 0x0

    :goto_5
    const/16 v3, 0x9

    if-ge v15, v3, :cond_12

    aget v3, v14, v15

    move-object/from16 v16, v14

    int-to-float v14, v3

    mul-float v14, v14, v11

    float-to-int v14, v14

    if-le v3, v13, :cond_12

    if-gt v14, v5, :cond_b

    goto/16 :goto_8

    :cond_b
    move/from16 v17, v5

    sget v5, Lcom/daaw/it5;->a:I

    move/from16 v18, v11

    const/16 v11, 0x15

    if-lt v5, v11, :cond_e

    const/4 v5, 0x1

    if-eq v5, v12, :cond_c

    move v11, v3

    goto :goto_6

    :cond_c
    move v11, v14

    :goto_6
    if-eq v5, v12, :cond_d

    move v3, v14

    :cond_d
    invoke-virtual {v1, v11, v3}, Lcom/daaw/ep8;->a(II)Landroid/graphics/Point;

    move-result-object v3

    iget v5, v2, Lcom/daaw/f92;->s:F

    iget v11, v3, Landroid/graphics/Point;->x:I

    iget v14, v3, Landroid/graphics/Point;->y:I

    move-object/from16 v19, v3

    float-to-double v2, v5

    invoke-virtual {v1, v11, v14, v2, v3}, Lcom/daaw/ep8;->f(IID)Z

    move-result v2

    if-eqz v2, :cond_11

    move-object/from16 v3, v19

    goto :goto_9

    :cond_e
    const/16 v2, 0x10

    :try_start_0
    invoke-static {v3, v2}, Lcom/daaw/it5;->O(II)I

    move-result v3

    mul-int/lit8 v3, v3, 0x10

    invoke-static {v14, v2}, Lcom/daaw/it5;->O(II)I

    move-result v5

    mul-int/lit8 v5, v5, 0x10

    mul-int v2, v3, v5

    invoke-static {}, Lcom/daaw/hq8;->a()I

    move-result v11

    if-gt v2, v11, :cond_11

    new-instance v2, Landroid/graphics/Point;

    const/4 v11, 0x1

    if-eq v11, v12, :cond_f

    move v13, v3

    goto :goto_7

    :cond_f
    move v13, v5

    :goto_7
    if-eq v11, v12, :cond_10

    move v3, v5

    :cond_10
    invoke-direct {v2, v13, v3}, Landroid/graphics/Point;-><init>(II)V
    :try_end_0
    .catch Lcom/daaw/qp8; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v2

    goto :goto_9

    :cond_11
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, p2

    move-object/from16 v14, v16

    move/from16 v5, v17

    move/from16 v11, v18

    goto :goto_5

    :catch_0
    :cond_12
    :goto_8
    const/4 v3, 0x0

    :goto_9
    if-eqz v3, :cond_13

    iget v2, v3, Landroid/graphics/Point;->x:I

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget v2, v3, Landroid/graphics/Point;->y:I

    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/f92;->b()Lcom/daaw/b72;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/daaw/b72;->x(I)Lcom/daaw/b72;

    invoke-virtual {v2, v7}, Lcom/daaw/b72;->f(I)Lcom/daaw/b72;

    invoke-virtual {v2}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/daaw/sx8;->w0(Lcom/daaw/ep8;Lcom/daaw/f92;)I

    move-result v2

    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    move-result v8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Codec max resolution adjusted to: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v2}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_13
    new-instance v5, Lcom/daaw/rx8;

    invoke-direct {v5, v6, v7, v8}, Lcom/daaw/rx8;-><init>(III)V

    :goto_a
    iput-object v5, v0, Lcom/daaw/sx8;->U0:Lcom/daaw/rx8;

    iget-boolean v2, v0, Lcom/daaw/sx8;->T0:Z

    new-instance v3, Landroid/media/MediaFormat;

    invoke-direct {v3}, Landroid/media/MediaFormat;-><init>()V

    const-string v6, "mime"

    invoke-virtual {v3, v6, v4}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, p2

    iget v6, v4, Lcom/daaw/f92;->q:I

    const-string v7, "width"

    invoke-virtual {v3, v7, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget v6, v4, Lcom/daaw/f92;->r:I

    const-string v7, "height"

    invoke-virtual {v3, v7, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object v6, v4, Lcom/daaw/f92;->n:Ljava/util/List;

    invoke-static {v3, v6}, Lcom/daaw/yb5;->b(Landroid/media/MediaFormat;Ljava/util/List;)V

    iget v6, v4, Lcom/daaw/f92;->s:F

    const/high16 v7, -0x40800000    # -1.0f

    cmpl-float v8, v6, v7

    if-eqz v8, :cond_14

    const-string v8, "frame-rate"

    invoke-virtual {v3, v8, v6}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_14
    iget v6, v4, Lcom/daaw/f92;->t:I

    const-string v8, "rotation-degrees"

    invoke-static {v3, v8, v6}, Lcom/daaw/yb5;->a(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    iget-object v6, v4, Lcom/daaw/f92;->x:Lcom/daaw/mo8;

    if-eqz v6, :cond_15

    iget v8, v6, Lcom/daaw/mo8;->c:I

    const-string v9, "color-transfer"

    invoke-static {v3, v9, v8}, Lcom/daaw/yb5;->a(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    iget v8, v6, Lcom/daaw/mo8;->a:I

    const-string v9, "color-standard"

    invoke-static {v3, v9, v8}, Lcom/daaw/yb5;->a(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    iget v8, v6, Lcom/daaw/mo8;->b:I

    const-string v9, "color-range"

    invoke-static {v3, v9, v8}, Lcom/daaw/yb5;->a(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    iget-object v6, v6, Lcom/daaw/mo8;->d:[B

    if-eqz v6, :cond_15

    invoke-static {v6}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v6

    const-string v8, "hdr-static-info"

    invoke-virtual {v3, v8, v6}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    :cond_15
    iget-object v6, v4, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v8, "video/dolby-vision"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-static/range {p2 .. p2}, Lcom/daaw/hq8;->b(Lcom/daaw/f92;)Landroid/util/Pair;

    move-result-object v6

    if-eqz v6, :cond_16

    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const-string v8, "profile"

    invoke-static {v3, v8, v6}, Lcom/daaw/yb5;->a(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    :cond_16
    iget v6, v5, Lcom/daaw/rx8;->a:I

    const-string v8, "max-width"

    invoke-virtual {v3, v8, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget v6, v5, Lcom/daaw/rx8;->b:I

    const-string v8, "max-height"

    invoke-virtual {v3, v8, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget v5, v5, Lcom/daaw/rx8;->c:I

    const-string v6, "max-input-size"

    invoke-static {v3, v6, v5}, Lcom/daaw/yb5;->a(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    sget v5, Lcom/daaw/it5;->a:I

    const/16 v6, 0x17

    if-lt v5, v6, :cond_17

    const-string v5, "priority"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    move/from16 v5, p4

    cmpl-float v6, v5, v7

    if-eqz v6, :cond_17

    const-string v6, "operating-rate"

    invoke-virtual {v3, v6, v5}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_17
    if-eqz v2, :cond_18

    const-string v2, "no-post-process"

    const/4 v5, 0x1

    invoke-virtual {v3, v2, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v2, "auto-frc"

    const/4 v5, 0x0

    invoke-virtual {v3, v2, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_18
    iget-object v2, v0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    if-nez v2, :cond_1b

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/sx8;->F0(Lcom/daaw/ep8;)Z

    move-result v2

    if-eqz v2, :cond_1a

    iget-object v2, v0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    if-nez v2, :cond_19

    iget-object v2, v0, Lcom/daaw/sx8;->Q0:Landroid/content/Context;

    iget-boolean v5, v1, Lcom/daaw/ep8;->f:Z

    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzxk;->a(Landroid/content/Context;Z)Lcom/google/android/gms/internal/ads/zzxk;

    move-result-object v2

    iput-object v2, v0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    :cond_19
    iget-object v2, v0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    iput-object v2, v0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    goto :goto_b

    :cond_1a
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_1b
    :goto_b
    iget-object v2, v0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    const/4 v5, 0x0

    invoke-static {v1, v3, v4, v2, v5}, Lcom/daaw/zo8;->b(Lcom/daaw/ep8;Landroid/media/MediaFormat;Lcom/daaw/f92;Landroid/view/Surface;Landroid/media/MediaCrypto;)Lcom/daaw/zo8;

    move-result-object v1

    return-object v1
.end method

.method public final L(Lcom/daaw/jp8;Lcom/daaw/f92;Z)Ljava/util/List;
    .locals 1

    iget-object p3, p0, Lcom/daaw/sx8;->Q0:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p3, p1, p2, v0, v0}, Lcom/daaw/sx8;->A0(Landroid/content/Context;Lcom/daaw/jp8;Lcom/daaw/f92;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/daaw/hq8;->g(Ljava/util/List;Lcom/daaw/f92;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final M(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecVideoRenderer"

    const-string v1, "Video codec error"

    invoke-static {v0, v1, p1}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    invoke-virtual {v0, p1}, Lcom/daaw/vy8;->s(Ljava/lang/Exception;)V

    return-void
.end method

.method public final N(Ljava/lang/String;Lcom/daaw/zo8;JJ)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/vy8;->a(Ljava/lang/String;JJ)V

    invoke-static {p1}, Lcom/daaw/sx8;->z0(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/sx8;->V0:Z

    invoke-virtual {p0}, Lcom/daaw/hp8;->h0()Lcom/daaw/ep8;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget p2, Lcom/daaw/it5;->a:I

    const/16 p3, 0x1d

    const/4 p4, 0x0

    if-lt p2, p3, :cond_1

    iget-object p2, p1, Lcom/daaw/ep8;->b:Ljava/lang/String;

    const-string p3, "video/x-vnd.on2.vp9"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/daaw/ep8;->g()[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    move-result-object p1

    array-length p2, p1

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_1

    aget-object p5, p1, p3

    iget p5, p5, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    const/16 p6, 0x4000

    if-ne p5, p6, :cond_0

    const/4 p4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iput-boolean p4, p0, Lcom/daaw/sx8;->W0:Z

    return-void
.end method

.method public final O(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    invoke-virtual {v0, p1}, Lcom/daaw/vy8;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final W(Lcom/daaw/f92;Landroid/media/MediaFormat;)V
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/hp8;->f0()Lcom/daaw/bp8;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/daaw/sx8;->a1:I

    invoke-interface {v0, v1}, Lcom/daaw/bp8;->f(I)V

    :cond_0
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "crop-right"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "crop-top"

    const-string v3, "crop-bottom"

    const-string v4, "crop-left"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v6, 0x1

    :cond_1
    if-eqz v6, :cond_2

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    sub-int/2addr v0, v1

    add-int/2addr v0, v5

    goto :goto_0

    :cond_2
    const-string v0, "width"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_0
    iput v0, p0, Lcom/daaw/sx8;->o1:I

    if-eqz v6, :cond_3

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    sub-int/2addr v0, p2

    add-int/2addr v0, v5

    goto :goto_1

    :cond_3
    const-string v0, "height"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_1
    iput v0, p0, Lcom/daaw/sx8;->p1:I

    iget p2, p1, Lcom/daaw/f92;->u:F

    iput p2, p0, Lcom/daaw/sx8;->r1:F

    sget v1, Lcom/daaw/it5;->a:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_5

    iget v1, p1, Lcom/daaw/f92;->t:I

    const/16 v2, 0x5a

    if-eq v1, v2, :cond_4

    const/16 v2, 0x10e

    if-ne v1, v2, :cond_6

    :cond_4
    iget v1, p0, Lcom/daaw/sx8;->o1:I

    iput v0, p0, Lcom/daaw/sx8;->o1:I

    iput v1, p0, Lcom/daaw/sx8;->p1:I

    const/high16 v0, 0x3f800000    # 1.0f

    div-float/2addr v0, p2

    iput v0, p0, Lcom/daaw/sx8;->r1:F

    goto :goto_2

    :cond_5
    iget p2, p1, Lcom/daaw/f92;->t:I

    iput p2, p0, Lcom/daaw/sx8;->q1:I

    :cond_6
    :goto_2
    iget-object p2, p0, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    iget p1, p1, Lcom/daaw/f92;->s:F

    invoke-virtual {p2, p1}, Lcom/daaw/cy8;->c(F)V

    return-void
.end method

.method public final X()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/sx8;->d1:Z

    iget-boolean v1, p0, Lcom/daaw/sx8;->b1:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Lcom/daaw/sx8;->b1:Z

    iget-object v1, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    iget-object v2, p0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    invoke-virtual {v1, v2}, Lcom/daaw/vy8;->q(Ljava/lang/Object;)V

    iput-boolean v0, p0, Lcom/daaw/sx8;->Z0:Z

    :cond_0
    return-void
.end method

.method public final Y()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/sx8;->b1:Z

    sget v0, Lcom/daaw/it5;->a:I

    return-void
.end method

.method public final Z(Lcom/daaw/ma7;)V
    .locals 0

    iget p1, p0, Lcom/daaw/sx8;->j1:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/sx8;->j1:I

    sget p1, Lcom/daaw/it5;->a:I

    return-void
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecVideoRenderer"

    return-object v0
.end method

.method public final b0(JJLcom/daaw/bp8;Ljava/nio/ByteBuffer;IIIJZZLcom/daaw/f92;)Z
    .locals 23

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p5

    move/from16 v4, p7

    move-wide/from16 v5, p10

    invoke-static/range {p5 .. p5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v7, v0, Lcom/daaw/sx8;->e1:J

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v11, v7, v9

    if-nez v11, :cond_0

    iput-wide v1, v0, Lcom/daaw/sx8;->e1:J

    :cond_0
    iget-wide v7, v0, Lcom/daaw/sx8;->k1:J

    cmp-long v11, v5, v7

    if-eqz v11, :cond_1

    iget-object v7, v0, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    invoke-virtual {v7, v5, v6}, Lcom/daaw/cy8;->d(J)V

    iput-wide v5, v0, Lcom/daaw/sx8;->k1:J

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->e0()J

    move-result-wide v7

    sub-long v11, v5, v7

    const/4 v13, 0x1

    if-eqz p12, :cond_3

    if-eqz p13, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v3, v4, v11, v12}, Lcom/daaw/sx8;->I0(Lcom/daaw/bp8;IJ)V

    return v13

    :cond_3
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->d0()F

    move-result v14

    float-to-double v14, v14

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/nk7;->m()I

    move-result v9

    const/4 v10, 0x2

    const/4 v13, 0x0

    if-ne v9, v10, :cond_4

    const/4 v9, 0x1

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v16

    const-wide/16 v18, 0x3e8

    mul-long v16, v16, v18

    sub-long/2addr v5, v1

    long-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v14

    double-to-long v5, v5

    if-eqz v9, :cond_5

    sub-long v14, v16, p3

    sub-long/2addr v5, v14

    :cond_5
    iget-object v10, v0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    iget-object v14, v0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    if-ne v10, v14, :cond_7

    invoke-static {v5, v6}, Lcom/daaw/sx8;->E0(J)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0, v3, v4, v11, v12}, Lcom/daaw/sx8;->I0(Lcom/daaw/bp8;IJ)V

    invoke-virtual {v0, v5, v6}, Lcom/daaw/sx8;->y0(J)V

    const/4 v1, 0x1

    return v1

    :cond_6
    return v13

    :cond_7
    iget-wide v14, v0, Lcom/daaw/sx8;->l1:J

    sub-long v16, v16, v14

    iget-boolean v10, v0, Lcom/daaw/sx8;->d1:Z

    if-nez v10, :cond_8

    if-nez v9, :cond_9

    iget-boolean v10, v0, Lcom/daaw/sx8;->c1:Z

    if-eqz v10, :cond_a

    goto :goto_2

    :cond_8
    iget-boolean v10, v0, Lcom/daaw/sx8;->b1:Z

    if-nez v10, :cond_a

    :cond_9
    :goto_2
    const/4 v10, 0x1

    goto :goto_3

    :cond_a
    const/4 v10, 0x0

    :goto_3
    iget-wide v14, v0, Lcom/daaw/sx8;->f1:J

    const/16 v13, 0x15

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v22, v14, v20

    if-nez v22, :cond_d

    cmp-long v14, v1, v7

    if-ltz v14, :cond_d

    if-nez v10, :cond_b

    if-eqz v9, :cond_d

    invoke-static {v5, v6}, Lcom/daaw/sx8;->E0(J)Z

    move-result v7

    if-eqz v7, :cond_d

    const-wide/32 v7, 0x186a0

    cmp-long v10, v16, v7

    if-lez v10, :cond_d

    :cond_b
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sget v7, Lcom/daaw/it5;->a:I

    if-lt v7, v13, :cond_c

    move-object/from16 p8, p0

    move-object/from16 p9, p5

    move/from16 p10, p7

    move-wide/from16 p11, v11

    move-wide/from16 p13, v1

    invoke-virtual/range {p8 .. p14}, Lcom/daaw/sx8;->H0(Lcom/daaw/bp8;IJJ)V

    goto :goto_4

    :cond_c
    invoke-virtual {v0, v3, v4, v11, v12}, Lcom/daaw/sx8;->G0(Lcom/daaw/bp8;IJ)V

    :goto_4
    invoke-virtual {v0, v5, v6}, Lcom/daaw/sx8;->y0(J)V

    const/4 v1, 0x1

    return v1

    :cond_d
    if-eqz v9, :cond_17

    iget-wide v7, v0, Lcom/daaw/sx8;->e1:J

    cmp-long v9, v1, v7

    if-nez v9, :cond_e

    goto/16 :goto_9

    :cond_e
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    iget-object v9, v0, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    mul-long v5, v5, v18

    add-long/2addr v5, v7

    invoke-virtual {v9, v5, v6}, Lcom/daaw/cy8;->a(J)J

    move-result-wide v5

    sub-long v7, v5, v7

    div-long v7, v7, v18

    iget-wide v9, v0, Lcom/daaw/sx8;->f1:J

    const-wide/32 v14, -0x7a120

    cmp-long v16, v7, v14

    if-gez v16, :cond_11

    if-nez p13, :cond_11

    invoke-virtual/range {p0 .. p2}, Lcom/daaw/nk7;->t(J)I

    move-result v1

    if-nez v1, :cond_f

    goto :goto_6

    :cond_f
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v9, v14

    if-eqz v2, :cond_10

    iget-object v2, v0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget v3, v2, Lcom/daaw/ql7;->d:I

    add-int/2addr v3, v1

    iput v3, v2, Lcom/daaw/ql7;->d:I

    iget v1, v2, Lcom/daaw/ql7;->f:I

    iget v3, v0, Lcom/daaw/sx8;->j1:I

    add-int/2addr v1, v3

    iput v1, v2, Lcom/daaw/ql7;->f:I

    goto :goto_5

    :cond_10
    iget-object v2, v0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget v3, v2, Lcom/daaw/ql7;->j:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, v2, Lcom/daaw/ql7;->j:I

    iget v2, v0, Lcom/daaw/sx8;->j1:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sx8;->J0(II)V

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->o0()Z

    const/4 v1, 0x0

    return v1

    :cond_11
    :goto_6
    invoke-static {v7, v8}, Lcom/daaw/sx8;->E0(J)Z

    move-result v1

    if-eqz v1, :cond_13

    if-nez p13, :cond_13

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v9, v1

    if-eqz v5, :cond_12

    invoke-virtual {v0, v3, v4, v11, v12}, Lcom/daaw/sx8;->I0(Lcom/daaw/bp8;IJ)V

    const/4 v2, 0x1

    goto :goto_7

    :cond_12
    sget v1, Lcom/daaw/it5;->a:I

    const-string v1, "dropVideoBuffer"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-interface {v3, v4, v1}, Lcom/daaw/bp8;->g(IZ)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sx8;->J0(II)V

    :goto_7
    invoke-virtual {v0, v7, v8}, Lcom/daaw/sx8;->y0(J)V

    return v2

    :cond_13
    sget v1, Lcom/daaw/it5;->a:I

    if-lt v1, v13, :cond_14

    const-wide/32 v1, 0xc350

    cmp-long v9, v7, v1

    if-gez v9, :cond_16

    move-object/from16 p8, p0

    move-object/from16 p9, p5

    move/from16 p10, p7

    move-wide/from16 p11, v11

    move-wide/from16 p13, v5

    invoke-virtual/range {p8 .. p14}, Lcom/daaw/sx8;->H0(Lcom/daaw/bp8;IJJ)V

    invoke-virtual {v0, v7, v8}, Lcom/daaw/sx8;->y0(J)V

    const/4 v1, 0x1

    return v1

    :cond_14
    const-wide/16 v1, 0x7530

    cmp-long v5, v7, v1

    if-gez v5, :cond_16

    const-wide/16 v1, 0x2af8

    cmp-long v5, v7, v1

    if-lez v5, :cond_15

    const-wide/16 v1, -0x2710

    add-long/2addr v1, v7

    :try_start_0
    div-long v1, v1, v18

    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    const/4 v1, 0x0

    return v1

    :cond_15
    :goto_8
    invoke-virtual {v0, v3, v4, v11, v12}, Lcom/daaw/sx8;->G0(Lcom/daaw/bp8;IJ)V

    invoke-virtual {v0, v7, v8}, Lcom/daaw/sx8;->y0(J)V

    const/4 v1, 0x1

    return v1

    :cond_16
    const/4 v1, 0x0

    return v1

    :cond_17
    :goto_9
    const/4 v1, 0x0

    return v1
.end method

.method public final e(FF)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/hp8;->e(FF)V

    iget-object p2, p0, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    invoke-virtual {p2, p1}, Lcom/daaw/cy8;->e(F)V

    return-void
.end method

.method public final g0(Ljava/lang/Throwable;Lcom/daaw/ep8;)Lcom/daaw/cp8;
    .locals 2

    new-instance v0, Lcom/daaw/px8;

    iget-object v1, p0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    invoke-direct {v0, p1, p2, v1}, Lcom/daaw/px8;-><init>(Ljava/lang/Throwable;Lcom/daaw/ep8;Landroid/view/Surface;)V

    return-object v0
.end method

.method public final h(ILjava/lang/Object;)V
    .locals 5

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0xa

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object p1, p0, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/cy8;->j(I)V

    return-void

    :cond_1
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/daaw/sx8;->a1:I

    invoke-virtual {p0}, Lcom/daaw/hp8;->f0()Lcom/daaw/bp8;

    move-result-object p2

    if-eqz p2, :cond_c

    invoke-interface {p2, p1}, Lcom/daaw/bp8;->f(I)V

    return-void

    :cond_2
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget p2, p0, Lcom/daaw/sx8;->t1:I

    if-eq p2, p1, :cond_c

    iput p1, p0, Lcom/daaw/sx8;->t1:I

    return-void

    :cond_3
    check-cast p2, Lcom/daaw/vx8;

    iput-object p2, p0, Lcom/daaw/sx8;->u1:Lcom/daaw/vx8;

    return-void

    :cond_4
    instance-of p1, p2, Landroid/view/Surface;

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    check-cast p2, Landroid/view/Surface;

    goto :goto_0

    :cond_5
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_7

    iget-object p1, p0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    if-eqz p1, :cond_6

    move-object p2, p1

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lcom/daaw/hp8;->h0()Lcom/daaw/ep8;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p0, p1}, Lcom/daaw/sx8;->F0(Lcom/daaw/ep8;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object p2, p0, Lcom/daaw/sx8;->Q0:Landroid/content/Context;

    iget-boolean p1, p1, Lcom/daaw/ep8;->f:Z

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzxk;->a(Landroid/content/Context;Z)Lcom/google/android/gms/internal/ads/zzxk;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    if-eq p1, p2, :cond_b

    iput-object p2, p0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    iget-object p1, p0, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    invoke-virtual {p1, p2}, Lcom/daaw/cy8;->i(Landroid/view/Surface;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/sx8;->Z0:Z

    invoke-virtual {p0}, Lcom/daaw/nk7;->m()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/hp8;->f0()Lcom/daaw/bp8;

    move-result-object v2

    if-eqz v2, :cond_9

    sget v3, Lcom/daaw/it5;->a:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_8

    if-eqz p2, :cond_8

    iget-boolean v3, p0, Lcom/daaw/sx8;->V0:Z

    if-nez v3, :cond_8

    invoke-interface {v2, p2}, Lcom/daaw/bp8;->e(Landroid/view/Surface;)V

    goto :goto_2

    :cond_8
    invoke-virtual {p0}, Lcom/daaw/hp8;->l0()V

    invoke-virtual {p0}, Lcom/daaw/hp8;->j0()V

    :cond_9
    :goto_2
    if-eqz p2, :cond_a

    iget-object v2, p0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    if-eq p2, v2, :cond_a

    invoke-virtual {p0}, Lcom/daaw/sx8;->C0()V

    iput-boolean p1, p0, Lcom/daaw/sx8;->b1:Z

    sget p1, Lcom/daaw/it5;->a:I

    const/4 p1, 0x2

    if-ne v1, p1, :cond_c

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/sx8;->f1:J

    return-void

    :cond_a
    iput-object v0, p0, Lcom/daaw/sx8;->s1:Lcom/daaw/ll4;

    iput-boolean p1, p0, Lcom/daaw/sx8;->b1:Z

    sget p1, Lcom/daaw/it5;->a:I

    return-void

    :cond_b
    if-eqz p2, :cond_c

    iget-object p1, p0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    if-eq p2, p1, :cond_c

    invoke-virtual {p0}, Lcom/daaw/sx8;->C0()V

    iget-boolean p1, p0, Lcom/daaw/sx8;->Z0:Z

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    iget-object p2, p0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    invoke-virtual {p1, p2}, Lcom/daaw/vy8;->q(Ljava/lang/Object;)V

    :cond_c
    :goto_3
    return-void
.end method

.method public final i0(Lcom/daaw/ma7;)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/sx8;->W0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lcom/daaw/ma7;->f:Ljava/nio/ByteBuffer;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/4 v1, 0x7

    if-lt v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/16 v6, -0x4b

    if-ne v0, v6, :cond_2

    const/16 v0, 0x3c

    if-ne v1, v0, :cond_2

    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    const/4 v1, 0x4

    if-ne v3, v1, :cond_2

    if-eqz v4, :cond_1

    if-ne v4, v0, :cond_2

    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Lcom/daaw/hp8;->f0()Lcom/daaw/bp8;

    move-result-object p1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "hdr10-plus-info"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    invoke-interface {p1, v1}, Lcom/daaw/bp8;->o(Landroid/os/Bundle;)V

    :cond_2
    return-void
.end method

.method public final k0(J)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/hp8;->k0(J)V

    iget p1, p0, Lcom/daaw/sx8;->j1:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/sx8;->j1:I

    return-void
.end method

.method public final m0()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/hp8;->m0()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/sx8;->j1:I

    return-void
.end method

.method public final q0(Lcom/daaw/ep8;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/sx8;->F0(Lcom/daaw/ep8;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final x()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/sx8;->s1:Lcom/daaw/ll4;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/sx8;->b1:Z

    sget v1, Lcom/daaw/it5;->a:I

    iput-boolean v0, p0, Lcom/daaw/sx8;->Z0:Z

    :try_start_0
    invoke-super {p0}, Lcom/daaw/hp8;->x()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    iget-object v1, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    invoke-virtual {v0, v1}, Lcom/daaw/vy8;->c(Lcom/daaw/ql7;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    iget-object v2, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    invoke-virtual {v1, v2}, Lcom/daaw/vy8;->c(Lcom/daaw/ql7;)V

    throw v0
.end method

.method public final y(ZZ)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/hp8;->y(ZZ)V

    invoke-virtual {p0}, Lcom/daaw/nk7;->v()Lcom/daaw/x98;

    iget-object p1, p0, Lcom/daaw/sx8;->S0:Lcom/daaw/vy8;

    iget-object v0, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    invoke-virtual {p1, v0}, Lcom/daaw/vy8;->e(Lcom/daaw/ql7;)V

    iput-boolean p2, p0, Lcom/daaw/sx8;->c1:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/sx8;->d1:Z

    return-void
.end method

.method public final y0(J)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget-wide v1, v0, Lcom/daaw/ql7;->k:J

    add-long/2addr v1, p1

    iput-wide v1, v0, Lcom/daaw/ql7;->k:J

    iget v1, v0, Lcom/daaw/ql7;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/ql7;->l:I

    iget-wide v0, p0, Lcom/daaw/sx8;->m1:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/daaw/sx8;->m1:J

    iget p1, p0, Lcom/daaw/sx8;->n1:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/sx8;->n1:I

    return-void
.end method

.method public final z(JZ)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/hp8;->z(JZ)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/sx8;->b1:Z

    sget p2, Lcom/daaw/it5;->a:I

    iget-object p2, p0, Lcom/daaw/sx8;->R0:Lcom/daaw/cy8;

    invoke-virtual {p2}, Lcom/daaw/cy8;->f()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/sx8;->k1:J

    iput-wide v0, p0, Lcom/daaw/sx8;->e1:J

    iput p1, p0, Lcom/daaw/sx8;->i1:I

    iput-wide v0, p0, Lcom/daaw/sx8;->f1:J

    return-void
.end method

.method public final zzN()Z
    .locals 9

    invoke-super {p0}, Lcom/daaw/hp8;->zzN()Z

    move-result v0

    const/4 v1, 0x1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/sx8;->b1:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/sx8;->Y0:Lcom/google/android/gms/internal/ads/zzxk;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/daaw/sx8;->X0:Landroid/view/Surface;

    if-eq v4, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/hp8;->f0()Lcom/daaw/bp8;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iput-wide v2, p0, Lcom/daaw/sx8;->f1:J

    return v1

    :cond_2
    :goto_0
    iget-wide v4, p0, Lcom/daaw/sx8;->f1:J

    const/4 v0, 0x0

    cmp-long v6, v4, v2

    if-nez v6, :cond_3

    return v0

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/daaw/sx8;->f1:J

    cmp-long v8, v4, v6

    if-gez v8, :cond_4

    return v1

    :cond_4
    iput-wide v2, p0, Lcom/daaw/sx8;->f1:J

    return v0
.end method
