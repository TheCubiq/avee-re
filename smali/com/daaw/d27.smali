.class public abstract Lcom/daaw/d27;
.super Lcom/daaw/t17;
.source ""

# interfaces
.implements Ljava/util/Set;


# instance fields
.field public transient q:Lcom/daaw/y17;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/t17;-><init>()V

    return-void
.end method

.method public static n(I)I
    .locals 6

    const/4 v0, 0x2

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const v0, 0x2ccccccc

    if-ge p0, v0, :cond_1

    add-int/lit8 v0, p0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    :goto_0
    add-int/2addr v0, v0

    int-to-double v1, v0

    const-wide v3, 0x3fe6666666666666L    # 0.7

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v3

    int-to-double v3, p0

    cmpg-double v5, v1, v3

    if-gez v5, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    if-ge p0, v0, :cond_2

    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    const-string v1, "collection too large"

    invoke-static {p0, v1}, Lcom/daaw/sy6;->f(ZLjava/lang/Object;)V

    return v0
.end method

.method public static p(I)Lcom/daaw/c27;
    .locals 1

    new-instance v0, Lcom/daaw/c27;

    invoke-direct {v0, p0}, Lcom/daaw/c27;-><init>(I)V

    return-object v0
.end method

.method public static synthetic q(I[Ljava/lang/Object;)Lcom/daaw/d27;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/d27;->x(I[Ljava/lang/Object;)Lcom/daaw/d27;

    move-result-object p0

    return-object p0
.end method

.method public static r(Ljava/util/Collection;)Lcom/daaw/d27;
    .locals 1

    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    array-length v0, p0

    invoke-static {v0, p0}, Lcom/daaw/d27;->x(I[Ljava/lang/Object;)Lcom/daaw/d27;

    move-result-object p0

    return-object p0
.end method

.method public static s()Lcom/daaw/d27;
    .locals 1

    sget-object v0, Lcom/daaw/s37;->x:Lcom/daaw/s37;

    return-object v0
.end method

.method public static t(Ljava/lang/Object;)Lcom/daaw/d27;
    .locals 1

    new-instance v0, Lcom/daaw/z37;

    invoke-direct {v0, p0}, Lcom/daaw/z37;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static varargs u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/daaw/d27;
    .locals 3
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    const/16 v0, 0xc

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    const/4 p0, 0x3

    aput-object p3, v1, p0

    const/4 p0, 0x4

    aput-object p4, v1, p0

    const/4 p0, 0x5

    aput-object p5, v1, p0

    const/4 p0, 0x6

    invoke-static {p6, v2, v1, p0, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0, v1}, Lcom/daaw/d27;->x(I[Ljava/lang/Object;)Lcom/daaw/d27;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(II)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/d27;->y(II)Z

    move-result p0

    return p0
.end method

.method public static varargs x(I[Ljava/lang/Object;)Lcom/daaw/d27;
    .locals 13

    if-eqz p0, :cond_7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_6

    invoke-static {p0}, Lcom/daaw/d27;->n(I)I

    move-result v2

    new-array v6, v2, [Ljava/lang/Object;

    add-int/lit8 v7, v2, -0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v3, p0, :cond_2

    aget-object v4, p1, v3

    invoke-static {v4, v3}, Lcom/daaw/k37;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v9

    invoke-static {v9}, Lcom/daaw/q17;->a(I)I

    move-result v10

    :goto_1
    and-int v11, v10, v7

    aget-object v12, v6, v11

    if-nez v12, :cond_0

    add-int/lit8 v10, v8, 0x1

    aput-object v4, p1, v8

    aput-object v4, v6, v11

    add-int/2addr v5, v9

    move v8, v10

    goto :goto_2

    :cond_0
    invoke-virtual {v12, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    invoke-static {p1, v8, p0, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    if-ne v8, v1, :cond_3

    aget-object p0, p1, v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lcom/daaw/z37;

    invoke-direct {p1, p0}, Lcom/daaw/z37;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    invoke-static {v8}, Lcom/daaw/d27;->n(I)I

    move-result p0

    div-int/lit8 v2, v2, 0x2

    if-ge p0, v2, :cond_4

    invoke-static {v8, p1}, Lcom/daaw/d27;->x(I[Ljava/lang/Object;)Lcom/daaw/d27;

    move-result-object p0

    return-object p0

    :cond_4
    array-length p0, p1

    invoke-static {v8, p0}, Lcom/daaw/d27;->y(II)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {p1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    :cond_5
    move-object v4, p1

    new-instance p0, Lcom/daaw/s37;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lcom/daaw/s37;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    return-object p0

    :cond_6
    aget-object p0, p1, v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lcom/daaw/z37;

    invoke-direct {p1, p0}, Lcom/daaw/z37;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_7
    sget-object p0, Lcom/daaw/s37;->x:Lcom/daaw/s37;

    return-object p0
.end method

.method public static y(II)Z
    .locals 1

    shr-int/lit8 v0, p1, 0x1

    shr-int/lit8 p1, p1, 0x2

    add-int/2addr v0, p1

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/daaw/d27;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/d27;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/daaw/d27;

    invoke-virtual {v0}, Lcom/daaw/d27;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/d27;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-static {p0, p1}, Lcom/daaw/y37;->c(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public h()Lcom/daaw/y17;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d27;->q:Lcom/daaw/y17;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/d27;->o()Lcom/daaw/y17;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/d27;->q:Lcom/daaw/y17;

    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/daaw/y37;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/d27;->j()Lcom/daaw/c47;

    move-result-object v0

    return-object v0
.end method

.method public abstract j()Lcom/daaw/c47;
.end method

.method public o()Lcom/daaw/y17;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/t17;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/y17;->p([Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v0

    return-object v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
