.class public abstract Lcom/daaw/kx1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zs;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/kx1$b;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/daaw/qj;

.field public c:Lcom/daaw/l61;

.field public d:Lcom/daaw/qj$b;

.field public e:Lcom/daaw/pt;

.field public f:I

.field public g:Z

.field public h:Lcom/daaw/ft;

.field public i:Lcom/daaw/ft;

.field public j:Lcom/daaw/kx1$b;


# direct methods
.method public constructor <init>(Lcom/daaw/qj;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/pt;

    invoke-direct {v0, p0}, Lcom/daaw/pt;-><init>(Lcom/daaw/kx1;)V

    iput-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/kx1;->f:I

    iput-boolean v0, p0, Lcom/daaw/kx1;->g:Z

    new-instance v0, Lcom/daaw/ft;

    invoke-direct {v0, p0}, Lcom/daaw/ft;-><init>(Lcom/daaw/kx1;)V

    iput-object v0, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    new-instance v0, Lcom/daaw/ft;

    invoke-direct {v0, p0}, Lcom/daaw/ft;-><init>(Lcom/daaw/kx1;)V

    iput-object v0, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    sget-object v0, Lcom/daaw/kx1$b;->p:Lcom/daaw/kx1$b;

    iput-object v0, p0, Lcom/daaw/kx1;->j:Lcom/daaw/kx1$b;

    iput-object p1, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/zs;)V
    .locals 0

    return-void
.end method

.method public final b(Lcom/daaw/ft;Lcom/daaw/ft;I)V
    .locals 1

    iget-object v0, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Lcom/daaw/ft;->f:I

    iget-object p2, p2, Lcom/daaw/ft;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lcom/daaw/ft;Lcom/daaw/ft;ILcom/daaw/pt;)V
    .locals 2

    iget-object v0, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lcom/daaw/ft;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Lcom/daaw/ft;->h:I

    iput-object p4, p1, Lcom/daaw/ft;->i:Lcom/daaw/pt;

    iget-object p2, p2, Lcom/daaw/ft;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p4, Lcom/daaw/ft;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public final g(II)I
    .locals 1

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v0, p2, Lcom/daaw/qj;->p:I

    iget p2, p2, Lcom/daaw/qj;->o:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget v0, p2, Lcom/daaw/qj;->s:I

    iget p2, p2, Lcom/daaw/qj;->r:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    :goto_0
    move p1, p2

    :cond_3
    return p1
.end method

.method public final h(Lcom/daaw/lj;)Lcom/daaw/ft;
    .locals 3

    iget-object p1, p1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    iget-object p1, p1, Lcom/daaw/lj;->c:Lcom/daaw/lj$b;

    sget-object v2, Lcom/daaw/kx1$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object p1, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    goto :goto_0

    :cond_2
    iget-object p1, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, p1, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    goto :goto_2

    :cond_3
    iget-object p1, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    goto :goto_1

    :cond_4
    iget-object p1, v1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    :goto_0
    iget-object v0, p1, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    goto :goto_2

    :cond_5
    iget-object p1, v1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    :goto_1
    iget-object v0, p1, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    :goto_2
    return-object v0
.end method

.method public final i(Lcom/daaw/lj;I)Lcom/daaw/ft;
    .locals 2

    iget-object p1, p1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    if-nez p2, :cond_1

    iget-object p2, v1, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    goto :goto_0

    :cond_1
    iget-object p2, v1, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    :goto_0
    iget-object p1, p1, Lcom/daaw/lj;->c:Lcom/daaw/lj$b;

    sget-object v1, Lcom/daaw/kx1$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p2, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    goto :goto_1

    :cond_3
    iget-object v0, p2, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    :goto_1
    return-object v0
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v1, v0, Lcom/daaw/ft;->j:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lcom/daaw/ft;->g:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/kx1;->g:Z

    return v0
.end method

