.class public abstract Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
.super Ljava/lang/Object;
.source "SegmentRendererBase.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;


# instance fields
.field barColorHsla:[F

.field protected barHeightMultiplier:F

.field protected fixedLineHeight:F

.field private hslaColorFrom:[F

.field private hslaColorMiddle:[F

.field tmpNormalIndex:F

.field protected useFixedLineHeight:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [F

    .line 15
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    new-array v1, v0, [F

    .line 16
    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorFrom:[F

    new-array v0, v0, [F

    .line 17
    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorMiddle:[F

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->useFixedLineHeight:Z

    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->fixedLineHeight:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 20
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barHeightMultiplier:F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method protected getBarColorBase(F)I
    .locals 5

    const/high16 v0, 0x40000000    # 2.0f

    const/high16 v1, 0x3f000000    # 0.5f

    cmpg-float v2, p1, v1

    if-gtz v2, :cond_0

    .line 105
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorFrom:[F

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorMiddle:[F

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    mul-float p1, p1, v0

    invoke-static {v1, v2, v3, p1}, Lcom/daaw/avee/Common/Utils;->lerpHsla([F[F[FF)V

    goto :goto_0

    .line 107
    :cond_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorMiddle:[F

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorFrom:[F

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    sub-float/2addr p1, v1

    mul-float p1, p1, v0

    invoke-static {v2, v3, v4, p1}, Lcom/daaw/avee/Common/Utils;->lerpHsla([F[F[FF)V

    .line 109
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa360ColorToInt([F)I

    move-result p1

    return p1
.end method

.method protected getBarColorBase(IIF)I
    .locals 3

    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    .line 81
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->tmpNormalIndex:F

    const/high16 p2, 0x41200000    # 10.0f

    sub-float/2addr p2, p3

    add-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    rem-float/2addr p1, p2

    .line 82
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->tmpNormalIndex:F

    const/high16 p2, 0x40000000    # 2.0f

    const/high16 p3, 0x3f000000    # 0.5f

    cmpg-float v0, p1, p3

    if-gtz v0, :cond_0

    .line 85
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorFrom:[F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorMiddle:[F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    mul-float p1, p1, p2

    invoke-static {p3, v0, v1, p1}, Lcom/daaw/avee/Common/Utils;->lerpHsla([F[F[FF)V

    goto :goto_0

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorMiddle:[F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorFrom:[F

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    sub-float/2addr p1, p3

    mul-float p1, p1, p2

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/avee/Common/Utils;->lerpHsla([F[F[FF)V

    .line 89
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa360ColorToInt([F)I

    move-result p1

    return p1
.end method

.method protected getBarColorBase([FII)V
    .locals 4

    int-to-float p2, p2

    int-to-float p3, p3

    div-float/2addr p2, p3

    .line 92
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->tmpNormalIndex:F

    const/high16 p3, 0x40000000    # 2.0f

    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float v1, p2, v0

    if-gtz v1, :cond_0

    .line 95
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorFrom:[F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorMiddle:[F

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    mul-float p2, p2, p3

    invoke-static {v0, v1, v2, p2}, Lcom/daaw/avee/Common/Utils;->lerpHsla([F[F[FF)V

    goto :goto_0

    .line 97
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorMiddle:[F

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorFrom:[F

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    sub-float/2addr p2, v0

    mul-float p2, p2, p3

    invoke-static {v1, v2, v3, p2}, Lcom/daaw/avee/Common/Utils;->lerpHsla([F[F[FF)V

    .line 99
    :goto_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barColorHsla:[F

    invoke-static {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa360ColorToF4Color([F[F)V

    return-void
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 3

    const/4 v0, -0x1

    const-string v1, "colorFrom"

    .line 58
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "colorTo"

    .line 59
    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v2

    .line 58
    invoke-virtual {p0, v1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    const-string v0, "fixedHeight"

    const/4 v1, 0x0

    .line 61
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    const-string v0, "barHeightMultiplier"

    const/high16 v1, 0x3f800000    # 1.0f

    .line 63
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barHeightMultiplier:F

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 70
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorFrom:[F

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa360ColorToInt([F)I

    move-result v0

    const-string v1, "misc"

    const-string v2, "colorFrom"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 71
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorMiddle:[F

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa360ColorToInt([F)I

    move-result v0

    const-string v2, "colorTo"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 73
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->fixedLineHeight:F

    const-string v1, "fixedHeight"

    const-string v3, "misc"

    const/high16 v4, -0x3db80000    # -50.0f

    const/high16 v5, 0x42480000    # 50.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 74
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barHeightMultiplier:F

    const-string v1, "barHeightMultiplier"

    const-string v3, "misc"

    const/high16 v4, -0x40000000    # -2.0f

    const/high16 v5, 0x40000000    # 2.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
    .locals 0

    .line 50
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->barHeightMultiplier:F

    return-object p0
.end method

.method public setColor(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
    .locals 0

    .line 27
    invoke-virtual {p0, p1, p1, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object p1

    return-object p1
.end method

.method public setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
    .locals 0

    .line 31
    invoke-virtual {p0, p1, p2, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object p1

    return-object p1
.end method

.method public setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
    .locals 0

    .line 35
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorFrom:[F

    invoke-static {p3, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa360([FI)V

    .line 36
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->hslaColorMiddle:[F

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa360([FI)V

    return-object p0
.end method

.method public setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;
    .locals 2

    .line 43
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->useFixedLineHeight:Z

    .line 44
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->fixedLineHeight:F

    return-object p0
.end method
