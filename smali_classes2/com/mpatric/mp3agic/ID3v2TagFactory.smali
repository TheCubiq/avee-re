.class public Lcom/mpatric/mp3agic/ID3v2TagFactory;
.super Ljava/lang/Object;
.source "ID3v2TagFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static createID3v22Tag([B)Lcom/mpatric/mp3agic/AbstractID3v2Tag;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 17
    new-instance v0, Lcom/mpatric/mp3agic/ID3v22Tag;

    invoke-direct {v0, p0}, Lcom/mpatric/mp3agic/ID3v22Tag;-><init>([B)V

    .line 18
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v22Tag;->getFrameSets()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 19
    new-instance v0, Lcom/mpatric/mp3agic/ID3v22Tag;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/mpatric/mp3agic/ID3v22Tag;-><init>([BZ)V

    :cond_0
    return-object v0
.end method

.method public static createTag([B)Lcom/mpatric/mp3agic/AbstractID3v2Tag;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 6
    invoke-static {p0}, Lcom/mpatric/mp3agic/ID3v2TagFactory;->sanityCheckTag([B)V

    const/4 v0, 0x3

    .line 7
    aget-byte v1, p0, v0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x4

    if-ne v1, v0, :cond_0

    .line 11
    new-instance v0, Lcom/mpatric/mp3agic/ID3v24Tag;

    invoke-direct {v0, p0}, Lcom/mpatric/mp3agic/ID3v24Tag;-><init>([B)V

    return-object v0

    .line 13
    :cond_0
    new-instance p0, Lcom/mpatric/mp3agic/UnsupportedTagException;

    const-string v0, "Tag version not supported"

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/UnsupportedTagException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 10
    :cond_1
    new-instance v0, Lcom/mpatric/mp3agic/ID3v23Tag;

    invoke-direct {v0, p0}, Lcom/mpatric/mp3agic/ID3v23Tag;-><init>([B)V

    return-object v0

    .line 9
    :cond_2
    invoke-static {p0}, Lcom/mpatric/mp3agic/ID3v2TagFactory;->createID3v22Tag([B)Lcom/mpatric/mp3agic/AbstractID3v2Tag;

    move-result-object p0

    return-object p0
.end method

.method public static sanityCheckTag([B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;
        }
    .end annotation

    .line 25
    array-length v0, p0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_3

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 28
    invoke-static {p0, v0, v1}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v0

    const-string v2, "ID3"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 31
    aget-byte v0, p0, v1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    aget-byte p0, p0, v1

    .line 34
    new-instance v1, Lcom/mpatric/mp3agic/UnsupportedTagException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported version 2."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/mpatric/mp3agic/UnsupportedTagException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    return-void

    .line 29
    :cond_2
    new-instance p0, Lcom/mpatric/mp3agic/NoSuchTagException;

    invoke-direct {p0}, Lcom/mpatric/mp3agic/NoSuchTagException;-><init>()V

    throw p0

    .line 26
    :cond_3
    new-instance p0, Lcom/mpatric/mp3agic/NoSuchTagException;

    const-string v0, "Buffer too short"

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/NoSuchTagException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
