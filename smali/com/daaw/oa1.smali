.class public Lcom/daaw/oa1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ge0;


# instance fields
.field public a:F

.field public b:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/oa1;->a:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/oa1;->b:F

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 2

    const-string v0, "radius"

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/oa1;->a:F

    const-string v0, "gap"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/oa1;->b:F

    return-void
.end method

.method public d(Lcom/daaw/de0;)V
    .locals 0

    return-void
.end method

.method public e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 6

    if-eqz p1, :cond_0

    sub-int p1, p3, p2

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    int-to-float p1, p1

    int-to-float v0, p3

    div-float/2addr p1, v0

    add-float/2addr p1, p5

    const/high16 p5, 0x3f800000    # 1.0f

    iget v0, p0, Lcom/daaw/oa1;->b:F

    sub-float/2addr p5, v0

    mul-float p1, p1, p5

    const/high16 p5, 0x3f000000    # 0.5f

    mul-float v0, v0, p5

    add-float/2addr p1, v0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    float-to-double v4, p1

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    neg-double v2, v2

    mul-double v2, v2, v0

    double-to-float p1, v2

    iput p1, p7, Landroid/graphics/PointF;->x:F

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    mul-double v2, v2, v0

    double-to-float p1, v2

    iput p1, p7, Landroid/graphics/PointF;->y:F

    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p1

    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p1

    goto :goto_1

    :cond_1
    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result p1

    :goto_1
    mul-float p1, p1, p5

    iget p5, p0, Lcom/daaw/oa1;->a:F

    mul-float p1, p1, p5

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p5

    iget v0, p7, Landroid/graphics/PointF;->x:F

    neg-float v0, v0

    mul-float v0, v0, p1

    add-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p4

    iget p5, p7, Landroid/graphics/PointF;->y:F

    neg-float p5, p5

    mul-float p5, p5, p1

    add-float/2addr p4, p5

    iput p4, p6, Landroid/graphics/PointF;->y:F

    add-int/2addr p2, p3

    add-int/lit8 p2, p2, -0x1

    rem-int/2addr p2, p3

    return p2
.end method

.method public i(Landroid/graphics/RectF;)I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/oa1;->k(Landroid/graphics/RectF;I)F

    move-result p1

    const/high16 v0, 0x41900000    # 18.0f

    div-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    const/16 v0, 0x12

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public k(Landroid/graphics/RectF;I)F
    .locals 2

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpg-float p2, p2, v0

    if-gez p2, :cond_0

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    :goto_0
    const/high16 p2, 0x3f000000    # 0.5f

    mul-float p1, p1, p2

    iget p2, p0, Lcom/daaw/oa1;->a:F

    mul-float p1, p1, p2

    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, v0

    double-to-float p1, p1

    const/high16 p2, 0x3f800000    # 1.0f

    iget v0, p0, Lcom/daaw/oa1;->b:F

    sub-float/2addr p2, v0

    mul-float p1, p1, p2

    return p1
.end method

.method public o(Lcom/daaw/un;)V
    .locals 12

    iget v2, p0, Lcom/daaw/oa1;->a:F

    const-string v1, "radius"

    const-string v3, "misc"

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x40400000    # 3.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v8, p0, Lcom/daaw/oa1;->b:F

    const-string v7, "gap"

    const-string v9, "misc"

    const/4 v10, 0x0

    const v11, 0x3f666666    # 0.9f

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method
