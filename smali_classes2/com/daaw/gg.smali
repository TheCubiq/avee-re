.class public final Lcom/daaw/gg;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b0:Z

.field public static final c0:Landroid/graphics/Paint;


# instance fields
.field public A:Z

.field public B:Landroid/graphics/Bitmap;

.field public C:Landroid/graphics/Paint;

.field public D:F

.field public E:F

.field public F:[I

.field public G:Z

.field public final H:Landroid/text/TextPaint;

.field public final I:Landroid/text/TextPaint;

.field public J:Landroid/animation/TimeInterpolator;

.field public K:Landroid/animation/TimeInterpolator;

.field public L:F

.field public M:F

.field public N:F

.field public O:Landroid/content/res/ColorStateList;

.field public P:F

.field public Q:F

.field public R:F

.field public S:Landroid/content/res/ColorStateList;

.field public T:F

.field public U:F

.field public V:Landroid/text/StaticLayout;

.field public W:F

.field public X:F

.field public Y:F

.field public Z:Ljava/lang/CharSequence;

.field public final a:Landroid/view/View;

.field public a0:I

.field public b:Z

.field public c:F

.field public final d:Landroid/graphics/Rect;

.field public final e:Landroid/graphics/Rect;

.field public final f:Landroid/graphics/RectF;

.field public g:I

.field public h:I

.field public i:F

.field public j:F

.field public k:Landroid/content/res/ColorStateList;

.field public l:Landroid/content/res/ColorStateList;

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:Landroid/graphics/Typeface;

.field public t:Landroid/graphics/Typeface;

.field public u:Landroid/graphics/Typeface;

.field public v:Lcom/daaw/sd;

.field public w:Lcom/daaw/sd;

.field public x:Ljava/lang/CharSequence;

.field public y:Ljava/lang/CharSequence;

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/daaw/gg;->b0:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/gg;->c0:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    iput v0, p0, Lcom/daaw/gg;->g:I

    iput v0, p0, Lcom/daaw/gg;->h:I

    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lcom/daaw/gg;->i:F

    iput v0, p0, Lcom/daaw/gg;->j:F

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/gg;->a0:I

    iput-object p1, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    new-instance p1, Landroid/text/TextPaint;

    const/16 v0, 0x81

    invoke-direct {p1, v0}, Landroid/text/TextPaint;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0, p1}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, Lcom/daaw/gg;->I:Landroid/text/TextPaint;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/daaw/gg;->f:Landroid/graphics/RectF;

    return-void
.end method

