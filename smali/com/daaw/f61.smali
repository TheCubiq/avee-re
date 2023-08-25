.class public Lcom/daaw/f61;
.super Lcom/daaw/uv;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/uv<",
        "Lcom/daaw/xi;",
        "Lcom/daaw/rn;",
        "Lcom/daaw/vn;",
        ">;"
    }
.end annotation


# instance fields
.field public H:I

.field public I:I

.field public J:Ljava/lang/String;

.field public K:Z

.field public L:[Lcom/daaw/or1;

.field public M:Lcom/daaw/or1;

.field public N:Z

.field public O:Z

.field public P:[I

.field public Q:I

.field public R:I

.field public S:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/uv;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/f61;->K:Z

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/daaw/or1;

    iput-object v1, p0, Lcom/daaw/f61;->L:[Lcom/daaw/or1;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/f61;->M:Lcom/daaw/or1;

    iput-boolean v0, p0, Lcom/daaw/f61;->N:Z

    iput v0, p0, Lcom/daaw/f61;->Q:I

    iput v0, p0, Lcom/daaw/f61;->R:I

    iput v0, p0, Lcom/daaw/f61;->S:I

    iput-object p1, p0, Lcom/daaw/f61;->J:Ljava/lang/String;

    iput p2, p0, Lcom/daaw/f61;->H:I

    iput p2, p0, Lcom/daaw/f61;->I:I

    return-void
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/daaw/tv;->C(Lcom/daaw/y31;)V

    iget-object v0, p0, Lcom/daaw/f61;->L:[Lcom/daaw/or1;

    iget v1, p0, Lcom/daaw/f61;->S:I

    array-length v2, v0

    rem-int v2, v1, v2

    aget-object v2, v0, v2

    if-nez v2, :cond_0

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/f61;->d0(Lcom/daaw/y31;Lcom/daaw/e40;)V

    return-void

    :cond_0
    array-length v2, v0

    rem-int/2addr v1, v2

    aget-object v0, v0, v1

    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/f61;->r0(Lcom/daaw/y31;Lcom/daaw/or1;Lcom/daaw/e40;)V

    iget p1, p0, Lcom/daaw/f61;->S:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/f61;->S:I

    return-void
.end method

.method public F(Lcom/daaw/y31;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->F(Lcom/daaw/y31;)V

    return-void
.end method

.method public bridge synthetic Y(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/tv;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/f61;->g0(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/xi;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Z(Lcom/daaw/tv;)V
    .locals 0

    check-cast p1, Lcom/daaw/xi;

    invoke-virtual {p0, p1}, Lcom/daaw/f61;->h0(Lcom/daaw/xi;)V

    return-void
.end method

.method public d0(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/f61;->q0(Lcom/daaw/y31;Lcom/daaw/e40;I)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/daaw/f61;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/daaw/f61;

    iget v0, p0, Lcom/daaw/f61;->H:I

    iget p1, p1, Lcom/daaw/f61;->H:I

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public g0(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/xi;
    .locals 2

    const-string v0, "Composition"

    invoke-static {v0, p2}, Lcom/daaw/q6;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p2, Lcom/daaw/tv;->C:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    invoke-static {p2}, Lcom/daaw/q6;->i(Z)V

    new-instance p2, Lcom/daaw/xi;

    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-direct {p2, v0}, Lcom/daaw/xi;-><init>(Z)V

    return-object p2
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "Root"

    return-object v0
.end method

.method public h0(Lcom/daaw/xi;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/xi;->m0()Z

    move-result v0

    invoke-static {v0}, Lcom/daaw/q6;->i(Z)V

    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/uv;->Z(Lcom/daaw/tv;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/daaw/f61;->H:I

    mul-int/lit8 v0, v0, 0x2d

    add-int/lit8 v0, v0, 0x2f

    return v0
.end method

.method public i0(Lcom/daaw/y31;Lcom/daaw/or1;)Lcom/daaw/or1;
    .locals 4

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/y31;->I()Lcom/daaw/cs1;

    move-result-object p1

    iget v0, p1, Lcom/daaw/cs1;->a:I

    iget p1, p1, Lcom/daaw/cs1;->b:I

    const/16 v1, 0x2601

    const/16 v2, 0x2901

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lcom/daaw/or1;->g(IIIIZ)Lcom/daaw/or1;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/daaw/or1;->f()Lcom/daaw/or1;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-object p2
.end method

.method public j0(Lcom/daaw/or1;)Lcom/daaw/or1;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/e40;->a()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public k0()I
    .locals 1

    iget v0, p0, Lcom/daaw/f61;->I:I

    return v0
.end method

.method public l0()[I
    .locals 1

    iget-object v0, p0, Lcom/daaw/f61;->P:[I

    return-object v0
.end method

.method public m0()I
    .locals 1

    iget v0, p0, Lcom/daaw/f61;->R:I

    return v0
.end method

.method public n0()I
    .locals 1

    iget v0, p0, Lcom/daaw/f61;->Q:I

    return v0
.end method

.method public o0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/f61;->J:Ljava/lang/String;

    return-object v0
.end method

.method public p0(Lcom/daaw/vn;Lcom/daaw/od0;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/uv;->b0(Lcom/daaw/ad0;Lcom/daaw/od0;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/f61;->o0()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/vn;->t(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/f61;->k0()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/vn;->q(I)V

    const-string p2, "Root"

    invoke-virtual {p1, p2}, Lcom/daaw/vn;->s(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final q0(Lcom/daaw/y31;Lcom/daaw/e40;I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p3, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/xi;

    invoke-virtual {v0}, Lcom/daaw/xi;->W()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/xi;->o0()V

    invoke-virtual {v0}, Lcom/daaw/xi;->g0()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p0, p1, p2, v3}, Lcom/daaw/f61;->q0(Lcom/daaw/y31;Lcom/daaw/e40;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p1}, Lcom/daaw/xi;->F(Lcom/daaw/y31;)V

    invoke-virtual {v0, p1, p2}, Lcom/daaw/xi;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-virtual {v0}, Lcom/daaw/xi;->h0()Lcom/daaw/or1;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/daaw/y31;->S(ILcom/daaw/or1;)V

    return-void
.end method

.method public r0(Lcom/daaw/y31;Lcom/daaw/or1;Lcom/daaw/e40;)V
    .locals 5

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v0, v0, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v0, 0x4100

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    invoke-virtual {p0, p1}, Lcom/daaw/f61;->u0(Lcom/daaw/y31;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/f61;->d0(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-boolean v0, p0, Lcom/daaw/f61;->O:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [[I

    iget-object v3, p0, Lcom/daaw/f61;->P:[I

    aput-object v3, v0, v2

    invoke-virtual {p1, p2}, Lcom/daaw/y31;->i(Lcom/daaw/e40;)V

    invoke-virtual {p2}, Lcom/daaw/e40;->getWidth()I

    move-result v3

    invoke-virtual {p2}, Lcom/daaw/e40;->getHeight()I

    move-result v4

    invoke-static {v2, v2, v3, v4, v0}, Lcom/daaw/f80;->i(IIII[[I)[I

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/f61;->P:[I

    invoke-virtual {p2}, Lcom/daaw/e40;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/daaw/f61;->Q:I

    invoke-virtual {p2}, Lcom/daaw/e40;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/daaw/f61;->R:I

    :cond_0
    iget-object v0, p0, Lcom/daaw/f61;->M:Lcom/daaw/or1;

    const/4 v3, -0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Lcom/daaw/y31;->i(Lcom/daaw/e40;)V

    invoke-virtual {p1, v2}, Lcom/daaw/y31;->e(I)V

    iget-object p3, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p3}, Lcom/daaw/y31$c;->x()Lcom/daaw/sr1;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/daaw/y31;->p(Lcom/daaw/dc1;)V

    iget-object p3, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p3}, Lcom/daaw/y31$c;->x()Lcom/daaw/sr1;

    move-result-object p3

    invoke-virtual {p2}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vk1;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v1

    const-string v4, "resolutionW"

    invoke-virtual {p3, v4, v0}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    iget-object p3, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p3}, Lcom/daaw/y31$c;->x()Lcom/daaw/sr1;

    move-result-object p3

    invoke-virtual {p2}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vk1;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v1

    const-string v1, "resolutionH"

    invoke-virtual {p3, v1, v0}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/vk1;->c()V

    iget-object p3, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p3}, Lcom/daaw/y31$c;->w()Lcom/daaw/q40;

    move-result-object p3

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->x()Lcom/daaw/sr1;

    move-result-object v0

    const-string v1, "Position"

    invoke-virtual {p3, v0, v1}, Lcom/daaw/q40;->e(Lcom/daaw/dc1;Ljava/lang/String;)V

    iget-object p3, p0, Lcom/daaw/f61;->M:Lcom/daaw/or1;

    invoke-super {p0, p1, p3}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-boolean p3, p0, Lcom/daaw/f61;->N:Z

    if-eqz p3, :cond_1

    new-instance p3, Lcom/daaw/z6;

    invoke-virtual {p2}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object p2

    invoke-direct {p3, p2, v2}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    invoke-virtual {p0}, Lcom/daaw/tv;->f()I

    move-result p2

    invoke-virtual {p1, v3, p3, p2}, Lcom/daaw/y31;->w(ILcom/daaw/qc0;I)V

    :cond_1
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    iget-object p2, p0, Lcom/daaw/f61;->M:Lcom/daaw/or1;

    goto :goto_0

    :cond_2
    invoke-super {p0, p1, p3}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-boolean p3, p0, Lcom/daaw/f61;->N:Z

    if-eqz p3, :cond_3

    new-instance p3, Lcom/daaw/z6;

    invoke-virtual {p2}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object v0

    invoke-direct {p3, v0, v2}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    invoke-virtual {p0}, Lcom/daaw/tv;->f()I

    move-result v0

    invoke-virtual {p1, v3, p3, v0}, Lcom/daaw/y31;->w(ILcom/daaw/qc0;I)V

    :cond_3
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    :goto_0
    invoke-virtual {p2}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/y31;->O(Lcom/daaw/vk1;)V

    return-void
.end method

.method public s0(ZZ[I)V
    .locals 0

    iput-boolean p2, p0, Lcom/daaw/f61;->O:Z

    if-eqz p2, :cond_0

    iput-object p3, p0, Lcom/daaw/f61;->P:[I

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    iput-object p2, p0, Lcom/daaw/f61;->P:[I

    :goto_0
    iget-boolean p2, p0, Lcom/daaw/f61;->K:Z

    if-ne p2, p1, :cond_1

    return-void

    :cond_1
    iput-boolean p1, p0, Lcom/daaw/f61;->K:Z

    invoke-virtual {p0}, Lcom/daaw/uv;->l()V

    return-void
.end method

.method public t0(Lcom/daaw/vn;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/vn;->h()I

    move-result v0

    iput v0, p0, Lcom/daaw/f61;->I:I

    invoke-virtual {p0, p1}, Lcom/daaw/uv;->f0(Lcom/daaw/ad0;)Z

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
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/f61;->K:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :goto_0
    iget-object v0, p0, Lcom/daaw/f61;->L:[Lcom/daaw/or1;

    array-length v2, v0

    if-ge v1, v2, :cond_1

    aget-object v2, v0, v1

    invoke-virtual {p0, v2}, Lcom/daaw/f61;->j0(Lcom/daaw/or1;)Lcom/daaw/or1;

    move-result-object v2

    aput-object v2, v0, v1

    iget-object v0, p0, Lcom/daaw/f61;->L:[Lcom/daaw/or1;

    aget-object v2, v0, v1

    invoke-virtual {p0, p1, v2}, Lcom/daaw/f61;->i0(Lcom/daaw/y31;Lcom/daaw/or1;)Lcom/daaw/or1;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/daaw/f61;->L:[Lcom/daaw/or1;

    array-length v2, v0

    if-ge v1, v2, :cond_1

    aget-object v2, v0, v1

    invoke-virtual {p0, v2}, Lcom/daaw/f61;->j0(Lcom/daaw/or1;)Lcom/daaw/or1;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/daaw/f61;->M:Lcom/daaw/or1;

    invoke-virtual {p0, v0}, Lcom/daaw/f61;->j0(Lcom/daaw/or1;)Lcom/daaw/or1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/f61;->M:Lcom/daaw/or1;

    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    move-result p1

    return p1
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/f61;->L:[Lcom/daaw/or1;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object v1, v0, p1

    invoke-virtual {p0, v1}, Lcom/daaw/f61;->j0(Lcom/daaw/or1;)Lcom/daaw/or1;

    move-result-object v1

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/f61;->M:Lcom/daaw/or1;

    invoke-virtual {p0, p1}, Lcom/daaw/f61;->j0(Lcom/daaw/or1;)Lcom/daaw/or1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/f61;->M:Lcom/daaw/or1;

    return-void
.end method
