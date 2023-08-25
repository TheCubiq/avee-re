.class public final Lcom/daaw/q98;
.super Lcom/daaw/ad2;
.source ""


# instance fields
.field public final r:Lcom/daaw/z42;


# direct methods
.method public constructor <init>(Lcom/daaw/z42;)V
    .locals 1

    const-string v0, "internal.eventLogger"

    invoke-direct {p0, v0}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/q98;->r:Lcom/daaw/z42;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ad2;->p:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {v0, v1, p2}, Lcom/daaw/ou7;->h(Ljava/lang/String;ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gl2;

    invoke-virtual {p1, v0}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/gl2;->zzi()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/gl2;

    invoke-virtual {p1, v1}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/gl2;->zzh()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/daaw/ou7;->a(D)D

    move-result-wide v1

    double-to-long v1, v1

    const/4 v3, 0x2

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/gl2;

    invoke-virtual {p1, p2}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object p1

    instance-of p2, p1, Lcom/daaw/th2;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/daaw/th2;

    invoke-static {p1}, Lcom/daaw/ou7;->g(Lcom/daaw/th2;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :goto_0
    iget-object p2, p0, Lcom/daaw/q98;->r:Lcom/daaw/z42;

    invoke-virtual {p2, v0, v1, v2, p1}, Lcom/daaw/z42;->e(Ljava/lang/String;JLjava/util/Map;)V

    sget-object p1, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    return-object p1
.end method
