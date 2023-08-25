.class public abstract Lcom/daaw/g07;
.super Lcom/daaw/j07;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final transient s:Ljava/util/Map;

.field public transient t:I


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/j07;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lcom/daaw/sy6;->e(Z)V

    iput-object p1, p0, Lcom/daaw/g07;->s:Ljava/util/Map;

    return-void
.end method

.method public static synthetic k(Lcom/daaw/g07;)I
    .locals 2

    iget v0, p0, Lcom/daaw/g07;->t:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/g07;->t:I

    return v0
.end method

.method public static synthetic l(Lcom/daaw/g07;)I
    .locals 2

    iget v0, p0, Lcom/daaw/g07;->t:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/daaw/g07;->t:I

    return v0
.end method

.method public static synthetic m(Lcom/daaw/g07;I)I
    .locals 1

    iget v0, p0, Lcom/daaw/g07;->t:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/g07;->t:I

    return v0
.end method

.method public static synthetic n(Lcom/daaw/g07;I)I
    .locals 1

    iget v0, p0, Lcom/daaw/g07;->t:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/g07;->t:I

    return v0
.end method

.method public static synthetic p(Lcom/daaw/g07;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/g07;->s:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic s(Lcom/daaw/g07;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g07;->s:Ljava/util/Map;

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    iget p1, p0, Lcom/daaw/g07;->t:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/g07;->t:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/g07;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/g07;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget p2, p0, Lcom/daaw/g07;->t:I

    add-int/2addr p2, v1

    iput p2, p0, Lcom/daaw/g07;->t:I

    iget-object p2, p0, Lcom/daaw/g07;->s:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "New Collection violated the Collection spec"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/daaw/g07;->t:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/daaw/g07;->t:I

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final c()Ljava/util/Collection;
    .locals 1

    new-instance v0, Lcom/daaw/i07;

    invoke-direct {v0, p0}, Lcom/daaw/i07;-><init>(Lcom/daaw/j07;)V

    return-object v0
.end method

.method public final d()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/daaw/nz6;

    invoke-direct {v0, p0}, Lcom/daaw/nz6;-><init>(Lcom/daaw/g07;)V

    return-object v0
.end method

.method public abstract h()Ljava/util/Collection;
.end method

.method public abstract i(Ljava/util/Collection;)Ljava/util/Collection;
.end method

.method public abstract j(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
.end method

.method public final o(Ljava/lang/Object;Ljava/util/List;Lcom/daaw/d07;)Ljava/util/List;
    .locals 1
    .param p3    # Lcom/daaw/d07;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    instance-of v0, p2, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/zz6;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/zz6;-><init>(Lcom/daaw/g07;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/d07;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/f07;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/f07;-><init>(Lcom/daaw/g07;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/d07;)V

    :goto_0
    return-object v0
.end method

.method public final q()Ljava/util/Map;
    .locals 2

    iget-object v0, p0, Lcom/daaw/g07;->s:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/daaw/xz6;

    check-cast v0, Ljava/util/NavigableMap;

    invoke-direct {v1, p0, v0}, Lcom/daaw/xz6;-><init>(Lcom/daaw/g07;Ljava/util/NavigableMap;)V

    return-object v1

    :cond_0
    instance-of v1, v0, Ljava/util/SortedMap;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/daaw/a07;

    check-cast v0, Ljava/util/SortedMap;

    invoke-direct {v1, p0, v0}, Lcom/daaw/a07;-><init>(Lcom/daaw/g07;Ljava/util/SortedMap;)V

    return-object v1

    :cond_1
    new-instance v1, Lcom/daaw/tz6;

    invoke-direct {v1, p0, v0}, Lcom/daaw/tz6;-><init>(Lcom/daaw/g07;Ljava/util/Map;)V

    return-object v1
.end method

.method public final r()Ljava/util/Set;
    .locals 2

    iget-object v0, p0, Lcom/daaw/g07;->s:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/daaw/yz6;

    check-cast v0, Ljava/util/NavigableMap;

    invoke-direct {v1, p0, v0}, Lcom/daaw/yz6;-><init>(Lcom/daaw/g07;Ljava/util/NavigableMap;)V

    return-object v1

    :cond_0
    instance-of v1, v0, Ljava/util/SortedMap;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/daaw/b07;

    check-cast v0, Ljava/util/SortedMap;

    invoke-direct {v1, p0, v0}, Lcom/daaw/b07;-><init>(Lcom/daaw/g07;Ljava/util/SortedMap;)V

    return-object v1

    :cond_1
    new-instance v1, Lcom/daaw/wz6;

    invoke-direct {v1, p0, v0}, Lcom/daaw/wz6;-><init>(Lcom/daaw/g07;Ljava/util/Map;)V

    return-object v1
.end method

.method public final zzh()I
    .locals 1

    iget v0, p0, Lcom/daaw/g07;->t:I

    return v0
.end method

.method public final zzr()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/g07;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/g07;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/g07;->t:I

    return-void
.end method
