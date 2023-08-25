.class public Lcom/daaw/u3;
.super Landroid/widget/CheckedTextView;
.source ""

# interfaces
.implements Lcom/daaw/wl1;
.implements Lcom/daaw/vl1;
.implements Lcom/daaw/yl1;


# instance fields
.field public final p:Lcom/daaw/v3;

.field public final q:Lcom/daaw/r3;

.field public final r:Lcom/daaw/v4;

.field public s:Lcom/daaw/f4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lcom/daaw/x01;->s:I

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/u3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/rl1;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/CheckedTextView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/daaw/yk1;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lcom/daaw/v4;

    invoke-direct {p1, p0}, Lcom/daaw/v4;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/v4;->m(Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Lcom/daaw/v4;->b()V

    new-instance p1, Lcom/daaw/r3;

    invoke-direct {p1, p0}, Lcom/daaw/r3;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/daaw/u3;->q:Lcom/daaw/r3;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/r3;->e(Landroid/util/AttributeSet;I)V

    new-instance p1, Lcom/daaw/v3;

    invoke-direct {p1, p0}, Lcom/daaw/v3;-><init>(Landroid/widget/CheckedTextView;)V

    iput-object p1, p0, Lcom/daaw/u3;->p:Lcom/daaw/v3;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/v3;->d(Landroid/util/AttributeSet;I)V

    invoke-direct {p0}, Lcom/daaw/u3;->getEmojiTextViewHelper()Lcom/daaw/f4;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/daaw/f4;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()Lcom/daaw/f4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->s:Lcom/daaw/f4;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/f4;

    invoke-direct {v0, p0}, Lcom/daaw/f4;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lcom/daaw/u3;->s:Lcom/daaw/f4;

    :cond_0
    iget-object v0, p0, Lcom/daaw/u3;->s:Lcom/daaw/f4;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/CheckedTextView;->drawableStateChanged()V

    iget-object v0, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/v4;->b()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/u3;->q:Lcom/daaw/r3;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/r3;->b()V

    :cond_1
    iget-object v0, p0, Lcom/daaw/u3;->p:Lcom/daaw/v3;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/daaw/v3;->a()V

    :cond_2
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1

    invoke-super {p0}, Landroid/widget/CheckedTextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/sk1;->p(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object v0

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->q:Lcom/daaw/r3;

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

    iget-object v0, p0, Lcom/daaw/u3;->q:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/r3;->d()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCheckMarkTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->p:Lcom/daaw/v3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/v3;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCheckMarkTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->p:Lcom/daaw/v3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/v3;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    invoke-virtual {v0}, Lcom/daaw/v4;->j()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    invoke-virtual {v0}, Lcom/daaw/v4;->k()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lcom/daaw/g4;->a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setAllCaps(Z)V

    invoke-direct {p0}, Lcom/daaw/u3;->getEmojiTextViewHelper()Lcom/daaw/f4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/f4;->d(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/daaw/u3;->q:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/r3;->f(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/daaw/u3;->q:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/r3;->g(I)V

    :cond_0
    return-void
.end method

.method public setCheckMarkDrawable(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/CheckedTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/r4;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/u3;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/daaw/u3;->p:Lcom/daaw/v3;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/v3;->e()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckedTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/v4;->p()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckedTextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/v4;->p()V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/sk1;->q(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/u3;->getEmojiTextViewHelper()Lcom/daaw/f4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/f4;->e(Z)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->q:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/r3;->i(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->q:Lcom/daaw/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/r3;->j(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCheckMarkTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->p:Lcom/daaw/v3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/v3;->f(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportCheckMarkTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->p:Lcom/daaw/v3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/v3;->g(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    invoke-virtual {v0, p1}, Lcom/daaw/v4;->w(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    invoke-virtual {p1}, Lcom/daaw/v4;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    invoke-virtual {v0, p1}, Lcom/daaw/v4;->x(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    invoke-virtual {p1}, Lcom/daaw/v4;->b()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/CheckedTextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/daaw/u3;->r:Lcom/daaw/v4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/v4;->q(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
