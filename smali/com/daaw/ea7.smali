.class public final Lcom/daaw/ea7;
.super Lcom/daaw/de7;
.source ""


# instance fields
.field public final synthetic b:Lcom/daaw/fa7;


# direct methods
.method public constructor <init>(Lcom/daaw/fa7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ea7;->b:Lcom/daaw/fa7;

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 2

    check-cast p1, Lcom/daaw/oi7;

    new-instance v0, Lcom/daaw/ia7;

    invoke-direct {v0}, Lcom/daaw/ia7;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/oi7;->O()Lcom/daaw/ui7;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ha7;->g(Lcom/daaw/ui7;)Lcom/daaw/ri7;

    move-result-object v0

    new-instance v1, Lcom/daaw/qg7;

    invoke-direct {v1}, Lcom/daaw/qg7;-><init>()V

    invoke-virtual {v1}, Lcom/daaw/ee7;->a()Lcom/daaw/de7;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/oi7;->P()Lcom/daaw/rl7;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/de7;->a(Lcom/daaw/xt7;)Lcom/daaw/xt7;

    move-result-object p1

    invoke-static {}, Lcom/daaw/li7;->M()Lcom/daaw/ki7;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/ki7;->s(Lcom/daaw/ri7;)Lcom/daaw/ki7;

    check-cast p1, Lcom/daaw/ll7;

    invoke-virtual {v1, p1}, Lcom/daaw/ki7;->t(Lcom/daaw/ll7;)Lcom/daaw/ki7;

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lcom/daaw/ki7;->u(I)Lcom/daaw/ki7;

    invoke-virtual {v1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/li7;

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/oi7;->N(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/oi7;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 9

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x10

    const/16 v2, 0x10

    const/16 v3, 0x20

    const/16 v4, 0x10

    const/4 v5, 0x5

    const/4 v6, 0x1

    invoke-static/range {v1 .. v6}, Lcom/daaw/fa7;->k(IIIIII)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0x10

    const/16 v5, 0x20

    const/16 v6, 0x10

    const/4 v7, 0x5

    const/4 v8, 0x3

    invoke-static/range {v3 .. v8}, Lcom/daaw/fa7;->k(IIIIII)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0x20

    const/16 v6, 0x20

    const/4 v8, 0x1

    invoke-static/range {v3 .. v8}, Lcom/daaw/fa7;->k(IIIIII)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x3

    invoke-static/range {v3 .. v8}, Lcom/daaw/fa7;->k(IIIIII)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/daaw/xt7;)V
    .locals 2

    check-cast p1, Lcom/daaw/oi7;

    new-instance v0, Lcom/daaw/ia7;

    invoke-direct {v0}, Lcom/daaw/ia7;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/ee7;->a()Lcom/daaw/de7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/oi7;->O()Lcom/daaw/ui7;

    move-result-object v1

    check-cast v0, Lcom/daaw/ha7;

    invoke-virtual {v0, v1}, Lcom/daaw/ha7;->f(Lcom/daaw/ui7;)V

    new-instance v0, Lcom/daaw/qg7;

    invoke-direct {v0}, Lcom/daaw/qg7;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/ee7;->a()Lcom/daaw/de7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/oi7;->P()Lcom/daaw/rl7;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/de7;->d(Lcom/daaw/xt7;)V

    invoke-virtual {p1}, Lcom/daaw/oi7;->O()Lcom/daaw/ui7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ui7;->L()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/xp7;->a(I)V

    return-void
.end method
