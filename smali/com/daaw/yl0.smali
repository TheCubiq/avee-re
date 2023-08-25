.class public Lcom/daaw/yl0;
.super Lcom/daaw/vl0;
.source ""

# interfaces
.implements Lcom/daaw/ep0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/vl0<",
        "Lcom/daaw/hi0;",
        "Lcom/daaw/z41<",
        "*>;>;",
        "Lcom/daaw/ep0;"
    }
.end annotation


# instance fields
.field public e:Lcom/daaw/ep0$a;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/vl0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/daaw/hi0;Lcom/daaw/z41;)Lcom/daaw/z41;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/vl0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/z41;

    return-object p1
.end method

.method public bridge synthetic b(Lcom/daaw/hi0;)Lcom/daaw/z41;
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/vl0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/z41;

    return-object p1
.end method

.method public c(I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    const/16 v0, 0x3c

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/vl0;->d()V

    goto :goto_0

    :cond_0
    const/16 v0, 0x28

    if-lt p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/vl0;->h()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/daaw/vl0;->m(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lcom/daaw/ep0$a;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yl0;->e:Lcom/daaw/ep0$a;

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/z41;

    invoke-virtual {p0, p1}, Lcom/daaw/yl0;->n(Lcom/daaw/z41;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/hi0;

    check-cast p2, Lcom/daaw/z41;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yl0;->o(Lcom/daaw/hi0;Lcom/daaw/z41;)V

    return-void
.end method

.method public n(Lcom/daaw/z41;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "*>;)I"
        }
    .end annotation

    invoke-interface {p1}, Lcom/daaw/z41;->a()I

    move-result p1

    return p1
.end method

.method public o(Lcom/daaw/hi0;Lcom/daaw/z41;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hi0;",
            "Lcom/daaw/z41<",
            "*>;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/yl0;->e:Lcom/daaw/ep0$a;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/daaw/ep0$a;->d(Lcom/daaw/z41;)V

    :cond_0
    return-void
.end method
