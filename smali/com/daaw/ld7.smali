.class public final Lcom/daaw/ld7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[B

.field public static final b:[B

.field public static final c:[B

.field public static final d:[B

.field public static final e:[B

.field public static final f:[B

.field public static final g:[B

.field public static final h:[B

.field public static final i:[B

.field public static final j:[B

.field public static final k:[B

.field public static final l:[B

.field public static final m:[B

.field public static final n:[B

.field public static final o:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v2

    sput-object v2, Lcom/daaw/ld7;->a:[B

    const/4 v2, 0x2

    const/16 v3, 0x20

    invoke-static {v2, v3}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v3

    sput-object v3, Lcom/daaw/ld7;->b:[B

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v3

    sput-object v3, Lcom/daaw/ld7;->c:[B

    const/16 v3, 0x11

    invoke-static {v2, v3}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v3

    sput-object v3, Lcom/daaw/ld7;->d:[B

    const/16 v3, 0x12

    invoke-static {v2, v3}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v3

    sput-object v3, Lcom/daaw/ld7;->e:[B

    invoke-static {v2, v0}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v3

    sput-object v3, Lcom/daaw/ld7;->f:[B

    invoke-static {v2, v2}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v3

    sput-object v3, Lcom/daaw/ld7;->g:[B

    const/4 v3, 0x3

    invoke-static {v2, v3}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v4

    sput-object v4, Lcom/daaw/ld7;->h:[B

    invoke-static {v2, v0}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v0

    sput-object v0, Lcom/daaw/ld7;->i:[B

    invoke-static {v2, v2}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v0

    sput-object v0, Lcom/daaw/ld7;->j:[B

    invoke-static {v2, v3}, Lcom/daaw/ld7;->c(II)[B

    move-result-object v0

    sput-object v0, Lcom/daaw/ld7;->k:[B

    new-array v0, v1, [B

    sput-object v0, Lcom/daaw/ld7;->l:[B

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "KEM"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lcom/daaw/ld7;->m:[B

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "HPKE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lcom/daaw/ld7;->n:[B

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "HPKE-v1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lcom/daaw/ld7;->o:[B

    return-void
.end method

.method public static a(Lcom/daaw/cm7;)V
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/cm7;->Q()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_c

    invoke-virtual {p0}, Lcom/daaw/cm7;->Q()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_c

    invoke-virtual {p0}, Lcom/daaw/cm7;->P()I

    move-result v0

    const-string v3, "UNRECOGNIZED"

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    if-eq v0, v1, :cond_7

    invoke-virtual {p0}, Lcom/daaw/cm7;->P()I

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/cm7;->O()I

    move-result v0

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/cm7;->O()I

    move-result v0

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lcom/daaw/cm7;->O()I

    move-result p0

    if-eq p0, v1, :cond_6

    if-eq p0, v6, :cond_5

    if-eq p0, v5, :cond_4

    if-eq p0, v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "CHACHA20_POLY1305"

    goto :goto_1

    :cond_4
    const-string v3, "AES_256_GCM"

    goto :goto_1

    :cond_5
    const-string v3, "AES_128_GCM"

    goto :goto_1

    :cond_6
    const-string v3, "AEAD_UNKNOWN"

    :goto_1
    const-string p0, "Invalid AEAD param: "

    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lcom/daaw/cm7;->P()I

    move-result p0

    if-eq p0, v1, :cond_b

    if-eq p0, v6, :cond_a

    if-eq p0, v5, :cond_9

    if-eq p0, v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "HKDF_SHA512"

    goto :goto_3

    :cond_9
    const-string v3, "HKDF_SHA384"

    goto :goto_3

    :cond_a
    const-string v3, "HKDF_SHA256"

    goto :goto_3

    :cond_b
    const-string v3, "KDF_UNKNOWN"

    :goto_3
    const-string p0, "Invalid KDF param: "

    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lcom/daaw/cm7;->Q()I

    move-result p0

    invoke-static {p0}, Lcom/daaw/wl7;->a(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Invalid KEM param: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b([B[B[B)[B
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [[B

    sget-object v1, Lcom/daaw/ld7;->n:[B

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p0, v0, v1

    const/4 p0, 0x2

    aput-object p1, v0, p0

    const/4 p0, 0x3

    aput-object p2, v0, p0

    invoke-static {v0}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static c(II)[B
    .locals 3

    new-array v0, p0, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    sub-int v2, p0, v1

    add-int/lit8 v2, v2, -0x1

    mul-int/lit8 v2, v2, 0x8

    shr-int v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static d([B)[B
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [[B

    sget-object v1, Lcom/daaw/ld7;->m:[B

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p0, v0, v1

    invoke-static {v0}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;[B[B)[B
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [[B

    sget-object v1, Lcom/daaw/ld7;->o:[B

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const/4 p2, 0x2

    aput-object p0, v0, p2

    const/4 p0, 0x3

    aput-object p1, v0, p0

    invoke-static {v0}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/String;[B[BI)[B
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [[B

    const/4 v1, 0x2

    invoke-static {v1, p3}, Lcom/daaw/ld7;->c(II)[B

    move-result-object p3

    const/4 v2, 0x0

    aput-object p3, v0, v2

    sget-object p3, Lcom/daaw/ld7;->o:[B

    const/4 v2, 0x1

    aput-object p3, v0, v2

    aput-object p2, v0, v1

    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const/4 p2, 0x3

    aput-object p0, v0, p2

    const/4 p0, 0x4

    aput-object p1, v0, p0

    invoke-static {v0}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static g(I)I
    .locals 2

    add-int/lit8 p0, p0, -0x2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v1, 0x3

    if-eq p0, v1, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized NIST HPKE KEM identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return v0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method
