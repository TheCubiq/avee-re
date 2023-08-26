.class public Lcom/mpatric/mp3agic/ID3v23Tag;
.super Lcom/mpatric/mp3agic/AbstractID3v2Tag;
.source "ID3v23Tag.java"


# static fields
.field public static final VERSION:Ljava/lang/String; = "3.0"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;-><init>()V

    const-string v0, "3.0"

    .line 9
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v23Tag;->version:Ljava/lang/String;

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

    .line 13
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;-><init>([B)V

    return-void
.end method


# virtual methods
.method protected packFlags([BI)V
    .locals 4

    const/4 v0, 0x5

    add-int/2addr p2, v0

    .line 25
    aget-byte v1, p1, p2

    iget-boolean v2, p0, Lcom/mpatric/mp3agic/ID3v23Tag;->unsynchronisation:Z

    const/4 v3, 0x7

    invoke-static {v1, v3, v2}, Lcom/mpatric/mp3agic/BufferTools;->setBit(BIZ)B

    move-result v1

    aput-byte v1, p1, p2

    .line 26
    aget-byte v1, p1, p2

    iget-boolean v2, p0, Lcom/mpatric/mp3agic/ID3v23Tag;->extendedHeader:Z

    const/4 v3, 0x6

    invoke-static {v1, v3, v2}, Lcom/mpatric/mp3agic/BufferTools;->setBit(BIZ)B

    move-result v1

    aput-byte v1, p1, p2

    .line 27
    aget-byte v1, p1, p2

    iget-boolean v2, p0, Lcom/mpatric/mp3agic/ID3v23Tag;->experimental:Z

    invoke-static {v1, v0, v2}, Lcom/mpatric/mp3agic/BufferTools;->setBit(BIZ)B

    move-result v0

    aput-byte v0, p1, p2

    return-void
.end method

.method protected unpackFlags([B)V
    .locals 3

    const/4 v0, 0x5

    .line 18
    aget-byte v1, p1, v0

    const/4 v2, 0x7

    invoke-static {v1, v2}, Lcom/mpatric/mp3agic/BufferTools;->checkBit(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v23Tag;->unsynchronisation:Z

    .line 19
    aget-byte v1, p1, v0

    const/4 v2, 0x6

    invoke-static {v1, v2}, Lcom/mpatric/mp3agic/BufferTools;->checkBit(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v23Tag;->extendedHeader:Z

    .line 20
    aget-byte p1, p1, v0

    invoke-static {p1, v0}, Lcom/mpatric/mp3agic/BufferTools;->checkBit(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/mpatric/mp3agic/ID3v23Tag;->experimental:Z

    return-void
.end method
