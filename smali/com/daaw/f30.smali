.class public final Lcom/daaw/f30;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/qn1;)Lcom/daaw/sn1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/qn1<",
            "*>;)",
            "Lcom/daaw/sn1;"
        }
    .end annotation

    instance-of v0, p0, Lcom/daaw/vn1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/vn1;

    invoke-virtual {p0}, Lcom/daaw/vn1;->b()Lcom/daaw/sn1;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected instance of TransportImpl."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lcom/daaw/qn1;Lcom/daaw/cz0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/qn1<",
            "*>;",
            "Lcom/daaw/cz0;",
            ")V"
        }
    .end annotation

    invoke-static {p0}, Lcom/daaw/f30;->a(Lcom/daaw/qn1;)Lcom/daaw/sn1;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/daaw/sn1;->f(Lcom/daaw/cz0;)Lcom/daaw/sn1;

    move-result-object p0

    invoke-static {}, Lcom/daaw/xn1;->c()Lcom/daaw/xn1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/xn1;->e()Lcom/daaw/eq1;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lcom/daaw/eq1;->u(Lcom/daaw/sn1;I)Lcom/daaw/da;

    return-void
.end method
