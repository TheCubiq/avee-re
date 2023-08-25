.class public Lcom/daaw/ik1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/res/ColorStateList;

.field public final b:Landroid/content/res/ColorStateList;

.field public final c:Landroid/content/res/ColorStateList;

.field public final d:Landroid/content/res/ColorStateList;

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:F

.field public final j:F

.field public final k:F

.field public final l:Z

.field public final m:F

.field public n:F

.field public final o:I

.field public p:Z

.field public q:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ik1;->p:Z

    sget-object v1, Lcom/daaw/m21;->A4:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Lcom/daaw/m21;->B4:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Lcom/daaw/ik1;->n:F

    sget v2, Lcom/daaw/m21;->E4:I

    invoke-static {p1, v1, v2}, Lcom/daaw/mn0;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/ik1;->a:Landroid/content/res/ColorStateList;

    sget v2, Lcom/daaw/m21;->F4:I

    invoke-static {p1, v1, v2}, Lcom/daaw/mn0;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/ik1;->b:Landroid/content/res/ColorStateList;

    sget v2, Lcom/daaw/m21;->G4:I

    invoke-static {p1, v1, v2}, Lcom/daaw/mn0;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/ik1;->c:Landroid/content/res/ColorStateList;

    sget v2, Lcom/daaw/m21;->D4:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/daaw/ik1;->f:I

    sget v2, Lcom/daaw/m21;->C4:I

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/daaw/ik1;->g:I

    sget v2, Lcom/daaw/m21;->M4:I

    sget v4, Lcom/daaw/m21;->L4:I

    invoke-static {v1, v2, v4}, Lcom/daaw/mn0;->e(Landroid/content/res/TypedArray;II)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    iput v4, p0, Lcom/daaw/ik1;->o:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/ik1;->e:Ljava/lang/String;

    sget v2, Lcom/daaw/m21;->N4:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/ik1;->h:Z

    sget v2, Lcom/daaw/m21;->H4:I

    invoke-static {p1, v1, v2}, Lcom/daaw/mn0;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/ik1;->d:Landroid/content/res/ColorStateList;

    sget v2, Lcom/daaw/m21;->I4:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Lcom/daaw/ik1;->i:F

    sget v2, Lcom/daaw/m21;->J4:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Lcom/daaw/ik1;->j:F

    sget v2, Lcom/daaw/m21;->K4:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Lcom/daaw/ik1;->k:F

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    sget-object v0, Lcom/daaw/m21;->P2:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lcom/daaw/m21;->Q2:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/ik1;->l:Z

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/daaw/ik1;->m:F

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :cond_0
    iput-boolean v0, p0, Lcom/daaw/ik1;->l:Z

    iput v3, p0, Lcom/daaw/ik1;->m:F

    :goto_0
    return-void
.end method

.method public static synthetic a(Lcom/daaw/ik1;)Landroid/graphics/Typeface;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/ik1;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    return-object p1
.end method

