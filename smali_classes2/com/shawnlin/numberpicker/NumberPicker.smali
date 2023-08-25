.class public Lcom/shawnlin/numberpicker/NumberPicker;
.super Landroid/widget/LinearLayout;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shawnlin/numberpicker/NumberPicker$b;,
        Lcom/shawnlin/numberpicker/NumberPicker$c;,
        Lcom/shawnlin/numberpicker/NumberPicker$d;,
        Lcom/shawnlin/numberpicker/NumberPicker$e;,
        Lcom/shawnlin/numberpicker/NumberPicker$f;
    }
.end annotation


# static fields
.field public static final E0:Lcom/shawnlin/numberpicker/NumberPicker$f;

.field public static final F0:[C


# instance fields
.field public A:F

.field public A0:I

.field public B:Landroid/graphics/Typeface;

.field public B0:Z

.field public C:I

.field public C0:Z

.field public D:I

.field public D0:Landroid/content/Context;

.field public E:[Ljava/lang/String;

.field public F:I

.field public G:I

.field public H:I

.field public I:Landroid/view/View$OnClickListener;

.field public J:Lcom/shawnlin/numberpicker/NumberPicker$e;

.field public K:Lcom/shawnlin/numberpicker/NumberPicker$d;

.field public L:Lcom/shawnlin/numberpicker/NumberPicker$c;

.field public M:J

.field public final N:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public O:I

.field public P:I

.field public Q:I

.field public R:[I

.field public final S:Landroid/graphics/Paint;

.field public T:I

.field public U:I

.field public V:I

.field public final W:Lcom/daaw/k91;

.field public final a0:Lcom/daaw/k91;

.field public b0:I

.field public c0:I

.field public d0:Lcom/shawnlin/numberpicker/NumberPicker$b;

.field public e0:F

.field public f0:F

.field public g0:F

.field public h0:F

.field public i0:Landroid/view/VelocityTracker;

.field public j0:I

.field public k0:I

.field public l0:I

.field public m0:Z

.field public n0:Landroid/graphics/drawable/Drawable;

.field public o0:I

.field public final p:Landroid/widget/EditText;

.field public p0:I

.field public q:F

.field public q0:I

.field public r:F

.field public r0:I

.field public s:I

.field public s0:I

.field public t:I

.field public t0:I

.field public u:I

.field public u0:I

.field public v:I

.field public v0:I

.field public final w:Z

.field public w0:I

.field public x:I

.field public x0:F

.field public y:I

.field public y0:F

.field public z:F

.field public z0:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/shawnlin/numberpicker/NumberPicker$f;

    invoke-direct {v0}, Lcom/shawnlin/numberpicker/NumberPicker$f;-><init>()V

    sput-object v0, Lcom/shawnlin/numberpicker/NumberPicker;->E0:Lcom/shawnlin/numberpicker/NumberPicker$f;

    const/16 v0, 0x1f

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/shawnlin/numberpicker/NumberPicker;->F0:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x660s
        0x661s
        0x662s
        0x663s
        0x664s
        0x665s
        0x666s
        0x667s
        0x668s
        0x669s
        0x6f0s
        0x6f1s
        0x6f2s
        0x6f3s
        0x6f4s
        0x6f5s
        0x6f6s
        0x6f7s
        0x6f8s
        0x6f9s
        0x2ds
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/shawnlin/numberpicker/NumberPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x:I

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y:I

    const/high16 v1, 0x41c80000    # 25.0f

    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A:F

    const/4 v1, 0x1

    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    const/16 v2, 0x64

    iput v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    const-wide/16 v2, 0x12c

    iput-wide v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->M:J

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->N:Landroid/util/SparseArray;

    const/4 v2, 0x3

    iput v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->O:I

    iput v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->P:I

    div-int/lit8 v3, v2, 0x2

    iput v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    new-array v2, v2, [I

    iput-object v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->R:[I

    const/high16 v2, -0x80000000

    iput v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->o0:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->r0:I

    const/4 v2, -0x1

    iput v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->w0:I

    iput-boolean v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B0:Z

    iput-boolean v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->C0:Z

    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->D0:Landroid/content/Context;

    sget-object v3, Lcom/daaw/n21;->x:[I

    invoke-virtual {p1, p2, v3, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    sget p3, Lcom/daaw/k11;->a:I

    invoke-static {p1, p3}, Lcom/daaw/zk;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    sget p3, Lcom/daaw/n21;->y:I

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->o0:I

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->o0:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    const/high16 v3, 0x42400000    # 48.0f

    invoke-static {v1, v3, p3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    sget v3, Lcom/daaw/n21;->z:I

    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p0:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v1, v3, p3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    sget v3, Lcom/daaw/n21;->A:I

    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q0:I

    sget p3, Lcom/daaw/n21;->G:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A0:I

    sget p3, Lcom/daaw/n21;->H:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z0:I

    sget p3, Lcom/daaw/n21;->Q:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    int-to-float p3, p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x0:F

    sget p3, Lcom/daaw/n21;->D:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    int-to-float p3, p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y0:F

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->H()V

    iput-boolean v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->w:Z

    sget p3, Lcom/daaw/n21;->O:I

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    sget p3, Lcom/daaw/n21;->E:I

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    sget p3, Lcom/daaw/n21;->F:I

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    sget p3, Lcom/daaw/n21;->J:I

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x:I

    sget p3, Lcom/daaw/n21;->K:I

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A:F

    invoke-virtual {p0, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->I(F)F

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A:F

    sget p3, Lcom/daaw/n21;->L:I

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y:I

    sget p3, Lcom/daaw/n21;->M:I

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    invoke-virtual {p0, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->I(F)F

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    sget p3, Lcom/daaw/n21;->N:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p3

    iput-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B:Landroid/graphics/Typeface;

    sget p3, Lcom/daaw/n21;->C:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->J(Ljava/lang/String;)Lcom/shawnlin/numberpicker/NumberPicker$c;

    move-result-object p3

    iput-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->L:Lcom/shawnlin/numberpicker/NumberPicker$c;

    sget p3, Lcom/daaw/n21;->B:I

    iget-boolean v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B0:Z

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B0:Z

    sget p3, Lcom/daaw/n21;->I:I

    iget-boolean v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->C0:Z

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->C0:Z

    sget p3, Lcom/daaw/n21;->P:I

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->O:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->O:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setWillNotDraw(Z)V

    const-string p3, "layout_inflater"

    invoke-virtual {p1, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/LayoutInflater;

    sget v2, Lcom/daaw/b21;->a:I

    invoke-virtual {p3, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget p3, Lcom/daaw/n11;->a:I

    invoke-virtual {p0, p3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/EditText;

    iput-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {p3, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    invoke-virtual {p3, v0}, Landroid/widget/EditText;->setFocusable(Z)V

    invoke-virtual {p3, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iput-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x:I

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setSelectedTextColor(I)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y:I

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setTextColor(I)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setTextSize(F)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A:F

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setSelectedTextSize(F)V

    iget-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B:Landroid/graphics/Typeface;

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->L:Lcom/shawnlin/numberpicker/NumberPicker$c;

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setFormatter(Lcom/shawnlin/numberpicker/NumberPicker$c;)V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->L()Z

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setValue(I)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setMaxValue(I)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setMinValue(I)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->o0:I

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setDividerColor(I)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->O:I

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setWheelItemCount(I)V

    sget p3, Lcom/daaw/n21;->R:I

    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    invoke-virtual {p0, p3}, Lcom/shawnlin/numberpicker/NumberPicker;->setWrapSelectorWheel(Z)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x0:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v2, p3, v0

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y0:F

    cmpl-float v2, v2, v0

    if-eqz v2, :cond_0

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u:I

    :goto_0
    int-to-float v0, v0

    div-float/2addr p3, v0

    invoke-virtual {p0, p3}, Landroid/widget/LinearLayout;->setScaleX(F)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y0:F

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t:I

    goto :goto_1

    :cond_0
    cmpl-float v2, p3, v0

    if-eqz v2, :cond_1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u:I

    int-to-float v0, v0

    div-float/2addr p3, v0

    invoke-virtual {p0, p3}, Landroid/widget/LinearLayout;->setScaleX(F)V

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x0:F

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u:I

    :goto_1
    int-to-float v0, v0

    div-float/2addr p3, v0

    invoke-virtual {p0, p3}, Landroid/widget/LinearLayout;->setScaleY(F)V

    goto :goto_2

    :cond_1
    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y0:F

    cmpl-float v0, p3, v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t:I

    goto :goto_0

    :cond_2
    :goto_2
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->j0:I

    invoke-virtual {p3}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v0

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->k0:I

    invoke-virtual {p3}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p3

    div-int/lit8 p3, p3, 0x8

    iput p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->l0:I

    new-instance p3, Lcom/daaw/k91;

    const/4 v0, 0x0

    invoke-direct {p3, p1, v0, v1}, Lcom/daaw/k91;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;Z)V

    iput-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    new-instance p3, Lcom/daaw/k91;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v2, 0x40200000    # 2.5f

    invoke-direct {v0, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-direct {p3, p1, v0}, Lcom/daaw/k91;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getImportantForAccessibility()I

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setImportantForAccessibility(I)V

    :cond_3
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic a(Lcom/shawnlin/numberpicker/NumberPicker;)J
    .locals 2

    iget-wide v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->M:J

    return-wide v0
.end method

.method public static synthetic b(Lcom/shawnlin/numberpicker/NumberPicker;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->c(Z)V

    return-void
.end method

.method private getMaxTextSize()F
    .locals 2

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method private getSelectorIndices()[I
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->R:[I

    return-object v0
.end method

.method public static final getTwoDigitFormatter()Lcom/shawnlin/numberpicker/NumberPicker$c;
    .locals 1

    sget-object v0, Lcom/shawnlin/numberpicker/NumberPicker;->E0:Lcom/shawnlin/numberpicker/NumberPicker$f;

    return-object v0
.end method

.method public static resolveSizeAndState(III)I
    .locals 2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    goto :goto_0

    :cond_1
    if-ge p1, p0, :cond_2

    const/high16 p0, 0x1000000

    or-int/2addr p0, p1

    :cond_2
    :goto_0
    const/high16 p1, -0x1000000

    and-int/2addr p1, p2

    or-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final A(F)F
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    div-float/2addr p1, v0

    return p1
.end method

.method public final B()V
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->d0:Lcom/shawnlin/numberpicker/NumberPicker$b;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final C()V
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->d0:Lcom/shawnlin/numberpicker/NumberPicker$b;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final D(III)I
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p3, p2}, Lcom/shawnlin/numberpicker/NumberPicker;->resolveSizeAndState(III)I

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public E(II)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/shawnlin/numberpicker/NumberPicker;->F(Ljava/lang/String;I)V

    return-void
.end method

.method public F(Ljava/lang/String;I)V
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setTypeface(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public final G(IZ)V
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->l(I)I

    move-result p1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->L()Z

    if-eqz p2, :cond_2

    invoke-virtual {p0, v0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->v(II)V

    :cond_2
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->p()V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    return-void
.end method

.method public final H()V
    .locals 4

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    const/high16 v1, 0x42800000    # 64.0f

    const/high16 v2, 0x43340000    # 180.0f

    const/4 v3, -0x1

    iput v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->s:I

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->e(F)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t:I

    invoke-virtual {p0, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->e(F)F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->e(F)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t:I

    invoke-virtual {p0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->e(F)F

    move-result v0

    :goto_0
    float-to-int v0, v0

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u:I

    iput v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v:I

    return-void
.end method

.method public final I(F)F
    .locals 2

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    return p1
.end method

.method public final J(Ljava/lang/String;)Lcom/shawnlin/numberpicker/NumberPicker$c;
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/shawnlin/numberpicker/NumberPicker$a;

    invoke-direct {v0, p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker$a;-><init>(Lcom/shawnlin/numberpicker/NumberPicker;Ljava/lang/String;)V

    return-object v0
.end method

.method public final K()V
    .locals 5

    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->w:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    invoke-direct {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getMaxTextSize()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->E:[Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x9

    if-gt v2, v3, :cond_2

    iget-object v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    invoke-virtual {p0, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->j(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    cmpl-float v4, v3, v0

    if-lez v4, :cond_1

    move v0, v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    :goto_1
    if-lez v2, :cond_3

    add-int/lit8 v1, v1, 0x1

    div-int/lit8 v2, v2, 0xa

    goto :goto_1

    :cond_3
    int-to-float v1, v1

    mul-float v1, v1, v0

    float-to-int v0, v1

    goto :goto_3

    :cond_4
    array-length v0, v0

    const/4 v2, 0x0

    :goto_2
    if-ge v1, v0, :cond_6

    iget-object v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    iget-object v4, p0, Lcom/shawnlin/numberpicker/NumberPicker;->E:[Ljava/lang/String;

    aget-object v4, v4, v1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    int-to-float v4, v2

    cmpl-float v4, v3, v4

    if-lez v4, :cond_5

    float-to-int v2, v3

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    move v0, v2

    :goto_3
    iget-object v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v:I

    if-eq v1, v0, :cond_8

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u:I

    if-le v0, v1, :cond_7

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v:I

    goto :goto_4

    :cond_7
    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v:I

    :goto_4
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    :cond_8
    return-void
.end method

.method public final L()Z
    .locals 3

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->E:[Ljava/lang/String;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->i(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    sub-int/2addr v1, v2

    aget-object v0, v0, v1

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Z)V
    .locals 14

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->u(Lcom/daaw/k91;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->u(Lcom/daaw/k91;)Z

    :cond_0
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->b0:I

    if-eqz p1, :cond_1

    iget-object v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    neg-int v5, p1

    const/4 v6, 0x0

    const/16 v7, 0x12c

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/k91;->m(IIIII)V

    goto :goto_0

    :cond_1
    iget-object v8, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    const/4 v9, 0x0

    const/4 v10, 0x0

    iget v11, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    const/4 v12, 0x0

    const/16 v13, 0x12c

    invoke-virtual/range {v8 .. v13}, Lcom/daaw/k91;->m(IIIII)V

    goto :goto_0

    :cond_2
    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->c0:I

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    neg-int v4, p1

    const/16 v5, 0x12c

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/k91;->m(IIIII)V

    goto :goto_0

    :cond_3
    iget-object v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget v10, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    const/16 v11, 0x12c

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/k91;->m(IIIII)V

    :goto_0
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    return-void
.end method

.method public computeScroll()V
    .locals 4

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->s()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    invoke-virtual {v0}, Lcom/daaw/k91;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    invoke-virtual {v0}, Lcom/daaw/k91;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/k91;->b()Z

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/daaw/k91;->f()I

    move-result v1

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->b0:I

    if-nez v3, :cond_2

    invoke-virtual {v0}, Lcom/daaw/k91;->j()I

    move-result v3

    iput v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->b0:I

    :cond_2
    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->b0:I

    sub-int v3, v1, v3

    invoke-virtual {p0, v3, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->scrollBy(II)V

    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->b0:I

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lcom/daaw/k91;->g()I

    move-result v1

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->c0:I

    if-nez v3, :cond_4

    invoke-virtual {v0}, Lcom/daaw/k91;->k()I

    move-result v3

    iput v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->c0:I

    :cond_4
    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->c0:I

    sub-int v3, v1, v3

    invoke-virtual {p0, v2, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->scrollBy(II)V

    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->c0:I

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/k91;->l()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->x(Lcom/daaw/k91;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->postInvalidate()V

    :goto_1
    return-void
.end method

.method public final d([I)V
    .locals 3

    array-length v0, p1

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-lez v0, :cond_0

    add-int/lit8 v2, v0, -0x1

    aget v2, p1, v2

    aput v2, p1, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    aget v0, p1, v1

    sub-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    if-ge v0, v1, :cond_1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    :cond_1
    const/4 v1, 0x0

    aput v0, p1, v1

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->f(I)V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x13

    const/16 v2, 0x14

    if-eq v0, v1, :cond_1

    if-eq v0, v2, :cond_1

    const/16 v1, 0x17

    if-eq v0, v1, :cond_0

    const/16 v1, 0x42

    if-eq v0, v1, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->B()V

    goto :goto_3

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    goto :goto_3

    :cond_2
    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->w0:I

    if-ne v1, v0, :cond_8

    const/4 p1, -0x1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->w0:I

    return v3

    :cond_3
    iget-boolean v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-nez v1, :cond_5

    if-ne v0, v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getMinValue()I

    move-result v4

    if-le v1, v4, :cond_8

    goto :goto_1

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getMaxValue()I

    move-result v4

    if-ge v1, v4, :cond_8

    :goto_1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->requestFocus()Z

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->w0:I

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->B()V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    invoke-virtual {p1}, Lcom/daaw/k91;->l()Z

    move-result p1

    if-eqz p1, :cond_7

    if-ne v0, v2, :cond_6

    const/4 p1, 0x1

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    :goto_2
    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->c(Z)V

    :cond_7
    return v3

    :cond_8
    :goto_3
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->B()V

    :goto_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->B()V

    :goto_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final e(F)F
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v0

    return p1
.end method

.method public final f(I)V
    .locals 3

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->N:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    if-lt p1, v1, :cond_3

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    if-le p1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->E:[Ljava/lang/String;

    if-eqz v2, :cond_2

    sub-int v1, p1, v1

    aget-object v1, v2, v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->i(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    :goto_0
    const-string v1, ""

    :goto_1
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public final g()Z
    .locals 8

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v2

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    div-int/lit8 v4, v3, 0x2

    if-le v2, v4, :cond_1

    if-lez v0, :cond_0

    neg-int v3, v3

    :cond_0
    add-int/2addr v0, v3

    :cond_1
    move v6, v0

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->b0:I

    iget-object v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const/16 v7, 0x320

    move v5, v6

    move v6, v0

    goto :goto_0

    :cond_2
    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->c0:I

    iget-object v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0x320

    :goto_0
    invoke-virtual/range {v2 .. v7}, Lcom/daaw/k91;->m(IIIII)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    const/4 v0, 0x1

    return v0

    :cond_3
    return v1
.end method

.method public getBottomFadingEdgeStrength()F
    .locals 1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B0:Z

    if-eqz v0, :cond_0

    const v0, 0x3f666666    # 0.9f

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getDisplayedValues()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->E:[Ljava/lang/String;

    return-object v0
.end method

.method public getDividerColor()I
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->o0:I

    return v0
.end method

.method public getDividerDistance()F
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p0:I

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->z(F)F

    move-result v0

    return v0
.end method

.method public getDividerThickness()F
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q0:I

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->z(F)F

    move-result v0

    return v0
.end method

.method public getFormatter()Lcom/shawnlin/numberpicker/NumberPicker$c;
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->L:Lcom/shawnlin/numberpicker/NumberPicker$c;

    return-object v0
.end method

.method public getLeftFadingEdgeStrength()F
    .locals 1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B0:Z

    if-eqz v0, :cond_0

    const v0, 0x3f666666    # 0.9f

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getMaxValue()I
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    return v0
.end method

.method public getMinValue()I
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    return v0
.end method

.method public getOrder()I
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A0:I

    return v0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z0:I

    return v0
.end method

.method public getRightFadingEdgeStrength()F
    .locals 1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B0:Z

    if-eqz v0, :cond_0

    const v0, 0x3f666666    # 0.9f

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getSelectedTextColor()I
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x:I

    return v0
.end method

.method public getSelectedTextSize()F
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A:F

    return v0
.end method

.method public getTextColor()I
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y:I

    return v0
.end method

.method public getTextSize()F
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->I(F)F

    move-result v0

    return v0
.end method

.method public getTopFadingEdgeStrength()F
    .locals 1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B0:Z

    if-eqz v0, :cond_0

    const v0, 0x3f666666    # 0.9f

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getTypeface()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    return v0
.end method

.method public getWheelItemCount()I
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->O:I

    return v0
.end method

.method public getWrapSelectorWheel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    return v0
.end method

.method public final h(I)V
    .locals 9

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->b0:I

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    if-lez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const v1, 0x7fffffff

    :goto_0
    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x7fffffff

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v3, p1

    goto :goto_2

    :cond_1
    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->c0:I

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    const/4 v1, 0x0

    if-lez p1, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    const v2, 0x7fffffff

    :goto_1
    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x7fffffff

    move v4, p1

    :goto_2
    invoke-virtual/range {v0 .. v8}, Lcom/daaw/k91;->c(IIIIIIII)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    return-void
.end method

.method public final i(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->L:Lcom/shawnlin/numberpicker/NumberPicker$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/shawnlin/numberpicker/NumberPicker$c;->a(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->j(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final j(I)Ljava/lang/String;
    .locals 3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "%d"

    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final k(Landroid/graphics/Paint$FontMetrics;)F
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p1, Landroid/graphics/Paint$FontMetrics;->top:F

    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    add-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    return p1
.end method

.method public final l(I)I
    .locals 2

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    if-le p1, v0, :cond_0

    sub-int/2addr p1, v0

    sub-int/2addr v0, v1

    rem-int/2addr p1, v0

    add-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    return v1

    :cond_0
    if-ge p1, v1, :cond_1

    sub-int p1, v1, p1

    sub-int v1, v0, v1

    rem-int/2addr p1, v1

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x1

    return v0

    :cond_1
    return p1
.end method

.method public final m([I)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    aget v2, p1, v1

    aput v2, p1, v0

    move v0, v1

    goto :goto_0

    :cond_0
    array-length v0, p1

    add-int/lit8 v0, v0, -0x2

    aget v0, p1, v0

    add-int/lit8 v0, v0, 0x1

    iget-boolean v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    if-le v0, v1, :cond_1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    :cond_1
    array-length v1, p1

    add-int/lit8 v1, v1, -0x1

    aput v0, p1, v1

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->f(I)V

    return-void
.end method

.method public final n()V
    .locals 2

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setHorizontalFadingEdgeEnabled(Z)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getRight()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLeft()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setVerticalFadingEdgeEnabled(Z)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getTop()I

    move-result v1

    :goto_0
    sub-int/2addr v0, v1

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    float-to-int v1, v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setFadingEdgeLength(I)V

    return-void
.end method

.method public final o()V
    .locals 4

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->p()V

    invoke-direct {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getSelectorIndices()[I

    move-result-object v0

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    float-to-int v2, v2

    mul-int v1, v1, v2

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A:F

    float-to-int v2, v2

    add-int/2addr v1, v2

    array-length v0, v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getRight()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLeft()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v2, v1

    int-to-float v1, v2

    div-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->C:I

    invoke-direct {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getMaxTextSize()F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->C:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q:F

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getTop()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v2, v1

    int-to-float v1, v2

    div-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->D:I

    invoke-direct {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getMaxTextSize()F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->D:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->r:F

    :goto_0
    float-to-int v1, v1

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    mul-int v0, v0, v2

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->L()Z

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->B()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    int-to-float v0, v0

    iget-object v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getBaseline()I

    move-result v3

    iget-object v4, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getTop()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/shawnlin/numberpicker/NumberPicker;->P:I

    if-ge v4, v1, :cond_1

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u0:I

    iget v4, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v0:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getBottom()I

    move-result v5

    invoke-virtual {p1, v1, v2, v4, v5}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getRight()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLeft()I

    move-result v3

    sub-int/2addr v0, v3

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    int-to-float v3, v3

    iget v4, p0, Lcom/shawnlin/numberpicker/NumberPicker;->P:I

    if-ge v4, v1, :cond_1

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->s0:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getRight()I

    move-result v4

    iget v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t0:I

    invoke-virtual {p1, v2, v1, v4, v5}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getSelectorIndices()[I

    move-result-object v1

    const/4 v4, 0x0

    :goto_1
    array-length v5, v1

    if-ge v4, v5, :cond_8

    iget v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    if-ne v4, v5, :cond_2

    iget-object v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    iget v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A:F

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    iget v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x:I

    goto :goto_2

    :cond_2
    iget-object v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    iget v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    iget v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y:I

    :goto_2
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->q()Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v4

    goto :goto_3

    :cond_3
    array-length v5, v1

    sub-int/2addr v5, v4

    add-int/lit8 v5, v5, -0x1

    :goto_3
    aget v5, v1, v5

    iget-object v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->N:Landroid/util/SparseArray;

    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    if-ne v4, v6, :cond_4

    iget-object v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/widget/EditText;->getVisibility()I

    move-result v6

    if-eqz v6, :cond_6

    :cond_4
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v0, v3, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_4

    :cond_5
    iget-object v6, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/shawnlin/numberpicker/NumberPicker;->k(Landroid/graphics/Paint$FontMetrics;)F

    move-result v6

    add-float/2addr v6, v3

    iget-object v7, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v0, v6, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_6
    :goto_4
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v5

    if-eqz v5, :cond_7

    iget v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    int-to-float v5, v5

    add-float/2addr v0, v5

    goto :goto_5

    :cond_7
    iget v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    int-to-float v5, v5

    add-float/2addr v3, v5

    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u0:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q0:I

    add-int/2addr v1, v0

    iget-object v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getBottom()I

    move-result v4

    invoke-virtual {v3, v0, v2, v1, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v0:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q0:I

    sub-int v1, v0, v1

    iget-object v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getBottom()I

    move-result v4

    invoke-virtual {v3, v1, v2, v0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_6

    :cond_9
    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->s0:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q0:I

    add-int/2addr v1, v0

    iget-object v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getRight()I

    move-result v4

    invoke-virtual {v3, v2, v0, v4, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t0:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q0:I

    sub-int v1, v0, v1

    iget-object v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getRight()I

    move-result v4

    invoke-virtual {v3, v2, v1, v4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :goto_6
    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_a
    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->s()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    add-int/2addr v1, v0

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    mul-int v1, v1, v2

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    sub-int/2addr v3, v0

    mul-int v3, v3, v2

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollX(I)V

    invoke-virtual {p1, v3}, Landroid/view/accessibility/AccessibilityEvent;->setMaxScrollX(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollY(I)V

    invoke-virtual {p1, v3}, Landroid/view/accessibility/AccessibilityEvent;->setMaxScrollY(I)V

    :goto_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->B()V

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->e0:F

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->g0:F

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    invoke-virtual {p1}, Lcom/daaw/k91;->l()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    invoke-virtual {p1, v2}, Lcom/daaw/k91;->d(Z)V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    invoke-virtual {p1, v2}, Lcom/daaw/k91;->d(Z)V

    invoke-virtual {p0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->w(I)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    invoke-virtual {p1}, Lcom/daaw/k91;->l()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    invoke-virtual {p1, v2}, Lcom/daaw/k91;->d(Z)V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    invoke-virtual {p1, v2}, Lcom/daaw/k91;->d(Z)V

    goto :goto_0

    :cond_3
    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->e0:F

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u0:I

    int-to-float v3, v0

    cmpl-float v3, p1, v3

    if-ltz v3, :cond_4

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v0:I

    int-to-float v3, v3

    cmpg-float v3, p1, v3

    if-gtz v3, :cond_4

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->I:Landroid/view/View$OnClickListener;

    if-eqz p1, :cond_6

    invoke-interface {p1, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0

    :cond_4
    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_5

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p1

    int-to-long v3, p1

    invoke-virtual {p0, v1, v3, v4}, Lcom/shawnlin/numberpicker/NumberPicker;->y(ZJ)V

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v0:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_6

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p1

    int-to-long v0, p1

    invoke-virtual {p0, v2, v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->y(ZJ)V

    :cond_6
    :goto_0
    return v2

    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->f0:F

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->h0:F

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    invoke-virtual {p1}, Lcom/daaw/k91;->l()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    invoke-virtual {p1, v2}, Lcom/daaw/k91;->d(Z)V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    invoke-virtual {p1, v2}, Lcom/daaw/k91;->d(Z)V

    invoke-virtual {p0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->w(I)V

    goto :goto_1

    :cond_8
    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    invoke-virtual {p1}, Lcom/daaw/k91;->l()Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    invoke-virtual {p1, v2}, Lcom/daaw/k91;->d(Z)V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->a0:Lcom/daaw/k91;

    invoke-virtual {p1, v2}, Lcom/daaw/k91;->d(Z)V

    goto :goto_1

    :cond_9
    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->f0:F

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->s0:I

    int-to-float v3, v0

    cmpl-float v3, p1, v3

    if-ltz v3, :cond_a

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t0:I

    int-to-float v3, v3

    cmpg-float v3, p1, v3

    if-gtz v3, :cond_a

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->I:Landroid/view/View$OnClickListener;

    if-eqz p1, :cond_c

    invoke-interface {p1, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_1

    :cond_a
    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_b

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p1

    int-to-long v3, p1

    invoke-virtual {p0, v1, v3, v4}, Lcom/shawnlin/numberpicker/NumberPicker;->y(ZJ)V

    goto :goto_1

    :cond_b
    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t0:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_c

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p1

    int-to-long v0, p1

    invoke-virtual {p0, v2, v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->y(ZJ)V

    :cond_c
    :goto_1
    return v2
.end method

.method public onLayout(ZIIII)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result p3

    iget-object p4, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {p4}, Landroid/widget/EditText;->getMeasuredWidth()I

    move-result p4

    iget-object p5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {p5}, Landroid/widget/EditText;->getMeasuredHeight()I

    move-result p5

    sub-int/2addr p2, p4

    div-int/lit8 p2, p2, 0x2

    sub-int/2addr p3, p5

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p4, p2

    add-int/2addr p5, p3

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/widget/EditText;->layout(IIII)V

    iget-object p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getX()F

    move-result p2

    iget-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {p3}, Landroid/widget/EditText;->getMeasuredWidth()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    int-to-float p3, p3

    add-float/2addr p2, p3

    iput p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q:F

    iget-object p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getY()F

    move-result p2

    iget-object p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {p3}, Landroid/widget/EditText;->getMeasuredHeight()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    int-to-float p3, p3

    add-float/2addr p2, p3

    iput p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->r:F

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->o()V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->n()V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result p1

    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p0:I

    sub-int/2addr p1, p2

    div-int/lit8 p1, p1, 0x2

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q0:I

    sub-int/2addr p1, p3

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u0:I

    mul-int/lit8 p3, p3, 0x2

    add-int/2addr p1, p3

    add-int/2addr p1, p2

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v0:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result p1

    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p0:I

    sub-int/2addr p1, p2

    div-int/lit8 p1, p1, 0x2

    iget p3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q0:I

    sub-int/2addr p1, p3

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->s0:I

    mul-int/lit8 p3, p3, 0x2

    add-int/2addr p1, p3

    add-int/2addr p1, p2

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t0:I

    :cond_1
    :goto_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->v:I

    invoke-virtual {p0, p1, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->t(II)I

    move-result v0

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->t:I

    invoke-virtual {p0, p2, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->t(II)I

    move-result v1

    invoke-super {p0, v0, v1}, Landroid/widget/LinearLayout;->onMeasure(II)V

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->u:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->D(III)I

    move-result p1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->s:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1, p2}, Lcom/shawnlin/numberpicker/NumberPicker;->D(III)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/widget/LinearLayout;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->s()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->i0:Landroid/view/VelocityTracker;

    if-nez v0, :cond_2

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->i0:Landroid/view/VelocityTracker;

    :cond_2
    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->i0:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_9

    if-eq v0, v2, :cond_3

    goto/16 :goto_7

    :cond_3
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->r0:I

    if-eq v0, v3, :cond_4

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->e0:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->j0:I

    if-le v0, v1, :cond_5

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->B()V

    invoke-virtual {p0, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->w(I)V

    goto :goto_0

    :cond_4
    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->g0:F

    sub-float v0, p1, v0

    float-to-int v0, v0

    invoke-virtual {p0, v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->scrollBy(II)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    :cond_5
    :goto_0
    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->g0:F

    goto/16 :goto_7

    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->r0:I

    if-eq v0, v3, :cond_7

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->f0:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->j0:I

    if-le v0, v1, :cond_8

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->B()V

    invoke-virtual {p0, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->w(I)V

    goto :goto_1

    :cond_7
    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->h0:F

    sub-float v0, p1, v0

    float-to-int v0, v0

    invoke-virtual {p0, v1, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->scrollBy(II)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    :cond_8
    :goto_1
    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->h0:F

    goto/16 :goto_7

    :cond_9
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->C()V

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->i0:Landroid/view/VelocityTracker;

    const/16 v4, 0x3e8

    iget v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->l0:I

    int-to-float v5, v5

    invoke-virtual {v0, v4, v5}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v0

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->k0:I

    if-le v4, v5, :cond_a

    goto :goto_2

    :cond_a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    int-to-float v0, p1

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->e0:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->j0:I

    if-gt v0, v2, :cond_f

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    div-int/2addr p1, v0

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    sub-int/2addr p1, v0

    if-lez p1, :cond_b

    goto :goto_3

    :cond_b
    if-gez p1, :cond_f

    goto :goto_4

    :cond_c
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v5, p0, Lcom/shawnlin/numberpicker/NumberPicker;->k0:I

    if-le v4, v5, :cond_d

    :goto_2
    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->h(I)V

    invoke-virtual {p0, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->w(I)V

    goto :goto_6

    :cond_d
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    int-to-float v0, p1

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->f0:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->j0:I

    if-gt v0, v2, :cond_f

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    div-int/2addr p1, v0

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    sub-int/2addr p1, v0

    if-lez p1, :cond_e

    :goto_3
    invoke-virtual {p0, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->c(Z)V

    goto :goto_5

    :cond_e
    if-gez p1, :cond_f

    :goto_4
    invoke-virtual {p0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->c(Z)V

    goto :goto_5

    :cond_f
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->g()Z

    :goto_5
    invoke-virtual {p0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->w(I)V

    :goto_6
    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->i0:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->i0:Landroid/view/VelocityTracker;

    :goto_7
    return v3
.end method

.method public final p()V
    .locals 5

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->N:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    invoke-direct {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getSelectorIndices()[I

    move-result-object v0

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->R:[I

    array-length v3, v3

    if-ge v2, v3, :cond_1

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    sub-int v3, v2, v3

    add-int/2addr v3, v1

    iget-boolean v4, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->l(I)I

    move-result v3

    :cond_0
    aput v3, v0, v2

    aget v3, v0, v2

    invoke-virtual {p0, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->f(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public q()Z
    .locals 1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getOrder()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public r()Z
    .locals 1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getOrientation()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->C0:Z

    return v0
.end method

.method public scrollBy(II)V
    .locals 4

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->s()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->getSelectorIndices()[I

    move-result-object v0

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->q()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-boolean p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-nez p2, :cond_1

    if-lez p1, :cond_1

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget v1, v0, v1

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    if-gt v1, v2, :cond_1

    :goto_0
    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    return-void

    :cond_1
    if-nez p2, :cond_4

    if-gez p1, :cond_4

    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget p2, v0, p2

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    if-lt p2, v1, :cond_4

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-nez p2, :cond_3

    if-lez p1, :cond_3

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget v1, v0, v1

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    if-lt v1, v2, :cond_3

    goto :goto_0

    :cond_3
    if-nez p2, :cond_4

    if-gez p1, :cond_4

    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget p2, v0, p2

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    if-gt p2, v1, :cond_4

    goto :goto_0

    :cond_4
    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    add-int/2addr p2, p1

    iput p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->C:I

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->q()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-boolean p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-nez p1, :cond_6

    if-lez p2, :cond_6

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget v1, v0, v1

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    if-gt v1, v2, :cond_6

    goto :goto_0

    :cond_6
    if-nez p1, :cond_9

    if-gez p2, :cond_9

    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget p1, v0, p1

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    if-lt p1, v1, :cond_9

    goto :goto_0

    :cond_7
    iget-boolean p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-nez p1, :cond_8

    if-lez p2, :cond_8

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget v1, v0, v1

    iget v2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    if-lt v1, v2, :cond_8

    goto :goto_0

    :cond_8
    if-nez p1, :cond_9

    if-gez p2, :cond_9

    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget p1, v0, p1

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    if-gt p1, v1, :cond_9

    goto :goto_0

    :cond_9
    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->D:I

    :cond_a
    :goto_1
    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    sub-int v1, p2, v1

    const/4 v2, 0x1

    if-le v1, p1, :cond_c

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    sub-int/2addr p2, v1

    iput p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->q()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->d([I)V

    goto :goto_2

    :cond_b
    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->m([I)V

    :goto_2
    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget p2, v0, p2

    invoke-virtual {p0, p2, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->G(IZ)V

    iget-boolean p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-nez p2, :cond_a

    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget p2, v0, p2

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    if-ge p2, v1, :cond_a

    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    iput p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    goto :goto_1

    :cond_c
    :goto_3
    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    sub-int v1, p2, v1

    neg-int v3, p1

    if-ge v1, v3, :cond_e

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    add-int/2addr p2, v1

    iput p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->q()Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->m([I)V

    goto :goto_4

    :cond_d
    invoke-virtual {p0, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->d([I)V

    :goto_4
    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget p2, v0, p2

    invoke-virtual {p0, p2, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->G(IZ)V

    iget-boolean p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-nez p2, :cond_c

    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    aget p2, v0, p2

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    if-le p2, v1, :cond_c

    iget p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    iput p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    goto :goto_3

    :cond_e
    return-void
.end method

.method public setDisplayedValues([Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->E:[Ljava/lang/String;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->E:[Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    const v0, 0x80001

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    const/4 v0, 0x2

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setRawInputType(I)V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->L()Z

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->p()V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->K()V

    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->o0:I

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->n0:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setDividerColorResource(I)V
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->D0:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/daaw/zk;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setDividerColor(I)V

    return-void
.end method

.method public setDividerDistance(I)V
    .locals 0

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->e(F)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p0:I

    return-void
.end method

.method public setDividerThickness(I)V
    .locals 0

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->e(F)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->q0:I

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    return-void
.end method

.method public setFadingEdgeEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B0:Z

    return-void
.end method

.method public setFormatter(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setFormatter(Ljava/lang/String;)V

    return-void
.end method

.method public setFormatter(Lcom/shawnlin/numberpicker/NumberPicker$c;)V
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->L:Lcom/shawnlin/numberpicker/NumberPicker$c;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->L:Lcom/shawnlin/numberpicker/NumberPicker$c;

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->p()V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->L()Z

    return-void
.end method

.method public setFormatter(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->J(Ljava/lang/String;)Lcom/shawnlin/numberpicker/NumberPicker$c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setFormatter(Lcom/shawnlin/numberpicker/NumberPicker$c;)V

    return-void
.end method

.method public setMaxValue(I)V
    .locals 1

    if-ltz p1, :cond_2

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    if-ge p1, v0, :cond_0

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    :cond_0
    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    sub-int/2addr p1, v0

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->R:[I

    array-length v0, v0

    if-le p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setWrapSelectorWheel(Z)V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->p()V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->L()Z

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->K()V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxValue must be >= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setMinValue(I)V
    .locals 1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    if-le p1, v0, :cond_0

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    :cond_0
    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    sub-int/2addr v0, p1

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->R:[I

    array-length p1, p1

    if-le v0, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setWrapSelectorWheel(Z)V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->p()V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->L()Z

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->K()V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->I:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setOnLongPressUpdateInterval(J)V
    .locals 0

    iput-wide p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->M:J

    return-void
.end method

.method public setOnScrollListener(Lcom/shawnlin/numberpicker/NumberPicker$d;)V
    .locals 0

    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->K:Lcom/shawnlin/numberpicker/NumberPicker$d;

    return-void
.end method

.method public setOnValueChangedListener(Lcom/shawnlin/numberpicker/NumberPicker$e;)V
    .locals 0

    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->J:Lcom/shawnlin/numberpicker/NumberPicker$e;

    return-void
.end method

.method public setOrder(I)V
    .locals 0

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A0:I

    return-void
.end method

.method public setOrientation(I)V
    .locals 0

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z0:I

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->H()V

    return-void
.end method

.method public setScrollerEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->C0:Z

    return-void
.end method

.method public setSelectedTextColor(I)V
    .locals 1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->x:I

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextColor(I)V

    return-void
.end method

.method public setSelectedTextColorResource(I)V
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->D0:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/daaw/zk;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setSelectedTextColor(I)V

    return-void
.end method

.method public setSelectedTextSize(F)V
    .locals 1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->A:F

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->A(F)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextSize(F)V

    return-void
.end method

.method public setSelectedTextSize(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setSelectedTextSize(F)V

    return-void
.end method

.method public setTextColor(I)V
    .locals 1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->y:I

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setTextColorResource(I)V
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->D0:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/daaw/zk;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setTextColor(I)V

    return-void
.end method

.method public setTextSize(F)V
    .locals 1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->z:F

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public setTextSize(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->setTextSize(F)V

    return-void
.end method

.method public setTypeface(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->E(II)V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B:Landroid/graphics/Typeface;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->B:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->p:Landroid/widget/EditText;

    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->S:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public setTypeface(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->F(Ljava/lang/String;I)V

    return-void
.end method

.method public setValue(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->G(IZ)V

    return-void
.end method

.method public setWheelItemCount(I)V
    .locals 1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->P:I

    const/4 v0, 0x3

    if-ge p1, v0, :cond_0

    const/4 p1, 0x3

    :cond_0
    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->O:I

    div-int/lit8 v0, p1, 0x2

    iput v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->Q:I

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->R:[I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wheel item count must be >= 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setWrapSelectorWheel(Z)V
    .locals 2

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->G:I

    iget v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->F:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->R:[I

    array-length v1, v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_1

    if-eqz v0, :cond_2

    :cond_1
    iget-boolean v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    if-eq p1, v0, :cond_2

    iput-boolean p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->m0:Z

    :cond_2
    return-void
.end method

.method public final t(II)I
    .locals 4

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    return p1

    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v2, -0x80000000

    const/high16 v3, 0x40000000    # 2.0f

    if-eq v1, v2, :cond_3

    if-eqz v1, :cond_2

    if-ne v1, v3, :cond_1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown measure mode: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    return p1

    :cond_3
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    return p1
.end method

.method public final u(Lcom/daaw/k91;)Z
    .locals 6

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/k91;->d(Z)V

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->r()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/daaw/k91;->h()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/k91;->f()I

    move-result p1

    sub-int/2addr v1, p1

    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    add-int/2addr p1, v1

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    rem-int/2addr p1, v3

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    sub-int/2addr v3, p1

    if-eqz v3, :cond_5

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget v4, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    div-int/lit8 v5, v4, 0x2

    if-le p1, v5, :cond_1

    if-lez v3, :cond_0

    sub-int/2addr v3, v4

    goto :goto_0

    :cond_0
    add-int/2addr v3, v4

    :cond_1
    :goto_0
    add-int/2addr v1, v3

    invoke-virtual {p0, v1, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->scrollBy(II)V

    return v0

    :cond_2
    invoke-virtual {p1}, Lcom/daaw/k91;->i()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/k91;->g()I

    move-result p1

    sub-int/2addr v1, p1

    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->V:I

    add-int/2addr p1, v1

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    rem-int/2addr p1, v3

    iget v3, p0, Lcom/shawnlin/numberpicker/NumberPicker;->U:I

    sub-int/2addr v3, p1

    if-eqz v3, :cond_5

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget v4, p0, Lcom/shawnlin/numberpicker/NumberPicker;->T:I

    div-int/lit8 v5, v4, 0x2

    if-le p1, v5, :cond_4

    if-lez v3, :cond_3

    sub-int/2addr v3, v4

    goto :goto_1

    :cond_3
    add-int/2addr v3, v4

    :cond_4
    :goto_1
    add-int/2addr v1, v3

    invoke-virtual {p0, v2, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->scrollBy(II)V

    return v0

    :cond_5
    return v2
.end method

.method public final v(II)V
    .locals 1

    iget-object p2, p0, Lcom/shawnlin/numberpicker/NumberPicker;->J:Lcom/shawnlin/numberpicker/NumberPicker$e;

    if-eqz p2, :cond_0

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->H:I

    invoke-interface {p2, p0, p1, v0}, Lcom/shawnlin/numberpicker/NumberPicker$e;->a(Lcom/shawnlin/numberpicker/NumberPicker;II)V

    :cond_0
    return-void
.end method

.method public final w(I)V
    .locals 1

    iget v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->r0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->r0:I

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->K:Lcom/shawnlin/numberpicker/NumberPicker$d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker$d;->a(Lcom/shawnlin/numberpicker/NumberPicker;I)V

    :cond_1
    return-void
.end method

.method public final x(Lcom/daaw/k91;)V
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->W:Lcom/daaw/k91;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->g()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->L()Z

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker;->w(I)V

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->r0:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, Lcom/shawnlin/numberpicker/NumberPicker;->L()Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final y(ZJ)V
    .locals 1

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->d0:Lcom/shawnlin/numberpicker/NumberPicker$b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/shawnlin/numberpicker/NumberPicker$b;

    invoke-direct {v0, p0}, Lcom/shawnlin/numberpicker/NumberPicker$b;-><init>(Lcom/shawnlin/numberpicker/NumberPicker;)V

    iput-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->d0:Lcom/shawnlin/numberpicker/NumberPicker$b;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    :goto_0
    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker;->d0:Lcom/shawnlin/numberpicker/NumberPicker$b;

    invoke-static {v0, p1}, Lcom/shawnlin/numberpicker/NumberPicker$b;->a(Lcom/shawnlin/numberpicker/NumberPicker$b;Z)V

    iget-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker;->d0:Lcom/shawnlin/numberpicker/NumberPicker$b;

    invoke-virtual {p0, p1, p2, p3}, Landroid/widget/LinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final z(F)F
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p1, v0

    return p1
.end method
