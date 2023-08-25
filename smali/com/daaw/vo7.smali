.class public final Lcom/daaw/vo7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/l87;


# static fields
.field public static final f:[B


# instance fields
.field public final a:Lcom/daaw/bp7;

.field public final b:Ljava/lang/String;

.field public final c:[B

.field public final d:Lcom/daaw/to7;

.field public final e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/daaw/vo7;->f:[B

    return-void
.end method

.method public constructor <init>(Ljava/security/interfaces/ECPublicKey;[BLjava/lang/String;ILcom/daaw/to7;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v0

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/cp7;->d(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    new-instance v0, Lcom/daaw/bp7;

    invoke-direct {v0, p1}, Lcom/daaw/bp7;-><init>(Ljava/security/interfaces/ECPublicKey;)V

    iput-object v0, p0, Lcom/daaw/vo7;->a:Lcom/daaw/bp7;

    iput-object p2, p0, Lcom/daaw/vo7;->c:[B

    iput-object p3, p0, Lcom/daaw/vo7;->b:Ljava/lang/String;

    iput p4, p0, Lcom/daaw/vo7;->e:I

    iput-object p5, p0, Lcom/daaw/vo7;->d:Lcom/daaw/to7;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 6

    iget-object v0, p0, Lcom/daaw/vo7;->a:Lcom/daaw/bp7;

    iget-object v1, p0, Lcom/daaw/vo7;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/vo7;->c:[B

    iget-object v3, p0, Lcom/daaw/vo7;->d:Lcom/daaw/to7;

    invoke-interface {v3}, Lcom/daaw/to7;->zza()I

    move-result v4

    iget v5, p0, Lcom/daaw/vo7;->e:I

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/bp7;->a(Ljava/lang/String;[B[BII)Lcom/daaw/ap7;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/vo7;->d:Lcom/daaw/to7;

    invoke-virtual {p2}, Lcom/daaw/ap7;->b()[B

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/to7;->b([B)Lcom/daaw/qd7;

    move-result-object v0

    sget-object v1, Lcom/daaw/vo7;->f:[B

    invoke-virtual {v0, p1, v1}, Lcom/daaw/qd7;->a([B[B)[B

    move-result-object p1

    invoke-virtual {p2}, Lcom/daaw/ap7;->a()[B

    move-result-object p2

    array-length v0, p2

    array-length v1, p1

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1
.end method