.method public static synthetic c(Lcom/daaw/ik1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/ik1;->p:Z

    return p1
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ik1;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/daaw/ik1;->f:I

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    :cond_0
    iget-object v0, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    if-nez v0, :cond_4

    iget v0, p0, Lcom/daaw/ik1;->g:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_1
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_2
    sget-object v0, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object v0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    :goto_0
    iput-object v0, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    iget-object v0, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    iget v1, p0, Lcom/daaw/ik1;->f:I

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    :cond_4
    return-void
.end method

.method public e()Landroid/graphics/Typeface;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ik1;->d()V

    iget-object v0, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public f(Landroid/content/Context;)Landroid/graphics/Typeface;
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ik1;->p:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-nez v0, :cond_1

    :try_start_0
    iget v0, p0, Lcom/daaw/ik1;->o:I

    invoke-static {p1, v0}, Lcom/daaw/j51;->f(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    if-eqz p1, :cond_1

    iget v0, p0, Lcom/daaw/ik1;->f:I

    invoke-static {p1, v0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error loading font "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/ik1;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :catch_1
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/ik1;->d()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/ik1;->p:Z

    iget-object p1, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    return-object p1
.end method

.method public g(Landroid/content/Context;Landroid/text/TextPaint;Lcom/daaw/kk1;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ik1;->e()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lcom/daaw/ik1;->l(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    new-instance v0, Lcom/daaw/ik1$b;

    invoke-direct {v0, p0, p2, p3}, Lcom/daaw/ik1$b;-><init>(Lcom/daaw/ik1;Landroid/text/TextPaint;Lcom/daaw/kk1;)V

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ik1;->h(Landroid/content/Context;Lcom/daaw/kk1;)V

    return-void
.end method

.method public h(Landroid/content/Context;Lcom/daaw/kk1;)V
    .locals 4

    invoke-virtual {p0, p1}, Lcom/daaw/ik1;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/ik1;->f(Landroid/content/Context;)Landroid/graphics/Typeface;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ik1;->d()V

    :goto_0
    iget v0, p0, Lcom/daaw/ik1;->o:I

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lcom/daaw/ik1;->p:Z

    :cond_1
    iget-boolean v2, p0, Lcom/daaw/ik1;->p:Z

    if-eqz v2, :cond_2

    iget-object p1, p0, Lcom/daaw/ik1;->q:Landroid/graphics/Typeface;

    invoke-virtual {p2, p1, v1}, Lcom/daaw/kk1;->b(Landroid/graphics/Typeface;Z)V

    return-void

    :cond_2
    :try_start_0
    new-instance v2, Lcom/daaw/ik1$a;

    invoke-direct {v2, p0, p2}, Lcom/daaw/ik1$a;-><init>(Lcom/daaw/ik1;Lcom/daaw/kk1;)V

    const/4 v3, 0x0

    invoke-static {p1, v0, v2, v3}, Lcom/daaw/j51;->h(Landroid/content/Context;ILcom/daaw/j51$f;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error loading font "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/ik1;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iput-boolean v1, p0, Lcom/daaw/ik1;->p:Z

    const/4 p1, -0x3

    invoke-virtual {p2, p1}, Lcom/daaw/kk1;->a(I)V

    goto :goto_1

    :catch_1
    iput-boolean v1, p0, Lcom/daaw/ik1;->p:Z

    invoke-virtual {p2, v1}, Lcom/daaw/kk1;->a(I)V

    :goto_1
    return-void
.end method

.method public final i(Landroid/content/Context;)Z
    .locals 0

    invoke-static {}, Lcom/daaw/jk1;->a()Z

    move-result p1

    return p1
.end method

.method public j(Landroid/content/Context;Landroid/text/TextPaint;Lcom/daaw/kk1;)V
    .locals 4

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ik1;->k(Landroid/content/Context;Landroid/text/TextPaint;Lcom/daaw/kk1;)V

    iget-object p1, p0, Lcom/daaw/ik1;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_0

    iget-object p3, p2, Landroid/text/TextPaint;->drawableState:[I

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    invoke-virtual {p1, p3, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    goto :goto_0

    :cond_0
    const/high16 p1, -0x1000000

    :goto_0
    invoke-virtual {p2, p1}, Landroid/text/TextPaint;->setColor(I)V

    iget p1, p0, Lcom/daaw/ik1;->k:F

    iget p3, p0, Lcom/daaw/ik1;->i:F

    iget v0, p0, Lcom/daaw/ik1;->j:F

    iget-object v1, p0, Lcom/daaw/ik1;->d:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_1

    iget-object v2, p2, Landroid/text/TextPaint;->drawableState:[I

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p2, p1, p3, v0, v1}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    return-void
.end method

.method public k(Landroid/content/Context;Landroid/text/TextPaint;Lcom/daaw/kk1;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/ik1;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/ik1;->f(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lcom/daaw/ik1;->l(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ik1;->g(Landroid/content/Context;Landroid/text/TextPaint;Lcom/daaw/kk1;)V

    :goto_0
    return-void
.end method

.method public l(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V
    .locals 1

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v0, p0, Lcom/daaw/ik1;->f:I

    invoke-virtual {p2}, Landroid/graphics/Typeface;->getStyle()I

    move-result p2

    xor-int/lit8 p2, p2, -0x1

    and-int/2addr p2, v0

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    const/high16 p2, -0x41800000    # -0.25f

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTextSkewX(F)V

    iget p2, p0, Lcom/daaw/ik1;->n:F

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTextSize(F)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-lt p2, v0, :cond_2

    iget-boolean p2, p0, Lcom/daaw/ik1;->l:Z

    if-eqz p2, :cond_2

    iget p2, p0, Lcom/daaw/ik1;->m:F

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setLetterSpacing(F)V

    :cond_2
    return-void
.end method
