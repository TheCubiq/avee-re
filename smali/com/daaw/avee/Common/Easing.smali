.class public Lcom/daaw/avee/Common/Easing;
.super Ljava/lang/Object;
.source "Easing.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static easeInAndOut01(F)F
    .locals 3

    mul-float v0, p0, p0

    mul-float v0, v0, p0

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float v1, v1, p0

    const/high16 v2, 0x41700000    # 15.0f

    sub-float/2addr v1, v2

    mul-float p0, p0, v1

    const/high16 v1, 0x41200000    # 10.0f

    add-float/2addr p0, v1

    mul-float v0, v0, p0

    return v0
.end method

.method public static easeInOutBack(FFFFF)F
    .locals 6

    const v5, 0x3fd9cd60

    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/Easing;->easeInOutBack(FFFFFF)F

    move-result p0

    return p0
.end method

.method public static easeInOutBack(FFFFFF)F
    .locals 5

    const/high16 p0, 0x40000000    # 2.0f

    div-float/2addr p4, p0

    div-float/2addr p1, p4

    const-wide v0, 0x3ff8666666666666L    # 1.525

    const/high16 p4, 0x3f800000    # 1.0f

    cmpg-float v2, p1, p4

    if-gez v2, :cond_0

    div-float/2addr p3, p0

    mul-float p0, p1, p1

    float-to-double v2, p5

    .line 18
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v0

    double-to-float p5, v2

    add-float/2addr p4, p5

    mul-float p4, p4, p1

    sub-float/2addr p4, p5

    mul-float p0, p0, p4

    mul-float p3, p3, p0

    :goto_0
    add-float/2addr p3, p2

    return p3

    :cond_0
    div-float/2addr p3, p0

    sub-float/2addr p1, p0

    mul-float v2, p1, p1

    float-to-double v3, p5

    .line 19
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v0

    double-to-float p5, v3

    add-float/2addr p4, p5

    mul-float p4, p4, p1

    add-float/2addr p4, p5

    mul-float v2, v2, p4

    add-float/2addr v2, p0

    mul-float p3, p3, v2

    goto :goto_0
.end method

.method public static easeInOutExpo(FFFFF)F
    .locals 4

    const/4 p0, 0x0

    cmpl-float p0, p1, p0

    if-nez p0, :cond_0

    return p2

    :cond_0
    cmpl-float p0, p1, p4

    if-nez p0, :cond_1

    add-float/2addr p2, p3

    return p2

    :cond_1
    const/high16 p0, 0x40000000    # 2.0f

    div-float/2addr p4, p0

    div-float/2addr p1, p4

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    const/high16 p4, 0x3f800000    # 1.0f

    cmpg-float v2, p1, p4

    if-gez v2, :cond_2

    div-float/2addr p3, p0

    const/high16 p0, 0x41200000    # 10.0f

    sub-float/2addr p1, p4

    mul-float p1, p1, p0

    float-to-double p0, p1

    .line 25
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    double-to-float p0, p0

    mul-float p3, p3, p0

    :goto_0
    add-float/2addr p3, p2

    return p3

    :cond_2
    div-float/2addr p3, p0

    const/high16 v2, -0x3ee00000    # -10.0f

    sub-float/2addr p1, p4

    mul-float p1, p1, v2

    float-to-double v2, p1

    .line 26
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    neg-double v0, v0

    double-to-float p1, v0

    add-float/2addr p1, p0

    mul-float p3, p3, p1

    goto :goto_0
.end method
