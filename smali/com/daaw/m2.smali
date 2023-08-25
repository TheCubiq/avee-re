.class public Lcom/daaw/m2;
.super Lcom/daaw/d;
.source ""


# instance fields
.field public A:I

.field public B:Landroid/graphics/Paint;

.field public C:Landroid/graphics/Paint;

.field public D:Landroid/graphics/Paint;

.field public E:Landroid/graphics/Paint;

.field public F:Landroid/graphics/Paint;

.field public G:Landroid/graphics/Bitmap;

.field public H:Landroid/graphics/Canvas;

.field public I:Lcom/daaw/xg;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/m2;->B:Landroid/graphics/Paint;

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/m2;->C:Landroid/graphics/Paint;

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/m2;->D:Landroid/graphics/Paint;

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object p1

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Lcom/daaw/lv0$b;->b(I)Lcom/daaw/lv0$b;

    move-result-object p1

    sget-object p2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, p2}, Lcom/daaw/lv0$b;->f(Landroid/graphics/PorterDuff$Mode;)Lcom/daaw/lv0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/m2;->E:Landroid/graphics/Paint;

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/m2;->F:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    invoke-super {p0}, Lcom/daaw/d;->a()V

    iget-object v0, p0, Lcom/daaw/m2;->B:Landroid/graphics/Paint;

    iget v1, p0, Lcom/daaw/d;->w:I

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lcom/daaw/lv0;->b(I)Landroid/graphics/Shader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/m2;->G:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/daaw/m2;->G:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/daaw/m2;->H:Landroid/graphics/Canvas;

    return-void
.end method

.method public b(Landroid/graphics/Canvas;)V
    .locals 12

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v5, v0

    int-to-float v1, v1

    iget-object v7, p0, Lcom/daaw/m2;->B:Landroid/graphics/Paint;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move v6, v1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    div-int/lit16 v2, v0, 0x100

    const/4 v3, 0x2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-gt v3, v0, :cond_0

    int-to-float v7, v3

    add-int/lit8 v4, v0, -0x1

    int-to-float v4, v4

    div-float v4, v7, v4

    iget-object v5, p0, Lcom/daaw/m2;->C:Landroid/graphics/Paint;

    iget v6, p0, Lcom/daaw/m2;->A:I

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v5, p0, Lcom/daaw/m2;->C:Landroid/graphics/Paint;

    const/high16 v6, 0x437f0000    # 255.0f

    mul-float v4, v4, v6

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    const/4 v8, 0x0

    add-int/2addr v3, v2

    int-to-float v9, v3

    iget-object v11, p0, Lcom/daaw/m2;->C:Landroid/graphics/Paint;

    move-object v6, p1

    move v10, v1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Landroid/graphics/Canvas;FF)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/m2;->D:Landroid/graphics/Paint;

    iget v1, p0, Lcom/daaw/m2;->A:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/daaw/m2;->D:Landroid/graphics/Paint;

    iget v1, p0, Lcom/daaw/d;->x:F

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-boolean v0, p0, Lcom/daaw/d;->y:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/d;->v:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/daaw/m2;->E:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    iget v0, p0, Lcom/daaw/d;->x:F

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f400000    # 0.75f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/m2;->H:Landroid/graphics/Canvas;

    const/4 v1, 0x0

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lcom/daaw/m2;->H:Landroid/graphics/Canvas;

    iget v1, p0, Lcom/daaw/d;->v:I

    int-to-float v1, v1

    mul-float v1, v1, v2

    const/high16 v3, 0x40800000    # 4.0f

    add-float/2addr v1, v3

    iget-object v4, p0, Lcom/daaw/m2;->B:Landroid/graphics/Paint;

    invoke-virtual {v0, p2, p3, v1, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/daaw/m2;->H:Landroid/graphics/Canvas;

    iget v1, p0, Lcom/daaw/d;->v:I

    int-to-float v1, v1

    mul-float v1, v1, v2

    add-float/2addr v1, v3

    iget-object v3, p0, Lcom/daaw/m2;->D:Landroid/graphics/Paint;

    invoke-virtual {v0, p2, p3, v1, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/daaw/lv0$b;->b(I)Lcom/daaw/lv0$b;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Lcom/daaw/lv0$b;->e(Landroid/graphics/Paint$Style;)Lcom/daaw/lv0$b;

    move-result-object v0

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-virtual {v0, v1}, Lcom/daaw/lv0$b;->d(F)Lcom/daaw/lv0$b;

    move-result-object v0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1}, Lcom/daaw/lv0$b;->f(Landroid/graphics/PorterDuff$Mode;)Lcom/daaw/lv0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/m2;->F:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/daaw/m2;->H:Landroid/graphics/Canvas;

    iget v3, p0, Lcom/daaw/d;->v:I

    int-to-float v3, v3

    mul-float v3, v3, v2

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    add-float/2addr v3, v0

    iget-object v0, p0, Lcom/daaw/m2;->F:Landroid/graphics/Paint;

    invoke-virtual {v1, p2, p3, v3, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object p2, p0, Lcom/daaw/m2;->G:Landroid/graphics/Bitmap;

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v0, p3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/daaw/d;->v:I

    int-to-float v0, v0

    mul-float v0, v0, v2

    iget-object v1, p0, Lcom/daaw/m2;->D:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method public f(F)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m2;->I:Lcom/daaw/xg;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/xg;->setAlphaValue(F)V

    :cond_0
    return-void
.end method

.method public setColor(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/m2;->A:I

    invoke-static {p1}, Lcom/daaw/zq1;->d(I)F

    move-result p1

    iput p1, p0, Lcom/daaw/d;->x:F

    iget-object p1, p0, Lcom/daaw/d;->r:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/d;->g()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setColorPicker(Lcom/daaw/xg;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/m2;->I:Lcom/daaw/xg;

    return-void
.end method
