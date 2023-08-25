.class public final Lcom/daaw/ta7;
.super Lcom/daaw/de7;
.source ""


# instance fields
.field public final synthetic b:Lcom/daaw/ua7;


# direct methods
.method public constructor <init>(Lcom/daaw/ua7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ta7;->b:Lcom/daaw/ua7;

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 1

    check-cast p1, Lcom/daaw/vj7;

    invoke-static {}, Lcom/daaw/sj7;->M()Lcom/daaw/rj7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/vj7;->L()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/vp7;->a(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/rj7;->s(Lcom/daaw/yq7;)Lcom/daaw/rj7;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/daaw/rj7;->t(I)Lcom/daaw/rj7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/sj7;

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/vj7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/vj7;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x10

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/daaw/ua7;->l(II)Lcom/daaw/ce7;

    move-result-object v3

    const-string v4, "AES128_GCM_SIV"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v1, v3}, Lcom/daaw/ua7;->l(II)Lcom/daaw/ce7;

    move-result-object v1

    const-string v4, "AES128_GCM_SIV_RAW"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x20

    invoke-static {v1, v2}, Lcom/daaw/ua7;->l(II)Lcom/daaw/ce7;

    move-result-object v2

    const-string v4, "AES256_GCM_SIV"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v3}, Lcom/daaw/ua7;->l(II)Lcom/daaw/ce7;

    move-result-object v1

    const-string v2, "AES256_GCM_SIV_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic d(Lcom/daaw/xt7;)V
    .locals 0

    check-cast p1, Lcom/daaw/vj7;

    invoke-virtual {p1}, Lcom/daaw/vj7;->L()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/xp7;->a(I)V

    return-void
.end method
