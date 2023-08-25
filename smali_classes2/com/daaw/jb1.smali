.class public Lcom/daaw/jb1;
.super Lcom/daaw/ib1;
.source ""


# direct methods
.method public static final a(Ljava/util/Iterator;)Lcom/daaw/eb1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Lcom/daaw/eb1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/jb1$a;

    invoke-direct {v0, p0}, Lcom/daaw/jb1$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, Lcom/daaw/jb1;->b(Lcom/daaw/eb1;)Lcom/daaw/eb1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/daaw/eb1;)Lcom/daaw/eb1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/eb1<",
            "+TT;>;)",
            "Lcom/daaw/eb1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/daaw/kj;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/kj;

    invoke-direct {v0, p0}, Lcom/daaw/kj;-><init>(Lcom/daaw/eb1;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
