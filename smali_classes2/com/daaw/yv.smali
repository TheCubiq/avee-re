.class public Lcom/daaw/yv;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/daaw/w01;->n:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/daaw/en0;->b(Landroid/content/Context;IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/yv;->a:Z

    sget v0, Lcom/daaw/w01;->m:I

    invoke-static {p1, v0, v1}, Lcom/daaw/jn0;->a(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/daaw/yv;->b:I

    sget v0, Lcom/daaw/w01;->k:I

    invoke-static {p1, v0, v1}, Lcom/daaw/jn0;->a(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/daaw/yv;->c:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Lcom/daaw/yv;->d:F

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 3

    iget v0, p0, Lcom/daaw/yv;->d:F

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-lez v2, :cond_1

    cmpg-float v2, p1, v1

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    div-float/2addr p1, v0

    const/high16 v0, 0x40900000    # 4.5f

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->log1p(D)D

    move-result-wide v1

    double-to-float p1, v1

    mul-float p1, p1, v0

    const/high16 v0, 0x40000000    # 2.0f

    add-float/2addr p1, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public b(IF)I
    .locals 2

    invoke-virtual {p0, p2}, Lcom/daaw/yv;->a(F)F

    move-result p2

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    const/16 v1, 0xff

    invoke-static {p1, v1}, Lcom/daaw/zg;->j(II)I

    move-result p1

    iget v1, p0, Lcom/daaw/yv;->b:I

    invoke-static {p1, v1, p2}, Lcom/daaw/jn0;->f(IIF)I

    move-result p1

    invoke-static {p1, v0}, Lcom/daaw/zg;->j(II)I

    move-result p1

    return p1
.end method

.method public c(IF)I
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/yv;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/yv;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yv;->b(IF)I

    move-result p1

    :cond_0
    return p1
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/yv;->a:Z

    return v0
.end method

.method public final e(I)Z
    .locals 1

    const/16 v0, 0xff

    invoke-static {p1, v0}, Lcom/daaw/zg;->j(II)I

    move-result p1

    iget v0, p0, Lcom/daaw/yv;->c:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
