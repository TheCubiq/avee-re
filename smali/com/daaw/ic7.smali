.class public final Lcom/daaw/ic7;
.super Lcom/daaw/cf7;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/cf7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Lcom/daaw/bl7;

    invoke-virtual {p1}, Lcom/daaw/bl7;->M()Lcom/daaw/vk7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vk7;->P()Lcom/daaw/el7;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/el7;->Q()I

    move-result v2

    invoke-static {v2}, Lcom/daaw/tc7;->c(I)I

    move-result v2

    invoke-virtual {p1}, Lcom/daaw/bl7;->R()Lcom/daaw/yq7;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/yq7;->j()[B

    move-result-object v3

    invoke-virtual {p1}, Lcom/daaw/bl7;->S()Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/yq7;->j()[B

    move-result-object p1

    invoke-static {v2, v3, p1}, Lcom/daaw/cp7;->i(I[B[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v5

    new-instance v9, Lcom/daaw/uc7;

    invoke-virtual {v0}, Lcom/daaw/vk7;->L()Lcom/daaw/pk7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/pk7;->O()Lcom/daaw/vm7;

    move-result-object p1

    invoke-direct {v9, p1}, Lcom/daaw/uc7;-><init>(Lcom/daaw/vm7;)V

    new-instance p1, Lcom/daaw/vo7;

    invoke-virtual {v1}, Lcom/daaw/el7;->O()Lcom/daaw/yq7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/yq7;->j()[B

    move-result-object v6

    invoke-virtual {v1}, Lcom/daaw/el7;->R()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/tc7;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/daaw/vk7;->S()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/tc7;->d(I)I

    move-result v8

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lcom/daaw/vo7;-><init>(Ljava/security/interfaces/ECPublicKey;[BLjava/lang/String;ILcom/daaw/to7;)V

    return-object p1
.end method
