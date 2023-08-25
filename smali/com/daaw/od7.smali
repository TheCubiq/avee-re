.class public final Lcom/daaw/od7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cd7;


# instance fields
.field public final a:Lcom/daaw/xc7;


# direct methods
.method public constructor <init>(Lcom/daaw/xc7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/od7;->a:Lcom/daaw/xc7;

    return-void
.end method


# virtual methods
.method public final a([B)Lcom/daaw/dd7;
    .locals 9

    invoke-static {}, Lcom/daaw/yp7;->b()[B

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/yp7;->a([B[B)[B

    move-result-object v3

    invoke-static {v0}, Lcom/daaw/yp7;->c([B)[B

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [[B

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v1}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object v5

    sget-object p1, Lcom/daaw/ld7;->b:[B

    invoke-static {p1}, Lcom/daaw/ld7;->d([B)[B

    move-result-object v7

    iget-object v1, p0, Lcom/daaw/od7;->a:Lcom/daaw/xc7;

    invoke-virtual {v1}, Lcom/daaw/xc7;->a()I

    move-result v8

    const/4 v2, 0x0

    const-string v4, "eae_prk"

    const-string v6, "shared_secret"

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/xc7;->b([B[BLjava/lang/String;[BLjava/lang/String;[BI)[B

    move-result-object p1

    new-instance v1, Lcom/daaw/dd7;

    invoke-direct {v1, p1, v0}, Lcom/daaw/dd7;-><init>([B[B)V

    return-object v1
.end method

.method public final zzb()[B
    .locals 2

    iget-object v0, p0, Lcom/daaw/od7;->a:Lcom/daaw/xc7;

    invoke-virtual {v0}, Lcom/daaw/xc7;->c()[B

    move-result-object v0

    sget-object v1, Lcom/daaw/ld7;->f:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/ld7;->b:[B

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Could not determine HPKE KEM ID"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
