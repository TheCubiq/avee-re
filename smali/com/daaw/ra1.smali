.class public Lcom/daaw/ra1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ge0;


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ra1;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/de0;)V
    .locals 0

    return-void
.end method

.method public e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 6

    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p5

    int-to-float v0, p3

    div-float/2addr p5, v0

    iget v1, p4, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, p5

    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    mul-float p5, p5, v3

    sub-float/2addr v2, p5

    div-float/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result p5

    int-to-float p5, p5

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, p5}, Ljava/lang/Math;->max(FF)F

    move-result p5

    const/4 v3, 0x0

    mul-float v4, p5, v3

    add-float/2addr v4, v1

    mul-float v0, v0, p5

    add-float/2addr v0, v1

    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result v5

    sub-float/2addr v0, v4

    sub-float/2addr v5, v0

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float v5, v5, v0

    add-float/2addr v5, v1

    if-eqz p1, :cond_0

    sub-int/2addr p3, p2

    goto :goto_0

    :cond_0
    move p3, p2

    :goto_0
    int-to-float p1, p3

    mul-float p5, p5, p1

    add-float/2addr v5, p5

    iput v5, p6, Landroid/graphics/PointF;->x:F

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    iput p1, p6, Landroid/graphics/PointF;->y:F

    iput v3, p7, Landroid/graphics/PointF;->x:F

    iput v2, p7, Landroid/graphics/PointF;->y:F

    add-int/lit8 p2, p2, -0x1

    return p2
.end method

.method public i(Landroid/graphics/RectF;)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method

.method public k(Landroid/graphics/RectF;I)F
    .locals 1

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    int-to-float p2, p2

    div-float/2addr v0, p2

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    const/high16 p2, 0x40000000    # 2.0f

    mul-float v0, v0, p2

    sub-float/2addr p1, v0

    return p1
.end method

.method public o(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method
