.class public Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "SegmentElement.java"


# static fields
.field public static final typeName:Ljava/lang/String; = "Bars"


# instance fields
.field private audioProviderIndex:I

.field private barHeightScale:F

.field barVals2:Lcom/daaw/avee/Common/ISimpleListFloat;

.field private colorBlendOffset:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field private flipInput:Z

.field private maxBarHeightScale:F

.field private minBarHeightScale:F

.field private pathPointOut:Landroid/graphics/PointF;

.field private pathPointOutNew:Landroid/graphics/PointF;

.field private pathPointVecOut:Landroid/graphics/PointF;

.field private pathPointVecOutNew:Landroid/graphics/PointF;

.field private reactionAccumulatedDelay:I

.field private reactionDelay:I

.field segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

.field private segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

.field private segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

.field private segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

.field private softnessRadius:I


# direct methods
.method public constructor <init>()V
    .locals 4

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x2

    .line 71
    invoke-direct {p0, v1, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    .line 34
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    .line 35
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    const/4 v2, 0x0

    .line 40
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->flipInput:Z

    const/high16 v3, 0x40400000    # 3.0f

    .line 41
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->barHeightScale:F

    const v3, 0x3c1374bc    # 0.009f

    .line 42
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->minBarHeightScale:F

    const/high16 v3, 0x3f800000    # 1.0f

    .line 43
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->maxBarHeightScale:F

    .line 45
    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointOutNew:Landroid/graphics/PointF;

    .line 46
    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOutNew:Landroid/graphics/PointF;

    .line 47
    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointOut:Landroid/graphics/PointF;

    .line 48
    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOut:Landroid/graphics/PointF;

    .line 58
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->barVals2:Lcom/daaw/avee/Common/ISimpleListFloat;

    new-array v0, v2, [Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 59
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 61
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->softnessRadius:I

    .line 62
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->reactionDelay:I

    .line 63
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->reactionAccumulatedDelay:I

    const/4 v0, 0x1

    .line 65
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->audioProviderIndex:I

    const/4 v0, 0x0

    .line 67
    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->colorBlendOffset:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    .line 72
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 73
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 74
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    return-void
.end method

.method private render(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V
    .locals 25

    move-object/from16 v0, p0

    .line 233
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v1

    iget v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->audioProviderIndex:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Meter;->getAudioDataProvider(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 235
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-nez v2, :cond_0

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-eqz v2, :cond_a

    :cond_0
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    if-nez v2, :cond_1

    goto/16 :goto_5

    .line 239
    :cond_1
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v2

    .line 241
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v13

    .line 243
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->measureDrawRectCenterLocalPos(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v4

    .line 244
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v14

    .line 245
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v15

    .line 247
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->colorBlendOffset:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v5

    invoke-interface {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v4

    const/high16 v11, 0x3f800000    # 1.0f

    .line 248
    invoke-static {v11, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    const/4 v10, 0x0

    .line 249
    invoke-static {v10, v4}, Ljava/lang/Math;->max(FF)F

    move-result v23

    .line 251
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    move-object/from16 v9, p1

    invoke-interface {v4, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V

    .line 254
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->reactionDelay:I

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->reactionAccumulatedDelay:I

    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->softnessRadius:I

    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->barVals2:Lcom/daaw/avee/Common/ISimpleListFloat;

    invoke-interface {v1, v4, v5, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;->createFrameValuesAccessorList(IIILcom/daaw/avee/Common/ISimpleListFloat;)Lcom/daaw/avee/Common/ISimpleListFloat;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->barVals2:Lcom/daaw/avee/Common/ISimpleListFloat;

    .line 255
    invoke-interface {v1}, Lcom/daaw/avee/Common/ISimpleListFloat;->size()I

    move-result v1

    .line 256
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    array-length v4, v4

    const/4 v8, -0x1

    const/16 v16, 0x0

    if-eq v1, v4, :cond_2

    .line 258
    new-array v4, v1, [Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iput-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    .line 260
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;-><init>()V

    aput-object v6, v5, v4

    .line 261
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    aget-object v5, v5, v4

    iput v8, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnectTmp:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-ge v1, v3, :cond_3

    return-void

    .line 266
    :cond_3
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v3

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->minBarHeightScale:F

    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScale1D(F)F

    move-result v3

    .line 267
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v4

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->maxBarHeightScale:F

    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScale1D(F)F

    move-result v7

    .line 268
    invoke-interface/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v4

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->barHeightScale:F

    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScale1D(F)F

    move-result v4

    const v5, 0x3b03126f    # 0.002f

    mul-float v4, v4, v5

    .line 269
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    invoke-interface {v5, v2, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->getPathLength(Landroid/graphics/RectF;I)F

    move-result v24

    .line 271
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v17

    .line 272
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v18

    .line 289
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-nez v4, :cond_4

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-nez v4, :cond_4

    return-void

    :cond_4
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v1, :cond_7

    .line 298
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    iget-boolean v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->flipInput:Z

    const/16 v19, 0x0

    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointOut:Landroid/graphics/PointF;

    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOut:Landroid/graphics/PointF;

    move/from16 v22, v6

    move v12, v7

    move v7, v1

    move-object v8, v2

    move/from16 v9, v19

    move-object/from16 v19, v2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface/range {v4 .. v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    move-result v4

    .line 300
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOut:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->x:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 301
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOut:Landroid/graphics/PointF;

    iput v2, v5, Landroid/graphics/PointF;->x:F

    .line 302
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOut:Landroid/graphics/PointF;

    const/4 v6, 0x0

    iput v6, v5, Landroid/graphics/PointF;->y:F

    goto :goto_2

    :cond_5
    const/4 v6, 0x0

    .line 305
    :goto_2
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointOutNew:Landroid/graphics/PointF;

    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointOut:Landroid/graphics/PointF;

    float-to-double v8, v13

    const-wide v10, 0x400921fb54442d18L    # Math.PI

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v10

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    mul-double v8, v8, v10

    double-to-float v8, v8

    invoke-static {v5, v14, v15, v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->rotateAround(Landroid/graphics/PointF;FFLandroid/graphics/PointF;F)V

    .line 306
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOutNew:Landroid/graphics/PointF;

    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOut:Landroid/graphics/PointF;

    invoke-static {v5, v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->rotateAroundZero(Landroid/graphics/PointF;Landroid/graphics/PointF;F)V

    if-ltz v4, :cond_6

    .line 310
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    aget-object v5, v5, v4

    move/from16 v7, v22

    iput v7, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnectTmp:I

    goto :goto_3

    :cond_6
    move/from16 v7, v22

    .line 312
    :goto_3
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    aget-object v5, v5, v7

    .line 313
    iput v4, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    .line 314
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->barVals2:Lcom/daaw/avee/Common/ISimpleListFloat;

    invoke-interface {v4, v7}, Lcom/daaw/avee/Common/ISimpleListFloat;->get(I)F

    move-result v4

    mul-float v4, v4, v18

    invoke-static {v4, v12}, Ljava/lang/Math;->min(FF)F

    move-result v4

    mul-float v4, v4, v17

    iput v4, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    .line 315
    iget v4, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    add-float/2addr v4, v3

    iput v4, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    .line 322
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointOutNew:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->x:F

    iput v4, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    .line 323
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointOutNew:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iput v4, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    .line 324
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOutNew:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->x:F

    iput v4, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    .line 325
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->pathPointVecOutNew:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iput v4, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    add-int/lit8 v4, v7, 0x1

    move-object/from16 v9, p1

    move v6, v4

    move v7, v12

    move-object/from16 v2, v19

    const/4 v8, -0x1

    const/4 v10, 0x0

    const/high16 v11, 0x3f800000    # 1.0f

    goto/16 :goto_1

    :cond_7
    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_8

    .line 380
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    aget-object v3, v3, v2

    .line 382
    iget v4, v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnectTmp:I

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    const/4 v4, -0x1

    .line 383
    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnectTmp:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 409
    :cond_8
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-eqz v1, :cond_9

    .line 410
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->getBlendMode()I

    move-result v21

    const/high16 v20, 0x3f000000    # 0.5f

    move-object/from16 v16, v1

    move-object/from16 v17, p1

    move-object/from16 v18, v2

    move/from16 v19, v24

    move/from16 v22, v23

    invoke-interface/range {v16 .. v22}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;->drawSegmentBatch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;FFIF)V

    .line 413
    :cond_9
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-eqz v4, :cond_a

    .line 414
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentDrawDescTmp:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->getBlendMode()I

    move-result v9

    move-object/from16 v5, p1

    move/from16 v7, v24

    const/high16 v1, 0x3f000000    # 0.5f

    move v8, v1

    move/from16 v10, v23

    invoke-interface/range {v4 .. v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;->drawSegmentBatch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;FFIF)V

    :cond_a
    :goto_5
    return-void
.end method

.method public static renderPath2(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;ILandroid/graphics/RectF;IFLcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V
    .locals 19

    move/from16 v8, p3

    move-object/from16 v9, p6

    const/4 v10, 0x0

    new-array v0, v10, [Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 430
    new-instance v11, Landroid/graphics/PointF;

    invoke-direct {v11}, Landroid/graphics/PointF;-><init>()V

    .line 431
    new-instance v12, Landroid/graphics/PointF;

    invoke-direct {v12}, Landroid/graphics/PointF;-><init>()V

    .line 432
    new-instance v13, Landroid/graphics/PointF;

    invoke-direct {v13}, Landroid/graphics/PointF;-><init>()V

    .line 433
    new-instance v14, Landroid/graphics/PointF;

    invoke-direct {v14}, Landroid/graphics/PointF;-><init>()V

    move-object/from16 v15, p0

    .line 448
    invoke-interface {v9, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V

    const/4 v7, -0x1

    if-eqz v8, :cond_0

    .line 454
    new-array v0, v8, [Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v8, :cond_0

    .line 456
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;-><init>()V

    aput-object v2, v0, v1

    .line 457
    aget-object v2, v0, v1

    iput v7, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnectTmp:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move-object/from16 v16, v0

    const/4 v0, 0x1

    if-ge v8, v0, :cond_1

    return-void

    :cond_1
    move-object/from16 v6, p2

    .line 464
    invoke-interface {v9, v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->getPathLength(Landroid/graphics/RectF;I)F

    move-result v17

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v8, :cond_4

    const/16 v18, 0x0

    const/4 v1, 0x0

    move-object/from16 v0, p6

    move v2, v5

    move/from16 v3, p3

    move-object/from16 v4, p2

    move v10, v5

    move/from16 v5, v18

    move-object v6, v13

    const/4 v9, -0x1

    move-object v7, v14

    .line 479
    invoke-interface/range {v0 .. v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    move-result v0

    .line 481
    iget v1, v14, Landroid/graphics/PointF;->x:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const/high16 v1, 0x3f800000    # 1.0f

    .line 482
    iput v1, v14, Landroid/graphics/PointF;->x:F

    .line 483
    iput v2, v14, Landroid/graphics/PointF;->y:F

    .line 486
    :cond_2
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    float-to-double v4, v2

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    mul-double v4, v4, v6

    double-to-float v2, v4

    invoke-static {v11, v1, v3, v13, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->rotateAround(Landroid/graphics/PointF;FFLandroid/graphics/PointF;F)V

    .line 487
    invoke-static {v12, v14, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->rotateAroundZero(Landroid/graphics/PointF;Landroid/graphics/PointF;F)V

    if-ltz v0, :cond_3

    .line 491
    aget-object v1, v16, v0

    iput v10, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnectTmp:I

    .line 493
    :cond_3
    aget-object v1, v16, v10

    .line 494
    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    move/from16 v0, p4

    .line 495
    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    .line 502
    iget v2, v11, Landroid/graphics/PointF;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    .line 503
    iget v2, v11, Landroid/graphics/PointF;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    .line 504
    iget v2, v12, Landroid/graphics/PointF;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    .line 505
    iget v2, v12, Landroid/graphics/PointF;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    add-int/lit8 v5, v10, 0x1

    move-object/from16 v6, p2

    move-object/from16 v9, p6

    const/4 v7, -0x1

    const/4 v10, 0x0

    goto :goto_1

    :cond_4
    const/4 v9, -0x1

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v8, :cond_5

    .line 517
    aget-object v0, v16, v10

    .line 519
    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnectTmp:I

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    .line 520
    iput v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnectTmp:I

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_5
    if-eqz p5, :cond_6

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v7, 0x0

    move-object/from16 v1, p5

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    move/from16 v4, v17

    move/from16 v6, p1

    .line 524
    invoke-interface/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;->drawSegmentBatch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;FFIF)V

    :cond_6
    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "Bars"

    return-object v0
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 4

    .line 140
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 141
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const/4 v0, 0x0

    const-string v1, "flipInput"

    .line 147
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->flipInput:Z

    const-string v1, "heightScale"

    const/high16 v2, 0x40400000    # 3.0f

    .line 148
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const-string v1, "minHeightScale"

    const v2, 0x3c1374bc    # 0.009f

    .line 149
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const-string v1, "maxHeightScale"

    const/high16 v2, 0x3f800000    # 1.0f

    .line 150
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMaxBarHeightScale(F)V

    const-string v1, "ShapePath"

    .line 153
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v1

    const-string v2, "Circle"

    .line 154
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    invoke-static {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    if-eqz v2, :cond_0

    .line 156
    invoke-interface {v2, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :cond_0
    const/4 v1, 0x0

    .line 159
    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    const-string v2, "colorBlendOffset"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setColorBlendOffset(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    const/4 v1, 0x2

    const-string v2, "softness"

    .line 161
    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    const-string v1, "reactionDelay"

    .line 162
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionDelay(I)V

    const-string v1, "reactionAccumulatedDelay"

    .line 163
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionAccumulatedDelay(I)V

    const/4 v0, 0x1

    const-string v1, "audioProviderIndex"

    .line 164
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setAudioProviderIndex(I)V

    const-string v0, "Segment1"

    .line 166
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    const-string v1, "Bars"

    .line 167
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    invoke-static {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererFactory;->create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-eqz v1, :cond_1

    .line 168
    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :cond_1
    const-string v0, "Segment2"

    .line 170
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    const-string v0, "None"

    .line 171
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererFactory;->create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-eqz v0, :cond_2

    .line 172
    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :cond_2
    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 0

    .line 216
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 211
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 7

    .line 177
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 178
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "Bars/Segments"

    .line 180
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 185
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->flipInput:Z

    const-string v6, "1_bars"

    const-string v1, "flipInput"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 186
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->barHeightScale:F

    const-string v1, "heightScale"

    const-string v3, "1_bars"

    const/high16 v4, -0x3ee00000    # -10.0f

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 187
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->minBarHeightScale:F

    const-string v1, "minHeightScale"

    const-string v3, "1_bars"

    const v4, -0x430a3d71    # -0.03f

    const v5, 0x3cf5c28f    # 0.03f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 188
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->maxBarHeightScale:F

    const-string v1, "maxHeightScale"

    const-string v3, "1_bars"

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 191
    sget-boolean v0, Lcom/daaw/avee/Design/GeneralDesign;->celebrationContentAvailable:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->typeNamesCelebration:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->typeNames:[Ljava/lang/String;

    .line 192
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ShapePath"

    invoke-virtual {p1, v2, v1, v6, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 193
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 196
    :cond_1
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->colorBlendOffset:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const-string v1, "colorBlendOffset"

    const-string v3, "1_bars"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    .line 198
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->softnessRadius:I

    const/4 v4, 0x0

    const/16 v5, 0x14

    const-string v1, "softness"

    const-string v3, "2_Behavior"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 199
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->reactionDelay:I

    const/16 v5, 0x9

    const-string v1, "reactionDelay"

    const-string v3, "2_Behavior"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 200
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->reactionAccumulatedDelay:I

    const-string v1, "reactionAccumulatedDelay"

    const-string v3, "2_Behavior"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 201
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->audioProviderIndex:I

    const/4 v4, 0x1

    const/4 v5, 0x4

    const-string v1, "audioProviderIndex"

    const-string v3, "2_Behavior"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 203
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererFactory;->typeNames:[Ljava/lang/String;

    const-string v2, "Segment1"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 204
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 205
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererFactory;->typeNames:[Ljava/lang/String;

    const-string v2, "Segment2"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 206
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    if-eqz v1, :cond_3

    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :cond_3
    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 0

    .line 221
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 222
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->render(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V

    return-void
.end method

.method public onRenderPreview(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 0

    .line 227
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderPreview(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 228
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->render(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V

    return-void
.end method

.method public setAudioProviderIndex(I)V
    .locals 0

    .line 130
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->audioProviderIndex:I

    return-void
.end method

.method public setBarHeightScale(F)V
    .locals 0

    .line 105
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->barHeightScale:F

    return-void
.end method

.method public setColorBlendOffset(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->colorBlendOffset:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    return-void
.end method

.method public setMaxBarHeightScale(F)V
    .locals 0

    .line 113
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->maxBarHeightScale:F

    return-void
.end method

.method public setMinBarHeightScale(F)V
    .locals 0

    .line 109
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->minBarHeightScale:F

    return-void
.end method

.method public setReactionAccumulatedDelay(I)V
    .locals 0

    .line 126
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->reactionAccumulatedDelay:I

    return-void
.end method

.method public setReactionDelay(I)V
    .locals 0

    .line 122
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->reactionDelay:I

    return-void
.end method

.method public setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    return-void
.end method

.method public setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    return-void
.end method

.method public setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->segmentRenderer2:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;

    return-void
.end method

.method public setSoftness(I)V
    .locals 0

    .line 118
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->softnessRadius:I

    return-void
.end method
