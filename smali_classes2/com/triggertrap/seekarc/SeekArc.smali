.class public Lcom/triggertrap/seekarc/SeekArc;
.super Landroid/view/View;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/triggertrap/seekarc/SeekArc$a;
    }
.end annotation


# static fields
.field public static final N:Ljava/lang/String;

.field public static O:I


# instance fields
.field public A:Z

.field public B:I

.field public C:F

.field public D:Landroid/graphics/RectF;

.field public E:Landroid/graphics/Paint;

.field public F:Landroid/graphics/Paint;

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:D

.field public L:F

.field public M:Lcom/triggertrap/seekarc/SeekArc$a;

.field public final p:I

.field public q:Landroid/graphics/drawable/Drawable;

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/triggertrap/seekarc/SeekArc;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/triggertrap/seekarc/SeekArc;->N:Ljava/lang/String;

    const/4 v0, -0x1

    sput v0, Lcom/triggertrap/seekarc/SeekArc;->O:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, -0x5a

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->p:I

    const/16 v0, 0x64

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->r:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->s:I

    const/4 v1, 0x4

    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->t:I

    const/4 v1, 0x2

    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->u:I

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    const/16 v1, 0x168

    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->x:I

    iput-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->y:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/triggertrap/seekarc/SeekArc;->z:Z

    iput-boolean v1, p0, Lcom/triggertrap/seekarc/SeekArc;->A:Z

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->B:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->C:F

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->D:Landroid/graphics/RectF;

    const v0, 0x7f04030f

    invoke-virtual {p0, p1, p2, v0}, Lcom/triggertrap/seekarc/SeekArc;->d(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a(D)I
    .locals 2

    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->k()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p2, p1

    if-gez p2, :cond_0

    sget p2, Lcom/triggertrap/seekarc/SeekArc;->O:I

    :cond_0
    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->r:I

    if-le p2, p1, :cond_1

    sget p2, Lcom/triggertrap/seekarc/SeekArc;->O:I

    :cond_1
    return p2
.end method

.method public final b(FF)D
    .locals 3

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->G:I

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->H:I

    int-to-float v0, v0

    sub-float/2addr p2, v0

    iget-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->A:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    neg-float p1, p1

    :goto_0
    float-to-double v0, p2

    float-to-double p1, p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    const-wide v0, 0x3ff921fb54442d18L    # 1.5707963267948966

    add-double/2addr p1, v0

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->x:I

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    sub-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmpg-double v2, p1, v0

    if-gez v2, :cond_1

    const-wide v0, 0x4076800000000000L    # 360.0

    add-double/2addr p1, v0

    :cond_1
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr p1, v0

    return-wide p1
.end method

.method public final c(FF)Z
    .locals 1

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->G:I

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->H:I

    int-to-float v0, v0

    sub-float/2addr p2, v0

    mul-float p1, p1, p1

    mul-float p2, p2, p2

    add-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->L:F

    cmpg-float p1, p1, p2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const v2, 0x7f0600e0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const v3, 0x1060012

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    const v4, 0x7f08017a

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->t:I

    int-to-float v0, v0

    mul-float v0, v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->t:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    sget-object v4, Lcom/daaw/u21;->u1:[I

    invoke-virtual {p1, p2, v4, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0xb

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object p2, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p2

    const/4 p3, 0x2

    div-int/2addr p2, p3

    iget-object v4, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    div-int/2addr v4, p3

    iget-object v5, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    neg-int v6, v4

    neg-int v7, p2

    invoke-virtual {v5, v6, v7, v4, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    const/4 p2, 0x3

    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->r:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->r:I

    const/4 p2, 0x4

    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->s:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->s:I

    const/4 p2, 0x6

    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->t:I

    int-to-float v4, v4

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->t:I

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->u:I

    int-to-float p2, p2

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->u:I

    const/16 p2, 0x9

    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    const/16 p2, 0xa

    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    const/4 p2, 0x7

    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->x:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->x:I

    const/16 p2, 0x8

    iget-boolean v4, p0, Lcom/triggertrap/seekarc/SeekArc;->y:Z

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/triggertrap/seekarc/SeekArc;->y:Z

    const/16 p2, 0xd

    iget-boolean v4, p0, Lcom/triggertrap/seekarc/SeekArc;->z:Z

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/triggertrap/seekarc/SeekArc;->z:Z

    iget-boolean p2, p0, Lcom/triggertrap/seekarc/SeekArc;->A:Z

    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/triggertrap/seekarc/SeekArc;->A:Z

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    const/4 p2, 0x5

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1
    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->s:I

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->r:I

    if-le p1, p2, :cond_2

    move p1, p2

    :cond_2
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->s:I

    if-gez p1, :cond_3

    const/4 p1, 0x0

    :cond_3
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->s:I

    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    const/16 p2, 0x168

    if-le p1, p2, :cond_4

    const/16 p1, 0x168

    :cond_4
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    if-gez p1, :cond_5

    const/4 p1, 0x0

    :cond_5
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    if-le p1, p2, :cond_6

    const/4 p1, 0x0

    :cond_6
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    if-gez p1, :cond_7

    goto :goto_0

    :cond_7
    move v1, p1

    :goto_0
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->E:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->E:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->E:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->E:Landroid/graphics/Paint;

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->u:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->F:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->F:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->F:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->F:Landroid/graphics/Paint;

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->t:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-boolean p1, p0, Lcom/triggertrap/seekarc/SeekArc;->y:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->E:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->F:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    :cond_8
    return-void
.end method

.method public drawableStateChanged()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    iget-object v1, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final e(IZ)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/triggertrap/seekarc/SeekArc;->i(IZ)V

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->M:Lcom/triggertrap/seekarc/SeekArc$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/triggertrap/seekarc/SeekArc$a;->a(Lcom/triggertrap/seekarc/SeekArc;)V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->M:Lcom/triggertrap/seekarc/SeekArc$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/triggertrap/seekarc/SeekArc$a;->b(Lcom/triggertrap/seekarc/SeekArc;)V

    :cond_0
    return-void
.end method

.method public getArcRotation()I
    .locals 1

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->x:I

    return v0
.end method

.method public getArcWidth()I
    .locals 1

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->u:I

    return v0
.end method

.method public getProgressWidth()I
    .locals 1

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->t:I

    return v0
.end method

.method public getStartAngle()I
    .locals 1

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    return v0
.end method

.method public getSweepAngle()I
    .locals 1

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    return v0
.end method

.method public final h(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/triggertrap/seekarc/SeekArc;->c(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p0, v1, p1}, Lcom/triggertrap/seekarc/SeekArc;->b(FF)D

    move-result-wide v1

    iput-wide v1, p0, Lcom/triggertrap/seekarc/SeekArc;->K:D

    invoke-virtual {p0, v1, v2}, Lcom/triggertrap/seekarc/SeekArc;->a(D)I

    move-result p1

    invoke-virtual {p0, p1, v0}, Lcom/triggertrap/seekarc/SeekArc;->e(IZ)V

    return-void
.end method

.method public final i(IZ)V
    .locals 1

    sget v0, Lcom/triggertrap/seekarc/SeekArc;->O:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->M:Lcom/triggertrap/seekarc/SeekArc$a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0, p1, p2}, Lcom/triggertrap/seekarc/SeekArc$a;->c(Lcom/triggertrap/seekarc/SeekArc;IZ)V

    :cond_1
    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->r:I

    if-le p1, p2, :cond_2

    move p1, p2

    :cond_2
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->s:I

    if-gez v0, :cond_3

    const/4 p1, 0x0

    :cond_3
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->s:I

    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    int-to-float p2, p2

    mul-float p1, p1, p2

    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->C:F

    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->j()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final j()V
    .locals 7

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    int-to-float v0, v0

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->C:F

    add-float/2addr v0, v1

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->x:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x42b40000    # 90.0f

    add-float/2addr v0, v1

    float-to-int v0, v0

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->B:I

    int-to-double v1, v1

    int-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v5

    double-to-int v0, v1

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->I:I

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->B:I

    int-to-double v0, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->J:I

    return-void
.end method

.method public final k()F
    .locals 2

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->r:I

    int-to-float v0, v0

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    iget-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->A:Z

    if-nez v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    iget-object v2, p0, Lcom/triggertrap/seekarc/SeekArc;->D:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    iget-object v3, p0, Lcom/triggertrap/seekarc/SeekArc;->D:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->scale(FFFF)V

    :cond_0
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    add-int/lit8 v0, v0, -0x5a

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->x:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    iget-object v3, p0, Lcom/triggertrap/seekarc/SeekArc;->D:Landroid/graphics/RectF;

    int-to-float v0, v0

    int-to-float v5, v1

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/triggertrap/seekarc/SeekArc;->E:Landroid/graphics/Paint;

    move-object v2, p1

    move v4, v0

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v5, p0, Lcom/triggertrap/seekarc/SeekArc;->D:Landroid/graphics/RectF;

    iget v7, p0, Lcom/triggertrap/seekarc/SeekArc;->C:F

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/triggertrap/seekarc/SeekArc;->F:Landroid/graphics/Paint;

    move-object v4, p1

    move v6, v0

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->G:I

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->I:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->H:I

    iget v2, p0, Lcom/triggertrap/seekarc/SeekArc;->J:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/View;->getDefaultSize(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v1, p1}, Landroid/view/View;->getDefaultSize(II)I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v3, v1

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v3, v3, v4

    float-to-int v3, v3

    iput v3, p0, Lcom/triggertrap/seekarc/SeekArc;->G:I

    int-to-float v3, v0

    mul-float v3, v3, v4

    float-to-int v3, v3

    iput v3, p0, Lcom/triggertrap/seekarc/SeekArc;->H:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    div-int/lit8 v3, v2, 0x2

    iput v3, p0, Lcom/triggertrap/seekarc/SeekArc;->B:I

    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v0, v3

    int-to-float v0, v0

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v1, v3

    int-to-float v1, v1

    iget-object v3, p0, Lcom/triggertrap/seekarc/SeekArc;->D:Landroid/graphics/RectF;

    int-to-float v2, v2

    add-float v4, v1, v2

    add-float/2addr v2, v0

    invoke-virtual {v3, v1, v0, v4, v2}, Landroid/graphics/RectF;->set(FFFF)V

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->C:F

    float-to-int v0, v0

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->x:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x5a

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->B:I

    int-to-double v1, v1

    int-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v5

    double-to-int v0, v1

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->I:I

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->B:I

    int-to-double v0, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->J:I

    iget-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->z:Z

    invoke-virtual {p0, v0}, Lcom/triggertrap/seekarc/SeekArc;->setTouchInSide(Z)V

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->g()V

    invoke-virtual {p0, v2}, Landroid/view/View;->setPressed(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->f()V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/triggertrap/seekarc/SeekArc;->h(Landroid/view/MotionEvent;)V

    :goto_0
    return v1
.end method

.method public setArcRotation(I)V
    .locals 0

    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->x:I

    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->j()V

    return-void
.end method

.method public setArcWidth(I)V
    .locals 1

    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->u:I

    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->E:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setClockwise(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/triggertrap/seekarc/SeekArc;->A:Z

    return-void
.end method

.method public setOnSeekArcChangeListener(Lcom/triggertrap/seekarc/SeekArc$a;)V
    .locals 0

    iput-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->M:Lcom/triggertrap/seekarc/SeekArc$a;

    return-void
.end method

.method public setProgress(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/triggertrap/seekarc/SeekArc;->i(IZ)V

    return-void
.end method

.method public setProgressWidth(I)V
    .locals 1

    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->t:I

    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->F:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setRoundedEdges(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/triggertrap/seekarc/SeekArc;->y:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->E:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->F:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->E:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->F:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method

.method public setStartAngle(I)V
    .locals 0

    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->v:I

    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->j()V

    return-void
.end method

.method public setSweepAngle(I)V
    .locals 0

    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->w:I

    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->j()V

    return-void
.end method

.method public setTouchInSide(Z)V
    .locals 2

    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/triggertrap/seekarc/SeekArc;->q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    iput-boolean p1, p0, Lcom/triggertrap/seekarc/SeekArc;->z:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->B:I

    int-to-float p1, p1

    const/high16 v0, 0x40800000    # 4.0f

    div-float/2addr p1, v0

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->B:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    :goto_0
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->L:F

    return-void
.end method
