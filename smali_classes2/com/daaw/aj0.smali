.class public Lcom/daaw/aj0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lcom/daaw/x40;)Lcom/daaw/wi0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/x40<",
            "+TT;>;)",
            "Lcom/daaw/wi0<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/si1;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lcom/daaw/si1;-><init>(Lcom/daaw/x40;Ljava/lang/Object;ILcom/daaw/pq;)V

    return-object v0
.end method
