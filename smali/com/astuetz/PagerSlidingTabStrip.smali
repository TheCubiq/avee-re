.class public Lcom/astuetz/PagerSlidingTabStrip;
.super Landroid/widget/HorizontalScrollView;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/astuetz/PagerSlidingTabStrip$SavedState;,
        Lcom/astuetz/PagerSlidingTabStrip$i;,
        Lcom/astuetz/PagerSlidingTabStrip$h;,
        Lcom/astuetz/PagerSlidingTabStrip$g;,
        Lcom/astuetz/PagerSlidingTabStrip$f;
    }
.end annotation


# static fields
.field public static final g0:[I


# instance fields
.field public A:Landroid/graphics/Paint;

.field public B:Landroid/graphics/Paint;

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:Landroid/content/res/ColorStateList;

.field public M:Landroid/content/res/ColorStateList;

.field public N:I

.field public O:I

.field public P:I

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:Landroid/graphics/Typeface;

.field public U:I

.field public V:I

.field public W:I

.field public a0:I

.field public b0:I

.field public c0:Ljava/util/Locale;

.field public d0:I

.field public e0:Landroid/view/View$OnClickListener;

.field public f0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final p:Lcom/astuetz/PagerSlidingTabStrip$i;

.field public q:Landroid/widget/LinearLayout$LayoutParams;

.field public r:Landroid/widget/LinearLayout$LayoutParams;

.field public final s:Lcom/astuetz/PagerSlidingTabStrip$h;

.field public t:Lcom/astuetz/PagerSlidingTabStrip$g;

.field public u:Landroidx/viewpager/widget/ViewPager$j;

.field public v:Landroid/widget/LinearLayout;

.field public w:Landroidx/viewpager/widget/ViewPager;

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/astuetz/PagerSlidingTabStrip;->g0:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1010036
        0x1010095
        0x1010098
        0x10100d5
        0x10100d6
        0x10100d8
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/astuetz/PagerSlidingTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Lcom/astuetz/PagerSlidingTabStrip$i;

    const/4 v0, 0x0

    invoke-direct {p3, p0, v0}, Lcom/astuetz/PagerSlidingTabStrip$i;-><init>(Lcom/astuetz/PagerSlidingTabStrip;Lcom/astuetz/PagerSlidingTabStrip$a;)V

    iput-object p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->p:Lcom/astuetz/PagerSlidingTabStrip$i;

    new-instance p3, Lcom/astuetz/PagerSlidingTabStrip$h;

    invoke-direct {p3, p0, v0}, Lcom/astuetz/PagerSlidingTabStrip$h;-><init>(Lcom/astuetz/PagerSlidingTabStrip;Lcom/astuetz/PagerSlidingTabStrip$a;)V

    iput-object p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->s:Lcom/astuetz/PagerSlidingTabStrip$h;

    iput-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->t:Lcom/astuetz/PagerSlidingTabStrip$g;

    const/4 p3, 0x0

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->y:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->z:F

    const/4 v1, 0x2

    iput v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->D:I

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->E:I

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->G:I

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->H:I

    const/16 v2, 0xc

    iput v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->J:I

    const/16 v2, 0xe

    iput v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->K:I

    iput-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->L:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->M:Landroid/content/res/ColorStateList;

    const/16 v0, 0x96

    iput v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->N:I

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->O:I

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->P:I

    iput-boolean p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->Q:Z

    iput-boolean p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->R:Z

    iput-boolean p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->S:Z

    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->T:Landroid/graphics/Typeface;

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->U:I

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->V:I

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->a0:I

    const v0, 0x7f08016f

    iput v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->b0:I

    iput p3, p0, Lcom/astuetz/PagerSlidingTabStrip;->d0:I

    new-instance v0, Lcom/astuetz/PagerSlidingTabStrip$e;

    invoke-direct {v0, p0}, Lcom/astuetz/PagerSlidingTabStrip$e;-><init>(Lcom/astuetz/PagerSlidingTabStrip;)V

    iput-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->f0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->setFillViewport(Z)V

    invoke-virtual {p0, p3}, Landroid/widget/HorizontalScrollView;->setWillNotDraw(Z)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v2, p3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->W:I

    int-to-float v3, v3

    invoke-static {v0, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->W:I

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->D:I

    int-to-float v3, v3

    invoke-static {v0, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->D:I

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->E:I

    int-to-float v3, v3

    invoke-static {v0, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->E:I

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->H:I

    int-to-float v3, v3

    invoke-static {v0, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->H:I

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->J:I

    int-to-float v3, v3

    invoke-static {v0, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->J:I

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->G:I

    int-to-float v3, v3

    invoke-static {v0, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->G:I

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->K:I

    int-to-float v3, v3

    invoke-static {v1, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->K:I

    sget-object v2, Lcom/astuetz/PagerSlidingTabStrip;->g0:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    iget p2, p0, Lcom/astuetz/PagerSlidingTabStrip;->K:I

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/astuetz/PagerSlidingTabStrip;->K:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p1, p3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->F:I

    iput v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->I:I

    iput v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->C:I

    const/4 v2, 0x3

    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    if-lez v2, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, 0x4

    invoke-virtual {p1, v3, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    :goto_0
    iput v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->O:I

    if-lez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x5

    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    :goto_1
    iput v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->P:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-nez p2, :cond_2

    iget p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->N:I

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result p2

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-static {p1, p2, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->t(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    :cond_2
    iput-object p2, p0, Lcom/astuetz/PagerSlidingTabStrip;->L:Landroid/content/res/ColorStateList;

    iget-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->M:Landroid/content/res/ColorStateList;

    if-nez p1, :cond_3

    invoke-virtual {p0, v1}, Lcom/astuetz/PagerSlidingTabStrip;->t(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    :cond_3
    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->M:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/astuetz/PagerSlidingTabStrip;->A()V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->A:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->A:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->B:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->B:Landroid/graphics/Paint;

    iget p2, p0, Lcom/astuetz/PagerSlidingTabStrip;->G:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p2, -0x2

    invoke-direct {p1, p2, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->q:Landroid/widget/LinearLayout$LayoutParams;

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-direct {p1, p3, v4, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->r:Landroid/widget/LinearLayout$LayoutParams;

    iget-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->c0:Ljava/util/Locale;

    if-nez p1, :cond_4

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->c0:Ljava/util/Locale;

    :cond_4
    return-void
.end method

.method public static synthetic a(Lcom/astuetz/PagerSlidingTabStrip;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->B(I)V

    return-void
.end method

.method public static synthetic b(Lcom/astuetz/PagerSlidingTabStrip;)I
    .locals 0

    iget p0, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    return p0
.end method

.method public static synthetic c(Lcom/astuetz/PagerSlidingTabStrip;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    iget-object p0, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method public static synthetic d(Lcom/astuetz/PagerSlidingTabStrip;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->z(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/astuetz/PagerSlidingTabStrip;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->w(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/astuetz/PagerSlidingTabStrip;)Landroid/widget/LinearLayout;
    .locals 0

    iget-object p0, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public static synthetic g(Lcom/astuetz/PagerSlidingTabStrip;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/astuetz/PagerSlidingTabStrip;->S:Z

    return p0
.end method

.method private getIndicatorCoordinates()Lcom/daaw/ov0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/ov0<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->y:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->z:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->y:I

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    int-to-float v2, v2

    iget v4, p0, Lcom/astuetz/PagerSlidingTabStrip;->z:F

    mul-float v3, v3, v4

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float v6, v5, v4

    mul-float v6, v6, v1

    add-float v1, v3, v6

    mul-float v2, v2, v4

    sub-float/2addr v5, v4

    mul-float v5, v5, v0

    add-float v0, v2, v5

    :cond_0
    new-instance v2, Lcom/daaw/ov0;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Lcom/daaw/ov0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static synthetic h(Lcom/astuetz/PagerSlidingTabStrip;)I
    .locals 0

    iget p0, p0, Lcom/astuetz/PagerSlidingTabStrip;->O:I

    return p0
.end method

.method public static synthetic i(Lcom/astuetz/PagerSlidingTabStrip;I)I
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->O:I

    return p1
.end method

.method public static synthetic j(Lcom/astuetz/PagerSlidingTabStrip;)I
    .locals 0

    iget p0, p0, Lcom/astuetz/PagerSlidingTabStrip;->P:I

    return p0
.end method

.method public static synthetic k(Lcom/astuetz/PagerSlidingTabStrip;I)I
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->P:I

    return p1
.end method

.method public static synthetic l(Lcom/astuetz/PagerSlidingTabStrip;)I
    .locals 0

    iget p0, p0, Lcom/astuetz/PagerSlidingTabStrip;->W:I

    return p0
.end method

.method public static synthetic m(Lcom/astuetz/PagerSlidingTabStrip;I)I
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->W:I

    return p1
.end method

.method public static synthetic n(Lcom/astuetz/PagerSlidingTabStrip;)I
    .locals 0

    iget p0, p0, Lcom/astuetz/PagerSlidingTabStrip;->y:I

    return p0
.end method

.method public static synthetic o(Lcom/astuetz/PagerSlidingTabStrip;I)I
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->y:I

    return p1
.end method

.method public static synthetic p(Lcom/astuetz/PagerSlidingTabStrip;F)F
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->z:F

    return p1
.end method

.method public static synthetic q(Lcom/astuetz/PagerSlidingTabStrip;II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/astuetz/PagerSlidingTabStrip;->y(II)V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 5

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->D:I

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->E:I

    if-lt v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    iget-object v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final B(I)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-ne v1, p1, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setSelected(Z)V

    if-eqz v3, :cond_1

    invoke-virtual {p0, v2}, Lcom/astuetz/PagerSlidingTabStrip;->z(Landroid/view/View;)V

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v2}, Lcom/astuetz/PagerSlidingTabStrip;->w(Landroid/view/View;)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final C()V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->b0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->J:I

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/astuetz/PagerSlidingTabStrip;->J:I

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    const v2, 0x7f090207

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    iget-boolean v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->R:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public getDividerColor()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->I:I

    return v0
.end method

.method public getDividerPadding()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->H:I

    return v0
.end method

.method public getDividerWidth()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->G:I

    return v0
.end method

.method public getIndicatorColor()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->C:I

    return v0
.end method

.method public getIndicatorHeight()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->D:I

    return v0
.end method

.method public getScrollOffset()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->W:I

    return v0
.end method

.method public getShouldExpand()Z
    .locals 1

    iget-boolean v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->Q:Z

    return v0
.end method

.method public getTabBackground()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->b0:I

    return v0
.end method

.method public getTabPaddingLeftRight()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->J:I

    return v0
.end method

.method public getTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->L:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getTextSize()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->K:I

    return v0
.end method

.method public getUnderlineColor()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->F:I

    return v0
.end method

.method public getUnderlineHeight()I
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->E:I

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->p:Lcom/astuetz/PagerSlidingTabStrip$i;

    invoke-virtual {v0}, Lcom/astuetz/PagerSlidingTabStrip$i;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object v0

    iget-object v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->p:Lcom/astuetz/PagerSlidingTabStrip$i;

    invoke-virtual {v0, v1}, Lcom/daaw/kv0;->i(Landroid/database/DataSetObserver;)V

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->p:Lcom/astuetz/PagerSlidingTabStrip$i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/astuetz/PagerSlidingTabStrip$i;->b(Z)V

    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->p:Lcom/astuetz/PagerSlidingTabStrip$i;

    invoke-virtual {v0}, Lcom/astuetz/PagerSlidingTabStrip$i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object v0

    iget-object v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->p:Lcom/astuetz/PagerSlidingTabStrip$i;

    invoke-virtual {v0, v1}, Lcom/daaw/kv0;->o(Landroid/database/DataSetObserver;)V

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->p:Lcom/astuetz/PagerSlidingTabStrip$i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/astuetz/PagerSlidingTabStrip$i;->b(Z)V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->A:Landroid/graphics/Paint;

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->C:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    invoke-direct {p0}, Lcom/astuetz/PagerSlidingTabStrip;->getIndicatorCoordinates()Lcom/daaw/ov0;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/ov0;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->O:I

    int-to-float v3, v3

    add-float v5, v2, v3

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->D:I

    sub-int v2, v0, v2

    int-to-float v6, v2

    iget-object v1, v1, Lcom/daaw/ov0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->O:I

    int-to-float v2, v2

    add-float v7, v1, v2

    int-to-float v12, v0

    iget-object v9, p0, Lcom/astuetz/PagerSlidingTabStrip;->A:Landroid/graphics/Paint;

    move-object v4, p1

    move v8, v12

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->A:Landroid/graphics/Paint;

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->F:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->O:I

    int-to-float v9, v1

    iget v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->E:I

    sub-int v1, v0, v1

    int-to-float v10, v1

    iget-object v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v1

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->P:I

    add-int/2addr v1, v2

    int-to-float v11, v1

    iget-object v13, p0, Lcom/astuetz/PagerSlidingTabStrip;->A:Landroid/graphics/Paint;

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->G:I

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->B:Landroid/graphics/Paint;

    int-to-float v1, v1

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->B:Landroid/graphics/Paint;

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->I:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v5, v3

    iget v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->H:I

    int-to-float v6, v3

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    int-to-float v7, v2

    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->H:I

    sub-int v2, v0, v2

    int-to-float v8, v2

    iget-object v9, p0, Lcom/astuetz/PagerSlidingTabStrip;->B:Landroid/graphics/Paint;

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 3

    iget-boolean v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->S:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->O:I

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->P:I

    if-lez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getWidth()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setMinimumWidth(I)V

    invoke-virtual {p0, v1}, Landroid/widget/HorizontalScrollView;->setClipToPadding(Z)V

    :cond_1
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/astuetz/PagerSlidingTabStrip;->f0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    invoke-super/range {p0 .. p5}, Landroid/widget/HorizontalScrollView;->onLayout(ZIIII)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    check-cast p1, Lcom/astuetz/PagerSlidingTabStrip$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/HorizontalScrollView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget p1, p1, Lcom/astuetz/PagerSlidingTabStrip$SavedState;->p:I

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->y:I

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->w(Landroid/view/View;)V

    iget-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->y:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->z(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->requestLayout()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/astuetz/PagerSlidingTabStrip$SavedState;

    invoke-direct {v1, v0}, Lcom/astuetz/PagerSlidingTabStrip$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->y:I

    iput v0, v1, Lcom/astuetz/PagerSlidingTabStrip$SavedState;->p:I

    return-object v1
.end method

.method public final r(ILcom/daaw/me0;Landroid/view/View;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/view/View;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const v0, 0x7f090207

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    new-instance v1, Lcom/astuetz/PagerSlidingTabStrip$b;

    invoke-direct {v1, p0, v0}, Lcom/astuetz/PagerSlidingTabStrip$b;-><init>(Lcom/astuetz/PagerSlidingTabStrip;Landroid/widget/TextView;)V

    invoke-interface {p2, v1}, Lcom/daaw/me0;->a(Lcom/daaw/ir1$b;)V

    :cond_0
    invoke-virtual {p3, p4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p2, 0x1

    invoke-virtual {p3, p2}, Landroid/view/View;->setFocusable(Z)V

    new-instance p2, Lcom/astuetz/PagerSlidingTabStrip$c;

    invoke-direct {p2, p0}, Lcom/astuetz/PagerSlidingTabStrip$c;-><init>(Lcom/astuetz/PagerSlidingTabStrip;)V

    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    iget-boolean p4, p0, Lcom/astuetz/PagerSlidingTabStrip;->Q:Z

    if-eqz p4, :cond_1

    iget-object p4, p0, Lcom/astuetz/PagerSlidingTabStrip;->r:Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_0

    :cond_1
    iget-object p4, p0, Lcom/astuetz/PagerSlidingTabStrip;->q:Landroid/widget/LinearLayout$LayoutParams;

    :goto_0
    invoke-virtual {p2, p3, p1, p4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final s(ILjava/lang/CharSequence;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    const v0, 0x7f090207

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p3, p4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p2, 0x1

    invoke-virtual {p3, p2}, Landroid/view/View;->setFocusable(Z)V

    new-instance p2, Lcom/astuetz/PagerSlidingTabStrip$d;

    invoke-direct {p2, p0}, Lcom/astuetz/PagerSlidingTabStrip$d;-><init>(Lcom/astuetz/PagerSlidingTabStrip;)V

    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    iget-boolean p4, p0, Lcom/astuetz/PagerSlidingTabStrip;->Q:Z

    if-eqz p4, :cond_1

    iget-object p4, p0, Lcom/astuetz/PagerSlidingTabStrip;->r:Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_0

    :cond_1
    iget-object p4, p0, Lcom/astuetz/PagerSlidingTabStrip;->q:Landroid/widget/LinearLayout$LayoutParams;

    :goto_0
    invoke-virtual {p2, p3, p1, p4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setAllCaps(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->R:Z

    return-void
.end method

.method public setDividerColor(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->I:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setDividerColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->I:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->H:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setDividerWidth(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->G:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setIndicatorColor(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->C:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setIndicatorColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->C:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setIndicatorHeight(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->D:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->e0:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V
    .locals 0

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->u:Landroidx/viewpager/widget/ViewPager$j;

    return-void
.end method

.method public setOnTabReselectedListener(Lcom/astuetz/PagerSlidingTabStrip$g;)V
    .locals 0

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->t:Lcom/astuetz/PagerSlidingTabStrip$g;

    return-void
.end method

.method public setScrollOffset(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->W:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setShouldExpand(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->Q:Z

    iget-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setTabBackground(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->b0:I

    return-void
.end method

.method public setTabPaddingLeftRight(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->J:I

    invoke-virtual {p0}, Lcom/astuetz/PagerSlidingTabStrip;->C()V

    return-void
.end method

.method public setTextColor(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->t(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->L:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/astuetz/PagerSlidingTabStrip;->C()V

    return-void
.end method

.method public setTextColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->setTextColor(I)V

    return-void
.end method

.method public setTextColorSelected(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->t(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->setTextColorSelected(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTextColorSelected(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->M:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/astuetz/PagerSlidingTabStrip;->C()V

    return-void
.end method

.method public setTextColorStateListResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/astuetz/PagerSlidingTabStrip;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTextSize(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->K:I

    invoke-virtual {p0}, Lcom/astuetz/PagerSlidingTabStrip;->C()V

    return-void
.end method

.method public setUnderlineColor(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->F:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setUnderlineColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->F:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setUnderlineHeight(I)V
    .locals 0

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->E:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public setViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->s:Lcom/astuetz/PagerSlidingTabStrip$h;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object p1

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->p:Lcom/astuetz/PagerSlidingTabStrip$i;

    invoke-virtual {p1, v0}, Lcom/daaw/kv0;->i(Landroid/database/DataSetObserver;)V

    iget-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->p:Lcom/astuetz/PagerSlidingTabStrip$i;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/astuetz/PagerSlidingTabStrip$i;->b(Z)V

    invoke-virtual {p0}, Lcom/astuetz/PagerSlidingTabStrip;->x()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewPager does not have adapter instance."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t(I)Landroid/content/res/ColorStateList;
    .locals 5

    new-instance v0, Landroid/content/res/ColorStateList;

    const/4 v1, 0x1

    new-array v2, v1, [[I

    const/4 v3, 0x0

    new-array v4, v3, [I

    aput-object v4, v2, v3

    new-array v1, v1, [I

    aput p1, v1, v3

    invoke-direct {v0, v2, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v0
.end method

.method public u(Lcom/daaw/me0;ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c00d1

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/astuetz/PagerSlidingTabStrip;->r(ILcom/daaw/me0;Landroid/view/View;Ljava/lang/Object;)V

    iget p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->d0:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    invoke-virtual {p0}, Lcom/astuetz/PagerSlidingTabStrip;->C()V

    return-void
.end method

.method public v()V
    .locals 1

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->d0:I

    return-void
.end method

.method public final w(Landroid/view/View;)V
    .locals 1

    if-eqz p1, :cond_0

    const v0, 0x7f090207

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->L:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public x()V
    .locals 5

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/kv0;->c()I

    move-result v0

    iput v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object v2

    instance-of v2, v2, Lcom/astuetz/PagerSlidingTabStrip$f;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object v2

    check-cast v2, Lcom/astuetz/PagerSlidingTabStrip$f;

    invoke-interface {v2, p0, v1}, Lcom/astuetz/PagerSlidingTabStrip$f;->a(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v2

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c00d1

    invoke-virtual {v2, v3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    :goto_1
    iget-object v3, p0, Lcom/astuetz/PagerSlidingTabStrip;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v3}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/daaw/kv0;->e(I)Ljava/lang/CharSequence;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v3, v2, v4}, Lcom/astuetz/PagerSlidingTabStrip;->s(ILjava/lang/CharSequence;Landroid/view/View;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/astuetz/PagerSlidingTabStrip;->C()V

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/astuetz/PagerSlidingTabStrip$a;

    invoke-direct {v1, p0}, Lcom/astuetz/PagerSlidingTabStrip$a;-><init>(Lcom/astuetz/PagerSlidingTabStrip;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public final y(II)V
    .locals 1

    iget v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->x:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    add-int/2addr v0, p2

    if-gtz p1, :cond_1

    if-lez p2, :cond_2

    :cond_1
    iget p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->W:I

    sub-int/2addr v0, p1

    invoke-direct {p0}, Lcom/astuetz/PagerSlidingTabStrip;->getIndicatorCoordinates()Lcom/daaw/ov0;

    move-result-object p1

    int-to-float p2, v0

    iget-object v0, p1, Lcom/daaw/ov0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object p1, p1, Lcom/daaw/ov0;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    sub-float/2addr v0, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr v0, p1

    add-float/2addr p2, v0

    float-to-int v0, p2

    :cond_2
    iget p1, p0, Lcom/astuetz/PagerSlidingTabStrip;->a0:I

    if-eq v0, p1, :cond_3

    iput v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->a0:I

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    :cond_3
    return-void
.end method

.method public final z(Landroid/view/View;)V
    .locals 1

    if-eqz p1, :cond_0

    const v0, 0x7f090207

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip;->M:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method
