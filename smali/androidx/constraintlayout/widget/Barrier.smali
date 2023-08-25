.class public Landroidx/constraintlayout/widget/Barrier;
.super Landroidx/constraintlayout/widget/b;
.source ""


# instance fields
.field public x:I

.field public y:I

.field public z:Lcom/daaw/ja;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/b;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x8

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public g(Landroid/util/AttributeSet;)V
    .locals 6

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/b;->g(Landroid/util/AttributeSet;)V

    new-instance v0, Lcom/daaw/ja;

    invoke-direct {v0}, Lcom/daaw/ja;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->z:Lcom/daaw/ja;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/daaw/p21;->a1:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget v4, Lcom/daaw/p21;->j1:I

    if-ne v3, v4, :cond_0

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/Barrier;->setType(I)V

    goto :goto_1

    :cond_0
    sget v4, Lcom/daaw/p21;->i1:I

    if-ne v3, v4, :cond_1

    iget-object v4, p0, Landroidx/constraintlayout/widget/Barrier;->z:Lcom/daaw/ja;

    const/4 v5, 0x1

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    invoke-virtual {v4, v3}, Lcom/daaw/ja;->L0(Z)V

    goto :goto_1

    :cond_1
    sget v4, Lcom/daaw/p21;->k1:I

    if-ne v3, v4, :cond_2

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iget-object v4, p0, Landroidx/constraintlayout/widget/Barrier;->z:Lcom/daaw/ja;

    invoke-virtual {v4, v3}, Lcom/daaw/ja;->N0(I)V

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Landroidx/constraintlayout/widget/Barrier;->z:Lcom/daaw/ja;

    iput-object p1, p0, Landroidx/constraintlayout/widget/b;->s:Lcom/daaw/za0;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/b;->m()V

    return-void
.end method

.method public getMargin()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->z:Lcom/daaw/ja;

    invoke-virtual {v0}, Lcom/daaw/ja;->J0()I

    move-result v0

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/Barrier;->x:I

    return v0
.end method

.method public h(Lcom/daaw/qj;Z)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/Barrier;->x:I

    invoke-virtual {p0, p1, v0, p2}, Landroidx/constraintlayout/widget/Barrier;->o(Lcom/daaw/qj;IZ)V

    return-void
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->z:Lcom/daaw/ja;

    invoke-virtual {v0}, Lcom/daaw/ja;->H0()Z

    move-result v0

    return v0
.end method

.method public final o(Lcom/daaw/qj;IZ)V
    .locals 3

    iput p2, p0, Landroidx/constraintlayout/widget/Barrier;->y:I

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x5

    if-eqz p3, :cond_1

    iget p3, p0, Landroidx/constraintlayout/widget/Barrier;->x:I

    if-ne p3, v2, :cond_0

    :goto_0
    iput p2, p0, Landroidx/constraintlayout/widget/Barrier;->y:I

    goto :goto_2

    :cond_0
    if-ne p3, v1, :cond_3

    goto :goto_1

    :cond_1
    iget p3, p0, Landroidx/constraintlayout/widget/Barrier;->x:I

    if-ne p3, v2, :cond_2

    :goto_1
    iput v0, p0, Landroidx/constraintlayout/widget/Barrier;->y:I

    goto :goto_2

    :cond_2
    if-ne p3, v1, :cond_3

    goto :goto_0

    :cond_3
    :goto_2
    instance-of p2, p1, Lcom/daaw/ja;

    if-eqz p2, :cond_4

    check-cast p1, Lcom/daaw/ja;

    iget p2, p0, Landroidx/constraintlayout/widget/Barrier;->y:I

    invoke-virtual {p1, p2}, Lcom/daaw/ja;->M0(I)V

    :cond_4
    return-void
.end method

.method public setAllowsGoneWidget(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->z:Lcom/daaw/ja;

    invoke-virtual {v0, p1}, Lcom/daaw/ja;->L0(Z)V

    return-void
.end method

.method public setDpMargin(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float p1, p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    iget-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->z:Lcom/daaw/ja;

    invoke-virtual {v0, p1}, Lcom/daaw/ja;->N0(I)V

    return-void
.end method

.method public setMargin(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->z:Lcom/daaw/ja;

    invoke-virtual {v0, p1}, Lcom/daaw/ja;->N0(I)V

    return-void
.end method

.method public setType(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/widget/Barrier;->x:I

    return-void
.end method
