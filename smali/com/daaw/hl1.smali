.class public Lcom/daaw/hl1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m41;
.implements Lcom/daaw/l41;


# instance fields
.field public a:Lcom/daaw/l41;

.field public b:Lcom/daaw/l41;

.field public c:Lcom/daaw/m41;


# direct methods
.method public constructor <init>(Lcom/daaw/m41;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hl1;->c:Lcom/daaw/m41;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/hl1;->l()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/hl1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->b()V

    iget-object v0, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->c()V

    iget-object v0, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->c()V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->clear()V

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->clear()V

    return-void
.end method

.method public d(Lcom/daaw/l41;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/hl1;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/hl1;->a()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f(Lcom/daaw/l41;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/hl1;->c:Lcom/daaw/m41;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lcom/daaw/m41;->f(Lcom/daaw/l41;)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-interface {p1}, Lcom/daaw/l41;->i()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-interface {p1}, Lcom/daaw/l41;->clear()V

    :cond_2
    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->g()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->isRunning()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->g()V

    :cond_1
    return-void
.end method

.method public h(Lcom/daaw/l41;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/hl1;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {p1}, Lcom/daaw/l41;->e()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public isRunning()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    invoke-interface {v0}, Lcom/daaw/l41;->isRunning()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->c:Lcom/daaw/m41;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/daaw/m41;->d(Lcom/daaw/l41;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->c:Lcom/daaw/m41;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/daaw/m41;->h(Lcom/daaw/l41;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/hl1;->c:Lcom/daaw/m41;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/m41;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m(Lcom/daaw/l41;Lcom/daaw/l41;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hl1;->a:Lcom/daaw/l41;

    iput-object p2, p0, Lcom/daaw/hl1;->b:Lcom/daaw/l41;

    return-void
.end method
