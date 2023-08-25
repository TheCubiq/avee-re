.class public Lcom/daaw/s60;
.super Lcom/daaw/l70;
.source ""

# interfaces
.implements Lcom/daaw/x60$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/s60$a;
    }
.end annotation


# instance fields
.field public A:Z

.field public final p:Landroid/graphics/Paint;

.field public final q:Landroid/graphics/Rect;

.field public final r:Lcom/daaw/s60$a;

.field public final s:Lcom/daaw/r60;

.field public final t:Lcom/daaw/x60;

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/r60$a;Lcom/daaw/bc;Lcom/daaw/cn1;IILcom/daaw/a70;[BLandroid/graphics/Bitmap;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/r60$a;",
            "Lcom/daaw/bc;",
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;II",
            "Lcom/daaw/a70;",
            "[B",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    new-instance v10, Lcom/daaw/s60$a;

    move-object v0, v10

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    move-object v3, p1

    move-object v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object v7, p2

    move-object v8, p3

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/daaw/s60$a;-><init>(Lcom/daaw/a70;[BLandroid/content/Context;Lcom/daaw/cn1;IILcom/daaw/r60$a;Lcom/daaw/bc;Landroid/graphics/Bitmap;)V

    move-object v0, p0

    invoke-direct {p0, v10}, Lcom/daaw/s60;-><init>(Lcom/daaw/s60$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/s60$a;)V
    .locals 7

    invoke-direct {p0}, Lcom/daaw/l70;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/daaw/s60;->q:Landroid/graphics/Rect;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/s60;->x:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/s60;->z:I

    const-string v0, "GifState must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    new-instance v4, Lcom/daaw/r60;

    iget-object v0, p1, Lcom/daaw/s60$a;->g:Lcom/daaw/r60$a;

    invoke-direct {v4, v0}, Lcom/daaw/r60;-><init>(Lcom/daaw/r60$a;)V

    iput-object v4, p0, Lcom/daaw/s60;->s:Lcom/daaw/r60;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/daaw/s60;->p:Landroid/graphics/Paint;

    iget-object v0, p1, Lcom/daaw/s60$a;->a:Lcom/daaw/a70;

    iget-object v1, p1, Lcom/daaw/s60$a;->b:[B

    invoke-virtual {v4, v0, v1}, Lcom/daaw/r60;->o(Lcom/daaw/a70;[B)V

    new-instance v0, Lcom/daaw/x60;

    iget-object v2, p1, Lcom/daaw/s60$a;->c:Landroid/content/Context;

    iget v5, p1, Lcom/daaw/s60$a;->e:I

    iget v6, p1, Lcom/daaw/s60$a;->f:I

    move-object v1, v0

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/x60;-><init>(Landroid/content/Context;Lcom/daaw/x60$c;Lcom/daaw/r60;II)V

    iput-object v0, p0, Lcom/daaw/s60;->t:Lcom/daaw/x60;

    iget-object p1, p1, Lcom/daaw/s60$a;->d:Lcom/daaw/cn1;

    invoke-virtual {v0, p1}, Lcom/daaw/x60;->f(Lcom/daaw/cn1;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/s60;Landroid/graphics/Bitmap;Lcom/daaw/cn1;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/s60;",
            "Landroid/graphics/Bitmap;",
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    new-instance v10, Lcom/daaw/s60$a;

    iget-object p1, p1, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    iget-object v1, p1, Lcom/daaw/s60$a;->a:Lcom/daaw/a70;

    iget-object v2, p1, Lcom/daaw/s60$a;->b:[B

    iget-object v3, p1, Lcom/daaw/s60$a;->c:Landroid/content/Context;

    iget v5, p1, Lcom/daaw/s60$a;->e:I

    iget v6, p1, Lcom/daaw/s60$a;->f:I

    iget-object v7, p1, Lcom/daaw/s60$a;->g:Lcom/daaw/r60$a;

    iget-object v8, p1, Lcom/daaw/s60$a;->h:Lcom/daaw/bc;

    move-object v0, v10

    move-object v4, p3

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/daaw/s60$a;-><init>(Lcom/daaw/a70;[BLandroid/content/Context;Lcom/daaw/cn1;IILcom/daaw/r60$a;Lcom/daaw/bc;Landroid/graphics/Bitmap;)V

    invoke-direct {p0, v10}, Lcom/daaw/s60;-><init>(Lcom/daaw/s60$a;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/s60;->stop()V

    invoke-virtual {p0}, Lcom/daaw/s60;->j()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    iget-object v0, p0, Lcom/daaw/s60;->s:Lcom/daaw/r60;

    invoke-virtual {v0}, Lcom/daaw/r60;->f()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Lcom/daaw/s60;->y:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/s60;->y:I

    :cond_1
    iget p1, p0, Lcom/daaw/s60;->z:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    iget v0, p0, Lcom/daaw/s60;->y:I

    if-lt v0, p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/s60;->stop()V

    :cond_2
    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c(I)V
    .locals 1

    const/4 v0, -0x1

    if-gtz p1, :cond_1

    if-eq p1, v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/daaw/s60;->s:Lcom/daaw/r60;

    invoke-virtual {p1}, Lcom/daaw/r60;->j()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, p1

    :goto_1
    iput v0, p0, Lcom/daaw/s60;->z:I

    goto :goto_2

    :cond_3
    iput p1, p0, Lcom/daaw/s60;->z:I

    :goto_2
    return-void
.end method

.method public d()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    iget-object v0, v0, Lcom/daaw/s60$a;->b:[B

    return-object v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/s60;->w:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/s60;->A:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x77

    invoke-virtual {p0}, Lcom/daaw/s60;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/s60;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/s60;->q:Landroid/graphics/Rect;

    invoke-static {v0, v1, v2, v3, v4}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/s60;->A:Z

    :cond_1
    iget-object v0, p0, Lcom/daaw/s60;->t:Lcom/daaw/x60;

    invoke-virtual {v0}, Lcom/daaw/x60;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    iget-object v0, v0, Lcom/daaw/s60$a;->i:Landroid/graphics/Bitmap;

    :goto_0
    const/4 v1, 0x0

    iget-object v2, p0, Lcom/daaw/s60;->q:Landroid/graphics/Rect;

    iget-object v3, p0, Lcom/daaw/s60;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public e()Lcom/daaw/r60;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->s:Lcom/daaw/r60;

    return-object v0
.end method

.method public f()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    iget-object v0, v0, Lcom/daaw/s60$a;->i:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->s:Lcom/daaw/r60;

    invoke-virtual {v0}, Lcom/daaw/r60;->f()I

    move-result v0

    return v0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    iget-object v0, v0, Lcom/daaw/s60$a;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    iget-object v0, v0, Lcom/daaw/s60$a;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public h()Lcom/daaw/cn1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    iget-object v0, v0, Lcom/daaw/s60$a;->d:Lcom/daaw/cn1;

    return-object v0
.end method

.method public i()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/s60;->w:Z

    iget-object v0, p0, Lcom/daaw/s60;->r:Lcom/daaw/s60$a;

    iget-object v1, v0, Lcom/daaw/s60$a;->h:Lcom/daaw/bc;

    iget-object v0, v0, Lcom/daaw/s60$a;->i:Landroid/graphics/Bitmap;

    invoke-interface {v1, v0}, Lcom/daaw/bc;->a(Landroid/graphics/Bitmap;)Z

    iget-object v0, p0, Lcom/daaw/s60;->t:Lcom/daaw/x60;

    invoke-virtual {v0}, Lcom/daaw/x60;->a()V

    iget-object v0, p0, Lcom/daaw/s60;->t:Lcom/daaw/x60;

    invoke-virtual {v0}, Lcom/daaw/x60;->h()V

    return-void
.end method

.method public isRunning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/s60;->u:Z

    return v0
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->t:Lcom/daaw/x60;

    invoke-virtual {v0}, Lcom/daaw/x60;->a()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final k()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/s60;->y:I

    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/s60;->s:Lcom/daaw/r60;

    invoke-virtual {v0}, Lcom/daaw/r60;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    :goto_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/s60;->u:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lcom/daaw/s60;->u:Z

    iget-object v0, p0, Lcom/daaw/s60;->t:Lcom/daaw/x60;

    invoke-virtual {v0}, Lcom/daaw/x60;->g()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final m()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/s60;->u:Z

    iget-object v0, p0, Lcom/daaw/s60;->t:Lcom/daaw/x60;

    invoke-virtual {v0}, Lcom/daaw/x60;->h()V

    return-void
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/s60;->A:Z

    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s60;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 1

    iput-boolean p1, p0, Lcom/daaw/s60;->x:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/s60;->m()V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/s60;->v:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/s60;->l()V

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public start()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/s60;->v:Z

    invoke-virtual {p0}, Lcom/daaw/s60;->k()V

    iget-boolean v0, p0, Lcom/daaw/s60;->x:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/s60;->l()V

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/s60;->v:Z

    invoke-virtual {p0}, Lcom/daaw/s60;->m()V

    return-void
.end method
