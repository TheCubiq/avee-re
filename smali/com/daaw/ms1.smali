.class public Lcom/daaw/ms1;
.super Lcom/daaw/kx1;
.source ""


# instance fields
.field public k:Lcom/daaw/ft;

.field public l:Lcom/daaw/pt;


# direct methods
.method public constructor <init>(Lcom/daaw/qj;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/daaw/kx1;-><init>(Lcom/daaw/qj;)V

    new-instance p1, Lcom/daaw/ft;

    invoke-direct {p1, p0}, Lcom/daaw/ft;-><init>(Lcom/daaw/kx1;)V

    iput-object p1, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ms1;->l:Lcom/daaw/pt;

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    sget-object v1, Lcom/daaw/ft$a;->u:Lcom/daaw/ft$a;

    iput-object v1, v0, Lcom/daaw/ft;->e:Lcom/daaw/ft$a;

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    sget-object v1, Lcom/daaw/ft$a;->v:Lcom/daaw/ft$a;

    iput-object v1, v0, Lcom/daaw/ft;->e:Lcom/daaw/ft$a;

    sget-object v0, Lcom/daaw/ft$a;->w:Lcom/daaw/ft$a;

    iput-object v0, p1, Lcom/daaw/ft;->e:Lcom/daaw/ft$a;

    const/4 p1, 0x1

    iput p1, p0, Lcom/daaw/kx1;->f:I

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/zs;)V
    .locals 6

    sget-object v0, Lcom/daaw/ms1$a;->a:[I

    iget-object v1, p0, Lcom/daaw/kx1;->j:Lcom/daaw/kx1$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    iget-object v0, v0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {p0, p1, v1, v0, v3}, Lcom/daaw/kx1;->n(Lcom/daaw/zs;Lcom/daaw/lj;Lcom/daaw/lj;I)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/kx1;->o(Lcom/daaw/zs;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/kx1;->p(Lcom/daaw/zs;)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, p1, Lcom/daaw/ft;->c:Z

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x0

    if-eqz v0, :cond_7

    iget-boolean p1, p1, Lcom/daaw/ft;->j:Z

    if-nez p1, :cond_7

    iget-object p1, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v0, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne p1, v0, :cond_7

    iget-object p1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v0, p1, Lcom/daaw/qj;->m:I

    if-eq v0, v2, :cond_6

    if-eq v0, v1, :cond_3

    goto :goto_3

    :cond_3
    iget-object v0, p1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcom/daaw/qj;->s()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_5

    if-eqz p1, :cond_4

    if-eq p1, v3, :cond_5

    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, p1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v0, v0, Lcom/daaw/ft;->g:I

    int-to-float v0, v0

    invoke-virtual {p1}, Lcom/daaw/qj;->r()F

    move-result p1

    mul-float v0, v0, p1

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, p1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v0, v0, Lcom/daaw/ft;->g:I

    int-to-float v0, v0

    invoke-virtual {p1}, Lcom/daaw/qj;->r()F

    move-result p1

    div-float/2addr v0, p1

    :goto_1
    add-float/2addr v0, v4

    float-to-int p1, v0

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object p1, p1, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, p1, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v0, v0, Lcom/daaw/qj;->t:F

    iget p1, p1, Lcom/daaw/ft;->g:I

    int-to-float p1, p1

    mul-float p1, p1, v0

    add-float/2addr p1, v4

    float-to-int p1, p1

    :goto_2
    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0, p1}, Lcom/daaw/pt;->d(I)V

    :cond_7
    :goto_3
    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v0, p1, Lcom/daaw/ft;->c:Z

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v1, v0, Lcom/daaw/ft;->c:Z

    if-nez v1, :cond_8

    goto/16 :goto_5

    :cond_8
    iget-boolean p1, p1, Lcom/daaw/ft;->j:Z

    if-eqz p1, :cond_9

    iget-boolean p1, v0, Lcom/daaw/ft;->j:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean p1, p1, Lcom/daaw/ft;->j:Z

    if-eqz p1, :cond_9

    return-void

    :cond_9
    iget-object p1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean p1, p1, Lcom/daaw/ft;->j:Z

    if-nez p1, :cond_a

    iget-object p1, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v0, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne p1, v0, :cond_a

    iget-object p1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v0, p1, Lcom/daaw/qj;->l:I

    if-nez v0, :cond_a

    invoke-virtual {p1}, Lcom/daaw/qj;->V()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object p1, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ft;

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget p1, p1, Lcom/daaw/ft;->g:I

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v2, v1, Lcom/daaw/ft;->f:I

    add-int/2addr p1, v2

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v2, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v2, v2, Lcom/daaw/ft;->f:I

    add-int/2addr v0, v2

    sub-int v2, v0, p1

    invoke-virtual {v1, p1}, Lcom/daaw/ft;->d(I)V

    iget-object p1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-virtual {p1, v0}, Lcom/daaw/ft;->d(I)V

    iget-object p1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {p1, v2}, Lcom/daaw/pt;->d(I)V

    return-void

    :cond_a
    iget-object p1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean p1, p1, Lcom/daaw/ft;->j:Z

    if-nez p1, :cond_c

    iget-object p1, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v0, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne p1, v0, :cond_c

    iget p1, p0, Lcom/daaw/kx1;->a:I

    if-ne p1, v3, :cond_c

    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object p1, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_c

    iget-object p1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object p1, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_c

    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object p1, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ft;

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget p1, p1, Lcom/daaw/ft;->g:I

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->f:I

    add-int/2addr p1, v1

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->f:I

    add-int/2addr v0, v1

    sub-int/2addr v0, p1

    iget-object p1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v1, p1, Lcom/daaw/pt;->m:I

    if-ge v0, v1, :cond_b

    invoke-virtual {p1, v0}, Lcom/daaw/pt;->d(I)V

    goto :goto_4

    :cond_b
    invoke-virtual {p1, v1}, Lcom/daaw/pt;->d(I)V

    :cond_c
    :goto_4
    iget-object p1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean p1, p1, Lcom/daaw/ft;->j:Z

    if-nez p1, :cond_d

    return-void

    :cond_d
    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object p1, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_f

    iget-object p1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object p1, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_f

    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object p1, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ft;

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget v1, p1, Lcom/daaw/ft;->g:I

    iget-object v2, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v2, v2, Lcom/daaw/ft;->f:I

    add-int/2addr v1, v2

    iget v2, v0, Lcom/daaw/ft;->g:I

    iget-object v3, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v3, v3, Lcom/daaw/ft;->f:I

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v3}, Lcom/daaw/qj;->I()F

    move-result v3

    if-ne p1, v0, :cond_e

    iget v1, p1, Lcom/daaw/ft;->g:I

    iget v2, v0, Lcom/daaw/ft;->g:I

    const/high16 v3, 0x3f000000    # 0.5f

    :cond_e
    sub-int/2addr v2, v1

    iget-object p1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget p1, p1, Lcom/daaw/ft;->g:I

    sub-int/2addr v2, p1

    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    int-to-float v0, v1

    add-float/2addr v0, v4

    int-to-float v1, v2

    mul-float v1, v1, v3

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Lcom/daaw/ft;->d(I)V

    iget-object p1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v1, v1, Lcom/daaw/ft;->g:I

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lcom/daaw/ft;->d(I)V

    :cond_f
    :goto_5
    return-void
