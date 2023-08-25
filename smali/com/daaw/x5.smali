.class public Lcom/daaw/x5;
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

    iput-object v0, p0, Lcom/daaw/x5;->a:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method

.method public l(Landroid/graphics/RectF;Lcom/daaw/ds1;Lcom/daaw/ds1;Z)V
    .locals 1

    iget-object p4, p0, Lcom/daaw/x5;->a:Ljava/util/Random;

    invoke-virtual {p4}, Ljava/util/Random;->nextFloat()F

    move-result p4

    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iput v0, p2, Lcom/daaw/ds1;->a:F

    iget v0, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    mul-float p1, p1, p4

    add-float/2addr v0, p1

    iput v0, p2, Lcom/daaw/ds1;->b:F

    const/4 p1, 0x0

    iput p1, p2, Lcom/daaw/ds1;->c:F

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p3, Lcom/daaw/ds1;->a:F

    iput p1, p3, Lcom/daaw/ds1;->b:F

    iput p1, p3, Lcom/daaw/ds1;->c:F

    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method
