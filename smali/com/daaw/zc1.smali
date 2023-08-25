.class public Lcom/daaw/zc1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:[I

.field public b:[F

.field public c:F

.field public d:F

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/zc1;->a:[I

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/daaw/zc1;->b:[F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/zc1;->c:F

    return-void
.end method


# virtual methods
.method public a(IF)Lcom/daaw/zc1;
    .locals 5

    iput p2, p0, Lcom/daaw/zc1;->d:F

    iput p1, p0, Lcom/daaw/zc1;->e:I

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge p1, v2, :cond_0

    new-array p1, v2, [I

    aput v1, p1, v1

    iput-object p1, p0, Lcom/daaw/zc1;->a:[I

    new-array p1, v2, [F

    aput v0, p1, v1

    iput-object p1, p0, Lcom/daaw/zc1;->b:[F

    iput v0, p0, Lcom/daaw/zc1;->c:F

    return-object p0

    :cond_0
    add-int/lit8 v3, p1, 0x1

    add-int/2addr v3, p1

    new-array v3, v3, [I

    iput-object v3, p0, Lcom/daaw/zc1;->a:[I

    array-length v3, v3

    new-array v3, v3, [F

    iput-object v3, p0, Lcom/daaw/zc1;->b:[F

    const/4 v3, 0x0

    iput v3, p0, Lcom/daaw/zc1;->c:F

    :goto_0
    iget-object v3, p0, Lcom/daaw/zc1;->a:[I

    array-length v4, v3

    if-ge v1, v4, :cond_1

    sub-int v4, v1, p1

    aput v4, v3, v1

    iget-object v3, p0, Lcom/daaw/zc1;->b:[F

    neg-float v4, p2

    aput v4, v3, v1

    iget v3, p0, Lcom/daaw/zc1;->c:F

    add-float/2addr v3, p2

    iput v3, p0, Lcom/daaw/zc1;->c:F

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length p2, v3

    sub-int/2addr p2, v2

    int-to-float p2, p2

    mul-float p2, p2, v0

    iget-object v0, p0, Lcom/daaw/zc1;->b:[F

    aput p2, v0, p1

    iget p1, p0, Lcom/daaw/zc1;->c:F

    add-float/2addr p1, p2

    iput p1, p0, Lcom/daaw/zc1;->c:F

    return-object p0
.end method

.method public b()I
    .locals 3

    iget-object v0, p0, Lcom/daaw/zc1;->a:[I

    if-eqz v0, :cond_1

    array-length v1, v0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_0

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

.method public c(ILcom/daaw/ie0;)D
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/zc1;->a:[I

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

    iget-object v0, p0, Lcom/daaw/zc1;->b:[F

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
    iget p1, p0, Lcom/daaw/zc1;->c:F

    div-float/2addr v0, p1

    float-to-double p1, v0

    return-wide p1
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lcom/daaw/zc1;->d:F

    return v0
.end method
