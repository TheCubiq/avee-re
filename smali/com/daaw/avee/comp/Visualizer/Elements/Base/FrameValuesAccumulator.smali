.class public Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;
.super Ljava/lang/Object;
.source "FrameValuesAccumulator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;,
        Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor;,
        Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor2;
    }
.end annotation


# instance fields
.field cachedLists:[[Lcom/daaw/avee/Common/ISimpleListFloat;

.field private entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

.field valuesCount:I

.field valuesCountMultiplied:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 307
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 298
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCount:I

    .line 299
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCountMultiplied:I

    new-array v0, v0, [Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    .line 300
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 303
    fill-array-data v0, :array_0

    const-class v1, Lcom/daaw/avee/Common/ISimpleListFloat;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Lcom/daaw/avee/Common/ISimpleListFloat;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->cachedLists:[[Lcom/daaw/avee/Common/ISimpleListFloat;

    const/16 v0, 0xa

    .line 308
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->setFramesCount(I)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;)[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;
    .locals 0

    .line 10
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    return-object p0
.end method


# virtual methods
.method public addFrame([F)V
    .locals 4

    .line 340
    array-length v0, p1

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->setValuesCount(I)V

    .line 342
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v1, v0, v1

    .line 345
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-lez v0, :cond_0

    .line 347
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    add-int/lit8 v3, v0, -0x1

    aget-object v3, v2, v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 352
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 353
    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->barSmoothValues:[F

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public createFrameValuesAccessorList(IIILcom/daaw/avee/Common/ISimpleListFloat;)Lcom/daaw/avee/Common/ISimpleListFloat;
    .locals 1

    .line 376
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 377
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-eqz p4, :cond_0

    .line 379
    instance-of v0, p4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor;->compareParameters(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;III)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p4

    .line 383
    :cond_0
    new-instance p4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor;

    invoke-direct {p4, p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$ListAccessor;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;III)V

    return-object p4
.end method

.method public getFrameValue(III)F
    .locals 3

    .line 364
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    aget-object v0, v0, p2

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->barSmoothValues:[F

    aget v0, v0, p1

    move v1, p2

    :goto_0
    add-int v2, p2, p3

    if-ge v1, v2, :cond_0

    .line 366
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    aget-object v2, v2, p2

    iget-object v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->barSmoothValues:[F

    aget v2, v2, p1

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    int-to-float p1, p3

    const/high16 p2, 0x3f800000    # 1.0f

    add-float/2addr p1, p2

    div-float/2addr v0, p1

    return v0
.end method

.method public getFrameValues(II)[F
    .locals 0

    .line 359
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    aget-object p1, p2, p1

    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->barSmoothValues:[F

    return-object p1
.end method

.method public setFramesCount(I)V
    .locals 4

    .line 313
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    array-length v0, v0

    if-ne v0, p1, :cond_0

    return-void

    .line 314
    :cond_0
    new-array p1, p1, [Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 315
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 316
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 318
    :cond_1
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCount:I

    .line 319
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCount:I

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCountMultiplied:I

    .line 320
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->setValuesCount(I)V

    .line 322
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    array-length v0, v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCount:I

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x1

    aput v1, v2, v3

    aput v0, v2, p1

    const-class p1, Lcom/daaw/avee/Common/ISimpleListFloat;

    invoke-static {p1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[Lcom/daaw/avee/Common/ISimpleListFloat;

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->cachedLists:[[Lcom/daaw/avee/Common/ISimpleListFloat;

    return-void
.end method

.method public setValuesCount(I)V
    .locals 4

    .line 327
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCount:I

    if-ne v0, p1, :cond_0

    return-void

    .line 328
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCount:I

    mul-int/lit8 v0, p1, 0x64

    .line 329
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->valuesCountMultiplied:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 330
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->entries:[Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 332
    aget-object v2, v2, v1

    new-array v3, p1, [F

    iput-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->barSmoothValues:[F

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 335
    :cond_1
    array-length v1, v2

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x1

    aput p1, v2, v3

    aput v1, v2, v0

    const-class p1, Lcom/daaw/avee/Common/ISimpleListFloat;

    invoke-static {p1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[Lcom/daaw/avee/Common/ISimpleListFloat;

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->cachedLists:[[Lcom/daaw/avee/Common/ISimpleListFloat;

    return-void
.end method
