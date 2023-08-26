.class public final Lcom/daaw/avee/Common/SecR$SessionIdentifierGenerator;
.super Ljava/lang/Object;
.source "SecR.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Common/SecR;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "SessionIdentifierGenerator"
.end annotation


# instance fields
.field private random:Ljava/security/SecureRandom;

.field final synthetic this$0:Lcom/daaw/avee/Common/SecR;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/Common/SecR;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/daaw/avee/Common/SecR$SessionIdentifierGenerator;->this$0:Lcom/daaw/avee/Common/SecR;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance p1, Ljava/security/SecureRandom;

    invoke-direct {p1}, Ljava/security/SecureRandom;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/Common/SecR$SessionIdentifierGenerator;->random:Ljava/security/SecureRandom;

    return-void
.end method


# virtual methods
.method public nextSessionId()Ljava/lang/String;
    .locals 3

    .line 54
    new-instance v0, Ljava/math/BigInteger;

    iget-object v1, p0, Lcom/daaw/avee/Common/SecR$SessionIdentifierGenerator;->random:Ljava/security/SecureRandom;

    const/16 v2, 0x82

    invoke-direct {v0, v2, v1}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
