.class public Lcom/daaw/y21;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source ""


# instance fields
.field public final M:Ljava/lang/Runnable;

.field public N:I

.field public O:Lcom/daaw/nn0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/y21;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/daaw/a21;->k:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p0}, Lcom/daaw/y21;->t()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/daaw/xs1;->v0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    sget-object v0, Lcom/daaw/m21;->K3:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lcom/daaw/m21;->L3:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/daaw/y21;->N:I

    new-instance p2, Lcom/daaw/y21$a;

    invoke-direct {p2, p0}, Lcom/daaw/y21$a;-><init>(Lcom/daaw/y21;)V

    iput-object p2, p0, Lcom/daaw/y21;->M:Ljava/lang/Runnable;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static w(Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "skip"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    invoke-static {}, Lcom/daaw/xs1;->m()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setId(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/y21;->y()V

    return-void
.end method

.method public onFinishInflate()V
    .locals 0

    invoke-super {p0}, Landroid/view/ViewGroup;->onFinishInflate()V

    invoke-virtual {p0}, Lcom/daaw/y21;->x()V

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/daaw/y21;->y()V

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/y21;->O:Lcom/daaw/nn0;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/nn0;->W(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final t()Landroid/graphics/drawable/Drawable;
    .locals 3

    new-instance v0, Lcom/daaw/nn0;

    invoke-direct {v0}, Lcom/daaw/nn0;-><init>()V

    iput-object v0, p0, Lcom/daaw/y21;->O:Lcom/daaw/nn0;

    new-instance v1, Lcom/daaw/o31;

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-direct {v1, v2}, Lcom/daaw/o31;-><init>(F)V

    invoke-virtual {v0, v1}, Lcom/daaw/nn0;->U(Lcom/daaw/ll;)V

    iget-object v0, p0, Lcom/daaw/y21;->O:Lcom/daaw/nn0;

    const/4 v1, -0x1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/nn0;->W(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/daaw/y21;->O:Lcom/daaw/nn0;

    return-object v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Lcom/daaw/y21;->N:I

    return v0
.end method

.method public v(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/y21;->N:I

    invoke-virtual {p0}, Lcom/daaw/y21;->x()V

    return-void
.end method

.method public x()V
    .locals 8

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Lcom/daaw/y21;->w(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance v3, Landroidx/constraintlayout/widget/c;

    invoke-direct {v3}, Landroidx/constraintlayout/widget/c;-><init>()V

    invoke-virtual {v3, p0}, Landroidx/constraintlayout/widget/c;->g(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const/4 v4, 0x0

    :goto_1
    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v6

    sget v7, Lcom/daaw/m11;->b:I

    if-eq v6, v7, :cond_3

    invoke-static {v5}, Lcom/daaw/y21;->w(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    iget v6, p0, Lcom/daaw/y21;->N:I

    invoke-virtual {v3, v5, v7, v6, v4}, Landroidx/constraintlayout/widget/c;->i(IIIF)V

    const/high16 v5, 0x43b40000    # 360.0f

    sub-int v6, v0, v2

    int-to-float v6, v6

    div-float/2addr v5, v6

    add-float/2addr v4, v5

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v3, p0}, Landroidx/constraintlayout/widget/c;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void
.end method

.method public final y()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/y21;->M:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/daaw/y21;->M:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
