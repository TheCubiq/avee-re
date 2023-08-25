.class public Lcom/daaw/mz6;
.super Lcom/daaw/g07;
.source ""

# interfaces
.implements Lcom/daaw/m27;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/g07;-><init>(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1

    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/g07;->o(Ljava/lang/Object;Ljava/util/List;Lcom/daaw/d07;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
