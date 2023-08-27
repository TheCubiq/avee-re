.class public Lmychristophedelory/content/Content;
.super Ljava/lang/Object;
.source "Content.java"


# instance fields
.field private transient _connected:Ljava/lang/Boolean;

.field private _duration:J

.field private _encoding:Ljava/lang/String;

.field private _height:I

.field private _lastModified:J

.field private _length:J

.field private _type:Ljava/lang/String;

.field private transient _uri:Ljava/net/URI;

.field private transient _url:Ljava/net/URL;

.field private final _urlString:Ljava/lang/String;

.field private _width:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lmychristophedelory/content/Content;->_uri:Ljava/net/URI;

    .line 55
    iput-object v0, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;

    .line 60
    iput-object v0, p0, Lmychristophedelory/content/Content;->_encoding:Ljava/lang/String;

    const-wide/16 v1, -0x1

    .line 65
    iput-wide v1, p0, Lmychristophedelory/content/Content;->_length:J

    .line 70
    iput-object v0, p0, Lmychristophedelory/content/Content;->_type:Ljava/lang/String;

    const-wide/16 v3, 0x0

    .line 75
    iput-wide v3, p0, Lmychristophedelory/content/Content;->_lastModified:J

    .line 80
    iput-wide v1, p0, Lmychristophedelory/content/Content;->_duration:J

    const/4 v1, -0x1

    .line 85
    iput v1, p0, Lmychristophedelory/content/Content;->_width:I

    .line 90
    iput v1, p0, Lmychristophedelory/content/Content;->_height:I

    .line 95
    iput-object v0, p0, Lmychristophedelory/content/Content;->_connected:Ljava/lang/Boolean;

    .line 104
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x5c

    const/16 v1, 0x2f

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/net/URI;)V
    .locals 5

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lmychristophedelory/content/Content;->_uri:Ljava/net/URI;

    .line 55
    iput-object v0, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;

    .line 60
    iput-object v0, p0, Lmychristophedelory/content/Content;->_encoding:Ljava/lang/String;

    const-wide/16 v1, -0x1

    .line 65
    iput-wide v1, p0, Lmychristophedelory/content/Content;->_length:J

    .line 70
    iput-object v0, p0, Lmychristophedelory/content/Content;->_type:Ljava/lang/String;

    const-wide/16 v3, 0x0

    .line 75
    iput-wide v3, p0, Lmychristophedelory/content/Content;->_lastModified:J

    .line 80
    iput-wide v1, p0, Lmychristophedelory/content/Content;->_duration:J

    const/4 v1, -0x1

    .line 85
    iput v1, p0, Lmychristophedelory/content/Content;->_width:I

    .line 90
    iput v1, p0, Lmychristophedelory/content/Content;->_height:I

    .line 95
    iput-object v0, p0, Lmychristophedelory/content/Content;->_connected:Ljava/lang/Boolean;

    .line 114
    invoke-virtual {p1}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Lmychristophedelory/content/Content;->_uri:Ljava/net/URI;

    .line 115
    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 5

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lmychristophedelory/content/Content;->_uri:Ljava/net/URI;

    .line 55
    iput-object v0, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;

    .line 60
    iput-object v0, p0, Lmychristophedelory/content/Content;->_encoding:Ljava/lang/String;

    const-wide/16 v1, -0x1

    .line 65
    iput-wide v1, p0, Lmychristophedelory/content/Content;->_length:J

    .line 70
    iput-object v0, p0, Lmychristophedelory/content/Content;->_type:Ljava/lang/String;

    const-wide/16 v3, 0x0

    .line 75
    iput-wide v3, p0, Lmychristophedelory/content/Content;->_lastModified:J

    .line 80
    iput-wide v1, p0, Lmychristophedelory/content/Content;->_duration:J

    const/4 v1, -0x1

    .line 85
    iput v1, p0, Lmychristophedelory/content/Content;->_width:I

    .line 90
    iput v1, p0, Lmychristophedelory/content/Content;->_height:I

    .line 95
    iput-object v0, p0, Lmychristophedelory/content/Content;->_connected:Ljava/lang/Boolean;

    .line 125
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    .line 126
    iput-object p1, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;

    return-void
.end method


