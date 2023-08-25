.class public Lcom/daaw/g6;
.super Lcom/daaw/cd1;
.source ""

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/cd1<",
        "TK;TV;>;",
        "Ljava/util/Map<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public w:Lcom/daaw/ym0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ym0<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/cd1;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/cd1;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/cd1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/cd1;-><init>(Lcom/daaw/cd1;)V

    return-void
.end method


# virtual methods
.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/g6;->n()Lcom/daaw/ym0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ym0;->l()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/g6;->n()Lcom/daaw/ym0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ym0;->m()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lcom/daaw/ym0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/ym0<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/g6;->w:Lcom/daaw/ym0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/g6$a;

    invoke-direct {v0, p0}, Lcom/daaw/g6$a;-><init>(Lcom/daaw/g6;)V

    iput-object v0, p0, Lcom/daaw/g6;->w:Lcom/daaw/ym0;

    :cond_0
    iget-object v0, p0, Lcom/daaw/g6;->w:Lcom/daaw/ym0;

    return-object v0
.end method

.method public o(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/daaw/ym0;->p(Ljava/util/Map;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    iget v0, p0, Lcom/daaw/cd1;->r:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/daaw/cd1;->c(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/g6;->n()Lcom/daaw/ym0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ym0;->n()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
