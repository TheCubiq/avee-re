.class public final Lcom/daaw/nc5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fn6;


# instance fields
.field public final p:Ljava/util/Map;

.field public final q:Lcom/daaw/x33;


# direct methods
.method public constructor <init>(Lcom/daaw/x33;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/nc5;->p:Ljava/util/Map;

    iput-object p1, p0, Lcom/daaw/nc5;->q:Lcom/daaw/x33;

    return-void
.end method


# virtual methods
.method public final A(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 1

    iget-object p2, p0, Lcom/daaw/nc5;->p:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/nc5;->q:Lcom/daaw/x33;

    iget-object v0, p0, Lcom/daaw/nc5;->p:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/mc5;

    iget p1, p1, Lcom/daaw/mc5;->a:I

    invoke-virtual {p2, p1}, Lcom/daaw/x33;->c(I)V

    :cond_0
    return-void
.end method

.method public final M(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 1

    iget-object p2, p0, Lcom/daaw/nc5;->p:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/nc5;->q:Lcom/daaw/x33;

    iget-object v0, p0, Lcom/daaw/nc5;->p:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/mc5;

    iget p1, p1, Lcom/daaw/mc5;->b:I

    invoke-virtual {p2, p1}, Lcom/daaw/x33;->c(I)V

    :cond_0
    return-void
.end method

.method public final S(Lcom/daaw/ym6;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/nc5;->p:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/nc5;->q:Lcom/daaw/x33;

    iget-object p3, p0, Lcom/daaw/nc5;->p:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/mc5;

    iget p1, p1, Lcom/daaw/mc5;->c:I

    invoke-virtual {p2, p1}, Lcom/daaw/x33;->c(I)V

    :cond_0
    return-void
.end method

.method public final k(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 0

    return-void
.end method
