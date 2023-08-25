.class public final Lcom/daaw/a27;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:[Ljava/lang/Object;

.field public b:I

.field public c:Lcom/daaw/z17;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/daaw/a27;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    add-int/2addr p1, p1

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/a27;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/a27;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;
    .locals 3

    iget v0, p0, Lcom/daaw/a27;->b:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/a27;->d(I)V

    invoke-static {p1, p2}, Lcom/daaw/k07;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/a27;->a:[Ljava/lang/Object;

    iget v1, p0, Lcom/daaw/a27;->b:I

    add-int v2, v1, v1

    aput-object p1, v0, v2

    add-int/lit8 v2, v2, 0x1

    aput-object p2, v0, v2

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/a27;->b:I

    return-object p0
.end method

.method public final b(Ljava/lang/Iterable;)Lcom/daaw/a27;
    .locals 2

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/a27;->b:I

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/daaw/a27;->d(I)V

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public final c()Lcom/daaw/b27;
    .locals 2

    iget-object v0, p0, Lcom/daaw/a27;->c:Lcom/daaw/z17;

    if-nez v0, :cond_1

    iget v0, p0, Lcom/daaw/a27;->b:I

    iget-object v1, p0, Lcom/daaw/a27;->a:[Ljava/lang/Object;

    invoke-static {v0, v1, p0}, Lcom/daaw/r37;->i(I[Ljava/lang/Object;Lcom/daaw/a27;)Lcom/daaw/r37;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/a27;->c:Lcom/daaw/z17;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/z17;->a()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/z17;->a()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0
.end method

.method public final d(I)V
    .locals 2

    add-int/2addr p1, p1

    iget-object v0, p0, Lcom/daaw/a27;->a:[Ljava/lang/Object;

    array-length v1, v0

    if-le p1, v1, :cond_0

    invoke-static {v1, p1}, Lcom/daaw/s17;->b(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/a27;->a:[Ljava/lang/Object;

    :cond_0
    return-void
.end method
