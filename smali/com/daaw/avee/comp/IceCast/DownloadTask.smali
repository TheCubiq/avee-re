.class public Lcom/daaw/avee/comp/IceCast/DownloadTask;
.super Landroid/os/AsyncTask;
.source "DownloadTask.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;,
        Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private createFileFactory:Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;

.field private onPostExecute:Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/DownloadTask;->context:Landroid/content/Context;

    .line 43
    iput-object p2, p0, Lcom/daaw/avee/comp/IceCast/DownloadTask;->createFileFactory:Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;

    .line 44
    iput-object p3, p0, Lcom/daaw/avee/comp/IceCast/DownloadTask;->onPostExecute:Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/IceCast/DownloadTask;[Ljava/lang/Object;)V
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/IceCast/DownloadTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method

.method public static downloadResponseFile(Ljava/lang/String;Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;Lcom/daaw/avee/Common/Func/Func;Lcom/daaw/avee/Common/Action1;)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 101
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 102
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    check-cast p0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 103
    :try_start_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->connect()V

    .line 107
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v1

    .line 109
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    :try_start_2
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v4, 0xc8

    if-eq v3, v4, :cond_2

    .line 116
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Server returned HTTP "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz v2, :cond_0

    .line 144
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    if-eqz p0, :cond_1

    .line 149
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    return-object p1

    .line 120
    :cond_2
    :try_start_4
    invoke-interface {p1}, Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;->CreateFile()Ljava/io/FileOutputStream;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const/16 v3, 0x1000

    :try_start_5
    new-array v3, v3, [B

    const-wide/16 v4, 0x0

    .line 125
    :goto_1
    invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_8

    if-eqz p2, :cond_6

    .line 127
    invoke-interface {p2}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 128
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz p1, :cond_3

    .line 142
    :try_start_6
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    goto :goto_2

    :catch_1
    nop

    goto :goto_3

    :cond_3
    :goto_2
    if-eqz v2, :cond_4

    .line 144
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    :cond_4
    :goto_3
    if-eqz p0, :cond_5

    .line 149
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_5
    return-object v0

    :cond_6
    int-to-long v7, v6

    add-long/2addr v4, v7

    if-lez v1, :cond_7

    if-eqz p3, :cond_7

    const-wide/16 v7, 0x64

    mul-long v7, v7, v4

    int-to-long v9, v1

    .line 134
    :try_start_7
    div-long/2addr v7, v9

    long-to-int v8, v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {p3, v7}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_7
    const/4 v7, 0x0

    .line 135
    invoke-virtual {p1, v3, v7, v6}, Ljava/io/OutputStream;->write([BII)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_1

    :cond_8
    if-eqz p1, :cond_9

    .line 142
    :try_start_8
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    goto :goto_4

    :catch_2
    nop

    goto :goto_5

    :cond_9
    :goto_4
    if-eqz v2, :cond_a

    .line 144
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    :cond_a
    :goto_5
    if-eqz p0, :cond_b

    .line 149
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_b
    return-object v0

    :catchall_0
    move-exception p2

    move-object v0, p1

    move-object p1, p2

    goto :goto_9

    :catch_3
    move-object v0, p1

    goto :goto_6

    :catchall_1
    move-exception p1

    move-object v2, v0

    goto :goto_9

    :catch_4
    move-object v2, v0

    goto :goto_6

    :catchall_2
    move-exception p1

    move-object p0, v0

    move-object v2, p0

    goto :goto_9

    :catch_5
    move-object p0, v0

    move-object v2, p0

    :catch_6
    :goto_6
    :try_start_9
    const-string p1, "Network error"
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    if-eqz v0, :cond_c

    .line 142
    :try_start_a
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    goto :goto_7

    :catch_7
    nop

    goto :goto_8

    :cond_c
    :goto_7
    if-eqz v2, :cond_d

    .line 144
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    :cond_d
    :goto_8
    if-eqz p0, :cond_e

    .line 149
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_e
    return-object p1

    :catchall_3
    move-exception p1

    :goto_9
    if-eqz v0, :cond_f

    .line 142
    :try_start_b
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    goto :goto_a

    :catch_8
    nop

    goto :goto_b

    :cond_f
    :goto_a
    if-eqz v2, :cond_10

    .line 144
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8

    :cond_10
    :goto_b
    if-eqz p0, :cond_11

    .line 149
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_11
    goto :goto_d

    :goto_c
    throw p1

    :goto_d
    goto :goto_c
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 24
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/IceCast/DownloadTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 49
    aget-object p1, p1, v0

    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/DownloadTask;->createFileFactory:Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;

    new-instance v1, Lcom/daaw/avee/comp/IceCast/DownloadTask$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/IceCast/DownloadTask$1;-><init>(Lcom/daaw/avee/comp/IceCast/DownloadTask;)V

    new-instance v2, Lcom/daaw/avee/comp/IceCast/DownloadTask$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/IceCast/DownloadTask$2;-><init>(Lcom/daaw/avee/comp/IceCast/DownloadTask;)V

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/avee/comp/IceCast/DownloadTask;->downloadResponseFile(Ljava/lang/String;Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;Lcom/daaw/avee/Common/Func/Func;Lcom/daaw/avee/Common/Action1;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 24
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/IceCast/DownloadTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/DownloadTask;->onPostExecute:Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method
