.class public Lcom/mpatric/mp3agic/ID3v2TextFrameData;
.super Lcom/mpatric/mp3agic/AbstractID3v2FrameData;
.source "ID3v2TextFrameData.java"


# instance fields
.field protected text:Lcom/mpatric/mp3agic/EncodedText;


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(ZLcom/mpatric/mp3agic/EncodedText;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 13
    iput-object p2, p0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    return-void
.end method

.method public constructor <init>(Z[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 18
    invoke-virtual {p0, p2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->synchroniseAndUnpackFrameData([B)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 66
    :cond_0
    invoke-super {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 68
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 70
    :cond_2
    check-cast p1, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    .line 71
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    if-nez v1, :cond_3

    .line 72
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz p1, :cond_4

    return v2

    .line 74
    :cond_3
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    invoke-virtual {v1, p1}, Lcom/mpatric/mp3agic/EncodedText;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method protected getLength()I
    .locals 3

    .line 42
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v1, v0

    :cond_0
    return v1
.end method

.method public getText()Lcom/mpatric/mp3agic/EncodedText;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 57
    invoke-super {p0}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 58
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/EncodedText;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method protected packFrameData()[B
    .locals 5

    .line 28
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getLength()I

    move-result v0

    new-array v0, v0, [B

    .line 29
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    if-eqz v1, :cond_0

    .line 30
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/EncodedText;->getTextEncoding()B

    move-result v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    .line 31
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2}, Lcom/mpatric/mp3agic/EncodedText;->toBytes(ZZ)[B

    move-result-object v1

    .line 32
    array-length v4, v1

    if-lez v4, :cond_0

    .line 33
    array-length v4, v1

    invoke-static {v1, v2, v4, v0, v3}, Lcom/mpatric/mp3agic/BufferTools;->copyIntoByteBuffer([BII[BI)V

    :cond_0
    return-object v0
.end method

.method public setText(Lcom/mpatric/mp3agic/EncodedText;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    return-void
.end method

.method protected unpackFrameData([B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 23
    new-instance v0, Lcom/mpatric/mp3agic/EncodedText;

    const/4 v1, 0x0

    aget-byte v1, p1, v1

    array-length v2, p1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-static {p1, v3, v2}, Lcom/mpatric/mp3agic/BufferTools;->copyBuffer([BII)[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(B[B)V

    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->text:Lcom/mpatric/mp3agic/EncodedText;

    return-void
.end method
