.class public final Lcom/daaw/uc7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/to7;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public c:Lcom/daaw/mj7;

.field public d:Lcom/daaw/li7;

.field public e:I

.field public f:Lcom/daaw/yj7;


# direct methods
.method public constructor <init>(Lcom/daaw/vm7;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/vm7;->Q()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/uc7;->a:Ljava/lang/String;

    sget-object v1, Lcom/daaw/z97;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/vm7;->P()Lcom/daaw/yq7;

    move-result-object v0

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/pj7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/pj7;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/w97;->d(Lcom/daaw/vm7;)Lcom/daaw/xt7;

    move-result-object p1

    check-cast p1, Lcom/daaw/mj7;

    iput-object p1, p0, Lcom/daaw/uc7;->c:Lcom/daaw/mj7;

    invoke-virtual {v0}, Lcom/daaw/pj7;->L()I

    move-result p1

    iput p1, p0, Lcom/daaw/uc7;->b:I
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "invalid KeyFormat protobuf, expected AesGcmKeyFormat"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    sget-object v1, Lcom/daaw/z97;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat"

    if-eqz v1, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lcom/daaw/vm7;->P()Lcom/daaw/yq7;

    move-result-object v0

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/oi7;->N(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/oi7;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/w97;->d(Lcom/daaw/vm7;)Lcom/daaw/xt7;

    move-result-object p1

    check-cast p1, Lcom/daaw/li7;

    iput-object p1, p0, Lcom/daaw/uc7;->d:Lcom/daaw/li7;

    invoke-virtual {v0}, Lcom/daaw/oi7;->O()Lcom/daaw/ui7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ui7;->L()I

    move-result p1

    iput p1, p0, Lcom/daaw/uc7;->e:I

    invoke-virtual {v0}, Lcom/daaw/oi7;->P()Lcom/daaw/rl7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/rl7;->L()I

    move-result p1

    iget v0, p0, Lcom/daaw/uc7;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/uc7;->b:I
    :try_end_1
    .catch Lcom/daaw/xs7; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    sget-object v1, Lcom/daaw/cc7;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :try_start_2
    invoke-virtual {p1}, Lcom/daaw/vm7;->P()Lcom/daaw/yq7;

    move-result-object v0

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/bk7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/bk7;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/w97;->d(Lcom/daaw/vm7;)Lcom/daaw/xt7;

    move-result-object p1

    check-cast p1, Lcom/daaw/yj7;

    iput-object p1, p0, Lcom/daaw/uc7;->f:Lcom/daaw/yj7;

    invoke-virtual {v0}, Lcom/daaw/bk7;->L()I

    move-result p1

    iput p1, p0, Lcom/daaw/uc7;->b:I
    :try_end_2
    .catch Lcom/daaw/xs7; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "unsupported AEAD DEM key type: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b([B)Lcom/daaw/qd7;
    .locals 4

    const-class v0, Lcom/daaw/a87;

    array-length v1, p1

    iget v2, p0, Lcom/daaw/uc7;->b:I

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/daaw/uc7;->a:Ljava/lang/String;

    sget-object v2, Lcom/daaw/z97;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/daaw/mj7;->M()Lcom/daaw/lj7;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/uc7;->c:Lcom/daaw/mj7;

    invoke-virtual {v1, v3}, Lcom/daaw/fs7;->k(Lcom/daaw/ls7;)Lcom/daaw/fs7;

    iget v3, p0, Lcom/daaw/uc7;->b:I

    invoke-static {p1, v2, v3}, Lcom/daaw/yq7;->G([BII)Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/lj7;->s(Lcom/daaw/yq7;)Lcom/daaw/lj7;

    invoke-virtual {v1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/mj7;

    new-instance v1, Lcom/daaw/qd7;

    iget-object v2, p0, Lcom/daaw/uc7;->a:Ljava/lang/String;

    invoke-static {v2, p1, v0}, Lcom/daaw/w97;->h(Ljava/lang/String;Lcom/daaw/xt7;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/a87;

    invoke-direct {v1, p1}, Lcom/daaw/qd7;-><init>(Lcom/daaw/a87;)V

    return-object v1

    :cond_0
    iget-object v1, p0, Lcom/daaw/uc7;->a:Ljava/lang/String;

    sget-object v3, Lcom/daaw/z97;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/daaw/uc7;->e:I

    invoke-static {p1, v2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget v2, p0, Lcom/daaw/uc7;->e:I

    iget v3, p0, Lcom/daaw/uc7;->b:I

    invoke-static {p1, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {}, Lcom/daaw/ri7;->M()Lcom/daaw/qi7;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/uc7;->d:Lcom/daaw/li7;

    invoke-virtual {v3}, Lcom/daaw/li7;->P()Lcom/daaw/ri7;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/fs7;->k(Lcom/daaw/ls7;)Lcom/daaw/fs7;

    invoke-static {v1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/daaw/qi7;->s(Lcom/daaw/yq7;)Lcom/daaw/qi7;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v1

    check-cast v1, Lcom/daaw/ri7;

    invoke-static {}, Lcom/daaw/ll7;->M()Lcom/daaw/kl7;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/uc7;->d:Lcom/daaw/li7;

    invoke-virtual {v3}, Lcom/daaw/li7;->Q()Lcom/daaw/ll7;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/fs7;->k(Lcom/daaw/ls7;)Lcom/daaw/fs7;

    invoke-static {p1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/daaw/kl7;->s(Lcom/daaw/yq7;)Lcom/daaw/kl7;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/ll7;

    invoke-static {}, Lcom/daaw/li7;->M()Lcom/daaw/ki7;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/uc7;->d:Lcom/daaw/li7;

    invoke-virtual {v3}, Lcom/daaw/li7;->L()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/daaw/ki7;->u(I)Lcom/daaw/ki7;

    invoke-virtual {v2, v1}, Lcom/daaw/ki7;->s(Lcom/daaw/ri7;)Lcom/daaw/ki7;

    invoke-virtual {v2, p1}, Lcom/daaw/ki7;->t(Lcom/daaw/ll7;)Lcom/daaw/ki7;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/li7;

    new-instance v1, Lcom/daaw/qd7;

    iget-object v2, p0, Lcom/daaw/uc7;->a:Ljava/lang/String;

    invoke-static {v2, p1, v0}, Lcom/daaw/w97;->h(Ljava/lang/String;Lcom/daaw/xt7;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/a87;

    invoke-direct {v1, p1}, Lcom/daaw/qd7;-><init>(Lcom/daaw/a87;)V

    return-object v1

    :cond_1
    iget-object v0, p0, Lcom/daaw/uc7;->a:Ljava/lang/String;

    sget-object v1, Lcom/daaw/cc7;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/daaw/yj7;->M()Lcom/daaw/xj7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uc7;->f:Lcom/daaw/yj7;

    invoke-virtual {v0, v1}, Lcom/daaw/fs7;->k(Lcom/daaw/ls7;)Lcom/daaw/fs7;

    iget v1, p0, Lcom/daaw/uc7;->b:I

    invoke-static {p1, v2, v1}, Lcom/daaw/yq7;->G([BII)Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/xj7;->s(Lcom/daaw/yq7;)Lcom/daaw/xj7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/yj7;

    new-instance v0, Lcom/daaw/qd7;

    iget-object v1, p0, Lcom/daaw/uc7;->a:Ljava/lang/String;

    const-class v2, Lcom/daaw/j87;

    invoke-static {v1, p1, v2}, Lcom/daaw/w97;->h(Ljava/lang/String;Lcom/daaw/xt7;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/j87;

    invoke-direct {v0, p1}, Lcom/daaw/qd7;-><init>(Lcom/daaw/j87;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown DEM key type"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Symmetric key has incorrect length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/daaw/uc7;->b:I

    return v0
.end method
