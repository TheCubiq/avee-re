.class public final Lcom/daaw/na7;
.super Lcom/daaw/de7;
.source ""


# instance fields
.field public final synthetic b:Lcom/daaw/oa7;


# direct methods
.method public constructor <init>(Lcom/daaw/oa7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/na7;->b:Lcom/daaw/oa7;

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 2

    check-cast p1, Lcom/daaw/dj7;

    invoke-static {}, Lcom/daaw/aj7;->M()Lcom/daaw/zi7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/dj7;->L()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/vp7;->a(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/zi7;->s(Lcom/daaw/yq7;)Lcom/daaw/zi7;

    invoke-virtual {p1}, Lcom/daaw/dj7;->P()Lcom/daaw/gj7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/zi7;->t(Lcom/daaw/gj7;)Lcom/daaw/zi7;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/daaw/zi7;->u(I)Lcom/daaw/zi7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/aj7;

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/dj7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/dj7;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 6

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x10

    const/4 v2, 0x1

    invoke-static {v1, v1, v2}, Lcom/daaw/oa7;->k(III)Lcom/daaw/ce7;

    move-result-object v3

    const-string v4, "AES128_EAX"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v1, v1, v3}, Lcom/daaw/oa7;->k(III)Lcom/daaw/ce7;

    move-result-object v4

    const-string v5, "AES128_EAX_RAW"

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x20

    invoke-static {v4, v1, v2}, Lcom/daaw/oa7;->k(III)Lcom/daaw/ce7;

    move-result-object v2

    const-string v5, "AES256_EAX"

    invoke-interface {v0, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4, v1, v3}, Lcom/daaw/oa7;->k(III)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "AES256_EAX_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/daaw/xt7;)V
    .locals 2

    check-cast p1, Lcom/daaw/dj7;

    invoke-virtual {p1}, Lcom/daaw/dj7;->L()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/xp7;->a(I)V

    invoke-virtual {p1}, Lcom/daaw/dj7;->P()Lcom/daaw/gj7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/gj7;->L()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/dj7;->P()Lcom/daaw/gj7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/gj7;->L()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
