.class public final Lcom/daaw/rz6;
.super Lcom/daaw/r27;
.source ""


# instance fields
.field public final synthetic p:Lcom/daaw/tz6;


# direct methods
.method public constructor <init>(Lcom/daaw/tz6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rz6;->p:Lcom/daaw/tz6;

    invoke-direct {p0}, Lcom/daaw/r27;-><init>()V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/daaw/rz6;->p:Lcom/daaw/tz6;

    iget-object v0, v0, Lcom/daaw/tz6;->r:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/m07;->a(Ljava/util/Collection;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rz6;->p:Lcom/daaw/tz6;

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lcom/daaw/sz6;

    iget-object v1, p0, Lcom/daaw/rz6;->p:Lcom/daaw/tz6;

    invoke-direct {v0, v1}, Lcom/daaw/sz6;-><init>(Lcom/daaw/tz6;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/daaw/r27;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/daaw/rz6;->p:Lcom/daaw/tz6;

    iget-object v0, v0, Lcom/daaw/tz6;->s:Lcom/daaw/g07;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/g07;->s(Lcom/daaw/g07;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
