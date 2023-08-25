.class public Lcom/daaw/xg;
.super Landroid/view/View;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/xg$b;
    }
.end annotation


# instance fields
.field public A:Ljava/lang/Integer;

.field public B:Ljava/lang/Integer;

.field public C:Landroid/graphics/Paint;

.field public D:Landroid/graphics/Paint;

.field public E:Landroid/graphics/Paint;

.field public F:Lcom/daaw/tg;

.field public G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/au0;",
            ">;"
        }
    .end annotation
.end field

.field public H:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/bu0;",
            ">;"
        }
    .end annotation
.end field

.field public I:Lcom/daaw/vj0;

.field public J:Lcom/daaw/m2;

.field public K:Landroid/widget/EditText;

.field public L:Landroid/text/TextWatcher;

.field public M:Landroid/widget/LinearLayout;

.field public N:Lcom/daaw/bh;

.field public O:I

.field public P:I

.field public p:Landroid/graphics/Bitmap;

.field public q:Landroid/graphics/Canvas;

.field public r:Landroid/graphics/Bitmap;

.field public s:Landroid/graphics/Canvas;

.field public t:Z

.field public u:I

.field public v:F

.field public w:F

.field public x:I

.field public y:[Ljava/lang/Integer;

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x8

    iput v0, p0, Lcom/daaw/xg;->u:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/xg;->v:F

    iput v0, p0, Lcom/daaw/xg;->w:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/xg;->x:I

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iput-object v1, p0, Lcom/daaw/xg;->y:[Ljava/lang/Integer;

    iput v0, p0, Lcom/daaw/xg;->z:I

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/lv0$b;->b(I)Lcom/daaw/lv0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/xg;->C:Landroid/graphics/Paint;

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/lv0$b;->b(I)Lcom/daaw/lv0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xg;->D:Landroid/graphics/Paint;

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xg;->E:Landroid/graphics/Paint;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/xg;->G:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/xg;->H:Ljava/util/ArrayList;

    new-instance v0, Lcom/daaw/xg$a;

    invoke-direct {v0, p0}, Lcom/daaw/xg$a;-><init>(Lcom/daaw/xg;)V

    iput-object v0, p0, Lcom/daaw/xg;->L:Landroid/text/TextWatcher;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/xg;->g(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private setColorPreviewColor(I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/xg;->M:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/daaw/xg;->y:[Ljava/lang/Integer;

    if-eqz v1, :cond_3

    iget v2, p0, Lcom/daaw/xg;->z:I

    array-length v3, v1

    if-gt v2, v3, :cond_3

    aget-object v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/xg;->M:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/xg;->M:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/daaw/xg;->z:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/LinearLayout;

    if-nez v1, :cond_2

    return-void

    :cond_2
    check-cast v0, Landroid/widget/LinearLayout;

    sget v1, Lcom/daaw/w11;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-instance v1, Lcom/daaw/ug;

    invoke-direct {v1, p1}, Lcom/daaw/ug;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private setColorText(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xg;->K:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/xg;->J:Lcom/daaw/m2;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1, v1}, Lcom/daaw/zq1;->e(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setColorToSliders(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xg;->I:Lcom/daaw/vj0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/vj0;->setColor(I)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/xg;->J:Lcom/daaw/m2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/daaw/m2;->setColor(I)V

    :cond_1
    return-void
.end method

.method private setHighlightedColor(I)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/xg;->M:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/daaw/xg;->M:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Lcom/daaw/xg;->M:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroid/widget/LinearLayout;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    check-cast v3, Landroid/widget/LinearLayout;

    if-ne v2, p1, :cond_2

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/au0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xg;->G:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lcom/daaw/bu0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xg;->H:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(II)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xg;->G:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-eq p1, p2, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/au0;

    :try_start_0
    invoke-interface {v0, p2}, Lcom/daaw/au0;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/xg;->q:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lcom/daaw/xg;->s:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lcom/daaw/xg;->N:Lcom/daaw/bh;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/xg;->q:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const v2, 0x3fc4cccc    # 1.5374999f

    sub-float v3, v0, v2

    iget v4, p0, Lcom/daaw/xg;->u:I

    int-to-float v5, v4

    div-float/2addr v0, v5

    sub-float/2addr v3, v0

    add-int/lit8 v4, v4, -0x1

    int-to-float v0, v4

    div-float v0, v3, v0

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/daaw/xg;->N:Lcom/daaw/bh;

    invoke-interface {v1}, Lcom/daaw/bh;->b()Lcom/daaw/ah;

    move-result-object v1

    iget v4, p0, Lcom/daaw/xg;->u:I

    iput v4, v1, Lcom/daaw/ah;->a:I

    iput v3, v1, Lcom/daaw/ah;->b:F

    iput v0, v1, Lcom/daaw/ah;->c:F

    iput v2, v1, Lcom/daaw/ah;->d:F

    iget v0, p0, Lcom/daaw/xg;->w:F

    iput v0, v1, Lcom/daaw/ah;->e:F

    iget v0, p0, Lcom/daaw/xg;->v:F

    iput v0, v1, Lcom/daaw/ah;->f:F

    iget-object v0, p0, Lcom/daaw/xg;->q:Landroid/graphics/Canvas;

    iput-object v0, v1, Lcom/daaw/ah;->g:Landroid/graphics/Canvas;

    iget-object v0, p0, Lcom/daaw/xg;->N:Lcom/daaw/bh;

    invoke-interface {v0, v1}, Lcom/daaw/bh;->c(Lcom/daaw/ah;)V

    iget-object v0, p0, Lcom/daaw/xg;->N:Lcom/daaw/bh;

    invoke-interface {v0}, Lcom/daaw/bh;->a()V

    return-void
.end method

.method public final e(I)Lcom/daaw/tg;
    .locals 21

    const/4 v0, 0x3

    new-array v0, v0, [F

    move/from16 v1, p1

    invoke-static {v1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v1, 0x1

    aget v2, v0, v1

    float-to-double v2, v2

    const/4 v4, 0x0

    aget v5, v0, v4

    float-to-double v5, v5

    const-wide v7, 0x400921fb54442d18L    # Math.PI

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    const-wide v9, 0x4066800000000000L    # 180.0

    div-double/2addr v5, v9

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v5

    aget v5, v0, v1

    float-to-double v5, v5

    aget v0, v0, v4

    float-to-double v11, v0

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v11, v11, v7

    div-double/2addr v11, v9

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v11

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/daaw/xg;->N:Lcom/daaw/bh;

    invoke-interface {v11}, Lcom/daaw/bh;->d()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    const-wide v13, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/daaw/tg;

    invoke-virtual {v15}, Lcom/daaw/tg;->b()[F

    move-result-object v16

    aget v9, v16, v1

    float-to-double v9, v9

    aget v1, v16, v4

    move-wide/from16 v19, v5

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v7

    const-wide v17, 0x4066800000000000L    # 180.0

    div-double v4, v4, v17

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v9, v9, v4

    const/4 v1, 0x1

    aget v4, v16, v1

    float-to-double v4, v4

    const/4 v6, 0x0

    aget v1, v16, v6

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v7

    div-double v0, v0, v17

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v0

    sub-double v0, v2, v9

    sub-double v4, v19, v4

    mul-double v0, v0, v0

    mul-double v4, v4, v4

    add-double/2addr v0, v4

    cmpg-double v4, v0, v13

    if-gez v4, :cond_0

    move-wide v13, v0

    move-object v12, v15

    :cond_0
    move-object/from16 v0, p0

    move-wide/from16 v9, v17

    move-wide/from16 v5, v19

    const/4 v1, 0x1

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    return-object v12
.end method

.method public final f(FF)Lcom/daaw/tg;
    .locals 8

    iget-object v0, p0, Lcom/daaw/xg;->N:Lcom/daaw/bh;

    invoke-interface {v0}, Lcom/daaw/bh;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/tg;

    invoke-virtual {v4, p1, p2}, Lcom/daaw/tg;->g(FF)D

    move-result-wide v5

    cmpl-double v7, v2, v5

    if-lez v7, :cond_0

    move-object v1, v4

    move-wide v2, v5

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final g(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-object v0, Lcom/daaw/v21;->s:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lcom/daaw/v21;->u:I

    const/16 v0, 0xa

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/daaw/xg;->u:I

    sget p2, Lcom/daaw/v21;->v:I

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    sget p2, Lcom/daaw/v21;->x:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/xg;->B:Ljava/lang/Integer;

    sget p2, Lcom/daaw/v21;->y:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2}, Lcom/daaw/xg$b;->a(I)Lcom/daaw/xg$b;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/ch;->a(Lcom/daaw/xg$b;)Lcom/daaw/bh;

    move-result-object p2

    sget v1, Lcom/daaw/v21;->t:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/daaw/xg;->O:I

    sget v1, Lcom/daaw/v21;->w:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/xg;->P:I

    invoke-virtual {p0, p2}, Lcom/daaw/xg;->setRenderer(Lcom/daaw/bh;)V

    iget p2, p0, Lcom/daaw/xg;->u:I

    invoke-virtual {p0, p2}, Lcom/daaw/xg;->setDensity(I)V

    iget-object p2, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/daaw/xg;->i(IZ)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public getAllColors()[Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xg;->y:[Ljava/lang/Integer;

    return-object v0
.end method

.method public getSelectedColor()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/tg;->a()I

    move-result v0

    iget v1, p0, Lcom/daaw/xg;->v:F

    invoke-static {v0, v1}, Lcom/daaw/zq1;->c(IF)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/daaw/xg;->w:F

    invoke-static {v1, v0}, Lcom/daaw/zq1;->a(FI)I

    move-result v0

    return v0
.end method

.method public h(IZ)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/xg;->i(IZ)V

    invoke-virtual {p0}, Lcom/daaw/xg;->j()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public i(IZ)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [F

    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    invoke-static {p1}, Lcom/daaw/zq1;->d(I)F

    move-result v1

    iput v1, p0, Lcom/daaw/xg;->w:F

    const/4 v1, 0x2

    aget v0, v0, v1

    iput v0, p0, Lcom/daaw/xg;->v:F

    iget-object v0, p0, Lcom/daaw/xg;->y:[Ljava/lang/Integer;

    iget v1, p0, Lcom/daaw/xg;->z:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    invoke-direct {p0, p1}, Lcom/daaw/xg;->setColorPreviewColor(I)V

    invoke-direct {p0, p1}, Lcom/daaw/xg;->setColorToSliders(I)V

    iget-object v0, p0, Lcom/daaw/xg;->K:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lcom/daaw/xg;->setColorText(I)V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/xg;->e(I)Lcom/daaw/tg;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    return-void
.end method

.method public final j()V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    if-ge v1, v0, :cond_0

    move v0, v1

    :cond_0
    if-gtz v0, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/daaw/xg;->p:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-eq v1, v0, :cond_3

    :cond_2
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/xg;->p:Landroid/graphics/Bitmap;

    new-instance v1, Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/daaw/xg;->p:Landroid/graphics/Bitmap;

    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v1, p0, Lcom/daaw/xg;->q:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/daaw/xg;->E:Landroid/graphics/Paint;

    const/16 v2, 0x1a

    invoke-static {v2}, Lcom/daaw/lv0;->b(I)Landroid/graphics/Shader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_3
    iget-object v1, p0, Lcom/daaw/xg;->r:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-eq v1, v0, :cond_5

    :cond_4
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xg;->r:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/daaw/xg;->r:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/daaw/xg;->s:Landroid/graphics/Canvas;

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/xg;->d()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/daaw/xg;->x:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f833333    # 1.025f

    div-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/xg;->u:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v2, p0, Lcom/daaw/xg;->p:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/daaw/xg;->C:Landroid/graphics/Paint;

    iget v4, p0, Lcom/daaw/xg;->v:F

    invoke-virtual {v2, v4}, Lcom/daaw/tg;->c(F)[F

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, p0, Lcom/daaw/xg;->C:Landroid/graphics/Paint;

    iget v3, p0, Lcom/daaw/xg;->w:F

    const/high16 v4, 0x437f0000    # 255.0f

    mul-float v3, v3, v4

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v2, p0, Lcom/daaw/xg;->s:Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {v3}, Lcom/daaw/tg;->d()F

    move-result v3

    iget-object v4, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {v4}, Lcom/daaw/tg;->e()F

    move-result v4

    const/high16 v5, 0x40800000    # 4.0f

    add-float/2addr v5, v0

    iget-object v6, p0, Lcom/daaw/xg;->E:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/daaw/xg;->s:Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {v3}, Lcom/daaw/tg;->d()F

    move-result v3

    iget-object v4, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {v4}, Lcom/daaw/tg;->e()F

    move-result v4

    iget-object v6, p0, Lcom/daaw/xg;->C:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-static {}, Lcom/daaw/lv0;->c()Lcom/daaw/lv0$b;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Lcom/daaw/lv0$b;->b(I)Lcom/daaw/lv0$b;

    move-result-object v2

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Lcom/daaw/lv0$b;->e(Landroid/graphics/Paint$Style;)Lcom/daaw/lv0$b;

    move-result-object v2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v3, v3, v0

    invoke-virtual {v2, v3}, Lcom/daaw/lv0$b;->d(F)Lcom/daaw/lv0$b;

    move-result-object v2

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v3}, Lcom/daaw/lv0$b;->f(Landroid/graphics/PorterDuff$Mode;)Lcom/daaw/lv0$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/lv0$b;->a()Landroid/graphics/Paint;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/xg;->D:Landroid/graphics/Paint;

    iget-boolean v2, p0, Lcom/daaw/xg;->t:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/xg;->q:Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {v3}, Lcom/daaw/tg;->d()F

    move-result v3

    iget-object v4, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {v4}, Lcom/daaw/tg;->e()F

    move-result v4

    iget-object v5, p0, Lcom/daaw/xg;->D:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v5

    div-float/2addr v5, v1

    add-float/2addr v5, v0

    iget-object v6, p0, Lcom/daaw/xg;->D:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    iget-object v2, p0, Lcom/daaw/xg;->p:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v3, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/daaw/xg;->s:Landroid/graphics/Canvas;

    iget-object v5, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {v5}, Lcom/daaw/tg;->d()F

    move-result v5

    iget-object v6, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {v6}, Lcom/daaw/tg;->e()F

    move-result v6

    iget-object v7, p0, Lcom/daaw/xg;->D:Landroid/graphics/Paint;

    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v7

    div-float/2addr v7, v1

    add-float/2addr v0, v7

    iget-object v1, p0, Lcom/daaw/xg;->D:Landroid/graphics/Paint;

    invoke-virtual {v2, v5, v6, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/daaw/xg;->r:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v3, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    iget p1, p0, Lcom/daaw/xg;->O:I

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    iget p2, p0, Lcom/daaw/xg;->O:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/daaw/m2;

    invoke-virtual {p0, p1}, Lcom/daaw/xg;->setAlphaSlider(Lcom/daaw/m2;)V

    :cond_0
    iget p1, p0, Lcom/daaw/xg;->P:I

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    iget p2, p0, Lcom/daaw/xg;->P:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/daaw/vj0;

    invoke-virtual {p0, p1}, Lcom/daaw/xg;->setLightnessSlider(Lcom/daaw/vj0;)V

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/xg;->j()V

    iget-object p1, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/xg;->e(I)Lcom/daaw/tg;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    return-void
.end method

.method public onMeasure(II)V
    .locals 4

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-ne v0, v2, :cond_1

    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_1

    :cond_1
    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    if-ne v0, v2, :cond_4

    :goto_2
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_3

    :cond_4
    if-ne v0, v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    :goto_3
    if-ge p2, p1, :cond_6

    move p1, p2

    :cond_6
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Lcom/daaw/xg;->j()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/xg;->getSelectedColor()I

    move-result p1

    iget-object v0, p0, Lcom/daaw/xg;->H:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/bu0;

    :try_start_0
    invoke-interface {v2, p1}, Lcom/daaw/bu0;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lcom/daaw/xg;->setColorToSliders(I)V

    invoke-direct {p0, p1}, Lcom/daaw/xg;->setColorText(I)V

    invoke-direct {p0, p1}, Lcom/daaw/xg;->setColorPreviewColor(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/xg;->getSelectedColor()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p0, v2, p1}, Lcom/daaw/xg;->f(FF)Lcom/daaw/tg;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {p0}, Lcom/daaw/xg;->getSelectedColor()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/daaw/xg;->c(II)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    invoke-direct {p0, p1}, Lcom/daaw/xg;->setColorToSliders(I)V

    invoke-virtual {p0}, Lcom/daaw/xg;->j()V

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :goto_2
    return v1
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    invoke-virtual {p0}, Lcom/daaw/xg;->j()V

    iget-object p1, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/xg;->e(I)Lcom/daaw/tg;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    return-void
.end method

.method public setAlphaSlider(Lcom/daaw/m2;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/xg;->J:Lcom/daaw/m2;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/m2;->setColorPicker(Lcom/daaw/xg;)V

    iget-object p1, p0, Lcom/daaw/xg;->J:Lcom/daaw/m2;

    invoke-virtual {p0}, Lcom/daaw/xg;->getSelectedColor()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/m2;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setAlphaValue(F)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/xg;->getSelectedColor()I

    move-result v0

    iput p1, p0, Lcom/daaw/xg;->w:F

    invoke-static {p1}, Lcom/daaw/zq1;->b(F)I

    move-result p1

    iget-object v1, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    iget v2, p0, Lcom/daaw/xg;->v:F

    invoke-virtual {v1, v2}, Lcom/daaw/tg;->c(F)[F

    move-result-object v1

    invoke-static {p1, v1}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/daaw/xg;->K:Landroid/widget/EditText;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v2, p0, Lcom/daaw/xg;->J:Lcom/daaw/m2;

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v2}, Lcom/daaw/zq1;->e(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/xg;->I:Lcom/daaw/vj0;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/daaw/vj0;->setColor(I)V

    :cond_2
    iget-object p1, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/daaw/xg;->c(II)V

    invoke-virtual {p0}, Lcom/daaw/xg;->j()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setColorEdit(Landroid/widget/EditText;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/xg;->K:Landroid/widget/EditText;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/xg;->K:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/daaw/xg;->L:Landroid/text/TextWatcher;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p0, Lcom/daaw/xg;->B:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/xg;->setColorEditTextColor(I)V

    :cond_0
    return-void
.end method

.method public setColorEditTextColor(I)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xg;->B:Ljava/lang/Integer;

    iget-object v0, p0, Lcom/daaw/xg;->K:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setDensity(I)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/xg;->u:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setLightness(F)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/xg;->getSelectedColor()I

    move-result v0

    iput p1, p0, Lcom/daaw/xg;->v:F

    iget-object v1, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    if-eqz v1, :cond_3

    iget v1, p0, Lcom/daaw/xg;->w:F

    invoke-static {v1}, Lcom/daaw/zq1;->b(F)I

    move-result v1

    iget-object v2, p0, Lcom/daaw/xg;->F:Lcom/daaw/tg;

    invoke-virtual {v2, p1}, Lcom/daaw/tg;->c(F)[F

    move-result-object p1

    invoke-static {v1, p1}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/daaw/xg;->K:Landroid/widget/EditText;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v2, p0, Lcom/daaw/xg;->J:Lcom/daaw/m2;

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v2}, Lcom/daaw/zq1;->e(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/xg;->J:Lcom/daaw/m2;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/daaw/m2;->setColor(I)V

    :cond_2
    iget-object p1, p0, Lcom/daaw/xg;->A:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/daaw/xg;->c(II)V

    invoke-virtual {p0}, Lcom/daaw/xg;->j()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_3
    return-void
.end method

.method public setLightnessSlider(Lcom/daaw/vj0;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/xg;->I:Lcom/daaw/vj0;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/vj0;->setColorPicker(Lcom/daaw/xg;)V

    iget-object p1, p0, Lcom/daaw/xg;->I:Lcom/daaw/vj0;

    invoke-virtual {p0}, Lcom/daaw/xg;->getSelectedColor()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/vj0;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setRenderer(Lcom/daaw/bh;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xg;->N:Lcom/daaw/bh;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSelectedColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xg;->y:[Ljava/lang/Integer;

    if-eqz v0, :cond_2

    array-length v0, v0

    if-ge v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/daaw/xg;->z:I

    invoke-direct {p0, p1}, Lcom/daaw/xg;->setHighlightedColor(I)V

    iget-object v0, p0, Lcom/daaw/xg;->y:[Ljava/lang/Integer;

    aget-object p1, v0, p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/xg;->h(IZ)V

    :cond_2
    :goto_0
    return-void
.end method

.method public setShowBorder(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/xg;->t:Z

    return-void
.end method
