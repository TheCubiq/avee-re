.class public Lcom/daaw/fs7;
.super Lcom/daaw/gq7;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/daaw/ls7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/daaw/fs7<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/daaw/gq7<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/ls7;

.field public q:Lcom/daaw/ls7;


# direct methods
.method public constructor <init>(Lcom/daaw/ls7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/gq7;-><init>()V

    iput-object p1, p0, Lcom/daaw/fs7;->p:Lcom/daaw/ls7;

    invoke-virtual {p1}, Lcom/daaw/ls7;->F()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/ls7;->n()Lcom/daaw/ls7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/daaw/cv7;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->j()Lcom/daaw/fs7;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/daaw/fs7;
    .locals 3

    iget-object v0, p0, Lcom/daaw/fs7;->p:Lcom/daaw/ls7;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/daaw/ls7;->I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/fs7;

    invoke-virtual {p0}, Lcom/daaw/fs7;->o()Lcom/daaw/ls7;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    return-object v0
.end method

.method public final k(Lcom/daaw/ls7;)Lcom/daaw/fs7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fs7;->p:Lcom/daaw/ls7;

    invoke-virtual {v0, p1}, Lcom/daaw/ls7;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->F()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/fs7;->r()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    invoke-static {v0, p1}, Lcom/daaw/fs7;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public bridge synthetic l()Lcom/daaw/xt7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->o()Lcom/daaw/ls7;

    move-result-object v0

    return-object v0
.end method

.method public final m([BIILcom/daaw/vr7;)Lcom/daaw/fs7;
    .locals 7

    iget-object p2, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    invoke-virtual {p2}, Lcom/daaw/ls7;->F()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/fs7;->r()V

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    new-instance v6, Lcom/daaw/kq7;

    invoke-direct {v6, p4}, Lcom/daaw/kq7;-><init>(Lcom/daaw/vr7;)V

    const/4 v4, 0x0

    move-object v3, p1

    move v5, p3

    invoke-interface/range {v1 .. v6}, Lcom/daaw/cv7;->g(Ljava/lang/Object;[BIILcom/daaw/kq7;)V
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Reading from byte array should not throw IOException."

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    throw p1
.end method

.method public final n()Lcom/daaw/ls7;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/fs7;->o()Lcom/daaw/ls7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ls7;->E()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/daaw/sv7;

    invoke-direct {v1, v0}, Lcom/daaw/sv7;-><init>(Lcom/daaw/xt7;)V

    throw v1
.end method

.method public o()Lcom/daaw/ls7;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->F()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->A()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    return-object v0
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->F()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/fs7;->r()V

    :cond_0
    return-void
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fs7;->p:Lcom/daaw/ls7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->n()Lcom/daaw/ls7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    invoke-static {v0, v1}, Lcom/daaw/fs7;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    return-void
.end method
