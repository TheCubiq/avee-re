.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
.source "SegmentRendererLine.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func3;
.implements Lcom/daaw/avee/Common/Func/Func4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;",
        "Lcom/daaw/avee/Common/Func/Func3<",
        "Ljava/lang/Integer;",
        "[F[I",
        "Ljava/lang/Boolean;",
        ">;",
        "Lcom/daaw/avee/Common/Func/Func4<",
        "Ljava/lang/Integer;",
        "[F[I[F",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final typeName:Ljava/lang/String; = "Line"


# instance fields
.field c0:Lcom/daaw/avee/Common/Vec2f;

.field c1:Lcom/daaw/avee/Common/Vec2f;

.field c2:Lcom/daaw/avee/Common/Vec2f;

.field c3:Lcom/daaw/avee/Common/Vec2f;

.field desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

.field descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

.field drawPoint:Landroid/graphics/PointF;

.field drawScale:F

.field private flipEveryOther:Z

.field lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

.field lastDrawPoint:Landroid/graphics/PointF;

.field lastLastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

.field lx1:F

.field lx3:F

.field ly1:F

.field ly3:F

.field private mirror:Z

.field nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

.field nextDrawPoint:Landroid/graphics/PointF;

.field normal0ltmp:Lcom/daaw/avee/Common/Vec2f;

.field normal0ntmp:Lcom/daaw/avee/Common/Vec2f;

.field normal0tmp:Lcom/daaw/avee/Common/Vec2f;

.field normal1:Lcom/daaw/avee/Common/Vec2f;

.field normal1tmp:Lcom/daaw/avee/Common/Vec2f;

.field normal2:Lcom/daaw/avee/Common/Vec2f;

.field normal2ltmp:Lcom/daaw/avee/Common/Vec2f;

.field normal2ntmp:Lcom/daaw/avee/Common/Vec2f;

.field normal2tmp:Lcom/daaw/avee/Common/Vec2f;

.field normal3tmp:Lcom/daaw/avee/Common/Vec2f;

.field outFixedLinePosOffset:Lcom/daaw/avee/Common/Vec2f;

.field private tmpColorOffsetBlend:F

.field vec1:Lcom/daaw/avee/Common/Vec2f;

.field x1:F

.field x3:F

.field y1:F

.field y3:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 22
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;-><init>()V

    .line 27
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    .line 28
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    .line 29
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDrawPoint:Landroid/graphics/PointF;

    .line 30
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    .line 31
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    .line 32
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    .line 33
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->outFixedLinePosOffset:Lcom/daaw/avee/Common/Vec2f;

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    .line 48
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    .line 49
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    .line 50
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    .line 51
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    .line 52
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    .line 53
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    .line 54
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    .line 55
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0ltmp:Lcom/daaw/avee/Common/Vec2f;

    .line 56
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0ntmp:Lcom/daaw/avee/Common/Vec2f;

    .line 57
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2ltmp:Lcom/daaw/avee/Common/Vec2f;

    .line 58
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2ntmp:Lcom/daaw/avee/Common/Vec2f;

    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->mirror:Z

    const/4 v0, 0x0

    .line 60
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->flipEveryOther:Z

    .line 62
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->tmpColorOffsetBlend:F

    return-void
.end method

.method private getFixedLinePosOffset(FFFFLcom/daaw/avee/Common/Vec2f;FZ)V
    .locals 1

    .line 732
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iput p3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 733
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iput p4, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    if-nez p7, :cond_0

    .line 740
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 741
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float p1, p1, p6

    .line 745
    iput p1, p5, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float p2, p2, p6

    .line 746
    iput p2, p5, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void

    .line 750
    :cond_0
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iput p1, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 751
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 752
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 757
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr p2, p3

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 758
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr p2, p3

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 759
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 761
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 762
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 771
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float p4, p4

    iput p4, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 772
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    neg-float p4, p4

    iput p4, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 775
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {p1, p2, p3, p4}, Lcom/daaw/avee/Common/Vec2f;->dot(FFFF)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    const/high16 p4, 0x3e800000    # 0.25f

    invoke-static {p3, p4}, Ljava/lang/Math;->max(FF)F

    move-result p3

    div-float/2addr p6, p3

    const/high16 p3, 0x3f800000    # 1.0f

    mul-float p1, p1, p3

    mul-float p1, p1, p6

    .line 784
    iput p1, p5, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float p2, p2, p3

    mul-float p2, p2, p6

    .line 785
    iput p2, p5, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void
.end method

