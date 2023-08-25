.class public final Lcom/daaw/o37;
.super Lcom/daaw/d27;
.source ""


# instance fields
.field public final transient r:Lcom/daaw/b27;

.field public final transient s:[Ljava/lang/Object;

.field public final transient t:I


# direct methods
.method public constructor <init>(Lcom/daaw/b27;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/d27;-><init>()V

    iput-object p1, p0, Lcom/daaw/o37;->r:Lcom/daaw/b27;

    iput-object p2, p0, Lcom/daaw/o37;->s:[Ljava/lang/Object;

    iput p4, p0, Lcom/daaw/o37;->t:I

    return-void
.end method

.method public static synthetic A(Lcom/daaw/o37;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/o37;->s:[Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic z(Lcom/daaw/o37;)I
    .locals 0

    iget p0, p0, Lcom/daaw/o37;->t:I

    return p0
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

    iget-object v2, p0, Lcom/daaw/o37;->r:Lcom/daaw/b27;

    invoke-virtual {v2, v0}, Lcom/daaw/b27;->get(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0}, Lcom/daaw/t17;->h()Lcom/daaw/y17;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/t17;->d([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/t17;->h()Lcom/daaw/y17;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/y17;->A(I)Lcom/daaw/d47;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/daaw/c47;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/t17;->h()Lcom/daaw/y17;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/y17;->A(I)Lcom/daaw/d47;

    move-result-object v0

    return-object v0
.end method

.method public final o()Lcom/daaw/y17;
    .locals 1

    new-instance v0, Lcom/daaw/n37;

    invoke-direct {v0, p0}, Lcom/daaw/n37;-><init>(Lcom/daaw/o37;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/daaw/o37;->t:I

    return v0
.end method
