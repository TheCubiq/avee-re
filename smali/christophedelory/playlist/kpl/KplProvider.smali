.class public Lchristophedelory/playlist/kpl/KplProvider;
.super Ljava/lang/Object;
.source "KplProvider.java"

# interfaces
.implements Lchristophedelory/playlist/SpecificPlaylistProvider;


# static fields
.field private static final FILETYPES:[Lmychristophedelory/content/type/ContentType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x1

    new-array v1, v0, [Lmychristophedelory/content/type/ContentType;

    .line 68
    new-instance v2, Lmychristophedelory/content/type/ContentType;

    new-array v3, v0, [Ljava/lang/String;

    const-string v4, ".kpl"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-array v0, v0, [Ljava/lang/String;

    const-string v4, "text/xml"

    aput-object v4, v0, v5

    new-array v4, v5, [Lchristophedelory/player/PlayerSupport;

    const-string v6, "Kalliope PlayList"

    invoke-direct {v2, v3, v0, v4, v6}, Lmychristophedelory/content/type/ContentType;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lchristophedelory/player/PlayerSupport;Ljava/lang/String;)V

    aput-object v2, v1, v5

    sput-object v1, Lchristophedelory/playlist/kpl/KplProvider;->FILETYPES:[Lmychristophedelory/content/type/ContentType;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lchristophedelory/playlist/kpl/Entry;",
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

    .line 205
    instance-of v0, p2, Lchristophedelory/playlist/Sequence;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 207
    check-cast p2, Lchristophedelory/playlist/Sequence;

    .line 209
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v0

    if-ltz v0, :cond_1

    .line 214
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v0

    const/4 v2, 0x0

    .line 216
    :goto_0
    invoke-virtual {p2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 218
    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_0

    aget-object v5, v0, v4

    .line 220
    invoke-direct {p0, p1, v5}, Lchristophedelory/playlist/kpl/KplProvider;->addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 211
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A KPL playlist cannot handle a sequence repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 224
    :cond_2
    instance-of v0, p2, Lchristophedelory/playlist/Parallel;

    if-nez v0, :cond_6

    .line 228
    instance-of v0, p2, Lchristophedelory/playlist/Media;

    if-eqz v0, :cond_5

    .line 230
    check-cast p2, Lchristophedelory/playlist/Media;

    .line 232
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getDuration()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_4

    .line 237
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getRepeatCount()I

    move-result v0

    if-ltz v0, :cond_3

    .line 242
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 244
    :goto_2
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getRepeatCount()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 246
    new-instance v0, Lchristophedelory/playlist/kpl/Entry;

    invoke-direct {v0}, Lchristophedelory/playlist/kpl/Entry;-><init>()V

    .line 247
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v2

    invoke-virtual {v2}, Lmychristophedelory/content/Content;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lchristophedelory/playlist/kpl/Entry;->setFilename(Ljava/lang/String;)V

    .line 248
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    new-instance v2, Lchristophedelory/playlist/kpl/Tag;

    invoke-direct {v2}, Lchristophedelory/playlist/kpl/Tag;-><init>()V

    .line 251
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lchristophedelory/playlist/kpl/Tag;->setGid(Ljava/lang/String;)V

    const-string v3, "Other"

    .line 252
    invoke-virtual {v2, v3}, Lchristophedelory/playlist/kpl/Tag;->setGenre(Ljava/lang/String;)V

    const-string v3, "Unknown Year"

    .line 253
    invoke-virtual {v2, v3}, Lchristophedelory/playlist/kpl/Tag;->setYear(Ljava/lang/String;)V

    .line 254
    invoke-virtual {p2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v3

    invoke-virtual {v3}, Lmychristophedelory/content/Content;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lchristophedelory/playlist/kpl/Tag;->setTitle(Ljava/lang/String;)V

    .line 255
    invoke-virtual {v0, v2}, Lchristophedelory/playlist/kpl/Entry;->setTag(Lchristophedelory/playlist/kpl/Tag;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 239
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A KPL playlist cannot handle a media repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 234
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A KPL playlist cannot handle a timed media"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void

    .line 226
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A KPL playlist cannot play different media at the same time"

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

    .line 87
    sget-object v0, Lchristophedelory/playlist/kpl/KplProvider;->FILETYPES:[Lmychristophedelory/content/type/ContentType;

    invoke-virtual {v0}, [Lmychristophedelory/content/type/ContentType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmychristophedelory/content/type/ContentType;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "kpl"

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

    .line 100
    :cond_0
    invoke-static {p1, p2}, Lchristophedelory/io/IOUtils;->toString(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "&"

    const-string p3, "&amp;"

    .line 104
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "&amp;([a-zA-Z0-9#]+;)"

    const-string p3, "&$1"

    .line 106
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "<([0-9]+) "

    const-string p3, "<x$1 "

    .line 112
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "</([0-9]+)"

    const-string p3, "</x$1"

    .line 113
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 116
    new-instance p2, Ljava/io/StringReader;

    invoke-direct {p2, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 118
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object p1

    .line 119
    invoke-virtual {p1}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object p1

    .line 120
    new-instance p3, Lorg/xml/sax/helpers/DefaultHandler;

    invoke-direct {p3}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    invoke-virtual {p1, p3}, Ljavax/xml/parsers/DocumentBuilder;->setErrorHandler(Lorg/xml/sax/ErrorHandler;)V

    .line 121
    new-instance p3, Lorg/xml/sax/InputSource;

    invoke-direct {p3, p2}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    invoke-virtual {p1, p3}, Ljavax/xml/parsers/DocumentBuilder;->parse(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;

    move-result-object p1

    .line 123
    invoke-interface {p1}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    move-result-object p2

    invoke-interface {p2}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "xml"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 128
    new-instance p2, Lchristophedelory/playlist/kpl/Xml;

    invoke-direct {p2}, Lchristophedelory/playlist/kpl/Xml;-><init>()V

    .line 129
    invoke-virtual {p2, p0}, Lchristophedelory/playlist/kpl/Xml;->setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V

    .line 132
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0x78

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p3

    const/4 v2, 0x0

    .line 134
    :goto_0
    invoke-interface {p3}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    if-lez v3, :cond_2

    .line 136
    new-instance v3, Lchristophedelory/playlist/kpl/Entry;

    invoke-direct {v3}, Lchristophedelory/playlist/kpl/Entry;-><init>()V

    .line 137
    invoke-interface {p3, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object p3

    check-cast p3, Lorg/w3c/dom/Element;

    const-string v4, "filename"

    .line 138
    invoke-interface {p3, v4}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lchristophedelory/playlist/kpl/Entry;->setFilename(Ljava/lang/String;)V

    .line 139
    invoke-virtual {p2}, Lchristophedelory/playlist/kpl/Xml;->getEntries()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v4, "tag"

    .line 141
    invoke-interface {p3, v4}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p3

    .line 143
    invoke-interface {p3}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v4

    if-lez v4, :cond_1

    .line 145
    new-instance v4, Lchristophedelory/playlist/kpl/Tag;

    invoke-direct {v4}, Lchristophedelory/playlist/kpl/Tag;-><init>()V

    .line 146
    invoke-interface {p3, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object p3

    check-cast p3, Lorg/w3c/dom/Element;

    const-string v5, "artist"

    .line 147
    invoke-interface {p3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lchristophedelory/playlist/kpl/Tag;->setArtist(Ljava/lang/String;)V

    const-string v5, "album"

    .line 148
    invoke-interface {p3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lchristophedelory/playlist/kpl/Tag;->setAlbum(Ljava/lang/String;)V

    const-string v5, "title"

    .line 149
    invoke-interface {p3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lchristophedelory/playlist/kpl/Tag;->setTitle(Ljava/lang/String;)V

    const-string v5, "year"

    .line 150
    invoke-interface {p3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lchristophedelory/playlist/kpl/Tag;->setYear(Ljava/lang/String;)V

    const-string v5, "comment"

    .line 151
    invoke-interface {p3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lchristophedelory/playlist/kpl/Tag;->setComment(Ljava/lang/String;)V

    const-string v5, "genre"

    .line 152
    invoke-interface {p3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lchristophedelory/playlist/kpl/Tag;->setGenre(Ljava/lang/String;)V

    const-string v5, "track"

    .line 153
    invoke-interface {p3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lchristophedelory/playlist/kpl/Tag;->setTrack(Ljava/lang/String;)V

    const-string v5, "gid"

    .line 154
    invoke-interface {p3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lchristophedelory/playlist/kpl/Tag;->setGid(Ljava/lang/String;)V

    const-string v5, "has_tag"

    .line 155
    invoke-interface {p3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v4, p3}, Lchristophedelory/playlist/kpl/Tag;->setHasTag(Ljava/lang/String;)V

    .line 156
    invoke-virtual {v3, v4}, Lchristophedelory/playlist/kpl/Entry;->setTag(Lchristophedelory/playlist/kpl/Tag;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 160
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p3

    goto/16 :goto_0

    :cond_2
    const-string p3, "info"

    .line 163
    invoke-interface {p1, p3}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p1

    .line 165
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result p3

    if-lez p3, :cond_3

    .line 167
    invoke-interface {p1, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object p1

    check-cast p1, Lorg/w3c/dom/Element;

    .line 168
    invoke-virtual {p2}, Lchristophedelory/playlist/kpl/Xml;->getInfo()Lchristophedelory/playlist/kpl/Info;

    move-result-object p3

    const-string v0, "creation_day"

    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lchristophedelory/playlist/kpl/Info;->setCreationDayString(Ljava/lang/String;)V

    .line 169
    invoke-virtual {p2}, Lchristophedelory/playlist/kpl/Xml;->getInfo()Lchristophedelory/playlist/kpl/Info;

    move-result-object p3

    const-string v0, "modified_day"

    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lchristophedelory/playlist/kpl/Info;->setModifiedDayString(Ljava/lang/String;)V

    .line 170
    invoke-virtual {p2}, Lchristophedelory/playlist/kpl/Xml;->getInfo()Lchristophedelory/playlist/kpl/Info;

    move-result-object p3

    const-string v0, "author"

    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lchristophedelory/playlist/kpl/Info;->setAuthor(Ljava/lang/String;)V

    .line 171
    invoke-virtual {p2}, Lchristophedelory/playlist/kpl/Xml;->getInfo()Lchristophedelory/playlist/kpl/Info;

    move-result-object p3

    const-string v0, "player"

    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lchristophedelory/playlist/kpl/Info;->setPlayer(Ljava/lang/String;)V

    .line 172
    invoke-virtual {p2}, Lchristophedelory/playlist/kpl/Xml;->getInfo()Lchristophedelory/playlist/kpl/Info;

    move-result-object p3

    const-string v0, "player_version"

    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lchristophedelory/playlist/kpl/Info;->setPlayerVersion(Ljava/lang/String;)V

    .line 173
    invoke-virtual {p2}, Lchristophedelory/playlist/kpl/Xml;->getInfo()Lchristophedelory/playlist/kpl/Info;

    move-result-object p3

    const-string v0, "kpl_version"

    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lchristophedelory/playlist/kpl/Info;->setKplVersion(Ljava/lang/String;)V

    :cond_3
    return-object p2

    .line 125
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not a Kalliope playlist (root element is not named \'xml\')"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public toSpecificPlaylist(Lchristophedelory/playlist/Playlist;)Lchristophedelory/playlist/SpecificPlaylist;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 182
    new-instance v0, Lchristophedelory/playlist/kpl/Xml;

    invoke-direct {v0}, Lchristophedelory/playlist/kpl/Xml;-><init>()V

    .line 183
    invoke-virtual {v0, p0}, Lchristophedelory/playlist/kpl/Xml;->setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V

    .line 185
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 186
    invoke-virtual {v0}, Lchristophedelory/playlist/kpl/Xml;->getInfo()Lchristophedelory/playlist/kpl/Info;

    move-result-object v2

    invoke-virtual {v2, v1}, Lchristophedelory/playlist/kpl/Info;->setCreationDay(Ljava/util/Date;)V

    .line 187
    invoke-virtual {v0}, Lchristophedelory/playlist/kpl/Xml;->getInfo()Lchristophedelory/playlist/kpl/Info;

    move-result-object v2

    invoke-virtual {v2, v1}, Lchristophedelory/playlist/kpl/Info;->setModifiedDay(Ljava/util/Date;)V

    .line 188
    invoke-virtual {v0}, Lchristophedelory/playlist/kpl/Xml;->getInfo()Lchristophedelory/playlist/kpl/Info;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Lizzy v"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lmychristophedelory/xml/Version;->CURRENT:Lmychristophedelory/xml/Version;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lchristophedelory/playlist/kpl/Info;->setAuthor(Ljava/lang/String;)V

    .line 190
    invoke-virtual {v0}, Lchristophedelory/playlist/kpl/Xml;->getEntries()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lchristophedelory/playlist/Playlist;->getRootSequence()Lchristophedelory/playlist/Sequence;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lchristophedelory/playlist/kpl/KplProvider;->addToPlaylist(Ljava/util/List;Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    return-object v0
.end method
