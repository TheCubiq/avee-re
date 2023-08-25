.class public Lcom/daaw/ug;
.super Landroid/graphics/drawable/ColorDrawable;
.source ""


# instance fields
.field public a:F

.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object p1

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Lcom/daaw/lv0$b;->e(Landroid/graphics/Paint$Style;)Lcom/daaw/lv0$b;

    move-result-object p1

    iget v0, p0, Lcom/daaw/ug;->a:F

    invoke-virtual {p1, v0}, Lcom/daaw/lv0$b;->d(F)Lcom/daaw/lv0$b;

    move-result-object p1

    const v0, -0x616162

    invoke-virtual {p1, v0}, Lcom/daaw/lv0$b;->b(I)Lcom/daaw/lv0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ug;->b:Landroid/graphics/Paint;

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object p1

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Lcom/daaw/lv0$b;->e(Landroid/graphics/Paint$Style;)Lcom/daaw/lv0$b;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/lv0$b;->b(I)Lcom/daaw/lv0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ug;->c:Landroid/graphics/Paint;

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object p1

    const/16 v0, 0x1a

    invoke-static {v0}, Lcom/daaw/lv0;->b(I)Landroid/graphics/Shader;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/lv0$b;->c(Landroid/graphics/Shader;)Lcom/daaw/lv0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ug;->d:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41000000    # 8.0f

    div-float v1, v0, v1

    iput v1, p0, Lcom/daaw/ug;->a:F

    iget-object v2, p0, Lcom/daaw/ug;->b:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, Lcom/daaw/ug;->c:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/daaw/ug;->a:F

    sub-float v1, v0, v1

    iget-object v2, p0, Lcom/daaw/ug;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/daaw/ug;->a:F

    sub-float v1, v0, v1

    iget-object v2, p0, Lcom/daaw/ug;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/daaw/ug;->a:F

    sub-float v1, v0, v1

    iget-object v2, p0, Lcom/daaw/ug;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public setColor(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ColorDrawable;->invalidateSelf()V

    return-void
.end method
