.class public Lorg/conscrypt/OpenSSLEvpCipherAES$AES$CBC;
.super Lorg/conscrypt/OpenSSLEvpCipherAES$AES;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/conscrypt/OpenSSLEvpCipherAES$AES;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CBC"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/conscrypt/OpenSSLEvpCipherAES$AES$CBC$PKCS5Padding;,
        Lorg/conscrypt/OpenSSLEvpCipherAES$AES$CBC$NoPadding;
    }
.end annotation


# direct methods
.method public constructor <init>(Lorg/conscrypt/OpenSSLCipher$Padding;)V
    .locals 1

    sget-object v0, Lorg/conscrypt/OpenSSLCipher$Mode;->CBC:Lorg/conscrypt/OpenSSLCipher$Mode;

    invoke-direct {p0, v0, p1}, Lorg/conscrypt/OpenSSLEvpCipherAES$AES;-><init>(Lorg/conscrypt/OpenSSLCipher$Mode;Lorg/conscrypt/OpenSSLCipher$Padding;)V

    return-void
.end method
