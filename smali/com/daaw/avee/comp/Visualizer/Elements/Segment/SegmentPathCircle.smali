.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;
.super Ljava/lang/Object;
.source "SegmentPathCircle.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;


# static fields
.field public static final typeName:Ljava/lang/String; = "Circle"


# instance fields
.field private radius:F

.field private topGap:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->radius:F

    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->topGap:F

    return-void
.end method


# virtual methods
.method public getPathLength(Landroid/graphics/RectF;I)F
    .locals 2

    .line 68
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpg-float p2, p2, v0

    if-gez p2, :cond_0

    .line 69
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    :goto_0
    const/high16 p2, 0x3f000000    # 0.5f

    mul-float p1, p1, p2

    .line 73
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->radius:F

    mul-float p1, p1, p2

    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    float-to-double p1, p1

    .line 77
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, v0

    double-to-float p1, p1

    const/high16 p2, 0x3f800000    # 1.0f

    .line 84
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->topGap:F

    sub-float/2addr p2, v0

    mul-float p1, p1, p2

    return p1
.end method

.method public getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
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

    .line 39
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->topGap:F

    sub-float/2addr p5, v0

    mul-float p1, p1, p5

    const/high16 p5, 0x3f000000    # 0.5f

    mul-float v0, v0, p5

    add-float/2addr p1, v0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    float-to-double v4, p1

    .line 44
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v2

    .line 46
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    neg-double v2, v2

    mul-double v2, v2, v0

    double-to-float p1, v2

    iput p1, p7, Landroid/graphics/PointF;->x:F

    .line 47
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    mul-double v2, v2, v0

    double-to-float p1, v2

    iput p1, p7, Landroid/graphics/PointF;->y:F

    .line 50
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p1

    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    .line 51
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p1

    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result p1

    :goto_1
    mul-float p1, p1, p5

    .line 55
    iget p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->radius:F

    mul-float p1, p1, p5

    .line 57
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p5

    iget v0, p7, Landroid/graphics/PointF;->x:F

    neg-float v0, v0

    mul-float v0, v0, p1

    add-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    .line 58
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p4

    iget p5, p7, Landroid/graphics/PointF;->y:F

    neg-float p5, p5

    mul-float p5, p5, p1

    add-float/2addr p4, p5

    iput p4, p6, Landroid/graphics/PointF;->y:F

    add-int/2addr p2, p3

    add-int/lit8 p2, p2, -0x1

    .line 61
    rem-int/2addr p2, p3

    return p2
.end method

.method public getPreferredPointCount(Landroid/graphics/RectF;)I
    .locals 1

    const/4 v0, 0x0

    .line 101
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->getPathLength(Landroid/graphics/RectF;I)F

    move-result p1

    const/high16 v0, 0x41900000    # 18.0f

    div-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    const/16 v0, 0x12

    .line 106
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    const-string v0, "radius"

    const/high16 v1, 0x3f800000    # 1.0f

    .line 111
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->radius:F

    const-string v0, "gap"

    const/4 v1, 0x0

    .line 112
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->topGap:F

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 12

    .line 117
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->radius:F

    const-string v1, "radius"

    const-string v3, "misc"

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x40400000    # 3.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 118
    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->topGap:F

    const-string v7, "gap"

    const-string v9, "misc"

    const/4 v10, 0x0

    const v11, 0x3f666666    # 0.9f

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V
    .locals 0

    return-void
.end method

.method public setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;
    .locals 0

    .line 24
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->radius:F

    return-object p0
.end method
