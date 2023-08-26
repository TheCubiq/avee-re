.class public Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;
.super Ljava/lang/Object;
.source "FrameValuesAccumulator.java"

# interfaces
.implements Lcom/daaw/avee/Common/ISimpleListFloat;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ListAccessor2"
.end annotation


# instance fields
.field iTmp:I

.field final indexInPast:I

.field indexWarpedTmp:I

.field jTmp:I

.field final parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

.field parentValuesCountTmp:I

.field result2Tmp:F

.field resultTmp:F

.field private softnessDivider:F

.field private softnessIndexes:[I

.field private softnessRadius:I

.field private softnessWeight:[F

.field final timeWidth:I

.field final timeWidthPlus1:F


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;III)V
    .locals 3

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessRadius:I

    new-array v1, v0, [I

    .line 22
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessIndexes:[I

    new-array v1, v0, [F

    .line 23
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessWeight:[F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 24
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessDivider:F

    .line 28
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    .line 31
    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->access$000(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;)[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    move-result-object p1

    array-length p1, p1

    const/4 v2, 0x1

    sub-int/2addr p1, v2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->indexInPast:I

    .line 32
    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->timeWidth:I

    .line 33
    iput p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessRadius:I

    int-to-float p1, p3

    add-float/2addr p1, v1

    .line 35
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->timeWidthPlus1:F

    if-ge p4, v2, :cond_0

    new-array p1, v2, [I

    aput v0, p1, v0

    .line 39
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessIndexes:[I

    new-array p1, v2, [F

    aput v1, p1, v0

    .line 40
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessWeight:[F

    .line 41
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessDivider:F

    return-void

    :cond_0
    add-int/lit8 p1, p4, 0x1

    add-int/2addr p1, p4

    .line 45
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessIndexes:[I

    .line 46
    array-length p2, p1

    new-array p2, p2, [F

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessWeight:[F

    .line 47
    array-length p1, p1

    int-to-float p1, p1

    const p2, 0x3d4ccccd    # 0.05f

    mul-float p1, p1, p2

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessDivider:F

    .line 50
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessIndexes:[I

    array-length p2, p1

    if-ge v0, p2, :cond_1

    sub-int p2, v0, p4

    .line 52
    aput p2, p1, v0

    .line 56
    aget p1, p1, v0

    .line 57
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessWeight:[F

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p1, v1

    aput p1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private getSofted(I[F)F
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 130
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessIndexes:[I

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 132
    aget v2, v2, v1

    add-int/2addr v2, p1

    array-length v3, p2

    add-int/2addr v2, v3

    array-length v3, p2

    add-int/2addr v2, v3

    array-length v3, p2

    rem-int/2addr v2, v3

    .line 133
    aget v2, p2, v2

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessWeight:[F

    aget v3, v3, v1

    mul-float v2, v2, v3

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 135
    :cond_0
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessDivider:F

    div-float/2addr v0, p1

    return v0
.end method


# virtual methods
.method public compareParameters(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;III)Z
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    if-ne p1, v0, :cond_0

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->indexInPast:I

    if-ne p2, p1, :cond_0

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->timeWidth:I

    if-ne p3, p1, :cond_0

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessRadius:I

    if-ne p4, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public get(I)F
    .locals 5

    .line 92
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->access$000(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;)[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->barSmoothValues:[F

    array-length v0, v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->parentValuesCountTmp:I

    const/4 v0, 0x0

    .line 94
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->resultTmp:F

    .line 95
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->iTmp:I

    :goto_0
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->iTmp:I

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessIndexes:[I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 98
    aget v0, v1, v0

    add-int/2addr v0, p1

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCountMultiplied:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->parentValuesCountTmp:I

    rem-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->indexWarpedTmp:I

    .line 102
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->access$000(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;)[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->indexInPast:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->barSmoothValues:[F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->indexWarpedTmp:I

    aget v0, v0, v1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->result2Tmp:F

    .line 104
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->indexInPast:I

    :goto_1
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->jTmp:I

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->jTmp:I

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->indexInPast:I

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->timeWidth:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    .line 105
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->result2Tmp:F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->access$000(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;)[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    move-result-object v1

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->jTmp:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->barSmoothValues:[F

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->indexWarpedTmp:I

    aget v1, v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->result2Tmp:F

    .line 104
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->jTmp:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 106
    :cond_0
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->result2Tmp:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->timeWidthPlus1:F

    div-float/2addr v0, v1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->result2Tmp:F

    .line 112
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->resultTmp:F

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float v0, v0, v2

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessWeight:[F

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->iTmp:I

    aget v3, v3, v4

    mul-float v3, v3, v2

    div-float/2addr v0, v3

    add-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->resultTmp:F

    add-int/lit8 v4, v4, 0x1

    .line 95
    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->iTmp:I

    goto :goto_0

    .line 114
    :cond_1
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->resultTmp:F

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->softnessDivider:F

    div-float/2addr p1, v0

    return p1
.end method

.method public size()I
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCount:I

    return v0
.end method
