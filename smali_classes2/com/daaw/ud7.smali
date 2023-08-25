.class public abstract Lcom/daaw/ud7;
.super Lcom/daaw/rc7;
.source ""


# instance fields
.field public b:Z


# direct methods
.method public constructor <init>(Lcom/daaw/dr6;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/rc7;-><init>(Lcom/daaw/dr6;)V

    iget-object p1, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->g()V

    return-void
.end method


# virtual methods
.method public g()V
    .locals 0

    return-void
.end method

.method public abstract h()Z
.end method

.method public final j()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ud7;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ud7;->b:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ud7;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->e()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ud7;->b:Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ud7;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ud7;->g()V

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->e()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ud7;->b:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ud7;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
