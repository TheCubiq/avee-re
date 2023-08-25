.class public final Lcom/daaw/qe2;
.super Lcom/daaw/re2;
.source ""


# instance fields
.field public final q:[B


# direct methods
.method public constructor <init>(Ljava/security/cert/X509Certificate;[B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/re2;-><init>(Ljava/security/cert/X509Certificate;)V

    iput-object p2, p0, Lcom/daaw/qe2;->q:[B

    return-void
.end method


# virtual methods
.method public final getEncoded()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/qe2;->q:[B

    return-object v0
.end method
