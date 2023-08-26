.class public Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
.super Ljava/lang/Object;
.source "ColorPickerDialogBuilder.java"


# instance fields
.field private alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

.field private builder:Landroidx/appcompat/app/AlertDialog$Builder;

.field private colorEdit:Landroid/widget/EditText;

.field private colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

.field private colorPreview:Landroid/widget/LinearLayout;

.field private defaultMargin:I

.field private defaultMarginTop:I

.field private initialColor:[Ljava/lang/Integer;

.field private isAlphaSliderEnabled:Z

.field private isBorderEnabled:Z

.field private isColorEditEnabled:Z

.field private isLightnessSliderEnabled:Z

.field private isPreviewEnabled:Z

.field private lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

.field private pickerContainer:Landroid/widget/LinearLayout;

.field private pickerCount:I


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, v0}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 5

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isLightnessSliderEnabled:Z

    .line 35
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isAlphaSliderEnabled:Z

    .line 36
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isBorderEnabled:Z

    const/4 v1, 0x0

    .line 37
    iput-boolean v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isColorEditEnabled:Z

    .line 38
    iput-boolean v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isPreviewEnabled:Z

    .line 39
    iput v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerCount:I

    .line 40
    iput v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->defaultMargin:I

    .line 41
    iput v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->defaultMarginTop:I

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Integer;

    const/4 v3, 0x0

    aput-object v3, v2, v1

    aput-object v3, v2, v0

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const/4 v4, 0x4

    aput-object v3, v2, v4

    .line 42
    iput-object v2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    .line 49
    sget v2, Lcom/flask/colorpicker/R$dimen;->default_slider_margin:I

    invoke-static {p1, v2}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getDimensionAsPx(Landroid/content/Context;I)I

    move-result v2

    iput v2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->defaultMargin:I

    .line 50
    sget v2, Lcom/flask/colorpicker/R$dimen;->default_margin_top:I

    invoke-static {p1, v2}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getDimensionAsPx(Landroid/content/Context;I)I

    move-result v2

    iput v2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->defaultMarginTop:I

    .line 52
    new-instance v2, Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-direct {v2, p1, p2}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    .line 53
    new-instance p2, Landroid/widget/LinearLayout;

    invoke-direct {p2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerContainer:Landroid/widget/LinearLayout;

    .line 54
    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 55
    iget-object p2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 56
    iget-object p2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerContainer:Landroid/widget/LinearLayout;

    iget v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->defaultMargin:I

    iget v2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->defaultMarginTop:I

    invoke-virtual {p2, v0, v2, v0, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 58
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 59
    iput v0, p2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 60
    new-instance v0, Lcom/flask/colorpicker/ColorPickerView;

    invoke-direct {v0, p1}, Lcom/flask/colorpicker/ColorPickerView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    .line 62
    iget-object p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    iget-object p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    iget-object p2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroidx/appcompat/app/AlertDialog$Builder;

    return-void
.end method

.method static synthetic access$000(Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;Landroid/content/DialogInterface;Lcom/flask/colorpicker/builder/ColorPickerClickListener;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->positiveButtonOnClick(Landroid/content/DialogInterface;Lcom/flask/colorpicker/builder/ColorPickerClickListener;)V

    return-void
.end method

.method private static getDimensionAsPx(Landroid/content/Context;I)I
    .locals 0

    .line 288
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p0

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method private getStartColor([Ljava/lang/Integer;)I
    .locals 1

    .line 283
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getStartOffset([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 284
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method private getStartOffset([Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 3

    const/4 v0, 0x0

    .line 272
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 273
    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_1

    .line 274
    aget-object v2, p1, v0

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 277
    div-int/lit8 v1, v0, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private positiveButtonOnClick(Landroid/content/DialogInterface;Lcom/flask/colorpicker/builder/ColorPickerClickListener;)V
    .locals 2

    .line 292
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v0

    .line 293
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v1}, Lcom/flask/colorpicker/ColorPickerView;->getAllColors()[Ljava/lang/Integer;

    move-result-object v1

    .line 294
    invoke-interface {p2, p1, v0, v1}, Lcom/flask/colorpicker/builder/ColorPickerClickListener;->onClick(Landroid/content/DialogInterface;I[Ljava/lang/Integer;)V

    return-void
.end method

.method public static with(Landroid/content/Context;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 68
    new-instance v0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    invoke-direct {v0, p0}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static with(Landroid/content/Context;I)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 72
    new-instance v0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    invoke-direct {v0, p0, p1}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method


# virtual methods
.method public alphaSliderOnly()Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 155
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isLightnessSliderEnabled:Z

    const/4 v0, 0x1

    .line 156
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isAlphaSliderEnabled:Z

    return-object p0
.end method

.method public build()Landroidx/appcompat/app/AlertDialog;
    .locals 10

    .line 208
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 209
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    invoke-direct {p0, v2}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getStartOffset([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/flask/colorpicker/ColorPickerView;->setInitialColors([Ljava/lang/Integer;I)V

    .line 210
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    iget-boolean v2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isBorderEnabled:Z

    invoke-virtual {v1, v2}, Lcom/flask/colorpicker/ColorPickerView;->setShowBorder(Z)V

    .line 212
    iget-boolean v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isLightnessSliderEnabled:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    .line 213
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    sget v3, Lcom/flask/colorpicker/R$dimen;->default_slider_height:I

    invoke-static {v0, v3}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getDimensionAsPx(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 214
    new-instance v3, Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-direct {v3, v0}, Lcom/flask/colorpicker/slider/LightnessSlider;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

    .line 215
    invoke-virtual {v3, v1}, Lcom/flask/colorpicker/slider/LightnessSlider;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 216
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerContainer:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 217
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {v1, v3}, Lcom/flask/colorpicker/ColorPickerView;->setLightnessSlider(Lcom/flask/colorpicker/slider/LightnessSlider;)V

    .line 218
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

    iget-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    invoke-direct {p0, v3}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getStartColor([Ljava/lang/Integer;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColor(I)V

    .line 219
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->lightnessSlider:Lcom/flask/colorpicker/slider/LightnessSlider;

    iget-boolean v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isBorderEnabled:Z

    invoke-virtual {v1, v3}, Lcom/flask/colorpicker/slider/LightnessSlider;->setShowBorder(Z)V

    .line 221
    :cond_0
    iget-boolean v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isAlphaSliderEnabled:Z

    if-eqz v1, :cond_1

    .line 222
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    sget v3, Lcom/flask/colorpicker/R$dimen;->default_slider_height:I

    invoke-static {v0, v3}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getDimensionAsPx(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 223
    new-instance v3, Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-direct {v3, v0}, Lcom/flask/colorpicker/slider/AlphaSlider;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    .line 224
    invoke-virtual {v3, v1}, Lcom/flask/colorpicker/slider/AlphaSlider;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 225
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerContainer:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 226
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {v1, v3}, Lcom/flask/colorpicker/ColorPickerView;->setAlphaSlider(Lcom/flask/colorpicker/slider/AlphaSlider;)V

    .line 227
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    iget-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    invoke-direct {p0, v3}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getStartColor([Ljava/lang/Integer;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColor(I)V

    .line 228
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->alphaSlider:Lcom/flask/colorpicker/slider/AlphaSlider;

    iget-boolean v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isBorderEnabled:Z

    invoke-virtual {v1, v3}, Lcom/flask/colorpicker/slider/AlphaSlider;->setShowBorder(Z)V

    .line 230
    :cond_1
    iget-boolean v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isColorEditEnabled:Z

    const/16 v3, 0x8

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    .line 231
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v1, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 232
    sget v6, Lcom/flask/colorpicker/R$layout;->color_edit:I

    invoke-static {v0, v6, v5}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/EditText;

    iput-object v6, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorEdit:Landroid/widget/EditText;

    const/4 v7, 0x1

    new-array v8, v7, [Landroid/text/InputFilter;

    .line 233
    new-instance v9, Landroid/text/InputFilter$AllCaps;

    invoke-direct {v9}, Landroid/text/InputFilter$AllCaps;-><init>()V

    aput-object v9, v8, v4

    invoke-virtual {v6, v8}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 234
    iget-object v6, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorEdit:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/widget/EditText;->setSingleLine()V

    .line 235
    iget-object v6, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorEdit:Landroid/widget/EditText;

    invoke-virtual {v6, v3}, Landroid/widget/EditText;->setVisibility(I)V

    .line 238
    iget-boolean v6, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isAlphaSliderEnabled:Z

    if-eqz v6, :cond_2

    const/16 v6, 0x9

    goto :goto_0

    :cond_2
    const/4 v6, 0x7

    .line 239
    :goto_0
    iget-object v8, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorEdit:Landroid/widget/EditText;

    new-array v7, v7, [Landroid/text/InputFilter;

    new-instance v9, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v9, v6}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v9, v7, v4

    invoke-virtual {v8, v7}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 241
    iget-object v6, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerContainer:Landroid/widget/LinearLayout;

    iget-object v7, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorEdit:Landroid/widget/EditText;

    invoke-virtual {v6, v7, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 243
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorEdit:Landroid/widget/EditText;

    iget-object v6, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    invoke-direct {p0, v6}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getStartColor([Ljava/lang/Integer;)I

    move-result v6

    iget-boolean v7, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isAlphaSliderEnabled:Z

    invoke-static {v6, v7}, Lcom/flask/colorpicker/Utils;->getHexString(IZ)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 244
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v6, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorEdit:Landroid/widget/EditText;

    invoke-virtual {v1, v6}, Lcom/flask/colorpicker/ColorPickerView;->setColorEdit(Landroid/widget/EditText;)V

    .line 246
    :cond_3
    iget-boolean v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isPreviewEnabled:Z

    if-eqz v1, :cond_7

    .line 247
    sget v1, Lcom/flask/colorpicker/R$layout;->color_preview:I

    invoke-static {v0, v1, v5}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPreview:Landroid/widget/LinearLayout;

    .line 248
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 249
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerContainer:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPreview:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 251
    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    array-length v1, v1

    if-nez v1, :cond_4

    .line 252
    sget v1, Lcom/flask/colorpicker/R$layout;->color_selector:I

    invoke-static {v0, v1, v5}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 253
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    .line 255
    :goto_1
    iget-object v2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    array-length v3, v2

    if-ge v1, v3, :cond_6

    iget v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerCount:I

    if-ge v1, v3, :cond_6

    .line 256
    aget-object v2, v2, v1

    if-nez v2, :cond_5

    goto :goto_2

    .line 258
    :cond_5
    sget v2, Lcom/flask/colorpicker/R$layout;->color_selector:I

    invoke-static {v0, v2, v5}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 259
    sget v3, Lcom/flask/colorpicker/R$id;->image_preview:I

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 260
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    iget-object v7, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    aget-object v7, v7, v1

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-direct {v6, v7}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 261
    iget-object v3, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPreview:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 264
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPreview:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 265
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPreview:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    invoke-direct {p0, v2}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->getStartOffset([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/flask/colorpicker/ColorPickerView;->setColorPreview(Landroid/widget/LinearLayout;Ljava/lang/Integer;)V

    .line 268
    :cond_7
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method public density(I)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setDensity(I)V

    return-object p0
.end method

.method public initialColor(I)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-object p0
.end method

.method public initialColors([I)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 3

    const/4 v0, 0x0

    .line 91
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor:[Ljava/lang/Integer;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 92
    aget v2, p1, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public lightnessSliderOnly()Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 161
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isLightnessSliderEnabled:Z

    const/4 v0, 0x0

    .line 162
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isAlphaSliderEnabled:Z

    return-object p0
.end method

.method public noSliders()Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 149
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isLightnessSliderEnabled:Z

    .line 150
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isAlphaSliderEnabled:Z

    return-object p0
.end method

.method public setColorEditTextColor(I)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorEditTextColor(I)V

    return-object p0
.end method

.method public setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    return-object p0
.end method

.method public setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    return-object p0
.end method

.method public setOnColorChangedListener(Lcom/flask/colorpicker/OnColorChangedListener;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->addOnColorChangedListener(Lcom/flask/colorpicker/OnColorChangedListener;)V

    return-object p0
.end method

.method public setOnColorSelectedListener(Lcom/flask/colorpicker/OnColorSelectedListener;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->addOnColorSelectedListener(Lcom/flask/colorpicker/OnColorSelectedListener;)V

    return-object p0
.end method

.method public setPickerCount(I)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IndexOutOfBoundsException;
        }
    .end annotation

    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    const/4 v1, 0x5

    if-gt p1, v1, :cond_1

    .line 201
    iput p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerCount:I

    if-le p1, v0, :cond_0

    .line 203
    iput-boolean v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isPreviewEnabled:Z

    :cond_0
    return-object p0

    .line 200
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Picker Can Only Support 1-5 Colors"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setPositiveButton(ILcom/flask/colorpicker/builder/ColorPickerClickListener;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 2

    .line 129
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    new-instance v1, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder$2;

    invoke-direct {v1, p0, p2}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder$2;-><init>(Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;Lcom/flask/colorpicker/builder/ColorPickerClickListener;)V

    invoke-virtual {v0, p1, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    return-object p0
.end method

.method public setPositiveButton(Ljava/lang/CharSequence;Lcom/flask/colorpicker/builder/ColorPickerClickListener;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    new-instance v1, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder$1;

    invoke-direct {v1, p0, p2}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder$1;-><init>(Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;Lcom/flask/colorpicker/builder/ColorPickerClickListener;)V

    invoke-virtual {v0, p1, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    return-object p0
.end method

.method public setTitle(I)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(I)Landroidx/appcompat/app/AlertDialog$Builder;

    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->builder:Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    return-object p0
.end method

.method public showAlphaSlider(Z)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 0

    .line 167
    iput-boolean p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isAlphaSliderEnabled:Z

    return-object p0
.end method

.method public showBorder(Z)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 0

    .line 177
    iput-boolean p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isBorderEnabled:Z

    return-object p0
.end method

.method public showColorEdit(Z)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 0

    .line 182
    iput-boolean p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isColorEditEnabled:Z

    return-object p0
.end method

.method public showColorPreview(Z)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 0

    .line 192
    iput-boolean p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isPreviewEnabled:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 194
    iput p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->pickerCount:I

    :cond_0
    return-object p0
.end method

.method public showLightnessSlider(Z)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 0

    .line 172
    iput-boolean p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->isLightnessSliderEnabled:Z

    return-object p0
.end method

.method public wheelType(Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
    .locals 1

    .line 98
    invoke-static {p1}, Lcom/flask/colorpicker/builder/ColorWheelRendererBuilder;->getRenderer(Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;)Lcom/flask/colorpicker/renderer/ColorWheelRenderer;

    move-result-object p1

    .line 99
    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->colorPickerView:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setRenderer(Lcom/flask/colorpicker/renderer/ColorWheelRenderer;)V

    return-object p0
.end method