.end method

.method public d()V
    .locals 9

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-boolean v1, v0, Lcom/daaw/qj;->a:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0}, Lcom/daaw/qj;->t()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/daaw/pt;->d(I)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->K()Lcom/daaw/qj$b;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->Q()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/daaw/fb;

    invoke-direct {v0, p0}, Lcom/daaw/fb;-><init>(Lcom/daaw/kx1;)V

    iput-object v0, p0, Lcom/daaw/ms1;->l:Lcom/daaw/pt;

    :cond_1
    iget-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-eq v0, v1, :cond_4

    sget-object v1, Lcom/daaw/qj$b;->s:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/daaw/qj;->K()Lcom/daaw/qj$b;

    move-result-object v1

    sget-object v2, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Lcom/daaw/qj;->t()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v3, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v3, v3, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v4, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v4, v4, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {v4}, Lcom/daaw/lj;->b()I

    move-result v4

    invoke-virtual {p0, v2, v3, v4}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v2, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v3, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v3, v3, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v3}, Lcom/daaw/lj;->b()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {p0, v2, v0, v3}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v1}, Lcom/daaw/qj;->t()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/pt;->d(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->s:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/daaw/qj;->K()Lcom/daaw/qj$b;

    move-result-object v1

    sget-object v2, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v2, v2, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v3, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v3, v3, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {v3}, Lcom/daaw/lj;->b()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    return-void

    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v1, v0, Lcom/daaw/ft;->j:Z

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x3

    if-eqz v1, :cond_d

    iget-object v7, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-boolean v8, v7, Lcom/daaw/qj;->a:Z

    if-eqz v8, :cond_d

    iget-object v0, v7, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v0, v5

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_8

    aget-object v1, v0, v6

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_8

    invoke-virtual {v7}, Lcom/daaw/qj;->V()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v5

    invoke-virtual {v1}, Lcom/daaw/lj;->b()I

    move-result v1

    iput v1, v0, Lcom/daaw/ft;->f:I

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Lcom/daaw/lj;->b()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Lcom/daaw/ft;->f:I

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v2, v5

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    :cond_6
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v0, v0, v6

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v2, v6

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    :cond_7
    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iput-boolean v4, v0, Lcom/daaw/ft;->b:Z

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iput-boolean v4, v0, Lcom/daaw/ft;->b:Z

    :goto_1
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->Q()Z

    move-result v0

    if-eqz v0, :cond_1c

    :goto_2
    iget-object v0, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v2}, Lcom/daaw/qj;->l()I

    move-result v2

    :goto_3
    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    goto/16 :goto_b

    :cond_8
    aget-object v1, v0, v5

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_9

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v2, v5

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v2, v2, Lcom/daaw/ft;->g:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->Q()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_2

    :cond_9
    aget-object v1, v0, v6

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_b

    aget-object v0, v0, v6

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v2, v6

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v2, v2, Lcom/daaw/ft;->g:I

    neg-int v2, v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    :cond_a
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->Q()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_2

    :cond_b
    aget-object v1, v0, v3

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_c

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v1, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v2}, Lcom/daaw/qj;->l()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v2, v2, Lcom/daaw/ft;->g:I

    goto/16 :goto_3

    :cond_c
    instance-of v0, v7, Lcom/daaw/za0;

    if-nez v0, :cond_1c

    invoke-virtual {v7}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    sget-object v1, Lcom/daaw/lj$b;->v:Lcom/daaw/lj$b;

    invoke-virtual {v0, v1}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-nez v0, :cond_1c

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v2}, Lcom/daaw/qj;->P()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v2, v2, Lcom/daaw/ft;->g:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->Q()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto/16 :goto_2

    :cond_d
    if-nez v1, :cond_12

    iget-object v1, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v7, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v1, v7, :cond_12

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v1, v0, Lcom/daaw/qj;->m:I

    if-eq v1, v5, :cond_10

    if-eq v1, v6, :cond_e

    goto :goto_5

    :cond_e
    invoke-virtual {v0}, Lcom/daaw/qj;->V()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v1, v0, Lcom/daaw/qj;->l:I

    if-ne v1, v6, :cond_f

    goto :goto_5

    :cond_f
    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    goto :goto_4

    :cond_10
    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_5

    :cond_11
    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    :goto_4
    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v1, v1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iput-boolean v4, v0, Lcom/daaw/ft;->b:Z

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_12
    invoke-virtual {v0, p0}, Lcom/daaw/ft;->b(Lcom/daaw/zs;)V

    :cond_13
    :goto_5
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v7, v1, v5

    iget-object v7, v7, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v7, :cond_15

    aget-object v7, v1, v6

    iget-object v7, v7, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v7, :cond_15

    invoke-virtual {v0}, Lcom/daaw/qj;->V()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v5

    invoke-virtual {v1}, Lcom/daaw/lj;->b()I

    move-result v1

    iput v1, v0, Lcom/daaw/ft;->f:I

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Lcom/daaw/lj;->b()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Lcom/daaw/ft;->f:I

    goto :goto_6

    :cond_14
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v6

    invoke-virtual {p0, v1}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v1

    invoke-virtual {v0, p0}, Lcom/daaw/ft;->b(Lcom/daaw/zs;)V

    invoke-virtual {v1, p0}, Lcom/daaw/ft;->b(Lcom/daaw/zs;)V

    sget-object v0, Lcom/daaw/kx1$b;->s:Lcom/daaw/kx1$b;

    iput-object v0, p0, Lcom/daaw/kx1;->j:Lcom/daaw/kx1$b;

    :goto_6
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->Q()Z

    move-result v0

    if-eqz v0, :cond_1b

    :goto_7
    iget-object v0, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/ms1;->l:Lcom/daaw/pt;

    :goto_8
    invoke-virtual {p0, v0, v1, v4, v2}, Lcom/daaw/kx1;->c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V

    goto/16 :goto_a

    :cond_15
    aget-object v7, v1, v5

    iget-object v7, v7, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    const/4 v8, 0x0

    if-eqz v7, :cond_17

    aget-object v0, v1, v5

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v2, v5

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {p0, v0, v1, v4, v2}, Lcom/daaw/kx1;->c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->Q()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/ms1;->l:Lcom/daaw/pt;

    invoke-virtual {p0, v0, v1, v4, v2}, Lcom/daaw/kx1;->c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V

    :cond_16
    iget-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_1b

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->r()F

    move-result v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_1b

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v2, v0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    if-ne v2, v1, :cond_1b

    goto/16 :goto_9

    :cond_17
    aget-object v5, v1, v6

    iget-object v5, v5, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    const/4 v7, -0x1

    if-eqz v5, :cond_18

    aget-object v0, v1, v6

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v2, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v2, v2, v6

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {p0, v0, v1, v7, v2}, Lcom/daaw/kx1;->c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->Q()Z

    move-result v0

    if-eqz v0, :cond_1b

    goto/16 :goto_7

    :cond_18
    aget-object v5, v1, v3

    iget-object v5, v5, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v5, :cond_19

    aget-object v0, v1, v3

    invoke-virtual {p0, v0}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object v1, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/ms1;->l:Lcom/daaw/pt;

    invoke-virtual {p0, v0, v1, v7, v2}, Lcom/daaw/kx1;->c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    goto/16 :goto_8

    :cond_19
    instance-of v1, v0, Lcom/daaw/za0;

    if-nez v1, :cond_1b

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v2}, Lcom/daaw/qj;->P()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/kx1;->b(Lcom/daaw/ft;Lcom/daaw/ft;I)V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {p0, v0, v1, v4, v2}, Lcom/daaw/kx1;->c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->Q()Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-object v2, p0, Lcom/daaw/ms1;->l:Lcom/daaw/pt;

    invoke-virtual {p0, v0, v1, v4, v2}, Lcom/daaw/kx1;->c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V

    :cond_1a
    iget-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_1b

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->r()F

    move-result v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_1b

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v2, v0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    if-ne v2, v1, :cond_1b

    :goto_9
    iget-object v0, v0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v1, v1, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iput-object p0, v0, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    :cond_1b
    :goto_a
    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-object v0, v0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1c

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iput-boolean v4, v0, Lcom/daaw/ft;->c:Z

    :cond_1c
    :goto_b
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v1, v0, Lcom/daaw/ft;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v0, v0, Lcom/daaw/ft;->g:I

    invoke-virtual {v1, v0}, Lcom/daaw/qj;->D0(I)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/kx1;->c:Lcom/daaw/l61;

    iget-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-virtual {v0}, Lcom/daaw/ft;->c()V

    iget-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-virtual {v0}, Lcom/daaw/ft;->c()V

    iget-object v0, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    invoke-virtual {v0}, Lcom/daaw/ft;->c()V

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {v0}, Lcom/daaw/ft;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/kx1;->g:Z

    return-void
.end method

.method public m()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v1, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v0, v0, Lcom/daaw/qj;->m:I

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method public q()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/kx1;->g:Z

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-virtual {v1}, Lcom/daaw/ft;->c()V

    iget-object v1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iput-boolean v0, v1, Lcom/daaw/ft;->j:Z

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    invoke-virtual {v1}, Lcom/daaw/ft;->c()V

    iget-object v1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iput-boolean v0, v1, Lcom/daaw/ft;->j:Z

    iget-object v1, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    invoke-virtual {v1}, Lcom/daaw/ft;->c()V

    iget-object v1, p0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    iput-boolean v0, v1, Lcom/daaw/ft;->j:Z

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iput-boolean v0, v1, Lcom/daaw/ft;->j:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VerticalRun "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v1}, Lcom/daaw/qj;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
