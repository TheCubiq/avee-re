.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
.source "SegmentRendererRoundBar.java"


# static fields
.field private static texCoordX0Y03:Lcom/daaw/avee/Common/Vec2f; = null

.field private static texCoordX0Y06:Lcom/daaw/avee/Common/Vec2f; = null

.field private static texCoordX1Y03:Lcom/daaw/avee/Common/Vec2f; = null

.field private static texCoordX1Y06:Lcom/daaw/avee/Common/Vec2f; = null

.field public static final typeName:Ljava/lang/String; = "RoundBars"


# instance fields
.field private barWidth:F

.field protected barWidthAffectedByNormal:Z

.field private lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

.field private mirror:Z

.field private nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 24
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX0Y03:Lcom/daaw/avee/Common/Vec2f;

    .line 25
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v3, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX1Y03:Lcom/daaw/avee/Common/Vec2f;

    .line 26
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX0Y06:Lcom/daaw/avee/Common/Vec2f;

    .line 27
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v3, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX1Y06:Lcom/daaw/avee/Common/Vec2f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    .line 16
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidth:F

    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->mirror:Z

    .line 19
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidthAffectedByNormal:Z

    return-void
.end method


# virtual methods
.method public drawSegment(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;F)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move-object/from16 v14, p2

    .line 44
    iget v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valueIndex:I

    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valuesCount:I

    move/from16 v3, p3

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->getBarColorBase(IIF)I

    move-result v1

    iput v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    .line 46
    iget v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawSegmentWidth:F

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v1, v1, v2

    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valuesCount:I

    add-int/lit8 v2, v2, 0x1

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    .line 47
    iget v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidth:F

    mul-float v1, v1, v2

    .line 49
    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawPointX:F

    .line 50
    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawPointY:F

    .line 52
    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->segmentHeightVal:F

    const/high16 v5, -0x40000000    # -2.0f

    mul-float v4, v4, v5

    iget v5, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawScale:F

    mul-float v4, v4, v5

    .line 53
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v5

    .line 54
    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barHeightMultiplier:F

    mul-float v4, v4, v6

    .line 62
    iget-boolean v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->mirror:Z

    if-eqz v6, :cond_0

    .line 63
    iget v6, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v6, v6, v4

    sub-float/2addr v2, v6

    .line 64
    iget v6, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v6, v6, v4

    sub-float/2addr v3, v6

    float-to-double v6, v4

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 65
    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v6, v6, v8

    double-to-float v4, v6

    .line 75
    :cond_0
    iget v6, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v7, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v6, v7}, Lcom/daaw/avee/Common/Vec2f;->ccw90X(FF)F

    move-result v6

    mul-float v6, v6, v1

    add-float/2addr v6, v2

    .line 76
    iget v7, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v8, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v7, v8}, Lcom/daaw/avee/Common/Vec2f;->ccw90Y(FF)F

    move-result v7

    mul-float v7, v7, v1

    add-float/2addr v7, v3

    .line 77
    iget v8, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v9, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v8, v9}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v8

    mul-float v8, v8, v1

    add-float/2addr v8, v2

    .line 78
    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v9, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v2, v9}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v2

    mul-float v2, v2, v1

    add-float/2addr v2, v3

    .line 80
    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v3, v3, v4

    add-float v17, v3, v6

    .line 81
    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v3, v3, v4

    add-float v18, v3, v7

    .line 82
    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v3, v3, v4

    add-float v19, v3, v8

    .line 83
    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v3, v3, v4

    add-float v20, v3, v2

    .line 86
    iget-boolean v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->useFixedLineHeight:Z

    if-eqz v3, :cond_1

    .line 87
    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v2, v2, v5

    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->fixedLineHeight:F

    mul-float v2, v2, v3

    add-float v2, v17, v2

    .line 88
    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v3, v3, v5

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->fixedLineHeight:F

    mul-float v3, v3, v4

    add-float v3, v18, v3

    .line 89
    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v4, v4, v5

    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->fixedLineHeight:F

    mul-float v4, v4, v6

    add-float v4, v19, v4

    .line 90
    iget v6, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v6, v6, v5

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->fixedLineHeight:F

    mul-float v6, v6, v5

    add-float v6, v20, v6

    move/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v4

    move/from16 v24, v6

    goto :goto_0

    :cond_1
    move/from16 v24, v2

    move/from16 v21, v6

    move/from16 v22, v7

    move/from16 v23, v8

    :goto_0
    const/high16 v2, 0x3f800000    # 1.0f

    .line 95
    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v3, v3, v2

    neg-float v4, v1

    mul-float v3, v3, v4

    add-float v3, v3, v17

    .line 96
    iget v5, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v5, v5, v2

    mul-float v5, v5, v4

    add-float v5, v5, v18

    .line 97
    iget v6, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v6, v6, v2

    mul-float v6, v6, v4

    add-float v6, v6, v19

    .line 98
    iget v7, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v7, v7, v2

    mul-float v7, v7, v4

    add-float v7, v7, v20

    .line 100
    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v4, v4, v2

    mul-float v4, v4, v1

    add-float v25, v4, v21

    .line 101
    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v4, v4, v2

    mul-float v4, v4, v1

    add-float v26, v4, v22

    .line 102
    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v4, v4, v2

    mul-float v4, v4, v1

    add-float v27, v4, v23

    .line 103
    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v4, v4, v2

    mul-float v4, v4, v1

    add-float v28, v4, v24

    .line 105
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x3c23d70a    # 0.01f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_2

    .line 106
    iget-object v1, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v1

    const/4 v11, 0x0

    iget v12, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    .line 114
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v13

    sget-object v16, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX1Y03:Lcom/daaw/avee/Common/Vec2f;

    iget-object v2, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    .line 115
    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexRoundSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v29

    iget v10, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->blendMode:I

    move-object/from16 v2, p1

    move v4, v5

    move v5, v6

    move v6, v7

    move/from16 v7, v17

    move/from16 v8, v18

    move/from16 v9, v19

    move/from16 v30, v10

    move/from16 v10, v20

    move-object/from16 v14, v16

    move-object/from16 v15, v29

    move/from16 v16, v30

    .line 106
    invoke-virtual/range {v1 .. v16}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    move-object/from16 v15, p1

    .line 118
    iget-object v1, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v1

    move-object/from16 v14, p2

    iget v12, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    sget-object v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX0Y03:Lcom/daaw/avee/Common/Vec2f;

    sget-object v16, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX1Y06:Lcom/daaw/avee/Common/Vec2f;

    iget-object v2, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    .line 127
    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexRoundSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v29

    iget v10, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->blendMode:I

    move-object/from16 v2, p1

    move/from16 v3, v17

    move/from16 v4, v18

    move/from16 v5, v19

    move/from16 v6, v20

    move/from16 v7, v21

    move/from16 v8, v22

    move/from16 v9, v23

    move/from16 v17, v10

    move/from16 v10, v24

    move-object/from16 v14, v16

    move-object/from16 v15, v29

    move/from16 v16, v17

    .line 118
    invoke-virtual/range {v1 .. v16}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    .line 130
    iget-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v1

    move-object/from16 v3, p2

    iget v12, v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    sget-object v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX0Y06:Lcom/daaw/avee/Common/Vec2f;

    .line 138
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v14

    iget-object v4, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    .line 139
    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexRoundSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v15

    iget v10, v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->blendMode:I

    move/from16 v3, v21

    move/from16 v4, v22

    move/from16 v5, v23

    move/from16 v6, v24

    move/from16 v7, v25

    move/from16 v8, v26

    move/from16 v9, v27

    move/from16 v16, v10

    move/from16 v10, v28

    .line 130
    invoke-virtual/range {v1 .. v16}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    goto :goto_1

    :cond_2
    move-object v3, v14

    move-object v2, v15

    .line 143
    iget-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v1

    const/4 v11, 0x0

    iget v12, v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    .line 151
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v13

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v14

    iget-object v4, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    .line 152
    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v15

    iget v10, v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->blendMode:I

    move-object/from16 v2, p1

    move/from16 v3, v17

    move/from16 v4, v18

    move/from16 v5, v19

    move/from16 v6, v20

    move/from16 v7, v21

    move/from16 v8, v22

    move/from16 v9, v23

    move/from16 v16, v10

    move/from16 v10, v24

    .line 143
    invoke-virtual/range {v1 .. v16}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    :goto_1
    return-void
