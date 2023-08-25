.class public Lcom/daaw/y98;
.super Lcom/daaw/t48;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/daaw/ja8<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/daaw/y98<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/daaw/t48<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/ja8;

.field public q:Lcom/daaw/ja8;


# direct methods
.method public constructor <init>(Lcom/daaw/ja8;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/t48;-><init>()V

    iput-object p1, p0, Lcom/daaw/y98;->p:Lcom/daaw/ja8;

    invoke-virtual {p1}, Lcom/daaw/ja8;->x()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/ja8;->k()Lcom/daaw/ja8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static i(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/daaw/pe8;->a()Lcom/daaw/pe8;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/pe8;->b(Ljava/lang/Class;)Lcom/daaw/ve8;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/daaw/ve8;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->r()Lcom/daaw/y98;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic e([BII)Lcom/daaw/t48;
    .locals 1

    sget-object p2, Lcom/daaw/l88;->c:Lcom/daaw/l88;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p3, p2}, Lcom/daaw/y98;->k([BIILcom/daaw/l88;)Lcom/daaw/y98;

    return-object p0
.end method

.method public final bridge synthetic f([BIILcom/daaw/l88;)Lcom/daaw/t48;
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/y98;->k([BIILcom/daaw/l88;)Lcom/daaw/y98;

    return-object p0
.end method

.method public final j(Lcom/daaw/ja8;)Lcom/daaw/y98;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->p:Lcom/daaw/ja8;

    invoke-virtual {v0, p1}, Lcom/daaw/ja8;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    invoke-virtual {v0}, Lcom/daaw/ja8;->x()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/y98;->p()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    invoke-static {v0, p1}, Lcom/daaw/y98;->i(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final k([BIILcom/daaw/l88;)Lcom/daaw/y98;
    .locals 7

    iget-object p2, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    invoke-virtual {p2}, Lcom/daaw/ja8;->x()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/y98;->p()V

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/daaw/pe8;->a()Lcom/daaw/pe8;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/pe8;->b(Ljava/lang/Class;)Lcom/daaw/ve8;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    new-instance v6, Lcom/daaw/e58;

    invoke-direct {v6, p4}, Lcom/daaw/e58;-><init>(Lcom/daaw/l88;)V

    const/4 v4, 0x0

    move-object v3, p1

    move v5, p3

    invoke-interface/range {v1 .. v6}, Lcom/daaw/ve8;->g(Ljava/lang/Object;[BIILcom/daaw/e58;)V
    :try_end_0
    .catch Lcom/daaw/mb8; {:try_start_0 .. :try_end_0} :catch_2
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
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    throw p1
.end method

.method public final m()Lcom/daaw/ja8;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/y98;->n()Lcom/daaw/ja8;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/daaw/ja8;->C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Byte;

    invoke-virtual {v3}, Ljava/lang/Byte;->byteValue()B

    move-result v3

    if-ne v3, v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v3, :cond_2

    invoke-static {}, Lcom/daaw/pe8;->a()Lcom/daaw/pe8;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/daaw/pe8;->b(Ljava/lang/Class;)Lcom/daaw/ve8;

    move-result-object v3

    invoke-interface {v3, v0}, Lcom/daaw/ve8;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eq v1, v3, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    const/4 v4, 0x2

    invoke-virtual {v0, v4, v1, v2}, Lcom/daaw/ja8;->C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_2

    :goto_1
    return-object v0

    :cond_2
    new-instance v1, Lcom/daaw/mg8;

    invoke-direct {v1, v0}, Lcom/daaw/mg8;-><init>(Lcom/daaw/zd8;)V

    throw v1
.end method

.method public n()Lcom/daaw/ja8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    invoke-virtual {v0}, Lcom/daaw/ja8;->x()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    invoke-virtual {v0}, Lcom/daaw/ja8;->t()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    return-object v0
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    invoke-virtual {v0}, Lcom/daaw/ja8;->x()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/y98;->p()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y98;->p:Lcom/daaw/ja8;

    invoke-virtual {v0}, Lcom/daaw/ja8;->k()Lcom/daaw/ja8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    invoke-static {v0, v1}, Lcom/daaw/y98;->i(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    return-void
.end method

.method public bridge synthetic q()Lcom/daaw/zd8;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->n()Lcom/daaw/ja8;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/daaw/y98;
    .locals 3

    iget-object v0, p0, Lcom/daaw/y98;->p:Lcom/daaw/ja8;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/daaw/ja8;->C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/y98;

    invoke-virtual {p0}, Lcom/daaw/y98;->n()Lcom/daaw/ja8;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    return-object v0
.end method
