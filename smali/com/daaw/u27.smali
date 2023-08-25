.class public abstract Lcom/daaw/u27;
.super Ljava/util/AbstractMap;
.source ""


# instance fields
.field public transient p:Ljava/util/Set;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public transient q:Ljava/util/Collection;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Set;
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u27;->p:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/u27;->a()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/u27;->p:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u27;->q:Ljava/util/Collection;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/t27;

    invoke-direct {v0, p0}, Lcom/daaw/t27;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/daaw/u27;->q:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method
