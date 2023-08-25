.class public Lcom/daaw/pl0;
.super Lcom/daaw/ok1;
.source ""


# static fields
.field public static X:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public P:Lcom/daaw/i2;

.field public Q:Lcom/daaw/vv;

.field public R:I

.field public S:F

.field public T:[F

.field public U:F

.field public final V:F

.field public final W:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/pl0;->X:Lcom/daaw/ww1;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/daaw/ok1;-><init>()V

    new-instance v0, Lcom/daaw/i2;

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    const-string v2, "internalres:anim128_g_m10_15"

    const-string v3, ""

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/i2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/pl0;->P:Lcom/daaw/i2;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/pl0;->R:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/pl0;->S:F

    const/4 v2, 0x4

    new-array v3, v2, [F

    iput-object v3, p0, Lcom/daaw/pl0;->T:[F

    iput v1, p0, Lcom/daaw/pl0;->U:F

    const v3, 0x4019999a    # 2.4f

    iput v3, p0, Lcom/daaw/pl0;->V:F

    const/16 v3, 0x1a

    iput v3, p0, Lcom/daaw/pl0;->W:I

    new-instance v4, Lcom/daaw/vv;

    new-instance v5, Lcom/daaw/pl0$a;

    invoke-direct {v5, p0}, Lcom/daaw/pl0$a;-><init>(Lcom/daaw/pl0;)V

    new-instance v6, Lcom/daaw/pl0$b;

    invoke-direct {v6, p0}, Lcom/daaw/pl0$b;-><init>(Lcom/daaw/pl0;)V

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7, v7}, Lcom/daaw/vv;-><init>(Lcom/daaw/vv$b;Lcom/daaw/r40;Lcom/daaw/s40;Lcom/daaw/s40;)V

    iput-object v4, p0, Lcom/daaw/pl0;->Q:Lcom/daaw/vv;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lcom/daaw/vv;->z(Z)V

    const v4, -0x6f6f6f70

    invoke-virtual {p0, v4}, Lcom/daaw/pl0;->f0(I)V

    invoke-virtual {p0, v2}, Lcom/daaw/tv;->J(I)V

    invoke-virtual {p0, v3}, Lcom/daaw/pl0;->h0(I)V

    const-string v2, "internal_3"

    invoke-virtual {p0, v2}, Lcom/daaw/ok1;->g0(Ljava/lang/String;)V

    const-string v2, "{MarkedArtistAndTitle}"

    invoke-virtual {p0, v2}, Lcom/daaw/ok1;->i0(Ljava/lang/String;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p0, v1, v2}, Lcom/daaw/tv;->N(FF)V

    const v2, 0x3f99999a    # 1.2f

    invoke-virtual {p0, v1, v2}, Lcom/daaw/tv;->L(FF)V

    invoke-virtual {p0, v5, v0}, Lcom/daaw/tv;->P(ZZ)V

    return-void
.end method

.method public static synthetic l0(Lcom/daaw/pl0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/tv;->m()V

    return-void
.end method

.method public static synthetic m0(Lcom/daaw/pl0;)Lcom/daaw/i2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pl0;->P:Lcom/daaw/i2;

    return-object p0
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/ok1;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-object v0, p0, Lcom/daaw/pl0;->Q:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->u(Lcom/daaw/y31;Lcom/daaw/e40;)V

    return-void
.end method

.method public M(Lcom/daaw/bs1;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->M(Lcom/daaw/bs1;)V

    return-void
.end method

.method public O(Lcom/daaw/bs1;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->O(Lcom/daaw/bs1;)V

    return-void
.end method

.method public W()Z
    .locals 1

    invoke-super {p0}, Lcom/daaw/tv;->W()Z

    move-result v0

    return v0
.end method

.method public Z(Landroid/graphics/RectF;)Lcom/daaw/bs1;
    .locals 6

    iget v0, p0, Lcom/daaw/pl0;->S:F

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v0, v1, v2, v2}, Lcom/daaw/mv;->a(FFFFF)F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v2

    mul-float v2, v2, v1

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v1

    const v3, 0x3e19999a    # 0.15f

    mul-float v1, v1, v3

    const v3, 0x4019999a    # 2.4f

    mul-float v1, v1, v3

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v4

    const v5, 0x3f866666    # 1.05f

    mul-float v4, v4, v5

    mul-float v4, v4, v3

    add-float/2addr v4, v1

    add-float/2addr v4, v2

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v0, v0, v1

    add-float/2addr v0, v1

    mul-float v4, v4, v0

    new-instance v0, Lcom/daaw/bs1;

    neg-float v1, v2

    add-float/2addr v1, v4

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    const v2, -0x41dc28f6    # -0.16f

    mul-float p1, p1, v2

    mul-float p1, p1, v3

    invoke-direct {v0, v1, p1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v0
.end method

.method public e0(Lcom/daaw/y31;Landroid/graphics/RectF;)V
    .locals 14

    move-object v0, p0

    move-object v2, p1

    move-object/from16 v1, p2

    invoke-super/range {p0 .. p2}, Lcom/daaw/ok1;->e0(Lcom/daaw/y31;Landroid/graphics/RectF;)V

    invoke-virtual {p1}, Lcom/daaw/y31;->J()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-ne v3, v4, :cond_0

    invoke-virtual {p0}, Lcom/daaw/pl0;->k0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/y31;->J()I

    move-result v3

    if-ne v3, v5, :cond_1

    invoke-virtual {p0}, Lcom/daaw/pl0;->j0()V

    :cond_1
    :goto_0
    iget v3, v0, Lcom/daaw/pl0;->U:F

    const/high16 v6, 0x40600000    # 3.5f

    cmpl-float v3, v3, v6

    if-lez v3, :cond_2

    invoke-virtual {p0}, Lcom/daaw/pl0;->j0()V

    :cond_2
    iget v3, v0, Lcom/daaw/pl0;->R:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-nez v3, :cond_3

    invoke-virtual {p0, v6}, Lcom/daaw/pl0;->n0(I)V

    iput v7, v0, Lcom/daaw/pl0;->S:F

    iput v7, v0, Lcom/daaw/pl0;->U:F

    return-void

    :cond_3
    const/high16 v8, 0x3fa00000    # 1.25f

    const/4 v9, 0x4

    const v10, 0x3f7fbe77    # 0.999f

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x3

    if-ne v3, v4, :cond_5

    iget v3, v0, Lcom/daaw/pl0;->S:F

    invoke-virtual {p1}, Lcom/daaw/y31;->d()F

    move-result v13

    mul-float v13, v13, v8

    add-float/2addr v3, v13

    iput v3, v0, Lcom/daaw/pl0;->S:F

    cmpl-float v3, v3, v10

    if-ltz v3, :cond_4

    iput v10, v0, Lcom/daaw/pl0;->S:F

    iput v5, v0, Lcom/daaw/pl0;->R:I

    :cond_4
    iget v3, v0, Lcom/daaw/pl0;->S:F

    const/high16 v8, 0x3f000000    # 0.5f

    sub-float/2addr v3, v8

    const/high16 v8, 0x40000000    # 2.0f

    mul-float v3, v3, v8

    invoke-static {v7, v3}, Ljava/lang/Math;->max(FF)F

    iget v3, v0, Lcom/daaw/pl0;->S:F

    invoke-static {v7, v3, v7, v11, v11}, Lcom/daaw/mv;->a(FFFFF)F

    move-result v3

    new-array v7, v9, [F

    iget-object v8, v0, Lcom/daaw/pl0;->T:[F

    aget v9, v8, v6

    mul-float v9, v9, v3

    aput v9, v7, v6

    aget v6, v8, v4

    mul-float v6, v6, v3

    aput v6, v7, v4

    aget v4, v8, v5

    mul-float v4, v4, v3

    aput v4, v7, v5

    aget v4, v8, v12

    mul-float v4, v4, v3

    aput v4, v7, v12

    invoke-static {v7}, Lcom/daaw/f80;->f([F)I

    move-result v3

    :goto_1
    invoke-virtual {p0, v3}, Lcom/daaw/pl0;->n0(I)V

    goto :goto_2

    :cond_5
    if-ne v3, v5, :cond_6

    iget v3, v0, Lcom/daaw/pl0;->U:F

    invoke-virtual {p1}, Lcom/daaw/y31;->d()F

    move-result v7

    add-float/2addr v3, v7

    iput v3, v0, Lcom/daaw/pl0;->U:F

    new-array v3, v9, [F

    iget-object v7, v0, Lcom/daaw/pl0;->T:[F

    aget v8, v7, v6

    aput v8, v3, v6

    aget v6, v7, v4

    aput v6, v3, v4

    aget v4, v7, v5

    aput v4, v3, v5

    aget v4, v7, v12

    aput v4, v3, v12

    invoke-static {v3}, Lcom/daaw/f80;->f([F)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/pl0;->n0(I)V

    iput v10, v0, Lcom/daaw/pl0;->S:F

    goto :goto_2

    :cond_6
    if-ne v3, v12, :cond_8

    iget v3, v0, Lcom/daaw/pl0;->S:F

    invoke-virtual {p1}, Lcom/daaw/y31;->d()F

    move-result v10

    mul-float v10, v10, v8

    sub-float/2addr v3, v10

    iput v3, v0, Lcom/daaw/pl0;->S:F

    cmpg-float v3, v3, v7

    if-gtz v3, :cond_7

    iput v7, v0, Lcom/daaw/pl0;->S:F

    iput v6, v0, Lcom/daaw/pl0;->R:I

    :cond_7
    iget v3, v0, Lcom/daaw/pl0;->S:F

    const/high16 v8, 0x3e800000    # 0.25f

    sub-float/2addr v3, v8

    const v8, 0x3faaaaab

    mul-float v3, v3, v8

    invoke-static {v7, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v7, v3, v7, v11, v11}, Lcom/daaw/mv;->a(FFFFF)F

    move-result v3

    new-array v7, v9, [F

    iget-object v8, v0, Lcom/daaw/pl0;->T:[F

    aget v9, v8, v6

    mul-float v9, v9, v3

    aput v9, v7, v6

    aget v6, v8, v4

    mul-float v6, v6, v3

    aput v6, v7, v4

    aget v4, v8, v5

    mul-float v4, v4, v3

    aput v4, v7, v5

    aget v4, v8, v12

    mul-float v4, v4, v3

    aput v4, v7, v12

    invoke-static {v7}, Lcom/daaw/f80;->f([F)I

    move-result v3

    goto :goto_1

    :cond_8
    :goto_2
    iget-object v3, v0, Lcom/daaw/pl0;->Q:Lcom/daaw/vv;

    invoke-virtual {v3, p1}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v3

    if-nez v3, :cond_9

    return-void

    :cond_9
    iget v4, v0, Lcom/daaw/pl0;->S:F

    invoke-interface {v3, v4}, Lcom/daaw/qc0;->c(F)Lcom/daaw/qc0;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v4

    const v5, 0x4019999a    # 2.4f

    mul-float v7, v4, v5

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v4

    const v6, 0x3e19999a    # 0.15f

    mul-float v4, v4, v6

    mul-float v4, v4, v5

    iget v5, v1, Landroid/graphics/RectF;->left:F

    add-float/2addr v4, v5

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float v5, v1, v7

    const/4 v8, -0x1

    iget-object v1, v2, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v1}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v9

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v10

    new-instance v11, Lcom/daaw/w31;

    invoke-virtual {p0}, Lcom/daaw/tv;->f()I

    move-result v12

    const/4 v13, 0x0

    invoke-direct {v11, v12, v3, v13, v13}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    const/4 v12, 0x0

    move-object v2, p1

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    invoke-virtual/range {v1 .. v12}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    return-void
.end method

.method public f0(I)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/ok1;->f0(I)V

    iget-object v0, p0, Lcom/daaw/pl0;->T:[F

    invoke-static {v0, p1}, Lcom/daaw/f80;->n([FI)V

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "AppLogo"

    return-object v0
.end method

.method public h0(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/ok1;->h0(I)V

    return-void
.end method

.method public j0()V
    .locals 1

    iget v0, p0, Lcom/daaw/pl0;->R:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lcom/daaw/pl0;->R:I

    return-void
.end method

.method public k0()V
    .locals 2

    iget v0, p0, Lcom/daaw/pl0;->R:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/pl0;->R:I

    return-void
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/tv;->l()V

    iget-object v0, p0, Lcom/daaw/pl0;->Q:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vv;->p()V

    :cond_0
    return-void
.end method

.method public n0(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/ok1;->f0(I)V

    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/ok1;->c0(Lcom/daaw/un;)V

    const-string v0, "visible"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->V(Z)V

    const-string v0, "color"

    const v2, -0x6f6f6f70

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/pl0;->f0(I)V

    const/4 p1, 0x0

    invoke-virtual {p0, v1, p1}, Lcom/daaw/tv;->P(ZZ)V

    sget-object p1, Lcom/daaw/pl0;->X:Lcom/daaw/ww1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p0, v0}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x3f0f5c29    # 0.56f

    invoke-virtual {p0, p1, p1}, Lcom/daaw/ok1;->a0(FF)V

    const/16 p1, 0x1a

    invoke-virtual {p0, p1}, Lcom/daaw/ok1;->b0(I)V

    const/high16 p1, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/daaw/tv;->N(FF)V

    const p1, 0x3f99999a    # 1.2f

    invoke-virtual {p0, v0, p1}, Lcom/daaw/tv;->L(FF)V

    :cond_0
    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/ok1;->v(Lcom/daaw/y31;)Z

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->q(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/pl0;->Q:Lcom/daaw/vv;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/vv;->q(Lcom/daaw/y31;Landroid/graphics/RectF;I)Z

    return v2
.end method

.method public w(Lcom/daaw/y31;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/pl0;->Q:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->r(Lcom/daaw/y31;I)Z

    return-void
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/ok1;->x(Lcom/daaw/y31;)V

    iget-object v0, p0, Lcom/daaw/pl0;->Q:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->s(Lcom/daaw/y31;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    iget-object v0, p0, Lcom/daaw/pl0;->Q:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vv;->t(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/ok1;->d0(Lcom/daaw/un;)V

    const p2, 0x7f10029e

    invoke-virtual {p0, p2}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/daaw/tv;->k:Z

    const-string v0, "visible"

    const-string v1, "0_general"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    const-string p2, "pb"

    const-string v2, "AppLogo"

    invoke-virtual {p1, v0, p2, v2}, Lcom/daaw/un;->s0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/pl0;->T:[F

    invoke-static {p2}, Lcom/daaw/f80;->f([F)I

    move-result p2

    const-string v0, "color"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    sget-object p2, Lcom/daaw/pl0;->X:Lcom/daaw/ww1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p0, v0}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "position"

    invoke-virtual {p1, p2}, Lcom/daaw/un;->n0(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
