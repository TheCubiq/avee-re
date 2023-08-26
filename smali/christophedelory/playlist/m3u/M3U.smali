.class public Lchristophedelory/playlist/m3u/M3U;
.super Ljava/lang/Object;
.source "M3U.java"

# interfaces
.implements Lchristophedelory/playlist/SpecificPlaylist;


# instance fields
.field private _extensionM3U:Z

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

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lchristophedelory/playlist/m3u/M3U;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/playlist/m3u/M3U;->_resources:Ljava/util/List;

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lchristophedelory/playlist/m3u/M3U;->_extensionM3U:Z

    return-void
.end method


# virtual methods
.method public getProvider()Lchristophedelory/playlist/SpecificPlaylistProvider;
    .locals 1

    .line 70
    iget-object v0, p0, Lchristophedelory/playlist/m3u/M3U;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

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

    .line 167
    iget-object v0, p0, Lchristophedelory/playlist/m3u/M3U;->_resources:Ljava/util/List;

    return-object v0
.end method

.method public isExtensionM3U()Z
    .locals 1

    .line 158
    iget-boolean v0, p0, Lchristophedelory/playlist/m3u/M3U;->_extensionM3U:Z

    return v0
.end method

.method public setExtensionM3U(Z)V
    .locals 0

    .line 147
    iput-boolean p1, p0, Lchristophedelory/playlist/m3u/M3U;->_extensionM3U:Z

    return-void
.end method

.method public setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lchristophedelory/playlist/m3u/M3U;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    return-void
.end method

.method public toPlaylist()Lchristophedelory/playlist/Playlist;
    .locals 9

    .line 121
    new-instance v0, Lchristophedelory/playlist/Playlist;

    invoke-direct {v0}, Lchristophedelory/playlist/Playlist;-><init>()V

    .line 123
    iget-object v1, p0, Lchristophedelory/playlist/m3u/M3U;->_resources:Ljava/util/List;

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

    .line 125
    invoke-virtual {v2}, Lchristophedelory/playlist/m3u/Resource;->getLocation()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 127
    new-instance v3, Lchristophedelory/playlist/Media;

    invoke-direct {v3}, Lchristophedelory/playlist/Media;-><init>()V

    .line 128
    new-instance v4, Lmychristophedelory/content/Content;

    invoke-virtual {v2}, Lchristophedelory/playlist/m3u/Resource;->getLocation()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lmychristophedelory/content/Content;-><init>(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v3, v4}, Lchristophedelory/playlist/Media;->setSource(Lmychristophedelory/content/Content;)V

    .line 130
    invoke-virtual {v2}, Lchristophedelory/playlist/m3u/Resource;->getLength()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    mul-long v5, v5, v7

    invoke-virtual {v4, v5, v6}, Lmychristophedelory/content/Content;->setDuration(J)V

    .line 131
    invoke-virtual {v0}, Lchristophedelory/playlist/Playlist;->getRootSequence()Lchristophedelory/playlist/Sequence;

    move-result-object v2

    invoke-virtual {v2, v3}, Lchristophedelory/playlist/Sequence;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    goto :goto_0

    .line 135
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

    .line 83
    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 85
    iget-boolean p1, p0, Lchristophedelory/playlist/m3u/M3U;->_extensionM3U:Z

    if-eqz p1, :cond_1

    const-string p1, "#EXTM3U"

    .line 87
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 91
    :cond_1
    iget-object p1, p0, Lchristophedelory/playlist/m3u/M3U;->_resources:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lchristophedelory/playlist/m3u/Resource;

    .line 93
    iget-boolean v1, p0, Lchristophedelory/playlist/m3u/M3U;->_extensionM3U:Z

    if-eqz v1, :cond_3

    const-string v1, "#EXTINF:"

    .line 95
    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p2}, Lchristophedelory/playlist/m3u/Resource;->getLength()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const-string v1, ","

    .line 97
    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 99
    invoke-virtual {p2}, Lchristophedelory/playlist/m3u/Resource;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    .line 101
    invoke-virtual {p2}, Lchristophedelory/playlist/m3u/Resource;->getLocation()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 105
    :cond_2
    invoke-virtual {p2}, Lchristophedelory/playlist/m3u/Resource;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 108
    :goto_1
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 111
    :cond_3
    invoke-virtual {p2}, Lchristophedelory/playlist/m3u/Resource;->getLocation()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    return-void
.end method
