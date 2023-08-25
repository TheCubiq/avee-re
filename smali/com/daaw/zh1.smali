.class public final Lcom/daaw/zh1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:F

.field public B:F

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:Landroid/text/StaticLayout;

.field public H:I

.field public I:I

.field public J:I

.field public K:Landroid/graphics/Rect;

.field public final a:Landroid/graphics/RectF;

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:Landroid/text/TextPaint;

.field public final i:Landroid/graphics/Paint;

.field public j:Ljava/lang/CharSequence;

.field public k:Landroid/text/Layout$Alignment;

.field public l:Landroid/graphics/Bitmap;

.field public m:F

.field public n:I

.field public o:I

.field public p:F

.field public q:I

.field public r:F

.field public s:F

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/daaw/zh1;->a:Landroid/graphics/RectF;

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/daaw/zh1;->g:F

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Lcom/daaw/zh1;->f:F

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    const/high16 v0, 0x43200000    # 160.0f

    div-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/daaw/zh1;->b:F

    iput p1, p0, Lcom/daaw/zh1;->c:F

    iput p1, p0, Lcom/daaw/zh1;->d:F

    iput p1, p0, Lcom/daaw/zh1;->e:F

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    invoke-virtual {p1, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    invoke-virtual {p1, v1}, Landroid/text/TextPaint;->setSubpixelText(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/daaw/zh1;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x1010217
        0x1010218
    .end array-data
.end method

.method public static a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public b(Lcom/daaw/ln;ZZLcom/daaw/zd;FFLandroid/graphics/Canvas;IIII)V
    .locals 4

    iget-object v0, p1, Lcom/daaw/ln;->r:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/high16 v1, -0x1000000

    if-eqz v0, :cond_3

    iget-object v1, p1, Lcom/daaw/ln;->p:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-boolean v1, p1, Lcom/daaw/ln;->z:Z

    if-eqz v1, :cond_2

    if-eqz p2, :cond_2

    iget v1, p1, Lcom/daaw/ln;->A:I

    goto :goto_1

    :cond_2
    iget v1, p4, Lcom/daaw/zd;->c:I

    :cond_3
    :goto_1
    iget-object v2, p0, Lcom/daaw/zh1;->j:Ljava/lang/CharSequence;

    iget-object v3, p1, Lcom/daaw/ln;->p:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lcom/daaw/zh1;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/daaw/zh1;->k:Landroid/text/Layout$Alignment;

    iget-object v3, p1, Lcom/daaw/ln;->q:Landroid/text/Layout$Alignment;

    invoke-static {v2, v3}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/daaw/zh1;->l:Landroid/graphics/Bitmap;

    iget-object v3, p1, Lcom/daaw/ln;->r:Landroid/graphics/Bitmap;

    if-ne v2, v3, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->m:F

    iget v3, p1, Lcom/daaw/ln;->s:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->n:I

    iget v3, p1, Lcom/daaw/ln;->t:I

    if-ne v2, v3, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/daaw/ln;->u:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->p:F

    iget v3, p1, Lcom/daaw/ln;->v:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->q:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/daaw/ln;->w:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->r:F

    iget v3, p1, Lcom/daaw/ln;->x:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->s:F

    iget v3, p1, Lcom/daaw/ln;->y:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_4

    iget-boolean v2, p0, Lcom/daaw/zh1;->t:Z

    if-ne v2, p2, :cond_4

    iget-boolean v2, p0, Lcom/daaw/zh1;->u:Z

    if-ne v2, p3, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->v:I

    iget v3, p4, Lcom/daaw/zd;->a:I

    if-ne v2, v3, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->w:I

    iget v3, p4, Lcom/daaw/zd;->b:I

    if-ne v2, v3, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->x:I

    if-ne v2, v1, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->z:I

    iget v3, p4, Lcom/daaw/zd;->d:I

    if-ne v2, v3, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->y:I

    iget v3, p4, Lcom/daaw/zd;->e:I

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    iget-object v3, p4, Lcom/daaw/zd;->f:Landroid/graphics/Typeface;

    invoke-static {v2, v3}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->A:F

    cmpl-float v2, v2, p5

    if-nez v2, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->B:F

    cmpl-float v2, v2, p6

    if-nez v2, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->C:I

    if-ne v2, p8, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->D:I

    if-ne v2, p9, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->E:I

    if-ne v2, p10, :cond_4

    iget v2, p0, Lcom/daaw/zh1;->F:I

    if-ne v2, p11, :cond_4

    invoke-virtual {p0, p7, v0}, Lcom/daaw/zh1;->d(Landroid/graphics/Canvas;Z)V

    return-void

    :cond_4
    iget-object v2, p1, Lcom/daaw/ln;->p:Ljava/lang/CharSequence;

    iput-object v2, p0, Lcom/daaw/zh1;->j:Ljava/lang/CharSequence;

    iget-object v2, p1, Lcom/daaw/ln;->q:Landroid/text/Layout$Alignment;

    iput-object v2, p0, Lcom/daaw/zh1;->k:Landroid/text/Layout$Alignment;

    iget-object v2, p1, Lcom/daaw/ln;->r:Landroid/graphics/Bitmap;

    iput-object v2, p0, Lcom/daaw/zh1;->l:Landroid/graphics/Bitmap;

    iget v2, p1, Lcom/daaw/ln;->s:F

    iput v2, p0, Lcom/daaw/zh1;->m:F

    iget v2, p1, Lcom/daaw/ln;->t:I

    iput v2, p0, Lcom/daaw/zh1;->n:I

    iget v2, p1, Lcom/daaw/ln;->u:I

    iput v2, p0, Lcom/daaw/zh1;->o:I

    iget v2, p1, Lcom/daaw/ln;->v:F

    iput v2, p0, Lcom/daaw/zh1;->p:F

    iget v2, p1, Lcom/daaw/ln;->w:I

    iput v2, p0, Lcom/daaw/zh1;->q:I

    iget v2, p1, Lcom/daaw/ln;->x:F

    iput v2, p0, Lcom/daaw/zh1;->r:F

    iget p1, p1, Lcom/daaw/ln;->y:F

    iput p1, p0, Lcom/daaw/zh1;->s:F

    iput-boolean p2, p0, Lcom/daaw/zh1;->t:Z

    iput-boolean p3, p0, Lcom/daaw/zh1;->u:Z

    iget p1, p4, Lcom/daaw/zd;->a:I

    iput p1, p0, Lcom/daaw/zh1;->v:I

    iget p1, p4, Lcom/daaw/zd;->b:I

    iput p1, p0, Lcom/daaw/zh1;->w:I

    iput v1, p0, Lcom/daaw/zh1;->x:I

    iget p1, p4, Lcom/daaw/zd;->d:I

    iput p1, p0, Lcom/daaw/zh1;->z:I

    iget p1, p4, Lcom/daaw/zd;->e:I

    iput p1, p0, Lcom/daaw/zh1;->y:I

    iget-object p1, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget-object p2, p4, Lcom/daaw/zd;->f:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iput p5, p0, Lcom/daaw/zh1;->A:F

    iput p6, p0, Lcom/daaw/zh1;->B:F

    iput p8, p0, Lcom/daaw/zh1;->C:I

    iput p9, p0, Lcom/daaw/zh1;->D:I

    iput p10, p0, Lcom/daaw/zh1;->E:I

    iput p11, p0, Lcom/daaw/zh1;->F:I

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/daaw/zh1;->g()V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/zh1;->f()V

    :goto_2
    invoke-virtual {p0, p7, v0}, Lcom/daaw/zh1;->d(Landroid/graphics/Canvas;Z)V

    return-void
.end method

.method public final c(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/zh1;->l:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/daaw/zh1;->K:Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final d(Landroid/graphics/Canvas;Z)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/zh1;->e(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/zh1;->c(Landroid/graphics/Canvas;)V

    :goto_0
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 12

    iget-object v0, p0, Lcom/daaw/zh1;->G:Landroid/text/StaticLayout;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    iget v2, p0, Lcom/daaw/zh1;->H:I

    int-to-float v2, v2

    iget v3, p0, Lcom/daaw/zh1;->I:I

    int-to-float v3, v3

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    iget v2, p0, Lcom/daaw/zh1;->x:I

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    if-lez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/zh1;->i:Landroid/graphics/Paint;

    iget v3, p0, Lcom/daaw/zh1;->x:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, p0, Lcom/daaw/zh1;->J:I

    neg-int v2, v2

    int-to-float v4, v2

    const/4 v5, 0x0

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getWidth()I

    move-result v2

    iget v3, p0, Lcom/daaw/zh1;->J:I

    add-int/2addr v2, v3

    int-to-float v6, v2

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getHeight()I

    move-result v2

    int-to-float v7, v2

    iget-object v8, p0, Lcom/daaw/zh1;->i:Landroid/graphics/Paint;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_1
    iget v2, p0, Lcom/daaw/zh1;->w:I

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-lez v2, :cond_3

    iget-object v2, p0, Lcom/daaw/zh1;->i:Landroid/graphics/Paint;

    iget v5, p0, Lcom/daaw/zh1;->w:I

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0, v4}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    invoke-virtual {v0, v6}, Landroid/text/StaticLayout;->getLineLeft(I)F

    move-result v7

    invoke-virtual {v0, v6}, Landroid/text/StaticLayout;->getLineRight(I)F

    move-result v8

    iget-object v9, p0, Lcom/daaw/zh1;->a:Landroid/graphics/RectF;

    iget v10, p0, Lcom/daaw/zh1;->J:I

    int-to-float v11, v10

    sub-float v11, v7, v11

    iput v11, v9, Landroid/graphics/RectF;->left:F

    int-to-float v10, v10

    add-float/2addr v10, v8

    iput v10, v9, Landroid/graphics/RectF;->right:F

    iput v2, v9, Landroid/graphics/RectF;->top:F

    invoke-virtual {v0, v6}, Landroid/text/StaticLayout;->getLineBottom(I)I

    move-result v2

    int-to-float v2, v2

    iput v2, v9, Landroid/graphics/RectF;->bottom:F

    iget-object v2, p0, Lcom/daaw/zh1;->a:Landroid/graphics/RectF;

    iget v9, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v8, v7

    cmpl-float v7, v8, v3

    if-lez v7, :cond_2

    iget v7, p0, Lcom/daaw/zh1;->b:F

    iget-object v8, p0, Lcom/daaw/zh1;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v7, v7, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_2
    add-int/lit8 v6, v6, 0x1

    move v2, v9

    goto :goto_0

    :cond_3
    iget v2, p0, Lcom/daaw/zh1;->z:I

    const/4 v5, 0x1

    if-ne v2, v5, :cond_4

    iget-object v2, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    sget-object v5, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v2, v5}, Landroid/text/TextPaint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    iget-object v2, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v5, p0, Lcom/daaw/zh1;->c:F

    invoke-virtual {v2, v5}, Landroid/text/TextPaint;->setStrokeWidth(F)V

    iget-object v2, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v5, p0, Lcom/daaw/zh1;->y:I

    invoke-virtual {v2, v5}, Landroid/text/TextPaint;->setColor(I)V

    iget-object v2, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    sget-object v5, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v5}, Landroid/text/TextPaint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    goto :goto_3

    :cond_4
    const/4 v6, 0x2

    if-ne v2, v6, :cond_5

    iget-object v2, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v5, p0, Lcom/daaw/zh1;->d:F

    iget v6, p0, Lcom/daaw/zh1;->e:F

    iget v7, p0, Lcom/daaw/zh1;->y:I

    invoke-virtual {v2, v5, v6, v6, v7}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto :goto_3

    :cond_5
    const/4 v6, 0x3

    if-eq v2, v6, :cond_6

    const/4 v7, 0x4

    if-ne v2, v7, :cond_a

    :cond_6
    if-ne v2, v6, :cond_7

    goto :goto_1

    :cond_7
    const/4 v5, 0x0

    :goto_1
    const/4 v2, -0x1

    if-eqz v5, :cond_8

    const/4 v6, -0x1

    goto :goto_2

    :cond_8
    iget v6, p0, Lcom/daaw/zh1;->y:I

    :goto_2
    if-eqz v5, :cond_9

    iget v2, p0, Lcom/daaw/zh1;->y:I

    :cond_9
    iget v5, p0, Lcom/daaw/zh1;->d:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v5, v7

    iget-object v7, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v8, p0, Lcom/daaw/zh1;->v:I

    invoke-virtual {v7, v8}, Landroid/text/TextPaint;->setColor(I)V

    iget-object v7, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v8}, Landroid/text/TextPaint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v7, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v8, p0, Lcom/daaw/zh1;->d:F

    neg-float v9, v5

    invoke-virtual {v7, v8, v9, v9, v6}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    iget-object v6, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v7, p0, Lcom/daaw/zh1;->d:F

    invoke-virtual {v6, v7, v5, v5, v2}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    :cond_a
    :goto_3
    iget-object v2, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v5, p0, Lcom/daaw/zh1;->v:I

    invoke-virtual {v2, v5}, Landroid/text/TextPaint;->setColor(I)V

    iget-object v2, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v5}, Landroid/text/TextPaint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    invoke-virtual {v0, v3, v3, v3, v4}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public final f()V
    .locals 7

    iget v0, p0, Lcom/daaw/zh1;->E:I

    iget v1, p0, Lcom/daaw/zh1;->C:I

    sub-int/2addr v0, v1

    iget v2, p0, Lcom/daaw/zh1;->F:I

    iget v3, p0, Lcom/daaw/zh1;->D:I

    sub-int/2addr v2, v3

    int-to-float v1, v1

    int-to-float v0, v0

    iget v4, p0, Lcom/daaw/zh1;->p:F

    mul-float v4, v4, v0

    add-float/2addr v1, v4

    int-to-float v3, v3

    int-to-float v2, v2

    iget v4, p0, Lcom/daaw/zh1;->m:F

    mul-float v4, v4, v2

    add-float/2addr v3, v4

    iget v4, p0, Lcom/daaw/zh1;->r:F

    mul-float v0, v0, v4

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v4, p0, Lcom/daaw/zh1;->s:F

    const/4 v5, 0x1

    cmpl-float v5, v4, v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v2, v0

    iget-object v4, p0, Lcom/daaw/zh1;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/daaw/zh1;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    :goto_0
    mul-float v2, v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v4, p0, Lcom/daaw/zh1;->o:I

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-ne v4, v6, :cond_1

    int-to-float v4, v0

    :goto_1
    sub-float/2addr v1, v4

    goto :goto_2

    :cond_1
    if-ne v4, v5, :cond_2

    div-int/lit8 v4, v0, 0x2

    int-to-float v4, v4

    goto :goto_1

    :cond_2
    :goto_2
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v4, p0, Lcom/daaw/zh1;->q:I

    if-ne v4, v6, :cond_3

    int-to-float v4, v2

    :goto_3
    sub-float/2addr v3, v4

    goto :goto_4

    :cond_3
    if-ne v4, v5, :cond_4

    div-int/lit8 v4, v2, 0x2

    int-to-float v4, v4

    goto :goto_3

    :cond_4
    :goto_4
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    new-instance v4, Landroid/graphics/Rect;

    add-int/2addr v0, v1

    add-int/2addr v2, v3

    invoke-direct {v4, v1, v3, v0, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v4, p0, Lcom/daaw/zh1;->K:Landroid/graphics/Rect;

    return-void
.end method

.method public final g()V
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Lcom/daaw/zh1;->E:I

    iget v2, v0, Lcom/daaw/zh1;->C:I

    sub-int/2addr v1, v2

    iget v2, v0, Lcom/daaw/zh1;->F:I

    iget v3, v0, Lcom/daaw/zh1;->D:I

    sub-int/2addr v2, v3

    iget-object v3, v0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v4, v0, Lcom/daaw/zh1;->A:F

    invoke-virtual {v3, v4}, Landroid/text/TextPaint;->setTextSize(F)V

    iget v3, v0, Lcom/daaw/zh1;->A:F

    const/high16 v4, 0x3e000000    # 0.125f

    mul-float v3, v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v3, v4

    float-to-int v3, v3

    mul-int/lit8 v4, v3, 0x2

    sub-int v5, v1, v4

    iget v6, v0, Lcom/daaw/zh1;->r:F

    const/4 v7, 0x1

    cmpl-float v8, v6, v7

    if-eqz v8, :cond_0

    int-to-float v5, v5

    mul-float v5, v5, v6

    float-to-int v5, v5

    :cond_0
    if-gtz v5, :cond_1

    return-void

    :cond_1
    iget-boolean v6, v0, Lcom/daaw/zh1;->u:Z

    const/4 v15, 0x0

    if-eqz v6, :cond_2

    iget-boolean v6, v0, Lcom/daaw/zh1;->t:Z

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/daaw/zh1;->j:Ljava/lang/CharSequence;

    goto :goto_0

    :cond_2
    iget-boolean v6, v0, Lcom/daaw/zh1;->t:Z

    if-nez v6, :cond_4

    iget-object v6, v0, Lcom/daaw/zh1;->j:Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_3
    :goto_0
    move-object/from16 v17, v6

    goto :goto_3

    :cond_4
    new-instance v6, Landroid/text/SpannableStringBuilder;

    iget-object v8, v0, Lcom/daaw/zh1;->j:Ljava/lang/CharSequence;

    invoke-direct {v6, v8}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    const-class v9, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {v6, v15, v8, v9}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Landroid/text/style/AbsoluteSizeSpan;

    const-class v10, Landroid/text/style/RelativeSizeSpan;

    invoke-virtual {v6, v15, v8, v10}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Landroid/text/style/RelativeSizeSpan;

    array-length v10, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_5

    aget-object v12, v9, v11

    invoke-virtual {v6, v12}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_5
    array-length v9, v8

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_3

    aget-object v11, v8, v10

    invoke-virtual {v6, v11}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :goto_3
    iget-object v6, v0, Lcom/daaw/zh1;->k:Landroid/text/Layout$Alignment;

    if-nez v6, :cond_6

    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    :cond_6
    move-object/from16 v20, v6

    new-instance v6, Landroid/text/StaticLayout;

    iget-object v10, v0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v13, v0, Lcom/daaw/zh1;->f:F

    iget v14, v0, Lcom/daaw/zh1;->g:F

    const/16 v16, 0x1

    move-object v8, v6

    move-object/from16 v9, v17

    move v11, v5

    move-object/from16 v12, v20

    move/from16 v15, v16

    invoke-direct/range {v8 .. v15}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v6, v0, Lcom/daaw/zh1;->G:Landroid/text/StaticLayout;

    invoke-virtual {v6}, Landroid/text/StaticLayout;->getHeight()I

    move-result v6

    iget-object v8, v0, Lcom/daaw/zh1;->G:Landroid/text/StaticLayout;

    invoke-virtual {v8}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v8

    const/4 v9, 0x0

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v8, :cond_7

    iget-object v10, v0, Lcom/daaw/zh1;->G:Landroid/text/StaticLayout;

    invoke-virtual {v10, v15}, Landroid/text/StaticLayout;->getLineWidth(I)F

    move-result v10

    float-to-double v10, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v10, v10

    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    :cond_7
    iget v8, v0, Lcom/daaw/zh1;->r:F

    cmpl-float v8, v8, v7

    if-eqz v8, :cond_8

    if-ge v9, v5, :cond_8

    goto :goto_5

    :cond_8
    move v5, v9

    :goto_5
    add-int/2addr v5, v4

    iget v4, v0, Lcom/daaw/zh1;->p:F

    const/4 v8, 0x1

    const/4 v9, 0x2

    cmpl-float v10, v4, v7

    if-eqz v10, :cond_b

    int-to-float v1, v1

    mul-float v1, v1, v4

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v4, v0, Lcom/daaw/zh1;->C:I

    add-int/2addr v1, v4

    iget v10, v0, Lcom/daaw/zh1;->q:I

    if-ne v10, v9, :cond_9

    sub-int/2addr v1, v5

    goto :goto_6

    :cond_9
    if-ne v10, v8, :cond_a

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v1, v5

    div-int/2addr v1, v9

    :cond_a
    :goto_6
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v5, v1

    iget v4, v0, Lcom/daaw/zh1;->E:I

    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    goto :goto_7

    :cond_b
    sub-int/2addr v1, v5

    div-int/2addr v1, v9

    add-int v4, v1, v5

    :goto_7
    sub-int v19, v4, v1

    if-gtz v19, :cond_c

    return-void

    :cond_c
    iget v4, v0, Lcom/daaw/zh1;->m:F

    cmpl-float v5, v4, v7

    if-eqz v5, :cond_12

    iget v5, v0, Lcom/daaw/zh1;->n:I

    if-nez v5, :cond_d

    int-to-float v2, v2

    mul-float v2, v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    :goto_8
    iget v4, v0, Lcom/daaw/zh1;->D:I

    :goto_9
    add-int/2addr v2, v4

    goto :goto_a

    :cond_d
    iget-object v2, v0, Lcom/daaw/zh1;->G:Landroid/text/StaticLayout;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/text/StaticLayout;->getLineBottom(I)I

    move-result v2

    iget-object v5, v0, Lcom/daaw/zh1;->G:Landroid/text/StaticLayout;

    invoke-virtual {v5, v4}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v4

    sub-int/2addr v2, v4

    iget v4, v0, Lcom/daaw/zh1;->m:F

    const/4 v5, 0x0

    cmpl-float v5, v4, v5

    if-ltz v5, :cond_e

    int-to-float v2, v2

    mul-float v4, v4, v2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v2

    goto :goto_8

    :cond_e
    const/high16 v5, 0x3f800000    # 1.0f

    add-float/2addr v4, v5

    int-to-float v2, v2

    mul-float v4, v4, v2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v4, v0, Lcom/daaw/zh1;->F:I

    goto :goto_9

    :goto_a
    iget v4, v0, Lcom/daaw/zh1;->o:I

    if-ne v4, v9, :cond_f

    sub-int/2addr v2, v6

    goto :goto_b

    :cond_f
    if-ne v4, v8, :cond_10

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v2, v6

    div-int/2addr v2, v9

    :cond_10
    :goto_b
    add-int v4, v2, v6

    iget v5, v0, Lcom/daaw/zh1;->F:I

    if-le v4, v5, :cond_11

    sub-int v2, v5, v6

    goto :goto_c

    :cond_11
    iget v4, v0, Lcom/daaw/zh1;->D:I

    if-ge v2, v4, :cond_13

    move v2, v4

    goto :goto_c

    :cond_12
    iget v4, v0, Lcom/daaw/zh1;->F:I

    sub-int/2addr v4, v6

    int-to-float v2, v2

    iget v5, v0, Lcom/daaw/zh1;->B:F

    mul-float v2, v2, v5

    float-to-int v2, v2

    sub-int v2, v4, v2

    :cond_13
    :goto_c
    new-instance v4, Landroid/text/StaticLayout;

    iget-object v5, v0, Lcom/daaw/zh1;->h:Landroid/text/TextPaint;

    iget v6, v0, Lcom/daaw/zh1;->f:F

    iget v7, v0, Lcom/daaw/zh1;->g:F

    const/16 v23, 0x1

    move-object/from16 v16, v4

    move-object/from16 v18, v5

    move/from16 v21, v6

    move/from16 v22, v7

    invoke-direct/range {v16 .. v23}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v4, v0, Lcom/daaw/zh1;->G:Landroid/text/StaticLayout;

    iput v1, v0, Lcom/daaw/zh1;->H:I

    iput v2, v0, Lcom/daaw/zh1;->I:I

    iput v3, v0, Lcom/daaw/zh1;->J:I

    return-void
.end method
