.class public Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;
.super Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;
.source "FlowerColorWheelRenderer.java"


# instance fields
.field private hsv:[F

.field private selectorFill:Landroid/graphics/Paint;

.field private sizeJitter:F


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

    iput-object v0, p0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->selectorFill:Landroid/graphics/Paint;

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 11
    iput-object v0, p0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->hsv:[F

    const v0, 0x3f99999a    # 1.2f

    .line 12
    iput v0, p0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->sizeJitter:F

    return-void
.end method


# virtual methods
.method public draw()V
    .locals 23

    move-object/from16 v0, p0

    .line 16
    iget-object v1, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorCircleList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 18
    iget-object v2, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget-object v2, v2, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->targetCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 19
    iget-object v4, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v4, v4, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->density:I

    .line 20
    iget-object v5, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v5, v5, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->strokeWidth:F

    .line 21
    iget-object v6, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v6, v6, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->maxRadius:F

    .line 22
    iget-object v7, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v7, v7, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->cSize:F

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v9, v4, :cond_3

    int-to-float v11, v9

    add-int/lit8 v12, v4, -0x1

    int-to-float v12, v12

    div-float v12, v11, v12

    int-to-float v13, v4

    div-float v14, v13, v3

    sub-float/2addr v11, v14

    div-float/2addr v11, v13

    mul-float v12, v12, v6

    const/high16 v13, 0x3fc00000    # 1.5f

    add-float/2addr v13, v5

    if-nez v9, :cond_0

    const/4 v11, 0x0

    goto :goto_1

    .line 28
    :cond_0
    iget v14, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->sizeJitter:F

    mul-float v14, v14, v7

    mul-float v11, v11, v14

    :goto_1
    add-float/2addr v11, v7

    invoke-static {v13, v11}, Ljava/lang/Math;->max(FF)F

    move-result v11

    .line 29
    invoke-virtual {v0, v12, v11}, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->calcTotalCount(FF)I

    move-result v13

    mul-int/lit8 v14, v4, 0x2

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v13

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v13, :cond_2

    const-wide v15, 0x401921fb54442d18L    # 6.283185307179586

    move/from16 v17, v4

    int-to-double v3, v14

    .line 32
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v15

    move/from16 v16, v9

    int-to-double v8, v13

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v8

    const-wide v18, 0x400921fb54442d18L    # Math.PI

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    div-double v8, v18, v8

    add-int/lit8 v20, v16, 0x1

    const/16 v21, 0x2

    rem-int/lit8 v15, v20, 0x2

    move/from16 v20, v13

    move/from16 v22, v14

    int-to-double v13, v15

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v13

    add-double/2addr v3, v8

    float-to-double v8, v12

    .line 33
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v13, v13, v8

    double-to-float v13, v13

    add-float/2addr v13, v2

    .line 34
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v14

    double-to-float v8, v8

    add-float/2addr v8, v2

    .line 35
    iget-object v9, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->hsv:[F

    const-wide v14, 0x4066800000000000L    # 180.0

    mul-double v3, v3, v14

    div-double v3, v3, v18

    double-to-float v3, v3

    const/4 v4, 0x0

    aput v3, v9, v4

    div-float v3, v12, v6

    const/4 v14, 0x1

    .line 36
    aput v3, v9, v14

    .line 37
    iget-object v3, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v3, v3, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->lightness:F

    aput v3, v9, v21

    .line 38
    iget-object v3, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->selectorFill:Landroid/graphics/Paint;

    iget-object v9, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->hsv:[F

    invoke-static {v9}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v9

    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 39
    iget-object v3, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->selectorFill:Landroid/graphics/Paint;

    invoke-virtual/range {p0 .. p0}, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->getAlphaValueAsInt()I

    move-result v9

    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 41
    iget-object v3, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget-object v3, v3, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->targetCanvas:Landroid/graphics/Canvas;

    sub-float v9, v11, v5

    iget-object v14, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->selectorFill:Landroid/graphics/Paint;

    invoke-virtual {v3, v13, v8, v9, v14}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    if-lt v10, v1, :cond_1

    .line 44
    iget-object v3, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorCircleList:Ljava/util/List;

    new-instance v9, Lcom/flask/colorpicker/ColorCircle;

    iget-object v14, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->hsv:[F

    invoke-direct {v9, v13, v8, v14}, Lcom/flask/colorpicker/ColorCircle;-><init>(FF[F)V

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 45
    :cond_1
    iget-object v3, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->colorCircleList:Ljava/util/List;

    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/flask/colorpicker/ColorCircle;

    iget-object v9, v0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;->hsv:[F

    invoke-virtual {v3, v13, v8, v9}, Lcom/flask/colorpicker/ColorCircle;->set(FF[F)V

    :goto_3
    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v14, v22, 0x1

    move/from16 v9, v16

    move/from16 v4, v17

    move/from16 v13, v20

    const/high16 v3, 0x40000000    # 2.0f

    goto/16 :goto_2

    :cond_2
    move/from16 v17, v4

    move/from16 v16, v9

    const/4 v4, 0x0

    add-int/lit8 v9, v16, 0x1

    move/from16 v4, v17

    const/high16 v3, 0x40000000    # 2.0f

    goto/16 :goto_0

    :cond_3
    return-void
.end method
