.class public Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;
.super Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;
.source "SimpleColorWheelRenderer.java"


# instance fields
.field private hsv:[F

.field private selectorFill:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;-><init>()V

    .line 10
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->selectorFill:Landroid/graphics/Paint;

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 11
    iput-object v0, p0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->hsv:[F

    return-void
.end method


# virtual methods
.method public draw()V
    .locals 22

    move-object/from16 v0, p0

    .line 15
    iget-object v1, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorCircleList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 17
    iget-object v2, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget-object v2, v2, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->targetCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 18
    iget-object v3, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v3, v3, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->density:I

    .line 19
    iget-object v4, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v4, v4, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->maxRadius:F

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v3, :cond_2

    int-to-float v8, v6

    add-int/lit8 v9, v3, -0x1

    int-to-float v9, v9

    div-float/2addr v8, v9

    mul-float v8, v8, v4

    .line 24
    iget-object v9, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v9, v9, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->cSize:F

    .line 25
    invoke-virtual {v0, v8, v9}, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->calcTotalCount(FF)I

    move-result v10

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_1

    const-wide v12, 0x401921fb54442d18L    # 6.283185307179586

    int-to-double v14, v11

    .line 28
    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v14, v14, v12

    int-to-double v12, v10

    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v14, v12

    const-wide v16, 0x400921fb54442d18L    # Math.PI

    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    div-double v12, v16, v12

    add-int/lit8 v18, v6, 0x1

    const/16 v19, 0x2

    rem-int/lit8 v5, v18, 0x2

    move/from16 v18, v6

    int-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v12, v12, v5

    add-double/2addr v14, v12

    float-to-double v5, v8

    .line 29
    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v12, v12, v5

    double-to-float v12, v12

    add-float/2addr v12, v2

    .line 30
    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v20

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v20

    double-to-float v5, v5

    add-float/2addr v5, v2

    .line 31
    iget-object v6, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->hsv:[F

    const-wide v20, 0x4066800000000000L    # 180.0

    mul-double v14, v14, v20

    div-double v14, v14, v16

    double-to-float v13, v14

    const/4 v14, 0x0

    aput v13, v6, v14

    div-float v13, v8, v4

    const/4 v15, 0x1

    .line 32
    aput v13, v6, v15

    .line 33
    iget-object v13, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v13, v13, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->lightness:F

    aput v13, v6, v19

    .line 34
    iget-object v6, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->selectorFill:Landroid/graphics/Paint;

    iget-object v13, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->hsv:[F

    invoke-static {v13}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v13

    invoke-virtual {v6, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    iget-object v6, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->selectorFill:Landroid/graphics/Paint;

    invoke-virtual/range {p0 .. p0}, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->getAlphaValueAsInt()I

    move-result v13

    invoke-virtual {v6, v13}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 37
    iget-object v6, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget-object v6, v6, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->targetCanvas:Landroid/graphics/Canvas;

    iget-object v13, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v13, v13, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->strokeWidth:F

    sub-float v13, v9, v13

    iget-object v15, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->selectorFill:Landroid/graphics/Paint;

    invoke-virtual {v6, v12, v5, v13, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    if-lt v7, v1, :cond_0

    .line 40
    iget-object v6, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorCircleList:Ljava/util/List;

    new-instance v13, Lcom/flask/colorpicker/ColorCircle;

    iget-object v15, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->hsv:[F

    invoke-direct {v13, v12, v5, v15}, Lcom/flask/colorpicker/ColorCircle;-><init>(FF[F)V

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 41
    :cond_0
    iget-object v6, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->colorCircleList:Ljava/util/List;

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/flask/colorpicker/ColorCircle;

    iget-object v13, v0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;->hsv:[F

    invoke-virtual {v6, v12, v5, v13}, Lcom/flask/colorpicker/ColorCircle;->set(FF[F)V

    :goto_2
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v11, v11, 0x1

    move/from16 v6, v18

    goto/16 :goto_1

    :cond_1
    move/from16 v18, v6

    const/4 v14, 0x0

    add-int/lit8 v6, v18, 0x1

    goto/16 :goto_0

    :cond_2
    return-void
.end method
