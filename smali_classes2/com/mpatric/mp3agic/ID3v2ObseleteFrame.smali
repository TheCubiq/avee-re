.class public Lcom/mpatric/mp3agic/ID3v2ObseleteFrame;
.super Lcom/mpatric/mp3agic/ID3v2Frame;
.source "ID3v2ObseleteFrame.java"


# static fields
.field protected static final DATA_LENGTH_OFFSET:I = 0x3

.field private static final HEADER_LENGTH:I = 0x6

.field private static final ID_LENGTH:I = 0x3

.field private static final ID_OFFSET:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/mpatric/mp3agic/ID3v2Frame;-><init>(Ljava/lang/String;[B)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/mpatric/mp3agic/ID3v2Frame;-><init>([BI)V

    return-void
.end method


# virtual methods
.method public getLength()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/mpatric/mp3agic/ID3v2ObseleteFrame;->dataLength:I

    add-int/lit8 v0, v0, 0x6

    return v0
.end method

.method public packFrame([BI)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NotSupportedException;
        }
    .end annotation

    .line 32
    new-instance p1, Lcom/mpatric/mp3agic/NotSupportedException;

    const-string p2, "Packing Obselete frames is not supported"

    invoke-direct {p1, p2}, Lcom/mpatric/mp3agic/NotSupportedException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected unpackDataLength([BI)V
    .locals 2

    add-int/lit8 p2, p2, 0x3

    .line 27
    aget-byte v0, p1, p2

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    add-int/lit8 p2, p2, 0x2

    aget-byte p1, p1, p2

    const/4 p2, 0x0

    invoke-static {p2, v0, v1, p1}, Lcom/mpatric/mp3agic/BufferTools;->unpackInteger(BBBB)I

    move-result p1

    iput p1, p0, Lcom/mpatric/mp3agic/ID3v2ObseleteFrame;->dataLength:I

    return-void
.end method

.method protected unpackHeader([BI)I
    .locals 2

    add-int/lit8 v0, p2, 0x0

    const/4 v1, 0x3

    .line 20
    invoke-static {p1, v0, v1}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ObseleteFrame;->id:Ljava/lang/String;

    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/mpatric/mp3agic/ID3v2ObseleteFrame;->unpackDataLength([BI)V

    add-int/lit8 p2, p2, 0x6

    return p2
.end method
