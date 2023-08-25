.class public final Lcom/daaw/wa7;
.super Lcom/daaw/de7;
.source ""


# instance fields
.field public final synthetic b:Lcom/daaw/xa7;


# direct methods
.method public constructor <init>(Lcom/daaw/xa7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wa7;->b:Lcom/daaw/xa7;

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 1

    check-cast p1, Lcom/daaw/hk7;

    invoke-static {}, Lcom/daaw/ek7;->M()Lcom/daaw/dk7;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/dk7;->t(I)Lcom/daaw/dk7;

    const/16 v0, 0x20

    invoke-static {v0}, Lcom/daaw/vp7;->a(I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/dk7;->s(Lcom/daaw/yq7;)Lcom/daaw/dk7;

    invoke-virtual {p1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/ek7;

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/hk7;->N(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/hk7;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/hk7;->M()Lcom/daaw/hk7;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "CHACHA20_POLY1305"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/hk7;->M()Lcom/daaw/hk7;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "CHACHA20_POLY1305_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/daaw/xt7;)V
    .locals 0

    check-cast p1, Lcom/daaw/hk7;

    return-void
.end method
