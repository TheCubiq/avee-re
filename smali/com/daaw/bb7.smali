.class public final Lcom/daaw/bb7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/a87;


# static fields
.field public static final c:[B


# instance fields
.field public final a:Lcom/daaw/vm7;

.field public final b:Lcom/daaw/a87;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/daaw/bb7;->c:[B

    return-void
.end method

.method public constructor <init>(Lcom/daaw/vm7;Lcom/daaw/a87;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bb7;->a:Lcom/daaw/vm7;

    iput-object p2, p0, Lcom/daaw/bb7;->b:Lcom/daaw/a87;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 5

    const-string v0, "invalid ciphertext"

    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    if-lez v2, :cond_0

    array-length p1, p1

    add-int/lit8 p1, p1, -0x4

    if-gt v2, p1, :cond_0

    new-array p1, v2, [B

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/daaw/bb7;->b:Lcom/daaw/a87;

    sget-object v3, Lcom/daaw/bb7;->c:[B

    invoke-interface {v1, p1, v3}, Lcom/daaw/a87;->a([B[B)[B

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/bb7;->a:Lcom/daaw/vm7;

    invoke-virtual {v1}, Lcom/daaw/vm7;->Q()Ljava/lang/String;

    move-result-object v1

    const-class v3, Lcom/daaw/a87;

    invoke-static {v1, p1, v3}, Lcom/daaw/w97;->i(Ljava/lang/String;[BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/a87;

    invoke-interface {p1, v2, p2}, Lcom/daaw/a87;->a([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    new-instance p2, Ljava/security/GeneralSecurityException;

    invoke-direct {p2, v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final b([B[B)[B
    .locals 4

    iget-object v0, p0, Lcom/daaw/bb7;->a:Lcom/daaw/vm7;

    invoke-static {v0}, Lcom/daaw/w97;->d(Lcom/daaw/vm7;)Lcom/daaw/xt7;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/xt7;->a()[B

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/bb7;->b:Lcom/daaw/a87;

    sget-object v2, Lcom/daaw/bb7;->c:[B

    invoke-interface {v1, v0, v2}, Lcom/daaw/a87;->b([B[B)[B

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/bb7;->a:Lcom/daaw/vm7;

    invoke-virtual {v2}, Lcom/daaw/vm7;->Q()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/daaw/a87;

    invoke-static {v2, v0, v3}, Lcom/daaw/w97;->i(Ljava/lang/String;[BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/a87;

    invoke-interface {v0, p1, p2}, Lcom/daaw/a87;->b([B[B)[B

    move-result-object p1

    array-length p2, v1

    add-int/lit8 v0, p2, 0x4

    array-length v2, p1

    add-int/2addr v0, v2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1
.end method
