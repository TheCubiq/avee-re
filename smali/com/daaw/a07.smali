.class public Lcom/daaw/a07;
.super Lcom/daaw/tz6;
.source ""

# interfaces
.implements Ljava/util/SortedMap;


# instance fields
.field public t:Ljava/util/SortedSet;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public final synthetic u:Lcom/daaw/g07;


# direct methods
.method public constructor <init>(Lcom/daaw/g07;Ljava/util/SortedMap;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a07;->u:Lcom/daaw/g07;

    invoke-direct {p0, p1, p2}, Lcom/daaw/tz6;-><init>(Lcom/daaw/g07;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public c()Ljava/util/SortedMap;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tz6;->r:Ljava/util/Map;

    check-cast v0, Ljava/util/SortedMap;

    return-object v0
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/a07;->c()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->comparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/SortedSet;
    .locals 3

    new-instance v0, Lcom/daaw/b07;

    iget-object v1, p0, Lcom/daaw/a07;->u:Lcom/daaw/g07;

    invoke-virtual {p0}, Lcom/daaw/a07;->c()Ljava/util/SortedMap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/b07;-><init>(Lcom/daaw/g07;Ljava/util/SortedMap;)V

    return-object v0
.end method

.method public e()Ljava/util/SortedSet;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a07;->t:Ljava/util/SortedSet;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/a07;->d()Ljava/util/SortedSet;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/a07;->t:Ljava/util/SortedSet;

    :cond_0
    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/a07;->c()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->firstKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 3

    new-instance v0, Lcom/daaw/a07;

    iget-object v1, p0, Lcom/daaw/a07;->u:Lcom/daaw/g07;

    invoke-virtual {p0}, Lcom/daaw/a07;->c()Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/SortedMap;->headMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/a07;-><init>(Lcom/daaw/g07;Ljava/util/SortedMap;)V

    return-object v0
.end method

.method public bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/a07;->e()Ljava/util/SortedSet;

    move-result-object v0

    return-object v0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/a07;->c()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->lastKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 3

    new-instance v0, Lcom/daaw/a07;

    iget-object v1, p0, Lcom/daaw/a07;->u:Lcom/daaw/g07;

    invoke-virtual {p0}, Lcom/daaw/a07;->c()Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Ljava/util/SortedMap;->subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/a07;-><init>(Lcom/daaw/g07;Ljava/util/SortedMap;)V

    return-object v0
.end method

.method public tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 3

    new-instance v0, Lcom/daaw/a07;

    iget-object v1, p0, Lcom/daaw/a07;->u:Lcom/daaw/g07;

    invoke-virtual {p0}, Lcom/daaw/a07;->c()Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/SortedMap;->tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/a07;-><init>(Lcom/daaw/g07;Ljava/util/SortedMap;)V

    return-object v0
.end method
