.class public Lcom/daaw/rs0;
.super Lcom/daaw/mj;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/mj<",
        "Lcom/daaw/os0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/wj1;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/daaw/ym1;->c(Landroid/content/Context;Lcom/daaw/wj1;)Lcom/daaw/ym1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ym1;->d()Lcom/daaw/ps0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/mj;-><init>(Lcom/daaw/pj;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/daaw/qy1;)Z
    .locals 2

    iget-object v0, p1, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-virtual {v0}, Lcom/daaw/sj;->b()Lcom/daaw/qs0;

    move-result-object v0

    sget-object v1, Lcom/daaw/qs0;->r:Lcom/daaw/qs0;

    if-eq v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object p1, p1, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-virtual {p1}, Lcom/daaw/sj;->b()Lcom/daaw/qs0;

    move-result-object p1

    sget-object v0, Lcom/daaw/qs0;->u:Lcom/daaw/qs0;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/daaw/os0;

    invoke-virtual {p0, p1}, Lcom/daaw/rs0;->i(Lcom/daaw/os0;)Z

    move-result p1

    return p1
.end method

.method public i(Lcom/daaw/os0;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/os0;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/os0;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
