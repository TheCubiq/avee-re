.class public Lcom/daaw/avee/Common/Interpolate;
.super Ljava/lang/Object;
.source "Interpolate.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Lerp(DDD)D
    .locals 0

    sub-double/2addr p2, p0

    mul-double p2, p2, p4

    add-double/2addr p0, p2

    return-wide p0
.end method

.method public static Lerp(FFD)F
    .locals 0

    sub-float/2addr p1, p0

    double-to-float p2, p2

    mul-float p1, p1, p2

    add-float/2addr p0, p1

    return p0
.end method

.method public static Lerp(Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;D)V
    .locals 3

    .line 12
    iget v0, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v1, v2

    double-to-float p3, p3

    mul-float v1, v1, p3

    add-float/2addr v0, v1

    iput v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 13
    iget p4, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr p2, p1

    mul-float p2, p2, p3

    add-float/2addr p4, p2

    iput p4, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void
.end method

.method public static LerpColor(IIF)I
    .locals 6

    .line 26
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    .line 27
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v0

    mul-float v1, v1, p2

    add-float/2addr v0, v1

    .line 30
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    mul-float v2, v2, p2

    add-float/2addr v1, v2

    .line 31
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-float v2, v2

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    mul-float v3, v3, p2

    add-float/2addr v2, v3

    .line 32
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-float v3, v3

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    mul-float v4, v4, p2

    add-float/2addr v3, v4

    .line 33
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    int-to-float v4, v4

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result p0

    sub-int/2addr p1, p0

    int-to-float p0, p1

    mul-float p0, p0, p2

    add-float/2addr v4, p0

    mul-float p0, v1, v1

    mul-float p1, v2, v2

    add-float/2addr p0, p1

    mul-float p1, v3, v3

    add-float/2addr p0, p1

    float-to-double p0, p0

    .line 36
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    div-float/2addr v1, p0

    div-float/2addr v2, p0

    div-float/2addr v3, p0

    float-to-int p0, v4

    mul-float v1, v1, v0

    float-to-int p1, v1

    mul-float v2, v2, v0

    float-to-int p2, v2

    mul-float v3, v3, v0

    float-to-int v0, v3

    .line 40
    invoke-static {p0, p1, p2, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method
