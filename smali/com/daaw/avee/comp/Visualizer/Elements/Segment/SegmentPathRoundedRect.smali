.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;
.super Ljava/lang/Object;
.source "SegmentPathRoundedRect.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;


# instance fields
.field circle:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

.field rect:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;->rect:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    .line 16
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;->circle:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    .line 20
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;->rect:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    return-void
.end method


# virtual methods
.method public getPathLength(Landroid/graphics/RectF;I)F
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;->rect:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->getPathLength(Landroid/graphics/RectF;I)F

    move-result p1

    return p1
.end method

.method public getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 0

    .line 49
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;->rect:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    const/4 p2, 0x0

    invoke-virtual {p1, p4, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->getPathLength(Landroid/graphics/RectF;I)F

    .line 50
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;->rect:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-virtual {p1, p4, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->getPathLength(Landroid/graphics/RectF;I)F

    .line 51
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;->circle:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-virtual {p1, p4, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->getPathLength(Landroid/graphics/RectF;I)F

    return p2
.end method

.method public getPreferredPointCount(Landroid/graphics/RectF;)I
    .locals 0

    const/4 p1, 0x4

    return p1
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    return-void
.end method

.method public process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;->rect:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V

    return-void
.end method

.method public setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;
    .locals 1

    .line 27
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathRoundedRect;->circle:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;->setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    return-object p0
.end method
