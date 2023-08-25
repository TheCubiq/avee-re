.class public Lcom/daaw/w5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pc0;


# instance fields
.field public a:Ljava/util/Random;

.field public b:F

.field public c:F

.field public d:Lcom/daaw/bs1;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/daaw/w5;->a:Ljava/util/Random;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/w5;->b:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/daaw/w5;->c:F

    new-instance v1, Lcom/daaw/bs1;

    invoke-direct {v1, v0, v0}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/w5;->d:Lcom/daaw/bs1;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/w5;->e:Z

    iput-boolean v0, p0, Lcom/daaw/w5;->f:Z

    const/high16 v0, 0x43870000    # 270.0f

    invoke-virtual {p0, v0}, Lcom/daaw/w5;->q(F)Lcom/daaw/w5;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 2

    const-string v0, "vectorRelativeToCenter"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/w5;->f:Z

    const-string v0, "useRandomVectorInstead"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/w5;->e:Z

    const-string v0, "vectorAngle"

    const/high16 v1, 0x43870000    # 270.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/w5;->q(F)Lcom/daaw/w5;

    const-string v0, "vectorAngleZ"

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/w5;->r(F)Lcom/daaw/w5;

    return-void
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lcom/daaw/w5;->b:F

    return v0
.end method

.method public j()F
    .locals 1

    iget v0, p0, Lcom/daaw/w5;->c:F

    return v0
.end method

.method public l(Landroid/graphics/RectF;Lcom/daaw/ds1;Lcom/daaw/ds1;Z)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/w5;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    iget-object v1, p0, Lcom/daaw/w5;->a:Ljava/util/Random;

    invoke-virtual {v1}, Ljava/util/Random;->nextFloat()F

    move-result v1

    iget v2, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v3

    mul-float v3, v3, v0

    add-float/2addr v2, v3

    iput v2, p2, Lcom/daaw/ds1;->a:F

    iget v2, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    mul-float p1, p1, v1

    add-float/2addr v2, p1

    iput v2, p2, Lcom/daaw/ds1;->b:F

    const/4 p1, 0x0

    iput p1, p2, Lcom/daaw/ds1;->c:F

    iput p1, p3, Lcom/daaw/ds1;->c:F

    iget-boolean p1, p0, Lcom/daaw/w5;->e:Z

    const/high16 p2, 0x40000000    # 2.0f

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/w5;->a:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextFloat()F

    move-result p1

    iget-object v0, p0, Lcom/daaw/w5;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    mul-float p1, p1, p2

    sub-float/2addr p1, v2

    iput p1, p3, Lcom/daaw/ds1;->a:F

    mul-float v0, v0, p2

    sub-float/2addr v0, v2

    iput v0, p3, Lcom/daaw/ds1;->b:F

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lcom/daaw/w5;->f:Z

    if-eqz p1, :cond_1

    iget p1, p0, Lcom/daaw/w5;->b:F

    float-to-double v3, p1

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    double-to-float p1, v3

    mul-float v0, v0, p2

    sub-float/2addr v0, v2

    mul-float v1, v1, p2

    sub-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/daaw/bs1;->j(FF)F

    move-result p2

    add-float/2addr p1, p2

    invoke-static {p3, p1}, Lcom/daaw/bs1;->i(Lcom/daaw/ds1;F)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/w5;->d:Lcom/daaw/bs1;

    iget p2, p1, Lcom/daaw/bs1;->a:F

    iput p2, p3, Lcom/daaw/ds1;->a:F

    iget p1, p1, Lcom/daaw/bs1;->b:F

    iput p1, p3, Lcom/daaw/ds1;->b:F

    :goto_0
    if-eqz p4, :cond_2

    iget p1, p0, Lcom/daaw/w5;->c:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sub-float/2addr v2, p1

    iget p1, p3, Lcom/daaw/ds1;->a:F

    mul-float p1, p1, v2

    iput p1, p3, Lcom/daaw/ds1;->a:F

    iget p1, p3, Lcom/daaw/ds1;->b:F

    mul-float p1, p1, v2

    iput p1, p3, Lcom/daaw/ds1;->b:F

    iget p1, p0, Lcom/daaw/w5;->c:F

    iput p1, p3, Lcom/daaw/ds1;->c:F

    invoke-virtual {p3}, Lcom/daaw/ds1;->c()V

    :cond_2
    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/w5;->f:Z

    const-string v1, "vectorRelativeToCenter"

    const-string v2, "misc"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/w5;->e:Z

    const-string v1, "useRandomVectorInstead"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/w5;->c()F

    move-result v2

    const-string v1, "vectorAngle"

    const-string v3, "misc"

    const/4 v4, 0x0

    const/high16 v5, 0x43b40000    # 360.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    invoke-virtual {p0}, Lcom/daaw/w5;->j()F

    move-result v2

    const-string v1, "vectorAngleZ"

    const-string v3, "misc"

    const/high16 v4, -0x40800000    # -1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public q(F)Lcom/daaw/w5;
    .locals 0

    iput p1, p0, Lcom/daaw/w5;->b:F

    invoke-static {p1}, Lcom/daaw/bs1;->h(F)Lcom/daaw/bs1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/w5;->d:Lcom/daaw/bs1;

    return-object p0
.end method

.method public r(F)Lcom/daaw/w5;
    .locals 0

    iput p1, p0, Lcom/daaw/w5;->c:F

    return-object p0
.end method
