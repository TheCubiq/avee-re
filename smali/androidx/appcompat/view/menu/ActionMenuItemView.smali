.class public Landroidx/appcompat/view/menu/ActionMenuItemView;
.super Lcom/daaw/w4;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/j$a;
.implements Landroid/view/View$OnClickListener;
.implements Landroidx/appcompat/widget/ActionMenuView$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/view/menu/ActionMenuItemView$b;,
        Landroidx/appcompat/view/menu/ActionMenuItemView$a;
    }
.end annotation


# instance fields
.field public A:Landroidx/appcompat/view/menu/ActionMenuItemView$b;

.field public B:Z

.field public C:Z

.field public D:I

.field public E:I

.field public F:I

.field public v:Landroidx/appcompat/view/menu/g;

.field public w:Ljava/lang/CharSequence;

.field public x:Landroid/graphics/drawable/Drawable;

.field public y:Landroidx/appcompat/view/menu/e$b;

.field public z:Lcom/daaw/l30;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/w4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->g()Z

    move-result v1

    iput-boolean v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->B:Z

    sget-object v1, Lcom/daaw/x21;->v:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lcom/daaw/x21;->w:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->D:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p2, 0x42000000    # 32.0f

    mul-float p1, p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->F:I

    invoke-virtual {p0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->E:I

    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setSaveEnabled(Z)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->f()Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/g;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e(Landroidx/appcompat/view/menu/g;I)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/g;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, p0}, Landroidx/appcompat/view/menu/g;->i(Landroidx/appcompat/view/menu/j$a;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/g;->getItemId()I

    move-result p2

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setId(I)V

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/g;->isVisible()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    :goto_0
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/g;->isEnabled()Z

    move-result p2

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/g;->hasSubMenu()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->z:Lcom/daaw/l30;

    if-nez p1, :cond_1

    new-instance p1, Landroidx/appcompat/view/menu/ActionMenuItemView$a;

    invoke-direct {p1, p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$a;-><init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->z:Lcom/daaw/l30;

    :cond_1
    return-void
.end method

.method public f()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/w4;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final g()Z
    .locals 5

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    const/16 v3, 0x1e0

    if-ge v1, v3, :cond_2

    const/16 v4, 0x280

    if-lt v1, v4, :cond_0

    if-ge v2, v3, :cond_2

    :cond_0
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItemData()Landroidx/appcompat/view/menu/g;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    return-object v0
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->w:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->x:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/g;->B()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->B:Z

    if-nez v2, :cond_1

    iget-boolean v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->C:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    and-int/2addr v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->w:Ljava/lang/CharSequence;

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/g;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v0, :cond_3

    move-object v2, v1

    goto :goto_2

    :cond_3
    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/g;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/g;->getTooltipText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/g;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    :goto_3
    invoke-static {p0, v1}, Lcom/daaw/em1;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_6
    invoke-static {p0, v2}, Lcom/daaw/em1;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    :goto_4
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->y:Landroidx/appcompat/view/menu/e$b;

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    invoke-interface {p1, v0}, Landroidx/appcompat/view/menu/e$b;->a(Landroidx/appcompat/view/menu/g;)Z

    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->g()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->B:Z

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->h()V

    return-void
.end method

.method public onMeasure(II)V
    .locals 5

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->E:I

    if-ltz v1, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v4

    invoke-super {p0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/daaw/w4;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    const/high16 v3, -0x80000000

    if-ne v1, v3, :cond_1

    iget v3, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->D:I

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_1
    iget p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->D:I

    :goto_0
    const/high16 v3, 0x40000000    # 2.0f

    if-eq v1, v3, :cond_2

    iget v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->D:I

    if-lez v1, :cond_2

    if-ge v2, p1, :cond_2

    invoke-static {p1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-super {p0, p1, p2}, Lcom/daaw/w4;->onMeasure(II)V

    :cond_2
    if-nez v0, :cond_3

    iget-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->x:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    iget-object p2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->x:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    sub-int/2addr p1, p2

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v1

    invoke-super {p0, p1, p2, v0, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_3
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Landroid/widget/TextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/g;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->z:Lcom/daaw/l30;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/daaw/l30;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setCheckable(Z)V
    .locals 0

    return-void
.end method

.method public setChecked(Z)V
    .locals 0

    return-void
.end method

.method public setExpandedFormat(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->C:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->C:Z

    iget-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Landroidx/appcompat/view/menu/g;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/g;->c()V

    :cond_0
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->x:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iget v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->F:I

    if-le v0, v2, :cond_0

    int-to-float v3, v2

    int-to-float v0, v0

    div-float/2addr v3, v0

    int-to-float v0, v1

    mul-float v0, v0, v3

    float-to-int v1, v0

    move v0, v2

    :cond_0
    if-le v1, v2, :cond_1

    int-to-float v3, v2

    int-to-float v1, v1

    div-float/2addr v3, v1

    int-to-float v0, v0

    mul-float v0, v0, v3

    float-to-int v0, v0

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0, v0}, Lcom/daaw/w4;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->h()V

    return-void
.end method

.method public setItemInvoker(Landroidx/appcompat/view/menu/e$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->y:Landroidx/appcompat/view/menu/e$b;

    return-void
.end method

.method public setPadding(IIII)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->E:I

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setPadding(IIII)V

    return-void
.end method

.method public setPopupCallback(Landroidx/appcompat/view/menu/ActionMenuItemView$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->A:Landroidx/appcompat/view/menu/ActionMenuItemView$b;

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->w:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->h()V

    return-void
.end method
