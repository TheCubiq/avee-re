.class public Lcom/daaw/p01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ce0;


# instance fields
.field public a:I

.field public b:Lcom/daaw/ce0$a;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/p01;->a:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/p01;->b:Lcom/daaw/ce0$a;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/daaw/p01;->a:I

    return v0
.end method

.method public b(I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    iput v1, p0, Lcom/daaw/p01;->a:I

    :cond_1
    return-void
.end method

.method public c(Ljava/util/List;IIZI)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIZI)Z"
        }
    .end annotation

    iget-object p5, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {p5}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p5}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-interface {p5}, Ljava/util/ListIterator;->nextIndex()I

    move-result v2

    invoke-interface {p5}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4, p1, p2, p3, p4}, Lcom/daaw/l01;->f(ILjava/util/List;IIZ)I

    move-result v4

    if-gez v4, :cond_3

    invoke-interface {p5}, Ljava/util/ListIterator;->remove()V

    iget v4, p0, Lcom/daaw/p01;->a:I

    invoke-static {v4, v2}, Lcom/daaw/l01;->j(II)I

    move-result v4

    if-gez v4, :cond_0

    iput v2, p0, Lcom/daaw/p01;->a:I

    if-gez v2, :cond_1

    iput v0, p0, Lcom/daaw/p01;->a:I

    :cond_1
    iget v1, p0, Lcom/daaw/p01;->a:I

    iget-object v2, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v3

    iput v1, p0, Lcom/daaw/p01;->a:I

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p5, v2}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/daaw/p01;->b:Lcom/daaw/ce0$a;

    if-eqz p1, :cond_5

    invoke-interface {p1, p0, v3, v1}, Lcom/daaw/ce0$a;->a(Lcom/daaw/ce0;ZZ)V

    :cond_5
    return v1
.end method

.method public d(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public e(I)Z
    .locals 2

    iget p1, p0, Lcom/daaw/p01;->a:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/p01;->a:I

    iget-object v1, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    iget-object p1, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/p01;->a:I

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f(II)I
    .locals 0

    if-ltz p1, :cond_1

    iget-object p2, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public g()V
    .locals 1

    iget v0, p0, Lcom/daaw/p01;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/p01;->a:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/p01;->a:I

    :cond_0
    return-void
.end method

.method public h(Z)I
    .locals 1

    iget p1, p0, Lcom/daaw/p01;->a:I

    add-int/lit8 p1, p1, 0x1

    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public i(Z)I
    .locals 1

    iget p1, p0, Lcom/daaw/p01;->a:I

    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    iget v0, p0, Lcom/daaw/p01;->a:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/p01;->a:I

    return-void
.end method

.method public k(IIIZI)Z
    .locals 6

    iget-object p5, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {p5}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p5}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-interface {p5}, Ljava/util/ListIterator;->nextIndex()I

    move-result v2

    invoke-interface {p5}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4, p1, p2, p3, p4}, Lcom/daaw/l01;->h(IIIIZ)I

    move-result v4

    if-gez v4, :cond_3

    invoke-interface {p5}, Ljava/util/ListIterator;->remove()V

    iget v4, p0, Lcom/daaw/p01;->a:I

    const/4 v5, -0x1

    invoke-static {v4, v2, v5}, Lcom/daaw/l01;->g(III)I

    move-result v4

    if-gez v4, :cond_0

    iput v2, p0, Lcom/daaw/p01;->a:I

    if-gez v2, :cond_1

    iput v0, p0, Lcom/daaw/p01;->a:I

    :cond_1
    iget v1, p0, Lcom/daaw/p01;->a:I

    iget-object v2, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v3

    iput v1, p0, Lcom/daaw/p01;->a:I

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p5, v2}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/daaw/p01;->b:Lcom/daaw/ce0$a;

    if-eqz p1, :cond_5

    invoke-interface {p1, p0, v3, v1}, Lcom/daaw/ce0$a;->a(Lcom/daaw/ce0;ZZ)V

    :cond_5
    return v1
.end method

.method public l(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/p01;->a:I

    return-void
.end method

.method public m(ILjava/util/List;Lcom/daaw/ce0$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/daaw/ce0$a;",
            ")V"
        }
    .end annotation

    iput-object p3, p0, Lcom/daaw/p01;->b:Lcom/daaw/ce0$a;

    iput-object p2, p0, Lcom/daaw/p01;->c:Ljava/util/List;

    const/4 p2, 0x0

    iput p2, p0, Lcom/daaw/p01;->a:I

    invoke-virtual {p0, p1}, Lcom/daaw/p01;->b(I)V

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    invoke-interface {p3, p0, p2, p1}, Lcom/daaw/ce0$a;->a(Lcom/daaw/ce0;ZZ)V

    :cond_0
    return-void
.end method
