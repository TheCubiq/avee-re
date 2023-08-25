.class public abstract Lcom/daaw/f;
.super Lcom/daaw/uh0;
.source ""

# interfaces
.implements Lcom/daaw/gl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/uh0;",
        "Lcom/daaw/gl<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final q:Lcom/daaw/nl;


# virtual methods
.method public final H(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/f;->q:Lcom/daaw/nl;

    invoke-static {v0, p1}, Lcom/daaw/sl;->a(Lcom/daaw/nl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public O()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/daaw/f;->q:Lcom/daaw/nl;

    invoke-static {v0}, Lcom/daaw/ol;->a(Lcom/daaw/nl;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/daaw/uh0;->O()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/daaw/uh0;->O()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final U(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lcom/daaw/nh;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/nh;

    iget-object v0, p1, Lcom/daaw/nh;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lcom/daaw/nh;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/daaw/f;->j0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/f;->k0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lcom/daaw/rh;->d(Ljava/lang/Object;Lcom/daaw/z40;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->M(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lcom/daaw/vh0;->b:Lcom/daaw/pi1;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/f;->i0(Ljava/lang/Object;)V

    return-void
.end method

.method public d()Z
    .locals 1

    invoke-super {p0}, Lcom/daaw/uh0;->d()Z

    move-result v0

    return v0
.end method

.method public final getContext()Lcom/daaw/nl;
    .locals 1

    iget-object v0, p0, Lcom/daaw/f;->q:Lcom/daaw/nl;

    return-object v0
.end method

.method public i0(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/uh0;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public j0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method public k0(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lcom/daaw/aq;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
