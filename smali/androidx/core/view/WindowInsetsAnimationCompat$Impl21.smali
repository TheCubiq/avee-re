.class Landroidx/core/view/WindowInsetsAnimationCompat$Impl21;
.super Landroidx/core/view/WindowInsetsAnimationCompat$Impl;
.source "WindowInsetsAnimationCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsAnimationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Impl21"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener;
    }
.end annotation


# direct methods
.method constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0

    .line 585
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/core/view/WindowInsetsAnimationCompat$Impl;-><init>(ILandroid/view/animation/Interpolator;J)V

    return-void
.end method

.method static buildAnimationMask(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat;)I
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x100

    if-gt v0, v2, :cond_1

    .line 646
    invoke-virtual {p0, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v2

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/core/graphics/Insets;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    or-int/2addr v1, v0

    :cond_0
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method static computeAnimationBounds(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat;I)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
    .locals 4

    .line 623
    invoke-virtual {p0, p2}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object p0

    .line 624
    invoke-virtual {p1, p2}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object p1

    .line 625
    iget p2, p0, Landroidx/core/graphics/Insets;->left:I

    iget v0, p1, Landroidx/core/graphics/Insets;->left:I

    .line 626
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget v0, p0, Landroidx/core/graphics/Insets;->top:I

    iget v1, p1, Landroidx/core/graphics/Insets;->top:I

    .line 627
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Landroidx/core/graphics/Insets;->right:I

    iget v2, p1, Landroidx/core/graphics/Insets;->right:I

    .line 628
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v2, p0, Landroidx/core/graphics/Insets;->bottom:I

    iget v3, p1, Landroidx/core/graphics/Insets;->bottom:I

    .line 629
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 625
    invoke-static {p2, v0, v1, v2}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object p2

    .line 631
    iget v0, p0, Landroidx/core/graphics/Insets;->left:I

    iget v1, p1, Landroidx/core/graphics/Insets;->left:I

    .line 632
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, Landroidx/core/graphics/Insets;->top:I

    iget v2, p1, Landroidx/core/graphics/Insets;->top:I

    .line 633
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v2, p0, Landroidx/core/graphics/Insets;->right:I

    iget v3, p1, Landroidx/core/graphics/Insets;->right:I

    .line 634
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget p0, p0, Landroidx/core/graphics/Insets;->bottom:I

    iget p1, p1, Landroidx/core/graphics/Insets;->bottom:I

    .line 635
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 631
    invoke-static {v0, v1, v2, p0}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object p0

    .line 637
    new-instance p1, Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;

    invoke-direct {p1, p2, p0}, Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;-><init>(Landroidx/core/graphics/Insets;Landroidx/core/graphics/Insets;)V

    return-object p1
.end method

.method private static createProxyListener(Landroidx/core/view/WindowInsetsAnimationCompat$Callback;)Landroid/view/View$OnApplyWindowInsetsListener;
    .locals 1

    .line 616
    new-instance v0, Landroidx/core/view/WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener;

    invoke-direct {v0, p0}, Landroidx/core/view/WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener;-><init>(Landroidx/core/view/WindowInsetsAnimationCompat$Callback;)V

    return-object v0
.end method

.method static interpolateInsets(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat;FI)Landroidx/core/view/WindowInsetsCompat;
    .locals 15

    move-object v0, p0

    .line 656
    new-instance v1, Landroidx/core/view/WindowInsetsCompat$Builder;

    invoke-direct {v1, p0}, Landroidx/core/view/WindowInsetsCompat$Builder;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    const/4 v2, 0x1

    :goto_0
    const/16 v3, 0x100

    if-gt v2, v3, :cond_1

    and-int v3, p3, v2

    if-nez v3, :cond_0

    move-object/from16 v5, p1

    goto :goto_1

    .line 662
    :cond_0
    invoke-virtual {p0, v3}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v4

    move-object/from16 v5, p1

    .line 663
    invoke-virtual {v5, v3}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v6

    .line 664
    iget v7, v4, Landroidx/core/graphics/Insets;->left:I

    iget v8, v6, Landroidx/core/graphics/Insets;->left:I

    sub-int/2addr v7, v8

    int-to-float v7, v7

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float v8, v8, p2

    mul-float v7, v7, v8

    float-to-double v9, v7

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v9, v11

    double-to-int v7, v9

    iget v9, v4, Landroidx/core/graphics/Insets;->top:I

    iget v10, v6, Landroidx/core/graphics/Insets;->top:I

    sub-int/2addr v9, v10

    int-to-float v9, v9

    mul-float v9, v9, v8

    float-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v9, v11

    double-to-int v9, v9

    iget v10, v4, Landroidx/core/graphics/Insets;->right:I

    iget v13, v6, Landroidx/core/graphics/Insets;->right:I

    sub-int/2addr v10, v13

    int-to-float v10, v10

    mul-float v10, v10, v8

    float-to-double v13, v10

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v13, v11

    double-to-int v10, v13

    iget v13, v4, Landroidx/core/graphics/Insets;->bottom:I

    iget v6, v6, Landroidx/core/graphics/Insets;->bottom:I

    sub-int/2addr v13, v6

    int-to-float v6, v13

    mul-float v6, v6, v8

    float-to-double v13, v6

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v13, v11

    double-to-int v6, v13

    invoke-static {v4, v7, v9, v10, v6}, Landroidx/core/view/WindowInsetsCompat;->insetInsets(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;

    move-result-object v4

    .line 672
    invoke-virtual {v1, v3, v4}, Landroidx/core/view/WindowInsetsCompat$Builder;->setInsets(ILandroidx/core/graphics/Insets;)Landroidx/core/view/WindowInsetsCompat$Builder;

    :goto_1
    shl-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 676
    :cond_1
    invoke-virtual {v1}, Landroidx/core/view/WindowInsetsCompat$Builder;->build()Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    return-object v0
.end method

.method static setCallback(Landroid/view/View;Landroidx/core/view/WindowInsetsAnimationCompat$Callback;)V
    .locals 2

    .line 591
    sget v0, Landroidx/core/R$id;->tag_on_apply_window_listener:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_0

    .line 593
    sget p1, Landroidx/core/R$id;->tag_window_insets_animation_callback:I

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez v0, :cond_1

    .line 597
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    goto :goto_0

    .line 600
    :cond_0
    invoke-static {p1}, Landroidx/core/view/WindowInsetsAnimationCompat$Impl21;->createProxyListener(Landroidx/core/view/WindowInsetsAnimationCompat$Callback;)Landroid/view/View$OnApplyWindowInsetsListener;

    move-result-object p1

    .line 601
    sget v1, Landroidx/core/R$id;->tag_window_insets_animation_callback:I

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez v0, :cond_1

    .line 608
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    :cond_1
    :goto_0
    return-void
.end method
