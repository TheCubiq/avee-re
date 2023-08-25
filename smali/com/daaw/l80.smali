.class public Lcom/daaw/l80;
.super Lcom/daaw/kx1;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/qj;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/daaw/kx1;-><init>(Lcom/daaw/qj;)V

    iget-object v0, p1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    invoke-virtual {v0}, Lcom/daaw/sb0;->f()V

    iget-object v0, p1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    invoke-virtual {v0}, Lcom/daaw/ms1;->f()V

    check-cast p1, Lcom/daaw/k80;

    invoke-virtual {p1}, Lcom/daaw/k80;->H0()I

    move-result p1

    iput p1, p0, Lcom/daaw/kx1;->f:I

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/zs;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v0, p1, Lcom/daaw/ft;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ft;

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    check-cast v0, Lcom/daaw/k80;

    const/high16 v1, 0x3f000000    # 0.5f

    iget p1, p1, Lcom/daaw/ft;->g:I

    int-to-float p1, p1

    invoke-virtual {v0}, Lcom/daaw/k80;->K0()F

    move-result v0

    mul-float p1, p1, v0

    add-float/2addr p1, v1

    float-to-int p1, p1

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-virtual {v0, p1}, Lcom/daaw/ft;->d(I)V

    return-void
.end method

.method public d()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    check-cast v0, Lcom/daaw/k80;

    invoke-virtual {v0}, Lcom/daaw/k80;->I0()I

    move-result v1

    invoke-virtual {v0}, Lcom/daaw/k80;->J0()I

    move-result v2

    invoke-virtual {v0}, Lcom/daaw/k80;->K0()F

    invoke-virtual {v0}, Lcom/daaw/k80;->H0()I

    move-result v0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    if-eq v1, v4, :cond_0

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v2, v2, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v2, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    :goto_0
    iput v1, v0, Lcom/daaw/ft;->f:I

    goto :goto_1

    :cond_0
    if-eq v2, v4, :cond_1

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v1, v1, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    neg-int v1, v2

    goto :goto_0

    :cond_1
    iput-boolean v3, v0, Lcom/daaw/ft;->b:Z

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v1, v1, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-virtual {p0, v0}, Lcom/daaw/l80;->q(Lcom/daaw/ft;)V

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    goto :goto_4

    :cond_2
    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    if-eq v1, v4, :cond_3

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v2, v2, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v2, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    :goto_2
    iput v1, v0, Lcom/daaw/ft;->f:I

    goto :goto_3

    :cond_3
    if-eq v2, v4, :cond_4

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v1, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    neg-int v1, v2

    goto :goto_2

    :cond_4
    iput-boolean v3, v0, Lcom/daaw/ft;->b:Z

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v1, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-virtual {p0, v0}, Lcom/daaw/l80;->q(Lcom/daaw/ft;)V

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    :goto_4
    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-virtual {p0, v0}, Lcom/daaw/l80;->q(Lcom/daaw/ft;)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    check-cast v0, Lcom/daaw/k80;

    invoke-virtual {v0}, Lcom/daaw/k80;->H0()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->g:I

    invoke-virtual {v0, v1}, Lcom/daaw/qj;->C0(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->g:I

    invoke-virtual {v0, v1}, Lcom/daaw/qj;->D0(I)V

    :goto_0
    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-virtual {v0}, Lcom/daaw/ft;->c()V

    return-void
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final q(Lcom/daaw/ft;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
