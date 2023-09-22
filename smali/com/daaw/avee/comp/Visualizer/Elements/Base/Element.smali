.class public abstract Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.super Ljava/lang/Object;
.source "Element.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element$ElementIdProvider;
    }
.end annotation


# static fields
.field public static DEFAULT_VERSION:Ljava/lang/String; = "10"

.field public static final anchorModes:[Ljava/lang/String;

.field private static highlightRender0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

.field private static highlighthPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;


# instance fields
.field private anchorX:I

.field private anchorY:I

.field private blendMode:I

.field private defaultBlendMode:I

.field protected defaultMeasurePosMeasure:Ljava/lang/String;

.field private defaultScaleX:F

.field private defaultScaleY:F

.field protected elementId:I

.field private glResourcesCreated:Z

.field private gradualLoadingIndex:I

.field highlightFrame:F

.field private localPosX:F

.field private localPosXIsUniform:Z

.field private localPosY:F

.field private measurePos:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

.field private measureRot:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

.field private measureScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

.field protected parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

.field private posX:F

.field private posXIsUniform:Z

.field private posY:F

.field private posYIsUniform:Z

.field protected rot:F

.field private scaleX:F

.field protected scaleXIsUniform:Z

.field private scaleY:F

# Element Description (for UI)
.field private elemDesc:Ljava/lang/String;

.field protected tagName:Ljava/lang/String;

.field protected visible:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "Na"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "Start"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "Center"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "End"

    aput-object v2, v0, v1

    .line 34
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorModes:[Ljava/lang/String;

    .line 51
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathGizmo;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathGizmo;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlighthPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    .line 52
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlightRender0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    return-void
.end method

.method public constructor <init>(IFF)V
    .locals 2

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Nothing"

    .line 57
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->defaultMeasurePosMeasure:Ljava/lang/String;

    const/4 v0, -0x1

    .line 59
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->elementId:I

    const-string v0, ""

    .line 60
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->tagName:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->elemDesc:Ljava/lang/String;

    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->glResourcesCreated:Z

    .line 64
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->blendMode:I

    .line 65
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->gradualLoadingIndex:I

    const/4 v1, 0x1

    .line 68
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->visible:Z

    .line 69
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->AsNothing()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureRot:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/4 v1, 0x0

    .line 70
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->rot:F

    .line 71
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->AsNothing()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measurePos:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    .line 73
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorX:I

    .line 74
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorY:I

    const/high16 v1, 0x3f000000    # 0.5f

    .line 75
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posX:F

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posY:F

    .line 76
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosX:F

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosY:F

    .line 77
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posYIsUniform:Z

    .line 78
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosXIsUniform:Z

    .line 79
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleX:F

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleY:F

    .line 80
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->AsNothing()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    .line 85
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 440
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlightFrame:F

    .line 89
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element$ElementIdProvider;->getNewId()I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->elementId:I

    .line 92
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->defaultBlendMode:I

    .line 93
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->defaultScaleX:F

    .line 94
    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->defaultScaleY:F

    return-void
.end method

.method protected static measureDrawRectVar(Lcom/daaw/avee/comp/Visualizer/Meter;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Landroid/graphics/RectF;
    .locals 5

    .line 307
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 308
    invoke-virtual {p1, p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    const/4 p1, 0x1

    const/high16 v1, 0x3f000000    # 0.5f

    .line 309
    invoke-virtual {p0, v1, p1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v2

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {p0, v3, p1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v3

    sub-float/2addr v2, v3

    .line 310
    invoke-virtual {p0, v1, p1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result v3

    iget v4, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {p0, v4, p1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result p1

    sub-float/2addr v3, p1

    .line 312
    invoke-virtual {p2, p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    .line 313
    iget p1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScaleX(FZ)F

    move-result p1

    .line 314
    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {p0, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScaleY(FZ)F

    move-result v0

    .line 316
    invoke-virtual {p0, v1, p2, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceX(FZFF)F

    move-result v4

    sub-float/2addr v2, v4

    .line 317
    invoke-virtual {p0, v1, p2, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceY(FZFF)F

    move-result p0

    sub-float/2addr v3, p0

    .line 319
    new-instance p0, Landroid/graphics/RectF;

    add-float/2addr p1, v2

    add-float/2addr v0, v3

    invoke-direct {p0, v2, v3, p1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p0
.end method

.method protected static rotateAround(Landroid/graphics/PointF;FFLandroid/graphics/PointF;F)V
    .locals 8

    float-to-double v0, p1

    .line 639
    iget v2, p3, Landroid/graphics/PointF;->x:F

    sub-float/2addr v2, p1

    float-to-double v2, v2

    float-to-double v4, p4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v6

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v0, v2

    iget p4, p3, Landroid/graphics/PointF;->y:F

    sub-float/2addr p4, p2

    float-to-double v2, p4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v6

    sub-double/2addr v0, v2

    double-to-float p4, v0

    iput p4, p0, Landroid/graphics/PointF;->x:F

    float-to-double v0, p2

    .line 640
    iget p4, p3, Landroid/graphics/PointF;->x:F

    sub-float/2addr p4, p1

    float-to-double v2, p4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v6

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v0, v2

    iget p1, p3, Landroid/graphics/PointF;->y:F

    sub-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide p3

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, p3

    add-double/2addr v0, p1

    double-to-float p1, v0

    iput p1, p0, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method protected static rotateAroundZero(Landroid/graphics/PointF;Landroid/graphics/PointF;F)V
    .locals 8

    .line 645
    iget v0, p1, Landroid/graphics/PointF;->x:F

    float-to-double v0, v0

    float-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v4

    iget p2, p1, Landroid/graphics/PointF;->y:F

    float-to-double v4, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v6

    sub-double/2addr v0, v4

    double-to-float p2, v0

    iput p2, p0, Landroid/graphics/PointF;->x:F

    .line 646
    iget p2, p1, Landroid/graphics/PointF;->x:F

    float-to-double v0, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v4

    iget p1, p1, Landroid/graphics/PointF;->y:F

    float-to-double p1, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, v2

    add-double/2addr v0, p1

    double-to-float p1, v0

    iput p1, p0, Landroid/graphics/PointF;->y:F

    return-void
.end method


# virtual methods
.method protected createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V
    .locals 7

    const/high16 v6, -0x3ee00000    # -10.0f

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 651
    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFFF)V

    return-void
.end method

.method protected createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFFF)V
    .locals 3

    .line 657
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat2Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 659
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->setIdentity()V

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float p5, p5, v1

    .line 660
    invoke-virtual {v0, p5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->rotateZDeg(F)V

    .line 662
    iget-object p5, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->setIdentity()V

    .line 663
    iget-object p5, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    neg-float v1, p3

    neg-float v2, p4

    invoke-virtual {p5, v1, v2, p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->translate(FFF)V

    .line 665
    iget-object p5, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat3Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    iget-object p6, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p5, v0, p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->multiply(Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;)V

    .line 667
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->setIdentity()V

    const/4 p5, 0x0

    .line 668
    invoke-virtual {v0, p3, p4, p5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->translate(FFF)V

    .line 670
    iget-object p3, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    iget-object p4, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat3Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p3, v0, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->multiply(Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;)V

    .line 672
    iget-object p3, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->createViewProjMatrix(Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;)V

    return-void
.end method

.method protected createRotationMatPure(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFFF)V
    .locals 3

    .line 679
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat2Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 681
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->setIdentity()V

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float p5, p5, v1

    .line 682
    invoke-virtual {v0, p5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->rotateZDeg(F)V

    .line 684
    iget-object p5, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->setIdentity()V

    .line 685
    iget-object p5, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    neg-float v1, p3

    neg-float v2, p4

    invoke-virtual {p5, v1, v2, p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->translate(FFF)V

    .line 687
    iget-object p5, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat3Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    iget-object p6, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat4Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p5, v0, p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->multiply(Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;)V

    .line 689
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->setIdentity()V

    const/4 p5, 0x0

    .line 690
    invoke-virtual {v0, p3, p4, p5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->translate(FFF)V

    .line 692
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->setIdentity()V

    .line 693
    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->viewMat3Tmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p2, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->multiply(Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    .line 104
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->invokeDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public findElementById(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
    .locals 1

    .line 115
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->elementId:I

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getBlendMode()I
    .locals 1

    .line 132
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->blendMode:I

    return v0
.end method

.method public getCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ILcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 516
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->getElementTypeName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putChildTypeValue(Ljava/lang/String;)V

    .line 517
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->getElementVersion()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setVersionId(Ljava/lang/String;)V

    .line 519
    invoke-virtual {p0, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    const/4 p1, 0x1

    return p1
.end method

.method public abstract getElementTypeName()Ljava/lang/String;
.end method

.method public getElementVersion()Ljava/lang/String;
    .locals 1

    .line 111
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->DEFAULT_VERSION:Ljava/lang/String;

    return-object v0
.end method

.method public invokeDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 377
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 379
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method

.method protected isLocalPosXZero()Z
    .locals 2

    .line 233
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosX:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    const/4 v0, 0x0

    .line 364
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->glResourcesCreated:Z

    .line 366
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->gradualLoadingIndex:I

    return-void
.end method

.method protected markNeedReCreateGLResourcesDontOverride()V
    .locals 1

    const/4 v0, 0x0

    .line 370
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->glResourcesCreated:Z

    .line 372
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->gradualLoadingIndex:I

    return-void
.end method

.method measureDrawMaxNoMeasures(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;
    .locals 6

    .line 323
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measurePos:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    .line 324
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posX:F

    iget-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posXIsUniform:Z

    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v1

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v2

    add-float/2addr v1, v2

    .line 325
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posY:F

    iget-boolean v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posYIsUniform:Z

    invoke-virtual {p1, v2, v4}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result v2

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {p1, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result v0

    add-float/2addr v2, v0

    .line 327
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 328
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleX:F

    iget v4, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v3, v4

    iget-boolean v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScaleX(FZ)F

    move-result v3

    .line 329
    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleY:F

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v4, v0

    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    invoke-virtual {p1, v4, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScaleY(FZ)F

    move-result v0

    .line 331
    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosX:F

    iget-boolean v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosXIsUniform:Z

    invoke-virtual {p1, v4, v5, v3, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceX(FZFF)F

    move-result v4

    sub-float/2addr v1, v4

    .line 332
    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosY:F

    iget-boolean v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosXIsUniform:Z

    invoke-virtual {p1, v4, v5, v3, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceY(FZFF)F

    move-result p1

    sub-float/2addr v2, p1

    .line 334
    new-instance p1, Landroid/graphics/RectF;

    add-float/2addr v3, v1

    add-float/2addr v0, v2

    invoke-direct {p1, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1
.end method

.method protected measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;
    .locals 7

    .line 242
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measurePos:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    .line 243
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorX:I

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceAnchorX(I)F

    move-result v1

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posX:F

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorX:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    iget-boolean v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posXIsUniform:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-virtual {p1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {p1, v2, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v2

    add-float/2addr v1, v2

    .line 244
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorY:I

    invoke-virtual {p1, v2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceAnchorY(I)F

    move-result v2

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posY:F

    iget v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorY:I

    if-nez v6, :cond_3

    iget-boolean v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posYIsUniform:Z

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v6, 0x1

    :goto_3
    invoke-virtual {p1, v3, v6}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result v3

    add-float/2addr v2, v3

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {p1, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result v0

    add-float/2addr v2, v0

    .line 246
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    .line 247
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleX:F

    iget v5, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v3, v5

    iget-boolean v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    invoke-virtual {p1, v3, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScaleX(FZ)F

    move-result v3

    .line 248
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleY:F

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v5, v0

    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    invoke-virtual {p1, v5, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScaleY(FZ)F

    move-result v0

    .line 250
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosX:F

    invoke-virtual {p1, v5, v4, v3, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceX(FZFF)F

    move-result v5

    sub-float/2addr v1, v5

    .line 251
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosY:F

    invoke-virtual {p1, v5, v4, v3, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceY(FZFF)F

    move-result p1

    sub-float/2addr v2, p1

    .line 253
    new-instance p1, Landroid/graphics/RectF;

    add-float/2addr v3, v1

    add-float/2addr v0, v2

    invoke-direct {p1, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1
.end method

.method protected measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;Lcom/daaw/avee/Common/Vec2i;)Landroid/graphics/RectF;
    .locals 7

    .line 289
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measurePos:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    .line 290
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorX:I

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceAnchorX(I)F

    move-result v1

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posX:F

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorX:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    iget-boolean v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posXIsUniform:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-virtual {p1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {p1, v2, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v2

    add-float/2addr v1, v2

    .line 291
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorY:I

    invoke-virtual {p1, v2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceAnchorY(I)F

    move-result v2

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posY:F

    iget v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorY:I

    if-nez v6, :cond_2

    iget-boolean v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posYIsUniform:Z

    if-eqz v6, :cond_3

    :cond_2
    const/4 v4, 0x1

    :cond_3
    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result v3

    add-float/2addr v2, v3

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {p1, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result v0

    add-float/2addr v2, v0

    .line 293
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;

    .line 296
    iget v0, p2, Lcom/daaw/avee/Common/Vec2i;->x:I

    int-to-float v0, v0

    .line 297
    iget p2, p2, Lcom/daaw/avee/Common/Vec2i;->y:I

    int-to-float p2, p2

    .line 299
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosX:F

    iget-boolean v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosXIsUniform:Z

    invoke-virtual {p1, v3, v4, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceX(FZFF)F

    move-result v3

    sub-float/2addr v1, v3

    .line 300
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosY:F

    iget-boolean v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosXIsUniform:Z

    invoke-virtual {p1, v3, v4, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceY(FZFF)F

    move-result p1

    sub-float/2addr v2, p1

    .line 302
    new-instance p1, Landroid/graphics/RectF;

    add-float/2addr v0, v1

    add-float/2addr p2, v2

    invoke-direct {p1, v1, v2, v0, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1
.end method

.method protected measureDrawRectCenterLocalPos(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;
    .locals 7

    .line 274
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measurePos:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    .line 275
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorX:I

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceAnchorX(I)F

    move-result v1

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posX:F

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorX:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    iget-boolean v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posXIsUniform:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-virtual {p1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {p1, v2, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceX(FZ)F

    move-result v2

    add-float/2addr v1, v2

    .line 276
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorY:I

    invoke-virtual {p1, v2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceAnchorY(I)F

    move-result v2

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posY:F

    iget v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorY:I

    if-nez v6, :cond_3

    iget-boolean v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posYIsUniform:Z

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v6, 0x1

    :goto_3
    invoke-virtual {p1, v3, v6}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result v3

    add-float/2addr v2, v3

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {p1, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenSpaceY(FZ)F

    move-result v0

    add-float/2addr v2, v0

    .line 278
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    .line 279
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleX:F

    iget v5, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v3, v5

    iget-boolean v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    invoke-virtual {p1, v3, v5}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScaleX(FZ)F

    move-result v3

    .line 280
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleY:F

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v5, v0

    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    invoke-virtual {p1, v5, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScaleY(FZ)F

    move-result v0

    const/high16 v5, 0x3f000000    # 0.5f

    .line 282
    invoke-virtual {p1, v5, v4, v3, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceX(FZFF)F

    move-result v6

    sub-float/2addr v1, v6

    .line 283
    invoke-virtual {p1, v5, v4, v3, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureLocalSpaceY(FZFF)F

    move-result p1

    sub-float/2addr v2, p1

    .line 285
    new-instance p1, Landroid/graphics/RectF;

    add-float/2addr v3, v1

    add-float/2addr v0, v2

    invoke-direct {p1, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1
.end method

.method protected measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;
    .locals 0

    .line 258
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object p1

    return-object p1
.end method

.method protected measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureRot:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result p1

    .line 238
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->rot:F

    add-float/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    rem-float/2addr v0, p1

    return v0
.end method

.method protected measureDrawScale1d(Lcom/daaw/avee/comp/Visualizer/Meter;)F
    .locals 2

    .line 351
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    .line 352
    iget v0, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleX:F

    add-float/2addr v0, v1

    .line 353
    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleY:F

    add-float/2addr p1, v1

    .line 355
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 5

    .line 548
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTagName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->tagName:Ljava/lang/String;

    # this.elemDesc = customPropertiesList.getPropertyString("elementDescription", this.elemDesc);
    
    .line 549

    const-string v0, "elementDescription"

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->elemDesc:Ljava/lang/String;
    
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->elemDesc:Ljava/lang/String;

    const-string v0, "visible"

    const/4 v1, 0x1

    .line 549
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->setVisible(Z)V

    const-string v0, "blendMode"

    .line 550
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->defaultBlendMode:I

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->getTypeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 551
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->defaultBlendMode:I

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->create(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->setBlendMode(I)V

    .line 553
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v2, "position"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->setPosition(Lcom/daaw/avee/Common/Vec2f;)V

    .line 554
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/AnchorMode;->modes:[Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "anchorX"

    invoke-virtual {p1, v3, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertySelectStringIndex(Ljava/lang/String;[Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorX:I

    .line 555
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/AnchorMode;->modes:[Ljava/lang/String;

    const-string v3, "anchorY"

    invoke-virtual {p1, v3, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertySelectStringIndex(Ljava/lang/String;[Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorY:I

    const-string v0, "MeasurePos"

    .line 560
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 561
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measurePos:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->defaultMeasurePosMeasure:Ljava/lang/String;

    invoke-virtual {v3, v0, v4, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FF)V

    .line 564
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v3, "alignmentPosition"

    invoke-virtual {p1, v3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->setLocalPosition(Lcom/daaw/avee/Common/Vec2f;)V

    const-string v0, "scaleIsUniform"

    .line 565
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->setScaleUniform(Z)V

    .line 569
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->defaultScaleX:F

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->defaultScaleY:F

    invoke-direct {v0, v2, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v2, "scale"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->setScale(Lcom/daaw/avee/Common/Vec2f;)V

    const-string v0, "measureScale"

    .line 572
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    .line 573
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v2, "Nothing"

    invoke-virtual {v0, p1, v2, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FF)V

    return-void
.end method

.method protected onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 3

    const-string v0, "rotation"

    const/4 v1, 0x0

    .line 610
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    const/high16 v1, 0x43b40000    # 360.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->setRot(F)V

    const-string v0, "measureRot"

    .line 612
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    .line 613
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureRot:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v1, 0x3f000000    # 0.5f

    const-string v2, "Nothing"

    invoke-virtual {v0, p1, v2, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FF)V

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 0

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 0

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 10

    .line 580
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->elementId:I

    const-string v0, ""

    const-string v1, "_id"

    invoke-virtual {p1, v1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsHidden(Ljava/lang/String;ILjava/lang/String;)V

    .line 581
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->tagName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setTagName(Ljava/lang/String;)V


    # customPropertiesList.putPropertyStringAsTxtPr("elementDescription", this.elemDesc, "0_general");

    const-string v0, "elementDescription"

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->elemDesc:Ljava/lang/String;

    const-string v2, "0_general"

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsTxtPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V


    .line 582
    iget-boolean p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->visible:Z

    const-string v1, "0_general"

    const-string v2, "visible"

    invoke-virtual {p1, v2, p2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 583
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->blendMode:I

    invoke-static {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->getTypeName(I)Ljava/lang/String;

    move-result-object p2

    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->useableModes:[Ljava/lang/String;

    const-string v3, "blendMode"

    invoke-virtual {p1, v3, p2, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 584
    new-instance v6, Lcom/daaw/avee/Common/Vec2f;

    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posX:F

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posY:F

    invoke-direct {v6, p2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v5, "position"

    const-string v7, "0_general"

    const/high16 v8, -0x40800000    # -1.0f

    const/high16 v9, 0x3f800000    # 1.0f

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 586
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorX:I

    const/4 v2, 0x0

    invoke-static {p2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/AnchorMode;->getTypeName(II)Ljava/lang/String;

    move-result-object p2

    sget-object v3, Lcom/daaw/avee/comp/Visualizer/Elements/Base/AnchorMode;->modes:[Ljava/lang/String;

    const-string v4, "anchorX"

    invoke-virtual {p1, v4, p2, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putSelectString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 587
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->anchorY:I

    invoke-static {p2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/AnchorMode;->getTypeName(II)Ljava/lang/String;

    move-result-object p2

    sget-object v3, Lcom/daaw/avee/comp/Visualizer/Elements/Base/AnchorMode;->modes:[Ljava/lang/String;

    const-string v4, "anchorY"

    invoke-virtual {p1, v4, p2, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putSelectString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    new-array p2, v2, [Ljava/lang/String;

    const-string v3, "MeasurePos"

    .line 591
    invoke-virtual {p1, v3, v0, v1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p2

    .line 592
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measurePos:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v3, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onReadCustomizationPos(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 595
    new-instance v6, Lcom/daaw/avee/Common/Vec2f;

    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosX:F

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosY:F

    invoke-direct {v6, p2, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v5, "alignmentPosition"

    const-string v7, "0_general"

    const/4 v8, 0x0

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 596
    iget-boolean p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    const-string v3, "scaleIsUniform"

    invoke-virtual {p1, v3, p2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 600
    new-instance v6, Lcom/daaw/avee/Common/Vec2f;

    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleX:F

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleY:F

    invoke-direct {v6, p2, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v5, "scale"

    const-string v7, "0_general"

    const/high16 v9, 0x40000000    # 2.0f

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    new-array p2, v2, [Ljava/lang/String;

    const-string v2, "measureScale"

    .line 603
    invoke-virtual {p1, v2, v0, v1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    .line 604
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onReadCustomizationScale(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method

.method protected onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 8

    .line 621
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->rot:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v4, v0, v1

    const-string v3, "rotation"

    const-string v5, "0_general"

    const/4 v6, 0x0

    const/high16 v7, 0x43960000    # 300.0f

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "measureRot"

    const-string v2, ""

    const-string v3, "0_general"

    .line 623
    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    .line 624
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureRot:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onReadCustomization1D(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 0

    .line 419
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 421
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 422
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->blendMode:I

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setBlendMode(I)V

    return-void
.end method

.method protected onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 2

    .line 391
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->glResourcesCreated:Z

    if-nez v0, :cond_0

    .line 392
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    .line 393
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->addStatResourceLoad()V

    :cond_0
    const/4 v0, 0x1

    .line 395
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->glResourcesCreated:Z

    .line 405
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->gradualLoadingIndex:I

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->addStatGradualResourceLoad()V

    .line 406
    :cond_1
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->gradualLoadingIndex:I

    invoke-virtual {p0, p1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    .line 407
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->gradualLoadingIndex:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->gradualLoadingIndex:I

    return-void
.end method

.method public onRenderHighlight(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 10

    .line 451
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlightFrame:F

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v0, v1

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    return-void

    .line 462
    :cond_0
    iget-object v2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v2, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v5

    .line 463
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlightFrame:F

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameTimeF()F

    move-result v3

    add-float/2addr v2, v3

    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlightFrame:F

    sub-float/2addr v1, v0

    .line 474
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlightRender0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-static {v1, v1, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColor(FFFF)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    const/4 v4, 0x0

    const/16 v6, 0x8

    const/high16 v7, 0x40200000    # 2.5f

    .line 475
    sget-object v8, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlightRender0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    sget-object v9, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlighthPath:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->renderPath2(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;ILandroid/graphics/RectF;IFLcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    return-void
.end method

.method public onRenderInvisible(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 0

    .line 427
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 415
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public onRenderPreview(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 0

    .line 431
    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 432
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->blendMode:I

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->setBlendMode(I)V

    return-void
.end method

.method public setBlendMode(I)V
    .locals 0

    .line 128
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->blendMode:I

    return-void
.end method

.method public setCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;I)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 540
    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const/4 p1, 0x1

    return p1
.end method

.method public setLocalPosition(FF)V
    .locals 0

    .line 166
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosX:F

    .line 167
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosY:F

    return-void
.end method

.method public setLocalPosition(Lcom/daaw/avee/Common/Vec2f;)V
    .locals 1

    .line 160
    iget v0, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosX:F

    .line 161
    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosY:F

    return-void
.end method

.method public setLocalPositionUniform(Z)V
    .locals 0

    .line 189
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosXIsUniform:Z

    return-void
.end method

.method public setLocalPositionUniform(ZZ)V
    .locals 0

    .line 183
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->localPosXIsUniform:Z

    return-void
.end method

.method public setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measurePos:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    return-void
.end method

.method public setMeasureRot(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V
    .locals 0

    .line 634
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureRot:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    return-void
.end method

.method public setPosition(FF)V
    .locals 0

    .line 155
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posX:F

    .line 156
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posY:F

    return-void
.end method

.method public setPosition(Lcom/daaw/avee/Common/Vec2f;)V
    .locals 1

    .line 145
    iget v0, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posX:F

    .line 146
    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posY:F

    return-void
.end method

.method public setPositionUniform(Z)V
    .locals 0

    .line 177
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posXIsUniform:Z

    .line 178
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posYIsUniform:Z

    return-void
.end method

.method public setPositionUniform(ZZ)V
    .locals 0

    .line 172
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posXIsUniform:Z

    .line 173
    iput-boolean p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->posYIsUniform:Z

    return-void
.end method

.method public setRot(F)V
    .locals 0

    .line 630
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->rot:F

    return-void
.end method

.method public setScale(FF)V
    .locals 0

    .line 198
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleX:F

    .line 199
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleY:F

    return-void
.end method

.method public setScale(Lcom/daaw/avee/Common/Vec2f;)V
    .locals 1

    .line 193
    iget v0, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleX:F

    .line 194
    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleY:F

    return-void
.end method

.method public setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->measureScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    return-void
.end method

.method public setScaleUniform(Z)V
    .locals 0

    .line 228
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    return-void
.end method

.method public setScaleUniform(ZZ)V
    .locals 0

    .line 223
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->scaleXIsUniform:Z

    return-void
.end method

.method public setTrigger(I)V
    .locals 0

    .line 120
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->triggerHighlight()V

    return-void
.end method

.method public setVisible(Z)V
    .locals 0

    .line 124
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->visible:Z

    return-void
.end method

.method protected shouldRender()Z
    .locals 1

    .line 141
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->visible:Z

    return v0
.end method

.method public triggerHighlight()V
    .locals 1

    const/4 v0, 0x0

    .line 445
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->highlightFrame:F

    return-void
.end method

.method public updateRenderStates(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 0

    .line 436
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 437
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->blendMode:I

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setBlendMode(I)V

    return-void
.end method
