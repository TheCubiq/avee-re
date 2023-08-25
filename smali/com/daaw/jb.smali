.class public Lcom/daaw/jb;
.super Lcom/daaw/mj;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/mj<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/wj1;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/daaw/ym1;->c(Landroid/content/Context;Lcom/daaw/wj1;)Lcom/daaw/ym1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ym1;->a()Lcom/daaw/kb;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/mj;-><init>(Lcom/daaw/pj;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/daaw/qy1;)Z
    .locals 0

    iget-object p1, p1, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-virtual {p1}, Lcom/daaw/sj;->g()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/daaw/jb;->i(Ljava/lang/Boolean;)Z

    move-result p1

    return p1
.end method

.method public i(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
