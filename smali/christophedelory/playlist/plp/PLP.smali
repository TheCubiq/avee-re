.class public Lchristophedelory/playlist/plp/PLP;
.super Ljava/lang/Object;
.source "PLP.java"

# interfaces
.implements Lchristophedelory/playlist/SpecificPlaylist;


# instance fields
.field private _diskSpecifier:Ljava/lang/String;

.field private final _filenames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private transient _provider:Lchristophedelory/playlist/SpecificPlaylistProvider;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lchristophedelory/playlist/plp/PLP;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/playlist/plp/PLP;->_filenames:Ljava/util/List;

    const-string v0, "HARP"

    .line 60
    iput-object v0, p0, Lchristophedelory/playlist/plp/PLP;->_diskSpecifier:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDiskSpecifier()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lchristophedelory/playlist/plp/PLP;->_diskSpecifier:Ljava/lang/String;

    return-object v0
.end method

.method public getFilenames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 132
    iget-object v0, p0, Lchristophedelory/playlist/plp/PLP;->_filenames:Ljava/util/List;

    return-object v0
.end method

.method public getProvider()Lchristophedelory/playlist/SpecificPlaylistProvider;
    .locals 1

    .line 71
    iget-object v0, p0, Lchristophedelory/playlist/plp/PLP;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    return-object v0
.end method

.method public setDiskSpecifier(Ljava/lang/String;)V
    .locals 0

    .line 154
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/plp/PLP;->_diskSpecifier:Ljava/lang/String;

    return-void
.end method

.method public setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lchristophedelory/playlist/plp/PLP;->_provider:Lchristophedelory/playlist/SpecificPlaylistProvider;

    return-void
.end method

.method public toPlaylist()Lchristophedelory/playlist/Playlist;
    .locals 5

    .line 110
    new-instance v0, Lchristophedelory/playlist/Playlist;

    invoke-direct {v0}, Lchristophedelory/playlist/Playlist;-><init>()V

    .line 112
    iget-object v1, p0, Lchristophedelory/playlist/plp/PLP;->_filenames:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 114
    new-instance v3, Lchristophedelory/playlist/Media;

    invoke-direct {v3}, Lchristophedelory/playlist/Media;-><init>()V

    .line 115
    new-instance v4, Lmychristophedelory/content/Content;

    invoke-direct {v4, v2}, Lmychristophedelory/content/Content;-><init>(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v3, v4}, Lchristophedelory/playlist/Media;->setSource(Lmychristophedelory/content/Content;)V

    .line 118
    invoke-virtual {v0}, Lchristophedelory/playlist/Playlist;->getRootSequence()Lchristophedelory/playlist/Sequence;

    move-result-object v2

    invoke-virtual {v2, v3}, Lchristophedelory/playlist/Sequence;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {v0}, Lchristophedelory/playlist/Playlist;->normalize()V

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-nez p2, :cond_0

    const-string p2, "UTF-16LE"

    .line 84
    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    const-string p1, "PLP PLAYLIST"

    .line 86
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const/16 p1, 0xd

    .line 87
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(I)V

    const/16 p2, 0xa

    .line 88
    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(I)V

    const-string v1, "VERSION 1.20"

    .line 89
    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(I)V

    .line 91
    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(I)V

    .line 92
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(I)V

    .line 93
    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(I)V

    .line 95
    iget-object v1, p0, Lchristophedelory/playlist/plp/PLP;->_filenames:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 97
    iget-object v3, p0, Lchristophedelory/playlist/plp/PLP;->_diskSpecifier:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const-string v3, ", "

    .line 98
    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(I)V

    .line 101
    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(I)V

    goto :goto_0

    .line 104
    :cond_1
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    return-void
.end method
