.class public Lcom/daaw/c31;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:I

.field public g:I

.field public h:F

.field public i:F

.field public j:F

.field public k:F


# direct methods
.method public constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/c31;->a:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/c31;->c:F

    iput p1, p0, Lcom/daaw/c31;->b:F

    iput p1, p0, Lcom/daaw/c31;->e:F

    iput p1, p0, Lcom/daaw/c31;->d:F

    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lcom/daaw/c31;->g(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0, p1, v0}, Lcom/daaw/c31;->h(FFFF)V

    return-void
.end method


# virtual methods
.method public a(IF)V
    .locals 2

    iget v0, p0, Lcom/daaw/c31;->f:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/daaw/c31;->g:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x0

    iget v0, p0, Lcom/daaw/c31;->d:F

    sub-float/2addr p2, v0

    iget v1, p0, Lcom/daaw/c31;->e:F

    sub-float/2addr v1, v0

    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget p2, p0, Lcom/daaw/c31;->h:F

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Lcom/daaw/c31;->j:F

    iget p2, p0, Lcom/daaw/c31;->h:F

    add-float/2addr p2, p1

    iput p2, p0, Lcom/daaw/c31;->h:F

    :cond_0
    return-void
.end method

.method public b()F
    .locals 4

    iget v0, p0, Lcom/daaw/c31;->h:F

    iget v1, p0, Lcom/daaw/c31;->i:F

    div-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/c31;->a:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, v1

    mul-float v0, v0, v2

    iget v2, p0, Lcom/daaw/c31;->j:F

    iget v3, p0, Lcom/daaw/c31;->k:F

    div-float/2addr v2, v3

    mul-float v2, v2, v1

    add-float/2addr v0, v2

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lcom/daaw/c31;->b:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lcom/daaw/c31;->c:F

    return v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lcom/daaw/c31;->d:F

    return v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, Lcom/daaw/c31;->e:F

    return v0
.end method

.method public g(I)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/c31;->h:F

    int-to-float p1, p1

    iget v0, p0, Lcom/daaw/c31;->b:F

    mul-float v0, v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/daaw/c31;->f:I

    iget v0, p0, Lcom/daaw/c31;->c:F

    mul-float p1, p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Lcom/daaw/c31;->g:I

    iget v0, p0, Lcom/daaw/c31;->e:F

    iget v1, p0, Lcom/daaw/c31;->d:F

    sub-float v2, v0, v1

    iput v2, p0, Lcom/daaw/c31;->k:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/c31;->f:I

    sub-int/2addr p1, v1

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    mul-float v0, v0, p1

    const p1, 0x38d1b717    # 1.0E-4f

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/c31;->i:F

    return-void
.end method

.method public h(FFFF)V
    .locals 1

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/daaw/c31;->b:F

    invoke-static {p3, p4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/daaw/c31;->d:F

    const v0, 0x3c23d70a    # 0.01f

    add-float/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/c31;->c:F

    const/high16 p1, 0x3f800000    # 1.0f

    add-float/2addr p3, p1

    invoke-static {p3, p4}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/c31;->e:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/c31;->f:I

    iput p1, p0, Lcom/daaw/c31;->g:I

    const p1, 0x38d1b717    # 1.0E-4f

    iput p1, p0, Lcom/daaw/c31;->i:F

    return-void
.end method
