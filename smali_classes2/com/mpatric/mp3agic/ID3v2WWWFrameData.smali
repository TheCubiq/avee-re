.class public Lcom/mpatric/mp3agic/ID3v2WWWFrameData;
.super Lcom/mpatric/mp3agic/AbstractID3v2FrameData;
.source "ID3v2WWWFrameData.java"


# instance fields
.field protected url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 15
    iput-object p2, p0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->url:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Z[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 20
    invoke-virtual {p0, p2}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->synchroniseAndUnpackFrameData([B)V

    return-void
.end method


# virtual methods
.method protected getLength()I
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->url:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->url:Ljava/lang/String;

    return-object v0
.end method

.method protected packFrameData()[B
    .locals 4

    .line 34
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->getLength()I

    move-result v0

    new-array v0, v0, [B

    .line 35
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->url:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 37
    :try_start_0
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->url:Ljava/lang/String;

    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->url:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v0, v3}, Lcom/mpatric/mp3agic/BufferTools;->stringIntoByteBuffer(Ljava/lang/String;II[BI)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->url:Ljava/lang/String;

    return-void
.end method

.method protected unpackFrameData([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 26
    :try_start_0
    array-length v1, p1

    invoke-static {p1, v0, v1}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToString([BII)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->url:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, ""

    .line 28
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->url:Ljava/lang/String;

    :goto_0
    return-void
.end method
