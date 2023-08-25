.class public final Lcom/daaw/mr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ao0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/mr$a;
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/gf1;

.field public final q:Lcom/daaw/mr$a;

.field public r:Lcom/daaw/a41;

.field public s:Lcom/daaw/ao0;


# direct methods
.method public constructor <init>(Lcom/daaw/mr$a;Lcom/daaw/zf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mr;->q:Lcom/daaw/mr$a;

    new-instance p1, Lcom/daaw/gf1;

    invoke-direct {p1, p2}, Lcom/daaw/gf1;-><init>(Lcom/daaw/zf;)V

    iput-object p1, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/mr;->s:Lcom/daaw/ao0;

    invoke-interface {v0}, Lcom/daaw/ao0;->o()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v2, v0, v1}, Lcom/daaw/gf1;->a(J)V

    iget-object v0, p0, Lcom/daaw/mr;->s:Lcom/daaw/ao0;

    invoke-interface {v0}, Lcom/daaw/ao0;->h()Lcom/daaw/zw0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v1}, Lcom/daaw/gf1;->h()Lcom/daaw/zw0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/zw0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v1, v0}, Lcom/daaw/gf1;->f(Lcom/daaw/zw0;)Lcom/daaw/zw0;

    iget-object v1, p0, Lcom/daaw/mr;->q:Lcom/daaw/mr$a;

    invoke-interface {v1, v0}, Lcom/daaw/mr$a;->c(Lcom/daaw/zw0;)V

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/mr;->r:Lcom/daaw/a41;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/a41;->c()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/mr;->r:Lcom/daaw/a41;

    invoke-interface {v0}, Lcom/daaw/a41;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/mr;->r:Lcom/daaw/a41;

    invoke-interface {v0}, Lcom/daaw/a41;->j()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Lcom/daaw/a41;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mr;->r:Lcom/daaw/a41;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/mr;->s:Lcom/daaw/ao0;

    iput-object p1, p0, Lcom/daaw/mr;->r:Lcom/daaw/a41;

    :cond_0
    return-void
.end method

.method public d(Lcom/daaw/a41;)V
    .locals 2

    invoke-interface {p1}, Lcom/daaw/a41;->v()Lcom/daaw/ao0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/mr;->s:Lcom/daaw/ao0;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    iput-object v0, p0, Lcom/daaw/mr;->s:Lcom/daaw/ao0;

    iput-object p1, p0, Lcom/daaw/mr;->r:Lcom/daaw/a41;

    iget-object p1, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {p1}, Lcom/daaw/gf1;->h()Lcom/daaw/zw0;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/ao0;->f(Lcom/daaw/zw0;)Lcom/daaw/zw0;

    invoke-virtual {p0}, Lcom/daaw/mr;->a()V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/qz;->c(Ljava/lang/RuntimeException;)Lcom/daaw/qz;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public e(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/gf1;->a(J)V

    return-void
.end method

.method public f(Lcom/daaw/zw0;)Lcom/daaw/zw0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mr;->s:Lcom/daaw/ao0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/daaw/ao0;->f(Lcom/daaw/zw0;)Lcom/daaw/zw0;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v0, p1}, Lcom/daaw/gf1;->f(Lcom/daaw/zw0;)Lcom/daaw/zw0;

    iget-object v0, p0, Lcom/daaw/mr;->q:Lcom/daaw/mr$a;

    invoke-interface {v0, p1}, Lcom/daaw/mr$a;->c(Lcom/daaw/zw0;)V

    return-object p1
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v0}, Lcom/daaw/gf1;->b()V

    return-void
.end method

.method public h()Lcom/daaw/zw0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mr;->s:Lcom/daaw/ao0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/ao0;->h()Lcom/daaw/zw0;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v0}, Lcom/daaw/gf1;->h()Lcom/daaw/zw0;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v0}, Lcom/daaw/gf1;->c()V

    return-void
.end method

.method public j()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/mr;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/mr;->a()V

    iget-object v0, p0, Lcom/daaw/mr;->s:Lcom/daaw/ao0;

    invoke-interface {v0}, Lcom/daaw/ao0;->o()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v0}, Lcom/daaw/gf1;->o()J

    move-result-wide v0

    return-wide v0
.end method

.method public o()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/mr;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/mr;->s:Lcom/daaw/ao0;

    invoke-interface {v0}, Lcom/daaw/ao0;->o()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/mr;->p:Lcom/daaw/gf1;

    invoke-virtual {v0}, Lcom/daaw/gf1;->o()J

    move-result-wide v0

    return-wide v0
.end method
