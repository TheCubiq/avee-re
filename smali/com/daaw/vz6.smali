.class public final Lcom/daaw/vz6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public p:Ljava/util/Map$Entry;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public final synthetic q:Ljava/util/Iterator;

.field public final synthetic r:Lcom/daaw/wz6;


# direct methods
.method public constructor <init>(Lcom/daaw/wz6;Ljava/util/Iterator;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vz6;->r:Lcom/daaw/wz6;

    iput-object p2, p0, Lcom/daaw/vz6;->q:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/vz6;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vz6;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Lcom/daaw/vz6;->p:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vz6;->p:Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no calls to next() since the last call to remove()"

    invoke-static {v0, v1}, Lcom/daaw/sy6;->i(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/vz6;->p:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p0, Lcom/daaw/vz6;->q:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    iget-object v1, p0, Lcom/daaw/vz6;->r:Lcom/daaw/wz6;

    iget-object v1, v1, Lcom/daaw/wz6;->q:Lcom/daaw/g07;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-static {v1, v2}, Lcom/daaw/g07;->n(Lcom/daaw/g07;I)I

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vz6;->p:Ljava/util/Map$Entry;

    return-void
.end method
