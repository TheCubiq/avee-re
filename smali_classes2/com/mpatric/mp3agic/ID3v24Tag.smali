.class public Lcom/mpatric/mp3agic/ID3v24Tag;
.super Lcom/mpatric/mp3agic/AbstractID3v2Tag;
.source "ID3v24Tag.java"


# static fields
.field public static final ID_RECTIME:Ljava/lang/String; = "TDRC"

.field public static final VERSION:Ljava/lang/String; = "4.0"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;-><init>()V

    const-string v0, "4.0"

    .line 11
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->version:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;-><init>([B)V

    return-void
.end method


# virtual methods
.method protected createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;
    .locals 1

    .line 46
    new-instance v0, Lcom/mpatric/mp3agic/ID3v24Frame;

    invoke-direct {v0, p1, p2}, Lcom/mpatric/mp3agic/ID3v24Frame;-><init>(Ljava/lang/String;[B)V

    return-object v0
.end method

.method protected createFrame([BI)Lcom/mpatric/mp3agic/ID3v2Frame;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/mpatric/mp3agic/ID3v24Frame;

    invoke-direct {v0, p1, p2}, Lcom/mpatric/mp3agic/ID3v24Frame;-><init>([BI)V

    return-object v0
.end method

.method public getRecordingTime()Ljava/lang/String;
    .locals 2

    const-string v0, "TDRC"

    .line 67
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/ID3v24Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 69
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected packFlags([BI)V
    .locals 4

    const/4 v0, 0x5

    add-int/2addr p2, v0

    .line 28
    aget-byte v1, p1, p2

    iget-boolean v2, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->unsynchronisation:Z

    const/4 v3, 0x7

    invoke-static {v1, v3, v2}, Lcom/mpatric/mp3agic/BufferTools;->setBit(BIZ)B

    move-result v1

    aput-byte v1, p1, p2

    .line 29
    aget-byte v1, p1, p2

    iget-boolean v2, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->extendedHeader:Z

    const/4 v3, 0x6

    invoke-static {v1, v3, v2}, Lcom/mpatric/mp3agic/BufferTools;->setBit(BIZ)B

    move-result v1

    aput-byte v1, p1, p2

    .line 30
    aget-byte v1, p1, p2

    iget-boolean v2, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->experimental:Z

    invoke-static {v1, v0, v2}, Lcom/mpatric/mp3agic/BufferTools;->setBit(BIZ)B

    move-result v0

    aput-byte v0, p1, p2

    .line 31
    aget-byte v0, p1, p2

    iget-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->footer:Z

    const/4 v2, 0x4

    invoke-static {v0, v2, v1}, Lcom/mpatric/mp3agic/BufferTools;->setBit(BIZ)B

    move-result v0

    aput-byte v0, p1, p2

    return-void
.end method

.method public setGenreDescription(Ljava/lang/String;)V
    .locals 3

    .line 51
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v24Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 52
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v24Tag;->getFrameSets()Ljava/util/Map;

    move-result-object p1

    const-string v1, "TCON"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-nez p1, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v24Tag;->getFrameSets()Ljava/util/Map;

    move-result-object p1

    new-instance v2, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    invoke-direct {v2, v1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v2

    .line 56
    :cond_0
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->clear()V

    .line 57
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/mpatric/mp3agic/ID3v24Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;)V

    return-void
.end method

.method public setRecordingTime(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 74
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 75
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v24Tag;->invalidateDataLength()V

    .line 76
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v24Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 77
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TDRC"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/ID3v24Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/ID3v24Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method protected unpackFlags([B)V
    .locals 3

    const/4 v0, 0x5

    .line 20
    aget-byte v1, p1, v0

    const/4 v2, 0x7

    invoke-static {v1, v2}, Lcom/mpatric/mp3agic/BufferTools;->checkBit(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->unsynchronisation:Z

    .line 21
    aget-byte v1, p1, v0

    const/4 v2, 0x6

    invoke-static {v1, v2}, Lcom/mpatric/mp3agic/BufferTools;->checkBit(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->extendedHeader:Z

    .line 22
    aget-byte v1, p1, v0

    invoke-static {v1, v0}, Lcom/mpatric/mp3agic/BufferTools;->checkBit(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->experimental:Z

    .line 23
    aget-byte p1, p1, v0

    const/4 v0, 0x4

    invoke-static {p1, v0}, Lcom/mpatric/mp3agic/BufferTools;->checkBit(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->footer:Z

    return-void
.end method

.method protected useFrameUnsynchronisation()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/ID3v24Tag;->unsynchronisation:Z

    return v0
.end method
