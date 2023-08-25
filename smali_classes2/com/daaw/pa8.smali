.class public abstract Lcom/daaw/pa8;
.super Lcom/daaw/na8;
.source ""


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>(Lcom/daaw/yb8;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/na8;-><init>(Lcom/daaw/yb8;)V

    iget-object p1, p0, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {p1}, Lcom/daaw/yb8;->q()V

    return-void
.end method


# virtual methods
.method public final g()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/pa8;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/pa8;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/pa8;->k()Z

    iget-object v0, p0, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->l()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/pa8;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/pa8;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract k()Z
.end method
