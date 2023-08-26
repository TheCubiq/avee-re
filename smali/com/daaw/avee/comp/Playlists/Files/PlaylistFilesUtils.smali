.class public Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;
.super Ljava/lang/Object;
.source "PlaylistFilesUtils.java"


# static fields
.field private static instance:Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;


# instance fields
.field private final logger:Lorg/myapache/commons/logging/Log;

.field private serviceLoader:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
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

.method public constructor <init>()V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lmychristophedelory/logging/LogFactory;->getLog(Ljava/lang/Class;)Lorg/myapache/commons/logging/Log;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->logger:Lorg/myapache/commons/logging/Log;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 71
    new-instance v1, Lchristophedelory/playlist/pla/PLAProvider;

    invoke-direct {v1}, Lchristophedelory/playlist/pla/PLAProvider;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v1, Lchristophedelory/playlist/pls/PLSProvider;

    invoke-direct {v1}, Lchristophedelory/playlist/pls/PLSProvider;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    new-instance v1, Lchristophedelory/playlist/mpcpl/MPCPLProvider;

    invoke-direct {v1}, Lchristophedelory/playlist/mpcpl/MPCPLProvider;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    new-instance v1, Lchristophedelory/playlist/plp/PLPProvider;

    invoke-direct {v1}, Lchristophedelory/playlist/plp/PLPProvider;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    new-instance v1, Lchristophedelory/playlist/m3u/M3UProvider;

    invoke-direct {v1}, Lchristophedelory/playlist/m3u/M3UProvider;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    iput-object v0, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->serviceLoader:Ljava/lang/Iterable;

    return-void
.end method

