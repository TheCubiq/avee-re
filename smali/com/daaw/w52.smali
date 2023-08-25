.class public final Lcom/daaw/w52;
.super Lcom/daaw/y52;
.source ""


# instance fields
.field public b:J

.field public c:[J

.field public d:[J


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lcom/daaw/i09;

    invoke-direct {v0}, Lcom/daaw/i09;-><init>()V

    invoke-direct {p0, v0}, Lcom/daaw/y52;-><init>(Lcom/daaw/m42;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/w52;->b:J

    const/4 v0, 0x0

    new-array v1, v0, [J

    iput-object v1, p0, Lcom/daaw/w52;->c:[J

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/daaw/w52;->d:[J

    return-void
.end method

.method public static g(Lcom/daaw/ik5;)Ljava/lang/Double;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ik5;->z()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lcom/daaw/ik5;I)Ljava/lang/Object;
    .locals 4

    if-eqz p1, :cond_b

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_9

    const/4 v1, 0x2

    if-eq p1, v1, :cond_8

    const/4 v2, 0x3

    if-eq p1, v2, :cond_5

    const/16 v2, 0x8

    if-eq p1, v2, :cond_4

    const/16 v2, 0xa

    if-eq p1, v2, :cond_1

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p1, Ljava/util/Date;

    invoke-static {p0}, Lcom/daaw/w52;->g(Lcom/daaw/ik5;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    double-to-long v2, v2

    invoke-direct {p1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v1}, Lcom/daaw/ik5;->g(I)V

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ik5;->v()I

    move-result p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v0, p1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-static {p0, v2}, Lcom/daaw/w52;->h(Lcom/daaw/ik5;I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-object v1

    :cond_4
    invoke-static {p0}, Lcom/daaw/w52;->j(Lcom/daaw/ik5;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :cond_6
    :goto_1
    invoke-static {p0}, Lcom/daaw/w52;->i(Lcom/daaw/ik5;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v1

    const/16 v2, 0x9

    if-ne v1, v2, :cond_7

    return-object p1

    :cond_7
    invoke-static {p0, v1}, Lcom/daaw/w52;->h(Lcom/daaw/ik5;I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_8
    invoke-static {p0}, Lcom/daaw/w52;->i(Lcom/daaw/ik5;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result p0

    if-ne p0, v1, :cond_a

    const/4 v0, 0x1

    :cond_a
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-static {p0}, Lcom/daaw/w52;->g(Lcom/daaw/ik5;)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lcom/daaw/ik5;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ik5;->w()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v1

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    new-instance v2, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/ik5;->h()[B

    move-result-object p0

    invoke-direct {v2, p0, v1, v0}, Ljava/lang/String;-><init>([BII)V

    return-object v2
.end method

.method public static j(Lcom/daaw/ik5;)Ljava/util/HashMap;
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/ik5;->v()I

    move-result v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-static {p0}, Lcom/daaw/w52;->i(Lcom/daaw/ik5;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v4

    invoke-static {p0, v4}, Lcom/daaw/w52;->h(Lcom/daaw/ik5;I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Lcom/daaw/ik5;J)Z
    .locals 9

    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result p2

    const/4 p3, 0x0

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    return p3

    :cond_0
    invoke-static {p1}, Lcom/daaw/w52;->i(Lcom/daaw/ik5;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "onMetaData"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    return p3

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result p2

    const/16 v0, 0x8

    if-eq p2, v0, :cond_2

    return p3

    :cond_2
    invoke-static {p1}, Lcom/daaw/w52;->j(Lcom/daaw/ik5;)Ljava/util/HashMap;

    move-result-object p1

    const-string p2, "duration"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/Double;

    const-wide v1, 0x412e848000000000L    # 1000000.0

    if-eqz v0, :cond_3

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpl-double p2, v3, v5

    if-lez p2, :cond_3

    mul-double v3, v3, v1

    double-to-long v3, v3

    iput-wide v3, p0, Lcom/daaw/w52;->b:J

    :cond_3
    const-string p2, "keyframes"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/Map;

    if-eqz p2, :cond_5

    check-cast p1, Ljava/util/Map;

    const-string p2, "filepositions"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "times"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_5

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_5

    check-cast p2, Ljava/util/List;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v3, v0, [J

    iput-object v3, p0, Lcom/daaw/w52;->c:[J

    new-array v3, v0, [J

    iput-object v3, p0, Lcom/daaw/w52;->d:[J

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_5

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/Double;

    if-eqz v6, :cond_4

    instance-of v6, v4, Ljava/lang/Double;

    if-eqz v6, :cond_4

    iget-object v6, p0, Lcom/daaw/w52;->c:[J

    check-cast v5, Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    mul-double v7, v7, v1

    double-to-long v7, v7

    aput-wide v7, v6, v3

    iget-object v5, p0, Lcom/daaw/w52;->d:[J

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->longValue()J

    move-result-wide v6

    aput-wide v6, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    new-array p1, p3, [J

    iput-object p1, p0, Lcom/daaw/w52;->c:[J

    new-array p1, p3, [J

    iput-object p1, p0, Lcom/daaw/w52;->d:[J

    :cond_5
    return p3
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/w52;->b:J

    return-wide v0
.end method

.method public final e()[J
    .locals 1

    iget-object v0, p0, Lcom/daaw/w52;->d:[J

    return-object v0
.end method

.method public final f()[J
    .locals 1

    iget-object v0, p0, Lcom/daaw/w52;->c:[J

    return-object v0
.end method
