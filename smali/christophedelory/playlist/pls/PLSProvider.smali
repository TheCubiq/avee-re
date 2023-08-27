.class public Lchristophedelory/playlist/pls/PLSProvider;
.super Ljava/lang/Object;
.source "PLSProvider.java"

# interfaces
.implements Lchristophedelory/playlist/SpecificPlaylistProvider;


# static fields
.field private static final FILETYPES:[Lmychristophedelory/content/type/ContentType;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x1

    new-array v1, v0, [Lmychristophedelory/content/type/ContentType;

    .line 59
    new-instance v2, Lmychristophedelory/content/type/ContentType;

    new-array v3, v0, [Ljava/lang/String;

    const-string v4, ".pls"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-array v4, v0, [Ljava/lang/String;

    const-string v6, "audio/x-scpls"

    aput-object v6, v4, v5

    const/16 v6, 0x8

    new-array v6, v6, [Lchristophedelory/player/PlayerSupport;

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->WINAMP:Lchristophedelory/player/PlayerSupport$Player;

    const/4 v9, 0x0

    invoke-direct {v7, v8, v0, v9}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v7, v6, v5

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->VLC_MEDIA_PLAYER:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v7, v8, v5, v9}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v7, v6, v0

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->MEDIA_PLAYER_CLASSIC:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v7, v8, v0, v9}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v8, 0x2

    aput-object v7, v6, v8

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->FOOBAR2000:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v7, v8, v5, v9}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v8, 0x3

    aput-object v7, v6, v8

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->MPLAYER:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v7, v8, v0, v9}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v8, 0x4

    aput-object v7, v6, v8

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->QUICKTIME:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v7, v8, v0, v9}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v8, 0x5

    aput-object v7, v6, v8

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->ITUNES:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v7, v8, v0, v9}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v0, 0x6

    aput-object v7, v6, v0

    new-instance v0, Lchristophedelory/player/PlayerSupport;

    sget-object v7, Lchristophedelory/player/PlayerSupport$Player;->REALPLAYER:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v0, v7, v5, v9}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v7, 0x7

    aput-object v0, v6, v7

    const-string v0, "Winamp PLSv2 Playlist"

    invoke-direct {v2, v3, v4, v6, v0}, Lmychristophedelory/content/type/ContentType;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lchristophedelory/player/PlayerSupport;Ljava/lang/String;)V

    aput-object v2, v1, v5

    sput-object v1, Lchristophedelory/playlist/pls/PLSProvider;->FILETYPES:[Lmychristophedelory/content/type/ContentType;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lchristophedelory/playlist/m3u/Resource;",
            ">;",
            "Lchristophedelory/playlist/AbstractPlaylistComponent;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 321
    instance-of v0, p2, Lchristophedelory/playlist/Sequence;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 323
    check-cast p2, Lchristophedelory/playlist/Sequence;

    .line 325
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v0

    if-ltz v0, :cond_1

    .line 330
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v0

    const/4 v2, 0x0

    .line 332
    :goto_0
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 334
    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_0

    aget-object v5, v0, v4

    .line 336
    invoke-direct {p0, p1, v5}, Lchristophedelory/playlist/pls/PLSProvider;->addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 327
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLS playlist cannot handle a sequence repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 340
    :cond_2
    instance-of v0, p2, Lchristophedelory/playlist/Parallel;

    if-nez v0, :cond_7

    .line 344
    instance-of v0, p2, Lchristophedelory/playlist/Media;

    if-eqz v0, :cond_6

    .line 346
    check-cast p2, Lchristophedelory/playlist/Media;

    .line 348
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getDuration()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_5

    .line 353
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getRepeatCount()I

    move-result v0

    if-ltz v0, :cond_4

    .line 358
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 360
    :goto_2
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getRepeatCount()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 362
    new-instance v0, Lchristophedelory/playlist/m3u/Resource;

    invoke-direct {v0}, Lchristophedelory/playlist/m3u/Resource;-><init>()V

    .line 363
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v2

    invoke-virtual {v2}, Lmychristophedelory/content/Content;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lchristophedelory/playlist/m3u/Resource;->setLocation(Ljava/lang/String;)V

    .line 365
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v2

    invoke-virtual {v2}, Lmychristophedelory/content/Content;->getDuration()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_3

    .line 367
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v2

    invoke-virtual {v2}, Lmychristophedelory/content/Content;->getDuration()J

    move-result-wide v2

    const-wide/16 v4, 0x3e7

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lchristophedelory/playlist/m3u/Resource;->setLength(J)V

    .line 370
    :cond_3
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 355
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLS playlist cannot handle a media repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 350
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLS playlist cannot handle a timed media"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    return-void

    .line 342
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A parallel time container is incompatible with a PLS playlist"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method


# virtual methods
.method public getContentTypes()[Lmychristophedelory/content/type/ContentType;
    .locals 1

    .line 86
    sget-object v0, Lchristophedelory/playlist/pls/PLSProvider;->FILETYPES:[Lmychristophedelory/content/type/ContentType;

    invoke-virtual {v0}, [Lmychristophedelory/content/type/ContentType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmychristophedelory/content/type/ContentType;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "pls"

    return-object v0
.end method

.method public readFrom(Ljava/io/InputStream;Ljava/lang/String;Lorg/myapache/commons/logging/Log;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-nez p2, :cond_0

    const-string p2, "UTF-8"

    .line 99
    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 101
    new-instance p1, Lchristophedelory/playlist/pls/PLS;

    invoke-direct {p1}, Lchristophedelory/playlist/pls/PLS;-><init>()V

    .line 102
    invoke-virtual {p1, p0}, Lchristophedelory/playlist/pls/PLS;->setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V

    const/4 p2, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 108
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_f

    .line 110
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 112
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_1

    if-nez v3, :cond_3

    const-string v3, "[playlist]"

    .line 117
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    .line 119
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not a PLS playlist format"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/16 v6, 0x3d

    .line 126
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-gtz v6, :cond_4

    const-string p1, "Malformed PLS playlist"

    .line 130
    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    :goto_1
    move-object p1, v5

    goto/16 :goto_5

    .line 135
    :cond_4
    invoke-virtual {v4, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    .line 136
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v6, "numberofentries"

    .line 138
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 144
    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v4, :cond_5

    .line 155
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid NumberOfEntries in PLS playlist: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->warn(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    if-ltz p2, :cond_6

    if-eq p2, v4, :cond_6

    const-string p1, "PLS playlist number of entries already specified with a different value"

    .line 163
    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    move p2, v4

    goto :goto_0

    :catch_0
    move-exception p1

    .line 148
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    const-string v6, "file"

    .line 170
    invoke-virtual {v7, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    const/4 v6, 0x4

    .line 172
    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 177
    :try_start_1
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    sub-int/2addr v5, v2

    .line 187
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    :goto_2
    add-int/lit8 v7, v5, 0x1

    if-ge v6, v7, :cond_8

    .line 189
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v7

    new-instance v8, Lchristophedelory/playlist/m3u/Resource;

    invoke-direct {v8}, Lchristophedelory/playlist/m3u/Resource;-><init>()V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 192
    :cond_8
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lchristophedelory/playlist/m3u/Resource;

    .line 193
    invoke-virtual {v5, v4}, Lchristophedelory/playlist/m3u/Resource;->setLocation(Ljava/lang/String;)V

    goto/16 :goto_0

    :catch_1
    move-exception p1

    .line 181
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_9
    const-string v6, "title"

    .line 196
    invoke-virtual {v7, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/4 v6, 0x5

    .line 198
    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 203
    :try_start_2
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    sub-int/2addr v5, v2

    .line 213
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    :goto_3
    add-int/lit8 v7, v5, 0x1

    if-ge v6, v7, :cond_a

    .line 215
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v7

    new-instance v8, Lchristophedelory/playlist/m3u/Resource;

    invoke-direct {v8}, Lchristophedelory/playlist/m3u/Resource;-><init>()V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 218
    :cond_a
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lchristophedelory/playlist/m3u/Resource;

    .line 219
    invoke-virtual {v5, v4}, Lchristophedelory/playlist/m3u/Resource;->setName(Ljava/lang/String;)V

    goto/16 :goto_0

    :catch_2
    move-exception p1

    .line 207
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_b
    const-string v6, "length"

    .line 222
    invoke-virtual {v7, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_d

    const/4 v6, 0x6

    .line 224
    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 229
    :try_start_3
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_4

    sub-int/2addr v6, v2

    .line 239
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    :goto_4
    add-int/lit8 v8, v6, 0x1

    if-ge v7, v8, :cond_c

    .line 241
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v8

    new-instance v9, Lchristophedelory/playlist/m3u/Resource;

    invoke-direct {v9}, Lchristophedelory/playlist/m3u/Resource;-><init>()V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 244
    :cond_c
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lchristophedelory/playlist/m3u/Resource;

    .line 248
    :try_start_4
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lchristophedelory/playlist/m3u/Resource;->setLength(J)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_0

    :catch_3
    move-exception p1

    .line 252
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    goto/16 :goto_1

    :catch_4
    move-exception p1

    .line 233
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_d
    const-string v6, "version"

    .line 257
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    const-string v6, "2"

    .line 260
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 262
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown PLS version "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 269
    :cond_e
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unknown PLS keyword "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p3, v4}, Lorg/myapache/commons/logging/Log;->warn(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_f
    :goto_5
    if-eqz p1, :cond_12

    if-gez p2, :cond_10

    const-string p2, "No number of entries in PLS playlist"

    .line 278
    invoke-interface {p3, p2}, Lorg/myapache/commons/logging/Log;->warn(Ljava/lang/Object;)V

    goto :goto_7

    .line 283
    :cond_10
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, p2

    if-lez v0, :cond_11

    .line 287
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ignoring "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " extra resources according to the specified number of entries "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v2}, Lorg/myapache/commons/logging/Log;->warn(Ljava/lang/Object;)V

    :cond_11
    :goto_6
    if-ge v1, v0, :cond_12

    .line 292
    invoke-virtual {p1}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_12
    :goto_7
    return-object p1
.end method

.method public toSpecificPlaylist(Lchristophedelory/playlist/Playlist;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 303
    new-instance v0, Lchristophedelory/playlist/pls/PLS;

    invoke-direct {v0}, Lchristophedelory/playlist/pls/PLS;-><init>()V

    .line 304
    invoke-virtual {v0, p0}, Lchristophedelory/playlist/pls/PLS;->setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V

    .line 306
    invoke-virtual {v0}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lchristophedelory/playlist/Playlist;->getRootSequence()Lchristophedelory/playlist/Sequence;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lchristophedelory/playlist/pls/PLSProvider;->addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    return-object v0
.end method
