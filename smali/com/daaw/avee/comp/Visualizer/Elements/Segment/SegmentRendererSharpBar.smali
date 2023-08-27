.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
.source "SegmentRendererSharpBar.java"


# static fields
.field public static final typeName:Ljava/lang/String; = "SharpBars"


# instance fields
.field private barWidth:F

.field private drawPoint:Landroid/graphics/PointF;

.field private lastDrawPoint:Landroid/graphics/PointF;

.field private mirror:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    .line 20
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barWidth:F

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->mirror:Z

    .line 23
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->lastDrawPoint:Landroid/graphics/PointF;

    .line 24
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    return-void
.end method


# virtual methods
.method public drawSegment(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;F)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p2

    .line 41
    iget v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valueIndex:I

    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valuesCount:I

    move/from16 v5, p3

    invoke-virtual {v0, v3, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->getBarColorBase(IIF)I

    move-result v3

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    .line 43
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->lastDrawPoint:Landroid/graphics/PointF;

    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawPointX:F

    iput v4, v3, Landroid/graphics/PointF;->x:F

    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->lastDrawPoint:Landroid/graphics/PointF;

    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawPointY:F

    iput v4, v3, Landroid/graphics/PointF;->y:F

    .line 44
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawPointX:F

    iput v4, v3, Landroid/graphics/PointF;->x:F

    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawPointY:F

    iput v4, v3, Landroid/graphics/PointF;->y:F

    .line 46
    iget v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawSegmentWidth:F

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float v3, v3, v4

    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valuesCount:I

    add-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v3, v3

    .line 47
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barWidth:F

    mul-float v3, v3, v4

    .line 49
    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastSegmentHeightVal:F

    const/high16 v5, -0x40000000    # -2.0f

    mul-float v4, v4, v5

    iget v6, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawScale:F

    mul-float v4, v4, v6

    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barHeightMultiplier:F

    mul-float v4, v4, v6

    .line 50
    iget v6, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->segmentHeightVal:F

    mul-float v6, v6, v5

    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawScale:F

    mul-float v6, v6, v5

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barHeightMultiplier:F

    mul-float v6, v6, v5

    .line 52
    iget-boolean v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->mirror:Z

    if-eqz v5, :cond_0

    .line 53
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->lastDrawPoint:Landroid/graphics/PointF;

    iget v7, v5, Landroid/graphics/PointF;->x:F

    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecX:F

    mul-float v8, v8, v4

    sub-float/2addr v7, v8

    iput v7, v5, Landroid/graphics/PointF;->x:F

    .line 54
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->lastDrawPoint:Landroid/graphics/PointF;

    iget v7, v5, Landroid/graphics/PointF;->y:F

    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecY:F

    mul-float v8, v8, v4

    sub-float/2addr v7, v8

    iput v7, v5, Landroid/graphics/PointF;->y:F

    float-to-double v4, v4

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 55
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v7

    double-to-float v4, v4

    .line 57
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v9, v5, Landroid/graphics/PointF;->x:F

    iget v10, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v10, v10, v6

    sub-float/2addr v9, v10

    iput v9, v5, Landroid/graphics/PointF;->x:F

    .line 58
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v9, v5, Landroid/graphics/PointF;->y:F

    iget v10, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v10, v10, v6

    sub-float/2addr v9, v10

    iput v9, v5, Landroid/graphics/PointF;->y:F

    float-to-double v5, v6

    .line 59
    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    double-to-float v6, v5

    .line 65
    :cond_0
    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v5, v7}, Lcom/daaw/avee/Common/Vec2f;->ccw90X(FF)F

    move-result v5

    mul-float v5, v5, v3

    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v7, v7, Landroid/graphics/PointF;->x:F

    add-float/2addr v5, v7

    .line 66
    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v7, v8}, Lcom/daaw/avee/Common/Vec2f;->ccw90Y(FF)F

    move-result v7

    mul-float v7, v7, v3

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v8, v8, Landroid/graphics/PointF;->y:F

    add-float/2addr v7, v8

    .line 67
    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v9, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v8, v9}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v8

    mul-float v8, v8, v3

    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v9, v9, Landroid/graphics/PointF;->x:F

    add-float/2addr v8, v9

    .line 68
    iget v9, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v10, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v9, v10}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v9

    mul-float v9, v9, v3

    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->y:F

    add-float/2addr v9, v3

    .line 69
    iget v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v3, v3, v4

    add-float/2addr v3, v5

    .line 70
    iget v10, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v10, v10, v4

    add-float v4, v10, v7

    .line 71
    iget v10, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v10, v10, v6

    add-float/2addr v10, v8

    .line 72
    iget v11, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v11, v11, v6

    add-float/2addr v11, v9

    .line 74
    iget-boolean v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->useFixedLineHeight:Z

    if-eqz v12, :cond_1

    .line 75
    invoke-static {v6}, Ljava/lang/Math;->signum(F)F

    move-result v5

    .line 76
    iget v6, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v6, v6, v5

    iget v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->fixedLineHeight:F

    mul-float v6, v6, v7

    add-float/2addr v6, v3

    .line 77
    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v7, v7, v5

    iget v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->fixedLineHeight:F

    mul-float v7, v7, v8

    add-float/2addr v7, v4

    .line 78
    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v8, v8, v5

    iget v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->fixedLineHeight:F

    mul-float v8, v8, v9

    add-float/2addr v8, v10

    .line 79
    iget v9, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v9, v9, v5

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->fixedLineHeight:F

    mul-float v9, v9, v5

    add-float/2addr v9, v11

    move v12, v9

    move v9, v8

    move v8, v7

    move v7, v6

    goto :goto_0

    :cond_1
    move v12, v9

    move v9, v8

    move v8, v7

    move v7, v5

    .line 82
    :goto_0
    iget-object v5, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v5

    const/4 v13, 0x0

    iget v14, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    .line 90
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v15

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v16

    iget-object v6, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    .line 91
    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v17

    iget v6, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->blendMode:I

    move-object v1, v5

    move-object/from16 v2, p1

    move v5, v10

    move/from16 v18, v6

    move v6, v11

    move v10, v12

    move v11, v13

    move v12, v14

    move-object v13, v15

    move-object/from16 v14, v16

    move-object/from16 v15, v17

    move/from16 v16, v18

    .line 82
    invoke-virtual/range {v1 .. v16}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    return-void
