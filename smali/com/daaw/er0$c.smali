.class public Lcom/daaw/er0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/er0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L1:Ljava/lang/Object;",
        "L2:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator<",
        "Lcom/daaw/lo1<",
        "T",
        "L1;",
        "T",
        "L2;",
        ">;>;"
    }
.end annotation


# instance fields
.field public p:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "T",
            "L1;",
            ">;"
        }
    .end annotation
.end field

.field public q:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "T",
            "L2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ListIterator;Ljava/util/ListIterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ListIterator<",
            "T",
            "L1;",
            ">;",
            "Ljava/util/ListIterator<",
            "T",
            "L2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    iput-object p2, p0, Lcom/daaw/er0$c;->q:Ljava/util/ListIterator;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/lo1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    iget-object v1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/er0$c;->q:Ljava/util/ListIterator;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/lo1;

    invoke-virtual {p0, p1}, Lcom/daaw/er0$c;->a(Lcom/daaw/lo1;)V

    return-void
.end method

.method public b()Lcom/daaw/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/lo1;

    iget-object v1, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0$c;->q:Ljava/util/ListIterator;

    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public c()Lcom/daaw/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/lo1;

    iget-object v1, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/er0$c;->q:Ljava/util/ListIterator;

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public d(Lcom/daaw/lo1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lo1<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    iget-object v1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/er0$c;->q:Ljava/util/ListIterator;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/er0$c;->b()Lcom/daaw/lo1;

    move-result-object v0

    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public bridge synthetic previous()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/er0$c;->c()Lcom/daaw/lo1;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/er0$c;->p:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    iget-object v0, p0, Lcom/daaw/er0$c;->q:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    return-void
.end method

.method public bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/lo1;

    invoke-virtual {p0, p1}, Lcom/daaw/er0$c;->d(Lcom/daaw/lo1;)V

    return-void
.end method
