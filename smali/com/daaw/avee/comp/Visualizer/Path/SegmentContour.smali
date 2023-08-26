.class public Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;
.super Ljava/lang/Object;
.source "SegmentContour.java"


# instance fields
.field segments:[Lcom/daaw/avee/Common/Vec4f;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/Common/Vec4f;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/daaw/avee/Common/Vec4f;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;->segments:[Lcom/daaw/avee/Common/Vec4f;

    const/4 v0, 0x0

    .line 24
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;->segments:[Lcom/daaw/avee/Common/Vec4f;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 27
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/Common/Vec4f;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public getLength()F
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 36
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;->segments:[Lcom/daaw/avee/Common/Vec4f;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 38
    aget-object v2, v2, v1

    .line 39
    iget v3, v2, Lcom/daaw/avee/Common/Vec4f;->x1:F

    iget v4, v2, Lcom/daaw/avee/Common/Vec4f;->x2:F

    sub-float/2addr v3, v4

    iget v4, v2, Lcom/daaw/avee/Common/Vec4f;->y1:F

    iget v2, v2, Lcom/daaw/avee/Common/Vec4f;->y2:F

    sub-float/2addr v4, v2

    invoke-static {v3, v4}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v2

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public getPosTan(F[F[F)Z
    .locals 9

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    .line 57
    array-length v1, p2

    if-lt v1, v0, :cond_1

    :cond_0
    if-eqz p3, :cond_2

    array-length v1, p3

    if-lt v1, v0, :cond_1

    goto :goto_0

    .line 59
    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 63
    :goto_1
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;->segments:[Lcom/daaw/avee/Common/Vec4f;

    array-length v4, v3

    const/4 v5, 0x1

    if-ge v2, v4, :cond_4

    .line 65
    aget-object v3, v3, v2

    .line 66
    new-instance v4, Lcom/daaw/avee/Common/Vec2f;

    iget v6, v3, Lcom/daaw/avee/Common/Vec4f;->x2:F

    iget v7, v3, Lcom/daaw/avee/Common/Vec4f;->x1:F

    sub-float/2addr v6, v7

    iget v7, v3, Lcom/daaw/avee/Common/Vec4f;->y2:F

    iget v8, v3, Lcom/daaw/avee/Common/Vec4f;->y1:F

    sub-float/2addr v7, v8

    invoke-direct {v4, v6, v7}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 68
    iget v6, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v7, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v6, v7}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v6

    add-float/2addr v6, v0

    cmpg-float v7, p1, v6

    if-gez v7, :cond_3

    sub-float/2addr p1, v0

    .line 79
    invoke-virtual {v4}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 81
    iget v0, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    aput v0, p3, v1

    .line 82
    iget v0, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    aput v0, p3, v5

    .line 84
    iget p3, v3, Lcom/daaw/avee/Common/Vec4f;->x1:F

    iget v0, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v0, v0, p1

    add-float/2addr p3, v0

    aput p3, p2, v1

    .line 85
    iget p3, v3, Lcom/daaw/avee/Common/Vec4f;->y1:F

    iget v0, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v0, v0, p1

    add-float/2addr p3, v0

    aput p3, p2, v5

    return v5

    :cond_3
    add-int/lit8 v2, v2, 0x1

    move v0, v6

    goto :goto_1

    :cond_4
    return v5
.end method
