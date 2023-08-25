.class public Lcom/daaw/h91;
.super Lcom/daaw/f;
.source ""

# interfaces
.implements Lcom/daaw/vl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/f<",
        "TT;>;",
        "Lcom/daaw/vl;"
    }
.end annotation


# instance fields
.field public final r:Lcom/daaw/gl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/gl<",
            "TT;>;"
        }
    .end annotation
.end field


# virtual methods
.method public final I()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final a()Lcom/daaw/vl;
    .locals 2

    iget-object v0, p0, Lcom/daaw/h91;->r:Lcom/daaw/gl;

    instance-of v1, v0, Lcom/daaw/vl;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/vl;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h91;->r:Lcom/daaw/gl;

    invoke-static {v0}, Lcom/daaw/vg0;->a(Lcom/daaw/gl;)Lcom/daaw/gl;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/h91;->r:Lcom/daaw/gl;

    invoke-static {p1, v1}, Lcom/daaw/rh;->a(Ljava/lang/Object;Lcom/daaw/gl;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/daaw/cu;->c(Lcom/daaw/gl;Ljava/lang/Object;Lcom/daaw/z40;ILjava/lang/Object;)V

    return-void
.end method

.method public i0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/h91;->r:Lcom/daaw/gl;

    invoke-static {p1, v0}, Lcom/daaw/rh;->a(Ljava/lang/Object;Lcom/daaw/gl;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    return-void
.end method
