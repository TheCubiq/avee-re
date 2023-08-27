.class public Lcom/daaw/avee/Common/DbgFile;
.super Ljava/lang/Object;
.source "DbgFile.java"


# instance fields
.field public rfile:Lcom/daaw/avee/Common/RandomAccessFileTh;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 4

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    :try_start_0
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    .line 27
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "canonical path: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 29
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 30
    new-instance p2, Lcom/daaw/avee/Common/RandomAccessFileTh;

    invoke-direct {p2, v2, p1}, Lcom/daaw/avee/Common/RandomAccessFileTh;-><init>(Ljava/io/File;I)V

    iput-object p2, p0, Lcom/daaw/avee/Common/DbgFile;->rfile:Lcom/daaw/avee/Common/RandomAccessFileTh;

    .line 31
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    .line 32
    new-instance p2, Landroid/content/Intent;

    const-string v1, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    invoke-direct {p2, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v0, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public write(Lcom/daaw/avee/Common/ISimpleListShort;)V
    .locals 6

    .line 56
    invoke-interface {p1}, Lcom/daaw/avee/Common/ISimpleListShort;->size()I

    move-result v0

    new-array v1, v0, [S

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 60
    invoke-interface {p1, v3}, Lcom/daaw/avee/Common/ISimpleListShort;->get(I)S

    move-result v4

    aput-short v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 64
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Common/DbgFile;->rfile:Lcom/daaw/avee/Common/RandomAccessFileTh;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/RandomAccessFileTh;->getBuffer()Ljava/nio/MappedByteBuffer;

    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 67
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    .line 74
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v3

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const v5, 0xff00

    if-ne v3, v4, :cond_1

    :goto_1
    if-ge v2, v0, :cond_2

    .line 77
    aget-short v3, v1, v2

    and-int/lit16 v4, v3, 0xff

    int-to-byte v4, v4

    .line 78
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    and-int/2addr v3, v5

    shr-int/lit8 v3, v3, 0x8

    int-to-byte v3, v3

    .line 79
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-ge v2, v0, :cond_2

    .line 84
    aget-short v3, v1, v2

    and-int v4, v3, v5

    shr-int/lit8 v4, v4, 0x8

    int-to-byte v4, v4

    .line 85
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    .line 86
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public write(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/daaw/avee/Common/DbgFile;->rfile:Lcom/daaw/avee/Common/RandomAccessFileTh;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/RandomAccessFileTh;->writeDataSrcFromStart(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public write(Ljava/nio/ByteBuffer;I)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/daaw/avee/Common/DbgFile;->rfile:Lcom/daaw/avee/Common/RandomAccessFileTh;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/Common/RandomAccessFileTh;->writeDataSized(Ljava/nio/ByteBuffer;I)V

    return-void
.end method

.method public write(S)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/daaw/avee/Common/DbgFile;->rfile:Lcom/daaw/avee/Common/RandomAccessFileTh;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/RandomAccessFileTh;->getBuffer()Ljava/nio/MappedByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/MappedByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    return-void
.end method
