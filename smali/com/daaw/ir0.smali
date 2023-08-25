.class public final Lcom/daaw/ir0;
.super Lcom/daaw/hn;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/daaw/ir0;-><init>(Lcom/daaw/hn;ILcom/daaw/pq;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/hn;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/daaw/hn;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/hn;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/hn;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/hn;ILcom/daaw/pq;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lcom/daaw/hn$a;->b:Lcom/daaw/hn$a;

    :cond_0
    invoke-direct {p0, p1}, Lcom/daaw/ir0;-><init>(Lcom/daaw/hn;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/daaw/hn$b;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/hn$b<",
            "TT;>;TT;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/hn;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
