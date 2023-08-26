.class public Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;
.super Ljava/lang/Object;
.source "PlaylistFilesWUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static appendToSpecificPlaylist(Lchristophedelory/playlist/SpecificPlaylist;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/SpecificPlaylist;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_1

    return v0

    .line 32
    :cond_1
    instance-of v1, p0, Lchristophedelory/playlist/pla/PLA;

    if-eqz v1, :cond_2

    .line 33
    check-cast p0, Lchristophedelory/playlist/pla/PLA;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->appendToSpecificPlaylist(Lchristophedelory/playlist/pla/PLA;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 36
    :cond_2
    instance-of v1, p0, Lchristophedelory/playlist/kpl/Xml;

    if-eqz v1, :cond_3

    .line 37
    check-cast p0, Lchristophedelory/playlist/kpl/Xml;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->appendToSpecificPlaylist(Lchristophedelory/playlist/kpl/Xml;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 40
    :cond_3
    instance-of v1, p0, Lchristophedelory/playlist/pls/PLS;

    if-eqz v1, :cond_4

    .line 41
    check-cast p0, Lchristophedelory/playlist/pls/PLS;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->appendToSpecificPlaylist(Lchristophedelory/playlist/pls/PLS;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 44
    :cond_4
    instance-of v1, p0, Lchristophedelory/playlist/mpcpl/MPCPL;

    if-eqz v1, :cond_5

    .line 45
    check-cast p0, Lchristophedelory/playlist/mpcpl/MPCPL;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->appendToSpecificPlaylist(Lchristophedelory/playlist/mpcpl/MPCPL;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 48
    :cond_5
    instance-of v1, p0, Lchristophedelory/playlist/plp/PLP;

    if-eqz v1, :cond_6

    .line 49
    check-cast p0, Lchristophedelory/playlist/plp/PLP;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->appendToSpecificPlaylist(Lchristophedelory/playlist/plp/PLP;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 52
    :cond_6
    instance-of v1, p0, Lchristophedelory/playlist/m3u/M3U;

    if-eqz v1, :cond_7

    .line 53
    check-cast p0, Lchristophedelory/playlist/m3u/M3U;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->appendToSpecificPlaylist(Lchristophedelory/playlist/m3u/M3U;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_7
    return v0
.end method

.method static appendToSpecificPlaylist(Lchristophedelory/playlist/kpl/Xml;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/kpl/Xml;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 69
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 70
    new-instance v2, Lchristophedelory/playlist/kpl/Entry;

    invoke-direct {v2}, Lchristophedelory/playlist/kpl/Entry;-><init>()V

    .line 71
    iget-object v3, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->playlistPath:Ljava/lang/String;

    iget-boolean v4, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->writeRelativePaths:Z

    invoke-static {v1, v3, v4}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->getDataPathForPlaylist(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lchristophedelory/playlist/kpl/Entry;->setFilename(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0}, Lchristophedelory/playlist/kpl/Xml;->getEntries()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 75
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static appendToSpecificPlaylist(Lchristophedelory/playlist/m3u/M3U;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/m3u/M3U;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 120
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    .line 121
    invoke-virtual {p0, v1}, Lchristophedelory/playlist/m3u/M3U;->setExtensionM3U(Z)V

    .line 123
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 125
    new-instance v3, Lchristophedelory/playlist/m3u/Resource;

    invoke-direct {v3}, Lchristophedelory/playlist/m3u/Resource;-><init>()V

    .line 126
    iget-object v4, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->playlistPath:Ljava/lang/String;

    iget-boolean v5, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->writeRelativePaths:Z

    invoke-static {v2, v4, v5}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->getDataPathForPlaylist(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lchristophedelory/playlist/m3u/Resource;->setLocation(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    .line 129
    invoke-virtual {v2, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v2

    .line 130
    iget-object v4, v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lchristophedelory/playlist/m3u/Resource;->setName(Ljava/lang/String;)V

    .line 131
    invoke-virtual {v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getDurationSeconds()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v3, v4, v5}, Lchristophedelory/playlist/m3u/Resource;->setLength(J)V

    .line 134
    :cond_0
    invoke-virtual {p0}, Lchristophedelory/playlist/m3u/M3U;->getResources()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 137
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static appendToSpecificPlaylist(Lchristophedelory/playlist/mpcpl/MPCPL;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/mpcpl/MPCPL;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 101
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 102
    new-instance v2, Lchristophedelory/playlist/mpcpl/Resource;

    invoke-direct {v2}, Lchristophedelory/playlist/mpcpl/Resource;-><init>()V

    .line 103
    iget-object v3, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->playlistPath:Ljava/lang/String;

    iget-boolean v4, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->writeRelativePaths:Z

    invoke-static {v1, v3, v4}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->getDataPathForPlaylist(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lchristophedelory/playlist/mpcpl/Resource;->setFilename(Ljava/lang/String;)V

    .line 104
    invoke-virtual {p0}, Lchristophedelory/playlist/mpcpl/MPCPL;->getResources()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 107
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static appendToSpecificPlaylist(Lchristophedelory/playlist/pla/PLA;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/pla/PLA;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 61
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 62
    invoke-virtual {p0}, Lchristophedelory/playlist/pla/PLA;->getFilenames()Ljava/util/List;

    move-result-object v2

    iget-object v3, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->playlistPath:Ljava/lang/String;

    iget-boolean v4, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->writeRelativePaths:Z

    invoke-static {v1, v3, v4}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->getDataPathForPlaylist(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 64
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static appendToSpecificPlaylist(Lchristophedelory/playlist/plp/PLP;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/plp/PLP;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 111
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 112
    invoke-virtual {p0}, Lchristophedelory/playlist/plp/PLP;->getFilenames()Ljava/util/List;

    move-result-object v2

    iget-object v3, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->playlistPath:Ljava/lang/String;

    iget-boolean v4, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->writeRelativePaths:Z

    invoke-static {v1, v3, v4}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->getDataPathForPlaylist(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 115
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static appendToSpecificPlaylist(Lchristophedelory/playlist/pls/PLS;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;Ljava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/pls/PLS;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 80
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    .line 82
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 84
    new-instance v3, Lchristophedelory/playlist/m3u/Resource;

    invoke-direct {v3}, Lchristophedelory/playlist/m3u/Resource;-><init>()V

    .line 85
    iget-object v4, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->playlistPath:Ljava/lang/String;

    iget-boolean v5, p1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils$AppendParameters;->writeRelativePaths:Z

    invoke-static {v2, v4, v5}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesWUtils;->getDataPathForPlaylist(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lchristophedelory/playlist/m3u/Resource;->setLocation(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {v2, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v2

    .line 89
    iget-object v4, v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lchristophedelory/playlist/m3u/Resource;->setName(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getDurationSeconds()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v3, v4, v5}, Lchristophedelory/playlist/m3u/Resource;->setLength(J)V

    .line 93
    :cond_0
    invoke-virtual {p0}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 96
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static getDataPathForPlaylist(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .line 142
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataSourceForPlaylist()Ljava/lang/String;

    move-result-object p0

    const-string v0, "file://"

    .line 143
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x7

    if-le v0, v1, :cond_0

    .line 145
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    if-eqz p2, :cond_1

    .line 150
    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "/"

    .line 152
    invoke-static {p0, p1, p2}, Lcom/daaw/avee/Common/UtilsFileSys;->getRelativePath(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method
