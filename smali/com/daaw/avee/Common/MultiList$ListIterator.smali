.class public Lcom/daaw/avee/Common/MultiList$ListIterator;
.super Ljava/lang/Object;
.source "MultiList.java"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Common/MultiList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ListIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L1:Ljava/lang/Object;",
        "L2:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "T",
        "L1;",
        "T",
        "L2;",
        ">;>;"
    }
.end annotation


# instance fields
.field iterator1:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "T",
            "L1;",
            ">;"
        }
    .end annotation
.end field

.field iterator2:Ljava/util/ListIterator;
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

    .line 329
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 330
    iput-object p1, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    .line 331
    iput-object p2, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    return-void
.end method


# virtual methods
.method public add(Lcom/daaw/avee/Common/Tuple2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)V"
        }
    .end annotation

    .line 388
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 389
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 323
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Common/MultiList$ListIterator;->add(Lcom/daaw/avee/Common/Tuple2;)V

    return-void
.end method

.method public add(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L1;",
            "T",
            "L2;",
            ")V"
        }
    .end annotation

    .line 336
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 337
    iget-object p1, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    invoke-interface {p1, p2}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    return-void
.end method

.method public hasNext()Z
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public next()Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 394
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 323
    invoke-virtual {p0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->next()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    return-object v0
.end method

.method public next1()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()T",
            "L1;"
        }
    .end annotation

    .line 349
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 350
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public next2()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()T",
            "L2;"
        }
    .end annotation

    .line 354
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 355
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public previous()Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 399
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic previous()Ljava/lang/Object;
    .locals 1

    .line 323
    invoke-virtual {p0}, Lcom/daaw/avee/Common/MultiList$ListIterator;->previous()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    return-object v0
.end method

.method public previous1()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()T",
            "L1;"
        }
    .end annotation

    .line 363
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 364
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public previous2()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()T",
            "L2;"
        }
    .end annotation

    .line 368
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 369
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .line 373
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public remove()V
    .locals 1

    .line 377
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 378
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    return-void
.end method

.method public set(Lcom/daaw/avee/Common/Tuple2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)V"
        }
    .end annotation

    .line 404
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 405
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 323
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Common/MultiList$ListIterator;->set(Lcom/daaw/avee/Common/Tuple2;)V

    return-void
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L1;",
            "T",
            "L2;",
            ")V"
        }
    .end annotation

    .line 382
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator1:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 383
    iget-object p1, p0, Lcom/daaw/avee/Common/MultiList$ListIterator;->iterator2:Ljava/util/ListIterator;

    invoke-interface {p1, p2}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method
