.class public final Lchristophedelory/playlist/SpecificPlaylistFactory;
.super Ljava/lang/Object;
.source "SpecificPlaylistFactory.java"


# static fields
.field private static _instance:Lchristophedelory/playlist/SpecificPlaylistFactory;


# instance fields
.field private final _logger:Lorg/myapache/commons/logging/Log;

.field private final _serviceLoader:Ljava/util/ServiceLoader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ServiceLoader<",
            "Lchristophedelory/playlist/SpecificPlaylistProvider;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lmychristophedelory/logging/LogFactory;->getLog(Ljava/lang/Class;)Lorg/myapache/commons/logging/Log;

    move-result-object v0

    iput-object v0, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_logger:Lorg/myapache/commons/logging/Log;

    .line 87
    const-class v0, Lchristophedelory/playlist/SpecificPlaylistProvider;

    invoke-static {v0}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;)Ljava/util/ServiceLoader;

    move-result-object v0

    iput-object v0, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_serviceLoader:Ljava/util/ServiceLoader;

    return-void
.end method

.method public static getInstance()Lchristophedelory/playlist/SpecificPlaylistFactory;
    .locals 2

    .line 60
    const-class v0, Lchristophedelory/playlist/SpecificPlaylistFactory;

    monitor-enter v0

    .line 62
    :try_start_0
    sget-object v1, Lchristophedelory/playlist/SpecificPlaylistFactory;->_instance:Lchristophedelory/playlist/SpecificPlaylistFactory;

    if-nez v1, :cond_0

    .line 64
    new-instance v1, Lchristophedelory/playlist/SpecificPlaylistFactory;

    invoke-direct {v1}, Lchristophedelory/playlist/SpecificPlaylistFactory;-><init>()V

    sput-object v1, Lchristophedelory/playlist/SpecificPlaylistFactory;->_instance:Lchristophedelory/playlist/SpecificPlaylistFactory;

    .line 66
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    sget-object v0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_instance:Lchristophedelory/playlist/SpecificPlaylistFactory;

    return-object v0

    :catchall_0
    move-exception v1

    .line 66
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public findProviderByExtension(Ljava/lang/String;)Lchristophedelory/playlist/SpecificPlaylistProvider;
    .locals 7

    .line 204
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 206
    iget-object v0, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_serviceLoader:Ljava/util/ServiceLoader;

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 208
    invoke-interface {v2}, Lchristophedelory/playlist/SpecificPlaylistProvider;->getContentTypes()[Lmychristophedelory/content/type/ContentType;

    move-result-object v3

    .line 210
    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 212
    invoke-virtual {v6, p1}, Lmychristophedelory/content/type/ContentType;->matchExtension(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_0

    :cond_3
    return-object v1
.end method

.method public findProviderById(Ljava/lang/String;)Lchristophedelory/playlist/SpecificPlaylistProvider;
    .locals 3

    .line 182
    iget-object v0, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_serviceLoader:Ljava/util/ServiceLoader;

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 184
    invoke-interface {v1}, Lchristophedelory/playlist/SpecificPlaylistProvider;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public getProviders()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/playlist/SpecificPlaylistProvider;",
            ">;"
        }
    .end annotation

    .line 237
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 239
    iget-object v1, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_serviceLoader:Ljava/util/ServiceLoader;

    invoke-virtual {v1}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 241
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public readFrom(Ljava/io/File;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 168
    invoke-virtual {p1}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object p1

    invoke-virtual {p0, p1}, Lchristophedelory/playlist/SpecificPlaylistFactory;->readFrom(Ljava/net/URL;)Lchristophedelory/playlist/SpecificPlaylist;

    move-result-object p1

    return-object p1
.end method

.method public readFrom(Ljava/net/URL;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_serviceLoader:Ljava/util/ServiceLoader;

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 114
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    const/4 v3, 0x0

    .line 115
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    const/16 v4, 0x2710

    .line 116
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/4 v4, 0x1

    .line 117
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 118
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const v3, 0xea60

    .line 119
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 120
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 122
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    .line 124
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v3

    .line 128
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 132
    :try_start_0
    iget-object v4, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_logger:Lorg/myapache/commons/logging/Log;

    invoke-interface {v1, v2, v3, v4}, Lchristophedelory/playlist/SpecificPlaylistProvider;->readFrom(Ljava/io/InputStream;Ljava/lang/String;Lorg/myapache/commons/logging/Log;)Lchristophedelory/playlist/SpecificPlaylist;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v3

    .line 139
    :try_start_1
    iget-object v4, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_logger:Lorg/myapache/commons/logging/Log;

    invoke-interface {v4}, Lorg/myapache/commons/logging/Log;->isTraceEnabled()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v5, " cannot unmarshal <"

    const-string v6, "Playlist provider "

    if-eqz v4, :cond_0

    .line 141
    :try_start_2
    iget-object v4, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_logger:Lorg/myapache/commons/logging/Log;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Lchristophedelory/playlist/SpecificPlaylistProvider;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1, v3}, Lorg/myapache/commons/logging/Log;->trace(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 143
    :cond_0
    iget-object v4, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_logger:Lorg/myapache/commons/logging/Log;

    invoke-interface {v4}, Lorg/myapache/commons/logging/Log;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 145
    iget-object v4, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_logger:Lorg/myapache/commons/logging/Log;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Lchristophedelory/playlist/SpecificPlaylistProvider;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ">: "

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Lorg/myapache/commons/logging/Log;->debug(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    :cond_1
    :goto_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    goto/16 :goto_0

    :goto_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    throw p1

    :cond_2
    const/4 p1, 0x0

    :goto_3
    return-object p1
.end method

.method public reloadProviders()V
    .locals 1

    .line 96
    iget-object v0, p0, Lchristophedelory/playlist/SpecificPlaylistFactory;->_serviceLoader:Ljava/util/ServiceLoader;

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->reload()V

    return-void
.end method
