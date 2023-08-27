.class public Lchristophedelory/playlist/m3u/M3UProvider;
.super Ljava/lang/Object;
.source "M3UProvider.java"

# interfaces
.implements Lchristophedelory/playlist/SpecificPlaylistProvider;


# static fields
.field private static final FILETYPES:[Lmychristophedelory/content/type/ContentType;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    const/4 v0, 0x4

    new-array v1, v0, [Lmychristophedelory/content/type/ContentType;

    .line 55
    new-instance v2, Lmychristophedelory/content/type/ContentType;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/String;

    const-string v5, ".m3u"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x2

    new-array v7, v5, [Ljava/lang/String;

    const-string v8, "audio/x-mpegurl"

    aput-object v8, v7, v6

    const-string v9, "audio/mpegurl"

    aput-object v9, v7, v3

    const/16 v10, 0x9

    new-array v10, v10, [Lchristophedelory/player/PlayerSupport;

    new-instance v11, Lchristophedelory/player/PlayerSupport;

    sget-object v12, Lchristophedelory/player/PlayerSupport$Player;->WINAMP:Lchristophedelory/player/PlayerSupport$Player;

    const/4 v13, 0x0

    invoke-direct {v11, v12, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v11, v10, v6

    new-instance v11, Lchristophedelory/player/PlayerSupport;

    sget-object v12, Lchristophedelory/player/PlayerSupport$Player;->VLC_MEDIA_PLAYER:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v11, v12, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v11, v10, v3

    new-instance v11, Lchristophedelory/player/PlayerSupport;

    sget-object v12, Lchristophedelory/player/PlayerSupport$Player;->WINDOWS_MEDIA_PLAYER:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v11, v12, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v11, v10, v5

    new-instance v11, Lchristophedelory/player/PlayerSupport;

    sget-object v12, Lchristophedelory/player/PlayerSupport$Player;->MEDIA_PLAYER_CLASSIC:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v11, v12, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v12, 0x3

    aput-object v11, v10, v12

    new-instance v11, Lchristophedelory/player/PlayerSupport;

    sget-object v14, Lchristophedelory/player/PlayerSupport$Player;->FOOBAR2000:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v11, v14, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v11, v10, v0

    new-instance v0, Lchristophedelory/player/PlayerSupport;

    sget-object v11, Lchristophedelory/player/PlayerSupport$Player;->MPLAYER:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v0, v11, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v11, 0x5

    aput-object v0, v10, v11

    new-instance v0, Lchristophedelory/player/PlayerSupport;

    sget-object v11, Lchristophedelory/player/PlayerSupport$Player;->QUICKTIME:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v0, v11, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v11, 0x6

    aput-object v0, v10, v11

    new-instance v0, Lchristophedelory/player/PlayerSupport;

    sget-object v11, Lchristophedelory/player/PlayerSupport$Player;->ITUNES:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v0, v11, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/4 v11, 0x7

    aput-object v0, v10, v11

    new-instance v0, Lchristophedelory/player/PlayerSupport;

    sget-object v11, Lchristophedelory/player/PlayerSupport$Player;->REALPLAYER:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v0, v11, v6, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    const/16 v11, 0x8

    aput-object v0, v10, v11

    const-string v0, "Winamp M3U"

    invoke-direct {v2, v4, v7, v10, v0}, Lmychristophedelory/content/type/ContentType;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lchristophedelory/player/PlayerSupport;Ljava/lang/String;)V

    aput-object v2, v1, v6

    new-instance v0, Lmychristophedelory/content/type/ContentType;

    new-array v2, v3, [Ljava/lang/String;

    const-string v4, ".m3u8"

    aput-object v4, v2, v6

    new-array v4, v5, [Ljava/lang/String;

    aput-object v8, v4, v6

    aput-object v9, v4, v3

    new-array v7, v5, [Lchristophedelory/player/PlayerSupport;

    new-instance v8, Lchristophedelory/player/PlayerSupport;

    sget-object v9, Lchristophedelory/player/PlayerSupport$Player;->WINAMP:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v8, v9, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v8, v7, v6

    new-instance v8, Lchristophedelory/player/PlayerSupport;

    sget-object v9, Lchristophedelory/player/PlayerSupport$Player;->FOOBAR2000:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v8, v9, v3, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v8, v7, v3

    const-string v8, "Winamp M3U8"

    invoke-direct {v0, v2, v4, v7, v8}, Lmychristophedelory/content/type/ContentType;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lchristophedelory/player/PlayerSupport;Ljava/lang/String;)V

    aput-object v0, v1, v3

    new-instance v0, Lmychristophedelory/content/type/ContentType;

    new-array v2, v3, [Ljava/lang/String;

    const-string v4, ".m4u"

    aput-object v4, v2, v6

    new-array v4, v3, [Ljava/lang/String;

    const-string v7, "video/x-mpegurl"

    aput-object v7, v4, v6

    new-array v7, v6, [Lchristophedelory/player/PlayerSupport;

    const-string v8, "M4U Playlist"

    invoke-direct {v0, v2, v4, v7, v8}, Lmychristophedelory/content/type/ContentType;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lchristophedelory/player/PlayerSupport;Ljava/lang/String;)V

    aput-object v0, v1, v5

    new-instance v0, Lmychristophedelory/content/type/ContentType;

    new-array v2, v3, [Ljava/lang/String;

    const-string v4, ".ram"

    aput-object v4, v2, v6

    new-array v4, v5, [Ljava/lang/String;

    const-string v7, "audio/vnd.rn-realaudio"

    aput-object v7, v4, v6

    const-string v7, "audio/x-pn-realaudio"

    aput-object v7, v4, v3

    new-array v5, v5, [Lchristophedelory/player/PlayerSupport;

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->MEDIA_PLAYER_CLASSIC:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v7, v8, v6, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v7, v5, v6

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->REALPLAYER:Lchristophedelory/player/PlayerSupport$Player;

    invoke-direct {v7, v8, v6, v13}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v7, v5, v3

    const-string v3, "Real Audio Metadata (RAM)"

    invoke-direct {v0, v2, v4, v5, v3}, Lmychristophedelory/content/type/ContentType;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lchristophedelory/player/PlayerSupport;Ljava/lang/String;)V

    aput-object v0, v1, v12

    sput-object v1, Lchristophedelory/playlist/m3u/M3UProvider;->FILETYPES:[Lmychristophedelory/content/type/ContentType;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 50
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

    .line 206
    instance-of v0, p2, Lchristophedelory/playlist/Sequence;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 208
    check-cast p2, Lchristophedelory/playlist/Sequence;

    .line 210
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v0

    if-ltz v0, :cond_1

    .line 215
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v0

    const/4 v2, 0x0

    .line 217
    :goto_0
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 219
    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_0

    aget-object v5, v0, v4

    .line 221
    invoke-direct {p0, p1, v5}, Lchristophedelory/playlist/m3u/M3UProvider;->addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 212
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A M3U playlist cannot handle a sequence repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 225
    :cond_2
    instance-of v0, p2, Lchristophedelory/playlist/Parallel;

    if-nez v0, :cond_7

    .line 229
    instance-of v0, p2, Lchristophedelory/playlist/Media;

    if-eqz v0, :cond_6

    .line 231
    check-cast p2, Lchristophedelory/playlist/Media;

    .line 233
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getDuration()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_5

    .line 238
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getRepeatCount()I

    move-result v0

    if-ltz v0, :cond_4

    .line 243
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 245
    :goto_2
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getRepeatCount()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 247
    new-instance v0, Lchristophedelory/playlist/m3u/Resource;

    invoke-direct {v0}, Lchristophedelory/playlist/m3u/Resource;-><init>()V

    .line 248
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v2

    invoke-virtual {v2}, Lmychristophedelory/content/Content;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lchristophedelory/playlist/m3u/Resource;->setLocation(Ljava/lang/String;)V

    .line 250
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v2

    invoke-virtual {v2}, Lmychristophedelory/content/Content;->getDuration()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_3

    .line 252
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v2

    invoke-virtual {v2}, Lmychristophedelory/content/Content;->getDuration()J

    move-result-wide v2

    const-wide/16 v4, 0x3e7

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lchristophedelory/playlist/m3u/Resource;->setLength(J)V

    .line 255
    :cond_3
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 240
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A M3U playlist cannot handle a media repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 235
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A M3U playlist cannot handle a timed media"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    return-void

    .line 227
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A parallel time container is incompatible with a M3U playlist"

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

    .line 105
    sget-object v0, Lchristophedelory/playlist/m3u/M3UProvider;->FILETYPES:[Lmychristophedelory/content/type/ContentType;

    invoke-virtual {v0}, [Lmychristophedelory/content/type/ContentType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmychristophedelory/content/type/ContentType;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "m3u"

    return-object v0
.end method

.method public readFrom(Ljava/io/InputStream;Ljava/lang/String;Lorg/myapache/commons/logging/Log;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-nez p2, :cond_0

    const-string p2, "UTF-8"

    .line 118
    :cond_0
    new-instance p3, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {p3, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 120
    new-instance p1, Lchristophedelory/playlist/m3u/M3U;

    invoke-direct {p1}, Lchristophedelory/playlist/m3u/M3U;-><init>()V

    .line 121
    invoke-virtual {p1, p0}, Lchristophedelory/playlist/m3u/M3U;->setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V

    const/4 p2, 0x0

    :goto_0
    move-object v0, p2

    move-object v1, v0

    .line 127
    :cond_1
    :goto_1
    invoke-virtual {p3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 129
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 131
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    const/4 v3, 0x0

    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x3c

    if-eq v4, v5, :cond_5

    const/16 v5, 0x5b

    if-eq v4, v5, :cond_5

    const/16 v5, 0x23

    if-ne v4, v5, :cond_3

    .line 143
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "#EXTINF"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x2c

    .line 145
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    if-ltz v4, :cond_2

    add-int/lit8 v0, v4, 0x1

    .line 149
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v2, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_2
    const/16 v5, 0x3a

    .line 152
    invoke-virtual {v2, v5, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    if-ltz v3, :cond_1

    if-ge v3, v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    .line 156
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 165
    :cond_3
    new-instance v3, Lchristophedelory/playlist/m3u/Resource;

    invoke-direct {v3}, Lchristophedelory/playlist/m3u/Resource;-><init>()V

    .line 166
    invoke-virtual {v3, v2}, Lchristophedelory/playlist/m3u/Resource;->setLocation(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v3, v0}, Lchristophedelory/playlist/m3u/Resource;->setName(Ljava/lang/String;)V

    if-eqz v1, :cond_4

    .line 171
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lchristophedelory/playlist/m3u/Resource;->setLength(J)V

    .line 174
    :cond_4
    invoke-virtual {p1}, Lchristophedelory/playlist/m3u/M3U;->getResources()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 139
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Doesn\'t seem to be a M3U playlist (and related ones)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    return-object p1
.end method

.method public toSpecificPlaylist(Lchristophedelory/playlist/Playlist;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 188
    new-instance v0, Lchristophedelory/playlist/m3u/M3U;

    invoke-direct {v0}, Lchristophedelory/playlist/m3u/M3U;-><init>()V

    .line 189
    invoke-virtual {v0, p0}, Lchristophedelory/playlist/m3u/M3U;->setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V

    .line 191
    invoke-virtual {v0}, Lchristophedelory/playlist/m3u/M3U;->getResources()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lchristophedelory/playlist/Playlist;->getRootSequence()Lchristophedelory/playlist/Sequence;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lchristophedelory/playlist/m3u/M3UProvider;->addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    return-object v0
.end method
