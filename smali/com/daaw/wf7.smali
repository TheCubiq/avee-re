.class public final Lcom/daaw/wf7;
.super Lcom/daaw/ee7;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/cf7;

    new-instance v1, Lcom/daaw/uf7;

    const-class v2, Lcom/daaw/g97;

    invoke-direct {v1, v2}, Lcom/daaw/uf7;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/daaw/zh7;

    invoke-direct {p0, v1, v0}, Lcom/daaw/ee7;-><init>(Ljava/lang/Class;[Lcom/daaw/cf7;)V

    return-void
.end method

.method public static bridge synthetic k(Lcom/daaw/ii7;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/wf7;->m(Lcom/daaw/ii7;)V

    return-void
.end method

.method public static bridge synthetic l(I)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/wf7;->n(I)V

    return-void
.end method

.method public static m(Lcom/daaw/ii7;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ii7;->L()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ii7;->L()I

    move-result p0

    const/16 v0, 0x10

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too long"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(I)V
    .locals 1

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()Lcom/daaw/de7;
    .locals 2

    new-instance v0, Lcom/daaw/vf7;

    const-class v1, Lcom/daaw/ci7;

    invoke-direct {v0, p0, v1}, Lcom/daaw/vf7;-><init>(Lcom/daaw/wf7;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final b()Lcom/daaw/mm7;
    .locals 1

    sget-object v0, Lcom/daaw/mm7;->r:Lcom/daaw/mm7;

    return-object v0
.end method

.method public final synthetic c(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/zh7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/zh7;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/daaw/xt7;)V
    .locals 2

    check-cast p1, Lcom/daaw/zh7;

    invoke-virtual {p1}, Lcom/daaw/zh7;->L()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/xp7;->b(II)V

    invoke-virtual {p1}, Lcom/daaw/zh7;->Q()Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yq7;->o()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/wf7;->n(I)V

    invoke-virtual {p1}, Lcom/daaw/zh7;->P()Lcom/daaw/ii7;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/wf7;->m(Lcom/daaw/ii7;)V

    return-void
.end method
