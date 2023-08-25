.class public Lcom/daaw/xi;
.super Lcom/daaw/uv;
.source ""

# interfaces
.implements Lcom/daaw/vc0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/uv<",
        "Lcom/daaw/tv;",
        "Lcom/daaw/un;",
        "Lcom/daaw/rn;",
        ">;",
        "Lcom/daaw/vc0;"
    }
.end annotation


# static fields
.field public static S:Lcom/daaw/ww1;
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
.field public H:Z

.field public I:Lcom/daaw/or1;

.field public final J:Z

.field public K:Z

.field public L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public M:F

.field public N:F

.field public O:F

.field public P:F

.field public Q:I

.field public R:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/xi;->S:Lcom/daaw/ww1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/uv;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/xi;->H:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/daaw/xi;->L:Ljava/util/List;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/xi;->M:F

    iput v1, p0, Lcom/daaw/xi;->N:F

    iput v1, p0, Lcom/daaw/xi;->O:F

    iput v1, p0, Lcom/daaw/xi;->P:F

    const/high16 v1, -0x21000000

    iput v1, p0, Lcom/daaw/xi;->Q:I

    iput v0, p0, Lcom/daaw/xi;->R:I

    iput-boolean v0, p0, Lcom/daaw/xi;->J:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/uv;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/xi;->H:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/daaw/xi;->L:Ljava/util/List;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/xi;->M:F

    iput v1, p0, Lcom/daaw/xi;->N:F

    iput v1, p0, Lcom/daaw/xi;->O:F

    iput v1, p0, Lcom/daaw/xi;->P:F

    const/high16 v2, -0x21000000

    iput v2, p0, Lcom/daaw/xi;->Q:I

    iput v0, p0, Lcom/daaw/xi;->R:I

    iput-boolean p1, p0, Lcom/daaw/xi;->J:Z

    if-eqz p1, :cond_0

    iput v1, p0, Lcom/daaw/xi;->O:F

    iput v1, p0, Lcom/daaw/xi;->P:F

    :cond_0
    return-void
.end method

