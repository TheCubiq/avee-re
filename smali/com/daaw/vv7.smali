.class public final Lcom/daaw/vv7;
.super Lcom/daaw/tv7;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/tv7;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/uv7;

    invoke-virtual {p1}, Lcom/daaw/uv7;->a()I

    move-result p1

    return p1
.end method

.method public final synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/uv7;

    invoke-virtual {p1}, Lcom/daaw/uv7;->b()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/daaw/ls7;

    iget-object v0, p1, Lcom/daaw/ls7;->zzc:Lcom/daaw/uv7;

    invoke-static {}, Lcom/daaw/uv7;->c()Lcom/daaw/uv7;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/daaw/uv7;->f()Lcom/daaw/uv7;

    move-result-object v0

    iput-object v0, p1, Lcom/daaw/ls7;->zzc:Lcom/daaw/uv7;

    :cond_0
    return-object v0
.end method

.method public final synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/ls7;

    iget-object p1, p1, Lcom/daaw/ls7;->zzc:Lcom/daaw/uv7;

    return-object p1
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/daaw/uv7;->c()Lcom/daaw/uv7;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/uv7;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/uv7;->c()Lcom/daaw/uv7;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/uv7;->equals(Ljava/lang/Object;)Z

    move-result v0

    check-cast p2, Lcom/daaw/uv7;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/uv7;

    invoke-static {p1, p2}, Lcom/daaw/uv7;->e(Lcom/daaw/uv7;Lcom/daaw/uv7;)Lcom/daaw/uv7;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object v0, p1

    check-cast v0, Lcom/daaw/uv7;

    invoke-virtual {v0, p2}, Lcom/daaw/uv7;->d(Lcom/daaw/uv7;)Lcom/daaw/uv7;

    :goto_0
    return-object p1
.end method

.method public final synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/daaw/uv7;->f()Lcom/daaw/uv7;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/daaw/uv7;

    invoke-virtual {v0}, Lcom/daaw/uv7;->h()V

    return-object p1
.end method

.method public final bridge synthetic h(Ljava/lang/Object;II)V
    .locals 0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    check-cast p1, Lcom/daaw/uv7;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x5

    invoke-virtual {p1, p2, p3}, Lcom/daaw/uv7;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic i(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, Lcom/daaw/uv7;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2, p3}, Lcom/daaw/uv7;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic j(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/uv7;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, Lcom/daaw/uv7;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic k(Ljava/lang/Object;ILcom/daaw/yq7;)V
    .locals 0

    check-cast p1, Lcom/daaw/uv7;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2, p3}, Lcom/daaw/uv7;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic l(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, Lcom/daaw/uv7;

    shl-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, Lcom/daaw/uv7;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/ls7;

    iget-object p1, p1, Lcom/daaw/ls7;->zzc:Lcom/daaw/uv7;

    invoke-virtual {p1}, Lcom/daaw/uv7;->h()V

    return-void
.end method

.method public final synthetic n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/ls7;

    check-cast p2, Lcom/daaw/uv7;

    iput-object p2, p1, Lcom/daaw/ls7;->zzc:Lcom/daaw/uv7;

    return-void
.end method

.method public final synthetic o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/ls7;

    check-cast p2, Lcom/daaw/uv7;

    iput-object p2, p1, Lcom/daaw/ls7;->zzc:Lcom/daaw/uv7;

    return-void
.end method

.method public final q(Lcom/daaw/iu7;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic r(Ljava/lang/Object;Lcom/daaw/rr7;)V
    .locals 0

    check-cast p1, Lcom/daaw/uv7;

    invoke-virtual {p1, p2}, Lcom/daaw/uv7;->k(Lcom/daaw/rr7;)V

    return-void
.end method
