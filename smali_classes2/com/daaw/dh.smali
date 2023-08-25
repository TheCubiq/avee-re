.class public final Lcom/daaw/dh;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl;
.implements Ljava/io/Serializable;


# instance fields
.field public final p:Lcom/daaw/nl;

.field public final q:Lcom/daaw/nl$b;


# direct methods
.method public constructor <init>(Lcom/daaw/nl;Lcom/daaw/nl$b;)V
    .locals 1

    const-string v0, "left"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dh;->p:Lcom/daaw/nl;

    iput-object p2, p0, Lcom/daaw/dh;->q:Lcom/daaw/nl$b;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/nl$b;)Z
    .locals 1

    invoke-interface {p1}, Lcom/daaw/nl$b;->getKey()Lcom/daaw/nl$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/dh;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/ug0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final b(Lcom/daaw/dh;)Z
    .locals 1

    :goto_0
    iget-object v0, p1, Lcom/daaw/dh;->q:Lcom/daaw/nl$b;

    invoke-virtual {p0, v0}, Lcom/daaw/dh;->a(Lcom/daaw/nl$b;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p1, Lcom/daaw/dh;->p:Lcom/daaw/nl;

    instance-of v0, p1, Lcom/daaw/dh;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/dh;

    goto :goto_0

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/daaw/nl$b;

    invoke-virtual {p0, p1}, Lcom/daaw/dh;->a(Lcom/daaw/nl$b;)Z

    move-result p1

    return p1
.end method

.method public final c()I
    .locals 3

    const/4 v0, 0x2

    move-object v1, p0

    :goto_0
    iget-object v1, v1, Lcom/daaw/dh;->p:Lcom/daaw/nl;

    instance-of v2, v1, Lcom/daaw/dh;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/daaw/dh;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lcom/daaw/dh;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/dh;

    invoke-virtual {p1}, Lcom/daaw/dh;->c()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/dh;->c()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/dh;->b(Lcom/daaw/dh;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public fold(Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lcom/daaw/n50<",
            "-TR;-",
            "Lcom/daaw/nl$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/dh;->p:Lcom/daaw/nl;

    invoke-interface {v0, p1, p2}, Lcom/daaw/nl;->fold(Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/dh;->q:Lcom/daaw/nl$b;

    invoke-interface {p2, p1, v0}, Lcom/daaw/n50;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lcom/daaw/nl$b;",
            ">(",
            "Lcom/daaw/nl$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/daaw/dh;->q:Lcom/daaw/nl$b;

    invoke-interface {v1, p1}, Lcom/daaw/nl$b;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, Lcom/daaw/dh;->p:Lcom/daaw/nl;

    instance-of v1, v0, Lcom/daaw/dh;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/dh;

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lcom/daaw/nl;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/dh;->p:Lcom/daaw/nl;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/dh;->q:Lcom/daaw/nl$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public minusKey(Lcom/daaw/nl$c;)Lcom/daaw/nl;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl$c<",
            "*>;)",
            "Lcom/daaw/nl;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/dh;->q:Lcom/daaw/nl$b;

    invoke-interface {v0, p1}, Lcom/daaw/nl$b;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/daaw/dh;->p:Lcom/daaw/nl;

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/dh;->p:Lcom/daaw/nl;

    invoke-interface {v0, p1}, Lcom/daaw/nl;->minusKey(Lcom/daaw/nl$c;)Lcom/daaw/nl;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/dh;->p:Lcom/daaw/nl;

    if-ne p1, v0, :cond_1

    move-object p1, p0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/daaw/mw;->p:Lcom/daaw/mw;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/daaw/dh;->q:Lcom/daaw/nl$b;

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/daaw/dh;

    iget-object v1, p0, Lcom/daaw/dh;->q:Lcom/daaw/nl$b;

    invoke-direct {v0, p1, v1}, Lcom/daaw/dh;-><init>(Lcom/daaw/nl;Lcom/daaw/nl$b;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/daaw/dh$a;->q:Lcom/daaw/dh$a;

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, Lcom/daaw/dh;->fold(Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
