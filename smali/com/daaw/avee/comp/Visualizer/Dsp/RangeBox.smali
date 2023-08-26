.class public Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;
.super Ljava/lang/Object;
.source "RangeBox.java"


# instance fields
.field private maxVal:F

.field private maxValModeMax:F

.field private modeMaxFactor:F

.field private val:F

.field private valModeMax:F

.field private x0:F

.field private x0i:I

.field private x1:F

.field private x1i:I

.field private y0:F

.field private y1:F


# direct methods
.method public constructor <init>(F)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    .line 13
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->modeMaxFactor:F

    .line 27
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->modeMaxFactor:F

    const/4 p1, 0x0

    .line 28
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x1:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x0:F

    .line 29
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y1:F

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y0:F

    const/16 v0, 0x64

    .line 30
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->reset(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 31
    invoke-virtual {p0, p1, v0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->setCorners(FFFF)V

    return-void
.end method


# virtual methods
.method public addValue(IF)V
    .locals 2

    .line 112
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x0i:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x1i:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x0

    .line 114
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y0:F

    sub-float/2addr p2, v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y1:F

    sub-float/2addr v1, v0

    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 117
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->val:F

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->valModeMax:F

    .line 119
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->val:F

    add-float/2addr p2, p1

    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->val:F

    :cond_0
    return-void
.end method

.method public getValueNormal()F
    .locals 4

    .line 127
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->val:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->maxVal:F

    div-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->modeMaxFactor:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, v1

    mul-float v0, v0, v2

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->valModeMax:F

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->maxValModeMax:F

    div-float/2addr v2, v3

    mul-float v2, v2, v1

    add-float/2addr v0, v2

    return v0
.end method

.method public getX0()F
    .locals 1

    .line 36
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x0:F

    return v0
.end method

.method public getX1()F
    .locals 1

    .line 41
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x1:F

    return v0
.end method

.method public getY0()F
    .locals 1

    .line 46
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y0:F

    return v0
.end method

.method public getY1()F
    .locals 1

    .line 51
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y1:F

    return v0
.end method

.method public reset(I)V
    .locals 3

    const/4 v0, 0x0

    .line 67
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->val:F

    int-to-float p1, p1

    .line 68
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x0:F

    mul-float v0, v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x0i:I

    .line 69
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x1:F

    mul-float p1, p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x1i:I

    .line 71
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y1:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y0:F

    sub-float v2, v0, v1

    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->maxValModeMax:F

    sub-float/2addr v0, v1

    .line 73
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x0i:I

    sub-int/2addr p1, v1

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    mul-float v0, v0, p1

    const p1, 0x38d1b717    # 1.0E-4f

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->maxVal:F

    return-void
.end method

.method public setCorners(FFFF)V
    .locals 1

    .line 56
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x0:F

    .line 57
    invoke-static {p3, p4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y0:F

    const v0, 0x3c23d70a    # 0.01f

    add-float/2addr p1, v0

    .line 58
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x1:F

    const/high16 p1, 0x3f800000    # 1.0f

    add-float/2addr p3, p1

    .line 59
    invoke-static {p3, p4}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->y1:F

    const/4 p1, 0x0

    .line 60
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x0i:I

    .line 61
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->x1i:I

    const p1, 0x38d1b717    # 1.0E-4f

    .line 62
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->maxVal:F

    return-void
.end method
