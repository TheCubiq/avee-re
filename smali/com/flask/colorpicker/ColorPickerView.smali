.class public Lcom/flask/colorpicker/ColorPickerView;
.super Landroid/view/View;
.source "ColorPickerView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;
    }
.end annotation


# static fields
.field private static final STROKE_RATIO:F = 1.5f


# instance fields
.field private alpha:F

.field private alphaPatternPaint:Landroid/graphics/Paint;

.field private alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

.field private alphaSliderViewId:I

.field private backgroundColor:I

.field private colorChangedListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/flask/colorpicker/OnColorChangedListener;",
            ">;"
        }
    .end annotation
.end field

.field private colorEdit:Landroid/widget/EditText;

.field private colorPreview:Landroid/widget/LinearLayout;

.field private colorSelection:I

.field private colorTextChange:Landroid/text/TextWatcher;

.field private colorWheel:Landroid/graphics/Bitmap;

.field private colorWheelCanvas:Landroid/graphics/Canvas;

.field private colorWheelFill:Landroid/graphics/Paint;

.field private currentColor:Landroid/graphics/Bitmap;

.field private currentColorCanvas:Landroid/graphics/Canvas;

.field private currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

.field private density:I

.field private initialColor:Ljava/lang/Integer;

.field private initialColors:[Ljava/lang/Integer;

.field private lightness:F

.field private lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

.field private lightnessSliderViewId:I

.field private listeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/flask/colorpicker/OnColorSelectedListener;",
            ">;"
        }
    .end annotation
.end field

.field private pickerColorEditTextColor:Ljava/lang/Integer;

.field private renderer:Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

.field private selectorStroke:Landroid/graphics/Paint;

