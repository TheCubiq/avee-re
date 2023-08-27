.class public Lcom/flask/colorpicker/ColorPickerPreference;
.super Landroid/preference/Preference;
.source "ColorPickerPreference.java"


# instance fields
.field protected alphaSlider:Z

.field protected border:Z

.field protected colorIndicator:Landroid/widget/ImageView;

.field protected density:I

.field protected lightSlider:Z

.field private pickerButtonCancel:Ljava/lang/String;

.field private pickerButtonOk:Ljava/lang/String;

.field private pickerColorEdit:Z

.field private pickerTitle:Ljava/lang/String;

.field protected selectedColor:I

.field protected wheelType:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 23
    iput p1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->selectedColor:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->selectedColor:I

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerPreference;->initWith(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 23
    iput p3, p0, Lcom/flask/colorpicker/ColorPickerPreference;->selectedColor:I

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerPreference;->initWith(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static darken(IF)I
    .locals 4

    .line 145
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    .line 146
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    .line 147
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    .line 148
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    int-to-float v1, v1

    mul-float v1, v1, p1

    float-to-int v1, v1

    const/4 v3, 0x0

    .line 151
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-float v2, v2

    mul-float v2, v2, p1

    float-to-int v2, v2

    .line 152
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-float p0, p0

    mul-float p0, p0, p1

    float-to-int p0, p0

    .line 153
    invoke-static {p0, v3}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 150
    invoke-static {v0, v1, v2, p0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method

.method private initWith(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 50
    sget-object v0, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 53
    :try_start_0
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_alphaSlider:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->alphaSlider:Z

    .line 54
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_lightnessSlider:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->lightSlider:Z

    .line 55
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_border:I

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->border:Z

    .line 57
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_density:I

    const/16 v2, 0x8

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->density:I

    .line 58
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_wheelType:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2}, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->indexOf(I)Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    move-result-object p2

    iput-object p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->wheelType:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    .line 60
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_initialColor:I

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->selectedColor:I

    .line 62
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_pickerColorEdit:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerColorEdit:Z

    .line 63
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_pickerTitle:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerTitle:Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p2, "Choose color"

    .line 65
    iput-object p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerTitle:Ljava/lang/String;

    .line 67
    :cond_0
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_pickerButtonCancel:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerButtonCancel:Ljava/lang/String;

    if-nez p2, :cond_1

    const-string p2, "cancel"

    .line 69
    iput-object p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerButtonCancel:Ljava/lang/String;

    .line 71
    :cond_1
    sget p2, Lcom/flask/colorpicker/R$styleable;->ColorPickerPreference_pickerButtonOk:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerButtonOk:Ljava/lang/String;

    if-nez p2, :cond_2

    const-string p2, "ok"

    .line 73
    iput-object p2, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerButtonOk:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    sget p1, Lcom/flask/colorpicker/R$layout;->color_widget:I

    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/ColorPickerPreference;->setWidgetLayoutResource(I)V

    return-void

    :catchall_0
    move-exception p2

    .line 76
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 77
    throw p2
.end method


# virtual methods
.method protected onBindView(Landroid/view/View;)V
    .locals 3

    .line 85
    invoke-super {p0, p1}, Landroid/preference/Preference;->onBindView(Landroid/view/View;)V

    .line 87
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerPreference;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->selectedColor:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->selectedColor:I

    const/high16 v1, 0x3f000000    # 0.5f

    .line 89
    invoke-static {v0, v1}, Lcom/flask/colorpicker/ColorPickerPreference;->darken(IF)I

    move-result v0

    .line 91
    :goto_0
    sget v1, Lcom/flask/colorpicker/R$id;->color_indicator:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->colorIndicator:Landroid/widget/ImageView;

    const/4 v1, 0x0

    .line 94
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 95
    instance-of v2, p1, Lcom/flask/colorpicker/ColorCircleDrawable;

    if-eqz v2, :cond_1

    .line 96
    move-object v1, p1

    check-cast v1, Lcom/flask/colorpicker/ColorCircleDrawable;

    :cond_1
    if-nez v1, :cond_2

    .line 99
    new-instance v1, Lcom/flask/colorpicker/ColorCircleDrawable;

    invoke-direct {v1, v0}, Lcom/flask/colorpicker/ColorCircleDrawable;-><init>(I)V

    .line 101
    :cond_2
    iget-object p1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->colorIndicator:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected onClick()V
    .locals 3

    .line 120
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->with(Landroid/content/Context;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerTitle:Ljava/lang/String;

    .line 121
    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->setTitle(Ljava/lang/String;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    move-result-object v0

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->selectedColor:I

    .line 122
    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->initialColor(I)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->border:Z

    .line 123
    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->showBorder(Z)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->wheelType:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    .line 124
    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->wheelType(Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    move-result-object v0

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->density:I

    .line 125
    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->density(I)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerColorEdit:Z

    .line 126
    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->showColorEdit(Z)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerButtonOk:Ljava/lang/String;

    new-instance v2, Lcom/flask/colorpicker/ColorPickerPreference$1;

    invoke-direct {v2, p0}, Lcom/flask/colorpicker/ColorPickerPreference$1;-><init>(Lcom/flask/colorpicker/ColorPickerPreference;)V

    .line 127
    invoke-virtual {v0, v1, v2}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->setPositiveButton(Ljava/lang/CharSequence;Lcom/flask/colorpicker/builder/ColorPickerClickListener;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->pickerButtonCancel:Ljava/lang/String;

    const/4 v2, 0x0

    .line 133
    invoke-virtual {v0, v1, v2}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    move-result-object v0

    .line 135
    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->alphaSlider:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->lightSlider:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->noSliders()Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    goto :goto_0

    .line 136
    :cond_0
    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->alphaSlider:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->lightnessSliderOnly()Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    goto :goto_0

    .line 137
    :cond_1
    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->lightSlider:Z

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->alphaSliderOnly()Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    .line 140
    :cond_2
    :goto_0
    invoke-virtual {v0}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->build()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    .line 141
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog;->show()V

    return-void
.end method

.method protected onSetInitialValue(ZLjava/lang/Object;)V
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 114
    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/ColorPickerPreference;->getPersistedInt(I)I

    move-result p1

    goto :goto_0

    :cond_0
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/ColorPickerPreference;->setValue(I)V

    return-void
.end method

.method public setValue(I)V
    .locals 1

    .line 105
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/ColorPickerPreference;->callChangeListener(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    iput p1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->selectedColor:I

    .line 107
    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/ColorPickerPreference;->persistInt(I)Z

    .line 108
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerPreference;->notifyChanged()V

    :cond_0
    return-void
.end method
