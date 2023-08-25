.class public final Lcom/daaw/h62;
.super Lcom/daaw/py8;
.source ""


# instance fields
.field public final transient r:Lcom/daaw/ix8;

.field public final transient s:[Ljava/lang/Object;

.field public final transient t:I


# direct methods
.method public constructor <init>(Lcom/daaw/ix8;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/py8;-><init>()V

    iput-object p1, p0, Lcom/daaw/h62;->r:Lcom/daaw/ix8;

    iput-object p2, p0, Lcom/daaw/h62;->s:[Ljava/lang/Object;

    iput p4, p0, Lcom/daaw/h62;->t:I

    return-void
.end method

.method public static synthetic o(Lcom/daaw/h62;)I
    .locals 0

    iget p0, p0, Lcom/daaw/h62;->t:I

    return p0
.end method

.method public static synthetic p(Lcom/daaw/h62;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/h62;->s:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/daaw/h62;->r:Lcom/daaw/ix8;

    invoke-virtual {v2, v0}, Lcom/daaw/ix8;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final d([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/aq8;->h()Lcom/daaw/rt8;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/aq8;->d([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/aq8;->h()Lcom/daaw/rt8;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/rt8;->s(I)Lcom/daaw/bd2;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/daaw/ub2;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/aq8;->h()Lcom/daaw/rt8;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/rt8;->s(I)Lcom/daaw/bd2;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lcom/daaw/rt8;
    .locals 1

    new-instance v0, Lcom/daaw/a52;

    invoke-direct {v0, p0}, Lcom/daaw/a52;-><init>(Lcom/daaw/h62;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/daaw/h62;->t:I

    return v0
.end method
