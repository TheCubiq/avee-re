.class public Lcom/daaw/avee/comp/EqualizerUI/Equalization;
.super Ljava/lang/Object;
.source "Equalization.java"


# static fields
.field static hiFreq:D = 22050.0

.field static loFreq:D = 20.0


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static eqCurveToPointCurve(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/PointCurve;)V
    .locals 5

    .line 54
    invoke-virtual {p1}, Lcom/daaw/avee/comp/EqualizerUI/PointCurve;->clear()V

    .line 56
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v0, v0

    if-lez v0, :cond_2

    .line 57
    sget-wide v0, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->loFreq:D

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 58
    sget-wide v1, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->hiFreq:D

    invoke-static {v1, v2}, Ljava/lang/Math;->log10(D)D

    move-result-wide v1

    double-to-float v1, v1

    sub-float/2addr v1, v0

    const/4 v2, 0x0

    .line 61
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v3, v3

    if-ge v2, v3, :cond_2

    .line 62
    iget-object v3, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v3, v3, v2

    iget v3, v3, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->log10(D)D

    move-result-wide v3

    double-to-float v3, v3

    cmpl-float v4, v3, v0

    if-ltz v4, :cond_1

    sub-float/2addr v3, v0

    div-float/2addr v3, v1

    const/high16 v4, 0x3f800000    # 1.0f

    cmpg-float v4, v3, v4

    if-gtz v4, :cond_0

    .line 66
    iget-object v4, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v4, v4, v2

    iget v4, v4, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/EqualizerUI/PointCurve;->insert(FF)V

    goto :goto_1

    .line 68
    :cond_0
    iget-object p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object p0, p0, v2

    iget p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    invoke-virtual {p1, v3, p0}, Lcom/daaw/avee/comp/EqualizerUI/PointCurve;->insert(FF)V

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    .line 72
    iget-object v4, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v4, v4, v2

    iget v4, v4, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    invoke-virtual {p1, v3, v4}, Lcom/daaw/avee/comp/EqualizerUI/PointCurve;->insert(FF)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method

.method public static getEqBandsBassTrebleControl(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;FF[F[F)V
    .locals 4

    .line 32
    array-length v0, p5

    new-array v0, v0, [F

    .line 33
    array-length v1, p5

    new-array v1, v1, [F

    .line 34
    array-length v2, p5

    new-array v2, v2, [F

    .line 36
    new-instance v3, Lcom/daaw/avee/comp/EqualizerUI/PointCurve;

    invoke-direct {v3}, Lcom/daaw/avee/comp/EqualizerUI/PointCurve;-><init>()V

    .line 38
    invoke-static {p0, v3}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->eqCurveToPointCurve(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/PointCurve;)V

    .line 39
    invoke-static {v3, v0, p6}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->pointCurveToEqBands(Lcom/daaw/avee/comp/EqualizerUI/PointCurve;[F[F)V

    .line 41
    invoke-static {p1, v3}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->eqCurveToPointCurve(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/PointCurve;)V

    .line 42
    invoke-static {v3, v1, p6}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->pointCurveToEqBands(Lcom/daaw/avee/comp/EqualizerUI/PointCurve;[F[F)V

    .line 44
    invoke-static {p2, v3}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->eqCurveToPointCurve(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/PointCurve;)V

    .line 45
    invoke-static {v3, v2, p6}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->pointCurveToEqBands(Lcom/daaw/avee/comp/EqualizerUI/PointCurve;[F[F)V

    const/4 p0, 0x0

    .line 47
    :goto_0
    array-length p1, p5

    if-ge p0, p1, :cond_0

    .line 48
    aget p1, v0, p0

    aget p2, v1, p0

    mul-float p2, p2, p3

    add-float/2addr p1, p2

    aget p2, v2, p0

    mul-float p2, p2, p4

    add-float/2addr p1, p2

    aput p1, p5, p0

    .line 49
    aget p1, p5, p0

    const/high16 p2, -0x40800000    # -1.0f

    const/high16 p6, 0x3f800000    # 1.0f

    invoke-static {p1, p2, p6}, Lcom/daaw/avee/Common/Utils;->ensureRange(FFF)F

    move-result p1

    aput p1, p5, p0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static getEqBandsPresetsConvert(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)V
    .locals 7

    .line 16
    iget-object v0, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v0, v0

    new-array v1, v0, [F

    .line 17
    iget-object v2, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v2, v2

    new-array v3, v2, [F

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_0

    .line 19
    iget-object v6, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v6, v6, v5

    iget v6, v6, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    aput v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 21
    :cond_0
    new-instance v2, Lcom/daaw/avee/comp/EqualizerUI/PointCurve;

    invoke-direct {v2}, Lcom/daaw/avee/comp/EqualizerUI/PointCurve;-><init>()V

    .line 22
    invoke-static {p0, v2}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->eqCurveToPointCurve(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/PointCurve;)V

    .line 23
    invoke-static {v2, v1, v3}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->pointCurveToEqBands(Lcom/daaw/avee/comp/EqualizerUI/PointCurve;[F[F)V

    :goto_1
    if-ge v4, v0, :cond_1

    .line 26
    iget-object p0, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object p0, p0, v4

    aget v2, v1, v4

    iput v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method static pointCurveToEqBands(Lcom/daaw/avee/comp/EqualizerUI/PointCurve;[F[F)V
    .locals 8

    .line 82
    sget-wide v0, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->loFreq:D

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 83
    sget-wide v1, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->hiFreq:D

    invoke-static {v1, v2}, Ljava/lang/Math;->log10(D)D

    move-result-wide v1

    double-to-float v1, v1

    sub-float/2addr v1, v0

    const/4 v2, 0x0

    .line 87
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_1

    .line 88
    aget v3, p2, v2

    float-to-double v3, v3

    sget-wide v5, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->loFreq:D

    cmpl-double v7, v3, v5

    if-nez v7, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    .line 91
    :cond_0
    aget v3, p2, v2

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->log10(D)D

    move-result-wide v3

    double-to-float v3, v3

    sub-float/2addr v3, v0

    div-float/2addr v3, v1

    .line 94
    :goto_1
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/EqualizerUI/PointCurve;->getValue(F)F

    move-result v3

    aput v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
