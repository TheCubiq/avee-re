.class public Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;
.super Ljava/lang/Object;
.source "UtilsVisualizerDataProvider.java"


# static fields
.field public static final MICROS_PER_SECOND:J = 0xf4240L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bytesToDurationUs(JIIJ)J
    .locals 0

    .line 27
    invoke-static {p0, p1, p2, p3}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->bytesToFrames(JII)J

    move-result-wide p0

    invoke-static {p0, p1, p4, p5}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->framesToDurationUs(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static bytesToFrames(JII)J
    .locals 0

    .line 7
    div-int/lit8 p3, p3, 0x8

    mul-int p3, p3, p2

    int-to-long p2, p3

    .line 9
    div-long/2addr p0, p2

    return-wide p0
.end method

.method public static durationUsToBytes(JIIJ)I
    .locals 0

    .line 31
    invoke-static {p0, p1, p4, p5}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->durationUsToFrames(JJ)I

    move-result p0

    int-to-long p0, p0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->framesToBytes(JII)I

    move-result p0

    return p0
.end method

.method public static durationUsToFrames(JJ)I
    .locals 2

    long-to-double p2, p2

    const-wide v0, 0x412e848000000000L    # 1000000.0

    .line 23
    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p2, v0

    long-to-double p0, p0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p2, p2, p0

    double-to-int p0, p2

    return p0
.end method

.method public static framesToBytes(JII)I
    .locals 0

    .line 13
    div-int/lit8 p3, p3, 0x8

    mul-int p3, p3, p2

    int-to-long p2, p3

    mul-long p0, p0, p2

    long-to-int p1, p0

    return p1
.end method

.method public static framesToDurationUs(JJ)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p0, p0, v0

    .line 19
    div-long/2addr p0, p2

    return-wide p0
.end method
