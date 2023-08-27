.class public Lcom/mpatric/mp3agic/ID3v2UrlFrameData;
.super Lcom/mpatric/mp3agic/AbstractID3v2FrameData;
.source "ID3v2UrlFrameData.java"


# instance fields
.field protected description:Lcom/mpatric/mp3agic/EncodedText;

.field protected url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(ZLcom/mpatric/mp3agic/EncodedText;Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 16
    iput-object p2, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    .line 17
    iput-object p3, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Z[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 22
    invoke-virtual {p0, p2}, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->synchroniseAndUnpackFrameData([B)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 102
    :cond_0
    invoke-super {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 104
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 106
    :cond_2
    check-cast p1, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;

    .line 107
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-nez v1, :cond_3

    .line 108
    iget-object v1, p1, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v1, :cond_4

    return v2

    .line 110
    :cond_3
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    invoke-virtual {v1, v3}, Lcom/mpatric/mp3agic/EncodedText;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    .line 112
    :cond_4
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 113
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    if-eqz p1, :cond_6

    return v2

    .line 115
    :cond_5
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public getDescription()Lcom/mpatric/mp3agic/EncodedText;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    return-object v0
.end method

.method protected getLength()I
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 69
    :goto_0
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 92
    invoke-super {p0}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 93
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/EncodedText;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 94
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method protected packFrameData()[B
    .locals 5

    .line 44
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->getLength()I

    move-result v0

    new-array v0, v0, [B

    .line 45
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/mpatric/mp3agic/EncodedText;->getTextEncoding()B

    move-result v1

    aput-byte v1, v0, v2

    goto :goto_0

    .line 46
    :cond_0
    aput-byte v2, v0, v2

    .line 48
    :goto_0
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 49
    invoke-virtual {v1, v3, v3}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v1

    .line 50
    array-length v4, v1

    invoke-static {v1, v2, v4, v0, v3}, Lcom/mpatric/mp3agic/BufferTools;->copyIntoByteBuffer([BII[BI)V

    .line 51
    array-length v1, v1

    add-int/2addr v1, v3

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    .line 53
    aput-byte v2, v0, v3

    .line 55
    :goto_1
    iget-object v3, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_2

    .line 57
    :try_start_0
    iget-object v3, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    iget-object v4, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v3, v2, v4, v0, v1}, Lcom/mpatric/mp3agic/BufferTools;->stringIntoByteBuffer(Ljava/lang/String;II[BI)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-object v0
.end method

.method public setDescription(Lcom/mpatric/mp3agic/EncodedText;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    return-void
.end method

.method protected unpackFrameData([B)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 27
    aget-byte v1, p1, v0

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/mpatric/mp3agic/BufferTools;->indexOfTerminatorForEncoding([BII)I

    move-result v1

    const-string v3, ""

    if-ltz v1, :cond_0

    .line 29
    new-instance v4, Lcom/mpatric/mp3agic/EncodedText;

    aget-byte v0, p1, v0

    add-int/lit8 v5, v1, -0x1

    invoke-static {p1, v2, v5}, Lcom/mpatric/mp3agic/BufferTools;->copyBuffer([BII)[B

    move-result-object v2

    invoke-direct {v4, v0, v2}, Lcom/mpatric/mp3agic/EncodedText;-><init>(B[B)V

    iput-object v4, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    .line 30
    invoke-virtual {v4}, Lcom/mpatric/mp3agic/EncodedText;->getTerminator()[B

    move-result-object v0

    array-length v0, v0

    add-int v2, v1, v0

    goto :goto_0

    .line 32
    :cond_0
    new-instance v1, Lcom/mpatric/mp3agic/EncodedText;

    aget-byte v0, p1, v0

    invoke-direct {v1, v0, v3}, Lcom/mpatric/mp3agic/EncodedText;-><init>(BLjava/lang/String;)V

    iput-object v1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    .line 36
    :goto_0
    :try_start_0
    array-length v0, p1

    sub-int/2addr v0, v2

    invoke-static {p1, v2, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToString([BII)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 38
    :catch_0
    iput-object v3, p0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->url:Ljava/lang/String;

    :goto_1
    return-void
.end method
