.class public final Lcom/daaw/ad7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k87;


# instance fields
.field public final a:Lcom/daaw/ed7;

.field public final b:Lcom/daaw/cd7;

.field public final c:Lcom/daaw/yc7;

.field public final d:Lcom/daaw/xc7;


# direct methods
.method public constructor <init>(Lcom/daaw/ed7;Lcom/daaw/cd7;Lcom/daaw/xc7;Lcom/daaw/yc7;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ad7;->a:Lcom/daaw/ed7;

    iput-object p2, p0, Lcom/daaw/ad7;->b:Lcom/daaw/cd7;

    iput-object p3, p0, Lcom/daaw/ad7;->d:Lcom/daaw/xc7;

    iput-object p4, p0, Lcom/daaw/ad7;->c:Lcom/daaw/yc7;

    return-void
.end method

.method public static a(Lcom/daaw/fm7;)Lcom/daaw/ad7;
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/fm7;->U()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/daaw/fm7;->P()Lcom/daaw/im7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/im7;->V()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/daaw/fm7;->Q()Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yq7;->h()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/daaw/fm7;->P()Lcom/daaw/im7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/im7;->M()Lcom/daaw/cm7;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/fd7;->b(Lcom/daaw/cm7;)Lcom/daaw/cd7;

    move-result-object v3

    invoke-static {v0}, Lcom/daaw/fd7;->c(Lcom/daaw/cm7;)Lcom/daaw/xc7;

    move-result-object v4

    invoke-static {v0}, Lcom/daaw/fd7;->a(Lcom/daaw/cm7;)Lcom/daaw/yc7;

    move-result-object v5

    invoke-virtual {v0}, Lcom/daaw/cm7;->Q()I

    move-result v0

    add-int/lit8 v1, v0, -0x2

    const/4 v2, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v1, v8, :cond_3

    if-eq v1, v7, :cond_2

    if-eq v1, v6, :cond_1

    if-ne v1, v2, :cond_0

    const/16 v0, 0x85

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {v0}, Lcom/daaw/wl7;->a(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unable to determine KEM-encoding length for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/16 v0, 0x61

    goto :goto_0

    :cond_2
    const/16 v0, 0x41

    goto :goto_0

    :cond_3
    const/16 v0, 0x20

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/fm7;->P()Lcom/daaw/im7;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/im7;->M()Lcom/daaw/cm7;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/cm7;->Q()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    if-eq v1, v8, :cond_6

    if-eq v1, v7, :cond_5

    if-eq v1, v6, :cond_5

    if-ne v1, v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized HPKE KEM identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/daaw/fm7;->Q()Lcom/daaw/yq7;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/yq7;->j()[B

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/fm7;->P()Lcom/daaw/im7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/im7;->R()Lcom/daaw/yq7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/yq7;->j()[B

    move-result-object v2

    invoke-virtual {p0}, Lcom/daaw/fm7;->P()Lcom/daaw/im7;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/im7;->M()Lcom/daaw/cm7;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/cm7;->Q()I

    move-result p0

    invoke-static {p0}, Lcom/daaw/ld7;->g(I)I

    move-result p0

    invoke-static {v1, v2, p0}, Lcom/daaw/nd7;->a([B[BI)Lcom/daaw/nd7;

    move-result-object p0

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Lcom/daaw/fm7;->Q()Lcom/daaw/yq7;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/yq7;->j()[B

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/pd7;->a([B)Lcom/daaw/pd7;

    move-result-object p0

    :goto_2
    move-object v2, p0

    new-instance p0, Lcom/daaw/ad7;

    const/4 v7, 0x0

    move-object v1, p0

    move v6, v0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/ad7;-><init>(Lcom/daaw/ed7;Lcom/daaw/cd7;Lcom/daaw/xc7;Lcom/daaw/yc7;I[B)V

    return-object p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePrivateKey.private_key is empty."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePrivateKey.public_key is missing params field."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePrivateKey is missing public_key field."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
