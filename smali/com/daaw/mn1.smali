.class public Lcom/daaw/mn1;
.super Lcom/daaw/in1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/mn1$b;
    }
.end annotation


# instance fields
.field public Y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/in1;",
            ">;"
        }
    .end annotation
.end field

.field public Z:Z

.field public a0:I

.field public b0:Z

.field public c0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/in1;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/mn1;->Z:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/mn1;->b0:Z

    iput v0, p0, Lcom/daaw/mn1;->c0:I

    return-void
.end method


# virtual methods
.method public R(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/in1;->R(Landroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/in1;

    invoke-virtual {v2, p1}, Lcom/daaw/in1;->R(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic T(Lcom/daaw/in1$f;)Lcom/daaw/in1;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/mn1;->m0(Lcom/daaw/in1$f;)Lcom/daaw/mn1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic U(Landroid/view/View;)Lcom/daaw/in1;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/mn1;->n0(Landroid/view/View;)Lcom/daaw/mn1;

    move-result-object p1

    return-object p1
.end method

.method public V(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/in1;->V(Landroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/in1;

    invoke-virtual {v2, p1}, Lcom/daaw/in1;->V(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public X()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/in1;->e0()V

    invoke-virtual {p0}, Lcom/daaw/in1;->t()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/mn1;->s0()V

    iget-boolean v0, p0, Lcom/daaw/mn1;->Z:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/in1;

    iget-object v2, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/in1;

    new-instance v3, Lcom/daaw/mn1$a;

    invoke-direct {v3, p0, v2}, Lcom/daaw/mn1$a;-><init>(Lcom/daaw/mn1;Lcom/daaw/in1;)V

    invoke-virtual {v1, v3}, Lcom/daaw/in1;->a(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/in1;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/daaw/in1;->X()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/in1;

    invoke-virtual {v1}, Lcom/daaw/in1;->X()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public bridge synthetic Y(J)Lcom/daaw/in1;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/mn1;->o0(J)Lcom/daaw/mn1;

    move-result-object p1

    return-object p1
.end method

.method public Z(Lcom/daaw/in1$e;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/in1;->Z(Lcom/daaw/in1$e;)V

    iget v0, p0, Lcom/daaw/mn1;->c0:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/daaw/mn1;->c0:I

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/in1;

    invoke-virtual {v2, p1}, Lcom/daaw/in1;->Z(Lcom/daaw/in1$e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic a(Lcom/daaw/in1$f;)Lcom/daaw/in1;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/mn1;->g0(Lcom/daaw/in1$f;)Lcom/daaw/mn1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a0(Landroid/animation/TimeInterpolator;)Lcom/daaw/in1;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/mn1;->p0(Landroid/animation/TimeInterpolator;)Lcom/daaw/mn1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Landroid/view/View;)Lcom/daaw/in1;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/mn1;->h0(Landroid/view/View;)Lcom/daaw/mn1;

    move-result-object p1

    return-object p1
.end method

.method public b0(Lcom/daaw/aw0;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/in1;->b0(Lcom/daaw/aw0;)V

    iget v0, p0, Lcom/daaw/mn1;->c0:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/daaw/mn1;->c0:I

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/in1;

    invoke-virtual {v1, p1}, Lcom/daaw/in1;->b0(Lcom/daaw/aw0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c0(Lcom/daaw/ln1;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/in1;->c0(Lcom/daaw/ln1;)V

    iget v0, p0, Lcom/daaw/mn1;->c0:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/mn1;->c0:I

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/in1;

    invoke-virtual {v2, p1}, Lcom/daaw/in1;->c0(Lcom/daaw/ln1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/mn1;->p()Lcom/daaw/in1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d0(J)Lcom/daaw/in1;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/mn1;->r0(J)Lcom/daaw/mn1;

    move-result-object p1

    return-object p1
.end method

.method public f0(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-super {p0, p1}, Lcom/daaw/in1;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/in1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/daaw/in1;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public g0(Lcom/daaw/in1$f;)Lcom/daaw/mn1;
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/in1;->a(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    move-result-object p1

    check-cast p1, Lcom/daaw/mn1;

    return-object p1
.end method

.method public h0(Landroid/view/View;)Lcom/daaw/mn1;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/in1;

    invoke-virtual {v1, p1}, Lcom/daaw/in1;->b(Landroid/view/View;)Lcom/daaw/in1;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/in1;->b(Landroid/view/View;)Lcom/daaw/in1;

    move-result-object p1

    check-cast p1, Lcom/daaw/mn1;

    return-object p1
.end method

.method public i(Lcom/daaw/on1;)V
    .locals 3

    iget-object v0, p1, Lcom/daaw/on1;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/in1;

    iget-object v2, p1, Lcom/daaw/on1;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Lcom/daaw/in1;->i(Lcom/daaw/on1;)V

    iget-object v2, p1, Lcom/daaw/on1;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i0(Lcom/daaw/in1;)Lcom/daaw/mn1;
    .locals 5

    invoke-virtual {p0, p1}, Lcom/daaw/mn1;->j0(Lcom/daaw/in1;)V

    iget-wide v0, p0, Lcom/daaw/in1;->r:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/in1;->Y(J)Lcom/daaw/in1;

    :cond_0
    iget v0, p0, Lcom/daaw/mn1;->c0:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/in1;->w()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/in1;->a0(Landroid/animation/TimeInterpolator;)Lcom/daaw/in1;

    :cond_1
    iget v0, p0, Lcom/daaw/mn1;->c0:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/in1;->A()Lcom/daaw/ln1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/in1;->c0(Lcom/daaw/ln1;)V

    :cond_2
    iget v0, p0, Lcom/daaw/mn1;->c0:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/daaw/in1;->z()Lcom/daaw/aw0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/in1;->b0(Lcom/daaw/aw0;)V

    :cond_3
    iget v0, p0, Lcom/daaw/mn1;->c0:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/daaw/in1;->v()Lcom/daaw/in1$e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/in1;->Z(Lcom/daaw/in1$e;)V

    :cond_4
    return-object p0
.end method

.method public final j0(Lcom/daaw/in1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, p1, Lcom/daaw/in1;->G:Lcom/daaw/mn1;

    return-void
.end method

.method public k(Lcom/daaw/on1;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/in1;->k(Lcom/daaw/on1;)V

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/in1;

    invoke-virtual {v2, p1}, Lcom/daaw/in1;->k(Lcom/daaw/on1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k0(I)Lcom/daaw/in1;
    .locals 1

    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/in1;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public l0()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public m(Lcom/daaw/on1;)V
    .locals 3

    iget-object v0, p1, Lcom/daaw/on1;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/in1;

    iget-object v2, p1, Lcom/daaw/on1;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Lcom/daaw/in1;->m(Lcom/daaw/on1;)V

    iget-object v2, p1, Lcom/daaw/on1;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public m0(Lcom/daaw/in1$f;)Lcom/daaw/mn1;
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/in1;->T(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    move-result-object p1

    check-cast p1, Lcom/daaw/mn1;

    return-object p1
.end method

.method public n0(Landroid/view/View;)Lcom/daaw/mn1;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/in1;

    invoke-virtual {v1, p1}, Lcom/daaw/in1;->U(Landroid/view/View;)Lcom/daaw/in1;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/in1;->U(Landroid/view/View;)Lcom/daaw/in1;

    move-result-object p1

    check-cast p1, Lcom/daaw/mn1;

    return-object p1
.end method

.method public o0(J)Lcom/daaw/mn1;
    .locals 5

    invoke-super {p0, p1, p2}, Lcom/daaw/in1;->Y(J)Lcom/daaw/in1;

    iget-wide v0, p0, Lcom/daaw/in1;->r:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/in1;

    invoke-virtual {v2, p1, p2}, Lcom/daaw/in1;->Y(J)Lcom/daaw/in1;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public p()Lcom/daaw/in1;
    .locals 4

    invoke-super {p0}, Lcom/daaw/in1;->p()Lcom/daaw/in1;

    move-result-object v0

    check-cast v0, Lcom/daaw/mn1;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/in1;

    invoke-virtual {v3}, Lcom/daaw/in1;->p()Lcom/daaw/in1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/daaw/mn1;->j0(Lcom/daaw/in1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public p0(Landroid/animation/TimeInterpolator;)Lcom/daaw/mn1;
    .locals 3

    iget v0, p0, Lcom/daaw/mn1;->c0:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/mn1;->c0:I

    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/in1;

    invoke-virtual {v2, p1}, Lcom/daaw/in1;->a0(Landroid/animation/TimeInterpolator;)Lcom/daaw/in1;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/in1;->a0(Landroid/animation/TimeInterpolator;)Lcom/daaw/in1;

    move-result-object p1

    check-cast p1, Lcom/daaw/mn1;

    return-object p1
.end method

.method public q0(I)Lcom/daaw/mn1;
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/mn1;->Z:Z

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid parameter for TransitionSet ordering: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-boolean v0, p0, Lcom/daaw/mn1;->Z:Z

    :goto_0
    return-object p0
.end method

.method public r0(J)Lcom/daaw/mn1;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/in1;->d0(J)Lcom/daaw/in1;

    move-result-object p1

    check-cast p1, Lcom/daaw/mn1;

    return-object p1
.end method

.method public s(Landroid/view/ViewGroup;Lcom/daaw/pn1;Lcom/daaw/pn1;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lcom/daaw/pn1;",
            "Lcom/daaw/pn1;",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/on1;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/on1;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    invoke-virtual {p0}, Lcom/daaw/in1;->C()J

    move-result-wide v1

    iget-object v3, v0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    iget-object v5, v0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/daaw/in1;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2

    iget-boolean v5, v0, Lcom/daaw/mn1;->Z:Z

    if-nez v5, :cond_0

    if-nez v4, :cond_2

    :cond_0
    invoke-virtual {v6}, Lcom/daaw/in1;->C()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_1

    add-long/2addr v9, v1

    invoke-virtual {v6, v9, v10}, Lcom/daaw/in1;->d0(J)Lcom/daaw/in1;

    goto :goto_1

    :cond_1
    invoke-virtual {v6, v1, v2}, Lcom/daaw/in1;->d0(J)Lcom/daaw/in1;

    :cond_2
    :goto_1
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/in1;->s(Landroid/view/ViewGroup;Lcom/daaw/pn1;Lcom/daaw/pn1;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final s0()V
    .locals 3

    new-instance v0, Lcom/daaw/mn1$b;

    invoke-direct {v0, p0}, Lcom/daaw/mn1$b;-><init>(Lcom/daaw/mn1;)V

    iget-object v1, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/in1;

    invoke-virtual {v2, v0}, Lcom/daaw/in1;->a(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/mn1;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/daaw/mn1;->a0:I

    return-void
.end method
