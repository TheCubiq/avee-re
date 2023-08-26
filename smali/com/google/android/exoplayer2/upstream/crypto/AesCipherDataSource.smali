.class public final Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;
.super Ljava/lang/Object;
.source "AesCipherDataSource.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/DataSource;


# instance fields
.field private cipher:Lcom/google/android/exoplayer2/upstream/crypto/AesFlushingCipher;

.field private final secretKey:[B

.field private final upstream:Lcom/google/android/exoplayer2/upstream/DataSource;


# direct methods
.method public constructor <init>([BLcom/google/android/exoplayer2/upstream/DataSource;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p2, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->upstream:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 37
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->secretKey:[B

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->cipher:Lcom/google/android/exoplayer2/upstream/crypto/AesFlushingCipher;

    .line 65
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->upstream:Lcom/google/android/exoplayer2/upstream/DataSource;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/upstream/DataSource;->close()V

    return-void
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->upstream:Lcom/google/android/exoplayer2/upstream/DataSource;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/upstream/DataSource;->getUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public open(Lcom/google/android/exoplayer2/upstream/DataSpec;)J
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->upstream:Lcom/google/android/exoplayer2/upstream/DataSource;

    invoke-interface {v0, p1}, Lcom/google/android/exoplayer2/upstream/DataSource;->open(Lcom/google/android/exoplayer2/upstream/DataSpec;)J

    move-result-wide v0

    .line 43
    iget-object v2, p1, Lcom/google/android/exoplayer2/upstream/DataSpec;->key:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/exoplayer2/upstream/crypto/CryptoUtil;->getFNV64Hash(Ljava/lang/String;)J

    move-result-wide v6

    .line 44
    new-instance v2, Lcom/google/android/exoplayer2/upstream/crypto/AesFlushingCipher;

    iget-object v5, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->secretKey:[B

    iget-wide v8, p1, Lcom/google/android/exoplayer2/upstream/DataSpec;->absoluteStreamPosition:J

    const/4 v4, 0x2

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Lcom/google/android/exoplayer2/upstream/crypto/AesFlushingCipher;-><init>(I[BJJ)V

    iput-object v2, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->cipher:Lcom/google/android/exoplayer2/upstream/crypto/AesFlushingCipher;

    return-wide v0
.end method

.method public read([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->upstream:Lcom/google/android/exoplayer2/upstream/DataSource;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/upstream/DataSource;->read([BII)I

    move-result p3

    const/4 v0, -0x1

    if-ne p3, v0, :cond_1

    return v0

    .line 58
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/crypto/AesCipherDataSource;->cipher:Lcom/google/android/exoplayer2/upstream/crypto/AesFlushingCipher;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/upstream/crypto/AesFlushingCipher;->updateInPlace([BII)V

    return p3
.end method
