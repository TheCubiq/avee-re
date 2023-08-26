.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;
.super Ljava/lang/Object;
.source "SegmentPathSided.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;


# static fields
.field public static final typeName:Ljava/lang/String; = "SidedPolygon"


# instance fields
.field angleAculumator:F

.field point0:Landroid/graphics/PointF;

.field point1:Landroid/graphics/PointF;

.field radius:F

.field sideInAngle:F

.field sides:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->radius:F

    const/4 v0, 0x3

    .line 18
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->sides:I

    const/4 v1, 0x0

    .line 22
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->angleAculumator:F

    .line 24
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point0:Landroid/graphics/PointF;

    .line 25
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point1:Landroid/graphics/PointF;

    .line 28
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    return-void
.end method


# virtual methods
.method public getPathLength(Landroid/graphics/RectF;I)F
    .locals 2

    .line 102
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpg-float p2, p2, v0

    if-gez p2, :cond_0

    .line 103
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    .line 107
    :goto_0
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->sideInAngle:F

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->sides:I

    int-to-float v0, v0

    mul-float p2, p2, v0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->radius:F

    mul-float p2, p2, v0

    float-to-double v0, p2

    double-to-float p2, v0

    mul-float p2, p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    mul-float p2, p2, p1

    return p2
.end method

.method public getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p3

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    if-eqz p1, :cond_0

    sub-int v4, v1, p2

    goto :goto_0

    :cond_0
    move/from16 v4, p2

    :goto_0
    int-to-float v4, v4

    int-to-float v5, v1

    div-float/2addr v4, v5

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 62
    iget v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->sides:I

    int-to-float v8, v7

    mul-float v8, v8, v4

    float-to-int v8, v8

    int-to-float v8, v8

    int-to-float v9, v7

    div-float v9, v8, v9

    sub-float/2addr v4, v9

    const/high16 v9, 0x3f800000    # 1.0f

    int-to-float v7, v7

    div-float/2addr v9, v7

    div-float/2addr v4, v9

    .line 66
    iget v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->sideInAngle:F

    mul-float v8, v8, v7

    iget v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->angleAculumator:F

    add-float/2addr v8, v9

    float-to-double v8, v8

    float-to-double v10, v7

    .line 67
    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v10, v8

    .line 69
    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    add-double v12, v8, v10

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    mul-double v12, v12, v14

    .line 71
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point0:Landroid/graphics/PointF;

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    neg-double v14, v14

    mul-double v14, v14, v5

    double-to-float v14, v14

    iput v14, v7, Landroid/graphics/PointF;->x:F

    .line 72
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point0:Landroid/graphics/PointF;

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double v8, v8, v5

    double-to-float v8, v8

    iput v8, v7, Landroid/graphics/PointF;->y:F

    .line 74
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point1:Landroid/graphics/PointF;

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    neg-double v8, v8

    mul-double v8, v8, v5

    double-to-float v8, v8

    iput v8, v7, Landroid/graphics/PointF;->x:F

    .line 75
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point1:Landroid/graphics/PointF;

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double v8, v8, v5

    double-to-float v8, v8

    iput v8, v7, Landroid/graphics/PointF;->y:F

    .line 77
    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    neg-double v7, v7

    mul-double v7, v7, v5

    double-to-float v7, v7

    iput v7, v3, Landroid/graphics/PointF;->x:F

    .line 78
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double v7, v7, v5

    double-to-float v5, v7

    iput v5, v3, Landroid/graphics/PointF;->y:F

    .line 80
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point0:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point1:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->x:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point0:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->x:F

    sub-float/2addr v5, v6

    mul-float v5, v5, v4

    add-float/2addr v3, v5

    iput v3, v2, Landroid/graphics/PointF;->x:F

    .line 81
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point0:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->y:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point1:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->y:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->point0:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->y:F

    sub-float/2addr v5, v6

    mul-float v5, v5, v4

    add-float/2addr v3, v5

    iput v3, v2, Landroid/graphics/PointF;->y:F

    .line 85
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->height()F

    move-result v4

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    .line 86
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->width()F

    move-result v3

    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->height()F

    move-result v3

    :goto_1
    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v3, v3, v4

    .line 90
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->radius:F

    mul-float v3, v3, v4

    .line 92
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    iget v5, v2, Landroid/graphics/PointF;->x:F

    neg-float v5, v5

    mul-float v5, v5, v3

    add-float/2addr v4, v5

    iput v4, v2, Landroid/graphics/PointF;->x:F

    .line 93
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    iget v5, v2, Landroid/graphics/PointF;->y:F

    neg-float v5, v5

    mul-float v5, v5, v3

    add-float/2addr v4, v5

    iput v4, v2, Landroid/graphics/PointF;->y:F

    add-int v2, p2, v1

    add-int/lit8 v2, v2, -0x1

    .line 95
    rem-int/2addr v2, v1

    return v2
.end method

.method public getPreferredPointCount(Landroid/graphics/RectF;)I
    .locals 0

    .line 113
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->sides:I

    return p1
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    const-string v0, "radius"

    const/high16 v1, 0x3f800000    # 1.0f

    .line 118
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->radius:F

    const-string v0, "sides"

    const/4 v1, 0x3

    .line 119
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 12

    .line 124
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->radius:F

    const-string v1, "radius"

    const-string v3, "misc"

    const v4, 0x3e19999a    # 0.15f

    const/high16 v5, 0x40400000    # 3.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 125
    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->sides:I

    const-string v7, "sides"

    const-string v9, "misc"

    const/4 v10, 0x3

    const/16 v11, 0x12

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    return-void
.end method

.method public process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V
    .locals 0

    return-void
.end method

.method public setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;
    .locals 0

    .line 33
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->radius:F

    return-object p0
.end method

.method public setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;
    .locals 1

    const/4 v0, 0x3

    .line 39
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->sides:I

    int-to-float p1, p1

    const v0, 0x40c90fdb

    div-float/2addr v0, p1

    .line 40
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->sideInAngle:F

    return-object p0
.end method
