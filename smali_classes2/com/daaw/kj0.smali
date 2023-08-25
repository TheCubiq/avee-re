.class public Lcom/daaw/kj0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/kj0$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Lcom/daaw/kj0$a;Lcom/daaw/bi;)Lcom/daaw/ij0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/kj0;->d(Ljava/lang/String;Lcom/daaw/kj0$a;Lcom/daaw/bi;)Lcom/daaw/ij0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/vh;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/vh<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/daaw/ij0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ij0;

    move-result-object p0

    const-class p1, Lcom/daaw/ij0;

    invoke-static {p0, p1}, Lcom/daaw/vh;->l(Ljava/lang/Object;Ljava/lang/Class;)Lcom/daaw/vh;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lcom/daaw/kj0$a;)Lcom/daaw/vh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/kj0$a<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/daaw/vh<",
            "*>;"
        }
    .end annotation

    const-class v0, Lcom/daaw/ij0;

    invoke-static {v0}, Lcom/daaw/vh;->m(Ljava/lang/Class;)Lcom/daaw/vh$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lcom/daaw/ys;->j(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v0

    new-instance v1, Lcom/daaw/jj0;

    invoke-direct {v1, p0, p1}, Lcom/daaw/jj0;-><init>(Ljava/lang/String;Lcom/daaw/kj0$a;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lcom/daaw/kj0$a;Lcom/daaw/bi;)Lcom/daaw/ij0;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Lcom/daaw/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lcom/daaw/kj0$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/daaw/ij0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ij0;

    move-result-object p0

    return-object p0
.end method
