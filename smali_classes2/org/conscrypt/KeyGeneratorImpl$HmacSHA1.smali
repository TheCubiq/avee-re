.class public final Lorg/conscrypt/KeyGeneratorImpl$HmacSHA1;
.super Lorg/conscrypt/KeyGeneratorImpl;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/conscrypt/KeyGeneratorImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HmacSHA1"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "HmacSHA1"

    const/16 v1, 0xa0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lorg/conscrypt/KeyGeneratorImpl;-><init>(Ljava/lang/String;ILorg/conscrypt/KeyGeneratorImpl$1;)V

    return-void
.end method