.method public static C(FFFLandroid/animation/TimeInterpolator;)F
    .locals 0

    if-eqz p3, :cond_0

    invoke-interface {p3, p2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p2

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/daaw/f3;->a(FFF)F

    move-result p0

    return p0
.end method

.method public static F(Landroid/graphics/Rect;IIII)Z
    .locals 1

    iget v0, p0, Landroid/graphics/Rect;->left:I

    if-ne v0, p1, :cond_0

    iget p1, p0, Landroid/graphics/Rect;->top:I

    if-ne p1, p2, :cond_0

    iget p1, p0, Landroid/graphics/Rect;->right:I

    if-ne p1, p3, :cond_0

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    if-ne p0, p4, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static a(IIF)I
    .locals 5

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, v0

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, p2

    add-float/2addr v1, v2

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v0

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, p2

    add-float/2addr v2, v3

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v4

    int-to-float v4, v4

    mul-float v4, v4, p2

    add-float/2addr v3, v4

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    int-to-float p0, p0

    mul-float p0, p0, v0

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, p2

    add-float/2addr p0, p1

    float-to-int p1, v1

    float-to-int p2, v2

    float-to-int v0, v3

    float-to-int p0, p0

    invoke-static {p1, p2, v0, p0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method

.method public static z(FF)Z
    .locals 0

    sub-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    const p1, 0x3a83126f    # 0.001f

    cmpg-float p0, p0, p1

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final A()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    invoke-static {v0}, Lcom/daaw/xs1;->E(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final B()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->l:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/gg;->k:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public D()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/gg;->b:Z

    return-void
.end method

.method public E()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/gg;->b()V

    invoke-virtual {p0}, Lcom/daaw/gg;->d()V

    :cond_0
    return-void
.end method

.method public G(IIII)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/daaw/gg;->F(Landroid/graphics/Rect;IIII)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/gg;->G:Z

    invoke-virtual {p0}, Lcom/daaw/gg;->D()V

    :cond_0
    return-void
.end method

.method public H(Landroid/graphics/Rect;)V
    .locals 3

    iget v0, p1, Landroid/graphics/Rect;->left:I

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iget v2, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/daaw/gg;->G(IIII)V

    return-void
.end method

.method public I(I)V
    .locals 3

    new-instance v0, Lcom/daaw/ik1;

    iget-object v1, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/daaw/ik1;-><init>(Landroid/content/Context;I)V

    iget-object p1, v0, Lcom/daaw/ik1;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/daaw/gg;->l:Landroid/content/res/ColorStateList;

    :cond_0
    iget p1, v0, Lcom/daaw/ik1;->n:F

    const/4 v1, 0x0

    cmpl-float v1, p1, v1

    if-eqz v1, :cond_1

    iput p1, p0, Lcom/daaw/gg;->j:F

    :cond_1
    iget-object p1, v0, Lcom/daaw/ik1;->d:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_2

    iput-object p1, p0, Lcom/daaw/gg;->O:Landroid/content/res/ColorStateList;

    :cond_2
    iget p1, v0, Lcom/daaw/ik1;->i:F

    iput p1, p0, Lcom/daaw/gg;->M:F

    iget p1, v0, Lcom/daaw/ik1;->j:F

    iput p1, p0, Lcom/daaw/gg;->N:F

    iget p1, v0, Lcom/daaw/ik1;->k:F

    iput p1, p0, Lcom/daaw/gg;->L:F

    iget p1, v0, Lcom/daaw/ik1;->m:F

    iput p1, p0, Lcom/daaw/gg;->T:F

    iget-object p1, p0, Lcom/daaw/gg;->w:Lcom/daaw/sd;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/daaw/sd;->c()V

    :cond_3
    new-instance p1, Lcom/daaw/sd;

    new-instance v1, Lcom/daaw/gg$a;

    invoke-direct {v1, p0}, Lcom/daaw/gg$a;-><init>(Lcom/daaw/gg;)V

    invoke-virtual {v0}, Lcom/daaw/ik1;->e()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-direct {p1, v1, v2}, Lcom/daaw/sd;-><init>(Lcom/daaw/sd$a;Landroid/graphics/Typeface;)V

    iput-object p1, p0, Lcom/daaw/gg;->w:Lcom/daaw/sd;

    iget-object p1, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/gg;->w:Lcom/daaw/sd;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/ik1;->h(Landroid/content/Context;Lcom/daaw/kk1;)V

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    return-void
.end method

.method public final J(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/gg;->W:F

    iget-object p1, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    invoke-static {p1}, Lcom/daaw/xs1;->i0(Landroid/view/View;)V

    return-void
.end method

.method public K(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->l:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/daaw/gg;->l:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    :cond_0
    return-void
.end method

.method public L(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/gg;->h:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/daaw/gg;->h:I

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    :cond_0
    return-void
.end method

.method public M(Landroid/graphics/Typeface;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/gg;->N(Landroid/graphics/Typeface;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    :cond_0
    return-void
.end method

.method public final N(Landroid/graphics/Typeface;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->w:Lcom/daaw/sd;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/sd;->c()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/gg;->s:Landroid/graphics/Typeface;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Lcom/daaw/gg;->s:Landroid/graphics/Typeface;

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public O(IIII)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/daaw/gg;->F(Landroid/graphics/Rect;IIII)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/gg;->G:Z

    invoke-virtual {p0}, Lcom/daaw/gg;->D()V

    :cond_0
    return-void
.end method

.method public P(Landroid/graphics/Rect;)V
    .locals 3

    iget v0, p1, Landroid/graphics/Rect;->left:I

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iget v2, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/daaw/gg;->O(IIII)V

    return-void
.end method

.method public final Q(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/gg;->X:F

    iget-object p1, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    invoke-static {p1}, Lcom/daaw/xs1;->i0(Landroid/view/View;)V

    return-void
.end method

.method public R(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->k:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/daaw/gg;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    :cond_0
    return-void
.end method

.method public S(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/gg;->g:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/daaw/gg;->g:I

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    :cond_0
    return-void
.end method

.method public T(F)V
    .locals 1

    iget v0, p0, Lcom/daaw/gg;->i:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/daaw/gg;->i:F

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    :cond_0
    return-void
.end method

.method public final U(Landroid/graphics/Typeface;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->v:Lcom/daaw/sd;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/sd;->c()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/gg;->t:Landroid/graphics/Typeface;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Lcom/daaw/gg;->t:Landroid/graphics/Typeface;

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public V(F)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lcom/daaw/sn0;->a(FFF)F

    move-result p1

    iget v0, p0, Lcom/daaw/gg;->c:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/daaw/gg;->c:F

    invoke-virtual {p0}, Lcom/daaw/gg;->d()V

    :cond_0
    return-void
.end method

.method public final W(F)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/gg;->g(F)V

    sget-boolean p1, Lcom/daaw/gg;->b0:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/daaw/gg;->D:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/gg;->A:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/gg;->l()V

    :cond_1
    iget-object p1, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    invoke-static {p1}, Lcom/daaw/xs1;->i0(Landroid/view/View;)V

    return-void
.end method

.method public X(Landroid/animation/TimeInterpolator;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gg;->J:Landroid/animation/TimeInterpolator;

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    return-void
.end method

.method public final Y([I)Z
    .locals 0

    iput-object p1, p0, Lcom/daaw/gg;->F:[I

    invoke-virtual {p0}, Lcom/daaw/gg;->B()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public Z(Ljava/lang/CharSequence;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/gg;->x:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iput-object p1, p0, Lcom/daaw/gg;->x:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/gg;->y:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Lcom/daaw/gg;->h()V

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    :cond_1
    return-void
.end method

.method public a0(Landroid/animation/TimeInterpolator;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gg;->K:Landroid/animation/TimeInterpolator;

    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    return-void
.end method

.method public final b()V
    .locals 13

    iget v0, p0, Lcom/daaw/gg;->E:F

    iget v1, p0, Lcom/daaw/gg;->j:F

    invoke-virtual {p0, v1}, Lcom/daaw/gg;->g(F)V

    iget-object v1, p0, Lcom/daaw/gg;->y:Ljava/lang/CharSequence;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/text/StaticLayout;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sget-object v4, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-static {v1, v3, v2, v4}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/gg;->Z:Ljava/lang/CharSequence;

    :cond_0
    iget-object v1, p0, Lcom/daaw/gg;->Z:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v4, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-virtual {v4, v1, v2, v5}, Landroid/text/TextPaint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget v4, p0, Lcom/daaw/gg;->h:I

    iget-boolean v5, p0, Lcom/daaw/gg;->z:Z

    invoke-static {v4, v5}, Lcom/daaw/g80;->b(II)I

    move-result v4

    and-int/lit8 v5, v4, 0x70

    const/16 v6, 0x50

    const/16 v7, 0x30

    const/high16 v8, 0x40000000    # 2.0f

    if-eq v5, v7, :cond_3

    if-eq v5, v6, :cond_2

    iget-object v5, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {v5}, Landroid/text/TextPaint;->descent()F

    move-result v5

    iget-object v9, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {v9}, Landroid/text/TextPaint;->ascent()F

    move-result v9

    sub-float/2addr v5, v9

    div-float/2addr v5, v8

    iget-object v9, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    invoke-virtual {v9}, Landroid/graphics/Rect;->centerY()I

    move-result v9

    int-to-float v9, v9

    sub-float/2addr v9, v5

    iput v9, p0, Lcom/daaw/gg;->n:F

    goto :goto_2

    :cond_2
    iget-object v5, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, v5

    iget-object v9, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {v9}, Landroid/text/TextPaint;->ascent()F

    move-result v9

    add-float/2addr v5, v9

    goto :goto_1

    :cond_3
    iget-object v5, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    :goto_1
    iput v5, p0, Lcom/daaw/gg;->n:F

    :goto_2
    const v5, 0x800007

    and-int/2addr v4, v5

    const/4 v9, 0x5

    const/4 v10, 0x1

    if-eq v4, v10, :cond_5

    if-eq v4, v9, :cond_4

    iget-object v1, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iput v1, p0, Lcom/daaw/gg;->p:F

    goto :goto_4

    :cond_4
    iget-object v4, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    int-to-float v4, v4

    goto :goto_3

    :cond_5
    iget-object v4, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->centerX()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v1, v8

    :goto_3
    sub-float/2addr v4, v1

    iput v4, p0, Lcom/daaw/gg;->p:F

    :goto_4
    iget v1, p0, Lcom/daaw/gg;->i:F

    invoke-virtual {p0, v1}, Lcom/daaw/gg;->g(F)V

    iget-object v1, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/text/StaticLayout;->getHeight()I

    move-result v1

    int-to-float v1, v1

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    :goto_5
    iget-object v4, p0, Lcom/daaw/gg;->y:Ljava/lang/CharSequence;

    if-eqz v4, :cond_7

    iget-object v11, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v12

    invoke-virtual {v11, v4, v2, v12}, Landroid/text/TextPaint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v4

    goto :goto_6

    :cond_7
    const/4 v4, 0x0

    :goto_6
    iget-object v11, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    if-eqz v11, :cond_8

    iget v12, p0, Lcom/daaw/gg;->a0:I

    if-le v12, v10, :cond_8

    iget-boolean v12, p0, Lcom/daaw/gg;->z:Z

    if-nez v12, :cond_8

    invoke-virtual {v11}, Landroid/text/StaticLayout;->getWidth()I

    move-result v4

    int-to-float v4, v4

    :cond_8
    iget-object v11, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    if-eqz v11, :cond_9

    invoke-virtual {v11, v2}, Landroid/text/StaticLayout;->getLineLeft(I)F

    move-result v3

    :cond_9
    iput v3, p0, Lcom/daaw/gg;->Y:F

    iget v2, p0, Lcom/daaw/gg;->g:I

    iget-boolean v3, p0, Lcom/daaw/gg;->z:Z

    invoke-static {v2, v3}, Lcom/daaw/g80;->b(II)I

    move-result v2

    and-int/lit8 v3, v2, 0x70

    if-eq v3, v7, :cond_b

    if-eq v3, v6, :cond_a

    div-float/2addr v1, v8

    iget-object v3, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v1

    :goto_7
    iput v3, p0, Lcom/daaw/gg;->m:F

    goto :goto_8

    :cond_a
    iget-object v3, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    sub-float/2addr v3, v1

    iget-object v1, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/text/TextPaint;->descent()F

    move-result v1

    add-float/2addr v3, v1

    goto :goto_7

    :cond_b
    iget-object v1, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iput v1, p0, Lcom/daaw/gg;->m:F

    :goto_8
    and-int v1, v2, v5

    if-eq v1, v10, :cond_d

    if-eq v1, v9, :cond_c

    iget-object v1, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    goto :goto_a

    :cond_c
    iget-object v1, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    goto :goto_9

    :cond_d
    iget-object v1, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v4, v8

    :goto_9
    sub-float/2addr v1, v4

    :goto_a
    iput v1, p0, Lcom/daaw/gg;->o:F

    invoke-virtual {p0}, Lcom/daaw/gg;->h()V

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->W(F)V

    return-void
.end method

.method public b0(Landroid/graphics/Typeface;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/gg;->N(Landroid/graphics/Typeface;)Z

    move-result v0

    invoke-virtual {p0, p1}, Lcom/daaw/gg;->U(Landroid/graphics/Typeface;)Z

    move-result p1

    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/gg;->E()V

    :cond_1
    return-void
.end method

.method public c()F
    .locals 4

    iget-object v0, p0, Lcom/daaw/gg;->x:Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/gg;->I:Landroid/text/TextPaint;

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->w(Landroid/text/TextPaint;)V

    iget-object v0, p0, Lcom/daaw/gg;->I:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/daaw/gg;->x:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/text/TextPaint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v0

    return v0
.end method

.method public final c0()Z
    .locals 2

    iget v0, p0, Lcom/daaw/gg;->a0:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/daaw/gg;->z:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/gg;->A:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final d()V
    .locals 1

    iget v0, p0, Lcom/daaw/gg;->c:F

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->f(F)V

    return-void
.end method

.method public final e(Ljava/lang/CharSequence;)Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/gg;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/mk1;->d:Lcom/daaw/lk1;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/mk1;->c:Lcom/daaw/lk1;

    :goto_0
    const/4 v1, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-interface {v0, p1, v1, v2}, Lcom/daaw/lk1;->a(Ljava/lang/CharSequence;II)Z

    move-result p1

    return p1
.end method

.method public final f(F)V
    .locals 6

    invoke-virtual {p0, p1}, Lcom/daaw/gg;->y(F)V

    iget v0, p0, Lcom/daaw/gg;->o:F

    iget v1, p0, Lcom/daaw/gg;->p:F

    iget-object v2, p0, Lcom/daaw/gg;->J:Landroid/animation/TimeInterpolator;

    invoke-static {v0, v1, p1, v2}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    iput v0, p0, Lcom/daaw/gg;->q:F

    iget v0, p0, Lcom/daaw/gg;->m:F

    iget v1, p0, Lcom/daaw/gg;->n:F

    iget-object v2, p0, Lcom/daaw/gg;->J:Landroid/animation/TimeInterpolator;

    invoke-static {v0, v1, p1, v2}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    iput v0, p0, Lcom/daaw/gg;->r:F

    iget v0, p0, Lcom/daaw/gg;->i:F

    iget v1, p0, Lcom/daaw/gg;->j:F

    iget-object v2, p0, Lcom/daaw/gg;->K:Landroid/animation/TimeInterpolator;

    invoke-static {v0, v1, p1, v2}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->W(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v1, v0, p1

    sget-object v2, Lcom/daaw/f3;->b:Landroid/animation/TimeInterpolator;

    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v1

    sub-float v1, v0, v1

    invoke-virtual {p0, v1}, Lcom/daaw/gg;->J(F)V

    invoke-static {v0, v3, p1, v2}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->Q(F)V

    iget-object v0, p0, Lcom/daaw/gg;->l:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Lcom/daaw/gg;->k:Landroid/content/res/ColorStateList;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lcom/daaw/gg;->t()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/gg;->r()I

    move-result v3

    invoke-static {v1, v3, p1}, Lcom/daaw/gg;->a(IIF)I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lcom/daaw/gg;->r()I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    iget v0, p0, Lcom/daaw/gg;->T:F

    iget v1, p0, Lcom/daaw/gg;->U:F

    cmpl-float v3, v0, v1

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-static {v1, v0, p1, v2}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    invoke-virtual {v3, v0}, Landroid/text/TextPaint;->setLetterSpacing(F)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setLetterSpacing(F)V

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    iget v1, p0, Lcom/daaw/gg;->P:F

    iget v2, p0, Lcom/daaw/gg;->L:F

    const/4 v3, 0x0

    invoke-static {v1, v2, p1, v3}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v1

    iget v2, p0, Lcom/daaw/gg;->Q:F

    iget v4, p0, Lcom/daaw/gg;->M:F

    invoke-static {v2, v4, p1, v3}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v2

    iget v4, p0, Lcom/daaw/gg;->R:F

    iget v5, p0, Lcom/daaw/gg;->N:F

    invoke-static {v4, v5, p1, v3}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v3

    iget-object v4, p0, Lcom/daaw/gg;->S:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v4}, Lcom/daaw/gg;->s(Landroid/content/res/ColorStateList;)I

    move-result v4

    iget-object v5, p0, Lcom/daaw/gg;->O:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v5}, Lcom/daaw/gg;->s(Landroid/content/res/ColorStateList;)I

    move-result v5

    invoke-static {v4, v5, p1}, Lcom/daaw/gg;->a(IIF)I

    move-result p1

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    iget-object p1, p0, Lcom/daaw/gg;->a:Landroid/view/View;

    invoke-static {p1}, Lcom/daaw/xs1;->i0(Landroid/view/View;)V

    return-void
.end method

.method public final g(F)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/gg;->x:Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/daaw/gg;->j:F

    invoke-static {p1, v2}, Lcom/daaw/gg;->z(FF)Z

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    iget p1, p0, Lcom/daaw/gg;->j:F

    iput v3, p0, Lcom/daaw/gg;->D:F

    iget-object v1, p0, Lcom/daaw/gg;->u:Landroid/graphics/Typeface;

    iget-object v2, p0, Lcom/daaw/gg;->s:Landroid/graphics/Typeface;

    if-eq v1, v2, :cond_1

    iput-object v2, p0, Lcom/daaw/gg;->u:Landroid/graphics/Typeface;

    const/4 v1, 0x1

    goto :goto_3

    :cond_1
    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    iget v2, p0, Lcom/daaw/gg;->i:F

    iget-object v6, p0, Lcom/daaw/gg;->u:Landroid/graphics/Typeface;

    iget-object v7, p0, Lcom/daaw/gg;->t:Landroid/graphics/Typeface;

    if-eq v6, v7, :cond_3

    iput-object v7, p0, Lcom/daaw/gg;->u:Landroid/graphics/Typeface;

    const/4 v6, 0x1

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    :goto_0
    invoke-static {p1, v2}, Lcom/daaw/gg;->z(FF)Z

    move-result v7

    if-eqz v7, :cond_4

    iput v3, p0, Lcom/daaw/gg;->D:F

    goto :goto_1

    :cond_4
    iget v7, p0, Lcom/daaw/gg;->i:F

    div-float/2addr p1, v7

    iput p1, p0, Lcom/daaw/gg;->D:F

    :goto_1
    iget p1, p0, Lcom/daaw/gg;->j:F

    iget v7, p0, Lcom/daaw/gg;->i:F

    div-float/2addr p1, v7

    mul-float v7, v1, p1

    cmpl-float v7, v7, v0

    if-lez v7, :cond_5

    div-float/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    move v0, p1

    goto :goto_2

    :cond_5
    move v0, v1

    :goto_2
    move p1, v2

    move v1, v6

    :goto_3
    const/4 v2, 0x0

    cmpl-float v2, v0, v2

    if-lez v2, :cond_8

    iget v2, p0, Lcom/daaw/gg;->E:F

    cmpl-float v2, v2, p1

    if-nez v2, :cond_7

    iget-boolean v2, p0, Lcom/daaw/gg;->G:Z

    if-nez v2, :cond_7

    if-eqz v1, :cond_6

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v1, 0x1

    :goto_5
    iput p1, p0, Lcom/daaw/gg;->E:F

    iput-boolean v4, p0, Lcom/daaw/gg;->G:Z

    :cond_8
    iget-object p1, p0, Lcom/daaw/gg;->y:Ljava/lang/CharSequence;

    if-eqz p1, :cond_9

    if-eqz v1, :cond_c

    :cond_9
    iget-object p1, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    iget v1, p0, Lcom/daaw/gg;->E:F

    invoke-virtual {p1, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object p1, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/daaw/gg;->u:Landroid/graphics/Typeface;

    invoke-virtual {p1, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    iget v1, p0, Lcom/daaw/gg;->D:F

    cmpl-float v1, v1, v3

    if-eqz v1, :cond_a

    const/4 v4, 0x1

    :cond_a
    invoke-virtual {p1, v4}, Landroid/text/TextPaint;->setLinearText(Z)V

    iget-object p1, p0, Lcom/daaw/gg;->x:Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/daaw/gg;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/gg;->z:Z

    invoke-virtual {p0}, Lcom/daaw/gg;->c0()Z

    move-result p1

    if-eqz p1, :cond_b

    iget v5, p0, Lcom/daaw/gg;->a0:I

    :cond_b
    iget-boolean p1, p0, Lcom/daaw/gg;->z:Z

    invoke-virtual {p0, v5, v0, p1}, Lcom/daaw/gg;->i(IFZ)Landroid/text/StaticLayout;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    invoke-virtual {p1}, Landroid/text/StaticLayout;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/gg;->y:Ljava/lang/CharSequence;

    :cond_c
    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->B:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/gg;->B:Landroid/graphics/Bitmap;

    :cond_0
    return-void
.end method

.method public final i(IFZ)Landroid/text/StaticLayout;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/gg;->x:Ljava/lang/CharSequence;

    iget-object v1, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    float-to-int p2, p2

    invoke-static {v0, v1, p2}, Lcom/daaw/nf1;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)Lcom/daaw/nf1;

    move-result-object p2

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p2, v0}, Lcom/daaw/nf1;->e(Landroid/text/TextUtils$TruncateAt;)Lcom/daaw/nf1;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/daaw/nf1;->g(Z)Lcom/daaw/nf1;

    move-result-object p2

    sget-object p3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-virtual {p2, p3}, Lcom/daaw/nf1;->d(Landroid/text/Layout$Alignment;)Lcom/daaw/nf1;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lcom/daaw/nf1;->f(Z)Lcom/daaw/nf1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/nf1;->h(I)Lcom/daaw/nf1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/nf1;->a()Landroid/text/StaticLayout;

    move-result-object p1
    :try_end_0
    .catch Lcom/daaw/nf1$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/ty0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/text/StaticLayout;

    return-object p1
.end method

.method public j(Landroid/graphics/Canvas;)V
    .locals 7

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/gg;->y:Ljava/lang/CharSequence;

    if-eqz v1, :cond_4

    iget-boolean v1, p0, Lcom/daaw/gg;->b:Z

    if-eqz v1, :cond_4

    iget v1, p0, Lcom/daaw/gg;->q:F

    iget-object v2, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/text/StaticLayout;->getLineLeft(I)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, p0, Lcom/daaw/gg;->Y:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v2, v2, v4

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    iget v4, p0, Lcom/daaw/gg;->E:F

    invoke-virtual {v2, v4}, Landroid/text/TextPaint;->setTextSize(F)V

    iget v2, p0, Lcom/daaw/gg;->q:F

    iget v4, p0, Lcom/daaw/gg;->r:F

    iget-boolean v5, p0, Lcom/daaw/gg;->A:Z

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/daaw/gg;->B:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_0

    const/4 v3, 0x1

    :cond_0
    iget v5, p0, Lcom/daaw/gg;->D:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v6, v5, v6

    if-eqz v6, :cond_1

    invoke-virtual {p1, v5, v5, v2, v4}, Landroid/graphics/Canvas;->scale(FFFF)V

    :cond_1
    if-eqz v3, :cond_2

    iget-object v1, p0, Lcom/daaw/gg;->B:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/daaw/gg;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/gg;->c0()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, p1, v1, v4}, Lcom/daaw/gg;->k(Landroid/graphics/Canvas;FF)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1, v2, v4}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v1, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    invoke-virtual {v1, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_4
    return-void
.end method

.method public final k(Landroid/graphics/Canvas;FF)V
    .locals 12

    iget-object v0, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getAlpha()I

    move-result v0

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object p2, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    iget p3, p0, Lcom/daaw/gg;->X:F

    int-to-float v1, v0

    mul-float p3, p3, v1

    float-to-int p3, p3

    invoke-virtual {p2, p3}, Landroid/text/TextPaint;->setAlpha(I)V

    iget-object p2, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    invoke-virtual {p2, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    iget-object p2, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    iget p3, p0, Lcom/daaw/gg;->W:F

    mul-float p3, p3, v1

    float-to-int p3, p3

    invoke-virtual {p2, p3}, Landroid/text/TextPaint;->setAlpha(I)V

    iget-object p2, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/text/StaticLayout;->getLineBaseline(I)I

    move-result p2

    iget-object v2, p0, Lcom/daaw/gg;->Z:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    int-to-float v10, p2

    iget-object v7, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move v6, v10

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    iget-object p2, p0, Lcom/daaw/gg;->Z:Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const-string v1, "\u2026"

    invoke-virtual {p2, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p2, p3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    :cond_0
    move-object v6, p2

    iget-object p2, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    invoke-virtual {p2, v0}, Landroid/text/TextPaint;->setAlpha(I)V

    const/4 v7, 0x0

    iget-object p2, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    invoke-virtual {p2, p3}, Landroid/text/StaticLayout;->getLineEnd(I)I

    move-result p2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result p3

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/4 v9, 0x0

    iget-object v11, p0, Lcom/daaw/gg;->H:Landroid/text/TextPaint;

    move-object v5, p1

    invoke-virtual/range {v5 .. v11}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/gg;->B:Landroid/graphics/Bitmap;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/gg;->y:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->f(F)V

    iget-object v0, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    invoke-virtual {v1}, Landroid/text/StaticLayout;->getHeight()I

    move-result v1

    if-lez v0, :cond_2

    if-gtz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gg;->B:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/daaw/gg;->B:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Lcom/daaw/gg;->V:Landroid/text/StaticLayout;

    invoke-virtual {v1, v0}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/daaw/gg;->C:Landroid/graphics/Paint;

    if-nez v0, :cond_2

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/gg;->C:Landroid/graphics/Paint;

    :cond_2
    :goto_0
    return-void
.end method

.method public m(Landroid/graphics/RectF;II)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->x:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/gg;->z:Z

    invoke-virtual {p0, p2, p3}, Lcom/daaw/gg;->p(II)F

    move-result v0

    iput v0, p1, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/gg;->q(Landroid/graphics/RectF;II)F

    move-result p2

    iput p2, p1, Landroid/graphics/RectF;->right:F

    iget-object p2, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->top:I

    int-to-float p2, p2

    invoke-virtual {p0}, Lcom/daaw/gg;->o()F

    move-result p3

    add-float/2addr p2, p3

    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    return-void
.end method

.method public n()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->l:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public o()F
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->I:Landroid/text/TextPaint;

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->w(Landroid/text/TextPaint;)V

    iget-object v0, p0, Lcom/daaw/gg;->I:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->ascent()F

    move-result v0

    neg-float v0, v0

    return v0
.end method

.method public final p(II)F
    .locals 2

    const/16 v0, 0x11

    if-eq p2, v0, :cond_5

    and-int/lit8 v0, p2, 0x7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_3

    :cond_0
    const p1, 0x800005

    and-int v0, p2, p1

    if-eq v0, p1, :cond_3

    const/4 p1, 0x5

    and-int/2addr p2, p1

    if-ne p2, p1, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean p1, p0, Lcom/daaw/gg;->z:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/daaw/gg;->c()F

    move-result p2

    sub-float/2addr p1, p2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    :goto_0
    return p1

    :cond_3
    :goto_1
    iget-boolean p1, p0, Lcom/daaw/gg;->z:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/daaw/gg;->c()F

    move-result p2

    sub-float/2addr p1, p2

    :goto_2
    return p1

    :cond_5
    :goto_3
    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    invoke-virtual {p0}, Lcom/daaw/gg;->c()F

    move-result v0

    div-float/2addr v0, p2

    sub-float/2addr p1, v0

    return p1
.end method

.method public final q(Landroid/graphics/RectF;II)F
    .locals 2

    const/16 v0, 0x11

    if-eq p3, v0, :cond_5

    and-int/lit8 v0, p3, 0x7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_3

    :cond_0
    const p2, 0x800005

    and-int v0, p3, p2

    if-eq v0, p2, :cond_3

    const/4 p2, 0x5

    and-int/2addr p3, p2

    if-ne p3, p2, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean p2, p0, Lcom/daaw/gg;->z:Z

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    goto :goto_0

    :cond_2
    iget p1, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Lcom/daaw/gg;->c()F

    move-result p2

    add-float/2addr p1, p2

    :goto_0
    return p1

    :cond_3
    :goto_1
    iget-boolean p2, p0, Lcom/daaw/gg;->z:Z

    if-eqz p2, :cond_4

    iget p1, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Lcom/daaw/gg;->c()F

    move-result p2

    add-float/2addr p1, p2

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    :goto_2
    return p1

    :cond_5
    :goto_3
    int-to-float p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    invoke-virtual {p0}, Lcom/daaw/gg;->c()F

    move-result p3

    div-float/2addr p3, p2

    add-float/2addr p1, p3

    return p1
.end method

.method public r()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->l:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->s(Landroid/content/res/ColorStateList;)I

    move-result v0

    return v0
.end method

.method public final s(Landroid/content/res/ColorStateList;)I
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/gg;->F:[I

    if-eqz v1, :cond_1

    invoke-virtual {p1, v1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    return p1
.end method

.method public final t()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->s(Landroid/content/res/ColorStateList;)I

    move-result v0

    return v0
.end method

.method public u()F
    .locals 1

    iget-object v0, p0, Lcom/daaw/gg;->I:Landroid/text/TextPaint;

    invoke-virtual {p0, v0}, Lcom/daaw/gg;->x(Landroid/text/TextPaint;)V

    iget-object v0, p0, Lcom/daaw/gg;->I:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->ascent()F

    move-result v0

    neg-float v0, v0

    return v0
.end method

.method public v()F
    .locals 1

    iget v0, p0, Lcom/daaw/gg;->c:F

    return v0
.end method

.method public final w(Landroid/text/TextPaint;)V
    .locals 2

    iget v0, p0, Lcom/daaw/gg;->j:F

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v0, p0, Lcom/daaw/gg;->s:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/gg;->T:F

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setLetterSpacing(F)V

    :cond_0
    return-void
.end method

.method public final x(Landroid/text/TextPaint;)V
    .locals 2

    iget v0, p0, Lcom/daaw/gg;->i:F

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v0, p0, Lcom/daaw/gg;->t:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/gg;->U:F

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setLetterSpacing(F)V

    :cond_0
    return-void
.end method

.method public final y(F)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/gg;->f:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/daaw/gg;->J:Landroid/animation/TimeInterpolator;

    invoke-static {v1, v2, p1, v3}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/daaw/gg;->f:Landroid/graphics/RectF;

    iget v1, p0, Lcom/daaw/gg;->m:F

    iget v2, p0, Lcom/daaw/gg;->n:F

    iget-object v3, p0, Lcom/daaw/gg;->J:Landroid/animation/TimeInterpolator;

    invoke-static {v1, v2, p1, v3}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget-object v0, p0, Lcom/daaw/gg;->f:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/daaw/gg;->J:Landroid/animation/TimeInterpolator;

    invoke-static {v1, v2, p1, v3}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    iget-object v0, p0, Lcom/daaw/gg;->f:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/daaw/gg;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/gg;->e:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/daaw/gg;->J:Landroid/animation/TimeInterpolator;

    invoke-static {v1, v2, p1, v3}, Lcom/daaw/gg;->C(FFFLandroid/animation/TimeInterpolator;)F

    move-result p1

    iput p1, v0, Landroid/graphics/RectF;->bottom:F

    return-void
.end method
