.class public final Lorg/conscrypt/OpenSSLSignature$SHA224RSA;
.super Lorg/conscrypt/OpenSSLSignature$RSAPKCS1Padding;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/conscrypt/OpenSSLSignature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SHA224RSA"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-wide v0, Lorg/conscrypt/EvpMdRef$SHA224;->EVP_MD:J

    invoke-direct {p0, v0, v1}, Lorg/conscrypt/OpenSSLSignature$RSAPKCS1Padding;-><init>(J)V

    return-void
.end method
