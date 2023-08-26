.class public Lcom/daaw/avee/Common/MultiList;
.super Ljava/lang/Object;
.source "MultiList.java"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Common/MultiList$Iterator;,
        Lcom/daaw/avee/Common/MultiList$ListIterator;,
        Lcom/daaw/avee/Common/MultiList$Factory;
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
        "Lcom/daaw/avee/Common/Tuple2<",
        "T",
        "L1;",
        "T",
        "L2;",
        ">;>;"
    }
.end annotation


# instance fields
.field private list1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "T",
            "L1;",
            ">;"
        }
    .end annotation
.end field

.field private list2:Ljava/util/List;
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

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

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

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    .line 51
    iput-object p2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    return-void
.end method

.method public static fromList1FillWith2(Ljava/util/List;Ljava/lang/Object;)Lcom/daaw/avee/Common/MultiList;
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
            "Lcom/daaw/avee/Common/MultiList<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 56
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 57
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 59
    :cond_0
    new-instance p1, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {p1, p0, v0}, Lcom/daaw/avee/Common/MultiList;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method public static fromList2FillWith1(Ljava/util/List;Ljava/lang/Object;)Lcom/daaw/avee/Common/MultiList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L1:Ljava/lang/Object;",
            "L2:Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "T",
            "L2;",
            ">;T",
            "L1;",
            ")",
            "Lcom/daaw/avee/Common/MultiList<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 64
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 65
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 67
    :cond_0
    new-instance p1, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {p1, v0, p0}, Lcom/daaw/avee/Common/MultiList;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method


# virtual methods
.method public CreateClone()Lcom/daaw/avee/Common/MultiList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/MultiList<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 76
    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 78
    new-instance v2, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v2, v0, v1}, Lcom/daaw/avee/Common/MultiList;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public add(ILcom/daaw/avee/Common/Tuple2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)V"
        }
    .end annotation

    .line 178
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    iget-object v1, p2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .line 18
    check-cast p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Common/MultiList;->add(ILcom/daaw/avee/Common/Tuple2;)V

    return-void
.end method

.method public add(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IT",
            "L1;",
            "T",
            "L2;",
            ")V"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 83
    iget-object p2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {p2, p1, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public add(Lcom/daaw/avee/Common/Tuple2;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)Z"
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 18
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Common/MultiList;->add(Lcom/daaw/avee/Common/Tuple2;)Z

    move-result p1

    return p1
.end method

.method public add(Ljava/lang/Object;Ljava/lang/Object;)Z
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

    .line 87
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    iget-object p1, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;)Z"
        }
    .end annotation

    .line 192
    instance-of v0, p2, Lcom/daaw/avee/Common/MultiList;

    if-eqz v0, :cond_0

    .line 194
    check-cast p2, Lcom/daaw/avee/Common/MultiList;

    .line 195
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    iget-object v1, p2, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result v0

    .line 196
    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    iget-object p2, p2, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v1, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    or-int/2addr p1, v0

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public addAll(ILjava/util/Collection;Ljava/util/Collection;)Z
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

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p2

    .line 95
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v0, p1, p3}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    .line 97
    iget-object p3, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p3, v0}, Ljunit/framework/Assert;->assertEquals(II)V

    or-int/2addr p1, p2

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;)Z"
        }
    .end annotation

    .line 205
    instance-of v0, p1, Lcom/daaw/avee/Common/MultiList;

    if-eqz v0, :cond_0

    .line 207
    check-cast p1, Lcom/daaw/avee/Common/MultiList;

    .line 208
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    iget-object v1, p1, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-result v0

    .line 209
    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    iget-object p1, p1, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

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

    .line 103
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 104
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public contains1(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L1;",
            ")Z"
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public contains2(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L2;",
            ")Z"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

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

.method public get(I)Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 228
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/daaw/avee/Common/MultiList;->get(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method public get1(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)T",
            "L1;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get2(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)T",
            "L2;"
        }
    .end annotation

    .line 120
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public indexOf1(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L1;",
            ")I"
        }
    .end annotation

    .line 124
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public indexOf2(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L2;",
            ")I"
        }
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

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
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;"
        }
    .end annotation

    .line 239
    new-instance v0, Lcom/daaw/avee/Common/MultiList$Iterator;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/MultiList$Iterator;-><init>(Ljava/util/Iterator;Ljava/util/Iterator;)V

    return-object v0
.end method

.method public iterator1()Ljava/util/Iterator;
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

    .line 243
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public iterator2()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 247
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
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
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;"
        }
    .end annotation

    .line 264
    new-instance v0, Lcom/daaw/avee/Common/MultiList$ListIterator;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/MultiList$ListIterator;-><init>(Ljava/util/ListIterator;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;>;"
        }
    .end annotation

    .line 258
    new-instance v0, Lcom/daaw/avee/Common/MultiList$ListIterator;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/avee/Common/MultiList$ListIterator;-><init>(Ljava/util/ListIterator;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public multiListIterator()Lcom/daaw/avee/Common/MultiList$ListIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/MultiList$ListIterator<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 138
    new-instance v0, Lcom/daaw/avee/Common/MultiList$ListIterator;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/MultiList$ListIterator;-><init>(Ljava/util/ListIterator;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public remove(I)Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 269
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/daaw/avee/Common/MultiList;->remove(I)Lcom/daaw/avee/Common/Tuple2;

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

.method public set(ILcom/daaw/avee/Common/Tuple2;)Lcom/daaw/avee/Common/Tuple2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/avee/Common/Tuple2<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;)",
            "Lcom/daaw/avee/Common/Tuple2<",
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

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 18
    check-cast p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Common/MultiList;->set(ILcom/daaw/avee/Common/Tuple2;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method

.method public set(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IT",
            "L1;",
            "T",
            "L2;",
            ")V"
        }
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 143
    iget-object p2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {p2, p1, p3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public size()I
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 148
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public subList(II)Lcom/daaw/avee/Common/MultiList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/daaw/avee/Common/MultiList<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 153
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v2, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/avee/Common/MultiList;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Common/MultiList;->subList(II)Lcom/daaw/avee/Common/MultiList;

    move-result-object p1

    return-object p1
.end method

.method public swap(II)V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 158
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    return-void
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 5

    .line 296
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 297
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 298
    new-instance v2, Lcom/daaw/avee/Common/Tuple2;

    iget-object v3, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

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

    .line 306
    array-length v0, p1

    invoke-virtual {p0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    .line 307
    iget-object p1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    .line 308
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 309
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object p1

    .line 314
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 315
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 318
    :cond_2
    array-length v0, p1

    invoke-virtual {p0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v1

    if-le v0, v1, :cond_3

    .line 319
    invoke-virtual {p0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v0

    const/4 v1, 0x0

    aput-object v1, p1, v0

    :cond_3
    return-object p1
.end method

.method public unmodifiableList()Lcom/daaw/avee/Common/MultiList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/MultiList<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 170
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    iget-object v1, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    .line 171
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    .line 172
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/MultiList;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public unmodifiableList1()Ljava/util/List;
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

    .line 162
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list1:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public unmodifiableList2()Ljava/util/List;
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

    .line 166
    iget-object v0, p0, Lcom/daaw/avee/Common/MultiList;->list2:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
