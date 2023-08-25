.class public final Lcom/daaw/af;
.super Lcom/daaw/oh0;
.source ""

# interfaces
.implements Lcom/daaw/ze;


# instance fields
.field public final t:Lcom/daaw/bf;


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/daaw/af;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;

    return-object p1
.end method

.method public c(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/th0;->t()Lcom/daaw/uh0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/uh0;->o(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/af;->t:Lcom/daaw/bf;

    invoke-virtual {p0}, Lcom/daaw/th0;->t()Lcom/daaw/uh0;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/daaw/bf;->Q(Lcom/daaw/pv0;)V

    return-void
.end method
