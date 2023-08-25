.class public final Lcom/daaw/ju7;
.super Lcom/daaw/qq7;
.source ""


# instance fields
.field public final p:Lcom/daaw/zu7;

.field public q:Lcom/daaw/sq7;

.field public final synthetic r:Lcom/daaw/bv7;


# direct methods
.method public constructor <init>(Lcom/daaw/bv7;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/ju7;->r:Lcom/daaw/bv7;

    invoke-direct {p0}, Lcom/daaw/qq7;-><init>()V

    new-instance v0, Lcom/daaw/zu7;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/daaw/zu7;-><init>(Lcom/daaw/yq7;Lcom/daaw/yu7;)V

    iput-object v0, p0, Lcom/daaw/ju7;->p:Lcom/daaw/zu7;

    invoke-virtual {p0}, Lcom/daaw/ju7;->a()Lcom/daaw/sq7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ju7;->q:Lcom/daaw/sq7;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/sq7;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ju7;->p:Lcom/daaw/zu7;

    invoke-virtual {v0}, Lcom/daaw/zu7;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/zu7;->a()Lcom/daaw/tq7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yq7;->C()Lcom/daaw/sq7;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ju7;->q:Lcom/daaw/sq7;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    iget-object v0, p0, Lcom/daaw/ju7;->q:Lcom/daaw/sq7;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/sq7;->zza()B

    move-result v0

    iget-object v1, p0, Lcom/daaw/ju7;->q:Lcom/daaw/sq7;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ju7;->a()Lcom/daaw/sq7;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/ju7;->q:Lcom/daaw/sq7;

    :cond_0
    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
