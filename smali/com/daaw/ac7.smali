.class public final Lcom/daaw/ac7;
.super Lcom/daaw/de7;
.source ""


# instance fields
.field public final synthetic b:Lcom/daaw/bc7;


# direct methods
.method public constructor <init>(Lcom/daaw/bc7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ac7;->b:Lcom/daaw/bc7;

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 1

    check-cast p1, Lcom/daaw/bk7;

    invoke-static {}, Lcom/daaw/yj7;->M()Lcom/daaw/xj7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/bk7;->L()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/vp7;->a(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/xj7;->s(Lcom/daaw/yq7;)Lcom/daaw/xj7;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/daaw/xj7;->t(I)Lcom/daaw/xj7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/yj7;

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/bk7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/bk7;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/bk7;->M()Lcom/daaw/ak7;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v2, v3}, Lcom/daaw/ak7;->s(I)Lcom/daaw/ak7;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v2

    check-cast v2, Lcom/daaw/bk7;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES256_SIV"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/bk7;->M()Lcom/daaw/ak7;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/daaw/ak7;->s(I)Lcom/daaw/ak7;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v2

    check-cast v2, Lcom/daaw/bk7;

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES256_SIV_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/daaw/xt7;)V
    .locals 3

    check-cast p1, Lcom/daaw/bk7;

    invoke-virtual {p1}, Lcom/daaw/bk7;->L()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-virtual {p1}, Lcom/daaw/bk7;->L()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid key size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have 64 bytes."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