.method private getFixedLinePosOffset(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;Lcom/daaw/avee/Common/Vec2f;FI)V
    .locals 4

    .line 658
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    if-gez v0, :cond_0

    .line 659
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 661
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 662
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_0

    .line 665
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 667
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v0, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->getEndPointY2(I)F

    move-result v0

    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->getEndPointY2(I)F

    move-result v2

    sub-float/2addr v0, v2

    neg-float v0, v0

    iput v0, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 668
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    invoke-virtual {v1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->getEndPointX2(I)F

    move-result v1

    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->getEndPointX2(I)F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 670
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 675
    :goto_0
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    if-gez v0, :cond_1

    .line 677
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput p4, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecX:F

    .line 678
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p4, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecY:F

    .line 682
    iget p4, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecX:F

    mul-float p4, p4, p3

    iput p4, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 683
    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecY:F

    mul-float p1, p1, p3

    iput p1, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void

    .line 688
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    aget-object v0, v0, v1

    .line 690
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->getEndPointY2(I)F

    move-result v2

    invoke-virtual {v0, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->getEndPointY2(I)F

    move-result v3

    sub-float/2addr v2, v3

    neg-float v2, v2

    iput v2, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 691
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->getEndPointX2(I)F

    move-result v2

    invoke-virtual {v0, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->getEndPointX2(I)F

    move-result p4

    sub-float/2addr v2, p4

    iput v2, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 692
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p4}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 697
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v0, v1

    iput v0, p4, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 698
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v0, v1

    iput v0, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 699
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p4}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 701
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput p4, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecX:F

    .line 702
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->vec1:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p4, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecY:F

    .line 711
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget v0, p4, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float v0, v0

    iput v0, p4, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 712
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget v0, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    neg-float v0, v0

    iput v0, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 715
    iget p4, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecX:F

    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecY:F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {p4, v0, v1, v2}, Lcom/daaw/avee/Common/Vec2f;->dot(FFFF)F

    move-result p4

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p4

    const/high16 v0, 0x3e800000    # 0.25f

    invoke-static {p4, v0}, Ljava/lang/Math;->max(FF)F

    move-result p4

    div-float/2addr p3, p4

    const/high16 p4, 0x3f800000    # 1.0f

    .line 724
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecX:F

    mul-float v0, v0, p4

    mul-float v0, v0, p3

    iput v0, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 725
    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->neighborMiddleVecY:F

    mul-float p1, p1, p4

    mul-float p1, p1, p3

    iput p1, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void
.end method


# virtual methods
.method public Invoke(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;
    .locals 4

    .line 793
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 796
    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    .line 797
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    aget-object v0, v0, v2

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 803
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    array-length v2, v2

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->tmpColorOffsetBlend:F

    invoke-virtual {p0, v0, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->getBarColorBase(IIF)I

    move-result v0

    .line 804
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    array-length v2, v2

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->tmpColorOffsetBlend:F

    invoke-virtual {p0, p1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->getBarColorBase(IIF)I

    move-result p1

    .line 810
    aput v0, p3, v1

    const/4 v0, 0x1

    .line 811
    aput p1, p3, v0

    .line 812
    aget p1, p3, v1

    const/4 v2, 0x2

    aput p1, p3, v2

    .line 813
    aget p1, p3, v0

    const/4 v3, 0x3

    aput p1, p3, v3

    .line 822
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    .line 823
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    .line 824
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    .line 825
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    .line 827
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    .line 828
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    .line 829
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    .line 830
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    .line 839
    iget p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    aput p3, p2, v1

    .line 840
    iget p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    aput p3, p2, v0

    .line 842
    iget p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    aput p3, p2, v2

    .line 843
    iget p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    aput p3, p2, v3

    const/4 p3, 0x4

    .line 845
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    aput v1, p2, p3

    const/4 p3, 0x5

    .line 846
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    aput v1, p2, p3

    const/4 p3, 0x6

    .line 848
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    aput v1, p2, p3

    const/4 p3, 0x7

    .line 849
    aput p1, p2, p3

    .line 856
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 819
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public Invoke(Ljava/lang/Integer;[F[I[F)Ljava/lang/Boolean;
    .locals 19

    move-object/from16 v14, p0

    .line 862
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 865
    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    const/4 v1, 0x0

    if-ltz v0, :cond_3

    .line 866
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget-object v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    aget-object v0, v0, v2

    iput-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 874
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    array-length v2, v2

    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->tmpColorOffsetBlend:F

    invoke-virtual {v14, v0, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->getBarColorBase(IIF)I

    move-result v0

    const/4 v15, 0x1

    aput v0, p3, v15

    .line 877
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    iget-object v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    array-length v2, v2

    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->tmpColorOffsetBlend:F

    invoke-virtual {v14, v0, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->getBarColorBase(IIF)I

    move-result v0

    aput v0, p3, v1

    .line 884
    aget v0, p3, v1

    const/4 v2, 0x2

    aput v0, p3, v2

    .line 885
    aget v0, p3, v15

    const/4 v3, 0x3

    aput v0, p3, v3

    .line 894
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    iput v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    .line 895
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    iput v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    .line 896
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    iput v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    .line 897
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    iput v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    .line 899
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    iput v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    .line 900
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    iput v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    .line 901
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    iput v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    .line 902
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    iput v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    .line 911
    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    aput v4, p2, v1

    .line 912
    iget v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    aput v1, p2, v15

    .line 914
    iget v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    aput v1, p2, v2

    .line 915
    iget v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    aput v1, p2, v3

    const/4 v1, 0x4

    .line 917
    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    aput v2, p2, v1

    const/4 v1, 0x5

    .line 918
    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    aput v2, p2, v1

    const/4 v1, 0x6

    .line 920
    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    aput v2, p2, v1

    const/4 v1, 0x7

    .line 921
    aput v0, p2, v1

    .line 924
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    if-ltz v0, :cond_1

    .line 926
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget-object v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    aget-object v0, v0, v1

    iput-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastLastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 927
    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    .line 928
    iget-object v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastLastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    .line 929
    iget-object v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastLastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    .line 930
    iget-object v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastLastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v3, v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    .line 933
    iget-object v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    if-ltz v4, :cond_0

    .line 935
    iget-object v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget-object v5, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    aget-object v4, v4, v5

    iput-object v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 936
    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    .line 937
    iget-object v5, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    .line 938
    iget-object v6, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v6, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    .line 939
    iget-object v7, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v7, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    .line 941
    iget v8, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    sub-float v1, v8, v1

    neg-float v1, v1

    iget v9, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    sub-float v10, v9, v0

    iget v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    sub-float v8, v0, v8

    neg-float v8, v8

    iget v11, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    sub-float v9, v11, v9

    sub-float/2addr v5, v0

    neg-float v5, v5

    sub-float v11, v4, v11

    iget v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    sub-float v3, v0, v3

    neg-float v12, v3

    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    sub-float v13, v3, v2

    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    sub-float v0, v2, v0

    neg-float v4, v0

    iget v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    sub-float v16, v0, v3

    sub-float/2addr v7, v2

    neg-float v7, v7

    sub-float v17, v6, v0

    move-object/from16 v0, p0

    move v2, v10

    move v3, v8

    move v10, v4

    move v4, v9

    move v6, v11

    move v11, v7

    move v7, v12

    move v8, v13

    move v9, v10

    move/from16 v10, v16

    move/from16 v12, v17

    move-object/from16 v13, p4

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->makeEdgeCorners(FFFFFFFFFFFF[F)V

    goto/16 :goto_0

    .line 953
    :cond_0
    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    sub-float v1, v4, v1

    neg-float v1, v1

    iget v5, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    sub-float v6, v5, v0

    iget v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    sub-float v7, v0, v4

    neg-float v7, v7

    iget v8, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    sub-float v9, v8, v5

    sub-float/2addr v0, v4

    neg-float v10, v0

    sub-float/2addr v8, v5

    iget v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    sub-float v3, v0, v3

    neg-float v11, v3

    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    sub-float v12, v3, v2

    iget v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    sub-float v4, v2, v0

    neg-float v13, v4

    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    sub-float v16, v4, v3

    sub-float/2addr v2, v0

    neg-float v5, v2

    sub-float v17, v4, v3

    move-object/from16 v0, p0

    move v2, v6

    move v3, v7

    move v4, v9

    move/from16 v18, v5

    move v5, v10

    move v6, v8

    move v7, v11

    move v8, v12

    move v9, v13

    move/from16 v10, v16

    move/from16 v11, v18

    move/from16 v12, v17

    move-object/from16 v13, p4

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->makeEdgeCorners(FFFFFFFFFFFF[F)V

    goto/16 :goto_0

    .line 963
    :cond_1
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    if-ltz v0, :cond_2

    .line 965
    iget-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget-object v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    aget-object v0, v0, v1

    iput-object v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 966
    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    .line 967
    iget-object v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    .line 968
    iget-object v2, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    .line 969
    iget-object v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v3, v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    .line 971
    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    iget v5, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    sub-float v6, v4, v5

    neg-float v6, v6

    iget v7, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    iget v8, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    sub-float v9, v7, v8

    sub-float v5, v4, v5

    neg-float v5, v5

    sub-float v8, v7, v8

    sub-float/2addr v1, v4

    neg-float v10, v1

    sub-float v7, v0, v7

    iget v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    iget v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    sub-float v11, v0, v1

    neg-float v11, v11

    iget v12, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    iget v13, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    sub-float v16, v12, v13

    sub-float/2addr v0, v1

    neg-float v1, v0

    sub-float v13, v12, v13

    sub-float/2addr v3, v4

    neg-float v4, v3

    sub-float v12, v2, v12

    move-object/from16 v0, p0

    move/from16 v17, v1

    move v1, v6

    move v2, v9

    move v3, v5

    move/from16 v18, v4

    move v4, v8

    move v5, v10

    move v6, v7

    move v7, v11

    move/from16 v8, v16

    move/from16 v9, v17

    move v10, v13

    move/from16 v11, v18

    move-object/from16 v13, p4

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->makeEdgeCorners(FFFFFFFFFFFF[F)V

    goto :goto_0

    .line 983
    :cond_2
    iget v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    iget v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    sub-float v2, v0, v1

    neg-float v2, v2

    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    sub-float v5, v3, v4

    sub-float v6, v0, v1

    neg-float v6, v6

    sub-float v7, v3, v4

    sub-float/2addr v0, v1

    neg-float v8, v0

    sub-float v9, v3, v4

    iget v0, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    iget v1, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    sub-float v3, v0, v1

    neg-float v10, v3

    iget v3, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    iget v4, v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    sub-float v11, v3, v4

    sub-float v12, v0, v1

    neg-float v12, v12

    sub-float v13, v3, v4

    sub-float/2addr v0, v1

    neg-float v1, v0

    sub-float v16, v3, v4

    move-object/from16 v0, p0

    move/from16 v17, v1

    move v1, v2

    move v2, v5

    move v3, v6

    move v4, v7

    move v5, v8

    move v6, v9

    move v7, v10

    move v8, v11

    move v9, v12

    move v10, v13

    move/from16 v11, v17

    move/from16 v12, v16

    move-object/from16 v13, p4

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->makeEdgeCorners(FFFFFFFFFFFF[F)V

    .line 1005
    :goto_0
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 891
    :cond_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 22
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->Invoke(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 22
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    check-cast p4, [F

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->Invoke(Ljava/lang/Integer;[F[I[F)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public drawSegment(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;F)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p2

    .line 79
    iget v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->segmentHeightVal:F

    .line 80
    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastSegmentHeightVal:F

    .line 81
    iget-boolean v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->flipEveryOther:Z

    const/high16 v6, -0x40800000    # -1.0f

    if-eqz v5, :cond_1

    .line 82
    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valueIndex:I

    rem-int/lit8 v5, v5, 0x2

    if-nez v5, :cond_0

    mul-float v3, v3, v6

    goto :goto_0

    :cond_0
    mul-float v4, v4, v6

    .line 86
    :cond_1
    :goto_0
    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valueIndex:I

    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valuesCount:I

    move/from16 v8, p3

    invoke-virtual {v0, v5, v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->getBarColorBase(IIF)I

    move-result v5

    iput v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    .line 88
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawPointX:F

    iput v7, v5, Landroid/graphics/PointF;->x:F

    .line 89
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawPointY:F

    iput v7, v5, Landroid/graphics/PointF;->y:F

    .line 90
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawPointX:F

    iput v7, v5, Landroid/graphics/PointF;->x:F

    .line 91
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawPointY:F

    iput v7, v5, Landroid/graphics/PointF;->y:F

    const/high16 v5, 0x3f800000    # 1.0f

    .line 93
    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawSegmentWidth:F

    mul-float v7, v7, v5

    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->valuesCount:I

    add-int/lit8 v5, v5, 0x1

    int-to-float v5, v5

    div-float/2addr v7, v5

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v5

    int-to-float v5, v5

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float v5, v5, v7

    const/high16 v7, -0x40000000    # -2.0f

    mul-float v4, v4, v7

    .line 95
    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawScale:F

    mul-float v4, v4, v8

    iget v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->barHeightMultiplier:F

    mul-float v4, v4, v8

    mul-float v3, v3, v7

    .line 96
    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawScale:F

    mul-float v3, v3, v7

    iget v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->barHeightMultiplier:F

    mul-float v3, v3, v7

    .line 98
    iget-boolean v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->mirror:Z

    if-eqz v7, :cond_2

    .line 99
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget v8, v7, Landroid/graphics/PointF;->x:F

    iget v9, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecX:F

    mul-float v9, v9, v4

    sub-float/2addr v8, v9

    iput v8, v7, Landroid/graphics/PointF;->x:F

    .line 100
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget v8, v7, Landroid/graphics/PointF;->y:F

    iget v9, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecY:F

    mul-float v9, v9, v4

    sub-float/2addr v8, v9

    iput v8, v7, Landroid/graphics/PointF;->y:F

    float-to-double v7, v4

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    .line 101
    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v9

    double-to-float v4, v7

    .line 103
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v8, v7, Landroid/graphics/PointF;->x:F

    iget v11, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v11, v11, v3

    sub-float/2addr v8, v11

    iput v8, v7, Landroid/graphics/PointF;->x:F

    .line 104
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v8, v7, Landroid/graphics/PointF;->y:F

    iget v11, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v11, v11, v3

    sub-float/2addr v8, v11

    iput v8, v7, Landroid/graphics/PointF;->y:F

    float-to-double v7, v3

    .line 105
    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v9

    double-to-float v3, v7

    .line 111
    :cond_2
    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecX:F

    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecY:F

    invoke-static {v7, v8}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v7

    mul-float v7, v7, v5

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget v8, v8, Landroid/graphics/PointF;->x:F

    add-float/2addr v7, v8

    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    .line 112
    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecX:F

    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecY:F

    invoke-static {v7, v8}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v7

    mul-float v7, v7, v5

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget v8, v8, Landroid/graphics/PointF;->y:F

    add-float/2addr v7, v8

    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    .line 113
    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v7, v8}, Lcom/daaw/avee/Common/Vec2f;->cw90X(FF)F

    move-result v7

    mul-float v7, v7, v5

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v8, v8, Landroid/graphics/PointF;->x:F

    add-float/2addr v7, v8

    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    .line 114
    iget v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    iget v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    invoke-static {v7, v8}, Lcom/daaw/avee/Common/Vec2f;->cw90Y(FF)F

    move-result v7

    mul-float v7, v7, v5

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->y:F

    add-float/2addr v7, v5

    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    .line 116
    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecX:F

    mul-float v5, v5, v4

    iget v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    add-float/2addr v5, v7

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    .line 117
    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecY:F

    mul-float v5, v5, v4

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    add-float/2addr v5, v4

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    .line 118
    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v4, v4, v3

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    add-float/2addr v4, v5

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    .line 119
    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v4, v4, v3

    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    add-float/2addr v4, v3

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    .line 121
    iget-boolean v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->useFixedLineHeight:Z

    if-eqz v3, :cond_3

    .line 122
    iget v3, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawScale:F

    mul-float v3, v3, v6

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->barHeightMultiplier:F

    mul-float v3, v3, v4

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    .line 123
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecX:F

    mul-float v5, v5, v3

    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->fixedLineHeight:F

    mul-float v5, v5, v6

    add-float/2addr v4, v5

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    .line 124
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->lastDrawVecY:F

    mul-float v5, v5, v3

    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->fixedLineHeight:F

    mul-float v5, v5, v6

    add-float/2addr v4, v5

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    .line 125
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecX:F

    mul-float v5, v5, v3

    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->fixedLineHeight:F

    mul-float v5, v5, v6

    add-float/2addr v4, v5

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    .line 126
    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->drawVecY:F

    mul-float v5, v5, v3

    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->fixedLineHeight:F

    mul-float v5, v5, v3

    add-float/2addr v4, v5

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    .line 143
    :cond_3
    iget-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v3

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx1:F

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly1:F

    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    iget v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    iget v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lx3:F

    iget v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->ly3:F

    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    iget v11, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    iget v13, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->color1:I

    .line 151
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v14

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v15

    iget-object v12, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    .line 152
    invoke-virtual {v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v16

    iget v12, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;->blendMode:I

    move-object v1, v3

    move-object/from16 v2, p1

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    move v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move/from16 v16, v17

    .line 143
    invoke-virtual/range {v1 .. v16}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    return-void
.end method

.method public drawSegmentBatch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;FFIF)V
    .locals 11

    move-object v10, p0

    move-object v0, p2

    .line 159
    iput-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    move v1, p4

    .line 160
    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawScale:F

    move/from16 v1, p6

    .line 162
    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->tmpColorOffsetBlend:F

    .line 164
    array-length v3, v0

    .line 172
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRenderEdges()Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexSquareYSidesSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x2

    move-object v4, v1

    move/from16 v5, p5

    invoke-direct/range {v4 .. v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v7, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 178
    :goto_1
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    array-length v5, v4

    if-ge v2, v5, :cond_9

    .line 180
    aget-object v4, v4, v2

    iput-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 185
    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    if-gez v4, :cond_1

    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    goto :goto_2

    :cond_1
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexLastToConnect:I

    aget-object v4, v4, v5

    :goto_2
    iput-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 186
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    if-gez v4, :cond_2

    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    goto :goto_3

    :cond_2
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueIndexNextToConnect:I

    aget-object v4, v4, v5

    :goto_3
    iput-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 191
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    .line 192
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    .line 193
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v6, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->segmentHeightVal:F

    .line 194
    iget-boolean v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->flipEveryOther:Z

    if-eqz v6, :cond_4

    .line 196
    rem-int/lit8 v6, v2, 0x2

    const/high16 v8, -0x40800000    # -1.0f

    if-nez v6, :cond_3

    mul-float v4, v4, v8

    goto :goto_4

    :cond_3
    mul-float v5, v5, v8

    .line 201
    :cond_4
    :goto_4
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    iput v8, v6, Landroid/graphics/PointF;->x:F

    .line 202
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    iput v8, v6, Landroid/graphics/PointF;->y:F

    .line 203
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    iput v8, v6, Landroid/graphics/PointF;->x:F

    .line 204
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    iput v8, v6, Landroid/graphics/PointF;->y:F

    .line 205
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDrawPoint:Landroid/graphics/PointF;

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointX:F

    iput v8, v6, Landroid/graphics/PointF;->x:F

    .line 206
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDrawPoint:Landroid/graphics/PointF;

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->nextDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawPointY:F

    iput v8, v6, Landroid/graphics/PointF;->y:F

    const/high16 v6, -0x40000000    # -2.0f

    mul-float v5, v5, v6

    .line 208
    iget v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawScale:F

    mul-float v5, v5, v8

    iget v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->barHeightMultiplier:F

    mul-float v5, v5, v8

    mul-float v4, v4, v6

    .line 209
    iget v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawScale:F

    mul-float v4, v4, v6

    iget v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->barHeightMultiplier:F

    mul-float v4, v4, v6

    .line 212
    iget-boolean v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->mirror:Z

    if-eqz v6, :cond_5

    .line 213
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget v8, v6, Landroid/graphics/PointF;->x:F

    iget-object v9, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v9, v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v9, v9, v5

    sub-float/2addr v8, v9

    iput v8, v6, Landroid/graphics/PointF;->x:F

    .line 214
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDrawPoint:Landroid/graphics/PointF;

    iget v8, v6, Landroid/graphics/PointF;->y:F

    iget-object v9, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->lastDesc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v9, v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v9, v9, v5

    sub-float/2addr v8, v9

    iput v8, v6, Landroid/graphics/PointF;->y:F

    .line 217
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v6, v5, Landroid/graphics/PointF;->x:F

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v8, v8, v4

    sub-float/2addr v6, v8

    iput v6, v5, Landroid/graphics/PointF;->x:F

    .line 218
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v6, v5, Landroid/graphics/PointF;->y:F

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v8, v8, v4

    sub-float/2addr v6, v8

    iput v6, v5, Landroid/graphics/PointF;->y:F

    float-to-double v4, v4

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 219
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v8

    double-to-float v4, v4

    .line 233
    :cond_5
    iget-boolean v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->useFixedLineHeight:Z

    const/4 v6, 0x0

    const/4 v8, 0x1

    if-nez v5, :cond_7

    cmpg-float v5, v4, v6

    if-gez v5, :cond_6

    :goto_5
    const/4 v5, 0x1

    goto :goto_6

    :cond_6
    const/4 v5, 0x0

    goto :goto_6

    .line 238
    :cond_7
    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->fixedLineHeight:F

    cmpl-float v5, v5, v6

    if-lez v5, :cond_6

    goto :goto_5

    :goto_6
    if-eqz v5, :cond_8

    .line 243
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->x:F

    iput v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    .line 244
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->y:F

    iput v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    .line 250
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v5, v5, v4

    iget v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    add-float/2addr v5, v6

    iput v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    .line 251
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v5, v5, v4

    iget v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    add-float/2addr v5, v4

    iput v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    .line 253
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iput-boolean v8, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueAtIndex0:Z

    .line 254
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueX:F

    .line 255
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueY:F

    .line 257
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1X:F

    .line 258
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1Y:F

    .line 259
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp2X:F

    .line 260
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp2Y:F

    goto :goto_7

    .line 262
    :cond_8
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->x:F

    iput v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    .line 263
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->drawPoint:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->y:F

    iput v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    .line 264
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecX:F

    mul-float v5, v5, v4

    iget v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    add-float/2addr v5, v6

    iput v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    .line 265
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->drawVecY:F

    mul-float v5, v5, v4

    iget v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    add-float/2addr v5, v4

    iput v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    .line 267
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iput-boolean v1, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueAtIndex0:Z

    .line 268
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueX:F

    .line 269
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueY:F

    .line 271
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x1:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1X:F

    .line 272
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y1:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1Y:F

    .line 273
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->x3:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp2X:F

    .line 274
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->y3:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp2Y:F

    .line 346
    :goto_7
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1X:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    .line 347
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1Y:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    .line 348
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp2X:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    .line 349
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp2Y:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    .line 352
    :cond_9
    iget-boolean v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->useFixedLineHeight:Z

    if-eqz v2, :cond_b

    const/4 v2, 0x0

    .line 356
    :goto_8
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->descs:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    array-length v5, v4

    if-ge v2, v5, :cond_b

    .line 358
    aget-object v4, v4, v2

    iput-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    .line 362
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->outFixedLinePosOffset:Lcom/daaw/avee/Common/Vec2f;

    iget v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->fixedLineHeight:F

    invoke-direct {p0, v4, v5, v6, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->getFixedLinePosOffset(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;Lcom/daaw/avee/Common/Vec2f;FI)V

    .line 365
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget-boolean v4, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueAtIndex0:Z

    if-eqz v4, :cond_a

    .line 366
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueX:F

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->outFixedLinePosOffset:Lcom/daaw/avee/Common/Vec2f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    .line 367
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueY:F

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->outFixedLinePosOffset:Lcom/daaw/avee/Common/Vec2f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    .line 369
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2X:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp2X:F

    .line 370
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render2Y:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp2Y:F

    goto :goto_9

    .line 372
    :cond_a
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueX:F

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->outFixedLinePosOffset:Lcom/daaw/avee/Common/Vec2f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    .line 373
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->valueY:F

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->outFixedLinePosOffset:Lcom/daaw/avee/Common/Vec2f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    .line 375
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1X:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1X:F

    .line 376
    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->desc:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->render1Y:F

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;->tmp1Y:F

    :goto_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_b
    if-eqz v0, :cond_c

    .line 491
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v0

    const/4 v4, 0x0

    .line 496
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v5

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v6

    .line 497
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v7

    const/4 v9, 0x0

    move-object v1, p1

    move-object v2, p0

    move/from16 v8, p5

    .line 491
    invoke-interface/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawBatchRectangleEdges(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/Common/Func/Func4;IFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V

    goto :goto_a

    .line 503
    :cond_c
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;

    move-result-object v0

    const/4 v4, 0x0

    .line 508
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v5

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v6

    move-object v1, p1

    move-object v2, p0

    .line 503
    invoke-interface/range {v0 .. v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;->drawBatchRectangle2Patch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/Common/Func/Func3;IFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :goto_a
    return-void
.end method

.method makeEdgeCorners(FFFFFFFFFFFF[F)V
    .locals 15

    move-object v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    mul-float v13, v1, v1

    mul-float v14, v2, v2

    add-float/2addr v13, v14

    float-to-double v13, v13

    .line 1092
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v0, v1

    .line 1093
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v13

    double-to-float v0, v0

    float-to-double v1, v2

    .line 1094
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v1, v13

    double-to-float v1, v1

    mul-float v2, v3, v3

    mul-float v13, v4, v4

    add-float/2addr v2, v13

    float-to-double v13, v2

    .line 1097
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v2, v3

    .line 1098
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v13

    double-to-float v2, v2

    float-to-double v3, v4

    .line 1099
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v13

    double-to-float v3, v3

    mul-float v4, v5, v5

    mul-float v13, v6, v6

    add-float/2addr v4, v13

    float-to-double v13, v4

    .line 1102
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v4, v5

    .line 1103
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v4, v13

    double-to-float v4, v4

    float-to-double v5, v6

    .line 1104
    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v13

    double-to-float v5, v5

    mul-float v6, v7, v7

    mul-float v13, v8, v8

    add-float/2addr v6, v13

    float-to-double v13, v6

    .line 1109
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v6, v7

    .line 1110
    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v6, v13

    double-to-float v6, v6

    float-to-double v7, v8

    .line 1111
    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v7, v13

    double-to-float v7, v7

    mul-float v8, v9, v9

    mul-float v13, v10, v10

    add-float/2addr v8, v13

    float-to-double v13, v8

    .line 1114
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v8, v9

    .line 1115
    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v8, v13

    double-to-float v8, v8

    float-to-double v9, v10

    .line 1116
    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v9, v13

    double-to-float v9, v9

    mul-float v10, v11, v11

    mul-float v13, v12, v12

    add-float/2addr v10, v13

    float-to-double v13, v10

    .line 1119
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v10, v11

    .line 1120
    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v10, v13

    double-to-float v10, v10

    float-to-double v11, v12

    .line 1121
    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v11, v13

    double-to-float v11, v11

    move-object v12, p0

    .line 1124
    iget-object v13, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v0, v2

    iput v0, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1125
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v1, v3

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1126
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    const/high16 v1, 0x3fc00000    # 1.5f

    invoke-virtual {v0, v2, v3, v1}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(FFF)V

    .line 1128
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v4, v2

    iput v4, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1129
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v5, v3

    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1130
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v0, v2, v3, v1}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(FFF)V

    .line 1132
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v10, v8

    iput v10, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1133
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v11, v9

    iput v11, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1134
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v0, v8, v9, v1}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(FFF)V

    .line 1136
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v6, v8

    iput v6, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1137
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    add-float/2addr v7, v9

    iput v7, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1138
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v0, v8, v9, v1}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(FFF)V

    .line 1189
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 v1, 0x0

    aput v0, p13, v1

    .line 1190
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v1, 0x1

    aput v0, p13, v1

    .line 1192
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 v1, 0x2

    aput v0, p13, v1

    .line 1193
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v1, 0x3

    aput v0, p13, v1

    .line 1195
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float v0, v0

    const/4 v1, 0x4

    aput v0, p13, v1

    .line 1196
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    neg-float v0, v0

    const/4 v1, 0x5

    aput v0, p13, v1

    .line 1198
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float v0, v0

    const/4 v1, 0x6

    aput v0, p13, v1

    .line 1199
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    neg-float v0, v0

    const/4 v1, 0x7

    aput v0, p13, v1

    return-void
.end method

.method makeEdgeCorners(FFFFFFFF[F)V
    .locals 2

    .line 1029
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v1, p4, p2

    neg-float v1, v1

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1030
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v1, p3, p1

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1031
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 1033
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float p4, p8, p4

    neg-float p4, p4

    iput p4, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1034
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float p3, p7, p3

    iput p3, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1035
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p3}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 1037
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float p4, p6, p8

    neg-float p4, p4

    iput p4, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1038
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float p4, p5, p7

    iput p4, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1039
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p3}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 1041
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float/2addr p2, p6

    neg-float p2, p2

    iput p2, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1042
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float/2addr p1, p5

    iput p1, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1043
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 1045
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr p2, p3

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1046
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr p2, p3

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1048
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    const/high16 p3, 0x3fc00000    # 1.5f

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 1050
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr p2, p4

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1051
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr p2, p4

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1053
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 1055
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr p2, p4

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1056
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr p2, p4

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1058
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 1060
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr p2, p4

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1061
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget p4, p4, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr p2, p4

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1063
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 1066
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 p2, 0x0

    aput p1, p9, p2

    .line 1067
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 p2, 0x1

    aput p1, p9, p2

    .line 1069
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 p2, 0x2

    aput p1, p9, p2

    .line 1070
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 p2, 0x3

    aput p1, p9, p2

    .line 1072
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 p2, 0x4

    aput p1, p9, p2

    .line 1073
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 p2, 0x5

    aput p1, p9, p2

    .line 1075
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 p2, 0x6

    aput p1, p9, p2

    .line 1076
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 p2, 0x7

    aput p1, p9, p2

    return-void
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 1010
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const/4 v0, 0x0

    const-string v1, "mirror"

    .line 1011
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->mirror:Z

    const-string v1, "flipEveryOther"

    .line 1012
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->flipEveryOther:Z

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 3

    .line 1017
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 1018
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->mirror:Z

    const-string v1, "b"

    const-string v2, "mirror"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 1019
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->flipEveryOther:Z

    const-string v2, "flipEveryOther"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public setFlipEveryOther(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;
    .locals 0

    .line 70
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->flipEveryOther:Z

    return-object p0
.end method

.method public setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;
    .locals 0

    .line 65
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->mirror:Z

    return-object p0
.end method
