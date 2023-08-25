.class public final Lcom/daaw/t93;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lcom/daaw/v93;


# direct methods
.method public constructor <init>(Lcom/daaw/v93;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/t93;->b:Lcom/daaw/v93;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/t93;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/v93;
    .locals 1

    iget-object v0, p0, Lcom/daaw/t93;->b:Lcom/daaw/v93;

    return-object v0
.end method

.method public final b(Ljava/lang/String;Lcom/daaw/s93;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/t93;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/t93;->b:Lcom/daaw/v93;

    iget-object v1, p0, Lcom/daaw/t93;->a:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/s93;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2, p3, p4, v1}, Lcom/daaw/v93;->e(Lcom/daaw/s93;J[Ljava/lang/String;)Z

    :cond_0
    iget-object p2, p0, Lcom/daaw/t93;->a:Ljava/util/Map;

    new-instance v0, Lcom/daaw/s93;

    const/4 v1, 0x0

    invoke-direct {v0, p3, p4, v1, v1}, Lcom/daaw/s93;-><init>(JLjava/lang/String;Lcom/daaw/s93;)V

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
