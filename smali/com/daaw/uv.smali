.class public abstract Lcom/daaw/uv;
.super Lcom/daaw/tv;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/daaw/tv;",
        "ChildC:",
        "Lcom/daaw/un;",
        "ThisC::",
        "Lcom/daaw/ad0<",
        "TChildC;>;>",
        "Lcom/daaw/tv;"
    }
.end annotation


# instance fields
.field public G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public G(Lcom/daaw/de0;Lcom/daaw/e40;)V
    .locals 3

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->G(Lcom/daaw/de0;Lcom/daaw/e40;)V

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tv;

    invoke-virtual {v1}, Lcom/daaw/tv;->W()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1, p2}, Lcom/daaw/tv;->G(Lcom/daaw/de0;Lcom/daaw/e40;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abstract Y(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/tv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation
.end method

.method public Z(Lcom/daaw/tv;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p1, Lcom/daaw/tv;->g:Lcom/daaw/uv;

    const-string v1, "addChildAtEnd"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lcom/daaw/q6;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object p0, p1, Lcom/daaw/tv;->g:Lcom/daaw/uv;

    return-void
.end method

.method public a0(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tv;

    invoke-virtual {v1, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b0(Lcom/daaw/ad0;Lcom/daaw/od0;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TThisC;",
            "Lcom/daaw/od0;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {p1}, Lcom/daaw/ad0;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/un;

    iget-object v4, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/tv;

    invoke-virtual {v4, v3, v0, p2}, Lcom/daaw/tv;->g(Lcom/daaw/un;ILcom/daaw/od0;)Z

    move-result v3

    if-nez v3, :cond_1

    return v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public c0(I)Lcom/daaw/tv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/tv;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/daaw/tv;->g:Lcom/daaw/uv;

    return-object p1
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tv;

    invoke-virtual {v1}, Lcom/daaw/tv;->d()V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/daaw/tv;->d()V

    return-void
.end method

.method public d0(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tv;

    invoke-virtual {v1}, Lcom/daaw/tv;->W()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1, p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    invoke-virtual {v1, p1}, Lcom/daaw/tv;->D(Lcom/daaw/y31;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1, p2}, Lcom/daaw/tv;->E(Lcom/daaw/y31;Lcom/daaw/e40;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public e(I)Lcom/daaw/tv;
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/tv;->e(I)Lcom/daaw/tv;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tv;

    invoke-virtual {v1, p1}, Lcom/daaw/tv;->e(I)Lcom/daaw/tv;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public e0(Lcom/daaw/y31;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tv;

    invoke-virtual {v1}, Lcom/daaw/tv;->W()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Lcom/daaw/tv;->F(Lcom/daaw/y31;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public f0(Lcom/daaw/ad0;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TThisC;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, Lcom/daaw/ad0;->c()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v0, v1, :cond_4

    invoke-interface {p1, v0}, Lcom/daaw/ad0;->a(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/un;

    invoke-virtual {v4}, Lcom/daaw/un;->B()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/daaw/un;->D()Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lt v2, v6, :cond_1

    invoke-virtual {p0, v0, v5, v4}, Lcom/daaw/uv;->Y(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/tv;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {p0, v4}, Lcom/daaw/uv;->Z(Lcom/daaw/tv;)V

    iget-object v2, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v3

    goto :goto_1

    :cond_1
    iget-object v6, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/tv;

    invoke-static {v6, v5, v4}, Lcom/daaw/sv1;->a(Lcom/daaw/tv;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    iget-object v6, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/tv;

    invoke-virtual {v6}, Lcom/daaw/tv;->d()V

    invoke-virtual {p0, v0, v5, v4}, Lcom/daaw/uv;->Y(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/tv;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v5, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v5, v2, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    iget-object v4, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/tv;

    invoke-interface {p1, v0}, Lcom/daaw/ad0;->a(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/un;

    invoke-virtual {v4, v5, v0}, Lcom/daaw/tv;->K(Lcom/daaw/un;I)Z

    add-int/2addr v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/tv;

    invoke-virtual {p1}, Lcom/daaw/tv;->d()V

    goto :goto_2

    :cond_5
    return v3
.end method

.method public l()V
    .locals 2

    invoke-super {p0}, Lcom/daaw/tv;->l()V

    iget-object v0, p0, Lcom/daaw/uv;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tv;

    invoke-virtual {v1}, Lcom/daaw/tv;->l()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/uv;->a0(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 0

    return-void
.end method
