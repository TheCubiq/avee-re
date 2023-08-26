.class public Lcom/mpatric/mp3agic/ID3v2PictureFrameData;
.super Lcom/mpatric/mp3agic/AbstractID3v2FrameData;
.source "ID3v2PictureFrameData.java"


# instance fields
.field protected description:Lcom/mpatric/mp3agic/EncodedText;

.field protected imageData:[B

.field protected mimeType:Ljava/lang/String;

.field protected pictureType:B


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;BLcom/mpatric/mp3agic/EncodedText;[B)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 19
    iput-object p2, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    .line 20
    iput-byte p3, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->pictureType:B

    .line 21
    iput-object p4, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    .line 22
    iput-object p5, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->imageData:[B

    return-void
.end method

.method public constructor <init>(Z[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 27
    invoke-virtual {p0, p2}, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->synchroniseAndUnpackFrameData([B)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 143
    :cond_0
    invoke-super {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 145
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 147
    :cond_2
    check-cast p1, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;

    .line 148
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-nez v1, :cond_3

    .line 149
    iget-object v1, p1, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v1, :cond_4

    return v2

    .line 151
    :cond_3
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    invoke-virtual {v1, v3}, Lcom/mpatric/mp3agic/EncodedText;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    .line 153
    :cond_4
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->imageData:[B

    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->imageData:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    .line 155
    :cond_5
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    if-nez v1, :cond_6

    .line 156
    iget-object v1, p1, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    if-eqz v1, :cond_7

    return v2

    .line 158
    :cond_6
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    .line 160
    :cond_7
    iget-byte v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->pictureType:B

    iget-byte p1, p1, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->pictureType:B

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public getDescription()Lcom/mpatric/mp3agic/EncodedText;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    return-object v0
.end method

.method public getImageData()[B
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->imageData:[B

    return-object v0
.end method

.method protected getLength()I
    .locals 3

    .line 87
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v1, v0

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2, v2}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v1, v0

    goto :goto_0

    :cond_1
    add-int/2addr v1, v2

    .line 90
    :goto_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->imageData:[B

    if-eqz v0, :cond_2

    array-length v0, v0

    add-int/2addr v1, v0

    :cond_2
    return v1
.end method

.method public getMimeType()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public getPictureType()B
    .locals 1

    .line 103
    iget-byte v0, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->pictureType:B

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 129
    invoke-super {p0}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 130
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 131
    :cond_0
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/EncodedText;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 132
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->imageData:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 133
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    .line 134
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 135
    iget-byte v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->pictureType:B

    add-int/2addr v0, v1

    return v0
.end method

.method protected packFrameData()[B
    .locals 6

    .line 57
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->getLength()I

    move-result v0

    new-array v0, v0, [B

    .line 58
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/mpatric/mp3agic/EncodedText;->getTextEncoding()B

    move-result v1

    aput-byte v1, v0, v2

    goto :goto_0

    .line 59
    :cond_0
    aput-byte v2, v0, v2

    .line 61
    :goto_0
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 62
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    .line 64
    :try_start_0
    iget-object v4, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    invoke-static {v4, v2, v1, v0, v3}, Lcom/mpatric/mp3agic/BufferTools;->stringIntoByteBuffer(Ljava/lang/String;II[BI)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    add-int/2addr v1, v3

    add-int/lit8 v4, v1, 0x1

    .line 69
    aput-byte v2, v0, v1

    add-int/lit8 v1, v4, 0x1

    .line 70
    iget-byte v5, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->pictureType:B

    aput-byte v5, v0, v4

    .line 71
    iget-object v4, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/mpatric/mp3agic/EncodedText;->toBytes()[B

    move-result-object v4

    array-length v4, v4

    if-lez v4, :cond_2

    .line 72
    iget-object v4, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    invoke-virtual {v4, v3, v3}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v3

    .line 73
    array-length v4, v3

    invoke-static {v3, v2, v4, v0, v1}, Lcom/mpatric/mp3agic/BufferTools;->copyIntoByteBuffer([BII[BI)V

    .line 74
    array-length v3, v3

    add-int/2addr v1, v3

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v1, 0x1

    .line 76
    aput-byte v2, v0, v1

    move v1, v3

    .line 78
    :goto_2
    iget-object v3, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->imageData:[B

    if-eqz v3, :cond_3

    array-length v4, v3

    if-lez v4, :cond_3

    .line 79
    array-length v4, v3

    invoke-static {v3, v2, v4, v0, v1}, Lcom/mpatric/mp3agic/BufferTools;->copyIntoByteBuffer([BII[BI)V

    :cond_3
    return-object v0
.end method

.method public setDescription(Lcom/mpatric/mp3agic/EncodedText;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    return-void
.end method

.method public setImageData([B)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->imageData:[B

    return-void
.end method

.method public setMimeType(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    return-void
.end method

.method public setPictureType(B)V
    .locals 0

    .line 107
    iput-byte p1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->pictureType:B

    return-void
.end method

.method protected unpackFrameData([B)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 32
    invoke-static {p1, v0, v0}, Lcom/mpatric/mp3agic/BufferTools;->indexOfTerminator([BII)I

    move-result v1

    const-string v2, "image/unknown"

    if-ltz v1, :cond_0

    add-int/lit8 v3, v1, -0x1

    .line 35
    :try_start_0
    invoke-static {p1, v0, v3}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToString([BII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 37
    :catch_0
    iput-object v2, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    goto :goto_0

    .line 40
    :cond_0
    iput-object v2, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->mimeType:Ljava/lang/String;

    :goto_0
    add-int/lit8 v0, v1, 0x1

    .line 42
    aget-byte v0, p1, v0

    iput-byte v0, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->pictureType:B

    add-int/lit8 v1, v1, 0x2

    const/4 v0, 0x0

    .line 44
    aget-byte v2, p1, v0

    invoke-static {p1, v1, v2}, Lcom/mpatric/mp3agic/BufferTools;->indexOfTerminatorForEncoding([BII)I

    move-result v2

    if-ltz v2, :cond_1

    .line 46
    new-instance v3, Lcom/mpatric/mp3agic/EncodedText;

    aget-byte v0, p1, v0

    sub-int v4, v2, v1

    invoke-static {p1, v1, v4}, Lcom/mpatric/mp3agic/BufferTools;->copyBuffer([BII)[B

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(B[B)V

    iput-object v3, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    .line 47
    invoke-virtual {v3}, Lcom/mpatric/mp3agic/EncodedText;->getTerminator()[B

    move-result-object v0

    array-length v0, v0

    add-int v1, v2, v0

    goto :goto_1

    .line 49
    :cond_1
    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    aget-byte v0, p1, v0

    const-string v3, ""

    invoke-direct {v2, v0, v3}, Lcom/mpatric/mp3agic/EncodedText;-><init>(BLjava/lang/String;)V

    iput-object v2, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    .line 52
    :goto_1
    array-length v0, p1

    sub-int/2addr v0, v1

    invoke-static {p1, v1, v0}, Lcom/mpatric/mp3agic/BufferTools;->copyBuffer([BII)[B

    move-result-object p1

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->imageData:[B

    return-void
.end method
