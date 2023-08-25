.class public Lcom/daaw/er0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/er0$b;,
        Lcom/daaw/er0$c;,
        Lcom/daaw/er0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L1:Ljava/lang/Object;",
        "L2:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/List<",
        "Lcom/daaw/lo1<",
        "T",
        "L1;",
        "T",
        "L2;",
        ">;>;"
    }
.end annotation


# instance fields
.field public p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "T",
            "L1;",
            ">;"
        }
    .end annotation
.end field

.field public q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "T",
            "L2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "T",
            "L1;",
            ">;",
            "Ljava/util/List<",
            "T",
            "L2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    iput-object p2, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    return-void
.end method

.method public static m(Ljava/util/List;Ljava/lang/Object;)Lcom/daaw/er0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L1:Ljava/lang/Object;",
            "L2:Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "T",
            "L1;",
            ">;T",
            "L2;",
            ")",
            "Lcom/daaw/er0<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/er0;

    invoke-direct {p1, p0, v0}, Lcom/daaw/er0;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/daaw/lo1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/er0;->d(ILcom/daaw/lo1;)V

    return-void
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/daaw/lo1;

    invoke-virtual {p0, p1}, Lcom/daaw/er0;->e(Lcom/daaw/lo1;)Z

    move-result p1

    return p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;)Z"
        }
    .end annotation

    instance-of v0, p2, Lcom/daaw/er0;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/daaw/er0;

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    iget-object v1, p2, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    iget-object p2, p2, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v1, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    or-int/2addr p1, v0

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;)Z"
        }
    .end annotation

    instance-of v0, p1, Lcom/daaw/er0;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/er0;

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    iget-object v1, p1, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    iget-object p1, p1, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-result p1

    or-int/2addr p1, v0

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public d(ILcom/daaw/lo1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    iget-object v1, p2, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    iget-object p2, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public e(Lcom/daaw/lo1;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    iget-object v1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L1;",
            "T",
            "L2;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/er0;->n(I)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public h(ILjava/util/Collection;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+T",
            "L1;",
            ">;",
            "Ljava/util/Collection<",
            "+T",
            "L2;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p2

    iget-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v0, p1, p3}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    iget-object p3, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    iget-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p3, v0}, Lcom/daaw/q6;->a(II)V

    or-int/2addr p1, p2

    return p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/er0$b;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/er0$b;-><init>(Ljava/util/Iterator;Ljava/util/Iterator;)V

    return-object v0
.end method

.method public j(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L1;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public k(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L2;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/er0$c;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/er0$c;-><init>(Ljava/util/ListIterator;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/er0$c;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/er0$c;-><init>(Ljava/util/ListIterator;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public n(I)Lcom/daaw/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/lo1;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public o(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)T",
            "L1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public p(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)T",
            "L2;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public q()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "T",
            "L1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public r()Lcom/daaw/er0$c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/er0$c<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/er0$c;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/er0$c;-><init>(Ljava/util/ListIterator;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/er0;->s(I)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public s(I)Lcom/daaw/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/lo1;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lcom/daaw/lo1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/er0;->t(ILcom/daaw/lo1;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/daaw/q6;->a(II)V

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/er0;->u(II)Lcom/daaw/er0;

    move-result-object p1

    return-object p1
.end method

.method public t(ILcom/daaw/lo1;)Lcom/daaw/lo1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Lcom/daaw/lo1;

    iget-object v3, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    array-length v0, p1

    invoke-virtual {p0}, Lcom/daaw/er0;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    new-instance v0, Lcom/daaw/lo1;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    new-instance v0, Lcom/daaw/lo1;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    array-length v0, p1

    invoke-virtual {p0}, Lcom/daaw/er0;->size()I

    move-result v1

    if-le v0, v1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/er0;->size()I

    move-result v0

    const/4 v1, 0x0

    aput-object v1, p1, v0

    :cond_3
    return-object p1
.end method

.method public u(II)Lcom/daaw/er0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/daaw/er0<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/er0;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-interface {v1, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-interface {v2, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/er0;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public v()Lcom/daaw/er0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/er0<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/er0;

    iget-object v1, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/er0;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public w()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "T",
            "L1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->p:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0;->q:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
