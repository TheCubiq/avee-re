.class public final Lorg/conscrypt/OpenSSLSignature$SHA384ECDSA;
.super Lorg/conscrypt/OpenSSLSignature;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/conscrypt/OpenSSLSignature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SHA384ECDSA"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 4

    sget-wide v0, Lorg/conscrypt/EvpMdRef$SHA384;->EVP_MD:J

    sget-object v2, Lorg/conscrypt/OpenSSLSignature$EngineType;->EC:Lorg/conscrypt/OpenSSLSignature$EngineType;

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lorg/conscrypt/OpenSSLSignature;-><init>(JLorg/conscrypt/OpenSSLSignature$EngineType;Lorg/conscrypt/OpenSSLSignature$1;)V

    return-void
.end method
