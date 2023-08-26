.class public Ltier/ArrayWrapperDouble;
.super Ljava/lang/Object;
.source "ArrayWrapperDouble.java"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/List<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# instance fields
.field private array:[D

.field private offset:I


# direct methods
.method public constructor <init>([D)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ltier/ArrayWrapperDouble;->array:[D

    const/4 p1, 0x0

    .line 22
    iput p1, p0, Ltier/ArrayWrapperDouble;->offset:I

    return-void
.end method

.method public constructor <init>([DI)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ltier/ArrayWrapperDouble;->array:[D

    .line 28
    iput p2, p0, Ltier/ArrayWrapperDouble;->offset:I

    return-void
.end method


# virtual methods
.method public add(ILjava/lang/Double;)V
    .locals 2

    .line 117
    iget-object v0, p0, Ltier/ArrayWrapperDouble;->array:[D

    iget v1, p0, Ltier/ArrayWrapperDouble;->offset:I

    add-int/2addr v1, p1

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    aput-wide p1, v0, v1

    return-void
.end method

.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .line 14
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Ltier/ArrayWrapperDouble;->add(ILjava/lang/Double;)V

    return-void
.end method

.method public add(Ljava/lang/Double;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 14
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p0, p1}, Ltier/ArrayWrapperDouble;->add(Ljava/lang/Double;)Z

    move-result p1

    return p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public get(I)Ljava/lang/Double;
    .locals 3

    .line 106
    iget-object v0, p0, Ltier/ArrayWrapperDouble;->array:[D

    iget v1, p0, Ltier/ArrayWrapperDouble;->offset:I

    add-int/2addr v1, p1

    aget-wide v1, v0, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Ltier/ArrayWrapperDouble;->get(I)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public remove(I)Ljava/lang/Double;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Ltier/ArrayWrapperDouble;->remove(I)Ljava/lang/Double;

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

    const/4 p1, 0x0

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public set(ILjava/lang/Double;)Ljava/lang/Double;
    .locals 4

    .line 111
    iget-object v0, p0, Ltier/ArrayWrapperDouble;->array:[D

    iget v1, p0, Ltier/ArrayWrapperDouble;->offset:I

    add-int/2addr v1, p1

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    aput-wide v2, v0, v1

    return-object p2
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Ltier/ArrayWrapperDouble;->set(ILjava/lang/Double;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 2

    .line 33
    iget-object v0, p0, Ltier/ArrayWrapperDouble;->array:[D

    array-length v0, v0

    iget v1, p0, Ltier/ArrayWrapperDouble;->offset:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    return-object p1
.end method
