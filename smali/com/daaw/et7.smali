.class public final Lcom/daaw/et7;
.super Lcom/daaw/lt7;
.source ""


# static fields
.field public static final c:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lcom/daaw/et7;->c:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/dt7;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/daaw/lt7;-><init>(Lcom/daaw/kt7;)V

    return-void
.end method

.method public static f(Ljava/lang/Object;JI)Ljava/util/List;
    .locals 3

    invoke-static {p0, p1, p2}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, v0, Lcom/daaw/ct7;

    if-eqz v1, :cond_0

    new-instance v0, Lcom/daaw/bt7;

    invoke-direct {v0, p3}, Lcom/daaw/bt7;-><init>(I)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lcom/daaw/eu7;

    if-eqz v1, :cond_1

    instance-of v1, v0, Lcom/daaw/us7;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/us7;

    invoke-interface {v0, p3}, Lcom/daaw/us7;->b(I)Lcom/daaw/us7;

    move-result-object p3

    move-object v0, p3

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-static {p0, p1, p2, v0}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_2

    :cond_2
    sget-object v1, Lcom/daaw/et7;->c:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, p3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :goto_1
    invoke-static {p0, p1, p2, v1}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v0, v1

    goto :goto_2

    :cond_3
    instance-of v1, v0, Lcom/daaw/bw7;

    if-eqz v1, :cond_4

    new-instance v1, Lcom/daaw/bt7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, p3

    invoke-direct {v1, v2}, Lcom/daaw/bt7;-><init>(I)V

    check-cast v0, Lcom/daaw/bw7;

    invoke-virtual {v1}, Lcom/daaw/bt7;->size()I

    move-result p3

    invoke-virtual {v1, p3, v0}, Lcom/daaw/iq7;->addAll(ILjava/util/Collection;)Z

    goto :goto_1

    :cond_4
    instance-of v1, v0, Lcom/daaw/eu7;

    if-eqz v1, :cond_6

    instance-of v1, v0, Lcom/daaw/us7;

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, Lcom/daaw/us7;

    invoke-interface {v1}, Lcom/daaw/us7;->zzc()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p3

    invoke-interface {v1, v0}, Lcom/daaw/us7;->b(I)Lcom/daaw/us7;

    move-result-object p3

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    return-object p3

    :cond_6
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;J)Ljava/util/List;
    .locals 1

    const/16 v0, 0xa

    invoke-static {p1, p2, p3, v0}, Lcom/daaw/et7;->f(Ljava/lang/Object;JI)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;J)V
    .locals 3

    invoke-static {p1, p2, p3}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    instance-of v1, v0, Lcom/daaw/ct7;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/ct7;

    invoke-interface {v0}, Lcom/daaw/ct7;->zze()Lcom/daaw/ct7;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/daaw/et7;->c:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    instance-of v1, v0, Lcom/daaw/eu7;

    if-eqz v1, :cond_3

    instance-of v1, v0, Lcom/daaw/us7;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {v0}, Lcom/daaw/us7;->zzb()V

    :cond_2
    return-void

    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-static {p1, p2, p3, v0}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 3

    invoke-static {p2, p3, p4}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, p3, p4, v0}, Lcom/daaw/et7;->f(Ljava/lang/Object;JI)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v1, :cond_0

    if-lez v2, :cond_0

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    if-lez v1, :cond_1

    move-object p2, v0

    :cond_1
    invoke-static {p1, p3, p4, p2}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method
