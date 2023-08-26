.class public Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;
.super Ljava/lang/Object;
.source "GlaussianKernel.java"


# instance fields
.field public Radius:I

.field divider:F

.field kernel:[F

.field kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

.field width:I


# direct methods
.method public constructor <init>([FFII)V
    .locals 4

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 160
    iput p4, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->Radius:I

    .line 161
    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->width:I

    .line 162
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    .line 163
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->divider:F

    .line 165
    array-length p1, p1

    new-array p1, p1, [Lcom/daaw/avee/Common/Vec2i;

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    add-int/lit8 p1, p3, -0x1

    .line 169
    div-int/lit8 p1, p1, 0x2

    add-int/lit8 p2, p3, -0x1

    .line 170
    div-int/lit8 p2, p2, 0x2

    const/4 p4, 0x0

    .line 172
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v1, v0

    if-ge p4, v1, :cond_0

    .line 174
    rem-int v1, p4, p3

    .line 175
    div-int v2, p4, p3

    .line 176
    new-instance v3, Lcom/daaw/avee/Common/Vec2i;

    sub-int/2addr v1, p1

    sub-int/2addr v2, p2

    invoke-direct {v3, v1, v2}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    aput-object v3, v0, p4

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static CreateAllPass(I)Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;
    .locals 12

    int-to-double v0, p0

    const-wide v2, 0x40048f5c28f5c28fL    # 2.57

    .line 137
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int v1, v0, v0

    add-int/lit8 v1, v1, 0x1

    mul-int v2, v1, v1

    .line 139
    new-array v2, v2, [F

    neg-int v3, v0

    const/4 v4, 0x0

    move v5, v3

    const/4 v6, 0x0

    :goto_0
    add-int/lit8 v7, v0, 0x1

    if-ge v5, v7, :cond_2

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_1

    if-nez v5, :cond_0

    if-nez v8, :cond_0

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_0
    const/4 v9, 0x0

    :goto_2
    add-int v10, v5, v0

    mul-int v10, v10, v1

    add-int v11, v8, v0

    add-int/2addr v10, v11

    .line 145
    aput v9, v2, v10

    add-float/2addr v6, v9

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 148
    :cond_2
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;

    invoke-direct {v0, v2, v6, v1, p0}, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;-><init>([FFII)V

    return-object v0
.end method

.method public static CreateGlaussian(I)Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;
    .locals 15

    int-to-double v0, p0

    const-wide v2, 0x40048f5c28f5c28fL    # 2.57

    .line 101
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    add-int v3, v2, v2

    const/4 v4, 0x1

    add-int/2addr v3, v4

    mul-int v5, v3, v3

    .line 104
    new-array v6, v5, [F

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    if-ne v5, v4, :cond_0

    .line 110
    aput v7, v6, v8

    goto :goto_2

    :cond_0
    rsub-int/lit8 v5, v2, 0x0

    const/4 v7, 0x0

    move v9, v5

    :goto_0
    add-int v10, v8, v2

    add-int/2addr v10, v4

    if-ge v9, v10, :cond_2

    move v11, v5

    :goto_1
    if-ge v11, v10, :cond_1

    add-int/lit8 v12, v11, 0x0

    mul-int v12, v12, v12

    add-int/lit8 v13, v9, 0x0

    mul-int v13, v13, v13

    add-int/2addr v12, v13

    int-to-float v12, v12

    neg-float v12, v12

    mul-int/lit8 v13, p0, 0x2

    mul-int v13, v13, p0

    int-to-float v13, v13

    div-float/2addr v12, v13

    float-to-double v12, v12

    .line 126
    invoke-static {v12, v13}, Ljava/lang/Math;->exp(D)D

    move-result-wide v12

    double-to-float v12, v12

    const-wide v13, 0x401921fb54442d18L    # 6.283185307179586

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v13, v13, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v13, v13, v0

    double-to-float v13, v13

    div-float/2addr v12, v13

    add-int v13, v9, v2

    mul-int v13, v13, v3

    add-int v14, v11, v2

    add-int/2addr v13, v14

    .line 127
    aput v12, v6, v13

    add-float/2addr v7, v12

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 131
    :cond_2
    :goto_2
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;

    invoke-direct {v0, v6, v7, v3, p0}, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;-><init>([FFII)V

    return-object v0
.end method

.method public static CreateSinc(II)Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;
    .locals 10

    add-int v0, p0, p0

    add-int/lit8 v0, v0, 0x1

    mul-int v1, v0, v0

    .line 75
    new-array v1, v1, [F

    neg-int v2, p0

    const/4 v3, 0x0

    move v4, v2

    :goto_0
    add-int/lit8 v5, p0, 0x1

    if-ge v4, v5, :cond_1

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_0

    mul-int v7, v6, v6

    mul-int v8, v4, v4

    add-int/2addr v7, v8

    int-to-double v7, v7

    .line 91
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    double-to-float v7, v7

    int-to-float v8, p0

    .line 92
    invoke-static {v7, v8, p1}, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->windowed_sinc(FFI)F

    move-result v7

    add-int v8, v4, p0

    mul-int v8, v8, v0

    add-int v9, v6, p0

    add-int/2addr v8, v9

    .line 93
    aput v7, v1, v8

    add-float/2addr v3, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 96
    :cond_1
    new-instance p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;

    invoke-direct {p1, v1, v3, v0, p0}, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;-><init>([FFII)V

    return-object p1
.end method

.method static sinc(F)F
    .locals 6

    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-nez v0, :cond_0

    const/high16 p0, 0x3f800000    # 1.0f

    return p0

    :cond_0
    float-to-double v0, p0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    .line 45
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v0, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v4, v0

    mul-double v4, v4, v2

    double-to-float p0, v4

    return p0
.end method

.method static sinc2(FF)F
    .locals 4

    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-nez v0, :cond_0

    const/high16 p0, 0x40000000    # 2.0f

    mul-float p1, p1, p0

    return p1

    :cond_0
    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    float-to-double v2, p1

    .line 63
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v0

    float-to-double p0, p0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, p0

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p0, p0, v2

    div-double/2addr v0, p0

    double-to-float p0, v0

    return p0
.end method

.method static wBlackman(FF)F
    .locals 7

    const/high16 v0, 0x40000000    # 2.0f

    mul-float v0, v0, p1

    sub-float/2addr p1, p0

    float-to-double p0, p1

    const-wide v1, 0x401921fb54442d18L    # 6.283185307179586

    .line 20
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, p0

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    mul-double v0, v0, v5

    const-wide v5, 0x3fdae147ae147ae1L    # 0.42

    sub-double/2addr v5, v0

    const-wide v0, 0x402921fb54442d18L    # 12.566370614359172

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p0, p0, v0

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p0, v3

    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    const-wide v0, 0x3fb47ae147ae147bL    # 0.08

    mul-double p0, p0, v0

    add-double/2addr v5, p0

    double-to-float p0, v5

    return p0
.end method

.method static windowed_sinc(FFI)F
    .locals 1

    const/high16 v0, 0x3e800000    # 0.25f

    mul-float p1, p1, v0

    int-to-float p2, p2

    mul-float p1, p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    div-float/2addr p2, p1

    .line 51
    invoke-static {p0, p2}, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->sinc2(FF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public Add(Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;)V
    .locals 5

    .line 239
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v0, v0

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v1, v1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 243
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    .line 245
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v3, v2, v1

    iget-object v4, p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v4, v4, v1

    add-float/2addr v3, v4

    aput v3, v2, v1

    .line 246
    aget v2, v2, v1

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 249
    :cond_1
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->divider:F

    return-void
.end method

.method public Convolution([F[FII)V
    .locals 7

    .line 290
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->width:I

    add-int/lit8 v1, v0, -0x1

    .line 293
    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v0, v0, -0x1

    .line 294
    div-int/lit8 v0, v0, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_2

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p3, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 331
    :goto_2
    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v6, v5

    if-ge v4, v6, :cond_0

    add-int/lit8 v3, p3, -0x1

    .line 333
    aget-object v5, v5, v4

    iget v5, v5, Lcom/daaw/avee/Common/Vec2i;->x:I

    add-int/2addr v5, v2

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/lit8 v5, p4, -0x1

    .line 334
    iget-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    aget-object v6, v6, v4

    iget v6, v6, Lcom/daaw/avee/Common/Vec2i;->y:I

    add-int/2addr v6, v1

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    mul-int v5, v5, p3

    add-int/2addr v5, v3

    .line 336
    aget v3, p1, v5

    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v5, v5, v4

    mul-float v3, v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_0
    mul-int v4, v1, p3

    add-int/2addr v4, v2

    .line 339
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->divider:F

    div-float/2addr v3, v5

    aput v3, p2, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public Invert()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 257
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 259
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v3, v2, v1

    const/high16 v4, -0x40800000    # -1.0f

    mul-float v3, v3, v4

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 262
    :cond_0
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->width:I

    add-int/lit8 v2, v1, -0x1

    div-int/lit8 v2, v2, 0x2

    add-int/lit8 v3, v1, -0x1

    .line 263
    div-int/lit8 v3, v3, 0x2

    .line 264
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    mul-int v1, v1, v3

    add-int/2addr v1, v2

    aget v2, v4, v1

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v2, v3

    aput v2, v4, v1

    const/4 v1, 0x0

    .line 267
    :goto_1
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 269
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v2, v2, v0

    add-float/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 272
    :cond_1
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->divider:F

    return-void
.end method

.method public Invert2()V
    .locals 4

    const/4 v0, 0x0

    .line 279
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 281
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v2, v1, v0

    const/high16 v3, -0x40800000    # -1.0f

    mul-float v2, v2, v3

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public Levels([F[FII)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    .line 403
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->getCenterKernel()F

    move-result v3

    .line 404
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->getCenterKernelIndex()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_4

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v1, :cond_3

    add-int/lit8 v8, v1, -0x1

    .line 441
    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    aget-object v9, v9, v4

    iget v9, v9, Lcom/daaw/avee/Common/Vec2i;->x:I

    add-int/2addr v9, v7

    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    add-int/lit8 v10, v2, -0x1

    .line 442
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    aget-object v11, v11, v4

    iget v11, v11, Lcom/daaw/avee/Common/Vec2i;->y:I

    add-int/2addr v11, v6

    invoke-static {v5, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    mul-int v11, v11, v1

    add-int/2addr v11, v9

    .line 443
    aget v9, p1, v11

    move v11, v9

    const/4 v12, 0x0

    .line 451
    :goto_2
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v14, v13

    if-ge v12, v14, :cond_2

    .line 453
    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2i;->x:I

    add-int/2addr v13, v7

    invoke-static {v5, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    invoke-static {v8, v13}, Ljava/lang/Math;->min(II)I

    move-result v13

    .line 454
    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    aget-object v14, v14, v12

    iget v14, v14, Lcom/daaw/avee/Common/Vec2i;->y:I

    add-int/2addr v14, v6

    invoke-static {v5, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    invoke-static {v10, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 458
    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v15, v15, v12

    const/high16 v16, 0x3f800000    # 1.0f

    div-float v17, v16, v3

    mul-float v15, v15, v17

    mul-int v14, v14, v1

    add-int/2addr v14, v13

    .line 462
    aget v13, p1, v14

    mul-float v13, v13, v15

    sub-float v16, v16, v15

    mul-float v14, v9, v16

    add-float/2addr v14, v13

    cmpl-float v15, v9, v14

    if-lez v15, :cond_0

    move v9, v14

    :cond_0
    mul-float v16, v16, v11

    add-float v13, v13, v16

    cmpg-float v14, v11, v13

    if-gez v14, :cond_1

    move v11, v13

    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_2
    mul-int v8, v6, v1

    add-int/2addr v8, v7

    .line 509
    aget v10, p1, v8

    neg-float v12, v9

    add-float/2addr v10, v12

    sub-float/2addr v11, v9

    const v9, 0x33d6bf95    # 1.0E-7f

    add-float/2addr v11, v9

    div-float/2addr v10, v11

    .line 512
    aput v10, p2, v8

    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method public Subtract(Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;)V
    .locals 6

    .line 183
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v0, v0

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v1, v1

    if-eq v0, v1, :cond_0

    const-string p1, "kernelIndex.length dont match"

    .line 185
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 189
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 191
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v2, v1, v0

    iget-object v3, p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v3, v3, v0

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->divider:F

    iget v5, p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->divider:F

    div-float/2addr v4, v5

    mul-float v3, v3, v4

    sub-float/2addr v2, v3

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public Subtract2(Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;)V
    .locals 8

    .line 204
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->width:I

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->width:I

    sub-int v1, v0, v1

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    .line 210
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v3, v3

    if-ge v2, v3, :cond_1

    .line 212
    rem-int v3, v2, v0

    .line 213
    div-int v4, v2, v0

    sub-int/2addr v3, v1

    sub-int/2addr v4, v1

    if-ltz v3, :cond_0

    .line 218
    iget v5, p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->width:I

    if-ge v3, v5, :cond_0

    if-ltz v4, :cond_0

    if-ge v4, v5, :cond_0

    mul-int v4, v4, v5

    add-int/2addr v4, v3

    .line 222
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v5, v3, v2

    iget-object v6, p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v4, v6, v4

    iget v6, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->divider:F

    iget v7, p1, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->divider:F

    div-float/2addr v6, v7

    mul-float v4, v4, v6

    sub-float/2addr v5, v4

    aput v5, v3, v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method getCenterKernel()F
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 360
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 362
    aget-object v2, v2, v1

    iget v2, v2, Lcom/daaw/avee/Common/Vec2i;->x:I

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/daaw/avee/Common/Vec2i;->y:I

    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernel:[F

    aget v0, v0, v1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 365
    :cond_1
    invoke-static {v0}, Ljunit/framework/Assert;->assertTrue(Z)V

    const/4 v0, 0x0

    return v0
.end method

.method getCenterKernelIndex()I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 348
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 350
    aget-object v2, v2, v1

    iget v2, v2, Lcom/daaw/avee/Common/Vec2i;->x:I

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/GlaussianKernel;->kernelIndex:[Lcom/daaw/avee/Common/Vec2i;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/daaw/avee/Common/Vec2i;->y:I

    if-nez v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 353
    :cond_1
    invoke-static {v0}, Ljunit/framework/Assert;->assertTrue(Z)V

    return v0
.end method
