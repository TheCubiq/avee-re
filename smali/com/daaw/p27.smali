.class public final Lcom/daaw/p27;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(I)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "initialArraySize"

    invoke-static {p0, v0}, Lcom/daaw/k07;->a(ILjava/lang/String;)I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method

.method public static b(Ljava/util/List;Lcom/daaw/ey6;)Ljava/util/List;
    .locals 1

    new-instance v0, Lcom/daaw/o27;

    invoke-direct {v0, p0, p1}, Lcom/daaw/o27;-><init>(Ljava/util/List;Lcom/daaw/ey6;)V

    return-object v0
.end method
