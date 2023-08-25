.class public abstract Lcom/daaw/j07;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w27;


# instance fields
.field public transient p:Ljava/util/Set;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public transient q:Ljava/util/Collection;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public transient r:Ljava/util/Map;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j07;->r:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/j07;->e()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/j07;->r:Ljava/util/Map;

    :cond_0
    return-object v0
.end method

.method public abstract c()Ljava/util/Collection;
.end method

.method public abstract d()Ljava/util/Iterator;
.end method

.method public abstract e()Ljava/util/Map;
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/daaw/w27;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    check-cast p1, Lcom/daaw/w27;

    invoke-interface {p0}, Lcom/daaw/w27;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Lcom/daaw/w27;->b()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public abstract f()Ljava/util/Set;
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j07;->p:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/j07;->f()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/j07;->p:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j07;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j07;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzt()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j07;->q:Ljava/util/Collection;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/j07;->c()Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/j07;->q:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method
