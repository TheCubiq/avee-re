.class public Lcom/daaw/bv;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(F)F
    .locals 2

    const/high16 v0, 0x40700000    # 3.75f

    div-float/2addr p0, v0

    mul-float p0, p0, p0

    const v0, 0x3b961ebb    # 0.0045813f

    mul-float v0, v0, p0

    const v1, 0x3d13c544

    add-float/2addr v0, v1

    mul-float v0, v0, p0

    const v1, 0x3e882da4

    add-float/2addr v0, v1

    mul-float v0, v0, p0

    const v1, 0x3f9a76c2

    add-float/2addr v0, v1

    mul-float v0, v0, p0

    const v1, 0x4045c19e

    add-float/2addr v0, v1

    mul-float v0, v0, p0

    const v1, 0x4060fff7

    add-float/2addr v0, v1

    mul-float p0, p0, v0

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr p0, v0

    return p0
.end method

.method public static b(II)F
    .locals 4

    int-to-double v0, p0

    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    add-int/lit8 p1, p1, -0x1

    int-to-double p0, p1

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    double-to-float p0, p0

    const p1, 0x3eeb851f    # 0.46f

    mul-float p0, p0, p1

    const p1, 0x3f0a3d71    # 0.54f

    sub-float/2addr p1, p0

    return p1
.end method

.method public static c(II)F
    .locals 4

    int-to-double v0, p0

    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    add-int/lit8 p1, p1, -0x1

    int-to-double p0, p1

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    double-to-float p0, p0

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr p1, p0

    const/high16 p0, 0x3f000000    # 0.5f

    mul-float p1, p1, p0

    return p1
.end method

.method public static d(IIF)F
    .locals 1

    int-to-float p0, p0

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p0, p0, v0

    int-to-float p1, p1

    div-float/2addr p0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr p0, p1

    const v0, 0x40490fdb    # (float)Math.PI

    mul-float p2, p2, v0

    mul-float p0, p0, p0

    sub-float/2addr p1, p0

    float-to-double p0, p1

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    mul-float p0, p0, p2

    invoke-static {p0}, Lcom/daaw/bv;->a(F)F

    move-result p0

    invoke-static {p2}, Lcom/daaw/bv;->a(F)F

    move-result p1

    div-float/2addr p0, p1

    return p0
.end method
