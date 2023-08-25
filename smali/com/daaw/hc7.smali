.class public final Lcom/daaw/hc7;
.super Lcom/daaw/df7;
.source ""


# static fields
.field public static final e:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/daaw/hc7;->e:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/cf7;

    new-instance v1, Lcom/daaw/fc7;

    const-class v2, Lcom/daaw/k87;

    invoke-direct {v1, v2}, Lcom/daaw/fc7;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/daaw/yk7;

    const-class v2, Lcom/daaw/bl7;

    invoke-direct {p0, v1, v2, v0}, Lcom/daaw/df7;-><init>(Ljava/lang/Class;Ljava/lang/Class;[Lcom/daaw/cf7;)V

    return-void
.end method

.method public static bridge synthetic k()[B
    .locals 1

    sget-object v0, Lcom/daaw/hc7;->e:[B

    return-object v0
.end method

.method public static bridge synthetic l(IIILcom/daaw/w87;[BI)Lcom/daaw/ce7;
    .locals 2

    new-instance p0, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/sk7;->L()Lcom/daaw/rk7;

    move-result-object p1

    invoke-static {}, Lcom/daaw/el7;->L()Lcom/daaw/dl7;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/daaw/dl7;->t(I)Lcom/daaw/dl7;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/daaw/dl7;->u(I)Lcom/daaw/dl7;

    invoke-static {p4}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p4

    invoke-virtual {v0, p4}, Lcom/daaw/dl7;->s(Lcom/daaw/yq7;)Lcom/daaw/dl7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p4

    check-cast p4, Lcom/daaw/el7;

    invoke-static {}, Lcom/daaw/vm7;->L()Lcom/daaw/um7;

    move-result-object v0

    invoke-virtual {p3}, Lcom/daaw/w87;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/um7;->t(Ljava/lang/String;)Lcom/daaw/um7;

    invoke-virtual {p3}, Lcom/daaw/w87;->c()[B

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/um7;->u(Lcom/daaw/yq7;)Lcom/daaw/um7;

    invoke-virtual {p3}, Lcom/daaw/w87;->d()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    if-eqz p3, :cond_2

    const/4 v1, 0x1

    if-eq p3, v1, :cond_1

    const/4 v1, 0x2

    if-eq p3, v1, :cond_0

    sget-object p3, Lcom/daaw/zn7;->u:Lcom/daaw/zn7;

    goto :goto_0

    :cond_0
    sget-object p3, Lcom/daaw/zn7;->t:Lcom/daaw/zn7;

    goto :goto_0

    :cond_1
    sget-object p3, Lcom/daaw/zn7;->s:Lcom/daaw/zn7;

    goto :goto_0

    :cond_2
    sget-object p3, Lcom/daaw/zn7;->r:Lcom/daaw/zn7;

    :goto_0
    invoke-virtual {v0, p3}, Lcom/daaw/um7;->s(Lcom/daaw/zn7;)Lcom/daaw/um7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p3

    check-cast p3, Lcom/daaw/vm7;

    invoke-static {}, Lcom/daaw/pk7;->L()Lcom/daaw/ok7;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/daaw/ok7;->s(Lcom/daaw/vm7;)Lcom/daaw/ok7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p3

    check-cast p3, Lcom/daaw/pk7;

    invoke-static {}, Lcom/daaw/vk7;->M()Lcom/daaw/uk7;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/daaw/uk7;->t(Lcom/daaw/el7;)Lcom/daaw/uk7;

    invoke-virtual {v0, p3}, Lcom/daaw/uk7;->s(Lcom/daaw/pk7;)Lcom/daaw/uk7;

    invoke-virtual {v0, p2}, Lcom/daaw/uk7;->u(I)Lcom/daaw/uk7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p2

    check-cast p2, Lcom/daaw/vk7;

    invoke-virtual {p1, p2}, Lcom/daaw/rk7;->s(Lcom/daaw/vk7;)Lcom/daaw/rk7;

    invoke-virtual {p1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/sk7;

    invoke-direct {p0, p1, p5}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/daaw/de7;
    .locals 2

    new-instance v0, Lcom/daaw/gc7;

    const-class v1, Lcom/daaw/sk7;

    invoke-direct {v0, p0, v1}, Lcom/daaw/gc7;-><init>(Lcom/daaw/hc7;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final b()Lcom/daaw/mm7;
    .locals 1

    sget-object v0, Lcom/daaw/mm7;->s:Lcom/daaw/mm7;

    return-object v0
.end method

.method public final synthetic c(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/yk7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/yk7;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/daaw/xt7;)V
    .locals 2

    check-cast p1, Lcom/daaw/yk7;

    invoke-virtual {p1}, Lcom/daaw/yk7;->Q()Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yq7;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/yk7;->L()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/xp7;->b(II)V

    invoke-virtual {p1}, Lcom/daaw/yk7;->P()Lcom/daaw/bl7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/bl7;->M()Lcom/daaw/vk7;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/tc7;->a(Lcom/daaw/vk7;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid ECIES private key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
