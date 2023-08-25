.class public final Lcom/daaw/d72;
.super Lcom/daaw/py8;
.source ""


# instance fields
.field public final transient r:Lcom/daaw/ix8;

.field public final transient s:Lcom/daaw/rt8;


# direct methods
.method public constructor <init>(Lcom/daaw/ix8;Lcom/daaw/rt8;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/py8;-><init>()V

    iput-object p1, p0, Lcom/daaw/d72;->r:Lcom/daaw/ix8;

    iput-object p2, p0, Lcom/daaw/d72;->s:Lcom/daaw/rt8;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/daaw/d72;->r:Lcom/daaw/ix8;

    invoke-virtual {v0, p1}, Lcom/daaw/ix8;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, Lcom/daaw/d72;->s:Lcom/daaw/rt8;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/aq8;->d([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final h()Lcom/daaw/rt8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d72;->s:Lcom/daaw/rt8;

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/daaw/d72;->s:Lcom/daaw/rt8;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/rt8;->s(I)Lcom/daaw/bd2;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/daaw/ub2;
    .locals 2

    iget-object v0, p0, Lcom/daaw/d72;->s:Lcom/daaw/rt8;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/rt8;->s(I)Lcom/daaw/bd2;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/d72;->r:Lcom/daaw/ix8;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
