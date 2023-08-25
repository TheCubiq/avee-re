.class public final Lcom/daaw/p37;
.super Lcom/daaw/d27;
.source ""


# instance fields
.field public final transient r:Lcom/daaw/b27;

.field public final transient s:Lcom/daaw/y17;


# direct methods
.method public constructor <init>(Lcom/daaw/b27;Lcom/daaw/y17;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/d27;-><init>()V

    iput-object p1, p0, Lcom/daaw/p37;->r:Lcom/daaw/b27;

    iput-object p2, p0, Lcom/daaw/p37;->s:Lcom/daaw/y17;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/daaw/p37;->r:Lcom/daaw/b27;

    invoke-virtual {v0, p1}, Lcom/daaw/b27;->get(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget-object v0, p0, Lcom/daaw/p37;->s:Lcom/daaw/y17;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/t17;->d([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final h()Lcom/daaw/y17;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p37;->s:Lcom/daaw/y17;

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/daaw/p37;->s:Lcom/daaw/y17;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/y17;->A(I)Lcom/daaw/d47;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/daaw/c47;
    .locals 2

    iget-object v0, p0, Lcom/daaw/p37;->s:Lcom/daaw/y17;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/y17;->A(I)Lcom/daaw/d47;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/p37;->r:Lcom/daaw/b27;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
