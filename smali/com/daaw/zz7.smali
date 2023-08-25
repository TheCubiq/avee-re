.class public final Lcom/daaw/zz7;
.super Lcom/daaw/rz7;
.source ""


# direct methods
.method public synthetic constructor <init>(ILcom/daaw/yz7;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/rz7;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lcom/daaw/m08;)Lcom/daaw/zz7;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/rz7;->a(Ljava/lang/Object;Lcom/daaw/m08;)Lcom/daaw/rz7;

    return-object p0
.end method

.method public final c()Lcom/daaw/a08;
    .locals 3

    new-instance v0, Lcom/daaw/a08;

    iget-object v1, p0, Lcom/daaw/rz7;->a:Ljava/util/LinkedHashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/a08;-><init>(Ljava/util/Map;Lcom/daaw/yz7;)V

    return-object v0
.end method
