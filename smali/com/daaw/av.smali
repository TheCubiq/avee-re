.class public Lcom/daaw/av;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(D)D
    .locals 10

    mul-double v0, p0, p0

    mul-double v2, v0, p0

    mul-double v2, v2, p0

    const-wide p0, 0x3ff8ff572de43ed9L    # 1.562339

    mul-double p0, p0, v2

    const-wide v4, 0x40c6a28be920f0bbL    # 11589.0930520225

    add-double/2addr v4, v0

    const-wide v6, 0x41209d7157469bb3L    # 544440.6704605728

    add-double/2addr v6, v0

    mul-double v4, v4, v6

    div-double/2addr p0, v4

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    mul-double p0, p0, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    div-double/2addr p0, v6

    const-wide v6, 0x4353ebb891323900L    # 2.242881E16

    mul-double v2, v2, v6

    const-wide v6, 0x407a85194d7acc87L    # 424.31867740600904

    add-double/2addr v6, v0

    mul-double v6, v6, v6

    const-wide v8, 0x41a1b9eef2d119cdL    # 1.4869900140839997E8

    add-double/2addr v0, v8

    mul-double v6, v6, v0

    mul-double v6, v6, v0

    div-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    mul-double v0, v0, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    add-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-wide/16 p0, 0x0

    :cond_1
    return-wide p0
.end method

.method public static b(DDD)D
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr p0, v0

    div-double/2addr p4, p2

    mul-double p0, p0, p4

    return-wide p0
.end method

.method public static c(D)D
    .locals 6

    const-wide v0, 0x408f400000000000L    # 1000.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    mul-double v0, p0, p0

    mul-double v2, v0, p0

    mul-double v2, v2, p0

    const-wide p0, 0x41a1be3c80000000L    # 1.4884E8

    mul-double v2, v2, p0

    const-wide v4, 0x407a85c28f5c28f7L    # 424.36000000000007

    add-double/2addr v4, v0

    add-double/2addr p0, v0

    mul-double v4, v4, p0

    const-wide p0, 0x40c6a7a51eb851ecL    # 11599.29

    add-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    mul-double v4, v4, p0

    const-wide p0, 0x41209de0d1eb851eL    # 544496.4099999999

    add-double/2addr v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    mul-double v4, v4, p0

    div-double/2addr v2, v4

    return-wide v2
.end method