.method public final l(II)V
    .locals 7

    iget v0, p0, Lcom/daaw/kx1;->a:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    iget-object v3, v0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v4, v3, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v5, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v4, v5, :cond_1

    iget v4, v3, Lcom/daaw/kx1;->a:I

    if-ne v4, p2, :cond_1

    iget-object v4, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v6, v4, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    if-ne v6, v5, :cond_1

    iget v4, v4, Lcom/daaw/kx1;->a:I

    if-ne v4, p2, :cond_1

    goto :goto_5

    :cond_1
    if-nez p1, :cond_2

    iget-object v3, v0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    :cond_2
    iget-object p2, v3, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean p2, p2, Lcom/daaw/ft;->j:Z

    if-eqz p2, :cond_9

    invoke-virtual {v0}, Lcom/daaw/qj;->r()F

    move-result p2

    if-ne p1, v1, :cond_3

    iget-object p1, v3, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget p1, p1, Lcom/daaw/ft;->g:I

    int-to-float p1, p1

    div-float/2addr p1, p2

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    :cond_3
    iget-object p1, v3, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget p1, p1, Lcom/daaw/ft;->g:I

    int-to-float p1, p1

    mul-float p2, p2, p1

    add-float/2addr p2, v2

    float-to-int p1, p2

    :goto_0
    iget-object p2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {p2, p1}, Lcom/daaw/pt;->d(I)V

    goto :goto_5

    :cond_4
    iget-object p2, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {p2}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    iget-object p2, p2, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    goto :goto_1

    :cond_5
    iget-object p2, p2, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    :goto_1
    iget-object p2, p2, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v0, p2, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    if-nez p1, :cond_6

    iget v0, v0, Lcom/daaw/qj;->q:F

    goto :goto_2

    :cond_6
    iget v0, v0, Lcom/daaw/qj;->t:F

    :goto_2
    iget p2, p2, Lcom/daaw/ft;->g:I

    int-to-float p2, p2

    mul-float p2, p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget v0, v0, Lcom/daaw/pt;->m:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/kx1;->g(II)I

    move-result p1

    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_4

    :cond_8
    :goto_3
    iget-object v0, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    invoke-virtual {p0, p2, p1}, Lcom/daaw/kx1;->g(II)I

    move-result p1

    :goto_4
    invoke-virtual {v0, p1}, Lcom/daaw/pt;->d(I)V

    :cond_9
    :goto_5
    return-void
.end method

.method public abstract m()Z
.end method

.method public n(Lcom/daaw/zs;Lcom/daaw/lj;Lcom/daaw/lj;I)V
    .locals 4

    invoke-virtual {p0, p2}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object p1

    invoke-virtual {p0, p3}, Lcom/daaw/kx1;->h(Lcom/daaw/lj;)Lcom/daaw/ft;

    move-result-object v0

    iget-boolean v1, p1, Lcom/daaw/ft;->j:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Lcom/daaw/ft;->j:Z

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    iget v1, p1, Lcom/daaw/ft;->g:I

    invoke-virtual {p2}, Lcom/daaw/lj;->b()I

    move-result p2

    add-int/2addr v1, p2

    iget p2, v0, Lcom/daaw/ft;->g:I

    invoke-virtual {p3}, Lcom/daaw/lj;->b()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v2, v2, Lcom/daaw/ft;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/kx1;->d:Lcom/daaw/qj$b;

    sget-object v3, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, p4, p3}, Lcom/daaw/kx1;->l(II)V

    :cond_1
    iget-object v2, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget-boolean v3, v2, Lcom/daaw/ft;->j:Z

    if-nez v3, :cond_2

    return-void

    :cond_2
    iget v2, v2, Lcom/daaw/ft;->g:I

    if-ne v2, p3, :cond_3

    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    invoke-virtual {p1, v1}, Lcom/daaw/ft;->d(I)V

    iget-object p1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/daaw/ft;->d(I)V

    return-void

    :cond_3
    iget-object p3, p0, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    if-nez p4, :cond_4

    invoke-virtual {p3}, Lcom/daaw/qj;->u()F

    move-result p3

    goto :goto_1

    :cond_4
    invoke-virtual {p3}, Lcom/daaw/qj;->I()F

    move-result p3

    :goto_1
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    iget v1, p1, Lcom/daaw/ft;->g:I

    iget p2, v0, Lcom/daaw/ft;->g:I

    const/high16 p3, 0x3f000000    # 0.5f

    :cond_5
    sub-int/2addr p2, v1

    iget-object p1, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget p1, p1, Lcom/daaw/ft;->g:I

    sub-int/2addr p2, p1

    iget-object p1, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float p2, p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, Lcom/daaw/ft;->d(I)V

    iget-object p1, p0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-object p2, p0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget p2, p2, Lcom/daaw/ft;->g:I

    iget-object p3, p0, Lcom/daaw/kx1;->e:Lcom/daaw/pt;

    iget p3, p3, Lcom/daaw/ft;->g:I

    add-int/2addr p2, p3

    goto :goto_0

    :cond_6
    :goto_2
    return-void
.end method

.method public o(Lcom/daaw/zs;)V
    .locals 0

    return-void
.end method

.method public p(Lcom/daaw/zs;)V
    .locals 0

    return-void
.end method
