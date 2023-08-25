.class public final Lcom/daaw/md7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cd7;


# instance fields
.field public final a:Lcom/daaw/xc7;

.field public final b:I


# direct methods
.method public constructor <init>(Lcom/daaw/xc7;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/md7;->a:Lcom/daaw/xc7;

    iput p2, p0, Lcom/daaw/md7;->b:I

    return-void
.end method

.method public static b(I)Lcom/daaw/md7;
    .locals 3

    add-int/lit8 p0, p0, -0x1

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    new-instance p0, Lcom/daaw/md7;

    new-instance v0, Lcom/daaw/xc7;

    const-string v1, "HmacSha512"

    invoke-direct {v0, v1}, Lcom/daaw/xc7;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lcom/daaw/md7;-><init>(Lcom/daaw/xc7;I)V

    return-object p0

    :cond_0
    new-instance p0, Lcom/daaw/md7;

    new-instance v0, Lcom/daaw/xc7;

    const-string v1, "HmacSha384"

    invoke-direct {v0, v1}, Lcom/daaw/xc7;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcom/daaw/md7;-><init>(Lcom/daaw/xc7;I)V

    return-object p0

    :cond_1
    new-instance p0, Lcom/daaw/md7;

    new-instance v1, Lcom/daaw/xc7;

    const-string v2, "HmacSha256"

    invoke-direct {v1, v2}, Lcom/daaw/xc7;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1, v0}, Lcom/daaw/md7;-><init>(Lcom/daaw/xc7;I)V

    return-object p0
.end method


# virtual methods
.method public final a([B)Lcom/daaw/dd7;
    .locals 12

    iget v0, p0, Lcom/daaw/md7;->b:I

    invoke-static {v0}, Lcom/daaw/cp7;->k(I)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/cp7;->c(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object v0

    iget v1, p0, Lcom/daaw/md7;->b:I

    invoke-static {v1}, Lcom/daaw/cp7;->k(I)Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2, p1}, Lcom/daaw/cp7;->j(Ljava/security/spec/ECParameterSpec;I[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v1

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v3

    check-cast v3, Ljava/security/interfaces/ECPrivateKey;

    invoke-static {v3, v1}, Lcom/daaw/cp7;->g(Ljava/security/interfaces/ECPrivateKey;Ljava/security/interfaces/ECPublicKey;)[B

    move-result-object v6

    iget v1, p0, Lcom/daaw/md7;->b:I

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/daaw/cp7;->l(IILjava/security/spec/ECPoint;)[B

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [[B

    const/4 v3, 0x0

    aput-object v0, v1, v3

    aput-object p1, v1, v2

    invoke-static {v1}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object v8

    invoke-virtual {p0}, Lcom/daaw/md7;->zzb()[B

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/ld7;->d([B)[B

    move-result-object v10

    iget-object v4, p0, Lcom/daaw/md7;->a:Lcom/daaw/xc7;

    invoke-virtual {v4}, Lcom/daaw/xc7;->a()I

    move-result v11

    const/4 v5, 0x0

    const-string v7, "eae_prk"

    const-string v9, "shared_secret"

    invoke-virtual/range {v4 .. v11}, Lcom/daaw/xc7;->b([B[BLjava/lang/String;[BLjava/lang/String;[BI)[B

    move-result-object p1

    new-instance v1, Lcom/daaw/dd7;

    invoke-direct {v1, p1, v0}, Lcom/daaw/dd7;-><init>([B[B)V

    return-object v1
.end method

.method public final zzb()[B
    .locals 2

    iget v0, p0, Lcom/daaw/md7;->b:I

    add-int/lit8 v0, v0, -0x1

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/daaw/ld7;->e:[B

    return-object v0

    :cond_0
    sget-object v0, Lcom/daaw/ld7;->d:[B

    return-object v0

    :cond_1
    sget-object v0, Lcom/daaw/ld7;->c:[B

    return-object v0
.end method