.end method

.method public drawSegmentBatch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;FFIF)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 98
    array-length v2, v1

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float v3, v3, p3

    add-int/lit8 v4, v2, 0x1

    int-to-float v4, v4

    div-float/2addr v3, v4

    .line 100
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v3, v3

    .line 101
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barWidth:F

    mul-float v3, v3, v4

    const/4 v4, 0x0

    .line 116
    :goto_0
    array-length v5, v1

    if-ge v4, v5, :cond_6

    .line 118
    aget-object v5, v1, v4

    .line 119
    iget v6, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    if-gez v6, :cond_0

    move/from16 v7, p6

    goto/16 :goto_4

    .line 120
    :cond_0
    iget v6, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    aget-object v6, v1, v6

    move/from16 v7, p6

    .line 121
    invoke-virtual {v0, v4, v2, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->getBarColorBase(IIF)I

    move-result v19

    .line 123
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->lastDrawPoint:Landroid/graphics/PointF;

    iget v9, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    iput v9, v8, Landroid/graphics/PointF;->x:F

    .line 124
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->lastDrawPoint:Landroid/graphics/PointF;

    iget v9, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    iput v9, v8, Landroid/graphics/PointF;->y:F

    .line 125
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v9, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    iput v9, v8, Landroid/graphics/PointF;->x:F

    .line 126
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v9, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    iput v9, v8, Landroid/graphics/PointF;->y:F

    .line 129
    iget v8, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    const/high16 v9, -0x40000000    # -2.0f

    mul-float v8, v8, v9

    mul-float v8, v8, p4

    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barHeightMultiplier:F

    mul-float v8, v8, v10

    .line 130
    iget v10, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    mul-float v10, v10, v9

    mul-float v10, v10, p4

    iget v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barHeightMultiplier:F

    mul-float v10, v10, v9

    .line 132
    iget-boolean v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->mirror:Z

    if-eqz v9, :cond_1

    .line 133
    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->lastDrawPoint:Landroid/graphics/PointF;

    iget v11, v9, Landroid/graphics/PointF;->x:F

    iget v12, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v12, v12, v8

    sub-float/2addr v11, v12

    iput v11, v9, Landroid/graphics/PointF;->x:F

    .line 134
    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->lastDrawPoint:Landroid/graphics/PointF;

    iget v11, v9, Landroid/graphics/PointF;->y:F

    iget v6, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v6, v6, v8

    sub-float/2addr v11, v6

    iput v11, v9, Landroid/graphics/PointF;->y:F

    float-to-double v8, v8

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 135
    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v11

    double-to-float v8, v8

    .line 137
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v9, v6, Landroid/graphics/PointF;->x:F

    iget v13, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v13, v13, v10

    sub-float/2addr v9, v13

    iput v9, v6, Landroid/graphics/PointF;->x:F

    .line 138
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v9, v6, Landroid/graphics/PointF;->y:F

    iget v13, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v13, v13, v10

    sub-float/2addr v9, v13

    iput v9, v6, Landroid/graphics/PointF;->y:F

    float-to-double v9, v10

    .line 139
    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v9, v9, v11

    double-to-float v10, v9

    :cond_1
    const/4 v6, 0x0

    cmpg-float v9, v8, v6

    if-gez v9, :cond_2

    .line 158
    iget v9, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v11, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v9, v11}, Lcom/daaw/avee/Common/Vec2f;->ccw90X(FF)F

    move-result v9

    mul-float v9, v9, v3

    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v11, v11, Landroid/graphics/PointF;->x:F

    add-float/2addr v9, v11

    .line 159
    iget v11, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v12, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v11, v12}, Lcom/daaw/avee/Common/Vec2f;->ccw90Y(FF)F

    move-result v11

    mul-float v11, v11, v3

    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v12, v12, Landroid/graphics/PointF;->y:F

    add-float/2addr v11, v12

    .line 160
    iget v12, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v12, v12, v8

    add-float/2addr v12, v9

    .line 161
    iget v13, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v13, v13, v8

    add-float/2addr v13, v11

    move v8, v11

    move v11, v13

    goto :goto_1

    .line 163
    :cond_2
    iget v9, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v11, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v9, v11}, Lcom/daaw/avee/Common/Vec2f;->ccw90X(FF)F

    move-result v9

    mul-float v9, v9, v3

    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v11, v11, Landroid/graphics/PointF;->x:F

    add-float/2addr v9, v11

    .line 164
    iget v11, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v12, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v11, v12}, Lcom/daaw/avee/Common/Vec2f;->ccw90Y(FF)F

    move-result v11

    mul-float v11, v11, v3

    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v12, v12, Landroid/graphics/PointF;->y:F

    add-float/2addr v11, v12

    .line 165
    iget v12, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v12, v12, v8

    add-float/2addr v12, v9

    .line 166
    iget v13, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v13, v13, v8

    add-float v8, v13, v11

    move/from16 v31, v12

    move v12, v9

    move/from16 v9, v31

    :goto_1
    cmpg-float v6, v10, v6

    if-gez v6, :cond_3

    .line 170
    iget v6, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v13, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v6, v13}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v6

    mul-float v6, v6, v3

    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v13, v13, Landroid/graphics/PointF;->x:F

    add-float/2addr v6, v13

    .line 171
    iget v13, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v14, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v13, v14}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v13

    mul-float v13, v13, v3

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v14, v14, Landroid/graphics/PointF;->y:F

    add-float/2addr v13, v14

    .line 172
    iget v14, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v14, v14, v10

    add-float/2addr v14, v6

    .line 173
    iget v15, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v15, v15, v10

    add-float/2addr v15, v13

    move/from16 v31, v15

    move v15, v13

    move/from16 v13, v31

    goto :goto_2

    .line 175
    :cond_3
    iget v6, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v13, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v6, v13}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v6

    mul-float v6, v6, v3

    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v13, v13, Landroid/graphics/PointF;->x:F

    add-float/2addr v6, v13

    .line 176
    iget v13, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v14, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v13, v14}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v13

    mul-float v13, v13, v3

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->drawPoint:Landroid/graphics/PointF;

    iget v14, v14, Landroid/graphics/PointF;->y:F

    add-float/2addr v13, v14

    .line 177
    iget v14, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v14, v14, v10

    add-float/2addr v14, v6

    .line 178
    iget v15, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v15, v15, v10

    add-float/2addr v15, v13

    move/from16 v31, v14

    move v14, v6

    move/from16 v6, v31

    .line 181
    :goto_2
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->useFixedLineHeight:Z

    if-eqz v1, :cond_4

    .line 182
    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    move-result v1

    .line 183
    iget v6, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v6, v6, v1

    iget v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->fixedLineHeight:F

    mul-float v6, v6, v8

    add-float/2addr v6, v12

    .line 184
    iget v8, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v8, v8, v1

    iget v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->fixedLineHeight:F

    mul-float v8, v8, v9

    add-float/2addr v8, v11

    .line 185
    iget v9, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v9, v9, v1

    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->fixedLineHeight:F

    mul-float v9, v9, v10

    add-float/2addr v9, v14

    .line 186
    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v5, v5, v1

    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->fixedLineHeight:F

    mul-float v5, v5, v1

    add-float/2addr v5, v13

    move/from16 v17, v5

    move v15, v8

    move/from16 v16, v9

    goto :goto_3

    :cond_4
    move/from16 v16, v6

    move v6, v9

    move/from16 v17, v15

    move v15, v8

    .line 189
    :goto_3
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRenderEdges()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 191
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v8

    const/16 v18, 0x0

    .line 199
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v20

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v21

    .line 200
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v22

    const/16 v24, 0x0

    move-object/from16 v9, p1

    move v10, v12

    move v12, v14

    move v14, v6

    move/from16 v23, p5

    .line 191
    invoke-interface/range {v8 .. v24}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawRectangleEdges(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V

    goto :goto_4

    .line 207
    :cond_5
    new-instance v22, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexSquareSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v27

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x2

    move-object/from16 v25, v22

    move/from16 v26, p5

    invoke-direct/range {v25 .. v30}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    .line 209
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v8

    const/16 v18, 0x0

    .line 217
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v20

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v21

    move-object/from16 v9, p1

    move v10, v12

    move v12, v14

    move v14, v6

    .line 209
    invoke-interface/range {v8 .. v22}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawRectangle2Patch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :goto_4
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, p2

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 227
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "barWidth"

    const/high16 v1, 0x3f000000    # 0.5f

    .line 228
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barWidth:F

    const-string v0, "mirror"

    const/4 v1, 0x0

    .line 229
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->mirror:Z

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 234
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 235
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barWidth:F

    const-string v1, "barWidth"

    const-string v3, "misc"

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 236
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->mirror:Z

    const-string v1, "mirror"

    const-string v2, "misc"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;
    .locals 0

    .line 28
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->barWidth:F

    return-object p0
.end method

.method public setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;
    .locals 0

    .line 34
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->mirror:Z

    return-object p0
.end method
