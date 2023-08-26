.class public Lcom/daaw/avee/Common/StreamToFileBridge;
.super Ljava/lang/Object;
.source "StreamToFileBridge.java"


# instance fields
.field file:Ljava/io/File;

.field output:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/io/OutputStream;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/daaw/avee/Common/StreamToFileBridge;->file:Ljava/io/File;

    .line 24
    iput-object p2, p0, Lcom/daaw/avee/Common/StreamToFileBridge;->output:Ljava/io/OutputStream;

    return-void
.end method


# virtual methods
.method public finish(Lcom/daaw/avee/Common/StatusMsg;)Z
    .locals 7

    const-string v0, "Failed creating output file"

    const-string v1, "Error finishing StreamToFileBridge"

    const/4 v2, 0x0

    .line 30
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    iget-object v4, p0, Lcom/daaw/avee/Common/StreamToFileBridge;->file:Ljava/io/File;

    invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/16 v4, 0x2000

    new-array v4, v4, [B

    .line 34
    :goto_0
    invoke-virtual {v3, v4}, Ljava/io/FileInputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    .line 36
    iget-object v6, p0, Lcom/daaw/avee/Common/StreamToFileBridge;->output:Ljava/io/OutputStream;

    invoke-virtual {v6, v4, v2, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v3

    .line 44
    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 45
    invoke-virtual {p1, v0, v3}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalErrorException(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    return v2

    :catch_1
    move-exception v3

    .line 39
    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    .line 40
    invoke-virtual {p1, v0, v3}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalErrorException(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_2
    return v2
.end method
