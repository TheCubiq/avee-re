.class public final Lcom/daaw/gt7;
.super Lcom/daaw/lt7;
.source ""


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ft7;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/daaw/lt7;-><init>(Lcom/daaw/kt7;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;J)Ljava/util/List;
    .locals 2

    invoke-static {p1, p2, p3}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v1, v1

    :goto_0
    invoke-interface {v0, v1}, Lcom/daaw/us7;->b(I)Lcom/daaw/us7;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    return-object v0
.end method

.method public final b(Ljava/lang/Object;J)V
    .locals 0

    invoke-static {p1, p2, p3}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/us7;

    invoke-interface {p1}, Lcom/daaw/us7;->zzb()V

    return-void
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 4

    invoke-static {p1, p3, p4}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/us7;

    invoke-static {p2, p3, p4}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/us7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v1, :cond_1

    if-lez v2, :cond_1

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v3

    if-nez v3, :cond_0

    add-int/2addr v2, v1

    invoke-interface {v0, v2}, Lcom/daaw/us7;->b(I)Lcom/daaw/us7;

    move-result-object v0

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-gtz v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p2, v0

    :goto_0
    invoke-static {p1, p3, p4, p2}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method
