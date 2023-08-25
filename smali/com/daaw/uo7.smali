.class public final Lcom/daaw/uo7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k87;


# instance fields
.field public final a:Ljava/security/interfaces/ECPrivateKey;

.field public final b:Lcom/daaw/wo7;

.field public final c:Ljava/lang/String;

.field public final d:[B

.field public final e:Lcom/daaw/to7;


# direct methods
.method public constructor <init>(Ljava/security/interfaces/ECPrivateKey;[BLjava/lang/String;ILcom/daaw/to7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uo7;->a:Ljava/security/interfaces/ECPrivateKey;

    new-instance p4, Lcom/daaw/wo7;

    invoke-direct {p4, p1}, Lcom/daaw/wo7;-><init>(Ljava/security/interfaces/ECPrivateKey;)V

    iput-object p4, p0, Lcom/daaw/uo7;->b:Lcom/daaw/wo7;

    iput-object p2, p0, Lcom/daaw/uo7;->d:[B

    iput-object p3, p0, Lcom/daaw/uo7;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/uo7;->e:Lcom/daaw/to7;

    return-void
.end method
