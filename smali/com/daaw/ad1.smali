.class public Lcom/daaw/ad1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:[I

.field public b:[F

.field public c:F

.field public d:F

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>([FFII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p3, 0x0

    new-array v0, p3, [I

    iput-object v0, p0, Lcom/daaw/ad1;->a:[I

    new-array v0, p3, [F

    iput-object v0, p0, Lcom/daaw/ad1;->b:[F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/ad1;->c:F

    iput p4, p0, Lcom/daaw/ad1;->e:I

    array-length p4, p1

    iput p4, p0, Lcom/daaw/ad1;->f:I

    iput-object p1, p0, Lcom/daaw/ad1;->b:[F

    iput p2, p0, Lcom/daaw/ad1;->c:F

    array-length p1, p1

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/daaw/ad1;->a:[I

    add-int/lit8 p1, p4, -0x1

    div-int/lit8 p1, p1, 0x2

    :goto_0
    iget-object p2, p0, Lcom/daaw/ad1;->a:[I

    array-length v0, p2

    if-ge p3, v0, :cond_0

    rem-int v0, p3, p4

    sub-int/2addr v0, p1

    aput v0, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b(I)Lcom/daaw/ad1;
    .locals 8

    int-to-double v0, p0

    const-wide v2, 0x40048f5c28f5c28fL    # 2.57

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int v1, v0, v0

    add-int/lit8 v1, v1, 0x1

    new-array v2, v1, [F

    neg-int v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    add-int/lit8 v6, v0, 0x1

    if-ge v3, v6, :cond_1

    if-nez v3, :cond_0

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    add-int v7, v3, v0

    aput v6, v2, v7

    add-float/2addr v5, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/ad1;

    invoke-direct {v0, v2, v5, v1, p0}, Lcom/daaw/ad1;-><init>([FFII)V

    return-object v0
.end method

.method public static c(I)Lcom/daaw/ad1;
    .locals 12

    int-to-double v0, p0

    const-wide v2, 0x40048f5c28f5c28fL    # 2.57

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    add-int v3, v2, v2

    const/4 v4, 0x1

    add-int/2addr v3, v4

    new-array v5, v3, [F

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    if-ne v3, v4, :cond_0

    aput v6, v5, v7

    goto :goto_1

    :cond_0
    rsub-int/lit8 v6, v2, 0x0

    const/4 v8, 0x0

    :goto_0
    add-int v9, v7, v2

    add-int/2addr v9, v4

    if-ge v6, v9, :cond_1

    add-int/lit8 v9, v6, 0x0

    mul-int v9, v9, v9

    int-to-float v9, v9

    neg-float v9, v9

    mul-int/lit8 v10, p0, 0x2

    mul-int v10, v10, p0

    int-to-float v10, v10

    div-float/2addr v9, v10

    float-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    move-result-wide v9

    double-to-float v9, v9

    const-wide v10, 0x401921fb54442d18L    # 6.283185307179586

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v0

    double-to-float v10, v10

    div-float/2addr v9, v10

    add-int v10, v6, v2

    aput v9, v5, v10

    add-float/2addr v8, v9

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move v6, v8

    :goto_1
    new-instance v0, Lcom/daaw/ad1;

    invoke-direct {v0, v5, v6, v3, p0}, Lcom/daaw/ad1;-><init>([FFII)V

    return-object v0
.end method

.method public static e(IF)Lcom/daaw/ad1;
    .locals 6

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    if-ge p0, v2, :cond_0

    new-instance p0, Lcom/daaw/ad1;

    new-array p1, v2, [F

    aput v1, p1, v0

    invoke-direct {p0, p1, v1, v2, v0}, Lcom/daaw/ad1;-><init>([FFII)V

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/daaw/ad1;->b(I)Lcom/daaw/ad1;

    move-result-object v2

    invoke-static {p0}, Lcom/daaw/ad1;->b(I)Lcom/daaw/ad1;

    move-result-object v3

    invoke-static {p0}, Lcom/daaw/ad1;->c(I)Lcom/daaw/ad1;

    move-result-object p0

    invoke-virtual {v3, p0}, Lcom/daaw/ad1;->d(Lcom/daaw/ad1;)V

    iput p1, v3, Lcom/daaw/ad1;->d:F

    sub-float/2addr v1, p1

    :goto_0
    iget-object p0, v3, Lcom/daaw/ad1;->b:[F

    array-length v4, p0

    if-ge v0, v4, :cond_1

    aget v4, p0, v0

    mul-float v4, v4, p1

    iget-object v5, v2, Lcom/daaw/ad1;->b:[F

    aget v5, v5, v0

    mul-float v5, v5, v1

    add-float/2addr v4, v5

    aput v4, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lcom/daaw/ad1;->a()V

    return-object v3
.end method


# virtual methods
.method public a()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/ad1;->a:[I

    array-length v2, v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/ad1;->b:[F

    aget v2, v2, v1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Lcom/daaw/ad1;->c:F

    return-void
.end method

.method public d(Lcom/daaw/ad1;)V
    .locals 7

    iget v0, p0, Lcom/daaw/ad1;->f:I

    iget v1, p1, Lcom/daaw/ad1;->f:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/ad1;->a:[I

    array-length v2, v2

    if-ge v1, v2, :cond_1

    sub-int v2, v1, v0

    if-ltz v2, :cond_0

    iget v3, p1, Lcom/daaw/ad1;->f:I

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Lcom/daaw/ad1;->b:[F

    aget v4, v3, v1

    iget-object v5, p1, Lcom/daaw/ad1;->b:[F

    aget v2, v5, v2

    iget v5, p0, Lcom/daaw/ad1;->c:F

    iget v6, p1, Lcom/daaw/ad1;->c:F

    div-float/2addr v5, v6

    mul-float v2, v2, v5

    sub-float/2addr v4, v2

    aput v4, v3, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public f()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/ad1;->a:[I

    if-eqz v0, :cond_1

    array-length v0, v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/daaw/ad1;->e:I

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public g(ILcom/daaw/ie0;)D
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/ad1;->a:[I

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget v2, v2, v1

    add-int/2addr v2, p1

    if-ltz v2, :cond_0

    invoke-interface {p2}, Lcom/daaw/ie0;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    float-to-double v3, v0

    invoke-interface {p2, v2}, Lcom/daaw/ie0;->get(I)D

    move-result-wide v5

    iget-object v0, p0, Lcom/daaw/ad1;->b:[F

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

    :cond_1
    iget p1, p0, Lcom/daaw/ad1;->c:F

    div-float/2addr v0, p1

    float-to-double p1, v0

    return-wide p1
.end method

.method public h()F
    .locals 1

    iget v0, p0, Lcom/daaw/ad1;->d:F

    return v0
.end method
