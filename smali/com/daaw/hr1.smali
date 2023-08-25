.class public Lcom/daaw/hr1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(JII)J
    .locals 0

    div-int/lit8 p3, p3, 0x8

    mul-int p3, p3, p2

    if-nez p3, :cond_0

    const-wide/16 p0, 0x0

    return-wide p0

    :cond_0
    int-to-long p2, p3

    div-long/2addr p0, p2

    return-wide p0
.end method

.method public static b(JIIJ)I
    .locals 0

    invoke-static {p0, p1, p4, p5}, Lcom/daaw/hr1;->c(JJ)I

    move-result p0

    int-to-long p0, p0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/hr1;->d(JII)I

    move-result p0

    return p0
.end method

.method public static c(JJ)I
    .locals 2

    long-to-double p2, p2

    const-wide v0, 0x412e848000000000L    # 1000000.0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p2, v0

    long-to-double p0, p0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p2, p2, p0

    double-to-int p0, p2

    return p0
.end method

.method public static d(JII)I
    .locals 0

    div-int/lit8 p3, p3, 0x8

    mul-int p3, p3, p2

    int-to-long p2, p3

    mul-long p0, p0, p2

    long-to-int p1, p0

    return p1
.end method

.method public static e(JJ)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p0, p0, v0

    div-long/2addr p0, p2

    return-wide p0
.end method
