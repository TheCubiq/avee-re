.class public abstract Lcom/daaw/xe0;
.super Lcom/daaw/tv;
.source ""


# instance fields
.field public G:Lcom/daaw/vv;

.field public H:Lcom/daaw/i2;

.field public I:Lcom/daaw/xn0;

.field public J:Z

.field public K:Z

.field public L:Z


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/daaw/xe0;->H:Lcom/daaw/i2;

    new-instance v2, Lcom/daaw/xn0;

    const-string v3, "TotalTimeAndBeat"

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-direct {v2, v3, v4, v4}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    iput-object v2, p0, Lcom/daaw/xe0;->I:Lcom/daaw/xn0;

    iput-boolean v0, p0, Lcom/daaw/xe0;->J:Z

    iput-boolean v0, p0, Lcom/daaw/xe0;->K:Z

    iput-boolean v0, p0, Lcom/daaw/xe0;->L:Z

    invoke-virtual {p0, v1, v1}, Lcom/daaw/tv;->R(FF)V

    return-void
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->u(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-virtual {p0, p1}, Lcom/daaw/xe0;->a0(Lcom/daaw/y31;)V

    return-void
.end method

.method public Y()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->l()Z

    move-result v0

    return v0
.end method

.method public Z(Lcom/daaw/s40;Lcom/daaw/s40;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/s40<",
            "Lcom/daaw/y31;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/s40<",
            "Lcom/daaw/y31;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/daaw/vv;

    new-instance v1, Lcom/daaw/xe0$a;

    invoke-direct {v1, p0}, Lcom/daaw/xe0$a;-><init>(Lcom/daaw/xe0;)V

    new-instance v2, Lcom/daaw/xe0$b;

    invoke-direct {v2, p0}, Lcom/daaw/xe0$b;-><init>(Lcom/daaw/xe0;)V

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/daaw/vv;-><init>(Lcom/daaw/vv$b;Lcom/daaw/r40;Lcom/daaw/s40;Lcom/daaw/s40;)V

    iput-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    return-void
.end method

.method public abstract a0(Lcom/daaw/y31;)V
.end method

.method public b0(I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->w(I)V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/xe0;->J:Z

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/daaw/xe0;->K:Z

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    iput-boolean v1, p0, Lcom/daaw/xe0;->L:Z

    return-void
.end method

.method public c0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->C(Ljava/lang/String;)V

    return-void
.end method

.method public d0(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->D(I)V

    return-void
.end method

.method public e0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->E(Z)V

    return-void
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/tv;->l()V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vv;->p()V

    :cond_0
    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 6

    invoke-super {p0, p1}, Lcom/daaw/tv;->t(Lcom/daaw/un;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->u(Lcom/daaw/un;)V

    const-string v0, "customImage"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/xe0;->c0(Ljava/lang/String;)V

    const-string v0, "generatedAlbumArtHint"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    and-int/lit8 v2, v0, 0x1

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v4, "generatedAlbumArtHintShiftHue"

    invoke-virtual {p1, v4, v2}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/xe0;->J:Z

    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const-string v4, "generatedAlbumArtHintNoText"

    invoke-virtual {p1, v4, v2}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/xe0;->K:Z

    const/4 v2, 0x4

    and-int/2addr v0, v2

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    const-string v4, "generatedAlbumArtHintForceGen"

    invoke-virtual {p1, v4, v0}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/xe0;->L:Z

    iget-boolean v4, p0, Lcom/daaw/xe0;->J:Z

    iget-boolean v5, p0, Lcom/daaw/xe0;->K:Z

    if-eqz v5, :cond_3

    const/4 v5, 0x2

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    or-int/2addr v4, v5

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    or-int v0, v4, v2

    invoke-virtual {p0, v0}, Lcom/daaw/xe0;->b0(I)V

    const/4 v0, -0x1

    const-string v2, "generatedAlbumArtColor"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/xe0;->d0(I)V

    const-string v0, "keepAspectRatioAndCropToFit"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/xe0;->e0(Z)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    const-string v2, "colorKeyEnabled"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/vv;->z(Z)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    const-string v1, "autoDetectColorKey"

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/vv;->x(Z)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    const v1, -0xff0100

    const-string v2, "colorKey"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/vv;->y(I)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    const-string v1, "transparencyStrength"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/vv;->B(F)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    const-string v1, "opacityStrength"

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/vv;->A(F)V

    const-string v0, "measureAnimationSpeed"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/xe0;->I:Lcom/daaw/xn0;

    const-string v1, "TotalTimeAndBeat"

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v0, p1, v1, v2, v2}, Lcom/daaw/xn0;->n(Lcom/daaw/un;Ljava/lang/String;FF)V

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->n(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/vv;->q(Lcom/daaw/y31;Landroid/graphics/RectF;I)Z

    return v2
.end method

.method public w(Lcom/daaw/y31;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->r(Lcom/daaw/y31;I)Z

    return-void
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->s(Lcom/daaw/y31;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vv;->t(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 9

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->A(Lcom/daaw/un;)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/od0;->a(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {p2}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/vv;->s:[Ljava/lang/String;

    const-string v1, "customImage"

    const-string v2, "1_image"

    invoke-virtual {p1, v1, p2, v2, v0}, Lcom/daaw/un;->f0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/4 p2, 0x0

    new-array v0, p2, [Ljava/lang/String;

    const-string v1, "measureAnimationSpeed"

    const-string v3, ""

    invoke-virtual {p1, v1, v3, v2, v0}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xe0;->I:Lcom/daaw/xn0;

    invoke-virtual {v1, v0}, Lcom/daaw/xn0;->o(Lcom/daaw/un;)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->g()I

    move-result v5

    const-string v4, "generatedAlbumArtHint"

    const-string v6, "generatedAlbumArt"

    const/4 v7, 0x0

    const/4 v8, 0x7

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->X(Ljava/lang/String;ILjava/lang/String;II)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->g()I

    move-result v0

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v3, "generatedAlbumArtHintShiftHue"

    const-string v4, "generatedAlbumArt"

    invoke-virtual {p1, v3, v0, v4}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->g()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const-string v3, "generatedAlbumArtHintNoText"

    invoke-virtual {p1, v3, v0, v4}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->g()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    const/4 p2, 0x1

    :cond_2
    const-string v0, "generatedAlbumArtHintForceGen"

    invoke-virtual {p1, v0, p2, v4}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {p2}, Lcom/daaw/vv;->k()I

    move-result p2

    const-string v0, "generatedAlbumArtColor"

    invoke-virtual {p1, v0, p2, v4}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {p2}, Lcom/daaw/vv;->l()Z

    move-result p2

    const-string v0, "keepAspectRatioAndCropToFit"

    invoke-virtual {p1, v0, p2, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {p2}, Lcom/daaw/vv;->h()Z

    move-result p2

    const-string v0, "colorKeyEnabled"

    const-string v1, "2_ColorKey"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {p2}, Lcom/daaw/vv;->i()Lcom/daaw/ye0;

    move-result-object p2

    iget-boolean p2, p2, Lcom/daaw/ye0;->b:Z

    const-string v0, "autoDetectColorKey"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {p2}, Lcom/daaw/vv;->i()Lcom/daaw/ye0;

    move-result-object p2

    iget p2, p2, Lcom/daaw/ye0;->a:I

    const-string v0, "colorKey"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/un;->U(Ljava/lang/String;ILjava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {p2}, Lcom/daaw/vv;->i()Lcom/daaw/ye0;

    move-result-object p2

    iget v2, p2, Lcom/daaw/ye0;->c:F

    const/4 v4, 0x0

    const/high16 v5, 0x40800000    # 4.0f

    const-string v1, "transparencyStrength"

    const-string v3, "2_ColorKey"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget-object p2, p0, Lcom/daaw/xe0;->G:Lcom/daaw/vv;

    invoke-virtual {p2}, Lcom/daaw/vv;->i()Lcom/daaw/ye0;

    move-result-object p2

    iget v2, p2, Lcom/daaw/ye0;->d:F

    const-string v1, "opacityStrength"

    const-string v3, "2_ColorKey"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method
