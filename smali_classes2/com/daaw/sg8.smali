.class public final Lcom/daaw/sg8;
.super Lcom/daaw/og8;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/og8;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/qg8;

    invoke-virtual {p1}, Lcom/daaw/qg8;->a()I

    move-result p1

    return p1
.end method

.method public final synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/qg8;

    invoke-virtual {p1}, Lcom/daaw/qg8;->b()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/daaw/ja8;

    iget-object v0, p1, Lcom/daaw/ja8;->zzc:Lcom/daaw/qg8;

    invoke-static {}, Lcom/daaw/qg8;->c()Lcom/daaw/qg8;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/daaw/qg8;->f()Lcom/daaw/qg8;

    move-result-object v0

    iput-object v0, p1, Lcom/daaw/ja8;->zzc:Lcom/daaw/qg8;

    :cond_0
    return-object v0
.end method

.method public final synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/ja8;

    iget-object p1, p1, Lcom/daaw/ja8;->zzc:Lcom/daaw/qg8;

    return-object p1
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/daaw/qg8;->c()Lcom/daaw/qg8;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/qg8;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/qg8;->c()Lcom/daaw/qg8;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/qg8;->equals(Ljava/lang/Object;)Z

    move-result v0

    check-cast p2, Lcom/daaw/qg8;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/qg8;

    invoke-static {p1, p2}, Lcom/daaw/qg8;->e(Lcom/daaw/qg8;Lcom/daaw/qg8;)Lcom/daaw/qg8;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object v0, p1

    check-cast v0, Lcom/daaw/qg8;

    invoke-virtual {v0, p2}, Lcom/daaw/qg8;->d(Lcom/daaw/qg8;)Lcom/daaw/qg8;

    :goto_0
    return-object p1
.end method

.method public final bridge synthetic f(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, Lcom/daaw/qg8;

    shl-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, Lcom/daaw/qg8;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/ja8;

    iget-object p1, p1, Lcom/daaw/ja8;->zzc:Lcom/daaw/qg8;

    invoke-virtual {p1}, Lcom/daaw/qg8;->h()V

    return-void
.end method

.method public final synthetic h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/ja8;

    check-cast p2, Lcom/daaw/qg8;

    iput-object p2, p1, Lcom/daaw/ja8;->zzc:Lcom/daaw/qg8;

    return-void
.end method

.method public final synthetic i(Ljava/lang/Object;Lcom/daaw/ki8;)V
    .locals 0

    check-cast p1, Lcom/daaw/qg8;

    invoke-virtual {p1, p2}, Lcom/daaw/qg8;->k(Lcom/daaw/ki8;)V

    return-void
.end method
