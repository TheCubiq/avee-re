.class public Lcom/NAudio/FastFourierTransform;
.super Ljava/lang/Object;
.source "FastFourierTransform.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/NAudio/FastFourierTransform$Complex;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static FFT(ZI[Lcom/NAudio/FastFourierTransform$Complex;)V
    .locals 16

    move/from16 v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_0
    if-ge v3, v0, :cond_0

    mul-int/lit8 v4, v4, 0x2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    shr-int/lit8 v3, v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    add-int/lit8 v7, v4, -0x1

    if-ge v5, v7, :cond_3

    if-ge v5, v6, :cond_1

    .line 87
    aget-object v7, p2, v5

    iget v7, v7, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    .line 88
    aget-object v8, p2, v5

    iget v8, v8, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    .line 89
    aget-object v9, p2, v5

    aget-object v10, p2, v6

    iget v10, v10, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    iput v10, v9, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    .line 90
    aget-object v9, p2, v5

    aget-object v10, p2, v6

    iget v10, v10, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    iput v10, v9, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    .line 91
    aget-object v9, p2, v6

    iput v7, v9, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    .line 92
    aget-object v7, p2, v6

    iput v8, v7, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    :cond_1
    move v7, v3

    :goto_2
    if-gt v7, v6, :cond_2

    sub-int/2addr v6, v7

    shr-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    add-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    const/high16 v3, -0x40800000    # -1.0f

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_3
    if-ge v6, v0, :cond_7

    shl-int/lit8 v8, v2, 0x1

    const/4 v10, 0x0

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    :goto_4
    if-ge v10, v2, :cond_5

    move v13, v10

    :goto_5
    if-ge v13, v4, :cond_4

    add-int v14, v13, v2

    .line 115
    aget-object v15, p2, v14

    iget v15, v15, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    mul-float v15, v15, v11

    aget-object v1, p2, v14

    iget v1, v1, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    mul-float v1, v1, v12

    sub-float/2addr v15, v1

    .line 116
    aget-object v1, p2, v14

    iget v1, v1, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    mul-float v1, v1, v11

    aget-object v5, p2, v14

    iget v5, v5, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    mul-float v5, v5, v12

    add-float/2addr v1, v5

    .line 117
    aget-object v5, p2, v14

    aget-object v9, p2, v13

    iget v9, v9, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    sub-float/2addr v9, v15

    iput v9, v5, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    .line 118
    aget-object v5, p2, v14

    aget-object v9, p2, v13

    iget v9, v9, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    sub-float/2addr v9, v1

    iput v9, v5, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    .line 119
    aget-object v5, p2, v13

    iget v9, v5, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    add-float/2addr v9, v15

    iput v9, v5, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    .line 120
    aget-object v5, p2, v13

    iget v9, v5, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    add-float/2addr v9, v1

    iput v9, v5, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    add-int/2addr v13, v8

    goto :goto_5

    :cond_4
    mul-float v1, v11, v3

    mul-float v5, v12, v7

    sub-float/2addr v1, v5

    mul-float v11, v11, v7

    mul-float v12, v12, v3

    add-float/2addr v12, v11

    add-int/lit8 v10, v10, 0x1

    move v11, v1

    goto :goto_4

    :cond_5
    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v9, v1, v3

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v9, v2

    float-to-double v9, v9

    .line 126
    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    double-to-float v5, v9

    if-eqz p0, :cond_6

    neg-float v5, v5

    :cond_6
    move v7, v5

    add-float/2addr v3, v1

    div-float/2addr v3, v2

    float-to-double v1, v3

    .line 129
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v3, v1

    add-int/lit8 v6, v6, 0x1

    move v2, v8

    goto :goto_3

    :cond_7
    if-eqz p0, :cond_8

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v4, :cond_8

    .line 135
    aget-object v0, p2, v1

    iget v2, v0, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    int-to-float v3, v4

    div-float/2addr v2, v3

    iput v2, v0, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    .line 136
    aget-object v0, p2, v1

    iget v2, v0, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    div-float/2addr v2, v3

    iput v2, v0, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_8
    return-void
.end method

.method public static FFT(Z[Lcom/NAudio/FastFourierTransform$Complex;)V
    .locals 2

    .line 70
    array-length v0, p1

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/NAudio/FastFourierTransform;->log(II)I

    move-result v0

    invoke-static {p0, v0, p1}, Lcom/NAudio/FastFourierTransform;->FFT(ZI[Lcom/NAudio/FastFourierTransform$Complex;)V

    return-void
.end method

.method static log(II)I
    .locals 2

    int-to-double v0, p0

    .line 62
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    int-to-double p0, p1

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    div-double/2addr v0, p0

    double-to-int p0, v0

    return p0
.end method
