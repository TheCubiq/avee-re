.class public final Lcom/daaw/b38;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/gs7;)Lcom/daaw/gl2;
    .locals 3

    if-nez p0, :cond_0

    sget-object p0, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/gs7;->M()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/gs7;->H()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/gs7;

    invoke-static {v2}, Lcom/daaw/b38;->a(Lcom/daaw/gs7;)Lcom/daaw/gl2;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/gs7;->F()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lcom/daaw/km2;

    invoke-direct {v0, p0, v1}, Lcom/daaw/km2;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown type found. Cannot convert entity"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/gs7;->J()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lcom/daaw/g92;

    invoke-virtual {p0}, Lcom/daaw/gs7;->I()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/g92;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :cond_4
    new-instance p0, Lcom/daaw/g92;

    invoke-direct {p0, v2}, Lcom/daaw/g92;-><init>(Ljava/lang/Boolean;)V

    return-object p0

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/gs7;->K()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lcom/daaw/tb2;

    invoke-virtual {p0}, Lcom/daaw/gs7;->D()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/tb2;-><init>(Ljava/lang/Double;)V

    return-object v0

    :cond_6
    new-instance p0, Lcom/daaw/tb2;

    invoke-direct {p0, v2}, Lcom/daaw/tb2;-><init>(Ljava/lang/Double;)V

    return-object p0

    :cond_7
    invoke-virtual {p0}, Lcom/daaw/gs7;->L()Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Lcom/daaw/wp2;

    invoke-virtual {p0}, Lcom/daaw/gs7;->G()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/wp2;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_8
    sget-object p0, Lcom/daaw/gl2;->n:Lcom/daaw/gl2;

    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Lcom/daaw/gl2;
    .locals 5

    if-nez p0, :cond_0

    sget-object p0, Lcom/daaw/gl2;->h:Lcom/daaw/gl2;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/daaw/wp2;

    check-cast p0, Ljava/lang/String;

    invoke-direct {v0, p0}, Lcom/daaw/wp2;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/daaw/tb2;

    check-cast p0, Ljava/lang/Double;

    invoke-direct {v0, p0}, Lcom/daaw/tb2;-><init>(Ljava/lang/Double;)V

    return-object v0

    :cond_2
    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/daaw/tb2;

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/tb2;-><init>(Ljava/lang/Double;)V

    return-object v0

    :cond_3
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/daaw/tb2;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/tb2;-><init>(Ljava/lang/Double;)V

    return-object v0

    :cond_4
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/daaw/g92;

    check-cast p0, Ljava/lang/Boolean;

    invoke-direct {v0, p0}, Lcom/daaw/g92;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :cond_5
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_9

    new-instance v0, Lcom/daaw/th2;

    invoke-direct {v0}, Lcom/daaw/th2;-><init>()V

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/b38;->b(Ljava/lang/Object;)Lcom/daaw/gl2;

    move-result-object v3

    if-eqz v2, :cond_6

    instance-of v4, v2, Ljava/lang/String;

    if-nez v4, :cond_7

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_7
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/daaw/th2;->h(Ljava/lang/String;Lcom/daaw/gl2;)V

    goto :goto_0

    :cond_8
    return-object v0

    :cond_9
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_b

    new-instance v0, Lcom/daaw/z72;

    invoke-direct {v0}, Lcom/daaw/z72;-><init>()V

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/b38;->b(Ljava/lang/Object;)Lcom/daaw/gl2;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/z72;->j()I

    move-result v2

    invoke-virtual {v0, v2, v1}, Lcom/daaw/z72;->s(ILcom/daaw/gl2;)V

    goto :goto_1

    :cond_a
    return-object v0

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid value type"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method
