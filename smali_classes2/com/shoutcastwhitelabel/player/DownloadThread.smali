.class public Lcom/shoutcastwhitelabel/player/DownloadThread;
.super Ljava/lang/Thread;
.source "DownloadThread.java"


# instance fields
.field public m_errors:Ljava/lang/String;

.field public m_shoutcast_file:Lcom/shoutcastwhitelabel/player/ShoutcastFile;

.field public m_url:Ljava/net/URL;


# direct methods
.method public constructor <init>(Ljava/net/URL;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string v0, ""

    .line 10
    iput-object v0, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_errors:Ljava/lang/String;

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_shoutcast_file:Lcom/shoutcastwhitelabel/player/ShoutcastFile;

    .line 16
    iput-object p1, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_url:Ljava/net/URL;

    return-void
.end method


# virtual methods
.method public done()V
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_shoutcast_file:Lcom/shoutcastwhitelabel/player/ShoutcastFile;

    if-eqz v0, :cond_0

    .line 23
    invoke-virtual {v0}, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->done()V

    :cond_0
    return-void
.end method

.method public errors()Ljava/lang/String;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_shoutcast_file:Lcom/shoutcastwhitelabel/player/ShoutcastFile;

    if-eqz v0, :cond_0

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_errors:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_shoutcast_file:Lcom/shoutcastwhitelabel/player/ShoutcastFile;

    invoke-virtual {v1}, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->errors()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_errors:Ljava/lang/String;

    return-object v0
.end method

.method public run()V
    .locals 3

    const/16 v0, 0xa

    .line 38
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 41
    :try_start_0
    iget-object v0, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v1, "User-Agent"

    const-string v2, "Nagare"

    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 44
    new-instance v1, Lcom/shoutcastwhitelabel/player/ShoutcastFile;

    invoke-direct {v1, v0}, Lcom/shoutcastwhitelabel/player/ShoutcastFile;-><init>(Ljava/net/URLConnection;)V

    iput-object v1, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_shoutcast_file:Lcom/shoutcastwhitelabel/player/ShoutcastFile;

    .line 45
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v1, p0, v0}, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->download(Lcom/shoutcastwhitelabel/player/DownloadThread;Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_errors:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shoutcastwhitelabel/player/DownloadThread;->m_errors:Ljava/lang/String;

    :goto_0
    return-void
.end method
