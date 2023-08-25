.class public final Lcom/daaw/vf7;
.super Lcom/daaw/de7;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/wf7;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 2

    check-cast p1, Lcom/daaw/ci7;

    invoke-static {}, Lcom/daaw/zh7;->M()Lcom/daaw/yh7;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/yh7;->u(I)Lcom/daaw/yh7;

    invoke-virtual {p1}, Lcom/daaw/ci7;->L()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/vp7;->a(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/yh7;->s(Lcom/daaw/yq7;)Lcom/daaw/yh7;

    invoke-virtual {p1}, Lcom/daaw/ci7;->P()Lcom/daaw/ii7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/yh7;->t(Lcom/daaw/ii7;)Lcom/daaw/yh7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/zh7;

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/ci7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/ci7;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 7

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/ci7;->M()Lcom/daaw/bi7;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lcom/daaw/bi7;->s(I)Lcom/daaw/bi7;

    invoke-static {}, Lcom/daaw/ii7;->M()Lcom/daaw/ei7;

    move-result-object v4

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lcom/daaw/ei7;->s(I)Lcom/daaw/ei7;

    invoke-virtual {v4}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v4

    check-cast v4, Lcom/daaw/ii7;

    invoke-virtual {v2, v4}, Lcom/daaw/bi7;->t(Lcom/daaw/ii7;)Lcom/daaw/bi7;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v2

    check-cast v2, Lcom/daaw/ci7;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/ci7;->M()Lcom/daaw/bi7;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/daaw/bi7;->s(I)Lcom/daaw/bi7;

    invoke-static {}, Lcom/daaw/ii7;->M()Lcom/daaw/ei7;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/daaw/ei7;->s(I)Lcom/daaw/ei7;

    invoke-virtual {v6}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v6

    check-cast v6, Lcom/daaw/ii7;

    invoke-virtual {v2, v6}, Lcom/daaw/bi7;->t(Lcom/daaw/ii7;)Lcom/daaw/bi7;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v2

    check-cast v2, Lcom/daaw/ci7;

    invoke-direct {v1, v2, v4}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES256_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/ci7;->M()Lcom/daaw/bi7;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/daaw/bi7;->s(I)Lcom/daaw/bi7;

    invoke-static {}, Lcom/daaw/ii7;->M()Lcom/daaw/ei7;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/daaw/ei7;->s(I)Lcom/daaw/ei7;

    invoke-virtual {v3}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v3

    check-cast v3, Lcom/daaw/ii7;

    invoke-virtual {v2, v3}, Lcom/daaw/bi7;->t(Lcom/daaw/ii7;)Lcom/daaw/bi7;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v2

    check-cast v2, Lcom/daaw/ci7;

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES256_CMAC_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/daaw/xt7;)V
    .locals 1

    check-cast p1, Lcom/daaw/ci7;

    invoke-virtual {p1}, Lcom/daaw/ci7;->P()Lcom/daaw/ii7;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/wf7;->k(Lcom/daaw/ii7;)V

    invoke-virtual {p1}, Lcom/daaw/ci7;->L()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/wf7;->l(I)V

    return-void
.end method
