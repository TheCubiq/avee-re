.class public Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;
.super Ljava/lang/Object;
.source "GraphicsUtils.java"


# instance fields
.field public final colorF4AlphaIndex:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 26
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->colorF4AlphaIndex:I

    return-void
.end method

.method public static Int4ColorToIntColor([I)I
    .locals 2

    const/4 v0, 0x3

    .line 205
    aget v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/4 v1, 0x0

    or-int/2addr v0, v1

    .line 206
    aget v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    const/4 v1, 0x1

    .line 207
    aget v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    const/4 v1, 0x2

    .line 208
    aget p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static LerpColorF4([F[F[FF)V
    .locals 7

    const/4 v0, 0x0

    .line 424
    aget v1, p1, v0

    const/4 v2, 0x1

    aget v3, p1, v2

    const/4 v4, 0x2

    aget v5, p1, v4

    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 425
    aget v3, p2, v0

    aget v5, p2, v2

    aget v6, p2, v4

    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    move-result v3

    sub-float/2addr v3, v1

    mul-float v3, v3, p3

    add-float/2addr v1, v3

    .line 428
    aget v3, p1, v0

    aget v5, p2, v0

    aget v6, p1, v0

    sub-float/2addr v5, v6

    mul-float v5, v5, p3

    add-float/2addr v3, v5

    aput v3, p0, v0

    .line 429
    aget v3, p1, v2

    aget v5, p2, v2

    aget v6, p1, v2

    sub-float/2addr v5, v6

    mul-float v5, v5, p3

    add-float/2addr v3, v5

    aput v3, p0, v2

    .line 430
    aget v3, p1, v4

    aget v5, p2, v4

    aget v6, p1, v4

    sub-float/2addr v5, v6

    mul-float v5, v5, p3

    add-float/2addr v3, v5

    aput v3, p0, v4

    const/4 v3, 0x3

    .line 431
    aget v5, p1, v3

    aget p2, p2, v3

    aget p1, p1, v3

    sub-float/2addr p2, p1

    mul-float p2, p2, p3

    add-float/2addr v5, p2

    aput v5, p0, v3

    .line 434
    aget p1, p0, v0

    aget p2, p0, v0

    mul-float p1, p1, p2

    aget p2, p0, v2

    aget p3, p0, v2

    mul-float p2, p2, p3

    add-float/2addr p1, p2

    aget p2, p0, v4

    aget p3, p0, v4

    mul-float p2, p2, p3

    add-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    .line 435
    aget p2, p0, v0

    div-float/2addr p2, p1

    aput p2, p0, v0

    .line 436
    aget p2, p0, v2

    div-float/2addr p2, p1

    aput p2, p0, v2

    .line 437
    aget p2, p0, v4

    div-float/2addr p2, p1

    aput p2, p0, v4

    .line 439
    aget p1, p0, v0

    mul-float p1, p1, v1

    aput p1, p0, v0

    .line 440
    aget p1, p0, v2

    mul-float p1, p1, v1

    aput p1, p0, v2

    .line 441
    aget p1, p0, v4

    mul-float p1, p1, v1

    aput p1, p0, v4

    return-void
.end method

.method public static checkGlError(Ljava/lang/String;)V
    .locals 4

    .line 43
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 44
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": glError "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 45
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method static clamp0255(I)I
    .locals 1

    if-gez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/16 v0, 0xff

    if-le p0, v0, :cond_1

    return v0

    :cond_1
    return p0
.end method

.method private static constrain(III)I
    .locals 0

    if-ge p0, p1, :cond_0

    move p0, p1

    goto :goto_0

    :cond_0
    if-le p0, p2, :cond_1

    move p0, p2

    :cond_1
    :goto_0
    return p0
.end method

.method public static createBitmapFromOGLPixels([III[[I)Landroid/graphics/Bitmap;
    .locals 9

    const/4 v0, 0x1

    if-nez p3, :cond_0

    new-array p3, v0, [[I

    :cond_0
    const/4 v1, 0x0

    .line 544
    aget-object v2, p3, v1

    if-eqz v2, :cond_1

    aget-object v2, p3, v1

    array-length v2, v2

    mul-int v3, p1, p2

    if-eq v2, v3, :cond_2

    :cond_1
    mul-int v2, p1, p2

    .line 545
    new-array v2, v2, [I

    aput-object v2, p3, v1

    .line 547
    :cond_2
    aget-object p3, p3, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, p2, :cond_4

    const/4 v4, 0x0

    :goto_1
    if-ge v4, p1, :cond_3

    mul-int v5, v2, p1

    add-int/2addr v5, v4

    .line 554
    aget v5, p0, v5

    shr-int/lit8 v6, v5, 0x10

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v7, v5, 0x10

    const/high16 v8, 0xff0000

    and-int/2addr v7, v8

    const v8, -0xff0100

    and-int/2addr v5, v8

    or-int/2addr v5, v7

    or-int/2addr v5, v6

    sub-int v6, p2, v3

    sub-int/2addr v6, v0

    mul-int v6, v6, p1

    add-int/2addr v6, v4

    .line 558
    aput v5, p3, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 561
    :cond_4
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p3, p1, p2, p0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static f4ColorMultiply([F[F[F)V
    .locals 3

    const/4 v0, 0x0

    .line 416
    aget v1, p1, v0

    aget v2, p2, v0

    mul-float v1, v1, v2

    aput v1, p0, v0

    const/4 v0, 0x1

    .line 417
    aget v1, p1, v0

    aget v2, p2, v0

    mul-float v1, v1, v2

    aput v1, p0, v0

    const/4 v0, 0x2

    .line 418
    aget v1, p1, v0

    aget v2, p2, v0

    mul-float v1, v1, v2

    aput v1, p0, v0

    const/4 v0, 0x3

    .line 419
    aget p1, p1, v0

    aget p2, p2, v0

    mul-float p1, p1, p2

    aput p1, p0, v0

    return-void
.end method

.method public static f4ColorToIntColor(FFFF)I
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float p0, p0, v0

    float-to-int p0, p0

    shl-int/lit8 p0, p0, 0x18

    or-int/lit8 p0, p0, 0x0

    mul-float p1, p1, v0

    float-to-int p1, p1

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    mul-float p2, p2, v0

    float-to-int p1, p2

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    mul-float p3, p3, v0

    float-to-int p1, p3

    or-int/2addr p0, p1

    return p0
.end method

.method public static f4ColorToIntColor([F)I
    .locals 3

    const/4 v0, 0x3

    .line 52
    aget v0, p0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float v0, v0, v1

    float-to-int v0, v0

    shl-int/lit8 v0, v0, 0x18

    const/4 v2, 0x0

    or-int/2addr v0, v2

    .line 53
    aget v2, p0, v2

    mul-float v2, v2, v1

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v0, v2

    const/4 v2, 0x1

    .line 54
    aget v2, p0, v2

    mul-float v2, v2, v1

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v0, v2

    const/4 v2, 0x2

    .line 55
    aget p0, p0, v2

    mul-float p0, p0, v1

    float-to-int p0, p0

    or-int/2addr p0, v0

    return p0
.end method

.method public static f4ColorToIntColorRgba([FI)I
    .locals 3

    add-int/lit8 v0, p1, 0x3

    .line 80
    aget v0, p0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float v0, v0, v1

    float-to-int v0, v0

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v2, p1, 0x2

    .line 81
    aget v2, p0, v2

    mul-float v2, v2, v1

    float-to-int v2, v2

    or-int/2addr v0, v2

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v2, p1, 0x1

    .line 82
    aget v2, p0, v2

    mul-float v2, v2, v1

    float-to-int v2, v2

    or-int/2addr v0, v2

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x0

    .line 83
    aget p0, p0, p1

    mul-float p0, p0, v1

    float-to-int p0, p0

    or-int/2addr p0, v0

    return p0
.end method

.method public static f4ColorToIntColorRgba([FIF)I
    .locals 2

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float p2, p2, v0

    float-to-int p2, p2

    shl-int/lit8 p2, p2, 0x8

    add-int/lit8 v1, p1, 0x2

    .line 101
    aget v1, p0, v1

    mul-float v1, v1, v0

    float-to-int v1, v1

    or-int/2addr p2, v1

    shl-int/lit8 p2, p2, 0x8

    add-int/lit8 v1, p1, 0x1

    .line 102
    aget v1, p0, v1

    mul-float v1, v1, v0

    float-to-int v1, v1

    or-int/2addr p2, v1

    shl-int/lit8 p2, p2, 0x8

    add-int/lit8 p1, p1, 0x0

    .line 103
    aget p0, p0, p1

    mul-float p0, p0, v0

    float-to-int p0, p0

    or-int/2addr p0, p2

    return p0
.end method

.method public static getAlphaFloatFromF4Color([F)F
    .locals 1

    const/4 v0, 0x3

    .line 396
    aget p0, p0, v0

    return p0
.end method

.method public static getAlphaFloatFromIntColor(I)F
    .locals 1

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-float p0, p0

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p0, v0

    return p0
.end method

.method public static getFrameBufferPixels(IIII[[I)[I
    .locals 10

    if-nez p4, :cond_0

    const/4 p4, 0x2

    new-array p4, p4, [[I

    :cond_0
    const/4 v0, 0x1

    .line 485
    aget-object v1, p4, v0

    if-eqz v1, :cond_1

    aget-object v1, p4, v0

    array-length v1, v1

    add-int v2, p1, p3

    mul-int v2, v2, p2

    if-eq v1, v2, :cond_2

    :cond_1
    const-string v1, "## allocating buffer 0"

    .line 486
    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    add-int v1, p1, p3

    mul-int v1, v1, p2

    .line 487
    new-array v1, v1, [I

    aput-object v1, p4, v0

    :cond_2
    const/4 v1, 0x0

    .line 490
    aget-object v2, p4, v1

    if-eqz v2, :cond_3

    aget-object v2, p4, v1

    array-length v2, v2

    mul-int v3, p2, p3

    if-eq v2, v3, :cond_4

    :cond_3
    const-string v2, "## allocating buffer 1"

    .line 491
    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    mul-int v2, p2, p3

    .line 492
    new-array v2, v2, [I

    aput-object v2, p4, v1

    .line 495
    :cond_4
    aget-object v2, p4, v1

    .line 496
    aget-object p4, p4, v0

    .line 498
    invoke-static {p4}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    move-result-object v9

    .line 499
    invoke-virtual {v9, v1}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v4, 0x0

    add-int v6, p1, p3

    const/16 v7, 0x1908

    const/16 v8, 0x1401

    move v3, p0

    move v5, p2

    .line 500
    invoke-static/range {v3 .. v9}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    const/4 p0, 0x0

    :goto_0
    if-ge p0, p3, :cond_6

    const/4 p1, 0x0

    :goto_1
    if-ge p1, p2, :cond_5

    mul-int v3, p0, p2

    add-int/2addr v3, p1

    .line 507
    aget v3, p4, v3

    shr-int/lit8 v4, v3, 0x10

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v5, v3, 0x10

    const/high16 v6, 0xff0000

    and-int/2addr v5, v6

    const v6, -0xff0100

    and-int/2addr v3, v6

    or-int/2addr v3, v5

    or-int/2addr v3, v4

    const/high16 v4, -0x1000000

    or-int/2addr v3, v4

    sub-int v4, p3, p0

    sub-int/2addr v4, v0

    mul-int v4, v4, p2

    add-int/2addr v4, p1

    .line 511
    aput v3, v2, v4

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_6
    return-object v2
.end method

.method public static getFrameBufferPixelsRGB(IIII[[I)[I
    .locals 8

    if-nez p4, :cond_0

    const/4 p4, 0x1

    new-array p4, p4, [[I

    :cond_0
    const/4 v0, 0x0

    .line 524
    aget-object v1, p4, v0

    if-eqz v1, :cond_1

    aget-object v1, p4, v0

    array-length v1, v1

    add-int v2, p1, p3

    mul-int v2, v2, p2

    if-eq v1, v2, :cond_2

    :cond_1
    const-string v1, "## allocating buffer 0"

    .line 525
    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    add-int v1, p1, p3

    mul-int v1, v1, p2

    .line 526
    new-array v1, v1, [I

    aput-object v1, p4, v0

    .line 528
    :cond_2
    aget-object p4, p4, v0

    .line 530
    invoke-static {p4}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    move-result-object v7

    .line 531
    invoke-virtual {v7, v0}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v2, 0x0

    add-int v4, p1, p3

    const/16 v5, 0x1908

    const/16 v6, 0x1401

    move v1, p0

    move v3, p2

    .line 532
    invoke-static/range {v1 .. v7}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    return-object p4
.end method

.method public static hlsa1ColorToF4Color([F[F)V
    .locals 1

    const/high16 v0, 0x43b40000    # 360.0f

    .line 324
    invoke-static {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa360ColorToF4Color([F[FF)V

    return-void
.end method

.method public static hlsa1ColorToInt([F)I
    .locals 7

    const/4 v0, 0x0

    .line 260
    aget v1, p0, v0

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float v1, v1, v2

    const/4 v2, 0x1

    .line 261
    aget v2, p0, v2

    const/4 v3, 0x2

    .line 262
    aget v3, p0, v3

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v5, v3, v4

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float/2addr v5, v6

    .line 264
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    sub-float v5, v6, v5

    mul-float v5, v5, v2

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v2, v2, v5

    sub-float/2addr v3, v2

    const/high16 v2, 0x42700000    # 60.0f

    div-float v2, v1, v2

    rem-float/2addr v2, v4

    sub-float/2addr v2, v6

    .line 266
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float/2addr v6, v2

    mul-float v6, v6, v5

    float-to-int v1, v1

    .line 268
    div-int/lit8 v1, v1, 0x3c

    const/high16 v2, 0x437f0000    # 255.0f

    packed-switch v1, :pswitch_data_0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto/16 :goto_0

    :pswitch_0
    add-float/2addr v5, v3

    mul-float v5, v5, v2

    .line 300
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v1

    mul-float v4, v3, v2

    .line 301
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    add-float/2addr v6, v3

    mul-float v6, v6, v2

    .line 302
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v3

    goto :goto_0

    :pswitch_1
    add-float/2addr v6, v3

    mul-float v6, v6, v2

    .line 294
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v1

    mul-float v4, v3, v2

    .line 295
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    add-float/2addr v5, v3

    mul-float v5, v5, v2

    .line 296
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v3

    goto :goto_0

    :pswitch_2
    mul-float v1, v3, v2

    .line 289
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-float/2addr v6, v3

    mul-float v6, v6, v2

    .line 290
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v4

    add-float/2addr v5, v3

    mul-float v5, v5, v2

    .line 291
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v3

    goto :goto_0

    :pswitch_3
    mul-float v1, v3, v2

    .line 284
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-float/2addr v5, v3

    mul-float v5, v5, v2

    .line 285
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    add-float/2addr v6, v3

    mul-float v6, v6, v2

    .line 286
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v3

    goto :goto_0

    :pswitch_4
    add-float/2addr v6, v3

    mul-float v6, v6, v2

    .line 279
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-float/2addr v5, v3

    mul-float v5, v5, v2

    .line 280
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    mul-float v3, v3, v2

    .line 281
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    goto :goto_0

    :pswitch_5
    add-float/2addr v5, v3

    mul-float v5, v5, v2

    .line 274
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-float/2addr v6, v3

    mul-float v6, v6, v2

    .line 275
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v4

    mul-float v3, v3, v2

    .line 276
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    :goto_0
    const/16 v5, 0xff

    .line 306
    invoke-static {v1, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->constrain(III)I

    move-result v1

    .line 307
    invoke-static {v4, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->constrain(III)I

    move-result v4

    .line 308
    invoke-static {v3, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->constrain(III)I

    move-result v0

    .line 310
    invoke-static {v1, v4, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    const v1, 0xffffff

    and-int/2addr v0, v1

    const/4 v1, 0x3

    .line 316
    aget p0, p0, v1

    mul-float p0, p0, v2

    float-to-int p0, p0

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static hlsa360ColorToF4Color([F[F)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 328
    invoke-static {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa360ColorToF4Color([F[FF)V

    return-void
.end method

.method public static hlsa360ColorToF4Color([F[FF)V
    .locals 9

    const/4 v0, 0x0

    .line 332
    aget v1, p0, v0

    mul-float v1, v1, p2

    const/4 p2, 0x1

    .line 333
    aget v2, p0, p2

    const/4 v3, 0x2

    .line 334
    aget v4, p0, v3

    const/high16 v5, 0x40000000    # 2.0f

    mul-float v6, v4, v5

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v6, v7

    .line 336
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    sub-float v6, v7, v6

    mul-float v6, v6, v2

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v2, v2, v6

    sub-float/2addr v4, v2

    const/high16 v2, 0x42700000    # 60.0f

    div-float v2, v1, v2

    rem-float/2addr v2, v5

    sub-float/2addr v2, v7

    .line 338
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float/2addr v7, v2

    mul-float v7, v7, v6

    float-to-int v1, v1

    .line 340
    div-int/lit8 v1, v1, 0x3c

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    goto :goto_2

    :pswitch_0
    add-float/2addr v6, v4

    add-float/2addr v7, v4

    move v8, v6

    move v6, v4

    goto :goto_0

    :pswitch_1
    add-float/2addr v7, v4

    add-float/2addr v6, v4

    move v8, v6

    move v6, v4

    move v4, v7

    move v7, v8

    goto :goto_2

    :pswitch_2
    add-float/2addr v7, v4

    add-float/2addr v6, v4

    move v8, v7

    move v7, v6

    goto :goto_1

    :pswitch_3
    add-float/2addr v6, v4

    add-float/2addr v7, v4

    goto :goto_2

    :pswitch_4
    add-float/2addr v7, v4

    add-float/2addr v6, v4

    move v8, v7

    move v7, v4

    :goto_0
    move v4, v8

    goto :goto_2

    :pswitch_5
    add-float/2addr v6, v4

    add-float/2addr v7, v4

    move v8, v7

    move v7, v4

    move v4, v6

    :goto_1
    move v6, v8

    .line 382
    :goto_2
    aput v4, p1, v0

    .line 383
    aput v6, p1, p2

    .line 384
    aput v7, p1, v3

    const/4 p2, 0x3

    .line 385
    aget p0, p0, p2

    aput p0, p1, p2

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static hlsa360ColorToInt([F)I
    .locals 2

    .line 243
    invoke-static {p0}, Landroidx/core/graphics/ColorUtils;->HSLToColor([F)I

    move-result v0

    const v1, 0xffffff

    and-int/2addr v0, v1

    const/4 v1, 0x3

    .line 244
    aget p0, p0, v1

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float p0, p0, v1

    float-to-int p0, p0

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static intColorMultiply(II)I
    .locals 7

    const/4 v0, 0x4

    new-array v0, v0, [F

    shr-int/lit8 v1, p0, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    const/high16 v2, 0x437f0000    # 255.0f

    div-float/2addr v1, v2

    const/4 v3, 0x3

    aput v1, v0, v3

    shr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    div-float/2addr v1, v2

    const/4 v4, 0x0

    aput v1, v0, v4

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    div-float/2addr v1, v2

    const/4 v5, 0x1

    aput v1, v0, v5

    and-int/lit16 p0, p0, 0xff

    int-to-float p0, p0

    div-float/2addr p0, v2

    const/4 v1, 0x2

    aput p0, v0, v1

    .line 407
    aget p0, v0, v3

    shr-int/lit8 v6, p1, 0x18

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    div-float/2addr v6, v2

    mul-float p0, p0, v6

    aput p0, v0, v3

    .line 408
    aget p0, v0, v4

    shr-int/lit8 v3, p1, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-float v3, v3

    div-float/2addr v3, v2

    mul-float p0, p0, v3

    aput p0, v0, v4

    .line 409
    aget p0, v0, v5

    shr-int/lit8 v3, p1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-float v3, v3

    div-float/2addr v3, v2

    mul-float p0, p0, v3

    aput p0, v0, v5

    .line 410
    aget p0, v0, v1

    and-int/lit16 p1, p1, 0xff

    int-to-float p1, p1

    div-float/2addr p1, v2

    mul-float p0, p0, p1

    aput p0, v0, v1

    .line 412
    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColor([F)I

    move-result p0

    return p0
.end method

.method public static intColorToByte4Color([II)V
    .locals 2

    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x3

    .line 215
    aput v0, p0, v1

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x0

    .line 216
    aput v0, p0, v1

    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    .line 217
    aput v0, p0, v1

    and-int/lit16 p1, p1, 0xff

    const/4 v0, 0x2

    .line 218
    aput p1, p0, v0

    return-void
.end method

.method public static intColorToF4Color([FI)V
    .locals 1

    const/4 v0, 0x0

    .line 173
    invoke-static {p0, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FII)V

    return-void
.end method

.method public static intColorToF4Color([FII)V
    .locals 3

    add-int/lit8 v0, p1, 0x3

    shr-int/lit8 v1, p2, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    const/high16 v2, 0x437f0000    # 255.0f

    div-float/2addr v1, v2

    .line 178
    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x0

    shr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    div-float/2addr v1, v2

    .line 179
    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    div-float/2addr v1, v2

    .line 180
    aput v1, p0, v0

    add-int/lit8 p1, p1, 0x2

    and-int/lit16 p2, p2, 0xff

    int-to-float p2, p2

    div-float/2addr p2, v2

    .line 181
    aput p2, p0, p1

    return-void
.end method

.method public static intColorToF4Color(I)[F
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [F

    shr-int/lit8 v1, p0, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    const/high16 v2, 0x437f0000    # 255.0f

    div-float/2addr v1, v2

    const/4 v3, 0x3

    aput v1, v0, v3

    shr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    div-float/2addr v1, v2

    const/4 v3, 0x0

    aput v1, v0, v3

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    div-float/2addr v1, v2

    const/4 v3, 0x1

    aput v1, v0, v3

    and-int/lit16 p0, p0, 0xff

    int-to-float p0, p0

    div-float/2addr p0, v2

    const/4 v1, 0x2

    aput p0, v0, v1

    return-object v0
.end method

.method public static intColorToHlsa1([FI)V
    .locals 3

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    and-int/lit16 v2, p1, 0xff

    .line 231
    invoke-static {v0, v1, v2, p0}, Landroidx/core/graphics/ColorUtils;->RGBToHSL(III[F)V

    const/4 v0, 0x0

    .line 236
    aget v1, p0, v0

    const v2, 0x3b360b61

    mul-float v1, v1, v2

    aput v1, p0, v0

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-float p1, p1

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p1, v0

    const/4 v0, 0x3

    .line 237
    aput p1, p0, v0

    return-void
.end method

.method public static intColorToHlsa360([FI)V
    .locals 3

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    and-int/lit16 v2, p1, 0xff

    .line 222
    invoke-static {v0, v1, v2, p0}, Landroidx/core/graphics/ColorUtils;->RGBToHSL(III[F)V

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-float p1, p1

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p1, v0

    const/4 v0, 0x3

    .line 227
    aput p1, p0, v0

    return-void
.end method

.method public static intColorToInt4Color([III)V
    .locals 2

    add-int/lit8 v0, p1, 0x3

    shr-int/lit8 v1, p2, 0x18

    and-int/lit16 v1, v1, 0xff

    .line 195
    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x0

    shr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 196
    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 197
    aput v1, p0, v0

    add-int/lit8 p1, p1, 0x2

    and-int/lit16 p2, p2, 0xff

    .line 198
    aput p2, p0, p1

    return-void
.end method

.method public static loadShader(ILjava/lang/String;)I
    .locals 0

    .line 33
    invoke-static {p0}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p0

    .line 35
    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 36
    invoke-static {p0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    return p0
.end method

.method public static resourceDisposed(Z)V
    .locals 0

    if-nez p0, :cond_0

    const-string p0, "Resource not disposed!"

    .line 622
    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static savePNG(Landroid/content/Context;IIIILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 566
    check-cast v0, [[I

    invoke-static {p1, p2, p3, p4, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->savePixels(IIII[[I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 567
    invoke-static {p0, p1, p5}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->savePNG(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V

    return-void
.end method

.method public static savePNG(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 3

    .line 574
    :try_start_0
    new-instance v0, Ljava/io/File;

    sget-object v1, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 576
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 578
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_0

    .line 579
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 581
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 582
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 584
    :cond_1
    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 585
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {p1, v1, v2, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 586
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->flush()V

    .line 587
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V

    .line 588
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 591
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "error saving image "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static savePNG2(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 1

    .line 599
    :try_start_0
    new-instance p0, Ljava/io/File;

    sget-object v0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 601
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 603
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    .line 604
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 606
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 607
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 609
    :cond_1
    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 610
    sget-object p0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v0, 0x64

    invoke-virtual {p1, p0, v0, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 611
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 614
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "error saving image "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static savePixels(IIII[[I)Landroid/graphics/Bitmap;
    .locals 10

    const/4 v0, 0x1

    if-nez p4, :cond_0

    new-array p4, v0, [[I

    :cond_0
    const/4 v1, 0x0

    .line 450
    aget-object v2, p4, v1

    if-eqz v2, :cond_1

    aget-object v2, p4, v1

    array-length v2, v2

    add-int v3, p1, p3

    mul-int v3, v3, p2

    if-eq v2, v3, :cond_2

    :cond_1
    const-string v2, "## allocating buffer"

    .line 451
    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    add-int v2, p1, p3

    mul-int v2, v2, p2

    .line 452
    new-array v2, v2, [I

    aput-object v2, p4, v1

    .line 455
    :cond_2
    aget-object p4, p4, v1

    mul-int v2, p2, p3

    .line 457
    new-array v2, v2, [I

    .line 458
    invoke-static {p4}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    move-result-object v9

    .line 459
    invoke-virtual {v9, v1}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v4, 0x0

    add-int v6, p1, p3

    const/16 v7, 0x1908

    const/16 v8, 0x1401

    move v3, p0

    move v5, p2

    .line 460
    invoke-static/range {v3 .. v9}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    const/4 p0, 0x0

    const/4 p1, 0x0

    :goto_0
    if-ge p0, p3, :cond_4

    const/4 v3, 0x0

    :goto_1
    if-ge v3, p2, :cond_3

    mul-int v4, p0, p2

    add-int/2addr v4, v3

    .line 467
    aget v4, p4, v4

    shr-int/lit8 v5, v4, 0x10

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v6, v4, 0x10

    const/high16 v7, 0xff0000

    and-int/2addr v6, v7

    const v7, -0xff0100

    and-int/2addr v4, v7

    or-int/2addr v4, v6

    or-int/2addr v4, v5

    sub-int v5, p3, p1

    sub-int/2addr v5, v0

    mul-int v5, v5, p2

    add-int/2addr v5, v3

    .line 471
    aput v4, v2, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 p0, p0, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 474
    :cond_4
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, p2, p3, p0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static setF4ColorFromF4This([FI[FI)V
    .locals 2

    add-int/lit8 v0, p1, 0x3

    add-int/lit8 v1, p3, 0x3

    .line 145
    aget v1, p2, v1

    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x0

    add-int/lit8 v1, p3, 0x0

    .line 146
    aget v1, p2, v1

    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x1

    add-int/lit8 v1, p3, 0x1

    .line 147
    aget v1, p2, v1

    aput v1, p0, v0

    add-int/lit8 p1, p1, 0x2

    add-int/lit8 p3, p3, 0x2

    .line 148
    aget p2, p2, p3

    aput p2, p0, p1

    return-void
.end method

.method public static setIntColorAlpha(II)I
    .locals 1

    const v0, 0xffffff

    and-int/2addr p0, v0

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p0, p1

    return p0
.end method

.method public static setf4ColorAlpha([FF[F)[F
    .locals 1

    const/4 v0, 0x0

    .line 123
    invoke-static {p0, v0, p1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->setf4ColorAlpha([FIF[FI)[F

    move-result-object p0

    return-object p0
.end method

.method public static setf4ColorAlpha([FIF[FI)[F
    .locals 1

    add-int/lit8 v0, p1, 0x3

    .line 128
    aput p2, p0, v0

    add-int/lit8 p2, p1, 0x0

    add-int/lit8 v0, p4, 0x0

    .line 129
    aget v0, p3, v0

    aput v0, p0, p2

    add-int/lit8 p2, p1, 0x1

    add-int/lit8 v0, p4, 0x1

    .line 130
    aget v0, p3, v0

    aput v0, p0, p2

    add-int/lit8 p1, p1, 0x2

    add-int/lit8 p4, p4, 0x2

    .line 131
    aget p2, p3, p4

    aput p2, p0, p1

    return-object p0
.end method

.method public static setf4ColorAlphaThis([FIF)V
    .locals 1

    add-int/lit8 v0, p1, 0x3

    .line 138
    aput p2, p0, v0

    add-int/lit8 p2, p1, 0x0

    const/4 v0, 0x0

    .line 139
    aget v0, p0, v0

    aput v0, p0, p2

    add-int/lit8 p2, p1, 0x1

    const/4 v0, 0x1

    .line 140
    aget v0, p0, v0

    aput v0, p0, p2

    const/4 p2, 0x2

    add-int/2addr p1, p2

    .line 141
    aget p2, p0, p2

    aput p2, p0, p1

    return-void
.end method
