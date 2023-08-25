.class public final Lcom/daaw/gc7;
.super Lcom/daaw/de7;
.source ""


# instance fields
.field public final synthetic b:Lcom/daaw/hc7;


# direct methods
.method public constructor <init>(Lcom/daaw/hc7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gc7;->b:Lcom/daaw/hc7;

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 4

    check-cast p1, Lcom/daaw/sk7;

    invoke-virtual {p1}, Lcom/daaw/sk7;->O()Lcom/daaw/vk7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vk7;->P()Lcom/daaw/el7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/el7;->Q()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/tc7;->c(I)I

    move-result v0

    invoke-static {v0}, Lcom/daaw/cp7;->k(I)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/cp7;->c(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-static {}, Lcom/daaw/bl7;->N()Lcom/daaw/al7;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/daaw/al7;->t(I)Lcom/daaw/al7;

    invoke-virtual {p1}, Lcom/daaw/sk7;->O()Lcom/daaw/vk7;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/daaw/al7;->s(Lcom/daaw/vk7;)Lcom/daaw/al7;

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/daaw/al7;->u(Lcom/daaw/yq7;)Lcom/daaw/al7;

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/daaw/al7;->v(Lcom/daaw/yq7;)Lcom/daaw/al7;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/bl7;

    invoke-static {}, Lcom/daaw/yk7;->M()Lcom/daaw/xk7;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/daaw/xk7;->u(I)Lcom/daaw/xk7;

    invoke-virtual {v1, p1}, Lcom/daaw/xk7;->t(Lcom/daaw/bl7;)Lcom/daaw/xk7;

    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/xk7;->s(Lcom/daaw/yq7;)Lcom/daaw/xk7;

    invoke-virtual {v1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/yk7;

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/sk7;->N(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/sk7;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AES128_GCM"

    invoke-static {v1}, Lcom/daaw/x87;->a(Ljava/lang/String;)Lcom/daaw/w87;

    move-result-object v5

    invoke-static {}, Lcom/daaw/hc7;->k()[B

    move-result-object v6

    const/4 v2, 0x4

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v7, 0x1

    invoke-static/range {v2 .. v7}, Lcom/daaw/hc7;->l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/daaw/x87;->a(Ljava/lang/String;)Lcom/daaw/w87;

    move-result-object v7

    invoke-static {}, Lcom/daaw/hc7;->k()[B

    move-result-object v8

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v9, 0x3

    invoke-static/range {v4 .. v9}, Lcom/daaw/hc7;->l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/daaw/x87;->a(Ljava/lang/String;)Lcom/daaw/w87;

    move-result-object v7

    invoke-static {}, Lcom/daaw/hc7;->k()[B

    move-result-object v8

    const/4 v6, 0x4

    const/4 v9, 0x1

    invoke-static/range {v4 .. v9}, Lcom/daaw/hc7;->l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;

    move-result-object v2

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/daaw/x87;->a(Ljava/lang/String;)Lcom/daaw/w87;

    move-result-object v7

    invoke-static {}, Lcom/daaw/hc7;->k()[B

    move-result-object v8

    const/4 v9, 0x3

    invoke-static/range {v4 .. v9}, Lcom/daaw/hc7;->l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;

    move-result-object v2

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/daaw/x87;->a(Ljava/lang/String;)Lcom/daaw/w87;

    move-result-object v7

    invoke-static {}, Lcom/daaw/hc7;->k()[B

    move-result-object v8

    invoke-static/range {v4 .. v9}, Lcom/daaw/hc7;->l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES128_CTR_HMAC_SHA256"

    invoke-static {v1}, Lcom/daaw/x87;->a(Ljava/lang/String;)Lcom/daaw/w87;

    move-result-object v5

    invoke-static {}, Lcom/daaw/hc7;->k()[B

    move-result-object v6

    const/4 v2, 0x4

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v7, 0x1

    invoke-static/range {v2 .. v7}, Lcom/daaw/hc7;->l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/daaw/x87;->a(Ljava/lang/String;)Lcom/daaw/w87;

    move-result-object v7

    invoke-static {}, Lcom/daaw/hc7;->k()[B

    move-result-object v8

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v6, 0x3

    invoke-static/range {v4 .. v9}, Lcom/daaw/hc7;->l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/daaw/x87;->a(Ljava/lang/String;)Lcom/daaw/w87;

    move-result-object v7

    invoke-static {}, Lcom/daaw/hc7;->k()[B

    move-result-object v8

    const/4 v6, 0x4

    const/4 v9, 0x1

    invoke-static/range {v4 .. v9}, Lcom/daaw/hc7;->l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;

    move-result-object v2

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/daaw/x87;->a(Ljava/lang/String;)Lcom/daaw/w87;

    move-result-object v7

    invoke-static {}, Lcom/daaw/hc7;->k()[B

    move-result-object v8

    const/4 v9, 0x3

    invoke-static/range {v4 .. v9}, Lcom/daaw/hc7;->l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic d(Lcom/daaw/xt7;)V
    .locals 0

    check-cast p1, Lcom/daaw/sk7;

    invoke-virtual {p1}, Lcom/daaw/sk7;->O()Lcom/daaw/vk7;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/tc7;->a(Lcom/daaw/vk7;)V

    return-void
.end method
