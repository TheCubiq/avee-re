.class public final Lcom/daaw/fc7;
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
    .locals 9

    check-cast p1, Lcom/daaw/yk7;

    invoke-virtual {p1}, Lcom/daaw/yk7;->P()Lcom/daaw/bl7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/bl7;->M()Lcom/daaw/vk7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vk7;->P()Lcom/daaw/el7;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/el7;->Q()I

    move-result v2

    invoke-static {v2}, Lcom/daaw/tc7;->c(I)I

    move-result v2

    invoke-virtual {p1}, Lcom/daaw/yk7;->Q()Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/yq7;->j()[B

    move-result-object p1

    invoke-static {v2, p1}, Lcom/daaw/cp7;->h(I[B)Ljava/security/interfaces/ECPrivateKey;

    move-result-object v4

    new-instance v8, Lcom/daaw/uc7;

    invoke-virtual {v0}, Lcom/daaw/vk7;->L()Lcom/daaw/pk7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/pk7;->O()Lcom/daaw/vm7;

    move-result-object p1

    invoke-direct {v8, p1}, Lcom/daaw/uc7;-><init>(Lcom/daaw/vm7;)V

    new-instance p1, Lcom/daaw/uo7;

    invoke-virtual {v1}, Lcom/daaw/el7;->O()Lcom/daaw/yq7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/yq7;->j()[B

    move-result-object v5

    invoke-virtual {v1}, Lcom/daaw/el7;->R()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/tc7;->b(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/daaw/vk7;->S()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/tc7;->d(I)I

    move-result v7

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/daaw/uo7;-><init>(Ljava/security/interfaces/ECPrivateKey;[BLjava/lang/String;ILcom/daaw/to7;)V

    return-object p1
.end method
