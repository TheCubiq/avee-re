.class public Lcom/mpatric/mp3agic/ID3v2CommentFrameData;
.super Lcom/mpatric/mp3agic/AbstractID3v2FrameData;
.source "ID3v2CommentFrameData.java"


# static fields
.field private static final DEFAULT_LANGUAGE:Ljava/lang/String; = "eng"


# instance fields
.field private comment:Lcom/mpatric/mp3agic/EncodedText;

.field private description:Lcom/mpatric/mp3agic/EncodedText;

.field private language:Ljava/lang/String;


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Lcom/mpatric/mp3agic/EncodedText;Lcom/mpatric/mp3agic/EncodedText;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 19
    iput-object p2, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    .line 21
    iput-object p4, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    return-void
.end method

.method public constructor <init>(Z[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 26
    invoke-virtual {p0, p2}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->synchroniseAndUnpackFrameData([B)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 128
    :cond_0
    invoke-super {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 130
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 132
    :cond_2
    check-cast p1, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;

    .line 133
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    if-nez v1, :cond_3

    .line 134
    iget-object v1, p1, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v1, :cond_4

    return v2

    .line 136
    :cond_3
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    invoke-virtual {v1, v3}, Lcom/mpatric/mp3agic/EncodedText;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    .line 138
    :cond_4
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-nez v1, :cond_5

    .line 139
    iget-object v1, p1, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v1, :cond_6

    return v2

    .line 141
    :cond_5
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    invoke-virtual {v1, v3}, Lcom/mpatric/mp3agic/EncodedText;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    .line 143
    :cond_6
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    if-nez v1, :cond_7

    .line 144
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    if-eqz p1, :cond_8

    return v2

    .line 146
    :cond_7
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public getComment()Lcom/mpatric/mp3agic/EncodedText;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    return-object v0
.end method

.method public getDescription()Lcom/mpatric/mp3agic/EncodedText;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    return-object v0
.end method

.method protected getLength()I
    .locals 4

    .line 82
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1, v1}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    .line 84
    :goto_0
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v1

    array-length v1, v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 115
    invoke-super {p0}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 116
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

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

    .line 117
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    .line 118
    :cond_1
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/EncodedText;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 119
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    .line 120
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method protected packFrameData()[B
    .locals 6

    .line 49
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->getLength()I

    move-result v0

    new-array v0, v0, [B

    .line 50
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/mpatric/mp3agic/EncodedText;->getTextEncoding()B

    move-result v1

    aput-byte v1, v0, v2

    goto :goto_0

    .line 51
    :cond_0
    aput-byte v2, v0, v2

    .line 53
    :goto_0
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    const/4 v3, 0x3

    if-nez v1, :cond_1

    const-string v1, "eng"

    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_2

    .line 56
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 58
    :cond_2
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    invoke-static {v1, v3, v2}, Lcom/mpatric/mp3agic/BufferTools;->padStringRight(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v1

    :goto_1
    const/4 v4, 0x1

    .line 61
    :try_start_0
    invoke-static {v1, v2, v3, v0, v4}, Lcom/mpatric/mp3agic/BufferTools;->stringIntoByteBuffer(Ljava/lang/String;II[BI)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    :goto_2
    const/4 v1, 0x4

    .line 65
    iget-object v3, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v3, :cond_3

    .line 66
    invoke-virtual {v3, v4, v4}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v3

    .line 67
    array-length v5, v3

    invoke-static {v3, v2, v5, v0, v1}, Lcom/mpatric/mp3agic/BufferTools;->copyIntoByteBuffer([BII[BI)V

    .line 68
    array-length v3, v3

    add-int/2addr v3, v1

    goto :goto_3

    :cond_3
    const/4 v3, 0x5

    .line 70
    aput-byte v2, v0, v1

    .line 72
    :goto_3
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v1, :cond_4

    .line 73
    invoke-virtual {v1, v4, v2}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v1

    .line 74
    array-length v4, v1

    invoke-static {v1, v2, v4, v0, v3}, Lcom/mpatric/mp3agic/BufferTools;->copyIntoByteBuffer([BII[BI)V

    :cond_4
    return-object v0
.end method

.method public setComment(Lcom/mpatric/mp3agic/EncodedText;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    return-void
.end method

.method public setDescription(Lcom/mpatric/mp3agic/EncodedText;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    return-void
.end method

.method protected unpackFrameData([B)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const-string v0, ""

    const/4 v1, 0x1

    const/4 v2, 0x3

    .line 32
    :try_start_0
    invoke-static {p1, v1, v2}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToString([BII)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 34
    :catch_0
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->language:Ljava/lang/String;

    :goto_0
    const/4 v1, 0x0

    .line 36
    aget-byte v2, p1, v1

    const/4 v3, 0x4

    invoke-static {p1, v3, v2}, Lcom/mpatric/mp3agic/BufferTools;->indexOfTerminatorForEncoding([BII)I

    move-result v2

    if-lt v2, v3, :cond_0

    .line 38
    new-instance v0, Lcom/mpatric/mp3agic/EncodedText;

    aget-byte v4, p1, v1

    add-int/lit8 v5, v2, -0x4

    invoke-static {p1, v3, v5}, Lcom/mpatric/mp3agic/BufferTools;->copyBuffer([BII)[B

    move-result-object v3

    invoke-direct {v0, v4, v3}, Lcom/mpatric/mp3agic/EncodedText;-><init>(B[B)V

    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    .line 39
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->getTerminator()[B

    move-result-object v0

    array-length v0, v0

    add-int v3, v2, v0

    goto :goto_1

    .line 41
    :cond_0
    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    aget-byte v4, p1, v1

    invoke-direct {v2, v4, v0}, Lcom/mpatric/mp3agic/EncodedText;-><init>(BLjava/lang/String;)V

    iput-object v2, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->description:Lcom/mpatric/mp3agic/EncodedText;

    .line 44
    :goto_1
    new-instance v0, Lcom/mpatric/mp3agic/EncodedText;

    aget-byte v1, p1, v1

    array-length v2, p1

    sub-int/2addr v2, v3

    invoke-static {p1, v3, v2}, Lcom/mpatric/mp3agic/BufferTools;->copyBuffer([BII)[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(B[B)V

    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->comment:Lcom/mpatric/mp3agic/EncodedText;

    return-void
.end method