.method public static i0(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/16 v1, 0x3a

    invoke-static {p0, v1, v0}, Lcom/daaw/br1;->B(Ljava/lang/String;I[Ljava/lang/String;)V

    const/4 p0, 0x0

    aget-object p0, v0, p0

    const-string v1, "composition"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v1, -0x1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    aget-object p0, v0, p0

    invoke-static {p0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result p0

    return p0

    :cond_0
    return v1
.end method

.method public static n0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "composition:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 2

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->a:Lcom/daaw/sg0;

    invoke-interface {v0}, Lcom/daaw/sg0;->e()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/xi;->t0(Z)V

    invoke-virtual {p0, p1}, Lcom/daaw/tv;->C(Lcom/daaw/y31;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/xi;->K:Z

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->b()Lcom/daaw/sg0;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/sg0;->i()Lcom/daaw/om1;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/xi;->J:Z

    if-eqz v1, :cond_0

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/uv;->d0(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-virtual {p0, p1, v0}, Lcom/daaw/xi;->p0(Lcom/daaw/y31;Lcom/daaw/om1;)V

    return-void

    :cond_0
    iget-object p2, p0, Lcom/daaw/xi;->I:Lcom/daaw/or1;

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1, p2}, Lcom/daaw/y31;->i(Lcom/daaw/e40;)V

    const/4 p2, 0x0

    invoke-static {p2, p2, p2, p2}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 p2, 0x4000

    invoke-static {p2}, Landroid/opengl/GLES20;->glClear(I)V

    invoke-virtual {p0, p1}, Lcom/daaw/xi;->u0(Lcom/daaw/y31;)V

    iget-object p2, p0, Lcom/daaw/xi;->I:Lcom/daaw/or1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/uv;->d0(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-virtual {p0, p1, v0}, Lcom/daaw/xi;->p0(Lcom/daaw/y31;Lcom/daaw/om1;)V

    return-void
.end method

.method public F(Lcom/daaw/y31;)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xi;->J:Z

    invoke-super {p0, p1}, Lcom/daaw/tv;->F(Lcom/daaw/y31;)V

    invoke-virtual {p0, p1}, Lcom/daaw/uv;->e0(Lcom/daaw/y31;)V

    return-void
.end method

.method public K(Lcom/daaw/un;I)Z
    .locals 4

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->K(Lcom/daaw/un;I)Z

    instance-of p2, p1, Lcom/daaw/rn;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/daaw/rn;

    invoke-virtual {p0, p1}, Lcom/daaw/uv;->f0(Lcom/daaw/ad0;)Z

    :cond_0
    iget-boolean p1, p0, Lcom/daaw/xi;->J:Z

    const/4 p2, 0x1

    if-eqz p1, :cond_5

    sget-object p1, Lcom/daaw/xi;->S:Lcom/daaw/ww1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p0, v0}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/tv;

    instance-of v3, v2, Lcom/daaw/pl0;

    if-eqz v3, :cond_2

    iget-object p1, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, p2

    if-eq v1, p1, :cond_1

    invoke-virtual {p0, v1}, Lcom/daaw/uv;->c0(I)Lcom/daaw/tv;

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    move-object p1, v2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    if-nez v0, :cond_5

    if-nez p1, :cond_4

    new-instance p1, Lcom/daaw/pl0;

    invoke-direct {p1}, Lcom/daaw/pl0;-><init>()V

    :cond_4
    invoke-virtual {p0, p1}, Lcom/daaw/uv;->Z(Lcom/daaw/tv;)V

    :cond_5
    return p2
.end method

.method public W()Z
    .locals 1

    invoke-super {p0}, Lcom/daaw/tv;->W()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/xi;->K:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public Y(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/tv;
    .locals 0

    const/4 p1, 0x0

    invoke-static {p2, p3, p1}, Lcom/daaw/xv;->a(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/tv;)Lcom/daaw/tv;

    move-result-object p1

    return-object p1
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xi;->L:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Lcom/daaw/un;ILcom/daaw/od0;)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->g(Lcom/daaw/un;ILcom/daaw/od0;)Z

    instance-of p2, p1, Lcom/daaw/rn;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/daaw/rn;

    invoke-virtual {p0, p1, p3}, Lcom/daaw/uv;->b0(Lcom/daaw/ad0;Lcom/daaw/od0;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public g0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/xi;->L:Ljava/util/List;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "Composition"

    return-object v0
.end method

.method public h0()Lcom/daaw/or1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xi;->I:Lcom/daaw/or1;

    return-object v0
.end method

.method public final j0()I
    .locals 1

    iget v0, p0, Lcom/daaw/xi;->Q:I

    return v0
.end method

.method public final k0()F
    .locals 1

    iget v0, p0, Lcom/daaw/xi;->O:F

    return v0
.end method

.method public final l0()F
    .locals 1

    iget v0, p0, Lcom/daaw/xi;->P:F

    return v0
.end method

.method public m0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xi;->J:Z

    return v0
.end method

.method public o0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/xi;->K:Z

    return-void
.end method

.method public final p0(Lcom/daaw/y31;Lcom/daaw/om1;)V
    .locals 8

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/daaw/xi;->Q:I

    iget v1, p2, Lcom/daaw/om1;->b:F

    const v2, 0x465ac000    # 14000.0f

    const v3, 0x3c23d70a    # 0.01f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_5

    iget v1, p0, Lcom/daaw/xi;->O:F

    const/high16 v2, 0x447a0000    # 1000.0f

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v5, v1, v3

    if-lez v5, :cond_1

    iget v5, p2, Lcom/daaw/om1;->a:F

    div-float/2addr v5, v2

    div-float/2addr v5, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v1

    goto :goto_0

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_0
    iget v5, p0, Lcom/daaw/xi;->P:F

    const/4 v6, 0x0

    cmpl-float v7, v5, v3

    if-lez v7, :cond_2

    iget v7, p2, Lcom/daaw/om1;->b:F

    iget p2, p2, Lcom/daaw/om1;->a:F

    sub-float/2addr v7, p2

    div-float/2addr v7, v2

    div-float/2addr v7, v5

    invoke-static {v4, v7}, Ljava/lang/Math;->min(FF)F

    move-result p2

    invoke-static {v6, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    goto :goto_1

    :cond_2
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_1
    cmpg-float v2, v1, v4

    if-gez v2, :cond_3

    iget v0, p0, Lcom/daaw/xi;->Q:I

    sub-float/2addr v4, v1

    :goto_2
    iput v4, p0, Lcom/daaw/xi;->N:F

    goto :goto_3

    :cond_3
    cmpg-float v1, p2, v4

    if-gez v1, :cond_4

    iget v0, p0, Lcom/daaw/xi;->Q:I

    sub-float/2addr v4, p2

    goto :goto_2

    :cond_4
    iput v6, p0, Lcom/daaw/xi;->N:F

    :cond_5
    :goto_3
    const p2, 0x3f666666    # 0.9f

    iget v1, p0, Lcom/daaw/xi;->M:F

    mul-float v1, v1, p2

    const p2, 0x3dccccd0    # 0.100000024f

    iget v2, p0, Lcom/daaw/xi;->N:F

    mul-float v2, v2, p2

    add-float/2addr v1, v2

    iput v1, p0, Lcom/daaw/xi;->M:F

    cmpl-float p2, v1, v3

    if-lez p2, :cond_6

    invoke-static {v0}, Lcom/daaw/f80;->h(I)F

    move-result p2

    iget v1, p0, Lcom/daaw/xi;->M:F

    mul-float p2, p2, v1

    float-to-int p2, p2

    invoke-static {v0, p2}, Lcom/daaw/f80;->t(II)I

    move-result p2

    new-instance v0, Lcom/daaw/w31;

    iget v1, p0, Lcom/daaw/xi;->R:I

    iget-object v2, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v2}, Lcom/daaw/y31$c;->c()Lcom/daaw/z6;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    invoke-virtual {p1, p2, v0}, Lcom/daaw/y31;->x(ILcom/daaw/w31;)V

    :cond_6
    return-void
.end method

.method public final q0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/xi;->Q:I

    return-void
.end method

.method public final r0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/xi;->O:F

    return-void
.end method

.method public final s0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/xi;->P:F

    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/uv;->t(Lcom/daaw/un;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/fc;->b(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "introBlendMode"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/daaw/fc;->a(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/xi;->R:I

    const-string v0, "introFadeDuration"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/xi;->r0(F)V

    const-string v0, "outroFadeDuration"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/xi;->s0(F)V

    const-string v0, "introFadeColor"

    const/high16 v1, -0x21000000

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/xi;->q0(I)V

    return-void
.end method

.method public t0(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xi;->H:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/xi;->H:Z

    invoke-virtual {p0}, Lcom/daaw/uv;->l()V

    return-void
.end method

.method public final u0(Lcom/daaw/y31;)V
    .locals 3

    const/16 v0, 0xde1

    const/16 v1, 0x2801

    const/16 v2, 0x2601

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v1, 0x2800

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/y31;->T(I)V

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/xi;->J:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->a:Lcom/daaw/sg0;

    invoke-interface {v0}, Lcom/daaw/sg0;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/xi;->H:Z

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/y31;->I()Lcom/daaw/cs1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xi;->I:Lcom/daaw/or1;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/e40;->a()V

    :cond_0
    iget v1, v0, Lcom/daaw/cs1;->a:I

    iget v0, v0, Lcom/daaw/cs1;->b:I

    const/16 v2, 0x2601

    const/16 v3, 0x2901

    iget-boolean v4, p0, Lcom/daaw/xi;->H:Z

    invoke-static {v1, v0, v2, v3, v4}, Lcom/daaw/or1;->g(IIIIZ)Lcom/daaw/or1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xi;->I:Lcom/daaw/or1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/or1;->f()Lcom/daaw/or1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xi;->I:Lcom/daaw/or1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    move-result p1

    return p1
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    iget-object p1, p0, Lcom/daaw/xi;->I:Lcom/daaw/or1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/e40;->a()V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/xi;->I:Lcom/daaw/or1;

    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 0

    iget-object p3, p0, Lcom/daaw/xi;->L:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->clear()V

    invoke-super {p0, p1, p2, p0}, Lcom/daaw/uv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/xi;->K:Z

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 7

    invoke-super {p0, p1, p2}, Lcom/daaw/uv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    const v0, 0x7f1002a1

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget v0, p0, Lcom/daaw/xi;->R:I

    invoke-static {v0}, Lcom/daaw/fc;->b(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Alpha"

    const-string v2, "AddAlpha"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "introBlendMode"

    const-string v6, "2_introOutro"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/un;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/xi;->k0()F

    move-result v2

    const-string v1, "introFadeDuration"

    const-string v3, "2_introOutro"

    const/4 v4, 0x0

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    invoke-virtual {p0}, Lcom/daaw/xi;->l0()F

    move-result v2

    const-string v1, "outroFadeDuration"

    const-string v3, "2_introOutro"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    invoke-virtual {p0}, Lcom/daaw/xi;->j0()I

    move-result v0

    const-string v1, "introFadeColor"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method
