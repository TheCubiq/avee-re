.class public Lcom/daaw/f80;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a([I)I
    .locals 2

    const/4 v0, 0x3

    aget v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/4 v1, 0x0

    or-int/2addr v0, v1

    aget v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    const/4 v1, 0x1

    aget v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    const/4 v1, 0x2

    aget p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static b([F[F[FF)V
    .locals 7

    const/4 v0, 0x0

    aget v1, p1, v0

    const/4 v2, 0x1

    aget v3, p1, v2

    const/4 v4, 0x2

    aget v5, p1, v4

    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    move-result v1

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

    aget v3, p1, v0

    aget v5, p2, v0

    aget v6, p1, v0

    sub-float/2addr v5, v6

    mul-float v5, v5, p3

    add-float/2addr v3, v5

    aput v3, p0, v0

    aget v3, p1, v2

    aget v5, p2, v2

    aget v6, p1, v2

    sub-float/2addr v5, v6

    mul-float v5, v5, p3

    add-float/2addr v3, v5

    aput v3, p0, v2

    aget v3, p1, v4

    aget v5, p2, v4

    aget v6, p1, v4

    sub-float/2addr v5, v6

    mul-float v5, v5, p3

    add-float/2addr v3, v5

    aput v3, p0, v4

    const/4 v3, 0x3

    aget v5, p1, v3

    aget p2, p2, v3

    aget p1, p1, v3

    sub-float/2addr p2, p1

    mul-float p2, p2, p3

    add-float/2addr v5, p2

    aput v5, p0, v3

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

    aget p2, p0, v0

    div-float/2addr p2, p1

    aput p2, p0, v0

    aget p2, p0, v2

    div-float/2addr p2, p1

    aput p2, p0, v2

    aget p2, p0, v4

    div-float/2addr p2, p1

    aput p2, p0, v4

    aget p1, p0, v0

    mul-float p1, p1, v1

    aput p1, p0, v0

    aget p1, p0, v2

    mul-float p1, p1, v1

    aput p1, p0, v2

    aget p1, p0, v4

    mul-float p1, p1, v1

    aput p1, p0, v4

    return-void
.end method

.method public static c(III)I
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

.method public static d([F[F[F)V
    .locals 3

    const/4 v0, 0x0

    aget v1, p1, v0

    aget v2, p2, v0

    mul-float v1, v1, v2

    aput v1, p0, v0

    const/4 v0, 0x1

    aget v1, p1, v0

    aget v2, p2, v0

    mul-float v1, v1, v2

    aput v1, p0, v0

    const/4 v0, 0x2

    aget v1, p1, v0

    aget v2, p2, v0

    mul-float v1, v1, v2

    aput v1, p0, v0

    const/4 v0, 0x3

    aget p1, p1, v0

    aget p2, p2, v0

    mul-float p1, p1, p2

    aput p1, p0, v0

    return-void
.end method

.method public static e(FFFF)I
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

.method public static f([F)I
    .locals 3

    const/4 v0, 0x3

    aget v0, p0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float v0, v0, v1

    float-to-int v0, v0

    shl-int/lit8 v0, v0, 0x18

    const/4 v2, 0x0

    or-int/2addr v0, v2

    aget v2, p0, v2

    mul-float v2, v2, v1

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v0, v2

    const/4 v2, 0x1

    aget v2, p0, v2

    mul-float v2, v2, v1

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v0, v2

    const/4 v2, 0x2

    aget p0, p0, v2

    mul-float p0, p0, v1

    float-to-int p0, p0

    or-int/2addr p0, v0

    return p0
.end method

.method public static g([FI)I
    .locals 3

    add-int/lit8 v0, p1, 0x3

    aget v0, p0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float v0, v0, v1

    float-to-int v0, v0

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v2, p1, 0x2

    aget v2, p0, v2

    mul-float v2, v2, v1

    float-to-int v2, v2

    or-int/2addr v0, v2

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v2, p1, 0x1

    aget v2, p0, v2

    mul-float v2, v2, v1

    float-to-int v2, v2

    or-int/2addr v0, v2

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x0

    aget p0, p0, p1

    mul-float p0, p0, v1

    float-to-int p0, p0

    or-int/2addr p0, v0

    return p0
.end method

.method public static h(I)F
    .locals 1

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-float p0, p0

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p0, v0

    return p0
.end method

.method public static i(IIII[[I)[I
    .locals 8

    if-nez p4, :cond_0

    const/4 p4, 0x1

    new-array p4, p4, [[I

    :cond_0
    const/4 v0, 0x0

    aget-object v1, p4, v0

    if-eqz v1, :cond_1

    aget-object v1, p4, v0

    array-length v1, v1

    add-int v2, p1, p3

    mul-int v2, v2, p2

    if-eq v1, v2, :cond_2

    :cond_1
    const-string v1, "## allocating buffer 0"

    invoke-static {v1}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    add-int v1, p1, p3

    mul-int v1, v1, p2

    new-array v1, v1, [I

    aput-object v1, p4, v0

    :cond_2
    aget-object p4, p4, v0

    invoke-static {p4}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v2, 0x0

    add-int v4, p1, p3

    const/16 v5, 0x1908

    const/16 v6, 0x1401

    move v1, p0

    move v3, p2

    invoke-static/range {v1 .. v7}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    return-object p4
.end method

.method public static j([F[F)V
    .locals 1

    const/high16 v0, 0x43b40000    # 360.0f

    invoke-static {p0, p1, v0}, Lcom/daaw/f80;->l([F[FF)V

    return-void
.end method

.method public static k([F)I
    .locals 7

    const/4 v0, 0x0

    aget v1, p0, v0

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float v1, v1, v2

    const/4 v2, 0x1

    aget v2, p0, v2

    const/4 v3, 0x2

    aget v3, p0, v3

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v5, v3, v4

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float/2addr v5, v6

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

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float/2addr v6, v2

    mul-float v6, v6, v5

    float-to-int v1, v1

    div-int/lit8 v1, v1, 0x3c

    const/high16 v2, 0x437f0000    # 255.0f

    packed-switch v1, :pswitch_data_0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_3

    :pswitch_0
    add-float/2addr v5, v3

    mul-float v5, v5, v2

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v1

    mul-float v4, v3, v2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    goto :goto_1

    :pswitch_1
    add-float/2addr v6, v3

    mul-float v6, v6, v2

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v1

    mul-float v4, v3, v2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    goto :goto_0

    :pswitch_2
    mul-float v1, v3, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-float/2addr v6, v3

    mul-float v6, v6, v2

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v4

    :goto_0
    add-float/2addr v5, v3

    mul-float v5, v5, v2

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v3

    goto :goto_3

    :pswitch_3
    mul-float v1, v3, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-float/2addr v5, v3

    mul-float v5, v5, v2

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    :goto_1
    add-float/2addr v6, v3

    mul-float v6, v6, v2

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v3

    goto :goto_3

    :pswitch_4
    add-float/2addr v6, v3

    mul-float v6, v6, v2

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-float/2addr v5, v3

    mul-float v5, v5, v2

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    goto :goto_2

    :pswitch_5
    add-float/2addr v5, v3

    mul-float v5, v5, v2

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-float/2addr v6, v3

    mul-float v6, v6, v2

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v4

    :goto_2
    mul-float v3, v3, v2

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    :goto_3
    const/16 v5, 0xff

    invoke-static {v1, v0, v5}, Lcom/daaw/f80;->c(III)I

    move-result v1

    invoke-static {v4, v0, v5}, Lcom/daaw/f80;->c(III)I

    move-result v4

    invoke-static {v3, v0, v5}, Lcom/daaw/f80;->c(III)I

    move-result v0

    invoke-static {v1, v4, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    const v1, 0xffffff

    and-int/2addr v0, v1

    const/4 v1, 0x3

    aget p0, p0, v1

    mul-float p0, p0, v2

    float-to-int p0, p0

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0

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

.method public static l([F[FF)V
    .locals 9

    const/4 v0, 0x0

    aget v1, p0, v0

    mul-float v1, v1, p2

    const/4 p2, 0x1

    aget v2, p0, p2

    const/4 v3, 0x2

    aget v4, p0, v3

    const/high16 v5, 0x40000000    # 2.0f

    mul-float v6, v4, v5

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v6, v7

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

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float/2addr v7, v2

    mul-float v7, v7, v6

    float-to-int v1, v1

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

    :goto_2
    aput v4, p1, v0

    aput v6, p1, p2

    aput v7, p1, v3

    const/4 p2, 0x3

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

.method public static m([F)I
    .locals 2

    invoke-static {p0}, Lcom/daaw/zg;->a([F)I

    move-result v0

    const v1, 0xffffff

    and-int/2addr v0, v1

    const/4 v1, 0x3

    aget p0, p0, v1

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float p0, p0, v1

    float-to-int p0, p0

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static n([FI)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lcom/daaw/f80;->o([FII)V

    return-void
.end method

.method public static o([FII)V
    .locals 3

    add-int/lit8 v0, p1, 0x3

    shr-int/lit8 v1, p2, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    const/high16 v2, 0x437f0000    # 255.0f

    div-float/2addr v1, v2

    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x0

    shr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    div-float/2addr v1, v2

    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    div-float/2addr v1, v2

    aput v1, p0, v0

    add-int/lit8 p1, p1, 0x2

    and-int/lit16 p2, p2, 0xff

    int-to-float p2, p2

    div-float/2addr p2, v2

    aput p2, p0, p1

    return-void
.end method

.method public static p([FI)V
    .locals 3

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    and-int/lit16 v2, p1, 0xff

    invoke-static {v0, v1, v2, p0}, Lcom/daaw/zg;->b(III[F)V

    const/4 v0, 0x0

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

    aput p1, p0, v0

    return-void
.end method

.method public static q([FI)V
    .locals 3

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    and-int/lit16 v2, p1, 0xff

    invoke-static {v0, v1, v2, p0}, Lcom/daaw/zg;->b(III[F)V

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-float p1, p1

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p1, v0

    const/4 v0, 0x3

    aput p1, p0, v0

    return-void
.end method

.method public static r([III)V
    .locals 2

    add-int/lit8 v0, p1, 0x3

    shr-int/lit8 v1, p2, 0x18

    and-int/lit16 v1, v1, 0xff

    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x0

    shr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    aput v1, p0, v0

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    aput v1, p0, v0

    add-int/lit8 p1, p1, 0x2

    and-int/lit16 p2, p2, 0xff

    aput p2, p0, p1

    return-void
.end method

.method public static s(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p0

    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {p0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    return p0
.end method

.method public static t(II)I
    .locals 1

    const v0, 0xffffff

    and-int/2addr p0, v0

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p0, p1

    return p0
.end method