.end method

.method public drawSegmentBatch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;FFIF)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 161
    array-length v2, v1

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v4, p3, v3

    add-int/lit8 v5, v2, 0x1

    int-to-float v5, v5

    div-float/2addr v4, v5

    .line 162
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    int-to-float v4, v4

    .line 163
    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidth:F

    mul-float v4, v4, v5

    .line 188
    new-instance v5, Lcom/daaw/avee/Common/Vec2f;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v6}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 189
    new-instance v7, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v7, v6, v6}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const/4 v6, 0x0

    .line 191
    :goto_0
    array-length v8, v1

    if-ge v6, v8, :cond_6

    .line 193
    aget-object v8, v1, v6

    .line 194
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    if-gez v9, :cond_0

    move-object v9, v8

    goto :goto_1

    :cond_0
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    aget-object v9, v1, v9

    :goto_1
    iput-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 195
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    if-gez v9, :cond_1

    move-object v9, v8

    goto :goto_2

    :cond_1
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    aget-object v9, v1, v9

    :goto_2
    iput-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    move/from16 v9, p6

    .line 197
    invoke-virtual {v0, v6, v2, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->getBarColorBase(IIF)I

    move-result v26

    .line 201
    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    .line 202
    iget v11, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    .line 204
    iget v12, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    const/high16 v13, -0x40000000    # -2.0f

    mul-float v12, v12, v13

    mul-float v12, v12, p4

    .line 205
    invoke-static {v12}, Ljava/lang/Math;->signum(F)F

    move-result v13

    .line 206
    iget v14, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barHeightMultiplier:F

    mul-float v12, v12, v14

    .line 214
    iget-boolean v14, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->mirror:Z

    if-eqz v14, :cond_2

    .line 215
    iget v14, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v14, v14, v12

    sub-float/2addr v10, v14

    .line 216
    iget v14, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v14, v14, v12

    sub-float/2addr v11, v14

    float-to-double v14, v12

    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 217
    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v14, v14, v16

    double-to-float v12, v14

    .line 228
    :cond_2
    iget-boolean v14, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidthAffectedByNormal:Z

    if-eqz v14, :cond_3

    .line 230
    iget v14, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v15, v15, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    add-float/2addr v14, v15

    iput v14, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 231
    iget v14, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v15, v15, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    add-float/2addr v14, v15

    iput v14, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 232
    iget v14, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v15, v15, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    add-float/2addr v14, v15

    iput v14, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 233
    iget v14, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v15, v15, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    add-float/2addr v14, v15

    iput v14, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 235
    invoke-virtual {v7}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 236
    invoke-virtual {v5}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 238
    iget v14, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v14, v15}, Lcom/daaw/avee/Common/Vec2f;->ccw90X(FF)F

    move-result v14

    mul-float v14, v14, v4

    add-float/2addr v14, v10

    .line 239
    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v3, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v15, v3}, Lcom/daaw/avee/Common/Vec2f;->ccw90Y(FF)F

    move-result v3

    mul-float v3, v3, v4

    add-float/2addr v3, v11

    .line 240
    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v15, v1}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v1

    mul-float v1, v1, v4

    add-float/2addr v1, v10

    .line 241
    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v15, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v10, v15}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v10

    mul-float v10, v10, v4

    add-float/2addr v10, v11

    .line 243
    iget v11, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v11, v11, v12

    add-float/2addr v11, v14

    .line 244
    iget v15, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v15, v15, v12

    add-float/2addr v15, v3

    move/from16 v28, v2

    .line 245
    iget v2, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v2, v2, v12

    add-float/2addr v2, v1

    move/from16 p3, v1

    .line 246
    iget v1, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v1, v1, v12

    add-float/2addr v1, v10

    sub-float v12, v11, v2

    move/from16 v16, v3

    sub-float v3, v15, v1

    .line 248
    invoke-static {v12, v3}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v3

    const/high16 v27, 0x3f000000    # 0.5f

    mul-float v3, v3, v27

    .line 250
    iget v12, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float v3, v3

    mul-float v12, v12, v3

    add-float/2addr v12, v11

    .line 251
    iget v9, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v9, v9, v3

    add-float/2addr v9, v15

    move-object/from16 v29, v5

    .line 252
    iget v5, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v5, v5, v3

    add-float/2addr v5, v2

    move/from16 v17, v2

    .line 253
    iget v2, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v2, v2, v3

    add-float/2addr v2, v1

    move/from16 v31, v1

    move/from16 v3, v16

    move/from16 v30, v17

    move/from16 v1, p3

    move/from16 v17, v5

    move v5, v15

    move v15, v2

    move v2, v11

    goto :goto_3

    :cond_3
    move/from16 v28, v2

    move-object/from16 v29, v5

    const/high16 v27, 0x3f000000    # 0.5f

    .line 257
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v1, v2}, Lcom/daaw/avee/Common/Vec2f;->ccw90X(FF)F

    move-result v1

    mul-float v1, v1, v4

    add-float v14, v1, v10

    .line 258
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v1, v2}, Lcom/daaw/avee/Common/Vec2f;->ccw90Y(FF)F

    move-result v1

    mul-float v1, v1, v4

    add-float v3, v1, v11

    .line 259
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v1, v2}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v1

    mul-float v1, v1, v4

    add-float/2addr v1, v10

    .line 260
    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v5, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    invoke-static {v2, v5}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v2

    mul-float v2, v2, v4

    add-float v10, v2, v11

    .line 262
    iget v2, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v2, v2, v12

    add-float/2addr v2, v14

    .line 263
    iget v5, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v5, v5, v12

    add-float/2addr v5, v3

    .line 264
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v9, v9, v12

    add-float/2addr v9, v1

    .line 265
    iget v11, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v11, v11, v12

    add-float/2addr v11, v10

    .line 267
    iget v12, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    neg-float v15, v4

    mul-float v12, v12, v15

    add-float/2addr v12, v2

    move/from16 p3, v1

    .line 268
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v1, v1, v15

    add-float/2addr v1, v5

    move/from16 v16, v1

    .line 269
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v1, v1, v15

    add-float/2addr v1, v9

    move/from16 v17, v1

    .line 270
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v1, v1, v15

    add-float/2addr v1, v11

    move v15, v1

    move/from16 v30, v9

    move/from16 v31, v11

    move/from16 v9, v16

    move/from16 v1, p3

    .line 274
    :goto_3
    iget-boolean v11, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->useFixedLineHeight:Z

    if-eqz v11, :cond_4

    .line 275
    iget v1, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v1, v1, v13

    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->fixedLineHeight:F

    mul-float v1, v1, v3

    add-float/2addr v1, v2

    .line 276
    iget v3, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v3, v3, v13

    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->fixedLineHeight:F

    mul-float v3, v3, v10

    add-float/2addr v3, v5

    .line 277
    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v10, v10, v13

    iget v11, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->fixedLineHeight:F

    mul-float v10, v10, v11

    add-float v10, v30, v10

    .line 278
    iget v11, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v11, v11, v13

    iget v13, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->fixedLineHeight:F

    mul-float v11, v11, v13

    add-float v11, v31, v11

    move/from16 v32, v10

    move/from16 v33, v11

    goto :goto_4

    :cond_4
    move/from16 v32, v1

    move/from16 v33, v10

    move v1, v14

    .line 285
    :goto_4
    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v10, v10, v4

    add-float v34, v10, v1

    .line 286
    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v10, v10, v4

    add-float v35, v10, v3

    .line 287
    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v10, v10, v4

    add-float v36, v10, v32

    .line 288
    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v8, v8, v4

    add-float v8, v8, v33

    .line 290
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const v11, 0x3c23d70a    # 0.01f

    cmpl-float v10, v10, v11

    if-lez v10, :cond_5

    .line 291
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v10

    const/16 v20, 0x0

    .line 299
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v22

    sget-object v23, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX1Y03:Lcom/daaw/avee/Common/Vec2f;

    .line 300
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v11

    invoke-interface {v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexRoundSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v24

    move-object/from16 v11, p1

    move v13, v9

    move/from16 v14, v17

    move/from16 v16, v2

    move/from16 v17, v5

    move/from16 v18, v30

    move/from16 v19, v31

    move/from16 v21, v26

    move/from16 v25, p5

    .line 291
    invoke-interface/range {v10 .. v25}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    .line 303
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v10

    sget-object v22, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX0Y03:Lcom/daaw/avee/Common/Vec2f;

    sget-object v23, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX1Y06:Lcom/daaw/avee/Common/Vec2f;

    .line 312
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v9

    invoke-interface {v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexRoundSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v24

    move v12, v2

    move v13, v5

    move/from16 v14, v30

    move/from16 v15, v31

    move/from16 v16, v1

    move/from16 v17, v3

    move/from16 v18, v32

    move/from16 v19, v33

    .line 303
    invoke-interface/range {v10 .. v25}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    .line 315
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v10

    sget-object v22, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->texCoordX0Y06:Lcom/daaw/avee/Common/Vec2f;

    .line 323
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v23

    .line 324
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexRoundSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v24

    move v12, v1

    move v13, v3

    move/from16 v14, v32

    move/from16 v15, v33

    move/from16 v16, v34

    move/from16 v17, v35

    move/from16 v18, v36

    move/from16 v19, v8

    .line 315
    invoke-interface/range {v10 .. v25}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    goto :goto_5

    .line 328
    :cond_5
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v10

    const/16 v20, 0x0

    .line 336
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v22

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v23

    .line 337
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v8

    invoke-interface {v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v24

    move-object/from16 v11, p1

    move v12, v2

    move v13, v5

    move/from16 v14, v30

    move/from16 v15, v31

    move/from16 v16, v1

    move/from16 v17, v3

    move/from16 v18, v32

    move/from16 v19, v33

    move/from16 v21, v26

    move/from16 v25, p5

    .line 328
    invoke-interface/range {v10 .. v25}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    :goto_5
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p2

    move/from16 v2, v28

    move-object/from16 v5, v29

    const/high16 v3, 0x3f000000    # 0.5f

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 346
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "barWidth"

    const/high16 v1, 0x3f000000    # 0.5f

    .line 347
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidth:F

    const/4 v0, 0x0

    const-string v1, "barWidthAffectedByShape"

    .line 348
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidthAffectedByNormal:Z

    const-string v1, "mirror"

    .line 349
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->mirror:Z

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 354
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 355
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidth:F

    const-string v1, "barWidth"

    const-string v3, "misc"

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 356
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidthAffectedByNormal:Z

    const-string v1, "barWidthAffectedByShape"

    const-string v2, "b"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 357
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->mirror:Z

    const-string v1, "mirror"

    const-string v2, "misc"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;
    .locals 0

    .line 31
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->barWidth:F

    return-object p0
.end method

.method public setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;
    .locals 0

    .line 37
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->mirror:Z

    return-object p0
.end method
