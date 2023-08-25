.class public Lcom/daaw/ks0;
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
    .locals 1

    iget-object p1, p1, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-virtual {p1}, Lcom/daaw/sj;->b()Lcom/daaw/qs0;

    move-result-object p1

    sget-object v0, Lcom/daaw/qs0;->q:Lcom/daaw/qs0;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/daaw/os0;

    invoke-virtual {p0, p1}, Lcom/daaw/ks0;->i(Lcom/daaw/os0;)Z

    move-result p1

    return p1
.end method

.method public i(Lcom/daaw/os0;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_2

    invoke-virtual {p1}, Lcom/daaw/os0;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/os0;->d()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1

    :cond_2
    invoke-virtual {p1}, Lcom/daaw/os0;->a()Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method
