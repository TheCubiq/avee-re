.class public Lcom/shoutcastwhitelabel/player/ShoutcastFile;
.super Ljava/lang/Object;
.source "ShoutcastFile.java"


# instance fields
.field m_bitrate:I

.field m_buffer_mark_pos:J

.field m_current_write_pos:J

.field m_done:Z

.field m_errors:Ljava/lang/String;

.field m_file:Ljava/io/File;

.field m_file_name:Ljava/lang/String;

.field m_nagare_dir:Ljava/io/File;

.field m_notified_buffering_done:Z

.field m_shoutcast_name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/net/URLConnection;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 18
    iput-wide v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_buffer_mark_pos:J

    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_done:Z

    .line 20
    iput-boolean v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_notified_buffering_done:Z

    const-string v0, ""

    .line 21
    iput-object v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_errors:Ljava/lang/String;

    const-string v0, "icy-name"

    .line 27
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_shoutcast_name:Ljava/lang/String;

    const-string v0, "icy-br"

    .line 28
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_bitrate:I

    .line 29
    invoke-virtual {p0}, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->build_file_name()V

    return-void
.end method


# virtual methods
.method public build_file_name()V
    .locals 4

    .line 34
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    .line 35
    iget-object v1, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_shoutcast_name:Ljava/lang/String;

    const-string v2, "[\\/:*?\"<>|]"

    const-string v3, "_"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_file_name:Ljava/lang/String;

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_file_name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0xb

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0xd

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ".mp3"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_file_name:Ljava/lang/String;

    .line 37
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "/Nagare"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_nagare_dir:Ljava/io/File;

    .line 38
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 39
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_nagare_dir:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_file_name:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_file:Ljava/io/File;

    return-void
.end method

.method public done()V
    .locals 1

    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_done:Z

    return-void
.end method

.method public download(Lcom/shoutcastwhitelabel/player/DownloadThread;Ljava/io/InputStream;)V
    .locals 6

    .line 61
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    iget-object v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_file:Ljava/io/File;

    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v0, 0x400

    new-array v0, v0, [B

    .line 64
    :goto_0
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget-boolean v2, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_done:Z

    if-nez v2, :cond_0

    const/4 v2, 0x0

    .line 65
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/FileOutputStream;->write([BII)V

    .line 66
    iget-wide v2, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_current_write_pos:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_current_write_pos:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 71
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_errors:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_errors:Ljava/lang/String;

    .line 73
    :cond_0
    invoke-virtual {p0}, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->done()V

    return-void
.end method

.method public errors()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_errors:Ljava/lang/String;

    return-object v0
.end method

.method public file_path()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public rebuffer()V
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_current_write_pos:J

    iput-wide v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_buffer_mark_pos:J

    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Lcom/shoutcastwhitelabel/player/ShoutcastFile;->m_notified_buffering_done:Z

    return-void
.end method
