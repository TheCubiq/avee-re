.class public Lcom/daaw/u5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pc0;


# instance fields
.field public a:Ljava/util/Random;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/daaw/u5;->a:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method

.method public l(Landroid/graphics/RectF;Lcom/daaw/ds1;Lcom/daaw/ds1;Z)V
    .locals 3

    iget-object p4, p0, Lcom/daaw/u5;->a:Ljava/util/Random;

    invoke-virtual {p4}, Ljava/util/Random;->nextFloat()F

    move-result p4

    iget-object v0, p0, Lcom/daaw/u5;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    iget v1, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v2

    mul-float v2, v2, p4

    add-float/2addr v1, v2

    iput v1, p2, Lcom/daaw/ds1;->a:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    iput p1, p2, Lcom/daaw/ds1;->b:F

    const/4 p1, 0x0

    iput p1, p2, Lcom/daaw/ds1;->c:F

    const/high16 p2, 0x40000000    # 2.0f

    mul-float p4, p4, p2

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr p4, v1

    iput p4, p3, Lcom/daaw/ds1;->a:F

    mul-float v0, v0, p2

    sub-float/2addr v0, v1

    iput v0, p3, Lcom/daaw/ds1;->b:F

    iput p1, p3, Lcom/daaw/ds1;->c:F

    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method
