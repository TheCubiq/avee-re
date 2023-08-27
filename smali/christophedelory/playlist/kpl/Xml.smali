.class public Lchristophedelory/playlist/kpl/Xml;
.super Ljava/lang/Object;
.source "Xml.java"

# interfaces
.implements Lchristophedelory/playlist/SpecificPlaylist;


# instance fields
.field private final _entries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/playlist/kpl/Entry;",
            ">;"
        }
    .end annotation
.end field

.field private final _info:Lchristophedelory/playlist/kpl/Info;

.field private transient _provider:Lchristophedelory/playlist/SpecificPlaylistProvider;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Xml;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/playlist/kpl/Xml;->_entries:Ljava/util/List;

    .line 73
    new-instance v0, Lchristophedelory/playlist/kpl/Info;

    invoke-direct {v0}, Lchristophedelory/playlist/kpl/Info;-><init>()V

    iput-object v0, p0, Lchristophedelory/playlist/kpl/Xml;->_info:Lchristophedelory/playlist/kpl/Info;

    return-void
.end method


# virtual methods
.method public getEntries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/playlist/kpl/Entry;",
            ">;"
        }
    .end annotation

    .line 179
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Xml;->_entries:Ljava/util/List;

    return-object v0
.end method

.method public getInfo()Lchristophedelory/playlist/kpl/Info;
    .locals 1

    .line 188
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Xml;->_info:Lchristophedelory/playlist/kpl/Info;

    return-object v0
.end method

.method public getProvider()Lchristophedelory/playlist/SpecificPlaylistProvider;
    .locals 1

    .line 84
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Xml;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    return-object v0
.end method

.method public setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lchristophedelory/playlist/kpl/Xml;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    return-void
.end method