# virtual methods
.method public connect()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 372
    monitor-enter p0

    .line 374
    :try_start_0
    iget-object v0, p0, Lmychristophedelory/content/Content;->_connected:Ljava/lang/Boolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 376
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lmychristophedelory/content/Content;->_connected:Ljava/lang/Boolean;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 379
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_5

    .line 383
    invoke-virtual {p0}, Lmychristophedelory/content/Content;->getURL()Ljava/net/URL;

    move-result-object v0

    .line 386
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    .line 389
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    .line 390
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 391
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 393
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 399
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 406
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v1

    .line 407
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    move-result v2

    int-to-long v2, v2

    .line 408
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v4

    .line 409
    invoke-virtual {v0}, Ljava/net/URLConnection;->getLastModified()J

    move-result-wide v5

    if-eqz v1, :cond_1

    .line 414
    iput-object v1, p0, Lmychristophedelory/content/Content;->_encoding:Ljava/lang/String;

    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v7, v2, v0

    if-ltz v7, :cond_2

    .line 419
    iput-wide v2, p0, Lmychristophedelory/content/Content;->_length:J

    :cond_2
    if-eqz v4, :cond_3

    const-string v2, "content/unknown"

    .line 422
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 424
    iput-object v4, p0, Lmychristophedelory/content/Content;->_type:Ljava/lang/String;

    :cond_3
    cmp-long v2, v5, v0

    if-lez v2, :cond_4

    .line 429
    iput-wide v5, p0, Lmychristophedelory/content/Content;->_lastModified:J

    .line 432
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lmychristophedelory/content/Content;->_connected:Ljava/lang/Boolean;

    :cond_5
    return-void

    :catchall_0
    move-exception v0

    .line 379
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 447
    :cond_0
    iget-object v0, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public getDuration()J
    .locals 2

    .line 291
    iget-wide v0, p0, Lmychristophedelory/content/Content;->_duration:J

    return-wide v0
.end method

.method public getEncoding()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lmychristophedelory/content/Content;->_encoding:Ljava/lang/String;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 334
    iget v0, p0, Lmychristophedelory/content/Content;->_height:I

    return v0
.end method

.method public getLastModified()J
    .locals 2

    .line 271
    iget-wide v0, p0, Lmychristophedelory/content/Content;->_lastModified:J

    return-wide v0
.end method

.method public getLength()J
    .locals 2

    .line 230
    iget-wide v0, p0, Lmychristophedelory/content/Content;->_length:J

    return-wide v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lmychristophedelory/content/Content;->_type:Ljava/lang/String;

    return-object v0
.end method

.method public getURI()Ljava/net/URI;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 139
    monitor-enter p0

    .line 141
    :try_start_0
    iget-object v0, p0, Lmychristophedelory/content/Content;->_uri:Ljava/net/URI;

    if-nez v0, :cond_3

    .line 145
    iget-object v0, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 149
    :try_start_1
    new-instance v0, Ljava/net/URI;

    iget-object v1, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    .line 156
    :try_start_2
    invoke-virtual {v0}, Ljava/net/URI;->isAbsolute()Z

    move-result v1

    if-nez v1, :cond_2

    .line 158
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object v0

    goto :goto_1

    .line 163
    :cond_1
    iget-object v0, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v0

    .line 166
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Lmychristophedelory/content/Content;->_uri:Ljava/net/URI;

    .line 168
    :cond_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    iget-object v0, p0, Lmychristophedelory/content/Content;->_uri:Ljava/net/URI;

    return-object v0

    :catchall_0
    move-exception v0

    .line 168
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public getURL()Ljava/net/URL;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .line 184
    monitor-enter p0

    .line 186
    :try_start_0
    iget-object v0, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 190
    :try_start_1
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 194
    :catch_0
    :try_start_2
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Lmychristophedelory/content/Content;->_uri:Ljava/net/URI;

    .line 195
    invoke-virtual {v0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;

    .line 198
    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 200
    iget-object v0, p0, Lmychristophedelory/content/Content;->_url:Ljava/net/URL;

    return-object v0

    :catchall_0
    move-exception v0

    .line 198
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public getWidth()I
    .locals 1

    .line 312
    iget v0, p0, Lmychristophedelory/content/Content;->_width:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 459
    iget-object v0, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isValid()Z
    .locals 1

    .line 356
    iget-object v0, p0, Lmychristophedelory/content/Content;->_connected:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public setDuration(J)V
    .locals 0

    .line 301
    iput-wide p1, p0, Lmychristophedelory/content/Content;->_duration:J

    return-void
.end method

.method public setEncoding(Ljava/lang/String;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lmychristophedelory/content/Content;->_encoding:Ljava/lang/String;

    return-void
.end method

.method public setHeight(I)V
    .locals 0

    .line 345
    iput p1, p0, Lmychristophedelory/content/Content;->_height:I

    return-void
.end method

.method public setLastModified(J)V
    .locals 0

    .line 281
    iput-wide p1, p0, Lmychristophedelory/content/Content;->_lastModified:J

    return-void
.end method

.method public setLength(J)V
    .locals 0

    .line 240
    iput-wide p1, p0, Lmychristophedelory/content/Content;->_length:J

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lmychristophedelory/content/Content;->_type:Ljava/lang/String;

    return-void
.end method

.method public setWidth(I)V
    .locals 0

    .line 323
    iput p1, p0, Lmychristophedelory/content/Content;->_width:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 471
    iget-object v0, p0, Lmychristophedelory/content/Content;->_urlString:Ljava/lang/String;

    return-object v0
.end method
