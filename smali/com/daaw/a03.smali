.class public final Lcom/daaw/a03;
.super Lcom/daaw/qu2;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# instance fields
.field public final Q:Landroid/content/Context;

.field public final R:Lcom/daaw/c03;

.field public final S:Lcom/daaw/k03;

.field public final T:Z

.field public final U:[J

.field public V:[Lcom/google/android/gms/internal/ads/zzatd;

.field public W:Lcom/daaw/zz2;

.field public X:Landroid/view/Surface;

.field public Y:Landroid/view/Surface;

.field public Z:Z

.field public a0:J

.field public b0:J

.field public c0:I

.field public d0:I

.field public e0:I

.field public f0:F

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:F

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:F

.field public o0:J

.field public p0:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/su2;JLandroid/os/Handler;Lcom/daaw/l03;I)V
    .locals 0

    const/4 p3, 0x2

    const/4 p4, 0x0

    const/4 p7, 0x0

    invoke-direct {p0, p3, p2, p4, p7}, Lcom/daaw/qu2;-><init>(ILcom/daaw/su2;Lcom/daaw/ks2;Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/a03;->Q:Landroid/content/Context;

    new-instance p2, Lcom/daaw/c03;

    invoke-direct {p2, p1}, Lcom/daaw/c03;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/daaw/a03;->R:Lcom/daaw/c03;

    new-instance p1, Lcom/daaw/k03;

    invoke-direct {p1, p5, p6}, Lcom/daaw/k03;-><init>(Landroid/os/Handler;Lcom/daaw/l03;)V

    iput-object p1, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    sget p1, Lcom/daaw/pz2;->a:I

    const/16 p2, 0x16

    if-gt p1, p2, :cond_0

    sget-object p1, Lcom/daaw/pz2;->b:Ljava/lang/String;

    const-string p2, "foster"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/daaw/pz2;->c:Ljava/lang/String;

    const-string p2, "NVIDIA"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p7, 0x1

    :cond_0
    iput-boolean p7, p0, Lcom/daaw/a03;->T:Z

    const/16 p1, 0xa

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/daaw/a03;->U:[J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/a03;->o0:J

    iput-wide p1, p0, Lcom/daaw/a03;->a0:J

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/a03;->g0:I

    iput p1, p0, Lcom/daaw/a03;->h0:I

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/daaw/a03;->j0:F

    iput p1, p0, Lcom/daaw/a03;->f0:F

    invoke-virtual {p0}, Lcom/daaw/a03;->S()V

    return-void
.end method

.method public static R(Lcom/google/android/gms/internal/ads/zzatd;)I
    .locals 1

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzatd;->B:I

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return p0
.end method

.method public static W(J)Z
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


# virtual methods
.method public final B(Lcom/daaw/ju2;Landroid/media/MediaCodec;Lcom/google/android/gms/internal/ads/zzatd;Landroid/media/MediaCrypto;)V
    .locals 11

    iget-object p4, p0, Lcom/daaw/a03;->V:[Lcom/google/android/gms/internal/ads/zzatd;

    iget v0, p3, Lcom/google/android/gms/internal/ads/zzatd;->y:I

    iget v1, p3, Lcom/google/android/gms/internal/ads/zzatd;->z:I

    iget v2, p3, Lcom/google/android/gms/internal/ads/zzatd;->v:I

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v2, v4, :cond_7

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/zzatd;->u:Ljava/lang/String;

    if-eq v0, v4, :cond_6

    if-ne v1, v4, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v6, 0x5

    const/4 v7, 0x1

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v5, "video/x-vnd.on2.vp9"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x5

    goto :goto_1

    :sswitch_1
    const-string v5, "video/x-vnd.on2.vp8"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x3

    goto :goto_1

    :sswitch_2
    const-string v5, "video/avc"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x2

    goto :goto_1

    :sswitch_3
    const-string v5, "video/mp4v-es"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :sswitch_4
    const-string v5, "video/hevc"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :sswitch_5
    const-string v5, "video/3gpp"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, -0x1

    :goto_1
    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_5

    if-eq v2, v10, :cond_3

    if-eq v2, v9, :cond_5

    if-eq v2, v8, :cond_2

    if-eq v2, v6, :cond_2

    goto :goto_4

    :cond_2
    mul-int v2, v0, v1

    goto :goto_3

    :cond_3
    sget-object v2, Lcom/daaw/pz2;->d:Ljava/lang/String;

    const-string v5, "BRAVIA 4K 2015"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    const/16 v2, 0x10

    invoke-static {v0, v2}, Lcom/daaw/pz2;->d(II)I

    move-result v5

    invoke-static {v1, v2}, Lcom/daaw/pz2;->d(II)I

    move-result v2

    mul-int v5, v5, v2

    mul-int/lit16 v2, v5, 0x100

    goto :goto_2

    :cond_5
    mul-int v2, v0, v1

    :goto_2
    const/4 v8, 0x2

    :goto_3
    mul-int/lit8 v2, v2, 0x3

    add-int/2addr v8, v8

    div-int/2addr v2, v8

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v2, -0x1

    :cond_7
    :goto_5
    array-length p4, p4

    new-instance p4, Lcom/daaw/zz2;

    invoke-direct {p4, v0, v1, v2}, Lcom/daaw/zz2;-><init>(III)V

    iput-object p4, p0, Lcom/daaw/a03;->W:Lcom/daaw/zz2;

    iget-boolean v0, p0, Lcom/daaw/a03;->T:Z

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzatd;->b()Landroid/media/MediaFormat;

    move-result-object p3

    iget v1, p4, Lcom/daaw/zz2;->a:I

    const-string v2, "max-width"

    invoke-virtual {p3, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget v1, p4, Lcom/daaw/zz2;->b:I

    const-string v2, "max-height"

    invoke-virtual {p3, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p4, p4, Lcom/daaw/zz2;->c:I

    if-eq p4, v4, :cond_8

    const-string v1, "max-input-size"

    invoke-virtual {p3, v1, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_8
    if-eqz v0, :cond_9

    const-string p4, "auto-frc"

    invoke-virtual {p3, p4, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_9
    iget-object p4, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    if-nez p4, :cond_b

    iget-boolean p4, p1, Lcom/daaw/ju2;->d:Z

    invoke-virtual {p0, p4}, Lcom/daaw/a03;->X(Z)Z

    move-result p4

    invoke-static {p4}, Lcom/daaw/az2;->e(Z)V

    iget-object p4, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    if-nez p4, :cond_a

    iget-object p4, p0, Lcom/daaw/a03;->Q:Landroid/content/Context;

    iget-boolean p1, p1, Lcom/daaw/ju2;->d:Z

    invoke-static {p4, p1}, Lcom/google/android/gms/internal/ads/zzbbe;->a(Landroid/content/Context;Z)Lcom/google/android/gms/internal/ads/zzbbe;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    :cond_a
    iget-object p1, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    iput-object p1, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    :cond_b
    iget-object p1, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    const/4 p4, 0x0

    invoke-virtual {p2, p3, p1, p4, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    sget p1, Lcom/daaw/pz2;->a:I

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_5
        -0x63185e82 -> :sswitch_4
        0x46cdc642 -> :sswitch_3
        0x4f62373a -> :sswitch_2
        0x5f50bed8 -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch
.end method

.method public final C(Ljava/lang/String;JJ)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/k03;->b(Ljava/lang/String;JJ)V

    return-void
.end method

.method public final D(Lcom/google/android/gms/internal/ads/zzatd;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/qu2;->D(Lcom/google/android/gms/internal/ads/zzatd;)V

    iget-object v0, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    invoke-virtual {v0, p1}, Lcom/daaw/k03;->f(Lcom/google/android/gms/internal/ads/zzatd;)V

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzatd;->C:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, v0, v1

    if-nez v1, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    :cond_0
    iput v0, p0, Lcom/daaw/a03;->f0:F

    invoke-static {p1}, Lcom/daaw/a03;->R(Lcom/google/android/gms/internal/ads/zzatd;)I

    move-result p1

    iput p1, p0, Lcom/daaw/a03;->e0:I

    return-void
.end method

.method public final E(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 7

    const-string v0, "crop-right"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "crop-top"

    const-string v3, "crop-bottom"

    const-string v4, "crop-left"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v6, 0x1

    :cond_0
    if-eqz v6, :cond_1

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    sub-int/2addr v0, v1

    add-int/2addr v0, v5

    goto :goto_0

    :cond_1
    const-string v0, "width"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_0
    iput v0, p0, Lcom/daaw/a03;->g0:I

    if-eqz v6, :cond_2

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    sub-int/2addr v0, p2

    add-int/2addr v0, v5

    goto :goto_1

    :cond_2
    const-string v0, "height"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_1
    iput v0, p0, Lcom/daaw/a03;->h0:I

    iget p2, p0, Lcom/daaw/a03;->f0:F

    iput p2, p0, Lcom/daaw/a03;->j0:F

    sget v1, Lcom/daaw/pz2;->a:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_4

    iget v1, p0, Lcom/daaw/a03;->e0:I

    const/16 v2, 0x5a

    if-eq v1, v2, :cond_3

    const/16 v2, 0x10e

    if-ne v1, v2, :cond_5

    :cond_3
    iget v1, p0, Lcom/daaw/a03;->g0:I

    iput v0, p0, Lcom/daaw/a03;->g0:I

    iput v1, p0, Lcom/daaw/a03;->h0:I

    const/high16 v0, 0x3f800000    # 1.0f

    div-float/2addr v0, p2

    iput v0, p0, Lcom/daaw/a03;->j0:F

    goto :goto_2

    :cond_4
    iget p2, p0, Lcom/daaw/a03;->e0:I

    iput p2, p0, Lcom/daaw/a03;->i0:I

    :cond_5
    :goto_2
    invoke-virtual {p1, v5}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    return-void
.end method

.method public final G(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z
    .locals 19

    move-object/from16 v7, p0

    move-object/from16 v1, p5

    move/from16 v2, p7

    move-wide/from16 v3, p9

    :goto_0
    iget v0, v7, Lcom/daaw/a03;->p0:I

    const/4 v5, 0x0

    const/4 v8, 0x1

    if-eqz v0, :cond_0

    iget-object v6, v7, Lcom/daaw/a03;->U:[J

    aget-wide v9, v6, v5

    cmp-long v11, v3, v9

    if-ltz v11, :cond_0

    iput-wide v9, v7, Lcom/daaw/a03;->o0:J

    add-int/lit8 v0, v0, -0x1

    iput v0, v7, Lcom/daaw/a03;->p0:I

    invoke-static {v6, v8, v6, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    iget-wide v9, v7, Lcom/daaw/a03;->o0:J

    sub-long v9, v3, v9

    if-eqz p11, :cond_1

    invoke-virtual {v7, v1, v2, v9, v10}, Lcom/daaw/a03;->Q(Landroid/media/MediaCodec;IJ)V

    return v8

    :cond_1
    sub-long v11, v3, p1

    iget-object v0, v7, Lcom/daaw/a03;->X:Landroid/view/Surface;

    iget-object v6, v7, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    if-ne v0, v6, :cond_3

    invoke-static {v11, v12}, Lcom/daaw/a03;->W(J)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v7, v1, v2, v9, v10}, Lcom/daaw/a03;->Q(Landroid/media/MediaCodec;IJ)V

    return v8

    :cond_2
    return v5

    :cond_3
    iget-boolean v0, v7, Lcom/daaw/a03;->Z:Z

    const/16 v6, 0x15

    if-nez v0, :cond_5

    sget v0, Lcom/daaw/pz2;->a:I

    if-lt v0, v6, :cond_4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move/from16 v2, p7

    move-wide v3, v9

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/a03;->P(Landroid/media/MediaCodec;IJJ)V

    goto :goto_1

    :cond_4
    invoke-virtual {v7, v1, v2, v9, v10}, Lcom/daaw/a03;->O(Landroid/media/MediaCodec;IJ)V

    :goto_1
    return v8

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ip2;->zzb()I

    move-result v0

    const/4 v13, 0x2

    if-eq v0, v13, :cond_6

    return v5

    :cond_6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v15

    iget-object v0, v7, Lcom/daaw/a03;->R:Lcom/daaw/c03;

    const-wide/16 v17, 0x3e8

    mul-long v13, v13, v17

    sub-long v13, v13, p3

    sub-long/2addr v11, v13

    mul-long v11, v11, v17

    add-long/2addr v11, v15

    invoke-virtual {v0, v3, v4, v11, v12}, Lcom/daaw/c03;->a(JJ)J

    move-result-wide v11

    sub-long v3, v11, v15

    div-long v3, v3, v17

    invoke-static {v3, v4}, Lcom/daaw/a03;->W(J)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "dropVideoBuffer"

    invoke-static {v0}, Lcom/daaw/nz2;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    invoke-static {}, Lcom/daaw/nz2;->b()V

    iget-object v0, v7, Lcom/daaw/qu2;->O:Lcom/daaw/as2;

    iget v1, v0, Lcom/daaw/as2;->f:I

    add-int/2addr v1, v8

    iput v1, v0, Lcom/daaw/as2;->f:I

    iget v1, v7, Lcom/daaw/a03;->c0:I

    add-int/2addr v1, v8

    iput v1, v7, Lcom/daaw/a03;->c0:I

    iget v1, v7, Lcom/daaw/a03;->d0:I

    add-int/2addr v1, v8

    iput v1, v7, Lcom/daaw/a03;->d0:I

    iget v2, v0, Lcom/daaw/as2;->g:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/as2;->g:I

    iget v0, v7, Lcom/daaw/a03;->c0:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/a03;->T()V

    :cond_7
    return v8

    :cond_8
    sget v0, Lcom/daaw/pz2;->a:I

    if-lt v0, v6, :cond_9

    const-wide/32 v13, 0xc350

    cmp-long v0, v3, v13

    if-gez v0, :cond_b

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move/from16 v2, p7

    move-wide v3, v9

    move-wide v5, v11

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/a03;->P(Landroid/media/MediaCodec;IJJ)V

    return v8

    :cond_9
    const-wide/16 v11, 0x7530

    cmp-long v0, v3, v11

    if-gez v0, :cond_b

    const-wide/16 v5, 0x2af8

    cmp-long v0, v3, v5

    if-lez v0, :cond_a

    const-wide/16 v5, -0x2710

    add-long/2addr v3, v5

    :try_start_0
    div-long v3, v3, v17

    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_a
    :goto_2
    invoke-virtual {v7, v1, v2, v9, v10}, Lcom/daaw/a03;->O(Landroid/media/MediaCodec;IJ)V

    return v8

    :cond_b
    return v5
.end method

.method public final K(Lcom/daaw/bs2;)V
    .locals 0

    sget p1, Lcom/daaw/pz2;->a:I

    return-void
.end method

.method public final L()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Lcom/daaw/qu2;->L()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    if-ne v2, v1, :cond_0

    iput-object v0, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    :cond_0
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    iput-object v0, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    if-eqz v2, :cond_3

    iget-object v3, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    if-ne v3, v2, :cond_2

    iput-object v0, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    :cond_2
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    iput-object v0, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    :cond_3
    throw v1
.end method

.method public final M(Landroid/media/MediaCodec;ZLcom/google/android/gms/internal/ads/zzatd;Lcom/google/android/gms/internal/ads/zzatd;)Z
    .locals 1

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzatd;->u:Ljava/lang/String;

    iget-object v0, p4, Lcom/google/android/gms/internal/ads/zzatd;->u:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p3}, Lcom/daaw/a03;->R(Lcom/google/android/gms/internal/ads/zzatd;)I

    move-result p1

    invoke-static {p4}, Lcom/daaw/a03;->R(Lcom/google/android/gms/internal/ads/zzatd;)I

    move-result v0

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_0

    iget p1, p3, Lcom/google/android/gms/internal/ads/zzatd;->y:I

    iget p2, p4, Lcom/google/android/gms/internal/ads/zzatd;->y:I

    if-ne p1, p2, :cond_1

    iget p1, p3, Lcom/google/android/gms/internal/ads/zzatd;->z:I

    iget p2, p4, Lcom/google/android/gms/internal/ads/zzatd;->z:I

    if-ne p1, p2, :cond_1

    :cond_0
    iget p1, p4, Lcom/google/android/gms/internal/ads/zzatd;->y:I

    iget-object p2, p0, Lcom/daaw/a03;->W:Lcom/daaw/zz2;

    iget p3, p2, Lcom/daaw/zz2;->a:I

    if-gt p1, p3, :cond_1

    iget p1, p4, Lcom/google/android/gms/internal/ads/zzatd;->z:I

    iget p3, p2, Lcom/daaw/zz2;->b:I

    if-gt p1, p3, :cond_1

    iget p1, p4, Lcom/google/android/gms/internal/ads/zzatd;->v:I

    iget p2, p2, Lcom/daaw/zz2;->c:I

    if-gt p1, p2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final N(Lcom/daaw/ju2;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    if-nez v0, :cond_1

    iget-boolean p1, p1, Lcom/daaw/ju2;->d:Z

    invoke-virtual {p0, p1}, Lcom/daaw/a03;->X(Z)Z

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

.method public final O(Landroid/media/MediaCodec;IJ)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/a03;->U()V

    const-string p3, "releaseOutputBuffer"

    invoke-static {p3}, Lcom/daaw/nz2;->a(Ljava/lang/String;)V

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    invoke-static {}, Lcom/daaw/nz2;->b()V

    iget-object p1, p0, Lcom/daaw/qu2;->O:Lcom/daaw/as2;

    iget p2, p1, Lcom/daaw/as2;->d:I

    add-int/2addr p2, p3

    iput p2, p1, Lcom/daaw/as2;->d:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/a03;->d0:I

    invoke-virtual {p0}, Lcom/daaw/a03;->y()V

    return-void
.end method

.method public final P(Landroid/media/MediaCodec;IJJ)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/a03;->U()V

    const-string p3, "releaseOutputBuffer"

    invoke-static {p3}, Lcom/daaw/nz2;->a(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p5, p6}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    invoke-static {}, Lcom/daaw/nz2;->b()V

    iget-object p1, p0, Lcom/daaw/qu2;->O:Lcom/daaw/as2;

    iget p2, p1, Lcom/daaw/as2;->d:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/daaw/as2;->d:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/a03;->d0:I

    invoke-virtual {p0}, Lcom/daaw/a03;->y()V

    return-void
.end method

.method public final Q(Landroid/media/MediaCodec;IJ)V
    .locals 0

    const-string p3, "skipVideoBuffer"

    invoke-static {p3}, Lcom/daaw/nz2;->a(Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    invoke-static {}, Lcom/daaw/nz2;->b()V

    iget-object p1, p0, Lcom/daaw/qu2;->O:Lcom/daaw/as2;

    iget p2, p1, Lcom/daaw/as2;->e:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/daaw/as2;->e:I

    return-void
.end method

.method public final S()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/a03;->k0:I

    iput v0, p0, Lcom/daaw/a03;->l0:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/daaw/a03;->n0:F

    iput v0, p0, Lcom/daaw/a03;->m0:I

    return-void
.end method

.method public final T()V
    .locals 6

    iget v0, p0, Lcom/daaw/a03;->c0:I

    if-lez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/a03;->b0:J

    iget-object v4, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    iget v5, p0, Lcom/daaw/a03;->c0:I

    sub-long v2, v0, v2

    invoke-virtual {v4, v5, v2, v3}, Lcom/daaw/k03;->d(IJ)V

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/a03;->c0:I

    iput-wide v0, p0, Lcom/daaw/a03;->b0:J

    :cond_0
    return-void
.end method

.method public final U()V
    .locals 5

    iget v0, p0, Lcom/daaw/a03;->k0:I

    iget v1, p0, Lcom/daaw/a03;->g0:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/daaw/a03;->l0:I

    iget v2, p0, Lcom/daaw/a03;->h0:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/daaw/a03;->m0:I

    iget v2, p0, Lcom/daaw/a03;->i0:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/daaw/a03;->n0:F

    iget v2, p0, Lcom/daaw/a03;->j0:F

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    iget v2, p0, Lcom/daaw/a03;->h0:I

    iget v3, p0, Lcom/daaw/a03;->i0:I

    iget v4, p0, Lcom/daaw/a03;->j0:F

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/k03;->h(IIIF)V

    iget v0, p0, Lcom/daaw/a03;->g0:I

    iput v0, p0, Lcom/daaw/a03;->k0:I

    iget v0, p0, Lcom/daaw/a03;->h0:I

    iput v0, p0, Lcom/daaw/a03;->l0:I

    iget v0, p0, Lcom/daaw/a03;->i0:I

    iput v0, p0, Lcom/daaw/a03;->m0:I

    iget v0, p0, Lcom/daaw/a03;->j0:F

    iput v0, p0, Lcom/daaw/a03;->n0:F

    return-void
.end method

.method public final V()V
    .locals 5

    iget v0, p0, Lcom/daaw/a03;->k0:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/daaw/a03;->l0:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    iget v1, p0, Lcom/daaw/a03;->g0:I

    iget v2, p0, Lcom/daaw/a03;->h0:I

    iget v3, p0, Lcom/daaw/a03;->i0:I

    iget v4, p0, Lcom/daaw/a03;->j0:F

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/k03;->h(IIIF)V

    return-void
.end method

.method public final X(Z)Z
    .locals 4

    sget v0, Lcom/daaw/pz2;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x17

    if-lt v0, v3, :cond_1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/a03;->Q:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbbe;->b(Landroid/content/Context;)Z

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

.method public final b(ILjava/lang/Object;)V
    .locals 4

    const/4 v0, 0x1

    if-ne p1, v0, :cond_7

    check-cast p2, Landroid/view/Surface;

    if-nez p2, :cond_1

    iget-object p1, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    if-eqz p1, :cond_0

    move-object p2, p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/qu2;->I()Lcom/daaw/ju2;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-boolean v1, p1, Lcom/daaw/ju2;->d:Z

    invoke-virtual {p0, v1}, Lcom/daaw/a03;->X(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p2, p0, Lcom/daaw/a03;->Q:Landroid/content/Context;

    iget-boolean p1, p1, Lcom/daaw/ju2;->d:Z

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzbbe;->a(Landroid/content/Context;Z)Lcom/google/android/gms/internal/ads/zzbbe;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    if-eq p1, p2, :cond_6

    iput-object p2, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    invoke-virtual {p0}, Lcom/daaw/ip2;->zzb()I

    move-result p1

    const/4 v1, 0x2

    if-eq p1, v0, :cond_2

    if-ne p1, v1, :cond_4

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/qu2;->H()Landroid/media/MediaCodec;

    move-result-object v0

    sget v2, Lcom/daaw/pz2;->a:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_3

    if-eqz v0, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {v0, p2}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/qu2;->L()V

    invoke-virtual {p0}, Lcom/daaw/qu2;->J()V

    :cond_4
    :goto_1
    const/4 v0, 0x0

    if-eqz p2, :cond_5

    iget-object v2, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    if-eq p2, v2, :cond_5

    invoke-virtual {p0}, Lcom/daaw/a03;->V()V

    iput-boolean v0, p0, Lcom/daaw/a03;->Z:Z

    sget p2, Lcom/daaw/pz2;->a:I

    if-ne p1, v1, :cond_7

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/a03;->a0:J

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/a03;->S()V

    iput-boolean v0, p0, Lcom/daaw/a03;->Z:Z

    sget p1, Lcom/daaw/pz2;->a:I

    return-void

    :cond_6
    if-eqz p2, :cond_7

    iget-object p1, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    if-eq p2, p1, :cond_7

    invoke-virtual {p0}, Lcom/daaw/a03;->V()V

    iget-boolean p1, p0, Lcom/daaw/a03;->Z:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    iget-object p2, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    invoke-virtual {p1, p2}, Lcom/daaw/k03;->g(Landroid/view/Surface;)V

    :cond_7
    return-void
.end method

.method public final d()Z
    .locals 9

    invoke-super {p0}, Lcom/daaw/qu2;->d()Z

    move-result v0

    const/4 v1, 0x1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/a03;->Z:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/a03;->Y:Landroid/view/Surface;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    if-eq v4, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/qu2;->H()Landroid/media/MediaCodec;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iput-wide v2, p0, Lcom/daaw/a03;->a0:J

    return v1

    :cond_2
    :goto_0
    iget-wide v4, p0, Lcom/daaw/a03;->a0:J

    const/4 v0, 0x0

    cmp-long v6, v4, v2

    if-nez v6, :cond_3

    return v0

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/daaw/a03;->a0:J

    cmp-long v8, v4, v6

    if-gez v8, :cond_4

    return v1

    :cond_4
    iput-wide v2, p0, Lcom/daaw/a03;->a0:J

    return v0
.end method

.method public final q()V
    .locals 3

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/a03;->g0:I

    iput v0, p0, Lcom/daaw/a03;->h0:I

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/daaw/a03;->j0:F

    iput v0, p0, Lcom/daaw/a03;->f0:F

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/a03;->o0:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/a03;->p0:I

    invoke-virtual {p0}, Lcom/daaw/a03;->S()V

    iput-boolean v0, p0, Lcom/daaw/a03;->Z:Z

    sget v0, Lcom/daaw/pz2;->a:I

    iget-object v0, p0, Lcom/daaw/a03;->R:Lcom/daaw/c03;

    invoke-virtual {v0}, Lcom/daaw/c03;->b()V

    :try_start_0
    invoke-super {p0}, Lcom/daaw/qu2;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/qu2;->O:Lcom/daaw/as2;

    invoke-virtual {v0}, Lcom/daaw/as2;->a()V

    iget-object v0, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    iget-object v1, p0, Lcom/daaw/qu2;->O:Lcom/daaw/as2;

    invoke-virtual {v0, v1}, Lcom/daaw/k03;->c(Lcom/daaw/as2;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/qu2;->O:Lcom/daaw/as2;

    invoke-virtual {v1}, Lcom/daaw/as2;->a()V

    iget-object v1, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    iget-object v2, p0, Lcom/daaw/qu2;->O:Lcom/daaw/as2;

    invoke-virtual {v1, v2}, Lcom/daaw/k03;->c(Lcom/daaw/as2;)V

    throw v0
.end method

.method public final r(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/qu2;->r(Z)V

    invoke-virtual {p0}, Lcom/daaw/ip2;->p()Lcom/daaw/iq2;

    move-result-object p1

    iget p1, p1, Lcom/daaw/iq2;->a:I

    iget-object p1, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    iget-object v0, p0, Lcom/daaw/qu2;->O:Lcom/daaw/as2;

    invoke-virtual {p1, v0}, Lcom/daaw/k03;->e(Lcom/daaw/as2;)V

    iget-object p1, p0, Lcom/daaw/a03;->R:Lcom/daaw/c03;

    invoke-virtual {p1}, Lcom/daaw/c03;->c()V

    return-void
.end method

.method public final s(JZ)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/qu2;->s(JZ)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/a03;->Z:Z

    sget p2, Lcom/daaw/pz2;->a:I

    iput p1, p0, Lcom/daaw/a03;->d0:I

    iget p2, p0, Lcom/daaw/a03;->p0:I

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/daaw/a03;->U:[J

    add-int/lit8 p2, p2, -0x1

    aget-wide v1, v0, p2

    iput-wide v1, p0, Lcom/daaw/a03;->o0:J

    iput p1, p0, Lcom/daaw/a03;->p0:I

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/a03;->a0:J

    return-void
.end method

.method public final t()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/a03;->c0:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/a03;->b0:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/a03;->a0:J

    return-void
.end method

.method public final u()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/a03;->T()V

    return-void
.end method

.method public final v([Lcom/google/android/gms/internal/ads/zzatd;J)V
    .locals 4

    iput-object p1, p0, Lcom/daaw/a03;->V:[Lcom/google/android/gms/internal/ads/zzatd;

    iget-wide v0, p0, Lcom/daaw/a03;->o0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    iput-wide p2, p0, Lcom/daaw/a03;->o0:J

    return-void

    :cond_0
    iget p1, p0, Lcom/daaw/a03;->p0:I

    const/16 v0, 0xa

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/daaw/a03;->U:[J

    const/16 v0, 0x9

    aget-wide v0, p1, v0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many stream changes, so dropping offset: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/a03;->p0:I

    :goto_0
    iget-object p1, p0, Lcom/daaw/a03;->U:[J

    iget v0, p0, Lcom/daaw/a03;->p0:I

    add-int/lit8 v0, v0, -0x1

    aput-wide p2, p1, v0

    return-void
.end method

.method public final x(Lcom/daaw/su2;Lcom/google/android/gms/internal/ads/zzatd;)I
    .locals 7

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzatd;->u:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/fz2;->b(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzatd;->x:Lcom/google/android/gms/internal/ads/zzavc;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzavc;->r:I

    if-ge v2, v4, :cond_2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzavc;->a(I)Lcom/google/android/gms/internal/ads/zzavb;

    move-result-object v4

    iget-boolean v4, v4, Lcom/google/android/gms/internal/ads/zzavb;->t:Z

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :cond_2
    invoke-static {p1, v3}, Lcom/daaw/av2;->c(Ljava/lang/String;Z)Lcom/daaw/ju2;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_3

    return v0

    :cond_3
    iget-object v2, p2, Lcom/google/android/gms/internal/ads/zzatd;->r:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/daaw/ju2;->e(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget v3, p2, Lcom/google/android/gms/internal/ads/zzatd;->y:I

    if-lez v3, :cond_6

    iget v4, p2, Lcom/google/android/gms/internal/ads/zzatd;->z:I

    if-lez v4, :cond_6

    sget v2, Lcom/daaw/pz2;->a:I

    const/16 v5, 0x15

    if-lt v2, v5, :cond_4

    iget p2, p2, Lcom/google/android/gms/internal/ads/zzatd;->A:F

    float-to-double v5, p2

    invoke-virtual {p1, v3, v4, v5, v6}, Lcom/daaw/ju2;->f(IID)Z

    move-result v2

    goto :goto_2

    :cond_4
    mul-int v3, v3, v4

    invoke-static {}, Lcom/daaw/av2;->a()I

    move-result v2

    if-gt v3, v2, :cond_5

    const/4 v2, 0x1

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_6

    iget v3, p2, Lcom/google/android/gms/internal/ads/zzatd;->y:I

    iget p2, p2, Lcom/google/android/gms/internal/ads/zzatd;->z:I

    sget-object v4, Lcom/daaw/pz2;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "FalseCheck [legacyFrameSize, "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] ["

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    :goto_2
    iget-boolean p2, p1, Lcom/daaw/ju2;->b:Z

    if-eq v0, p2, :cond_7

    const/4 p2, 0x4

    goto :goto_3

    :cond_7
    const/16 p2, 0x8

    :goto_3
    iget-boolean p1, p1, Lcom/daaw/ju2;->c:Z

    if-eq v0, p1, :cond_8

    goto :goto_4

    :cond_8
    const/16 v1, 0x10

    :goto_4
    if-eq v0, v2, :cond_9

    const/4 p1, 0x2

    goto :goto_5

    :cond_9
    const/4 p1, 0x3

    :goto_5
    or-int/2addr p2, v1

    or-int/2addr p1, p2

    return p1
.end method

.method public final y()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/a03;->Z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a03;->Z:Z

    iget-object v0, p0, Lcom/daaw/a03;->S:Lcom/daaw/k03;

    iget-object v1, p0, Lcom/daaw/a03;->X:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lcom/daaw/k03;->g(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method
