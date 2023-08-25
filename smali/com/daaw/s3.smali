.class public Lcom/daaw/s3;
.super Landroid/widget/Button;
.source ""

# interfaces
.implements Lcom/daaw/vl1;
.implements Lcom/daaw/x7;
.implements Lcom/daaw/yl1;


# instance fields
.field public final p:Lcom/daaw/r3;

.field public final q:Lcom/daaw/v4;

.field public r:Lcom/daaw/f4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lcom/daaw/x01;->q:I

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/s3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/rl1;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/daaw/yk1;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lcom/daaw/r3;

    invoke-direct {p1, p0}, Lcom/daaw/r3;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/daaw/s3;->p:Lcom/daaw/r3;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/r3;->e(Landroid/util/AttributeSet;I)V

    new-instance p1, Lcom/daaw/v4;

    invoke-direct {p1, p0}, Lcom/daaw/v4;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/v4;->m(Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Lcom/daaw/v4;->b()V

    invoke-direct {p0}, Lcom/daaw/s3;->getEmojiTextViewHelper()Lcom/daaw/f4;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/daaw/f4;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()Lcom/daaw/f4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->r:Lcom/daaw/f4;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/f4;

    invoke-direct {v0, p0}, Lcom/daaw/f4;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lcom/daaw/s3;->r:Lcom/daaw/f4;

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->r:Lcom/daaw/f4;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/Button;->drawableStateChanged()V

    iget-object v0, p0, Lcom/daaw/s3;->p:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/r3;->b()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/v4;->b()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    sget-boolean v0, Lcom/daaw/x7;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/v4;->e()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    sget-boolean v0, Lcom/daaw/x7;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/v4;->f()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    sget-boolean v0, Lcom/daaw/x7;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/v4;->g()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    sget-boolean v0, Lcom/daaw/x7;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/v4;->h()[I

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-boolean v0, Lcom/daaw/x7;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/daaw/v4;->i()I

    move-result v0

    return v0

    :cond_2
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1

    invoke-super {p0}, Landroid/widget/Button;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/sk1;->p(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object v0

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->p:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/r3;->c()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->p:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/r3;->d()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    invoke-virtual {v0}, Lcom/daaw/v4;->j()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    invoke-virtual {v0}, Lcom/daaw/v4;->k()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 6

    invoke-super/range {p0 .. p5}, Landroid/widget/Button;->onLayout(ZIIII)V

    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/v4;->o(ZIIII)V

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz p1, :cond_0

    sget-boolean p2, Lcom/daaw/x7;->a:Z

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/v4;->l()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    invoke-virtual {p1}, Lcom/daaw/v4;->c()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/Button;->setAllCaps(Z)V

    invoke-direct {p0}, Lcom/daaw/s3;->getEmojiTextViewHelper()Lcom/daaw/f4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/f4;->d(Z)V

    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    sget-boolean v0, Lcom/daaw/x7;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/v4;->t(IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    sget-boolean v0, Lcom/daaw/x7;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/v4;->u([II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    sget-boolean v0, Lcom/daaw/x7;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/Button;->setAutoSizeTextTypeWithDefaults(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/daaw/v4;->v(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/daaw/s3;->p:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/r3;->f(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/daaw/s3;->p:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/r3;->g(I)V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/sk1;->q(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/Button;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/s3;->getEmojiTextViewHelper()Lcom/daaw/f4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/f4;->e(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/s3;->getEmojiTextViewHelper()Lcom/daaw/f4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/f4;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/Button;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportAllCaps(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/v4;->s(Z)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->p:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/r3;->i(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->p:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/r3;->j(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    invoke-virtual {v0, p1}, Lcom/daaw/v4;->w(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    invoke-virtual {p1}, Lcom/daaw/v4;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    invoke-virtual {v0, p1}, Lcom/daaw/v4;->x(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    invoke-virtual {p1}, Lcom/daaw/v4;->b()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/v4;->q(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextSize(IF)V
    .locals 1

    sget-boolean v0, Lcom/daaw/x7;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextSize(IF)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/s3;->q:Lcom/daaw/v4;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/v4;->A(IF)V

    :cond_1
    :goto_0
    return-void
.end method
