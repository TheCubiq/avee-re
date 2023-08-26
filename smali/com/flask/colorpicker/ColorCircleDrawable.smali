.class public Lcom/flask/colorpicker/ColorCircleDrawable;
.super Landroid/graphics/drawable/ColorDrawable;
.source "ColorCircleDrawable.java"


# instance fields
.field private fillBackPaint:Landroid/graphics/Paint;

.field private fillPaint:Landroid/graphics/Paint;

.field private strokePaint:Landroid/graphics/Paint;

.field private strokeWidth:F


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 16
    invoke-direct {p0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 11
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p1

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->style(Landroid/graphics/Paint$Style;)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p1

    iget v0, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->strokeWidth:F

    invoke-virtual {p1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->stroke(F)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p1

    const v0, -0x616162

    invoke-virtual {p1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->strokePaint:Landroid/graphics/Paint;

    .line 12
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p1

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->style(Landroid/graphics/Paint$Style;)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->fillPaint:Landroid/graphics/Paint;

    .line 13
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p1

    const/16 v0, 0x1a

    invoke-static {v0}, Lcom/flask/colorpicker/builder/PaintBuilder;->createAlphaPatternShader(I)Landroid/graphics/Shader;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->shader(Landroid/graphics/Shader;)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->fillBackPaint:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 23
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41000000    # 8.0f

    div-float v1, v0, v1

    .line 25
    iput v1, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->strokeWidth:F

    .line 27
    iget-object v2, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 28
    iget-object v1, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorCircleDrawable;->getColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    iget v1, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->strokeWidth:F

    sub-float v1, v0, v1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->fillBackPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 30
    iget v1, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->strokeWidth:F

    sub-float v1, v0, v1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 31
    iget v1, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->strokeWidth:F

    sub-float v1, v0, v1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorCircleDrawable;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public setColor(I)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    .line 37
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorCircleDrawable;->invalidateSelf()V

    return-void
.end method
