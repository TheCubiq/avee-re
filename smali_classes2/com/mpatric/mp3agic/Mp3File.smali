.class public Lcom/mpatric/mp3agic/Mp3File;
.super Lcom/mpatric/mp3agic/FileWrapper;
.source "Mp3File.java"


# static fields
.field private static final DEFAULT_BUFFER_LENGTH:I = 0x10000

.field private static final MINIMUM_BUFFER_LENGTH:I = 0x28

.field private static final XING_MARKER_OFFSET_1:I = 0xd

.field private static final XING_MARKER_OFFSET_2:I = 0x15

.field private static final XING_MARKER_OFFSET_3:I = 0x24


# instance fields
.field private bitrate:D

.field private bitrates:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/mpatric/mp3agic/MutableInteger;",
            ">;"
        }
    .end annotation
.end field

.field protected bufferLength:I

.field private channelMode:Ljava/lang/String;

.field private copyright:Z

.field private customTag:[B

.field private emphasis:Ljava/lang/String;

.field private endOffset:I

.field private frameCount:I

.field private id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

.field private id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

.field private layer:Ljava/lang/String;

.field private modeExtension:Ljava/lang/String;

.field private original:Z

.field private sampleRate:I

.field private scanFile:Z

.field private startOffset:I

.field private version:Ljava/lang/String;

.field private xingBitrate:I

.field private xingOffset:I


# direct methods
.method protected constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Lcom/mpatric/mp3agic/FileWrapper;-><init>()V

    const/4 v0, -0x1

    .line 18
    iput v0, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    .line 19
    iput v0, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    .line 20
    iput v0, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrates:Ljava/util/Map;

    const-wide/16 v0, 0x0

    .line 24
    iput-wide v0, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrate:D

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/FileWrapper;-><init>(Ljava/lang/String;)V

    const/4 p1, -0x1

    .line 18
    iput p1, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    .line 19
    iput p1, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    .line 20
    iput p1, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    .line 22
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrates:Ljava/util/Map;

    const-wide/16 v0, 0x0

    .line 24
    iput-wide v0, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrate:D

    const/high16 p1, 0x10000

    const/4 v0, 0x1

    .line 43
    invoke-direct {p0, p1, v0}, Lcom/mpatric/mp3agic/Mp3File;->init(IZ)V

    return-void
.end method

.method private addBitrate(I)V
    .locals 5

    .line 208
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 209
    iget-object v1, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrates:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mpatric/mp3agic/MutableInteger;

    if-eqz v1, :cond_0

    .line 211
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MutableInteger;->increment()V

    goto :goto_0

    .line 213
    :cond_0
    iget-object v1, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrates:Ljava/util/Map;

    new-instance v2, Lcom/mpatric/mp3agic/MutableInteger;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/mpatric/mp3agic/MutableInteger;-><init>(I)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    :goto_0
    iget-wide v0, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrate:D

    iget v2, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    add-int/lit8 v3, v2, -0x1

    int-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v3

    int-to-double v3, p1

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v0, v3

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    iput-wide v0, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrate:D

    return-void
.end method

.method private init(IZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const/16 v0, 0x29

    if-lt p1, v0, :cond_2

    .line 49
    iput p1, p0, Lcom/mpatric/mp3agic/Mp3File;->bufferLength:I

    .line 50
    iput-boolean p2, p0, Lcom/mpatric/mp3agic/Mp3File;->scanFile:Z

    .line 52
    new-instance p1, Ljava/io/RandomAccessFile;

    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "r"

    invoke-direct {p1, v0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :try_start_0
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/Mp3File;->initId3v1Tag(Ljava/io/RandomAccessFile;)V

    .line 54
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/Mp3File;->scanFile(Ljava/io/RandomAccessFile;)V

    .line 55
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    if-ltz v0, :cond_1

    .line 58
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/Mp3File;->initId3v2Tag(Ljava/io/RandomAccessFile;)V

    if-eqz p2, :cond_0

    .line 60
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/Mp3File;->initCustomTag(Ljava/io/RandomAccessFile;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    :cond_0
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->close()V

    return-void

    .line 56
    :cond_1
    :try_start_1
    new-instance p2, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "No mpegs frames found"

    invoke-direct {p2, v0}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p2

    .line 52
    :try_start_2
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p2

    .line 62
    :try_start_3
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    throw p2

    .line 47
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Buffer too small"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private initCustomTag(Ljava/io/RandomAccessFile;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 250
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->getLength()J

    move-result-wide v0

    iget v2, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    add-int/lit8 v2, v2, 0x1

    int-to-long v2, v2

    sub-long/2addr v0, v2

    long-to-int v1, v0

    .line 251
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->hasId3v1Tag()Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v1, v1, -0x80

    :cond_0
    if-gtz v1, :cond_1

    const/4 p1, 0x0

    .line 253
    iput-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->customTag:[B

    goto :goto_0

    .line 256
    :cond_1
    new-array v0, v1, [B

    iput-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->customTag:[B

    .line 257
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    add-int/lit8 v0, v0, 0x1

    int-to-long v2, v0

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 258
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->customTag:[B

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p1

    if-lt p1, v1, :cond_2

    :goto_0
    return-void

    .line 259
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Not enough bytes read"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private initId3v1Tag(Ljava/io/RandomAccessFile;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x80

    new-array v1, v0, [B

    .line 220
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->getLength()J

    move-result-wide v2

    const-wide/16 v4, 0x80

    sub-long/2addr v2, v4

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    .line 221
    invoke-virtual {p1, v1, v2, v0}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p1

    if-lt p1, v0, :cond_0

    .line 224
    :try_start_0
    new-instance p1, Lcom/mpatric/mp3agic/ID3v1Tag;

    invoke-direct {p1, v1}, Lcom/mpatric/mp3agic/ID3v1Tag;-><init>([B)V

    iput-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;
    :try_end_0
    .catch Lcom/mpatric/mp3agic/NoSuchTagException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    .line 226
    iput-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    :goto_0
    return-void

    .line 222
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Not enough bytes read"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private initId3v2Tag(Ljava/io/RandomAccessFile;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 231
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    if-nez v0, :cond_0

    goto :goto_1

    .line 235
    :cond_0
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->hasXingFrame()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    goto :goto_0

    .line 236
    :cond_1
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    .line 237
    :goto_0
    new-array v2, v0, [B

    const-wide/16 v3, 0x0

    .line 238
    invoke-virtual {p1, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v3, 0x0

    .line 239
    invoke-virtual {p1, v2, v3, v0}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p1

    if-lt p1, v0, :cond_2

    .line 242
    :try_start_0
    invoke-static {v2}, Lcom/mpatric/mp3agic/ID3v2TagFactory;->createTag([B)Lcom/mpatric/mp3agic/AbstractID3v2Tag;

    move-result-object p1

    iput-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;
    :try_end_0
    .catch Lcom/mpatric/mp3agic/NoSuchTagException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 244
    :catch_0
    iput-object v1, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    goto :goto_2

    .line 240
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Not enough bytes read"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 232
    :cond_3
    :goto_1
    iput-object v1, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    :goto_2
    return-void
.end method

.method private isXingFrame([BI)Z
    .locals 7

    .line 185
    array-length v0, p1

    add-int/lit8 v1, p2, 0xd

    add-int/lit8 v2, v1, 0x3

    if-lt v0, v2, :cond_5

    const/4 v0, 0x4

    .line 186
    invoke-static {p1, v1, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Xing"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    return v4

    .line 187
    :cond_0
    invoke-static {p1, v1, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Info"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v4

    .line 188
    :cond_1
    array-length v1, p1

    add-int/lit8 v5, p2, 0x15

    add-int/lit8 v6, v5, 0x3

    if-lt v1, v6, :cond_5

    .line 189
    invoke-static {p1, v5, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v4

    .line 190
    :cond_2
    invoke-static {p1, v5, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return v4

    .line 191
    :cond_3
    array-length v1, p1

    add-int/lit8 p2, p2, 0x24

    add-int/lit8 v5, p2, 0x3

    if-lt v1, v5, :cond_5

    .line 192
    invoke-static {p1, p2, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v4

    .line 193
    :cond_4
    invoke-static {p1, p2, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v4

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method private maxEndOffset()I
    .locals 2

    .line 179
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->getLength()J

    move-result-wide v0

    long-to-int v1, v0

    .line 180
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->hasId3v1Tag()Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v1, v1, -0x80

    :cond_0
    return v1
.end method

.method private sanityCheckFrame(Lcom/mpatric/mp3agic/MpegFrame;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 201
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->sampleRate:I

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/MpegFrame;->getSampleRate()I

    move-result v1

    const-string v2, "Inconsistent frame header"

    if-ne v0, v1, :cond_3

    .line 202
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->layer:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/MpegFrame;->getLayer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->version:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/MpegFrame;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/MpegFrame;->getLengthInBytes()I

    move-result p1

    add-int/2addr p2, p1

    int-to-long p1, p2

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->getLength()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    return-void

    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string p2, "Frame would extend beyond end of file"

    invoke-direct {p1, p2}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 203
    :cond_1
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    invoke-direct {p1, v2}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 202
    :cond_2
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    invoke-direct {p1, v2}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 201
    :cond_3
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    invoke-direct {p1, v2}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private saveMpegFrames(Ljava/io/RandomAccessFile;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 407
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    if-gez v0, :cond_0

    .line 408
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    :cond_0
    if-gez v0, :cond_1

    return-void

    .line 410
    :cond_1
    iget v1, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    if-ge v1, v0, :cond_2

    return-void

    .line 411
    :cond_2
    new-instance v1, Ljava/io/RandomAccessFile;

    iget-object v2, p0, Lcom/mpatric/mp3agic/Mp3File;->file:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    const-string v3, "r"

    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    iget v2, p0, Lcom/mpatric/mp3agic/Mp3File;->bufferLength:I

    new-array v2, v2, [B

    int-to-long v3, v0

    .line 414
    :try_start_0
    invoke-virtual {v1, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 416
    :goto_0
    iget v3, p0, Lcom/mpatric/mp3agic/Mp3File;->bufferLength:I

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v3

    add-int v5, v0, v3

    .line 417
    iget v6, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    if-gt v5, v6, :cond_3

    .line 418
    invoke-virtual {p1, v2, v4, v3}, Ljava/io/RandomAccessFile;->write([BII)V

    move v0, v5

    goto :goto_0

    .line 421
    :cond_3
    iget v3, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    sub-int/2addr v3, v0

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p1, v2, v4, v3}, Ljava/io/RandomAccessFile;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 426
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private scanBlock([BIII)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    :goto_0
    add-int/lit8 v0, p2, -0x28

    if-ge p4, v0, :cond_0

    .line 163
    new-instance v0, Lcom/mpatric/mp3agic/MpegFrame;

    aget-byte v1, p1, p4

    add-int/lit8 v2, p4, 0x1

    aget-byte v2, p1, v2

    add-int/lit8 v3, p4, 0x2

    aget-byte v3, p1, v3

    add-int/lit8 v4, p4, 0x3

    aget-byte v4, p1, v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mpatric/mp3agic/MpegFrame;-><init>(BBBB)V

    add-int v1, p3, p4

    .line 164
    invoke-direct {p0, v0, v1}, Lcom/mpatric/mp3agic/Mp3File;->sanityCheckFrame(Lcom/mpatric/mp3agic/MpegFrame;I)V

    .line 165
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/MpegFrame;->getLengthInBytes()I

    move-result v2

    add-int/2addr v2, v1

    add-int/lit8 v2, v2, -0x1

    .line 166
    invoke-direct {p0}, Lcom/mpatric/mp3agic/Mp3File;->maxEndOffset()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 167
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/MpegFrame;->getLengthInBytes()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    .line 168
    iget v1, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    .line 169
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/MpegFrame;->getBitrate()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/mpatric/mp3agic/Mp3File;->addBitrate(I)V

    .line 170
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/MpegFrame;->getLengthInBytes()I

    move-result v0

    add-int/2addr p4, v0

    goto :goto_0

    :cond_0
    return p4
.end method

.method private scanBlockForStart([BIII)I
    .locals 6

    :goto_0
    add-int/lit8 v0, p2, -0x28

    if-ge p4, v0, :cond_2

    .line 129
    aget-byte v0, p1, p4

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, p4, 0x1

    aget-byte v1, p1, v0

    const/16 v2, -0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    .line 131
    :try_start_0
    new-instance v1, Lcom/mpatric/mp3agic/MpegFrame;

    aget-byte v2, p1, p4

    aget-byte v3, p1, v0

    add-int/lit8 v4, p4, 0x2

    aget-byte v4, p1, v4

    add-int/lit8 v5, p4, 0x3

    aget-byte v5, p1, v5

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/mpatric/mp3agic/MpegFrame;-><init>(BBBB)V

    .line 132
    iget v2, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    if-gez v2, :cond_0

    invoke-direct {p0, p1, p4}, Lcom/mpatric/mp3agic/Mp3File;->isXingFrame([BI)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int v2, p3, p4

    .line 133
    iput v2, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    .line 134
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getBitrate()I

    move-result v2

    iput v2, p0, Lcom/mpatric/mp3agic/Mp3File;->xingBitrate:I

    .line 135
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getLengthInBytes()I

    move-result v0

    add-int/2addr p4, v0

    goto :goto_0

    :cond_0
    add-int v2, p3, p4

    .line 137
    iput v2, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    .line 138
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getChannelMode()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/mpatric/mp3agic/Mp3File;->channelMode:Ljava/lang/String;

    .line 139
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getEmphasis()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/mpatric/mp3agic/Mp3File;->emphasis:Ljava/lang/String;

    .line 140
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getLayer()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/mpatric/mp3agic/Mp3File;->layer:Ljava/lang/String;

    .line 141
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getModeExtension()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/mpatric/mp3agic/Mp3File;->modeExtension:Ljava/lang/String;

    .line 142
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getSampleRate()I

    move-result v2

    iput v2, p0, Lcom/mpatric/mp3agic/Mp3File;->sampleRate:I

    .line 143
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getVersion()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/mpatric/mp3agic/Mp3File;->version:Ljava/lang/String;

    .line 144
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->isCopyright()Z

    move-result v2

    iput-boolean v2, p0, Lcom/mpatric/mp3agic/Mp3File;->copyright:Z

    .line 145
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->isOriginal()Z

    move-result v2

    iput-boolean v2, p0, Lcom/mpatric/mp3agic/Mp3File;->original:Z

    .line 146
    iget v2, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    .line 147
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getBitrate()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/mpatric/mp3agic/Mp3File;->addBitrate(I)V

    .line 148
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/MpegFrame;->getLengthInBytes()I

    move-result p1
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr p4, p1

    return p4

    :catch_0
    move p4, v0

    goto/16 :goto_0

    :cond_1
    add-int/lit8 p4, p4, 0x1

    goto/16 :goto_0

    :cond_2
    return p4
.end method

.method private scanFile(Ljava/io/RandomAccessFile;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 85
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->bufferLength:I

    new-array v0, v0, [B

    .line 86
    invoke-virtual {p0, p1}, Lcom/mpatric/mp3agic/Mp3File;->preScanFile(Ljava/io/RandomAccessFile;)I

    move-result v1

    int-to-long v2, v1

    .line 87
    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    const/4 v4, 0x0

    :cond_0
    :goto_1
    if-nez v4, :cond_5

    .line 91
    iget v5, p0, Lcom/mpatric/mp3agic/Mp3File;->bufferLength:I

    invoke-virtual {p1, v0, v2, v5}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v5

    .line 92
    iget v6, p0, Lcom/mpatric/mp3agic/Mp3File;->bufferLength:I

    if-ge v5, v6, :cond_1

    const/4 v4, 0x1

    :cond_1
    const/16 v6, 0x28

    if-lt v5, v6, :cond_0

    .line 97
    :try_start_0
    iget v6, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    if-gez v6, :cond_3

    .line 98
    invoke-direct {p0, v0, v5, v1, v2}, Lcom/mpatric/mp3agic/Mp3File;->scanBlockForStart([BIII)I

    move-result v6

    .line 99
    iget v7, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    if-ltz v7, :cond_2

    iget-boolean v7, p0, Lcom/mpatric/mp3agic/Mp3File;->scanFile:Z

    if-nez v7, :cond_2

    return-void

    .line 102
    :cond_2
    iget v3, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    .line 104
    :goto_2
    invoke-direct {p0, v0, v5, v1, v6}, Lcom/mpatric/mp3agic/Mp3File;->scanBlock([BIII)I

    move-result v5

    add-int/2addr v1, v5

    int-to-long v5, v1

    .line 106
    invoke-virtual {p1, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 109
    iget v4, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    const/4 v5, 0x2

    if-ge v4, v5, :cond_5

    const/4 v4, -0x1

    .line 110
    iput v4, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    .line 111
    iput v4, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    .line 112
    iput v2, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    .line 113
    iget-object v4, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrates:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->clear()V

    add-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_4

    int-to-long v5, v4

    .line 117
    invoke-virtual {p1, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    move v1, v4

    goto :goto_0

    .line 116
    :cond_4
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "Valid start of mpeg frames not found"

    invoke-direct {p1, v0, v1}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_5
    return-void
.end method


# virtual methods
.method public getBitrate()I
    .locals 4

    .line 289
    iget-wide v0, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrate:D

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public getBitrates()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/mpatric/mp3agic/MutableInteger;",
            ">;"
        }
    .end annotation

    .line 293
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrates:Ljava/util/Map;

    return-object v0
.end method

.method public getChannelMode()Ljava/lang/String;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->channelMode:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomTag()[B
    .locals 1

    .line 377
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->customTag:[B

    return-object v0
.end method

.method public getEmphasis()Ljava/lang/String;
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->emphasis:Ljava/lang/String;

    return-object v0
.end method

.method public getEndOffset()I
    .locals 1

    .line 272
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    return v0
.end method

.method public getFrameCount()I
    .locals 1

    .line 264
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->frameCount:I

    return v0
.end method

.method public getId3v1Tag()Lcom/mpatric/mp3agic/ID3v1;
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    return-object v0
.end method

.method public getId3v2Tag()Lcom/mpatric/mp3agic/ID3v2;
    .locals 1

    .line 361
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    return-object v0
.end method

.method public getLayer()Ljava/lang/String;
    .locals 1

    .line 309
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->layer:Ljava/lang/String;

    return-object v0
.end method

.method public getLengthInMilliseconds()J
    .locals 4

    .line 276
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->endOffset:I

    iget v1, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x8

    int-to-double v0, v0

    .line 277
    iget-wide v2, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrate:D

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-long v0, v0

    return-wide v0
.end method

.method public getLengthInSeconds()J
    .locals 4

    .line 281
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->getLengthInMilliseconds()J

    move-result-wide v0

    const-wide/16 v2, 0x1f4

    add-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public getModeExtension()Ljava/lang/String;
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->modeExtension:Ljava/lang/String;

    return-object v0
.end method

.method public getSampleRate()I
    .locals 1

    .line 321
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->sampleRate:I

    return v0
.end method

.method public getStartOffset()I
    .locals 1

    .line 268
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->startOffset:I

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 325
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->version:Ljava/lang/String;

    return-object v0
.end method

.method public getXingBitrate()I
    .locals 1

    .line 337
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->xingBitrate:I

    return v0
.end method

.method public getXingOffset()I
    .locals 1

    .line 333
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    return v0
.end method

.method public hasCustomTag()Z
    .locals 1

    .line 373
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->customTag:[B

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasId3v1Tag()Z
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasId3v2Tag()Z
    .locals 1

    .line 357
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasXingFrame()Z
    .locals 1

    .line 329
    iget v0, p0, Lcom/mpatric/mp3agic/Mp3File;->xingOffset:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isCopyright()Z
    .locals 1

    .line 301
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/Mp3File;->copyright:Z

    return v0
.end method

.method public isOriginal()Z
    .locals 1

    .line 317
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/Mp3File;->original:Z

    return v0
.end method

.method public isVbr()Z
    .locals 2

    .line 285
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->bitrates:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method protected preScanFile(Ljava/io/RandomAccessFile;)I
    .locals 6

    const/16 v0, 0xa

    new-array v1, v0, [B

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    .line 68
    :try_start_0
    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 69
    invoke-virtual {p1, v1, v4, v0}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, v0, :cond_0

    .line 72
    :try_start_1
    invoke-static {v1}, Lcom/mpatric/mp3agic/ID3v2TagFactory;->sanityCheckTag([B)V

    const/4 p1, 0x6

    .line 73
    aget-byte p1, v1, p1

    const/4 v2, 0x7

    aget-byte v2, v1, v2

    const/16 v3, 0x8

    aget-byte v3, v1, v3

    const/16 v5, 0x9

    aget-byte v1, v1, v5

    invoke-static {p1, v2, v3, v1}, Lcom/mpatric/mp3agic/BufferTools;->unpackSynchsafeInteger(BBBB)I

    move-result p1
    :try_end_1
    .catch Lcom/mpatric/mp3agic/NoSuchTagException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/mpatric/mp3agic/UnsupportedTagException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/2addr p1, v0

    return p1

    :catch_0
    :cond_0
    return v4
.end method

.method public removeCustomTag()V
    .locals 1

    const/4 v0, 0x0

    .line 385
    iput-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->customTag:[B

    return-void
.end method

.method public removeId3v1Tag()V
    .locals 1

    const/4 v0, 0x0

    .line 353
    iput-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    return-void
.end method

.method public removeId3v2Tag()V
    .locals 1

    const/4 v0, 0x0

    .line 369
    iput-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    return-void
.end method

.method public save(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/mpatric/mp3agic/NotSupportedException;
        }
    .end annotation

    .line 389
    iget-object v0, p0, Lcom/mpatric/mp3agic/Mp3File;->file:Ljava/io/File;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->compareTo(Ljava/io/File;)I

    move-result v0

    if-eqz v0, :cond_3

    .line 392
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rw"

    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    :try_start_0
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->hasId3v2Tag()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 394
    iget-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {p1}, Lcom/mpatric/mp3agic/ID3v2;->toBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/RandomAccessFile;->write([B)V

    .line 396
    :cond_0
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/Mp3File;->saveMpegFrames(Ljava/io/RandomAccessFile;)V

    .line 397
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->hasCustomTag()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 398
    iget-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->customTag:[B

    invoke-virtual {v0, p1}, Ljava/io/RandomAccessFile;->write([B)V

    .line 400
    :cond_1
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/Mp3File;->hasId3v1Tag()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 401
    iget-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    invoke-interface {p1}, Lcom/mpatric/mp3agic/ID3v1;->toBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/RandomAccessFile;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 403
    :cond_2
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 392
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    .line 403
    :try_start_2
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    throw p1

    .line 390
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Save filename same as source filename"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCustomTag([B)V
    .locals 0

    .line 381
    iput-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->customTag:[B

    return-void
.end method

.method public setId3v1Tag(Lcom/mpatric/mp3agic/ID3v1;)V
    .locals 0

    .line 349
    iput-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    return-void
.end method

.method public setId3v2Tag(Lcom/mpatric/mp3agic/ID3v2;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/mpatric/mp3agic/Mp3File;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    return-void
.end method
