.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
.source "SegmentRendererBar.java"


# static fields
.field public static final typeName:Ljava/lang/String; = "Bars"


# instance fields
.field private barWidth:F

.field protected barWidthAffectedByNormal:Z

.field private lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

.field private mirror:Z

.field private nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    .line 20
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidth:F

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->mirror:Z

    .line 23
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidthAffectedByNormal:Z

    return-void
.end method


# virtual methods
.method public drawSegment(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;F)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p2

    .line 44
    iget v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valueIndex:I

    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valuesCount:I

    move/from16 v5, p3

    invoke-virtual {v0, v3, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->getBarColorBase(IIF)I

    move-result v3

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    .line 46
    iget v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawSegmentWidth:F

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v3, v3, v4

    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valuesCount:I

    add-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v3, v3

    .line 47
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidth:F

    mul-float v3, v3, v4

    .line 49
    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawPointX:F

    .line 50
    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawPointY:F

    .line 52
    iget v6, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->segmentHeightVal:F

    const/high16 v7, -0x40000000    # -2.0f

    mul-float v6, v6, v7

    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawScale:F

    mul-float v6, v6, v7

    .line 53
    invoke-static {v6}, Lcom/daaw/avee/Common/Utils;->SignNonZern(F)F

    move-result v7

    .line 54
    iget v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barHeightMultiplier:F

    mul-float v6, v6, v8

    .line 61
    iget-boolean v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->mirror:Z

    if-eqz v8, :cond_0

    .line 62
    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v8, v8, v6

    sub-float/2addr v4, v8

    .line 63
    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v8, v8, v6

    sub-float/2addr v5, v8

    float-to-double v8, v6

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    .line 64
    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v10

    double-to-float v6, v8

    .line 70
    :cond_0
    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v9, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v8, v9}, Lcom/daaw/avee/Common/Vec2f;->ccw90X(FF)F

    move-result v8

    mul-float v8, v8, v3

    add-float/2addr v8, v4

    .line 71
    iget v9, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v10, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v9, v10}, Lcom/daaw/avee/Common/Vec2f;->ccw90Y(FF)F

    move-result v9

    mul-float v9, v9, v3

    add-float/2addr v9, v5

    .line 72
    iget v10, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v11, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v10, v11}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v10

    mul-float v10, v10, v3

    add-float/2addr v10, v4

    .line 73
    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v11, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v4, v11}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v4

    mul-float v4, v4, v3

    add-float/2addr v4, v5

    .line 75
    iget v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v3, v3, v6

    add-float/2addr v3, v8

    .line 76
    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v5, v5, v6

    add-float/2addr v5, v9

    .line 77
    iget v11, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v11, v11, v6

    add-float/2addr v11, v10

    .line 78
    iget v12, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v12, v12, v6

    add-float v6, v12, v4

    .line 80
    iget-boolean v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->useFixedLineHeight:Z

    if-eqz v12, :cond_1

    .line 81
    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v4, v4, v7

    iget v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->fixedLineHeight:F

    mul-float v4, v4, v8

    add-float/2addr v4, v3

    .line 82
    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v8, v8, v7

    iget v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->fixedLineHeight:F

    mul-float v8, v8, v9

    add-float/2addr v8, v5

    .line 83
    iget v9, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v9, v9, v7

    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->fixedLineHeight:F

    mul-float v9, v9, v10

    add-float/2addr v9, v11

    .line 84
    iget v10, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v10, v10, v7

    iget v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->fixedLineHeight:F

    mul-float v10, v10, v7

    add-float/2addr v10, v6

    move v7, v4

    goto :goto_0

    :cond_1
    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v4

    .line 87
    :goto_0
    iget-object v4, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v4

    iget v13, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    .line 95
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v14

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v15

    iget-object v12, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    .line 96
    invoke-virtual {v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexSquareSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v16

    iget v12, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->blendMode:I

    move-object v1, v4

    move-object/from16 v2, p1

    move v4, v5

    move v5, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    move v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move/from16 v16, v17

    .line 87
    invoke-virtual/range {v1 .. v16}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    return-void
.end method

.method public drawSegmentBatch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;FFIF)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 103
    array-length v2, v1

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v3, v3, p3

    add-int/lit8 v4, v2, 0x1

    int-to-float v4, v4

    div-float/2addr v3, v4

    .line 104
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v3, v3

    .line 105
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidth:F

    mul-float v3, v3, v4

    .line 119
    new-instance v4, Lcom/daaw/avee/Common/Vec2f;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v5}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 120
    new-instance v6, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v6, v5, v5}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 124
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRenderEdges()Z

    move-result v5

    if-nez v5, :cond_0

    .line 126
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v7

    invoke-interface {v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexSquareSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x2

    move-object v7, v13

    move/from16 v8, p5

    invoke-direct/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    :goto_0
    const/4 v7, 0x0

    .line 129
    :goto_1
    array-length v8, v1

    if-ge v7, v8, :cond_7

    .line 131
    aget-object v8, v1, v7

    .line 132
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    if-gez v9, :cond_1

    move-object v9, v8

    goto :goto_2

    :cond_1
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    aget-object v9, v1, v9

    :goto_2
    iput-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 133
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    if-gez v9, :cond_2

    move-object v9, v8

    goto :goto_3

    :cond_2
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    aget-object v9, v1, v9

    :goto_3
    iput-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    move/from16 v9, p6

    .line 135
    invoke-virtual {v0, v7, v2, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->getBarColorBase(IIF)I

    move-result v25

    .line 138
    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    .line 139
    iget v11, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    .line 141
    iget v12, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    const/high16 v14, -0x40000000    # -2.0f

    mul-float v12, v12, v14

    mul-float v12, v12, p4

    .line 142
    invoke-static {v12}, Lcom/daaw/avee/Common/Utils;->SignNonZern(F)F

    move-result v14

    .line 143
    iget v15, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barHeightMultiplier:F

    mul-float v12, v12, v15

    .line 150
    iget-boolean v15, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->mirror:Z

    if-eqz v15, :cond_3

    .line 151
    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v15, v15, v12

    sub-float/2addr v10, v15

    .line 152
    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v15, v15, v12

    sub-float/2addr v11, v15

    move/from16 v31, v2

    float-to-double v1, v12

    const-wide/high16 v15, 0x4000000000000000L    # 2.0

    .line 153
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v15

    double-to-float v12, v1

    goto :goto_4

    :cond_3
    move/from16 v31, v2

    .line 165
    :goto_4
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidthAffectedByNormal:Z

    if-eqz v1, :cond_4

    .line 167
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    add-float/2addr v1, v2

    iput v1, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 168
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    add-float/2addr v1, v2

    iput v1, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 169
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    add-float/2addr v1, v2

    iput v1, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 170
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    add-float/2addr v1, v2

    iput v1, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 172
    invoke-virtual {v6}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 173
    invoke-virtual {v4}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 176
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v1, v2}, Lcom/daaw/avee/Common/Vec2f;->ccw90X(FF)F

    move-result v1

    mul-float v1, v1, v3

    add-float/2addr v1, v10

    .line 177
    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v2, v15}, Lcom/daaw/avee/Common/Vec2f;->ccw90Y(FF)F

    move-result v2

    mul-float v2, v2, v3

    add-float/2addr v2, v11

    .line 178
    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v15, v9}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v9

    mul-float v9, v9, v3

    add-float/2addr v9, v10

    .line 179
    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v10, v15}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v10

    mul-float v10, v10, v3

    add-float/2addr v10, v11

    .line 181
    iget v11, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v11, v11, v12

    add-float/2addr v11, v1

    .line 182
    iget v15, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v15, v15, v12

    add-float/2addr v15, v2

    move/from16 p3, v1

    .line 183
    iget v1, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v1, v1, v12

    add-float/2addr v1, v9

    move/from16 v16, v1

    .line 184
    iget v1, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_5

    .line 187
    :cond_4
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v1, v2}, Lcom/daaw/avee/Common/Vec2f;->ccw90X(FF)F

    move-result v1

    mul-float v1, v1, v3

    add-float/2addr v1, v10

    .line 188
    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v2, v9}, Lcom/daaw/avee/Common/Vec2f;->ccw90Y(FF)F

    move-result v2

    mul-float v2, v2, v3

    add-float/2addr v2, v11

    .line 189
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v9, v15}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v9

    mul-float v9, v9, v3

    add-float/2addr v9, v10

    .line 190
    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v10, v15}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v10

    mul-float v10, v10, v3

    add-float/2addr v10, v11

    .line 192
    iget v11, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v11, v11, v12

    add-float/2addr v11, v1

    .line 193
    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v15, v15, v12

    add-float/2addr v15, v2

    move/from16 p3, v1

    .line 194
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v1, v1, v12

    add-float/2addr v1, v9

    move/from16 v16, v1

    .line 195
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    :goto_5
    mul-float v1, v1, v12

    add-float/2addr v1, v10

    move/from16 v19, v1

    move/from16 v17, v15

    move/from16 v18, v16

    move/from16 v1, p3

    move/from16 v16, v11

    .line 198
    iget-boolean v11, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->useFixedLineHeight:Z

    if-eqz v11, :cond_5

    .line 199
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v1, v1, v14

    iget v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->fixedLineHeight:F

    mul-float v1, v1, v2

    add-float v1, v16, v1

    .line 200
    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v2, v2, v14

    iget v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->fixedLineHeight:F

    mul-float v2, v2, v9

    add-float v2, v17, v2

    .line 201
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v9, v9, v14

    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->fixedLineHeight:F

    mul-float v9, v9, v10

    add-float v9, v18, v9

    .line 202
    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v8, v8, v14

    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->fixedLineHeight:F

    mul-float v8, v8, v10

    add-float v8, v19, v8

    move/from16 v20, v1

    move/from16 v21, v2

    move/from16 v23, v8

    move/from16 v22, v9

    goto :goto_6

    :cond_5
    move/from16 v20, v1

    move/from16 v21, v2

    move/from16 v22, v9

    move/from16 v23, v10

    :goto_6
    if-eqz v5, :cond_6

    .line 230
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v14

    const/16 v24, 0x0

    .line 238
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v26

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v27

    .line 239
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v28

    const/16 v30, 0x0

    move-object/from16 v15, p1

    move/from16 v29, p5

    .line 230
    invoke-interface/range {v14 .. v30}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawRectangleEdges(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V

    goto :goto_7

    .line 245
    :cond_6
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v14

    const/16 v24, 0x0

    .line 253
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v26

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v27

    move-object/from16 v15, p1

    move-object/from16 v28, v13

    .line 245
    invoke-interface/range {v14 .. v28}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawRectangle2Patch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :goto_7
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p2

    move/from16 v2, v31

    goto/16 :goto_1

    :cond_7
    return-void
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 263
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "barWidth"

    const/high16 v1, 0x3f000000    # 0.5f

    .line 264
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidth:F

    const/4 v0, 0x0

    const-string v1, "barWidthAffectedByShape"

    .line 265
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidthAffectedByNormal:Z

    const-string v1, "mirror"

    .line 266
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->mirror:Z

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 271
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 272
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidth:F

    const-string v1, "barWidth"

    const-string v3, "misc"

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 273
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidthAffectedByNormal:Z

    const-string v1, "b"

    const-string v2, "barWidthAffectedByShape"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 274
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->mirror:Z

    const-string v2, "mirror"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;
    .locals 0

    .line 30
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->barWidth:F

    return-object p0
.end method

.method public setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->mirror:Z

    return-object p0
.end method
