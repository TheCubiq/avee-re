.class public final Lcom/daaw/id7;
.super Lcom/daaw/df7;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/cf7;

    new-instance v1, Lcom/daaw/gd7;

    const-class v2, Lcom/daaw/k87;

    invoke-direct {v1, v2}, Lcom/daaw/gd7;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/daaw/fm7;

    const-class v2, Lcom/daaw/im7;

    invoke-direct {p0, v1, v2, v0}, Lcom/daaw/df7;-><init>(Ljava/lang/Class;Ljava/lang/Class;[Lcom/daaw/cf7;)V

    return-void
.end method

.method public static bridge synthetic k(IIII)Lcom/daaw/ce7;
    .locals 1

    invoke-static {}, Lcom/daaw/cm7;->L()Lcom/daaw/bm7;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/bm7;->u(I)Lcom/daaw/bm7;

    invoke-virtual {v0, p1}, Lcom/daaw/bm7;->t(I)Lcom/daaw/bm7;

    invoke-virtual {v0, p2}, Lcom/daaw/bm7;->s(I)Lcom/daaw/bm7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/cm7;

    new-instance p1, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/zl7;->L()Lcom/daaw/yl7;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/daaw/yl7;->s(Lcom/daaw/cm7;)Lcom/daaw/yl7;

    invoke-virtual {p2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/zl7;

    invoke-direct {p1, p0, p3}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public final a()Lcom/daaw/de7;
    .locals 2

    new-instance v0, Lcom/daaw/hd7;

    const-class v1, Lcom/daaw/zl7;

    invoke-direct {v0, p0, v1}, Lcom/daaw/hd7;-><init>(Lcom/daaw/id7;Ljava/lang/Class;)V

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

    invoke-static {p1, v0}, Lcom/daaw/fm7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/fm7;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/daaw/xt7;)V
    .locals 2

    check-cast p1, Lcom/daaw/fm7;

    invoke-virtual {p1}, Lcom/daaw/fm7;->Q()Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yq7;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/fm7;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/fm7;->L()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/xp7;->b(II)V

    invoke-virtual {p1}, Lcom/daaw/fm7;->P()Lcom/daaw/im7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/im7;->M()Lcom/daaw/cm7;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/ld7;->a(Lcom/daaw/cm7;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Missing public key."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Private key is empty."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
