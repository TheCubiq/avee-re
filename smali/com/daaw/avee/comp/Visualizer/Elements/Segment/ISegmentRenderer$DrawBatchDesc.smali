.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;
.super Ljava/lang/Object;
.source "ISegmentRenderer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DrawBatchDesc"
.end annotation


# instance fields
.field public drawPointX:F

.field public drawPointY:F

.field public drawVecX:F

.field public drawVecY:F

.field public neighborMiddleVecX:F

.field public neighborMiddleVecY:F

.field public render1X:F

.field public render1Y:F

.field public render2X:F

.field public render2Y:F

.field public segmentHeightVal:F

.field public tmp1X:F

.field public tmp1Y:F

.field public tmp2X:F

.field public tmp2Y:F

.field public valueAtIndex0:Z

.field public valueIndexLastToConnect:I

.field public valueIndexNextToConnect:I

.field public valueIndexNextToConnectTmp:I

.field public valueX:F

.field public valueY:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEndPointX(F)F
    .locals 3

    .line 66
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    mul-float v1, v1, v2

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method public getEndPointX2()F
    .locals 1

    .line 77
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1X:F

    return v0
.end method

.method public getEndPointX2(I)F
    .locals 0

    .line 97
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueX:F

    return p1
.end method

.method public getEndPointY(F)F
    .locals 3

    .line 71
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    mul-float v1, v1, v2

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method public getEndPointY2()F
    .locals 1

    .line 82
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1Y:F

    return v0
.end method

.method public getEndPointY2(I)F
    .locals 0

    .line 102
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueY:F

    return p1
.end method
