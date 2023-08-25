.class public Lcom/daaw/m70;
.super Lcom/daaw/mf0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/mf0<",
        "Lcom/daaw/l70;",
        ">;"
    }
.end annotation


# instance fields
.field public u:I

.field public v:Lcom/daaw/l70;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Lcom/daaw/m70;-><init>(Landroid/widget/ImageView;I)V

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/mf0;-><init>(Landroid/widget/ImageView;)V

    iput p2, p0, Lcom/daaw/m70;->u:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m70;->v:Lcom/daaw/l70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_0
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Lcom/daaw/f70;)V
    .locals 0

    check-cast p1, Lcom/daaw/l70;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/m70;->o(Lcom/daaw/l70;Lcom/daaw/f70;)V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m70;->v:Lcom/daaw/l70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_0
    return-void
.end method

.method public bridge synthetic n(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/l70;

    invoke-virtual {p0, p1}, Lcom/daaw/m70;->p(Lcom/daaw/l70;)V

    return-void
.end method

.method public o(Lcom/daaw/l70;Lcom/daaw/f70;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/l70;",
            "Lcom/daaw/f70<",
            "-",
            "Lcom/daaw/l70;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/l70;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/au1;->q:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/daaw/au1;->q:Landroid/view/View;

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v3, 0x3d4ccccd    # 0.05f

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    new-instance v0, Lcom/daaw/ve1;

    iget-object v1, p0, Lcom/daaw/au1;->q:Landroid/view/View;

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    invoke-direct {v0, p1, v1}, Lcom/daaw/ve1;-><init>(Lcom/daaw/l70;I)V

    move-object p1, v0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/daaw/mf0;->c(Ljava/lang/Object;Lcom/daaw/f70;)V

    iput-object p1, p0, Lcom/daaw/m70;->v:Lcom/daaw/l70;

    iget p2, p0, Lcom/daaw/m70;->u:I

    invoke-virtual {p1, p2}, Lcom/daaw/l70;->c(I)V

    invoke-interface {p1}, Landroid/graphics/drawable/Animatable;->start()V

    return-void
.end method

.method public p(Lcom/daaw/l70;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/au1;->q:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
