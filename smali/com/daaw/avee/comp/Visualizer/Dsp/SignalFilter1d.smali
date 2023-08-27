.class public Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;
.super Ljava/lang/Object;
.source "SignalFilter1d.java"


# instance fields
.field private radius:I

.field private softnessDivider:F

.field private softnessIndexes:[I

.field private softnessWeight:[F

.field private strength:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [I

    .line 13
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    new-array v0, v0, [F

    .line 14
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    return-void
.end method


# virtual methods
.method public createHighPass(IF)Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;
    .locals 5

    .line 120
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->strength:F

    .line 121
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->radius:I

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge p1, v2, :cond_0

    new-array p1, v2, [I

    aput v1, p1, v1

    .line 125
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    new-array p1, v2, [F

    aput v0, p1, v1

    .line 126
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    .line 127
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    return-object p0

    :cond_0
    add-int/lit8 v3, p1, 0x1

    add-int/2addr v3, p1

    .line 131
    new-array v3, v3, [I

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    .line 132
    array-length v3, v3

    new-array v3, v3, [F

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    const/4 v3, 0x0

    .line 133
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    .line 135
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    array-length v4, v3

    if-ge v1, v4, :cond_1

    sub-int v4, v1, p1

    .line 137
    aput v4, v3, v1

    .line 138
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    neg-float v4, p2

    aput v4, v3, v1

    .line 139
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    add-float/2addr v3, p2

    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 142
    :cond_1
    array-length p2, v3

    sub-int/2addr p2, v2

    int-to-float p2, p2

    mul-float p2, p2, v0

    .line 143
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    aput p2, v0, p1

    .line 144
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    add-float/2addr p1, p2

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    return-object p0
.end method

.method public getRadius()I
    .locals 3

    .line 27
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    if-eqz v0, :cond_1

    array-length v1, v0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    div-int/2addr v0, v2

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public getSofted(ILcom/daaw/avee/Common/ISimpleListDouble;)D
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 60
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 61
    aget v2, v2, v1

    add-int/2addr v2, p1

    invoke-interface {p2}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0x64

    add-int/2addr v2, v3

    invoke-interface {p2}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result v3

    rem-int/2addr v2, v3

    float-to-double v3, v0

    .line 62
    invoke-interface {p2, v2}, Lcom/daaw/avee/Common/ISimpleListDouble;->get(I)D

    move-result-wide v5

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    aget v0, v0, v1

    float-to-double v7, v0

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v5

    double-to-float v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 65
    :cond_0
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    div-float/2addr v0, p1

    float-to-double p1, v0

    return-wide p1
.end method

.method public getSofted(ILcom/daaw/avee/Common/ISimpleListShort;)F
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 49
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 51
    aget v2, v2, v1

    add-int/2addr v2, p1

    invoke-interface {p2}, Lcom/daaw/avee/Common/ISimpleListShort;->size()I

    move-result v3

    add-int/2addr v2, v3

    invoke-interface {p2}, Lcom/daaw/avee/Common/ISimpleListShort;->size()I

    move-result v3

    rem-int/2addr v2, v3

    .line 52
    invoke-interface {p2, v2}, Lcom/daaw/avee/Common/ISimpleListShort;->get(I)S

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    aget v3, v3, v1

    mul-float v2, v2, v3

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 54
    :cond_0
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    div-float/2addr v0, p1

    return v0
.end method

.method public getSofted(I[F)F
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 39
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 41
    aget v2, v2, v1

    add-int/2addr v2, p1

    array-length v3, p2

    add-int/2addr v2, v3

    array-length v3, p2

    rem-int/2addr v2, v3

    .line 42
    aget v2, p2, v2

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    aget v3, v3, v1

    mul-float v2, v2, v3

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 44
    :cond_0
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    div-float/2addr v0, p1

    return v0
.end method

.method public getSoftedClamped(ILcom/daaw/avee/Common/ISimpleListDouble;)D
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 82
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 83
    aget v2, v2, v1

    add-int/2addr v2, p1

    if-ltz v2, :cond_0

    .line 84
    invoke-interface {p2}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    float-to-double v3, v0

    .line 85
    invoke-interface {p2, v2}, Lcom/daaw/avee/Common/ISimpleListDouble;->get(I)D

    move-result-wide v5

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    aget v0, v0, v1

    float-to-double v7, v0

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v5

    double-to-float v0, v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 91
    :cond_1
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    div-float/2addr v0, p1

    float-to-double p1, v0

    return-wide p1
.end method

.method public getStrength()F
    .locals 1

    .line 33
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->strength:F

    return v0
.end method

.method public setSoftness(I)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ge p1, v1, :cond_0

    new-array p1, v1, [I

    aput v0, p1, v0

    .line 101
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    new-array p1, v1, [F

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p1, v0

    .line 102
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    .line 103
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    return-void

    :cond_0
    add-int/lit8 v1, p1, 0x1

    add-int/2addr v1, p1

    .line 107
    new-array v1, v1, [I

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    .line 108
    array-length v2, v1

    new-array v2, v2, [F

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    .line 109
    array-length v1, v1

    int-to-float v1, v1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessDivider:F

    .line 111
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessIndexes:[I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    sub-int v2, v0, p1

    .line 113
    aput v2, v1, v0

    .line 114
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->softnessWeight:[F

    array-length v4, v1

    add-int/lit8 v4, v4, 0x2

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v2

    array-length v1, v1

    add-int/lit8 v1, v1, 0x2

    invoke-static {v4, v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/DspWindows;->hammingWindow(II)F

    move-result v1

    aput v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