.method public toPlaylist()Lchristophedelory/playlist/Playlist;
    .locals 5

    .line 154
    new-instance v0, Lchristophedelory/playlist/Playlist;

    invoke-direct {v0}, Lchristophedelory/playlist/Playlist;-><init>()V

    .line 156
    iget-object v1, p0, Lchristophedelory/playlist/kpl/Xml;->_entries:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lchristophedelory/playlist/kpl/Entry;

    .line 158
    invoke-virtual {v2}, Lchristophedelory/playlist/kpl/Entry;->getFilename()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 160
    new-instance v3, Lchristophedelory/playlist/Media;

    invoke-direct {v3}, Lchristophedelory/playlist/Media;-><init>()V

    .line 161
    new-instance v4, Lmychristophedelory/content/Content;

    invoke-virtual {v2}, Lchristophedelory/playlist/kpl/Entry;->getFilename()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Lmychristophedelory/content/Content;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v3, v4}, Lchristophedelory/playlist/Media;->setSource(Lmychristophedelory/content/Content;)V

    .line 163
    invoke-virtual {v0}, Lchristophedelory/playlist/Playlist;->getRootSequence()Lchristophedelory/playlist/Sequence;

    move-result-object v2

    invoke-virtual {v2, v3}, Lchristophedelory/playlist/Sequence;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    goto :goto_0

    .line 168
    :cond_1
    invoke-virtual {v0}, Lchristophedelory/playlist/Playlist;->normalize()V

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 90
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilder;->newDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    const/4 v1, 0x0

    .line 93
    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->setStrictErrorChecking(Z)V

    const-string v2, "xml"

    .line 94
    invoke-interface {v0, v2}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v2

    .line 95
    invoke-interface {v0, v2}, Lorg/w3c/dom/Document;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 98
    iget-object v3, p0, Lchristophedelory/playlist/kpl/Xml;->_entries:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lchristophedelory/playlist/kpl/Entry;

    .line 100
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getFilename()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 102
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v5

    .line 103
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getFilename()Ljava/lang/String;

    move-result-object v6

    const-string v7, "filename"

    invoke-interface {v5, v7, v6}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    invoke-interface {v2, v5}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 106
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v6

    if-eqz v6, :cond_1

    const-string v6, "tag"

    .line 108
    invoke-interface {v0, v6}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v6

    .line 109
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v7

    invoke-virtual {v7}, Lchristophedelory/playlist/kpl/Tag;->getArtist()Ljava/lang/String;

    move-result-object v7

    const-string v8, "artist"

    invoke-interface {v6, v8, v7}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v7

    invoke-virtual {v7}, Lchristophedelory/playlist/kpl/Tag;->getAlbum()Ljava/lang/String;

    move-result-object v7

    const-string v8, "album"

    invoke-interface {v6, v8, v7}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v7

    invoke-virtual {v7}, Lchristophedelory/playlist/kpl/Tag;->getTitle()Ljava/lang/String;

    move-result-object v7

    const-string v8, "title"

    invoke-interface {v6, v8, v7}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v7

    invoke-virtual {v7}, Lchristophedelory/playlist/kpl/Tag;->getYear()Ljava/lang/String;

    move-result-object v7

    const-string v8, "year"

    invoke-interface {v6, v8, v7}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v7

    invoke-virtual {v7}, Lchristophedelory/playlist/kpl/Tag;->getComment()Ljava/lang/String;

    move-result-object v7

    const-string v8, "comment"

    invoke-interface {v6, v8, v7}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v7

    invoke-virtual {v7}, Lchristophedelory/playlist/kpl/Tag;->getGenre()Ljava/lang/String;

    move-result-object v7

    const-string v8, "genre"

    invoke-interface {v6, v8, v7}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v7

    invoke-virtual {v7}, Lchristophedelory/playlist/kpl/Tag;->getTrack()Ljava/lang/String;

    move-result-object v7

    const-string v8, "track"

    invoke-interface {v6, v8, v7}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v7

    invoke-virtual {v7}, Lchristophedelory/playlist/kpl/Tag;->getGid()Ljava/lang/String;

    move-result-object v7

    const-string v8, "gid"

    invoke-interface {v6, v8, v7}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Entry;->getTag()Lchristophedelory/playlist/kpl/Tag;

    move-result-object v4

    invoke-virtual {v4}, Lchristophedelory/playlist/kpl/Tag;->getHasTag()Ljava/lang/String;

    move-result-object v4

    const-string v7, "has_tag"

    invoke-interface {v6, v7, v4}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-interface {v5, v6}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_2
    const-string v1, "info"

    .line 125
    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v1

    .line 126
    iget-object v3, p0, Lchristophedelory/playlist/kpl/Xml;->_info:Lchristophedelory/playlist/kpl/Info;

    invoke-virtual {v3}, Lchristophedelory/playlist/kpl/Info;->getCreationDayString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "creation_day"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    iget-object v3, p0, Lchristophedelory/playlist/kpl/Xml;->_info:Lchristophedelory/playlist/kpl/Info;

    invoke-virtual {v3}, Lchristophedelory/playlist/kpl/Info;->getModifiedDayString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "modified_day"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    iget-object v3, p0, Lchristophedelory/playlist/kpl/Xml;->_info:Lchristophedelory/playlist/kpl/Info;

    invoke-virtual {v3}, Lchristophedelory/playlist/kpl/Info;->getAuthor()Ljava/lang/String;

    move-result-object v3

    const-string v4, "author"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    iget-object v3, p0, Lchristophedelory/playlist/kpl/Xml;->_info:Lchristophedelory/playlist/kpl/Info;

    invoke-virtual {v3}, Lchristophedelory/playlist/kpl/Info;->getPlayer()Ljava/lang/String;

    move-result-object v3

    const-string v4, "player"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    iget-object v3, p0, Lchristophedelory/playlist/kpl/Xml;->_info:Lchristophedelory/playlist/kpl/Info;

    invoke-virtual {v3}, Lchristophedelory/playlist/kpl/Info;->getPlayerVersion()Ljava/lang/String;

    move-result-object v3

    const-string v4, "player_version"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    iget-object v3, p0, Lchristophedelory/playlist/kpl/Xml;->_info:Lchristophedelory/playlist/kpl/Info;

    invoke-virtual {v3}, Lchristophedelory/playlist/kpl/Info;->getKplVersion()Ljava/lang/String;

    move-result-object v3

    const-string v4, "kpl_version"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    invoke-interface {v2, v1}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 134
    new-instance v1, Ljavax/xml/transform/dom/DOMSource;

    invoke-direct {v1, v0}, Ljavax/xml/transform/dom/DOMSource;-><init>(Lorg/w3c/dom/Node;)V

    .line 135
    new-instance v0, Ljavax/xml/transform/stream/StreamResult;

    invoke-direct {v0, p1}, Ljavax/xml/transform/stream/StreamResult;-><init>(Ljava/io/OutputStream;)V

    .line 136
    invoke-static {}, Ljavax/xml/transform/TransformerFactory;->newInstance()Ljavax/xml/transform/TransformerFactory;

    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljavax/xml/transform/TransformerFactory;->newTransformer()Ljavax/xml/transform/Transformer;

    move-result-object v2

    const-string v3, "yes"

    const-string v4, "omit-xml-declaration"

    .line 138
    invoke-virtual {v2, v4, v3}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "indent"

    .line 139
    invoke-virtual {v2, v4, v3}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_3

    const-string v3, "encoding"

    .line 143
    invoke-virtual {v2, v3, p2}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    :cond_3
    invoke-virtual {v2, v1, v0}, Ljavax/xml/transform/Transformer;->transform(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    .line 148
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method
