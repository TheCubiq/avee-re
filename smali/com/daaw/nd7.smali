.class public final Lcom/daaw/nd7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ed7;


# instance fields
.field public final a:Lcom/daaw/dq7;

.field public final b:Lcom/daaw/dq7;


# direct methods
.method public constructor <init>([B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/nd7;->a:Lcom/daaw/dq7;

    invoke-static {p2}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/nd7;->b:Lcom/daaw/dq7;

    return-void
.end method

.method public static a([B[BI)Lcom/daaw/nd7;
    .locals 2

    invoke-static {p2}, Lcom/daaw/cp7;->k(I)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/daaw/cp7;->j(Ljava/security/spec/ECParameterSpec;I[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    invoke-static {p2, p0}, Lcom/daaw/cp7;->h(I[B)Ljava/security/interfaces/ECPrivateKey;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/daaw/cp7;->e(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;)V

    new-instance p2, Lcom/daaw/nd7;

    invoke-direct {p2, p0, p1}, Lcom/daaw/nd7;-><init>([B[B)V

    return-object p2
.end method
