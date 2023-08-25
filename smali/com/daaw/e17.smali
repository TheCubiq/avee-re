.class public abstract Lcom/daaw/e17;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public p:I

.field public q:I

.field public r:I

.field public final synthetic s:Lcom/daaw/i17;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/i17;Lcom/daaw/n07;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/e17;->s:Lcom/daaw/i17;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/i17;->c(Lcom/daaw/i17;)I

    move-result p2

    iput p2, p0, Lcom/daaw/e17;->p:I

    invoke-virtual {p1}, Lcom/daaw/i17;->g()I

    move-result p1

    iput p1, p0, Lcom/daaw/e17;->q:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/e17;->r:I

    return-void
.end method


# virtual methods
.method public abstract a(I)Ljava/lang/Object;
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/e17;->s:Lcom/daaw/i17;

    invoke-static {v0}, Lcom/daaw/i17;->c(Lcom/daaw/i17;)I

    move-result v0

    iget v1, p0, Lcom/daaw/e17;->p:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lcom/daaw/e17;->q:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/e17;->b()V

    invoke-virtual {p0}, Lcom/daaw/e17;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/e17;->q:I

    iput v0, p0, Lcom/daaw/e17;->r:I

    invoke-virtual {p0, v0}, Lcom/daaw/e17;->a(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/e17;->s:Lcom/daaw/i17;

    iget v2, p0, Lcom/daaw/e17;->q:I

    invoke-virtual {v1, v2}, Lcom/daaw/i17;->h(I)I

    move-result v1

    iput v1, p0, Lcom/daaw/e17;->q:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/e17;->b()V

    iget v0, p0, Lcom/daaw/e17;->r:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no calls to next() since the last call to remove()"

    invoke-static {v0, v1}, Lcom/daaw/sy6;->i(ZLjava/lang/Object;)V

    iget v0, p0, Lcom/daaw/e17;->p:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/daaw/e17;->p:I

    iget-object v0, p0, Lcom/daaw/e17;->s:Lcom/daaw/i17;

    iget v1, p0, Lcom/daaw/e17;->r:I

    invoke-static {v0, v1}, Lcom/daaw/i17;->i(Lcom/daaw/i17;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/i17;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lcom/daaw/e17;->q:I

    const/4 v1, -0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/e17;->q:I

    iput v1, p0, Lcom/daaw/e17;->r:I

    return-void
.end method
