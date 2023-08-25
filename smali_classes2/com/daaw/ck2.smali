.class public final Lcom/daaw/ck2;
.super Lcom/daaw/ad2;
.source ""


# instance fields
.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public t:Lcom/daaw/w07;


# direct methods
.method public constructor <init>(Lcom/daaw/ck2;)V
    .locals 2

    iget-object v0, p1, Lcom/daaw/ad2;->p:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/daaw/ck2;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/ck2;->r:Ljava/util/List;

    iget-object v1, p1, Lcom/daaw/ck2;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/daaw/ck2;->s:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/ck2;->s:Ljava/util/List;

    iget-object v1, p1, Lcom/daaw/ck2;->s:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p1, Lcom/daaw/ck2;->t:Lcom/daaw/w07;

    iput-object p1, p0, Lcom/daaw/ck2;->t:Lcom/daaw/w07;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/daaw/w07;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/ck2;->r:Ljava/util/List;

    iput-object p4, p0, Lcom/daaw/ck2;->t:Lcom/daaw/w07;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/gl2;

    iget-object p4, p0, Lcom/daaw/ck2;->r:Ljava/util/List;

    invoke-interface {p2}, Lcom/daaw/gl2;->zzi()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/daaw/ck2;->s:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ck2;->t:Lcom/daaw/w07;

    invoke-virtual {v0}, Lcom/daaw/w07;->a()Lcom/daaw/w07;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/ck2;->r:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/ck2;->r:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/gl2;

    invoke-virtual {p1, v3}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/daaw/ck2;->r:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    :goto_1
    invoke-virtual {v0, v2, v3}, Lcom/daaw/w07;->e(Ljava/lang/String;Lcom/daaw/gl2;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/ck2;->s:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/gl2;

    invoke-virtual {v0, p2}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v1

    instance-of v2, v1, Lcom/daaw/km2;

    if-eqz v2, :cond_3

    invoke-virtual {v0, p2}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v1

    :cond_3
    instance-of p2, v1, Lcom/daaw/oa2;

    if-eqz p2, :cond_2

    check-cast v1, Lcom/daaw/oa2;

    invoke-virtual {v1}, Lcom/daaw/oa2;->a()Lcom/daaw/gl2;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    return-object p1
.end method

.method public final zzd()Lcom/daaw/gl2;
    .locals 1

    new-instance v0, Lcom/daaw/ck2;

    invoke-direct {v0, p0}, Lcom/daaw/ck2;-><init>(Lcom/daaw/ck2;)V

    return-object v0
.end method
