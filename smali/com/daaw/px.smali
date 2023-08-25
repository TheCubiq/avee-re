.class public Lcom/daaw/px;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:D = 20.0

.field public static b:D = 22050.0


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Lcom/daaw/lv;Lcom/daaw/zx0;)V
    .locals 5

    invoke-virtual {p1}, Lcom/daaw/zx0;->a()V

    iget-object v0, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v0, v0

    if-lez v0, :cond_2

    sget-wide v0, Lcom/daaw/px;->a:D

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    double-to-float v0, v0

    sget-wide v1, Lcom/daaw/px;->b:D

    invoke-static {v1, v2}, Ljava/lang/Math;->log10(D)D

    move-result-wide v1

    double-to-float v1, v1

    sub-float/2addr v1, v0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v4, v3

    if-ge v2, v4, :cond_2

    aget-object v3, v3, v2

    iget v3, v3, Lcom/daaw/lv$a;->a:F

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

    iget-object v4, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object v4, v4, v2

    goto :goto_1

    :cond_0
    iget-object p0, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object p0, p0, v2

    iget p0, p0, Lcom/daaw/lv$a;->b:F

    invoke-virtual {p1, v3, p0}, Lcom/daaw/zx0;->d(FF)V

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    iget-object v4, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object v4, v4, v2

    :goto_1
    iget v4, v4, Lcom/daaw/lv$a;->b:F

    invoke-virtual {p1, v3, v4}, Lcom/daaw/zx0;->d(FF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method

.method public static b(Lcom/daaw/lv;Lcom/daaw/lv;Lcom/daaw/lv;FF[F[F)V
    .locals 4

    array-length v0, p5

    new-array v0, v0, [F

    array-length v1, p5

    new-array v1, v1, [F

    array-length v2, p5

    new-array v2, v2, [F

    new-instance v3, Lcom/daaw/zx0;

    invoke-direct {v3}, Lcom/daaw/zx0;-><init>()V

    invoke-static {p0, v3}, Lcom/daaw/px;->a(Lcom/daaw/lv;Lcom/daaw/zx0;)V

    invoke-static {v3, v0, p6}, Lcom/daaw/px;->d(Lcom/daaw/zx0;[F[F)V

    invoke-static {p1, v3}, Lcom/daaw/px;->a(Lcom/daaw/lv;Lcom/daaw/zx0;)V

    invoke-static {v3, v1, p6}, Lcom/daaw/px;->d(Lcom/daaw/zx0;[F[F)V

    invoke-static {p2, v3}, Lcom/daaw/px;->a(Lcom/daaw/lv;Lcom/daaw/zx0;)V

    invoke-static {v3, v2, p6}, Lcom/daaw/px;->d(Lcom/daaw/zx0;[F[F)V

    const/4 p0, 0x0

    :goto_0
    array-length p1, p5

    if-ge p0, p1, :cond_0

    aget p1, v0, p0

    aget p2, v1, p0

    mul-float p2, p2, p3

    add-float/2addr p1, p2

    aget p2, v2, p0

    mul-float p2, p2, p4

    add-float/2addr p1, p2

    aput p1, p5, p0

    aget p1, p5, p0

    const/high16 p2, -0x40800000    # -1.0f

    const/high16 p6, 0x3f800000    # 1.0f

    invoke-static {p1, p2, p6}, Lcom/daaw/br1;->j(FFF)F

    move-result p1

    aput p1, p5, p0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static c(Lcom/daaw/lv;Lcom/daaw/lv;)V
    .locals 7

    iget-object v0, p1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v1, v0

    new-array v2, v1, [F

    array-length v0, v0

    new-array v3, v0, [F

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_0

    iget-object v6, p1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object v6, v6, v5

    iget v6, v6, Lcom/daaw/lv$a;->a:F

    aput v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/zx0;

    invoke-direct {v0}, Lcom/daaw/zx0;-><init>()V

    invoke-static {p0, v0}, Lcom/daaw/px;->a(Lcom/daaw/lv;Lcom/daaw/zx0;)V

    invoke-static {v0, v2, v3}, Lcom/daaw/px;->d(Lcom/daaw/zx0;[F[F)V

    :goto_1
    if-ge v4, v1, :cond_1

    iget-object p0, p1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object p0, p0, v4

    aget v0, v2, v4

    iput v0, p0, Lcom/daaw/lv$a;->b:F

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static d(Lcom/daaw/zx0;[F[F)V
    .locals 8

    sget-wide v0, Lcom/daaw/px;->a:D

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    double-to-float v0, v0

    sget-wide v1, Lcom/daaw/px;->b:D

    invoke-static {v1, v2}, Ljava/lang/Math;->log10(D)D

    move-result-wide v1

    double-to-float v1, v1

    sub-float/2addr v1, v0

    const/4 v2, 0x0

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_1

    aget v3, p2, v2

    float-to-double v3, v3

    sget-wide v5, Lcom/daaw/px;->a:D

    cmpl-double v7, v3, v5

    if-nez v7, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    aget v3, p2, v2

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->log10(D)D

    move-result-wide v3

    double-to-float v3, v3

    sub-float/2addr v3, v0

    div-float/2addr v3, v1

    :goto_1
    invoke-virtual {p0, v3}, Lcom/daaw/zx0;->b(F)F

    move-result v3

    aput v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
