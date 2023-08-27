.class public Lchristophedelory/playlist/mpcpl/MPCPLProvider;
.super Ljava/lang/Object;
.source "MPCPLProvider.java"

# interfaces
.implements Lchristophedelory/playlist/SpecificPlaylistProvider;


# static fields
.field private static final FILETYPES:[Lmychristophedelory/content/type/ContentType;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x1

    new-array v1, v0, [Lmychristophedelory/content/type/ContentType;

    .line 55
    new-instance v2, Lmychristophedelory/content/type/ContentType;

    new-array v3, v0, [Ljava/lang/String;

    const-string v4, ".mpcpl"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-array v4, v0, [Ljava/lang/String;

    const-string v6, "text/plain"

    aput-object v6, v4, v5

    new-array v6, v0, [Lchristophedelory/player/PlayerSupport;

    new-instance v7, Lchristophedelory/player/PlayerSupport;

    sget-object v8, Lchristophedelory/player/PlayerSupport$Player;->MEDIA_PLAYER_CLASSIC:Lchristophedelory/player/PlayerSupport$Player;

    const/4 v9, 0x0

    invoke-direct {v7, v8, v0, v9}, Lchristophedelory/player/PlayerSupport;-><init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V

    aput-object v7, v6, v5

    const-string v0, "Media Player Classic Playlist"

    invoke-direct {v2, v3, v4, v6, v0}, Lmychristophedelory/content/type/ContentType;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lchristophedelory/player/PlayerSupport;Ljava/lang/String;)V

    aput-object v2, v1, v5

    sput-object v1, Lchristophedelory/playlist/mpcpl/MPCPLProvider;->FILETYPES:[Lmychristophedelory/content/type/ContentType;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lchristophedelory/playlist/mpcpl/Resource;",
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

    .line 202
    instance-of v0, p2, Lchristophedelory/playlist/Sequence;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 204
    check-cast p2, Lchristophedelory/playlist/Sequence;

    .line 206
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v0

    if-ltz v0, :cond_1

    .line 211
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v0

    const/4 v2, 0x0

    .line 213
    :goto_0
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 215
    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_0

    aget-object v5, v0, v4

    .line 217
    invoke-direct {p0, p1, v5}, Lchristophedelory/playlist/mpcpl/MPCPLProvider;->addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 208
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A MPCPL playlist cannot handle a sequence repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 221
    :cond_2
    instance-of v0, p2, Lchristophedelory/playlist/Parallel;

    if-nez v0, :cond_6

    .line 225
    instance-of v0, p2, Lchristophedelory/playlist/Media;

    if-eqz v0, :cond_5

    .line 227
    check-cast p2, Lchristophedelory/playlist/Media;

    .line 229
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getDuration()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_4

    .line 234
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getRepeatCount()I

    move-result v0

    if-ltz v0, :cond_3

    .line 239
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 241
    :goto_2
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getRepeatCount()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 243
    new-instance v0, Lchristophedelory/playlist/mpcpl/Resource;

    invoke-direct {v0}, Lchristophedelory/playlist/mpcpl/Resource;-><init>()V

    .line 244
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v2

    invoke-virtual {v2}, Lmychristophedelory/content/Content;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lchristophedelory/playlist/mpcpl/Resource;->setFilename(Ljava/lang/String;)V

    .line 245
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 236
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A MPCPL playlist cannot handle a media repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 231
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A MPCPL playlist cannot handle a timed media"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void

    .line 223
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A parallel time container is incompatible with a MPCPL playlist"

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

    .line 75
    sget-object v0, Lchristophedelory/playlist/mpcpl/MPCPLProvider;->FILETYPES:[Lmychristophedelory/content/type/ContentType;

    invoke-virtual {v0}, [Lmychristophedelory/content/type/ContentType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmychristophedelory/content/type/ContentType;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "mpcpl"

    return-object v0
.end method

.method public readFrom(Ljava/io/InputStream;Ljava/lang/String;Lorg/myapache/commons/logging/Log;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-nez p2, :cond_0

    const-string p2, "UTF-8"

    .line 88
    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 90
    new-instance p1, Lchristophedelory/playlist/mpcpl/MPCPL;

    invoke-direct {p1}, Lchristophedelory/playlist/mpcpl/MPCPL;-><init>()V

    .line 91
    invoke-virtual {p1, p0}, Lchristophedelory/playlist/mpcpl/MPCPL;->setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V

    const/4 p2, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 96
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_a

    .line 98
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 100
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    if-nez v2, :cond_3

    const-string v2, "MPCPLAYLIST"

    .line 105
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    .line 107
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not a MPCPL playlist format"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/16 v5, 0x2c

    .line 114
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    const-string v7, "Malformed MPCPL playlist entry "

    if-gtz v6, :cond_4

    .line 118
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    :goto_1
    move-object p1, v4

    goto/16 :goto_3

    .line 123
    :cond_4
    invoke-virtual {v3, p2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v6, v6, 0x1

    .line 124
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 126
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-gtz v5, :cond_5

    .line 130
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    goto :goto_1

    .line 135
    :cond_5
    invoke-virtual {v3, p2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    .line 136
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 142
    :try_start_0
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    sub-int/2addr v4, v1

    .line 152
    invoke-virtual {p1}, Lchristophedelory/playlist/mpcpl/MPCPL;->getResources()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    :goto_2
    add-int/lit8 v7, v4, 0x1

    if-ge v5, v7, :cond_6

    .line 154
    invoke-virtual {p1}, Lchristophedelory/playlist/mpcpl/MPCPL;->getResources()Ljava/util/List;

    move-result-object v7

    new-instance v8, Lchristophedelory/playlist/mpcpl/Resource;

    invoke-direct {v8}, Lchristophedelory/playlist/mpcpl/Resource;-><init>()V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 157
    :cond_6
    invoke-virtual {p1}, Lchristophedelory/playlist/mpcpl/MPCPL;->getResources()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lchristophedelory/playlist/mpcpl/Resource;

    const-string v5, "filename"

    .line 159
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 161
    invoke-virtual {v4, v3}, Lchristophedelory/playlist/mpcpl/Resource;->setFilename(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    const-string v5, "type"

    .line 163
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 165
    invoke-virtual {v4, v3}, Lchristophedelory/playlist/mpcpl/Resource;->setType(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    const-string v5, "subtitle"

    .line 167
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 169
    invoke-virtual {v4, v3}, Lchristophedelory/playlist/mpcpl/Resource;->setSubtitle(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 173
    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown MPCPL keyword "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p3, v3}, Lorg/myapache/commons/logging/Log;->warn(Ljava/lang/Object;)V

    goto/16 :goto_0

    :catch_0
    move-exception p1

    .line 146
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_a
    :goto_3
    return-object p1
.end method

.method public toSpecificPlaylist(Lchristophedelory/playlist/Playlist;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 184
    new-instance v0, Lchristophedelory/playlist/mpcpl/MPCPL;

    invoke-direct {v0}, Lchristophedelory/playlist/mpcpl/MPCPL;-><init>()V

    .line 185
    invoke-virtual {v0, p0}, Lchristophedelory/playlist/mpcpl/MPCPL;->setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V

    .line 187
    invoke-virtual {v0}, Lchristophedelory/playlist/mpcpl/MPCPL;->getResources()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lchristophedelory/playlist/Playlist;->getRootSequence()Lchristophedelory/playlist/Sequence;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lchristophedelory/playlist/mpcpl/MPCPLProvider;->addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    return-object v0
.end method
