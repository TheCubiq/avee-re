.class public Lchristophedelory/playlist/mpcpl/MPCPL;
.super Ljava/lang/Object;
.source "MPCPL.java"

# interfaces
.implements Lchristophedelory/playlist/SpecificPlaylist;


# instance fields
.field private transient _provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

.field private final _resources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/playlist/mpcpl/Resource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lchristophedelory/playlist/mpcpl/MPCPL;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/playlist/mpcpl/MPCPL;->_resources:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getProvider()Lchristophedelory/playlist/SpecificPlaylistProvider;
    .locals 1

    .line 66
    iget-object v0, p0, Lchristophedelory/playlist/mpcpl/MPCPL;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    return-object v0
.end method

.method public getResources()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/playlist/mpcpl/Resource;",
            ">;"
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lchristophedelory/playlist/mpcpl/MPCPL;->_resources:Ljava/util/List;

    return-object v0
.end method

.method public setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lchristophedelory/playlist/mpcpl/MPCPL;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    return-void
.end method

.method public toPlaylist()Lchristophedelory/playlist/Playlist;
    .locals 5

    .line 115
    new-instance v0, Lchristophedelory/playlist/Playlist;

    invoke-direct {v0}, Lchristophedelory/playlist/Playlist;-><init>()V

    .line 117
    iget-object v1, p0, Lchristophedelory/playlist/mpcpl/MPCPL;->_resources:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lchristophedelory/playlist/mpcpl/Resource;

    .line 119
    invoke-virtual {v2}, Lchristophedelory/playlist/mpcpl/Resource;->getFilename()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 121
    new-instance v3, Lchristophedelory/playlist/Media;

    invoke-direct {v3}, Lchristophedelory/playlist/Media;-><init>()V

    .line 122
    new-instance v4, Lmychristophedelory/content/Content;

    invoke-virtual {v2}, Lchristophedelory/playlist/mpcpl/Resource;->getFilename()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Lmychristophedelory/content/Content;-><init>(Ljava/lang/String;)V

    .line 123
    invoke-virtual {v3, v4}, Lchristophedelory/playlist/Media;->setSource(Lmychristophedelory/content/Content;)V

    .line 124
    invoke-virtual {v0}, Lchristophedelory/playlist/Playlist;->getRootSequence()Lchristophedelory/playlist/Sequence;

    move-result-object v2

    invoke-virtual {v2, v3}, Lchristophedelory/playlist/Sequence;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    goto :goto_0

    .line 128
    :cond_1
    invoke-virtual {v0}, Lchristophedelory/playlist/Playlist;->normalize()V

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-nez p2, :cond_0

    const-string p2, "UTF-8"

    .line 79
    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    const-string p1, "MPCPLAYLIST"

    .line 81
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 86
    iget-object p1, p0, Lchristophedelory/playlist/mpcpl/MPCPL;->_resources:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lchristophedelory/playlist/mpcpl/Resource;

    .line 88
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const-string v2, ",type,"

    .line 89
    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v1}, Lchristophedelory/playlist/mpcpl/Resource;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 93
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const-string v2, ",filename,"

    .line 94
    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v1}, Lchristophedelory/playlist/mpcpl/Resource;->getFilename()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 96
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 98
    invoke-virtual {v1}, Lchristophedelory/playlist/mpcpl/Resource;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 100
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const-string v2, ",subtitle,"

    .line 101
    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 102
    invoke-virtual {v1}, Lchristophedelory/playlist/mpcpl/Resource;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 109
    :cond_2
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    return-void
.end method
