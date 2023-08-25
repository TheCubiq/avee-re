.class public abstract Lcom/daaw/il;
.super Lcom/daaw/na;
.source ""


# instance fields
.field public final q:Lcom/daaw/nl;

.field public transient r:Lcom/daaw/gl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/gl<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public e()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/il;->r:Lcom/daaw/gl;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/il;->getContext()Lcom/daaw/nl;

    move-result-object v1

    sget-object v2, Lcom/daaw/jl;->b:Lcom/daaw/jl$b;

    invoke-interface {v1, v2}, Lcom/daaw/nl;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    check-cast v1, Lcom/daaw/jl;

    invoke-interface {v1, v0}, Lcom/daaw/jl;->E(Lcom/daaw/gl;)V

    :cond_0
    sget-object v0, Lcom/daaw/mh;->p:Lcom/daaw/mh;

    iput-object v0, p0, Lcom/daaw/il;->r:Lcom/daaw/gl;

    return-void
.end method

.method public final f()Lcom/daaw/gl;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/gl<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/il;->r:Lcom/daaw/gl;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/il;->getContext()Lcom/daaw/nl;

    move-result-object v0

    sget-object v1, Lcom/daaw/jl;->b:Lcom/daaw/jl$b;

    invoke-interface {v0, v1}, Lcom/daaw/nl;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object v0

    check-cast v0, Lcom/daaw/jl;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/daaw/jl;->D(Lcom/daaw/gl;)Lcom/daaw/gl;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Lcom/daaw/il;->r:Lcom/daaw/gl;

    :cond_2
    return-object v0
.end method

.method public getContext()Lcom/daaw/nl;
    .locals 1

    iget-object v0, p0, Lcom/daaw/il;->q:Lcom/daaw/nl;

    invoke-static {v0}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    return-object v0
.end method
