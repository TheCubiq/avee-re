.class public Lchristophedelory/playlist/pls/PLS;
.super Ljava/lang/Object;
.source "PLS.java"

# interfaces
.implements Lchristophedelory/playlist/SpecificPlaylist;


# instance fields
.field private transient _provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

.field private final _resources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/playlist/m3u/Resource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Lchristophedelory/playlist/pls/PLS;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/playlist/pls/PLS;->_resources:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getProvider()Lchristophedelory/playlist/SpecificPlaylistProvider;
    .locals 1

    .line 84
    iget-object v0, p0, Lchristophedelory/playlist/pls/PLS;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    return-object v0
.end method

.method public getResources()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/playlist/m3u/Resource;",
            ">;"
        }
    .end annotation

    .line 172
    iget-object v0, p0, Lchristophedelory/playlist/pls/PLS;->_resources:Ljava/util/List;

    return-object v0
.end method

.method public setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lchristophedelory/playlist/pls/PLS;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    return-void
.end method

.method public toPlaylist()Lchristophedelory/playlist/Playlist;
    .locals 9

    .line 147
    new-instance v0, Lchristophedelory/playlist/Playlist;

    invoke-direct {v0}, Lchristophedelory/playlist/Playlist;-><init>()V

    .line 149
    iget-object v1, p0, Lchristophedelory/playlist/pls/PLS;->_resources:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lchristophedelory/playlist/m3u/Resource;

    .line 151
    invoke-virtual {v2}, Lchristophedelory/playlist/m3u/Resource;->getLocation()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 153
    new-instance v3, Lchristophedelory/playlist/Media;

    invoke-direct {v3}, Lchristophedelory/playlist/Media;-><init>()V

    .line 154
    new-instance v4, Lmychristophedelory/content/Content;

    invoke-virtual {v2}, Lchristophedelory/playlist/m3u/Resource;->getLocation()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lmychristophedelory/content/Content;-><init>(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v3, v4}, Lchristophedelory/playlist/Media;->setSource(Lmychristophedelory/content/Content;)V

    .line 156
    invoke-virtual {v2}, Lchristophedelory/playlist/m3u/Resource;->getLength()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    mul-long v5, v5, v7

    invoke-virtual {v4, v5, v6}, Lmychristophedelory/content/Content;->setDuration(J)V

    .line 157
    invoke-virtual {v0}, Lchristophedelory/playlist/Playlist;->getRootSequence()Lchristophedelory/playlist/Sequence;

    move-result-object v2

    invoke-virtual {v2, v3}, Lchristophedelory/playlist/Sequence;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    goto :goto_0

    .line 161
    :cond_1
    invoke-virtual {v0}, Lchristophedelory/playlist/Playlist;->normalize()V

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-nez p2, :cond_0

    const-string p2, "UTF-8"

    .line 97
    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    const-string p1, "[Playlist]"

    .line 99
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    const-string p1, "NumberOfEntries="

    .line 102
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 104
    iget-object p1, p0, Lchristophedelory/playlist/pls/PLS;->_resources:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 109
    iget-object p1, p0, Lchristophedelory/playlist/pls/PLS;->_resources:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lchristophedelory/playlist/m3u/Resource;

    const-string v2, "File"

    .line 111
    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 112
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const-string v2, "="

    .line 113
    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v1}, Lchristophedelory/playlist/m3u/Resource;->getLocation()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 117
    invoke-virtual {v1}, Lchristophedelory/playlist/m3u/Resource;->getName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v3, "Title"

    .line 119
    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 120
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v1}, Lchristophedelory/playlist/m3u/Resource;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 123
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 126
    :cond_1
    invoke-virtual {v1}, Lchristophedelory/playlist/m3u/Resource;->getLength()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_2

    const-string v3, "Length"

    .line 128
    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 129
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 131
    invoke-virtual {v1}, Lchristophedelory/playlist/m3u/Resource;->getLength()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 132
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    const-string p1, "Version=2"

    .line 138
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 139
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 141
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    return-void
.end method
