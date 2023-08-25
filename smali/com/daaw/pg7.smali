.class public final Lcom/daaw/pg7;
.super Lcom/daaw/de7;
.source ""


# instance fields
.field public final synthetic b:Lcom/daaw/qg7;


# direct methods
.method public constructor <init>(Lcom/daaw/qg7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pg7;->b:Lcom/daaw/qg7;

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 2

    check-cast p1, Lcom/daaw/rl7;

    invoke-static {}, Lcom/daaw/ll7;->M()Lcom/daaw/kl7;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/kl7;->u(I)Lcom/daaw/kl7;

    invoke-virtual {p1}, Lcom/daaw/rl7;->Q()Lcom/daaw/ul7;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/kl7;->t(Lcom/daaw/ul7;)Lcom/daaw/kl7;

    invoke-virtual {p1}, Lcom/daaw/rl7;->L()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/vp7;->a(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/kl7;->s(Lcom/daaw/yq7;)Lcom/daaw/kl7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/ll7;

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/rl7;->P(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/rl7;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 9

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x20

    const/16 v2, 0x10

    const/4 v3, 0x5

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v5

    const-string v6, "HMAC_SHA256_128BITTAG"

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x3

    invoke-static {v1, v2, v3, v5}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v6

    const-string v7, "HMAC_SHA256_128BITTAG_RAW"

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v1, v3, v4}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v6

    const-string v7, "HMAC_SHA256_256BITTAG"

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v1, v3, v5}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v3

    const-string v6, "HMAC_SHA256_256BITTAG_RAW"

    invoke-interface {v0, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0x40

    const/4 v6, 0x6

    invoke-static {v3, v2, v6, v4}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v7

    const-string v8, "HMAC_SHA512_128BITTAG"

    invoke-interface {v0, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v2, v6, v5}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v2

    const-string v7, "HMAC_SHA512_128BITTAG_RAW"

    invoke-interface {v0, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v1, v6, v4}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v2

    const-string v7, "HMAC_SHA512_256BITTAG"

    invoke-interface {v0, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v1, v6, v5}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "HMAC_SHA512_256BITTAG_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v3, v6, v4}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "HMAC_SHA512_512BITTAG"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v3, v6, v5}, Lcom/daaw/qg7;->m(IIII)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "HMAC_SHA512_512BITTAG_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/daaw/xt7;)V
    .locals 2

    check-cast p1, Lcom/daaw/rl7;

    invoke-virtual {p1}, Lcom/daaw/rl7;->L()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/rl7;->Q()Lcom/daaw/ul7;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/qg7;->k(Lcom/daaw/ul7;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
