.class public Lcom/daaw/avee/Common/RandomAccessFileTh;
.super Ljava/lang/Object;
.source "RandomAccessFileTh.java"


# instance fields
.field file:Ljava/io/RandomAccessFile;

.field mapped:Ljava/nio/MappedByteBuffer;

.field valid:Z


# direct methods
.method public constructor <init>(Ljava/io/File;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->valid:Z

    .line 71
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rw"

    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->file:Ljava/io/RandomAccessFile;

    .line 74
    :try_start_0
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2

    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    const-wide/16 v4, 0x0

    int-to-long v6, p2

    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    .line 80
    iput-boolean p1, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->valid:Z

    return-void

    .line 76
    :catch_0
    invoke-virtual {p0}, Lcom/daaw/avee/Common/RandomAccessFileTh;->close()V

    return-void
.end method

.method public static createTemp(Ljava/lang/String;I)Lcom/daaw/avee/Common/RandomAccessFileTh;
    .locals 4

    const-string v0, "createTempFile"

    .line 30
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 36
    :try_start_0
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 38
    new-instance v2, Lcom/daaw/avee/Common/RandomAccessFileTh;

    new-instance v3, Ljava/io/File;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v3, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v2, v3, p1}, Lcom/daaw/avee/Common/RandomAccessFileTh;-><init>(Ljava/io/File;I)V

    .line 39
    iget-boolean p0, v2, Lcom/daaw/avee/Common/RandomAccessFileTh;->valid:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    return-object v2

    .line 50
    :catch_0
    :cond_1
    :try_start_1
    new-instance v1, Lcom/daaw/avee/Common/RandomAccessFileTh;

    invoke-static {p0, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/Common/RandomAccessFileTh;-><init>(Ljava/io/File;I)V

    .line 63
    iget-boolean p0, v1, Lcom/daaw/avee/Common/RandomAccessFileTh;->valid:Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez p0, :cond_2

    return-object v0

    :cond_2
    return-object v1

    :catch_1
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 86
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->file:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public getBuffer()Ljava/nio/MappedByteBuffer;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    return-object v0
.end method

.method public readAsByteBufferNotThSafe(I)Ljava/nio/ByteBuffer;
    .locals 1

    const/4 v0, 0x0

    .line 141
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 142
    iget-object v0, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0}, Ljava/nio/MappedByteBuffer;->limit()I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 144
    iget-object v0, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 145
    iget-object p1, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    return-object p1
.end method

.method public readData(I[BII)V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 136
    iget-object p1, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p1, p2, p3, p4}, Ljava/nio/MappedByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public writeData(ILjava/nio/ByteBuffer;)V
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 130
    iget-object p1, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p1, p2}, Ljava/nio/MappedByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public writeData(I[B)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 95
    iget-object p1, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p1, p2}, Ljava/nio/MappedByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public writeDataSized(Ljava/nio/ByteBuffer;I)V
    .locals 2

    .line 114
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    .line 115
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    add-int/2addr p2, v0

    .line 117
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 118
    iget-object p2, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/MappedByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 120
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 121
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-void
.end method

.method public writeDataSrcFromStart(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 105
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    const/4 v1, 0x0

    .line 106
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 107
    iget-object v1, p0, Lcom/daaw/avee/Common/RandomAccessFileTh;->mapped:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/MappedByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 109
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method
