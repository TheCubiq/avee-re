.class public Lcom/daaw/xw;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:[Ljava/lang/String;

.field public static final d:[B

.field public static final e:[[B

.field public static final f:[[B


# instance fields
.field public a:[B

.field public b:B


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const-string v0, "ISO-8859-1"

    const-string v1, "UTF-16LE"

    const-string v2, "UTF-16BE"

    const-string v3, "UTF-8"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/xw;->c:[Ljava/lang/String;

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lcom/daaw/xw;->d:[B

    new-array v1, v0, [[B

    const/4 v2, 0x0

    new-array v3, v2, [B

    aput-object v3, v1, v2

    const/4 v3, 0x2

    new-array v4, v3, [B

    fill-array-data v4, :array_1

    const/4 v5, 0x1

    aput-object v4, v1, v5

    new-array v4, v3, [B

    fill-array-data v4, :array_2

    aput-object v4, v1, v3

    new-array v4, v2, [B

    const/4 v6, 0x3

    aput-object v4, v1, v6

    sput-object v1, Lcom/daaw/xw;->e:[[B

    new-array v0, v0, [[B

    new-array v1, v5, [B

    aput-byte v2, v1, v2

    aput-object v1, v0, v2

    new-array v1, v3, [B

    fill-array-data v1, :array_3

    aput-object v1, v0, v5

    new-array v1, v3, [B

    fill-array-data v1, :array_4

    aput-object v1, v0, v3

    new-array v1, v5, [B

    aput-byte v2, v1, v2

    aput-object v1, v0, v6

    sput-object v0, Lcom/daaw/xw;->f:[[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x2t
        0x1t
        0x3t
    .end array-data

    :array_1
    .array-data 1
        -0x1t
        -0x2t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x2t
        -0x1t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x0t
        0x0t
    .end array-data

    nop

    :array_4
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(BLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Lcom/daaw/xw;->b:B

    invoke-static {p1}, Lcom/daaw/xw;->d(B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/daaw/xw;->f(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xw;->a:[B

    invoke-virtual {p0}, Lcom/daaw/xw;->g()V

    return-void
.end method

.method public constructor <init>(B[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lcom/daaw/xw;->h([B)B

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iput-byte v1, p0, Lcom/daaw/xw;->b:B

    goto :goto_0

    :cond_0
    iput-byte p1, p0, Lcom/daaw/xw;->b:B

    :goto_0
    iput-object p2, p0, Lcom/daaw/xw;->a:[B

    invoke-virtual {p0}, Lcom/daaw/xw;->g()V

    return-void
.end method

.method public static a([BLjava/lang/String;)Ljava/nio/CharBuffer;
    .locals 0

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object p1

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p0

    return-object p0
.end method

.method public static b([BLjava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p0, p1}, Lcom/daaw/xw;->a([BLjava/lang/String;)Ljava/nio/CharBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/nio/CharBuffer;Ljava/lang/String;)[B
    .locals 1

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->limit()I

    move-result p0

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/daaw/wc;->e([BII)[B

    move-result-object p0

    return-object p0
.end method

.method public static d(B)Ljava/lang/String;
    .locals 3

    :try_start_0
    sget-object v0, Lcom/daaw/xw;->c:[Ljava/lang/String;

    aget-object p0, v0, p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid text encoding "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 0

    :try_start_0
    invoke-static {p0}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/daaw/xw;->c(Ljava/nio/CharBuffer;Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static h([B)B
    .locals 6

    array-length v0, p0

    const/4 v1, -0x2

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-lt v0, v5, :cond_0

    aget-byte v0, p0, v4

    if-ne v0, v2, :cond_0

    aget-byte v0, p0, v3

    if-ne v0, v1, :cond_0

    return v3

    :cond_0
    array-length v0, p0

    if-lt v0, v5, :cond_1

    aget-byte v0, p0, v4

    if-ne v0, v1, :cond_1

    aget-byte v0, p0, v3

    if-ne v0, v2, :cond_1

    return v5

    :cond_1
    array-length v0, p0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    aget-byte v0, p0, v4

    const/16 v2, -0x11

    if-ne v0, v2, :cond_2

    aget-byte v0, p0, v3

    const/16 v2, -0x45

    if-ne v0, v2, :cond_2

    aget-byte p0, p0, v5

    const/16 v0, -0x41

    if-ne p0, v0, :cond_2

    return v1

    :cond_2
    return v4
.end method


# virtual methods
.method public e()[B
    .locals 2

    sget-object v0, Lcom/daaw/xw;->f:[[B

    iget-byte v1, p0, Lcom/daaw/xw;->b:B

    aget-object v0, v0, v1

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    check-cast p1, Lcom/daaw/xw;

    iget-byte v2, p0, Lcom/daaw/xw;->b:B

    iget-byte v3, p1, Lcom/daaw/xw;->b:B

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lcom/daaw/xw;->a:[B

    iget-object p1, p1, Lcom/daaw/xw;->a:[B

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public final g()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/xw;->a:[B

    array-length v1, v0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-lt v1, v3, :cond_2

    aget-byte v1, v0, v5

    const/4 v6, -0x1

    const/4 v7, -0x2

    if-ne v1, v7, :cond_0

    aget-byte v1, v0, v4

    if-eq v1, v6, :cond_1

    :cond_0
    aget-byte v1, v0, v5

    if-ne v1, v6, :cond_2

    aget-byte v1, v0, v4

    if-ne v1, v7, :cond_2

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :cond_2
    array-length v1, v0

    if-lt v1, v2, :cond_3

    aget-byte v1, v0, v5

    const/16 v6, -0x11

    if-ne v1, v6, :cond_3

    aget-byte v1, v0, v4

    const/16 v6, -0x45

    if-ne v1, v6, :cond_3

    aget-byte v1, v0, v3

    const/16 v3, -0x41

    if-ne v1, v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    sget-object v1, Lcom/daaw/xw;->f:[[B

    iget-byte v3, p0, Lcom/daaw/xw;->b:B

    aget-object v1, v1, v3

    array-length v0, v0

    sub-int/2addr v0, v2

    array-length v3, v1

    if-lt v0, v3, :cond_6

    const/4 v0, 0x0

    :goto_1
    array-length v3, v1

    if-ge v0, v3, :cond_5

    iget-object v3, p0, Lcom/daaw/xw;->a:[B

    array-length v6, v3

    array-length v7, v1

    sub-int/2addr v6, v7

    add-int/2addr v6, v0

    aget-byte v3, v3, v6

    aget-byte v6, v1, v0

    if-eq v3, v6, :cond_4

    const/4 v4, 0x0

    goto :goto_2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-eqz v4, :cond_6

    array-length v0, v1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    add-int v1, v2, v0

    if-lez v1, :cond_8

    iget-object v1, p0, Lcom/daaw/xw;->a:[B

    array-length v3, v1

    sub-int/2addr v3, v2

    sub-int/2addr v3, v0

    new-array v0, v3, [B

    if-lez v3, :cond_7

    invoke-static {v1, v2, v0, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    iput-object v0, p0, Lcom/daaw/xw;->a:[B

    :cond_8
    return-void
.end method

.method public hashCode()I
    .locals 2

    iget-byte v0, p0, Lcom/daaw/xw;->b:B

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/xw;->a:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/xw;->a:[B

    iget-byte v1, p0, Lcom/daaw/xw;->b:B

    invoke-static {v1}, Lcom/daaw/xw;->d(B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/xw;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
