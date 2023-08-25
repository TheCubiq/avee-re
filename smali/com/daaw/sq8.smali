.class public abstract Lcom/daaw/sq8;
.super Lcom/daaw/lq8;
.source ""


# instance fields
.field public final h:Ljava/util/HashMap;

.field public i:Landroid/os/Handler;

.field public j:Lcom/daaw/qz6;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/lq8;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/sq8;->h:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Object;Lcom/daaw/rr8;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/sq8;->h:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    new-instance v0, Lcom/daaw/pq8;

    invoke-direct {v0, p0, p1}, Lcom/daaw/pq8;-><init>(Lcom/daaw/sq8;Ljava/lang/Object;)V

    new-instance v1, Lcom/daaw/qq8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/qq8;-><init>(Lcom/daaw/sq8;Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/daaw/sq8;->h:Ljava/util/HashMap;

    new-instance v3, Lcom/daaw/rq8;

    invoke-direct {v3, p2, v0, v1}, Lcom/daaw/rq8;-><init>(Lcom/daaw/rr8;Lcom/daaw/qr8;Lcom/daaw/qq8;)V

    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/sq8;->i:Landroid/os/Handler;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, p1, v1}, Lcom/daaw/rr8;->f(Landroid/os/Handler;Lcom/daaw/zr8;)V

    iget-object p1, p0, Lcom/daaw/sq8;->i:Landroid/os/Handler;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, p1, v1}, Lcom/daaw/rr8;->d(Landroid/os/Handler;Lcom/daaw/ln8;)V

    iget-object p1, p0, Lcom/daaw/sq8;->j:Lcom/daaw/qz6;

    invoke-virtual {p0}, Lcom/daaw/lq8;->o()Lcom/daaw/lh8;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lcom/daaw/rr8;->m(Lcom/daaw/qr8;Lcom/daaw/qz6;Lcom/daaw/lh8;)V

    invoke-virtual {p0}, Lcom/daaw/lq8;->z()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2, v0}, Lcom/daaw/rr8;->a(Lcom/daaw/qr8;)V

    :cond_0
    return-void
.end method

.method public B(Ljava/lang/Object;I)I
    .locals 0

    return p2
.end method

.method public C(Ljava/lang/Object;J)J
    .locals 0

    return-wide p2
.end method

.method public abstract D(Ljava/lang/Object;Lcom/daaw/pr8;)Lcom/daaw/pr8;
.end method

.method public abstract E(Ljava/lang/Object;Lcom/daaw/rr8;Lcom/daaw/l64;)V
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/sq8;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rq8;

    iget-object v1, v1, Lcom/daaw/rq8;->a:Lcom/daaw/rr8;

    invoke-interface {v1}, Lcom/daaw/rr8;->e()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final u()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/sq8;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rq8;

    iget-object v2, v1, Lcom/daaw/rq8;->a:Lcom/daaw/rr8;

    iget-object v1, v1, Lcom/daaw/rq8;->b:Lcom/daaw/qr8;

    invoke-interface {v2, v1}, Lcom/daaw/rr8;->a(Lcom/daaw/qr8;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final v()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/sq8;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rq8;

    iget-object v2, v1, Lcom/daaw/rq8;->a:Lcom/daaw/rr8;

    iget-object v1, v1, Lcom/daaw/rq8;->b:Lcom/daaw/qr8;

    invoke-interface {v2, v1}, Lcom/daaw/rr8;->j(Lcom/daaw/qr8;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w(Lcom/daaw/qz6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sq8;->j:Lcom/daaw/qz6;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/it5;->d(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/sq8;->i:Landroid/os/Handler;

    return-void
.end method

.method public y()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/sq8;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rq8;

    iget-object v2, v1, Lcom/daaw/rq8;->a:Lcom/daaw/rr8;

    iget-object v3, v1, Lcom/daaw/rq8;->b:Lcom/daaw/qr8;

    invoke-interface {v2, v3}, Lcom/daaw/rr8;->n(Lcom/daaw/qr8;)V

    iget-object v2, v1, Lcom/daaw/rq8;->a:Lcom/daaw/rr8;

    iget-object v3, v1, Lcom/daaw/rq8;->c:Lcom/daaw/qq8;

    invoke-interface {v2, v3}, Lcom/daaw/rr8;->g(Lcom/daaw/zr8;)V

    iget-object v2, v1, Lcom/daaw/rq8;->a:Lcom/daaw/rr8;

    iget-object v1, v1, Lcom/daaw/rq8;->c:Lcom/daaw/qq8;

    invoke-interface {v2, v1}, Lcom/daaw/rr8;->i(Lcom/daaw/ln8;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/sq8;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method
