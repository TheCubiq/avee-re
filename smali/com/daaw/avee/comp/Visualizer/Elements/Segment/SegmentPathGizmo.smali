.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathGizmo;
.super Ljava/lang/Object;
.source "SegmentPathGizmo.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;


# static fields
.field public static final typeName:Ljava/lang/String; = "Gizmo"


# instance fields
.field angleAculumator:F

.field point0:Landroid/graphics/PointF;

.field point1:Landroid/graphics/PointF;

.field radius:F

.field sideInAngle:F

.field sides:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathGizmo;->radius:F

    const/4 v0, 0x3

    .line 18
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathGizmo;->sides:I

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathGizmo;->angleAculumator:F

    .line 24
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathGizmo;->point0:Landroid/graphics/PointF;

    .line 25
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathGizmo;->point1:Landroid/graphics/PointF;

    return-void
.end method


# virtual methods
.method public getPathLength(Landroid/graphics/RectF;I)F
    .locals 0

    .line 234
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    add-float/2addr p2, p1

    const/high16 p1, 0x40000000    # 2.0f

    mul-float p2, p2, p1

    return p2
.end method

.method public getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 0

    const/4 p1, -0x1

    const/high16 p3, -0x40800000    # -1.0f

    const/high16 p5, 0x3f800000    # 1.0f

    packed-switch p2, :pswitch_data_0

    return p1

    .line 111
    :pswitch_0
    iget p1, p4, Landroid/graphics/RectF;->left:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    .line 112
    iget p1, p4, Landroid/graphics/RectF;->bottom:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    .line 113
    iput p3, p7, Landroid/graphics/PointF;->x:F

    .line 114
    iput p5, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x6

    return p1

    .line 104
    :pswitch_1
    iget p1, p4, Landroid/graphics/RectF;->right:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    .line 105
    iget p1, p4, Landroid/graphics/RectF;->bottom:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    .line 106
    iput p5, p7, Landroid/graphics/PointF;->x:F

    .line 107
    iput p5, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x5

    return p1

    .line 97
    :pswitch_2
    iget p1, p4, Landroid/graphics/RectF;->right:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    .line 98
    iget p1, p4, Landroid/graphics/RectF;->top:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    .line 99
    iput p5, p7, Landroid/graphics/PointF;->x:F

    .line 100
    iput p3, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x4

    return p1

    .line 90
    :pswitch_3
    iget p1, p4, Landroid/graphics/RectF;->left:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    .line 91
    iget p1, p4, Landroid/graphics/RectF;->top:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    .line 92
    iput p3, p7, Landroid/graphics/PointF;->x:F

    .line 93
    iput p3, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x7

    return p1

    .line 82
    :pswitch_4
    iget p1, p4, Landroid/graphics/RectF;->left:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    .line 83
    iget p1, p4, Landroid/graphics/RectF;->bottom:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    .line 84
    iput p5, p7, Landroid/graphics/PointF;->x:F

    .line 85
    iput p5, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x2

    return p1

    .line 75
    :pswitch_5
    iget p2, p4, Landroid/graphics/RectF;->right:F

    iput p2, p6, Landroid/graphics/PointF;->x:F

    .line 76
    iget p2, p4, Landroid/graphics/RectF;->top:F

    iput p2, p6, Landroid/graphics/PointF;->y:F

    .line 77
    iput p5, p7, Landroid/graphics/PointF;->x:F

    .line 78
    iput p5, p7, Landroid/graphics/PointF;->y:F

    return p1

    .line 68
    :pswitch_6
    iget p1, p4, Landroid/graphics/RectF;->right:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    .line 69
    iget p1, p4, Landroid/graphics/RectF;->bottom:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    .line 70
    iput p5, p7, Landroid/graphics/PointF;->x:F

    .line 71
    iput p3, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x0

    return p1

    .line 61
    :pswitch_7
    iget p2, p4, Landroid/graphics/RectF;->left:F

    iput p2, p6, Landroid/graphics/PointF;->x:F

    .line 62
    iget p2, p4, Landroid/graphics/RectF;->top:F

    iput p2, p6, Landroid/graphics/PointF;->y:F

    .line 63
    iput p5, p7, Landroid/graphics/PointF;->x:F

    .line 64
    iput p3, p7, Landroid/graphics/PointF;->y:F

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .locals 0

    return-void
.end method
