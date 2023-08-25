.class public final Lcom/daaw/ip1;
.super Lcom/daaw/h91;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/h91<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public s:Lcom/daaw/nl;

.field public t:Ljava/lang/Object;


# virtual methods
.method public i0(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/ip1;->s:Lcom/daaw/nl;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/daaw/ip1;->t:Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/ip1;->s:Lcom/daaw/nl;

    iput-object v1, p0, Lcom/daaw/ip1;->t:Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lcom/daaw/h91;->r:Lcom/daaw/gl;

    invoke-static {p1, v0}, Lcom/daaw/rh;->a(Ljava/lang/Object;Lcom/daaw/gl;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/h91;->r:Lcom/daaw/gl;

    invoke-interface {v0}, Lcom/daaw/gl;->getContext()Lcom/daaw/nl;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/daaw/bl1;->c(Lcom/daaw/nl;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lcom/daaw/bl1;->a:Lcom/daaw/pi1;

    if-eq v3, v4, :cond_1

    invoke-static {v0, v2, v3}, Lcom/daaw/ol;->c(Lcom/daaw/gl;Lcom/daaw/nl;Ljava/lang/Object;)Lcom/daaw/ip1;

    move-result-object v1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/daaw/h91;->r:Lcom/daaw/gl;

    invoke-interface {v0, p1}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    sget-object p1, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/daaw/ip1;->l0()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-static {v2, v3}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/daaw/ip1;->l0()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-static {v2, v3}, Lcom/daaw/bl1;->a(Lcom/daaw/nl;Ljava/lang/Object;)V

    :cond_5
    throw p1
.end method

.method public final l0()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ip1;->s:Lcom/daaw/nl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ip1;->s:Lcom/daaw/nl;

    iput-object v0, p0, Lcom/daaw/ip1;->t:Ljava/lang/Object;

    const/4 v0, 0x1

    return v0
.end method

.method public final m0(Lcom/daaw/nl;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ip1;->s:Lcom/daaw/nl;

    iput-object p2, p0, Lcom/daaw/ip1;->t:Ljava/lang/Object;

    return-void
.end method
