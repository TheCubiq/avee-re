.class public abstract Lcom/flask/colorpicker/slider/AbsCustomSlider;
.super Landroid/view/View;
.source "AbsCustomSlider.java"


# instance fields
.field protected bar:Landroid/graphics/Bitmap;

.field protected barCanvas:Landroid/graphics/Canvas;

.field protected barHeight:I

.field protected barOffsetX:I

.field protected bitmap:Landroid/graphics/Bitmap;

.field protected bitmapCanvas:Landroid/graphics/Canvas;

.field protected handleRadius:I

.field private inVerticalOrientation:Z

.field protected onValueChangedListener:Lcom/flask/colorpicker/slider/OnValueChangedListener;

.field protected showBorder:Z

.field protected value:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 30
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x14

    .line 22
    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->handleRadius:I

    const/4 v0, 0x5

    .line 23
    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barHeight:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 24
    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->showBorder:Z

    .line 27
    iput-boolean v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->inVerticalOrientation:Z

    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x14

    .line 22
    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->handleRadius:I

    const/4 v0, 0x5

    .line 23
    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barHeight:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 24
    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->showBorder:Z

    .line 27
    iput-boolean v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->inVerticalOrientation:Z

    .line 36
    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0x14

    .line 22
    iput p3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->handleRadius:I

    const/4 p3, 0x5

    .line 23
    iput p3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barHeight:I

    const/high16 p3, 0x3f800000    # 1.0f

    .line 24
    iput p3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    const/4 p3, 0x0

    .line 25
    iput-boolean p3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->showBorder:Z

    .line 27
    iput-boolean p3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->inVerticalOrientation:Z

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lcom/flask/colorpicker/R$styleable;->AbsCustomSlider:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 48
    :try_start_0
    sget p2, Lcom/flask/colorpicker/R$styleable;->AbsCustomSlider_inVerticalOrientation:I

    iget-boolean v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->inVerticalOrientation:Z

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->inVerticalOrientation:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 52
    throw p2
.end method


# virtual methods
.method protected createBitmaps()V
    .locals 5

    .line 69
    iget-boolean v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->inVerticalOrientation:Z

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getHeight()I

    move-result v0

    .line 71
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getWidth()I

    move-result v1

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getWidth()I

    move-result v0

    .line 74
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getHeight()I

    move-result v1

    .line 77
    :goto_0
    iget v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barOffsetX:I

    mul-int/lit8 v2, v2, 0x2

    sub-int v2, v0, v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barHeight:I

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bar:Landroid/graphics/Bitmap;

    .line 78
    new-instance v2, Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bar:Landroid/graphics/Bitmap;

    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barCanvas:Landroid/graphics/Canvas;

    .line 80
    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-ne v2, v0, :cond_1

    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-eq v2, v1, :cond_3

    .line 81
    :cond_1
    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 82
    :cond_2
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmap:Landroid/graphics/Bitmap;

    .line 83
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmap:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmapCanvas:Landroid/graphics/Canvas;

    :cond_3
    return-void
.end method

.method protected abstract drawBar(Landroid/graphics/Canvas;)V
.end method

.method protected abstract drawHandle(Landroid/graphics/Canvas;FF)V
.end method

.method protected getDimension(I)I
    .locals 1

    .line 179
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    return p1
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 89
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 93
    iget-boolean v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->inVerticalOrientation:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getHeight()I

    move-result v0

    .line 95
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getWidth()I

    move-result v2

    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 97
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    neg-int v3, v0

    int-to-float v3, v3

    .line 98
    invoke-virtual {p1, v3, v1}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getWidth()I

    move-result v0

    .line 101
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getHeight()I

    move-result v2

    .line 104
    :goto_0
    iget-object v3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bar:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmapCanvas:Landroid/graphics/Canvas;

    if-eqz v3, :cond_1

    const/4 v4, 0x0

    .line 105
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 106
    iget-object v3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmapCanvas:Landroid/graphics/Canvas;

    iget-object v4, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bar:Landroid/graphics/Bitmap;

    iget v5, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barOffsetX:I

    int-to-float v5, v5

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    sub-int v6, v2, v6

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    const/4 v7, 0x0

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 108
    iget v3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->handleRadius:I

    int-to-float v4, v3

    iget v5, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v0, v3

    int-to-float v0, v0

    mul-float v5, v5, v0

    add-float/2addr v4, v5

    int-to-float v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    .line 110
    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmapCanvas:Landroid/graphics/Canvas;

    invoke-virtual {p0, v2, v4, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->drawHandle(Landroid/graphics/Canvas;FF)V

    .line 111
    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v1, v1, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 129
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 130
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne v0, v2, :cond_1

    .line 135
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_1
    if-ne v0, v1, :cond_2

    .line 137
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 139
    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    if-ne v0, v2, :cond_4

    .line 144
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_4
    if-ne v0, v1, :cond_5

    .line 146
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_5
    const/4 p2, 0x0

    .line 148
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 123
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 124
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->updateBar()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 153
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    goto :goto_1

    .line 169
    :cond_0
    iget p1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->onValueChanged(F)V

    .line 170
    iget-object p1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->onValueChangedListener:Lcom/flask/colorpicker/slider/OnValueChangedListener;

    if-eqz p1, :cond_1

    .line 171
    iget v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    invoke-interface {p1, v0}, Lcom/flask/colorpicker/slider/OnValueChangedListener;->onValueChanged(F)V

    .line 172
    :cond_1
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->invalidate()V

    goto :goto_1

    .line 156
    :cond_2
    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bar:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    .line 157
    iget-boolean v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->inVerticalOrientation:Z

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v0, :cond_3

    .line 158
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barOffsetX:I

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bar:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    sub-float p1, v2, p1

    iput p1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    goto :goto_0

    .line 160
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barOffsetX:I

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bar:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    iput p1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    :goto_0
    const/4 p1, 0x0

    .line 162
    iget v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->value:F

    .line 163
    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->onValueChanged(F)V

    .line 164
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->invalidate()V

    :cond_4
    :goto_1
    return v1
.end method

.method protected abstract onValueChanged(F)V
.end method

.method public setOnValueChangedListener(Lcom/flask/colorpicker/slider/OnValueChangedListener;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->onValueChangedListener:Lcom/flask/colorpicker/slider/OnValueChangedListener;

    return-void
.end method

.method public setShowBorder(Z)V
    .locals 0

    .line 183
    iput-boolean p1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->showBorder:Z

    return-void
.end method

.method protected updateBar()V
    .locals 1

    .line 56
    sget v0, Lcom/flask/colorpicker/R$dimen;->default_slider_handler_radius:I

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getDimension(I)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->handleRadius:I

    .line 57
    sget v0, Lcom/flask/colorpicker/R$dimen;->default_slider_bar_height:I

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getDimension(I)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barHeight:I

    .line 58
    iget v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->handleRadius:I

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barOffsetX:I

    .line 60
    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->bar:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 61
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->createBitmaps()V

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->barCanvas:Landroid/graphics/Canvas;

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->drawBar(Landroid/graphics/Canvas;)V

    .line 63
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->invalidate()V

    return-void
.end method