.field private showBorder:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 86
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x8

    .line 37
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 39
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    .line 40
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    const/4 v0, 0x0

    .line 41
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->backgroundColor:I

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 43
    iput-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    .line 44
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorSelection:I

    .line 47
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object v1

    iput-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelFill:Landroid/graphics/Paint;

    .line 48
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->selectorStroke:Landroid/graphics/Paint;

    .line 49
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaPatternPaint:Landroid/graphics/Paint;

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorChangedListeners:Ljava/util/ArrayList;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->listeners:Ljava/util/ArrayList;

    .line 58
    new-instance v0, Lcom/flask/colorpicker/ColorPickerView$1;

    invoke-direct {v0, p0}, Lcom/flask/colorpicker/ColorPickerView$1;-><init>(Lcom/flask/colorpicker/ColorPickerView;)V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorTextChange:Landroid/text/TextWatcher;

    .line 87
    invoke-direct {p0, p1, v2}, Lcom/flask/colorpicker/ColorPickerView;->initWith(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 91
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x8

    .line 37
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 39
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    .line 40
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    const/4 v0, 0x0

    .line 41
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->backgroundColor:I

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 43
    iput-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    .line 44
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorSelection:I

    .line 47
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object v1

    iput-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelFill:Landroid/graphics/Paint;

    .line 48
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->selectorStroke:Landroid/graphics/Paint;

    .line 49
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaPatternPaint:Landroid/graphics/Paint;

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorChangedListeners:Ljava/util/ArrayList;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->listeners:Ljava/util/ArrayList;

    .line 58
    new-instance v0, Lcom/flask/colorpicker/ColorPickerView$1;

    invoke-direct {v0, p0}, Lcom/flask/colorpicker/ColorPickerView$1;-><init>(Lcom/flask/colorpicker/ColorPickerView;)V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorTextChange:Landroid/text/TextWatcher;

    .line 92
    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerView;->initWith(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 96
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0x8

    .line 37
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    const/high16 p3, 0x3f800000    # 1.0f

    .line 39
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    .line 40
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    const/4 p3, 0x0

    .line 41
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->backgroundColor:I

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    aput-object v1, v0, p3

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 43
    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    .line 44
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->colorSelection:I

    .line 47
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelFill:Landroid/graphics/Paint;

    .line 48
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p3

    invoke-virtual {p3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object p3

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->selectorStroke:Landroid/graphics/Paint;

    .line 49
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p3

    invoke-virtual {p3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object p3

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaPatternPaint:Landroid/graphics/Paint;

    .line 52
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->colorChangedListeners:Ljava/util/ArrayList;

    .line 53
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->listeners:Ljava/util/ArrayList;

    .line 58
    new-instance p3, Lcom/flask/colorpicker/ColorPickerView$1;

    invoke-direct {p3, p0}, Lcom/flask/colorpicker/ColorPickerView$1;-><init>(Lcom/flask/colorpicker/ColorPickerView;)V

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->colorTextChange:Landroid/text/TextWatcher;

    .line 97
    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerView;->initWith(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 102
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/16 p3, 0x8

    .line 37
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    const/high16 p3, 0x3f800000    # 1.0f

    .line 39
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    .line 40
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    const/4 p3, 0x0

    .line 41
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->backgroundColor:I

    const/4 p4, 0x5

    new-array p4, p4, [Ljava/lang/Integer;

    const/4 v0, 0x0

    aput-object v0, p4, p3

    const/4 v1, 0x1

    aput-object v0, p4, v1

    const/4 v1, 0x2

    aput-object v0, p4, v1

    const/4 v1, 0x3

    aput-object v0, p4, v1

    const/4 v1, 0x4

    aput-object v0, p4, v1

    .line 43
    iput-object p4, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    .line 44
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerView;->colorSelection:I

    .line 47
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p4

    invoke-virtual {p4}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object p4

    iput-object p4, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelFill:Landroid/graphics/Paint;

    .line 48
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p3

    invoke-virtual {p3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object p3

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->selectorStroke:Landroid/graphics/Paint;

    .line 49
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object p3

    invoke-virtual {p3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object p3

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaPatternPaint:Landroid/graphics/Paint;

    .line 52
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->colorChangedListeners:Ljava/util/ArrayList;

    .line 53
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->listeners:Ljava/util/ArrayList;

    .line 58
    new-instance p3, Lcom/flask/colorpicker/ColorPickerView$1;

    invoke-direct {p3, p0}, Lcom/flask/colorpicker/ColorPickerView$1;-><init>(Lcom/flask/colorpicker/ColorPickerView;)V

    iput-object p3, p0, Lcom/flask/colorpicker/ColorPickerView;->colorTextChange:Landroid/text/TextWatcher;

    .line 103
    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerView;->initWith(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private drawColorWheel()V
    .locals 6

    .line 175
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelCanvas:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 176
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCanvas:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 178
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->renderer:Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

    if-nez v0, :cond_0

    return-void

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const v2, 0x3fc4cccc    # 1.5374999f

    sub-float v3, v0, v2

    .line 182
    iget v4, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    int-to-float v5, v4

    div-float/2addr v0, v5

    sub-float/2addr v3, v0

    add-int/lit8 v4, v4, -0x1

    int-to-float v0, v4

    div-float v0, v3, v0

    div-float/2addr v0, v1

    .line 185
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->renderer:Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

    invoke-interface {v1}, Lcom/flask/colorpicker/renderer/ColorWheelRenderer;->getRenderOption()Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    move-result-object v1

    .line 186
    iget v4, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    iput v4, v1, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->density:I

    .line 187
    iput v3, v1, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->maxRadius:F

    .line 188
    iput v0, v1, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->cSize:F

    .line 189
    iput v2, v1, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->strokeWidth:F

    .line 190
    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    iput v0, v1, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->alpha:F

    .line 191
    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    iput v0, v1, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->lightness:F

    .line 192
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelCanvas:Landroid/graphics/Canvas;

    iput-object v0, v1, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->targetCanvas:Landroid/graphics/Canvas;

    .line 194
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->renderer:Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

    invoke-interface {v0, v1}, Lcom/flask/colorpicker/renderer/ColorWheelRenderer;->initWith(Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;)V

    .line 195
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->renderer:Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

    invoke-interface {v0}, Lcom/flask/colorpicker/renderer/ColorWheelRenderer;->draw()V

    return-void
.end method

.method private findNearestByColor(I)Lcom/flask/colorpicker/ColorCircle;
    .locals 21

    const/4 v0, 0x3

    new-array v0, v0, [F

    move/from16 v1, p1

    .line 317
    invoke-static {v1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v1, 0x1

    .line 320
    aget v2, v0, v1

    float-to-double v2, v2

    const/4 v4, 0x0

    aget v5, v0, v4

    float-to-double v5, v5

    const-wide v7, 0x400921fb54442d18L    # Math.PI

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    const-wide v9, 0x4066800000000000L    # 180.0

    div-double/2addr v5, v9

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v5

    .line 321
    aget v5, v0, v1

    float-to-double v5, v5

    aget v0, v0, v4

    float-to-double v11, v0

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v11, v11, v7

    div-double/2addr v11, v9

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v11

    move-object/from16 v0, p0

    .line 323
    iget-object v11, v0, Lcom/flask/colorpicker/ColorPickerView;->renderer:Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

    invoke-interface {v11}, Lcom/flask/colorpicker/renderer/ColorWheelRenderer;->getColorCircleList()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    const-wide v13, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/flask/colorpicker/ColorCircle;

    .line 324
    invoke-virtual {v15}, Lcom/flask/colorpicker/ColorCircle;->getHsv()[F

    move-result-object v16

    .line 325
    aget v9, v16, v1

    float-to-double v9, v9

    aget v1, v16, v4

    move-wide/from16 v19, v5

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v7

    const-wide v17, 0x4066800000000000L    # 180.0

    div-double v4, v4, v17

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v9, v9, v4

    const/4 v1, 0x1

    .line 326
    aget v4, v16, v1

    float-to-double v4, v4

    const/4 v6, 0x0

    aget v1, v16, v6

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v7

    div-double v0, v0, v17

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v0

    sub-double v0, v2, v9

    sub-double v4, v19, v4

    mul-double v0, v0, v0

    mul-double v4, v4, v4

    add-double/2addr v0, v4

    cmpg-double v4, v0, v13

    if-gez v4, :cond_0

    move-wide v13, v0

    move-object v12, v15

    :cond_0
    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v9, v17

    move-wide/from16 v5, v19

    goto :goto_0

    :cond_1
    return-object v12
.end method

.method private findNearestByPosition(FF)Lcom/flask/colorpicker/ColorCircle;
    .locals 8

    .line 304
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->renderer:Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

    invoke-interface {v0}, Lcom/flask/colorpicker/renderer/ColorWheelRenderer;->getColorCircleList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/flask/colorpicker/ColorCircle;

    .line 305
    invoke-virtual {v4, p1, p2}, Lcom/flask/colorpicker/ColorCircle;->sqDist(FF)D

    move-result-wide v5

    cmpl-double v7, v2, v5

    if-lez v7, :cond_0

    move-object v1, v4

    move-wide v2, v5

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private initWith(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 107
    sget-object v0, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 109
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_density:I

    const/16 v0, 0xa

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    .line 110
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_initialColor:I

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    .line 112
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_pickerColorEditTextColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/flask/colorpicker/ColorPickerView;->pickerColorEditTextColor:Ljava/lang/Integer;

    .line 114
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_wheelType:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2}, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->indexOf(I)Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    move-result-object p2

    .line 115
    invoke-static {p2}, Lcom/flask/colorpicker/builder/ColorWheelRendererBuilder;->getRenderer(Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;)Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

    move-result-object p2

    .line 117
    sget v1, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_alphaSliderView:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSliderViewId:I

    .line 118
    sget v1, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_lightnessSliderView:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->lightnessSliderViewId:I

    .line 120
    invoke-virtual {p0, p2}, Lcom/flask/colorpicker/ColorPickerView;->setRenderer(Lcom/flask/colorpicker/renderer/ColorWheelRenderer;)V

    .line 121
    iget p2, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    invoke-virtual {p0, p2}, Lcom/flask/colorpicker/ColorPickerView;->setDensity(I)V

    .line 122
    iget-object p2, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/flask/colorpicker/ColorPickerView;->setInitialColor(IZ)V

    .line 124
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private setColorPreviewColor(I)V
    .locals 4

    .line 531
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorPreview:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    if-eqz v1, :cond_3

    iget v2, p0, Lcom/flask/colorpicker/ColorPickerView;->colorSelection:I

    array-length v3, v1

    if-gt v2, v3, :cond_3

    aget-object v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    .line 534
    :cond_0
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_3

    .line 535
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorPreview:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 538
    :cond_1
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorPreview:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorSelection:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 539
    instance-of v1, v0, Landroid/widget/LinearLayout;

    if-nez v1, :cond_2

    return-void

    .line 541
    :cond_2
    check-cast v0, Landroid/widget/LinearLayout;

    .line 542
    sget v1, Lcom/flask/colorpicker/R$id;->image_preview:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 543
    new-instance v1, Lcom/flask/colorpicker/ColorCircleDrawable;

    invoke-direct {v1, p1}, Lcom/flask/colorpicker/ColorCircleDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private setColorText(I)V
    .locals 2

    .line 547
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorEdit:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    .line 549
    :cond_0
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1, v1}, Lcom/flask/colorpicker/Utils;->getHexString(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setColorToSliders(I)V
    .locals 1

    .line 553
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

    if-eqz v0, :cond_0

    .line 554
    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColor(I)V

    .line 555
    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz v0, :cond_1

    .line 556
    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColor(I)V

    :cond_1
    return-void
.end method

.method private setHighlightedColor(I)V
    .locals 5

    .line 513
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorPreview:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_3

    .line 514
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorPreview:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 518
    iget-object v3, p0, Lcom/flask/colorpicker/ColorPickerView;->colorPreview:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 519
    instance-of v4, v3, Landroid/widget/LinearLayout;

    if-nez v4, :cond_1

    goto :goto_1

    .line 521
    :cond_1
    check-cast v3, Landroid/widget/LinearLayout;

    if-ne v2, p1, :cond_2

    const/4 v4, -0x1

    .line 523
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    goto :goto_1

    .line 525
    :cond_2
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method private updateColorWheel()V
    .locals 3

    .line 154
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getMeasuredWidth()I

    move-result v0

    .line 155
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getMeasuredHeight()I

    move-result v1

    if-ge v1, v0, :cond_0

    move v0, v1

    :cond_0
    if-gtz v0, :cond_1

    return-void

    .line 161
    :cond_1
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheel:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-eq v1, v0, :cond_3

    .line 162
    :cond_2
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheel:Landroid/graphics/Bitmap;

    .line 163
    new-instance v1, Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheel:Landroid/graphics/Bitmap;

    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelCanvas:Landroid/graphics/Canvas;

    .line 164
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaPatternPaint:Landroid/graphics/Paint;

    const/16 v2, 0x1a

    invoke-static {v2}, Lcom/flask/colorpicker/builder/PaintBuilder;->createAlphaPatternShader(I)Landroid/graphics/Shader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 166
    :cond_3
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColor:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-eq v1, v0, :cond_5

    .line 167
    :cond_4
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColor:Landroid/graphics/Bitmap;

    .line 168
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColor:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCanvas:Landroid/graphics/Canvas;

    .line 170
    :cond_5
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->drawColorWheel()V

    .line 171
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void
.end method


# virtual methods
.method public addOnColorChangedListener(Lcom/flask/colorpicker/OnColorChangedListener;)V
    .locals 1

    .line 414
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorChangedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addOnColorSelectedListener(Lcom/flask/colorpicker/OnColorSelectedListener;)V
    .locals 1

    .line 418
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->listeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected callOnColorChangedListeners(II)V
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorChangedListeners:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-eq p1, p2, :cond_0

    .line 264
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flask/colorpicker/OnColorChangedListener;

    .line 266
    :try_start_0
    invoke-interface {v0, p2}, Lcom/flask/colorpicker/OnColorChangedListener;->onColorChanged(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 268
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getAllColors()[Ljava/lang/Integer;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    return-object v0
.end method

.method public getSelectedColor()I
    .locals 2

    .line 341
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    if-eqz v0, :cond_0

    .line 342
    invoke-virtual {v0}, Lcom/flask/colorpicker/ColorCircle;->getColor()I

    move-result v0

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    invoke-static {v0, v1}, Lcom/flask/colorpicker/Utils;->colorAtLightness(IF)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 343
    :goto_0
    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    invoke-static {v1, v0}, Lcom/flask/colorpicker/Utils;->adjustAlpha(FI)I

    move-result v0

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 276
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 277
    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->backgroundColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 279
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f833333    # 1.025f

    div-float/2addr v0, v1

    .line 280
    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 281
    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheel:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    if-eqz v2, :cond_1

    .line 282
    iget-object v3, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelFill:Landroid/graphics/Paint;

    iget v4, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    invoke-virtual {v2, v4}, Lcom/flask/colorpicker/ColorCircle;->getHsvWithLightness(F)[F

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 283
    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelFill:Landroid/graphics/Paint;

    iget v3, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    const/high16 v4, 0x437f0000    # 255.0f

    mul-float v3, v3, v4

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 287
    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCanvas:Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    invoke-virtual {v3}, Lcom/flask/colorpicker/ColorCircle;->getX()F

    move-result v3

    iget-object v4, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    invoke-virtual {v4}, Lcom/flask/colorpicker/ColorCircle;->getY()F

    move-result v4

    const/high16 v5, 0x40800000    # 4.0f

    add-float/2addr v5, v0

    iget-object v6, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaPatternPaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 288
    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCanvas:Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    invoke-virtual {v3}, Lcom/flask/colorpicker/ColorCircle;->getX()F

    move-result v3

    iget-object v4, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    invoke-virtual {v4}, Lcom/flask/colorpicker/ColorCircle;->getY()F

    move-result v4

    iget-object v6, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelFill:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 290
    invoke-static {}, Lcom/flask/colorpicker/builder/PaintBuilder;->newPaint()Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->color(I)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v2

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->style(Landroid/graphics/Paint$Style;)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v3, v3, v0

    invoke-virtual {v2, v3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->stroke(F)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v2

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v3}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->xPerMode(Landroid/graphics/PorterDuff$Mode;)Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flask/colorpicker/builder/PaintBuilder$PaintHolder;->build()Landroid/graphics/Paint;

    move-result-object v2

    iput-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->selectorStroke:Landroid/graphics/Paint;

    .line 292
    iget-boolean v2, p0, Lcom/flask/colorpicker/ColorPickerView;->showBorder:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheelCanvas:Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    invoke-virtual {v3}, Lcom/flask/colorpicker/ColorCircle;->getX()F

    move-result v3

    iget-object v4, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    invoke-virtual {v4}, Lcom/flask/colorpicker/ColorCircle;->getY()F

    move-result v4

    iget-object v5, p0, Lcom/flask/colorpicker/ColorPickerView;->selectorStroke:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v5

    div-float/2addr v5, v1

    add-float/2addr v5, v0

    iget-object v6, p0, Lcom/flask/colorpicker/ColorPickerView;->selectorStroke:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 293
    :cond_0
    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->colorWheel:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v4, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 295
    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCanvas:Landroid/graphics/Canvas;

    iget-object v5, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    invoke-virtual {v5}, Lcom/flask/colorpicker/ColorCircle;->getX()F

    move-result v5

    iget-object v6, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    invoke-virtual {v6}, Lcom/flask/colorpicker/ColorCircle;->getY()F

    move-result v6

    iget-object v7, p0, Lcom/flask/colorpicker/ColorPickerView;->selectorStroke:Landroid/graphics/Paint;

    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v7

    div-float/2addr v7, v1

    add-float/2addr v0, v7

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->selectorStroke:Landroid/graphics/Paint;

    invoke-virtual {v2, v5, v6, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 296
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColor:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v4, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 136
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 138
    iget p1, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSliderViewId:I

    if-eqz p1, :cond_0

    .line 139
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getRootView()Landroid/view/View;

    move-result-object p1

    iget p2, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSliderViewId:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setAlphaSlider(Lcom/flask/colorpicker/slider/AlphaSlider;)V

    .line 140
    :cond_0
    iget p1, p0, Lcom/flask/colorpicker/ColorPickerView;->lightnessSliderViewId:I

    if-eqz p1, :cond_1

    .line 141
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getRootView()Landroid/view/View;

    move-result-object p1

    iget p2, p0, Lcom/flask/colorpicker/ColorPickerView;->lightnessSliderViewId:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setLightnessSlider(Lcom/flask/colorpicker/slider/LightnessSlider;)V

    .line 143
    :cond_1
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->updateColorWheel()V

    .line 144
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->findNearestByColor(I)Lcom/flask/colorpicker/ColorCircle;

    move-result-object p1

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 200
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 201
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne v0, v2, :cond_1

    .line 206
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_1
    if-ne v0, v1, :cond_2

    .line 208
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 210
    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    if-ne v0, v2, :cond_4

    .line 215
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_4
    if-ne v0, v1, :cond_5

    .line 217
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_5
    const/4 p2, 0x0

    :goto_1
    if-ge p2, p1, :cond_6

    move p1, p2

    .line 221
    :cond_6
    invoke-virtual {p0, p1, p1}, Lcom/flask/colorpicker/ColorPickerView;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 149
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 150
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->updateColorWheel()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 226
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    goto :goto_1

    .line 242
    :cond_0
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result p1

    .line 243
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->listeners:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 244
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/flask/colorpicker/OnColorSelectedListener;

    .line 246
    :try_start_0
    invoke-interface {v2, p1}, Lcom/flask/colorpicker/OnColorSelectedListener;->onColorSelected(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 248
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 252
    :cond_1
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorToSliders(I)V

    .line 253
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorText(I)V

    .line 254
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorPreviewColor(I)V

    .line 255
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    goto :goto_1

    .line 229
    :cond_2
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v0

    .line 230
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, v2, p1}, Lcom/flask/colorpicker/ColorPickerView;->findNearestByPosition(FF)Lcom/flask/colorpicker/ColorCircle;

    move-result-object p1

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    .line 231
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result p1

    .line 233
    invoke-virtual {p0, v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->callOnColorChangedListeners(II)V

    .line 235
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    .line 236
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorToSliders(I)V

    .line 237
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->updateColorWheel()V

    .line 238
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    :goto_1
    return v1
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .line 129
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    .line 130
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->updateColorWheel()V

    .line 131
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->findNearestByColor(I)Lcom/flask/colorpicker/ColorCircle;

    move-result-object p1

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    return-void
.end method

.method public setAlphaSlider(Lcom/flask/colorpicker/slider/AlphaSlider;)V
    .locals 1

    .line 430
    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz p1, :cond_0

    .line 432
    invoke-virtual {p1, p0}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColorPicker(Lcom/flask/colorpicker/ColorPickerView;)V

    .line 433
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setAlphaValue(F)V
    .locals 3

    .line 398
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v0

    .line 400
    iput p1, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    .line 401
    invoke-static {p1}, Lcom/flask/colorpicker/Utils;->alphaValueAsInt(F)I

    move-result p1

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    iget v2, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    invoke-virtual {v1, v2}, Lcom/flask/colorpicker/ColorCircle;->getHsvWithLightness(F)[F

    move-result-object v1

    invoke-static {p1, v1}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    .line 402
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorEdit:Landroid/widget/EditText;

    if-eqz v1, :cond_1

    .line 403
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v2}, Lcom/flask/colorpicker/Utils;->getHexString(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 404
    :cond_1
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 405
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColor(I)V

    .line 407
    :cond_2
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->callOnColorChangedListeners(II)V

    .line 409
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->updateColorWheel()V

    .line 410
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void
.end method

.method public setColor(IZ)V
    .locals 0

    .line 392
    invoke-virtual {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerView;->setInitialColor(IZ)V

    .line 393
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->updateColorWheel()V

    .line 394
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void
.end method

.method public setColorEdit(Landroid/widget/EditText;)V
    .locals 1

    .line 438
    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorEdit:Landroid/widget/EditText;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 440
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setVisibility(I)V

    .line 441
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorEdit:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorTextChange:Landroid/text/TextWatcher;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 442
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->pickerColorEditTextColor:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorEditTextColor(I)V

    :cond_0
    return-void
.end method

.method public setColorEditTextColor(I)V
    .locals 1

    .line 447
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->pickerColorEditTextColor:Ljava/lang/Integer;

    .line 448
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 449
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setColorPreview(Landroid/widget/LinearLayout;Ljava/lang/Integer;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 465
    :cond_0
    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorPreview:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    if-nez p2, :cond_1

    .line 467
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 468
    :cond_1
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v1

    if-eqz v1, :cond_5

    .line 469
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    :goto_0
    if-ge v0, v1, :cond_5

    .line 473
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 474
    instance-of v3, v2, Landroid/widget/LinearLayout;

    if-nez v3, :cond_3

    goto :goto_1

    .line 476
    :cond_3
    check-cast v2, Landroid/widget/LinearLayout;

    .line 477
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v0, v3, :cond_4

    const/4 v3, -0x1

    .line 478
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 480
    :cond_4
    sget v3, Lcom/flask/colorpicker/R$id;->image_preview:I

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const/4 v3, 0x1

    .line 481
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 482
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 483
    new-instance v3, Lcom/flask/colorpicker/ColorPickerView$2;

    invoke-direct {v3, p0}, Lcom/flask/colorpicker/ColorPickerView$2;-><init>(Lcom/flask/colorpicker/ColorPickerView;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return-void
.end method

.method public setDensity(I)V
    .locals 1

    const/4 v0, 0x2

    .line 453
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/flask/colorpicker/ColorPickerView;->density:I

    .line 454
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void
.end method

.method public setInitialColor(IZ)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 360
    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 362
    invoke-static {p1}, Lcom/flask/colorpicker/Utils;->getAlphaPercent(I)F

    move-result v1

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    const/4 v1, 0x2

    .line 363
    aget v0, v0, v1

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    .line 364
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorSelection:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 365
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    .line 366
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorPreviewColor(I)V

    .line 367
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorToSliders(I)V

    .line 368
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->colorEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 369
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorText(I)V

    .line 370
    :cond_0
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->findNearestByColor(I)Lcom/flask/colorpicker/ColorCircle;

    move-result-object p1

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    return-void
.end method

.method public setInitialColors([Ljava/lang/Integer;I)V
    .locals 0

    .line 351
    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    .line 352
    iput p2, p0, Lcom/flask/colorpicker/ColorPickerView;->colorSelection:I

    .line 353
    aget-object p1, p1, p2

    if-nez p1, :cond_0

    const/4 p1, -0x1

    .line 354
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 355
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerView;->setInitialColor(IZ)V

    return-void
.end method

.method public setLightness(F)V
    .locals 3

    .line 374
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v0

    .line 376
    iput p1, p0, Lcom/flask/colorpicker/ColorPickerView;->lightness:F

    .line 377
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    if-eqz v1, :cond_3

    .line 378
    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->alpha:F

    invoke-static {v1}, Lcom/flask/colorpicker/Utils;->alphaValueAsInt(F)I

    move-result v1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->currentColorCircle:Lcom/flask/colorpicker/ColorCircle;

    invoke-virtual {v2, p1}, Lcom/flask/colorpicker/ColorCircle;->getHsvWithLightness(F)[F

    move-result-object p1

    invoke-static {v1, p1}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    .line 379
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorEdit:Landroid/widget/EditText;

    if-eqz v1, :cond_1

    .line 380
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v2}, Lcom/flask/colorpicker/Utils;->getHexString(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 381
    :cond_1
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 382
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColor(I)V

    .line 384
    :cond_2
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColor:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->callOnColorChangedListeners(II)V

    .line 386
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->updateColorWheel()V

    .line 387
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    :cond_3
    return-void
.end method

.method public setLightnessSlider(Lcom/flask/colorpicker/slider/LightnessSlider;)V
    .locals 1

    .line 422
    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

    if-eqz p1, :cond_0

    .line 424
    invoke-virtual {p1, p0}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColorPicker(Lcom/flask/colorpicker/ColorPickerView;)V

    .line 425
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setRenderer(Lcom/flask/colorpicker/renderer/ColorWheelRenderer;)V
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->renderer:Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

    .line 459
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void
.end method

.method public setSelectedColor(I)V
    .locals 1

    .line 498
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    if-eqz v0, :cond_2

    array-length v0, v0

    if-ge v0, p1, :cond_0

    goto :goto_0

    .line 500
    :cond_0
    iput p1, p0, Lcom/flask/colorpicker/ColorPickerView;->colorSelection:I

    .line 501
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setHighlightedColor(I)V

    .line 502
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->initialColors:[Ljava/lang/Integer;

    aget-object p1, v0, p1

    if-nez p1, :cond_1

    return-void

    .line 505
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/flask/colorpicker/ColorPickerView;->setColor(IZ)V

    :cond_2
    :goto_0
    return-void
.end method

.method public setShowBorder(Z)V
    .locals 0

    .line 509
    iput-boolean p1, p0, Lcom/flask/colorpicker/ColorPickerView;->showBorder:Z

    return-void
.end method