.method private findProviderByExtension(Ljava/lang/String;)Lchristophedelory/playlist/SpecificPlaylistProvider;
    .locals 7

    .line 156
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 158
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->serviceLoader:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 159
    invoke-interface {v2}, Lchristophedelory/playlist/SpecificPlaylistProvider;->getContentTypes()[Lmychristophedelory/content/type/ContentType;

    move-result-object v3

    .line 161
    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 162
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

.method private lizzyAddToPlaylistAsFile(Lchristophedelory/playlist/Sequence;Ljava/io/File;ZLjava/io/File;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 360
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-eqz p3, :cond_6

    .line 363
    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 366
    array-length p3, p2

    :goto_0
    if-ge v1, p3, :cond_6

    aget-object v4, p2, v1

    move-object v2, p0

    move-object v3, p1

    move v5, p5

    move-object v6, p4

    move v7, p5

    .line 367
    invoke-direct/range {v2 .. v7}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->lizzyAddToPlaylistAsFile(Lchristophedelory/playlist/Sequence;Ljava/io/File;ZLjava/io/File;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 371
    :cond_0
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    move-result p3

    if-eqz p3, :cond_6

    .line 374
    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p3

    const/4 p5, 0x1

    if-eqz p4, :cond_5

    .line 377
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    .line 379
    invoke-virtual {v0, p4}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_3

    .line 383
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    .line 384
    invoke-virtual {p4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p4

    .line 386
    invoke-virtual {v0, p4}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 387
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p3

    goto :goto_2

    .line 389
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 391
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    :goto_1
    move-object v8, v0

    move-object v0, p2

    move-object p2, v8

    if-eqz v0, :cond_5

    const/16 v3, 0x2f

    .line 394
    invoke-virtual {v2, v1, v3}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 395
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v3, "/"

    .line 397
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "\\"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 398
    invoke-virtual {v2, v1, p2}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    :cond_3
    invoke-virtual {v0, p4}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 402
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    goto :goto_2

    .line 407
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    goto :goto_1

    :cond_5
    :goto_2
    const/4 v1, 0x1

    :goto_3
    if-eqz v1, :cond_6

    .line 414
    new-instance p2, Lchristophedelory/playlist/Media;

    invoke-direct {p2}, Lchristophedelory/playlist/Media;-><init>()V

    .line 415
    new-instance p4, Lmychristophedelory/content/Content;

    invoke-direct {p4, p3}, Lmychristophedelory/content/Content;-><init>(Ljava/lang/String;)V

    .line 416
    invoke-virtual {p2, p4}, Lchristophedelory/playlist/Media;->setSource(Lmychristophedelory/content/Content;)V

    .line 418
    invoke-virtual {p1, p2}, Lchristophedelory/playlist/Sequence;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    :cond_6
    return-void
.end method

.method public static makePlaylistPath(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    .line 105
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 106
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_1

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, "//"

    .line 112
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->fileExtension:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private myReadFrom(Ljava/net/URL;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->serviceLoader:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 120
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    const/4 v3, 0x0

    .line 121
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    const/16 v4, 0x2710

    .line 122
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/4 v4, 0x1

    .line 123
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 124
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const v3, 0xea60

    .line 125
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 126
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 128
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    .line 130
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v3

    .line 132
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 135
    :try_start_0
    iget-object v4, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->logger:Lorg/myapache/commons/logging/Log;

    invoke-interface {v1, v2, v3, v4}, Lchristophedelory/playlist/SpecificPlaylistProvider;->readFrom(Ljava/io/InputStream;Ljava/lang/String;Lorg/myapache/commons/logging/Log;)Lchristophedelory/playlist/SpecificPlaylist;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v3

    .line 140
    :try_start_1
    iget-object v4, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->logger:Lorg/myapache/commons/logging/Log;

    invoke-interface {v4}, Lorg/myapache/commons/logging/Log;->isTraceEnabled()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v5, " cannot unmarshal <"

    const-string v6, "Playlist provider "

    if-eqz v4, :cond_0

    .line 141
    :try_start_2
    iget-object v4, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->logger:Lorg/myapache/commons/logging/Log;

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

    .line 142
    :cond_0
    iget-object v4, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->logger:Lorg/myapache/commons/logging/Log;

    invoke-interface {v4}, Lorg/myapache/commons/logging/Log;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 143
    iget-object v4, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->logger:Lorg/myapache/commons/logging/Log;

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

    .line 146
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

.method public static s()Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;
    .locals 1

    .line 99
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->instance:Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;

    if-nez v0, :cond_0

    .line 100
    new-instance v0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->instance:Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;

    .line 101
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->instance:Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;

    return-object v0
.end method


# virtual methods
.method public addDataSourceToPlaylistFile(Lcom/daaw/avee/Common/StatusMsg;Ljava/lang/String;Ljava/util/List;ZZ)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/StatusMsg;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ)I"
        }
    .end annotation

    .line 232
    invoke-static {p3}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->makeSongListFromDataSourceList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->addToPlaylistFile(Lcom/daaw/avee/Common/StatusMsg;Ljava/lang/String;Ljava/util/List;ZZ)I

    move-result p1

    return p1
.end method

.method public addToPlaylistFile(Lcom/daaw/avee/Common/StatusMsg;Ljava/lang/String;Ljava/util/List;ZZ)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/StatusMsg;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;ZZ)I"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "file:"

    .line 241
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 242
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 244
    :cond_0
    new-instance v1, Ljava/net/URL;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_9

    .line 255
    :goto_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 257
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    .line 260
    :try_start_1
    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->myReadFrom(Ljava/net/URL;)Lchristophedelory/playlist/SpecificPlaylist;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 261
    :try_start_2
    invoke-interface {v1}, Lchristophedelory/playlist/SpecificPlaylist;->getProvider()Lchristophedelory/playlist/SpecificPlaylistProvider;

    move-result-object v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 263
    :try_start_3
    instance-of v5, v1, Lchristophedelory/playlist/m3u/M3U;

    if-eqz v5, :cond_1

    .line 264
    move-object v5, v1

    check-cast v5, Lchristophedelory/playlist/m3u/M3U;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lchristophedelory/playlist/m3u/M3U;->setExtensionM3U(Z)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_1
    if-eqz p4, :cond_2

    .line 269
    :try_start_4
    new-instance v5, Lchristophedelory/playlist/Playlist;

    invoke-direct {v5}, Lchristophedelory/playlist/Playlist;-><init>()V

    invoke-interface {v3, v5}, Lchristophedelory/playlist/SpecificPlaylistProvider;->toSpecificPlaylist(Lchristophedelory/playlist/Playlist;)Lchristophedelory/playlist/SpecificPlaylist;

    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    :catch_0
    move-exception v5

    .line 271
    :try_start_5
    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_2

    :catch_1
    move-exception v5

    goto :goto_1

    :catch_2
    move-exception v5

    move-object v3, v4

    goto :goto_1

    :catch_3
    move-exception v5

    move-object v1, v4

    move-object v3, v1

    .line 275
    :goto_1
    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_2
    :goto_2
    if-eqz v1, :cond_3

    if-nez v3, :cond_6

    :cond_3
    if-nez p4, :cond_4

    return v0

    .line 284
    :cond_4
    invoke-direct {p0, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->findProviderByExtension(Ljava/lang/String;)Lchristophedelory/playlist/SpecificPlaylistProvider;

    move-result-object p2

    .line 286
    :try_start_6
    new-instance p4, Lchristophedelory/playlist/Playlist;

    invoke-direct {p4}, Lchristophedelory/playlist/Playlist;-><init>()V

    invoke-interface {p2, p4}, Lchristophedelory/playlist/SpecificPlaylistProvider;->toSpecificPlaylist(Lchristophedelory/playlist/Playlist;)Lchristophedelory/playlist/SpecificPlaylist;

    move-result-object v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_3

    :catch_4
    move-exception p2

    .line 288
    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto :goto_3

    .line 295
    :cond_5
    invoke-direct {p0, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->findProviderByExtension(Ljava/lang/String;)Lchristophedelory/playlist/SpecificPlaylistProvider;

    move-result-object p2

    .line 298
    :try_start_7
    new-instance p4, Lchristophedelory/playlist/Playlist;

    invoke-direct {p4}, Lchristophedelory/playlist/Playlist;-><init>()V

    invoke-interface {p2, p4}, Lchristophedelory/playlist/SpecificPlaylistProvider;->toSpecificPlaylist(Lchristophedelory/playlist/Playlist;)Lchristophedelory/playlist/SpecificPlaylist;

    move-result-object v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_3

    :catch_5
    move-exception p2

    .line 300
    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    move-object v1, v4

    :cond_6
    :goto_3
    if-nez v1, :cond_7

    const-string p2, "error specificPlaylist is null"

    .line 305
    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const-string p2, "Error specificPlaylist is null"

    .line 306
    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalError(Ljava/lang/String;)V

    return v0

    .line 312
    :cond_7
    new-instance p2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;

    invoke-direct {p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;-><init>()V

    .line 313
    iput-boolean p5, p2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->writeRelativePaths:Z

    .line 315
    :try_start_8
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->playlistPath:Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_4

    .line 317
    :catch_6
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->playlistPath:Ljava/lang/String;

    .line 320
    :goto_4
    invoke-static {v1, p2, p3}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->appendToSpecificPlaylist(Lchristophedelory/playlist/SpecificPlaylist;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I

    move-result p2

    .line 325
    :try_start_9
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p3

    if-eqz p3, :cond_8

    .line 326
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p4

    if-nez p4, :cond_8

    .line 327
    invoke-virtual {p3}, Ljava/io/File;->mkdirs()Z

    .line 329
    :cond_8
    new-instance p3, Ljava/io/FileOutputStream;

    invoke-direct {p3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8

    .line 336
    :try_start_a
    invoke-interface {v1, p3, v4}, Lchristophedelory/playlist/SpecificPlaylist;->writeTo(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 337
    invoke-virtual {p3}, Ljava/io/OutputStream;->flush()V

    .line 338
    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    goto :goto_5

    :catch_7
    move-exception p3

    .line 340
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "outputSpecificPlaylist.writeTo: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const-string p4, "OutputSpecificPlaylist"

    .line 341
    invoke-virtual {p1, p4, p3}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalErrorException(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_5
    return p2

    :catch_8
    move-exception p2

    const-string p3, "File Output"

    .line 331
    invoke-virtual {p1, p3, p2}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalErrorException(Ljava/lang/String;Ljava/lang/Exception;)V

    return v0

    :catch_9
    const-string p2, "MalformedURLException"

    .line 246
    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalError(Ljava/lang/String;)V

    return v0
.end method

.method public createPlaylist(Lcom/daaw/avee/Common/StatusMsg;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;Ljava/util/List;Z)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/StatusMsg;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)I"
        }
    .end annotation

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move v5, p5

    .line 228
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->addDataSourceToPlaylistFile(Lcom/daaw/avee/Common/StatusMsg;Ljava/lang/String;Ljava/util/List;ZZ)I

    move-result p1

    return p1
.end method

.method public createPlaylist(Lcom/daaw/avee/Common/StatusMsg;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;Z)I
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    .line 224
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->createPlaylist(Lcom/daaw/avee/Common/StatusMsg;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;Ljava/util/List;Z)I

    move-result p1

    return p1
.end method

.method public getSongsFromPlaylistFile(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 181
    :try_start_0
    new-instance v1, Ljava/net/URL;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_2

    .line 187
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 189
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v0

    .line 196
    :cond_0
    :try_start_1
    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->myReadFrom(Ljava/net/URL;)Lchristophedelory/playlist/SpecificPlaylist;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 198
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    return-object v0

    .line 205
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 207
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 209
    new-instance v1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;-><init>()V

    .line 211
    :try_start_2
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;->playlistPath:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 213
    :catch_1
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;->playlistPath:Ljava/lang/String;

    .line 216
    :goto_1
    invoke-static {p1, v1, v0}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->readFromSpecificPlaylist(Lchristophedelory/playlist/SpecificPlaylist;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I

    :catch_2
    :cond_2
    return-object v0
.end method
